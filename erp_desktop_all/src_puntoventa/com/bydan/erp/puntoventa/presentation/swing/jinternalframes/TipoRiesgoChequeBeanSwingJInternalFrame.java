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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;




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

import com.bydan.erp.puntoventa.util.TipoRiesgoChequeConstantesFunciones;
import com.bydan.erp.puntoventa.util.TipoRiesgoChequeParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.TipoRiesgoChequeParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.TipoRiesgoChequeBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.puntoventa.resources.reportes.AuxiliarReportes;


import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

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
public class TipoRiesgoChequeBeanSwingJInternalFrame extends TipoRiesgoChequeJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoRiesgoChequeBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoRiesgoCheque> tiporiesgochequeValidator = new ClassValidator<TipoRiesgoCheque>(TipoRiesgoCheque.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoRiesgoCheque tiporiesgocheque;	
	public TipoRiesgoCheque tiporiesgochequeAux;
	public TipoRiesgoCheque tiporiesgochequeAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoRiesgoCheque tiporiesgochequeTotales;
	public Long idTipoRiesgoChequeActual;
	public Long iIdNuevoTipoRiesgoCheque=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosFormaPagoPuntoVenta=false;

	public Boolean getIsTienePermisosFormaPagoPuntoVenta() {
		return isTienePermisosFormaPagoPuntoVenta;
	}

	public void setIsTienePermisosFormaPagoPuntoVenta(Boolean isTienePermisosFormaPagoPuntoVenta) {
		this.isTienePermisosFormaPagoPuntoVenta= isTienePermisosFormaPagoPuntoVenta;
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
	
	public Boolean isPermisoTodoTipoRiesgoCheque;
	public Boolean isPermisoNuevoTipoRiesgoCheque;
	public Boolean isPermisoActualizarTipoRiesgoCheque;
	public Boolean isPermisoActualizarOriginalTipoRiesgoCheque;
	public Boolean isPermisoEliminarTipoRiesgoCheque;
	public Boolean isPermisoGuardarCambiosTipoRiesgoCheque;
	public Boolean isPermisoConsultaTipoRiesgoCheque;
	public Boolean isPermisoBusquedaTipoRiesgoCheque;
	public Boolean isPermisoReporteTipoRiesgoCheque;
	public Boolean isPermisoPaginacionMedioTipoRiesgoCheque;
	public Boolean isPermisoPaginacionAltoTipoRiesgoCheque;
	public Boolean isPermisoPaginacionTodoTipoRiesgoCheque;
	public Boolean isPermisoCopiarTipoRiesgoCheque;
	public Boolean isPermisoVerFormTipoRiesgoCheque;
	public Boolean isPermisoDuplicarTipoRiesgoCheque;
	public Boolean isPermisoOrdenTipoRiesgoCheque;
	
	
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
	
	public TipoRiesgoChequeParameterReturnGeneral tiporiesgochequeReturnGeneral;
	public TipoRiesgoChequeParameterReturnGeneral tiporiesgochequeParameterGeneral;
	
	

	public FormaPagoPuntoVentaLogic formapagopuntoventaLogic=null;

	public FormaPagoPuntoVentaLogic getFormaPagoPuntoVentaLogic() {
		return formapagopuntoventaLogic;
	}

	public void setFormaPagoPuntoVentaLogic(FormaPagoPuntoVentaLogic formapagopuntoventaLogic) {
		this.formapagopuntoventaLogic = formapagopuntoventaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoRiesgoCheque=false;
	public Boolean esParaAccionDesdeFormularioTipoRiesgoCheque=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoRiesgoChequeLogic tiporiesgochequeLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoRiesgoCheque tiporiesgochequeBean;
	public TipoRiesgoChequeConstantesFunciones tiporiesgochequeConstantesFunciones;
	//public TipoRiesgoChequeParameterReturnGeneral tiporiesgochequeReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoRiesgoCheque> tiporiesgocheques;	
	//public List<TipoRiesgoCheque> tiporiesgochequesEliminados;
	//public List<TipoRiesgoCheque> tiporiesgochequesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoRiesgoCheque=false;
	public Boolean isVisibilidadCeldaDuplicarTipoRiesgoCheque=true;
	public Boolean isVisibilidadCeldaCopiarTipoRiesgoCheque=true;
	public Boolean isVisibilidadCeldaVerFormTipoRiesgoCheque=true;
	public Boolean isVisibilidadCeldaOrdenTipoRiesgoCheque=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque=false;
	public Boolean isVisibilidadCeldaModificarTipoRiesgoCheque=false;
	public Boolean isVisibilidadCeldaActualizarTipoRiesgoCheque=false;
	public Boolean isVisibilidadCeldaEliminarTipoRiesgoCheque=false;
	public Boolean isVisibilidadCeldaCancelarTipoRiesgoCheque=false;
	public Boolean isVisibilidadCeldaGuardarTipoRiesgoCheque=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoRiesgoCheque=false;	
	
	
	
	public Long getiIdNuevoTipoRiesgoCheque() {
		return this.iIdNuevoTipoRiesgoCheque;
	}

	public void setiIdNuevoTipoRiesgoCheque(Long iIdNuevoTipoRiesgoCheque) {
		this.iIdNuevoTipoRiesgoCheque = iIdNuevoTipoRiesgoCheque;
	}
	
	public Long getidTipoRiesgoChequeActual() {
		return this.idTipoRiesgoChequeActual;
	}

	public void setidTipoRiesgoChequeActual(Long idTipoRiesgoChequeActual) {
		this.idTipoRiesgoChequeActual = idTipoRiesgoChequeActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoRiesgoCheque gettiporiesgocheque() {
		return this.tiporiesgocheque;
	}

	public void settiporiesgocheque(TipoRiesgoCheque tiporiesgocheque) {
		this.tiporiesgocheque = tiporiesgocheque;
	}
	
	public TipoRiesgoCheque gettiporiesgochequeAux() {
		return this.tiporiesgochequeAux;
	}

	public void settiporiesgochequeAux(TipoRiesgoCheque tiporiesgochequeAux) {
		this.tiporiesgochequeAux = tiporiesgochequeAux;
	}				
	
	public TipoRiesgoCheque gettiporiesgochequeAnterior() {
		return this.tiporiesgochequeAnterior;
	}

	public void settiporiesgochequeAnterior(TipoRiesgoCheque tiporiesgochequeAnterior) {
		this.tiporiesgochequeAnterior = tiporiesgochequeAnterior;
	}	
	
	public TipoRiesgoCheque gettiporiesgochequeTotales() {
		return this.tiporiesgochequeTotales;
	}

	public void settiporiesgochequeTotales(TipoRiesgoCheque tiporiesgochequeTotales) {
		this.tiporiesgochequeTotales = tiporiesgochequeTotales;
	}	
	
	public TipoRiesgoCheque gettiporiesgochequeBean() {
		return this.tiporiesgochequeBean;
	}

	public void settiporiesgochequeBean(TipoRiesgoCheque tiporiesgochequeBean) {
		this.tiporiesgochequeBean = tiporiesgochequeBean;
	}	
	
	public TipoRiesgoChequeParameterReturnGeneral gettiporiesgochequeReturnGeneral() {
		return this.tiporiesgochequeReturnGeneral;
	}

	public void settiporiesgochequeReturnGeneral(TipoRiesgoChequeParameterReturnGeneral tiporiesgochequeReturnGeneral) {
		this.tiporiesgochequeReturnGeneral = tiporiesgochequeReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoRiesgoChequeLogic getTipoRiesgoChequeLogic()	{		
		return tiporiesgochequeLogic;
	}

	public void setTipoRiesgoChequeLogic(TipoRiesgoChequeLogic tiporiesgochequeLogic) {
		this.tiporiesgochequeLogic = tiporiesgochequeLogic;
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
	
	public Boolean getIsEsNuevoTipoRiesgoCheque() {
		return isEsNuevoTipoRiesgoCheque;
	}

	public void setIsEsNuevoTipoRiesgoCheque(Boolean isEsNuevoTipoRiesgoCheque) {
		this.isEsNuevoTipoRiesgoCheque = isEsNuevoTipoRiesgoCheque;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoRiesgoCheque() {
		return esParaAccionDesdeFormularioTipoRiesgoCheque;
	}
	
	public void setEsParaAccionDesdeFormularioTipoRiesgoCheque(Boolean esParaAccionDesdeFormularioTipoRiesgoCheque) {
		this.esParaAccionDesdeFormularioTipoRiesgoCheque = esParaAccionDesdeFormularioTipoRiesgoCheque;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoRiesgoCheque() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoRiesgoChequeConstantesFunciones.refrescarForeignKeysDescripcionesTipoRiesgoCheque(this.tiporiesgochequeLogic.getTipoRiesgoCheques());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoRiesgoChequeConstantesFunciones.refrescarForeignKeysDescripcionesTipoRiesgoCheque(this.tiporiesgocheques);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tiporiesgochequeLogic.setTipoRiesgoCheques(this.tiporiesgocheques);
			tiporiesgochequeLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoRiesgoChequeParameterReturnGeneral getTipoRiesgoChequeParameterGeneral() {
		return this.tiporiesgochequeParameterGeneral;
	}
	
	public void setTipoRiesgoChequeParameterGeneral(TipoRiesgoChequeParameterReturnGeneral tiporiesgochequeParameterGeneral) {
		this.tiporiesgochequeParameterGeneral = tiporiesgochequeParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoRiesgoCheque() {
		return isPermisoTodoTipoRiesgoCheque;
	}

	public void setIsPermisoTodoTipoRiesgoCheque(Boolean isPermisoTodoTipoRiesgoCheque) {
		this.isPermisoTodoTipoRiesgoCheque = isPermisoTodoTipoRiesgoCheque;
	}

	public Boolean getIsPermisoNuevoTipoRiesgoCheque() {
		return isPermisoNuevoTipoRiesgoCheque;
	}

	public void setIsPermisoNuevoTipoRiesgoCheque(Boolean isPermisoNuevoTipoRiesgoCheque) {
		this.isPermisoNuevoTipoRiesgoCheque = isPermisoNuevoTipoRiesgoCheque;
	}

	public Boolean getIsPermisoActualizarTipoRiesgoCheque() {
		return isPermisoActualizarTipoRiesgoCheque;
	}

	public void setIsPermisoActualizarTipoRiesgoCheque(Boolean isPermisoActualizarTipoRiesgoCheque) {
		this.isPermisoActualizarTipoRiesgoCheque = isPermisoActualizarTipoRiesgoCheque;
	}

	public Boolean getIsPermisoEliminarTipoRiesgoCheque() {
		return isPermisoEliminarTipoRiesgoCheque;
	}

	public void setIsPermisoEliminarTipoRiesgoCheque(Boolean isPermisoEliminarTipoRiesgoCheque) {
		this.isPermisoEliminarTipoRiesgoCheque = isPermisoEliminarTipoRiesgoCheque;
	}

	public Boolean getIsPermisoGuardarCambiosTipoRiesgoCheque() {
		return isPermisoGuardarCambiosTipoRiesgoCheque;
	}

	public void setIsPermisoGuardarCambiosTipoRiesgoCheque(Boolean isPermisoGuardarCambiosTipoRiesgoCheque) {
		this.isPermisoGuardarCambiosTipoRiesgoCheque = isPermisoGuardarCambiosTipoRiesgoCheque;
	}
	
	public Boolean getIsPermisoConsultaTipoRiesgoCheque() {
		return isPermisoConsultaTipoRiesgoCheque;
	}

	public void setIsPermisoConsultaTipoRiesgoCheque(Boolean isPermisoConsultaTipoRiesgoCheque) {
		this.isPermisoConsultaTipoRiesgoCheque = isPermisoConsultaTipoRiesgoCheque;
	}

	public Boolean getIsPermisoBusquedaTipoRiesgoCheque() {
		return isPermisoBusquedaTipoRiesgoCheque;
	}

	public void setIsPermisoBusquedaTipoRiesgoCheque(Boolean isPermisoBusquedaTipoRiesgoCheque) {
		this.isPermisoBusquedaTipoRiesgoCheque = isPermisoBusquedaTipoRiesgoCheque;
	}

	public Boolean getIsPermisoReporteTipoRiesgoCheque() {
		return isPermisoReporteTipoRiesgoCheque;
	}

	public void setIsPermisoReporteTipoRiesgoCheque(Boolean isPermisoReporteTipoRiesgoCheque) {
		this.isPermisoReporteTipoRiesgoCheque = isPermisoReporteTipoRiesgoCheque;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoRiesgoCheque() {
		return isPermisoPaginacionMedioTipoRiesgoCheque;
	}

	public void setIsPermisoPaginacionMedioTipoRiesgoCheque(Boolean isPermisoPaginacionMedioTipoRiesgoCheque) {
		this.isPermisoPaginacionMedioTipoRiesgoCheque = isPermisoPaginacionMedioTipoRiesgoCheque;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoRiesgoCheque() {
		return isPermisoPaginacionTodoTipoRiesgoCheque;
	}

	public void setIsPermisoPaginacionTodoTipoRiesgoCheque(Boolean isPermisoPaginacionTodoTipoRiesgoCheque) {
		this.isPermisoPaginacionTodoTipoRiesgoCheque = isPermisoPaginacionTodoTipoRiesgoCheque;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoRiesgoCheque() {
		return isPermisoPaginacionAltoTipoRiesgoCheque;
	}

	public void setIsPermisoPaginacionAltoTipoRiesgoCheque(Boolean isPermisoPaginacionAltoTipoRiesgoCheque) {
		this.isPermisoPaginacionAltoTipoRiesgoCheque = isPermisoPaginacionAltoTipoRiesgoCheque;
	}
	
	public Boolean getIsPermisoCopiarTipoRiesgoCheque() {
		return isPermisoCopiarTipoRiesgoCheque;
	}

	public void setIsPermisoCopiarTipoRiesgoCheque(Boolean isPermisoCopiarTipoRiesgoCheque) {
		this.isPermisoCopiarTipoRiesgoCheque = isPermisoCopiarTipoRiesgoCheque;
	}
	
	public Boolean getIsPermisoVerFormTipoRiesgoCheque() {
		return isPermisoVerFormTipoRiesgoCheque;
	}

	public void setIsPermisoVerFormTipoRiesgoCheque(Boolean isPermisoVerFormTipoRiesgoCheque) {
		this.isPermisoVerFormTipoRiesgoCheque = isPermisoVerFormTipoRiesgoCheque;
	}
	
	public Boolean getIsPermisoDuplicarTipoRiesgoCheque() {
		return isPermisoDuplicarTipoRiesgoCheque;
	}

	public void setIsPermisoDuplicarTipoRiesgoCheque(Boolean isPermisoDuplicarTipoRiesgoCheque) {
		this.isPermisoDuplicarTipoRiesgoCheque = isPermisoDuplicarTipoRiesgoCheque;
	}
	
	public Boolean getIsPermisoOrdenTipoRiesgoCheque() {
		return isPermisoOrdenTipoRiesgoCheque;
	}

	public void setIsPermisoOrdenTipoRiesgoCheque(Boolean isPermisoOrdenTipoRiesgoCheque) {
		this.isPermisoOrdenTipoRiesgoCheque = isPermisoOrdenTipoRiesgoCheque;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoRiesgoCheque() {
		return isVisibilidadCeldaNuevoTipoRiesgoCheque;
	}

	public void setIsVisibilidadCeldaNuevoTipoRiesgoCheque(Boolean isVisibilidadCeldaNuevoTipoRiesgoCheque) {
		this.isVisibilidadCeldaNuevoTipoRiesgoCheque = isVisibilidadCeldaNuevoTipoRiesgoCheque;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoRiesgoCheque() {
		return isVisibilidadCeldaDuplicarTipoRiesgoCheque;
	}

	public void setIsVisibilidadCeldaDuplicarTipoRiesgoCheque(Boolean isVisibilidadCeldaDuplicarTipoRiesgoCheque) {
		this.isVisibilidadCeldaDuplicarTipoRiesgoCheque = isVisibilidadCeldaDuplicarTipoRiesgoCheque;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoRiesgoCheque() {
		return isVisibilidadCeldaCopiarTipoRiesgoCheque;
	}

	public void setIsVisibilidadCeldaCopiarTipoRiesgoCheque(Boolean isVisibilidadCeldaCopiarTipoRiesgoCheque) {
		this.isVisibilidadCeldaCopiarTipoRiesgoCheque = isVisibilidadCeldaCopiarTipoRiesgoCheque;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoRiesgoCheque() {
		return isVisibilidadCeldaVerFormTipoRiesgoCheque;
	}

	public void setIsVisibilidadCeldaVerFormTipoRiesgoCheque(Boolean isVisibilidadCeldaVerFormTipoRiesgoCheque) {
		this.isVisibilidadCeldaVerFormTipoRiesgoCheque = isVisibilidadCeldaVerFormTipoRiesgoCheque;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoRiesgoCheque() {
		return isVisibilidadCeldaOrdenTipoRiesgoCheque;
	}

	public void setIsVisibilidadCeldaOrdenTipoRiesgoCheque(Boolean isVisibilidadCeldaOrdenTipoRiesgoCheque) {
		this.isVisibilidadCeldaOrdenTipoRiesgoCheque = isVisibilidadCeldaOrdenTipoRiesgoCheque;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque() {
		return isVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque(Boolean isVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque) {
		this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque = isVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoRiesgoCheque() {
		return isVisibilidadCeldaModificarTipoRiesgoCheque;
	}

	public void setIsVisibilidadCeldaModificarTipoRiesgoCheque(Boolean isVisibilidadCeldaModificarTipoRiesgoCheque) {
		this.isVisibilidadCeldaModificarTipoRiesgoCheque = isVisibilidadCeldaModificarTipoRiesgoCheque;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoRiesgoCheque() {
		return isVisibilidadCeldaActualizarTipoRiesgoCheque;
	}

	public void setIsVisibilidadCeldaActualizarTipoRiesgoCheque(Boolean isVisibilidadCeldaActualizarTipoRiesgoCheque) {
		this.isVisibilidadCeldaActualizarTipoRiesgoCheque = isVisibilidadCeldaActualizarTipoRiesgoCheque;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoRiesgoCheque() {
		return isVisibilidadCeldaEliminarTipoRiesgoCheque;
	}

	public void setIsVisibilidadCeldaEliminarTipoRiesgoCheque(Boolean isVisibilidadCeldaEliminarTipoRiesgoCheque) {
		this.isVisibilidadCeldaEliminarTipoRiesgoCheque = isVisibilidadCeldaEliminarTipoRiesgoCheque;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoRiesgoCheque() {
		return isVisibilidadCeldaCancelarTipoRiesgoCheque;
	}

	public void setIsVisibilidadCeldaCancelarTipoRiesgoCheque(Boolean isVisibilidadCeldaCancelarTipoRiesgoCheque) {
		this.isVisibilidadCeldaCancelarTipoRiesgoCheque = isVisibilidadCeldaCancelarTipoRiesgoCheque;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoRiesgoCheque() {
		return isVisibilidadCeldaGuardarTipoRiesgoCheque;
	}

	public void setIsVisibilidadCeldaGuardarTipoRiesgoCheque(Boolean isVisibilidadCeldaGuardarTipoRiesgoCheque) {
		this.isVisibilidadCeldaGuardarTipoRiesgoCheque = isVisibilidadCeldaGuardarTipoRiesgoCheque;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoRiesgoCheque() {
		return isVisibilidadCeldaGuardarCambiosTipoRiesgoCheque;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoRiesgoCheque(Boolean isVisibilidadCeldaGuardarCambiosTipoRiesgoCheque) {
		this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCheque = isVisibilidadCeldaGuardarCambiosTipoRiesgoCheque;
	}
		
	public TipoRiesgoChequeSessionBean gettiporiesgochequeSessionBean() {
		return this.tiporiesgochequeSessionBean;
	}
	
	public void settiporiesgochequeSessionBean(TipoRiesgoChequeSessionBean tiporiesgochequeSessionBean) {
		this.tiporiesgochequeSessionBean=tiporiesgochequeSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCheque(TipoRiesgoCheque tiporiesgocheque)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoRiesgoCheque tiporiesgocheque,TipoRiesgoCheque tiporiesgochequeAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoRiesgoCheque(tiporiesgocheque);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tiporiesgochequeAux.setId(tiporiesgocheque.getId());
		tiporiesgochequeAux.setVersionRow(tiporiesgocheque.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoRiesgoCheque();
		
			int intSelectedRow = this.jTableDatosTipoRiesgoCheque.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoRiesgoChequeJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoRiesgoCheque(this.tiporiesgocheque,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCheque(this.tiporiesgocheque);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tiporiesgochequeValidator.getInvalidValues(this.tiporiesgocheque);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tiporiesgochequeLogic.setDatosCliente(datosCliente);
			tiporiesgochequeLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tiporiesgochequeAux=new  TipoRiesgoCheque();
				
				tiporiesgochequeAux.setIsNew(true);
				tiporiesgochequeAux.setIsChanged(true);
				
				tiporiesgochequeAux.setTipoRiesgoChequeOriginal(this.tiporiesgocheque);
				
				tiporiesgochequeAux.setId(this.tiporiesgocheque.getId());	
				tiporiesgochequeAux.setVersionRow(this.tiporiesgocheque.getVersionRow());	
				tiporiesgochequeAux.setnombre(this.tiporiesgocheque.getnombre());	
				tiporiesgochequeAux.setdescripcion(this.tiporiesgocheque.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporiesgochequeSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporiesgochequeSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tiporiesgochequeAux,tiporiesgochequeLogic.getTipoRiesgoCheques());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporiesgochequeAux,tiporiesgocheques);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tiporiesgochequeSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporiesgochequeSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporiesgochequeLogic.saveTipoRiesgoCheques();//WithConnection
						//tiporiesgochequeLogic.getSetVersionRowTipoRiesgoCheques();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporiesgocheque,tiporiesgochequeAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporiesgochequeSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tiporiesgochequeAux=new  TipoRiesgoCheque();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tiporiesgochequeSessionBean.getEsGuardarRelacionado() 
					|| (this.tiporiesgochequeSessionBean.getEsGuardarRelacionado() && this.tiporiesgocheque.getId()>=0)) {
						
					tiporiesgochequeAux.setIsNew(false);
				}
				
				tiporiesgochequeAux.setIsDeleted(false);
			
				tiporiesgochequeAux.setId(this.tiporiesgocheque.getId());	
				tiporiesgochequeAux.setVersionRow(this.tiporiesgocheque.getVersionRow());	
				tiporiesgochequeAux.setnombre(this.tiporiesgocheque.getnombre());	
				tiporiesgochequeAux.setdescripcion(this.tiporiesgocheque.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporiesgochequeAux,tiporiesgochequeLogic.getTipoRiesgoCheques());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporiesgochequeAux,tiporiesgocheques);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tiporiesgochequeSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporiesgochequeSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporiesgochequeLogic.saveTipoRiesgoCheques();//WithConnection
						//tiporiesgochequeLogic.getSetVersionRowTipoRiesgoCheques();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporiesgocheque,tiporiesgochequeAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporiesgochequeSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tiporiesgochequeAux=new  TipoRiesgoCheque();
				
				tiporiesgochequeAux.setIsNew(false);
				tiporiesgochequeAux.setIsChanged(false);
				
				tiporiesgochequeAux.setIsDeleted(true);
				
				tiporiesgochequeAux.setId(this.tiporiesgocheque.getId());	
				tiporiesgochequeAux.setVersionRow(this.tiporiesgocheque.getVersionRow());	
				tiporiesgochequeAux.setnombre(this.tiporiesgocheque.getnombre());	
				tiporiesgochequeAux.setdescripcion(this.tiporiesgocheque.getdescripcion());	
				
				if(this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tiporiesgochequeAux.getId()>=0) {	
						this.tiporiesgochequesEliminados.add(tiporiesgochequeAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tiporiesgochequeAux,tiporiesgochequeLogic.getTipoRiesgoCheques());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporiesgochequeAux,tiporiesgocheques);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tiporiesgochequeSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporiesgochequeSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporiesgochequeLogic.saveTipoRiesgoCheques();//WithConnection
						//tiporiesgochequeLogic.getSetVersionRowTipoRiesgoCheques();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporiesgochequeSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							tiporiesgochequeAux.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tiporiesgochequeSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tiporiesgochequeSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tiporiesgochequeAux,tiporiesgochequeLogic.getTipoRiesgoCheques());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tiporiesgochequeAux,tiporiesgocheques);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgochequeLogic.getTipoRiesgoCheques().addAll(this.tiporiesgochequesEliminados);
					
					tiporiesgochequeLogic.saveTipoRiesgoCheques();//WithConnection
					//tiporiesgochequeLogic.getSetVersionRowTipoRiesgoCheques();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tiporiesgochequesEliminados= new ArrayList<TipoRiesgoCheque>();		
			}
			
			if(this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Riesgo Cheque GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Riesgo Cheque",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tiporiesgocheque=tiporiesgochequeAux;
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
      		//this.finishProcessTipoRiesgoCheque();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoRiesgoCheque tiporiesgochequeLocal) throws Exception {
		
		if(this.tiporiesgochequeSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tiporiesgochequeLocal.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());
			
			} else {
			
				tiporiesgochequeLocal.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoRiesgoCheque tiporiesgochequeLocal) throws Exception {	
		if(this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoRiesgoChequeActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoRiesgoCheque.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tiporiesgochequeValidator.getInvalidValues(this.tiporiesgocheque);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoRiesgoCheque tiporiesgocheque,List<TipoRiesgoCheque> tiporiesgocheques) throws Exception {
		try	{		
			TipoRiesgoChequeConstantesFunciones.actualizarLista(tiporiesgocheque,tiporiesgocheques,this.tiporiesgochequeSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoRiesgoCheque tiporiesgocheque,List<TipoRiesgoCheque> tiporiesgocheques) throws Exception {
		try	{			
			TipoRiesgoChequeConstantesFunciones.actualizarSelectedLista(tiporiesgocheque,tiporiesgocheques);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoRiesgoCheque> tiporiesgochequesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tiporiesgochequesLocal=this.tiporiesgochequeLogic.getTipoRiesgoCheques();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tiporiesgochequesLocal=this.tiporiesgocheques;
			}
			//ARCHITECTURE
		
			for(TipoRiesgoCheque tiporiesgochequeLocal:tiporiesgochequesLocal) {
				if(this.permiteMantenimiento(tiporiesgochequeLocal) && tiporiesgochequeLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoRiesgoChequeConstantesFunciones.getTipoRiesgoChequeLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoRiesgoChequeConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRiesgoCheque.jLabelnombreTipoRiesgoCheque,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRiesgoChequeConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRiesgoCheque.jLabeldescripcionTipoRiesgoCheque,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRiesgoCheque.jLabelnombreTipoRiesgoCheque,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRiesgoCheque.jLabeldescripcionTipoRiesgoCheque,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("FormaPagoPuntoVenta")) {
			if(this.tiporiesgocheque==null) {
				this.tiporiesgocheque= new TipoRiesgoCheque();
			}

			if(this.tiporiesgochequeSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoRiesgoCheque
				this.setVariablesFormularioToObjetoActualTipoRiesgoCheque(this.tiporiesgocheque,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCheque(this.tiporiesgocheque);

				this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame.getformapagopuntoventa().setTipoRiesgoCheque(this.tiporiesgocheque);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoRiesgoCheque--;	
		
		
		this.tiporiesgochequeAux=new TipoRiesgoCheque();
		
		this.tiporiesgochequeAux.setId(this.iIdNuevoTipoRiesgoCheque);
		this.tiporiesgochequeAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporiesgochequeLogic.getTipoRiesgoCheques().add(this.tiporiesgochequeAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tiporiesgocheques.add(this.tiporiesgochequeAux);
		}
		//ARCHITECTURE
		
		this.tiporiesgocheque=this.tiporiesgochequeAux;
		
		if(TipoRiesgoChequeJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoRiesgoCheque(this.tiporiesgocheque);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRiesgoCheque(this.tiporiesgocheque);
		}
				
		//this.setDefaultControlesTipoRiesgoCheque();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoRiesgoCheque();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoRiesgoCheque();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRiesgoCheque();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRiesgoCheque(this.tiporiesgochequeBean,this.tiporiesgocheque,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCheque(this.tiporiesgocheque);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tiporiesgochequeSessionBean.getConGuardarRelaciones()) {
			classes=TipoRiesgoChequeConstantesFunciones.getClassesRelationshipsOfTipoRiesgoCheque(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tiporiesgochequeReturnGeneral=tiporiesgochequeLogic.procesarEventosTipoRiesgoChequesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporiesgochequeLogic.getTipoRiesgoCheques(),this.tiporiesgocheque,this.tiporiesgochequeParameterGeneral,this.isEsNuevoTipoRiesgoCheque,classes);//this.tiporiesgochequeLogic.getTipoRiesgoCheque()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoRiesgoCheque(this.tiporiesgochequeReturnGeneral,this.tiporiesgochequeBean,false);
		
		if(this.tiporiesgochequeReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRiesgoCheque(this.tiporiesgochequeReturnGeneral.getTipoRiesgoCheque());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoRiesgoCheque(this.tiporiesgochequeReturnGeneral.getTipoRiesgoCheque());
		}
		
		if(this.tiporiesgochequeReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoRiesgoCheque(this.tiporiesgochequeReturnGeneral.getTipoRiesgoCheque(),classes);//this.tiporiesgochequeBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoRiesgoCheque(this.tiporiesgocheque,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoRiesgoCheque();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoRiesgoCheque();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoRiesgoCheque(false);
						
			if(tiporiesgochequeSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.getEsGuardarRelacionado() && FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormaPagoPuntoVentaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoRiesgoChequeJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRiesgoCheque();
			}
			
			this.actualizarVisualTableDatosTipoRiesgoCheque();
			
			this.jTableDatosTipoRiesgoCheque.setRowSelectionInterval(this.getIndiceNuevoTipoRiesgoCheque(), this.getIndiceNuevoTipoRiesgoCheque());
			
			this.seleccionarFilaTablaTipoRiesgoChequeActual();
						
			this.actualizarEstadoCeldasBotonesTipoRiesgoCheque("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoRiesgoCheque(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextAreanombreTipoRiesgoCheque.setEnabled(isHabilitar && this.tiporiesgochequeConstantesFunciones.activarnombreTipoRiesgoCheque);
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextAreadescripcionTipoRiesgoCheque.setEnabled(isHabilitar && this.tiporiesgochequeConstantesFunciones.activardescripcionTipoRiesgoCheque);	
		
	};
	
	public void setDefaultControlesTipoRiesgoCheque() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoRiesgoCheque(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tiporiesgochequeSessionBean.setConGuardarRelaciones(true);			
			this.tiporiesgochequeSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jTabbedPaneRelacionesTipoRiesgoCheque.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tiporiesgochequeSessionBean.setConGuardarRelaciones(false);			
			this.tiporiesgochequeSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jTabbedPaneRelacionesTipoRiesgoCheque.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoRiesgoCheque() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRiesgoCheque tiporiesgochequeAux:this.tiporiesgochequeLogic.getTipoRiesgoCheques()) {
				if(tiporiesgochequeAux.getId().equals(this.iIdNuevoTipoRiesgoCheque)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRiesgoCheque tiporiesgochequeAux:this.tiporiesgocheques) {
				if(tiporiesgochequeAux.getId().equals(this.iIdNuevoTipoRiesgoCheque)) {
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
	
	public int getIndiceActualTipoRiesgoCheque(TipoRiesgoCheque tiporiesgocheque,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRiesgoCheque tiporiesgochequeAux:this.tiporiesgochequeLogic.getTipoRiesgoCheques()) {
				if(tiporiesgochequeAux.getId().equals(tiporiesgocheque.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRiesgoCheque tiporiesgochequeAux:this.tiporiesgocheques) {
				if(tiporiesgochequeAux.getId().equals(tiporiesgocheque.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoRiesgoCheque(TipoRiesgoCheque tiporiesgochequeOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRiesgoCheque tiporiesgochequeAux:this.tiporiesgochequeLogic.getTipoRiesgoCheques()) {
				if(tiporiesgochequeAux.getTipoRiesgoChequeOriginal().getId().equals(tiporiesgochequeOriginal.getId())) {
					existe=true;
					tiporiesgochequeOriginal.setId(tiporiesgochequeAux.getId());
					tiporiesgochequeOriginal.setVersionRow(tiporiesgochequeAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRiesgoCheque tiporiesgochequeAux:this.tiporiesgocheques) {
				if(tiporiesgochequeAux.getTipoRiesgoChequeOriginal().getId().equals(tiporiesgochequeOriginal.getId())) {
					existe=true;
					tiporiesgochequeOriginal.setId(tiporiesgochequeAux.getId());
					tiporiesgochequeOriginal.setVersionRow(tiporiesgochequeAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoRiesgoCheque(Boolean esParaCancelar) throws Exception {
		tiporiesgochequesAux=new ArrayList<TipoRiesgoCheque>();
		tiporiesgochequeAux=new TipoRiesgoCheque();
		
		if(!this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRiesgoCheque tiporiesgochequeAux:this.tiporiesgochequeLogic.getTipoRiesgoCheques()) {
					if(tiporiesgochequeAux.getId()<0) {
						tiporiesgochequesAux.add(tiporiesgochequeAux);
					}		
				}
				this.iIdNuevoTipoRiesgoCheque=0L;
				this.tiporiesgochequeLogic.getTipoRiesgoCheques().removeAll(tiporiesgochequesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRiesgoCheque tiporiesgochequeAux:this.tiporiesgocheques) {
					if(tiporiesgochequeAux.getId()<0) {
						tiporiesgochequesAux.add(tiporiesgochequeAux);
					}		
				}
				this.iIdNuevoTipoRiesgoCheque=0L;
				this.tiporiesgocheques.removeAll(tiporiesgochequesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoRiesgoCheque 
					&& this.tiporiesgochequeLogic.getTipoRiesgoCheques().size()>0
					) {
					tiporiesgochequeAux=this.tiporiesgochequeLogic.getTipoRiesgoCheques().get(this.tiporiesgochequeLogic.getTipoRiesgoCheques().size() - 1);
				
					if(tiporiesgochequeAux.getId()<0) {
						this.tiporiesgochequeLogic.getTipoRiesgoCheques().remove(tiporiesgochequeAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoRiesgoCheque && this.tiporiesgocheques.size()>0) {
					tiporiesgochequeAux=this.tiporiesgocheques.get(this.tiporiesgocheques.size() - 1);
				
					if(tiporiesgochequeAux.getId()<0) {
						this.tiporiesgocheques.remove(tiporiesgochequeAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoRiesgoCheque(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tiporiesgocheque.getId()<0) {
				this.tiporiesgochequeLogic.getTipoRiesgoCheques().remove(this.tiporiesgocheque);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tiporiesgocheque.getId()<0) {
				this.tiporiesgocheques.remove(this.tiporiesgocheque);
			}
		}			
	}
	
	public void setEstadosInicialesTipoRiesgoCheque(List<TipoRiesgoCheque> tiporiesgochequesAux) throws Exception {
		TipoRiesgoChequeConstantesFunciones.setEstadosInicialesTipoRiesgoCheque(tiporiesgochequesAux);
	}
	
	public void setEstadosInicialesTipoRiesgoCheque(TipoRiesgoCheque tiporiesgochequeAux) throws Exception {
		TipoRiesgoChequeConstantesFunciones.setEstadosInicialesTipoRiesgoCheque(tiporiesgochequeAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoRiesgoChequeActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoRiesgoCheque("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoRiesgoChequeActual()) {
				if(!this.isEsNuevoTipoRiesgoCheque) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoRiesgoCheque("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoRiesgoCheque=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoRiesgoChequeActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Riesgo Cheque ?", "MANTENIMIENTO DE Tipo Riesgo Cheque", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoRiesgoCheque("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoRiesgoCheque tiporiesgocheque) throws Exception {
		TipoRiesgoChequeConstantesFunciones.seleccionarAsignar(this.tiporiesgocheque,tiporiesgocheque);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoRiesgoCheque=this.isPermisoActualizarOriginalTipoRiesgoCheque;
			
			
			this.seleccionarAsignar(tiporiesgocheque);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoRiesgoChequeConstantesFunciones.quitarEspaciosTipoRiesgoCheque(this.tiporiesgocheque,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoRiesgoCheque("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tiporiesgochequeSessionBean.setsFuncionBusquedaRapida(this.tiporiesgochequeSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoRiesgoCheque) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoRiesgoCheque(esParaCancelar);				
				this.cancelarNuevoTipoRiesgoCheque(esParaCancelar);								
			}
			
			this.tiporiesgocheque=new TipoRiesgoCheque();
			
			this.inicializarTipoRiesgoCheque();
			
			this.actualizarEstadoCeldasBotonesTipoRiesgoCheque("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoRiesgoCheque() throws Exception {
		try {
			TipoRiesgoChequeConstantesFunciones.inicializarTipoRiesgoCheque(this.tiporiesgocheque);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tiporiesgochequeLogic.getTipoRiesgoCheques().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoRiesgoCheques(String sAccionBusqueda,List<TipoRiesgoCheque> tiporiesgochequesParaReportes) throws Exception {
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
					sPathReporteFinal="TipoRiesgoCheque"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoRiesgoChequeMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoRiesgoChequeMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoRiesgoCheque"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Riesgo Cheques");		
		parameters.put("busquedapor", TipoRiesgoChequeConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(FormaPagoPuntoVenta.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoRiesgoChequeLogic tiporiesgochequeLogicAuxiliar=new TipoRiesgoChequeLogic();
					tiporiesgochequeLogicAuxiliar.setDatosCliente(tiporiesgochequeLogic.getDatosCliente());				
					tiporiesgochequeLogicAuxiliar.setTipoRiesgoCheques(tiporiesgochequesParaReportes);
					
					tiporiesgochequeLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoRiesgoChequeWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tiporiesgochequesParaReportes=tiporiesgochequeLogicAuxiliar.getTipoRiesgoCheques();
					
					//tiporiesgochequeLogic.getNewConnexionToDeep();
					
					//for (TipoRiesgoCheque tiporiesgocheque:tiporiesgochequesParaReportes) {
					//	tiporiesgochequeLogic.deepLoad(tiporiesgocheque, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tiporiesgochequeLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tiporiesgochequeLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileFormaPagoPuntoVenta = AuxiliarReportes.class.getResourceAsStream("FormaPagoPuntoVentaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_formapagopuntoventa", reportFileFormaPagoPuntoVenta);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoRiesgoCheque=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoRiesgoChequeConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoRiesgoChequeConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoRiesgoCheque=new JRBeanArrayDataSource(TipoRiesgoChequeJInternalFrame.TraerTipoRiesgoChequeBeans(tiporiesgochequesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoRiesgoCheque);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoRiesgoChequeConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoRiesgoChequeConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoRiesgoChequeBean.TraerTipoRiesgoChequeBeans(tiporiesgochequesParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoRiesgoCheques(sAccionBusqueda,sTipoArchivoReporte,tiporiesgochequesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoRiesgoCheques(sAccionBusqueda,sTipoArchivoReporte,tiporiesgochequesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoRiesgoChequeActionPerformed(null);
					//this.generarExcelReporteTipoRiesgoCheques(sAccionBusqueda,sTipoArchivoReporte,tiporiesgochequesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoRiesgoCheques(sAccionBusqueda,sTipoArchivoReporte,tiporiesgochequesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoRiesgoCheques(sAccionBusqueda,sTipoArchivoReporte,tiporiesgochequesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoRiesgoCheques(sAccionBusqueda,sTipoArchivoReporte,tiporiesgochequesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoRiesgoCheques(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRiesgoCheque> tiporiesgochequesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporiesgocheque";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRiesgoCheques");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRiesgoCheque("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoRiesgoCheque tiporiesgocheque : tiporiesgochequesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoRiesgoChequeConstantesFunciones.generarExcelReporteDataTipoRiesgoCheque("NORMAL",row,workbook,tiporiesgocheque,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Riesgo Cheque",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoRiesgoCheque(String sTipo,Row row,Workbook workbook) {
		
		TipoRiesgoChequeConstantesFunciones.generarExcelReporteHeaderTipoRiesgoCheque(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoRiesgoCheques(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRiesgoCheque> tiporiesgochequesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporiesgocheque_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRiesgoCheques");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoRiesgoCheque tiporiesgocheque : tiporiesgochequesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoRiesgoChequeConstantesFunciones.getTipoRiesgoChequeDescripcion(tiporiesgocheque));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRiesgoChequeConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRiesgoChequeConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporiesgocheque.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRiesgoChequeConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRiesgoChequeConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporiesgocheque.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Riesgo Cheque",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoRiesgoCheques(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRiesgoCheque> tiporiesgochequesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoRiesgoCheque> tiporiesgochequesRespaldo=null;
		
		classes=TipoRiesgoChequeConstantesFunciones.getClassesRelationshipsOfTipoRiesgoCheque(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tiporiesgochequeLogic.setDatosCliente(this.datosCliente);
		this.tiporiesgochequeLogic.setDatosDeep(this.datosDeep);
		this.tiporiesgochequeLogic.setIsConDeep(true);
		
		tiporiesgochequesRespaldo=this.tiporiesgochequeLogic.getTipoRiesgoCheques();
		
		this.tiporiesgochequeLogic.setTipoRiesgoCheques(tiporiesgochequesParaReportes);	
		this.tiporiesgochequeLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tiporiesgochequesParaReportes=this.tiporiesgochequeLogic.getTipoRiesgoCheques();
		this.tiporiesgochequeLogic.setTipoRiesgoCheques(tiporiesgochequesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporiesgocheque_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRiesgoCheques");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRiesgoCheque("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoRiesgoCheque tiporiesgocheque : tiporiesgochequesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoRiesgoCheque("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoRiesgoChequeConstantesFunciones.generarExcelReporteDataTipoRiesgoCheque("NORMAL",row,workbook,tiporiesgocheque,cellStyleDataAux);
		
			
			


				//FormaPagoPuntoVenta
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO))) {

				if(tiporiesgocheque.getFormaPagoPuntoVentas()!=null && tiporiesgocheque.getFormaPagoPuntoVentas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FormaPagoPuntoVentaConstantesFunciones.generarExcelReporteHeaderFormaPagoPuntoVenta("RELACIONADO",row,workbook);
				}

				if(tiporiesgocheque.getFormaPagoPuntoVentas()!=null) {
					i2=0;
					for(FormaPagoPuntoVenta formapagopuntoventa : tiporiesgocheque.getFormaPagoPuntoVentas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FormaPagoPuntoVentaConstantesFunciones.generarExcelReporteDataFormaPagoPuntoVenta("RELACIONADO",row,workbook,formapagopuntoventa,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoRiesgoChequeConstantesFunciones.getTipoRiesgoChequeDescripcion(tiporiesgocheque));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Riesgo Cheque",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoRiesgoCheque() throws Exception {		
		this.startProcessTipoRiesgoCheque(true);
	}
	
	public void startProcessTipoRiesgoCheque(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoRiesgoCheque, this.jScrollPanelDatosTipoRiesgoCheque,this.jPanelPaginacionTipoRiesgoCheque, this.jScrollPanelDatosEdicionTipoRiesgoCheque, this.jPanelAccionesTipoRiesgoCheque,this.jPanelAccionesFormularioTipoRiesgoCheque,this.jmenuBarTipoRiesgoCheque,this.jmenuBarDetalleTipoRiesgoCheque,this.jTtoolBarTipoRiesgoCheque,this.jTtoolBarDetalleTipoRiesgoCheque);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRiesgoCheque=null; 
		
		final JPanel jPanelParametrosReportesTipoRiesgoCheque=this.jPanelParametrosReportesTipoRiesgoCheque;
		//final JScrollPane jScrollPanelDatosTipoRiesgoCheque=this.jScrollPanelDatosTipoRiesgoCheque;
		final JTable jTableDatosTipoRiesgoCheque=this.jTableDatosTipoRiesgoCheque;		
		final JPanel jPanelPaginacionTipoRiesgoCheque=this.jPanelPaginacionTipoRiesgoCheque;
		//final JScrollPane jScrollPanelDatosEdicionTipoRiesgoCheque=this.jScrollPanelDatosEdicionTipoRiesgoCheque;
		final JPanel jPanelAccionesTipoRiesgoCheque=this.jPanelAccionesTipoRiesgoCheque;
		
		JPanel jPanelCamposAuxiliarTipoRiesgoCheque=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoRiesgoCheque=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) {
			jPanelCamposAuxiliarTipoRiesgoCheque=this.jInternalFrameDetalleFormTipoRiesgoCheque.jPanelCamposTipoRiesgoCheque;
			jPanelAccionesFormularioAuxiliarTipoRiesgoCheque=this.jInternalFrameDetalleFormTipoRiesgoCheque.jPanelAccionesFormularioTipoRiesgoCheque;
		}
		
		final JPanel jPanelCamposTipoRiesgoCheque=jPanelCamposAuxiliarTipoRiesgoCheque;
		final JPanel jPanelAccionesFormularioTipoRiesgoCheque=jPanelAccionesFormularioAuxiliarTipoRiesgoCheque;
		
		
		final JMenuBar jmenuBarTipoRiesgoCheque=this.jmenuBarTipoRiesgoCheque;
		final JToolBar jTtoolBarTipoRiesgoCheque=this.jTtoolBarTipoRiesgoCheque;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoRiesgoCheque=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRiesgoCheque=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) {
			jmenuBarDetalleAuxiliarTipoRiesgoCheque=this.jInternalFrameDetalleFormTipoRiesgoCheque.jmenuBarDetalleTipoRiesgoCheque;
			jTtoolBarDetalleAuxiliarTipoRiesgoCheque=this.jInternalFrameDetalleFormTipoRiesgoCheque.jTtoolBarDetalleTipoRiesgoCheque;
		}
		
		final JMenuBar jmenuBarDetalleTipoRiesgoCheque=jmenuBarDetalleAuxiliarTipoRiesgoCheque;
		final JToolBar jTtoolBarDetalleTipoRiesgoCheque=jTtoolBarDetalleAuxiliarTipoRiesgoCheque;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRiesgoCheque;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRiesgoCheque;
			processRunnable.jTableDatos=jTableDatosTipoRiesgoCheque;
			processRunnable.jPanelCampos=jPanelCamposTipoRiesgoCheque;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRiesgoCheque;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRiesgoCheque;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRiesgoCheque;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRiesgoCheque;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRiesgoCheque;
			processRunnable.jTtoolBar=jTtoolBarTipoRiesgoCheque;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRiesgoCheque;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoRiesgoCheque ,jPanelParametrosReportesTipoRiesgoCheque,jTableDatosTipoRiesgoCheque, /*jScrollPanelDatosTipoRiesgoCheque,*/jPanelCamposTipoRiesgoCheque,jPanelPaginacionTipoRiesgoCheque, /*jScrollPanelDatosEdicionTipoRiesgoCheque,*/ jPanelAccionesTipoRiesgoCheque,jPanelAccionesFormularioTipoRiesgoCheque,jmenuBarTipoRiesgoCheque,jmenuBarDetalleTipoRiesgoCheque,jTtoolBarTipoRiesgoCheque,jTtoolBarDetalleTipoRiesgoCheque);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoRiesgoCheque, jScrollPanelDatosTipoRiesgoCheque,jPanelPaginacionTipoRiesgoCheque, jScrollPanelDatosEdicionTipoRiesgoCheque, jPanelAccionesTipoRiesgoCheque,jPanelAccionesFormularioTipoRiesgoCheque,jmenuBarTipoRiesgoCheque,jmenuBarDetalleTipoRiesgoCheque,jTtoolBarTipoRiesgoCheque,jTtoolBarDetalleTipoRiesgoCheque);
						
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
	
	public void finishProcessTipoRiesgoCheque() {// throws Exception 
		this.finishProcessTipoRiesgoCheque(true);
	}
	
	public void finishProcessTipoRiesgoCheque(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoRiesgoCheque, this.jScrollPanelDatosTipoRiesgoCheque,this.jPanelPaginacionTipoRiesgoCheque, this.jScrollPanelDatosEdicionTipoRiesgoCheque, this.jPanelAccionesTipoRiesgoCheque,this.jPanelAccionesFormularioTipoRiesgoCheque,this.jmenuBarTipoRiesgoCheque,this.jmenuBarDetalleTipoRiesgoCheque,this.jTtoolBarTipoRiesgoCheque,this.jTtoolBarDetalleTipoRiesgoCheque);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRiesgoCheque=null; 
		
		final JPanel jPanelParametrosReportesTipoRiesgoCheque=this.jPanelParametrosReportesTipoRiesgoCheque;
		//final JScrollPane jScrollPanelDatosTipoRiesgoCheque=this.jScrollPanelDatosTipoRiesgoCheque;
		final JTable jTableDatosTipoRiesgoCheque=this.jTableDatosTipoRiesgoCheque;		
		final JPanel jPanelPaginacionTipoRiesgoCheque=this.jPanelPaginacionTipoRiesgoCheque;
		//final JScrollPane jScrollPanelDatosEdicionTipoRiesgoCheque=this.jScrollPanelDatosEdicionTipoRiesgoCheque;
		final JPanel jPanelAccionesTipoRiesgoCheque=this.jPanelAccionesTipoRiesgoCheque;
		
		JPanel jPanelCamposAuxiliarTipoRiesgoCheque=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoRiesgoCheque=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) {
			jPanelCamposAuxiliarTipoRiesgoCheque=this.jInternalFrameDetalleFormTipoRiesgoCheque.jPanelCamposTipoRiesgoCheque;
			jPanelAccionesFormularioAuxiliarTipoRiesgoCheque=this.jInternalFrameDetalleFormTipoRiesgoCheque.jPanelAccionesFormularioTipoRiesgoCheque;
		}
		
		final JPanel jPanelCamposTipoRiesgoCheque=jPanelCamposAuxiliarTipoRiesgoCheque;
		final JPanel jPanelAccionesFormularioTipoRiesgoCheque=jPanelAccionesFormularioAuxiliarTipoRiesgoCheque;
		
		
		final JMenuBar jmenuBarTipoRiesgoCheque=this.jmenuBarTipoRiesgoCheque;		
		final JToolBar jTtoolBarTipoRiesgoCheque=this.jTtoolBarTipoRiesgoCheque;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoRiesgoCheque=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRiesgoCheque=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) {
			jmenuBarDetalleAuxiliarTipoRiesgoCheque=this.jInternalFrameDetalleFormTipoRiesgoCheque.jmenuBarDetalleTipoRiesgoCheque;
			jTtoolBarDetalleAuxiliarTipoRiesgoCheque=this.jInternalFrameDetalleFormTipoRiesgoCheque.jTtoolBarDetalleTipoRiesgoCheque;		
		}
		
		final JMenuBar jmenuBarDetalleTipoRiesgoCheque=jmenuBarDetalleAuxiliarTipoRiesgoCheque;
		final JToolBar jTtoolBarDetalleTipoRiesgoCheque=jTtoolBarDetalleAuxiliarTipoRiesgoCheque;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRiesgoCheque;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRiesgoCheque;
			processRunnable.jTableDatos=jTableDatosTipoRiesgoCheque;
			processRunnable.jPanelCampos=jPanelCamposTipoRiesgoCheque;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRiesgoCheque;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRiesgoCheque;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRiesgoCheque;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRiesgoCheque;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRiesgoCheque;
			processRunnable.jTtoolBar=jTtoolBarTipoRiesgoCheque;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRiesgoCheque;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoRiesgoCheque ,jPanelParametrosReportesTipoRiesgoCheque, jTableDatosTipoRiesgoCheque,/*jScrollPanelDatosTipoRiesgoCheque,*/jPanelCamposTipoRiesgoCheque,jPanelPaginacionTipoRiesgoCheque, /*jScrollPanelDatosEdicionTipoRiesgoCheque,*/ jPanelAccionesTipoRiesgoCheque,jPanelAccionesFormularioTipoRiesgoCheque,jmenuBarTipoRiesgoCheque,jmenuBarDetalleTipoRiesgoCheque,jTtoolBarTipoRiesgoCheque,jTtoolBarDetalleTipoRiesgoCheque));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoRiesgoCheque(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoRiesgoCheque(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoRiesgoCheque(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoRiesgoCheque(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoRiesgoCheque,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoRiesgoCheque,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoRiesgoCheque(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoRiesgoCheque,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoRiesgoCheque,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tiporiesgochequeConstantesFunciones.getsFinalQueryTipoRiesgoCheque();
		String  finalQueryPaginacionTodos=this.tiporiesgochequeConstantesFunciones.getsFinalQueryTipoRiesgoCheque();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoRiesgoChequeConstantesFunciones.getArrayColumnasGlobalesNoTipoRiesgoCheque(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoRiesgoChequeConstantesFunciones.getArrayColumnasGlobalesTipoRiesgoCheque(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoRiesgoChequeConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tiporiesgochequesEliminados= new ArrayList<TipoRiesgoCheque>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoRiesgoCheque();
		
				///*TipoRiesgoChequeSessionBean*/this.tiporiesgochequeSessionBean=new TipoRiesgoChequeSessionBean();
			
			if(this.tiporiesgochequeSessionBean==null) {
				this.tiporiesgochequeSessionBean=new TipoRiesgoChequeSessionBean();
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
					this.iNumeroPaginacion=TipoRiesgoChequeConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoRiesgoChequeConstantesFunciones.getClassesForeignKeysOfTipoRiesgoCheque(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tiporiesgocheque."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tiporiesgochequesAux= new ArrayList<TipoRiesgoCheque>();
			
				
			tiporiesgochequeLogic.setDatosCliente(this.datosCliente);
			tiporiesgochequeLogic.setDatosDeep(this.datosDeep);
			tiporiesgochequeLogic.setIsConDeep(true);
			
			
			tiporiesgochequeLogic.getTipoRiesgoChequeDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tiporiesgochequeLogic.getTodosTipoRiesgoCheques(finalQueryGlobal,pagination);
					
					//tiporiesgochequeLogic.getTodosTipoRiesgoChequesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tiporiesgochequeLogic.getTipoRiesgoCheques()==null|| tiporiesgochequeLogic.getTipoRiesgoCheques().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporiesgochequesAux= new ArrayList<TipoRiesgoCheque>();
							tiporiesgochequesAux.addAll(tiporiesgochequeLogic.getTipoRiesgoCheques());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporiesgochequesAux= new ArrayList<TipoRiesgoCheque>();
							tiporiesgochequesAux.addAll(tiporiesgocheques);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporiesgochequeLogic.getTodosTipoRiesgoCheques(finalQueryGlobal+"",this.pagination);												
							
							//tiporiesgochequeLogic.getTodosTipoRiesgoChequesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoRiesgoCheques("Todos",tiporiesgochequeLogic.getTipoRiesgoCheques() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporiesgochequeLogic.setTipoRiesgoCheques(new ArrayList<TipoRiesgoCheque>());					
							tiporiesgochequeLogic.getTipoRiesgoCheques().addAll(tiporiesgochequesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporiesgocheques=new ArrayList<TipoRiesgoCheque>();
							tiporiesgocheques.addAll(tiporiesgochequesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoRiesgoCheque=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoRiesgoCheque=this.idActual;
				
				} else if(this.idTipoRiesgoChequeActual!=null && this.idTipoRiesgoChequeActual!=0L) {
					idTipoRiesgoCheque=idTipoRiesgoChequeActual;
				}
				
					
				this.sDetalleReporte=TipoRiesgoChequeConstantesFunciones.getDetalleIndicePorId(idTipoRiesgoCheque);
				
				this.tiporiesgocheques=new ArrayList<TipoRiesgoCheque>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tiporiesgochequeLogic.getEntity(idTipoRiesgoCheque);
					
					//tiporiesgochequeLogic.getEntityWithConnection(idTipoRiesgoCheque);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporiesgochequeLogic.setTipoRiesgoCheques(new ArrayList<TipoRiesgoCheque>());
					tiporiesgochequeLogic.getTipoRiesgoCheques().add(tiporiesgochequeLogic.getTipoRiesgoCheque());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporiesgocheques=new ArrayList<TipoRiesgoCheque>();
					this.tiporiesgocheques.add(tiporiesgocheque);
				}
				
				if(tiporiesgochequeLogic.getTipoRiesgoCheque()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoRiesgoCheque();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoRiesgoCheque();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporiesgochequeLogic.getTipoRiesgoCheques().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporiesgocheques.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporiesgochequeLogic.getTipoRiesgoCheques().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporiesgocheques.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoRiesgoCheque tiporiesgocheque) {
		Boolean permite=true;
		
		if(this.tiporiesgocheque.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoRiesgoChequeConstantesFunciones.getOrderByListaTipoRiesgoCheque();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoRiesgoChequeConstantesFunciones.getOrderByListaTipoRiesgoCheque();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRiesgoCheque tiporiesgocheque:tiporiesgochequeLogic.getTipoRiesgoCheques()) {
				if(tiporiesgocheque.getsType().equals(Constantes2.S_TOTALES)) {
					tiporiesgochequeTotales=tiporiesgocheque;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRiesgoCheque tiporiesgocheque:this.tiporiesgocheques) {
				if(tiporiesgocheque.getsType().equals(Constantes2.S_TOTALES)) {
					tiporiesgochequeTotales=tiporiesgocheque;
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
			this.tiporiesgochequeAux=new TipoRiesgoCheque();
			this.tiporiesgochequeAux.setsType(Constantes2.S_TOTALES);
			this.tiporiesgochequeAux.setIsNew(false);
			this.tiporiesgochequeAux.setIsChanged(false);
			this.tiporiesgochequeAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoRiesgoChequeConstantesFunciones.TotalizarValoresFilaTipoRiesgoCheque(this.tiporiesgochequeLogic.getTipoRiesgoCheques(),this.tiporiesgochequeAux);
				
				this.tiporiesgochequeLogic.getTipoRiesgoCheques().add(this.tiporiesgochequeAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoRiesgoChequeConstantesFunciones.TotalizarValoresFilaTipoRiesgoCheque(this.tiporiesgocheques,this.tiporiesgochequeAux);
				
				this.tiporiesgocheques.add(this.tiporiesgochequeAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tiporiesgochequeTotales=new TipoRiesgoCheque();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporiesgochequeLogic.getTipoRiesgoCheques().remove(tiporiesgochequeTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporiesgocheques.remove(tiporiesgochequeTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tiporiesgochequeTotales=new TipoRiesgoCheque();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRiesgoCheque tiporiesgocheque:tiporiesgochequeLogic.getTipoRiesgoCheques()) {
				if(tiporiesgocheque.getsType().equals(Constantes2.S_TOTALES)) {
					tiporiesgochequeTotales=tiporiesgocheque;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoRiesgoChequeConstantesFunciones.TotalizarValoresFilaTipoRiesgoCheque(this.tiporiesgochequeLogic.getTipoRiesgoCheques(),tiporiesgochequeTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRiesgoCheque tiporiesgocheque:this.tiporiesgocheques) {
				if(tiporiesgocheque.getsType().equals(Constantes2.S_TOTALES)) {
					tiporiesgochequeTotales=tiporiesgocheque;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoRiesgoChequeConstantesFunciones.TotalizarValoresFilaTipoRiesgoCheque(this.tiporiesgocheques,tiporiesgochequeTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoRiesgoCheque() {
		this.isPermisoTodoTipoRiesgoCheque=false;
		this.isPermisoNuevoTipoRiesgoCheque=false;
		this.isPermisoActualizarTipoRiesgoCheque=false;
		this.isPermisoActualizarOriginalTipoRiesgoCheque=false;
		this.isPermisoEliminarTipoRiesgoCheque=false;
		this.isPermisoGuardarCambiosTipoRiesgoCheque=false;
		this.isPermisoConsultaTipoRiesgoCheque=false;
		this.isPermisoBusquedaTipoRiesgoCheque=false;
		this.isPermisoReporteTipoRiesgoCheque=false;		
		this.isPermisoOrdenTipoRiesgoCheque=false;		
		this.isPermisoPaginacionMedioTipoRiesgoCheque=false;		
		this.isPermisoPaginacionAltoTipoRiesgoCheque=false;
		this.isPermisoPaginacionTodoTipoRiesgoCheque=false;
		this.isPermisoCopiarTipoRiesgoCheque=false;		
		this.isPermisoVerFormTipoRiesgoCheque=false;		
		this.isPermisoDuplicarTipoRiesgoCheque=false;		
		this.isPermisoOrdenTipoRiesgoCheque=false;		
	}
	
	public void setPermisosUsuarioTipoRiesgoCheque(Boolean isPermiso) {
		this.isPermisoTodoTipoRiesgoCheque=isPermiso;
		this.isPermisoNuevoTipoRiesgoCheque=isPermiso;
		this.isPermisoActualizarTipoRiesgoCheque=isPermiso;
		this.isPermisoActualizarOriginalTipoRiesgoCheque=isPermiso;
		this.isPermisoEliminarTipoRiesgoCheque=isPermiso;
		this.isPermisoGuardarCambiosTipoRiesgoCheque=isPermiso;
		this.isPermisoConsultaTipoRiesgoCheque=isPermiso;
		this.isPermisoBusquedaTipoRiesgoCheque=isPermiso;
		this.isPermisoReporteTipoRiesgoCheque=isPermiso;
		this.isPermisoOrdenTipoRiesgoCheque=isPermiso;		
		this.isPermisoPaginacionMedioTipoRiesgoCheque=isPermiso;		
		this.isPermisoPaginacionAltoTipoRiesgoCheque=isPermiso;		
		this.isPermisoPaginacionTodoTipoRiesgoCheque=isPermiso;		
		this.isPermisoCopiarTipoRiesgoCheque=isPermiso;		
		this.isPermisoVerFormTipoRiesgoCheque=isPermiso;		
		this.isPermisoDuplicarTipoRiesgoCheque=isPermiso;
		this.isPermisoOrdenTipoRiesgoCheque=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoRiesgoCheque(Boolean isPermiso) {
		//this.isPermisoTodoTipoRiesgoCheque=isPermiso;
		this.isPermisoNuevoTipoRiesgoCheque=isPermiso;
		this.isPermisoActualizarTipoRiesgoCheque=isPermiso;
		this.isPermisoActualizarOriginalTipoRiesgoCheque=isPermiso;
		this.isPermisoEliminarTipoRiesgoCheque=isPermiso;
		this.isPermisoGuardarCambiosTipoRiesgoCheque=isPermiso;
		//this.isPermisoConsultaTipoRiesgoCheque=isPermiso;
		//this.isPermisoBusquedaTipoRiesgoCheque=isPermiso;
		//this.isPermisoReporteTipoRiesgoCheque=isPermiso;
		//this.isPermisoOrdenTipoRiesgoCheque=isPermiso;		
		//this.isPermisoPaginacionMedioTipoRiesgoCheque=isPermiso;		
		//this.isPermisoPaginacionAltoTipoRiesgoCheque=isPermiso;		
		//this.isPermisoPaginacionTodoTipoRiesgoCheque=isPermiso;		
		//this.isPermisoCopiarTipoRiesgoCheque=isPermiso;		
		//this.isPermisoDuplicarTipoRiesgoCheque=isPermiso;
		//this.isPermisoOrdenTipoRiesgoCheque=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoRiesgoChequeClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(FormaPagoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		
		if(TipoRiesgoChequeJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosFormaPagoPuntoVenta=false;
		this.isTienePermisosFormaPagoPuntoVenta=this.verificarGetPermisosUsuarioOpcionTipoRiesgoChequeClaseRelacionada(this.opcionsRelacionadas,FormaPagoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoRiesgoCheque(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoRiesgoChequeClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosFormaPagoPuntoVenta=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoRiesgoChequeClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoRiesgoChequeClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoRiesgoChequeClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosFormaPagoPuntoVenta && this.jInternalFrameDetalleFormTipoRiesgoCheque!=null && this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jTabbedPaneRelacionesTipoRiesgoCheque.remove(this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoRiesgoCheque() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoRiesgoChequeJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoRiesgoChequeConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoRiesgoCheque=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoRiesgoCheque=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoRiesgoCheque=this.isPermisoActualizarTipoRiesgoCheque;
			this.isPermisoEliminarTipoRiesgoCheque=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoRiesgoCheque=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoRiesgoCheque=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoRiesgoCheque=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoRiesgoCheque=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoRiesgoCheque=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRiesgoCheque=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoRiesgoCheque=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoRiesgoCheque=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoRiesgoCheque=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoRiesgoCheque=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoRiesgoCheque=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoRiesgoCheque=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRiesgoCheque=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoRiesgoCheque.setToolTipText(this.jTableDatosTipoRiesgoCheque.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoRiesgoCheque(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoRiesgoCheque(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoRiesgoChequeJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoRiesgoChequeJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoRiesgoCheque() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosFormaPagoPuntoVenta && this.tiporiesgochequeConstantesFunciones.mostrarFormaPagoPuntoVentaTipoRiesgoCheque && !TipoRiesgoChequeConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Forma Pago");
			reporte.setsDescripcion("Forma Pago");
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
	
		
	public void inicializarCombosForeignKeyTipoRiesgoChequeListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoRiesgoChequeListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoRiesgoChequeJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoRiesgoChequeListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoRiesgoChequeListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoRiesgoCheque()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoRiesgoCheque()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoRiesgoCheque(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoRiesgoCheque()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRiesgoCheque();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoRiesgoCheque(TipoRiesgoCheque tiporiesgocheque)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoRiesgoCheque(TipoRiesgoCheque tiporiesgocheque,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoRiesgoCheque()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRiesgoCheque()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoRiesgoCheque()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoRiesgoCheque()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoRiesgoCheque()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoRiesgoCheque()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoRiesgoCheque(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoRiesgoCheque()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoRiesgoChequeBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoRiesgoChequeBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoRiesgoChequeBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tiporiesgochequeSessionBean=new TipoRiesgoChequeSessionBean(); 
		this.tiporiesgochequeConstantesFunciones=new TipoRiesgoChequeConstantesFunciones(); 
		this.tiporiesgochequeBean=new TipoRiesgoCheque();//(this.tiporiesgochequeConstantesFunciones); 		
		this.tiporiesgochequeReturnGeneral=new TipoRiesgoChequeParameterReturnGeneral(); 
		
		this.tiporiesgochequeSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporiesgochequeSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoRiesgoChequeBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoRiesgoChequeBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoRiesgoChequeBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoRiesgoCheque(true);
			
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
			
			this.tiporiesgochequeConstantesFunciones=new TipoRiesgoChequeConstantesFunciones(); 
			this.tiporiesgochequeBean=new TipoRiesgoCheque();//this.tiporiesgochequeConstantesFunciones); 			
			this.tiporiesgochequeReturnGeneral=new TipoRiesgoChequeParameterReturnGeneral(); 
		
			TipoRiesgoChequeBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Riesgo Cheque Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tiporiesgocheque=new TipoRiesgoCheque();
			this.tiporiesgocheques = new ArrayList<TipoRiesgoCheque>();
			this.tiporiesgochequesAux = new ArrayList<TipoRiesgoCheque>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic=new TipoRiesgoChequeLogic();
				this.tiporiesgochequeLogic.getNewConnexionToDeep("");
			}
			
			//this.tiporiesgochequeSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tiporiesgochequeSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoRiesgoCheque);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoRiesgoCheque!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRiesgoCheque);	
					}
					
					if(this.jInternalFrameImportacionTipoRiesgoCheque!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRiesgoCheque);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoRiesgoCheque!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoRiesgoCheque);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRiesgoCheque);
				this.jInternalFrameDetalleFormTipoRiesgoCheque.setVisible(false);
				this.jInternalFrameDetalleFormTipoRiesgoCheque.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoRiesgoCheque!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRiesgoCheque);
					this.jInternalFrameReporteDinamicoTipoRiesgoCheque.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoRiesgoCheque.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoRiesgoCheque!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoRiesgoCheque);
					this.jInternalFrameImportacionTipoRiesgoCheque.setVisible(false);
					this.jInternalFrameImportacionTipoRiesgoCheque.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoRiesgoCheque!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoRiesgoCheque);
					this.jInternalFrameOrderByTipoRiesgoCheque.setVisible(false);
					this.jInternalFrameOrderByTipoRiesgoCheque.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoRiesgoChequeActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoRiesgoChequeConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tiporiesgochequeReturnGeneral=new TipoRiesgoChequeParameterReturnGeneral();
			
			this.tiporiesgochequeParameterGeneral=new TipoRiesgoChequeParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tiporiesgochequeLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoRiesgoChequeJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(FormaPagoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoRiesgoChequeConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporiesgochequeSessionBean.getEsGuardarRelacionado(),this.tiporiesgochequeSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoRiesgoChequeConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporiesgochequeSessionBean.getEsGuardarRelacionado(),this.tiporiesgochequeSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoRiesgoCheque=false;
			this.isVisibilidadCeldaDuplicarTipoRiesgoCheque=true;
			this.isVisibilidadCeldaCopiarTipoRiesgoCheque=true;
			this.isVisibilidadCeldaVerFormTipoRiesgoCheque=true;
			this.isVisibilidadCeldaOrdenTipoRiesgoCheque=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque=false;
			this.isVisibilidadCeldaModificarTipoRiesgoCheque=false;
			this.isVisibilidadCeldaActualizarTipoRiesgoCheque=false;
			this.isVisibilidadCeldaEliminarTipoRiesgoCheque=false;
			this.isVisibilidadCeldaCancelarTipoRiesgoCheque=false;
			this.isVisibilidadCeldaGuardarTipoRiesgoCheque=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCheque=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoRiesgoCheque("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoRiesgoCheque();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoRiesgoCheque(false);
			
			this.setPermisosUsuarioTipoRiesgoCheque();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporiesgochequeSessionBean.getEsGuardarRelacionado() 
				|| (this.tiporiesgochequeSessionBean.getEsGuardarRelacionado() && this.tiporiesgochequeSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoRiesgoChequeClasesRelacionadas();
			}
			
			if(this.tiporiesgochequeSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoRiesgoChequeClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoRiesgoChequeJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoRiesgoCheque();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoRiesgoCheque();
			}
			
			if(!this.isPermisoBusquedaTipoRiesgoCheque) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoRiesgoCheque,this.isPermisoPaginacionMedioTipoRiesgoCheque,this.isPermisoPaginacionTodoTipoRiesgoCheque);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoRiesgoChequeConstantesFunciones.getTiposSeleccionarTipoRiesgoCheque());
				
				this.tiposColumnasSelect=TipoRiesgoChequeConstantesFunciones.getTiposSeleccionarTipoRiesgoCheque(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoRiesgoCheque();				
				//this.tiposRelacionesSelect=TipoRiesgoChequeConstantesFunciones.getTiposRelacionesTipoRiesgoCheque(true);
				
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
			//if(!this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoRiesgoCheque();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoRiesgoCheque(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoRiesgoCheque(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRiesgoCheque() ;
			
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
			
			
			this.formapagopuntoventaLogic=new FormaPagoPuntoVentaLogic(); 
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
				tiporiesgochequeImplementable= (TipoRiesgoChequeImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoRiesgoChequeConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tiporiesgochequeImplementableHome= (TipoRiesgoChequeImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoRiesgoChequeConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tiporiesgocheques= new ArrayList<TipoRiesgoCheque>();
			this.tiporiesgochequesEliminados= new ArrayList<TipoRiesgoCheque>();
						
			this.isEsNuevoTipoRiesgoCheque=false;
			this.esParaAccionDesdeFormularioTipoRiesgoCheque=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoRiesgoCheque(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoRiesgoCheque();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoRiesgoChequeConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoRiesgoCheque("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoRiesgoCheque(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoRiesgoCheque();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoRiesgoCheque();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoRiesgoCheque(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoRiesgoCheque: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoRiesgoCheque() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoRiesgoCheque")) {
				iIndex=this.jInternalFrameDetalleFormTipoRiesgoCheque.jTabbedPaneRelacionesTipoRiesgoCheque.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoRiesgoCheque.jTabbedPaneRelacionesTipoRiesgoCheque.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoRiesgoCheque.getSelectedRow();	
				
				

				if(sTitle.equals("Forma Pagoes")) {
					if(!FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoRiesgoCheque();

						this.cargarParteTabPanelRelacionadaFormaPagoPuntoVenta(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoRiesgoCheque();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaFormaPagoPuntoVenta(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoRiesgoCheque.cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(false,true,iIndex);
		this.jButtonFormaPagoPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFormaPagoPuntoVenta();

		//this.jTabbedPaneRelacionesTipoRiesgoCheque.updateUI();
		//this.jTabbedPaneRelacionesTipoRiesgoCheque.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoRiesgoCheque.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("FormaPagoPuntoVenta")) {
				int row=this.jTableDatosTipoRiesgoCheque.getSelectedRow();
				jButtonFormaPagoPuntoVentaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Forma Pago")) {

					if(this.isTienePermisosFormaPagoPuntoVenta && this.tiporiesgochequeConstantesFunciones.mostrarFormaPagoPuntoVentaTipoRiesgoCheque && !TipoRiesgoChequeConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Forma Pagoes"+"("+FormaPagoPuntoVentaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Forma Pagoes");

						if(tiporiesgochequeConstantesFunciones.resaltarFormaPagoPuntoVentaTipoRiesgoCheque!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tiporiesgochequeConstantesFunciones.resaltarFormaPagoPuntoVentaTipoRiesgoCheque);
						}

						jmenuItem.setEnabled(this.tiporiesgochequeConstantesFunciones.activarFormaPagoPuntoVentaTipoRiesgoCheque);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FormaPagoPuntoVenta"));

						

						this.jInternalFrameDetalleFormTipoRiesgoCheque.jmenuDetalleTipoRiesgoCheque.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoRiesgoCheque(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoRiesgoCheque(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoRiesgoCheque(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoRiesgoChequeListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoRiesgoCheque();
		
		this.cargarCombosFrameForeignKeyTipoRiesgoCheque();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoRiesgoCheque();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoRiesgoCheque();
		}
	}
	
	
	
	public void jButtonNuevoTipoRiesgoChequeActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tiporiesgochequeSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoRiesgoCheque==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
			
			
			if(jTableDatosTipoRiesgoCheque.getRowCount()>=1) {
				jTableDatosTipoRiesgoCheque.removeRowSelectionInterval(0, jTableDatosTipoRiesgoCheque.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoRiesgoCheque=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoRiesgoCheque(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoRiesgoCheque(true);			
			//this.tiporiesgocheque=new TipoRiesgoCheque();
			//this.tiporiesgocheque.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRiesgoCheque(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRiesgoCheque() ;
			
			if(TipoRiesgoChequeJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRiesgoCheque(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tiporiesgocheque);	
			this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocheque);				
			
			TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
			
			if(this.tiporiesgochequeSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoRiesgoCheque: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoRiesgoChequeActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoRiesgoCheque> tiporiesgochequesSeleccionados=new ArrayList<TipoRiesgoCheque>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoRiesgoCheque.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoRiesgoCheque.getSelectedRows().length;			
			}
			
			tiporiesgochequesSeleccionados=this.getTipoRiesgoChequesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoRiesgoCheque--;			
				//TipoRiesgoCheque tiporiesgochequeAux= new TipoRiesgoCheque();			
				//tiporiesgochequeAux.setId(this.iIdNuevoTipoRiesgoCheque);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoRiesgoCheque tiporiesgochequeOrigen=new TipoRiesgoCheque();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoRiesgoCheque tiporiesgochequeOrigen : tiporiesgochequesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoRiesgoCheque.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tiporiesgochequeOrigen =(TipoRiesgoCheque) this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporiesgochequeOrigen =(TipoRiesgoCheque) this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoRiesgoCheque();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tiporiesgocheque.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoRiesgoCheque(tiporiesgochequeOrigen,this.tiporiesgocheque,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCheque(this.tiporiesgocheque);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporiesgochequeLogic.getTipoRiesgoCheques().add(this.tiporiesgochequeAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporiesgocheques.add(this.tiporiesgochequeAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoRiesgoCheque(false);
				
				this.jTableDatosTipoRiesgoCheque.setRowSelectionInterval(this.getIndiceNuevoTipoRiesgoCheque(), this.getIndiceNuevoTipoRiesgoCheque());
				
				int iLastRow =  this.jTableDatosTipoRiesgoCheque.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRiesgoCheque.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRiesgoCheque.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRiesgoCheque(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoRiesgoChequeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoRiesgoCheque> tiporiesgochequesSeleccionados=new ArrayList<TipoRiesgoCheque>();									
		
			TipoRiesgoCheque tiporiesgochequeOrigen=new TipoRiesgoCheque();
			TipoRiesgoCheque tiporiesgochequeDestino=new TipoRiesgoCheque();
				
			tiporiesgochequesSeleccionados=this.getTipoRiesgoChequesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoRiesgoCheque.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tiporiesgochequesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoRiesgoCheque.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporiesgochequeOrigen =(TipoRiesgoCheque) this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporiesgochequeOrigen =(TipoRiesgoCheque) this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporiesgochequeDestino =(TipoRiesgoCheque) this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporiesgochequeDestino =(TipoRiesgoCheque) this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tiporiesgochequeOrigen =tiporiesgochequesSeleccionados.get(0);
				tiporiesgochequeDestino =tiporiesgochequesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoRiesgoCheque(tiporiesgochequeOrigen,tiporiesgochequeDestino,true,false);
				
				tiporiesgochequeDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporiesgochequeDestino,tiporiesgochequeLogic.getTipoRiesgoCheques());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporiesgochequeDestino,tiporiesgocheques);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoRiesgoCheque(false);
				
				//this.jTableDatosTipoRiesgoCheque.setRowSelectionInterval(this.getIndiceNuevoTipoRiesgoCheque(), this.getIndiceNuevoTipoRiesgoCheque());
				
				int iLastRow =  this.jTableDatosTipoRiesgoCheque.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRiesgoCheque.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRiesgoCheque.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRiesgoCheque(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoRiesgoChequeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCheque==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoRiesgoCheque.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoRiesgoChequeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoRiesgoCheque.isVisible();
			
			
			this.jPanelParametrosReportesTipoRiesgoCheque.setVisible(!isVisible);
			this.jPanelPaginacionTipoRiesgoCheque.setVisible(!isVisible);
			this.jPanelAccionesTipoRiesgoCheque.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoRiesgoChequeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoRiesgoCheque();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoRiesgoChequeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoRiesgoCheque();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoRiesgoChequeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoRiesgoCheque();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoRiesgoChequeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoRiesgoCheque();
			
			this.abrirFrameOrderByTipoRiesgoCheque();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoRiesgoChequeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoRiesgoCheque();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoRiesgoCheque(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRiesgoCheque);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoRiesgoCheque.isMaximum()) {
					this.jInternalFrameDetalleFormTipoRiesgoCheque.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoRiesgoCheque.setSize(this.jInternalFrameDetalleFormTipoRiesgoCheque.iWidthFormulario,this.jInternalFrameDetalleFormTipoRiesgoCheque.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoRiesgoCheque.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoRiesgoCheque.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoRiesgoCheque.isMaximum()) {
						this.jInternalFrameDetalleFormTipoRiesgoCheque.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoRiesgoCheque.jContentPaneDetalleTipoRiesgoCheque.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoRiesgoCheque.jTabbedPaneRelacionesTipoRiesgoCheque.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoRiesgoCheque.jContentPaneDetalleTipoRiesgoCheque.getWidth(),TipoRiesgoChequeConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRiesgoCheque.jTabbedPaneRelacionesTipoRiesgoCheque.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoRiesgoCheque.jContentPaneDetalleTipoRiesgoCheque.getWidth(),TipoRiesgoChequeConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRiesgoCheque.jTabbedPaneRelacionesTipoRiesgoCheque.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoRiesgoCheque.jContentPaneDetalleTipoRiesgoCheque.getWidth(),TipoRiesgoChequeConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFormaPagoPuntoVenta();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoRiesgoCheque.setVisible(true);
	        this.jInternalFrameDetalleFormTipoRiesgoCheque.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoRiesgoCheque() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoRiesgoCheque==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoRiesgoCheque=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRiesgoCheque,false,this);
				} else {
					this.jInternalFrameOrderByTipoRiesgoCheque=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRiesgoCheque,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoRiesgoCheque);
				this.jInternalFrameOrderByTipoRiesgoCheque.setVisible(false);
				this.jInternalFrameOrderByTipoRiesgoCheque.setSelected(false);
				
				this.jInternalFrameOrderByTipoRiesgoCheque.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRiesgoCheque"));
				
				this.inicializarActualizarBindingTablaOrderByTipoRiesgoCheque();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoRiesgoCheque() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoRiesgoCheque==null) {
				
				this.jInternalFrameImportacionTipoRiesgoCheque=new ImportacionJInternalFrame(TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRiesgoCheque);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoRiesgoCheque);
				this.jInternalFrameImportacionTipoRiesgoCheque.setVisible(false);
				this.jInternalFrameImportacionTipoRiesgoCheque.setSelected(false);


				this.jInternalFrameImportacionTipoRiesgoCheque.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRiesgoCheque"));
				this.jInternalFrameImportacionTipoRiesgoCheque.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRiesgoCheque"));
				this.jInternalFrameImportacionTipoRiesgoCheque.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRiesgoCheque"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoRiesgoCheque() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoRiesgoCheque==null) {
				this.jInternalFrameReporteDinamicoTipoRiesgoCheque=new ReporteDinamicoJInternalFrame(TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRiesgoCheque);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRiesgoCheque);
				this.jInternalFrameReporteDinamicoTipoRiesgoCheque.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoRiesgoCheque.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRiesgoCheque"));
				this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRiesgoCheque"));
				this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRiesgoCheque"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRiesgoCheque();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaFormaPagoPuntoVenta() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoRiesgoCheque.jContentPaneDetalleTipoRiesgoCheque.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoRiesgoCheque() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRiesgoCheque);
			
	       	this.jInternalFrameDetalleFormTipoRiesgoCheque.setVisible(false);
	        this.jInternalFrameDetalleFormTipoRiesgoCheque.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoRiesgoCheque.dispose();
			//this.jInternalFrameDetalleFormTipoRiesgoCheque=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoRiesgoCheque() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoRiesgoCheque.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoRiesgoCheque.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoRiesgoCheque() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoRiesgoCheque.setVisible(true);
	        this.jInternalFrameImportacionTipoRiesgoCheque.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoRiesgoCheque() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoRiesgoCheque.setVisible(true);
	        this.jInternalFrameOrderByTipoRiesgoCheque.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoRiesgoCheque() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoRiesgoCheque.setVisible(false);
	        this.jInternalFrameOrderByTipoRiesgoCheque.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoRiesgoCheque() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoRiesgoCheque.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoRiesgoCheque.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoRiesgoCheque() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoRiesgoCheque.setVisible(false);
	        this.jInternalFrameImportacionTipoRiesgoCheque.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoRiesgoChequeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoRiesgoCheque(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoRiesgoCheque(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRiesgoCheque.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoRiesgoCheque(true);
			//this.isEsNuevoTipoRiesgoCheque=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoRiesgoCheque("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRiesgoCheque(false) ;
			
			if(tiporiesgochequeSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.getEsGuardarRelacionado() && FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormaPagoPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoRiesgoChequeJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRiesgoCheque(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRiesgoCheque(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoRiesgoChequeActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoRiesgoCheque.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoRiesgoCheque(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCheque==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRiesgoCheque.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoRiesgoCheque(true);
			//this.isEsNuevoTipoRiesgoCheque=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tiporiesgocheque.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoRiesgoCheque("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoRiesgoCheque(false) ;
			
			if(TipoRiesgoChequeJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRiesgoCheque(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRiesgoCheque(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoRiesgoChequeActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoRiesgoCheque(false);
			
			//if(!this.isEsNuevoTipoRiesgoCheque) {								
				int intSelectedRow = this.jTableDatosTipoRiesgoCheque.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoRiesgoChequeJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoRiesgoCheque(this.tiporiesgocheque,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCheque(this.tiporiesgocheque);
				
			}
			
			if(this.permiteMantenimiento(this.tiporiesgocheque)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoRiesgoCheque=true;
					this.inicializarActualizarBindingTablaTipoRiesgoCheque(false);
					this.isEsNuevoTipoRiesgoCheque=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoRiesgoCheque=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoRiesgoCheque=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRiesgoCheque(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRiesgoCheque(false);
				
				this.habilitarDeshabilitarControlesTipoRiesgoCheque(false);
			
												
				
				if(TipoRiesgoChequeJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoRiesgoCheque();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoRiesgoChequeActionPerformed(evt,tiporiesgochequeSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoRiesgoCheque(this.tiporiesgocheque,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoRiesgoCheque.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tiporiesgochequeSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tiporiesgocheque.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoRiesgoCheque.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRiesgoCheque.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoRiesgoChequeActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoRiesgoCheque.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
				this.tiporiesgocheque.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
				this.tiporiesgocheque.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tiporiesgocheque)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoRiesgoChequeModel) this.jTableDatosTipoRiesgoCheque.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoRiesgoCheque=true;
				this.inicializarActualizarBindingTablaTipoRiesgoCheque(false);
				this.isEsNuevoTipoRiesgoCheque=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRiesgoCheque(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRiesgoCheque(false);
				
				this.habilitarDeshabilitarControlesTipoRiesgoCheque(false);
				
				
				
				if(TipoRiesgoChequeJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoRiesgoCheque();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoRiesgoChequeActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoRiesgoCheque.getRowCount()>=1) {
				jTableDatosTipoRiesgoCheque.removeRowSelectionInterval(0, jTableDatosTipoRiesgoCheque.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoRiesgoCheque(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoRiesgoCheque(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRiesgoCheque(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRiesgoCheque(false) ;
			
			this.isEsNuevoTipoRiesgoCheque=false;
			
			if(TipoRiesgoChequeJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoRiesgoCheque();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoRiesgoChequeActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoRiesgoCheque(false);
				
				//SI ES MANUAL
				if(TipoRiesgoChequeJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoRiesgoCheque();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoRiesgoChequeActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoRiesgoCheque--;			
			//TipoRiesgoCheque tiporiesgochequeAux= new TipoRiesgoCheque();			
			//tiporiesgochequeAux.setId(this.iIdNuevoTipoRiesgoCheque);
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCheque==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoRiesgoCheque();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCheque(this.tiporiesgocheque);
			
			this.tiporiesgocheque.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tiporiesgochequeLogic.getTipoRiesgoCheques().add(this.tiporiesgochequeAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tiporiesgocheques.add(this.tiporiesgochequeAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoRiesgoCheque(false);
			
			this.jTableDatosTipoRiesgoCheque.setRowSelectionInterval(this.getIndiceNuevoTipoRiesgoCheque(), this.getIndiceNuevoTipoRiesgoCheque());
			
			int iLastRow =  this.jTableDatosTipoRiesgoCheque.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoRiesgoCheque.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoRiesgoCheque.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoRiesgoCheque(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoRiesgoChequeActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoRiesgoCheque(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRiesgoCheque(false);
			
			//SI ES MANUAL
			if(TipoRiesgoChequeJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRiesgoCheque();
			}
			
			//this.abrirFrameTreeTipoRiesgoCheque();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoRiesgoChequeActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Riesgo ChequeS ?", "MANTENIMIENTO DE Tipo Riesgo Cheque", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoRiesgoCheque.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoRiesgoCheque();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tiporiesgochequeReturnGeneral=tiporiesgochequeLogic.procesarImportacionTipoRiesgoChequesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tiporiesgochequeParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoRiesgoChequeReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoRiesgoChequeActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoRiesgoCheque.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoRiesgoCheque.setFileImportacion(this.jInternalFrameImportacionTipoRiesgoCheque.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoRiesgoCheque.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoRiesgoCheque.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoRiesgoCheque.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoRiesgoCheque.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoRiesgoChequeActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoRiesgoCheque> tiporiesgochequesSeleccionados=new ArrayList<TipoRiesgoCheque>();		

		tiporiesgochequesSeleccionados=this.getTipoRiesgoChequesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoRiesgoChequeBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoRiesgoChequeBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoRiesgoCheques("Todos",tiporiesgochequesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Riesgo Cheque",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoRiesgoChequeConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRiesgoChequeConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoRiesgoChequeConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoRiesgoChequeConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoRiesgoChequeConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoRiesgoChequeConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoRiesgoChequeConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoRiesgoChequeConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoRiesgoChequeActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoRiesgoCheque> tiporiesgochequesSeleccionados=new ArrayList<TipoRiesgoCheque>();		
		
		tiporiesgochequesSeleccionados=this.getTipoRiesgoChequesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporiesgocheque";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoRiesgoCheques");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoRiesgoChequeConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRiesgoChequeConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoRiesgoCheque tiporiesgocheque:tiporiesgochequesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporiesgocheque.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRiesgoChequeConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRiesgoChequeConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(TipoRiesgoCheque tiporiesgocheque:tiporiesgochequesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporiesgocheque.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelTipoRiesgoCheque(row);				
			//	iRow++;
			//}				
			
			//for(TipoRiesgoCheque tiporiesgochequeAux:tiporiesgochequesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoRiesgoCheque(tiporiesgochequeAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Riesgo Cheque",JOptionPane.INFORMATION_MESSAGE);
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
				this.tiporiesgochequeLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRiesgoCheque(false);
			
			//SI ES MANUAL
			if(TipoRiesgoChequeJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRiesgoCheque();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoRiesgoChequeActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRiesgoCheque(false);
			
			//SI ES MANUAL
			if(TipoRiesgoChequeJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRiesgoCheque();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoRiesgoChequeActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRiesgoCheque(false);
			
			//SI ES MANUAL
			if(TipoRiesgoChequeJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRiesgoCheque();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgochequeLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoRiesgoCheque() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoRiesgoCheque.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoRiesgoCheque.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoRiesgoCheque.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoRiesgoCheque.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoRiesgoCheque.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoRiesgoCheque.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoRiesgoCheque.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoRiesgoCheque(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoRiesgoCheque(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoRiesgoCheque(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoRiesgoCheque(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoRiesgoCheque(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoRiesgoCheque(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRiesgoCheque(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoRiesgoCheque(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoRiesgoChequeJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoRiesgoChequeJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoRiesgoCheque() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoRiesgoCheque();
		
		this.inicializarActualizarBindingBotonesManualTipoRiesgoCheque(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRiesgoCheque();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRiesgoCheque() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRiesgoCheque(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRiesgoCheque(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoRiesgoCheque.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoRiesgoCheque.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoRiesgoCheque.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoRiesgoCheque.jCheckBoxPostAccionNuevoTipoRiesgoCheque.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoRiesgoCheque.jCheckBoxPostAccionSinCerrarTipoRiesgoCheque.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoRiesgoCheque.jCheckBoxPostAccionSinMensajeTipoRiesgoCheque.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoRiesgoCheque.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoRiesgoCheque.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoRiesgoCheque.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) {
				this.jInternalFrameDetalleFormTipoRiesgoCheque.jCheckBoxPostAccionNuevoTipoRiesgoCheque.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoRiesgoCheque.jCheckBoxPostAccionSinCerrarTipoRiesgoCheque.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoRiesgoCheque.jCheckBoxPostAccionSinMensajeTipoRiesgoCheque.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoRiesgoCheque.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoRiesgoCheque.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoRiesgoCheque.jComboBoxTiposAccionesFormularioTipoRiesgoCheque.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoRiesgoCheque.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoRiesgoCheque!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoRiesgoCheque.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoRiesgoCheque.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoRiesgoCheque.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoRiesgoCheque.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoRiesgoCheque!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoRiesgoCheque.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoRiesgoCheque.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoRiesgoCheque(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoRiesgoChequeJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRiesgoCheque(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoRiesgoCheque() throws Exception {
		try	{
			if(TipoRiesgoChequeJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRiesgoCheque();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRiesgoCheque() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jComboBoxTiposAccionesFormularioTipoRiesgoCheque.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jComboBoxTiposAccionesFormularioTipoRiesgoCheque.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRiesgoCheque() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoRiesgoCheque.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoRiesgoCheque.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoRiesgoCheque.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoRiesgoCheque.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoRiesgoCheque.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoRiesgoCheque.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoRiesgoCheque.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoRiesgoCheque.addItem(reporte);
			}
			
			
			if(!this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoRiesgoCheque.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoRiesgoCheque.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoRiesgoCheque.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoRiesgoCheque.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoRiesgoCheque.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoRiesgoCheque.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoRiesgoCheque.jComboBoxTiposAccionesFormularioTipoRiesgoCheque.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoRiesgoCheque.jComboBoxTiposAccionesFormularioTipoRiesgoCheque.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoRiesgoCheque.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoRiesgoCheque.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoRiesgoCheque.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRiesgoCheque();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRiesgoCheque() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRiesgoCheque!=null) {
				this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRiesgoCheque!=null) {
				this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoRiesgoCheque!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoRiesgoCheque()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoRiesgoCheque(Boolean esInicializar) throws Exception {				
		if(TipoRiesgoChequeJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRiesgoCheque();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoRiesgoCheque() throws Exception {
		this.inicializarActualizarBindingTablaTipoRiesgoCheque(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoRiesgoCheque() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoRiesgoCheque.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoRiesgoCheque.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRiesgoCheque.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoRiesgoChequePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoRiesgoCheque.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRiesgoCheque.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoRiesgoChequePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoRiesgoChequeOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRiesgoChequeOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoRiesgoChequePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoRiesgoCheque.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRiesgoCheque.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoRiesgoChequePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoRiesgoCheque.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoRiesgoCheque(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tiporiesgochequeLogic.getTipoRiesgoCheques().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tiporiesgocheques.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoRiesgoChequeJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoRiesgoCheque.setModel(new TipoRiesgoChequeModel(this.tiporiesgochequeLogic.getTipoRiesgoCheques(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoRiesgoCheque.setModel(new TipoRiesgoChequeModel(this.tiporiesgocheques,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoRiesgoCheque!=null && this.jInternalFrameOrderByTipoRiesgoCheque.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoRiesgoCheque();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoRiesgoCheque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRiesgoCheque,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoRiesgoChequePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO,tiporiesgochequeConstantesFunciones.resaltarSeleccionarTipoRiesgoCheque,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO,tiporiesgochequeConstantesFunciones.resaltarSeleccionarTipoRiesgoCheque,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoRiesgoCheque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRiesgoCheque,TipoRiesgoChequeConstantesFunciones.LABEL_ID));

		if(this.tiporiesgochequeConstantesFunciones.mostraridTipoRiesgoCheque && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRiesgoChequeConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiporiesgochequeConstantesFunciones.resaltaridTipoRiesgoCheque,this.tiporiesgochequeConstantesFunciones.activaridTipoRiesgoCheque,this,true,"idTipoRiesgoCheque","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporiesgochequeConstantesFunciones.resaltaridTipoRiesgoCheque,this.tiporiesgochequeConstantesFunciones.activaridTipoRiesgoCheque,this,true,"idTipoRiesgoCheque","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRiesgoCheque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRiesgoCheque,TipoRiesgoChequeConstantesFunciones.LABEL_NOMBRE));

		if(this.tiporiesgochequeConstantesFunciones.mostrarnombreTipoRiesgoCheque && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRiesgoChequeConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiporiesgochequeConstantesFunciones.resaltarnombreTipoRiesgoCheque,this.tiporiesgochequeConstantesFunciones.activarnombreTipoRiesgoCheque,this,true,"nombreTipoRiesgoCheque","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporiesgochequeConstantesFunciones.resaltarnombreTipoRiesgoCheque,this.tiporiesgochequeConstantesFunciones.activarnombreTipoRiesgoCheque,this,true,"nombreTipoRiesgoCheque","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRiesgoChequePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRiesgoCheque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRiesgoCheque,TipoRiesgoChequeConstantesFunciones.LABEL_DESCRIPCION));

		if(this.tiporiesgochequeConstantesFunciones.mostrardescripcionTipoRiesgoCheque && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRiesgoChequeConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiporiesgochequeConstantesFunciones.resaltardescripcionTipoRiesgoCheque,this.tiporiesgochequeConstantesFunciones.activardescripcionTipoRiesgoCheque,this,true,"descripcionTipoRiesgoCheque","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporiesgochequeConstantesFunciones.resaltardescripcionTipoRiesgoCheque,this.tiporiesgochequeConstantesFunciones.activardescripcionTipoRiesgoCheque,this,true,"descripcionTipoRiesgoCheque","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRiesgoChequePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosFormaPagoPuntoVenta && this.tiporiesgochequeConstantesFunciones.mostrarFormaPagoPuntoVentaTipoRiesgoCheque && !TipoRiesgoChequeConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Forma Pagoes");
				tableColumn.setHeaderValue("Forma Pagoes");
				tableColumn.setCellRenderer(new FormaPagoPuntoVentaTableCell(tiporiesgochequeConstantesFunciones.resaltarFormaPagoPuntoVentaTipoRiesgoCheque,this,this.tiporiesgochequeConstantesFunciones.activarFormaPagoPuntoVentaTipoRiesgoCheque));
				tableColumn.setCellEditor(new FormaPagoPuntoVentaTableCell(tiporiesgochequeConstantesFunciones.resaltarFormaPagoPuntoVentaTipoRiesgoCheque,this,this.tiporiesgochequeConstantesFunciones.activarFormaPagoPuntoVentaTipoRiesgoCheque));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoRiesgoCheque.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRiesgoCheque.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRiesgoCheque.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoRiesgoCheque && this.isPermisoGuardarCambiosTipoRiesgoCheque) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoRiesgoCheque.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tiporiesgochequeSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoRiesgoCheque.addColumn(tableColumn);
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
			
			this.jTableDatosTipoRiesgoCheque.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRiesgoCheque && this.isPermisoGuardarCambiosTipoRiesgoCheque) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiporiesgochequeSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRiesgoCheque && this.isPermisoGuardarCambiosTipoRiesgoCheque) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoRiesgoCheque.moveColumn(this.jTableDatosTipoRiesgoCheque.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoRiesgoCheque.moveColumn(this.jTableDatosTipoRiesgoCheque.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiporiesgochequeSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoRiesgoCheque.moveColumn(this.jTableDatosTipoRiesgoCheque.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoRiesgoCheque.moveColumn(this.jTableDatosTipoRiesgoCheque.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoRiesgoCheque.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoRiesgoCheque.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoRiesgoCheque,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoRiesgoChequeJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoRiesgoCheque.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoRiesgoCheque.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoRiesgoChequeJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoRiesgoChequeJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoRiesgoCheque.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoRiesgoCheque.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoRiesgoCheque.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tiporiesgochequeLogic.getTipoRiesgoCheques().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tiporiesgocheques.size()-1;
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
		//this.jTableDatosTipoRiesgoCheque.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoRiesgoCheque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoRiesgoCheque();
			
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
				
				//this.isEsNuevoTipoRiesgoCheque=false;
					
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
			
				if(this.tiporiesgochequeSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoRiesgoCheque==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRiesgoCheque.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRiesgoCheque.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tiporiesgocheque.getsType().equals("DUPLICADO")
				   || this.tiporiesgocheque.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoRiesgoCheque=true;
				
				} else {
					this.isEsNuevoTipoRiesgoCheque=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
					if(this.tiporiesgocheque.getId()>=0 && !this.tiporiesgocheque.getIsNew()) {						
						this.isEsNuevoTipoRiesgoCheque=false;
						
					} else {
						this.isEsNuevoTipoRiesgoCheque=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoRiesgoCheque(esRelaciones);						
				
				this.seleccionarTipoRiesgoCheque(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tiporiesgocheque.getId()<0) {
					this.isEsNuevoTipoRiesgoCheque=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoRiesgoCheque(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoRiesgoCheque(evt,rowIndex);
				}	
				
				if(this.tiporiesgochequeSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoRiesgoCheque: " + this.dDif); 
					}
				}								
				
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoRiesgoCheque(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tiporiesgocheque)) {
					if(this.tiporiesgocheque.getId()>0) {
						this.tiporiesgocheque.setIsDeleted(true);
						
						this.tiporiesgochequesEliminados.add(this.tiporiesgocheque);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporiesgochequeLogic.getTipoRiesgoCheques().remove(this.tiporiesgocheque);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporiesgocheques.remove(this.tiporiesgocheque);				
					}
					
					
					((TipoRiesgoChequeModel) this.jTableDatosTipoRiesgoCheque.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRiesgoCheque(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoRiesgoCheque(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoRiesgoCheque) {
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCheque==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRiesgoCheque.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRiesgoCheque.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoRiesgoChequeJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoRiesgoCheque(this.tiporiesgocheque);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoRiesgoCheque("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoRiesgoCheque(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRiesgoCheque() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRiesgoCheque(TipoRiesgoCheque tiporiesgocheque) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoRiesgoCheque(tiporiesgocheque,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRiesgoCheque(TipoRiesgoCheque tiporiesgocheque,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoRiesgoCheque(tiporiesgocheque);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoRiesgoCheque(tiporiesgocheque,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoRiesgoCheque(tiporiesgocheque);
	}
	
	public void setVariablesObjetoActualToFormularioTipoRiesgoCheque(TipoRiesgoCheque tiporiesgocheque) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCheque==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextFieldidTipoRiesgoCheque.setText(tiporiesgocheque.getId().toString());
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextAreanombreTipoRiesgoCheque.setText(tiporiesgocheque.getnombre());
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextAreadescripcionTipoRiesgoCheque.setText(tiporiesgocheque.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoRiesgoCheque tiporiesgochequeLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tiporiesgochequeLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoRiesgoCheque tiporiesgochequeLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tiporiesgochequeLocal=this.tiporiesgocheque;
			} else {
				tiporiesgochequeLocal=this.tiporiesgochequeAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tiporiesgochequeLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoRiesgoCheque(tiporiesgochequeLocal,true);
					
					if(tiporiesgochequeSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tiporiesgochequeLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tiporiesgochequeLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoRiesgoCheque(TipoRiesgoCheque tiporiesgocheque,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRiesgoCheque(tiporiesgocheque,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCheque(tiporiesgocheque);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRiesgoCheque(TipoRiesgoCheque tiporiesgocheque,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRiesgoCheque(tiporiesgocheque,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRiesgoCheque(TipoRiesgoCheque tiporiesgocheque,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCheque==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextFieldidTipoRiesgoCheque.getText()==null || this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextFieldidTipoRiesgoCheque.getText()=="" || this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextFieldidTipoRiesgoCheque.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextFieldidTipoRiesgoCheque.setText("0");
			}

			if(conColumnasBase) {tiporiesgocheque.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextFieldidTipoRiesgoCheque.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRiesgoChequeConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRiesgoCheque.jLabelIdTipoRiesgoCheque,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporiesgocheque.setnombre(this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextAreanombreTipoRiesgoCheque.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRiesgoChequeConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRiesgoCheque.jLabelnombreTipoRiesgoCheque,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporiesgocheque.setdescripcion(this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextAreadescripcionTipoRiesgoCheque.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRiesgoChequeConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRiesgoCheque.jLabeldescripcionTipoRiesgoCheque,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRiesgoCheque(TipoRiesgoCheque tiporiesgochequeBean,TipoRiesgoCheque tiporiesgocheque,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoRiesgoCheque(TipoRiesgoCheque tiporiesgochequeOrigen,TipoRiesgoCheque tiporiesgocheque,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporiesgochequeOrigen.getId()!=null && !tiporiesgochequeOrigen.getId().equals(0L))) {tiporiesgocheque.setId(tiporiesgochequeOrigen.getId());}}
			if(conDefault || (!conDefault && tiporiesgochequeOrigen.getnombre()!=null && !tiporiesgochequeOrigen.getnombre().equals(""))) {tiporiesgocheque.setnombre(tiporiesgochequeOrigen.getnombre());}
			if(conDefault || (!conDefault && tiporiesgochequeOrigen.getdescripcion()!=null && !tiporiesgochequeOrigen.getdescripcion().equals(""))) {tiporiesgocheque.setdescripcion(tiporiesgochequeOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRiesgoCheque(TipoRiesgoCheque tiporiesgocheque) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextFieldidTipoRiesgoCheque.setText(tiporiesgocheque.getId().toString());
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextAreanombreTipoRiesgoCheque.setText(tiporiesgocheque.getnombre());
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextAreadescripcionTipoRiesgoCheque.setText(tiporiesgocheque.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRiesgoCheque(TipoRiesgoChequeBean tiporiesgochequeBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextFieldidTipoRiesgoCheque.setText(tiporiesgochequeBean.getId().toString());
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextAreanombreTipoRiesgoCheque.setText(tiporiesgochequeBean.getnombre());
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextAreadescripcionTipoRiesgoCheque.setText(tiporiesgochequeBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoRiesgoCheque(TipoRiesgoChequeParameterReturnGeneral tiporiesgochequeReturnGeneral,TipoRiesgoChequeBean tiporiesgochequeBean,Boolean conDefault) throws Exception { 
		try {
			TipoRiesgoCheque tiporiesgochequeLocal=new TipoRiesgoCheque();
			
			tiporiesgochequeLocal=tiporiesgochequeReturnGeneral.getTipoRiesgoCheque();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporiesgochequeLocal.getId()!=null && !tiporiesgochequeLocal.getId().equals(0L))) {tiporiesgochequeBean.setId(tiporiesgochequeLocal.getId());}}
			if(conDefault || (!conDefault && tiporiesgochequeLocal.getnombre()!=null && !tiporiesgochequeLocal.getnombre().equals(""))) {tiporiesgochequeBean.setnombre(tiporiesgochequeLocal.getnombre());}
			if(conDefault || (!conDefault && tiporiesgochequeLocal.getdescripcion()!=null && !tiporiesgochequeLocal.getdescripcion().equals(""))) {tiporiesgochequeBean.setdescripcion(tiporiesgochequeLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoRiesgoChequeGenerico(Long idTipoRiesgoChequeSeleccionado,JComboBox jComboBoxTipoRiesgoCheque,List<TipoRiesgoCheque> tiporiesgochequesLocal)throws Exception {
		try {
			TipoRiesgoCheque  tiporiesgochequeTemp=null;

			for(TipoRiesgoCheque tiporiesgochequeAux:tiporiesgochequesLocal) {
				if(tiporiesgochequeAux.getId()!=null && tiporiesgochequeAux.getId().equals(idTipoRiesgoChequeSeleccionado)) {
					tiporiesgochequeTemp=tiporiesgochequeAux;
					break;
				}
			}

			jComboBoxTipoRiesgoCheque.setSelectedItem(tiporiesgochequeTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoRiesgoChequeGenerico(JComboBox jComboBoxTipoRiesgoCheque,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoRiesgoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRiesgoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoRiesgoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRiesgoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRiesgoCheque.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoRiesgoCheque.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRiesgoCheque.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoRiesgoCheque.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoRiesgoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoRiesgoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("FormaPagoPuntoVenta")) {
			jButtonFormaPagoPuntoVentaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporiesgocheque=(TipoRiesgoCheque) tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporiesgocheque =(TipoRiesgoCheque) tiporiesgocheques.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoRiesgoCheque tiporiesgochequeRow=new TipoRiesgoCheque();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporiesgochequeRow=(TipoRiesgoCheque) tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporiesgochequeRow=(TipoRiesgoCheque) tiporiesgocheques.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonFormaPagoPuntoVentaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoRiesgoCheque tiporiesgocheque) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoRiesgoCheque==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgochequeLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporiesgocheque = (TipoRiesgoCheque)this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tiporiesgocheque = (TipoRiesgoCheque)this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tiporiesgocheque!=null) {
						this.tiporiesgocheque = tiporiesgocheque;
					} else {
						this.tiporiesgocheque = new TipoRiesgoCheque();
					}
				}

				if(this.isTienePermisosFormaPagoPuntoVenta && this.permiteMantenimiento(this.tiporiesgocheque)) {
					FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFramePopup=new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						formapagopuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFramePopup;
					} else {
						formapagopuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame;
					}

					List<TipoRiesgoCheque> tiporiesgocheques=new ArrayList<TipoRiesgoCheque>();
					tiporiesgocheques.add(this.tiporiesgocheque);
					if(!esRelacionado) {
						//formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setConGuardarRelaciones(false);
						//formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					formapagopuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoRiesgoCheque.cargarFormaPagoPuntoVentaBeanSwingJInternalFrame(tiporiesgocheques,this.tiporiesgocheque,formapagopuntoventaBeanSwingJInternalFrame,/*conInicializar,*/formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.getConGuardarRelaciones(),formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.getEsGuardarRelacionado());
					formapagopuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPagoPuntoVenta("no_relacionado");

						formapagopuntoventaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FormaPagoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA + (FormaPagoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA/2));

						formapagopuntoventaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoRiesgoCheque=(TitledBorder)this.jScrollPanelDatosTipoRiesgoCheque.getBorder();
						TitledBorder titledBorderFormaPagoPuntoVenta=(TitledBorder)formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.getBorder();

						titledBorderFormaPagoPuntoVenta.setTitle(titledBorderTipoRiesgoCheque.getTitle() + " -> Forma Pago");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,formapagopuntoventaBeanSwingJInternalFrame);
						}

						formapagopuntoventaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(formapagopuntoventaBeanSwingJInternalFrame);

						formapagopuntoventaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tiporiesgochequeSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Forma Pago",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgochequeLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgochequeLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgochequeLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoRiesgoCheque(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaNuevoTipoRiesgoCheque && this.isPermisoNuevoTipoRiesgoCheque));			
			this.jButtonDuplicarTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaDuplicarTipoRiesgoCheque && this.isPermisoDuplicarTipoRiesgoCheque));			
			this.jButtonCopiarTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaCopiarTipoRiesgoCheque && this.isPermisoCopiarTipoRiesgoCheque));
			this.jButtonVerFormTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaVerFormTipoRiesgoCheque && this.isPermisoVerFormTipoRiesgoCheque));
			
			this.jButtonAbrirOrderByTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaOrdenTipoRiesgoCheque && this.isPermisoOrdenTipoRiesgoCheque));			
			
			this.jButtonNuevoRelacionesTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque && this.isPermisoNuevoTipoRiesgoCheque));			
			this.jButtonNuevoGuardarCambiosTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaNuevoTipoRiesgoCheque && this.isPermisoNuevoTipoRiesgoCheque && this.isPermisoGuardarCambiosTipoRiesgoCheque));
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) {
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonModificarTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaModificarTipoRiesgoCheque && this.isPermisoActualizarTipoRiesgoCheque));	
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonActualizarTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaActualizarTipoRiesgoCheque && this.isPermisoActualizarTipoRiesgoCheque));	
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonEliminarTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaEliminarTipoRiesgoCheque && this.isPermisoEliminarTipoRiesgoCheque));
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonCancelarTipoRiesgoCheque.setVisible(this.isVisibilidadCeldaCancelarTipoRiesgoCheque);							
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonGuardarCambiosTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaGuardarTipoRiesgoCheque && this.isPermisoGuardarCambiosTipoRiesgoCheque));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCheque && this.isPermisoGuardarCambiosTipoRiesgoCheque));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaNuevoTipoRiesgoCheque && this.isPermisoNuevoTipoRiesgoCheque));						
			this.jButtonDuplicarToolBarTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaDuplicarTipoRiesgoCheque && this.isPermisoDuplicarTipoRiesgoCheque));						
			this.jButtonCopiarToolBarTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaCopiarTipoRiesgoCheque && this.isPermisoCopiarTipoRiesgoCheque));			
			this.jButtonVerFormToolBarTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaVerFormTipoRiesgoCheque && this.isPermisoVerFormTipoRiesgoCheque));			
			this.jButtonAbrirOrderByToolBarTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaOrdenTipoRiesgoCheque && this.isPermisoOrdenTipoRiesgoCheque));
			this.jButtonNuevoRelacionesToolBarTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque && this.isPermisoNuevoTipoRiesgoCheque));			
			this.jButtonNuevoGuardarCambiosToolBarTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaNuevoTipoRiesgoCheque && this.isPermisoNuevoTipoRiesgoCheque && this.isPermisoGuardarCambiosTipoRiesgoCheque));			
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) {
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonModificarToolBarTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaModificarTipoRiesgoCheque && this.isPermisoActualizarTipoRiesgoCheque));	
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonActualizarToolBarTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaActualizarTipoRiesgoCheque  && this.isPermisoActualizarTipoRiesgoCheque));	
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonEliminarToolBarTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaEliminarTipoRiesgoCheque && this.isPermisoEliminarTipoRiesgoCheque));
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonCancelarToolBarTipoRiesgoCheque.setVisible(this.isVisibilidadCeldaCancelarTipoRiesgoCheque);				
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonGuardarCambiosToolBarTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaGuardarTipoRiesgoCheque && this.isPermisoGuardarCambiosTipoRiesgoCheque));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCheque && this.isPermisoGuardarCambiosTipoRiesgoCheque));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaNuevoTipoRiesgoCheque && this.isPermisoNuevoTipoRiesgoCheque));			
			this.jMenuItemDuplicarTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaDuplicarTipoRiesgoCheque && this.isPermisoDuplicarTipoRiesgoCheque));			
			this.jMenuItemCopiarTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaCopiarTipoRiesgoCheque && this.isPermisoCopiarTipoRiesgoCheque));			
			this.jMenuItemVerFormTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaVerFormTipoRiesgoCheque && this.isPermisoVerFormTipoRiesgoCheque));			
			this.jMenuItemAbrirOrderByTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaOrdenTipoRiesgoCheque && this.isPermisoOrdenTipoRiesgoCheque));			
			//this.jMenuItemMostrarOcultarTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaOrdenTipoRiesgoCheque && this.isPermisoOrdenTipoRiesgoCheque));
			this.jMenuItemDetalleAbrirOrderByTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaOrdenTipoRiesgoCheque && this.isPermisoOrdenTipoRiesgoCheque));			
			//this.jMenuItemDetalleMostrarOcultarTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaOrdenTipoRiesgoCheque && this.isPermisoOrdenTipoRiesgoCheque));			
			this.jMenuItemNuevoRelacionesTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque && this.isPermisoNuevoTipoRiesgoCheque));			
			this.jMenuItemNuevoGuardarCambiosTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaNuevoTipoRiesgoCheque && this.isPermisoNuevoTipoRiesgoCheque && this.isPermisoGuardarCambiosTipoRiesgoCheque));									
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) {
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jMenuItemModificarTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaModificarTipoRiesgoCheque && this.isPermisoActualizarTipoRiesgoCheque));	
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jMenuItemActualizarTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaActualizarTipoRiesgoCheque && this.isPermisoActualizarTipoRiesgoCheque));	
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jMenuItemEliminarTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaEliminarTipoRiesgoCheque && this.isPermisoEliminarTipoRiesgoCheque));
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jMenuItemCancelarTipoRiesgoCheque.setVisible(this.isVisibilidadCeldaCancelarTipoRiesgoCheque);				
			}
			
			this.jMenuItemGuardarCambiosTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaGuardarTipoRiesgoCheque && this.isPermisoGuardarCambiosTipoRiesgoCheque));						
			this.jMenuItemGuardarCambiosTablaTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCheque && this.isPermisoGuardarCambiosTipoRiesgoCheque));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoRiesgoCheque=this.jButtonNuevoTipoRiesgoCheque.isVisible();
			this.isVisibilidadCeldaDuplicarTipoRiesgoCheque=this.jButtonDuplicarTipoRiesgoCheque.isVisible();
			this.isVisibilidadCeldaCopiarTipoRiesgoCheque=this.jButtonCopiarTipoRiesgoCheque.isVisible();
			this.isVisibilidadCeldaVerFormTipoRiesgoCheque=this.jButtonVerFormTipoRiesgoCheque.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoRiesgoCheque=this.jButtonAbrirOrderByTipoRiesgoCheque.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque=this.jButtonNuevoRelacionesTipoRiesgoCheque.isVisible();
			this.isVisibilidadCeldaModificarTipoRiesgoCheque=this.jButtonModificarTipoRiesgoCheque.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) {
			this.isVisibilidadCeldaActualizarTipoRiesgoCheque=this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonActualizarTipoRiesgoCheque.isVisible();
			this.isVisibilidadCeldaEliminarTipoRiesgoCheque=this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonEliminarTipoRiesgoCheque.isVisible();
			this.isVisibilidadCeldaCancelarTipoRiesgoCheque=this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonCancelarTipoRiesgoCheque.isVisible();
			this.isVisibilidadCeldaGuardarTipoRiesgoCheque=this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonGuardarCambiosTipoRiesgoCheque.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCheque=this.jButtonGuardarCambiosTablaTipoRiesgoCheque.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoRiesgoCheque=this.jButtonNuevoToolBarTipoRiesgoCheque.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque=this.jButtonNuevoRelacionesToolBarTipoRiesgoCheque.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) {
			this.isVisibilidadCeldaModificarTipoRiesgoCheque=this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonModificarToolBarTipoRiesgoCheque.isVisible();
			this.isVisibilidadCeldaActualizarTipoRiesgoCheque=this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonActualizarToolBarTipoRiesgoCheque.isVisible();
			this.isVisibilidadCeldaEliminarTipoRiesgoCheque=this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonEliminarToolBarTipoRiesgoCheque.isVisible();
			this.isVisibilidadCeldaCancelarTipoRiesgoCheque=this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonCancelarToolBarTipoRiesgoCheque.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRiesgoCheque=this.jButtonGuardarCambiosToolBarTipoRiesgoCheque.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCheque=this.jButtonGuardarCambiosTablaToolBarTipoRiesgoCheque.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoRiesgoCheque=this.jMenuItemNuevoTipoRiesgoCheque.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque=this.jMenuItemNuevoRelacionesTipoRiesgoCheque.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) {
			this.isVisibilidadCeldaModificarTipoRiesgoCheque=this.jInternalFrameDetalleFormTipoRiesgoCheque.jMenuItemModificarTipoRiesgoCheque.isVisible();
			this.isVisibilidadCeldaActualizarTipoRiesgoCheque=this.jInternalFrameDetalleFormTipoRiesgoCheque.jMenuItemActualizarTipoRiesgoCheque.isVisible();
			this.isVisibilidadCeldaEliminarTipoRiesgoCheque=this.jInternalFrameDetalleFormTipoRiesgoCheque.jMenuItemEliminarTipoRiesgoCheque.isVisible();
			this.isVisibilidadCeldaCancelarTipoRiesgoCheque=this.jInternalFrameDetalleFormTipoRiesgoCheque.jMenuItemCancelarTipoRiesgoCheque.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRiesgoCheque=this.jMenuItemGuardarCambiosTipoRiesgoCheque.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCheque=this.jMenuItemGuardarCambiosTablaTipoRiesgoCheque.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoRiesgoCheque(Boolean esInicializar) {
		if(TipoRiesgoChequeJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tiporiesgochequeSessionBean.getConGuardarRelaciones()) {
				//if(this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRiesgoCheque();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoRiesgoCheque(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoRiesgoCheque() {
		this.jButtonNuevoTipoRiesgoCheque.setVisible(this.isPermisoNuevoTipoRiesgoCheque);			
		this.jButtonDuplicarTipoRiesgoCheque.setVisible(this.isPermisoDuplicarTipoRiesgoCheque);			
		this.jButtonCopiarTipoRiesgoCheque.setVisible(this.isPermisoCopiarTipoRiesgoCheque);			
		this.jButtonVerFormTipoRiesgoCheque.setVisible(this.isPermisoVerFormTipoRiesgoCheque);			
		
		this.jButtonAbrirOrderByTipoRiesgoCheque.setVisible(this.isPermisoOrdenTipoRiesgoCheque);					
		
		this.jButtonNuevoRelacionesTipoRiesgoCheque.setVisible(this.isPermisoNuevoTipoRiesgoCheque);			
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonModificarTipoRiesgoCheque.setVisible(this.isPermisoActualizarTipoRiesgoCheque);	
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonActualizarTipoRiesgoCheque.setVisible(this.isPermisoActualizarTipoRiesgoCheque);	
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonEliminarTipoRiesgoCheque.setVisible(this.isPermisoEliminarTipoRiesgoCheque);
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonCancelarTipoRiesgoCheque.setVisible(this.isVisibilidadCeldaCancelarTipoRiesgoCheque);						
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonGuardarCambiosTipoRiesgoCheque.setVisible(this.isPermisoGuardarCambiosTipoRiesgoCheque);							
		}
		
		this.jButtonGuardarCambiosTablaTipoRiesgoCheque.setVisible(this.isPermisoActualizarTipoRiesgoCheque);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRiesgoCheque() {
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonModificarTipoRiesgoCheque.setVisible(this.isPermisoActualizarTipoRiesgoCheque);	
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonActualizarTipoRiesgoCheque.setVisible(this.isPermisoActualizarTipoRiesgoCheque);	
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonEliminarTipoRiesgoCheque.setVisible(this.isPermisoEliminarTipoRiesgoCheque);
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonCancelarTipoRiesgoCheque.setVisible(this.isVisibilidadCeldaCancelarTipoRiesgoCheque);							
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonGuardarCambiosTipoRiesgoCheque.setVisible((this.isVisibilidadCeldaGuardarTipoRiesgoCheque && this.isPermisoGuardarCambiosTipoRiesgoCheque));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoRiesgoCheque() {
		if(TipoRiesgoChequeJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoRiesgoCheque();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoRiesgoCheque() {
	}
	
	public void jTableDatosTipoRiesgoChequeListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoRiesgoCheque(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoRiesgoChequeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgochequeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRiesgoCheque.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRiesgoCheque(this.gettiporiesgocheque(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCheque(this.tiporiesgocheque);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporiesgocheque==null) {
						this.tiporiesgocheque = new TipoRiesgoCheque();
					}

					this.setVariablesFormularioToObjetoActualTipoRiesgoCheque(this.tiporiesgocheque,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCheque(this.tiporiesgocheque);
				}

				if(this.tiporiesgocheque.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tiporiesgocheque.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRiesgoCheque(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgochequeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgochequeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgochequeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoRiesgoChequeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgochequeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRiesgoCheque.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRiesgoCheque(this.gettiporiesgocheque(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCheque(this.tiporiesgocheque);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporiesgocheque==null) {
						this.tiporiesgocheque = new TipoRiesgoCheque();
					}

					this.setVariablesFormularioToObjetoActualTipoRiesgoCheque(this.tiporiesgocheque,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCheque(this.tiporiesgocheque);
				}

				if(this.tiporiesgocheque.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tiporiesgocheque.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRiesgoCheque(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgochequeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgochequeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgochequeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTipoRiesgoChequeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgochequeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRiesgoCheque.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRiesgoCheque(this.gettiporiesgocheque(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCheque(this.tiporiesgocheque);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporiesgocheque==null) {
						this.tiporiesgocheque = new TipoRiesgoCheque();
					}

					this.setVariablesFormularioToObjetoActualTipoRiesgoCheque(this.tiporiesgocheque,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCheque(this.tiporiesgocheque);
				}

				if(this.tiporiesgocheque.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.tiporiesgocheque.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRiesgoCheque(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgochequeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgochequeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgochequeLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoRiesgoCheque() {
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) {
		

		if(this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) {
			this.jInternalFrameDetalleFormTipoRiesgoCheque.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoRiesgoCheque.dispose();
			this.jInternalFrameDetalleFormTipoRiesgoCheque=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoRiesgoCheque!=null) {
			this.jInternalFrameReporteDinamicoTipoRiesgoCheque.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoRiesgoCheque.dispose();
			this.jInternalFrameReporteDinamicoTipoRiesgoCheque=null;
		}
		
		if(this.jInternalFrameImportacionTipoRiesgoCheque!=null) {
			this.jInternalFrameImportacionTipoRiesgoCheque.setVisible(false);	    			
			this.jInternalFrameImportacionTipoRiesgoCheque.dispose();
			this.jInternalFrameImportacionTipoRiesgoCheque=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoRiesgoCheque();
			
			TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoRiesgoCheque")) {
				jButtonNuevoTipoRiesgoChequeActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoRiesgoCheque")) {
				jButtonDuplicarTipoRiesgoChequeActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoRiesgoCheque")) {
				jButtonCopiarTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoRiesgoCheque")) {
				jButtonVerFormTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoRiesgoCheque")) {
				jButtonNuevoTipoRiesgoChequeActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoRiesgoCheque")) {
				jButtonDuplicarTipoRiesgoChequeActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoRiesgoCheque")) {
				jButtonNuevoTipoRiesgoChequeActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoRiesgoCheque")) {
				jButtonDuplicarTipoRiesgoChequeActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoRiesgoCheque")) {
				jButtonNuevoTipoRiesgoChequeActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoRiesgoCheque")) {
				jButtonNuevoTipoRiesgoChequeActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoRiesgoCheque")) {
				jButtonNuevoTipoRiesgoChequeActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoRiesgoCheque")) {
				jButtonModificarTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoRiesgoCheque")) {
				jButtonModificarTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoRiesgoCheque")) {
				jButtonModificarTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoRiesgoCheque")) {
				jButtonActualizarTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoRiesgoCheque")) {
				jButtonActualizarTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoRiesgoCheque")) {
				jButtonActualizarTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoRiesgoCheque")) {
				jButtonEliminarTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoRiesgoCheque")) {
				jButtonEliminarTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoRiesgoCheque")) {
				jButtonEliminarTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoRiesgoCheque")) {
				jButtonCancelarTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoRiesgoCheque")) {
				jButtonCancelarTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoRiesgoCheque")) {
				jButtonCancelarTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoRiesgoCheque")) {
				jButtonCerrarTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoRiesgoCheque")) {
				jButtonCerrarTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoRiesgoCheque")) {
				jButtonCerrarTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoRiesgoCheque")) {
				jButtonMostrarOcultarTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoRiesgoCheque")) {
				jButtonCancelarTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoRiesgoCheque")) {
				jButtonGuardarCambiosTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoRiesgoCheque")) {
				jButtonGuardarCambiosTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoRiesgoCheque")) {
				jButtonCopiarTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoRiesgoCheque")) {
				jButtonVerFormTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoRiesgoCheque")) {
				jButtonGuardarCambiosTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoRiesgoCheque")) {
				jButtonCopiarTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoRiesgoCheque")) {
				jButtonVerFormTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoRiesgoCheque")) {
				jButtonGuardarCambiosTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoRiesgoCheque")) {
				jButtonGuardarCambiosTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoRiesgoCheque")) {
				jButtonGuardarCambiosTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoRiesgoCheque")) {
				jButtonRecargarInformacionTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoRiesgoCheque")) {
				jButtonRecargarInformacionTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoRiesgoCheque")) {
				jButtonRecargarInformacionTipoRiesgoChequeActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoRiesgoCheque")) {
				jButtonAnterioresTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoRiesgoCheque")) {
				jButtonAnterioresTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoRiesgoCheque")) {
				jButtonAnterioresTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoRiesgoCheque")) {
				jButtonSiguientesTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoRiesgoCheque")) {
				jButtonSiguientesTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoRiesgoCheque")) {
				jButtonSiguientesTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoRiesgoCheque") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoRiesgoCheque")) {
				jButtonAbrirOrderByTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoRiesgoCheque") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoRiesgoCheque")) {
				jButtonMostrarOcultarTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRiesgoCheque")) {
				jButtonNuevoGuardarCambiosTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoRiesgoCheque")) {
				jButtonNuevoGuardarCambiosTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoRiesgoCheque")) {
				jButtonNuevoGuardarCambiosTipoRiesgoChequeActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoRiesgoCheque")) {
				jButtonCerrarReporteDinamicoTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoRiesgoCheque")) {
				jButtonGenerarReporteDinamicoTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoRiesgoCheque")) {
				
				jButtonGenerarExcelReporteDinamicoTipoRiesgoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoRiesgoCheque")) {
				jButtonCerrarImportacionTipoRiesgoChequeActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoRiesgoCheque")) {
				
				jButtonGenerarImportacionTipoRiesgoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoRiesgoCheque")) {
				
				jButtonAbrirImportacionTipoRiesgoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoRiesgoCheque")) {
				jComboBoxTiposAccionesTipoRiesgoChequeActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoRiesgoCheque")) {
				jComboBoxTiposRelacionesTipoRiesgoChequeActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoRiesgoCheque")) {
				jComboBoxTiposAccionesTipoRiesgoChequeActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoRiesgoCheque")) {
				
				jComboBoxTiposSeleccionarTipoRiesgoChequeActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoRiesgoCheque")) {
				jTextFieldValorCampoGeneralTipoRiesgoChequeActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoRiesgoCheque")) {
				jButtonAbrirOrderByTipoRiesgoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoRiesgoCheque")) {
				jButtonAbrirOrderByTipoRiesgoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoRiesgoCheque")) {
				jButtonCerrarOrderByTipoRiesgoChequeActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoRiesgoChequeBusqueda")) {
				this.jButtonidTipoRiesgoChequeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoRiesgoChequeBusqueda")) {
				this.jButtonnombreTipoRiesgoChequeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoRiesgoChequeBusqueda")) {
				this.jButtondescripcionTipoRiesgoChequeBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoRiesgoCheque();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRiesgoChequeActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocheque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocheque);
				
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
				
				


				
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRiesgoCheque.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRiesgoCheque.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoRiesgoCheque tiporiesgochequeLocal=null;
			
			if(!this.getEsControlTabla()) {
				tiporiesgochequeLocal=this.tiporiesgocheque;
			} else {
				tiporiesgochequeLocal=this.tiporiesgochequeAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocheque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocheque);
				
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
							
				
				


				
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRiesgoCheque.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRiesgoCheque.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRiesgoChequeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRiesgoCheque.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgochequeAnterior =(TipoRiesgoCheque) this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporiesgochequeAnterior =(TipoRiesgoCheque) this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
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
			
			TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
			
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
			
			


			
			TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRiesgoChequeActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocheque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocheque);
				
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
								
						
				


				
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRiesgoCheque.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRiesgoCheque.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocheque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocheque);
				
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
								
				
				


				
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRiesgoCheque.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRiesgoCheque.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRiesgoChequeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRiesgoCheque.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgochequeAnterior =(TipoRiesgoCheque) this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporiesgochequeAnterior =(TipoRiesgoCheque) this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocheque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocheque);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRiesgoChequeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRiesgoCheque.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgochequeAnterior =(TipoRiesgoCheque) this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporiesgochequeAnterior =(TipoRiesgoCheque) this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRiesgoChequeActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocheque);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocheque);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocheque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocheque);
				
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
							
				
				


				
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRiesgoCheque.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRiesgoCheque.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRiesgoChequeActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRiesgoCheque.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporiesgochequeAnterior =(TipoRiesgoCheque) this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporiesgochequeAnterior =(TipoRiesgoCheque) this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
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
			
			TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
			
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
			
			


			
			TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRiesgoChequeActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocheque);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocheque);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocheque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocheque);
				
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
								
				
				


				
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRiesgoCheque.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRiesgoCheque.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRiesgoChequeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRiesgoCheque.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgochequeAnterior =(TipoRiesgoCheque) this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporiesgochequeAnterior =(TipoRiesgoCheque) this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRiesgoChequeActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocheque);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocheque);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRiesgoChequeActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocheque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocheque);
				
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoRiesgoCheque")) {
					jCheckBoxSeleccionarTodosTipoRiesgoChequeItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoRiesgoCheque")) {
					jCheckBoxSeleccionadosTipoRiesgoChequeItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoRiesgoCheque")) {
					
				}
				
				


				
				
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRiesgoCheque.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRiesgoCheque.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocheque);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocheque);
				
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
												
				
				


				
				
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRiesgoCheque.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRiesgoCheque.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRiesgoChequeActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRiesgoCheque.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporiesgochequeAnterior =(TipoRiesgoCheque) this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporiesgochequeAnterior =(TipoRiesgoCheque) this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRiesgoChequeActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocheque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocheque);
				
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
				
				
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
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
			
			TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
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
			
			


			
			TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRiesgoChequeActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocheque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocheque);
				
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRiesgoCheque.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRiesgoCheque.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocheque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocheque);
				
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
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
				
				


				
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRiesgoCheque.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRiesgoCheque.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRiesgoChequeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRiesgoCheque.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgochequeAnterior =(TipoRiesgoCheque) this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporiesgochequeAnterior =(TipoRiesgoCheque) this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoRiesgoCheque")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoRiesgoChequeListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoRiesgoCheque.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tiporiesgocheque =(TipoRiesgoCheque) this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tiporiesgocheque);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoRiesgoCheque")) {
				
				}
				
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoRiesgoCheque")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoRiesgoCheque.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoRiesgoCheque")) {
			
			}
			
			TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoRiesgoCheque();
			
			TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
			
			if(sTipo.equals("NuevoTipoRiesgoCheque")) {
				jButtonNuevoTipoRiesgoChequeActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoRiesgoCheque")) {
				jButtonDuplicarTipoRiesgoChequeActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoRiesgoCheque")) {
				jButtonCopiarTipoRiesgoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoRiesgoCheque")) {
				jButtonVerFormTipoRiesgoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoRiesgoCheque")) {
				jButtonNuevoTipoRiesgoChequeActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoRiesgoCheque")) {
				jButtonModificarTipoRiesgoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoRiesgoCheque")) {
				jButtonActualizarTipoRiesgoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoRiesgoCheque")) {
				jButtonEliminarTipoRiesgoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoRiesgoCheque")) {
				jButtonGuardarCambiosTipoRiesgoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoRiesgoCheque")) {
				jButtonCancelarTipoRiesgoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoRiesgoCheque")) {
				jButtonCerrarTipoRiesgoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoRiesgoCheque")) {
				jButtonGuardarCambiosTipoRiesgoChequeActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRiesgoCheque")) {
				jButtonNuevoGuardarCambiosTipoRiesgoChequeActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoRiesgoCheque")) {
				jButtonAbrirOrderByTipoRiesgoChequeActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoRiesgoCheque")) {
				jButtonRecargarInformacionTipoRiesgoChequeActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoRiesgoCheque")) {
				jButtonAnterioresTipoRiesgoChequeActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoRiesgoCheque")) {
				jButtonSiguientesTipoRiesgoChequeActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoRiesgoChequeBusqueda")) {
				this.jButtonidTipoRiesgoChequeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoRiesgoChequeBusqueda")) {
				this.jButtonnombreTipoRiesgoChequeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoRiesgoChequeBusqueda")) {
				this.jButtondescripcionTipoRiesgoChequeBusquedaActionPerformed(evt);
			}
			
			TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoRiesgoCheque();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoRiesgoCheque")) {
				closingInternalFrameTipoRiesgoCheque();
				
			} else if(sTipo.equals("jButtonCancelarTipoRiesgoCheque")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoRiesgoCheque = (JInternalFrameBase)evt.getSource();
	            	
	            TipoRiesgoChequeBeanSwingJInternalFrame jInternalFrameParent=(TipoRiesgoChequeBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRiesgoCheque.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoRiesgoChequeActionPerformed(null);
			}
			
			TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporiesgocheque,new Object(),this.tiporiesgochequeParameterGeneral,this.tiporiesgochequeReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoRiesgoCheque(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoRiesgoCheque(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoRiesgoCheque(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tiporiesgocheque)) {
			if(!esControlTabla) {
				if(TipoRiesgoChequeJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoRiesgoCheque(this.tiporiesgocheque,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCheque(this.tiporiesgocheque);			
				}
				
				if(this.tiporiesgochequeSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoRiesgoCheque(this.tiporiesgocheque,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporiesgochequeReturnGeneral=tiporiesgochequeLogic.procesarEventosTipoRiesgoChequesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporiesgochequeLogic.getTipoRiesgoCheques(),this.tiporiesgocheque,this.tiporiesgochequeParameterGeneral,this.isEsNuevoTipoRiesgoCheque,classes);//this.tiporiesgochequeLogic.getTipoRiesgoCheque()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoRiesgoCheque(this.tiporiesgochequeReturnGeneral,this.tiporiesgochequeBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tiporiesgochequeSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoRiesgoCheque(classes,this.tiporiesgochequeReturnGeneral,this.tiporiesgochequeBean,false);
					}
						
					if(this.tiporiesgochequeReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoRiesgoCheque(this.tiporiesgochequeReturnGeneral.getTipoRiesgoCheque());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoRiesgoCheque(this.tiporiesgochequeReturnGeneral.getTipoRiesgoCheque());	
					}
						
					if(this.tiporiesgochequeReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoRiesgoCheque(this.tiporiesgochequeReturnGeneral.getTipoRiesgoCheque(),classes);//this.tiporiesgochequeBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoRiesgoCheque(this.tiporiesgocheque,classes);//this.tiporiesgochequeBean);									
				}
			
				if(TipoRiesgoChequeJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoRiesgoCheque(this.tiporiesgocheque,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCheque(this.tiporiesgocheque);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tiporiesgochequeAnterior!=null) {
						this.tiporiesgocheque=this.tiporiesgochequeAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporiesgochequeReturnGeneral=tiporiesgochequeLogic.procesarEventosTipoRiesgoChequesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporiesgochequeLogic.getTipoRiesgoCheques(),this.tiporiesgocheque,this.tiporiesgochequeParameterGeneral,this.isEsNuevoTipoRiesgoCheque,classes);//this.tiporiesgochequeLogic.getTipoRiesgoCheque()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporiesgochequeSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporiesgochequeSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tiporiesgochequeReturnGeneral.getTipoRiesgoCheque(),tiporiesgochequeLogic.getTipoRiesgoCheques());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tiporiesgochequeReturnGeneral.getTipoRiesgoCheque(),this.tiporiesgocheques);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoRiesgoCheque.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoRiesgoCheque.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoRiesgoCheque();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoRiesgoCheque() throws Exception {
		
		TipoRiesgoChequeModel tiporiesgochequeModel=(TipoRiesgoChequeModel)this.jTableDatosTipoRiesgoCheque.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporiesgochequeModel.tiporiesgocheques=this.tiporiesgochequeLogic.getTipoRiesgoCheques();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tiporiesgochequeModel.tiporiesgocheques=this.tiporiesgocheques;
		}
		
		
		((TipoRiesgoChequeModel) this.jTableDatosTipoRiesgoCheque.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoRiesgoCheque() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettiporiesgochequeAnterior(),this.tiporiesgochequeLogic.getTipoRiesgoCheques());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettiporiesgochequeAnterior(),this.tiporiesgocheques);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoRiesgoCheque();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoRiesgoCheque(TipoRiesgoCheque tiporiesgocheque,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FormaPagoPuntoVenta.class)) {
					this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.setFormaPagoPuntoVentas(tiporiesgocheque.getFormaPagoPuntoVentas());
					this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormaPagoPuntoVenta(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
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
										
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporiesgocheque,new Object(),generalEntityParameterGeneral,this.tiporiesgochequeReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tiporiesgochequeSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoRiesgoChequeConstantesFunciones.getClassesRelationshipsOfTipoRiesgoCheque(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoRiesgoChequeConstantesFunciones.getClassesRelationshipsFromStringsOfTipoRiesgoCheque(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoRiesgoCheque(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoRiesgoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporiesgocheque,new Object(),generalEntityParameterGeneral,this.tiporiesgochequeReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoRiesgoCheque(TipoRiesgoChequeBean tiporiesgochequeBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FormaPagoPuntoVenta.class)) {
					this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.setFormaPagoPuntoVentas(tiporiesgocheque.getFormaPagoPuntoVentas());
					this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormaPagoPuntoVenta(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoRiesgoCheque(ArrayList<Classe> classes,TipoRiesgoChequeReturnGeneral tiporiesgochequeReturnGeneral,TipoRiesgoChequeBean tiporiesgochequeBean,Boolean conDefault) throws Exception {
		
			this.tiporiesgochequeBean.setFormaPagoPuntoVentas(tiporiesgochequeReturnGeneral.getTipoRiesgoCheque().getFormaPagoPuntoVentas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoRiesgoCheque(TipoRiesgoCheque tiporiesgocheque,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(FormaPagoPuntoVenta.class)) {
					tiporiesgocheque.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tiporiesgocheque)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoRiesgoCheque = new TipoRiesgoChequeDetalleFormJInternalFrame(jDesktopPane,this.tiporiesgochequeSessionBean.getConGuardarRelaciones(),this.tiporiesgochequeSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRiesgoCheque);
		this.jInternalFrameDetalleFormTipoRiesgoCheque.setVisible(false);
		this.jInternalFrameDetalleFormTipoRiesgoCheque.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoRiesgoCheque.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoRiesgoCheque.tiporiesgochequeLogic=this.tiporiesgochequeLogic;
		
		this.cargarCombosFrameForeignKeyTipoRiesgoCheque("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRiesgoCheque();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRiesgoCheque();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoRiesgoCheque("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoRiesgoCheque();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoRiesgoCheque.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRiesgoCheque"));
		
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonModificarTipoRiesgoCheque.addActionListener(new ButtonActionListener(this,"ModificarTipoRiesgoCheque"));

		
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonModificarToolBarTipoRiesgoCheque.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRiesgoCheque"));
					
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jMenuItemModificarTipoRiesgoCheque.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRiesgoCheque"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonActualizarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"ActualizarTipoRiesgoCheque"));
		
		
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonActualizarToolBarTipoRiesgoCheque.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRiesgoCheque"));
						
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jMenuItemActualizarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRiesgoCheque"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonEliminarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"EliminarTipoRiesgoCheque"));
		
		
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonEliminarToolBarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRiesgoCheque"));
								
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jMenuItemEliminarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRiesgoCheque"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonCancelarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"CancelarTipoRiesgoCheque"));
		
		
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonCancelarToolBarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRiesgoCheque"));
					
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jMenuItemCancelarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRiesgoCheque"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jMenuItemDetalleCerrarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRiesgoCheque"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonGuardarCambiosToolBarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRiesgoCheque"));
		
		
		
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonGuardarCambiosToolBarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRiesgoCheque"));
		
		
		
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jComboBoxTiposAccionesFormularioTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRiesgoCheque"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonidTipoRiesgoChequeBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRiesgoChequeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonnombreTipoRiesgoChequeBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRiesgoChequeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtondescripcionTipoRiesgoChequeBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoRiesgoChequeBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jTabbedPaneRelacionesTipoRiesgoCheque.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRiesgoCheque"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoRiesgoCheque"));
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCheque.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRiesgoCheque"));
		}
		
		this.jTableDatosTipoRiesgoCheque.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoRiesgoCheque"));
		
		this.jTableDatosTipoRiesgoCheque.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoRiesgoCheque"));
		
		this.jButtonNuevoTipoRiesgoCheque.addActionListener(new ButtonActionListener(this,"NuevoTipoRiesgoCheque"));
		
		this.jButtonDuplicarTipoRiesgoCheque.addActionListener(new ButtonActionListener(this,"DuplicarTipoRiesgoCheque"));
		
		this.jButtonCopiarTipoRiesgoCheque.addActionListener(new ButtonActionListener(this,"CopiarTipoRiesgoCheque"));
		
		this.jButtonVerFormTipoRiesgoCheque.addActionListener(new ButtonActionListener(this,"VerFormTipoRiesgoCheque"));
		
		
		this.jButtonNuevoToolBarTipoRiesgoCheque.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoRiesgoCheque"));
			
		this.jButtonDuplicarToolBarTipoRiesgoCheque.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoRiesgoCheque"));
			
		this.jMenuItemNuevoTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoRiesgoCheque"));
			
		this.jMenuItemDuplicarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoRiesgoCheque"));		
		
		
		this.jButtonNuevoRelacionesTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoRiesgoCheque"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoRiesgoCheque.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoRiesgoCheque"));
			
		this.jMenuItemNuevoRelacionesTipoRiesgoCheque.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoRiesgoCheque"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonModificarTipoRiesgoCheque.addActionListener(new ButtonActionListener(this,"ModificarTipoRiesgoCheque"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonModificarToolBarTipoRiesgoCheque.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRiesgoCheque"));
			
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jMenuItemModificarTipoRiesgoCheque.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRiesgoCheque"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonActualizarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"ActualizarTipoRiesgoCheque"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonActualizarToolBarTipoRiesgoCheque.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRiesgoCheque"));
				
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jMenuItemActualizarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRiesgoCheque"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonEliminarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"EliminarTipoRiesgoCheque"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonEliminarToolBarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRiesgoCheque"));
						
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jMenuItemEliminarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRiesgoCheque"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonCancelarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"CancelarTipoRiesgoCheque"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonCancelarToolBarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRiesgoCheque"));
			
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jMenuItemCancelarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRiesgoCheque"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoRiesgoCheque"));		
		
		
		this.jButtonCerrarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"CerrarTipoRiesgoCheque"));
		
		
		this.jButtonCerrarToolBarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoRiesgoCheque"));
			
		this.jMenuItemCerrarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoRiesgoCheque"));
			
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jMenuItemDetalleCerrarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRiesgoCheque"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonGuardarCambiosTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoRiesgoCheque"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonGuardarCambiosToolBarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRiesgoCheque"));
		}
		
		this.jButtonCopiarToolBarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoRiesgoCheque"));
			
		this.jButtonVerFormToolBarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoRiesgoCheque"));
		
		this.jMenuItemGuardarCambiosTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoRiesgoCheque"));
			
		this.jMenuItemCopiarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoRiesgoCheque"));		
		
		this.jMenuItemVerFormTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoRiesgoCheque"));		
		
		
		this.jButtonGuardarCambiosTablaTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRiesgoCheque"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoRiesgoCheque"));
			
		this.jMenuItemGuardarCambiosTablaTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRiesgoCheque"));		
		
		
		
		this.jButtonRecargarInformacionTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoRiesgoCheque"));
					
		this.jButtonRecargarInformacionToolBarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoRiesgoCheque"));
		
		this.jMenuItemRecargarInformacionTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoRiesgoCheque"));		
		
		
		
		this.jButtonAnterioresTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"AnterioresTipoRiesgoCheque"));
		
		
		this.jButtonAnterioresToolBarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoRiesgoCheque"));
		
		this.jMenuItemAnterioresTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoRiesgoCheque"));		
		
		
		this.jButtonSiguientesTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"SiguientesTipoRiesgoCheque"));
		
		
		this.jButtonSiguientesToolBarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoRiesgoCheque"));
			
		this.jMenuItemSiguientesTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoRiesgoCheque"));
			
		this.jMenuItemAbrirOrderByTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoRiesgoCheque"));
			
		this.jMenuItemMostrarOcultarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoRiesgoCheque"));
			
		this.jMenuItemDetalleAbrirOrderByTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoRiesgoCheque"));
			
		this.jMenuItemDetalleMostarOcultarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoRiesgoCheque"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoRiesgoCheque"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoRiesgoCheque"));
			
		this.jMenuItemNuevoGuardarCambiosTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoRiesgoCheque"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoRiesgoCheque.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoRiesgoCheque"));

		this.jCheckBoxSeleccionadosTipoRiesgoCheque.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoRiesgoCheque"));
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jComboBoxTiposAccionesFormularioTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRiesgoCheque"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoRiesgoCheque"));
			
		this.jComboBoxTiposAccionesTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoRiesgoCheque"));
					
		this.jComboBoxTiposSeleccionarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoRiesgoCheque"));
			
		this.jTextFieldValorCampoGeneralTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoRiesgoCheque"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonidTipoRiesgoChequeBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRiesgoChequeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonnombreTipoRiesgoChequeBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRiesgoChequeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtondescripcionTipoRiesgoChequeBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoRiesgoChequeBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoRiesgoCheque!=null) {
				this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRiesgoCheque"));
				this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRiesgoCheque"));
				this.jInternalFrameReporteDinamicoTipoRiesgoCheque.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRiesgoCheque"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRiesgoCheque"));				
			//this.jButtonGenerarReporteDinamicoTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRiesgoCheque"));
			//this.jButtonGenerarExcelReporteDinamicoTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRiesgoCheque"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoRiesgoCheque!=null) {
				this.jInternalFrameImportacionTipoRiesgoCheque.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRiesgoCheque"));
				this.jInternalFrameImportacionTipoRiesgoCheque.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRiesgoCheque"));
				this.jInternalFrameImportacionTipoRiesgoCheque.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRiesgoCheque"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoRiesgoCheque"));
			
			this.jButtonAbrirOrderByToolBarTipoRiesgoCheque.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoRiesgoCheque"));			
			
			if(this.jInternalFrameOrderByTipoRiesgoCheque!=null) {
				this.jInternalFrameOrderByTipoRiesgoCheque.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRiesgoCheque"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCheque.jTabbedPaneRelacionesTipoRiesgoCheque.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRiesgoCheque"));
		
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
            		closingInternalFrameTipoRiesgoCheque();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoRiesgoCheque.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoRiesgoCheque = (JInternalFrameBase)event.getSource();
	            	
	            TipoRiesgoChequeBeanSwingJInternalFrame jInternalFrameParent=(TipoRiesgoChequeBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRiesgoCheque.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoRiesgoChequeActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoRiesgoCheque.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoRiesgoChequeListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoRiesgoCheque.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoRiesgoCheque.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRiesgoChequeActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRiesgoChequeActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRiesgoChequeActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoRiesgoCheque";
		inputMap = this.jButtonNuevoTipoRiesgoCheque.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoRiesgoCheque.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoRiesgoChequeActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRiesgoChequeActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRiesgoChequeActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRiesgoChequeActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoRiesgoCheque";
		inputMap = this.jButtonNuevoRelacionesTipoRiesgoCheque.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoRiesgoCheque.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoRiesgoChequeActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoRiesgoCheque";
		inputMap = this.jButtonModificarTipoRiesgoCheque.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoRiesgoCheque.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoRiesgoChequeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoRiesgoCheque";
		inputMap = this.jButtonActualizarTipoRiesgoCheque.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoRiesgoCheque.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoRiesgoChequeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoRiesgoCheque";
		inputMap = this.jButtonEliminarTipoRiesgoCheque.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoRiesgoCheque.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoRiesgoChequeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoRiesgoCheque";
		inputMap = this.jButtonCancelarTipoRiesgoCheque.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoRiesgoCheque.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoRiesgoChequeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoRiesgoCheque";
		inputMap = this.jButtonCerrarTipoRiesgoCheque.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoRiesgoCheque.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoRiesgoChequeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonGuardarCambiosTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoRiesgoCheque";
		inputMap = this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonGuardarCambiosTipoRiesgoCheque.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonGuardarCambiosTipoRiesgoCheque.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoRiesgoChequeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoRiesgoCheque.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoRiesgoChequeItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoRiesgoCheque.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoRiesgoChequeActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoRiesgoCheque.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoRiesgoChequeActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoRiesgoCheque.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoRiesgoChequeActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonidTipoRiesgoChequeBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRiesgoChequeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtonnombreTipoRiesgoChequeBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRiesgoChequeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jButtondescripcionTipoRiesgoChequeBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoRiesgoChequeBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoRiesgoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoRiesgoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoRiesgoChequeActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoRiesgoCheque.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoRiesgoCheque(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoRiesgoCheque tiporiesgochequeAux:this.tiporiesgochequeLogic.getTipoRiesgoCheques()) {
					tiporiesgochequeAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRiesgoCheque tiporiesgochequeAux:tiporiesgocheques) {
					tiporiesgochequeAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoRiesgoChequeItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRiesgoCheque(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRiesgoCheque tiporiesgochequeAux:this.tiporiesgochequeLogic.getTipoRiesgoCheques()) {
						tiporiesgochequeAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRiesgoCheque tiporiesgochequeAux:tiporiesgocheques) {
						tiporiesgochequeAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoRiesgoCheque tiporiesgochequeAux:this.tiporiesgochequeLogic.getTipoRiesgoCheques()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRiesgoCheque tiporiesgochequeAux:tiporiesgocheques) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRiesgoCheque(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRiesgoCheque.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRiesgoCheque.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRiesgoCheque,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoRiesgoChequeItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRiesgoCheque(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoRiesgoCheque.getSelectedRows();
			
			TipoRiesgoCheque tiporiesgochequeLocal=new TipoRiesgoCheque();
			
			//this.seleccionarTodosTipoRiesgoCheque(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporiesgochequeLocal =(TipoRiesgoCheque) this.tiporiesgochequeLogic.getTipoRiesgoCheques().toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tiporiesgochequeLocal =(TipoRiesgoCheque) this.tiporiesgocheques.toArray()[this.jTableDatosTipoRiesgoCheque.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tiporiesgochequeLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRiesgoCheque tiporiesgochequeAux:this.tiporiesgochequeLogic.getTipoRiesgoCheques()) {
						tiporiesgochequeAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRiesgoCheque tiporiesgochequeAux:tiporiesgocheques) {
						tiporiesgochequeAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoRiesgoCheque(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRiesgoCheque.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRiesgoCheque.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRiesgoCheque,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoRiesgoChequeItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoRiesgoChequeParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoRiesgoChequeActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoRiesgoCheque(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoRiesgoCheque.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRiesgoCheque tiporiesgochequeAux:this.tiporiesgochequeLogic.getTipoRiesgoCheques()) {
				
						if(sTipoSeleccionar.equals(TipoRiesgoChequeConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporiesgochequeAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoRiesgoChequeConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tiporiesgochequeAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRiesgoCheque tiporiesgochequeAux:tiporiesgocheques) {
					
						if(sTipoSeleccionar.equals(TipoRiesgoChequeConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporiesgochequeAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoRiesgoChequeConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tiporiesgochequeAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRiesgoCheque(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoRiesgoChequeActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoRiesgoCheque(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoRiesgoCheque=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoRiesgoCheque.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoRiesgoCheque.jComboBoxTiposAccionesFormularioTipoRiesgoCheque.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoRiesgoCheque) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoRiesgoCheque(conSplash);
				
					this.generarReporteTipoRiesgoChequesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRiesgoCheque.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRiesgoCheque.jComboBoxTiposAccionesFormularioTipoRiesgoCheque.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoRiesgoChequesSeleccionados();
				//this.jComboBoxTiposAccionesTipoRiesgoCheque.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRiesgoChequesSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoRiesgoCheque.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRiesgoChequesSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoRiesgoCheque.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRiesgoCheque();
				
				this.exportarTipoRiesgoChequesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRiesgoCheque.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRiesgoCheque.jComboBoxTiposAccionesFormularioTipoRiesgoCheque.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoRiesgoCheques();
				//this.importarTipoRiesgoCheques();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRiesgoCheque.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRiesgoCheque.jComboBoxTiposAccionesFormularioTipoRiesgoCheque.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRiesgoCheque();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoRiesgoChequesSeleccionados();
				//this.jComboBoxTiposAccionesTipoRiesgoCheque.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Riesgo Cheque", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoRiesgoCheque();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoRiesgoCheque)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoRiesgoCheque(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Riesgo Cheque",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRiesgoCheque.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRiesgoCheque.jComboBoxTiposAccionesFormularioTipoRiesgoCheque.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoRiesgoCheque();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoRiesgoCheque(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoRiesgoChequeActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoRiesgoCheque();
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCheque==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoRiesgoCheque> tiporiesgochequesSeleccionados=new ArrayList<TipoRiesgoCheque>();		
			TipoRiesgoCheque tiporiesgocheque=new TipoRiesgoCheque();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoRiesgoCheque(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoRiesgoCheque.getSelectedItem();
			
			
			
			
			tiporiesgochequesSeleccionados=this.getTipoRiesgoChequesSeleccionados(true);
			//this.sTipoAccion;
			
			if(tiporiesgochequesSeleccionados.size()==1) {
				for(TipoRiesgoCheque tiporiesgochequeAux:tiporiesgochequesSeleccionados) {
					tiporiesgocheque=tiporiesgochequeAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Forma Pago")) {
					jButtonFormaPagoPuntoVentaActionPerformed(null,rowIndex,true,false,tiporiesgocheque);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoRiesgoCheque();
			
      		//this.finishProcessTipoRiesgoCheque(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoRiesgoChequeReturnGeneral() throws Exception {
		if(this.tiporiesgochequeReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tiporiesgochequeReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tiporiesgochequeReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tiporiesgochequeReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tiporiesgochequeReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tiporiesgochequeReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoRiesgoCheque(false);
		}
		
		if(this.tiporiesgochequeReturnGeneral.getConRetornoLista() || this.tiporiesgochequeReturnGeneral.getConRetornoObjeto()) {
			if(this.tiporiesgochequeReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporiesgochequeLogic.setTipoRiesgoCheques(this.tiporiesgochequeReturnGeneral.getTipoRiesgoCheques());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tiporiesgochequeReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporiesgochequeLogic.setTipoRiesgoCheque(this.tiporiesgochequeReturnGeneral.getTipoRiesgoCheque());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoRiesgoCheque(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoRiesgoCheque() throws Exception {
		
		
	}
	
	public ArrayList<TipoRiesgoCheque> getTipoRiesgoChequesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoRiesgoCheque> tiporiesgochequesSeleccionados=new ArrayList<TipoRiesgoCheque>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoRiesgoCheque) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoRiesgoCheque tiporiesgochequeAux:tiporiesgochequeLogic.getTipoRiesgoCheques()) {
					if(tiporiesgochequeAux.getIsSelected()) {
						tiporiesgochequesSeleccionados.add(tiporiesgochequeAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRiesgoCheque tiporiesgochequeAux:this.tiporiesgocheques) {
					if(tiporiesgochequeAux.getIsSelected()) {
						tiporiesgochequesSeleccionados.add(tiporiesgochequeAux);				
					}
				}
			}
			
			if(tiporiesgochequesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tiporiesgochequesSeleccionados.addAll(this.tiporiesgochequeLogic.getTipoRiesgoCheques());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tiporiesgochequesSeleccionados.addAll(this.tiporiesgocheques);				
					}
				}
			}
		} else {
			tiporiesgochequesSeleccionados.add(this.tiporiesgocheque);
		}
		
		return tiporiesgochequesSeleccionados;
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
	
	public void generarReporteTipoRiesgoChequesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoRiesgoChequesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoRiesgoChequesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRiesgoChequesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRiesgoChequesSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoRiesgoChequesSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Riesgo Cheque",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoRiesgoChequesSeleccionados() throws Exception {
		ArrayList<TipoRiesgoCheque> tiporiesgochequesSeleccionados=new ArrayList<TipoRiesgoCheque>();		
		
		tiporiesgochequesSeleccionados=this.getTipoRiesgoChequesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoRiesgoCheques("Todos",tiporiesgochequesSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoRiesgoChequesSeleccionados() throws Exception {
		ArrayList<TipoRiesgoCheque> tiporiesgochequesSeleccionados=new ArrayList<TipoRiesgoCheque>();		
		
		tiporiesgochequesSeleccionados=this.getTipoRiesgoChequesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoRiesgoCheques("Todos",tiporiesgochequesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoRiesgoChequesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoRiesgoCheque> tiporiesgochequesSeleccionados=new ArrayList<TipoRiesgoCheque>();
		
		tiporiesgochequesSeleccionados=this.getTipoRiesgoChequesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoRiesgoCheques("Todos",tiporiesgochequesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoRiesgoChequesSeleccionados() throws Exception {
		ArrayList<TipoRiesgoCheque> tiporiesgochequesSeleccionados=new ArrayList<TipoRiesgoCheque>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoRiesgoCheque();
		
		
		tiporiesgochequesSeleccionados=this.getTipoRiesgoChequesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoRiesgoCheque();
		
		
		//this.generarReporteTipoRiesgoCheques("Todos",tiporiesgochequesSeleccionados ,tiporiesgochequeImplementable,tiporiesgochequeImplementableHome);
	}
	
	public void mostrarImportacionTipoRiesgoCheques() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoRiesgoCheque();
		
		this.abrirFrameImportacionTipoRiesgoCheque();		
		
			
		//this.generarReporteTipoRiesgoCheques("Todos",tiporiesgochequesSeleccionados ,tiporiesgochequeImplementable,tiporiesgochequeImplementableHome);
	}
	
	public void importarTipoRiesgoCheques() throws Exception {		
	
	}
	
	public void exportarTipoRiesgoChequesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoRiesgoChequesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoRiesgoChequesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoRiesgoChequesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Riesgo Cheque",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoRiesgoChequesSeleccionados() throws Exception {
		ArrayList<TipoRiesgoCheque> tiporiesgochequesSeleccionados=new ArrayList<TipoRiesgoCheque>();		
		
		tiporiesgochequesSeleccionados=this.getTipoRiesgoChequesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporiesgocheque."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoRiesgoCheque(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoRiesgoCheque tiporiesgochequeAux:tiporiesgochequesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoRiesgoCheque(tiporiesgochequeAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tiporiesgochequeAux.setsDetalleGeneralEntityReporte(tiporiesgochequeAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Riesgo Cheque",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoRiesgoCheque(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoRiesgoChequeConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRiesgoChequeConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRiesgoChequeConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRiesgoChequeConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoRiesgoCheque(TipoRiesgoCheque tiporiesgocheque,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tiporiesgocheque.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporiesgocheque.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporiesgocheque.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporiesgocheque.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoRiesgoChequesSeleccionados() throws Exception {
		ArrayList<TipoRiesgoCheque> tiporiesgochequesSeleccionados=new ArrayList<TipoRiesgoCheque>();		
		
		tiporiesgochequesSeleccionados=this.getTipoRiesgoChequesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporiesgocheque.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoRiesgoCheques");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoRiesgoCheque(row);				
				iRow++;
			}				
			
			for(TipoRiesgoCheque tiporiesgochequeAux:tiporiesgochequesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoRiesgoCheque(tiporiesgochequeAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Riesgo Cheque",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoRiesgoChequesSeleccionados() throws Exception {
		ArrayList<TipoRiesgoCheque> tiporiesgochequesSeleccionados=new ArrayList<TipoRiesgoCheque>();		
		
		tiporiesgochequesSeleccionados=this.getTipoRiesgoChequesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporiesgocheque.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tiporiesgocheques");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tiporiesgocheque");
			//elementRoot.appendChild(element);
		
			for(TipoRiesgoCheque tiporiesgochequeAux:tiporiesgochequesSeleccionados) {
				element = document.createElement("tiporiesgocheque");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoRiesgoCheque(tiporiesgochequeAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Riesgo Cheque",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoRiesgoCheque(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRiesgoChequeConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRiesgoChequeConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoRiesgoChequeConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRiesgoChequeConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoRiesgoCheque(TipoRiesgoCheque tiporiesgocheque,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tiporiesgocheque.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporiesgocheque.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporiesgocheque.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlTipoRiesgoCheque(TipoRiesgoCheque tiporiesgocheque,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoRiesgoChequeConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tiporiesgocheque.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoRiesgoChequeConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tiporiesgocheque.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoRiesgoChequeConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tiporiesgocheque.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(TipoRiesgoChequeConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(tiporiesgocheque.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoTipoRiesgoChequesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoRiesgoCheque> tiporiesgochequesSeleccionados=new ArrayList<TipoRiesgoCheque>();
		
		tiporiesgochequesSeleccionados=this.getTipoRiesgoChequesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoRiesgoCheque(tiporiesgochequesSeleccionados);
		
		this.generarReporteTipoRiesgoCheques("Todos",tiporiesgochequesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoRiesgoCheque(ArrayList<TipoRiesgoCheque> tiporiesgochequesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoRiesgoCheque tiporiesgochequeAux:tiporiesgochequesSeleccionados) {
				tiporiesgochequeAux.setsDetalleGeneralEntityReporte(tiporiesgochequeAux.toString());
			
				if(sTipoSeleccionar.equals(TipoRiesgoChequeConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tiporiesgochequeAux.setsDescripcionGeneralEntityReporte1(tiporiesgochequeAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoRiesgoChequeConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					tiporiesgochequeAux.setsDescripcionGeneralEntityReporte1(tiporiesgochequeAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoRiesgoCheque(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoRiesgoCheque=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque=true;
				this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCheque=true;
			}
			
			this.isVisibilidadCeldaModificarTipoRiesgoCheque=false;
			this.isVisibilidadCeldaActualizarTipoRiesgoCheque=false;
			this.isVisibilidadCeldaEliminarTipoRiesgoCheque=false;
			this.isVisibilidadCeldaCancelarTipoRiesgoCheque=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRiesgoCheque=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRiesgoCheque=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoRiesgoCheque=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCheque=false;
			this.isVisibilidadCeldaModificarTipoRiesgoCheque=false;
			this.isVisibilidadCeldaActualizarTipoRiesgoCheque=true;
			this.isVisibilidadCeldaEliminarTipoRiesgoCheque=false;
			this.isVisibilidadCeldaCancelarTipoRiesgoCheque=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRiesgoCheque=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRiesgoCheque=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoRiesgoCheque=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCheque=false;
			this.isVisibilidadCeldaModificarTipoRiesgoCheque=false;
			this.isVisibilidadCeldaActualizarTipoRiesgoCheque=true;
			this.isVisibilidadCeldaEliminarTipoRiesgoCheque=true;
			this.isVisibilidadCeldaCancelarTipoRiesgoCheque=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRiesgoCheque=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRiesgoCheque=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoRiesgoCheque=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCheque=false;
			this.isVisibilidadCeldaModificarTipoRiesgoCheque=false;
			this.isVisibilidadCeldaActualizarTipoRiesgoCheque=true;
			this.isVisibilidadCeldaEliminarTipoRiesgoCheque=false;
			this.isVisibilidadCeldaCancelarTipoRiesgoCheque=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRiesgoCheque=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRiesgoCheque=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoRiesgoCheque=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCheque=true;
			this.isVisibilidadCeldaModificarTipoRiesgoCheque=false;
			this.isVisibilidadCeldaActualizarTipoRiesgoCheque=false;
			this.isVisibilidadCeldaEliminarTipoRiesgoCheque=false;
			this.isVisibilidadCeldaCancelarTipoRiesgoCheque=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRiesgoCheque=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRiesgoCheque=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoRiesgoCheque=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCheque=false;
			this.isVisibilidadCeldaActualizarTipoRiesgoCheque=false;
			this.isVisibilidadCeldaEliminarTipoRiesgoCheque=false;
			this.isVisibilidadCeldaCancelarTipoRiesgoCheque=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRiesgoCheque=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRiesgoCheque=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoRiesgoCheque=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCheque=false;
			this.isVisibilidadCeldaModificarTipoRiesgoCheque=true;
			this.isVisibilidadCeldaActualizarTipoRiesgoCheque=false;
			this.isVisibilidadCeldaEliminarTipoRiesgoCheque=false;
			this.isVisibilidadCeldaCancelarTipoRiesgoCheque=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRiesgoCheque=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRiesgoCheque=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoRiesgoChequeJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoRiesgoCheque=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCheque=true;
		} else {
			this.actualizarEstadoPanelsTipoRiesgoCheque(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoRiesgoCheque=false;
			//this.isVisibilidadCeldaVerFormTipoRiesgoCheque=false;
			this.isVisibilidadCeldaDuplicarTipoRiesgoCheque=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tiporiesgochequeSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoRiesgoCheque=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCheque=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
			if(!tiporiesgochequeSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque=false;												
			}
			
			this.jButtonCerrarTipoRiesgoCheque.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCheque=false;
		}
		
		if(!this.permiteMantenimiento(this.tiporiesgocheque)) {
			this.isVisibilidadCeldaActualizarTipoRiesgoCheque=false;
			this.isVisibilidadCeldaEliminarTipoRiesgoCheque=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRiesgoCheque() {
		this.isVisibilidadCeldaNuevoTipoRiesgoCheque=false;
		this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCheque=false;
	}
	
	public void actualizarEstadoPanelsTipoRiesgoCheque(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoRiesgoCheque!=null) {
				this.jScrollPanelDatosEdicionTipoRiesgoCheque.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRiesgoCheque!=null) {
				this.jScrollPanelDatosTipoRiesgoCheque.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRiesgoCheque!=null) {
				this.jPanelPaginacionTipoRiesgoCheque.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRiesgoCheque!=null) {
				this.jPanelParametrosReportesTipoRiesgoCheque.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoRiesgoCheque!=null) {
				this.jScrollPanelDatosEdicionTipoRiesgoCheque.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoRiesgoCheque!=null) {
				this.jScrollPanelDatosTipoRiesgoCheque.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRiesgoCheque!=null) {
				this.jPanelPaginacionTipoRiesgoCheque.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRiesgoCheque!=null) {
				this.jPanelParametrosReportesTipoRiesgoCheque.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoRiesgoCheque!=null) {
				this.jScrollPanelDatosEdicionTipoRiesgoCheque.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoRiesgoCheque!=null) {
				this.jScrollPanelDatosTipoRiesgoCheque.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRiesgoCheque!=null) {
				this.jPanelPaginacionTipoRiesgoCheque.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRiesgoCheque!=null) {
				this.jPanelParametrosReportesTipoRiesgoCheque.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoRiesgoCheque!=null) {
				this.jScrollPanelDatosEdicionTipoRiesgoCheque.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRiesgoCheque!=null) {
				this.jScrollPanelDatosTipoRiesgoCheque.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRiesgoCheque!=null) {
				this.jPanelPaginacionTipoRiesgoCheque.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRiesgoCheque!=null) {
				this.jPanelParametrosReportesTipoRiesgoCheque.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoRiesgoCheque!=null) {
				this.jScrollPanelDatosEdicionTipoRiesgoCheque.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRiesgoCheque!=null) {
				this.jScrollPanelDatosTipoRiesgoCheque.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRiesgoCheque!=null) {
				this.jPanelPaginacionTipoRiesgoCheque.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRiesgoCheque!=null) {
				this.jPanelParametrosReportesTipoRiesgoCheque.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoRiesgoCheque!=null) {
				this.jScrollPanelDatosEdicionTipoRiesgoCheque.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoRiesgoCheque!=null) {
				this.jScrollPanelDatosTipoRiesgoCheque.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRiesgoCheque!=null) {
				this.jPanelPaginacionTipoRiesgoCheque.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRiesgoCheque!=null) {
				this.jPanelParametrosReportesTipoRiesgoCheque.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoRiesgoCheque!=null) {
				this.jScrollPanelDatosEdicionTipoRiesgoCheque.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoRiesgoCheque!=null) {
				this.jScrollPanelDatosTipoRiesgoCheque.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRiesgoCheque!=null) {
				this.jPanelPaginacionTipoRiesgoCheque.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRiesgoCheque!=null) {
				this.jPanelParametrosReportesTipoRiesgoCheque.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoRiesgoChequeParaFormaPagoPuntoVentaes() throws Exception {
		Boolean isPaginaPopupFormaPagoPuntoVenta=false;

		try {

			if(this.tiporiesgochequeSessionBean==null) {
				this.tiporiesgochequeSessionBean=new TipoRiesgoChequeSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaSessionBean=new FormaPagoPuntoVentaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaSessionBean.setsPathNavegacionActual(tiporiesgochequeSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFormaPagoPuntoVenta=this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta(true);
			this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta(TipoRiesgoChequeConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionTipoRiesgoCheque(true);
			this.jInternalFrameDetalleFormTipoRiesgoCheque.formapagopuntoventaSessionBean.setlidTipoRiesgoChequeActual(this.idTipoRiesgoChequeActual);

			tiporiesgochequeSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoRiesgoCheque(true);
			tiporiesgochequeSessionBean.setlIdTipoRiesgoChequeActualForeignKey(this.idTipoRiesgoChequeActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoRiesgoChequeSessionBean tiporiesgochequeSessionBean=new TipoRiesgoChequeSessionBean();
		
		if(this.tiporiesgochequeSessionBean==null) {
			this.tiporiesgochequeSessionBean=new TipoRiesgoChequeSessionBean();
		}
		
		this.tiporiesgochequeSessionBean.setsUltimaBusquedaTipoRiesgoCheque(this.getsAccionBusqueda());
		this.tiporiesgochequeSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tiporiesgochequeSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoRiesgoChequeSessionBean tiporiesgochequeSessionBean=new TipoRiesgoChequeSessionBean();
		
		if(this.tiporiesgochequeSessionBean==null) {
			this.tiporiesgochequeSessionBean=new TipoRiesgoChequeSessionBean();
		}
		
		if(this.tiporiesgochequeSessionBean.getsUltimaBusquedaTipoRiesgoCheque()!=null&&!this.tiporiesgochequeSessionBean.getsUltimaBusquedaTipoRiesgoCheque().equals("")) {
			this.setsAccionBusqueda(tiporiesgochequeSessionBean.getsUltimaBusquedaTipoRiesgoCheque());
			this.setiNumeroPaginacion(tiporiesgochequeSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tiporiesgochequeSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tiporiesgochequeSessionBean.setsUltimaBusquedaTipoRiesgoCheque("");
		this.tiporiesgochequeSessionBean.setiNumeroPaginacion(TipoRiesgoChequeConstantesFunciones.INUMEROPAGINACION);
		this.tiporiesgochequeSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoRiesgoCheque(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoRiesgoCheque() {
		this.updateBorderResaltarBusquedasFormularioTipoRiesgoCheque();
		this.updateVisibilidadBusquedasFormularioTipoRiesgoCheque();
		this.updateHabilitarBusquedasFormularioTipoRiesgoCheque();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoRiesgoCheque() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoRiesgoCheque() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoRiesgoCheque() {
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
	
	public void updateControlesFormularioTipoRiesgoCheque() throws Exception {

		if(this.jInternalFrameDetalleFormTipoRiesgoCheque==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoRiesgoCheque();
		this.updateVisibilidadResaltarControlesFormularioTipoRiesgoCheque();
		this.updateHabilitarResaltarControlesFormularioTipoRiesgoCheque();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoRiesgoCheque() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tiporiesgochequeConstantesFunciones.resaltaridTipoRiesgoCheque!=null && this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) {this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextFieldidTipoRiesgoCheque.setBorder(this.tiporiesgochequeConstantesFunciones.resaltaridTipoRiesgoCheque);}
		if(this.tiporiesgochequeConstantesFunciones.resaltarnombreTipoRiesgoCheque!=null && this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) {this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextAreanombreTipoRiesgoCheque.setBorder(this.tiporiesgochequeConstantesFunciones.resaltarnombreTipoRiesgoCheque);}
		if(this.tiporiesgochequeConstantesFunciones.resaltardescripcionTipoRiesgoCheque!=null && this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) {this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextAreadescripcionTipoRiesgoCheque.setBorder(this.tiporiesgochequeConstantesFunciones.resaltardescripcionTipoRiesgoCheque);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoRiesgoCheque() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) {
	
		//this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextFieldidTipoRiesgoCheque.setVisible(this.tiporiesgochequeConstantesFunciones.mostraridTipoRiesgoCheque);
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jPanelidTipoRiesgoCheque.setVisible(this.tiporiesgochequeConstantesFunciones.mostraridTipoRiesgoCheque);
		//this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextAreanombreTipoRiesgoCheque.setVisible(this.tiporiesgochequeConstantesFunciones.mostrarnombreTipoRiesgoCheque);
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jPanelnombreTipoRiesgoCheque.setVisible(this.tiporiesgochequeConstantesFunciones.mostrarnombreTipoRiesgoCheque);
		//this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextAreadescripcionTipoRiesgoCheque.setVisible(this.tiporiesgochequeConstantesFunciones.mostrardescripcionTipoRiesgoCheque);
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jPaneldescripcionTipoRiesgoCheque.setVisible(this.tiporiesgochequeConstantesFunciones.mostrardescripcionTipoRiesgoCheque);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoRiesgoCheque() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCheque!=null) {
	
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextFieldidTipoRiesgoCheque.setEnabled(this.tiporiesgochequeConstantesFunciones.activaridTipoRiesgoCheque);
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextAreanombreTipoRiesgoCheque.setEnabled(this.tiporiesgochequeConstantesFunciones.activarnombreTipoRiesgoCheque);
		this.jInternalFrameDetalleFormTipoRiesgoCheque.jTextAreadescripcionTipoRiesgoCheque.setEnabled(this.tiporiesgochequeConstantesFunciones.activardescripcionTipoRiesgoCheque);
		}
	}
	
		
}