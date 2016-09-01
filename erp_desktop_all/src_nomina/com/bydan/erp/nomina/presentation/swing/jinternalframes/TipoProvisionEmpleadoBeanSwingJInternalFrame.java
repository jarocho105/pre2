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

import com.bydan.erp.nomina.util.TipoProvisionEmpleadoConstantesFunciones;
import com.bydan.erp.nomina.util.TipoProvisionEmpleadoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoProvisionEmpleadoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoProvisionEmpleadoBean;
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
public class TipoProvisionEmpleadoBeanSwingJInternalFrame extends TipoProvisionEmpleadoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoProvisionEmpleadoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoProvisionEmpleado> tipoprovisionempleadoValidator = new ClassValidator<TipoProvisionEmpleado>(TipoProvisionEmpleado.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoProvisionEmpleado tipoprovisionempleado;	
	public TipoProvisionEmpleado tipoprovisionempleadoAux;
	public TipoProvisionEmpleado tipoprovisionempleadoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoProvisionEmpleado tipoprovisionempleadoTotales;
	public Long idTipoProvisionEmpleadoActual;
	public Long iIdNuevoTipoProvisionEmpleado=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosProvisionEmpleado=false;

	public Boolean getIsTienePermisosProvisionEmpleado() {
		return isTienePermisosProvisionEmpleado;
	}

	public void setIsTienePermisosProvisionEmpleado(Boolean isTienePermisosProvisionEmpleado) {
		this.isTienePermisosProvisionEmpleado= isTienePermisosProvisionEmpleado;
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
	
	public Boolean isPermisoTodoTipoProvisionEmpleado;
	public Boolean isPermisoNuevoTipoProvisionEmpleado;
	public Boolean isPermisoActualizarTipoProvisionEmpleado;
	public Boolean isPermisoActualizarOriginalTipoProvisionEmpleado;
	public Boolean isPermisoEliminarTipoProvisionEmpleado;
	public Boolean isPermisoGuardarCambiosTipoProvisionEmpleado;
	public Boolean isPermisoConsultaTipoProvisionEmpleado;
	public Boolean isPermisoBusquedaTipoProvisionEmpleado;
	public Boolean isPermisoReporteTipoProvisionEmpleado;
	public Boolean isPermisoPaginacionMedioTipoProvisionEmpleado;
	public Boolean isPermisoPaginacionAltoTipoProvisionEmpleado;
	public Boolean isPermisoPaginacionTodoTipoProvisionEmpleado;
	public Boolean isPermisoCopiarTipoProvisionEmpleado;
	public Boolean isPermisoVerFormTipoProvisionEmpleado;
	public Boolean isPermisoDuplicarTipoProvisionEmpleado;
	public Boolean isPermisoOrdenTipoProvisionEmpleado;
	
	
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
	
	public TipoProvisionEmpleadoParameterReturnGeneral tipoprovisionempleadoReturnGeneral;
	public TipoProvisionEmpleadoParameterReturnGeneral tipoprovisionempleadoParameterGeneral;
	
	

	public ProvisionEmpleadoLogic provisionempleadoLogic=null;

	public ProvisionEmpleadoLogic getProvisionEmpleadoLogic() {
		return provisionempleadoLogic;
	}

	public void setProvisionEmpleadoLogic(ProvisionEmpleadoLogic provisionempleadoLogic) {
		this.provisionempleadoLogic = provisionempleadoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoProvisionEmpleado=false;
	public Boolean esParaAccionDesdeFormularioTipoProvisionEmpleado=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoProvisionEmpleadoSessionBeanAdditional tipoprovisionempleadoSessionBeanAdditional=null;
	
	public TipoProvisionEmpleadoSessionBeanAdditional getTipoProvisionEmpleadoSessionBeanAdditional() {
		return this.tipoprovisionempleadoSessionBeanAdditional;
	}
	
	public void setTipoProvisionEmpleadoSessionBeanAdditional(TipoProvisionEmpleadoSessionBeanAdditional tipoprovisionempleadoSessionBeanAdditional) {
		try {
			this.tipoprovisionempleadoSessionBeanAdditional=tipoprovisionempleadoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional tipoprovisionempleadoBeanSwingJInternalFrameAdditional=null;
	//public class TipoProvisionEmpleadoBeanSwingJInternalFrame
	
	public TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional getTipoProvisionEmpleadoBeanSwingJInternalFrameAdditional() {
		return this.tipoprovisionempleadoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoProvisionEmpleadoBeanSwingJInternalFrameAdditional(TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional tipoprovisionempleadoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoprovisionempleadoBeanSwingJInternalFrameAdditional=tipoprovisionempleadoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoProvisionEmpleadoLogic tipoprovisionempleadoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoProvisionEmpleado tipoprovisionempleadoBean;
	public TipoProvisionEmpleadoConstantesFunciones tipoprovisionempleadoConstantesFunciones;
	//public TipoProvisionEmpleadoParameterReturnGeneral tipoprovisionempleadoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoProvisionEmpleado> tipoprovisionempleados;	
	//public List<TipoProvisionEmpleado> tipoprovisionempleadosEliminados;
	//public List<TipoProvisionEmpleado> tipoprovisionempleadosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoProvisionEmpleado=false;
	public Boolean isVisibilidadCeldaDuplicarTipoProvisionEmpleado=true;
	public Boolean isVisibilidadCeldaCopiarTipoProvisionEmpleado=true;
	public Boolean isVisibilidadCeldaVerFormTipoProvisionEmpleado=true;
	public Boolean isVisibilidadCeldaOrdenTipoProvisionEmpleado=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado=false;
	public Boolean isVisibilidadCeldaModificarTipoProvisionEmpleado=false;
	public Boolean isVisibilidadCeldaActualizarTipoProvisionEmpleado=false;
	public Boolean isVisibilidadCeldaEliminarTipoProvisionEmpleado=false;
	public Boolean isVisibilidadCeldaCancelarTipoProvisionEmpleado=false;
	public Boolean isVisibilidadCeldaGuardarTipoProvisionEmpleado=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoProvisionEmpleado=false;	
	
	
	
	public Long getiIdNuevoTipoProvisionEmpleado() {
		return this.iIdNuevoTipoProvisionEmpleado;
	}

	public void setiIdNuevoTipoProvisionEmpleado(Long iIdNuevoTipoProvisionEmpleado) {
		this.iIdNuevoTipoProvisionEmpleado = iIdNuevoTipoProvisionEmpleado;
	}
	
	public Long getidTipoProvisionEmpleadoActual() {
		return this.idTipoProvisionEmpleadoActual;
	}

	public void setidTipoProvisionEmpleadoActual(Long idTipoProvisionEmpleadoActual) {
		this.idTipoProvisionEmpleadoActual = idTipoProvisionEmpleadoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoProvisionEmpleado gettipoprovisionempleado() {
		return this.tipoprovisionempleado;
	}

	public void settipoprovisionempleado(TipoProvisionEmpleado tipoprovisionempleado) {
		this.tipoprovisionempleado = tipoprovisionempleado;
	}
	
	public TipoProvisionEmpleado gettipoprovisionempleadoAux() {
		return this.tipoprovisionempleadoAux;
	}

	public void settipoprovisionempleadoAux(TipoProvisionEmpleado tipoprovisionempleadoAux) {
		this.tipoprovisionempleadoAux = tipoprovisionempleadoAux;
	}				
	
	public TipoProvisionEmpleado gettipoprovisionempleadoAnterior() {
		return this.tipoprovisionempleadoAnterior;
	}

	public void settipoprovisionempleadoAnterior(TipoProvisionEmpleado tipoprovisionempleadoAnterior) {
		this.tipoprovisionempleadoAnterior = tipoprovisionempleadoAnterior;
	}	
	
	public TipoProvisionEmpleado gettipoprovisionempleadoTotales() {
		return this.tipoprovisionempleadoTotales;
	}

	public void settipoprovisionempleadoTotales(TipoProvisionEmpleado tipoprovisionempleadoTotales) {
		this.tipoprovisionempleadoTotales = tipoprovisionempleadoTotales;
	}	
	
	public TipoProvisionEmpleado gettipoprovisionempleadoBean() {
		return this.tipoprovisionempleadoBean;
	}

	public void settipoprovisionempleadoBean(TipoProvisionEmpleado tipoprovisionempleadoBean) {
		this.tipoprovisionempleadoBean = tipoprovisionempleadoBean;
	}	
	
	public TipoProvisionEmpleadoParameterReturnGeneral gettipoprovisionempleadoReturnGeneral() {
		return this.tipoprovisionempleadoReturnGeneral;
	}

	public void settipoprovisionempleadoReturnGeneral(TipoProvisionEmpleadoParameterReturnGeneral tipoprovisionempleadoReturnGeneral) {
		this.tipoprovisionempleadoReturnGeneral = tipoprovisionempleadoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoProvisionEmpleadoLogic getTipoProvisionEmpleadoLogic()	{		
		return tipoprovisionempleadoLogic;
	}

	public void setTipoProvisionEmpleadoLogic(TipoProvisionEmpleadoLogic tipoprovisionempleadoLogic) {
		this.tipoprovisionempleadoLogic = tipoprovisionempleadoLogic;
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
	
	public Boolean getIsEsNuevoTipoProvisionEmpleado() {
		return isEsNuevoTipoProvisionEmpleado;
	}

	public void setIsEsNuevoTipoProvisionEmpleado(Boolean isEsNuevoTipoProvisionEmpleado) {
		this.isEsNuevoTipoProvisionEmpleado = isEsNuevoTipoProvisionEmpleado;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoProvisionEmpleado() {
		return esParaAccionDesdeFormularioTipoProvisionEmpleado;
	}
	
	public void setEsParaAccionDesdeFormularioTipoProvisionEmpleado(Boolean esParaAccionDesdeFormularioTipoProvisionEmpleado) {
		this.esParaAccionDesdeFormularioTipoProvisionEmpleado = esParaAccionDesdeFormularioTipoProvisionEmpleado;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoProvisionEmpleado() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoProvisionEmpleadoConstantesFunciones.refrescarForeignKeysDescripcionesTipoProvisionEmpleado(this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoProvisionEmpleadoConstantesFunciones.refrescarForeignKeysDescripcionesTipoProvisionEmpleado(this.tipoprovisionempleados);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoprovisionempleadoLogic.setTipoProvisionEmpleados(this.tipoprovisionempleados);
			tipoprovisionempleadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoProvisionEmpleadoParameterReturnGeneral getTipoProvisionEmpleadoParameterGeneral() {
		return this.tipoprovisionempleadoParameterGeneral;
	}
	
	public void setTipoProvisionEmpleadoParameterGeneral(TipoProvisionEmpleadoParameterReturnGeneral tipoprovisionempleadoParameterGeneral) {
		this.tipoprovisionempleadoParameterGeneral = tipoprovisionempleadoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoProvisionEmpleado() {
		return isPermisoTodoTipoProvisionEmpleado;
	}

	public void setIsPermisoTodoTipoProvisionEmpleado(Boolean isPermisoTodoTipoProvisionEmpleado) {
		this.isPermisoTodoTipoProvisionEmpleado = isPermisoTodoTipoProvisionEmpleado;
	}

	public Boolean getIsPermisoNuevoTipoProvisionEmpleado() {
		return isPermisoNuevoTipoProvisionEmpleado;
	}

	public void setIsPermisoNuevoTipoProvisionEmpleado(Boolean isPermisoNuevoTipoProvisionEmpleado) {
		this.isPermisoNuevoTipoProvisionEmpleado = isPermisoNuevoTipoProvisionEmpleado;
	}

	public Boolean getIsPermisoActualizarTipoProvisionEmpleado() {
		return isPermisoActualizarTipoProvisionEmpleado;
	}

	public void setIsPermisoActualizarTipoProvisionEmpleado(Boolean isPermisoActualizarTipoProvisionEmpleado) {
		this.isPermisoActualizarTipoProvisionEmpleado = isPermisoActualizarTipoProvisionEmpleado;
	}

	public Boolean getIsPermisoEliminarTipoProvisionEmpleado() {
		return isPermisoEliminarTipoProvisionEmpleado;
	}

	public void setIsPermisoEliminarTipoProvisionEmpleado(Boolean isPermisoEliminarTipoProvisionEmpleado) {
		this.isPermisoEliminarTipoProvisionEmpleado = isPermisoEliminarTipoProvisionEmpleado;
	}

	public Boolean getIsPermisoGuardarCambiosTipoProvisionEmpleado() {
		return isPermisoGuardarCambiosTipoProvisionEmpleado;
	}

	public void setIsPermisoGuardarCambiosTipoProvisionEmpleado(Boolean isPermisoGuardarCambiosTipoProvisionEmpleado) {
		this.isPermisoGuardarCambiosTipoProvisionEmpleado = isPermisoGuardarCambiosTipoProvisionEmpleado;
	}
	
	public Boolean getIsPermisoConsultaTipoProvisionEmpleado() {
		return isPermisoConsultaTipoProvisionEmpleado;
	}

	public void setIsPermisoConsultaTipoProvisionEmpleado(Boolean isPermisoConsultaTipoProvisionEmpleado) {
		this.isPermisoConsultaTipoProvisionEmpleado = isPermisoConsultaTipoProvisionEmpleado;
	}

	public Boolean getIsPermisoBusquedaTipoProvisionEmpleado() {
		return isPermisoBusquedaTipoProvisionEmpleado;
	}

	public void setIsPermisoBusquedaTipoProvisionEmpleado(Boolean isPermisoBusquedaTipoProvisionEmpleado) {
		this.isPermisoBusquedaTipoProvisionEmpleado = isPermisoBusquedaTipoProvisionEmpleado;
	}

	public Boolean getIsPermisoReporteTipoProvisionEmpleado() {
		return isPermisoReporteTipoProvisionEmpleado;
	}

	public void setIsPermisoReporteTipoProvisionEmpleado(Boolean isPermisoReporteTipoProvisionEmpleado) {
		this.isPermisoReporteTipoProvisionEmpleado = isPermisoReporteTipoProvisionEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoProvisionEmpleado() {
		return isPermisoPaginacionMedioTipoProvisionEmpleado;
	}

	public void setIsPermisoPaginacionMedioTipoProvisionEmpleado(Boolean isPermisoPaginacionMedioTipoProvisionEmpleado) {
		this.isPermisoPaginacionMedioTipoProvisionEmpleado = isPermisoPaginacionMedioTipoProvisionEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoProvisionEmpleado() {
		return isPermisoPaginacionTodoTipoProvisionEmpleado;
	}

	public void setIsPermisoPaginacionTodoTipoProvisionEmpleado(Boolean isPermisoPaginacionTodoTipoProvisionEmpleado) {
		this.isPermisoPaginacionTodoTipoProvisionEmpleado = isPermisoPaginacionTodoTipoProvisionEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoProvisionEmpleado() {
		return isPermisoPaginacionAltoTipoProvisionEmpleado;
	}

	public void setIsPermisoPaginacionAltoTipoProvisionEmpleado(Boolean isPermisoPaginacionAltoTipoProvisionEmpleado) {
		this.isPermisoPaginacionAltoTipoProvisionEmpleado = isPermisoPaginacionAltoTipoProvisionEmpleado;
	}
	
	public Boolean getIsPermisoCopiarTipoProvisionEmpleado() {
		return isPermisoCopiarTipoProvisionEmpleado;
	}

	public void setIsPermisoCopiarTipoProvisionEmpleado(Boolean isPermisoCopiarTipoProvisionEmpleado) {
		this.isPermisoCopiarTipoProvisionEmpleado = isPermisoCopiarTipoProvisionEmpleado;
	}
	
	public Boolean getIsPermisoVerFormTipoProvisionEmpleado() {
		return isPermisoVerFormTipoProvisionEmpleado;
	}

	public void setIsPermisoVerFormTipoProvisionEmpleado(Boolean isPermisoVerFormTipoProvisionEmpleado) {
		this.isPermisoVerFormTipoProvisionEmpleado = isPermisoVerFormTipoProvisionEmpleado;
	}
	
	public Boolean getIsPermisoDuplicarTipoProvisionEmpleado() {
		return isPermisoDuplicarTipoProvisionEmpleado;
	}

	public void setIsPermisoDuplicarTipoProvisionEmpleado(Boolean isPermisoDuplicarTipoProvisionEmpleado) {
		this.isPermisoDuplicarTipoProvisionEmpleado = isPermisoDuplicarTipoProvisionEmpleado;
	}
	
	public Boolean getIsPermisoOrdenTipoProvisionEmpleado() {
		return isPermisoOrdenTipoProvisionEmpleado;
	}

	public void setIsPermisoOrdenTipoProvisionEmpleado(Boolean isPermisoOrdenTipoProvisionEmpleado) {
		this.isPermisoOrdenTipoProvisionEmpleado = isPermisoOrdenTipoProvisionEmpleado;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoProvisionEmpleado() {
		return isVisibilidadCeldaNuevoTipoProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaNuevoTipoProvisionEmpleado(Boolean isVisibilidadCeldaNuevoTipoProvisionEmpleado) {
		this.isVisibilidadCeldaNuevoTipoProvisionEmpleado = isVisibilidadCeldaNuevoTipoProvisionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoProvisionEmpleado() {
		return isVisibilidadCeldaDuplicarTipoProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaDuplicarTipoProvisionEmpleado(Boolean isVisibilidadCeldaDuplicarTipoProvisionEmpleado) {
		this.isVisibilidadCeldaDuplicarTipoProvisionEmpleado = isVisibilidadCeldaDuplicarTipoProvisionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoProvisionEmpleado() {
		return isVisibilidadCeldaCopiarTipoProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaCopiarTipoProvisionEmpleado(Boolean isVisibilidadCeldaCopiarTipoProvisionEmpleado) {
		this.isVisibilidadCeldaCopiarTipoProvisionEmpleado = isVisibilidadCeldaCopiarTipoProvisionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoProvisionEmpleado() {
		return isVisibilidadCeldaVerFormTipoProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaVerFormTipoProvisionEmpleado(Boolean isVisibilidadCeldaVerFormTipoProvisionEmpleado) {
		this.isVisibilidadCeldaVerFormTipoProvisionEmpleado = isVisibilidadCeldaVerFormTipoProvisionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoProvisionEmpleado() {
		return isVisibilidadCeldaOrdenTipoProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaOrdenTipoProvisionEmpleado(Boolean isVisibilidadCeldaOrdenTipoProvisionEmpleado) {
		this.isVisibilidadCeldaOrdenTipoProvisionEmpleado = isVisibilidadCeldaOrdenTipoProvisionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado() {
		return isVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado(Boolean isVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado) {
		this.isVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado = isVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoProvisionEmpleado() {
		return isVisibilidadCeldaModificarTipoProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaModificarTipoProvisionEmpleado(Boolean isVisibilidadCeldaModificarTipoProvisionEmpleado) {
		this.isVisibilidadCeldaModificarTipoProvisionEmpleado = isVisibilidadCeldaModificarTipoProvisionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoProvisionEmpleado() {
		return isVisibilidadCeldaActualizarTipoProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaActualizarTipoProvisionEmpleado(Boolean isVisibilidadCeldaActualizarTipoProvisionEmpleado) {
		this.isVisibilidadCeldaActualizarTipoProvisionEmpleado = isVisibilidadCeldaActualizarTipoProvisionEmpleado;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoProvisionEmpleado() {
		return isVisibilidadCeldaEliminarTipoProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaEliminarTipoProvisionEmpleado(Boolean isVisibilidadCeldaEliminarTipoProvisionEmpleado) {
		this.isVisibilidadCeldaEliminarTipoProvisionEmpleado = isVisibilidadCeldaEliminarTipoProvisionEmpleado;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoProvisionEmpleado() {
		return isVisibilidadCeldaCancelarTipoProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaCancelarTipoProvisionEmpleado(Boolean isVisibilidadCeldaCancelarTipoProvisionEmpleado) {
		this.isVisibilidadCeldaCancelarTipoProvisionEmpleado = isVisibilidadCeldaCancelarTipoProvisionEmpleado;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoProvisionEmpleado() {
		return isVisibilidadCeldaGuardarTipoProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaGuardarTipoProvisionEmpleado(Boolean isVisibilidadCeldaGuardarTipoProvisionEmpleado) {
		this.isVisibilidadCeldaGuardarTipoProvisionEmpleado = isVisibilidadCeldaGuardarTipoProvisionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoProvisionEmpleado() {
		return isVisibilidadCeldaGuardarCambiosTipoProvisionEmpleado;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoProvisionEmpleado(Boolean isVisibilidadCeldaGuardarCambiosTipoProvisionEmpleado) {
		this.isVisibilidadCeldaGuardarCambiosTipoProvisionEmpleado = isVisibilidadCeldaGuardarCambiosTipoProvisionEmpleado;
	}
		
	public TipoProvisionEmpleadoSessionBean gettipoprovisionempleadoSessionBean() {
		return this.tipoprovisionempleadoSessionBean;
	}
	
	public void settipoprovisionempleadoSessionBean(TipoProvisionEmpleadoSessionBean tipoprovisionempleadoSessionBean) {
		this.tipoprovisionempleadoSessionBean=tipoprovisionempleadoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoProvisionEmpleado(TipoProvisionEmpleado tipoprovisionempleado)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoProvisionEmpleado tipoprovisionempleado,TipoProvisionEmpleado tipoprovisionempleadoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoProvisionEmpleado(tipoprovisionempleado);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoprovisionempleadoAux.setId(tipoprovisionempleado.getId());
		tipoprovisionempleadoAux.setVersionRow(tipoprovisionempleado.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoProvisionEmpleado();
		
			int intSelectedRow = this.jTableDatosTipoProvisionEmpleado.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoProvisionEmpleado(this.tipoprovisionempleado,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProvisionEmpleado(this.tipoprovisionempleado);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoprovisionempleadoValidator.getInvalidValues(this.tipoprovisionempleado);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoprovisionempleadoLogic.setDatosCliente(datosCliente);
			tipoprovisionempleadoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoprovisionempleadoAux=new  TipoProvisionEmpleado();
				
				tipoprovisionempleadoAux.setIsNew(true);
				tipoprovisionempleadoAux.setIsChanged(true);
				
				tipoprovisionempleadoAux.setTipoProvisionEmpleadoOriginal(this.tipoprovisionempleado);
				
				tipoprovisionempleadoAux.setId(this.tipoprovisionempleado.getId());	
				tipoprovisionempleadoAux.setVersionRow(this.tipoprovisionempleado.getVersionRow());	
				tipoprovisionempleadoAux.setcodigo(this.tipoprovisionempleado.getcodigo());	
				tipoprovisionempleadoAux.setnombre(this.tipoprovisionempleado.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoprovisionempleadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoprovisionempleadoAux,tipoprovisionempleadoLogic.getTipoProvisionEmpleados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprovisionempleadoAux,tipoprovisionempleados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoprovisionempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprovisionempleadoLogic.saveTipoProvisionEmpleados();//WithConnection
						//tipoprovisionempleadoLogic.getSetVersionRowTipoProvisionEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoprovisionempleado,tipoprovisionempleadoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoprovisionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.getProvisionEmpleados().addAll(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleados.addAll(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoprovisionempleadoLogic.saveTipoProvisionEmpleadoRelaciones(tipoprovisionempleadoAux,this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.getProvisionEmpleados());//WithConnection
								//tipoprovisionempleadoLogic.getSetVersionRowTipoProvisionEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoprovisionempleado,tipoprovisionempleadoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.setProvisionEmpleados(new ArrayList<ProvisionEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleados= new ArrayList<ProvisionEmpleado>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprovisionempleadoAux.setProvisionEmpleados(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.getProvisionEmpleados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoprovisionempleadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoprovisionempleadoAux,tipoprovisionempleadoLogic.getTipoProvisionEmpleados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoprovisionempleadoAux,tipoprovisionempleados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoprovisionempleado,tipoprovisionempleadoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoprovisionempleadoAux=new  TipoProvisionEmpleado();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado() && this.tipoprovisionempleado.getId()>=0)) {
						
					tipoprovisionempleadoAux.setIsNew(false);
				}
				
				tipoprovisionempleadoAux.setIsDeleted(false);
			
				tipoprovisionempleadoAux.setId(this.tipoprovisionempleado.getId());	
				tipoprovisionempleadoAux.setVersionRow(this.tipoprovisionempleado.getVersionRow());	
				tipoprovisionempleadoAux.setcodigo(this.tipoprovisionempleado.getcodigo());	
				tipoprovisionempleadoAux.setnombre(this.tipoprovisionempleado.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoprovisionempleadoAux,tipoprovisionempleadoLogic.getTipoProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprovisionempleadoAux,tipoprovisionempleados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoprovisionempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprovisionempleadoLogic.saveTipoProvisionEmpleados();//WithConnection
						//tipoprovisionempleadoLogic.getSetVersionRowTipoProvisionEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoprovisionempleado,tipoprovisionempleadoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoprovisionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.getProvisionEmpleados().addAll(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleados.addAll(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoprovisionempleadoLogic.saveTipoProvisionEmpleadoRelaciones(tipoprovisionempleadoAux,this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.getProvisionEmpleados());//WithConnection
								//tipoprovisionempleadoLogic.getSetVersionRowTipoProvisionEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoprovisionempleado,tipoprovisionempleadoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.setProvisionEmpleados(new ArrayList<ProvisionEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleados= new ArrayList<ProvisionEmpleado>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprovisionempleadoAux.setProvisionEmpleados(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.getProvisionEmpleados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoprovisionempleadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoprovisionempleadoAux,tipoprovisionempleadoLogic.getTipoProvisionEmpleados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoprovisionempleadoAux,tipoprovisionempleados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoprovisionempleado,tipoprovisionempleadoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoprovisionempleadoAux=new  TipoProvisionEmpleado();
				
				tipoprovisionempleadoAux.setIsNew(false);
				tipoprovisionempleadoAux.setIsChanged(false);
				
				tipoprovisionempleadoAux.setIsDeleted(true);
				
				tipoprovisionempleadoAux.setId(this.tipoprovisionempleado.getId());	
				tipoprovisionempleadoAux.setVersionRow(this.tipoprovisionempleado.getVersionRow());	
				tipoprovisionempleadoAux.setcodigo(this.tipoprovisionempleado.getcodigo());	
				tipoprovisionempleadoAux.setnombre(this.tipoprovisionempleado.getnombre());	
				
				if(this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoprovisionempleadoAux.getId()>=0) {	
						this.tipoprovisionempleadosEliminados.add(tipoprovisionempleadoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoprovisionempleadoAux,tipoprovisionempleadoLogic.getTipoProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprovisionempleadoAux,tipoprovisionempleados);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoprovisionempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprovisionempleadoLogic.saveTipoProvisionEmpleados();//WithConnection
						//tipoprovisionempleadoLogic.getSetVersionRowTipoProvisionEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoprovisionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.getProvisionEmpleados().addAll(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleados.addAll(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoprovisionempleadoLogic.saveTipoProvisionEmpleadoRelaciones(tipoprovisionempleadoAux,this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.getProvisionEmpleados());//WithConnection
								//tipoprovisionempleadoLogic.getSetVersionRowTipoProvisionEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.setProvisionEmpleados(new ArrayList<ProvisionEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleados= new ArrayList<ProvisionEmpleado>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprovisionempleadoAux.setProvisionEmpleados(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.getProvisionEmpleados());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoprovisionempleadoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoprovisionempleadoAux,tipoprovisionempleadoLogic.getTipoProvisionEmpleados());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoprovisionempleadoAux,tipoprovisionempleados);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().addAll(this.tipoprovisionempleadosEliminados);
					
					tipoprovisionempleadoLogic.saveTipoProvisionEmpleados();//WithConnection
					//tipoprovisionempleadoLogic.getSetVersionRowTipoProvisionEmpleados();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoprovisionempleadosEliminados= new ArrayList<TipoProvisionEmpleado>();		
			}
			
			if(this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Provision Empleado GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoprovisionempleado=tipoprovisionempleadoAux;
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
      		//this.finishProcessTipoProvisionEmpleado();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoProvisionEmpleado tipoprovisionempleadoLocal) throws Exception {
		
		if(this.tipoprovisionempleadoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoprovisionempleadoLocal.setProvisionEmpleados(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.getProvisionEmpleados());
			
			} else {
			
				tipoprovisionempleadoLocal.setProvisionEmpleados(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleados);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoProvisionEmpleado tipoprovisionempleadoLocal) throws Exception {	
		if(this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoProvisionEmpleadoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoProvisionEmpleado.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoprovisionempleadoValidator.getInvalidValues(this.tipoprovisionempleado);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoProvisionEmpleado tipoprovisionempleado,List<TipoProvisionEmpleado> tipoprovisionempleados) throws Exception {
		try	{		
			TipoProvisionEmpleadoConstantesFunciones.actualizarLista(tipoprovisionempleado,tipoprovisionempleados,this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoProvisionEmpleado tipoprovisionempleado,List<TipoProvisionEmpleado> tipoprovisionempleados) throws Exception {
		try	{			
			TipoProvisionEmpleadoConstantesFunciones.actualizarSelectedLista(tipoprovisionempleado,tipoprovisionempleados);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoProvisionEmpleado> tipoprovisionempleadosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoprovisionempleadosLocal=this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoprovisionempleadosLocal=this.tipoprovisionempleados;
			}
			//ARCHITECTURE
		
			for(TipoProvisionEmpleado tipoprovisionempleadoLocal:tipoprovisionempleadosLocal) {
				if(this.permiteMantenimiento(tipoprovisionempleadoLocal) && tipoprovisionempleadoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoProvisionEmpleadoConstantesFunciones.getTipoProvisionEmpleadoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoProvisionEmpleadoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProvisionEmpleado.jLabelcodigoTipoProvisionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoProvisionEmpleadoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProvisionEmpleado.jLabelnombreTipoProvisionEmpleado,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoProvisionEmpleado.jLabelcodigoTipoProvisionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoProvisionEmpleado.jLabelnombreTipoProvisionEmpleado,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ProvisionEmpleado")) {
			if(this.tipoprovisionempleado==null) {
				this.tipoprovisionempleado= new TipoProvisionEmpleado();
			}

			if(this.tipoprovisionempleadoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoProvisionEmpleado
				this.setVariablesFormularioToObjetoActualTipoProvisionEmpleado(this.tipoprovisionempleado,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProvisionEmpleado(this.tipoprovisionempleado);

				this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.getprovisionempleado().setTipoProvisionEmpleado(this.tipoprovisionempleado);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoProvisionEmpleado--;	
		
		
		this.tipoprovisionempleadoAux=new TipoProvisionEmpleado();
		
		this.tipoprovisionempleadoAux.setId(this.iIdNuevoTipoProvisionEmpleado);
		this.tipoprovisionempleadoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().add(this.tipoprovisionempleadoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoprovisionempleados.add(this.tipoprovisionempleadoAux);
		}
		//ARCHITECTURE
		
		this.tipoprovisionempleado=this.tipoprovisionempleadoAux;
		
		if(TipoProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoProvisionEmpleado(this.tipoprovisionempleado);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoProvisionEmpleado(this.tipoprovisionempleado);
		}
				
		//this.setDefaultControlesTipoProvisionEmpleado();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoProvisionEmpleado();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoProvisionEmpleado();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProvisionEmpleado();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoProvisionEmpleado(this.tipoprovisionempleadoBean,this.tipoprovisionempleado,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoProvisionEmpleado(this.tipoprovisionempleado);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoprovisionempleadoSessionBean.getConGuardarRelaciones()) {
			classes=TipoProvisionEmpleadoConstantesFunciones.getClassesRelationshipsOfTipoProvisionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoprovisionempleadoReturnGeneral=tipoprovisionempleadoLogic.procesarEventosTipoProvisionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados(),this.tipoprovisionempleado,this.tipoprovisionempleadoParameterGeneral,this.isEsNuevoTipoProvisionEmpleado,classes);//this.tipoprovisionempleadoLogic.getTipoProvisionEmpleado()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoProvisionEmpleado(this.tipoprovisionempleadoReturnGeneral,this.tipoprovisionempleadoBean,false);
		
		if(this.tipoprovisionempleadoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoProvisionEmpleado(this.tipoprovisionempleadoReturnGeneral.getTipoProvisionEmpleado());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoProvisionEmpleado(this.tipoprovisionempleadoReturnGeneral.getTipoProvisionEmpleado());
		}
		
		if(this.tipoprovisionempleadoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoProvisionEmpleado(this.tipoprovisionempleadoReturnGeneral.getTipoProvisionEmpleado(),classes);//this.tipoprovisionempleadoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoProvisionEmpleado(this.tipoprovisionempleado,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoProvisionEmpleado();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoProvisionEmpleado();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.RecargarFormTipoProvisionEmpleado(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoProvisionEmpleado(false);
						
			if(tipoprovisionempleadoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoSessionBean.getEsGuardarRelacionado() && ProvisionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProvisionEmpleadoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProvisionEmpleado();
			}
			
			this.actualizarVisualTableDatosTipoProvisionEmpleado();
			
			this.jTableDatosTipoProvisionEmpleado.setRowSelectionInterval(this.getIndiceNuevoTipoProvisionEmpleado(), this.getIndiceNuevoTipoProvisionEmpleado());
			
			this.seleccionarFilaTablaTipoProvisionEmpleadoActual();
						
			this.actualizarEstadoCeldasBotonesTipoProvisionEmpleado("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoProvisionEmpleado(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextFieldcodigoTipoProvisionEmpleado.setEnabled(isHabilitar && this.tipoprovisionempleadoConstantesFunciones.activarcodigoTipoProvisionEmpleado);
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextAreanombreTipoProvisionEmpleado.setEnabled(isHabilitar && this.tipoprovisionempleadoConstantesFunciones.activarnombreTipoProvisionEmpleado);	
		
	};
	
	public void setDefaultControlesTipoProvisionEmpleado() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoProvisionEmpleado(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoprovisionempleadoSessionBean.setConGuardarRelaciones(true);			
			this.tipoprovisionempleadoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTabbedPaneRelacionesTipoProvisionEmpleado.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoprovisionempleadoSessionBean.setConGuardarRelaciones(false);			
			this.tipoprovisionempleadoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTabbedPaneRelacionesTipoProvisionEmpleado.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoProvisionEmpleado() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProvisionEmpleado tipoprovisionempleadoAux:this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados()) {
				if(tipoprovisionempleadoAux.getId().equals(this.iIdNuevoTipoProvisionEmpleado)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProvisionEmpleado tipoprovisionempleadoAux:this.tipoprovisionempleados) {
				if(tipoprovisionempleadoAux.getId().equals(this.iIdNuevoTipoProvisionEmpleado)) {
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
	
	public int getIndiceActualTipoProvisionEmpleado(TipoProvisionEmpleado tipoprovisionempleado,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProvisionEmpleado tipoprovisionempleadoAux:this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados()) {
				if(tipoprovisionempleadoAux.getId().equals(tipoprovisionempleado.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProvisionEmpleado tipoprovisionempleadoAux:this.tipoprovisionempleados) {
				if(tipoprovisionempleadoAux.getId().equals(tipoprovisionempleado.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoProvisionEmpleado(TipoProvisionEmpleado tipoprovisionempleadoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProvisionEmpleado tipoprovisionempleadoAux:this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados()) {
				if(tipoprovisionempleadoAux.getTipoProvisionEmpleadoOriginal().getId().equals(tipoprovisionempleadoOriginal.getId())) {
					existe=true;
					tipoprovisionempleadoOriginal.setId(tipoprovisionempleadoAux.getId());
					tipoprovisionempleadoOriginal.setVersionRow(tipoprovisionempleadoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProvisionEmpleado tipoprovisionempleadoAux:this.tipoprovisionempleados) {
				if(tipoprovisionempleadoAux.getTipoProvisionEmpleadoOriginal().getId().equals(tipoprovisionempleadoOriginal.getId())) {
					existe=true;
					tipoprovisionempleadoOriginal.setId(tipoprovisionempleadoAux.getId());
					tipoprovisionempleadoOriginal.setVersionRow(tipoprovisionempleadoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoProvisionEmpleado(Boolean esParaCancelar) throws Exception {
		tipoprovisionempleadosAux=new ArrayList<TipoProvisionEmpleado>();
		tipoprovisionempleadoAux=new TipoProvisionEmpleado();
		
		if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoProvisionEmpleado tipoprovisionempleadoAux:this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados()) {
					if(tipoprovisionempleadoAux.getId()<0) {
						tipoprovisionempleadosAux.add(tipoprovisionempleadoAux);
					}		
				}
				this.iIdNuevoTipoProvisionEmpleado=0L;
				this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().removeAll(tipoprovisionempleadosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProvisionEmpleado tipoprovisionempleadoAux:this.tipoprovisionempleados) {
					if(tipoprovisionempleadoAux.getId()<0) {
						tipoprovisionempleadosAux.add(tipoprovisionempleadoAux);
					}		
				}
				this.iIdNuevoTipoProvisionEmpleado=0L;
				this.tipoprovisionempleados.removeAll(tipoprovisionempleadosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoProvisionEmpleado 
					&& this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().size()>0
					) {
					tipoprovisionempleadoAux=this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().get(this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().size() - 1);
				
					if(tipoprovisionempleadoAux.getId()<0) {
						this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().remove(tipoprovisionempleadoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoProvisionEmpleado && this.tipoprovisionempleados.size()>0) {
					tipoprovisionempleadoAux=this.tipoprovisionempleados.get(this.tipoprovisionempleados.size() - 1);
				
					if(tipoprovisionempleadoAux.getId()<0) {
						this.tipoprovisionempleados.remove(tipoprovisionempleadoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoProvisionEmpleado(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoprovisionempleado.getId()<0) {
				this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().remove(this.tipoprovisionempleado);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoprovisionempleado.getId()<0) {
				this.tipoprovisionempleados.remove(this.tipoprovisionempleado);
			}
		}			
	}
	
	public void setEstadosInicialesTipoProvisionEmpleado(List<TipoProvisionEmpleado> tipoprovisionempleadosAux) throws Exception {
		TipoProvisionEmpleadoConstantesFunciones.setEstadosInicialesTipoProvisionEmpleado(tipoprovisionempleadosAux);
	}
	
	public void setEstadosInicialesTipoProvisionEmpleado(TipoProvisionEmpleado tipoprovisionempleadoAux) throws Exception {
		TipoProvisionEmpleadoConstantesFunciones.setEstadosInicialesTipoProvisionEmpleado(tipoprovisionempleadoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoProvisionEmpleadoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoProvisionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoProvisionEmpleadoActual()) {
				if(!this.isEsNuevoTipoProvisionEmpleado) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoProvisionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoProvisionEmpleado=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoProvisionEmpleadoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Provision Empleado ?", "MANTENIMIENTO DE Tipo Provision Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoProvisionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoProvisionEmpleado tipoprovisionempleado) throws Exception {
		TipoProvisionEmpleadoConstantesFunciones.seleccionarAsignar(this.tipoprovisionempleado,tipoprovisionempleado);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoProvisionEmpleado=this.isPermisoActualizarOriginalTipoProvisionEmpleado;
			
			
			this.seleccionarAsignar(tipoprovisionempleado);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoProvisionEmpleadoConstantesFunciones.quitarEspaciosTipoProvisionEmpleado(this.tipoprovisionempleado,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoProvisionEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoprovisionempleadoSessionBean.setsFuncionBusquedaRapida(this.tipoprovisionempleadoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoProvisionEmpleado) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoProvisionEmpleado(esParaCancelar);				
				this.cancelarNuevoTipoProvisionEmpleado(esParaCancelar);								
			}
			
			this.tipoprovisionempleado=new TipoProvisionEmpleado();
			
			this.inicializarTipoProvisionEmpleado();
			
			this.actualizarEstadoCeldasBotonesTipoProvisionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoProvisionEmpleado() throws Exception {
		try {
			TipoProvisionEmpleadoConstantesFunciones.inicializarTipoProvisionEmpleado(this.tipoprovisionempleado);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoProvisionEmpleados(String sAccionBusqueda,List<TipoProvisionEmpleado> tipoprovisionempleadosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoProvisionEmpleado"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoProvisionEmpleadoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoProvisionEmpleadoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoProvisionEmpleado"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Provision Empleados");		
		parameters.put("busquedapor", TipoProvisionEmpleadoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ProvisionEmpleado.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoProvisionEmpleadoLogic tipoprovisionempleadoLogicAuxiliar=new TipoProvisionEmpleadoLogic();
					tipoprovisionempleadoLogicAuxiliar.setDatosCliente(tipoprovisionempleadoLogic.getDatosCliente());				
					tipoprovisionempleadoLogicAuxiliar.setTipoProvisionEmpleados(tipoprovisionempleadosParaReportes);
					
					tipoprovisionempleadoLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoProvisionEmpleadoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoprovisionempleadosParaReportes=tipoprovisionempleadoLogicAuxiliar.getTipoProvisionEmpleados();
					
					//tipoprovisionempleadoLogic.getNewConnexionToDeep();
					
					//for (TipoProvisionEmpleado tipoprovisionempleado:tipoprovisionempleadosParaReportes) {
					//	tipoprovisionempleadoLogic.deepLoad(tipoprovisionempleado, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoprovisionempleadoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoprovisionempleadoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileProvisionEmpleado = AuxiliarReportes.class.getResourceAsStream("ProvisionEmpleadoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_provisionempleado", reportFileProvisionEmpleado);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoProvisionEmpleado=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoProvisionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoProvisionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoProvisionEmpleado=new JRBeanArrayDataSource(TipoProvisionEmpleadoJInternalFrame.TraerTipoProvisionEmpleadoBeans(tipoprovisionempleadosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoProvisionEmpleado);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoProvisionEmpleadoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoProvisionEmpleadoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoProvisionEmpleadoBean.TraerTipoProvisionEmpleadoBeans(tipoprovisionempleadosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoProvisionEmpleados(sAccionBusqueda,sTipoArchivoReporte,tipoprovisionempleadosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoProvisionEmpleados(sAccionBusqueda,sTipoArchivoReporte,tipoprovisionempleadosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoProvisionEmpleadoActionPerformed(null);
					//this.generarExcelReporteTipoProvisionEmpleados(sAccionBusqueda,sTipoArchivoReporte,tipoprovisionempleadosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoProvisionEmpleados(sAccionBusqueda,sTipoArchivoReporte,tipoprovisionempleadosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoProvisionEmpleados(sAccionBusqueda,sTipoArchivoReporte,tipoprovisionempleadosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoProvisionEmpleados(sAccionBusqueda,sTipoArchivoReporte,tipoprovisionempleadosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoProvisionEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProvisionEmpleado> tipoprovisionempleadosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprovisionempleado";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProvisionEmpleados");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoProvisionEmpleado("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoProvisionEmpleado tipoprovisionempleado : tipoprovisionempleadosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoProvisionEmpleadoConstantesFunciones.generarExcelReporteDataTipoProvisionEmpleado("NORMAL",row,workbook,tipoprovisionempleado,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoProvisionEmpleado(String sTipo,Row row,Workbook workbook) {
		
		TipoProvisionEmpleadoConstantesFunciones.generarExcelReporteHeaderTipoProvisionEmpleado(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoProvisionEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProvisionEmpleado> tipoprovisionempleadosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprovisionempleado_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProvisionEmpleados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoProvisionEmpleado tipoprovisionempleado : tipoprovisionempleadosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoProvisionEmpleadoConstantesFunciones.getTipoProvisionEmpleadoDescripcion(tipoprovisionempleado));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoProvisionEmpleadoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoProvisionEmpleadoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprovisionempleado.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprovisionempleado.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoProvisionEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProvisionEmpleado> tipoprovisionempleadosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoProvisionEmpleado> tipoprovisionempleadosRespaldo=null;
		
		classes=TipoProvisionEmpleadoConstantesFunciones.getClassesRelationshipsOfTipoProvisionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoprovisionempleadoLogic.setDatosCliente(this.datosCliente);
		this.tipoprovisionempleadoLogic.setDatosDeep(this.datosDeep);
		this.tipoprovisionempleadoLogic.setIsConDeep(true);
		
		tipoprovisionempleadosRespaldo=this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados();
		
		this.tipoprovisionempleadoLogic.setTipoProvisionEmpleados(tipoprovisionempleadosParaReportes);	
		this.tipoprovisionempleadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoprovisionempleadosParaReportes=this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados();
		this.tipoprovisionempleadoLogic.setTipoProvisionEmpleados(tipoprovisionempleadosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprovisionempleado_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProvisionEmpleados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoProvisionEmpleado("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoProvisionEmpleado tipoprovisionempleado : tipoprovisionempleadosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoProvisionEmpleado("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoProvisionEmpleadoConstantesFunciones.generarExcelReporteDataTipoProvisionEmpleado("NORMAL",row,workbook,tipoprovisionempleado,cellStyleDataAux);
		
			
			


				//ProvisionEmpleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoprovisionempleado.getProvisionEmpleados()!=null && tipoprovisionempleado.getProvisionEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProvisionEmpleadoConstantesFunciones.generarExcelReporteHeaderProvisionEmpleado("RELACIONADO",row,workbook);
				}

				if(tipoprovisionempleado.getProvisionEmpleados()!=null) {
					i2=0;
					for(ProvisionEmpleado provisionempleado : tipoprovisionempleado.getProvisionEmpleados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ProvisionEmpleadoConstantesFunciones.generarExcelReporteDataProvisionEmpleado("RELACIONADO",row,workbook,provisionempleado,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoProvisionEmpleadoConstantesFunciones.getTipoProvisionEmpleadoDescripcion(tipoprovisionempleado));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoProvisionEmpleado() throws Exception {		
		this.startProcessTipoProvisionEmpleado(true);
	}
	
	public void startProcessTipoProvisionEmpleado(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoProvisionEmpleado, this.jScrollPanelDatosTipoProvisionEmpleado,this.jPanelPaginacionTipoProvisionEmpleado, this.jScrollPanelDatosEdicionTipoProvisionEmpleado, this.jPanelAccionesTipoProvisionEmpleado,this.jPanelAccionesFormularioTipoProvisionEmpleado,this.jmenuBarTipoProvisionEmpleado,this.jmenuBarDetalleTipoProvisionEmpleado,this.jTtoolBarTipoProvisionEmpleado,this.jTtoolBarDetalleTipoProvisionEmpleado);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoProvisionEmpleado=null; 
		
		final JPanel jPanelParametrosReportesTipoProvisionEmpleado=this.jPanelParametrosReportesTipoProvisionEmpleado;
		//final JScrollPane jScrollPanelDatosTipoProvisionEmpleado=this.jScrollPanelDatosTipoProvisionEmpleado;
		final JTable jTableDatosTipoProvisionEmpleado=this.jTableDatosTipoProvisionEmpleado;		
		final JPanel jPanelPaginacionTipoProvisionEmpleado=this.jPanelPaginacionTipoProvisionEmpleado;
		//final JScrollPane jScrollPanelDatosEdicionTipoProvisionEmpleado=this.jScrollPanelDatosEdicionTipoProvisionEmpleado;
		final JPanel jPanelAccionesTipoProvisionEmpleado=this.jPanelAccionesTipoProvisionEmpleado;
		
		JPanel jPanelCamposAuxiliarTipoProvisionEmpleado=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoProvisionEmpleado=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) {
			jPanelCamposAuxiliarTipoProvisionEmpleado=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jPanelCamposTipoProvisionEmpleado;
			jPanelAccionesFormularioAuxiliarTipoProvisionEmpleado=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jPanelAccionesFormularioTipoProvisionEmpleado;
		}
		
		final JPanel jPanelCamposTipoProvisionEmpleado=jPanelCamposAuxiliarTipoProvisionEmpleado;
		final JPanel jPanelAccionesFormularioTipoProvisionEmpleado=jPanelAccionesFormularioAuxiliarTipoProvisionEmpleado;
		
		
		final JMenuBar jmenuBarTipoProvisionEmpleado=this.jmenuBarTipoProvisionEmpleado;
		final JToolBar jTtoolBarTipoProvisionEmpleado=this.jTtoolBarTipoProvisionEmpleado;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoProvisionEmpleado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoProvisionEmpleado=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) {
			jmenuBarDetalleAuxiliarTipoProvisionEmpleado=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jmenuBarDetalleTipoProvisionEmpleado;
			jTtoolBarDetalleAuxiliarTipoProvisionEmpleado=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTtoolBarDetalleTipoProvisionEmpleado;
		}
		
		final JMenuBar jmenuBarDetalleTipoProvisionEmpleado=jmenuBarDetalleAuxiliarTipoProvisionEmpleado;
		final JToolBar jTtoolBarDetalleTipoProvisionEmpleado=jTtoolBarDetalleAuxiliarTipoProvisionEmpleado;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoProvisionEmpleado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoProvisionEmpleado;
			processRunnable.jTableDatos=jTableDatosTipoProvisionEmpleado;
			processRunnable.jPanelCampos=jPanelCamposTipoProvisionEmpleado;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoProvisionEmpleado;
			processRunnable.jPanelAcciones=jPanelAccionesTipoProvisionEmpleado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoProvisionEmpleado;
			
			
			processRunnable.jmenuBar=jmenuBarTipoProvisionEmpleado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoProvisionEmpleado;
			processRunnable.jTtoolBar=jTtoolBarTipoProvisionEmpleado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoProvisionEmpleado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoProvisionEmpleado ,jPanelParametrosReportesTipoProvisionEmpleado,jTableDatosTipoProvisionEmpleado, /*jScrollPanelDatosTipoProvisionEmpleado,*/jPanelCamposTipoProvisionEmpleado,jPanelPaginacionTipoProvisionEmpleado, /*jScrollPanelDatosEdicionTipoProvisionEmpleado,*/ jPanelAccionesTipoProvisionEmpleado,jPanelAccionesFormularioTipoProvisionEmpleado,jmenuBarTipoProvisionEmpleado,jmenuBarDetalleTipoProvisionEmpleado,jTtoolBarTipoProvisionEmpleado,jTtoolBarDetalleTipoProvisionEmpleado);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoProvisionEmpleado, jScrollPanelDatosTipoProvisionEmpleado,jPanelPaginacionTipoProvisionEmpleado, jScrollPanelDatosEdicionTipoProvisionEmpleado, jPanelAccionesTipoProvisionEmpleado,jPanelAccionesFormularioTipoProvisionEmpleado,jmenuBarTipoProvisionEmpleado,jmenuBarDetalleTipoProvisionEmpleado,jTtoolBarTipoProvisionEmpleado,jTtoolBarDetalleTipoProvisionEmpleado);
						
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
	
	public void finishProcessTipoProvisionEmpleado() {// throws Exception 
		this.finishProcessTipoProvisionEmpleado(true);
	}
	
	public void finishProcessTipoProvisionEmpleado(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoProvisionEmpleado, this.jScrollPanelDatosTipoProvisionEmpleado,this.jPanelPaginacionTipoProvisionEmpleado, this.jScrollPanelDatosEdicionTipoProvisionEmpleado, this.jPanelAccionesTipoProvisionEmpleado,this.jPanelAccionesFormularioTipoProvisionEmpleado,this.jmenuBarTipoProvisionEmpleado,this.jmenuBarDetalleTipoProvisionEmpleado,this.jTtoolBarTipoProvisionEmpleado,this.jTtoolBarDetalleTipoProvisionEmpleado);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoProvisionEmpleado=null; 
		
		final JPanel jPanelParametrosReportesTipoProvisionEmpleado=this.jPanelParametrosReportesTipoProvisionEmpleado;
		//final JScrollPane jScrollPanelDatosTipoProvisionEmpleado=this.jScrollPanelDatosTipoProvisionEmpleado;
		final JTable jTableDatosTipoProvisionEmpleado=this.jTableDatosTipoProvisionEmpleado;		
		final JPanel jPanelPaginacionTipoProvisionEmpleado=this.jPanelPaginacionTipoProvisionEmpleado;
		//final JScrollPane jScrollPanelDatosEdicionTipoProvisionEmpleado=this.jScrollPanelDatosEdicionTipoProvisionEmpleado;
		final JPanel jPanelAccionesTipoProvisionEmpleado=this.jPanelAccionesTipoProvisionEmpleado;
		
		JPanel jPanelCamposAuxiliarTipoProvisionEmpleado=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoProvisionEmpleado=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) {
			jPanelCamposAuxiliarTipoProvisionEmpleado=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jPanelCamposTipoProvisionEmpleado;
			jPanelAccionesFormularioAuxiliarTipoProvisionEmpleado=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jPanelAccionesFormularioTipoProvisionEmpleado;
		}
		
		final JPanel jPanelCamposTipoProvisionEmpleado=jPanelCamposAuxiliarTipoProvisionEmpleado;
		final JPanel jPanelAccionesFormularioTipoProvisionEmpleado=jPanelAccionesFormularioAuxiliarTipoProvisionEmpleado;
		
		
		final JMenuBar jmenuBarTipoProvisionEmpleado=this.jmenuBarTipoProvisionEmpleado;		
		final JToolBar jTtoolBarTipoProvisionEmpleado=this.jTtoolBarTipoProvisionEmpleado;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoProvisionEmpleado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoProvisionEmpleado=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) {
			jmenuBarDetalleAuxiliarTipoProvisionEmpleado=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jmenuBarDetalleTipoProvisionEmpleado;
			jTtoolBarDetalleAuxiliarTipoProvisionEmpleado=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTtoolBarDetalleTipoProvisionEmpleado;		
		}
		
		final JMenuBar jmenuBarDetalleTipoProvisionEmpleado=jmenuBarDetalleAuxiliarTipoProvisionEmpleado;
		final JToolBar jTtoolBarDetalleTipoProvisionEmpleado=jTtoolBarDetalleAuxiliarTipoProvisionEmpleado;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoProvisionEmpleado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoProvisionEmpleado;
			processRunnable.jTableDatos=jTableDatosTipoProvisionEmpleado;
			processRunnable.jPanelCampos=jPanelCamposTipoProvisionEmpleado;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoProvisionEmpleado;
			processRunnable.jPanelAcciones=jPanelAccionesTipoProvisionEmpleado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoProvisionEmpleado;
			
			
			processRunnable.jmenuBar=jmenuBarTipoProvisionEmpleado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoProvisionEmpleado;
			processRunnable.jTtoolBar=jTtoolBarTipoProvisionEmpleado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoProvisionEmpleado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoProvisionEmpleado ,jPanelParametrosReportesTipoProvisionEmpleado, jTableDatosTipoProvisionEmpleado,/*jScrollPanelDatosTipoProvisionEmpleado,*/jPanelCamposTipoProvisionEmpleado,jPanelPaginacionTipoProvisionEmpleado, /*jScrollPanelDatosEdicionTipoProvisionEmpleado,*/ jPanelAccionesTipoProvisionEmpleado,jPanelAccionesFormularioTipoProvisionEmpleado,jmenuBarTipoProvisionEmpleado,jmenuBarDetalleTipoProvisionEmpleado,jTtoolBarTipoProvisionEmpleado,jTtoolBarDetalleTipoProvisionEmpleado));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoProvisionEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoProvisionEmpleado(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoProvisionEmpleado(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoProvisionEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoProvisionEmpleado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoProvisionEmpleado,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoProvisionEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoProvisionEmpleado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoProvisionEmpleado,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoprovisionempleadoConstantesFunciones.getsFinalQueryTipoProvisionEmpleado();
		String  finalQueryPaginacionTodos=this.tipoprovisionempleadoConstantesFunciones.getsFinalQueryTipoProvisionEmpleado();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoProvisionEmpleadoConstantesFunciones.getArrayColumnasGlobalesNoTipoProvisionEmpleado(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoProvisionEmpleadoConstantesFunciones.getArrayColumnasGlobalesTipoProvisionEmpleado(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoProvisionEmpleadoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoprovisionempleadosEliminados= new ArrayList<TipoProvisionEmpleado>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoProvisionEmpleado();
		
				///*TipoProvisionEmpleadoSessionBean*/this.tipoprovisionempleadoSessionBean=new TipoProvisionEmpleadoSessionBean();
			
			if(this.tipoprovisionempleadoSessionBean==null) {
				this.tipoprovisionempleadoSessionBean=new TipoProvisionEmpleadoSessionBean();
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
					this.iNumeroPaginacion=TipoProvisionEmpleadoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoProvisionEmpleadoConstantesFunciones.getClassesForeignKeysOfTipoProvisionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoprovisionempleado."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoprovisionempleadosAux= new ArrayList<TipoProvisionEmpleado>();
			
				
			tipoprovisionempleadoLogic.setDatosCliente(this.datosCliente);
			tipoprovisionempleadoLogic.setDatosDeep(this.datosDeep);
			tipoprovisionempleadoLogic.setIsConDeep(true);
			
			
			tipoprovisionempleadoLogic.getTipoProvisionEmpleadoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoprovisionempleadoLogic.getTodosTipoProvisionEmpleados(finalQueryGlobal,pagination);
					
					//tipoprovisionempleadoLogic.getTodosTipoProvisionEmpleadosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoprovisionempleadoLogic.getTipoProvisionEmpleados()==null|| tipoprovisionempleadoLogic.getTipoProvisionEmpleados().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprovisionempleadosAux= new ArrayList<TipoProvisionEmpleado>();
							tipoprovisionempleadosAux.addAll(tipoprovisionempleadoLogic.getTipoProvisionEmpleados());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprovisionempleadosAux= new ArrayList<TipoProvisionEmpleado>();
							tipoprovisionempleadosAux.addAll(tipoprovisionempleados);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprovisionempleadoLogic.getTodosTipoProvisionEmpleados(finalQueryGlobal+"",this.pagination);												
							
							//tipoprovisionempleadoLogic.getTodosTipoProvisionEmpleadosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoProvisionEmpleados("Todos",tipoprovisionempleadoLogic.getTipoProvisionEmpleados() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprovisionempleadoLogic.setTipoProvisionEmpleados(new ArrayList<TipoProvisionEmpleado>());					
							tipoprovisionempleadoLogic.getTipoProvisionEmpleados().addAll(tipoprovisionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprovisionempleados=new ArrayList<TipoProvisionEmpleado>();
							tipoprovisionempleados.addAll(tipoprovisionempleadosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoProvisionEmpleado=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoProvisionEmpleado=this.idActual;
				
				} else if(this.idTipoProvisionEmpleadoActual!=null && this.idTipoProvisionEmpleadoActual!=0L) {
					idTipoProvisionEmpleado=idTipoProvisionEmpleadoActual;
				}
				
					
				this.sDetalleReporte=TipoProvisionEmpleadoConstantesFunciones.getDetalleIndicePorId(idTipoProvisionEmpleado);
				
				this.tipoprovisionempleados=new ArrayList<TipoProvisionEmpleado>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoprovisionempleadoLogic.getEntity(idTipoProvisionEmpleado);
					
					//tipoprovisionempleadoLogic.getEntityWithConnection(idTipoProvisionEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprovisionempleadoLogic.setTipoProvisionEmpleados(new ArrayList<TipoProvisionEmpleado>());
					tipoprovisionempleadoLogic.getTipoProvisionEmpleados().add(tipoprovisionempleadoLogic.getTipoProvisionEmpleado());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprovisionempleados=new ArrayList<TipoProvisionEmpleado>();
					this.tipoprovisionempleados.add(tipoprovisionempleado);
				}
				
				if(tipoprovisionempleadoLogic.getTipoProvisionEmpleado()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoProvisionEmpleado();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoProvisionEmpleado();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoprovisionempleadoLogic.getTipoProvisionEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprovisionempleados.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoprovisionempleadoLogic.getTipoProvisionEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprovisionempleados.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoProvisionEmpleado tipoprovisionempleado) {
		Boolean permite=true;
		
		if(this.tipoprovisionempleado.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoProvisionEmpleadoConstantesFunciones.getOrderByListaTipoProvisionEmpleado();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoProvisionEmpleadoConstantesFunciones.getOrderByListaTipoProvisionEmpleado();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProvisionEmpleado tipoprovisionempleado:tipoprovisionempleadoLogic.getTipoProvisionEmpleados()) {
				if(tipoprovisionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprovisionempleadoTotales=tipoprovisionempleado;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProvisionEmpleado tipoprovisionempleado:this.tipoprovisionempleados) {
				if(tipoprovisionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprovisionempleadoTotales=tipoprovisionempleado;
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
			this.tipoprovisionempleadoAux=new TipoProvisionEmpleado();
			this.tipoprovisionempleadoAux.setsType(Constantes2.S_TOTALES);
			this.tipoprovisionempleadoAux.setIsNew(false);
			this.tipoprovisionempleadoAux.setIsChanged(false);
			this.tipoprovisionempleadoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoProvisionEmpleadoConstantesFunciones.TotalizarValoresFilaTipoProvisionEmpleado(this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados(),this.tipoprovisionempleadoAux);
				
				this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().add(this.tipoprovisionempleadoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoProvisionEmpleadoConstantesFunciones.TotalizarValoresFilaTipoProvisionEmpleado(this.tipoprovisionempleados,this.tipoprovisionempleadoAux);
				
				this.tipoprovisionempleados.add(this.tipoprovisionempleadoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoprovisionempleadoTotales=new TipoProvisionEmpleado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().remove(tipoprovisionempleadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoprovisionempleados.remove(tipoprovisionempleadoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoprovisionempleadoTotales=new TipoProvisionEmpleado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProvisionEmpleado tipoprovisionempleado:tipoprovisionempleadoLogic.getTipoProvisionEmpleados()) {
				if(tipoprovisionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprovisionempleadoTotales=tipoprovisionempleado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoProvisionEmpleadoConstantesFunciones.TotalizarValoresFilaTipoProvisionEmpleado(this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados(),tipoprovisionempleadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProvisionEmpleado tipoprovisionempleado:this.tipoprovisionempleados) {
				if(tipoprovisionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprovisionempleadoTotales=tipoprovisionempleado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoProvisionEmpleadoConstantesFunciones.TotalizarValoresFilaTipoProvisionEmpleado(this.tipoprovisionempleados,tipoprovisionempleadoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoProvisionEmpleado() {
		this.isPermisoTodoTipoProvisionEmpleado=false;
		this.isPermisoNuevoTipoProvisionEmpleado=false;
		this.isPermisoActualizarTipoProvisionEmpleado=false;
		this.isPermisoActualizarOriginalTipoProvisionEmpleado=false;
		this.isPermisoEliminarTipoProvisionEmpleado=false;
		this.isPermisoGuardarCambiosTipoProvisionEmpleado=false;
		this.isPermisoConsultaTipoProvisionEmpleado=false;
		this.isPermisoBusquedaTipoProvisionEmpleado=false;
		this.isPermisoReporteTipoProvisionEmpleado=false;		
		this.isPermisoOrdenTipoProvisionEmpleado=false;		
		this.isPermisoPaginacionMedioTipoProvisionEmpleado=false;		
		this.isPermisoPaginacionAltoTipoProvisionEmpleado=false;
		this.isPermisoPaginacionTodoTipoProvisionEmpleado=false;
		this.isPermisoCopiarTipoProvisionEmpleado=false;		
		this.isPermisoVerFormTipoProvisionEmpleado=false;		
		this.isPermisoDuplicarTipoProvisionEmpleado=false;		
		this.isPermisoOrdenTipoProvisionEmpleado=false;		
	}
	
	public void setPermisosUsuarioTipoProvisionEmpleado(Boolean isPermiso) {
		this.isPermisoTodoTipoProvisionEmpleado=isPermiso;
		this.isPermisoNuevoTipoProvisionEmpleado=isPermiso;
		this.isPermisoActualizarTipoProvisionEmpleado=isPermiso;
		this.isPermisoActualizarOriginalTipoProvisionEmpleado=isPermiso;
		this.isPermisoEliminarTipoProvisionEmpleado=isPermiso;
		this.isPermisoGuardarCambiosTipoProvisionEmpleado=isPermiso;
		this.isPermisoConsultaTipoProvisionEmpleado=isPermiso;
		this.isPermisoBusquedaTipoProvisionEmpleado=isPermiso;
		this.isPermisoReporteTipoProvisionEmpleado=isPermiso;
		this.isPermisoOrdenTipoProvisionEmpleado=isPermiso;		
		this.isPermisoPaginacionMedioTipoProvisionEmpleado=isPermiso;		
		this.isPermisoPaginacionAltoTipoProvisionEmpleado=isPermiso;		
		this.isPermisoPaginacionTodoTipoProvisionEmpleado=isPermiso;		
		this.isPermisoCopiarTipoProvisionEmpleado=isPermiso;		
		this.isPermisoVerFormTipoProvisionEmpleado=isPermiso;		
		this.isPermisoDuplicarTipoProvisionEmpleado=isPermiso;
		this.isPermisoOrdenTipoProvisionEmpleado=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoProvisionEmpleado(Boolean isPermiso) {
		//this.isPermisoTodoTipoProvisionEmpleado=isPermiso;
		this.isPermisoNuevoTipoProvisionEmpleado=isPermiso;
		this.isPermisoActualizarTipoProvisionEmpleado=isPermiso;
		this.isPermisoActualizarOriginalTipoProvisionEmpleado=isPermiso;
		this.isPermisoEliminarTipoProvisionEmpleado=isPermiso;
		this.isPermisoGuardarCambiosTipoProvisionEmpleado=isPermiso;
		//this.isPermisoConsultaTipoProvisionEmpleado=isPermiso;
		//this.isPermisoBusquedaTipoProvisionEmpleado=isPermiso;
		//this.isPermisoReporteTipoProvisionEmpleado=isPermiso;
		//this.isPermisoOrdenTipoProvisionEmpleado=isPermiso;		
		//this.isPermisoPaginacionMedioTipoProvisionEmpleado=isPermiso;		
		//this.isPermisoPaginacionAltoTipoProvisionEmpleado=isPermiso;		
		//this.isPermisoPaginacionTodoTipoProvisionEmpleado=isPermiso;		
		//this.isPermisoCopiarTipoProvisionEmpleado=isPermiso;		
		//this.isPermisoDuplicarTipoProvisionEmpleado=isPermiso;
		//this.isPermisoOrdenTipoProvisionEmpleado=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoProvisionEmpleadoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ProvisionEmpleadoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoProvisionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosProvisionEmpleado=false;
		this.isTienePermisosProvisionEmpleado=this.verificarGetPermisosUsuarioOpcionTipoProvisionEmpleadoClaseRelacionada(this.opcionsRelacionadas,ProvisionEmpleadoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoProvisionEmpleado(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoProvisionEmpleadoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosProvisionEmpleado=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoProvisionEmpleadoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoProvisionEmpleadoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoProvisionEmpleadoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosProvisionEmpleado && this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null && this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTabbedPaneRelacionesTipoProvisionEmpleado.remove(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoProvisionEmpleado() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoProvisionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoProvisionEmpleadoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoProvisionEmpleado=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoProvisionEmpleado=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoProvisionEmpleado=this.isPermisoActualizarTipoProvisionEmpleado;
			this.isPermisoEliminarTipoProvisionEmpleado=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoProvisionEmpleado=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoProvisionEmpleado=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoProvisionEmpleado=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoProvisionEmpleado=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoProvisionEmpleado=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoProvisionEmpleado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoProvisionEmpleado=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoProvisionEmpleado=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoProvisionEmpleado=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoProvisionEmpleado=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoProvisionEmpleado=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoProvisionEmpleado=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoProvisionEmpleado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoProvisionEmpleado.setToolTipText(this.jTableDatosTipoProvisionEmpleado.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoProvisionEmpleado(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoProvisionEmpleado(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoProvisionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoProvisionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoProvisionEmpleado() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosProvisionEmpleado && this.tipoprovisionempleadoConstantesFunciones.mostrarProvisionEmpleadoTipoProvisionEmpleado && !TipoProvisionEmpleadoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Provision Empleado");
			reporte.setsDescripcion("Provision Empleado");
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
	
		
	public void inicializarCombosForeignKeyTipoProvisionEmpleadoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoProvisionEmpleadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoProvisionEmpleadoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoProvisionEmpleadoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoProvisionEmpleadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoProvisionEmpleado()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoProvisionEmpleado()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoProvisionEmpleado(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoProvisionEmpleado()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProvisionEmpleado();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoProvisionEmpleado(TipoProvisionEmpleado tipoprovisionempleado)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoProvisionEmpleado(TipoProvisionEmpleado tipoprovisionempleado,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoProvisionEmpleado()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProvisionEmpleado()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoProvisionEmpleado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoProvisionEmpleado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoProvisionEmpleado()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoProvisionEmpleado()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoProvisionEmpleado(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoProvisionEmpleado()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoProvisionEmpleadoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoProvisionEmpleadoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoProvisionEmpleadoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoprovisionempleadoSessionBean=new TipoProvisionEmpleadoSessionBean(); 
		this.tipoprovisionempleadoConstantesFunciones=new TipoProvisionEmpleadoConstantesFunciones(); 
		this.tipoprovisionempleadoBean=new TipoProvisionEmpleado();//(this.tipoprovisionempleadoConstantesFunciones); 		
		this.tipoprovisionempleadoReturnGeneral=new TipoProvisionEmpleadoParameterReturnGeneral(); 
		
		this.tipoprovisionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprovisionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoProvisionEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoProvisionEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoProvisionEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoProvisionEmpleado(true);
			
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
			
			this.tipoprovisionempleadoConstantesFunciones=new TipoProvisionEmpleadoConstantesFunciones(); 
			this.tipoprovisionempleadoBean=new TipoProvisionEmpleado();//this.tipoprovisionempleadoConstantesFunciones); 			
			this.tipoprovisionempleadoReturnGeneral=new TipoProvisionEmpleadoParameterReturnGeneral(); 
		
			TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Provision Empleado Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoprovisionempleado=new TipoProvisionEmpleado();
			this.tipoprovisionempleados = new ArrayList<TipoProvisionEmpleado>();
			this.tipoprovisionempleadosAux = new ArrayList<TipoProvisionEmpleado>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic=new TipoProvisionEmpleadoLogic();
				this.tipoprovisionempleadoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoprovisionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoprovisionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoProvisionEmpleado);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoProvisionEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoProvisionEmpleado);	
					}
					
					if(this.jInternalFrameImportacionTipoProvisionEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoProvisionEmpleado);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoProvisionEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoProvisionEmpleado);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoProvisionEmpleado);
				this.jInternalFrameDetalleFormTipoProvisionEmpleado.setVisible(false);
				this.jInternalFrameDetalleFormTipoProvisionEmpleado.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoProvisionEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoProvisionEmpleado);
					this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoProvisionEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoProvisionEmpleado);
					this.jInternalFrameImportacionTipoProvisionEmpleado.setVisible(false);
					this.jInternalFrameImportacionTipoProvisionEmpleado.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoProvisionEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoProvisionEmpleado);
					this.jInternalFrameOrderByTipoProvisionEmpleado.setVisible(false);
					this.jInternalFrameOrderByTipoProvisionEmpleado.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoProvisionEmpleadoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoProvisionEmpleadoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoprovisionempleadoReturnGeneral=new TipoProvisionEmpleadoParameterReturnGeneral();
			
			this.tipoprovisionempleadoParameterGeneral=new TipoProvisionEmpleadoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoprovisionempleadoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoProvisionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ProvisionEmpleadoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoProvisionEmpleadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado(),this.tipoprovisionempleadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoProvisionEmpleadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado(),this.tipoprovisionempleadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaDuplicarTipoProvisionEmpleado=true;
			this.isVisibilidadCeldaCopiarTipoProvisionEmpleado=true;
			this.isVisibilidadCeldaVerFormTipoProvisionEmpleado=true;
			this.isVisibilidadCeldaOrdenTipoProvisionEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaModificarTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaEliminarTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaGuardarTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProvisionEmpleado=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoProvisionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoProvisionEmpleado();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoProvisionEmpleado(false);
			
			this.setPermisosUsuarioTipoProvisionEmpleado();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado() && this.tipoprovisionempleadoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoProvisionEmpleadoClasesRelacionadas();
			}
			
			if(this.tipoprovisionempleadoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoProvisionEmpleadoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoProvisionEmpleado();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoProvisionEmpleado();
			}
			
			if(!this.isPermisoBusquedaTipoProvisionEmpleado) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoProvisionEmpleado,this.isPermisoPaginacionMedioTipoProvisionEmpleado,this.isPermisoPaginacionTodoTipoProvisionEmpleado);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoProvisionEmpleadoConstantesFunciones.getTiposSeleccionarTipoProvisionEmpleado());
				
				this.tiposColumnasSelect=TipoProvisionEmpleadoConstantesFunciones.getTiposSeleccionarTipoProvisionEmpleado(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoProvisionEmpleado();				
				//this.tiposRelacionesSelect=TipoProvisionEmpleadoConstantesFunciones.getTiposRelacionesTipoProvisionEmpleado(true);
				
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
			//if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoProvisionEmpleado();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoProvisionEmpleado(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoProvisionEmpleado(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProvisionEmpleado() ;
			
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
			
			
			this.provisionempleadoLogic=new ProvisionEmpleadoLogic(); 
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
				tipoprovisionempleadoImplementable= (TipoProvisionEmpleadoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoProvisionEmpleadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoprovisionempleadoImplementableHome= (TipoProvisionEmpleadoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoProvisionEmpleadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoprovisionempleados= new ArrayList<TipoProvisionEmpleado>();
			this.tipoprovisionempleadosEliminados= new ArrayList<TipoProvisionEmpleado>();
						
			this.isEsNuevoTipoProvisionEmpleado=false;
			this.esParaAccionDesdeFormularioTipoProvisionEmpleado=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoProvisionEmpleado(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoProvisionEmpleado();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoProvisionEmpleadoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoProvisionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoProvisionEmpleado(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoProvisionEmpleado();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoProvisionEmpleado();
			}
			
			TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoProvisionEmpleado(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoProvisionEmpleado: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoProvisionEmpleado() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoProvisionEmpleado")) {
				iIndex=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTabbedPaneRelacionesTipoProvisionEmpleado.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTabbedPaneRelacionesTipoProvisionEmpleado.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoProvisionEmpleado.getSelectedRow();	
				
				

				if(sTitle.equals("Provision Empleados")) {
					if(!ProvisionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoProvisionEmpleado();

						this.cargarParteTabPanelRelacionadaProvisionEmpleado(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoProvisionEmpleado();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaProvisionEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.cargarSessionConBeanSwingJInternalFrameProvisionEmpleado(false,true,iIndex);
		this.jButtonProvisionEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProvisionEmpleado();

		//this.jTabbedPaneRelacionesTipoProvisionEmpleado.updateUI();
		//this.jTabbedPaneRelacionesTipoProvisionEmpleado.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoProvisionEmpleado.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ProvisionEmpleado")) {
				int row=this.jTableDatosTipoProvisionEmpleado.getSelectedRow();
				jButtonProvisionEmpleadoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Provision Empleado")) {

					if(this.isTienePermisosProvisionEmpleado && this.tipoprovisionempleadoConstantesFunciones.mostrarProvisionEmpleadoTipoProvisionEmpleado && !TipoProvisionEmpleadoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Provision Empleados"+"("+ProvisionEmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Provision Empleados");

						if(tipoprovisionempleadoConstantesFunciones.resaltarProvisionEmpleadoTipoProvisionEmpleado!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoprovisionempleadoConstantesFunciones.resaltarProvisionEmpleadoTipoProvisionEmpleado);
						}

						jmenuItem.setEnabled(this.tipoprovisionempleadoConstantesFunciones.activarProvisionEmpleadoTipoProvisionEmpleado);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ProvisionEmpleado"));

						

						this.jInternalFrameDetalleFormTipoProvisionEmpleado.jmenuDetalleTipoProvisionEmpleado.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoProvisionEmpleado(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoProvisionEmpleado(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoProvisionEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoProvisionEmpleadoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoProvisionEmpleado();
		
		this.cargarCombosFrameForeignKeyTipoProvisionEmpleado();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoProvisionEmpleado();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoProvisionEmpleado();
		}
	}
	
	
	
	public void jButtonNuevoTipoProvisionEmpleadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoprovisionempleadoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
			
			
			if(jTableDatosTipoProvisionEmpleado.getRowCount()>=1) {
				jTableDatosTipoProvisionEmpleado.removeRowSelectionInterval(0, jTableDatosTipoProvisionEmpleado.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoProvisionEmpleado=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoProvisionEmpleado(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoProvisionEmpleado(true);			
			//this.tipoprovisionempleado=new TipoProvisionEmpleado();
			//this.tipoprovisionempleado.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProvisionEmpleado(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProvisionEmpleado() ;
			
			if(TipoProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProvisionEmpleado(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoprovisionempleado);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprovisionempleado);				
			
			TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
			
			if(this.tipoprovisionempleadoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoProvisionEmpleado: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoProvisionEmpleadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoProvisionEmpleado> tipoprovisionempleadosSeleccionados=new ArrayList<TipoProvisionEmpleado>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoProvisionEmpleado.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoProvisionEmpleado.getSelectedRows().length;			
			}
			
			tipoprovisionempleadosSeleccionados=this.getTipoProvisionEmpleadosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoProvisionEmpleado--;			
				//TipoProvisionEmpleado tipoprovisionempleadoAux= new TipoProvisionEmpleado();			
				//tipoprovisionempleadoAux.setId(this.iIdNuevoTipoProvisionEmpleado);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoProvisionEmpleado tipoprovisionempleadoOrigen=new TipoProvisionEmpleado();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoProvisionEmpleado tipoprovisionempleadoOrigen : tipoprovisionempleadosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoProvisionEmpleado.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoprovisionempleadoOrigen =(TipoProvisionEmpleado) this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprovisionempleadoOrigen =(TipoProvisionEmpleado) this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoProvisionEmpleado();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoprovisionempleado.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoProvisionEmpleado(tipoprovisionempleadoOrigen,this.tipoprovisionempleado,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProvisionEmpleado(this.tipoprovisionempleado);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().add(this.tipoprovisionempleadoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoprovisionempleados.add(this.tipoprovisionempleadoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoProvisionEmpleado(false);
				
				this.jTableDatosTipoProvisionEmpleado.setRowSelectionInterval(this.getIndiceNuevoTipoProvisionEmpleado(), this.getIndiceNuevoTipoProvisionEmpleado());
				
				int iLastRow =  this.jTableDatosTipoProvisionEmpleado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoProvisionEmpleado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoProvisionEmpleado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProvisionEmpleado(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoProvisionEmpleado> tipoprovisionempleadosSeleccionados=new ArrayList<TipoProvisionEmpleado>();									
		
			TipoProvisionEmpleado tipoprovisionempleadoOrigen=new TipoProvisionEmpleado();
			TipoProvisionEmpleado tipoprovisionempleadoDestino=new TipoProvisionEmpleado();
				
			tipoprovisionempleadosSeleccionados=this.getTipoProvisionEmpleadosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoProvisionEmpleado.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoprovisionempleadosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoProvisionEmpleado.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprovisionempleadoOrigen =(TipoProvisionEmpleado) this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoprovisionempleadoOrigen =(TipoProvisionEmpleado) this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprovisionempleadoDestino =(TipoProvisionEmpleado) this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoprovisionempleadoDestino =(TipoProvisionEmpleado) this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoprovisionempleadoOrigen =tipoprovisionempleadosSeleccionados.get(0);
				tipoprovisionempleadoDestino =tipoprovisionempleadosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoProvisionEmpleado(tipoprovisionempleadoOrigen,tipoprovisionempleadoDestino,true,false);
				
				tipoprovisionempleadoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoprovisionempleadoDestino,tipoprovisionempleadoLogic.getTipoProvisionEmpleados());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprovisionempleadoDestino,tipoprovisionempleados);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoProvisionEmpleado(false);
				
				//this.jTableDatosTipoProvisionEmpleado.setRowSelectionInterval(this.getIndiceNuevoTipoProvisionEmpleado(), this.getIndiceNuevoTipoProvisionEmpleado());
				
				int iLastRow =  this.jTableDatosTipoProvisionEmpleado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoProvisionEmpleado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoProvisionEmpleado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProvisionEmpleado(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoProvisionEmpleado.isVisible();
			
			
			this.jPanelParametrosReportesTipoProvisionEmpleado.setVisible(!isVisible);
			this.jPanelPaginacionTipoProvisionEmpleado.setVisible(!isVisible);
			this.jPanelAccionesTipoProvisionEmpleado.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoProvisionEmpleado();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoProvisionEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoProvisionEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoProvisionEmpleado();
			
			this.abrirFrameOrderByTipoProvisionEmpleado();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoProvisionEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoProvisionEmpleado(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoProvisionEmpleado);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoProvisionEmpleado.isMaximum()) {
					this.jInternalFrameDetalleFormTipoProvisionEmpleado.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoProvisionEmpleado.setSize(this.jInternalFrameDetalleFormTipoProvisionEmpleado.iWidthFormulario,this.jInternalFrameDetalleFormTipoProvisionEmpleado.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoProvisionEmpleado.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoProvisionEmpleado.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoProvisionEmpleado.isMaximum()) {
						this.jInternalFrameDetalleFormTipoProvisionEmpleado.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoProvisionEmpleado.jContentPaneDetalleTipoProvisionEmpleado.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTabbedPaneRelacionesTipoProvisionEmpleado.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoProvisionEmpleado.jContentPaneDetalleTipoProvisionEmpleado.getWidth(),TipoProvisionEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTabbedPaneRelacionesTipoProvisionEmpleado.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoProvisionEmpleado.jContentPaneDetalleTipoProvisionEmpleado.getWidth(),TipoProvisionEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTabbedPaneRelacionesTipoProvisionEmpleado.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoProvisionEmpleado.jContentPaneDetalleTipoProvisionEmpleado.getWidth(),TipoProvisionEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ProvisionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProvisionEmpleado();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoProvisionEmpleado.setVisible(true);
	        this.jInternalFrameDetalleFormTipoProvisionEmpleado.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoProvisionEmpleado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoProvisionEmpleado==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoProvisionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProvisionEmpleado,false,this);
				} else {
					this.jInternalFrameOrderByTipoProvisionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProvisionEmpleado,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoProvisionEmpleado);
				this.jInternalFrameOrderByTipoProvisionEmpleado.setVisible(false);
				this.jInternalFrameOrderByTipoProvisionEmpleado.setSelected(false);
				
				this.jInternalFrameOrderByTipoProvisionEmpleado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoProvisionEmpleado"));
				
				this.inicializarActualizarBindingTablaOrderByTipoProvisionEmpleado();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoProvisionEmpleado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoProvisionEmpleado==null) {
				
				this.jInternalFrameImportacionTipoProvisionEmpleado=new ImportacionJInternalFrame(TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoProvisionEmpleado);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoProvisionEmpleado);
				this.jInternalFrameImportacionTipoProvisionEmpleado.setVisible(false);
				this.jInternalFrameImportacionTipoProvisionEmpleado.setSelected(false);


				this.jInternalFrameImportacionTipoProvisionEmpleado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoProvisionEmpleado"));
				this.jInternalFrameImportacionTipoProvisionEmpleado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoProvisionEmpleado"));
				this.jInternalFrameImportacionTipoProvisionEmpleado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoProvisionEmpleado"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoProvisionEmpleado() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoProvisionEmpleado==null) {
				this.jInternalFrameReporteDinamicoTipoProvisionEmpleado=new ReporteDinamicoJInternalFrame(TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoProvisionEmpleado);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoProvisionEmpleado);
				this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProvisionEmpleado"));
				this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProvisionEmpleado"));
				this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProvisionEmpleado"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProvisionEmpleado();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaProvisionEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.jScrollPanelDatosProvisionEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoProvisionEmpleado.jContentPaneDetalleTipoProvisionEmpleado.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.jScrollPanelDatosProvisionEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.jScrollPanelDatosProvisionEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.jScrollPanelDatosProvisionEmpleado.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoProvisionEmpleado() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoProvisionEmpleado);
			
	       	this.jInternalFrameDetalleFormTipoProvisionEmpleado.setVisible(false);
	        this.jInternalFrameDetalleFormTipoProvisionEmpleado.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoProvisionEmpleado.dispose();
			//this.jInternalFrameDetalleFormTipoProvisionEmpleado=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoProvisionEmpleado() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoProvisionEmpleado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoProvisionEmpleado.setVisible(true);
	        this.jInternalFrameImportacionTipoProvisionEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoProvisionEmpleado() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoProvisionEmpleado.setVisible(true);
	        this.jInternalFrameOrderByTipoProvisionEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoProvisionEmpleado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoProvisionEmpleado.setVisible(false);
	        this.jInternalFrameOrderByTipoProvisionEmpleado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoProvisionEmpleado() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoProvisionEmpleado() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoProvisionEmpleado.setVisible(false);
	        this.jInternalFrameImportacionTipoProvisionEmpleado.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoProvisionEmpleado(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoProvisionEmpleado(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoProvisionEmpleado.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoProvisionEmpleado(true);
			//this.isEsNuevoTipoProvisionEmpleado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoProvisionEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProvisionEmpleado(false) ;
			
			if(tipoprovisionempleadoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoSessionBean.getEsGuardarRelacionado() && ProvisionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProvisionEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProvisionEmpleado(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProvisionEmpleado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoProvisionEmpleadoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoProvisionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoProvisionEmpleado(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoProvisionEmpleado.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoProvisionEmpleado(true);
			//this.isEsNuevoTipoProvisionEmpleado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoprovisionempleado.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoProvisionEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoProvisionEmpleado(false) ;
			
			if(TipoProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProvisionEmpleado(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProvisionEmpleado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoProvisionEmpleado(false);
			
			//if(!this.isEsNuevoTipoProvisionEmpleado) {								
				int intSelectedRow = this.jTableDatosTipoProvisionEmpleado.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoProvisionEmpleado(this.tipoprovisionempleado,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProvisionEmpleado(this.tipoprovisionempleado);
				
			}
			
			if(this.permiteMantenimiento(this.tipoprovisionempleado)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoProvisionEmpleado=true;
					this.inicializarActualizarBindingTablaTipoProvisionEmpleado(false);
					this.isEsNuevoTipoProvisionEmpleado=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoProvisionEmpleado=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoProvisionEmpleado=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoProvisionEmpleado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProvisionEmpleado(false);
				
				this.habilitarDeshabilitarControlesTipoProvisionEmpleado(false);
			
												
				
				if(TipoProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoProvisionEmpleado();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoProvisionEmpleadoActionPerformed(evt,tipoprovisionempleadoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoProvisionEmpleado(this.tipoprovisionempleado,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoProvisionEmpleado.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoprovisionempleadoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoprovisionempleado.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoProvisionEmpleado.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProvisionEmpleado.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoProvisionEmpleado.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				this.tipoprovisionempleado.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				this.tipoprovisionempleado.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoprovisionempleado)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoProvisionEmpleadoModel) this.jTableDatosTipoProvisionEmpleado.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoProvisionEmpleado=true;
				this.inicializarActualizarBindingTablaTipoProvisionEmpleado(false);
				this.isEsNuevoTipoProvisionEmpleado=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoProvisionEmpleado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProvisionEmpleado(false);
				
				this.habilitarDeshabilitarControlesTipoProvisionEmpleado(false);
				
				
				
				if(TipoProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoProvisionEmpleado();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoProvisionEmpleado.getRowCount()>=1) {
				jTableDatosTipoProvisionEmpleado.removeRowSelectionInterval(0, jTableDatosTipoProvisionEmpleado.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoProvisionEmpleado(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoProvisionEmpleado(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProvisionEmpleado(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProvisionEmpleado(false) ;
			
			this.isEsNuevoTipoProvisionEmpleado=false;
			
			if(TipoProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoProvisionEmpleado();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoProvisionEmpleado(false);
				
				//SI ES MANUAL
				if(TipoProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoProvisionEmpleado();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoProvisionEmpleado--;			
			//TipoProvisionEmpleado tipoprovisionempleadoAux= new TipoProvisionEmpleado();			
			//tipoprovisionempleadoAux.setId(this.iIdNuevoTipoProvisionEmpleado);
			
			if(this.jInternalFrameDetalleFormTipoProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoProvisionEmpleado();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoProvisionEmpleado(this.tipoprovisionempleado);
			
			this.tipoprovisionempleado.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().add(this.tipoprovisionempleadoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoprovisionempleados.add(this.tipoprovisionempleadoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoProvisionEmpleado(false);
			
			this.jTableDatosTipoProvisionEmpleado.setRowSelectionInterval(this.getIndiceNuevoTipoProvisionEmpleado(), this.getIndiceNuevoTipoProvisionEmpleado());
			
			int iLastRow =  this.jTableDatosTipoProvisionEmpleado.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoProvisionEmpleado.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoProvisionEmpleado.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoProvisionEmpleado(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoProvisionEmpleado(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProvisionEmpleado(false);
			
			//SI ES MANUAL
			if(TipoProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProvisionEmpleado();
			}
			
			//this.abrirFrameTreeTipoProvisionEmpleado();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Provision EmpleadoS ?", "MANTENIMIENTO DE Tipo Provision Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoProvisionEmpleado.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoProvisionEmpleado();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoprovisionempleadoReturnGeneral=tipoprovisionempleadoLogic.procesarImportacionTipoProvisionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoprovisionempleadoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoProvisionEmpleadoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoProvisionEmpleado.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoProvisionEmpleado.setFileImportacion(this.jInternalFrameImportacionTipoProvisionEmpleado.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoProvisionEmpleado.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoProvisionEmpleado.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoProvisionEmpleado.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoProvisionEmpleado.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoProvisionEmpleado> tipoprovisionempleadosSeleccionados=new ArrayList<TipoProvisionEmpleado>();		

		tipoprovisionempleadosSeleccionados=this.getTipoProvisionEmpleadosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoProvisionEmpleadoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoProvisionEmpleadoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoProvisionEmpleados("Todos",tipoprovisionempleadosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoProvisionEmpleadoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoProvisionEmpleadoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoProvisionEmpleadoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoProvisionEmpleadoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoProvisionEmpleado> tipoprovisionempleadosSeleccionados=new ArrayList<TipoProvisionEmpleado>();		
		
		tipoprovisionempleadosSeleccionados=this.getTipoProvisionEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprovisionempleado";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoProvisionEmpleados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoProvisionEmpleadoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoProvisionEmpleadoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoProvisionEmpleado tipoprovisionempleado:tipoprovisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprovisionempleado.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoProvisionEmpleado tipoprovisionempleado:tipoprovisionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprovisionempleado.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoProvisionEmpleado(row);				
			//	iRow++;
			//}				
			
			//for(TipoProvisionEmpleado tipoprovisionempleadoAux:tipoprovisionempleadosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoProvisionEmpleado(tipoprovisionempleadoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoprovisionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProvisionEmpleado(false);
			
			//SI ES MANUAL
			if(TipoProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProvisionEmpleado();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProvisionEmpleado(false);
			
			//SI ES MANUAL
			if(TipoProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoProvisionEmpleado();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoProvisionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProvisionEmpleado(false);
			
			//SI ES MANUAL
			if(TipoProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoProvisionEmpleado();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprovisionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoProvisionEmpleado() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoProvisionEmpleado.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoProvisionEmpleado.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoProvisionEmpleado.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoProvisionEmpleado.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoProvisionEmpleado.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoProvisionEmpleado.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoProvisionEmpleado.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoProvisionEmpleado(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoProvisionEmpleado(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoProvisionEmpleado(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoProvisionEmpleado(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoProvisionEmpleado(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoProvisionEmpleado(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProvisionEmpleado(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoProvisionEmpleado(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoProvisionEmpleado() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoProvisionEmpleado();
		
		this.inicializarActualizarBindingBotonesManualTipoProvisionEmpleado(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoProvisionEmpleado();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProvisionEmpleado() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProvisionEmpleado(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProvisionEmpleado(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoProvisionEmpleado.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoProvisionEmpleado.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoProvisionEmpleado.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jCheckBoxPostAccionNuevoTipoProvisionEmpleado.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jCheckBoxPostAccionSinCerrarTipoProvisionEmpleado.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jCheckBoxPostAccionSinMensajeTipoProvisionEmpleado.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoProvisionEmpleado.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoProvisionEmpleado.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoProvisionEmpleado.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) {
				this.jInternalFrameDetalleFormTipoProvisionEmpleado.jCheckBoxPostAccionNuevoTipoProvisionEmpleado.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoProvisionEmpleado.jCheckBoxPostAccionSinCerrarTipoProvisionEmpleado.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoProvisionEmpleado.jCheckBoxPostAccionSinMensajeTipoProvisionEmpleado.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoProvisionEmpleado.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoProvisionEmpleado.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoProvisionEmpleado.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoProvisionEmpleado.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoProvisionEmpleado!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoProvisionEmpleado.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoProvisionEmpleado.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoProvisionEmpleado.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoProvisionEmpleado.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoProvisionEmpleado!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoProvisionEmpleado.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoProvisionEmpleado.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoProvisionEmpleado(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProvisionEmpleado(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoProvisionEmpleado() throws Exception {
		try	{
			if(TipoProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoProvisionEmpleado();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoProvisionEmpleado() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoProvisionEmpleado() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoProvisionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoProvisionEmpleado.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoProvisionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoProvisionEmpleado.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoProvisionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoProvisionEmpleado.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoProvisionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoProvisionEmpleado.addItem(reporte);
			}
			
			
			if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoProvisionEmpleado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoProvisionEmpleado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoProvisionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoProvisionEmpleado.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoProvisionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoProvisionEmpleado.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoProvisionEmpleado.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoProvisionEmpleado.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoProvisionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoProvisionEmpleado.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoProvisionEmpleado.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProvisionEmpleado();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProvisionEmpleado() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoProvisionEmpleado!=null) {
				this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoProvisionEmpleado!=null) {
				this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoProvisionEmpleado!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoProvisionEmpleado()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoProvisionEmpleado(Boolean esInicializar) throws Exception {				
		if(TipoProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoProvisionEmpleado();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoProvisionEmpleado() throws Exception {
		this.inicializarActualizarBindingTablaTipoProvisionEmpleado(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoProvisionEmpleado() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoProvisionEmpleado.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoProvisionEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProvisionEmpleado.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoProvisionEmpleadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoProvisionEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProvisionEmpleado.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoProvisionEmpleadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoProvisionEmpleadoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProvisionEmpleadoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoProvisionEmpleadoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoProvisionEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProvisionEmpleado.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoProvisionEmpleadoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoProvisionEmpleado.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoProvisionEmpleado(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoprovisionempleadoLogic.getTipoProvisionEmpleados().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoprovisionempleados.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoProvisionEmpleado.setModel(new TipoProvisionEmpleadoModel(this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoProvisionEmpleado.setModel(new TipoProvisionEmpleadoModel(this.tipoprovisionempleados,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoProvisionEmpleado!=null && this.jInternalFrameOrderByTipoProvisionEmpleado.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoProvisionEmpleado();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProvisionEmpleado,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoProvisionEmpleadoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO,tipoprovisionempleadoConstantesFunciones.resaltarSeleccionarTipoProvisionEmpleado,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO,tipoprovisionempleadoConstantesFunciones.resaltarSeleccionarTipoProvisionEmpleado,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProvisionEmpleado,TipoProvisionEmpleadoConstantesFunciones.LABEL_ID));

		if(this.tipoprovisionempleadoConstantesFunciones.mostraridTipoProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProvisionEmpleadoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoprovisionempleadoConstantesFunciones.resaltaridTipoProvisionEmpleado,this.tipoprovisionempleadoConstantesFunciones.activaridTipoProvisionEmpleado,this,true,"idTipoProvisionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprovisionempleadoConstantesFunciones.resaltaridTipoProvisionEmpleado,this.tipoprovisionempleadoConstantesFunciones.activaridTipoProvisionEmpleado,this,true,"idTipoProvisionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProvisionEmpleado,TipoProvisionEmpleadoConstantesFunciones.LABEL_CODIGO));

		if(this.tipoprovisionempleadoConstantesFunciones.mostrarcodigoTipoProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProvisionEmpleadoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoprovisionempleadoConstantesFunciones.resaltarcodigoTipoProvisionEmpleado,this.tipoprovisionempleadoConstantesFunciones.activarcodigoTipoProvisionEmpleado,this,true,"codigoTipoProvisionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprovisionempleadoConstantesFunciones.resaltarcodigoTipoProvisionEmpleado,this.tipoprovisionempleadoConstantesFunciones.activarcodigoTipoProvisionEmpleado,this,true,"codigoTipoProvisionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProvisionEmpleado,TipoProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoprovisionempleadoConstantesFunciones.mostrarnombreTipoProvisionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoprovisionempleadoConstantesFunciones.resaltarnombreTipoProvisionEmpleado,this.tipoprovisionempleadoConstantesFunciones.activarnombreTipoProvisionEmpleado,this,true,"nombreTipoProvisionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprovisionempleadoConstantesFunciones.resaltarnombreTipoProvisionEmpleado,this.tipoprovisionempleadoConstantesFunciones.activarnombreTipoProvisionEmpleado,this,true,"nombreTipoProvisionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoProvisionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosProvisionEmpleado && this.tipoprovisionempleadoConstantesFunciones.mostrarProvisionEmpleadoTipoProvisionEmpleado && !TipoProvisionEmpleadoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Provision Empleados");
				tableColumn.setHeaderValue("Provision Empleados");
				tableColumn.setCellRenderer(new ProvisionEmpleadoTableCell(tipoprovisionempleadoConstantesFunciones.resaltarProvisionEmpleadoTipoProvisionEmpleado,this,this.tipoprovisionempleadoConstantesFunciones.activarProvisionEmpleadoTipoProvisionEmpleado));
				tableColumn.setCellEditor(new ProvisionEmpleadoTableCell(tipoprovisionempleadoConstantesFunciones.resaltarProvisionEmpleadoTipoProvisionEmpleado,this,this.tipoprovisionempleadoConstantesFunciones.activarProvisionEmpleadoTipoProvisionEmpleado));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoProvisionEmpleado.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoProvisionEmpleado.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoProvisionEmpleado.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoProvisionEmpleado && this.isPermisoGuardarCambiosTipoProvisionEmpleado) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoProvisionEmpleado.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoprovisionempleadoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoProvisionEmpleado.addColumn(tableColumn);
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
			
			this.jTableDatosTipoProvisionEmpleado.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoProvisionEmpleado && this.isPermisoGuardarCambiosTipoProvisionEmpleado) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoprovisionempleadoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoProvisionEmpleado && this.isPermisoGuardarCambiosTipoProvisionEmpleado) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoProvisionEmpleado.moveColumn(this.jTableDatosTipoProvisionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoProvisionEmpleado.moveColumn(this.jTableDatosTipoProvisionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoprovisionempleadoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoProvisionEmpleado.moveColumn(this.jTableDatosTipoProvisionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoProvisionEmpleado.moveColumn(this.jTableDatosTipoProvisionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoProvisionEmpleado.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoProvisionEmpleado.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoProvisionEmpleado,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoProvisionEmpleado.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoProvisionEmpleado.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoProvisionEmpleado.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoProvisionEmpleado.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoProvisionEmpleado.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoprovisionempleadoLogic.getTipoProvisionEmpleados().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoprovisionempleados.size()-1;
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
		//this.jTableDatosTipoProvisionEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoProvisionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoProvisionEmpleado();
			
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
				
				//this.isEsNuevoTipoProvisionEmpleado=false;
					
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
			
				if(this.tipoprovisionempleadoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoProvisionEmpleado==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoProvisionEmpleado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoProvisionEmpleado.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoprovisionempleado.getsType().equals("DUPLICADO")
				   || this.tipoprovisionempleado.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoProvisionEmpleado=true;
				
				} else {
					this.isEsNuevoTipoProvisionEmpleado=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoprovisionempleado.getId()>=0 && !this.tipoprovisionempleado.getIsNew()) {						
						this.isEsNuevoTipoProvisionEmpleado=false;
						
					} else {
						this.isEsNuevoTipoProvisionEmpleado=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoProvisionEmpleado(esRelaciones);						
				
				this.seleccionarTipoProvisionEmpleado(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoprovisionempleado.getId()<0) {
					this.isEsNuevoTipoProvisionEmpleado=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoProvisionEmpleado(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoProvisionEmpleado(evt,rowIndex);
				}	
				
				if(this.tipoprovisionempleadoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoProvisionEmpleado: " + this.dDif); 
					}
				}								
				
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoProvisionEmpleado(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoprovisionempleado)) {
					if(this.tipoprovisionempleado.getId()>0) {
						this.tipoprovisionempleado.setIsDeleted(true);
						
						this.tipoprovisionempleadosEliminados.add(this.tipoprovisionempleado);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().remove(this.tipoprovisionempleado);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoprovisionempleados.remove(this.tipoprovisionempleado);				
					}
					
					
					((TipoProvisionEmpleadoModel) this.jTableDatosTipoProvisionEmpleado.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProvisionEmpleado(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoProvisionEmpleado(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoProvisionEmpleado) {
			
			if(this.jInternalFrameDetalleFormTipoProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoProvisionEmpleado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoProvisionEmpleado.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoProvisionEmpleado(this.tipoprovisionempleado);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoProvisionEmpleado("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoProvisionEmpleado(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProvisionEmpleado() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoProvisionEmpleado(TipoProvisionEmpleado tipoprovisionempleado) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoProvisionEmpleado(tipoprovisionempleado,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoProvisionEmpleado(TipoProvisionEmpleado tipoprovisionempleado,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoProvisionEmpleado(tipoprovisionempleado);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoProvisionEmpleado(tipoprovisionempleado,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoProvisionEmpleado(tipoprovisionempleado);
	}
	
	public void setVariablesObjetoActualToFormularioTipoProvisionEmpleado(TipoProvisionEmpleado tipoprovisionempleado) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextFieldidTipoProvisionEmpleado.setText(tipoprovisionempleado.getId().toString());
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextFieldcodigoTipoProvisionEmpleado.setText(tipoprovisionempleado.getcodigo());
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextAreanombreTipoProvisionEmpleado.setText(tipoprovisionempleado.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoProvisionEmpleado tipoprovisionempleadoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoprovisionempleadoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoProvisionEmpleado tipoprovisionempleadoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoprovisionempleadoLocal=this.tipoprovisionempleado;
			} else {
				tipoprovisionempleadoLocal=this.tipoprovisionempleadoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoprovisionempleadoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoProvisionEmpleado(tipoprovisionempleadoLocal,true);
					
					if(tipoprovisionempleadoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoprovisionempleadoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoprovisionempleadoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoProvisionEmpleado(TipoProvisionEmpleado tipoprovisionempleado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoProvisionEmpleado(tipoprovisionempleado,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoProvisionEmpleado(tipoprovisionempleado);
	}
	
	public void setVariablesFormularioToObjetoActualTipoProvisionEmpleado(TipoProvisionEmpleado tipoprovisionempleado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoProvisionEmpleado(tipoprovisionempleado,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoProvisionEmpleado(TipoProvisionEmpleado tipoprovisionempleado,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextFieldidTipoProvisionEmpleado.getText()==null || this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextFieldidTipoProvisionEmpleado.getText()=="" || this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextFieldidTipoProvisionEmpleado.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextFieldidTipoProvisionEmpleado.setText("0");
			}

			if(conColumnasBase) {tipoprovisionempleado.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextFieldidTipoProvisionEmpleado.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProvisionEmpleadoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProvisionEmpleado.jLabelIdTipoProvisionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoprovisionempleado.setcodigo(this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextFieldcodigoTipoProvisionEmpleado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProvisionEmpleadoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProvisionEmpleado.jLabelcodigoTipoProvisionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoprovisionempleado.setnombre(this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextAreanombreTipoProvisionEmpleado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProvisionEmpleado.jLabelnombreTipoProvisionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoProvisionEmpleado(TipoProvisionEmpleado tipoprovisionempleadoBean,TipoProvisionEmpleado tipoprovisionempleado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoProvisionEmpleado(TipoProvisionEmpleado tipoprovisionempleadoOrigen,TipoProvisionEmpleado tipoprovisionempleado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoprovisionempleadoOrigen.getId()!=null && !tipoprovisionempleadoOrigen.getId().equals(0L))) {tipoprovisionempleado.setId(tipoprovisionempleadoOrigen.getId());}}
			if(conDefault || (!conDefault && tipoprovisionempleadoOrigen.getcodigo()!=null && !tipoprovisionempleadoOrigen.getcodigo().equals(""))) {tipoprovisionempleado.setcodigo(tipoprovisionempleadoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoprovisionempleadoOrigen.getnombre()!=null && !tipoprovisionempleadoOrigen.getnombre().equals(""))) {tipoprovisionempleado.setnombre(tipoprovisionempleadoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoProvisionEmpleado(TipoProvisionEmpleado tipoprovisionempleado) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextFieldidTipoProvisionEmpleado.setText(tipoprovisionempleado.getId().toString());
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextFieldcodigoTipoProvisionEmpleado.setText(tipoprovisionempleado.getcodigo());
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextAreanombreTipoProvisionEmpleado.setText(tipoprovisionempleado.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoProvisionEmpleado(TipoProvisionEmpleadoBean tipoprovisionempleadoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextFieldidTipoProvisionEmpleado.setText(tipoprovisionempleadoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextFieldcodigoTipoProvisionEmpleado.setText(tipoprovisionempleadoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextAreanombreTipoProvisionEmpleado.setText(tipoprovisionempleadoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoProvisionEmpleado(TipoProvisionEmpleadoParameterReturnGeneral tipoprovisionempleadoReturnGeneral,TipoProvisionEmpleadoBean tipoprovisionempleadoBean,Boolean conDefault) throws Exception { 
		try {
			TipoProvisionEmpleado tipoprovisionempleadoLocal=new TipoProvisionEmpleado();
			
			tipoprovisionempleadoLocal=tipoprovisionempleadoReturnGeneral.getTipoProvisionEmpleado();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoprovisionempleadoLocal.getId()!=null && !tipoprovisionempleadoLocal.getId().equals(0L))) {tipoprovisionempleadoBean.setId(tipoprovisionempleadoLocal.getId());}}
			if(conDefault || (!conDefault && tipoprovisionempleadoLocal.getcodigo()!=null && !tipoprovisionempleadoLocal.getcodigo().equals(""))) {tipoprovisionempleadoBean.setcodigo(tipoprovisionempleadoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoprovisionempleadoLocal.getnombre()!=null && !tipoprovisionempleadoLocal.getnombre().equals(""))) {tipoprovisionempleadoBean.setnombre(tipoprovisionempleadoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoProvisionEmpleadoGenerico(Long idTipoProvisionEmpleadoSeleccionado,JComboBox jComboBoxTipoProvisionEmpleado,List<TipoProvisionEmpleado> tipoprovisionempleadosLocal)throws Exception {
		try {
			TipoProvisionEmpleado  tipoprovisionempleadoTemp=null;

			for(TipoProvisionEmpleado tipoprovisionempleadoAux:tipoprovisionempleadosLocal) {
				if(tipoprovisionempleadoAux.getId()!=null && tipoprovisionempleadoAux.getId().equals(idTipoProvisionEmpleadoSeleccionado)) {
					tipoprovisionempleadoTemp=tipoprovisionempleadoAux;
					break;
				}
			}

			jComboBoxTipoProvisionEmpleado.setSelectedItem(tipoprovisionempleadoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoProvisionEmpleadoGenerico(JComboBox jComboBoxTipoProvisionEmpleado,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoProvisionEmpleado.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoProvisionEmpleado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoProvisionEmpleado.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoProvisionEmpleado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ProvisionEmpleado")) {
			jButtonProvisionEmpleadoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprovisionempleado=(TipoProvisionEmpleado) tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoprovisionempleado =(TipoProvisionEmpleado) tipoprovisionempleados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoProvisionEmpleado tipoprovisionempleadoRow=new TipoProvisionEmpleado();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprovisionempleadoRow=(TipoProvisionEmpleado) tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoprovisionempleadoRow=(TipoProvisionEmpleado) tipoprovisionempleados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonProvisionEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoProvisionEmpleado tipoprovisionempleado) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoProvisionEmpleado==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleadoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprovisionempleado = (TipoProvisionEmpleado)this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoprovisionempleado = (TipoProvisionEmpleado)this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoprovisionempleado!=null) {
						this.tipoprovisionempleado = tipoprovisionempleado;
					} else {
						this.tipoprovisionempleado = new TipoProvisionEmpleado();
					}
				}

				if(this.isTienePermisosProvisionEmpleado && this.permiteMantenimiento(this.tipoprovisionempleado)) {
					ProvisionEmpleadoBeanSwingJInternalFrame provisionempleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFramePopup=new ProvisionEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						provisionempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFramePopup;
					} else {
						provisionempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame;
					}

					List<TipoProvisionEmpleado> tipoprovisionempleados=new ArrayList<TipoProvisionEmpleado>();
					tipoprovisionempleados.add(this.tipoprovisionempleado);
					if(!esRelacionado) {
						//provisionempleadoBeanSwingJInternalFrame.provisionempleadoSessionBean.setConGuardarRelaciones(false);
						//provisionempleadoBeanSwingJInternalFrame.provisionempleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					provisionempleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoProvisionEmpleado.cargarProvisionEmpleadoBeanSwingJInternalFrame(tipoprovisionempleados,this.tipoprovisionempleado,provisionempleadoBeanSwingJInternalFrame,/*conInicializar,*/provisionempleadoBeanSwingJInternalFrame.provisionempleadoSessionBean.getConGuardarRelaciones(),provisionempleadoBeanSwingJInternalFrame.provisionempleadoSessionBean.getEsGuardarRelacionado());
					provisionempleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						provisionempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsProvisionEmpleado("no_relacionado");

						provisionempleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProvisionEmpleadoConstantesFunciones.ITAMANIOFILATABLA + (ProvisionEmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						provisionempleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoProvisionEmpleado=(TitledBorder)this.jScrollPanelDatosTipoProvisionEmpleado.getBorder();
						TitledBorder titledBorderProvisionEmpleado=(TitledBorder)provisionempleadoBeanSwingJInternalFrame.jScrollPanelDatosProvisionEmpleado.getBorder();

						titledBorderProvisionEmpleado.setTitle(titledBorderTipoProvisionEmpleado.getTitle() + " -> Provision Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,provisionempleadoBeanSwingJInternalFrame);
						}

						provisionempleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(provisionempleadoBeanSwingJInternalFrame);

						provisionempleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoprovisionempleadoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Provision Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleadoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleadoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoProvisionEmpleado(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoTipoProvisionEmpleado && this.isPermisoNuevoTipoProvisionEmpleado));			
			this.jButtonDuplicarTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaDuplicarTipoProvisionEmpleado && this.isPermisoDuplicarTipoProvisionEmpleado));			
			this.jButtonCopiarTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaCopiarTipoProvisionEmpleado && this.isPermisoCopiarTipoProvisionEmpleado));
			this.jButtonVerFormTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaVerFormTipoProvisionEmpleado && this.isPermisoVerFormTipoProvisionEmpleado));
			
			this.jButtonAbrirOrderByTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaOrdenTipoProvisionEmpleado && this.isPermisoOrdenTipoProvisionEmpleado));			
			
			this.jButtonNuevoRelacionesTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado && this.isPermisoNuevoTipoProvisionEmpleado));			
			this.jButtonNuevoGuardarCambiosTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoTipoProvisionEmpleado && this.isPermisoNuevoTipoProvisionEmpleado && this.isPermisoGuardarCambiosTipoProvisionEmpleado));
			
			if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) {
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonModificarTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaModificarTipoProvisionEmpleado && this.isPermisoActualizarTipoProvisionEmpleado));	
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonActualizarTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaActualizarTipoProvisionEmpleado && this.isPermisoActualizarTipoProvisionEmpleado));	
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonEliminarTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaEliminarTipoProvisionEmpleado && this.isPermisoEliminarTipoProvisionEmpleado));
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonCancelarTipoProvisionEmpleado.setVisible(this.isVisibilidadCeldaCancelarTipoProvisionEmpleado);							
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonGuardarCambiosTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaGuardarTipoProvisionEmpleado && this.isPermisoGuardarCambiosTipoProvisionEmpleado));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProvisionEmpleado && this.isPermisoGuardarCambiosTipoProvisionEmpleado));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoTipoProvisionEmpleado && this.isPermisoNuevoTipoProvisionEmpleado));						
			this.jButtonDuplicarToolBarTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaDuplicarTipoProvisionEmpleado && this.isPermisoDuplicarTipoProvisionEmpleado));						
			this.jButtonCopiarToolBarTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaCopiarTipoProvisionEmpleado && this.isPermisoCopiarTipoProvisionEmpleado));			
			this.jButtonVerFormToolBarTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaVerFormTipoProvisionEmpleado && this.isPermisoVerFormTipoProvisionEmpleado));			
			this.jButtonAbrirOrderByToolBarTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaOrdenTipoProvisionEmpleado && this.isPermisoOrdenTipoProvisionEmpleado));
			this.jButtonNuevoRelacionesToolBarTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado && this.isPermisoNuevoTipoProvisionEmpleado));			
			this.jButtonNuevoGuardarCambiosToolBarTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoTipoProvisionEmpleado && this.isPermisoNuevoTipoProvisionEmpleado && this.isPermisoGuardarCambiosTipoProvisionEmpleado));			
			
			if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) {
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonModificarToolBarTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaModificarTipoProvisionEmpleado && this.isPermisoActualizarTipoProvisionEmpleado));	
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonActualizarToolBarTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaActualizarTipoProvisionEmpleado  && this.isPermisoActualizarTipoProvisionEmpleado));	
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonEliminarToolBarTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaEliminarTipoProvisionEmpleado && this.isPermisoEliminarTipoProvisionEmpleado));
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonCancelarToolBarTipoProvisionEmpleado.setVisible(this.isVisibilidadCeldaCancelarTipoProvisionEmpleado);				
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonGuardarCambiosToolBarTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaGuardarTipoProvisionEmpleado && this.isPermisoGuardarCambiosTipoProvisionEmpleado));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProvisionEmpleado && this.isPermisoGuardarCambiosTipoProvisionEmpleado));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoTipoProvisionEmpleado && this.isPermisoNuevoTipoProvisionEmpleado));			
			this.jMenuItemDuplicarTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaDuplicarTipoProvisionEmpleado && this.isPermisoDuplicarTipoProvisionEmpleado));			
			this.jMenuItemCopiarTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaCopiarTipoProvisionEmpleado && this.isPermisoCopiarTipoProvisionEmpleado));			
			this.jMenuItemVerFormTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaVerFormTipoProvisionEmpleado && this.isPermisoVerFormTipoProvisionEmpleado));			
			this.jMenuItemAbrirOrderByTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaOrdenTipoProvisionEmpleado && this.isPermisoOrdenTipoProvisionEmpleado));			
			//this.jMenuItemMostrarOcultarTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaOrdenTipoProvisionEmpleado && this.isPermisoOrdenTipoProvisionEmpleado));
			this.jMenuItemDetalleAbrirOrderByTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaOrdenTipoProvisionEmpleado && this.isPermisoOrdenTipoProvisionEmpleado));			
			//this.jMenuItemDetalleMostrarOcultarTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaOrdenTipoProvisionEmpleado && this.isPermisoOrdenTipoProvisionEmpleado));			
			this.jMenuItemNuevoRelacionesTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado && this.isPermisoNuevoTipoProvisionEmpleado));			
			this.jMenuItemNuevoGuardarCambiosTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaNuevoTipoProvisionEmpleado && this.isPermisoNuevoTipoProvisionEmpleado && this.isPermisoGuardarCambiosTipoProvisionEmpleado));									
			
			if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) {
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jMenuItemModificarTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaModificarTipoProvisionEmpleado && this.isPermisoActualizarTipoProvisionEmpleado));	
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jMenuItemActualizarTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaActualizarTipoProvisionEmpleado && this.isPermisoActualizarTipoProvisionEmpleado));	
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jMenuItemEliminarTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaEliminarTipoProvisionEmpleado && this.isPermisoEliminarTipoProvisionEmpleado));
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jMenuItemCancelarTipoProvisionEmpleado.setVisible(this.isVisibilidadCeldaCancelarTipoProvisionEmpleado);				
			}
			
			this.jMenuItemGuardarCambiosTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaGuardarTipoProvisionEmpleado && this.isPermisoGuardarCambiosTipoProvisionEmpleado));						
			this.jMenuItemGuardarCambiosTablaTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProvisionEmpleado && this.isPermisoGuardarCambiosTipoProvisionEmpleado));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoProvisionEmpleado=this.jButtonNuevoTipoProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaDuplicarTipoProvisionEmpleado=this.jButtonDuplicarTipoProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaCopiarTipoProvisionEmpleado=this.jButtonCopiarTipoProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaVerFormTipoProvisionEmpleado=this.jButtonVerFormTipoProvisionEmpleado.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoProvisionEmpleado=this.jButtonAbrirOrderByTipoProvisionEmpleado.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado=this.jButtonNuevoRelacionesTipoProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaModificarTipoProvisionEmpleado=this.jButtonModificarTipoProvisionEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) {
			this.isVisibilidadCeldaActualizarTipoProvisionEmpleado=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonActualizarTipoProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarTipoProvisionEmpleado=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonEliminarTipoProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarTipoProvisionEmpleado=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonCancelarTipoProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarTipoProvisionEmpleado=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonGuardarCambiosTipoProvisionEmpleado.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoProvisionEmpleado=this.jButtonGuardarCambiosTablaTipoProvisionEmpleado.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoProvisionEmpleado=this.jButtonNuevoToolBarTipoProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado=this.jButtonNuevoRelacionesToolBarTipoProvisionEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) {
			this.isVisibilidadCeldaModificarTipoProvisionEmpleado=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonModificarToolBarTipoProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaActualizarTipoProvisionEmpleado=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonActualizarToolBarTipoProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarTipoProvisionEmpleado=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonEliminarToolBarTipoProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarTipoProvisionEmpleado=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonCancelarToolBarTipoProvisionEmpleado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoProvisionEmpleado=this.jButtonGuardarCambiosToolBarTipoProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoProvisionEmpleado=this.jButtonGuardarCambiosTablaToolBarTipoProvisionEmpleado.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoProvisionEmpleado=this.jMenuItemNuevoTipoProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado=this.jMenuItemNuevoRelacionesTipoProvisionEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) {
			this.isVisibilidadCeldaModificarTipoProvisionEmpleado=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jMenuItemModificarTipoProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaActualizarTipoProvisionEmpleado=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jMenuItemActualizarTipoProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarTipoProvisionEmpleado=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jMenuItemEliminarTipoProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarTipoProvisionEmpleado=this.jInternalFrameDetalleFormTipoProvisionEmpleado.jMenuItemCancelarTipoProvisionEmpleado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoProvisionEmpleado=this.jMenuItemGuardarCambiosTipoProvisionEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoProvisionEmpleado=this.jMenuItemGuardarCambiosTablaTipoProvisionEmpleado.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoProvisionEmpleado(Boolean esInicializar) {
		if(TipoProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoprovisionempleadoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoProvisionEmpleado();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoProvisionEmpleado(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoProvisionEmpleado() {
		this.jButtonNuevoTipoProvisionEmpleado.setVisible(this.isPermisoNuevoTipoProvisionEmpleado);			
		this.jButtonDuplicarTipoProvisionEmpleado.setVisible(this.isPermisoDuplicarTipoProvisionEmpleado);			
		this.jButtonCopiarTipoProvisionEmpleado.setVisible(this.isPermisoCopiarTipoProvisionEmpleado);			
		this.jButtonVerFormTipoProvisionEmpleado.setVisible(this.isPermisoVerFormTipoProvisionEmpleado);			
		
		this.jButtonAbrirOrderByTipoProvisionEmpleado.setVisible(this.isPermisoOrdenTipoProvisionEmpleado);					
		
		this.jButtonNuevoRelacionesTipoProvisionEmpleado.setVisible(this.isPermisoNuevoTipoProvisionEmpleado);			
		
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonModificarTipoProvisionEmpleado.setVisible(this.isPermisoActualizarTipoProvisionEmpleado);	
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonActualizarTipoProvisionEmpleado.setVisible(this.isPermisoActualizarTipoProvisionEmpleado);	
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonEliminarTipoProvisionEmpleado.setVisible(this.isPermisoEliminarTipoProvisionEmpleado);
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonCancelarTipoProvisionEmpleado.setVisible(this.isVisibilidadCeldaCancelarTipoProvisionEmpleado);						
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonGuardarCambiosTipoProvisionEmpleado.setVisible(this.isPermisoGuardarCambiosTipoProvisionEmpleado);							
		}
		
		this.jButtonGuardarCambiosTablaTipoProvisionEmpleado.setVisible(this.isPermisoActualizarTipoProvisionEmpleado);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoProvisionEmpleado() {
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonModificarTipoProvisionEmpleado.setVisible(this.isPermisoActualizarTipoProvisionEmpleado);	
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonActualizarTipoProvisionEmpleado.setVisible(this.isPermisoActualizarTipoProvisionEmpleado);	
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonEliminarTipoProvisionEmpleado.setVisible(this.isPermisoEliminarTipoProvisionEmpleado);
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonCancelarTipoProvisionEmpleado.setVisible(this.isVisibilidadCeldaCancelarTipoProvisionEmpleado);							
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonGuardarCambiosTipoProvisionEmpleado.setVisible((this.isVisibilidadCeldaGuardarTipoProvisionEmpleado && this.isPermisoGuardarCambiosTipoProvisionEmpleado));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoProvisionEmpleado() {
		if(TipoProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoProvisionEmpleado();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoProvisionEmpleado() {
	}
	
	public void jTableDatosTipoProvisionEmpleadoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoProvisionEmpleado(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProvisionEmpleado(this.gettipoprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProvisionEmpleado(this.tipoprovisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprovisionempleado==null) {
						this.tipoprovisionempleado = new TipoProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualTipoProvisionEmpleado(this.tipoprovisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProvisionEmpleado(this.tipoprovisionempleado);
				}

				if(this.tipoprovisionempleado.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoprovisionempleado.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProvisionEmpleado(this.gettipoprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProvisionEmpleado(this.tipoprovisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprovisionempleado==null) {
						this.tipoprovisionempleado = new TipoProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualTipoProvisionEmpleado(this.tipoprovisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProvisionEmpleado(this.tipoprovisionempleado);
				}

				if(this.tipoprovisionempleado.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoprovisionempleado.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoProvisionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProvisionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProvisionEmpleado(this.gettipoprovisionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProvisionEmpleado(this.tipoprovisionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprovisionempleado==null) {
						this.tipoprovisionempleado = new TipoProvisionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualTipoProvisionEmpleado(this.tipoprovisionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProvisionEmpleado(this.tipoprovisionempleado);
				}

				if(this.tipoprovisionempleado.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoprovisionempleado.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProvisionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoProvisionEmpleado() {
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) {
		

		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) {
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.dispose();
			this.jInternalFrameDetalleFormTipoProvisionEmpleado=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoProvisionEmpleado!=null) {
			this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.dispose();
			this.jInternalFrameReporteDinamicoTipoProvisionEmpleado=null;
		}
		
		if(this.jInternalFrameImportacionTipoProvisionEmpleado!=null) {
			this.jInternalFrameImportacionTipoProvisionEmpleado.setVisible(false);	    			
			this.jInternalFrameImportacionTipoProvisionEmpleado.dispose();
			this.jInternalFrameImportacionTipoProvisionEmpleado=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoProvisionEmpleado();
			
			TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoProvisionEmpleado")) {
				jButtonNuevoTipoProvisionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoProvisionEmpleado")) {
				jButtonDuplicarTipoProvisionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoProvisionEmpleado")) {
				jButtonCopiarTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoProvisionEmpleado")) {
				jButtonVerFormTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoProvisionEmpleado")) {
				jButtonNuevoTipoProvisionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoProvisionEmpleado")) {
				jButtonDuplicarTipoProvisionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoProvisionEmpleado")) {
				jButtonNuevoTipoProvisionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoProvisionEmpleado")) {
				jButtonDuplicarTipoProvisionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoProvisionEmpleado")) {
				jButtonNuevoTipoProvisionEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoProvisionEmpleado")) {
				jButtonNuevoTipoProvisionEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoProvisionEmpleado")) {
				jButtonNuevoTipoProvisionEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoProvisionEmpleado")) {
				jButtonModificarTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoProvisionEmpleado")) {
				jButtonModificarTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoProvisionEmpleado")) {
				jButtonModificarTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoProvisionEmpleado")) {
				jButtonActualizarTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoProvisionEmpleado")) {
				jButtonActualizarTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoProvisionEmpleado")) {
				jButtonActualizarTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoProvisionEmpleado")) {
				jButtonEliminarTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoProvisionEmpleado")) {
				jButtonEliminarTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoProvisionEmpleado")) {
				jButtonEliminarTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoProvisionEmpleado")) {
				jButtonCancelarTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoProvisionEmpleado")) {
				jButtonCancelarTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoProvisionEmpleado")) {
				jButtonCancelarTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoProvisionEmpleado")) {
				jButtonCerrarTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoProvisionEmpleado")) {
				jButtonCerrarTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoProvisionEmpleado")) {
				jButtonCerrarTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoProvisionEmpleado")) {
				jButtonMostrarOcultarTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoProvisionEmpleado")) {
				jButtonCancelarTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoProvisionEmpleado")) {
				jButtonGuardarCambiosTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoProvisionEmpleado")) {
				jButtonGuardarCambiosTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoProvisionEmpleado")) {
				jButtonCopiarTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoProvisionEmpleado")) {
				jButtonVerFormTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoProvisionEmpleado")) {
				jButtonGuardarCambiosTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoProvisionEmpleado")) {
				jButtonCopiarTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoProvisionEmpleado")) {
				jButtonVerFormTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoProvisionEmpleado")) {
				jButtonGuardarCambiosTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoProvisionEmpleado")) {
				jButtonGuardarCambiosTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoProvisionEmpleado")) {
				jButtonGuardarCambiosTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoProvisionEmpleado")) {
				jButtonRecargarInformacionTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoProvisionEmpleado")) {
				jButtonRecargarInformacionTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoProvisionEmpleado")) {
				jButtonRecargarInformacionTipoProvisionEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoProvisionEmpleado")) {
				jButtonAnterioresTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoProvisionEmpleado")) {
				jButtonAnterioresTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoProvisionEmpleado")) {
				jButtonAnterioresTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoProvisionEmpleado")) {
				jButtonSiguientesTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoProvisionEmpleado")) {
				jButtonSiguientesTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoProvisionEmpleado")) {
				jButtonSiguientesTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoProvisionEmpleado") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoProvisionEmpleado")) {
				jButtonAbrirOrderByTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoProvisionEmpleado") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoProvisionEmpleado")) {
				jButtonMostrarOcultarTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoProvisionEmpleado")) {
				jButtonNuevoGuardarCambiosTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoProvisionEmpleado")) {
				jButtonNuevoGuardarCambiosTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoProvisionEmpleado")) {
				jButtonNuevoGuardarCambiosTipoProvisionEmpleadoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoProvisionEmpleado")) {
				jButtonCerrarReporteDinamicoTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoProvisionEmpleado")) {
				jButtonGenerarReporteDinamicoTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoProvisionEmpleado")) {
				
				jButtonGenerarExcelReporteDinamicoTipoProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoProvisionEmpleado")) {
				jButtonCerrarImportacionTipoProvisionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoProvisionEmpleado")) {
				
				jButtonGenerarImportacionTipoProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoProvisionEmpleado")) {
				
				jButtonAbrirImportacionTipoProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoProvisionEmpleado")) {
				jComboBoxTiposAccionesTipoProvisionEmpleadoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoProvisionEmpleado")) {
				jComboBoxTiposRelacionesTipoProvisionEmpleadoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoProvisionEmpleado")) {
				jComboBoxTiposAccionesTipoProvisionEmpleadoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoProvisionEmpleado")) {
				
				jComboBoxTiposSeleccionarTipoProvisionEmpleadoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoProvisionEmpleado")) {
				jTextFieldValorCampoGeneralTipoProvisionEmpleadoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoProvisionEmpleado")) {
				jButtonAbrirOrderByTipoProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoProvisionEmpleado")) {
				jButtonAbrirOrderByTipoProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoProvisionEmpleado")) {
				jButtonCerrarOrderByTipoProvisionEmpleadoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoProvisionEmpleadoBusqueda")) {
				this.jButtonidTipoProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoProvisionEmpleadoBusqueda")) {
				this.jButtoncodigoTipoProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoProvisionEmpleadoBusqueda")) {
				this.jButtonnombreTipoProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoProvisionEmpleado();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProvisionEmpleadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprovisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprovisionempleado);
				
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
				
				


				
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProvisionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProvisionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoProvisionEmpleado tipoprovisionempleadoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoprovisionempleadoLocal=this.tipoprovisionempleado;
			} else {
				tipoprovisionempleadoLocal=this.tipoprovisionempleadoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprovisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprovisionempleado);
				
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
							
				
				


				
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProvisionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProvisionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProvisionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProvisionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleadoAnterior =(TipoProvisionEmpleado) this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprovisionempleadoAnterior =(TipoProvisionEmpleado) this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
			
			TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
			
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
			
			


			
			TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProvisionEmpleadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprovisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprovisionempleado);
				
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
								
						
				


				
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProvisionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProvisionEmpleado.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprovisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprovisionempleado);
				
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
								
				
				


				
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProvisionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProvisionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProvisionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProvisionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleadoAnterior =(TipoProvisionEmpleado) this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprovisionempleadoAnterior =(TipoProvisionEmpleado) this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprovisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprovisionempleado);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProvisionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProvisionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleadoAnterior =(TipoProvisionEmpleado) this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprovisionempleadoAnterior =(TipoProvisionEmpleado) this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProvisionEmpleadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprovisionempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprovisionempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprovisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprovisionempleado);
				
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
							
				
				


				
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProvisionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProvisionEmpleado.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProvisionEmpleadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoProvisionEmpleado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprovisionempleadoAnterior =(TipoProvisionEmpleado) this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoprovisionempleadoAnterior =(TipoProvisionEmpleado) this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
			
			TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
			
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
			
			


			
			TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProvisionEmpleadoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprovisionempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprovisionempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprovisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprovisionempleado);
				
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
								
				
				


				
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProvisionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProvisionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProvisionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProvisionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleadoAnterior =(TipoProvisionEmpleado) this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprovisionempleadoAnterior =(TipoProvisionEmpleado) this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProvisionEmpleadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprovisionempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprovisionempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProvisionEmpleadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprovisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprovisionempleado);
				
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoProvisionEmpleado")) {
					jCheckBoxSeleccionarTodosTipoProvisionEmpleadoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoProvisionEmpleado")) {
					jCheckBoxSeleccionadosTipoProvisionEmpleadoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoProvisionEmpleado")) {
					
				}
				
				


				
				
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProvisionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProvisionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprovisionempleado);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoprovisionempleado);
				
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
												
				
				


				
				
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProvisionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProvisionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProvisionEmpleadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoProvisionEmpleado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprovisionempleadoAnterior =(TipoProvisionEmpleado) this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoprovisionempleadoAnterior =(TipoProvisionEmpleado) this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProvisionEmpleadoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprovisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprovisionempleado);
				
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
				
				
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
			
			TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
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
			
			


			
			TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProvisionEmpleadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprovisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprovisionempleado);
				
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProvisionEmpleado.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProvisionEmpleado.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprovisionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprovisionempleado);
				
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
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
				
				


				
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProvisionEmpleado.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProvisionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProvisionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProvisionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprovisionempleadoAnterior =(TipoProvisionEmpleado) this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprovisionempleadoAnterior =(TipoProvisionEmpleado) this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoProvisionEmpleado")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoProvisionEmpleadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoProvisionEmpleado.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoprovisionempleado =(TipoProvisionEmpleado) this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoprovisionempleado);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoProvisionEmpleado")) {
				
				}
				
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoProvisionEmpleado")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoProvisionEmpleado.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoProvisionEmpleado")) {
			
			}
			
			TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoProvisionEmpleado();
			
			TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoProvisionEmpleado")) {
				jButtonNuevoTipoProvisionEmpleadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoProvisionEmpleado")) {
				jButtonDuplicarTipoProvisionEmpleadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoProvisionEmpleado")) {
				jButtonCopiarTipoProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoProvisionEmpleado")) {
				jButtonVerFormTipoProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoProvisionEmpleado")) {
				jButtonNuevoTipoProvisionEmpleadoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoProvisionEmpleado")) {
				jButtonModificarTipoProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoProvisionEmpleado")) {
				jButtonActualizarTipoProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoProvisionEmpleado")) {
				jButtonEliminarTipoProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoProvisionEmpleado")) {
				jButtonGuardarCambiosTipoProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoProvisionEmpleado")) {
				jButtonCancelarTipoProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoProvisionEmpleado")) {
				jButtonCerrarTipoProvisionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoProvisionEmpleado")) {
				jButtonGuardarCambiosTipoProvisionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoProvisionEmpleado")) {
				jButtonNuevoGuardarCambiosTipoProvisionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoProvisionEmpleado")) {
				jButtonAbrirOrderByTipoProvisionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoProvisionEmpleado")) {
				jButtonRecargarInformacionTipoProvisionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoProvisionEmpleado")) {
				jButtonAnterioresTipoProvisionEmpleadoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoProvisionEmpleado")) {
				jButtonSiguientesTipoProvisionEmpleadoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoProvisionEmpleadoBusqueda")) {
				this.jButtonidTipoProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoProvisionEmpleadoBusqueda")) {
				this.jButtoncodigoTipoProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoProvisionEmpleadoBusqueda")) {
				this.jButtonnombreTipoProvisionEmpleadoBusquedaActionPerformed(evt);
			}
			
			TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoProvisionEmpleado();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoProvisionEmpleado")) {
				closingInternalFrameTipoProvisionEmpleado();
				
			} else if(sTipo.equals("jButtonCancelarTipoProvisionEmpleado")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoProvisionEmpleado = (JInternalFrameBase)evt.getSource();
	            	
	            TipoProvisionEmpleadoBeanSwingJInternalFrame jInternalFrameParent=(TipoProvisionEmpleadoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoProvisionEmpleado.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoProvisionEmpleadoActionPerformed(null);
			}
			
			TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoprovisionempleado,new Object(),this.tipoprovisionempleadoParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoProvisionEmpleado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoProvisionEmpleado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoProvisionEmpleado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoprovisionempleado)) {
			if(!esControlTabla) {
				if(TipoProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoProvisionEmpleado(this.tipoprovisionempleado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProvisionEmpleado(this.tipoprovisionempleado);			
				}
				
				if(this.tipoprovisionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoProvisionEmpleado(this.tipoprovisionempleado,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoprovisionempleadoReturnGeneral=tipoprovisionempleadoLogic.procesarEventosTipoProvisionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados(),this.tipoprovisionempleado,this.tipoprovisionempleadoParameterGeneral,this.isEsNuevoTipoProvisionEmpleado,classes);//this.tipoprovisionempleadoLogic.getTipoProvisionEmpleado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoProvisionEmpleado(this.tipoprovisionempleadoReturnGeneral,this.tipoprovisionempleadoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoprovisionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoProvisionEmpleado(classes,this.tipoprovisionempleadoReturnGeneral,this.tipoprovisionempleadoBean,false);
					}
						
					if(this.tipoprovisionempleadoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoProvisionEmpleado(this.tipoprovisionempleadoReturnGeneral.getTipoProvisionEmpleado());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoProvisionEmpleado(this.tipoprovisionempleadoReturnGeneral.getTipoProvisionEmpleado());	
					}
						
					if(this.tipoprovisionempleadoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoProvisionEmpleado(this.tipoprovisionempleadoReturnGeneral.getTipoProvisionEmpleado(),classes);//this.tipoprovisionempleadoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoProvisionEmpleado(this.tipoprovisionempleado,classes);//this.tipoprovisionempleadoBean);									
				}
			
				if(TipoProvisionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoProvisionEmpleado(this.tipoprovisionempleado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProvisionEmpleado(this.tipoprovisionempleado);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoprovisionempleadoAnterior!=null) {
						this.tipoprovisionempleado=this.tipoprovisionempleadoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoprovisionempleadoReturnGeneral=tipoprovisionempleadoLogic.procesarEventosTipoProvisionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados(),this.tipoprovisionempleado,this.tipoprovisionempleadoParameterGeneral,this.isEsNuevoTipoProvisionEmpleado,classes);//this.tipoprovisionempleadoLogic.getTipoProvisionEmpleado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoprovisionempleadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoprovisionempleadoReturnGeneral.getTipoProvisionEmpleado(),tipoprovisionempleadoLogic.getTipoProvisionEmpleados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoprovisionempleadoReturnGeneral.getTipoProvisionEmpleado(),this.tipoprovisionempleados);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoProvisionEmpleado.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoProvisionEmpleado.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoProvisionEmpleado();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoProvisionEmpleado() throws Exception {
		
		TipoProvisionEmpleadoModel tipoprovisionempleadoModel=(TipoProvisionEmpleadoModel)this.jTableDatosTipoProvisionEmpleado.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprovisionempleadoModel.tipoprovisionempleados=this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoprovisionempleadoModel.tipoprovisionempleados=this.tipoprovisionempleados;
		}
		
		
		((TipoProvisionEmpleadoModel) this.jTableDatosTipoProvisionEmpleado.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoProvisionEmpleado() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoprovisionempleadoAnterior(),this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoprovisionempleadoAnterior(),this.tipoprovisionempleados);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoProvisionEmpleado();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoProvisionEmpleado(TipoProvisionEmpleado tipoprovisionempleado,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ProvisionEmpleado.class)) {
					this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.setProvisionEmpleados(tipoprovisionempleado.getProvisionEmpleados());
					this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProvisionEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
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
										
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprovisionempleado,new Object(),generalEntityParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoprovisionempleadoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoProvisionEmpleadoConstantesFunciones.getClassesRelationshipsOfTipoProvisionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoProvisionEmpleadoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoProvisionEmpleado(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoProvisionEmpleado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprovisionempleado,new Object(),generalEntityParameterGeneral,this.tipoprovisionempleadoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoProvisionEmpleado(TipoProvisionEmpleadoBean tipoprovisionempleadoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ProvisionEmpleado.class)) {
					this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.setProvisionEmpleados(tipoprovisionempleado.getProvisionEmpleados());
					this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProvisionEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoProvisionEmpleado(ArrayList<Classe> classes,TipoProvisionEmpleadoReturnGeneral tipoprovisionempleadoReturnGeneral,TipoProvisionEmpleadoBean tipoprovisionempleadoBean,Boolean conDefault) throws Exception {
		
			this.tipoprovisionempleadoBean.setProvisionEmpleados(tipoprovisionempleadoReturnGeneral.getTipoProvisionEmpleado().getProvisionEmpleados());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoProvisionEmpleado(TipoProvisionEmpleado tipoprovisionempleado,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ProvisionEmpleado.class)) {
					tipoprovisionempleado.setProvisionEmpleados(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoBeanSwingJInternalFrame.provisionempleadoLogic.getProvisionEmpleados());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoprovisionempleado)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoProvisionEmpleado = new TipoProvisionEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.tipoprovisionempleadoSessionBean.getConGuardarRelaciones(),this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoProvisionEmpleado);
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.setVisible(false);
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.tipoprovisionempleadoLogic=this.tipoprovisionempleadoLogic;
		
		this.cargarCombosFrameForeignKeyTipoProvisionEmpleado("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoProvisionEmpleado();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoProvisionEmpleado();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoProvisionEmpleado("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoProvisionEmpleado();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoProvisionEmpleado"));
		
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonModificarTipoProvisionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarTipoProvisionEmpleado"));

		
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonModificarToolBarTipoProvisionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoProvisionEmpleado"));
					
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jMenuItemModificarTipoProvisionEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoProvisionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonActualizarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"ActualizarTipoProvisionEmpleado"));
		
		
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonActualizarToolBarTipoProvisionEmpleado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoProvisionEmpleado"));
						
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jMenuItemActualizarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoProvisionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonEliminarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarTipoProvisionEmpleado"));
		
		
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonEliminarToolBarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoProvisionEmpleado"));
								
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jMenuItemEliminarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoProvisionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonCancelarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarTipoProvisionEmpleado"));
		
		
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonCancelarToolBarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoProvisionEmpleado"));
					
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jMenuItemCancelarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoProvisionEmpleado"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jMenuItemDetalleCerrarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoProvisionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonGuardarCambiosToolBarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProvisionEmpleado"));
		
		
		
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonGuardarCambiosToolBarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProvisionEmpleado"));
		
		
		
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoProvisionEmpleado"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonidTipoProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtoncodigoTipoProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonnombreTipoProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProvisionEmpleadoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTabbedPaneRelacionesTipoProvisionEmpleado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoProvisionEmpleado"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoProvisionEmpleado"));
		
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoProvisionEmpleado"));
		}
		
		this.jTableDatosTipoProvisionEmpleado.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoProvisionEmpleado"));
		
		this.jTableDatosTipoProvisionEmpleado.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoProvisionEmpleado"));
		
		this.jButtonNuevoTipoProvisionEmpleado.addActionListener(new ButtonActionListener(this,"NuevoTipoProvisionEmpleado"));
		
		this.jButtonDuplicarTipoProvisionEmpleado.addActionListener(new ButtonActionListener(this,"DuplicarTipoProvisionEmpleado"));
		
		this.jButtonCopiarTipoProvisionEmpleado.addActionListener(new ButtonActionListener(this,"CopiarTipoProvisionEmpleado"));
		
		this.jButtonVerFormTipoProvisionEmpleado.addActionListener(new ButtonActionListener(this,"VerFormTipoProvisionEmpleado"));
		
		
		this.jButtonNuevoToolBarTipoProvisionEmpleado.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoProvisionEmpleado"));
			
		this.jButtonDuplicarToolBarTipoProvisionEmpleado.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoProvisionEmpleado"));
			
		this.jMenuItemNuevoTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoProvisionEmpleado"));
			
		this.jMenuItemDuplicarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoProvisionEmpleado"));		
		
		
		this.jButtonNuevoRelacionesTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoProvisionEmpleado"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoProvisionEmpleado.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoProvisionEmpleado"));
			
		this.jMenuItemNuevoRelacionesTipoProvisionEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoProvisionEmpleado"));		
		
		
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonModificarTipoProvisionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarTipoProvisionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonModificarToolBarTipoProvisionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoProvisionEmpleado"));
			
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jMenuItemModificarTipoProvisionEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoProvisionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonActualizarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"ActualizarTipoProvisionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonActualizarToolBarTipoProvisionEmpleado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoProvisionEmpleado"));
				
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jMenuItemActualizarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoProvisionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonEliminarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarTipoProvisionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonEliminarToolBarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoProvisionEmpleado"));
						
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jMenuItemEliminarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoProvisionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonCancelarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarTipoProvisionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonCancelarToolBarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoProvisionEmpleado"));
			
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jMenuItemCancelarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoProvisionEmpleado"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoProvisionEmpleado"));		
		
		
		this.jButtonCerrarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"CerrarTipoProvisionEmpleado"));
		
		
		this.jButtonCerrarToolBarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoProvisionEmpleado"));
			
		this.jMenuItemCerrarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoProvisionEmpleado"));
			
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jMenuItemDetalleCerrarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoProvisionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonGuardarCambiosTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoProvisionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonGuardarCambiosToolBarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProvisionEmpleado"));
		}
		
		this.jButtonCopiarToolBarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoProvisionEmpleado"));
			
		this.jButtonVerFormToolBarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoProvisionEmpleado"));
		
		this.jMenuItemGuardarCambiosTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoProvisionEmpleado"));
			
		this.jMenuItemCopiarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoProvisionEmpleado"));		
		
		this.jMenuItemVerFormTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoProvisionEmpleado"));		
		
		
		this.jButtonGuardarCambiosTablaTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoProvisionEmpleado"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoProvisionEmpleado"));
			
		this.jMenuItemGuardarCambiosTablaTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoProvisionEmpleado"));		
		
		
		
		this.jButtonRecargarInformacionTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoProvisionEmpleado"));
					
		this.jButtonRecargarInformacionToolBarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoProvisionEmpleado"));
		
		this.jMenuItemRecargarInformacionTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoProvisionEmpleado"));		
		
		
		
		this.jButtonAnterioresTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"AnterioresTipoProvisionEmpleado"));
		
		
		this.jButtonAnterioresToolBarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoProvisionEmpleado"));
		
		this.jMenuItemAnterioresTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoProvisionEmpleado"));		
		
		
		this.jButtonSiguientesTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"SiguientesTipoProvisionEmpleado"));
		
		
		this.jButtonSiguientesToolBarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoProvisionEmpleado"));
			
		this.jMenuItemSiguientesTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoProvisionEmpleado"));
			
		this.jMenuItemAbrirOrderByTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoProvisionEmpleado"));
			
		this.jMenuItemMostrarOcultarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoProvisionEmpleado"));
			
		this.jMenuItemDetalleAbrirOrderByTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoProvisionEmpleado"));
			
		this.jMenuItemDetalleMostarOcultarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoProvisionEmpleado"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoProvisionEmpleado"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoProvisionEmpleado"));
			
		this.jMenuItemNuevoGuardarCambiosTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoProvisionEmpleado"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoProvisionEmpleado.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoProvisionEmpleado"));

		this.jCheckBoxSeleccionadosTipoProvisionEmpleado.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoProvisionEmpleado"));
		
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoProvisionEmpleado"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoProvisionEmpleado"));
			
		this.jComboBoxTiposAccionesTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoProvisionEmpleado"));
					
		this.jComboBoxTiposSeleccionarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoProvisionEmpleado"));
			
		this.jTextFieldValorCampoGeneralTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoProvisionEmpleado"));		
		
		
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonidTipoProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtoncodigoTipoProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonnombreTipoProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProvisionEmpleadoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoProvisionEmpleado!=null) {
				this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProvisionEmpleado"));
				this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProvisionEmpleado"));
				this.jInternalFrameReporteDinamicoTipoProvisionEmpleado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProvisionEmpleado"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProvisionEmpleado"));				
			//this.jButtonGenerarReporteDinamicoTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProvisionEmpleado"));
			//this.jButtonGenerarExcelReporteDinamicoTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProvisionEmpleado"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoProvisionEmpleado!=null) {
				this.jInternalFrameImportacionTipoProvisionEmpleado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoProvisionEmpleado"));
				this.jInternalFrameImportacionTipoProvisionEmpleado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoProvisionEmpleado"));
				this.jInternalFrameImportacionTipoProvisionEmpleado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoProvisionEmpleado"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoProvisionEmpleado"));
			
			this.jButtonAbrirOrderByToolBarTipoProvisionEmpleado.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoProvisionEmpleado"));			
			
			if(this.jInternalFrameOrderByTipoProvisionEmpleado!=null) {
				this.jInternalFrameOrderByTipoProvisionEmpleado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoProvisionEmpleado"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTabbedPaneRelacionesTipoProvisionEmpleado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoProvisionEmpleado"));
		
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
            		closingInternalFrameTipoProvisionEmpleado();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoProvisionEmpleado = (JInternalFrameBase)event.getSource();
	            	
	            TipoProvisionEmpleadoBeanSwingJInternalFrame jInternalFrameParent=(TipoProvisionEmpleadoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoProvisionEmpleado.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoProvisionEmpleadoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoProvisionEmpleado.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoProvisionEmpleadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoProvisionEmpleado.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoProvisionEmpleado.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProvisionEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProvisionEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProvisionEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoProvisionEmpleado";
		inputMap = this.jButtonNuevoTipoProvisionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoProvisionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoProvisionEmpleadoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProvisionEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProvisionEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProvisionEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoProvisionEmpleado";
		inputMap = this.jButtonNuevoRelacionesTipoProvisionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoProvisionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoProvisionEmpleadoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoProvisionEmpleado";
		inputMap = this.jButtonModificarTipoProvisionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoProvisionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoProvisionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoProvisionEmpleado";
		inputMap = this.jButtonActualizarTipoProvisionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoProvisionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoProvisionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoProvisionEmpleado";
		inputMap = this.jButtonEliminarTipoProvisionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoProvisionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoProvisionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoProvisionEmpleado";
		inputMap = this.jButtonCancelarTipoProvisionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoProvisionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoProvisionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoProvisionEmpleado";
		inputMap = this.jButtonCerrarTipoProvisionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoProvisionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoProvisionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonGuardarCambiosTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoProvisionEmpleado";
		inputMap = this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonGuardarCambiosTipoProvisionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonGuardarCambiosTipoProvisionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoProvisionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoProvisionEmpleado.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoProvisionEmpleadoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoProvisionEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoProvisionEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoProvisionEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoProvisionEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoProvisionEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoProvisionEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonidTipoProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtoncodigoTipoProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoProvisionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jButtonnombreTipoProvisionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProvisionEmpleadoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoProvisionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoProvisionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoProvisionEmpleadoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoProvisionEmpleado.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoProvisionEmpleado(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoProvisionEmpleado tipoprovisionempleadoAux:this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados()) {
					tipoprovisionempleadoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProvisionEmpleado tipoprovisionempleadoAux:tipoprovisionempleados) {
					tipoprovisionempleadoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoProvisionEmpleadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoProvisionEmpleado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoProvisionEmpleado tipoprovisionempleadoAux:this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados()) {
						tipoprovisionempleadoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProvisionEmpleado tipoprovisionempleadoAux:tipoprovisionempleados) {
						tipoprovisionempleadoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoProvisionEmpleado tipoprovisionempleadoAux:this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProvisionEmpleado tipoprovisionempleadoAux:tipoprovisionempleados) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoProvisionEmpleado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoProvisionEmpleado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoProvisionEmpleado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoProvisionEmpleado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoProvisionEmpleadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoProvisionEmpleado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoProvisionEmpleado.getSelectedRows();
			
			TipoProvisionEmpleado tipoprovisionempleadoLocal=new TipoProvisionEmpleado();
			
			//this.seleccionarTodosTipoProvisionEmpleado(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprovisionempleadoLocal =(TipoProvisionEmpleado) this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados().toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoprovisionempleadoLocal =(TipoProvisionEmpleado) this.tipoprovisionempleados.toArray()[this.jTableDatosTipoProvisionEmpleado.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoprovisionempleadoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoProvisionEmpleado tipoprovisionempleadoAux:this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados()) {
						tipoprovisionempleadoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProvisionEmpleado tipoprovisionempleadoAux:tipoprovisionempleados) {
						tipoprovisionempleadoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoProvisionEmpleado(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoProvisionEmpleado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoProvisionEmpleado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoProvisionEmpleado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoProvisionEmpleadoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoProvisionEmpleadoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoProvisionEmpleadoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoProvisionEmpleado(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoProvisionEmpleado.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoProvisionEmpleado tipoprovisionempleadoAux:this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados()) {
				
						if(sTipoSeleccionar.equals(TipoProvisionEmpleadoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoprovisionempleadoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoprovisionempleadoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProvisionEmpleado tipoprovisionempleadoAux:tipoprovisionempleados) {
					
						if(sTipoSeleccionar.equals(TipoProvisionEmpleadoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoprovisionempleadoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoprovisionempleadoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoProvisionEmpleado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoProvisionEmpleadoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoProvisionEmpleado(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoProvisionEmpleado=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoProvisionEmpleado.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoProvisionEmpleado.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoProvisionEmpleado) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoProvisionEmpleado(conSplash);
				
					this.generarReporteTipoProvisionEmpleadosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProvisionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProvisionEmpleado.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoProvisionEmpleadosSeleccionados();
				//this.jComboBoxTiposAccionesTipoProvisionEmpleado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoProvisionEmpleadosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoProvisionEmpleado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoProvisionEmpleadosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoProvisionEmpleado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoProvisionEmpleado();
				
				this.exportarTipoProvisionEmpleadosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProvisionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProvisionEmpleado.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoProvisionEmpleados();
				//this.importarTipoProvisionEmpleados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProvisionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProvisionEmpleado.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoProvisionEmpleado();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoProvisionEmpleadosSeleccionados();
				//this.jComboBoxTiposAccionesTipoProvisionEmpleado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Provision Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoProvisionEmpleado();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoProvisionEmpleado)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoProvisionEmpleado(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProvisionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProvisionEmpleado.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoProvisionEmpleadoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoProvisionEmpleado) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoProvisionEmpleado(conSplash);
					
						//this.actualizarParametrosGeneralTipoProvisionEmpleado();
						
						this.generarReporteProcesoAccionTipoProvisionEmpleadosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoProvisionEmpleado.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoProvisionEmpleado.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Provision EmpleadoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Provision Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoProvisionEmpleado();
				
						this.actualizarParametrosGeneralTipoProvisionEmpleado();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoprovisionempleadoReturnGeneral=tipoprovisionempleadoLogic.procesarAccionTipoProvisionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados(),this.tipoprovisionempleadoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoProvisionEmpleadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoProvisionEmpleado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoProvisionEmpleado.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoProvisionEmpleado();
					
					TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoProvisionEmpleadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoProvisionEmpleado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoProvisionEmpleado.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoProvisionEmpleado(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoProvisionEmpleadoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoProvisionEmpleado();
			
			if(this.jInternalFrameDetalleFormTipoProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoProvisionEmpleado> tipoprovisionempleadosSeleccionados=new ArrayList<TipoProvisionEmpleado>();		
			TipoProvisionEmpleado tipoprovisionempleado=new TipoProvisionEmpleado();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoProvisionEmpleado(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoProvisionEmpleado.getSelectedItem();
			
			
			
			
			tipoprovisionempleadosSeleccionados=this.getTipoProvisionEmpleadosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoprovisionempleadosSeleccionados.size()==1) {
				for(TipoProvisionEmpleado tipoprovisionempleadoAux:tipoprovisionempleadosSeleccionados) {
					tipoprovisionempleado=tipoprovisionempleadoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Provision Empleado")) {
					jButtonProvisionEmpleadoActionPerformed(null,rowIndex,true,false,tipoprovisionempleado);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoProvisionEmpleado();
			
      		//this.finishProcessTipoProvisionEmpleado(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoProvisionEmpleadoReturnGeneral() throws Exception {
		if(this.tipoprovisionempleadoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoprovisionempleadoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoprovisionempleadoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoprovisionempleadoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoprovisionempleadoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoprovisionempleadoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoProvisionEmpleado(false);
		}
		
		if(this.tipoprovisionempleadoReturnGeneral.getConRetornoLista() || this.tipoprovisionempleadoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoprovisionempleadoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoprovisionempleadoLogic.setTipoProvisionEmpleados(this.tipoprovisionempleadoReturnGeneral.getTipoProvisionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoprovisionempleadoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoprovisionempleadoLogic.setTipoProvisionEmpleado(this.tipoprovisionempleadoReturnGeneral.getTipoProvisionEmpleado());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoProvisionEmpleado(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoProvisionEmpleado() throws Exception {
		
		
	}
	
	public ArrayList<TipoProvisionEmpleado> getTipoProvisionEmpleadosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoProvisionEmpleado> tipoprovisionempleadosSeleccionados=new ArrayList<TipoProvisionEmpleado>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoProvisionEmpleado) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoProvisionEmpleado tipoprovisionempleadoAux:tipoprovisionempleadoLogic.getTipoProvisionEmpleados()) {
					if(tipoprovisionempleadoAux.getIsSelected()) {
						tipoprovisionempleadosSeleccionados.add(tipoprovisionempleadoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProvisionEmpleado tipoprovisionempleadoAux:this.tipoprovisionempleados) {
					if(tipoprovisionempleadoAux.getIsSelected()) {
						tipoprovisionempleadosSeleccionados.add(tipoprovisionempleadoAux);				
					}
				}
			}
			
			if(tipoprovisionempleadosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoprovisionempleadosSeleccionados.addAll(this.tipoprovisionempleadoLogic.getTipoProvisionEmpleados());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoprovisionempleadosSeleccionados.addAll(this.tipoprovisionempleados);				
					}
				}
			}
		} else {
			tipoprovisionempleadosSeleccionados.add(this.tipoprovisionempleado);
		}
		
		return tipoprovisionempleadosSeleccionados;
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
	
	public void generarReporteTipoProvisionEmpleadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoProvisionEmpleadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoProvisionEmpleadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoProvisionEmpleadosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoProvisionEmpleadosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoProvisionEmpleadosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Provision Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoProvisionEmpleadosSeleccionados() throws Exception {
		ArrayList<TipoProvisionEmpleado> tipoprovisionempleadosSeleccionados=new ArrayList<TipoProvisionEmpleado>();		
		
		tipoprovisionempleadosSeleccionados=this.getTipoProvisionEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoProvisionEmpleados("Todos",tipoprovisionempleadosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoProvisionEmpleadosSeleccionados() throws Exception {
		ArrayList<TipoProvisionEmpleado> tipoprovisionempleadosSeleccionados=new ArrayList<TipoProvisionEmpleado>();		
		
		tipoprovisionempleadosSeleccionados=this.getTipoProvisionEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoProvisionEmpleados("Todos",tipoprovisionempleadosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoProvisionEmpleadosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoProvisionEmpleado> tipoprovisionempleadosSeleccionados=new ArrayList<TipoProvisionEmpleado>();
		
		tipoprovisionempleadosSeleccionados=this.getTipoProvisionEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoProvisionEmpleados("Todos",tipoprovisionempleadosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoProvisionEmpleadosSeleccionados() throws Exception {
		ArrayList<TipoProvisionEmpleado> tipoprovisionempleadosSeleccionados=new ArrayList<TipoProvisionEmpleado>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoProvisionEmpleado();
		
		
		tipoprovisionempleadosSeleccionados=this.getTipoProvisionEmpleadosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoProvisionEmpleado();
		
		
		//this.generarReporteTipoProvisionEmpleados("Todos",tipoprovisionempleadosSeleccionados ,tipoprovisionempleadoImplementable,tipoprovisionempleadoImplementableHome);
	}
	
	public void mostrarImportacionTipoProvisionEmpleados() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoProvisionEmpleado();
		
		this.abrirFrameImportacionTipoProvisionEmpleado();		
		
			
		//this.generarReporteTipoProvisionEmpleados("Todos",tipoprovisionempleadosSeleccionados ,tipoprovisionempleadoImplementable,tipoprovisionempleadoImplementableHome);
	}
	
	public void importarTipoProvisionEmpleados() throws Exception {		
	
	}
	
	public void exportarTipoProvisionEmpleadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoProvisionEmpleadosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoProvisionEmpleadosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoProvisionEmpleadosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Provision Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoProvisionEmpleadosSeleccionados() throws Exception {
		ArrayList<TipoProvisionEmpleado> tipoprovisionempleadosSeleccionados=new ArrayList<TipoProvisionEmpleado>();		
		
		tipoprovisionempleadosSeleccionados=this.getTipoProvisionEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprovisionempleado."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoProvisionEmpleado(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoProvisionEmpleado tipoprovisionempleadoAux:tipoprovisionempleadosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoProvisionEmpleado(tipoprovisionempleadoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoprovisionempleadoAux.setsDetalleGeneralEntityReporte(tipoprovisionempleadoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoProvisionEmpleado(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoProvisionEmpleadoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProvisionEmpleadoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProvisionEmpleadoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoProvisionEmpleado(TipoProvisionEmpleado tipoprovisionempleado,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoprovisionempleado.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprovisionempleado.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprovisionempleado.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprovisionempleado.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoProvisionEmpleadosSeleccionados() throws Exception {
		ArrayList<TipoProvisionEmpleado> tipoprovisionempleadosSeleccionados=new ArrayList<TipoProvisionEmpleado>();		
		
		tipoprovisionempleadosSeleccionados=this.getTipoProvisionEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprovisionempleado.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoProvisionEmpleados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoProvisionEmpleado(row);				
				iRow++;
			}				
			
			for(TipoProvisionEmpleado tipoprovisionempleadoAux:tipoprovisionempleadosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoProvisionEmpleado(tipoprovisionempleadoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoProvisionEmpleadosSeleccionados() throws Exception {
		ArrayList<TipoProvisionEmpleado> tipoprovisionempleadosSeleccionados=new ArrayList<TipoProvisionEmpleado>();		
		
		tipoprovisionempleadosSeleccionados=this.getTipoProvisionEmpleadosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprovisionempleado.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoprovisionempleados");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoprovisionempleado");
			//elementRoot.appendChild(element);
		
			for(TipoProvisionEmpleado tipoprovisionempleadoAux:tipoprovisionempleadosSeleccionados) {
				element = document.createElement("tipoprovisionempleado");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoProvisionEmpleado(tipoprovisionempleadoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Provision Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoProvisionEmpleado(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProvisionEmpleadoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProvisionEmpleadoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoProvisionEmpleadoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoProvisionEmpleado(TipoProvisionEmpleado tipoprovisionempleado,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprovisionempleado.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprovisionempleado.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprovisionempleado.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoProvisionEmpleado(TipoProvisionEmpleado tipoprovisionempleado,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoProvisionEmpleadoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoprovisionempleado.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoProvisionEmpleadoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoprovisionempleado.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoProvisionEmpleadoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoprovisionempleado.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoProvisionEmpleadoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoprovisionempleado.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoProvisionEmpleadosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoProvisionEmpleado> tipoprovisionempleadosSeleccionados=new ArrayList<TipoProvisionEmpleado>();
		
		tipoprovisionempleadosSeleccionados=this.getTipoProvisionEmpleadosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoProvisionEmpleado(tipoprovisionempleadosSeleccionados);
		
		this.generarReporteTipoProvisionEmpleados("Todos",tipoprovisionempleadosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoProvisionEmpleado(ArrayList<TipoProvisionEmpleado> tipoprovisionempleadosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoProvisionEmpleado tipoprovisionempleadoAux:tipoprovisionempleadosSeleccionados) {
				tipoprovisionempleadoAux.setsDetalleGeneralEntityReporte(tipoprovisionempleadoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoProvisionEmpleadoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoprovisionempleadoAux.setsDescripcionGeneralEntityReporte1(tipoprovisionempleadoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoprovisionempleadoAux.setsDescripcionGeneralEntityReporte1(tipoprovisionempleadoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProvisionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoProvisionEmpleado(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoProvisionEmpleado=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado=true;
				this.isVisibilidadCeldaGuardarCambiosTipoProvisionEmpleado=true;
			}
			
			this.isVisibilidadCeldaModificarTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaEliminarTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoProvisionEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProvisionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProvisionEmpleado=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaModificarTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoProvisionEmpleado=true;
			this.isVisibilidadCeldaEliminarTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoProvisionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProvisionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProvisionEmpleado=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaModificarTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoProvisionEmpleado=true;
			this.isVisibilidadCeldaEliminarTipoProvisionEmpleado=true;
			this.isVisibilidadCeldaCancelarTipoProvisionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProvisionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProvisionEmpleado=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaModificarTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoProvisionEmpleado=true;
			this.isVisibilidadCeldaEliminarTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoProvisionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProvisionEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProvisionEmpleado=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoProvisionEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado=true;
			this.isVisibilidadCeldaGuardarCambiosTipoProvisionEmpleado=true;
			this.isVisibilidadCeldaModificarTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaEliminarTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoProvisionEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProvisionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProvisionEmpleado=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaActualizarTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaEliminarTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoProvisionEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProvisionEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProvisionEmpleado=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaModificarTipoProvisionEmpleado=true;
			this.isVisibilidadCeldaActualizarTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaEliminarTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaCancelarTipoProvisionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProvisionEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProvisionEmpleado=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoProvisionEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado=true;
			this.isVisibilidadCeldaGuardarCambiosTipoProvisionEmpleado=true;
		} else {
			this.actualizarEstadoPanelsTipoProvisionEmpleado(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoProvisionEmpleado=false;
			//this.isVisibilidadCeldaVerFormTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaDuplicarTipoProvisionEmpleado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoprovisionempleadoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProvisionEmpleado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
			if(!tipoprovisionempleadoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado=false;												
			}
			
			this.jButtonCerrarTipoProvisionEmpleado.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoProvisionEmpleado=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoprovisionempleado)) {
			this.isVisibilidadCeldaActualizarTipoProvisionEmpleado=false;
			this.isVisibilidadCeldaEliminarTipoProvisionEmpleado=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoProvisionEmpleado() {
		this.isVisibilidadCeldaNuevoTipoProvisionEmpleado=false;
		this.isVisibilidadCeldaGuardarCambiosTipoProvisionEmpleado=false;
	}
	
	public void actualizarEstadoPanelsTipoProvisionEmpleado(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoProvisionEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoProvisionEmpleado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoProvisionEmpleado!=null) {
				this.jScrollPanelDatosTipoProvisionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProvisionEmpleado!=null) {
				this.jPanelPaginacionTipoProvisionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProvisionEmpleado!=null) {
				this.jPanelParametrosReportesTipoProvisionEmpleado.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoProvisionEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoProvisionEmpleado.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoProvisionEmpleado!=null) {
				this.jScrollPanelDatosTipoProvisionEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProvisionEmpleado!=null) {
				this.jPanelPaginacionTipoProvisionEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProvisionEmpleado!=null) {
				this.jPanelParametrosReportesTipoProvisionEmpleado.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoProvisionEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoProvisionEmpleado.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoProvisionEmpleado!=null) {
				this.jScrollPanelDatosTipoProvisionEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProvisionEmpleado!=null) {
				this.jPanelPaginacionTipoProvisionEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProvisionEmpleado!=null) {
				this.jPanelParametrosReportesTipoProvisionEmpleado.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoProvisionEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoProvisionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProvisionEmpleado!=null) {
				this.jScrollPanelDatosTipoProvisionEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProvisionEmpleado!=null) {
				this.jPanelPaginacionTipoProvisionEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProvisionEmpleado!=null) {
				this.jPanelParametrosReportesTipoProvisionEmpleado.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoProvisionEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoProvisionEmpleado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoProvisionEmpleado!=null) {
				this.jScrollPanelDatosTipoProvisionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProvisionEmpleado!=null) {
				this.jPanelPaginacionTipoProvisionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProvisionEmpleado!=null) {
				this.jPanelParametrosReportesTipoProvisionEmpleado.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoProvisionEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoProvisionEmpleado.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoProvisionEmpleado!=null) {
				this.jScrollPanelDatosTipoProvisionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProvisionEmpleado!=null) {
				this.jPanelPaginacionTipoProvisionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProvisionEmpleado!=null) {
				this.jPanelParametrosReportesTipoProvisionEmpleado.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoProvisionEmpleado!=null) {
				this.jScrollPanelDatosEdicionTipoProvisionEmpleado.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoProvisionEmpleado!=null) {
				this.jScrollPanelDatosTipoProvisionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProvisionEmpleado!=null) {
				this.jPanelPaginacionTipoProvisionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProvisionEmpleado!=null) {
				this.jPanelParametrosReportesTipoProvisionEmpleado.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoProvisionEmpleadoParaProvisionEmpleados() throws Exception {
		Boolean isPaginaPopupProvisionEmpleado=false;

		try {

			if(this.tipoprovisionempleadoSessionBean==null) {
				this.tipoprovisionempleadoSessionBean=new TipoProvisionEmpleadoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoSessionBean.setsPathNavegacionActual(tipoprovisionempleadoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProvisionEmpleado=this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProvisionEmpleado(true);
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProvisionEmpleado(TipoProvisionEmpleadoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProvisionEmpleado(true);
			this.jInternalFrameDetalleFormTipoProvisionEmpleado.provisionempleadoSessionBean.setlidTipoProvisionEmpleadoActual(this.idTipoProvisionEmpleadoActual);

			tipoprovisionempleadoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoProvisionEmpleado(true);
			tipoprovisionempleadoSessionBean.setlIdTipoProvisionEmpleadoActualForeignKey(this.idTipoProvisionEmpleadoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoProvisionEmpleadoSessionBean tipoprovisionempleadoSessionBean=new TipoProvisionEmpleadoSessionBean();
		
		if(this.tipoprovisionempleadoSessionBean==null) {
			this.tipoprovisionempleadoSessionBean=new TipoProvisionEmpleadoSessionBean();
		}
		
		this.tipoprovisionempleadoSessionBean.setsUltimaBusquedaTipoProvisionEmpleado(this.getsAccionBusqueda());
		this.tipoprovisionempleadoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoprovisionempleadoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoProvisionEmpleadoSessionBean tipoprovisionempleadoSessionBean=new TipoProvisionEmpleadoSessionBean();
		
		if(this.tipoprovisionempleadoSessionBean==null) {
			this.tipoprovisionempleadoSessionBean=new TipoProvisionEmpleadoSessionBean();
		}
		
		if(this.tipoprovisionempleadoSessionBean.getsUltimaBusquedaTipoProvisionEmpleado()!=null&&!this.tipoprovisionempleadoSessionBean.getsUltimaBusquedaTipoProvisionEmpleado().equals("")) {
			this.setsAccionBusqueda(tipoprovisionempleadoSessionBean.getsUltimaBusquedaTipoProvisionEmpleado());
			this.setiNumeroPaginacion(tipoprovisionempleadoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoprovisionempleadoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipoprovisionempleadoSessionBean.setsUltimaBusquedaTipoProvisionEmpleado("");
		this.tipoprovisionempleadoSessionBean.setiNumeroPaginacion(TipoProvisionEmpleadoConstantesFunciones.INUMEROPAGINACION);
		this.tipoprovisionempleadoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoProvisionEmpleado(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoProvisionEmpleado() {
		this.updateBorderResaltarBusquedasFormularioTipoProvisionEmpleado();
		this.updateVisibilidadBusquedasFormularioTipoProvisionEmpleado();
		this.updateHabilitarBusquedasFormularioTipoProvisionEmpleado();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoProvisionEmpleado() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoProvisionEmpleado() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoProvisionEmpleado() {
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
	
	public void updateControlesFormularioTipoProvisionEmpleado() throws Exception {

		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoProvisionEmpleado();
		this.updateVisibilidadResaltarControlesFormularioTipoProvisionEmpleado();
		this.updateHabilitarResaltarControlesFormularioTipoProvisionEmpleado();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoProvisionEmpleado() throws Exception {
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoprovisionempleadoConstantesFunciones.resaltaridTipoProvisionEmpleado!=null && this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) {this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextFieldidTipoProvisionEmpleado.setBorder(this.tipoprovisionempleadoConstantesFunciones.resaltaridTipoProvisionEmpleado);}
		if(this.tipoprovisionempleadoConstantesFunciones.resaltarcodigoTipoProvisionEmpleado!=null && this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) {this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextFieldcodigoTipoProvisionEmpleado.setBorder(this.tipoprovisionempleadoConstantesFunciones.resaltarcodigoTipoProvisionEmpleado);}
		if(this.tipoprovisionempleadoConstantesFunciones.resaltarnombreTipoProvisionEmpleado!=null && this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) {this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextAreanombreTipoProvisionEmpleado.setBorder(this.tipoprovisionempleadoConstantesFunciones.resaltarnombreTipoProvisionEmpleado);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoProvisionEmpleado() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) {
	
		//this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextFieldidTipoProvisionEmpleado.setVisible(this.tipoprovisionempleadoConstantesFunciones.mostraridTipoProvisionEmpleado);
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jPanelidTipoProvisionEmpleado.setVisible(this.tipoprovisionempleadoConstantesFunciones.mostraridTipoProvisionEmpleado);
		//this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextFieldcodigoTipoProvisionEmpleado.setVisible(this.tipoprovisionempleadoConstantesFunciones.mostrarcodigoTipoProvisionEmpleado);
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jPanelcodigoTipoProvisionEmpleado.setVisible(this.tipoprovisionempleadoConstantesFunciones.mostrarcodigoTipoProvisionEmpleado);
		//this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextAreanombreTipoProvisionEmpleado.setVisible(this.tipoprovisionempleadoConstantesFunciones.mostrarnombreTipoProvisionEmpleado);
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jPanelnombreTipoProvisionEmpleado.setVisible(this.tipoprovisionempleadoConstantesFunciones.mostrarnombreTipoProvisionEmpleado);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoProvisionEmpleado() throws Exception {
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoProvisionEmpleado!=null) {
	
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextFieldidTipoProvisionEmpleado.setEnabled(this.tipoprovisionempleadoConstantesFunciones.activaridTipoProvisionEmpleado);
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextFieldcodigoTipoProvisionEmpleado.setEnabled(this.tipoprovisionempleadoConstantesFunciones.activarcodigoTipoProvisionEmpleado);
		this.jInternalFrameDetalleFormTipoProvisionEmpleado.jTextAreanombreTipoProvisionEmpleado.setEnabled(this.tipoprovisionempleadoConstantesFunciones.activarnombreTipoProvisionEmpleado);
		}
	}
	
		
}