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

import com.bydan.erp.contabilidad.util.TipoIvaConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoIvaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoIvaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoIvaBean;
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

import com.bydan.erp.sris.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.sris.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoIvaBeanSwingJInternalFrame extends TipoIvaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoIvaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoIva> tipoivaValidator = new ClassValidator<TipoIva>(TipoIva.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoIva tipoiva;	
	public TipoIva tipoivaAux;
	public TipoIva tipoivaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoIva tipoivaTotales;
	public Long idTipoIvaActual;
	public Long iIdNuevoTipoIva=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosTransaccionLocal=false;

	public Boolean getIsTienePermisosTransaccionLocal() {
		return isTienePermisosTransaccionLocal;
	}

	public void setIsTienePermisosTransaccionLocal(Boolean isTienePermisosTransaccionLocal) {
		this.isTienePermisosTransaccionLocal= isTienePermisosTransaccionLocal;
	}


	public Boolean isTienePermisosFacturaDiario=false;

	public Boolean getIsTienePermisosFacturaDiario() {
		return isTienePermisosFacturaDiario;
	}

	public void setIsTienePermisosFacturaDiario(Boolean isTienePermisosFacturaDiario) {
		this.isTienePermisosFacturaDiario= isTienePermisosFacturaDiario;
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
	
	public Boolean isPermisoTodoTipoIva;
	public Boolean isPermisoNuevoTipoIva;
	public Boolean isPermisoActualizarTipoIva;
	public Boolean isPermisoActualizarOriginalTipoIva;
	public Boolean isPermisoEliminarTipoIva;
	public Boolean isPermisoGuardarCambiosTipoIva;
	public Boolean isPermisoConsultaTipoIva;
	public Boolean isPermisoBusquedaTipoIva;
	public Boolean isPermisoReporteTipoIva;
	public Boolean isPermisoPaginacionMedioTipoIva;
	public Boolean isPermisoPaginacionAltoTipoIva;
	public Boolean isPermisoPaginacionTodoTipoIva;
	public Boolean isPermisoCopiarTipoIva;
	public Boolean isPermisoVerFormTipoIva;
	public Boolean isPermisoDuplicarTipoIva;
	public Boolean isPermisoOrdenTipoIva;
	
	
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
	
	public TipoIvaParameterReturnGeneral tipoivaReturnGeneral;
	public TipoIvaParameterReturnGeneral tipoivaParameterGeneral;
	
	

	public TransaccionLocalLogic transaccionlocalLogic=null;

	public TransaccionLocalLogic getTransaccionLocalLogic() {
		return transaccionlocalLogic;
	}

	public void setTransaccionLocalLogic(TransaccionLocalLogic transaccionlocalLogic) {
		this.transaccionlocalLogic = transaccionlocalLogic;
	}


	public FacturaDiarioLogic facturadiarioLogic=null;

	public FacturaDiarioLogic getFacturaDiarioLogic() {
		return facturadiarioLogic;
	}

	public void setFacturaDiarioLogic(FacturaDiarioLogic facturadiarioLogic) {
		this.facturadiarioLogic = facturadiarioLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoIva=false;
	public Boolean esParaAccionDesdeFormularioTipoIva=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoIvaSessionBeanAdditional tipoivaSessionBeanAdditional=null;
	
	public TipoIvaSessionBeanAdditional getTipoIvaSessionBeanAdditional() {
		return this.tipoivaSessionBeanAdditional;
	}
	
	public void setTipoIvaSessionBeanAdditional(TipoIvaSessionBeanAdditional tipoivaSessionBeanAdditional) {
		try {
			this.tipoivaSessionBeanAdditional=tipoivaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoIvaBeanSwingJInternalFrameAdditional tipoivaBeanSwingJInternalFrameAdditional=null;
	//public class TipoIvaBeanSwingJInternalFrame
	
	public TipoIvaBeanSwingJInternalFrameAdditional getTipoIvaBeanSwingJInternalFrameAdditional() {
		return this.tipoivaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoIvaBeanSwingJInternalFrameAdditional(TipoIvaBeanSwingJInternalFrameAdditional tipoivaBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoivaBeanSwingJInternalFrameAdditional=tipoivaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoIvaLogic tipoivaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoIva tipoivaBean;
	public TipoIvaConstantesFunciones tipoivaConstantesFunciones;
	//public TipoIvaParameterReturnGeneral tipoivaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoIva> tipoivas;	
	//public List<TipoIva> tipoivasEliminados;
	//public List<TipoIva> tipoivasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoIva=false;
	public Boolean isVisibilidadCeldaDuplicarTipoIva=true;
	public Boolean isVisibilidadCeldaCopiarTipoIva=true;
	public Boolean isVisibilidadCeldaVerFormTipoIva=true;
	public Boolean isVisibilidadCeldaOrdenTipoIva=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoIva=false;
	public Boolean isVisibilidadCeldaModificarTipoIva=false;
	public Boolean isVisibilidadCeldaActualizarTipoIva=false;
	public Boolean isVisibilidadCeldaEliminarTipoIva=false;
	public Boolean isVisibilidadCeldaCancelarTipoIva=false;
	public Boolean isVisibilidadCeldaGuardarTipoIva=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoIva=false;	
	
	
	
	public Long getiIdNuevoTipoIva() {
		return this.iIdNuevoTipoIva;
	}

	public void setiIdNuevoTipoIva(Long iIdNuevoTipoIva) {
		this.iIdNuevoTipoIva = iIdNuevoTipoIva;
	}
	
	public Long getidTipoIvaActual() {
		return this.idTipoIvaActual;
	}

	public void setidTipoIvaActual(Long idTipoIvaActual) {
		this.idTipoIvaActual = idTipoIvaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoIva gettipoiva() {
		return this.tipoiva;
	}

	public void settipoiva(TipoIva tipoiva) {
		this.tipoiva = tipoiva;
	}
	
	public TipoIva gettipoivaAux() {
		return this.tipoivaAux;
	}

	public void settipoivaAux(TipoIva tipoivaAux) {
		this.tipoivaAux = tipoivaAux;
	}				
	
	public TipoIva gettipoivaAnterior() {
		return this.tipoivaAnterior;
	}

	public void settipoivaAnterior(TipoIva tipoivaAnterior) {
		this.tipoivaAnterior = tipoivaAnterior;
	}	
	
	public TipoIva gettipoivaTotales() {
		return this.tipoivaTotales;
	}

	public void settipoivaTotales(TipoIva tipoivaTotales) {
		this.tipoivaTotales = tipoivaTotales;
	}	
	
	public TipoIva gettipoivaBean() {
		return this.tipoivaBean;
	}

	public void settipoivaBean(TipoIva tipoivaBean) {
		this.tipoivaBean = tipoivaBean;
	}	
	
	public TipoIvaParameterReturnGeneral gettipoivaReturnGeneral() {
		return this.tipoivaReturnGeneral;
	}

	public void settipoivaReturnGeneral(TipoIvaParameterReturnGeneral tipoivaReturnGeneral) {
		this.tipoivaReturnGeneral = tipoivaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoIvaLogic getTipoIvaLogic()	{		
		return tipoivaLogic;
	}

	public void setTipoIvaLogic(TipoIvaLogic tipoivaLogic) {
		this.tipoivaLogic = tipoivaLogic;
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
	
	public Boolean getIsEsNuevoTipoIva() {
		return isEsNuevoTipoIva;
	}

	public void setIsEsNuevoTipoIva(Boolean isEsNuevoTipoIva) {
		this.isEsNuevoTipoIva = isEsNuevoTipoIva;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoIva() {
		return esParaAccionDesdeFormularioTipoIva;
	}
	
	public void setEsParaAccionDesdeFormularioTipoIva(Boolean esParaAccionDesdeFormularioTipoIva) {
		this.esParaAccionDesdeFormularioTipoIva = esParaAccionDesdeFormularioTipoIva;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoIva() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoIvaConstantesFunciones.refrescarForeignKeysDescripcionesTipoIva(this.tipoivaLogic.getTipoIvas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoIvaConstantesFunciones.refrescarForeignKeysDescripcionesTipoIva(this.tipoivas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoivaLogic.setTipoIvas(this.tipoivas);
			tipoivaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoIvaParameterReturnGeneral getTipoIvaParameterGeneral() {
		return this.tipoivaParameterGeneral;
	}
	
	public void setTipoIvaParameterGeneral(TipoIvaParameterReturnGeneral tipoivaParameterGeneral) {
		this.tipoivaParameterGeneral = tipoivaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoIva() {
		return isPermisoTodoTipoIva;
	}

	public void setIsPermisoTodoTipoIva(Boolean isPermisoTodoTipoIva) {
		this.isPermisoTodoTipoIva = isPermisoTodoTipoIva;
	}

	public Boolean getIsPermisoNuevoTipoIva() {
		return isPermisoNuevoTipoIva;
	}

	public void setIsPermisoNuevoTipoIva(Boolean isPermisoNuevoTipoIva) {
		this.isPermisoNuevoTipoIva = isPermisoNuevoTipoIva;
	}

	public Boolean getIsPermisoActualizarTipoIva() {
		return isPermisoActualizarTipoIva;
	}

	public void setIsPermisoActualizarTipoIva(Boolean isPermisoActualizarTipoIva) {
		this.isPermisoActualizarTipoIva = isPermisoActualizarTipoIva;
	}

	public Boolean getIsPermisoEliminarTipoIva() {
		return isPermisoEliminarTipoIva;
	}

	public void setIsPermisoEliminarTipoIva(Boolean isPermisoEliminarTipoIva) {
		this.isPermisoEliminarTipoIva = isPermisoEliminarTipoIva;
	}

	public Boolean getIsPermisoGuardarCambiosTipoIva() {
		return isPermisoGuardarCambiosTipoIva;
	}

	public void setIsPermisoGuardarCambiosTipoIva(Boolean isPermisoGuardarCambiosTipoIva) {
		this.isPermisoGuardarCambiosTipoIva = isPermisoGuardarCambiosTipoIva;
	}
	
	public Boolean getIsPermisoConsultaTipoIva() {
		return isPermisoConsultaTipoIva;
	}

	public void setIsPermisoConsultaTipoIva(Boolean isPermisoConsultaTipoIva) {
		this.isPermisoConsultaTipoIva = isPermisoConsultaTipoIva;
	}

	public Boolean getIsPermisoBusquedaTipoIva() {
		return isPermisoBusquedaTipoIva;
	}

	public void setIsPermisoBusquedaTipoIva(Boolean isPermisoBusquedaTipoIva) {
		this.isPermisoBusquedaTipoIva = isPermisoBusquedaTipoIva;
	}

	public Boolean getIsPermisoReporteTipoIva() {
		return isPermisoReporteTipoIva;
	}

	public void setIsPermisoReporteTipoIva(Boolean isPermisoReporteTipoIva) {
		this.isPermisoReporteTipoIva = isPermisoReporteTipoIva;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoIva() {
		return isPermisoPaginacionMedioTipoIva;
	}

	public void setIsPermisoPaginacionMedioTipoIva(Boolean isPermisoPaginacionMedioTipoIva) {
		this.isPermisoPaginacionMedioTipoIva = isPermisoPaginacionMedioTipoIva;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoIva() {
		return isPermisoPaginacionTodoTipoIva;
	}

	public void setIsPermisoPaginacionTodoTipoIva(Boolean isPermisoPaginacionTodoTipoIva) {
		this.isPermisoPaginacionTodoTipoIva = isPermisoPaginacionTodoTipoIva;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoIva() {
		return isPermisoPaginacionAltoTipoIva;
	}

	public void setIsPermisoPaginacionAltoTipoIva(Boolean isPermisoPaginacionAltoTipoIva) {
		this.isPermisoPaginacionAltoTipoIva = isPermisoPaginacionAltoTipoIva;
	}
	
	public Boolean getIsPermisoCopiarTipoIva() {
		return isPermisoCopiarTipoIva;
	}

	public void setIsPermisoCopiarTipoIva(Boolean isPermisoCopiarTipoIva) {
		this.isPermisoCopiarTipoIva = isPermisoCopiarTipoIva;
	}
	
	public Boolean getIsPermisoVerFormTipoIva() {
		return isPermisoVerFormTipoIva;
	}

	public void setIsPermisoVerFormTipoIva(Boolean isPermisoVerFormTipoIva) {
		this.isPermisoVerFormTipoIva = isPermisoVerFormTipoIva;
	}
	
	public Boolean getIsPermisoDuplicarTipoIva() {
		return isPermisoDuplicarTipoIva;
	}

	public void setIsPermisoDuplicarTipoIva(Boolean isPermisoDuplicarTipoIva) {
		this.isPermisoDuplicarTipoIva = isPermisoDuplicarTipoIva;
	}
	
	public Boolean getIsPermisoOrdenTipoIva() {
		return isPermisoOrdenTipoIva;
	}

	public void setIsPermisoOrdenTipoIva(Boolean isPermisoOrdenTipoIva) {
		this.isPermisoOrdenTipoIva = isPermisoOrdenTipoIva;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoIva() {
		return isVisibilidadCeldaNuevoTipoIva;
	}

	public void setIsVisibilidadCeldaNuevoTipoIva(Boolean isVisibilidadCeldaNuevoTipoIva) {
		this.isVisibilidadCeldaNuevoTipoIva = isVisibilidadCeldaNuevoTipoIva;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoIva() {
		return isVisibilidadCeldaDuplicarTipoIva;
	}

	public void setIsVisibilidadCeldaDuplicarTipoIva(Boolean isVisibilidadCeldaDuplicarTipoIva) {
		this.isVisibilidadCeldaDuplicarTipoIva = isVisibilidadCeldaDuplicarTipoIva;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoIva() {
		return isVisibilidadCeldaCopiarTipoIva;
	}

	public void setIsVisibilidadCeldaCopiarTipoIva(Boolean isVisibilidadCeldaCopiarTipoIva) {
		this.isVisibilidadCeldaCopiarTipoIva = isVisibilidadCeldaCopiarTipoIva;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoIva() {
		return isVisibilidadCeldaVerFormTipoIva;
	}

	public void setIsVisibilidadCeldaVerFormTipoIva(Boolean isVisibilidadCeldaVerFormTipoIva) {
		this.isVisibilidadCeldaVerFormTipoIva = isVisibilidadCeldaVerFormTipoIva;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoIva() {
		return isVisibilidadCeldaOrdenTipoIva;
	}

	public void setIsVisibilidadCeldaOrdenTipoIva(Boolean isVisibilidadCeldaOrdenTipoIva) {
		this.isVisibilidadCeldaOrdenTipoIva = isVisibilidadCeldaOrdenTipoIva;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoIva() {
		return isVisibilidadCeldaNuevoRelacionesTipoIva;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoIva(Boolean isVisibilidadCeldaNuevoRelacionesTipoIva) {
		this.isVisibilidadCeldaNuevoRelacionesTipoIva = isVisibilidadCeldaNuevoRelacionesTipoIva;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoIva() {
		return isVisibilidadCeldaModificarTipoIva;
	}

	public void setIsVisibilidadCeldaModificarTipoIva(Boolean isVisibilidadCeldaModificarTipoIva) {
		this.isVisibilidadCeldaModificarTipoIva = isVisibilidadCeldaModificarTipoIva;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoIva() {
		return isVisibilidadCeldaActualizarTipoIva;
	}

	public void setIsVisibilidadCeldaActualizarTipoIva(Boolean isVisibilidadCeldaActualizarTipoIva) {
		this.isVisibilidadCeldaActualizarTipoIva = isVisibilidadCeldaActualizarTipoIva;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoIva() {
		return isVisibilidadCeldaEliminarTipoIva;
	}

	public void setIsVisibilidadCeldaEliminarTipoIva(Boolean isVisibilidadCeldaEliminarTipoIva) {
		this.isVisibilidadCeldaEliminarTipoIva = isVisibilidadCeldaEliminarTipoIva;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoIva() {
		return isVisibilidadCeldaCancelarTipoIva;
	}

	public void setIsVisibilidadCeldaCancelarTipoIva(Boolean isVisibilidadCeldaCancelarTipoIva) {
		this.isVisibilidadCeldaCancelarTipoIva = isVisibilidadCeldaCancelarTipoIva;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoIva() {
		return isVisibilidadCeldaGuardarTipoIva;
	}

	public void setIsVisibilidadCeldaGuardarTipoIva(Boolean isVisibilidadCeldaGuardarTipoIva) {
		this.isVisibilidadCeldaGuardarTipoIva = isVisibilidadCeldaGuardarTipoIva;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoIva() {
		return isVisibilidadCeldaGuardarCambiosTipoIva;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoIva(Boolean isVisibilidadCeldaGuardarCambiosTipoIva) {
		this.isVisibilidadCeldaGuardarCambiosTipoIva = isVisibilidadCeldaGuardarCambiosTipoIva;
	}
		
	public TipoIvaSessionBean gettipoivaSessionBean() {
		return this.tipoivaSessionBean;
	}
	
	public void settipoivaSessionBean(TipoIvaSessionBean tipoivaSessionBean) {
		this.tipoivaSessionBean=tipoivaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoIva(TipoIva tipoiva)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoIva tipoiva,TipoIva tipoivaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoIva(tipoiva);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoivaAux.setId(tipoiva.getId());
		tipoivaAux.setVersionRow(tipoiva.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoIva();
		
			int intSelectedRow = this.jTableDatosTipoIva.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoiva =(TipoIva) this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoiva =(TipoIva) this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoIva(this.tipoiva,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoIva(this.tipoiva);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoivaValidator.getInvalidValues(this.tipoiva);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoivaLogic.setDatosCliente(datosCliente);
			tipoivaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoivaAux=new  TipoIva();
				
				tipoivaAux.setIsNew(true);
				tipoivaAux.setIsChanged(true);
				
				tipoivaAux.setTipoIvaOriginal(this.tipoiva);
				
				tipoivaAux.setId(this.tipoiva.getId());	
				tipoivaAux.setVersionRow(this.tipoiva.getVersionRow());	
				tipoivaAux.setcodigo(this.tipoiva.getcodigo());	
				tipoivaAux.setnombre(this.tipoiva.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoivaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoivaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoivaAux,tipoivaLogic.getTipoIvas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoivaAux,tipoivas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoivaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoivaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoivaLogic.saveTipoIvas();//WithConnection
						//tipoivaLogic.getSetVersionRowTipoIvas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoiva,tipoivaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoivaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals().addAll(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
							this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.getFacturaDiarios().addAll(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiariosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocals.addAll(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
							this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarios.addAll(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiariosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipoivaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoivaLogic.saveTipoIvaRelaciones(tipoivaAux,this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals(),this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.getFacturaDiarios());//WithConnection
								//tipoivaLogic.getSetVersionRowTipoIvas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoiva,tipoivaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(new ArrayList<TransaccionLocal>());
							this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.setFacturaDiarios(new ArrayList<FacturaDiario>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocals= new ArrayList<TransaccionLocal>();
							this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarios= new ArrayList<FacturaDiario>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoivaAux.setTransaccionLocals(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());

							if(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoivaAux.setFacturaDiarios(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.getFacturaDiarios());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoivaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoivaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoivaAux,tipoivaLogic.getTipoIvas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoivaAux,tipoivas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoiva,tipoivaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoivaAux=new  TipoIva();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoivaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoivaSessionBean.getEsGuardarRelacionado() && this.tipoiva.getId()>=0)) {
						
					tipoivaAux.setIsNew(false);
				}
				
				tipoivaAux.setIsDeleted(false);
			
				tipoivaAux.setId(this.tipoiva.getId());	
				tipoivaAux.setVersionRow(this.tipoiva.getVersionRow());	
				tipoivaAux.setcodigo(this.tipoiva.getcodigo());	
				tipoivaAux.setnombre(this.tipoiva.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoivaAux,tipoivaLogic.getTipoIvas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoivaAux,tipoivas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoivaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoivaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoivaLogic.saveTipoIvas();//WithConnection
						//tipoivaLogic.getSetVersionRowTipoIvas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoiva,tipoivaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoivaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals().addAll(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
							this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.getFacturaDiarios().addAll(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiariosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocals.addAll(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
							this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarios.addAll(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiariosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipoivaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoivaLogic.saveTipoIvaRelaciones(tipoivaAux,this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals(),this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.getFacturaDiarios());//WithConnection
								//tipoivaLogic.getSetVersionRowTipoIvas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoiva,tipoivaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(new ArrayList<TransaccionLocal>());
							this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.setFacturaDiarios(new ArrayList<FacturaDiario>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocals= new ArrayList<TransaccionLocal>();
							this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarios= new ArrayList<FacturaDiario>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoivaAux.setTransaccionLocals(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());

							if(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoivaAux.setFacturaDiarios(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.getFacturaDiarios());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoivaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoivaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoivaAux,tipoivaLogic.getTipoIvas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoivaAux,tipoivas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoiva,tipoivaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoivaAux=new  TipoIva();
				
				tipoivaAux.setIsNew(false);
				tipoivaAux.setIsChanged(false);
				
				tipoivaAux.setIsDeleted(true);
				
				tipoivaAux.setId(this.tipoiva.getId());	
				tipoivaAux.setVersionRow(this.tipoiva.getVersionRow());	
				tipoivaAux.setcodigo(this.tipoiva.getcodigo());	
				tipoivaAux.setnombre(this.tipoiva.getnombre());	
				
				if(this.tipoivaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoivaAux.getId()>=0) {	
						this.tipoivasEliminados.add(tipoivaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoivaAux,tipoivaLogic.getTipoIvas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoivaAux,tipoivas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoivaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoivaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoivaLogic.saveTipoIvas();//WithConnection
						//tipoivaLogic.getSetVersionRowTipoIvas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoivaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals().addAll(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
							this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.getFacturaDiarios().addAll(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiariosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocals.addAll(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
							this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarios.addAll(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiariosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipoivaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoivaLogic.saveTipoIvaRelaciones(tipoivaAux,this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals(),this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.getFacturaDiarios());//WithConnection
								//tipoivaLogic.getSetVersionRowTipoIvas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(new ArrayList<TransaccionLocal>());
							this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.setFacturaDiarios(new ArrayList<FacturaDiario>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocals= new ArrayList<TransaccionLocal>();
							this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarios= new ArrayList<FacturaDiario>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoivaAux.setTransaccionLocals(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());

							if(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoivaAux.setFacturaDiarios(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.getFacturaDiarios());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoivaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoivaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoivaAux,tipoivaLogic.getTipoIvas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoivaAux,tipoivas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaLogic.getTipoIvas().addAll(this.tipoivasEliminados);
					
					tipoivaLogic.saveTipoIvas();//WithConnection
					//tipoivaLogic.getSetVersionRowTipoIvas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoivasEliminados= new ArrayList<TipoIva>();		
			}
			
			if(this.tipoivaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Iva GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Iva",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoiva=tipoivaAux;
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
      		//this.finishProcessTipoIva();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoIva tipoivaLocal) throws Exception {
		
		if(this.tipoivaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoivaLocal.setTransaccionLocals(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());
				tipoivaLocal.setFacturaDiarios(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.getFacturaDiarios());
			
			} else {
			
				tipoivaLocal.setTransaccionLocals(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocals);
				tipoivaLocal.setFacturaDiarios(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarios);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoIva tipoivaLocal) throws Exception {	
		if(this.tipoivaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoIvaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoIva.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoiva =(TipoIva) this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoiva =(TipoIva) this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoivaValidator.getInvalidValues(this.tipoiva);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoIva tipoiva,List<TipoIva> tipoivas) throws Exception {
		try	{		
			TipoIvaConstantesFunciones.actualizarLista(tipoiva,tipoivas,this.tipoivaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoIva tipoiva,List<TipoIva> tipoivas) throws Exception {
		try	{			
			TipoIvaConstantesFunciones.actualizarSelectedLista(tipoiva,tipoivas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoIva> tipoivasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoivasLocal=this.tipoivaLogic.getTipoIvas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoivasLocal=this.tipoivas;
			}
			//ARCHITECTURE
		
			for(TipoIva tipoivaLocal:tipoivasLocal) {
				if(this.permiteMantenimiento(tipoivaLocal) && tipoivaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoIvaConstantesFunciones.getTipoIvaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoIvaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoIva.jLabelcodigoTipoIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoIvaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoIva.jLabelnombreTipoIva,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoIva!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoIva.jLabelcodigoTipoIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoIva.jLabelnombreTipoIva,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("TransaccionLocal")) {
			if(this.tipoiva==null) {
				this.tipoiva= new TipoIva();
			}

			if(this.tipoivaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoIva
				this.setVariablesFormularioToObjetoActualTipoIva(this.tipoiva,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoIva(this.tipoiva);

				this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.gettransaccionlocal().setTipoIva(this.tipoiva);
			}

			return;
		}
		 else  if(sTipo.equals("FacturaDiario")) {
			if(this.tipoiva==null) {
				this.tipoiva= new TipoIva();
			}

			if(this.tipoivaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoIva
				this.setVariablesFormularioToObjetoActualTipoIva(this.tipoiva,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoIva(this.tipoiva);

				this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.getfacturadiario().setTipoIva(this.tipoiva);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoIva--;	
		
		
		this.tipoivaAux=new TipoIva();
		
		this.tipoivaAux.setId(this.iIdNuevoTipoIva);
		this.tipoivaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoivaLogic.getTipoIvas().add(this.tipoivaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoivas.add(this.tipoivaAux);
		}
		//ARCHITECTURE
		
		this.tipoiva=this.tipoivaAux;
		
		if(TipoIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoIva(this.tipoiva);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoIva(this.tipoiva);
		}
				
		//this.setDefaultControlesTipoIva();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoIva();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoIva();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoIva();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoIva(this.tipoivaBean,this.tipoiva,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoIva(this.tipoiva);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoIvaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoivaSessionBean.getConGuardarRelaciones()) {
			classes=TipoIvaConstantesFunciones.getClassesRelationshipsOfTipoIva(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoivaReturnGeneral=tipoivaLogic.procesarEventosTipoIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoivaLogic.getTipoIvas(),this.tipoiva,this.tipoivaParameterGeneral,this.isEsNuevoTipoIva,classes);//this.tipoivaLogic.getTipoIva()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoIva(this.tipoivaReturnGeneral,this.tipoivaBean,false);
		
		if(this.tipoivaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoIva(this.tipoivaReturnGeneral.getTipoIva());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoIva(this.tipoivaReturnGeneral.getTipoIva());
		}
		
		if(this.tipoivaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoIva(this.tipoivaReturnGeneral.getTipoIva(),classes);//this.tipoivaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoIva(this.tipoiva,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoIva();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoIva();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoIvaBeanSwingJInternalFrameAdditional.RecargarFormTipoIva(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoIva(false);
						
			if(tipoivaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.getEsGuardarRelacionado() && TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTransaccionLocalActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarioSessionBean.getEsGuardarRelacionado() && FacturaDiarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFacturaDiarioActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoIva();
			}
			
			this.actualizarVisualTableDatosTipoIva();
			
			this.jTableDatosTipoIva.setRowSelectionInterval(this.getIndiceNuevoTipoIva(), this.getIndiceNuevoTipoIva());
			
			this.seleccionarFilaTablaTipoIvaActual();
						
			this.actualizarEstadoCeldasBotonesTipoIva("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoIva(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoIva.jTextFieldcodigoTipoIva.setEnabled(isHabilitar && this.tipoivaConstantesFunciones.activarcodigoTipoIva);
		this.jInternalFrameDetalleFormTipoIva.jTextAreanombreTipoIva.setEnabled(isHabilitar && this.tipoivaConstantesFunciones.activarnombreTipoIva);	
		
	};
	
	public void setDefaultControlesTipoIva() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoIva(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoivaSessionBean.setConGuardarRelaciones(true);			
			this.tipoivaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoIva.jTabbedPaneRelacionesTipoIva.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarioSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoivaSessionBean.setConGuardarRelaciones(false);			
			this.tipoivaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoIva.jTabbedPaneRelacionesTipoIva.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarioSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoIva() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIva tipoivaAux:this.tipoivaLogic.getTipoIvas()) {
				if(tipoivaAux.getId().equals(this.iIdNuevoTipoIva)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIva tipoivaAux:this.tipoivas) {
				if(tipoivaAux.getId().equals(this.iIdNuevoTipoIva)) {
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
	
	public int getIndiceActualTipoIva(TipoIva tipoiva,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIva tipoivaAux:this.tipoivaLogic.getTipoIvas()) {
				if(tipoivaAux.getId().equals(tipoiva.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIva tipoivaAux:this.tipoivas) {
				if(tipoivaAux.getId().equals(tipoiva.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoIva(TipoIva tipoivaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIva tipoivaAux:this.tipoivaLogic.getTipoIvas()) {
				if(tipoivaAux.getTipoIvaOriginal().getId().equals(tipoivaOriginal.getId())) {
					existe=true;
					tipoivaOriginal.setId(tipoivaAux.getId());
					tipoivaOriginal.setVersionRow(tipoivaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIva tipoivaAux:this.tipoivas) {
				if(tipoivaAux.getTipoIvaOriginal().getId().equals(tipoivaOriginal.getId())) {
					existe=true;
					tipoivaOriginal.setId(tipoivaAux.getId());
					tipoivaOriginal.setVersionRow(tipoivaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoIva(Boolean esParaCancelar) throws Exception {
		tipoivasAux=new ArrayList<TipoIva>();
		tipoivaAux=new TipoIva();
		
		if(!this.tipoivaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoIva tipoivaAux:this.tipoivaLogic.getTipoIvas()) {
					if(tipoivaAux.getId()<0) {
						tipoivasAux.add(tipoivaAux);
					}		
				}
				this.iIdNuevoTipoIva=0L;
				this.tipoivaLogic.getTipoIvas().removeAll(tipoivasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoIva tipoivaAux:this.tipoivas) {
					if(tipoivaAux.getId()<0) {
						tipoivasAux.add(tipoivaAux);
					}		
				}
				this.iIdNuevoTipoIva=0L;
				this.tipoivas.removeAll(tipoivasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoIva 
					&& this.tipoivaLogic.getTipoIvas().size()>0
					) {
					tipoivaAux=this.tipoivaLogic.getTipoIvas().get(this.tipoivaLogic.getTipoIvas().size() - 1);
				
					if(tipoivaAux.getId()<0) {
						this.tipoivaLogic.getTipoIvas().remove(tipoivaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoIva && this.tipoivas.size()>0) {
					tipoivaAux=this.tipoivas.get(this.tipoivas.size() - 1);
				
					if(tipoivaAux.getId()<0) {
						this.tipoivas.remove(tipoivaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoIva(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoiva.getId()<0) {
				this.tipoivaLogic.getTipoIvas().remove(this.tipoiva);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoiva.getId()<0) {
				this.tipoivas.remove(this.tipoiva);
			}
		}			
	}
	
	public void setEstadosInicialesTipoIva(List<TipoIva> tipoivasAux) throws Exception {
		TipoIvaConstantesFunciones.setEstadosInicialesTipoIva(tipoivasAux);
	}
	
	public void setEstadosInicialesTipoIva(TipoIva tipoivaAux) throws Exception {
		TipoIvaConstantesFunciones.setEstadosInicialesTipoIva(tipoivaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoIvaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoIvaActual()) {
				if(!this.isEsNuevoTipoIva) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoIva=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoIvaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Iva ?", "MANTENIMIENTO DE Tipo Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoIva tipoiva) throws Exception {
		TipoIvaConstantesFunciones.seleccionarAsignar(this.tipoiva,tipoiva);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoIva=this.isPermisoActualizarOriginalTipoIva;
			
			
			this.seleccionarAsignar(tipoiva);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoIvaConstantesFunciones.quitarEspaciosTipoIva(this.tipoiva,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoivaSessionBean.setsFuncionBusquedaRapida(this.tipoivaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoIva) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoIva(esParaCancelar);				
				this.cancelarNuevoTipoIva(esParaCancelar);								
			}
			
			this.tipoiva=new TipoIva();
			
			this.inicializarTipoIva();
			
			this.actualizarEstadoCeldasBotonesTipoIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoIva() throws Exception {
		try {
			TipoIvaConstantesFunciones.inicializarTipoIva(this.tipoiva);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoivaLogic.getTipoIvas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoIvas(String sAccionBusqueda,List<TipoIva> tipoivasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoIva"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoIvaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoIvaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoIva"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Ivas");		
		parameters.put("busquedapor", TipoIvaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(TransaccionLocal.class));
			classes.add(new Classe(FacturaDiario.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoIvaLogic tipoivaLogicAuxiliar=new TipoIvaLogic();
					tipoivaLogicAuxiliar.setDatosCliente(tipoivaLogic.getDatosCliente());				
					tipoivaLogicAuxiliar.setTipoIvas(tipoivasParaReportes);
					
					tipoivaLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoIvaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoivasParaReportes=tipoivaLogicAuxiliar.getTipoIvas();
					
					//tipoivaLogic.getNewConnexionToDeep();
					
					//for (TipoIva tipoiva:tipoivasParaReportes) {
					//	tipoivaLogic.deepLoad(tipoiva, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoivaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoivaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileTransaccionLocal = AuxiliarReportes.class.getResourceAsStream("TransaccionLocalDetalleRelacionesDesign.jasper");
			parameters.put("subreport_transaccionlocal", reportFileTransaccionLocal);

			InputStream reportFileFacturaDiario = AuxiliarReportes.class.getResourceAsStream("FacturaDiarioDetalleRelacionesDesign.jasper");
			parameters.put("subreport_facturadiario", reportFileFacturaDiario);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoIva=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoIvaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoIvaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoIva=new JRBeanArrayDataSource(TipoIvaJInternalFrame.TraerTipoIvaBeans(tipoivasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoIva);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoIvaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoIvaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoIvaBean.TraerTipoIvaBeans(tipoivasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoIvas(sAccionBusqueda,sTipoArchivoReporte,tipoivasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoIvas(sAccionBusqueda,sTipoArchivoReporte,tipoivasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoIvaActionPerformed(null);
					//this.generarExcelReporteTipoIvas(sAccionBusqueda,sTipoArchivoReporte,tipoivasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoIvas(sAccionBusqueda,sTipoArchivoReporte,tipoivasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoIvas(sAccionBusqueda,sTipoArchivoReporte,tipoivasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoIvas(sAccionBusqueda,sTipoArchivoReporte,tipoivasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoIva> tipoivasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoiva";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoIvas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoIva("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoIva tipoiva : tipoivasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoIvaConstantesFunciones.generarExcelReporteDataTipoIva("NORMAL",row,workbook,tipoiva,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Iva",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoIva(String sTipo,Row row,Workbook workbook) {
		
		TipoIvaConstantesFunciones.generarExcelReporteHeaderTipoIva(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoIva> tipoivasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoiva_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoIvas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoIva tipoiva : tipoivasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoIvaConstantesFunciones.getTipoIvaDescripcion(tipoiva));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoIvaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoIvaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoiva.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoIvaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoIvaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoiva.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Iva",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoIva> tipoivasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoIva> tipoivasRespaldo=null;
		
		classes=TipoIvaConstantesFunciones.getClassesRelationshipsOfTipoIva(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoivaLogic.setDatosCliente(this.datosCliente);
		this.tipoivaLogic.setDatosDeep(this.datosDeep);
		this.tipoivaLogic.setIsConDeep(true);
		
		tipoivasRespaldo=this.tipoivaLogic.getTipoIvas();
		
		this.tipoivaLogic.setTipoIvas(tipoivasParaReportes);	
		this.tipoivaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoivasParaReportes=this.tipoivaLogic.getTipoIvas();
		this.tipoivaLogic.setTipoIvas(tipoivasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoiva_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoIvas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoIva("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoIva tipoiva : tipoivasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoIva("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoIvaConstantesFunciones.generarExcelReporteDataTipoIva("NORMAL",row,workbook,tipoiva,cellStyleDataAux);
		
			
			


				//TransaccionLocal
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoiva.getTransaccionLocals()!=null && tipoiva.getTransaccionLocals().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					TransaccionLocalConstantesFunciones.generarExcelReporteHeaderTransaccionLocal("RELACIONADO",row,workbook);
				}

				if(tipoiva.getTransaccionLocals()!=null) {
					i2=0;
					for(TransaccionLocal transaccionlocal : tipoiva.getTransaccionLocals()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						TransaccionLocalConstantesFunciones.generarExcelReporteDataTransaccionLocal("RELACIONADO",row,workbook,transaccionlocal,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//FacturaDiario
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FacturaDiarioConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoiva.getFacturaDiarios()!=null && tipoiva.getFacturaDiarios().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FacturaDiarioConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FacturaDiarioConstantesFunciones.generarExcelReporteHeaderFacturaDiario("RELACIONADO",row,workbook);
				}

				if(tipoiva.getFacturaDiarios()!=null) {
					i2=0;
					for(FacturaDiario facturadiario : tipoiva.getFacturaDiarios()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FacturaDiarioConstantesFunciones.generarExcelReporteDataFacturaDiario("RELACIONADO",row,workbook,facturadiario,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoIvaConstantesFunciones.getTipoIvaDescripcion(tipoiva));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Iva",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoIva.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoIva.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIva.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoIva() throws Exception {		
		this.startProcessTipoIva(true);
	}
	
	public void startProcessTipoIva(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoIva, this.jScrollPanelDatosTipoIva,this.jPanelPaginacionTipoIva, this.jScrollPanelDatosEdicionTipoIva, this.jPanelAccionesTipoIva,this.jPanelAccionesFormularioTipoIva,this.jmenuBarTipoIva,this.jmenuBarDetalleTipoIva,this.jTtoolBarTipoIva,this.jTtoolBarDetalleTipoIva);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoIva=null; 
		
		final JPanel jPanelParametrosReportesTipoIva=this.jPanelParametrosReportesTipoIva;
		//final JScrollPane jScrollPanelDatosTipoIva=this.jScrollPanelDatosTipoIva;
		final JTable jTableDatosTipoIva=this.jTableDatosTipoIva;		
		final JPanel jPanelPaginacionTipoIva=this.jPanelPaginacionTipoIva;
		//final JScrollPane jScrollPanelDatosEdicionTipoIva=this.jScrollPanelDatosEdicionTipoIva;
		final JPanel jPanelAccionesTipoIva=this.jPanelAccionesTipoIva;
		
		JPanel jPanelCamposAuxiliarTipoIva=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoIva=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoIva!=null) {
			jPanelCamposAuxiliarTipoIva=this.jInternalFrameDetalleFormTipoIva.jPanelCamposTipoIva;
			jPanelAccionesFormularioAuxiliarTipoIva=this.jInternalFrameDetalleFormTipoIva.jPanelAccionesFormularioTipoIva;
		}
		
		final JPanel jPanelCamposTipoIva=jPanelCamposAuxiliarTipoIva;
		final JPanel jPanelAccionesFormularioTipoIva=jPanelAccionesFormularioAuxiliarTipoIva;
		
		
		final JMenuBar jmenuBarTipoIva=this.jmenuBarTipoIva;
		final JToolBar jTtoolBarTipoIva=this.jTtoolBarTipoIva;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoIva=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoIva=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoIva!=null) {
			jmenuBarDetalleAuxiliarTipoIva=this.jInternalFrameDetalleFormTipoIva.jmenuBarDetalleTipoIva;
			jTtoolBarDetalleAuxiliarTipoIva=this.jInternalFrameDetalleFormTipoIva.jTtoolBarDetalleTipoIva;
		}
		
		final JMenuBar jmenuBarDetalleTipoIva=jmenuBarDetalleAuxiliarTipoIva;
		final JToolBar jTtoolBarDetalleTipoIva=jTtoolBarDetalleAuxiliarTipoIva;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoIva;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoIva;
			processRunnable.jTableDatos=jTableDatosTipoIva;
			processRunnable.jPanelCampos=jPanelCamposTipoIva;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoIva;
			processRunnable.jPanelAcciones=jPanelAccionesTipoIva;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoIva;
			
			
			processRunnable.jmenuBar=jmenuBarTipoIva;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoIva;
			processRunnable.jTtoolBar=jTtoolBarTipoIva;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoIva;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoIva ,jPanelParametrosReportesTipoIva,jTableDatosTipoIva, /*jScrollPanelDatosTipoIva,*/jPanelCamposTipoIva,jPanelPaginacionTipoIva, /*jScrollPanelDatosEdicionTipoIva,*/ jPanelAccionesTipoIva,jPanelAccionesFormularioTipoIva,jmenuBarTipoIva,jmenuBarDetalleTipoIva,jTtoolBarTipoIva,jTtoolBarDetalleTipoIva);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoIva, jScrollPanelDatosTipoIva,jPanelPaginacionTipoIva, jScrollPanelDatosEdicionTipoIva, jPanelAccionesTipoIva,jPanelAccionesFormularioTipoIva,jmenuBarTipoIva,jmenuBarDetalleTipoIva,jTtoolBarTipoIva,jTtoolBarDetalleTipoIva);
						
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
	
	public void finishProcessTipoIva() {// throws Exception 
		this.finishProcessTipoIva(true);
	}
	
	public void finishProcessTipoIva(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoIva, this.jScrollPanelDatosTipoIva,this.jPanelPaginacionTipoIva, this.jScrollPanelDatosEdicionTipoIva, this.jPanelAccionesTipoIva,this.jPanelAccionesFormularioTipoIva,this.jmenuBarTipoIva,this.jmenuBarDetalleTipoIva,this.jTtoolBarTipoIva,this.jTtoolBarDetalleTipoIva);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoIva=null; 
		
		final JPanel jPanelParametrosReportesTipoIva=this.jPanelParametrosReportesTipoIva;
		//final JScrollPane jScrollPanelDatosTipoIva=this.jScrollPanelDatosTipoIva;
		final JTable jTableDatosTipoIva=this.jTableDatosTipoIva;		
		final JPanel jPanelPaginacionTipoIva=this.jPanelPaginacionTipoIva;
		//final JScrollPane jScrollPanelDatosEdicionTipoIva=this.jScrollPanelDatosEdicionTipoIva;
		final JPanel jPanelAccionesTipoIva=this.jPanelAccionesTipoIva;
		
		JPanel jPanelCamposAuxiliarTipoIva=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoIva=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoIva!=null) {
			jPanelCamposAuxiliarTipoIva=this.jInternalFrameDetalleFormTipoIva.jPanelCamposTipoIva;
			jPanelAccionesFormularioAuxiliarTipoIva=this.jInternalFrameDetalleFormTipoIva.jPanelAccionesFormularioTipoIva;
		}
		
		final JPanel jPanelCamposTipoIva=jPanelCamposAuxiliarTipoIva;
		final JPanel jPanelAccionesFormularioTipoIva=jPanelAccionesFormularioAuxiliarTipoIva;
		
		
		final JMenuBar jmenuBarTipoIva=this.jmenuBarTipoIva;		
		final JToolBar jTtoolBarTipoIva=this.jTtoolBarTipoIva;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoIva=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoIva=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoIva!=null) {
			jmenuBarDetalleAuxiliarTipoIva=this.jInternalFrameDetalleFormTipoIva.jmenuBarDetalleTipoIva;
			jTtoolBarDetalleAuxiliarTipoIva=this.jInternalFrameDetalleFormTipoIva.jTtoolBarDetalleTipoIva;		
		}
		
		final JMenuBar jmenuBarDetalleTipoIva=jmenuBarDetalleAuxiliarTipoIva;
		final JToolBar jTtoolBarDetalleTipoIva=jTtoolBarDetalleAuxiliarTipoIva;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoIva;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoIva;
			processRunnable.jTableDatos=jTableDatosTipoIva;
			processRunnable.jPanelCampos=jPanelCamposTipoIva;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoIva;
			processRunnable.jPanelAcciones=jPanelAccionesTipoIva;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoIva;
			
			
			processRunnable.jmenuBar=jmenuBarTipoIva;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoIva;
			processRunnable.jTtoolBar=jTtoolBarTipoIva;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoIva;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoIva ,jPanelParametrosReportesTipoIva, jTableDatosTipoIva,/*jScrollPanelDatosTipoIva,*/jPanelCamposTipoIva,jPanelPaginacionTipoIva, /*jScrollPanelDatosEdicionTipoIva,*/ jPanelAccionesTipoIva,jPanelAccionesFormularioTipoIva,jmenuBarTipoIva,jmenuBarDetalleTipoIva,jTtoolBarTipoIva,jTtoolBarDetalleTipoIva));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoIva(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoIva(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoIva(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoIva(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoIva,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoIva,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoIva(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoIva,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoIva,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoivaConstantesFunciones.getsFinalQueryTipoIva();
		String  finalQueryPaginacionTodos=this.tipoivaConstantesFunciones.getsFinalQueryTipoIva();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoIvaConstantesFunciones.getArrayColumnasGlobalesNoTipoIva(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoIvaConstantesFunciones.getArrayColumnasGlobalesTipoIva(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoIvaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoivasEliminados= new ArrayList<TipoIva>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoIva();
		
				///*TipoIvaSessionBean*/this.tipoivaSessionBean=new TipoIvaSessionBean();
			
			if(this.tipoivaSessionBean==null) {
				this.tipoivaSessionBean=new TipoIvaSessionBean();
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
					this.iNumeroPaginacion=TipoIvaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoIvaConstantesFunciones.getClassesForeignKeysOfTipoIva(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoiva."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoivasAux= new ArrayList<TipoIva>();
			
				
			tipoivaLogic.setDatosCliente(this.datosCliente);
			tipoivaLogic.setDatosDeep(this.datosDeep);
			tipoivaLogic.setIsConDeep(true);
			
			
			tipoivaLogic.getTipoIvaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoivaLogic.getTodosTipoIvas(finalQueryGlobal,pagination);
					
					//tipoivaLogic.getTodosTipoIvasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoivaLogic.getTipoIvas()==null|| tipoivaLogic.getTipoIvas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoivasAux= new ArrayList<TipoIva>();
							tipoivasAux.addAll(tipoivaLogic.getTipoIvas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoivasAux= new ArrayList<TipoIva>();
							tipoivasAux.addAll(tipoivas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoivaLogic.getTodosTipoIvas(finalQueryGlobal+"",this.pagination);												
							
							//tipoivaLogic.getTodosTipoIvasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoIvas("Todos",tipoivaLogic.getTipoIvas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoivaLogic.setTipoIvas(new ArrayList<TipoIva>());					
							tipoivaLogic.getTipoIvas().addAll(tipoivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoivas=new ArrayList<TipoIva>();
							tipoivas.addAll(tipoivasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoIva=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoIva=this.idActual;
				
				} else if(this.idTipoIvaActual!=null && this.idTipoIvaActual!=0L) {
					idTipoIva=idTipoIvaActual;
				}
				
					
				this.sDetalleReporte=TipoIvaConstantesFunciones.getDetalleIndicePorId(idTipoIva);
				
				this.tipoivas=new ArrayList<TipoIva>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoivaLogic.getEntity(idTipoIva);
					
					//tipoivaLogic.getEntityWithConnection(idTipoIva);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoivaLogic.setTipoIvas(new ArrayList<TipoIva>());
					tipoivaLogic.getTipoIvas().add(tipoivaLogic.getTipoIva());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoivas=new ArrayList<TipoIva>();
					this.tipoivas.add(tipoiva);
				}
				
				if(tipoivaLogic.getTipoIva()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoIva();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoIva();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoivaLogic.getTipoIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoivas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoivaLogic.getTipoIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoivas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoIva tipoiva) {
		Boolean permite=true;
		
		if(this.tipoiva.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoIvaConstantesFunciones.getOrderByListaTipoIva();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoIvaConstantesFunciones.getOrderByListaTipoIva();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIva tipoiva:tipoivaLogic.getTipoIvas()) {
				if(tipoiva.getsType().equals(Constantes2.S_TOTALES)) {
					tipoivaTotales=tipoiva;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIva tipoiva:this.tipoivas) {
				if(tipoiva.getsType().equals(Constantes2.S_TOTALES)) {
					tipoivaTotales=tipoiva;
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
			this.tipoivaAux=new TipoIva();
			this.tipoivaAux.setsType(Constantes2.S_TOTALES);
			this.tipoivaAux.setIsNew(false);
			this.tipoivaAux.setIsChanged(false);
			this.tipoivaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoIvaConstantesFunciones.TotalizarValoresFilaTipoIva(this.tipoivaLogic.getTipoIvas(),this.tipoivaAux);
				
				this.tipoivaLogic.getTipoIvas().add(this.tipoivaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoIvaConstantesFunciones.TotalizarValoresFilaTipoIva(this.tipoivas,this.tipoivaAux);
				
				this.tipoivas.add(this.tipoivaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoivaTotales=new TipoIva();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoivaLogic.getTipoIvas().remove(tipoivaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoivas.remove(tipoivaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoivaTotales=new TipoIva();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIva tipoiva:tipoivaLogic.getTipoIvas()) {
				if(tipoiva.getsType().equals(Constantes2.S_TOTALES)) {
					tipoivaTotales=tipoiva;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoIvaConstantesFunciones.TotalizarValoresFilaTipoIva(this.tipoivaLogic.getTipoIvas(),tipoivaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIva tipoiva:this.tipoivas) {
				if(tipoiva.getsType().equals(Constantes2.S_TOTALES)) {
					tipoivaTotales=tipoiva;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoIvaConstantesFunciones.TotalizarValoresFilaTipoIva(this.tipoivas,tipoivaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoIvaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoIvaPorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoivaLogic.getTipoIvaPorCodigo(codigo);
				
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
	
	public void inicializarPermisosTipoIva() {
		this.isPermisoTodoTipoIva=false;
		this.isPermisoNuevoTipoIva=false;
		this.isPermisoActualizarTipoIva=false;
		this.isPermisoActualizarOriginalTipoIva=false;
		this.isPermisoEliminarTipoIva=false;
		this.isPermisoGuardarCambiosTipoIva=false;
		this.isPermisoConsultaTipoIva=false;
		this.isPermisoBusquedaTipoIva=false;
		this.isPermisoReporteTipoIva=false;		
		this.isPermisoOrdenTipoIva=false;		
		this.isPermisoPaginacionMedioTipoIva=false;		
		this.isPermisoPaginacionAltoTipoIva=false;
		this.isPermisoPaginacionTodoTipoIva=false;
		this.isPermisoCopiarTipoIva=false;		
		this.isPermisoVerFormTipoIva=false;		
		this.isPermisoDuplicarTipoIva=false;		
		this.isPermisoOrdenTipoIva=false;		
	}
	
	public void setPermisosUsuarioTipoIva(Boolean isPermiso) {
		this.isPermisoTodoTipoIva=isPermiso;
		this.isPermisoNuevoTipoIva=isPermiso;
		this.isPermisoActualizarTipoIva=isPermiso;
		this.isPermisoActualizarOriginalTipoIva=isPermiso;
		this.isPermisoEliminarTipoIva=isPermiso;
		this.isPermisoGuardarCambiosTipoIva=isPermiso;
		this.isPermisoConsultaTipoIva=isPermiso;
		this.isPermisoBusquedaTipoIva=isPermiso;
		this.isPermisoReporteTipoIva=isPermiso;
		this.isPermisoOrdenTipoIva=isPermiso;		
		this.isPermisoPaginacionMedioTipoIva=isPermiso;		
		this.isPermisoPaginacionAltoTipoIva=isPermiso;		
		this.isPermisoPaginacionTodoTipoIva=isPermiso;		
		this.isPermisoCopiarTipoIva=isPermiso;		
		this.isPermisoVerFormTipoIva=isPermiso;		
		this.isPermisoDuplicarTipoIva=isPermiso;
		this.isPermisoOrdenTipoIva=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoIva(Boolean isPermiso) {
		//this.isPermisoTodoTipoIva=isPermiso;
		this.isPermisoNuevoTipoIva=isPermiso;
		this.isPermisoActualizarTipoIva=isPermiso;
		this.isPermisoActualizarOriginalTipoIva=isPermiso;
		this.isPermisoEliminarTipoIva=isPermiso;
		this.isPermisoGuardarCambiosTipoIva=isPermiso;
		//this.isPermisoConsultaTipoIva=isPermiso;
		//this.isPermisoBusquedaTipoIva=isPermiso;
		//this.isPermisoReporteTipoIva=isPermiso;
		//this.isPermisoOrdenTipoIva=isPermiso;		
		//this.isPermisoPaginacionMedioTipoIva=isPermiso;		
		//this.isPermisoPaginacionAltoTipoIva=isPermiso;		
		//this.isPermisoPaginacionTodoTipoIva=isPermiso;		
		//this.isPermisoCopiarTipoIva=isPermiso;		
		//this.isPermisoDuplicarTipoIva=isPermiso;
		//this.isPermisoOrdenTipoIva=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoIvaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(TransaccionLocalConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(FacturaDiarioConstantesFunciones.SNOMBREOPCION);
		
		if(TipoIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosTransaccionLocal=false;
		this.isTienePermisosTransaccionLocal=this.verificarGetPermisosUsuarioOpcionTipoIvaClaseRelacionada(this.opcionsRelacionadas,TransaccionLocalConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosFacturaDiario=false;
		this.isTienePermisosFacturaDiario=this.verificarGetPermisosUsuarioOpcionTipoIvaClaseRelacionada(this.opcionsRelacionadas,FacturaDiarioConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoIva(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoIvaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosTransaccionLocal=conPermiso;
		this.isTienePermisosFacturaDiario=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoIvaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoIvaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoIvaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosTransaccionLocal && this.jInternalFrameDetalleFormTipoIva!=null && this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoIva.jTabbedPaneRelacionesTipoIva.remove(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosFacturaDiario && this.jInternalFrameDetalleFormTipoIva!=null && this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoIva.jTabbedPaneRelacionesTipoIva.remove(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoIva() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoivaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoIvaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoIva=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoIva=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoIva=this.isPermisoActualizarTipoIva;
			this.isPermisoEliminarTipoIva=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoIva=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoIva=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoIva=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoIva=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoIva=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoIva=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoIva=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoIva=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoIva=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoIva=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoIva=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoIva=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoIva=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoivaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoIva.setToolTipText(this.jTableDatosTipoIva.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoIva(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoIva(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoIva() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosTransaccionLocal && this.tipoivaConstantesFunciones.mostrarTransaccionLocalTipoIva && !TipoIvaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Transaccion Local");
			reporte.setsDescripcion("Transaccion Local");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosFacturaDiario && this.tipoivaConstantesFunciones.mostrarFacturaDiarioTipoIva && !TipoIvaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Factura Diario");
			reporte.setsDescripcion("Factura Diario");
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
	
		
	public void inicializarCombosForeignKeyTipoIvaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoIvaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoIvaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoIvaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoIvaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoIva()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoIva()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoIva(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoIva()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoIva();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoIva(TipoIva tipoiva)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoIva(TipoIva tipoiva,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoIva()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoIva()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoIva()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoIva()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoIva()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoIva()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoIva(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoIva()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoIvaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoIvaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoIvaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoivaSessionBean=new TipoIvaSessionBean(); 
		this.tipoivaConstantesFunciones=new TipoIvaConstantesFunciones(); 
		this.tipoivaBean=new TipoIva();//(this.tipoivaConstantesFunciones); 		
		this.tipoivaReturnGeneral=new TipoIvaParameterReturnGeneral(); 
		
		this.tipoivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoIva(true);
			
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
			
			this.tipoivaConstantesFunciones=new TipoIvaConstantesFunciones(); 
			this.tipoivaBean=new TipoIva();//this.tipoivaConstantesFunciones); 			
			this.tipoivaReturnGeneral=new TipoIvaParameterReturnGeneral(); 
		
			TipoIvaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Iva Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoiva=new TipoIva();
			this.tipoivas = new ArrayList<TipoIva>();
			this.tipoivasAux = new ArrayList<TipoIva>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic=new TipoIvaLogic();
				this.tipoivaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoIva);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoIva);	
					}
					
					if(this.jInternalFrameImportacionTipoIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoIva);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoIva);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoIva!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoIva);
				this.jInternalFrameDetalleFormTipoIva.setVisible(false);
				this.jInternalFrameDetalleFormTipoIva.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoIva);
					this.jInternalFrameReporteDinamicoTipoIva.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoIva.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoIva);
					this.jInternalFrameImportacionTipoIva.setVisible(false);
					this.jInternalFrameImportacionTipoIva.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoIva);
					this.jInternalFrameOrderByTipoIva.setVisible(false);
					this.jInternalFrameOrderByTipoIva.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoIvaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoIvaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoivaReturnGeneral=new TipoIvaParameterReturnGeneral();
			
			this.tipoivaParameterGeneral=new TipoIvaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoivaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoivaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoivaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(TransaccionLocalConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(FacturaDiarioConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoIvaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoivaSessionBean.getEsGuardarRelacionado(),this.tipoivaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoIvaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoivaSessionBean.getEsGuardarRelacionado(),this.tipoivaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoIva=false;
			this.isVisibilidadCeldaDuplicarTipoIva=true;
			this.isVisibilidadCeldaCopiarTipoIva=true;
			this.isVisibilidadCeldaVerFormTipoIva=true;
			this.isVisibilidadCeldaOrdenTipoIva=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoIva=false;
			this.isVisibilidadCeldaModificarTipoIva=false;
			this.isVisibilidadCeldaActualizarTipoIva=false;
			this.isVisibilidadCeldaEliminarTipoIva=false;
			this.isVisibilidadCeldaCancelarTipoIva=false;
			this.isVisibilidadCeldaGuardarTipoIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIva=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoIva();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoIva(false);
			
			this.setPermisosUsuarioTipoIva();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoivaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoivaSessionBean.getEsGuardarRelacionado() && this.tipoivaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoIvaClasesRelacionadas();
			}
			
			if(this.tipoivaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoIvaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoIvaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoIva();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoIva();
			}
			
			if(!this.isPermisoBusquedaTipoIva) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoivaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoIva,this.isPermisoPaginacionMedioTipoIva,this.isPermisoPaginacionTodoTipoIva);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoIvaConstantesFunciones.getTiposSeleccionarTipoIva());
				
				this.tiposColumnasSelect=TipoIvaConstantesFunciones.getTiposSeleccionarTipoIva(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoIva();				
				//this.tiposRelacionesSelect=TipoIvaConstantesFunciones.getTiposRelacionesTipoIva(true);
				
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
			//if(!this.tipoivaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoIva();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoIva(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoIva(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoIva() ;
			
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
			
			
			this.transaccionlocalLogic=new TransaccionLocalLogic();
			this.facturadiarioLogic=new FacturaDiarioLogic(); 
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
				tipoivaImplementable= (TipoIvaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoIvaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoivaImplementableHome= (TipoIvaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoIvaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoivas= new ArrayList<TipoIva>();
			this.tipoivasEliminados= new ArrayList<TipoIva>();
						
			this.isEsNuevoTipoIva=false;
			this.esParaAccionDesdeFormularioTipoIva=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoIva(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoIva();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoivaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoIvaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoIvaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoIva(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoIva!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoIva();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoIva();
			}
			
			TipoIvaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoIva(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoIva: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoIva() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(FacturaDiarioConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FacturaDiarioConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoIva")) {
				iIndex=this.jInternalFrameDetalleFormTipoIva.jTabbedPaneRelacionesTipoIva.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoIva.jTabbedPaneRelacionesTipoIva.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoIva.getSelectedRow();	
				
				

				if(sTitle.equals("Factura Diarios")) {
					if(!FacturaDiarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoIva();

						this.cargarParteTabPanelRelacionadaFacturaDiario(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Transaccion Locales")) {
					if(!TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoIva();

						this.cargarParteTabPanelRelacionadaTransaccionLocal(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoIva();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaFacturaDiario(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoIva.cargarSessionConBeanSwingJInternalFrameFacturaDiario(false,true,iIndex);
		this.jButtonFacturaDiarioActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFacturaDiario();

		//this.jTabbedPaneRelacionesTipoIva.updateUI();
		//this.jTabbedPaneRelacionesTipoIva.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoIva.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaTransaccionLocal(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoIva.cargarSessionConBeanSwingJInternalFrameTransaccionLocal(false,true,iIndex);
		this.jButtonTransaccionLocalActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaTransaccionLocal();

		//this.jTabbedPaneRelacionesTipoIva.updateUI();
		//this.jTabbedPaneRelacionesTipoIva.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoIva.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("TransaccionLocal")) {
				int row=this.jTableDatosTipoIva.getSelectedRow();
				jButtonTransaccionLocalActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("FacturaDiario")) {
				int row=this.jTableDatosTipoIva.getSelectedRow();
				jButtonFacturaDiarioActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoivaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Transaccion Local")) {

					if(this.isTienePermisosTransaccionLocal && this.tipoivaConstantesFunciones.mostrarTransaccionLocalTipoIva && !TipoIvaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Transaccion Locales"+"("+TransaccionLocalConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Transaccion Locales");

						if(tipoivaConstantesFunciones.resaltarTransaccionLocalTipoIva!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoivaConstantesFunciones.resaltarTransaccionLocalTipoIva);
						}

						jmenuItem.setEnabled(this.tipoivaConstantesFunciones.activarTransaccionLocalTipoIva);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"TransaccionLocal"));

						

						this.jInternalFrameDetalleFormTipoIva.jmenuDetalleTipoIva.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Factura Diario")) {

					if(this.isTienePermisosFacturaDiario && this.tipoivaConstantesFunciones.mostrarFacturaDiarioTipoIva && !TipoIvaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Factura Diarios"+"("+FacturaDiarioConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Factura Diarios");

						if(tipoivaConstantesFunciones.resaltarFacturaDiarioTipoIva!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoivaConstantesFunciones.resaltarFacturaDiarioTipoIva);
						}

						jmenuItem.setEnabled(this.tipoivaConstantesFunciones.activarFacturaDiarioTipoIva);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FacturaDiario"));

						

						this.jInternalFrameDetalleFormTipoIva.jmenuDetalleTipoIva.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoIva(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoIva(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoIva(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoIvaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoIva();
		
		this.cargarCombosFrameForeignKeyTipoIva();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoIva();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoIva();
		}
	}
	
	
	
	public void jButtonNuevoTipoIvaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoivaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
			
			
			if(jTableDatosTipoIva.getRowCount()>=1) {
				jTableDatosTipoIva.removeRowSelectionInterval(0, jTableDatosTipoIva.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoIva=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoIva(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoIva(true);			
			//this.tipoiva=new TipoIva();
			//this.tipoiva.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoIva(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoIva() ;
			
			if(TipoIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoIva(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoiva);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoiva);				
			
			TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
			
			if(this.tipoivaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoIva: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoIvaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoIva> tipoivasSeleccionados=new ArrayList<TipoIva>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoIva.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoIva.getSelectedRows().length;			
			}
			
			tipoivasSeleccionados=this.getTipoIvasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoIva--;			
				//TipoIva tipoivaAux= new TipoIva();			
				//tipoivaAux.setId(this.iIdNuevoTipoIva);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoIva tipoivaOrigen=new TipoIva();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoIva tipoivaOrigen : tipoivasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoIva.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoivaOrigen =(TipoIva) this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoivaOrigen =(TipoIva) this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoIva();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoiva.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoIva(tipoivaOrigen,this.tipoiva,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIva(this.tipoiva);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoivaLogic.getTipoIvas().add(this.tipoivaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoivas.add(this.tipoivaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoIva(false);
				
				this.jTableDatosTipoIva.setRowSelectionInterval(this.getIndiceNuevoTipoIva(), this.getIndiceNuevoTipoIva());
				
				int iLastRow =  this.jTableDatosTipoIva.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoIva.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoIva.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoIva(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoIva> tipoivasSeleccionados=new ArrayList<TipoIva>();									
		
			TipoIva tipoivaOrigen=new TipoIva();
			TipoIva tipoivaDestino=new TipoIva();
				
			tipoivasSeleccionados=this.getTipoIvasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoIva.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoivasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoIva.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoivaOrigen =(TipoIva) this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoivaOrigen =(TipoIva) this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoivaDestino =(TipoIva) this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoivaDestino =(TipoIva) this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoivaOrigen =tipoivasSeleccionados.get(0);
				tipoivaDestino =tipoivasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoIva(tipoivaOrigen,tipoivaDestino,true,false);
				
				tipoivaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoivaDestino,tipoivaLogic.getTipoIvas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoivaDestino,tipoivas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoIva(false);
				
				//this.jTableDatosTipoIva.setRowSelectionInterval(this.getIndiceNuevoTipoIva(), this.getIndiceNuevoTipoIva());
				
				int iLastRow =  this.jTableDatosTipoIva.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoIva.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoIva.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoIva(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoIva.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoIva.isVisible();
			
			
			this.jPanelParametrosReportesTipoIva.setVisible(!isVisible);
			this.jPanelPaginacionTipoIva.setVisible(!isVisible);
			this.jPanelAccionesTipoIva.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoIva();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoIva();
			
			this.abrirFrameOrderByTipoIva();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoIva(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoIva);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoIva.isMaximum()) {
					this.jInternalFrameDetalleFormTipoIva.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoIva.setSize(this.jInternalFrameDetalleFormTipoIva.iWidthFormulario,this.jInternalFrameDetalleFormTipoIva.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoIva.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoIva.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoIva.isMaximum()) {
						this.jInternalFrameDetalleFormTipoIva.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoIva.jContentPaneDetalleTipoIva.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoIva.jTabbedPaneRelacionesTipoIva.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoIva.jContentPaneDetalleTipoIva.getWidth(),TipoIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoIva.jTabbedPaneRelacionesTipoIva.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoIva.jContentPaneDetalleTipoIva.getWidth(),TipoIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoIva.jTabbedPaneRelacionesTipoIva.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoIva.jContentPaneDetalleTipoIva.getWidth(),TipoIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(FacturaDiarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFacturaDiario();
					}

					if(TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaTransaccionLocal();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoIva.setVisible(true);
	        this.jInternalFrameDetalleFormTipoIva.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoIva() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoIva==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoIva,false,this);
				} else {
					this.jInternalFrameOrderByTipoIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoIva,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoIva);
				this.jInternalFrameOrderByTipoIva.setVisible(false);
				this.jInternalFrameOrderByTipoIva.setSelected(false);
				
				this.jInternalFrameOrderByTipoIva.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoIva"));
				
				this.inicializarActualizarBindingTablaOrderByTipoIva();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoIva() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoIva==null) {
				
				this.jInternalFrameImportacionTipoIva=new ImportacionJInternalFrame(TipoIvaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoIva);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoIva);
				this.jInternalFrameImportacionTipoIva.setVisible(false);
				this.jInternalFrameImportacionTipoIva.setSelected(false);


				this.jInternalFrameImportacionTipoIva.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoIva"));
				this.jInternalFrameImportacionTipoIva.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoIva"));
				this.jInternalFrameImportacionTipoIva.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoIva"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoIva() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoIva==null) {
				this.jInternalFrameReporteDinamicoTipoIva=new ReporteDinamicoJInternalFrame(TipoIvaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoIva);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoIva);
				this.jInternalFrameReporteDinamicoTipoIva.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoIva.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoIva.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoIva"));
				this.jInternalFrameReporteDinamicoTipoIva.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoIva"));
				this.jInternalFrameReporteDinamicoTipoIva.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoIva"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoIva();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaFacturaDiario() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.jScrollPanelDatosFacturaDiario.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoIva.jContentPaneDetalleTipoIva.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.jScrollPanelDatosFacturaDiario.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.jScrollPanelDatosFacturaDiario.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.jScrollPanelDatosFacturaDiario.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaTransaccionLocal() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoIva.jContentPaneDetalleTipoIva.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoIva() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoIva);
			
	       	this.jInternalFrameDetalleFormTipoIva.setVisible(false);
	        this.jInternalFrameDetalleFormTipoIva.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoIva.dispose();
			//this.jInternalFrameDetalleFormTipoIva=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoIva() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoIva.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoIva() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoIva.setVisible(true);
	        this.jInternalFrameImportacionTipoIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoIva() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoIva.setVisible(true);
	        this.jInternalFrameOrderByTipoIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoIva() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoIva.setVisible(false);
	        this.jInternalFrameOrderByTipoIva.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoIva() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoIva.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoIva.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoIva() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoIva.setVisible(false);
	        this.jInternalFrameImportacionTipoIva.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoIva(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoIva(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoIva.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoIva(true);
			//this.isEsNuevoTipoIva=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiva =(TipoIva) this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoiva =(TipoIva) this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoIva(false) ;
			
			if(tipoivaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.getEsGuardarRelacionado() && TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTransaccionLocalActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarioSessionBean.getEsGuardarRelacionado() && FacturaDiarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFacturaDiarioActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoIva(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoIva(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoIvaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoiva =(TipoIva) this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoiva =(TipoIva) this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoIva(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoIva.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoIva(true);
			//this.isEsNuevoTipoIva=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiva =(TipoIva) this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoiva =(TipoIva) this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoiva.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoIva(false) ;
			
			if(TipoIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoIva(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoIva(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoIvaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoIva(false);
			
			//if(!this.isEsNuevoTipoIva) {								
				int intSelectedRow = this.jTableDatosTipoIva.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoiva =(TipoIva) this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoiva =(TipoIva) this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoIva(this.tipoiva,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoIva(this.tipoiva);
				
			}
			
			if(this.permiteMantenimiento(this.tipoiva)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoivaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoIva=true;
					this.inicializarActualizarBindingTablaTipoIva(false);
					this.isEsNuevoTipoIva=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoIva=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoIva=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoIva(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoIva(false);
				
				this.habilitarDeshabilitarControlesTipoIva(false);
			
												
				
				if(TipoIvaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoIva();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoIvaActionPerformed(evt,tipoivaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoIva(this.tipoiva,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoIva.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoivaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoiva.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoIva.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIva.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoIvaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoIva.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiva =(TipoIva) this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
				this.tipoiva.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoiva =(TipoIva) this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
				this.tipoiva.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoiva)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoivaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoIvaModel) this.jTableDatosTipoIva.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoIva=true;
				this.inicializarActualizarBindingTablaTipoIva(false);
				this.isEsNuevoTipoIva=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoIva(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoIva(false);
				
				this.habilitarDeshabilitarControlesTipoIva(false);
				
				
				
				if(TipoIvaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoIva();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoIvaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoIva.getRowCount()>=1) {
				jTableDatosTipoIva.removeRowSelectionInterval(0, jTableDatosTipoIva.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoIva(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoIva(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoIva(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoIva(false) ;
			
			this.isEsNuevoTipoIva=false;
			
			if(TipoIvaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoIva();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoIva(false);
				
				//SI ES MANUAL
				if(TipoIvaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoIva();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoIva--;			
			//TipoIva tipoivaAux= new TipoIva();			
			//tipoivaAux.setId(this.iIdNuevoTipoIva);
			
			if(this.jInternalFrameDetalleFormTipoIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoIva();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoIva(this.tipoiva);
			
			this.tipoiva.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoivaLogic.getTipoIvas().add(this.tipoivaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoivas.add(this.tipoivaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoIva(false);
			
			this.jTableDatosTipoIva.setRowSelectionInterval(this.getIndiceNuevoTipoIva(), this.getIndiceNuevoTipoIva());
			
			int iLastRow =  this.jTableDatosTipoIva.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoIva.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoIva.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoIva(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoIva(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoIva(false);
			
			//SI ES MANUAL
			if(TipoIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoIva();
			}
			
			//this.abrirFrameTreeTipoIva();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoIvaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo IvaS ?", "MANTENIMIENTO DE Tipo Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoIva.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoIva();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoivaReturnGeneral=tipoivaLogic.procesarImportacionTipoIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoivaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoIvaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoIvaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoIva.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoIva.setFileImportacion(this.jInternalFrameImportacionTipoIva.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoIva.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoIva.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoIva.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoIva.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoIvaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoIva> tipoivasSeleccionados=new ArrayList<TipoIva>();		

		tipoivasSeleccionados=this.getTipoIvasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoIva.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoIva.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoIvaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoIvaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoIvas("Todos",tipoivasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Iva",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoIva.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoIvaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoIvaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoIva.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoIva.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoIva.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoIvaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoIvaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoIva.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoIvaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoIvaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoIva.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIva.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoIvaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoIvaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoIvaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoIva> tipoivasSeleccionados=new ArrayList<TipoIva>();		
		
		tipoivasSeleccionados=this.getTipoIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoiva";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoIvas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoIva.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoIvaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoIvaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoIva tipoiva:tipoivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoiva.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoIvaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoIvaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoIva tipoiva:tipoivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoiva.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoIva(row);				
			//	iRow++;
			//}				
			
			//for(TipoIva tipoivaAux:tipoivasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoIva(tipoivaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Iva",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoivaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoIva(false);
			
			//SI ES MANUAL
			if(TipoIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoIva();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoIva(false);
			
			//SI ES MANUAL
			if(TipoIvaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoIva();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoIva(false);
			
			//SI ES MANUAL
			if(TipoIvaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoIva();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoIva() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoIva.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoIva.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoIva.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoIva.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoIva.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoIva.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoIva.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoIva(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoIva(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoIva(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoIva(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoIva(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoivaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoIva(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoIva(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoIva(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoIvaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoIvaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoIva() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoIva();
		
		this.inicializarActualizarBindingBotonesManualTipoIva(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoivaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoIva();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoIva() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoIva(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoIva(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoIva.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoIva.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoIva.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoIva!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoIva.jCheckBoxPostAccionNuevoTipoIva.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoIva.jCheckBoxPostAccionSinCerrarTipoIva.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoIva.jCheckBoxPostAccionSinMensajeTipoIva.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoIva.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoIva.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoIva.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoIva!=null) {
				this.jInternalFrameDetalleFormTipoIva.jCheckBoxPostAccionNuevoTipoIva.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoIva.jCheckBoxPostAccionSinCerrarTipoIva.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoIva.jCheckBoxPostAccionSinMensajeTipoIva.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoIva.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoIva.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoIva!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoIva.jComboBoxTiposAccionesFormularioTipoIva.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoIva.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoIva!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoIva.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoIva.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoIva.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoIva.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoIva.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoIva!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoIva.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoIva.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoIva.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoIva(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoIvaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoIva(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoIva() throws Exception {
		try	{
			if(TipoIvaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoIva();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoIva() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoIva.jComboBoxTiposAccionesFormularioTipoIva.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoIva.jComboBoxTiposAccionesFormularioTipoIva.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoIva() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoIva.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoIva.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoIva.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoIva.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoIva.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoIva.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoIva.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoIva.addItem(reporte);
			}
			
			
			if(!this.tipoivaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoIva.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoIva.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoIva.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoIva.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoIva.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoIva.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoIva!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoIva.jComboBoxTiposAccionesFormularioTipoIva.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoIva.jComboBoxTiposAccionesFormularioTipoIva.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoIva.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoIva.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoIva.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoIva();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoIva() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoIva!=null) {
				this.jInternalFrameReporteDinamicoTipoIva.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoIva.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoIva!=null) {
				this.jInternalFrameReporteDinamicoTipoIva.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoIva.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoIva!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoIva.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoIva.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoIva.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoIva.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoIva.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoIva.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoIva()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoIva(Boolean esInicializar) throws Exception {				
		if(TipoIvaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoIva();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoIva() throws Exception {
		this.inicializarActualizarBindingTablaTipoIva(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoIva() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoIva.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoIva.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoIvaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoIva.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoIvaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoIvaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoIvaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoIvaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoIva.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoIvaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoIva.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoIva(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoivaLogic.getTipoIvas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoivas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoIva.setModel(new TipoIvaModel(this.tipoivaLogic.getTipoIvas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoIva.setModel(new TipoIvaModel(this.tipoivas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoIva!=null && this.jInternalFrameOrderByTipoIva.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoIva();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoIva,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoIvaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoIvaConstantesFunciones.SCLASSWEBTITULO,tipoivaConstantesFunciones.resaltarSeleccionarTipoIva,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoIvaConstantesFunciones.SCLASSWEBTITULO,tipoivaConstantesFunciones.resaltarSeleccionarTipoIva,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoIva,TipoIvaConstantesFunciones.LABEL_ID));

		if(this.tipoivaConstantesFunciones.mostraridTipoIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoIvaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoivaConstantesFunciones.resaltaridTipoIva,this.tipoivaConstantesFunciones.activaridTipoIva,this,true,"idTipoIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoivaConstantesFunciones.resaltaridTipoIva,this.tipoivaConstantesFunciones.activaridTipoIva,this,true,"idTipoIva","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoIva,TipoIvaConstantesFunciones.LABEL_CODIGO));

		if(this.tipoivaConstantesFunciones.mostrarcodigoTipoIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoIvaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoivaConstantesFunciones.resaltarcodigoTipoIva,this.tipoivaConstantesFunciones.activarcodigoTipoIva,this,true,"codigoTipoIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoivaConstantesFunciones.resaltarcodigoTipoIva,this.tipoivaConstantesFunciones.activarcodigoTipoIva,this,true,"codigoTipoIva","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoIva,TipoIvaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoivaConstantesFunciones.mostrarnombreTipoIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoIvaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoivaConstantesFunciones.resaltarnombreTipoIva,this.tipoivaConstantesFunciones.activarnombreTipoIva,this,true,"nombreTipoIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoivaConstantesFunciones.resaltarnombreTipoIva,this.tipoivaConstantesFunciones.activarnombreTipoIva,this,true,"nombreTipoIva","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoivaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosTransaccionLocal && this.tipoivaConstantesFunciones.mostrarTransaccionLocalTipoIva && !TipoIvaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Transaccion Locales");
				tableColumn.setHeaderValue("Transaccion Locales");
				tableColumn.setCellRenderer(new TransaccionLocalTableCell(tipoivaConstantesFunciones.resaltarTransaccionLocalTipoIva,this,this.tipoivaConstantesFunciones.activarTransaccionLocalTipoIva));
				tableColumn.setCellEditor(new TransaccionLocalTableCell(tipoivaConstantesFunciones.resaltarTransaccionLocalTipoIva,this,this.tipoivaConstantesFunciones.activarTransaccionLocalTipoIva));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoIva.addColumn(tableColumn);
			}

			if(this.isTienePermisosFacturaDiario && this.tipoivaConstantesFunciones.mostrarFacturaDiarioTipoIva && !TipoIvaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Factura Diarios");
				tableColumn.setHeaderValue("Factura Diarios");
				tableColumn.setCellRenderer(new FacturaDiarioTableCell(tipoivaConstantesFunciones.resaltarFacturaDiarioTipoIva,this,this.tipoivaConstantesFunciones.activarFacturaDiarioTipoIva));
				tableColumn.setCellEditor(new FacturaDiarioTableCell(tipoivaConstantesFunciones.resaltarFacturaDiarioTipoIva,this,this.tipoivaConstantesFunciones.activarFacturaDiarioTipoIva));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoIva.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoivaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoivaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoIva.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoivaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoivaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoIva.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoIva && this.isPermisoGuardarCambiosTipoIva) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoivaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoivaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoIva.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoivaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoIva.addColumn(tableColumn);
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
			
			this.jTableDatosTipoIva.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoIva && this.isPermisoGuardarCambiosTipoIva) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoivaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoIva && this.isPermisoGuardarCambiosTipoIva) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoIva.moveColumn(this.jTableDatosTipoIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoIva.moveColumn(this.jTableDatosTipoIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoivaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoIva.moveColumn(this.jTableDatosTipoIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoIva.moveColumn(this.jTableDatosTipoIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoIva.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoIva.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoIva,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoIva.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoIva.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoIva.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoIva.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoIva.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoivaLogic.getTipoIvas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoivas.size()-1;
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
		//this.jTableDatosTipoIva.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoIva();
			
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
				
				//this.isEsNuevoTipoIva=false;
					
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
			
				if(this.tipoivaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoIva==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoIva.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoIva.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoiva =(TipoIva) this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoiva =(TipoIva) this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoiva.getsType().equals("DUPLICADO")
				   || this.tipoiva.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoIva=true;
				
				} else {
					this.isEsNuevoTipoIva=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoivaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoiva.getId()>=0 && !this.tipoiva.getIsNew()) {						
						this.isEsNuevoTipoIva=false;
						
					} else {
						this.isEsNuevoTipoIva=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoIva(esRelaciones);						
				
				this.seleccionarTipoIva(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoiva.getId()<0) {
					this.isEsNuevoTipoIva=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoIva(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoIva(evt,rowIndex);
				}	
				
				if(this.tipoivaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoIva: " + this.dDif); 
					}
				}								
				
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoIva(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoiva)) {
					if(this.tipoiva.getId()>0) {
						this.tipoiva.setIsDeleted(true);
						
						this.tipoivasEliminados.add(this.tipoiva);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoivaLogic.getTipoIvas().remove(this.tipoiva);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoivas.remove(this.tipoiva);				
					}
					
					
					((TipoIvaModel) this.jTableDatosTipoIva.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoIva(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoIva(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoIva) {
			
			if(this.jInternalFrameDetalleFormTipoIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoIva.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoIva.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoiva =(TipoIva) this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoiva =(TipoIva) this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoIva(this.tipoiva);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoIva("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoIva(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoIva() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoIva(TipoIva tipoiva) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoIva(tipoiva,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoIva(TipoIva tipoiva,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoIva(tipoiva);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoIva(tipoiva,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoIva(tipoiva);
	}
	
	public void setVariablesObjetoActualToFormularioTipoIva(TipoIva tipoiva) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoIva.jTextFieldidTipoIva.setText(tipoiva.getId().toString());
			this.jInternalFrameDetalleFormTipoIva.jTextFieldcodigoTipoIva.setText(tipoiva.getcodigo());
			this.jInternalFrameDetalleFormTipoIva.jTextAreanombreTipoIva.setText(tipoiva.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoIva tipoivaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoivaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoIva tipoivaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoivaLocal=this.tipoiva;
			} else {
				tipoivaLocal=this.tipoivaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoivaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoIva(tipoivaLocal,true);
					
					if(tipoivaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoivaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoivaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoivaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoIva(TipoIva tipoiva,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoIva(tipoiva,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoIva(tipoiva);
	}
	
	public void setVariablesFormularioToObjetoActualTipoIva(TipoIva tipoiva,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoIva(tipoiva,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoIva(TipoIva tipoiva,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoIva.jTextFieldidTipoIva.getText()==null || this.jInternalFrameDetalleFormTipoIva.jTextFieldidTipoIva.getText()=="" || this.jInternalFrameDetalleFormTipoIva.jTextFieldidTipoIva.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoIva.jTextFieldidTipoIva.setText("0");
			}

			if(conColumnasBase) {tipoiva.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoIva.jTextFieldidTipoIva.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoIvaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoIva.jLabelIdTipoIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoiva.setcodigo(this.jInternalFrameDetalleFormTipoIva.jTextFieldcodigoTipoIva.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoIvaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoIva.jLabelcodigoTipoIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoiva.setnombre(this.jInternalFrameDetalleFormTipoIva.jTextAreanombreTipoIva.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoIvaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoIva.jLabelnombreTipoIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoIva(TipoIva tipoivaBean,TipoIva tipoiva,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoIva(TipoIva tipoivaOrigen,TipoIva tipoiva,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoivaOrigen.getId()!=null && !tipoivaOrigen.getId().equals(0L))) {tipoiva.setId(tipoivaOrigen.getId());}}
			if(conDefault || (!conDefault && tipoivaOrigen.getcodigo()!=null && !tipoivaOrigen.getcodigo().equals(""))) {tipoiva.setcodigo(tipoivaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoivaOrigen.getnombre()!=null && !tipoivaOrigen.getnombre().equals(""))) {tipoiva.setnombre(tipoivaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoIva(TipoIva tipoiva) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoIva.jTextFieldidTipoIva.setText(tipoiva.getId().toString());
			this.jInternalFrameDetalleFormTipoIva.jTextFieldcodigoTipoIva.setText(tipoiva.getcodigo());
			this.jInternalFrameDetalleFormTipoIva.jTextAreanombreTipoIva.setText(tipoiva.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoIva(TipoIvaBean tipoivaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoIva.jTextFieldidTipoIva.setText(tipoivaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoIva.jTextFieldcodigoTipoIva.setText(tipoivaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoIva.jTextAreanombreTipoIva.setText(tipoivaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoIva(TipoIvaParameterReturnGeneral tipoivaReturnGeneral,TipoIvaBean tipoivaBean,Boolean conDefault) throws Exception { 
		try {
			TipoIva tipoivaLocal=new TipoIva();
			
			tipoivaLocal=tipoivaReturnGeneral.getTipoIva();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoivaLocal.getId()!=null && !tipoivaLocal.getId().equals(0L))) {tipoivaBean.setId(tipoivaLocal.getId());}}
			if(conDefault || (!conDefault && tipoivaLocal.getcodigo()!=null && !tipoivaLocal.getcodigo().equals(""))) {tipoivaBean.setcodigo(tipoivaLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoivaLocal.getnombre()!=null && !tipoivaLocal.getnombre().equals(""))) {tipoivaBean.setnombre(tipoivaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoIvaGenerico(Long idTipoIvaSeleccionado,JComboBox jComboBoxTipoIva,List<TipoIva> tipoivasLocal)throws Exception {
		try {
			TipoIva  tipoivaTemp=null;

			for(TipoIva tipoivaAux:tipoivasLocal) {
				if(tipoivaAux.getId()!=null && tipoivaAux.getId().equals(idTipoIvaSeleccionado)) {
					tipoivaTemp=tipoivaAux;
					break;
				}
			}

			jComboBoxTipoIva.setSelectedItem(tipoivaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoIvaGenerico(JComboBox jComboBoxTipoIva,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoIva.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoIva.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoIva.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoIva.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("TransaccionLocal")) {
			jButtonTransaccionLocalActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("FacturaDiario")) {
			jButtonFacturaDiarioActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoiva=(TipoIva) tipoivaLogic.getTipoIvas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoiva =(TipoIva) tipoivas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoIva tipoivaRow=new TipoIva();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoivaRow=(TipoIva) tipoivaLogic.getTipoIvas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoivaRow=(TipoIva) tipoivas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonTransaccionLocalActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoIva tipoiva) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoIva==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoiva = (TipoIva)this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoiva = (TipoIva)this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoiva!=null) {
						this.tipoiva = tipoiva;
					} else {
						this.tipoiva = new TipoIva();
					}
				}

				if(this.isTienePermisosTransaccionLocal && this.permiteMantenimiento(this.tipoiva)) {
					TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFramePopup=new TransaccionLocalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						transaccionlocalBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFramePopup;
					} else {
						transaccionlocalBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame;
					}

					List<TipoIva> tipoivas=new ArrayList<TipoIva>();
					tipoivas.add(this.tipoiva);
					if(!esRelacionado) {
						//transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setConGuardarRelaciones(false);
						//transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					transaccionlocalBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoIva.cargarTransaccionLocalBeanSwingJInternalFrame(tipoivas,this.tipoiva,transaccionlocalBeanSwingJInternalFrame,/*conInicializar,*/transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.getConGuardarRelaciones(),transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.getEsGuardarRelacionado());
					transaccionlocalBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						transaccionlocalBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccionLocal("no_relacionado");

						transaccionlocalBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(TransaccionLocalConstantesFunciones.ITAMANIOFILATABLA + (TransaccionLocalConstantesFunciones.ITAMANIOFILATABLA/2));

						transaccionlocalBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoIva=(TitledBorder)this.jScrollPanelDatosTipoIva.getBorder();
						TitledBorder titledBorderTransaccionLocal=(TitledBorder)transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.getBorder();

						titledBorderTransaccionLocal.setTitle(titledBorderTipoIva.getTitle() + " -> Transaccion Local");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,transaccionlocalBeanSwingJInternalFrame);
						}

						transaccionlocalBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(transaccionlocalBeanSwingJInternalFrame);

						transaccionlocalBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoivaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Transaccion Local",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonFacturaDiarioActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoIva tipoiva) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoIva==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoiva = (TipoIva)this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoiva = (TipoIva)this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoiva!=null) {
						this.tipoiva = tipoiva;
					} else {
						this.tipoiva = new TipoIva();
					}
				}

				if(this.isTienePermisosFacturaDiario && this.permiteMantenimiento(this.tipoiva)) {
					FacturaDiarioBeanSwingJInternalFrame facturadiarioBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFramePopup=new FacturaDiarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						facturadiarioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFramePopup;
					} else {
						facturadiarioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame;
					}

					List<TipoIva> tipoivas=new ArrayList<TipoIva>();
					tipoivas.add(this.tipoiva);
					if(!esRelacionado) {
						//facturadiarioBeanSwingJInternalFrame.facturadiarioSessionBean.setConGuardarRelaciones(false);
						//facturadiarioBeanSwingJInternalFrame.facturadiarioSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					facturadiarioBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoIva.cargarFacturaDiarioBeanSwingJInternalFrame(tipoivas,this.tipoiva,facturadiarioBeanSwingJInternalFrame,/*conInicializar,*/facturadiarioBeanSwingJInternalFrame.facturadiarioSessionBean.getConGuardarRelaciones(),facturadiarioBeanSwingJInternalFrame.facturadiarioSessionBean.getEsGuardarRelacionado());
					facturadiarioBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						facturadiarioBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaDiario("no_relacionado");

						facturadiarioBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FacturaDiarioConstantesFunciones.ITAMANIOFILATABLA + (FacturaDiarioConstantesFunciones.ITAMANIOFILATABLA/2));

						facturadiarioBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoIva=(TitledBorder)this.jScrollPanelDatosTipoIva.getBorder();
						TitledBorder titledBorderFacturaDiario=(TitledBorder)facturadiarioBeanSwingJInternalFrame.jScrollPanelDatosFacturaDiario.getBorder();

						titledBorderFacturaDiario.setTitle(titledBorderTipoIva.getTitle() + " -> Factura Diario");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,facturadiarioBeanSwingJInternalFrame);
						}

						facturadiarioBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(facturadiarioBeanSwingJInternalFrame);

						facturadiarioBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoivaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Factura Diario",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoIva(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoIva.setVisible((this.isVisibilidadCeldaNuevoTipoIva && this.isPermisoNuevoTipoIva));			
			this.jButtonDuplicarTipoIva.setVisible((this.isVisibilidadCeldaDuplicarTipoIva && this.isPermisoDuplicarTipoIva));			
			this.jButtonCopiarTipoIva.setVisible((this.isVisibilidadCeldaCopiarTipoIva && this.isPermisoCopiarTipoIva));
			this.jButtonVerFormTipoIva.setVisible((this.isVisibilidadCeldaVerFormTipoIva && this.isPermisoVerFormTipoIva));
			
			this.jButtonAbrirOrderByTipoIva.setVisible((this.isVisibilidadCeldaOrdenTipoIva && this.isPermisoOrdenTipoIva));			
			
			this.jButtonNuevoRelacionesTipoIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoIva && this.isPermisoNuevoTipoIva));			
			this.jButtonNuevoGuardarCambiosTipoIva.setVisible((this.isVisibilidadCeldaNuevoTipoIva && this.isPermisoNuevoTipoIva && this.isPermisoGuardarCambiosTipoIva));
			
			if(this.jInternalFrameDetalleFormTipoIva!=null) {
			this.jInternalFrameDetalleFormTipoIva.jButtonModificarTipoIva.setVisible((this.isVisibilidadCeldaModificarTipoIva && this.isPermisoActualizarTipoIva));	
			this.jInternalFrameDetalleFormTipoIva.jButtonActualizarTipoIva.setVisible((this.isVisibilidadCeldaActualizarTipoIva && this.isPermisoActualizarTipoIva));	
			this.jInternalFrameDetalleFormTipoIva.jButtonEliminarTipoIva.setVisible((this.isVisibilidadCeldaEliminarTipoIva && this.isPermisoEliminarTipoIva));
			this.jInternalFrameDetalleFormTipoIva.jButtonCancelarTipoIva.setVisible(this.isVisibilidadCeldaCancelarTipoIva);							
			this.jInternalFrameDetalleFormTipoIva.jButtonGuardarCambiosTipoIva.setVisible((this.isVisibilidadCeldaGuardarTipoIva && this.isPermisoGuardarCambiosTipoIva));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoIva.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoIva && this.isPermisoGuardarCambiosTipoIva));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoIva.setVisible((this.isVisibilidadCeldaNuevoTipoIva && this.isPermisoNuevoTipoIva));						
			this.jButtonDuplicarToolBarTipoIva.setVisible((this.isVisibilidadCeldaDuplicarTipoIva && this.isPermisoDuplicarTipoIva));						
			this.jButtonCopiarToolBarTipoIva.setVisible((this.isVisibilidadCeldaCopiarTipoIva && this.isPermisoCopiarTipoIva));			
			this.jButtonVerFormToolBarTipoIva.setVisible((this.isVisibilidadCeldaVerFormTipoIva && this.isPermisoVerFormTipoIva));			
			this.jButtonAbrirOrderByToolBarTipoIva.setVisible((this.isVisibilidadCeldaOrdenTipoIva && this.isPermisoOrdenTipoIva));
			this.jButtonNuevoRelacionesToolBarTipoIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoIva && this.isPermisoNuevoTipoIva));			
			this.jButtonNuevoGuardarCambiosToolBarTipoIva.setVisible((this.isVisibilidadCeldaNuevoTipoIva && this.isPermisoNuevoTipoIva && this.isPermisoGuardarCambiosTipoIva));			
			
			if(this.jInternalFrameDetalleFormTipoIva!=null) {
			this.jInternalFrameDetalleFormTipoIva.jButtonModificarToolBarTipoIva.setVisible((this.isVisibilidadCeldaModificarTipoIva && this.isPermisoActualizarTipoIva));	
			this.jInternalFrameDetalleFormTipoIva.jButtonActualizarToolBarTipoIva.setVisible((this.isVisibilidadCeldaActualizarTipoIva  && this.isPermisoActualizarTipoIva));	
			this.jInternalFrameDetalleFormTipoIva.jButtonEliminarToolBarTipoIva.setVisible((this.isVisibilidadCeldaEliminarTipoIva && this.isPermisoEliminarTipoIva));
			this.jInternalFrameDetalleFormTipoIva.jButtonCancelarToolBarTipoIva.setVisible(this.isVisibilidadCeldaCancelarTipoIva);				
			this.jInternalFrameDetalleFormTipoIva.jButtonGuardarCambiosToolBarTipoIva.setVisible((this.isVisibilidadCeldaGuardarTipoIva && this.isPermisoGuardarCambiosTipoIva));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoIva.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoIva && this.isPermisoGuardarCambiosTipoIva));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoIva.setVisible((this.isVisibilidadCeldaNuevoTipoIva && this.isPermisoNuevoTipoIva));			
			this.jMenuItemDuplicarTipoIva.setVisible((this.isVisibilidadCeldaDuplicarTipoIva && this.isPermisoDuplicarTipoIva));			
			this.jMenuItemCopiarTipoIva.setVisible((this.isVisibilidadCeldaCopiarTipoIva && this.isPermisoCopiarTipoIva));			
			this.jMenuItemVerFormTipoIva.setVisible((this.isVisibilidadCeldaVerFormTipoIva && this.isPermisoVerFormTipoIva));			
			this.jMenuItemAbrirOrderByTipoIva.setVisible((this.isVisibilidadCeldaOrdenTipoIva && this.isPermisoOrdenTipoIva));			
			//this.jMenuItemMostrarOcultarTipoIva.setVisible((this.isVisibilidadCeldaOrdenTipoIva && this.isPermisoOrdenTipoIva));
			this.jMenuItemDetalleAbrirOrderByTipoIva.setVisible((this.isVisibilidadCeldaOrdenTipoIva && this.isPermisoOrdenTipoIva));			
			//this.jMenuItemDetalleMostrarOcultarTipoIva.setVisible((this.isVisibilidadCeldaOrdenTipoIva && this.isPermisoOrdenTipoIva));			
			this.jMenuItemNuevoRelacionesTipoIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoIva && this.isPermisoNuevoTipoIva));			
			this.jMenuItemNuevoGuardarCambiosTipoIva.setVisible((this.isVisibilidadCeldaNuevoTipoIva && this.isPermisoNuevoTipoIva && this.isPermisoGuardarCambiosTipoIva));									
			
			if(this.jInternalFrameDetalleFormTipoIva!=null) {
			this.jInternalFrameDetalleFormTipoIva.jMenuItemModificarTipoIva.setVisible((this.isVisibilidadCeldaModificarTipoIva && this.isPermisoActualizarTipoIva));	
			this.jInternalFrameDetalleFormTipoIva.jMenuItemActualizarTipoIva.setVisible((this.isVisibilidadCeldaActualizarTipoIva && this.isPermisoActualizarTipoIva));	
			this.jInternalFrameDetalleFormTipoIva.jMenuItemEliminarTipoIva.setVisible((this.isVisibilidadCeldaEliminarTipoIva && this.isPermisoEliminarTipoIva));
			this.jInternalFrameDetalleFormTipoIva.jMenuItemCancelarTipoIva.setVisible(this.isVisibilidadCeldaCancelarTipoIva);				
			}
			
			this.jMenuItemGuardarCambiosTipoIva.setVisible((this.isVisibilidadCeldaGuardarTipoIva && this.isPermisoGuardarCambiosTipoIva));						
			this.jMenuItemGuardarCambiosTablaTipoIva.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoIva && this.isPermisoGuardarCambiosTipoIva));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoIva=this.jButtonNuevoTipoIva.isVisible();
			this.isVisibilidadCeldaDuplicarTipoIva=this.jButtonDuplicarTipoIva.isVisible();
			this.isVisibilidadCeldaCopiarTipoIva=this.jButtonCopiarTipoIva.isVisible();
			this.isVisibilidadCeldaVerFormTipoIva=this.jButtonVerFormTipoIva.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoIva=this.jButtonAbrirOrderByTipoIva.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoIva=this.jButtonNuevoRelacionesTipoIva.isVisible();
			this.isVisibilidadCeldaModificarTipoIva=this.jButtonModificarTipoIva.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoIva!=null) {
			this.isVisibilidadCeldaActualizarTipoIva=this.jInternalFrameDetalleFormTipoIva.jButtonActualizarTipoIva.isVisible();
			this.isVisibilidadCeldaEliminarTipoIva=this.jInternalFrameDetalleFormTipoIva.jButtonEliminarTipoIva.isVisible();
			this.isVisibilidadCeldaCancelarTipoIva=this.jInternalFrameDetalleFormTipoIva.jButtonCancelarTipoIva.isVisible();
			this.isVisibilidadCeldaGuardarTipoIva=this.jInternalFrameDetalleFormTipoIva.jButtonGuardarCambiosTipoIva.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoIva=this.jButtonGuardarCambiosTablaTipoIva.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoIva=this.jButtonNuevoToolBarTipoIva.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoIva=this.jButtonNuevoRelacionesToolBarTipoIva.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoIva!=null) {
			this.isVisibilidadCeldaModificarTipoIva=this.jInternalFrameDetalleFormTipoIva.jButtonModificarToolBarTipoIva.isVisible();
			this.isVisibilidadCeldaActualizarTipoIva=this.jInternalFrameDetalleFormTipoIva.jButtonActualizarToolBarTipoIva.isVisible();
			this.isVisibilidadCeldaEliminarTipoIva=this.jInternalFrameDetalleFormTipoIva.jButtonEliminarToolBarTipoIva.isVisible();
			this.isVisibilidadCeldaCancelarTipoIva=this.jInternalFrameDetalleFormTipoIva.jButtonCancelarToolBarTipoIva.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoIva=this.jButtonGuardarCambiosToolBarTipoIva.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoIva=this.jButtonGuardarCambiosTablaToolBarTipoIva.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoIva=this.jMenuItemNuevoTipoIva.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoIva=this.jMenuItemNuevoRelacionesTipoIva.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoIva!=null) {
			this.isVisibilidadCeldaModificarTipoIva=this.jInternalFrameDetalleFormTipoIva.jMenuItemModificarTipoIva.isVisible();
			this.isVisibilidadCeldaActualizarTipoIva=this.jInternalFrameDetalleFormTipoIva.jMenuItemActualizarTipoIva.isVisible();
			this.isVisibilidadCeldaEliminarTipoIva=this.jInternalFrameDetalleFormTipoIva.jMenuItemEliminarTipoIva.isVisible();
			this.isVisibilidadCeldaCancelarTipoIva=this.jInternalFrameDetalleFormTipoIva.jMenuItemCancelarTipoIva.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoIva=this.jMenuItemGuardarCambiosTipoIva.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoIva=this.jMenuItemGuardarCambiosTablaTipoIva.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoIva(Boolean esInicializar) {
		if(TipoIvaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoivaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoivaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoIva();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoIva(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoIva() {
		this.jButtonNuevoTipoIva.setVisible(this.isPermisoNuevoTipoIva);			
		this.jButtonDuplicarTipoIva.setVisible(this.isPermisoDuplicarTipoIva);			
		this.jButtonCopiarTipoIva.setVisible(this.isPermisoCopiarTipoIva);			
		this.jButtonVerFormTipoIva.setVisible(this.isPermisoVerFormTipoIva);			
		
		this.jButtonAbrirOrderByTipoIva.setVisible(this.isPermisoOrdenTipoIva);					
		
		this.jButtonNuevoRelacionesTipoIva.setVisible(this.isPermisoNuevoTipoIva);			
		
		if(this.jInternalFrameDetalleFormTipoIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIva.jButtonModificarTipoIva.setVisible(this.isPermisoActualizarTipoIva);	
			this.jInternalFrameDetalleFormTipoIva.jButtonActualizarTipoIva.setVisible(this.isPermisoActualizarTipoIva);	
			this.jInternalFrameDetalleFormTipoIva.jButtonEliminarTipoIva.setVisible(this.isPermisoEliminarTipoIva);
			this.jInternalFrameDetalleFormTipoIva.jButtonCancelarTipoIva.setVisible(this.isVisibilidadCeldaCancelarTipoIva);						
			this.jInternalFrameDetalleFormTipoIva.jButtonGuardarCambiosTipoIva.setVisible(this.isPermisoGuardarCambiosTipoIva);							
		}
		
		this.jButtonGuardarCambiosTablaTipoIva.setVisible(this.isPermisoActualizarTipoIva);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoIva() {
		this.jInternalFrameDetalleFormTipoIva.jButtonModificarTipoIva.setVisible(this.isPermisoActualizarTipoIva);	
		this.jInternalFrameDetalleFormTipoIva.jButtonActualizarTipoIva.setVisible(this.isPermisoActualizarTipoIva);	
		this.jInternalFrameDetalleFormTipoIva.jButtonEliminarTipoIva.setVisible(this.isPermisoEliminarTipoIva);
		this.jInternalFrameDetalleFormTipoIva.jButtonCancelarTipoIva.setVisible(this.isVisibilidadCeldaCancelarTipoIva);							
		this.jInternalFrameDetalleFormTipoIva.jButtonGuardarCambiosTipoIva.setVisible((this.isVisibilidadCeldaGuardarTipoIva && this.isPermisoGuardarCambiosTipoIva));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoIva() {
		if(TipoIvaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoIva();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoIva() {
	}
	
	public void jTableDatosTipoIvaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoIva(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoIva(this.gettipoiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIva(this.tipoiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoiva =(TipoIva) this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoiva =(TipoIva) this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoiva==null) {
						this.tipoiva = new TipoIva();
					}

					this.setVariablesFormularioToObjetoActualTipoIva(this.tipoiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIva(this.tipoiva);
				}

				if(this.tipoiva.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoiva.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoIva(this.gettipoiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIva(this.tipoiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoiva =(TipoIva) this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoiva =(TipoIva) this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoiva==null) {
						this.tipoiva = new TipoIva();
					}

					this.setVariablesFormularioToObjetoActualTipoIva(this.tipoiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIva(this.tipoiva);
				}

				if(this.tipoiva.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoiva.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoIva(this.gettipoiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIva(this.tipoiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoiva =(TipoIva) this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoiva =(TipoIva) this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoiva==null) {
						this.tipoiva = new TipoIva();
					}

					this.setVariablesFormularioToObjetoActualTipoIva(this.tipoiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIva(this.tipoiva);
				}

				if(this.tipoiva.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoiva.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoIva() {
		if(this.jInternalFrameDetalleFormTipoIva!=null) {
		

		if(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoIva!=null) {
			this.jInternalFrameDetalleFormTipoIva.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoIva.dispose();
			this.jInternalFrameDetalleFormTipoIva=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoIva!=null) {
			this.jInternalFrameReporteDinamicoTipoIva.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoIva.dispose();
			this.jInternalFrameReporteDinamicoTipoIva=null;
		}
		
		if(this.jInternalFrameImportacionTipoIva!=null) {
			this.jInternalFrameImportacionTipoIva.setVisible(false);	    			
			this.jInternalFrameImportacionTipoIva.dispose();
			this.jInternalFrameImportacionTipoIva=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoIva();
			
			TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoIva")) {
				jButtonNuevoTipoIvaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoIva")) {
				jButtonDuplicarTipoIvaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoIva")) {
				jButtonCopiarTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoIva")) {
				jButtonVerFormTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoIva")) {
				jButtonNuevoTipoIvaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoIva")) {
				jButtonDuplicarTipoIvaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoIva")) {
				jButtonNuevoTipoIvaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoIva")) {
				jButtonDuplicarTipoIvaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoIva")) {
				jButtonNuevoTipoIvaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoIva")) {
				jButtonNuevoTipoIvaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoIva")) {
				jButtonNuevoTipoIvaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoIva")) {
				jButtonModificarTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoIva")) {
				jButtonModificarTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoIva")) {
				jButtonModificarTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoIva")) {
				jButtonActualizarTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoIva")) {
				jButtonActualizarTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoIva")) {
				jButtonActualizarTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoIva")) {
				jButtonEliminarTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoIva")) {
				jButtonEliminarTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoIva")) {
				jButtonEliminarTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoIva")) {
				jButtonCancelarTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoIva")) {
				jButtonCancelarTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoIva")) {
				jButtonCancelarTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoIva")) {
				jButtonCerrarTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoIva")) {
				jButtonCerrarTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoIva")) {
				jButtonCerrarTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoIva")) {
				jButtonMostrarOcultarTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoIva")) {
				jButtonCancelarTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoIva")) {
				jButtonGuardarCambiosTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoIva")) {
				jButtonGuardarCambiosTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoIva")) {
				jButtonCopiarTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoIva")) {
				jButtonVerFormTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoIva")) {
				jButtonGuardarCambiosTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoIva")) {
				jButtonCopiarTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoIva")) {
				jButtonVerFormTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoIva")) {
				jButtonGuardarCambiosTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoIva")) {
				jButtonGuardarCambiosTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoIva")) {
				jButtonGuardarCambiosTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoIva")) {
				jButtonRecargarInformacionTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoIva")) {
				jButtonRecargarInformacionTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoIva")) {
				jButtonRecargarInformacionTipoIvaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoIva")) {
				jButtonAnterioresTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoIva")) {
				jButtonAnterioresTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoIva")) {
				jButtonAnterioresTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoIva")) {
				jButtonSiguientesTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoIva")) {
				jButtonSiguientesTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoIva")) {
				jButtonSiguientesTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoIva") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoIva")) {
				jButtonAbrirOrderByTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoIva") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoIva")) {
				jButtonMostrarOcultarTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoIva")) {
				jButtonNuevoGuardarCambiosTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoIva")) {
				jButtonNuevoGuardarCambiosTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoIva")) {
				jButtonNuevoGuardarCambiosTipoIvaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoIva")) {
				jButtonCerrarReporteDinamicoTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoIva")) {
				jButtonGenerarReporteDinamicoTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoIva")) {
				
				jButtonGenerarExcelReporteDinamicoTipoIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoIva")) {
				jButtonCerrarImportacionTipoIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoIva")) {
				
				jButtonGenerarImportacionTipoIvaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoIva")) {
				
				jButtonAbrirImportacionTipoIvaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoIva")) {
				jComboBoxTiposAccionesTipoIvaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoIva")) {
				jComboBoxTiposRelacionesTipoIvaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoIva")) {
				jComboBoxTiposAccionesTipoIvaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoIva")) {
				
				jComboBoxTiposSeleccionarTipoIvaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoIva")) {
				jTextFieldValorCampoGeneralTipoIvaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoIva")) {
				jButtonAbrirOrderByTipoIvaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoIva")) {
				jButtonAbrirOrderByTipoIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoIva")) {
				jButtonCerrarOrderByTipoIvaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoIvaBusqueda")) {
				this.jButtonidTipoIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoIvaBusqueda")) {
				this.jButtoncodigoTipoIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoIvaBusqueda")) {
				this.jButtonnombreTipoIvaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoIva();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIvaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoiva);
				
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
				
				


				
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoIva tipoivaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoivaLocal=this.tipoiva;
			} else {
				tipoivaLocal=this.tipoivaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoiva);
				
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
							
				
				


				
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaAnterior =(TipoIva) this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoivaAnterior =(TipoIva) this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
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
			
			TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
			
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
			
			


			
			TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIvaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoiva);
				
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
								
						
				


				
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIva.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoiva);
				
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
								
				
				


				
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaAnterior =(TipoIva) this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoivaAnterior =(TipoIva) this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoiva);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaAnterior =(TipoIva) this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoivaAnterior =(TipoIva) this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIvaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoiva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoiva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoiva);
				
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
							
				
				


				
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIva.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIvaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoIva.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoivaAnterior =(TipoIva) this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoivaAnterior =(TipoIva) this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
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
			
			TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
			
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
			
			


			
			TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIvaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoiva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoiva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoiva);
				
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
								
				
				


				
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaAnterior =(TipoIva) this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoivaAnterior =(TipoIva) this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIvaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoiva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoiva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIvaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoiva);
				
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoIva")) {
					jCheckBoxSeleccionarTodosTipoIvaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoIva")) {
					jCheckBoxSeleccionadosTipoIvaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoIva")) {
					
				}
				
				


				
				
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoiva);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoiva);
				
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
												
				
				


				
				
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIvaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoIva.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoivaAnterior =(TipoIva) this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoivaAnterior =(TipoIva) this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIvaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoiva);
				
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
				
				
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
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
			
			TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
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
			
			


			
			TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIvaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoiva);
				
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIva.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIva.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoiva);
				
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
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
				
				


				
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIva.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaAnterior =(TipoIva) this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoivaAnterior =(TipoIva) this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoIva")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoIvaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoIva.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoiva =(TipoIva) this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoiva =(TipoIva) this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoiva);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoIva")) {
				
				}
				
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoIva")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoIva.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoIva")) {
			
			}
			
			TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoIva();
			
			TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoIva")) {
				jButtonNuevoTipoIvaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoIva")) {
				jButtonDuplicarTipoIvaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoIva")) {
				jButtonCopiarTipoIvaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoIva")) {
				jButtonVerFormTipoIvaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoIva")) {
				jButtonNuevoTipoIvaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoIva")) {
				jButtonModificarTipoIvaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoIva")) {
				jButtonActualizarTipoIvaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoIva")) {
				jButtonEliminarTipoIvaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoIva")) {
				jButtonGuardarCambiosTipoIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoIva")) {
				jButtonCancelarTipoIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoIva")) {
				jButtonCerrarTipoIvaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoIva")) {
				jButtonGuardarCambiosTipoIvaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoIva")) {
				jButtonNuevoGuardarCambiosTipoIvaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoIva")) {
				jButtonAbrirOrderByTipoIvaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoIva")) {
				jButtonRecargarInformacionTipoIvaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoIva")) {
				jButtonAnterioresTipoIvaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoIva")) {
				jButtonSiguientesTipoIvaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoIvaBusqueda")) {
				this.jButtonidTipoIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoIvaBusqueda")) {
				this.jButtoncodigoTipoIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoIvaBusqueda")) {
				this.jButtonnombreTipoIvaBusquedaActionPerformed(evt);
			}
			
			TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoIva();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoIva")) {
				closingInternalFrameTipoIva();
				
			} else if(sTipo.equals("jButtonCancelarTipoIva")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoIva = (JInternalFrameBase)evt.getSource();
	            	
	            TipoIvaBeanSwingJInternalFrame jInternalFrameParent=(TipoIvaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoIva.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoIvaActionPerformed(null);
			}
			
			TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoiva,new Object(),this.tipoivaParameterGeneral,this.tipoivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoIva(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoIva(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoIva(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoiva)) {
			if(!esControlTabla) {
				if(TipoIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoIva(this.tipoiva,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIva(this.tipoiva);			
				}
				
				if(this.tipoivaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoIva(this.tipoiva,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoivaReturnGeneral=tipoivaLogic.procesarEventosTipoIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoivaLogic.getTipoIvas(),this.tipoiva,this.tipoivaParameterGeneral,this.isEsNuevoTipoIva,classes);//this.tipoivaLogic.getTipoIva()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoIva(this.tipoivaReturnGeneral,this.tipoivaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoivaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoIva(classes,this.tipoivaReturnGeneral,this.tipoivaBean,false);
					}
						
					if(this.tipoivaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoIva(this.tipoivaReturnGeneral.getTipoIva());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoIva(this.tipoivaReturnGeneral.getTipoIva());	
					}
						
					if(this.tipoivaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoIva(this.tipoivaReturnGeneral.getTipoIva(),classes);//this.tipoivaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoIva(this.tipoiva,classes);//this.tipoivaBean);									
				}
			
				if(TipoIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoIva(this.tipoiva,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIva(this.tipoiva);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoivaAnterior!=null) {
						this.tipoiva=this.tipoivaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoivaReturnGeneral=tipoivaLogic.procesarEventosTipoIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoivaLogic.getTipoIvas(),this.tipoiva,this.tipoivaParameterGeneral,this.isEsNuevoTipoIva,classes);//this.tipoivaLogic.getTipoIva()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoivaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoivaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoivaReturnGeneral.getTipoIva(),tipoivaLogic.getTipoIvas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoivaReturnGeneral.getTipoIva(),this.tipoivas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoIva.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoIva.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoIva();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoIva() throws Exception {
		
		TipoIvaModel tipoivaModel=(TipoIvaModel)this.jTableDatosTipoIva.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoivaModel.tipoivas=this.tipoivaLogic.getTipoIvas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoivaModel.tipoivas=this.tipoivas;
		}
		
		
		((TipoIvaModel) this.jTableDatosTipoIva.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoIva() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoivaAnterior(),this.tipoivaLogic.getTipoIvas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoivaAnterior(),this.tipoivas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoIva();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoIva(TipoIva tipoiva,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(TransaccionLocal.class)) {
					this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(tipoiva.getTransaccionLocals());
					this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccionLocal(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaDiario.class)) {
					this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.setFacturaDiarios(tipoiva.getFacturaDiarios());
					this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaDiario(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
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
										
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoiva,new Object(),generalEntityParameterGeneral,this.tipoivaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoivaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoIvaConstantesFunciones.getClassesRelationshipsOfTipoIva(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoIvaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoIva(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoIva(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoiva,new Object(),generalEntityParameterGeneral,this.tipoivaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoIva(TipoIvaBean tipoivaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(TransaccionLocal.class)) {
					this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(tipoiva.getTransaccionLocals());
					this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccionLocal(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaDiario.class)) {
					this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.setFacturaDiarios(tipoiva.getFacturaDiarios());
					this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaDiario(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoIva(ArrayList<Classe> classes,TipoIvaReturnGeneral tipoivaReturnGeneral,TipoIvaBean tipoivaBean,Boolean conDefault) throws Exception {
		
			this.tipoivaBean.setTransaccionLocals(tipoivaReturnGeneral.getTipoIva().getTransaccionLocals());
			this.tipoivaBean.setFacturaDiarios(tipoivaReturnGeneral.getTipoIva().getFacturaDiarios());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoIva(TipoIva tipoiva,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(TransaccionLocal.class)) {
					tipoiva.setTransaccionLocals(this.jInternalFrameDetalleFormTipoIva.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaDiario.class)) {
					tipoiva.setFacturaDiarios(this.jInternalFrameDetalleFormTipoIva.facturadiarioBeanSwingJInternalFrame.facturadiarioLogic.getFacturaDiarios());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoiva)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoIva = new TipoIvaDetalleFormJInternalFrame(jDesktopPane,this.tipoivaSessionBean.getConGuardarRelaciones(),this.tipoivaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoIva);
		this.jInternalFrameDetalleFormTipoIva.setVisible(false);
		this.jInternalFrameDetalleFormTipoIva.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoIva.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoIva.tipoivaLogic=this.tipoivaLogic;
		
		this.cargarCombosFrameForeignKeyTipoIva("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoIva();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoIva();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoIva("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoIva();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoIva.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoIva"));
		
		this.jInternalFrameDetalleFormTipoIva.jButtonModificarTipoIva.addActionListener(new ButtonActionListener(this,"ModificarTipoIva"));

		
		this.jInternalFrameDetalleFormTipoIva.jButtonModificarToolBarTipoIva.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoIva"));
					
		this.jInternalFrameDetalleFormTipoIva.jMenuItemModificarTipoIva.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoIva"));		
		
		
		
		this.jInternalFrameDetalleFormTipoIva.jButtonActualizarTipoIva.addActionListener (new ButtonActionListener(this,"ActualizarTipoIva"));
		
		
		this.jInternalFrameDetalleFormTipoIva.jButtonActualizarToolBarTipoIva.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoIva"));
						
		this.jInternalFrameDetalleFormTipoIva.jMenuItemActualizarTipoIva.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoIva"));		
		
		
		
		this.jInternalFrameDetalleFormTipoIva.jButtonEliminarTipoIva.addActionListener (new ButtonActionListener(this,"EliminarTipoIva"));
		
		
		this.jInternalFrameDetalleFormTipoIva.jButtonEliminarToolBarTipoIva.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoIva"));
								
		this.jInternalFrameDetalleFormTipoIva.jMenuItemEliminarTipoIva.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoIva"));		
		
		
		
		this.jInternalFrameDetalleFormTipoIva.jButtonCancelarTipoIva.addActionListener (new ButtonActionListener(this,"CancelarTipoIva"));
		
		
		this.jInternalFrameDetalleFormTipoIva.jButtonCancelarToolBarTipoIva.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoIva"));
					
		this.jInternalFrameDetalleFormTipoIva.jMenuItemCancelarTipoIva.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoIva"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoIva.jMenuItemDetalleCerrarTipoIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoIva"));		
		
		
		
		this.jInternalFrameDetalleFormTipoIva.jButtonGuardarCambiosToolBarTipoIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoIva"));
		
		
		
		this.jInternalFrameDetalleFormTipoIva.jButtonGuardarCambiosToolBarTipoIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoIva"));
		
		
		
		this.jInternalFrameDetalleFormTipoIva.jComboBoxTiposAccionesFormularioTipoIva.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoIva"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIva.jButtonidTipoIvaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIva.jButtoncodigoTipoIvaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIva.jButtonnombreTipoIvaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoIvaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoIva.jTabbedPaneRelacionesTipoIva.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoIva"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoIva"));
		
		if(this.jInternalFrameDetalleFormTipoIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIva.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoIva"));
		}
		
		this.jTableDatosTipoIva.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoIva"));
		
		this.jTableDatosTipoIva.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoIva"));
		
		this.jButtonNuevoTipoIva.addActionListener(new ButtonActionListener(this,"NuevoTipoIva"));
		
		this.jButtonDuplicarTipoIva.addActionListener(new ButtonActionListener(this,"DuplicarTipoIva"));
		
		this.jButtonCopiarTipoIva.addActionListener(new ButtonActionListener(this,"CopiarTipoIva"));
		
		this.jButtonVerFormTipoIva.addActionListener(new ButtonActionListener(this,"VerFormTipoIva"));
		
		
		this.jButtonNuevoToolBarTipoIva.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoIva"));
			
		this.jButtonDuplicarToolBarTipoIva.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoIva"));
			
		this.jMenuItemNuevoTipoIva.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoIva"));
			
		this.jMenuItemDuplicarTipoIva.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoIva"));		
		
		
		this.jButtonNuevoRelacionesTipoIva.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoIva"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoIva.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoIva"));
			
		this.jMenuItemNuevoRelacionesTipoIva.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoIva"));		
		
		
		if(this.jInternalFrameDetalleFormTipoIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIva.jButtonModificarTipoIva.addActionListener(new ButtonActionListener(this,"ModificarTipoIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIva.jButtonModificarToolBarTipoIva.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoIva"));
			
			this.jInternalFrameDetalleFormTipoIva.jMenuItemModificarTipoIva.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIva!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoIva.jButtonActualizarTipoIva.addActionListener (new ButtonActionListener(this,"ActualizarTipoIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIva.jButtonActualizarToolBarTipoIva.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoIva"));
				
			this.jInternalFrameDetalleFormTipoIva.jMenuItemActualizarTipoIva.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIva.jButtonEliminarTipoIva.addActionListener (new ButtonActionListener(this,"EliminarTipoIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIva.jButtonEliminarToolBarTipoIva.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoIva"));
						
			this.jInternalFrameDetalleFormTipoIva.jMenuItemEliminarTipoIva.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIva.jButtonCancelarTipoIva.addActionListener (new ButtonActionListener(this,"CancelarTipoIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIva.jButtonCancelarToolBarTipoIva.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoIva"));
			
			this.jInternalFrameDetalleFormTipoIva.jMenuItemCancelarTipoIva.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoIva"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoIva.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoIva"));		
		
		
		this.jButtonCerrarTipoIva.addActionListener (new ButtonActionListener(this,"CerrarTipoIva"));
		
		
		this.jButtonCerrarToolBarTipoIva.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoIva"));
			
		this.jMenuItemCerrarTipoIva.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoIva"));
			
		if(this.jInternalFrameDetalleFormTipoIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIva.jMenuItemDetalleCerrarTipoIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIva.jButtonGuardarCambiosTipoIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIva.jButtonGuardarCambiosToolBarTipoIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoIva"));
		}
		
		this.jButtonCopiarToolBarTipoIva.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoIva"));
			
		this.jButtonVerFormToolBarTipoIva.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoIva"));
		
		this.jMenuItemGuardarCambiosTipoIva.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoIva"));
			
		this.jMenuItemCopiarTipoIva.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoIva"));		
		
		this.jMenuItemVerFormTipoIva.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoIva"));		
		
		
		this.jButtonGuardarCambiosTablaTipoIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoIva"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoIva"));
			
		this.jMenuItemGuardarCambiosTablaTipoIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoIva"));		
		
		
		
		this.jButtonRecargarInformacionTipoIva.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoIva"));
					
		this.jButtonRecargarInformacionToolBarTipoIva.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoIva"));
		
		this.jMenuItemRecargarInformacionTipoIva.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoIva"));		
		
		
		
		this.jButtonAnterioresTipoIva.addActionListener (new ButtonActionListener(this,"AnterioresTipoIva"));
		
		
		this.jButtonAnterioresToolBarTipoIva.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoIva"));
		
		this.jMenuItemAnterioresTipoIva.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoIva"));		
		
		
		this.jButtonSiguientesTipoIva.addActionListener (new ButtonActionListener(this,"SiguientesTipoIva"));
		
		
		this.jButtonSiguientesToolBarTipoIva.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoIva"));
			
		this.jMenuItemSiguientesTipoIva.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoIva"));
			
		this.jMenuItemAbrirOrderByTipoIva.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoIva"));
			
		this.jMenuItemMostrarOcultarTipoIva.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoIva"));
			
		this.jMenuItemDetalleAbrirOrderByTipoIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoIva"));
			
		this.jMenuItemDetalleMostarOcultarTipoIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoIva"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoIva.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoIva"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoIva.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoIva"));
			
		this.jMenuItemNuevoGuardarCambiosTipoIva.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoIva"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoIva.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoIva"));

		this.jCheckBoxSeleccionadosTipoIva.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoIva"));
		
		if(this.jInternalFrameDetalleFormTipoIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIva.jComboBoxTiposAccionesFormularioTipoIva.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoIva"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoIva.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoIva"));
			
		this.jComboBoxTiposAccionesTipoIva.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoIva"));
					
		this.jComboBoxTiposSeleccionarTipoIva.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoIva"));
			
		this.jTextFieldValorCampoGeneralTipoIva.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoIva"));		
		
		
		if(this.jInternalFrameDetalleFormTipoIva!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIva.jButtonidTipoIvaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIva.jButtoncodigoTipoIvaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIva.jButtonnombreTipoIvaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoIvaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoIva!=null) {
				this.jInternalFrameReporteDinamicoTipoIva.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoIva"));
				this.jInternalFrameReporteDinamicoTipoIva.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoIva"));
				this.jInternalFrameReporteDinamicoTipoIva.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoIva"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoIva.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoIva"));				
			//this.jButtonGenerarReporteDinamicoTipoIva.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoIva"));
			//this.jButtonGenerarExcelReporteDinamicoTipoIva.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoIva"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoIva!=null) {
				this.jInternalFrameImportacionTipoIva.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoIva"));
				this.jInternalFrameImportacionTipoIva.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoIva"));
				this.jInternalFrameImportacionTipoIva.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoIva"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoIva.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoIva"));
			
			this.jButtonAbrirOrderByToolBarTipoIva.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoIva"));			
			
			if(this.jInternalFrameOrderByTipoIva!=null) {
				this.jInternalFrameOrderByTipoIva.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoIva"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoIva!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIva.jTabbedPaneRelacionesTipoIva.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoIva"));
		
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
            		closingInternalFrameTipoIva();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoIva.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoIva = (JInternalFrameBase)event.getSource();
	            	
	            TipoIvaBeanSwingJInternalFrame jInternalFrameParent=(TipoIvaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoIva.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoIvaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoIva.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoIvaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoIva.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoIva.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoIva";
		inputMap = this.jButtonNuevoTipoIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoIvaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoIva";
		inputMap = this.jButtonNuevoRelacionesTipoIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoIvaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoIva";
		inputMap = this.jButtonModificarTipoIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoIva";
		inputMap = this.jButtonActualizarTipoIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoIva";
		inputMap = this.jButtonEliminarTipoIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoIva";
		inputMap = this.jButtonCancelarTipoIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoIva";
		inputMap = this.jButtonCerrarTipoIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoIva.jButtonGuardarCambiosTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoIva";
		inputMap = this.jInternalFrameDetalleFormTipoIva.jButtonGuardarCambiosTipoIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoIva.jButtonGuardarCambiosTipoIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoIva.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoIvaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIva.jButtonidTipoIvaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIva.jButtoncodigoTipoIvaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIva.jButtonnombreTipoIvaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoIvaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoIvaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoIva.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoIva(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoIva tipoivaAux:this.tipoivaLogic.getTipoIvas()) {
					tipoivaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoIva tipoivaAux:tipoivas) {
					tipoivaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoIvaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoIva(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoIva tipoivaAux:this.tipoivaLogic.getTipoIvas()) {
						tipoivaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoIva tipoivaAux:tipoivas) {
						tipoivaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoIva tipoivaAux:this.tipoivaLogic.getTipoIvas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoIva tipoivaAux:tipoivas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoIva(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoIva.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoIva.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoIva,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoIvaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoIva(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoIva.getSelectedRows();
			
			TipoIva tipoivaLocal=new TipoIva();
			
			//this.seleccionarTodosTipoIva(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoivaLocal =(TipoIva) this.tipoivaLogic.getTipoIvas().toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoivaLocal =(TipoIva) this.tipoivas.toArray()[this.jTableDatosTipoIva.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoivaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoIva tipoivaAux:this.tipoivaLogic.getTipoIvas()) {
						tipoivaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoIva tipoivaAux:tipoivas) {
						tipoivaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoIva(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoIva.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoIva.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoIva,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoIvaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoIvaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoIvaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoIva(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoIva.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoIva tipoivaAux:this.tipoivaLogic.getTipoIvas()) {
				
						if(sTipoSeleccionar.equals(TipoIvaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoivaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoIvaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoivaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoIva tipoivaAux:tipoivas) {
					
						if(sTipoSeleccionar.equals(TipoIvaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoivaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoIvaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoivaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoIva(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoIvaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoIva(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoIva=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoIva.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoIva.jComboBoxTiposAccionesFormularioTipoIva.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoIva) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoIva(conSplash);
				
					this.generarReporteTipoIvasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoIva.jComboBoxTiposAccionesFormularioTipoIva.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoIvasSeleccionados();
				//this.jComboBoxTiposAccionesTipoIva.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoIvasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoIva.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoIvasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoIva.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoIva();
				
				this.exportarTipoIvasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoIva.jComboBoxTiposAccionesFormularioTipoIva.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoIvas();
				//this.importarTipoIvas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoIva.jComboBoxTiposAccionesFormularioTipoIva.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoIva();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoIvasSeleccionados();
				//this.jComboBoxTiposAccionesTipoIva.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoIva();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoIva)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoIva(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Iva",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoIva.jComboBoxTiposAccionesFormularioTipoIva.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoIvaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoIva) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoIva(conSplash);
					
						//this.actualizarParametrosGeneralTipoIva();
						
						this.generarReporteProcesoAccionTipoIvasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoIva.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoIva.jComboBoxTiposAccionesFormularioTipoIva.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoIvaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo IvaS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoIva();
				
						this.actualizarParametrosGeneralTipoIva();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoivaReturnGeneral=tipoivaLogic.procesarAccionTipoIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoivaLogic.getTipoIvas(),this.tipoivaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoIvaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoIva.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoIva.jComboBoxTiposAccionesFormularioTipoIva.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoIva();
					
					TipoIvaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoIvaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoIva.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoIva.jComboBoxTiposAccionesFormularioTipoIva.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoIva(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoIvaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoIva();
			
			if(this.jInternalFrameDetalleFormTipoIva==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoIva> tipoivasSeleccionados=new ArrayList<TipoIva>();		
			TipoIva tipoiva=new TipoIva();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoIva(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoIva.getSelectedItem();
			
			
			
			
			tipoivasSeleccionados=this.getTipoIvasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoivasSeleccionados.size()==1) {
				for(TipoIva tipoivaAux:tipoivasSeleccionados) {
					tipoiva=tipoivaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Transaccion Local")) {
					jButtonTransaccionLocalActionPerformed(null,rowIndex,true,false,tipoiva);
				}
				else if(this.sTipoRelacion.equals("Factura Diario")) {
					jButtonFacturaDiarioActionPerformed(null,rowIndex,true,false,tipoiva);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoIva();
			
      		//this.finishProcessTipoIva(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoIvaReturnGeneral() throws Exception {
		if(this.tipoivaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoivaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoivaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoivaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoivaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoivaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoIva(false);
		}
		
		if(this.tipoivaReturnGeneral.getConRetornoLista() || this.tipoivaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoivaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoivaLogic.setTipoIvas(this.tipoivaReturnGeneral.getTipoIvas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoivaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoivaLogic.setTipoIva(this.tipoivaReturnGeneral.getTipoIva());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoIva(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoIva() throws Exception {
		
		
	}
	
	public ArrayList<TipoIva> getTipoIvasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoIva> tipoivasSeleccionados=new ArrayList<TipoIva>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoIva) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoIva tipoivaAux:tipoivaLogic.getTipoIvas()) {
					if(tipoivaAux.getIsSelected()) {
						tipoivasSeleccionados.add(tipoivaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoIva tipoivaAux:this.tipoivas) {
					if(tipoivaAux.getIsSelected()) {
						tipoivasSeleccionados.add(tipoivaAux);				
					}
				}
			}
			
			if(tipoivasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoivasSeleccionados.addAll(this.tipoivaLogic.getTipoIvas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoivasSeleccionados.addAll(this.tipoivas);				
					}
				}
			}
		} else {
			tipoivasSeleccionados.add(this.tipoiva);
		}
		
		return tipoivasSeleccionados;
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
	
	public void generarReporteTipoIvasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoIvasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoIvasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoIvasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoIvasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoIvasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Iva",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoIvasSeleccionados() throws Exception {
		ArrayList<TipoIva> tipoivasSeleccionados=new ArrayList<TipoIva>();		
		
		tipoivasSeleccionados=this.getTipoIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoIvas("Todos",tipoivasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoIvasSeleccionados() throws Exception {
		ArrayList<TipoIva> tipoivasSeleccionados=new ArrayList<TipoIva>();		
		
		tipoivasSeleccionados=this.getTipoIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoIvas("Todos",tipoivasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoIvasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoIva> tipoivasSeleccionados=new ArrayList<TipoIva>();
		
		tipoivasSeleccionados=this.getTipoIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoIvas("Todos",tipoivasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoIvasSeleccionados() throws Exception {
		ArrayList<TipoIva> tipoivasSeleccionados=new ArrayList<TipoIva>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoIva();
		
		
		tipoivasSeleccionados=this.getTipoIvasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoIva();
		
		
		//this.generarReporteTipoIvas("Todos",tipoivasSeleccionados ,tipoivaImplementable,tipoivaImplementableHome);
	}
	
	public void mostrarImportacionTipoIvas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoIva();
		
		this.abrirFrameImportacionTipoIva();		
		
			
		//this.generarReporteTipoIvas("Todos",tipoivasSeleccionados ,tipoivaImplementable,tipoivaImplementableHome);
	}
	
	public void importarTipoIvas() throws Exception {		
	
	}
	
	public void exportarTipoIvasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoIvasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoIvasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoIvasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Iva",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoIvasSeleccionados() throws Exception {
		ArrayList<TipoIva> tipoivasSeleccionados=new ArrayList<TipoIva>();		
		
		tipoivasSeleccionados=this.getTipoIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoiva."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoIva(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoIva tipoivaAux:tipoivasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoIva(tipoivaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoivaAux.setsDetalleGeneralEntityReporte(tipoivaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Iva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoIva(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoIvaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoIvaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoIvaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoIvaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoIva(TipoIva tipoiva,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoiva.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoiva.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoiva.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoiva.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoIvasSeleccionados() throws Exception {
		ArrayList<TipoIva> tipoivasSeleccionados=new ArrayList<TipoIva>();		
		
		tipoivasSeleccionados=this.getTipoIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoiva.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoIvas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoIva(row);				
				iRow++;
			}				
			
			for(TipoIva tipoivaAux:tipoivasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoIva(tipoivaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Iva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoIvasSeleccionados() throws Exception {
		ArrayList<TipoIva> tipoivasSeleccionados=new ArrayList<TipoIva>();		
		
		tipoivasSeleccionados=this.getTipoIvasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoiva.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoivas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoiva");
			//elementRoot.appendChild(element);
		
			for(TipoIva tipoivaAux:tipoivasSeleccionados) {
				element = document.createElement("tipoiva");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoIva(tipoivaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Iva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoIva(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoIvaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoIvaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoIvaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoIvaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoIva(TipoIva tipoiva,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoiva.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoiva.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoiva.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoIva(TipoIva tipoiva,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoIvaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoiva.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoIvaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoiva.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoIvaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoiva.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoIvaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoiva.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoIvasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoIva> tipoivasSeleccionados=new ArrayList<TipoIva>();
		
		tipoivasSeleccionados=this.getTipoIvasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoIva(tipoivasSeleccionados);
		
		this.generarReporteTipoIvas("Todos",tipoivasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoIva(ArrayList<TipoIva> tipoivasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoIva tipoivaAux:tipoivasSeleccionados) {
				tipoivaAux.setsDetalleGeneralEntityReporte(tipoivaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoIvaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoivaAux.setsDescripcionGeneralEntityReporte1(tipoivaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoIvaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoivaAux.setsDescripcionGeneralEntityReporte1(tipoivaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoIva(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoIva=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoIva=true;
				this.isVisibilidadCeldaGuardarCambiosTipoIva=true;
			}
			
			this.isVisibilidadCeldaModificarTipoIva=false;
			this.isVisibilidadCeldaActualizarTipoIva=false;
			this.isVisibilidadCeldaEliminarTipoIva=false;
			this.isVisibilidadCeldaCancelarTipoIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIva=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoIva=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoIva=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIva=false;
			this.isVisibilidadCeldaModificarTipoIva=false;
			this.isVisibilidadCeldaActualizarTipoIva=true;
			this.isVisibilidadCeldaEliminarTipoIva=false;
			this.isVisibilidadCeldaCancelarTipoIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIva=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoIva=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoIva=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIva=false;
			this.isVisibilidadCeldaModificarTipoIva=false;
			this.isVisibilidadCeldaActualizarTipoIva=true;
			this.isVisibilidadCeldaEliminarTipoIva=true;
			this.isVisibilidadCeldaCancelarTipoIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIva=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoIva=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoIva=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIva=false;
			this.isVisibilidadCeldaModificarTipoIva=false;
			this.isVisibilidadCeldaActualizarTipoIva=true;
			this.isVisibilidadCeldaEliminarTipoIva=false;
			this.isVisibilidadCeldaCancelarTipoIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIva=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoIva=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoIva=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoIva=true;
			this.isVisibilidadCeldaGuardarCambiosTipoIva=true;
			this.isVisibilidadCeldaModificarTipoIva=false;
			this.isVisibilidadCeldaActualizarTipoIva=false;
			this.isVisibilidadCeldaEliminarTipoIva=false;
			this.isVisibilidadCeldaCancelarTipoIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIva=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoIva=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoIva=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIva=false;
			this.isVisibilidadCeldaActualizarTipoIva=false;
			this.isVisibilidadCeldaEliminarTipoIva=false;
			this.isVisibilidadCeldaCancelarTipoIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIva=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoIva=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoIva=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIva=false;
			this.isVisibilidadCeldaModificarTipoIva=true;
			this.isVisibilidadCeldaActualizarTipoIva=false;
			this.isVisibilidadCeldaEliminarTipoIva=false;
			this.isVisibilidadCeldaCancelarTipoIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIva=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoIva=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoIvaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoIva=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoIva=true;
			this.isVisibilidadCeldaGuardarCambiosTipoIva=true;
		} else {
			this.actualizarEstadoPanelsTipoIva(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoIva=false;
			//this.isVisibilidadCeldaVerFormTipoIva=false;
			this.isVisibilidadCeldaDuplicarTipoIva=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoivaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoIva=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIva=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoivaSessionBean.getEsGuardarRelacionado()) {
			if(!tipoivaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoIva=false;												
			}
			
			this.jButtonCerrarTipoIva.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoIva=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoiva)) {
			this.isVisibilidadCeldaActualizarTipoIva=false;
			this.isVisibilidadCeldaEliminarTipoIva=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoIva() {
		this.isVisibilidadCeldaNuevoTipoIva=false;
		this.isVisibilidadCeldaGuardarCambiosTipoIva=false;
	}
	
	public void actualizarEstadoPanelsTipoIva(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoIva!=null) {
				this.jScrollPanelDatosEdicionTipoIva.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoIva!=null) {
				this.jScrollPanelDatosTipoIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoIva!=null) {
				this.jPanelPaginacionTipoIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoIva!=null) {
				this.jPanelParametrosReportesTipoIva.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoIva!=null) {
				this.jScrollPanelDatosEdicionTipoIva.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoIva!=null) {
				this.jScrollPanelDatosTipoIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoIva!=null) {
				this.jPanelPaginacionTipoIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoIva!=null) {
				this.jPanelParametrosReportesTipoIva.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoIva!=null) {
				this.jScrollPanelDatosEdicionTipoIva.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoIva!=null) {
				this.jScrollPanelDatosTipoIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoIva!=null) {
				this.jPanelPaginacionTipoIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoIva!=null) {
				this.jPanelParametrosReportesTipoIva.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoIva!=null) {
				this.jScrollPanelDatosEdicionTipoIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoIva!=null) {
				this.jScrollPanelDatosTipoIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoIva!=null) {
				this.jPanelPaginacionTipoIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoIva!=null) {
				this.jPanelParametrosReportesTipoIva.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoIva!=null) {
				this.jScrollPanelDatosEdicionTipoIva.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoIva!=null) {
				this.jScrollPanelDatosTipoIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoIva!=null) {
				this.jPanelPaginacionTipoIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoIva!=null) {
				this.jPanelParametrosReportesTipoIva.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoIva!=null) {
				this.jScrollPanelDatosEdicionTipoIva.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoIva!=null) {
				this.jScrollPanelDatosTipoIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoIva!=null) {
				this.jPanelPaginacionTipoIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoIva!=null) {
				this.jPanelParametrosReportesTipoIva.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoIva!=null) {
				this.jScrollPanelDatosEdicionTipoIva.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoIva!=null) {
				this.jScrollPanelDatosTipoIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoIva!=null) {
				this.jPanelPaginacionTipoIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoIva!=null) {
				this.jPanelParametrosReportesTipoIva.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoivaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoivaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoIvaParaTransaccionLocales() throws Exception {
		Boolean isPaginaPopupTransaccionLocal=false;

		try {

			if(this.tipoivaSessionBean==null) {
				this.tipoivaSessionBean=new TipoIvaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoIva.transaccionlocalSessionBean==null) {
				this.jInternalFrameDetalleFormTipoIva.transaccionlocalSessionBean=new TransaccionLocalSessionBean();
			}

			this.jInternalFrameDetalleFormTipoIva.transaccionlocalSessionBean.setsPathNavegacionActual(tipoivaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoIva.transaccionlocalSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupTransaccionLocal=this.jInternalFrameDetalleFormTipoIva.transaccionlocalSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoIva.transaccionlocalSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeTransaccionLocal(true);
			this.jInternalFrameDetalleFormTipoIva.transaccionlocalSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeTransaccionLocal(TipoIvaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoIva.transaccionlocalSessionBean.setisBusquedaDesdeForeignKeySesionTipoIva(true);
			this.jInternalFrameDetalleFormTipoIva.transaccionlocalSessionBean.setlidTipoIvaActual(this.idTipoIvaActual);

			tipoivaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoIva(true);
			tipoivaSessionBean.setlIdTipoIvaActualForeignKey(this.idTipoIvaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoIvaParaFacturaDiarios() throws Exception {
		Boolean isPaginaPopupFacturaDiario=false;

		try {

			if(this.tipoivaSessionBean==null) {
				this.tipoivaSessionBean=new TipoIvaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoIva.facturadiarioSessionBean==null) {
				this.jInternalFrameDetalleFormTipoIva.facturadiarioSessionBean=new FacturaDiarioSessionBean();
			}

			this.jInternalFrameDetalleFormTipoIva.facturadiarioSessionBean.setsPathNavegacionActual(tipoivaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaDiarioConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoIva.facturadiarioSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFacturaDiario=this.jInternalFrameDetalleFormTipoIva.facturadiarioSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoIva.facturadiarioSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFacturaDiario(true);
			this.jInternalFrameDetalleFormTipoIva.facturadiarioSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaDiario(TipoIvaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoIva.facturadiarioSessionBean.setisBusquedaDesdeForeignKeySesionTipoIva(true);
			this.jInternalFrameDetalleFormTipoIva.facturadiarioSessionBean.setlidTipoIvaActual(this.idTipoIvaActual);

			tipoivaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoIva(true);
			tipoivaSessionBean.setlIdTipoIvaActualForeignKey(this.idTipoIvaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoIvaSessionBean tipoivaSessionBean=new TipoIvaSessionBean();
		
		if(this.tipoivaSessionBean==null) {
			this.tipoivaSessionBean=new TipoIvaSessionBean();
		}
		
		this.tipoivaSessionBean.setsUltimaBusquedaTipoIva(this.getsAccionBusqueda());
		this.tipoivaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoivaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoIvaSessionBean tipoivaSessionBean=new TipoIvaSessionBean();
		
		if(this.tipoivaSessionBean==null) {
			this.tipoivaSessionBean=new TipoIvaSessionBean();
		}
		
		if(this.tipoivaSessionBean.getsUltimaBusquedaTipoIva()!=null&&!this.tipoivaSessionBean.getsUltimaBusquedaTipoIva().equals("")) {
			this.setsAccionBusqueda(tipoivaSessionBean.getsUltimaBusquedaTipoIva());
			this.setiNumeroPaginacion(tipoivaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoivaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipoivaSessionBean.setsUltimaBusquedaTipoIva("");
		this.tipoivaSessionBean.setiNumeroPaginacion(TipoIvaConstantesFunciones.INUMEROPAGINACION);
		this.tipoivaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoIva(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoIva() {
		this.updateBorderResaltarBusquedasFormularioTipoIva();
		this.updateVisibilidadBusquedasFormularioTipoIva();
		this.updateHabilitarBusquedasFormularioTipoIva();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoIva() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoIva() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoIva() {
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
	
	public void updateControlesFormularioTipoIva() throws Exception {

		if(this.jInternalFrameDetalleFormTipoIva==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoIva();
		this.updateVisibilidadResaltarControlesFormularioTipoIva();
		this.updateHabilitarResaltarControlesFormularioTipoIva();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoIva() throws Exception {
		if(this.jInternalFrameDetalleFormTipoIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoivaConstantesFunciones.resaltaridTipoIva!=null && this.jInternalFrameDetalleFormTipoIva!=null) {this.jInternalFrameDetalleFormTipoIva.jTextFieldidTipoIva.setBorder(this.tipoivaConstantesFunciones.resaltaridTipoIva);}
		if(this.tipoivaConstantesFunciones.resaltarcodigoTipoIva!=null && this.jInternalFrameDetalleFormTipoIva!=null) {this.jInternalFrameDetalleFormTipoIva.jTextFieldcodigoTipoIva.setBorder(this.tipoivaConstantesFunciones.resaltarcodigoTipoIva);}
		if(this.tipoivaConstantesFunciones.resaltarnombreTipoIva!=null && this.jInternalFrameDetalleFormTipoIva!=null) {this.jInternalFrameDetalleFormTipoIva.jTextAreanombreTipoIva.setBorder(this.tipoivaConstantesFunciones.resaltarnombreTipoIva);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoIva() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoIva!=null) {
	
		//this.jInternalFrameDetalleFormTipoIva.jTextFieldidTipoIva.setVisible(this.tipoivaConstantesFunciones.mostraridTipoIva);
		this.jInternalFrameDetalleFormTipoIva.jPanelidTipoIva.setVisible(this.tipoivaConstantesFunciones.mostraridTipoIva);
		//this.jInternalFrameDetalleFormTipoIva.jTextFieldcodigoTipoIva.setVisible(this.tipoivaConstantesFunciones.mostrarcodigoTipoIva);
		this.jInternalFrameDetalleFormTipoIva.jPanelcodigoTipoIva.setVisible(this.tipoivaConstantesFunciones.mostrarcodigoTipoIva);
		//this.jInternalFrameDetalleFormTipoIva.jTextAreanombreTipoIva.setVisible(this.tipoivaConstantesFunciones.mostrarnombreTipoIva);
		this.jInternalFrameDetalleFormTipoIva.jPanelnombreTipoIva.setVisible(this.tipoivaConstantesFunciones.mostrarnombreTipoIva);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoIva() throws Exception {
		if(this.jInternalFrameDetalleFormTipoIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoIva!=null) {
	
		this.jInternalFrameDetalleFormTipoIva.jTextFieldidTipoIva.setEnabled(this.tipoivaConstantesFunciones.activaridTipoIva);
		this.jInternalFrameDetalleFormTipoIva.jTextFieldcodigoTipoIva.setEnabled(this.tipoivaConstantesFunciones.activarcodigoTipoIva);
		this.jInternalFrameDetalleFormTipoIva.jTextAreanombreTipoIva.setEnabled(this.tipoivaConstantesFunciones.activarnombreTipoIva);
		}
	}
	
		
}