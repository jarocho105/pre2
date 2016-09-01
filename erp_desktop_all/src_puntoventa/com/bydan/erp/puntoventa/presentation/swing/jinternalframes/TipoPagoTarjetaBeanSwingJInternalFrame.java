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

import com.bydan.erp.puntoventa.util.TipoPagoTarjetaConstantesFunciones;
import com.bydan.erp.puntoventa.util.TipoPagoTarjetaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.TipoPagoTarjetaParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.TipoPagoTarjetaBean;
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
public class TipoPagoTarjetaBeanSwingJInternalFrame extends TipoPagoTarjetaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoPagoTarjetaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoPagoTarjeta> tipopagotarjetaValidator = new ClassValidator<TipoPagoTarjeta>(TipoPagoTarjeta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoPagoTarjeta tipopagotarjeta;	
	public TipoPagoTarjeta tipopagotarjetaAux;
	public TipoPagoTarjeta tipopagotarjetaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoPagoTarjeta tipopagotarjetaTotales;
	public Long idTipoPagoTarjetaActual;
	public Long iIdNuevoTipoPagoTarjeta=0L;
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
	
	public Boolean isPermisoTodoTipoPagoTarjeta;
	public Boolean isPermisoNuevoTipoPagoTarjeta;
	public Boolean isPermisoActualizarTipoPagoTarjeta;
	public Boolean isPermisoActualizarOriginalTipoPagoTarjeta;
	public Boolean isPermisoEliminarTipoPagoTarjeta;
	public Boolean isPermisoGuardarCambiosTipoPagoTarjeta;
	public Boolean isPermisoConsultaTipoPagoTarjeta;
	public Boolean isPermisoBusquedaTipoPagoTarjeta;
	public Boolean isPermisoReporteTipoPagoTarjeta;
	public Boolean isPermisoPaginacionMedioTipoPagoTarjeta;
	public Boolean isPermisoPaginacionAltoTipoPagoTarjeta;
	public Boolean isPermisoPaginacionTodoTipoPagoTarjeta;
	public Boolean isPermisoCopiarTipoPagoTarjeta;
	public Boolean isPermisoVerFormTipoPagoTarjeta;
	public Boolean isPermisoDuplicarTipoPagoTarjeta;
	public Boolean isPermisoOrdenTipoPagoTarjeta;
	
	
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
	
	public TipoPagoTarjetaParameterReturnGeneral tipopagotarjetaReturnGeneral;
	public TipoPagoTarjetaParameterReturnGeneral tipopagotarjetaParameterGeneral;
	
	

	public FormaPagoPuntoVentaLogic formapagopuntoventaLogic=null;

	public FormaPagoPuntoVentaLogic getFormaPagoPuntoVentaLogic() {
		return formapagopuntoventaLogic;
	}

	public void setFormaPagoPuntoVentaLogic(FormaPagoPuntoVentaLogic formapagopuntoventaLogic) {
		this.formapagopuntoventaLogic = formapagopuntoventaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoPagoTarjeta=false;
	public Boolean esParaAccionDesdeFormularioTipoPagoTarjeta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoPagoTarjetaLogic tipopagotarjetaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoPagoTarjeta tipopagotarjetaBean;
	public TipoPagoTarjetaConstantesFunciones tipopagotarjetaConstantesFunciones;
	//public TipoPagoTarjetaParameterReturnGeneral tipopagotarjetaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoPagoTarjeta> tipopagotarjetas;	
	//public List<TipoPagoTarjeta> tipopagotarjetasEliminados;
	//public List<TipoPagoTarjeta> tipopagotarjetasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoPagoTarjeta=false;
	public Boolean isVisibilidadCeldaDuplicarTipoPagoTarjeta=true;
	public Boolean isVisibilidadCeldaCopiarTipoPagoTarjeta=true;
	public Boolean isVisibilidadCeldaVerFormTipoPagoTarjeta=true;
	public Boolean isVisibilidadCeldaOrdenTipoPagoTarjeta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta=false;
	public Boolean isVisibilidadCeldaModificarTipoPagoTarjeta=false;
	public Boolean isVisibilidadCeldaActualizarTipoPagoTarjeta=false;
	public Boolean isVisibilidadCeldaEliminarTipoPagoTarjeta=false;
	public Boolean isVisibilidadCeldaCancelarTipoPagoTarjeta=false;
	public Boolean isVisibilidadCeldaGuardarTipoPagoTarjeta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoPagoTarjeta=false;	
	
	
	
	public Long getiIdNuevoTipoPagoTarjeta() {
		return this.iIdNuevoTipoPagoTarjeta;
	}

	public void setiIdNuevoTipoPagoTarjeta(Long iIdNuevoTipoPagoTarjeta) {
		this.iIdNuevoTipoPagoTarjeta = iIdNuevoTipoPagoTarjeta;
	}
	
	public Long getidTipoPagoTarjetaActual() {
		return this.idTipoPagoTarjetaActual;
	}

	public void setidTipoPagoTarjetaActual(Long idTipoPagoTarjetaActual) {
		this.idTipoPagoTarjetaActual = idTipoPagoTarjetaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoPagoTarjeta gettipopagotarjeta() {
		return this.tipopagotarjeta;
	}

	public void settipopagotarjeta(TipoPagoTarjeta tipopagotarjeta) {
		this.tipopagotarjeta = tipopagotarjeta;
	}
	
	public TipoPagoTarjeta gettipopagotarjetaAux() {
		return this.tipopagotarjetaAux;
	}

	public void settipopagotarjetaAux(TipoPagoTarjeta tipopagotarjetaAux) {
		this.tipopagotarjetaAux = tipopagotarjetaAux;
	}				
	
	public TipoPagoTarjeta gettipopagotarjetaAnterior() {
		return this.tipopagotarjetaAnterior;
	}

	public void settipopagotarjetaAnterior(TipoPagoTarjeta tipopagotarjetaAnterior) {
		this.tipopagotarjetaAnterior = tipopagotarjetaAnterior;
	}	
	
	public TipoPagoTarjeta gettipopagotarjetaTotales() {
		return this.tipopagotarjetaTotales;
	}

	public void settipopagotarjetaTotales(TipoPagoTarjeta tipopagotarjetaTotales) {
		this.tipopagotarjetaTotales = tipopagotarjetaTotales;
	}	
	
	public TipoPagoTarjeta gettipopagotarjetaBean() {
		return this.tipopagotarjetaBean;
	}

	public void settipopagotarjetaBean(TipoPagoTarjeta tipopagotarjetaBean) {
		this.tipopagotarjetaBean = tipopagotarjetaBean;
	}	
	
	public TipoPagoTarjetaParameterReturnGeneral gettipopagotarjetaReturnGeneral() {
		return this.tipopagotarjetaReturnGeneral;
	}

	public void settipopagotarjetaReturnGeneral(TipoPagoTarjetaParameterReturnGeneral tipopagotarjetaReturnGeneral) {
		this.tipopagotarjetaReturnGeneral = tipopagotarjetaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoPagoTarjetaLogic getTipoPagoTarjetaLogic()	{		
		return tipopagotarjetaLogic;
	}

	public void setTipoPagoTarjetaLogic(TipoPagoTarjetaLogic tipopagotarjetaLogic) {
		this.tipopagotarjetaLogic = tipopagotarjetaLogic;
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
	
	public Boolean getIsEsNuevoTipoPagoTarjeta() {
		return isEsNuevoTipoPagoTarjeta;
	}

	public void setIsEsNuevoTipoPagoTarjeta(Boolean isEsNuevoTipoPagoTarjeta) {
		this.isEsNuevoTipoPagoTarjeta = isEsNuevoTipoPagoTarjeta;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoPagoTarjeta() {
		return esParaAccionDesdeFormularioTipoPagoTarjeta;
	}
	
	public void setEsParaAccionDesdeFormularioTipoPagoTarjeta(Boolean esParaAccionDesdeFormularioTipoPagoTarjeta) {
		this.esParaAccionDesdeFormularioTipoPagoTarjeta = esParaAccionDesdeFormularioTipoPagoTarjeta;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoPagoTarjeta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoPagoTarjetaConstantesFunciones.refrescarForeignKeysDescripcionesTipoPagoTarjeta(this.tipopagotarjetaLogic.getTipoPagoTarjetas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoPagoTarjetaConstantesFunciones.refrescarForeignKeysDescripcionesTipoPagoTarjeta(this.tipopagotarjetas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipopagotarjetaLogic.setTipoPagoTarjetas(this.tipopagotarjetas);
			tipopagotarjetaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoPagoTarjetaParameterReturnGeneral getTipoPagoTarjetaParameterGeneral() {
		return this.tipopagotarjetaParameterGeneral;
	}
	
	public void setTipoPagoTarjetaParameterGeneral(TipoPagoTarjetaParameterReturnGeneral tipopagotarjetaParameterGeneral) {
		this.tipopagotarjetaParameterGeneral = tipopagotarjetaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoPagoTarjeta() {
		return isPermisoTodoTipoPagoTarjeta;
	}

	public void setIsPermisoTodoTipoPagoTarjeta(Boolean isPermisoTodoTipoPagoTarjeta) {
		this.isPermisoTodoTipoPagoTarjeta = isPermisoTodoTipoPagoTarjeta;
	}

	public Boolean getIsPermisoNuevoTipoPagoTarjeta() {
		return isPermisoNuevoTipoPagoTarjeta;
	}

	public void setIsPermisoNuevoTipoPagoTarjeta(Boolean isPermisoNuevoTipoPagoTarjeta) {
		this.isPermisoNuevoTipoPagoTarjeta = isPermisoNuevoTipoPagoTarjeta;
	}

	public Boolean getIsPermisoActualizarTipoPagoTarjeta() {
		return isPermisoActualizarTipoPagoTarjeta;
	}

	public void setIsPermisoActualizarTipoPagoTarjeta(Boolean isPermisoActualizarTipoPagoTarjeta) {
		this.isPermisoActualizarTipoPagoTarjeta = isPermisoActualizarTipoPagoTarjeta;
	}

	public Boolean getIsPermisoEliminarTipoPagoTarjeta() {
		return isPermisoEliminarTipoPagoTarjeta;
	}

	public void setIsPermisoEliminarTipoPagoTarjeta(Boolean isPermisoEliminarTipoPagoTarjeta) {
		this.isPermisoEliminarTipoPagoTarjeta = isPermisoEliminarTipoPagoTarjeta;
	}

	public Boolean getIsPermisoGuardarCambiosTipoPagoTarjeta() {
		return isPermisoGuardarCambiosTipoPagoTarjeta;
	}

	public void setIsPermisoGuardarCambiosTipoPagoTarjeta(Boolean isPermisoGuardarCambiosTipoPagoTarjeta) {
		this.isPermisoGuardarCambiosTipoPagoTarjeta = isPermisoGuardarCambiosTipoPagoTarjeta;
	}
	
	public Boolean getIsPermisoConsultaTipoPagoTarjeta() {
		return isPermisoConsultaTipoPagoTarjeta;
	}

	public void setIsPermisoConsultaTipoPagoTarjeta(Boolean isPermisoConsultaTipoPagoTarjeta) {
		this.isPermisoConsultaTipoPagoTarjeta = isPermisoConsultaTipoPagoTarjeta;
	}

	public Boolean getIsPermisoBusquedaTipoPagoTarjeta() {
		return isPermisoBusquedaTipoPagoTarjeta;
	}

	public void setIsPermisoBusquedaTipoPagoTarjeta(Boolean isPermisoBusquedaTipoPagoTarjeta) {
		this.isPermisoBusquedaTipoPagoTarjeta = isPermisoBusquedaTipoPagoTarjeta;
	}

	public Boolean getIsPermisoReporteTipoPagoTarjeta() {
		return isPermisoReporteTipoPagoTarjeta;
	}

	public void setIsPermisoReporteTipoPagoTarjeta(Boolean isPermisoReporteTipoPagoTarjeta) {
		this.isPermisoReporteTipoPagoTarjeta = isPermisoReporteTipoPagoTarjeta;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoPagoTarjeta() {
		return isPermisoPaginacionMedioTipoPagoTarjeta;
	}

	public void setIsPermisoPaginacionMedioTipoPagoTarjeta(Boolean isPermisoPaginacionMedioTipoPagoTarjeta) {
		this.isPermisoPaginacionMedioTipoPagoTarjeta = isPermisoPaginacionMedioTipoPagoTarjeta;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoPagoTarjeta() {
		return isPermisoPaginacionTodoTipoPagoTarjeta;
	}

	public void setIsPermisoPaginacionTodoTipoPagoTarjeta(Boolean isPermisoPaginacionTodoTipoPagoTarjeta) {
		this.isPermisoPaginacionTodoTipoPagoTarjeta = isPermisoPaginacionTodoTipoPagoTarjeta;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoPagoTarjeta() {
		return isPermisoPaginacionAltoTipoPagoTarjeta;
	}

	public void setIsPermisoPaginacionAltoTipoPagoTarjeta(Boolean isPermisoPaginacionAltoTipoPagoTarjeta) {
		this.isPermisoPaginacionAltoTipoPagoTarjeta = isPermisoPaginacionAltoTipoPagoTarjeta;
	}
	
	public Boolean getIsPermisoCopiarTipoPagoTarjeta() {
		return isPermisoCopiarTipoPagoTarjeta;
	}

	public void setIsPermisoCopiarTipoPagoTarjeta(Boolean isPermisoCopiarTipoPagoTarjeta) {
		this.isPermisoCopiarTipoPagoTarjeta = isPermisoCopiarTipoPagoTarjeta;
	}
	
	public Boolean getIsPermisoVerFormTipoPagoTarjeta() {
		return isPermisoVerFormTipoPagoTarjeta;
	}

	public void setIsPermisoVerFormTipoPagoTarjeta(Boolean isPermisoVerFormTipoPagoTarjeta) {
		this.isPermisoVerFormTipoPagoTarjeta = isPermisoVerFormTipoPagoTarjeta;
	}
	
	public Boolean getIsPermisoDuplicarTipoPagoTarjeta() {
		return isPermisoDuplicarTipoPagoTarjeta;
	}

	public void setIsPermisoDuplicarTipoPagoTarjeta(Boolean isPermisoDuplicarTipoPagoTarjeta) {
		this.isPermisoDuplicarTipoPagoTarjeta = isPermisoDuplicarTipoPagoTarjeta;
	}
	
	public Boolean getIsPermisoOrdenTipoPagoTarjeta() {
		return isPermisoOrdenTipoPagoTarjeta;
	}

	public void setIsPermisoOrdenTipoPagoTarjeta(Boolean isPermisoOrdenTipoPagoTarjeta) {
		this.isPermisoOrdenTipoPagoTarjeta = isPermisoOrdenTipoPagoTarjeta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoPagoTarjeta() {
		return isVisibilidadCeldaNuevoTipoPagoTarjeta;
	}

	public void setIsVisibilidadCeldaNuevoTipoPagoTarjeta(Boolean isVisibilidadCeldaNuevoTipoPagoTarjeta) {
		this.isVisibilidadCeldaNuevoTipoPagoTarjeta = isVisibilidadCeldaNuevoTipoPagoTarjeta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoPagoTarjeta() {
		return isVisibilidadCeldaDuplicarTipoPagoTarjeta;
	}

	public void setIsVisibilidadCeldaDuplicarTipoPagoTarjeta(Boolean isVisibilidadCeldaDuplicarTipoPagoTarjeta) {
		this.isVisibilidadCeldaDuplicarTipoPagoTarjeta = isVisibilidadCeldaDuplicarTipoPagoTarjeta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoPagoTarjeta() {
		return isVisibilidadCeldaCopiarTipoPagoTarjeta;
	}

	public void setIsVisibilidadCeldaCopiarTipoPagoTarjeta(Boolean isVisibilidadCeldaCopiarTipoPagoTarjeta) {
		this.isVisibilidadCeldaCopiarTipoPagoTarjeta = isVisibilidadCeldaCopiarTipoPagoTarjeta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoPagoTarjeta() {
		return isVisibilidadCeldaVerFormTipoPagoTarjeta;
	}

	public void setIsVisibilidadCeldaVerFormTipoPagoTarjeta(Boolean isVisibilidadCeldaVerFormTipoPagoTarjeta) {
		this.isVisibilidadCeldaVerFormTipoPagoTarjeta = isVisibilidadCeldaVerFormTipoPagoTarjeta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoPagoTarjeta() {
		return isVisibilidadCeldaOrdenTipoPagoTarjeta;
	}

	public void setIsVisibilidadCeldaOrdenTipoPagoTarjeta(Boolean isVisibilidadCeldaOrdenTipoPagoTarjeta) {
		this.isVisibilidadCeldaOrdenTipoPagoTarjeta = isVisibilidadCeldaOrdenTipoPagoTarjeta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta() {
		return isVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta(Boolean isVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta) {
		this.isVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta = isVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoPagoTarjeta() {
		return isVisibilidadCeldaModificarTipoPagoTarjeta;
	}

	public void setIsVisibilidadCeldaModificarTipoPagoTarjeta(Boolean isVisibilidadCeldaModificarTipoPagoTarjeta) {
		this.isVisibilidadCeldaModificarTipoPagoTarjeta = isVisibilidadCeldaModificarTipoPagoTarjeta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoPagoTarjeta() {
		return isVisibilidadCeldaActualizarTipoPagoTarjeta;
	}

	public void setIsVisibilidadCeldaActualizarTipoPagoTarjeta(Boolean isVisibilidadCeldaActualizarTipoPagoTarjeta) {
		this.isVisibilidadCeldaActualizarTipoPagoTarjeta = isVisibilidadCeldaActualizarTipoPagoTarjeta;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoPagoTarjeta() {
		return isVisibilidadCeldaEliminarTipoPagoTarjeta;
	}

	public void setIsVisibilidadCeldaEliminarTipoPagoTarjeta(Boolean isVisibilidadCeldaEliminarTipoPagoTarjeta) {
		this.isVisibilidadCeldaEliminarTipoPagoTarjeta = isVisibilidadCeldaEliminarTipoPagoTarjeta;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoPagoTarjeta() {
		return isVisibilidadCeldaCancelarTipoPagoTarjeta;
	}

	public void setIsVisibilidadCeldaCancelarTipoPagoTarjeta(Boolean isVisibilidadCeldaCancelarTipoPagoTarjeta) {
		this.isVisibilidadCeldaCancelarTipoPagoTarjeta = isVisibilidadCeldaCancelarTipoPagoTarjeta;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoPagoTarjeta() {
		return isVisibilidadCeldaGuardarTipoPagoTarjeta;
	}

	public void setIsVisibilidadCeldaGuardarTipoPagoTarjeta(Boolean isVisibilidadCeldaGuardarTipoPagoTarjeta) {
		this.isVisibilidadCeldaGuardarTipoPagoTarjeta = isVisibilidadCeldaGuardarTipoPagoTarjeta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoPagoTarjeta() {
		return isVisibilidadCeldaGuardarCambiosTipoPagoTarjeta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoPagoTarjeta(Boolean isVisibilidadCeldaGuardarCambiosTipoPagoTarjeta) {
		this.isVisibilidadCeldaGuardarCambiosTipoPagoTarjeta = isVisibilidadCeldaGuardarCambiosTipoPagoTarjeta;
	}
		
	public TipoPagoTarjetaSessionBean gettipopagotarjetaSessionBean() {
		return this.tipopagotarjetaSessionBean;
	}
	
	public void settipopagotarjetaSessionBean(TipoPagoTarjetaSessionBean tipopagotarjetaSessionBean) {
		this.tipopagotarjetaSessionBean=tipopagotarjetaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoPagoTarjeta(TipoPagoTarjeta tipopagotarjeta)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoPagoTarjeta tipopagotarjeta,TipoPagoTarjeta tipopagotarjetaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoPagoTarjeta(tipopagotarjeta);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipopagotarjetaAux.setId(tipopagotarjeta.getId());
		tipopagotarjetaAux.setVersionRow(tipopagotarjeta.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoPagoTarjeta();
		
			int intSelectedRow = this.jTableDatosTipoPagoTarjeta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoPagoTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoPagoTarjeta(this.tipopagotarjeta,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPagoTarjeta(this.tipopagotarjeta);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipopagotarjetaValidator.getInvalidValues(this.tipopagotarjeta);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipopagotarjetaLogic.setDatosCliente(datosCliente);
			tipopagotarjetaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipopagotarjetaAux=new  TipoPagoTarjeta();
				
				tipopagotarjetaAux.setIsNew(true);
				tipopagotarjetaAux.setIsChanged(true);
				
				tipopagotarjetaAux.setTipoPagoTarjetaOriginal(this.tipopagotarjeta);
				
				tipopagotarjetaAux.setId(this.tipopagotarjeta.getId());	
				tipopagotarjetaAux.setVersionRow(this.tipopagotarjeta.getVersionRow());	
				tipopagotarjetaAux.setnombre(this.tipopagotarjeta.getnombre());	
				tipopagotarjetaAux.setdescripcion(this.tipopagotarjeta.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipopagotarjetaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipopagotarjetaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipopagotarjetaAux,tipopagotarjetaLogic.getTipoPagoTarjetas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipopagotarjetaAux,tipopagotarjetas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipopagotarjetaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipopagotarjetaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopagotarjetaLogic.saveTipoPagoTarjetas();//WithConnection
						//tipopagotarjetaLogic.getSetVersionRowTipoPagoTarjetas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipopagotarjeta,tipopagotarjetaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipopagotarjetaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipopagotarjetaAux=new  TipoPagoTarjeta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipopagotarjetaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipopagotarjetaSessionBean.getEsGuardarRelacionado() && this.tipopagotarjeta.getId()>=0)) {
						
					tipopagotarjetaAux.setIsNew(false);
				}
				
				tipopagotarjetaAux.setIsDeleted(false);
			
				tipopagotarjetaAux.setId(this.tipopagotarjeta.getId());	
				tipopagotarjetaAux.setVersionRow(this.tipopagotarjeta.getVersionRow());	
				tipopagotarjetaAux.setnombre(this.tipopagotarjeta.getnombre());	
				tipopagotarjetaAux.setdescripcion(this.tipopagotarjeta.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipopagotarjetaAux,tipopagotarjetaLogic.getTipoPagoTarjetas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipopagotarjetaAux,tipopagotarjetas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipopagotarjetaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipopagotarjetaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopagotarjetaLogic.saveTipoPagoTarjetas();//WithConnection
						//tipopagotarjetaLogic.getSetVersionRowTipoPagoTarjetas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipopagotarjeta,tipopagotarjetaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipopagotarjetaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipopagotarjetaAux=new  TipoPagoTarjeta();
				
				tipopagotarjetaAux.setIsNew(false);
				tipopagotarjetaAux.setIsChanged(false);
				
				tipopagotarjetaAux.setIsDeleted(true);
				
				tipopagotarjetaAux.setId(this.tipopagotarjeta.getId());	
				tipopagotarjetaAux.setVersionRow(this.tipopagotarjeta.getVersionRow());	
				tipopagotarjetaAux.setnombre(this.tipopagotarjeta.getnombre());	
				tipopagotarjetaAux.setdescripcion(this.tipopagotarjeta.getdescripcion());	
				
				if(this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipopagotarjetaAux.getId()>=0) {	
						this.tipopagotarjetasEliminados.add(tipopagotarjetaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipopagotarjetaAux,tipopagotarjetaLogic.getTipoPagoTarjetas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipopagotarjetaAux,tipopagotarjetas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipopagotarjetaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipopagotarjetaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopagotarjetaLogic.saveTipoPagoTarjetas();//WithConnection
						//tipopagotarjetaLogic.getSetVersionRowTipoPagoTarjetas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipopagotarjetaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipopagotarjetaAux.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipopagotarjetaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipopagotarjetaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipopagotarjetaAux,tipopagotarjetaLogic.getTipoPagoTarjetas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipopagotarjetaAux,tipopagotarjetas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjetaLogic.getTipoPagoTarjetas().addAll(this.tipopagotarjetasEliminados);
					
					tipopagotarjetaLogic.saveTipoPagoTarjetas();//WithConnection
					//tipopagotarjetaLogic.getSetVersionRowTipoPagoTarjetas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipopagotarjetasEliminados= new ArrayList<TipoPagoTarjeta>();		
			}
			
			if(this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Pago GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Pago",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipopagotarjeta=tipopagotarjetaAux;
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
      		//this.finishProcessTipoPagoTarjeta();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoPagoTarjeta tipopagotarjetaLocal) throws Exception {
		
		if(this.tipopagotarjetaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipopagotarjetaLocal.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());
			
			} else {
			
				tipopagotarjetaLocal.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoPagoTarjeta tipopagotarjetaLocal) throws Exception {	
		if(this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoPagoTarjetaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoPagoTarjeta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipopagotarjetaValidator.getInvalidValues(this.tipopagotarjeta);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoPagoTarjeta tipopagotarjeta,List<TipoPagoTarjeta> tipopagotarjetas) throws Exception {
		try	{		
			TipoPagoTarjetaConstantesFunciones.actualizarLista(tipopagotarjeta,tipopagotarjetas,this.tipopagotarjetaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoPagoTarjeta tipopagotarjeta,List<TipoPagoTarjeta> tipopagotarjetas) throws Exception {
		try	{			
			TipoPagoTarjetaConstantesFunciones.actualizarSelectedLista(tipopagotarjeta,tipopagotarjetas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoPagoTarjeta> tipopagotarjetasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipopagotarjetasLocal=this.tipopagotarjetaLogic.getTipoPagoTarjetas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipopagotarjetasLocal=this.tipopagotarjetas;
			}
			//ARCHITECTURE
		
			for(TipoPagoTarjeta tipopagotarjetaLocal:tipopagotarjetasLocal) {
				if(this.permiteMantenimiento(tipopagotarjetaLocal) && tipopagotarjetaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoPagoTarjetaConstantesFunciones.getTipoPagoTarjetaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoPagoTarjetaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPagoTarjeta.jLabelnombreTipoPagoTarjeta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoPagoTarjetaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPagoTarjeta.jLabeldescripcionTipoPagoTarjeta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPagoTarjeta.jLabelnombreTipoPagoTarjeta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPagoTarjeta.jLabeldescripcionTipoPagoTarjeta,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("FormaPagoPuntoVenta")) {
			if(this.tipopagotarjeta==null) {
				this.tipopagotarjeta= new TipoPagoTarjeta();
			}

			if(this.tipopagotarjetaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoPagoTarjeta
				this.setVariablesFormularioToObjetoActualTipoPagoTarjeta(this.tipopagotarjeta,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPagoTarjeta(this.tipopagotarjeta);

				this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame.getformapagopuntoventa().setTipoPagoTarjeta(this.tipopagotarjeta);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoPagoTarjeta--;	
		
		
		this.tipopagotarjetaAux=new TipoPagoTarjeta();
		
		this.tipopagotarjetaAux.setId(this.iIdNuevoTipoPagoTarjeta);
		this.tipopagotarjetaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipopagotarjetaLogic.getTipoPagoTarjetas().add(this.tipopagotarjetaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipopagotarjetas.add(this.tipopagotarjetaAux);
		}
		//ARCHITECTURE
		
		this.tipopagotarjeta=this.tipopagotarjetaAux;
		
		if(TipoPagoTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoPagoTarjeta(this.tipopagotarjeta);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoPagoTarjeta(this.tipopagotarjeta);
		}
				
		//this.setDefaultControlesTipoPagoTarjeta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoPagoTarjeta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoPagoTarjeta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPagoTarjeta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoPagoTarjeta(this.tipopagotarjetaBean,this.tipopagotarjeta,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoPagoTarjeta(this.tipopagotarjeta);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipopagotarjetaSessionBean.getConGuardarRelaciones()) {
			classes=TipoPagoTarjetaConstantesFunciones.getClassesRelationshipsOfTipoPagoTarjeta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipopagotarjetaReturnGeneral=tipopagotarjetaLogic.procesarEventosTipoPagoTarjetasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipopagotarjetaLogic.getTipoPagoTarjetas(),this.tipopagotarjeta,this.tipopagotarjetaParameterGeneral,this.isEsNuevoTipoPagoTarjeta,classes);//this.tipopagotarjetaLogic.getTipoPagoTarjeta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoPagoTarjeta(this.tipopagotarjetaReturnGeneral,this.tipopagotarjetaBean,false);
		
		if(this.tipopagotarjetaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoPagoTarjeta(this.tipopagotarjetaReturnGeneral.getTipoPagoTarjeta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoPagoTarjeta(this.tipopagotarjetaReturnGeneral.getTipoPagoTarjeta());
		}
		
		if(this.tipopagotarjetaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoPagoTarjeta(this.tipopagotarjetaReturnGeneral.getTipoPagoTarjeta(),classes);//this.tipopagotarjetaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoPagoTarjeta(this.tipopagotarjeta,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoPagoTarjeta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoPagoTarjeta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoPagoTarjeta(false);
						
			if(tipopagotarjetaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.getEsGuardarRelacionado() && FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormaPagoPuntoVentaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoPagoTarjetaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPagoTarjeta();
			}
			
			this.actualizarVisualTableDatosTipoPagoTarjeta();
			
			this.jTableDatosTipoPagoTarjeta.setRowSelectionInterval(this.getIndiceNuevoTipoPagoTarjeta(), this.getIndiceNuevoTipoPagoTarjeta());
			
			this.seleccionarFilaTablaTipoPagoTarjetaActual();
						
			this.actualizarEstadoCeldasBotonesTipoPagoTarjeta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoPagoTarjeta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextAreanombreTipoPagoTarjeta.setEnabled(isHabilitar && this.tipopagotarjetaConstantesFunciones.activarnombreTipoPagoTarjeta);
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextAreadescripcionTipoPagoTarjeta.setEnabled(isHabilitar && this.tipopagotarjetaConstantesFunciones.activardescripcionTipoPagoTarjeta);	
		
	};
	
	public void setDefaultControlesTipoPagoTarjeta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoPagoTarjeta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipopagotarjetaSessionBean.setConGuardarRelaciones(true);			
			this.tipopagotarjetaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jTabbedPaneRelacionesTipoPagoTarjeta.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipopagotarjetaSessionBean.setConGuardarRelaciones(false);			
			this.tipopagotarjetaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jTabbedPaneRelacionesTipoPagoTarjeta.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoPagoTarjeta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPagoTarjeta tipopagotarjetaAux:this.tipopagotarjetaLogic.getTipoPagoTarjetas()) {
				if(tipopagotarjetaAux.getId().equals(this.iIdNuevoTipoPagoTarjeta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPagoTarjeta tipopagotarjetaAux:this.tipopagotarjetas) {
				if(tipopagotarjetaAux.getId().equals(this.iIdNuevoTipoPagoTarjeta)) {
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
	
	public int getIndiceActualTipoPagoTarjeta(TipoPagoTarjeta tipopagotarjeta,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPagoTarjeta tipopagotarjetaAux:this.tipopagotarjetaLogic.getTipoPagoTarjetas()) {
				if(tipopagotarjetaAux.getId().equals(tipopagotarjeta.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPagoTarjeta tipopagotarjetaAux:this.tipopagotarjetas) {
				if(tipopagotarjetaAux.getId().equals(tipopagotarjeta.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoPagoTarjeta(TipoPagoTarjeta tipopagotarjetaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPagoTarjeta tipopagotarjetaAux:this.tipopagotarjetaLogic.getTipoPagoTarjetas()) {
				if(tipopagotarjetaAux.getTipoPagoTarjetaOriginal().getId().equals(tipopagotarjetaOriginal.getId())) {
					existe=true;
					tipopagotarjetaOriginal.setId(tipopagotarjetaAux.getId());
					tipopagotarjetaOriginal.setVersionRow(tipopagotarjetaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPagoTarjeta tipopagotarjetaAux:this.tipopagotarjetas) {
				if(tipopagotarjetaAux.getTipoPagoTarjetaOriginal().getId().equals(tipopagotarjetaOriginal.getId())) {
					existe=true;
					tipopagotarjetaOriginal.setId(tipopagotarjetaAux.getId());
					tipopagotarjetaOriginal.setVersionRow(tipopagotarjetaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoPagoTarjeta(Boolean esParaCancelar) throws Exception {
		tipopagotarjetasAux=new ArrayList<TipoPagoTarjeta>();
		tipopagotarjetaAux=new TipoPagoTarjeta();
		
		if(!this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoPagoTarjeta tipopagotarjetaAux:this.tipopagotarjetaLogic.getTipoPagoTarjetas()) {
					if(tipopagotarjetaAux.getId()<0) {
						tipopagotarjetasAux.add(tipopagotarjetaAux);
					}		
				}
				this.iIdNuevoTipoPagoTarjeta=0L;
				this.tipopagotarjetaLogic.getTipoPagoTarjetas().removeAll(tipopagotarjetasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPagoTarjeta tipopagotarjetaAux:this.tipopagotarjetas) {
					if(tipopagotarjetaAux.getId()<0) {
						tipopagotarjetasAux.add(tipopagotarjetaAux);
					}		
				}
				this.iIdNuevoTipoPagoTarjeta=0L;
				this.tipopagotarjetas.removeAll(tipopagotarjetasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoPagoTarjeta 
					&& this.tipopagotarjetaLogic.getTipoPagoTarjetas().size()>0
					) {
					tipopagotarjetaAux=this.tipopagotarjetaLogic.getTipoPagoTarjetas().get(this.tipopagotarjetaLogic.getTipoPagoTarjetas().size() - 1);
				
					if(tipopagotarjetaAux.getId()<0) {
						this.tipopagotarjetaLogic.getTipoPagoTarjetas().remove(tipopagotarjetaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoPagoTarjeta && this.tipopagotarjetas.size()>0) {
					tipopagotarjetaAux=this.tipopagotarjetas.get(this.tipopagotarjetas.size() - 1);
				
					if(tipopagotarjetaAux.getId()<0) {
						this.tipopagotarjetas.remove(tipopagotarjetaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoPagoTarjeta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipopagotarjeta.getId()<0) {
				this.tipopagotarjetaLogic.getTipoPagoTarjetas().remove(this.tipopagotarjeta);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipopagotarjeta.getId()<0) {
				this.tipopagotarjetas.remove(this.tipopagotarjeta);
			}
		}			
	}
	
	public void setEstadosInicialesTipoPagoTarjeta(List<TipoPagoTarjeta> tipopagotarjetasAux) throws Exception {
		TipoPagoTarjetaConstantesFunciones.setEstadosInicialesTipoPagoTarjeta(tipopagotarjetasAux);
	}
	
	public void setEstadosInicialesTipoPagoTarjeta(TipoPagoTarjeta tipopagotarjetaAux) throws Exception {
		TipoPagoTarjetaConstantesFunciones.setEstadosInicialesTipoPagoTarjeta(tipopagotarjetaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoPagoTarjetaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoPagoTarjeta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoPagoTarjetaActual()) {
				if(!this.isEsNuevoTipoPagoTarjeta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoPagoTarjeta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoPagoTarjeta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoPagoTarjetaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Pago ?", "MANTENIMIENTO DE Tipo Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoPagoTarjeta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoPagoTarjeta tipopagotarjeta) throws Exception {
		TipoPagoTarjetaConstantesFunciones.seleccionarAsignar(this.tipopagotarjeta,tipopagotarjeta);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoPagoTarjeta=this.isPermisoActualizarOriginalTipoPagoTarjeta;
			
			
			this.seleccionarAsignar(tipopagotarjeta);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoPagoTarjetaConstantesFunciones.quitarEspaciosTipoPagoTarjeta(this.tipopagotarjeta,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoPagoTarjeta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipopagotarjetaSessionBean.setsFuncionBusquedaRapida(this.tipopagotarjetaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoPagoTarjeta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoPagoTarjeta(esParaCancelar);				
				this.cancelarNuevoTipoPagoTarjeta(esParaCancelar);								
			}
			
			this.tipopagotarjeta=new TipoPagoTarjeta();
			
			this.inicializarTipoPagoTarjeta();
			
			this.actualizarEstadoCeldasBotonesTipoPagoTarjeta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoPagoTarjeta() throws Exception {
		try {
			TipoPagoTarjetaConstantesFunciones.inicializarTipoPagoTarjeta(this.tipopagotarjeta);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipopagotarjetaLogic.getTipoPagoTarjetas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoPagoTarjetas(String sAccionBusqueda,List<TipoPagoTarjeta> tipopagotarjetasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoPagoTarjeta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoPagoTarjetaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoPagoTarjetaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoPagoTarjeta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Pagos");		
		parameters.put("busquedapor", TipoPagoTarjetaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
					
					TipoPagoTarjetaLogic tipopagotarjetaLogicAuxiliar=new TipoPagoTarjetaLogic();
					tipopagotarjetaLogicAuxiliar.setDatosCliente(tipopagotarjetaLogic.getDatosCliente());				
					tipopagotarjetaLogicAuxiliar.setTipoPagoTarjetas(tipopagotarjetasParaReportes);
					
					tipopagotarjetaLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoPagoTarjetaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipopagotarjetasParaReportes=tipopagotarjetaLogicAuxiliar.getTipoPagoTarjetas();
					
					//tipopagotarjetaLogic.getNewConnexionToDeep();
					
					//for (TipoPagoTarjeta tipopagotarjeta:tipopagotarjetasParaReportes) {
					//	tipopagotarjetaLogic.deepLoad(tipopagotarjeta, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipopagotarjetaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipopagotarjetaLogic.closeNewConnexionToDeep();
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoPagoTarjeta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoPagoTarjetaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoPagoTarjetaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoPagoTarjeta=new JRBeanArrayDataSource(TipoPagoTarjetaJInternalFrame.TraerTipoPagoTarjetaBeans(tipopagotarjetasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoPagoTarjeta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoPagoTarjetaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoPagoTarjetaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoPagoTarjetaBean.TraerTipoPagoTarjetaBeans(tipopagotarjetasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoPagoTarjetas(sAccionBusqueda,sTipoArchivoReporte,tipopagotarjetasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoPagoTarjetas(sAccionBusqueda,sTipoArchivoReporte,tipopagotarjetasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoPagoTarjetaActionPerformed(null);
					//this.generarExcelReporteTipoPagoTarjetas(sAccionBusqueda,sTipoArchivoReporte,tipopagotarjetasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoPagoTarjetas(sAccionBusqueda,sTipoArchivoReporte,tipopagotarjetasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoPagoTarjetas(sAccionBusqueda,sTipoArchivoReporte,tipopagotarjetasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoPagoTarjetas(sAccionBusqueda,sTipoArchivoReporte,tipopagotarjetasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoPagoTarjetas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPagoTarjeta> tipopagotarjetasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopagotarjeta";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPagoTarjetas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoPagoTarjeta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoPagoTarjeta tipopagotarjeta : tipopagotarjetasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoPagoTarjetaConstantesFunciones.generarExcelReporteDataTipoPagoTarjeta("NORMAL",row,workbook,tipopagotarjeta,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoPagoTarjeta(String sTipo,Row row,Workbook workbook) {
		
		TipoPagoTarjetaConstantesFunciones.generarExcelReporteHeaderTipoPagoTarjeta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoPagoTarjetas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPagoTarjeta> tipopagotarjetasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopagotarjeta_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPagoTarjetas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoPagoTarjeta tipopagotarjeta : tipopagotarjetasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoPagoTarjetaConstantesFunciones.getTipoPagoTarjetaDescripcion(tipopagotarjeta));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPagoTarjetaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPagoTarjetaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipopagotarjeta.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPagoTarjetaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPagoTarjetaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipopagotarjeta.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoPagoTarjetas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPagoTarjeta> tipopagotarjetasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoPagoTarjeta> tipopagotarjetasRespaldo=null;
		
		classes=TipoPagoTarjetaConstantesFunciones.getClassesRelationshipsOfTipoPagoTarjeta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipopagotarjetaLogic.setDatosCliente(this.datosCliente);
		this.tipopagotarjetaLogic.setDatosDeep(this.datosDeep);
		this.tipopagotarjetaLogic.setIsConDeep(true);
		
		tipopagotarjetasRespaldo=this.tipopagotarjetaLogic.getTipoPagoTarjetas();
		
		this.tipopagotarjetaLogic.setTipoPagoTarjetas(tipopagotarjetasParaReportes);	
		this.tipopagotarjetaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipopagotarjetasParaReportes=this.tipopagotarjetaLogic.getTipoPagoTarjetas();
		this.tipopagotarjetaLogic.setTipoPagoTarjetas(tipopagotarjetasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopagotarjeta_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPagoTarjetas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoPagoTarjeta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoPagoTarjeta tipopagotarjeta : tipopagotarjetasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoPagoTarjeta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoPagoTarjetaConstantesFunciones.generarExcelReporteDataTipoPagoTarjeta("NORMAL",row,workbook,tipopagotarjeta,cellStyleDataAux);
		
			
			


				//FormaPagoPuntoVenta
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipopagotarjeta.getFormaPagoPuntoVentas()!=null && tipopagotarjeta.getFormaPagoPuntoVentas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FormaPagoPuntoVentaConstantesFunciones.generarExcelReporteHeaderFormaPagoPuntoVenta("RELACIONADO",row,workbook);
				}

				if(tipopagotarjeta.getFormaPagoPuntoVentas()!=null) {
					i2=0;
					for(FormaPagoPuntoVenta formapagopuntoventa : tipopagotarjeta.getFormaPagoPuntoVentas()) {
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
		cell.setCellValue(TipoPagoTarjetaConstantesFunciones.getTipoPagoTarjetaDescripcion(tipopagotarjeta));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoPagoTarjeta() throws Exception {		
		this.startProcessTipoPagoTarjeta(true);
	}
	
	public void startProcessTipoPagoTarjeta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoPagoTarjeta, this.jScrollPanelDatosTipoPagoTarjeta,this.jPanelPaginacionTipoPagoTarjeta, this.jScrollPanelDatosEdicionTipoPagoTarjeta, this.jPanelAccionesTipoPagoTarjeta,this.jPanelAccionesFormularioTipoPagoTarjeta,this.jmenuBarTipoPagoTarjeta,this.jmenuBarDetalleTipoPagoTarjeta,this.jTtoolBarTipoPagoTarjeta,this.jTtoolBarDetalleTipoPagoTarjeta);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoPagoTarjeta=null; 
		
		final JPanel jPanelParametrosReportesTipoPagoTarjeta=this.jPanelParametrosReportesTipoPagoTarjeta;
		//final JScrollPane jScrollPanelDatosTipoPagoTarjeta=this.jScrollPanelDatosTipoPagoTarjeta;
		final JTable jTableDatosTipoPagoTarjeta=this.jTableDatosTipoPagoTarjeta;		
		final JPanel jPanelPaginacionTipoPagoTarjeta=this.jPanelPaginacionTipoPagoTarjeta;
		//final JScrollPane jScrollPanelDatosEdicionTipoPagoTarjeta=this.jScrollPanelDatosEdicionTipoPagoTarjeta;
		final JPanel jPanelAccionesTipoPagoTarjeta=this.jPanelAccionesTipoPagoTarjeta;
		
		JPanel jPanelCamposAuxiliarTipoPagoTarjeta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoPagoTarjeta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) {
			jPanelCamposAuxiliarTipoPagoTarjeta=this.jInternalFrameDetalleFormTipoPagoTarjeta.jPanelCamposTipoPagoTarjeta;
			jPanelAccionesFormularioAuxiliarTipoPagoTarjeta=this.jInternalFrameDetalleFormTipoPagoTarjeta.jPanelAccionesFormularioTipoPagoTarjeta;
		}
		
		final JPanel jPanelCamposTipoPagoTarjeta=jPanelCamposAuxiliarTipoPagoTarjeta;
		final JPanel jPanelAccionesFormularioTipoPagoTarjeta=jPanelAccionesFormularioAuxiliarTipoPagoTarjeta;
		
		
		final JMenuBar jmenuBarTipoPagoTarjeta=this.jmenuBarTipoPagoTarjeta;
		final JToolBar jTtoolBarTipoPagoTarjeta=this.jTtoolBarTipoPagoTarjeta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoPagoTarjeta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoPagoTarjeta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) {
			jmenuBarDetalleAuxiliarTipoPagoTarjeta=this.jInternalFrameDetalleFormTipoPagoTarjeta.jmenuBarDetalleTipoPagoTarjeta;
			jTtoolBarDetalleAuxiliarTipoPagoTarjeta=this.jInternalFrameDetalleFormTipoPagoTarjeta.jTtoolBarDetalleTipoPagoTarjeta;
		}
		
		final JMenuBar jmenuBarDetalleTipoPagoTarjeta=jmenuBarDetalleAuxiliarTipoPagoTarjeta;
		final JToolBar jTtoolBarDetalleTipoPagoTarjeta=jTtoolBarDetalleAuxiliarTipoPagoTarjeta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoPagoTarjeta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoPagoTarjeta;
			processRunnable.jTableDatos=jTableDatosTipoPagoTarjeta;
			processRunnable.jPanelCampos=jPanelCamposTipoPagoTarjeta;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoPagoTarjeta;
			processRunnable.jPanelAcciones=jPanelAccionesTipoPagoTarjeta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoPagoTarjeta;
			
			
			processRunnable.jmenuBar=jmenuBarTipoPagoTarjeta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoPagoTarjeta;
			processRunnable.jTtoolBar=jTtoolBarTipoPagoTarjeta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoPagoTarjeta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoPagoTarjeta ,jPanelParametrosReportesTipoPagoTarjeta,jTableDatosTipoPagoTarjeta, /*jScrollPanelDatosTipoPagoTarjeta,*/jPanelCamposTipoPagoTarjeta,jPanelPaginacionTipoPagoTarjeta, /*jScrollPanelDatosEdicionTipoPagoTarjeta,*/ jPanelAccionesTipoPagoTarjeta,jPanelAccionesFormularioTipoPagoTarjeta,jmenuBarTipoPagoTarjeta,jmenuBarDetalleTipoPagoTarjeta,jTtoolBarTipoPagoTarjeta,jTtoolBarDetalleTipoPagoTarjeta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoPagoTarjeta, jScrollPanelDatosTipoPagoTarjeta,jPanelPaginacionTipoPagoTarjeta, jScrollPanelDatosEdicionTipoPagoTarjeta, jPanelAccionesTipoPagoTarjeta,jPanelAccionesFormularioTipoPagoTarjeta,jmenuBarTipoPagoTarjeta,jmenuBarDetalleTipoPagoTarjeta,jTtoolBarTipoPagoTarjeta,jTtoolBarDetalleTipoPagoTarjeta);
						
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
	
	public void finishProcessTipoPagoTarjeta() {// throws Exception 
		this.finishProcessTipoPagoTarjeta(true);
	}
	
	public void finishProcessTipoPagoTarjeta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoPagoTarjeta, this.jScrollPanelDatosTipoPagoTarjeta,this.jPanelPaginacionTipoPagoTarjeta, this.jScrollPanelDatosEdicionTipoPagoTarjeta, this.jPanelAccionesTipoPagoTarjeta,this.jPanelAccionesFormularioTipoPagoTarjeta,this.jmenuBarTipoPagoTarjeta,this.jmenuBarDetalleTipoPagoTarjeta,this.jTtoolBarTipoPagoTarjeta,this.jTtoolBarDetalleTipoPagoTarjeta);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoPagoTarjeta=null; 
		
		final JPanel jPanelParametrosReportesTipoPagoTarjeta=this.jPanelParametrosReportesTipoPagoTarjeta;
		//final JScrollPane jScrollPanelDatosTipoPagoTarjeta=this.jScrollPanelDatosTipoPagoTarjeta;
		final JTable jTableDatosTipoPagoTarjeta=this.jTableDatosTipoPagoTarjeta;		
		final JPanel jPanelPaginacionTipoPagoTarjeta=this.jPanelPaginacionTipoPagoTarjeta;
		//final JScrollPane jScrollPanelDatosEdicionTipoPagoTarjeta=this.jScrollPanelDatosEdicionTipoPagoTarjeta;
		final JPanel jPanelAccionesTipoPagoTarjeta=this.jPanelAccionesTipoPagoTarjeta;
		
		JPanel jPanelCamposAuxiliarTipoPagoTarjeta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoPagoTarjeta=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) {
			jPanelCamposAuxiliarTipoPagoTarjeta=this.jInternalFrameDetalleFormTipoPagoTarjeta.jPanelCamposTipoPagoTarjeta;
			jPanelAccionesFormularioAuxiliarTipoPagoTarjeta=this.jInternalFrameDetalleFormTipoPagoTarjeta.jPanelAccionesFormularioTipoPagoTarjeta;
		}
		
		final JPanel jPanelCamposTipoPagoTarjeta=jPanelCamposAuxiliarTipoPagoTarjeta;
		final JPanel jPanelAccionesFormularioTipoPagoTarjeta=jPanelAccionesFormularioAuxiliarTipoPagoTarjeta;
		
		
		final JMenuBar jmenuBarTipoPagoTarjeta=this.jmenuBarTipoPagoTarjeta;		
		final JToolBar jTtoolBarTipoPagoTarjeta=this.jTtoolBarTipoPagoTarjeta;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoPagoTarjeta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoPagoTarjeta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) {
			jmenuBarDetalleAuxiliarTipoPagoTarjeta=this.jInternalFrameDetalleFormTipoPagoTarjeta.jmenuBarDetalleTipoPagoTarjeta;
			jTtoolBarDetalleAuxiliarTipoPagoTarjeta=this.jInternalFrameDetalleFormTipoPagoTarjeta.jTtoolBarDetalleTipoPagoTarjeta;		
		}
		
		final JMenuBar jmenuBarDetalleTipoPagoTarjeta=jmenuBarDetalleAuxiliarTipoPagoTarjeta;
		final JToolBar jTtoolBarDetalleTipoPagoTarjeta=jTtoolBarDetalleAuxiliarTipoPagoTarjeta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoPagoTarjeta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoPagoTarjeta;
			processRunnable.jTableDatos=jTableDatosTipoPagoTarjeta;
			processRunnable.jPanelCampos=jPanelCamposTipoPagoTarjeta;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoPagoTarjeta;
			processRunnable.jPanelAcciones=jPanelAccionesTipoPagoTarjeta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoPagoTarjeta;
			
			
			processRunnable.jmenuBar=jmenuBarTipoPagoTarjeta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoPagoTarjeta;
			processRunnable.jTtoolBar=jTtoolBarTipoPagoTarjeta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoPagoTarjeta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoPagoTarjeta ,jPanelParametrosReportesTipoPagoTarjeta, jTableDatosTipoPagoTarjeta,/*jScrollPanelDatosTipoPagoTarjeta,*/jPanelCamposTipoPagoTarjeta,jPanelPaginacionTipoPagoTarjeta, /*jScrollPanelDatosEdicionTipoPagoTarjeta,*/ jPanelAccionesTipoPagoTarjeta,jPanelAccionesFormularioTipoPagoTarjeta,jmenuBarTipoPagoTarjeta,jmenuBarDetalleTipoPagoTarjeta,jTtoolBarTipoPagoTarjeta,jTtoolBarDetalleTipoPagoTarjeta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoPagoTarjeta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoPagoTarjeta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoPagoTarjeta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoPagoTarjeta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoPagoTarjeta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoPagoTarjeta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoPagoTarjeta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoPagoTarjeta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoPagoTarjeta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipopagotarjetaConstantesFunciones.getsFinalQueryTipoPagoTarjeta();
		String  finalQueryPaginacionTodos=this.tipopagotarjetaConstantesFunciones.getsFinalQueryTipoPagoTarjeta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoPagoTarjetaConstantesFunciones.getArrayColumnasGlobalesNoTipoPagoTarjeta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoPagoTarjetaConstantesFunciones.getArrayColumnasGlobalesTipoPagoTarjeta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoPagoTarjetaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipopagotarjetasEliminados= new ArrayList<TipoPagoTarjeta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoPagoTarjeta();
		
				///*TipoPagoTarjetaSessionBean*/this.tipopagotarjetaSessionBean=new TipoPagoTarjetaSessionBean();
			
			if(this.tipopagotarjetaSessionBean==null) {
				this.tipopagotarjetaSessionBean=new TipoPagoTarjetaSessionBean();
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
					this.iNumeroPaginacion=TipoPagoTarjetaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoPagoTarjetaConstantesFunciones.getClassesForeignKeysOfTipoPagoTarjeta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipopagotarjeta."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipopagotarjetasAux= new ArrayList<TipoPagoTarjeta>();
			
				
			tipopagotarjetaLogic.setDatosCliente(this.datosCliente);
			tipopagotarjetaLogic.setDatosDeep(this.datosDeep);
			tipopagotarjetaLogic.setIsConDeep(true);
			
			
			tipopagotarjetaLogic.getTipoPagoTarjetaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipopagotarjetaLogic.getTodosTipoPagoTarjetas(finalQueryGlobal,pagination);
					
					//tipopagotarjetaLogic.getTodosTipoPagoTarjetasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipopagotarjetaLogic.getTipoPagoTarjetas()==null|| tipopagotarjetaLogic.getTipoPagoTarjetas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipopagotarjetasAux= new ArrayList<TipoPagoTarjeta>();
							tipopagotarjetasAux.addAll(tipopagotarjetaLogic.getTipoPagoTarjetas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipopagotarjetasAux= new ArrayList<TipoPagoTarjeta>();
							tipopagotarjetasAux.addAll(tipopagotarjetas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipopagotarjetaLogic.getTodosTipoPagoTarjetas(finalQueryGlobal+"",this.pagination);												
							
							//tipopagotarjetaLogic.getTodosTipoPagoTarjetasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoPagoTarjetas("Todos",tipopagotarjetaLogic.getTipoPagoTarjetas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipopagotarjetaLogic.setTipoPagoTarjetas(new ArrayList<TipoPagoTarjeta>());					
							tipopagotarjetaLogic.getTipoPagoTarjetas().addAll(tipopagotarjetasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipopagotarjetas=new ArrayList<TipoPagoTarjeta>();
							tipopagotarjetas.addAll(tipopagotarjetasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoPagoTarjeta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoPagoTarjeta=this.idActual;
				
				} else if(this.idTipoPagoTarjetaActual!=null && this.idTipoPagoTarjetaActual!=0L) {
					idTipoPagoTarjeta=idTipoPagoTarjetaActual;
				}
				
					
				this.sDetalleReporte=TipoPagoTarjetaConstantesFunciones.getDetalleIndicePorId(idTipoPagoTarjeta);
				
				this.tipopagotarjetas=new ArrayList<TipoPagoTarjeta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipopagotarjetaLogic.getEntity(idTipoPagoTarjeta);
					
					//tipopagotarjetaLogic.getEntityWithConnection(idTipoPagoTarjeta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipopagotarjetaLogic.setTipoPagoTarjetas(new ArrayList<TipoPagoTarjeta>());
					tipopagotarjetaLogic.getTipoPagoTarjetas().add(tipopagotarjetaLogic.getTipoPagoTarjeta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipopagotarjetas=new ArrayList<TipoPagoTarjeta>();
					this.tipopagotarjetas.add(tipopagotarjeta);
				}
				
				if(tipopagotarjetaLogic.getTipoPagoTarjeta()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoPagoTarjeta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoPagoTarjeta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipopagotarjetaLogic.getTipoPagoTarjetas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipopagotarjetas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipopagotarjetaLogic.getTipoPagoTarjetas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipopagotarjetas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoPagoTarjeta tipopagotarjeta) {
		Boolean permite=true;
		
		if(this.tipopagotarjeta.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoPagoTarjetaConstantesFunciones.getOrderByListaTipoPagoTarjeta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoPagoTarjetaConstantesFunciones.getOrderByListaTipoPagoTarjeta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPagoTarjeta tipopagotarjeta:tipopagotarjetaLogic.getTipoPagoTarjetas()) {
				if(tipopagotarjeta.getsType().equals(Constantes2.S_TOTALES)) {
					tipopagotarjetaTotales=tipopagotarjeta;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPagoTarjeta tipopagotarjeta:this.tipopagotarjetas) {
				if(tipopagotarjeta.getsType().equals(Constantes2.S_TOTALES)) {
					tipopagotarjetaTotales=tipopagotarjeta;
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
			this.tipopagotarjetaAux=new TipoPagoTarjeta();
			this.tipopagotarjetaAux.setsType(Constantes2.S_TOTALES);
			this.tipopagotarjetaAux.setIsNew(false);
			this.tipopagotarjetaAux.setIsChanged(false);
			this.tipopagotarjetaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoPagoTarjetaConstantesFunciones.TotalizarValoresFilaTipoPagoTarjeta(this.tipopagotarjetaLogic.getTipoPagoTarjetas(),this.tipopagotarjetaAux);
				
				this.tipopagotarjetaLogic.getTipoPagoTarjetas().add(this.tipopagotarjetaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoPagoTarjetaConstantesFunciones.TotalizarValoresFilaTipoPagoTarjeta(this.tipopagotarjetas,this.tipopagotarjetaAux);
				
				this.tipopagotarjetas.add(this.tipopagotarjetaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipopagotarjetaTotales=new TipoPagoTarjeta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipopagotarjetaLogic.getTipoPagoTarjetas().remove(tipopagotarjetaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipopagotarjetas.remove(tipopagotarjetaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipopagotarjetaTotales=new TipoPagoTarjeta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPagoTarjeta tipopagotarjeta:tipopagotarjetaLogic.getTipoPagoTarjetas()) {
				if(tipopagotarjeta.getsType().equals(Constantes2.S_TOTALES)) {
					tipopagotarjetaTotales=tipopagotarjeta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoPagoTarjetaConstantesFunciones.TotalizarValoresFilaTipoPagoTarjeta(this.tipopagotarjetaLogic.getTipoPagoTarjetas(),tipopagotarjetaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPagoTarjeta tipopagotarjeta:this.tipopagotarjetas) {
				if(tipopagotarjeta.getsType().equals(Constantes2.S_TOTALES)) {
					tipopagotarjetaTotales=tipopagotarjeta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoPagoTarjetaConstantesFunciones.TotalizarValoresFilaTipoPagoTarjeta(this.tipopagotarjetas,tipopagotarjetaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoPagoTarjeta() {
		this.isPermisoTodoTipoPagoTarjeta=false;
		this.isPermisoNuevoTipoPagoTarjeta=false;
		this.isPermisoActualizarTipoPagoTarjeta=false;
		this.isPermisoActualizarOriginalTipoPagoTarjeta=false;
		this.isPermisoEliminarTipoPagoTarjeta=false;
		this.isPermisoGuardarCambiosTipoPagoTarjeta=false;
		this.isPermisoConsultaTipoPagoTarjeta=false;
		this.isPermisoBusquedaTipoPagoTarjeta=false;
		this.isPermisoReporteTipoPagoTarjeta=false;		
		this.isPermisoOrdenTipoPagoTarjeta=false;		
		this.isPermisoPaginacionMedioTipoPagoTarjeta=false;		
		this.isPermisoPaginacionAltoTipoPagoTarjeta=false;
		this.isPermisoPaginacionTodoTipoPagoTarjeta=false;
		this.isPermisoCopiarTipoPagoTarjeta=false;		
		this.isPermisoVerFormTipoPagoTarjeta=false;		
		this.isPermisoDuplicarTipoPagoTarjeta=false;		
		this.isPermisoOrdenTipoPagoTarjeta=false;		
	}
	
	public void setPermisosUsuarioTipoPagoTarjeta(Boolean isPermiso) {
		this.isPermisoTodoTipoPagoTarjeta=isPermiso;
		this.isPermisoNuevoTipoPagoTarjeta=isPermiso;
		this.isPermisoActualizarTipoPagoTarjeta=isPermiso;
		this.isPermisoActualizarOriginalTipoPagoTarjeta=isPermiso;
		this.isPermisoEliminarTipoPagoTarjeta=isPermiso;
		this.isPermisoGuardarCambiosTipoPagoTarjeta=isPermiso;
		this.isPermisoConsultaTipoPagoTarjeta=isPermiso;
		this.isPermisoBusquedaTipoPagoTarjeta=isPermiso;
		this.isPermisoReporteTipoPagoTarjeta=isPermiso;
		this.isPermisoOrdenTipoPagoTarjeta=isPermiso;		
		this.isPermisoPaginacionMedioTipoPagoTarjeta=isPermiso;		
		this.isPermisoPaginacionAltoTipoPagoTarjeta=isPermiso;		
		this.isPermisoPaginacionTodoTipoPagoTarjeta=isPermiso;		
		this.isPermisoCopiarTipoPagoTarjeta=isPermiso;		
		this.isPermisoVerFormTipoPagoTarjeta=isPermiso;		
		this.isPermisoDuplicarTipoPagoTarjeta=isPermiso;
		this.isPermisoOrdenTipoPagoTarjeta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoPagoTarjeta(Boolean isPermiso) {
		//this.isPermisoTodoTipoPagoTarjeta=isPermiso;
		this.isPermisoNuevoTipoPagoTarjeta=isPermiso;
		this.isPermisoActualizarTipoPagoTarjeta=isPermiso;
		this.isPermisoActualizarOriginalTipoPagoTarjeta=isPermiso;
		this.isPermisoEliminarTipoPagoTarjeta=isPermiso;
		this.isPermisoGuardarCambiosTipoPagoTarjeta=isPermiso;
		//this.isPermisoConsultaTipoPagoTarjeta=isPermiso;
		//this.isPermisoBusquedaTipoPagoTarjeta=isPermiso;
		//this.isPermisoReporteTipoPagoTarjeta=isPermiso;
		//this.isPermisoOrdenTipoPagoTarjeta=isPermiso;		
		//this.isPermisoPaginacionMedioTipoPagoTarjeta=isPermiso;		
		//this.isPermisoPaginacionAltoTipoPagoTarjeta=isPermiso;		
		//this.isPermisoPaginacionTodoTipoPagoTarjeta=isPermiso;		
		//this.isPermisoCopiarTipoPagoTarjeta=isPermiso;		
		//this.isPermisoDuplicarTipoPagoTarjeta=isPermiso;
		//this.isPermisoOrdenTipoPagoTarjeta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoPagoTarjetaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(FormaPagoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		
		if(TipoPagoTarjetaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosFormaPagoPuntoVenta=this.verificarGetPermisosUsuarioOpcionTipoPagoTarjetaClaseRelacionada(this.opcionsRelacionadas,FormaPagoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoPagoTarjeta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoPagoTarjetaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosFormaPagoPuntoVenta=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoPagoTarjetaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoPagoTarjetaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoPagoTarjetaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosFormaPagoPuntoVenta && this.jInternalFrameDetalleFormTipoPagoTarjeta!=null && this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jTabbedPaneRelacionesTipoPagoTarjeta.remove(this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoPagoTarjeta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoPagoTarjetaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoPagoTarjetaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoPagoTarjeta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoPagoTarjeta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoPagoTarjeta=this.isPermisoActualizarTipoPagoTarjeta;
			this.isPermisoEliminarTipoPagoTarjeta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoPagoTarjeta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoPagoTarjeta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoPagoTarjeta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoPagoTarjeta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoPagoTarjeta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoPagoTarjeta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoPagoTarjeta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoPagoTarjeta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoPagoTarjeta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoPagoTarjeta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoPagoTarjeta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoPagoTarjeta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoPagoTarjeta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoPagoTarjeta.setToolTipText(this.jTableDatosTipoPagoTarjeta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoPagoTarjeta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoPagoTarjeta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoPagoTarjetaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoPagoTarjetaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoPagoTarjeta() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosFormaPagoPuntoVenta && this.tipopagotarjetaConstantesFunciones.mostrarFormaPagoPuntoVentaTipoPagoTarjeta && !TipoPagoTarjetaConstantesFunciones.ISGUARDARREL) {

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
	
		
	public void inicializarCombosForeignKeyTipoPagoTarjetaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoPagoTarjetaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoPagoTarjetaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoPagoTarjetaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoPagoTarjetaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoPagoTarjeta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoPagoTarjeta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoPagoTarjeta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoPagoTarjeta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPagoTarjeta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoPagoTarjeta(TipoPagoTarjeta tipopagotarjeta)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoPagoTarjeta(TipoPagoTarjeta tipopagotarjeta,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoPagoTarjeta()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPagoTarjeta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoPagoTarjeta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoPagoTarjeta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoPagoTarjeta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoPagoTarjeta()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoPagoTarjeta(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoPagoTarjeta()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoPagoTarjetaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoPagoTarjetaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoPagoTarjetaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipopagotarjetaSessionBean=new TipoPagoTarjetaSessionBean(); 
		this.tipopagotarjetaConstantesFunciones=new TipoPagoTarjetaConstantesFunciones(); 
		this.tipopagotarjetaBean=new TipoPagoTarjeta();//(this.tipopagotarjetaConstantesFunciones); 		
		this.tipopagotarjetaReturnGeneral=new TipoPagoTarjetaParameterReturnGeneral(); 
		
		this.tipopagotarjetaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipopagotarjetaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoPagoTarjetaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoPagoTarjetaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoPagoTarjetaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoPagoTarjeta(true);
			
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
			
			this.tipopagotarjetaConstantesFunciones=new TipoPagoTarjetaConstantesFunciones(); 
			this.tipopagotarjetaBean=new TipoPagoTarjeta();//this.tipopagotarjetaConstantesFunciones); 			
			this.tipopagotarjetaReturnGeneral=new TipoPagoTarjetaParameterReturnGeneral(); 
		
			TipoPagoTarjetaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Pago Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipopagotarjeta=new TipoPagoTarjeta();
			this.tipopagotarjetas = new ArrayList<TipoPagoTarjeta>();
			this.tipopagotarjetasAux = new ArrayList<TipoPagoTarjeta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic=new TipoPagoTarjetaLogic();
				this.tipopagotarjetaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipopagotarjetaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipopagotarjetaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoPagoTarjeta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoPagoTarjeta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoPagoTarjeta);	
					}
					
					if(this.jInternalFrameImportacionTipoPagoTarjeta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoPagoTarjeta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoPagoTarjeta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoPagoTarjeta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoPagoTarjeta);
				this.jInternalFrameDetalleFormTipoPagoTarjeta.setVisible(false);
				this.jInternalFrameDetalleFormTipoPagoTarjeta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoPagoTarjeta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoPagoTarjeta);
					this.jInternalFrameReporteDinamicoTipoPagoTarjeta.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoPagoTarjeta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoPagoTarjeta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoPagoTarjeta);
					this.jInternalFrameImportacionTipoPagoTarjeta.setVisible(false);
					this.jInternalFrameImportacionTipoPagoTarjeta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoPagoTarjeta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoPagoTarjeta);
					this.jInternalFrameOrderByTipoPagoTarjeta.setVisible(false);
					this.jInternalFrameOrderByTipoPagoTarjeta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoPagoTarjetaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoPagoTarjetaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipopagotarjetaReturnGeneral=new TipoPagoTarjetaParameterReturnGeneral();
			
			this.tipopagotarjetaParameterGeneral=new TipoPagoTarjetaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipopagotarjetaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoPagoTarjetaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(FormaPagoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoPagoTarjetaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipopagotarjetaSessionBean.getEsGuardarRelacionado(),this.tipopagotarjetaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoPagoTarjetaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipopagotarjetaSessionBean.getEsGuardarRelacionado(),this.tipopagotarjetaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoPagoTarjeta=false;
			this.isVisibilidadCeldaDuplicarTipoPagoTarjeta=true;
			this.isVisibilidadCeldaCopiarTipoPagoTarjeta=true;
			this.isVisibilidadCeldaVerFormTipoPagoTarjeta=true;
			this.isVisibilidadCeldaOrdenTipoPagoTarjeta=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta=false;
			this.isVisibilidadCeldaModificarTipoPagoTarjeta=false;
			this.isVisibilidadCeldaActualizarTipoPagoTarjeta=false;
			this.isVisibilidadCeldaEliminarTipoPagoTarjeta=false;
			this.isVisibilidadCeldaCancelarTipoPagoTarjeta=false;
			this.isVisibilidadCeldaGuardarTipoPagoTarjeta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPagoTarjeta=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoPagoTarjeta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoPagoTarjeta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoPagoTarjeta(false);
			
			this.setPermisosUsuarioTipoPagoTarjeta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipopagotarjetaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipopagotarjetaSessionBean.getEsGuardarRelacionado() && this.tipopagotarjetaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoPagoTarjetaClasesRelacionadas();
			}
			
			if(this.tipopagotarjetaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoPagoTarjetaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoPagoTarjetaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoPagoTarjeta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoPagoTarjeta();
			}
			
			if(!this.isPermisoBusquedaTipoPagoTarjeta) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoPagoTarjeta,this.isPermisoPaginacionMedioTipoPagoTarjeta,this.isPermisoPaginacionTodoTipoPagoTarjeta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoPagoTarjetaConstantesFunciones.getTiposSeleccionarTipoPagoTarjeta());
				
				this.tiposColumnasSelect=TipoPagoTarjetaConstantesFunciones.getTiposSeleccionarTipoPagoTarjeta(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoPagoTarjeta();				
				//this.tiposRelacionesSelect=TipoPagoTarjetaConstantesFunciones.getTiposRelacionesTipoPagoTarjeta(true);
				
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
			//if(!this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoPagoTarjeta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoPagoTarjeta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoPagoTarjeta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPagoTarjeta() ;
			
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
				tipopagotarjetaImplementable= (TipoPagoTarjetaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoPagoTarjetaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipopagotarjetaImplementableHome= (TipoPagoTarjetaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoPagoTarjetaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipopagotarjetas= new ArrayList<TipoPagoTarjeta>();
			this.tipopagotarjetasEliminados= new ArrayList<TipoPagoTarjeta>();
						
			this.isEsNuevoTipoPagoTarjeta=false;
			this.esParaAccionDesdeFormularioTipoPagoTarjeta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoPagoTarjeta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoPagoTarjeta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoPagoTarjetaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoPagoTarjeta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoPagoTarjeta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoPagoTarjeta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoPagoTarjeta();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoPagoTarjeta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoPagoTarjeta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoPagoTarjeta() {
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
			if(sTipo.equals("RelacionesTipoPagoTarjeta")) {
				iIndex=this.jInternalFrameDetalleFormTipoPagoTarjeta.jTabbedPaneRelacionesTipoPagoTarjeta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoPagoTarjeta.jTabbedPaneRelacionesTipoPagoTarjeta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoPagoTarjeta.getSelectedRow();	
				
				

				if(sTitle.equals("Forma Pagoes")) {
					if(!FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoPagoTarjeta();

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
				this.finishProcessTipoPagoTarjeta();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaFormaPagoPuntoVenta(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoPagoTarjeta.cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(false,true,iIndex);
		this.jButtonFormaPagoPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFormaPagoPuntoVenta();

		//this.jTabbedPaneRelacionesTipoPagoTarjeta.updateUI();
		//this.jTabbedPaneRelacionesTipoPagoTarjeta.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoPagoTarjeta.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("FormaPagoPuntoVenta")) {
				int row=this.jTableDatosTipoPagoTarjeta.getSelectedRow();
				jButtonFormaPagoPuntoVentaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Forma Pago")) {

					if(this.isTienePermisosFormaPagoPuntoVenta && this.tipopagotarjetaConstantesFunciones.mostrarFormaPagoPuntoVentaTipoPagoTarjeta && !TipoPagoTarjetaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Forma Pagoes"+"("+FormaPagoPuntoVentaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Forma Pagoes");

						if(tipopagotarjetaConstantesFunciones.resaltarFormaPagoPuntoVentaTipoPagoTarjeta!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipopagotarjetaConstantesFunciones.resaltarFormaPagoPuntoVentaTipoPagoTarjeta);
						}

						jmenuItem.setEnabled(this.tipopagotarjetaConstantesFunciones.activarFormaPagoPuntoVentaTipoPagoTarjeta);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FormaPagoPuntoVenta"));

						

						this.jInternalFrameDetalleFormTipoPagoTarjeta.jmenuDetalleTipoPagoTarjeta.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoPagoTarjeta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoPagoTarjeta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoPagoTarjeta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoPagoTarjetaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoPagoTarjeta();
		
		this.cargarCombosFrameForeignKeyTipoPagoTarjeta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoPagoTarjeta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoPagoTarjeta();
		}
	}
	
	
	
	public void jButtonNuevoTipoPagoTarjetaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipopagotarjetaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoPagoTarjeta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
			
			
			if(jTableDatosTipoPagoTarjeta.getRowCount()>=1) {
				jTableDatosTipoPagoTarjeta.removeRowSelectionInterval(0, jTableDatosTipoPagoTarjeta.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoPagoTarjeta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoPagoTarjeta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoPagoTarjeta(true);			
			//this.tipopagotarjeta=new TipoPagoTarjeta();
			//this.tipopagotarjeta.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPagoTarjeta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPagoTarjeta() ;
			
			if(TipoPagoTarjetaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPagoTarjeta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipopagotarjeta);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipopagotarjeta);				
			
			TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
			
			if(this.tipopagotarjetaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoPagoTarjeta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoPagoTarjetaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoPagoTarjeta> tipopagotarjetasSeleccionados=new ArrayList<TipoPagoTarjeta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoPagoTarjeta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoPagoTarjeta.getSelectedRows().length;			
			}
			
			tipopagotarjetasSeleccionados=this.getTipoPagoTarjetasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoPagoTarjeta--;			
				//TipoPagoTarjeta tipopagotarjetaAux= new TipoPagoTarjeta();			
				//tipopagotarjetaAux.setId(this.iIdNuevoTipoPagoTarjeta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoPagoTarjeta tipopagotarjetaOrigen=new TipoPagoTarjeta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoPagoTarjeta tipopagotarjetaOrigen : tipopagotarjetasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoPagoTarjeta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipopagotarjetaOrigen =(TipoPagoTarjeta) this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipopagotarjetaOrigen =(TipoPagoTarjeta) this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoPagoTarjeta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipopagotarjeta.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoPagoTarjeta(tipopagotarjetaOrigen,this.tipopagotarjeta,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPagoTarjeta(this.tipopagotarjeta);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipopagotarjetaLogic.getTipoPagoTarjetas().add(this.tipopagotarjetaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipopagotarjetas.add(this.tipopagotarjetaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoPagoTarjeta(false);
				
				this.jTableDatosTipoPagoTarjeta.setRowSelectionInterval(this.getIndiceNuevoTipoPagoTarjeta(), this.getIndiceNuevoTipoPagoTarjeta());
				
				int iLastRow =  this.jTableDatosTipoPagoTarjeta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoPagoTarjeta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoPagoTarjeta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPagoTarjeta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoPagoTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoPagoTarjeta> tipopagotarjetasSeleccionados=new ArrayList<TipoPagoTarjeta>();									
		
			TipoPagoTarjeta tipopagotarjetaOrigen=new TipoPagoTarjeta();
			TipoPagoTarjeta tipopagotarjetaDestino=new TipoPagoTarjeta();
				
			tipopagotarjetasSeleccionados=this.getTipoPagoTarjetasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoPagoTarjeta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipopagotarjetasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoPagoTarjeta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopagotarjetaOrigen =(TipoPagoTarjeta) this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipopagotarjetaOrigen =(TipoPagoTarjeta) this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopagotarjetaDestino =(TipoPagoTarjeta) this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipopagotarjetaDestino =(TipoPagoTarjeta) this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipopagotarjetaOrigen =tipopagotarjetasSeleccionados.get(0);
				tipopagotarjetaDestino =tipopagotarjetasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoPagoTarjeta(tipopagotarjetaOrigen,tipopagotarjetaDestino,true,false);
				
				tipopagotarjetaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipopagotarjetaDestino,tipopagotarjetaLogic.getTipoPagoTarjetas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipopagotarjetaDestino,tipopagotarjetas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoPagoTarjeta(false);
				
				//this.jTableDatosTipoPagoTarjeta.setRowSelectionInterval(this.getIndiceNuevoTipoPagoTarjeta(), this.getIndiceNuevoTipoPagoTarjeta());
				
				int iLastRow =  this.jTableDatosTipoPagoTarjeta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoPagoTarjeta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoPagoTarjeta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPagoTarjeta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoPagoTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoPagoTarjeta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoPagoTarjeta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoPagoTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoPagoTarjeta.isVisible();
			
			
			this.jPanelParametrosReportesTipoPagoTarjeta.setVisible(!isVisible);
			this.jPanelPaginacionTipoPagoTarjeta.setVisible(!isVisible);
			this.jPanelAccionesTipoPagoTarjeta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoPagoTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoPagoTarjeta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoPagoTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoPagoTarjeta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoPagoTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoPagoTarjeta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoPagoTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoPagoTarjeta();
			
			this.abrirFrameOrderByTipoPagoTarjeta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoPagoTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoPagoTarjeta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoPagoTarjeta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoPagoTarjeta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoPagoTarjeta.isMaximum()) {
					this.jInternalFrameDetalleFormTipoPagoTarjeta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoPagoTarjeta.setSize(this.jInternalFrameDetalleFormTipoPagoTarjeta.iWidthFormulario,this.jInternalFrameDetalleFormTipoPagoTarjeta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoPagoTarjeta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoPagoTarjeta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoPagoTarjeta.isMaximum()) {
						this.jInternalFrameDetalleFormTipoPagoTarjeta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoPagoTarjeta.jContentPaneDetalleTipoPagoTarjeta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoPagoTarjeta.jTabbedPaneRelacionesTipoPagoTarjeta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoPagoTarjeta.jContentPaneDetalleTipoPagoTarjeta.getWidth(),TipoPagoTarjetaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoPagoTarjeta.jTabbedPaneRelacionesTipoPagoTarjeta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoPagoTarjeta.jContentPaneDetalleTipoPagoTarjeta.getWidth(),TipoPagoTarjetaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoPagoTarjeta.jTabbedPaneRelacionesTipoPagoTarjeta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoPagoTarjeta.jContentPaneDetalleTipoPagoTarjeta.getWidth(),TipoPagoTarjetaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFormaPagoPuntoVenta();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoPagoTarjeta.setVisible(true);
	        this.jInternalFrameDetalleFormTipoPagoTarjeta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoPagoTarjeta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoPagoTarjeta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoPagoTarjeta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPagoTarjeta,false,this);
				} else {
					this.jInternalFrameOrderByTipoPagoTarjeta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPagoTarjeta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoPagoTarjeta);
				this.jInternalFrameOrderByTipoPagoTarjeta.setVisible(false);
				this.jInternalFrameOrderByTipoPagoTarjeta.setSelected(false);
				
				this.jInternalFrameOrderByTipoPagoTarjeta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoPagoTarjeta"));
				
				this.inicializarActualizarBindingTablaOrderByTipoPagoTarjeta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoPagoTarjeta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoPagoTarjeta==null) {
				
				this.jInternalFrameImportacionTipoPagoTarjeta=new ImportacionJInternalFrame(TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoPagoTarjeta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoPagoTarjeta);
				this.jInternalFrameImportacionTipoPagoTarjeta.setVisible(false);
				this.jInternalFrameImportacionTipoPagoTarjeta.setSelected(false);


				this.jInternalFrameImportacionTipoPagoTarjeta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoPagoTarjeta"));
				this.jInternalFrameImportacionTipoPagoTarjeta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoPagoTarjeta"));
				this.jInternalFrameImportacionTipoPagoTarjeta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoPagoTarjeta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoPagoTarjeta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoPagoTarjeta==null) {
				this.jInternalFrameReporteDinamicoTipoPagoTarjeta=new ReporteDinamicoJInternalFrame(TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoPagoTarjeta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoPagoTarjeta);
				this.jInternalFrameReporteDinamicoTipoPagoTarjeta.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoPagoTarjeta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPagoTarjeta"));
				this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPagoTarjeta"));
				this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPagoTarjeta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPagoTarjeta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaFormaPagoPuntoVenta() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoPagoTarjeta.jContentPaneDetalleTipoPagoTarjeta.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoPagoTarjeta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoPagoTarjeta);
			
	       	this.jInternalFrameDetalleFormTipoPagoTarjeta.setVisible(false);
	        this.jInternalFrameDetalleFormTipoPagoTarjeta.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoPagoTarjeta.dispose();
			//this.jInternalFrameDetalleFormTipoPagoTarjeta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoPagoTarjeta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoPagoTarjeta.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoPagoTarjeta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoPagoTarjeta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoPagoTarjeta.setVisible(true);
	        this.jInternalFrameImportacionTipoPagoTarjeta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoPagoTarjeta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoPagoTarjeta.setVisible(true);
	        this.jInternalFrameOrderByTipoPagoTarjeta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoPagoTarjeta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoPagoTarjeta.setVisible(false);
	        this.jInternalFrameOrderByTipoPagoTarjeta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoPagoTarjeta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoPagoTarjeta.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoPagoTarjeta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoPagoTarjeta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoPagoTarjeta.setVisible(false);
	        this.jInternalFrameImportacionTipoPagoTarjeta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoPagoTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoPagoTarjeta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoPagoTarjeta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoPagoTarjeta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoPagoTarjeta(true);
			//this.isEsNuevoTipoPagoTarjeta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoPagoTarjeta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPagoTarjeta(false) ;
			
			if(tipopagotarjetaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.getEsGuardarRelacionado() && FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormaPagoPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoPagoTarjetaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPagoTarjeta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPagoTarjeta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoPagoTarjetaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoPagoTarjeta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoPagoTarjeta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoPagoTarjeta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoPagoTarjeta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoPagoTarjeta(true);
			//this.isEsNuevoTipoPagoTarjeta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipopagotarjeta.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoPagoTarjeta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoPagoTarjeta(false) ;
			
			if(TipoPagoTarjetaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPagoTarjeta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPagoTarjeta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoPagoTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoPagoTarjeta(false);
			
			//if(!this.isEsNuevoTipoPagoTarjeta) {								
				int intSelectedRow = this.jTableDatosTipoPagoTarjeta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoPagoTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoPagoTarjeta(this.tipopagotarjeta,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPagoTarjeta(this.tipopagotarjeta);
				
			}
			
			if(this.permiteMantenimiento(this.tipopagotarjeta)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoPagoTarjeta=true;
					this.inicializarActualizarBindingTablaTipoPagoTarjeta(false);
					this.isEsNuevoTipoPagoTarjeta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoPagoTarjeta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoPagoTarjeta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoPagoTarjeta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPagoTarjeta(false);
				
				this.habilitarDeshabilitarControlesTipoPagoTarjeta(false);
			
												
				
				if(TipoPagoTarjetaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoPagoTarjeta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoPagoTarjetaActionPerformed(evt,tipopagotarjetaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoPagoTarjeta(this.tipopagotarjeta,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoPagoTarjeta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipopagotarjetaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipopagotarjeta.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoPagoTarjeta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPagoTarjeta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoPagoTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoPagoTarjeta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
				this.tipopagotarjeta.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
				this.tipopagotarjeta.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipopagotarjeta)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoPagoTarjetaModel) this.jTableDatosTipoPagoTarjeta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoPagoTarjeta=true;
				this.inicializarActualizarBindingTablaTipoPagoTarjeta(false);
				this.isEsNuevoTipoPagoTarjeta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoPagoTarjeta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPagoTarjeta(false);
				
				this.habilitarDeshabilitarControlesTipoPagoTarjeta(false);
				
				
				
				if(TipoPagoTarjetaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoPagoTarjeta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoPagoTarjetaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoPagoTarjeta.getRowCount()>=1) {
				jTableDatosTipoPagoTarjeta.removeRowSelectionInterval(0, jTableDatosTipoPagoTarjeta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoPagoTarjeta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoPagoTarjeta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPagoTarjeta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPagoTarjeta(false) ;
			
			this.isEsNuevoTipoPagoTarjeta=false;
			
			if(TipoPagoTarjetaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoPagoTarjeta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoPagoTarjetaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoPagoTarjeta(false);
				
				//SI ES MANUAL
				if(TipoPagoTarjetaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoPagoTarjeta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoPagoTarjetaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoPagoTarjeta--;			
			//TipoPagoTarjeta tipopagotarjetaAux= new TipoPagoTarjeta();			
			//tipopagotarjetaAux.setId(this.iIdNuevoTipoPagoTarjeta);
			
			if(this.jInternalFrameDetalleFormTipoPagoTarjeta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoPagoTarjeta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoPagoTarjeta(this.tipopagotarjeta);
			
			this.tipopagotarjeta.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipopagotarjetaLogic.getTipoPagoTarjetas().add(this.tipopagotarjetaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipopagotarjetas.add(this.tipopagotarjetaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoPagoTarjeta(false);
			
			this.jTableDatosTipoPagoTarjeta.setRowSelectionInterval(this.getIndiceNuevoTipoPagoTarjeta(), this.getIndiceNuevoTipoPagoTarjeta());
			
			int iLastRow =  this.jTableDatosTipoPagoTarjeta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoPagoTarjeta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoPagoTarjeta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoPagoTarjeta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoPagoTarjetaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoPagoTarjeta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPagoTarjeta(false);
			
			//SI ES MANUAL
			if(TipoPagoTarjetaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPagoTarjeta();
			}
			
			//this.abrirFrameTreeTipoPagoTarjeta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoPagoTarjetaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo PagoS ?", "MANTENIMIENTO DE Tipo Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoPagoTarjeta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoPagoTarjeta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipopagotarjetaReturnGeneral=tipopagotarjetaLogic.procesarImportacionTipoPagoTarjetasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipopagotarjetaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoPagoTarjetaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoPagoTarjetaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoPagoTarjeta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoPagoTarjeta.setFileImportacion(this.jInternalFrameImportacionTipoPagoTarjeta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoPagoTarjeta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoPagoTarjeta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoPagoTarjeta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoPagoTarjeta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoPagoTarjetaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoPagoTarjeta> tipopagotarjetasSeleccionados=new ArrayList<TipoPagoTarjeta>();		

		tipopagotarjetasSeleccionados=this.getTipoPagoTarjetasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoPagoTarjetaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoPagoTarjetaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoPagoTarjetas("Todos",tipopagotarjetasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Pago",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoPagoTarjetaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoPagoTarjetaConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoPagoTarjetaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoPagoTarjetaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoPagoTarjetaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoPagoTarjetaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoPagoTarjetaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoPagoTarjetaConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoPagoTarjetaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoPagoTarjeta> tipopagotarjetasSeleccionados=new ArrayList<TipoPagoTarjeta>();		
		
		tipopagotarjetasSeleccionados=this.getTipoPagoTarjetasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopagotarjeta";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoPagoTarjetas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoPagoTarjetaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPagoTarjetaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoPagoTarjeta tipopagotarjeta:tipopagotarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipopagotarjeta.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoPagoTarjetaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPagoTarjetaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(TipoPagoTarjeta tipopagotarjeta:tipopagotarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipopagotarjeta.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelTipoPagoTarjeta(row);				
			//	iRow++;
			//}				
			
			//for(TipoPagoTarjeta tipopagotarjetaAux:tipopagotarjetasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoPagoTarjeta(tipopagotarjetaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Pago",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipopagotarjetaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPagoTarjeta(false);
			
			//SI ES MANUAL
			if(TipoPagoTarjetaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPagoTarjeta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoPagoTarjetaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPagoTarjeta(false);
			
			//SI ES MANUAL
			if(TipoPagoTarjetaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoPagoTarjeta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoPagoTarjetaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPagoTarjeta(false);
			
			//SI ES MANUAL
			if(TipoPagoTarjetaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoPagoTarjeta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopagotarjetaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoPagoTarjeta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoPagoTarjeta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoPagoTarjeta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoPagoTarjeta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoPagoTarjeta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoPagoTarjeta.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoPagoTarjeta.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoPagoTarjeta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoPagoTarjeta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoPagoTarjeta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoPagoTarjeta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoPagoTarjeta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoPagoTarjeta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoPagoTarjeta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPagoTarjeta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoPagoTarjeta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoPagoTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoPagoTarjetaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoPagoTarjeta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoPagoTarjeta();
		
		this.inicializarActualizarBindingBotonesManualTipoPagoTarjeta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoPagoTarjeta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPagoTarjeta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPagoTarjeta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPagoTarjeta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoPagoTarjeta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoPagoTarjeta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoPagoTarjeta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoPagoTarjeta.jCheckBoxPostAccionNuevoTipoPagoTarjeta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoPagoTarjeta.jCheckBoxPostAccionSinCerrarTipoPagoTarjeta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoPagoTarjeta.jCheckBoxPostAccionSinMensajeTipoPagoTarjeta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoPagoTarjeta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoPagoTarjeta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoPagoTarjeta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) {
				this.jInternalFrameDetalleFormTipoPagoTarjeta.jCheckBoxPostAccionNuevoTipoPagoTarjeta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoPagoTarjeta.jCheckBoxPostAccionSinCerrarTipoPagoTarjeta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoPagoTarjeta.jCheckBoxPostAccionSinMensajeTipoPagoTarjeta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoPagoTarjeta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoPagoTarjeta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoPagoTarjeta.jComboBoxTiposAccionesFormularioTipoPagoTarjeta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoPagoTarjeta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoPagoTarjeta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoPagoTarjeta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoPagoTarjeta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoPagoTarjeta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoPagoTarjeta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoPagoTarjeta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoPagoTarjeta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoPagoTarjeta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoPagoTarjeta(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoPagoTarjetaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPagoTarjeta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoPagoTarjeta() throws Exception {
		try	{
			if(TipoPagoTarjetaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoPagoTarjeta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoPagoTarjeta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jComboBoxTiposAccionesFormularioTipoPagoTarjeta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jComboBoxTiposAccionesFormularioTipoPagoTarjeta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoPagoTarjeta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoPagoTarjeta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoPagoTarjeta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoPagoTarjeta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoPagoTarjeta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoPagoTarjeta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoPagoTarjeta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoPagoTarjeta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoPagoTarjeta.addItem(reporte);
			}
			
			
			if(!this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoPagoTarjeta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoPagoTarjeta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoPagoTarjeta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoPagoTarjeta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoPagoTarjeta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoPagoTarjeta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoPagoTarjeta.jComboBoxTiposAccionesFormularioTipoPagoTarjeta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoPagoTarjeta.jComboBoxTiposAccionesFormularioTipoPagoTarjeta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoPagoTarjeta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoPagoTarjeta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoPagoTarjeta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPagoTarjeta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPagoTarjeta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoPagoTarjeta!=null) {
				this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoPagoTarjeta!=null) {
				this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoPagoTarjeta!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoPagoTarjeta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoPagoTarjeta(Boolean esInicializar) throws Exception {				
		if(TipoPagoTarjetaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoPagoTarjeta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoPagoTarjeta() throws Exception {
		this.inicializarActualizarBindingTablaTipoPagoTarjeta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoPagoTarjeta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoPagoTarjeta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoPagoTarjeta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPagoTarjeta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoPagoTarjetaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoPagoTarjeta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPagoTarjeta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoPagoTarjetaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoPagoTarjetaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPagoTarjetaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoPagoTarjetaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoPagoTarjeta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPagoTarjeta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoPagoTarjetaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoPagoTarjeta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoPagoTarjeta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipopagotarjetaLogic.getTipoPagoTarjetas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipopagotarjetas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoPagoTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoPagoTarjeta.setModel(new TipoPagoTarjetaModel(this.tipopagotarjetaLogic.getTipoPagoTarjetas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoPagoTarjeta.setModel(new TipoPagoTarjetaModel(this.tipopagotarjetas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoPagoTarjeta!=null && this.jInternalFrameOrderByTipoPagoTarjeta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoPagoTarjeta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoPagoTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPagoTarjeta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoPagoTarjetaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO,tipopagotarjetaConstantesFunciones.resaltarSeleccionarTipoPagoTarjeta,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO,tipopagotarjetaConstantesFunciones.resaltarSeleccionarTipoPagoTarjeta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoPagoTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPagoTarjeta,TipoPagoTarjetaConstantesFunciones.LABEL_ID));

		if(this.tipopagotarjetaConstantesFunciones.mostraridTipoPagoTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPagoTarjetaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipopagotarjetaConstantesFunciones.resaltaridTipoPagoTarjeta,this.tipopagotarjetaConstantesFunciones.activaridTipoPagoTarjeta,this,true,"idTipoPagoTarjeta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipopagotarjetaConstantesFunciones.resaltaridTipoPagoTarjeta,this.tipopagotarjetaConstantesFunciones.activaridTipoPagoTarjeta,this,true,"idTipoPagoTarjeta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPagoTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPagoTarjeta,TipoPagoTarjetaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipopagotarjetaConstantesFunciones.mostrarnombreTipoPagoTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPagoTarjetaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipopagotarjetaConstantesFunciones.resaltarnombreTipoPagoTarjeta,this.tipopagotarjetaConstantesFunciones.activarnombreTipoPagoTarjeta,this,true,"nombreTipoPagoTarjeta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipopagotarjetaConstantesFunciones.resaltarnombreTipoPagoTarjeta,this.tipopagotarjetaConstantesFunciones.activarnombreTipoPagoTarjeta,this,true,"nombreTipoPagoTarjeta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPagoTarjetaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPagoTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPagoTarjeta,TipoPagoTarjetaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.tipopagotarjetaConstantesFunciones.mostrardescripcionTipoPagoTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPagoTarjetaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipopagotarjetaConstantesFunciones.resaltardescripcionTipoPagoTarjeta,this.tipopagotarjetaConstantesFunciones.activardescripcionTipoPagoTarjeta,this,true,"descripcionTipoPagoTarjeta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipopagotarjetaConstantesFunciones.resaltardescripcionTipoPagoTarjeta,this.tipopagotarjetaConstantesFunciones.activardescripcionTipoPagoTarjeta,this,true,"descripcionTipoPagoTarjeta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPagoTarjetaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosFormaPagoPuntoVenta && this.tipopagotarjetaConstantesFunciones.mostrarFormaPagoPuntoVentaTipoPagoTarjeta && !TipoPagoTarjetaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Forma Pagoes");
				tableColumn.setHeaderValue("Forma Pagoes");
				tableColumn.setCellRenderer(new FormaPagoPuntoVentaTableCell(tipopagotarjetaConstantesFunciones.resaltarFormaPagoPuntoVentaTipoPagoTarjeta,this,this.tipopagotarjetaConstantesFunciones.activarFormaPagoPuntoVentaTipoPagoTarjeta));
				tableColumn.setCellEditor(new FormaPagoPuntoVentaTableCell(tipopagotarjetaConstantesFunciones.resaltarFormaPagoPuntoVentaTipoPagoTarjeta,this,this.tipopagotarjetaConstantesFunciones.activarFormaPagoPuntoVentaTipoPagoTarjeta));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoPagoTarjeta.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoPagoTarjeta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoPagoTarjeta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoPagoTarjeta && this.isPermisoGuardarCambiosTipoPagoTarjeta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoPagoTarjeta.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipopagotarjetaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoPagoTarjeta.addColumn(tableColumn);
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
			
			this.jTableDatosTipoPagoTarjeta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoPagoTarjeta && this.isPermisoGuardarCambiosTipoPagoTarjeta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipopagotarjetaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoPagoTarjeta && this.isPermisoGuardarCambiosTipoPagoTarjeta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoPagoTarjeta.moveColumn(this.jTableDatosTipoPagoTarjeta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoPagoTarjeta.moveColumn(this.jTableDatosTipoPagoTarjeta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipopagotarjetaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoPagoTarjeta.moveColumn(this.jTableDatosTipoPagoTarjeta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoPagoTarjeta.moveColumn(this.jTableDatosTipoPagoTarjeta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoPagoTarjeta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoPagoTarjeta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoPagoTarjeta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoPagoTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoPagoTarjeta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoPagoTarjeta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoPagoTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoPagoTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoPagoTarjeta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoPagoTarjeta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoPagoTarjeta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipopagotarjetaLogic.getTipoPagoTarjetas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipopagotarjetas.size()-1;
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
		//this.jTableDatosTipoPagoTarjeta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoPagoTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoPagoTarjeta();
			
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
				
				//this.isEsNuevoTipoPagoTarjeta=false;
					
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
			
				if(this.tipopagotarjetaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoPagoTarjeta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoPagoTarjeta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoPagoTarjeta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipopagotarjeta.getsType().equals("DUPLICADO")
				   || this.tipopagotarjeta.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoPagoTarjeta=true;
				
				} else {
					this.isEsNuevoTipoPagoTarjeta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipopagotarjeta.getId()>=0 && !this.tipopagotarjeta.getIsNew()) {						
						this.isEsNuevoTipoPagoTarjeta=false;
						
					} else {
						this.isEsNuevoTipoPagoTarjeta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoPagoTarjeta(esRelaciones);						
				
				this.seleccionarTipoPagoTarjeta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipopagotarjeta.getId()<0) {
					this.isEsNuevoTipoPagoTarjeta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoPagoTarjeta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoPagoTarjeta(evt,rowIndex);
				}	
				
				if(this.tipopagotarjetaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoPagoTarjeta: " + this.dDif); 
					}
				}								
				
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoPagoTarjeta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipopagotarjeta)) {
					if(this.tipopagotarjeta.getId()>0) {
						this.tipopagotarjeta.setIsDeleted(true);
						
						this.tipopagotarjetasEliminados.add(this.tipopagotarjeta);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipopagotarjetaLogic.getTipoPagoTarjetas().remove(this.tipopagotarjeta);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipopagotarjetas.remove(this.tipopagotarjeta);				
					}
					
					
					((TipoPagoTarjetaModel) this.jTableDatosTipoPagoTarjeta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPagoTarjeta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoPagoTarjeta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoPagoTarjeta) {
			
			if(this.jInternalFrameDetalleFormTipoPagoTarjeta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoPagoTarjeta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoPagoTarjeta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoPagoTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoPagoTarjeta(this.tipopagotarjeta);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoPagoTarjeta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoPagoTarjeta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPagoTarjeta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoPagoTarjeta(TipoPagoTarjeta tipopagotarjeta) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoPagoTarjeta(tipopagotarjeta,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoPagoTarjeta(TipoPagoTarjeta tipopagotarjeta,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoPagoTarjeta(tipopagotarjeta);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoPagoTarjeta(tipopagotarjeta,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoPagoTarjeta(tipopagotarjeta);
	}
	
	public void setVariablesObjetoActualToFormularioTipoPagoTarjeta(TipoPagoTarjeta tipopagotarjeta) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoPagoTarjeta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextFieldidTipoPagoTarjeta.setText(tipopagotarjeta.getId().toString());
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextAreanombreTipoPagoTarjeta.setText(tipopagotarjeta.getnombre());
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextAreadescripcionTipoPagoTarjeta.setText(tipopagotarjeta.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoPagoTarjeta tipopagotarjetaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipopagotarjetaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoPagoTarjeta tipopagotarjetaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipopagotarjetaLocal=this.tipopagotarjeta;
			} else {
				tipopagotarjetaLocal=this.tipopagotarjetaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipopagotarjetaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoPagoTarjeta(tipopagotarjetaLocal,true);
					
					if(tipopagotarjetaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipopagotarjetaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipopagotarjetaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoPagoTarjeta(TipoPagoTarjeta tipopagotarjeta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoPagoTarjeta(tipopagotarjeta,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoPagoTarjeta(tipopagotarjeta);
	}
	
	public void setVariablesFormularioToObjetoActualTipoPagoTarjeta(TipoPagoTarjeta tipopagotarjeta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoPagoTarjeta(tipopagotarjeta,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoPagoTarjeta(TipoPagoTarjeta tipopagotarjeta,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoPagoTarjeta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextFieldidTipoPagoTarjeta.getText()==null || this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextFieldidTipoPagoTarjeta.getText()=="" || this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextFieldidTipoPagoTarjeta.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextFieldidTipoPagoTarjeta.setText("0");
			}

			if(conColumnasBase) {tipopagotarjeta.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextFieldidTipoPagoTarjeta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPagoTarjetaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPagoTarjeta.jLabelIdTipoPagoTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipopagotarjeta.setnombre(this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextAreanombreTipoPagoTarjeta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPagoTarjetaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPagoTarjeta.jLabelnombreTipoPagoTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipopagotarjeta.setdescripcion(this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextAreadescripcionTipoPagoTarjeta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPagoTarjetaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPagoTarjeta.jLabeldescripcionTipoPagoTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoPagoTarjeta(TipoPagoTarjeta tipopagotarjetaBean,TipoPagoTarjeta tipopagotarjeta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoPagoTarjeta(TipoPagoTarjeta tipopagotarjetaOrigen,TipoPagoTarjeta tipopagotarjeta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipopagotarjetaOrigen.getId()!=null && !tipopagotarjetaOrigen.getId().equals(0L))) {tipopagotarjeta.setId(tipopagotarjetaOrigen.getId());}}
			if(conDefault || (!conDefault && tipopagotarjetaOrigen.getnombre()!=null && !tipopagotarjetaOrigen.getnombre().equals(""))) {tipopagotarjeta.setnombre(tipopagotarjetaOrigen.getnombre());}
			if(conDefault || (!conDefault && tipopagotarjetaOrigen.getdescripcion()!=null && !tipopagotarjetaOrigen.getdescripcion().equals(""))) {tipopagotarjeta.setdescripcion(tipopagotarjetaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoPagoTarjeta(TipoPagoTarjeta tipopagotarjeta) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextFieldidTipoPagoTarjeta.setText(tipopagotarjeta.getId().toString());
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextAreanombreTipoPagoTarjeta.setText(tipopagotarjeta.getnombre());
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextAreadescripcionTipoPagoTarjeta.setText(tipopagotarjeta.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoPagoTarjeta(TipoPagoTarjetaBean tipopagotarjetaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextFieldidTipoPagoTarjeta.setText(tipopagotarjetaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextAreanombreTipoPagoTarjeta.setText(tipopagotarjetaBean.getnombre());
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextAreadescripcionTipoPagoTarjeta.setText(tipopagotarjetaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoPagoTarjeta(TipoPagoTarjetaParameterReturnGeneral tipopagotarjetaReturnGeneral,TipoPagoTarjetaBean tipopagotarjetaBean,Boolean conDefault) throws Exception { 
		try {
			TipoPagoTarjeta tipopagotarjetaLocal=new TipoPagoTarjeta();
			
			tipopagotarjetaLocal=tipopagotarjetaReturnGeneral.getTipoPagoTarjeta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipopagotarjetaLocal.getId()!=null && !tipopagotarjetaLocal.getId().equals(0L))) {tipopagotarjetaBean.setId(tipopagotarjetaLocal.getId());}}
			if(conDefault || (!conDefault && tipopagotarjetaLocal.getnombre()!=null && !tipopagotarjetaLocal.getnombre().equals(""))) {tipopagotarjetaBean.setnombre(tipopagotarjetaLocal.getnombre());}
			if(conDefault || (!conDefault && tipopagotarjetaLocal.getdescripcion()!=null && !tipopagotarjetaLocal.getdescripcion().equals(""))) {tipopagotarjetaBean.setdescripcion(tipopagotarjetaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoPagoTarjetaGenerico(Long idTipoPagoTarjetaSeleccionado,JComboBox jComboBoxTipoPagoTarjeta,List<TipoPagoTarjeta> tipopagotarjetasLocal)throws Exception {
		try {
			TipoPagoTarjeta  tipopagotarjetaTemp=null;

			for(TipoPagoTarjeta tipopagotarjetaAux:tipopagotarjetasLocal) {
				if(tipopagotarjetaAux.getId()!=null && tipopagotarjetaAux.getId().equals(idTipoPagoTarjetaSeleccionado)) {
					tipopagotarjetaTemp=tipopagotarjetaAux;
					break;
				}
			}

			jComboBoxTipoPagoTarjeta.setSelectedItem(tipopagotarjetaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoPagoTarjetaGenerico(JComboBox jComboBoxTipoPagoTarjeta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoPagoTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoPagoTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoPagoTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoPagoTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoPagoTarjeta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoPagoTarjeta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoPagoTarjeta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoPagoTarjeta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoPagoTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoPagoTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipopagotarjeta=(TipoPagoTarjeta) tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipopagotarjeta =(TipoPagoTarjeta) tipopagotarjetas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoPagoTarjeta tipopagotarjetaRow=new TipoPagoTarjeta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipopagotarjetaRow=(TipoPagoTarjeta) tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipopagotarjetaRow=(TipoPagoTarjeta) tipopagotarjetas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonFormaPagoPuntoVentaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoPagoTarjeta tipopagotarjeta) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoPagoTarjeta==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjetaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopagotarjeta = (TipoPagoTarjeta)this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipopagotarjeta = (TipoPagoTarjeta)this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipopagotarjeta!=null) {
						this.tipopagotarjeta = tipopagotarjeta;
					} else {
						this.tipopagotarjeta = new TipoPagoTarjeta();
					}
				}

				if(this.isTienePermisosFormaPagoPuntoVenta && this.permiteMantenimiento(this.tipopagotarjeta)) {
					FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFramePopup=new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						formapagopuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFramePopup;
					} else {
						formapagopuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame;
					}

					List<TipoPagoTarjeta> tipopagotarjetas=new ArrayList<TipoPagoTarjeta>();
					tipopagotarjetas.add(this.tipopagotarjeta);
					if(!esRelacionado) {
						//formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setConGuardarRelaciones(false);
						//formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					formapagopuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoPagoTarjeta.cargarFormaPagoPuntoVentaBeanSwingJInternalFrame(tipopagotarjetas,this.tipopagotarjeta,formapagopuntoventaBeanSwingJInternalFrame,/*conInicializar,*/formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.getConGuardarRelaciones(),formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.getEsGuardarRelacionado());
					formapagopuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPagoPuntoVenta("no_relacionado");

						formapagopuntoventaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FormaPagoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA + (FormaPagoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA/2));

						formapagopuntoventaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoPagoTarjeta=(TitledBorder)this.jScrollPanelDatosTipoPagoTarjeta.getBorder();
						TitledBorder titledBorderFormaPagoPuntoVenta=(TitledBorder)formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.getBorder();

						titledBorderFormaPagoPuntoVenta.setTitle(titledBorderTipoPagoTarjeta.getTitle() + " -> Forma Pago");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,formapagopuntoventaBeanSwingJInternalFrame);
						}

						formapagopuntoventaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(formapagopuntoventaBeanSwingJInternalFrame);

						formapagopuntoventaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipopagotarjetaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Forma Pago",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjetaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjetaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoPagoTarjeta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaNuevoTipoPagoTarjeta && this.isPermisoNuevoTipoPagoTarjeta));			
			this.jButtonDuplicarTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaDuplicarTipoPagoTarjeta && this.isPermisoDuplicarTipoPagoTarjeta));			
			this.jButtonCopiarTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaCopiarTipoPagoTarjeta && this.isPermisoCopiarTipoPagoTarjeta));
			this.jButtonVerFormTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaVerFormTipoPagoTarjeta && this.isPermisoVerFormTipoPagoTarjeta));
			
			this.jButtonAbrirOrderByTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaOrdenTipoPagoTarjeta && this.isPermisoOrdenTipoPagoTarjeta));			
			
			this.jButtonNuevoRelacionesTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta && this.isPermisoNuevoTipoPagoTarjeta));			
			this.jButtonNuevoGuardarCambiosTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaNuevoTipoPagoTarjeta && this.isPermisoNuevoTipoPagoTarjeta && this.isPermisoGuardarCambiosTipoPagoTarjeta));
			
			if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) {
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonModificarTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaModificarTipoPagoTarjeta && this.isPermisoActualizarTipoPagoTarjeta));	
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonActualizarTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaActualizarTipoPagoTarjeta && this.isPermisoActualizarTipoPagoTarjeta));	
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonEliminarTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaEliminarTipoPagoTarjeta && this.isPermisoEliminarTipoPagoTarjeta));
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonCancelarTipoPagoTarjeta.setVisible(this.isVisibilidadCeldaCancelarTipoPagoTarjeta);							
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonGuardarCambiosTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaGuardarTipoPagoTarjeta && this.isPermisoGuardarCambiosTipoPagoTarjeta));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPagoTarjeta && this.isPermisoGuardarCambiosTipoPagoTarjeta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaNuevoTipoPagoTarjeta && this.isPermisoNuevoTipoPagoTarjeta));						
			this.jButtonDuplicarToolBarTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaDuplicarTipoPagoTarjeta && this.isPermisoDuplicarTipoPagoTarjeta));						
			this.jButtonCopiarToolBarTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaCopiarTipoPagoTarjeta && this.isPermisoCopiarTipoPagoTarjeta));			
			this.jButtonVerFormToolBarTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaVerFormTipoPagoTarjeta && this.isPermisoVerFormTipoPagoTarjeta));			
			this.jButtonAbrirOrderByToolBarTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaOrdenTipoPagoTarjeta && this.isPermisoOrdenTipoPagoTarjeta));
			this.jButtonNuevoRelacionesToolBarTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta && this.isPermisoNuevoTipoPagoTarjeta));			
			this.jButtonNuevoGuardarCambiosToolBarTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaNuevoTipoPagoTarjeta && this.isPermisoNuevoTipoPagoTarjeta && this.isPermisoGuardarCambiosTipoPagoTarjeta));			
			
			if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) {
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonModificarToolBarTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaModificarTipoPagoTarjeta && this.isPermisoActualizarTipoPagoTarjeta));	
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonActualizarToolBarTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaActualizarTipoPagoTarjeta  && this.isPermisoActualizarTipoPagoTarjeta));	
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonEliminarToolBarTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaEliminarTipoPagoTarjeta && this.isPermisoEliminarTipoPagoTarjeta));
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonCancelarToolBarTipoPagoTarjeta.setVisible(this.isVisibilidadCeldaCancelarTipoPagoTarjeta);				
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonGuardarCambiosToolBarTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaGuardarTipoPagoTarjeta && this.isPermisoGuardarCambiosTipoPagoTarjeta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPagoTarjeta && this.isPermisoGuardarCambiosTipoPagoTarjeta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaNuevoTipoPagoTarjeta && this.isPermisoNuevoTipoPagoTarjeta));			
			this.jMenuItemDuplicarTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaDuplicarTipoPagoTarjeta && this.isPermisoDuplicarTipoPagoTarjeta));			
			this.jMenuItemCopiarTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaCopiarTipoPagoTarjeta && this.isPermisoCopiarTipoPagoTarjeta));			
			this.jMenuItemVerFormTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaVerFormTipoPagoTarjeta && this.isPermisoVerFormTipoPagoTarjeta));			
			this.jMenuItemAbrirOrderByTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaOrdenTipoPagoTarjeta && this.isPermisoOrdenTipoPagoTarjeta));			
			//this.jMenuItemMostrarOcultarTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaOrdenTipoPagoTarjeta && this.isPermisoOrdenTipoPagoTarjeta));
			this.jMenuItemDetalleAbrirOrderByTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaOrdenTipoPagoTarjeta && this.isPermisoOrdenTipoPagoTarjeta));			
			//this.jMenuItemDetalleMostrarOcultarTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaOrdenTipoPagoTarjeta && this.isPermisoOrdenTipoPagoTarjeta));			
			this.jMenuItemNuevoRelacionesTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta && this.isPermisoNuevoTipoPagoTarjeta));			
			this.jMenuItemNuevoGuardarCambiosTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaNuevoTipoPagoTarjeta && this.isPermisoNuevoTipoPagoTarjeta && this.isPermisoGuardarCambiosTipoPagoTarjeta));									
			
			if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) {
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jMenuItemModificarTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaModificarTipoPagoTarjeta && this.isPermisoActualizarTipoPagoTarjeta));	
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jMenuItemActualizarTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaActualizarTipoPagoTarjeta && this.isPermisoActualizarTipoPagoTarjeta));	
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jMenuItemEliminarTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaEliminarTipoPagoTarjeta && this.isPermisoEliminarTipoPagoTarjeta));
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jMenuItemCancelarTipoPagoTarjeta.setVisible(this.isVisibilidadCeldaCancelarTipoPagoTarjeta);				
			}
			
			this.jMenuItemGuardarCambiosTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaGuardarTipoPagoTarjeta && this.isPermisoGuardarCambiosTipoPagoTarjeta));						
			this.jMenuItemGuardarCambiosTablaTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPagoTarjeta && this.isPermisoGuardarCambiosTipoPagoTarjeta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoPagoTarjeta=this.jButtonNuevoTipoPagoTarjeta.isVisible();
			this.isVisibilidadCeldaDuplicarTipoPagoTarjeta=this.jButtonDuplicarTipoPagoTarjeta.isVisible();
			this.isVisibilidadCeldaCopiarTipoPagoTarjeta=this.jButtonCopiarTipoPagoTarjeta.isVisible();
			this.isVisibilidadCeldaVerFormTipoPagoTarjeta=this.jButtonVerFormTipoPagoTarjeta.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoPagoTarjeta=this.jButtonAbrirOrderByTipoPagoTarjeta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta=this.jButtonNuevoRelacionesTipoPagoTarjeta.isVisible();
			this.isVisibilidadCeldaModificarTipoPagoTarjeta=this.jButtonModificarTipoPagoTarjeta.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) {
			this.isVisibilidadCeldaActualizarTipoPagoTarjeta=this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonActualizarTipoPagoTarjeta.isVisible();
			this.isVisibilidadCeldaEliminarTipoPagoTarjeta=this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonEliminarTipoPagoTarjeta.isVisible();
			this.isVisibilidadCeldaCancelarTipoPagoTarjeta=this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonCancelarTipoPagoTarjeta.isVisible();
			this.isVisibilidadCeldaGuardarTipoPagoTarjeta=this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonGuardarCambiosTipoPagoTarjeta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoPagoTarjeta=this.jButtonGuardarCambiosTablaTipoPagoTarjeta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoPagoTarjeta=this.jButtonNuevoToolBarTipoPagoTarjeta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta=this.jButtonNuevoRelacionesToolBarTipoPagoTarjeta.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) {
			this.isVisibilidadCeldaModificarTipoPagoTarjeta=this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonModificarToolBarTipoPagoTarjeta.isVisible();
			this.isVisibilidadCeldaActualizarTipoPagoTarjeta=this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonActualizarToolBarTipoPagoTarjeta.isVisible();
			this.isVisibilidadCeldaEliminarTipoPagoTarjeta=this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonEliminarToolBarTipoPagoTarjeta.isVisible();
			this.isVisibilidadCeldaCancelarTipoPagoTarjeta=this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonCancelarToolBarTipoPagoTarjeta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoPagoTarjeta=this.jButtonGuardarCambiosToolBarTipoPagoTarjeta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoPagoTarjeta=this.jButtonGuardarCambiosTablaToolBarTipoPagoTarjeta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoPagoTarjeta=this.jMenuItemNuevoTipoPagoTarjeta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta=this.jMenuItemNuevoRelacionesTipoPagoTarjeta.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) {
			this.isVisibilidadCeldaModificarTipoPagoTarjeta=this.jInternalFrameDetalleFormTipoPagoTarjeta.jMenuItemModificarTipoPagoTarjeta.isVisible();
			this.isVisibilidadCeldaActualizarTipoPagoTarjeta=this.jInternalFrameDetalleFormTipoPagoTarjeta.jMenuItemActualizarTipoPagoTarjeta.isVisible();
			this.isVisibilidadCeldaEliminarTipoPagoTarjeta=this.jInternalFrameDetalleFormTipoPagoTarjeta.jMenuItemEliminarTipoPagoTarjeta.isVisible();
			this.isVisibilidadCeldaCancelarTipoPagoTarjeta=this.jInternalFrameDetalleFormTipoPagoTarjeta.jMenuItemCancelarTipoPagoTarjeta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoPagoTarjeta=this.jMenuItemGuardarCambiosTipoPagoTarjeta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoPagoTarjeta=this.jMenuItemGuardarCambiosTablaTipoPagoTarjeta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoPagoTarjeta(Boolean esInicializar) {
		if(TipoPagoTarjetaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipopagotarjetaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoPagoTarjeta();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoPagoTarjeta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoPagoTarjeta() {
		this.jButtonNuevoTipoPagoTarjeta.setVisible(this.isPermisoNuevoTipoPagoTarjeta);			
		this.jButtonDuplicarTipoPagoTarjeta.setVisible(this.isPermisoDuplicarTipoPagoTarjeta);			
		this.jButtonCopiarTipoPagoTarjeta.setVisible(this.isPermisoCopiarTipoPagoTarjeta);			
		this.jButtonVerFormTipoPagoTarjeta.setVisible(this.isPermisoVerFormTipoPagoTarjeta);			
		
		this.jButtonAbrirOrderByTipoPagoTarjeta.setVisible(this.isPermisoOrdenTipoPagoTarjeta);					
		
		this.jButtonNuevoRelacionesTipoPagoTarjeta.setVisible(this.isPermisoNuevoTipoPagoTarjeta);			
		
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonModificarTipoPagoTarjeta.setVisible(this.isPermisoActualizarTipoPagoTarjeta);	
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonActualizarTipoPagoTarjeta.setVisible(this.isPermisoActualizarTipoPagoTarjeta);	
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonEliminarTipoPagoTarjeta.setVisible(this.isPermisoEliminarTipoPagoTarjeta);
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonCancelarTipoPagoTarjeta.setVisible(this.isVisibilidadCeldaCancelarTipoPagoTarjeta);						
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonGuardarCambiosTipoPagoTarjeta.setVisible(this.isPermisoGuardarCambiosTipoPagoTarjeta);							
		}
		
		this.jButtonGuardarCambiosTablaTipoPagoTarjeta.setVisible(this.isPermisoActualizarTipoPagoTarjeta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoPagoTarjeta() {
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonModificarTipoPagoTarjeta.setVisible(this.isPermisoActualizarTipoPagoTarjeta);	
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonActualizarTipoPagoTarjeta.setVisible(this.isPermisoActualizarTipoPagoTarjeta);	
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonEliminarTipoPagoTarjeta.setVisible(this.isPermisoEliminarTipoPagoTarjeta);
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonCancelarTipoPagoTarjeta.setVisible(this.isVisibilidadCeldaCancelarTipoPagoTarjeta);							
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonGuardarCambiosTipoPagoTarjeta.setVisible((this.isVisibilidadCeldaGuardarTipoPagoTarjeta && this.isPermisoGuardarCambiosTipoPagoTarjeta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoPagoTarjeta() {
		if(TipoPagoTarjetaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoPagoTarjeta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoPagoTarjeta() {
	}
	
	public void jTableDatosTipoPagoTarjetaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoPagoTarjeta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoPagoTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPagoTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPagoTarjeta(this.gettipopagotarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPagoTarjeta(this.tipopagotarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipopagotarjeta==null) {
						this.tipopagotarjeta = new TipoPagoTarjeta();
					}

					this.setVariablesFormularioToObjetoActualTipoPagoTarjeta(this.tipopagotarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPagoTarjeta(this.tipopagotarjeta);
				}

				if(this.tipopagotarjeta.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipopagotarjeta.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPagoTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoPagoTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPagoTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPagoTarjeta(this.gettipopagotarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPagoTarjeta(this.tipopagotarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipopagotarjeta==null) {
						this.tipopagotarjeta = new TipoPagoTarjeta();
					}

					this.setVariablesFormularioToObjetoActualTipoPagoTarjeta(this.tipopagotarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPagoTarjeta(this.tipopagotarjeta);
				}

				if(this.tipopagotarjeta.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipopagotarjeta.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPagoTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTipoPagoTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPagoTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPagoTarjeta(this.gettipopagotarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPagoTarjeta(this.tipopagotarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipopagotarjeta==null) {
						this.tipopagotarjeta = new TipoPagoTarjeta();
					}

					this.setVariablesFormularioToObjetoActualTipoPagoTarjeta(this.tipopagotarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPagoTarjeta(this.tipopagotarjeta);
				}

				if(this.tipopagotarjeta.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.tipopagotarjeta.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPagoTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoPagoTarjeta() {
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) {
		

		if(this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) {
			this.jInternalFrameDetalleFormTipoPagoTarjeta.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoPagoTarjeta.dispose();
			this.jInternalFrameDetalleFormTipoPagoTarjeta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoPagoTarjeta!=null) {
			this.jInternalFrameReporteDinamicoTipoPagoTarjeta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoPagoTarjeta.dispose();
			this.jInternalFrameReporteDinamicoTipoPagoTarjeta=null;
		}
		
		if(this.jInternalFrameImportacionTipoPagoTarjeta!=null) {
			this.jInternalFrameImportacionTipoPagoTarjeta.setVisible(false);	    			
			this.jInternalFrameImportacionTipoPagoTarjeta.dispose();
			this.jInternalFrameImportacionTipoPagoTarjeta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoPagoTarjeta();
			
			TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoPagoTarjeta")) {
				jButtonNuevoTipoPagoTarjetaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoPagoTarjeta")) {
				jButtonDuplicarTipoPagoTarjetaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoPagoTarjeta")) {
				jButtonCopiarTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoPagoTarjeta")) {
				jButtonVerFormTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoPagoTarjeta")) {
				jButtonNuevoTipoPagoTarjetaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoPagoTarjeta")) {
				jButtonDuplicarTipoPagoTarjetaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoPagoTarjeta")) {
				jButtonNuevoTipoPagoTarjetaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoPagoTarjeta")) {
				jButtonDuplicarTipoPagoTarjetaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoPagoTarjeta")) {
				jButtonNuevoTipoPagoTarjetaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoPagoTarjeta")) {
				jButtonNuevoTipoPagoTarjetaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoPagoTarjeta")) {
				jButtonNuevoTipoPagoTarjetaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoPagoTarjeta")) {
				jButtonModificarTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoPagoTarjeta")) {
				jButtonModificarTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoPagoTarjeta")) {
				jButtonModificarTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoPagoTarjeta")) {
				jButtonActualizarTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoPagoTarjeta")) {
				jButtonActualizarTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoPagoTarjeta")) {
				jButtonActualizarTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoPagoTarjeta")) {
				jButtonEliminarTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoPagoTarjeta")) {
				jButtonEliminarTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoPagoTarjeta")) {
				jButtonEliminarTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoPagoTarjeta")) {
				jButtonCancelarTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoPagoTarjeta")) {
				jButtonCancelarTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoPagoTarjeta")) {
				jButtonCancelarTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoPagoTarjeta")) {
				jButtonCerrarTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoPagoTarjeta")) {
				jButtonCerrarTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoPagoTarjeta")) {
				jButtonCerrarTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoPagoTarjeta")) {
				jButtonMostrarOcultarTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoPagoTarjeta")) {
				jButtonCancelarTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoPagoTarjeta")) {
				jButtonGuardarCambiosTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoPagoTarjeta")) {
				jButtonGuardarCambiosTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoPagoTarjeta")) {
				jButtonCopiarTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoPagoTarjeta")) {
				jButtonVerFormTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoPagoTarjeta")) {
				jButtonGuardarCambiosTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoPagoTarjeta")) {
				jButtonCopiarTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoPagoTarjeta")) {
				jButtonVerFormTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoPagoTarjeta")) {
				jButtonGuardarCambiosTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoPagoTarjeta")) {
				jButtonGuardarCambiosTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoPagoTarjeta")) {
				jButtonGuardarCambiosTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoPagoTarjeta")) {
				jButtonRecargarInformacionTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoPagoTarjeta")) {
				jButtonRecargarInformacionTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoPagoTarjeta")) {
				jButtonRecargarInformacionTipoPagoTarjetaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoPagoTarjeta")) {
				jButtonAnterioresTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoPagoTarjeta")) {
				jButtonAnterioresTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoPagoTarjeta")) {
				jButtonAnterioresTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoPagoTarjeta")) {
				jButtonSiguientesTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoPagoTarjeta")) {
				jButtonSiguientesTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoPagoTarjeta")) {
				jButtonSiguientesTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoPagoTarjeta") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoPagoTarjeta")) {
				jButtonAbrirOrderByTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoPagoTarjeta") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoPagoTarjeta")) {
				jButtonMostrarOcultarTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoPagoTarjeta")) {
				jButtonNuevoGuardarCambiosTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoPagoTarjeta")) {
				jButtonNuevoGuardarCambiosTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoPagoTarjeta")) {
				jButtonNuevoGuardarCambiosTipoPagoTarjetaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoPagoTarjeta")) {
				jButtonCerrarReporteDinamicoTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoPagoTarjeta")) {
				jButtonGenerarReporteDinamicoTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoPagoTarjeta")) {
				
				jButtonGenerarExcelReporteDinamicoTipoPagoTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoPagoTarjeta")) {
				jButtonCerrarImportacionTipoPagoTarjetaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoPagoTarjeta")) {
				
				jButtonGenerarImportacionTipoPagoTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoPagoTarjeta")) {
				
				jButtonAbrirImportacionTipoPagoTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoPagoTarjeta")) {
				jComboBoxTiposAccionesTipoPagoTarjetaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoPagoTarjeta")) {
				jComboBoxTiposRelacionesTipoPagoTarjetaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoPagoTarjeta")) {
				jComboBoxTiposAccionesTipoPagoTarjetaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoPagoTarjeta")) {
				
				jComboBoxTiposSeleccionarTipoPagoTarjetaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoPagoTarjeta")) {
				jTextFieldValorCampoGeneralTipoPagoTarjetaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoPagoTarjeta")) {
				jButtonAbrirOrderByTipoPagoTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoPagoTarjeta")) {
				jButtonAbrirOrderByTipoPagoTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoPagoTarjeta")) {
				jButtonCerrarOrderByTipoPagoTarjetaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoPagoTarjetaBusqueda")) {
				this.jButtonidTipoPagoTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoPagoTarjetaBusqueda")) {
				this.jButtonnombreTipoPagoTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoPagoTarjetaBusqueda")) {
				this.jButtondescripcionTipoPagoTarjetaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoPagoTarjeta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPagoTarjetaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopagotarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopagotarjeta);
				
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
				
				


				
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPagoTarjeta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPagoTarjeta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoPagoTarjeta tipopagotarjetaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipopagotarjetaLocal=this.tipopagotarjeta;
			} else {
				tipopagotarjetaLocal=this.tipopagotarjetaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopagotarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopagotarjeta);
				
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
							
				
				


				
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPagoTarjeta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPagoTarjeta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPagoTarjetaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPagoTarjeta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjetaAnterior =(TipoPagoTarjeta) this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopagotarjetaAnterior =(TipoPagoTarjeta) this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
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
			
			TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
			
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
			
			


			
			TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPagoTarjetaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopagotarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopagotarjeta);
				
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
								
						
				


				
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPagoTarjeta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPagoTarjeta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopagotarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopagotarjeta);
				
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
								
				
				


				
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPagoTarjeta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPagoTarjeta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPagoTarjetaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPagoTarjeta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjetaAnterior =(TipoPagoTarjeta) this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopagotarjetaAnterior =(TipoPagoTarjeta) this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopagotarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopagotarjeta);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPagoTarjetaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPagoTarjeta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjetaAnterior =(TipoPagoTarjeta) this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopagotarjetaAnterior =(TipoPagoTarjeta) this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPagoTarjetaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopagotarjeta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipopagotarjeta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopagotarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopagotarjeta);
				
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
							
				
				


				
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPagoTarjeta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPagoTarjeta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPagoTarjetaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoPagoTarjeta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopagotarjetaAnterior =(TipoPagoTarjeta) this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipopagotarjetaAnterior =(TipoPagoTarjeta) this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
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
			
			TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
			
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
			
			


			
			TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPagoTarjetaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopagotarjeta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipopagotarjeta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopagotarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopagotarjeta);
				
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
								
				
				


				
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPagoTarjeta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPagoTarjeta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPagoTarjetaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPagoTarjeta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjetaAnterior =(TipoPagoTarjeta) this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopagotarjetaAnterior =(TipoPagoTarjeta) this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPagoTarjetaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopagotarjeta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipopagotarjeta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPagoTarjetaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopagotarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopagotarjeta);
				
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoPagoTarjeta")) {
					jCheckBoxSeleccionarTodosTipoPagoTarjetaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoPagoTarjeta")) {
					jCheckBoxSeleccionadosTipoPagoTarjetaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoPagoTarjeta")) {
					
				}
				
				


				
				
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPagoTarjeta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPagoTarjeta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopagotarjeta);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipopagotarjeta);
				
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
												
				
				


				
				
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPagoTarjeta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPagoTarjeta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPagoTarjetaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoPagoTarjeta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopagotarjetaAnterior =(TipoPagoTarjeta) this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipopagotarjetaAnterior =(TipoPagoTarjeta) this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPagoTarjetaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopagotarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopagotarjeta);
				
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
				
				
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
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
			
			TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
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
			
			


			
			TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPagoTarjetaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopagotarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopagotarjeta);
				
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPagoTarjeta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPagoTarjeta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopagotarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopagotarjeta);
				
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
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
				
				


				
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPagoTarjeta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPagoTarjeta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPagoTarjetaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPagoTarjeta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopagotarjetaAnterior =(TipoPagoTarjeta) this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopagotarjetaAnterior =(TipoPagoTarjeta) this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoPagoTarjeta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoPagoTarjetaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoPagoTarjeta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipopagotarjeta =(TipoPagoTarjeta) this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipopagotarjeta);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoPagoTarjeta")) {
				
				}
				
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoPagoTarjeta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoPagoTarjeta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoPagoTarjeta")) {
			
			}
			
			TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoPagoTarjeta();
			
			TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoPagoTarjeta")) {
				jButtonNuevoTipoPagoTarjetaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoPagoTarjeta")) {
				jButtonDuplicarTipoPagoTarjetaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoPagoTarjeta")) {
				jButtonCopiarTipoPagoTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoPagoTarjeta")) {
				jButtonVerFormTipoPagoTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoPagoTarjeta")) {
				jButtonNuevoTipoPagoTarjetaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoPagoTarjeta")) {
				jButtonModificarTipoPagoTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoPagoTarjeta")) {
				jButtonActualizarTipoPagoTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoPagoTarjeta")) {
				jButtonEliminarTipoPagoTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoPagoTarjeta")) {
				jButtonGuardarCambiosTipoPagoTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoPagoTarjeta")) {
				jButtonCancelarTipoPagoTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoPagoTarjeta")) {
				jButtonCerrarTipoPagoTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoPagoTarjeta")) {
				jButtonGuardarCambiosTipoPagoTarjetaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoPagoTarjeta")) {
				jButtonNuevoGuardarCambiosTipoPagoTarjetaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoPagoTarjeta")) {
				jButtonAbrirOrderByTipoPagoTarjetaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoPagoTarjeta")) {
				jButtonRecargarInformacionTipoPagoTarjetaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoPagoTarjeta")) {
				jButtonAnterioresTipoPagoTarjetaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoPagoTarjeta")) {
				jButtonSiguientesTipoPagoTarjetaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoPagoTarjetaBusqueda")) {
				this.jButtonidTipoPagoTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoPagoTarjetaBusqueda")) {
				this.jButtonnombreTipoPagoTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoPagoTarjetaBusqueda")) {
				this.jButtondescripcionTipoPagoTarjetaBusquedaActionPerformed(evt);
			}
			
			TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoPagoTarjeta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoPagoTarjeta")) {
				closingInternalFrameTipoPagoTarjeta();
				
			} else if(sTipo.equals("jButtonCancelarTipoPagoTarjeta")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoPagoTarjeta = (JInternalFrameBase)evt.getSource();
	            	
	            TipoPagoTarjetaBeanSwingJInternalFrame jInternalFrameParent=(TipoPagoTarjetaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoPagoTarjeta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoPagoTarjetaActionPerformed(null);
			}
			
			TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipopagotarjeta,new Object(),this.tipopagotarjetaParameterGeneral,this.tipopagotarjetaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoPagoTarjeta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoPagoTarjeta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoPagoTarjeta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipopagotarjeta)) {
			if(!esControlTabla) {
				if(TipoPagoTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoPagoTarjeta(this.tipopagotarjeta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPagoTarjeta(this.tipopagotarjeta);			
				}
				
				if(this.tipopagotarjetaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoPagoTarjeta(this.tipopagotarjeta,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipopagotarjetaReturnGeneral=tipopagotarjetaLogic.procesarEventosTipoPagoTarjetasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipopagotarjetaLogic.getTipoPagoTarjetas(),this.tipopagotarjeta,this.tipopagotarjetaParameterGeneral,this.isEsNuevoTipoPagoTarjeta,classes);//this.tipopagotarjetaLogic.getTipoPagoTarjeta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoPagoTarjeta(this.tipopagotarjetaReturnGeneral,this.tipopagotarjetaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipopagotarjetaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoPagoTarjeta(classes,this.tipopagotarjetaReturnGeneral,this.tipopagotarjetaBean,false);
					}
						
					if(this.tipopagotarjetaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoPagoTarjeta(this.tipopagotarjetaReturnGeneral.getTipoPagoTarjeta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoPagoTarjeta(this.tipopagotarjetaReturnGeneral.getTipoPagoTarjeta());	
					}
						
					if(this.tipopagotarjetaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoPagoTarjeta(this.tipopagotarjetaReturnGeneral.getTipoPagoTarjeta(),classes);//this.tipopagotarjetaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoPagoTarjeta(this.tipopagotarjeta,classes);//this.tipopagotarjetaBean);									
				}
			
				if(TipoPagoTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoPagoTarjeta(this.tipopagotarjeta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPagoTarjeta(this.tipopagotarjeta);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipopagotarjetaAnterior!=null) {
						this.tipopagotarjeta=this.tipopagotarjetaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipopagotarjetaReturnGeneral=tipopagotarjetaLogic.procesarEventosTipoPagoTarjetasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipopagotarjetaLogic.getTipoPagoTarjetas(),this.tipopagotarjeta,this.tipopagotarjetaParameterGeneral,this.isEsNuevoTipoPagoTarjeta,classes);//this.tipopagotarjetaLogic.getTipoPagoTarjeta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipopagotarjetaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipopagotarjetaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipopagotarjetaReturnGeneral.getTipoPagoTarjeta(),tipopagotarjetaLogic.getTipoPagoTarjetas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipopagotarjetaReturnGeneral.getTipoPagoTarjeta(),this.tipopagotarjetas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoPagoTarjeta.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoPagoTarjeta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoPagoTarjeta();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoPagoTarjeta() throws Exception {
		
		TipoPagoTarjetaModel tipopagotarjetaModel=(TipoPagoTarjetaModel)this.jTableDatosTipoPagoTarjeta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipopagotarjetaModel.tipopagotarjetas=this.tipopagotarjetaLogic.getTipoPagoTarjetas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipopagotarjetaModel.tipopagotarjetas=this.tipopagotarjetas;
		}
		
		
		((TipoPagoTarjetaModel) this.jTableDatosTipoPagoTarjeta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoPagoTarjeta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipopagotarjetaAnterior(),this.tipopagotarjetaLogic.getTipoPagoTarjetas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipopagotarjetaAnterior(),this.tipopagotarjetas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoPagoTarjeta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoPagoTarjeta(TipoPagoTarjeta tipopagotarjeta,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FormaPagoPuntoVenta.class)) {
					this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.setFormaPagoPuntoVentas(tipopagotarjeta.getFormaPagoPuntoVentas());
					this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormaPagoPuntoVenta(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
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
										
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipopagotarjeta,new Object(),generalEntityParameterGeneral,this.tipopagotarjetaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipopagotarjetaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoPagoTarjetaConstantesFunciones.getClassesRelationshipsOfTipoPagoTarjeta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoPagoTarjetaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoPagoTarjeta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoPagoTarjeta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoPagoTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipopagotarjeta,new Object(),generalEntityParameterGeneral,this.tipopagotarjetaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoPagoTarjeta(TipoPagoTarjetaBean tipopagotarjetaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FormaPagoPuntoVenta.class)) {
					this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.setFormaPagoPuntoVentas(tipopagotarjeta.getFormaPagoPuntoVentas());
					this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormaPagoPuntoVenta(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoPagoTarjeta(ArrayList<Classe> classes,TipoPagoTarjetaReturnGeneral tipopagotarjetaReturnGeneral,TipoPagoTarjetaBean tipopagotarjetaBean,Boolean conDefault) throws Exception {
		
			this.tipopagotarjetaBean.setFormaPagoPuntoVentas(tipopagotarjetaReturnGeneral.getTipoPagoTarjeta().getFormaPagoPuntoVentas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoPagoTarjeta(TipoPagoTarjeta tipopagotarjeta,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(FormaPagoPuntoVenta.class)) {
					tipopagotarjeta.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipopagotarjeta)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoPagoTarjeta = new TipoPagoTarjetaDetalleFormJInternalFrame(jDesktopPane,this.tipopagotarjetaSessionBean.getConGuardarRelaciones(),this.tipopagotarjetaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoPagoTarjeta);
		this.jInternalFrameDetalleFormTipoPagoTarjeta.setVisible(false);
		this.jInternalFrameDetalleFormTipoPagoTarjeta.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoPagoTarjeta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoPagoTarjeta.tipopagotarjetaLogic=this.tipopagotarjetaLogic;
		
		this.cargarCombosFrameForeignKeyTipoPagoTarjeta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoPagoTarjeta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoPagoTarjeta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoPagoTarjeta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoPagoTarjeta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoPagoTarjeta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoPagoTarjeta"));
		
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonModificarTipoPagoTarjeta.addActionListener(new ButtonActionListener(this,"ModificarTipoPagoTarjeta"));

		
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonModificarToolBarTipoPagoTarjeta.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoPagoTarjeta"));
					
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jMenuItemModificarTipoPagoTarjeta.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoPagoTarjeta"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonActualizarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"ActualizarTipoPagoTarjeta"));
		
		
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonActualizarToolBarTipoPagoTarjeta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoPagoTarjeta"));
						
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jMenuItemActualizarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoPagoTarjeta"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonEliminarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"EliminarTipoPagoTarjeta"));
		
		
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonEliminarToolBarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoPagoTarjeta"));
								
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jMenuItemEliminarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoPagoTarjeta"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonCancelarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"CancelarTipoPagoTarjeta"));
		
		
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonCancelarToolBarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoPagoTarjeta"));
					
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jMenuItemCancelarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoPagoTarjeta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jMenuItemDetalleCerrarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoPagoTarjeta"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonGuardarCambiosToolBarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPagoTarjeta"));
		
		
		
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonGuardarCambiosToolBarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPagoTarjeta"));
		
		
		
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jComboBoxTiposAccionesFormularioTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoPagoTarjeta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonidTipoPagoTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPagoTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonnombreTipoPagoTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPagoTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtondescripcionTipoPagoTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoPagoTarjetaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jTabbedPaneRelacionesTipoPagoTarjeta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoPagoTarjeta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoPagoTarjeta"));
		
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPagoTarjeta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoPagoTarjeta"));
		}
		
		this.jTableDatosTipoPagoTarjeta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoPagoTarjeta"));
		
		this.jTableDatosTipoPagoTarjeta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoPagoTarjeta"));
		
		this.jButtonNuevoTipoPagoTarjeta.addActionListener(new ButtonActionListener(this,"NuevoTipoPagoTarjeta"));
		
		this.jButtonDuplicarTipoPagoTarjeta.addActionListener(new ButtonActionListener(this,"DuplicarTipoPagoTarjeta"));
		
		this.jButtonCopiarTipoPagoTarjeta.addActionListener(new ButtonActionListener(this,"CopiarTipoPagoTarjeta"));
		
		this.jButtonVerFormTipoPagoTarjeta.addActionListener(new ButtonActionListener(this,"VerFormTipoPagoTarjeta"));
		
		
		this.jButtonNuevoToolBarTipoPagoTarjeta.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoPagoTarjeta"));
			
		this.jButtonDuplicarToolBarTipoPagoTarjeta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoPagoTarjeta"));
			
		this.jMenuItemNuevoTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoPagoTarjeta"));
			
		this.jMenuItemDuplicarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoPagoTarjeta"));		
		
		
		this.jButtonNuevoRelacionesTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoPagoTarjeta"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoPagoTarjeta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoPagoTarjeta"));
			
		this.jMenuItemNuevoRelacionesTipoPagoTarjeta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoPagoTarjeta"));		
		
		
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonModificarTipoPagoTarjeta.addActionListener(new ButtonActionListener(this,"ModificarTipoPagoTarjeta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonModificarToolBarTipoPagoTarjeta.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoPagoTarjeta"));
			
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jMenuItemModificarTipoPagoTarjeta.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoPagoTarjeta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonActualizarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"ActualizarTipoPagoTarjeta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonActualizarToolBarTipoPagoTarjeta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoPagoTarjeta"));
				
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jMenuItemActualizarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoPagoTarjeta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonEliminarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"EliminarTipoPagoTarjeta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonEliminarToolBarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoPagoTarjeta"));
						
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jMenuItemEliminarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoPagoTarjeta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonCancelarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"CancelarTipoPagoTarjeta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonCancelarToolBarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoPagoTarjeta"));
			
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jMenuItemCancelarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoPagoTarjeta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoPagoTarjeta"));		
		
		
		this.jButtonCerrarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"CerrarTipoPagoTarjeta"));
		
		
		this.jButtonCerrarToolBarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoPagoTarjeta"));
			
		this.jMenuItemCerrarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoPagoTarjeta"));
			
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jMenuItemDetalleCerrarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoPagoTarjeta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonGuardarCambiosTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoPagoTarjeta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonGuardarCambiosToolBarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPagoTarjeta"));
		}
		
		this.jButtonCopiarToolBarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoPagoTarjeta"));
			
		this.jButtonVerFormToolBarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoPagoTarjeta"));
		
		this.jMenuItemGuardarCambiosTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoPagoTarjeta"));
			
		this.jMenuItemCopiarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoPagoTarjeta"));		
		
		this.jMenuItemVerFormTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoPagoTarjeta"));		
		
		
		this.jButtonGuardarCambiosTablaTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoPagoTarjeta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoPagoTarjeta"));
			
		this.jMenuItemGuardarCambiosTablaTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoPagoTarjeta"));		
		
		
		
		this.jButtonRecargarInformacionTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoPagoTarjeta"));
					
		this.jButtonRecargarInformacionToolBarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoPagoTarjeta"));
		
		this.jMenuItemRecargarInformacionTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoPagoTarjeta"));		
		
		
		
		this.jButtonAnterioresTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"AnterioresTipoPagoTarjeta"));
		
		
		this.jButtonAnterioresToolBarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoPagoTarjeta"));
		
		this.jMenuItemAnterioresTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoPagoTarjeta"));		
		
		
		this.jButtonSiguientesTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"SiguientesTipoPagoTarjeta"));
		
		
		this.jButtonSiguientesToolBarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoPagoTarjeta"));
			
		this.jMenuItemSiguientesTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoPagoTarjeta"));
			
		this.jMenuItemAbrirOrderByTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoPagoTarjeta"));
			
		this.jMenuItemMostrarOcultarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoPagoTarjeta"));
			
		this.jMenuItemDetalleAbrirOrderByTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoPagoTarjeta"));
			
		this.jMenuItemDetalleMostarOcultarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoPagoTarjeta"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoPagoTarjeta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoPagoTarjeta"));
			
		this.jMenuItemNuevoGuardarCambiosTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoPagoTarjeta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoPagoTarjeta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoPagoTarjeta"));

		this.jCheckBoxSeleccionadosTipoPagoTarjeta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoPagoTarjeta"));
		
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jComboBoxTiposAccionesFormularioTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoPagoTarjeta"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoPagoTarjeta"));
			
		this.jComboBoxTiposAccionesTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoPagoTarjeta"));
					
		this.jComboBoxTiposSeleccionarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoPagoTarjeta"));
			
		this.jTextFieldValorCampoGeneralTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoPagoTarjeta"));		
		
		
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonidTipoPagoTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPagoTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonnombreTipoPagoTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPagoTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtondescripcionTipoPagoTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoPagoTarjetaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoPagoTarjeta!=null) {
				this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPagoTarjeta"));
				this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPagoTarjeta"));
				this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPagoTarjeta"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPagoTarjeta"));				
			//this.jButtonGenerarReporteDinamicoTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPagoTarjeta"));
			//this.jButtonGenerarExcelReporteDinamicoTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPagoTarjeta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoPagoTarjeta!=null) {
				this.jInternalFrameImportacionTipoPagoTarjeta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoPagoTarjeta"));
				this.jInternalFrameImportacionTipoPagoTarjeta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoPagoTarjeta"));
				this.jInternalFrameImportacionTipoPagoTarjeta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoPagoTarjeta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoPagoTarjeta"));
			
			this.jButtonAbrirOrderByToolBarTipoPagoTarjeta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoPagoTarjeta"));			
			
			if(this.jInternalFrameOrderByTipoPagoTarjeta!=null) {
				this.jInternalFrameOrderByTipoPagoTarjeta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoPagoTarjeta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPagoTarjeta.jTabbedPaneRelacionesTipoPagoTarjeta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoPagoTarjeta"));
		
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
            		closingInternalFrameTipoPagoTarjeta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoPagoTarjeta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoPagoTarjeta = (JInternalFrameBase)event.getSource();
	            	
	            TipoPagoTarjetaBeanSwingJInternalFrame jInternalFrameParent=(TipoPagoTarjetaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoPagoTarjeta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoPagoTarjetaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoPagoTarjeta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoPagoTarjetaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoPagoTarjeta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoPagoTarjeta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPagoTarjetaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPagoTarjetaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPagoTarjetaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoPagoTarjeta";
		inputMap = this.jButtonNuevoTipoPagoTarjeta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoPagoTarjeta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoPagoTarjetaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPagoTarjetaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPagoTarjetaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPagoTarjetaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoPagoTarjeta";
		inputMap = this.jButtonNuevoRelacionesTipoPagoTarjeta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoPagoTarjeta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoPagoTarjetaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoPagoTarjeta";
		inputMap = this.jButtonModificarTipoPagoTarjeta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoPagoTarjeta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoPagoTarjetaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoPagoTarjeta";
		inputMap = this.jButtonActualizarTipoPagoTarjeta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoPagoTarjeta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoPagoTarjetaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoPagoTarjeta";
		inputMap = this.jButtonEliminarTipoPagoTarjeta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoPagoTarjeta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoPagoTarjetaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoPagoTarjeta";
		inputMap = this.jButtonCancelarTipoPagoTarjeta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoPagoTarjeta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoPagoTarjetaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoPagoTarjeta";
		inputMap = this.jButtonCerrarTipoPagoTarjeta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoPagoTarjeta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoPagoTarjetaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonGuardarCambiosTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoPagoTarjeta";
		inputMap = this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonGuardarCambiosTipoPagoTarjeta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonGuardarCambiosTipoPagoTarjeta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoPagoTarjetaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoPagoTarjeta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoPagoTarjetaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoPagoTarjeta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoPagoTarjetaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoPagoTarjeta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoPagoTarjetaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoPagoTarjeta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoPagoTarjetaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonidTipoPagoTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPagoTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtonnombreTipoPagoTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPagoTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jButtondescripcionTipoPagoTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoPagoTarjetaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoPagoTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoPagoTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoPagoTarjetaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoPagoTarjeta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoPagoTarjeta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoPagoTarjeta tipopagotarjetaAux:this.tipopagotarjetaLogic.getTipoPagoTarjetas()) {
					tipopagotarjetaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPagoTarjeta tipopagotarjetaAux:tipopagotarjetas) {
					tipopagotarjetaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoPagoTarjetaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoPagoTarjeta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoPagoTarjeta tipopagotarjetaAux:this.tipopagotarjetaLogic.getTipoPagoTarjetas()) {
						tipopagotarjetaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPagoTarjeta tipopagotarjetaAux:tipopagotarjetas) {
						tipopagotarjetaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoPagoTarjeta tipopagotarjetaAux:this.tipopagotarjetaLogic.getTipoPagoTarjetas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPagoTarjeta tipopagotarjetaAux:tipopagotarjetas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoPagoTarjeta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoPagoTarjeta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoPagoTarjeta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoPagoTarjeta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoPagoTarjetaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoPagoTarjeta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoPagoTarjeta.getSelectedRows();
			
			TipoPagoTarjeta tipopagotarjetaLocal=new TipoPagoTarjeta();
			
			//this.seleccionarTodosTipoPagoTarjeta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipopagotarjetaLocal =(TipoPagoTarjeta) this.tipopagotarjetaLogic.getTipoPagoTarjetas().toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipopagotarjetaLocal =(TipoPagoTarjeta) this.tipopagotarjetas.toArray()[this.jTableDatosTipoPagoTarjeta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipopagotarjetaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoPagoTarjeta tipopagotarjetaAux:this.tipopagotarjetaLogic.getTipoPagoTarjetas()) {
						tipopagotarjetaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPagoTarjeta tipopagotarjetaAux:tipopagotarjetas) {
						tipopagotarjetaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoPagoTarjeta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoPagoTarjeta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoPagoTarjeta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoPagoTarjeta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoPagoTarjetaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoPagoTarjetaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoPagoTarjetaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoPagoTarjeta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoPagoTarjeta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoPagoTarjeta tipopagotarjetaAux:this.tipopagotarjetaLogic.getTipoPagoTarjetas()) {
				
						if(sTipoSeleccionar.equals(TipoPagoTarjetaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipopagotarjetaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoPagoTarjetaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipopagotarjetaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPagoTarjeta tipopagotarjetaAux:tipopagotarjetas) {
					
						if(sTipoSeleccionar.equals(TipoPagoTarjetaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipopagotarjetaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoPagoTarjetaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipopagotarjetaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoPagoTarjeta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoPagoTarjetaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoPagoTarjeta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoPagoTarjeta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoPagoTarjeta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoPagoTarjeta.jComboBoxTiposAccionesFormularioTipoPagoTarjeta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoPagoTarjeta) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoPagoTarjeta(conSplash);
				
					this.generarReporteTipoPagoTarjetasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPagoTarjeta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPagoTarjeta.jComboBoxTiposAccionesFormularioTipoPagoTarjeta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoPagoTarjetasSeleccionados();
				//this.jComboBoxTiposAccionesTipoPagoTarjeta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoPagoTarjetasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoPagoTarjeta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoPagoTarjetasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoPagoTarjeta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoPagoTarjeta();
				
				this.exportarTipoPagoTarjetasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPagoTarjeta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPagoTarjeta.jComboBoxTiposAccionesFormularioTipoPagoTarjeta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoPagoTarjetas();
				//this.importarTipoPagoTarjetas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPagoTarjeta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPagoTarjeta.jComboBoxTiposAccionesFormularioTipoPagoTarjeta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoPagoTarjeta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoPagoTarjetasSeleccionados();
				//this.jComboBoxTiposAccionesTipoPagoTarjeta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoPagoTarjeta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoPagoTarjeta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoPagoTarjeta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Pago",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPagoTarjeta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPagoTarjeta.jComboBoxTiposAccionesFormularioTipoPagoTarjeta.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoPagoTarjeta();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoPagoTarjeta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoPagoTarjetaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoPagoTarjeta();
			
			if(this.jInternalFrameDetalleFormTipoPagoTarjeta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoPagoTarjeta> tipopagotarjetasSeleccionados=new ArrayList<TipoPagoTarjeta>();		
			TipoPagoTarjeta tipopagotarjeta=new TipoPagoTarjeta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoPagoTarjeta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoPagoTarjeta.getSelectedItem();
			
			
			
			
			tipopagotarjetasSeleccionados=this.getTipoPagoTarjetasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipopagotarjetasSeleccionados.size()==1) {
				for(TipoPagoTarjeta tipopagotarjetaAux:tipopagotarjetasSeleccionados) {
					tipopagotarjeta=tipopagotarjetaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Forma Pago")) {
					jButtonFormaPagoPuntoVentaActionPerformed(null,rowIndex,true,false,tipopagotarjeta);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoPagoTarjeta();
			
      		//this.finishProcessTipoPagoTarjeta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoPagoTarjetaReturnGeneral() throws Exception {
		if(this.tipopagotarjetaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipopagotarjetaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipopagotarjetaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipopagotarjetaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipopagotarjetaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipopagotarjetaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoPagoTarjeta(false);
		}
		
		if(this.tipopagotarjetaReturnGeneral.getConRetornoLista() || this.tipopagotarjetaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipopagotarjetaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipopagotarjetaLogic.setTipoPagoTarjetas(this.tipopagotarjetaReturnGeneral.getTipoPagoTarjetas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipopagotarjetaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipopagotarjetaLogic.setTipoPagoTarjeta(this.tipopagotarjetaReturnGeneral.getTipoPagoTarjeta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoPagoTarjeta(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoPagoTarjeta() throws Exception {
		
		
	}
	
	public ArrayList<TipoPagoTarjeta> getTipoPagoTarjetasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoPagoTarjeta> tipopagotarjetasSeleccionados=new ArrayList<TipoPagoTarjeta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoPagoTarjeta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoPagoTarjeta tipopagotarjetaAux:tipopagotarjetaLogic.getTipoPagoTarjetas()) {
					if(tipopagotarjetaAux.getIsSelected()) {
						tipopagotarjetasSeleccionados.add(tipopagotarjetaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPagoTarjeta tipopagotarjetaAux:this.tipopagotarjetas) {
					if(tipopagotarjetaAux.getIsSelected()) {
						tipopagotarjetasSeleccionados.add(tipopagotarjetaAux);				
					}
				}
			}
			
			if(tipopagotarjetasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipopagotarjetasSeleccionados.addAll(this.tipopagotarjetaLogic.getTipoPagoTarjetas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipopagotarjetasSeleccionados.addAll(this.tipopagotarjetas);				
					}
				}
			}
		} else {
			tipopagotarjetasSeleccionados.add(this.tipopagotarjeta);
		}
		
		return tipopagotarjetasSeleccionados;
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
	
	public void generarReporteTipoPagoTarjetasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoPagoTarjetasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoPagoTarjetasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoPagoTarjetasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoPagoTarjetasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoPagoTarjetasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoPagoTarjetasSeleccionados() throws Exception {
		ArrayList<TipoPagoTarjeta> tipopagotarjetasSeleccionados=new ArrayList<TipoPagoTarjeta>();		
		
		tipopagotarjetasSeleccionados=this.getTipoPagoTarjetasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoPagoTarjetas("Todos",tipopagotarjetasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoPagoTarjetasSeleccionados() throws Exception {
		ArrayList<TipoPagoTarjeta> tipopagotarjetasSeleccionados=new ArrayList<TipoPagoTarjeta>();		
		
		tipopagotarjetasSeleccionados=this.getTipoPagoTarjetasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoPagoTarjetas("Todos",tipopagotarjetasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoPagoTarjetasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoPagoTarjeta> tipopagotarjetasSeleccionados=new ArrayList<TipoPagoTarjeta>();
		
		tipopagotarjetasSeleccionados=this.getTipoPagoTarjetasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoPagoTarjetas("Todos",tipopagotarjetasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoPagoTarjetasSeleccionados() throws Exception {
		ArrayList<TipoPagoTarjeta> tipopagotarjetasSeleccionados=new ArrayList<TipoPagoTarjeta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoPagoTarjeta();
		
		
		tipopagotarjetasSeleccionados=this.getTipoPagoTarjetasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoPagoTarjeta();
		
		
		//this.generarReporteTipoPagoTarjetas("Todos",tipopagotarjetasSeleccionados ,tipopagotarjetaImplementable,tipopagotarjetaImplementableHome);
	}
	
	public void mostrarImportacionTipoPagoTarjetas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoPagoTarjeta();
		
		this.abrirFrameImportacionTipoPagoTarjeta();		
		
			
		//this.generarReporteTipoPagoTarjetas("Todos",tipopagotarjetasSeleccionados ,tipopagotarjetaImplementable,tipopagotarjetaImplementableHome);
	}
	
	public void importarTipoPagoTarjetas() throws Exception {		
	
	}
	
	public void exportarTipoPagoTarjetasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoPagoTarjetasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoPagoTarjetasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoPagoTarjetasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoPagoTarjetasSeleccionados() throws Exception {
		ArrayList<TipoPagoTarjeta> tipopagotarjetasSeleccionados=new ArrayList<TipoPagoTarjeta>();		
		
		tipopagotarjetasSeleccionados=this.getTipoPagoTarjetasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopagotarjeta."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoPagoTarjeta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoPagoTarjeta tipopagotarjetaAux:tipopagotarjetasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoPagoTarjeta(tipopagotarjetaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipopagotarjetaAux.setsDetalleGeneralEntityReporte(tipopagotarjetaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoPagoTarjeta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoPagoTarjetaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPagoTarjetaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPagoTarjetaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPagoTarjetaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoPagoTarjeta(TipoPagoTarjeta tipopagotarjeta,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipopagotarjeta.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipopagotarjeta.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipopagotarjeta.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipopagotarjeta.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoPagoTarjetasSeleccionados() throws Exception {
		ArrayList<TipoPagoTarjeta> tipopagotarjetasSeleccionados=new ArrayList<TipoPagoTarjeta>();		
		
		tipopagotarjetasSeleccionados=this.getTipoPagoTarjetasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopagotarjeta.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoPagoTarjetas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoPagoTarjeta(row);				
				iRow++;
			}				
			
			for(TipoPagoTarjeta tipopagotarjetaAux:tipopagotarjetasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoPagoTarjeta(tipopagotarjetaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoPagoTarjetasSeleccionados() throws Exception {
		ArrayList<TipoPagoTarjeta> tipopagotarjetasSeleccionados=new ArrayList<TipoPagoTarjeta>();		
		
		tipopagotarjetasSeleccionados=this.getTipoPagoTarjetasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopagotarjeta.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipopagotarjetas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipopagotarjeta");
			//elementRoot.appendChild(element);
		
			for(TipoPagoTarjeta tipopagotarjetaAux:tipopagotarjetasSeleccionados) {
				element = document.createElement("tipopagotarjeta");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoPagoTarjeta(tipopagotarjetaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoPagoTarjeta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPagoTarjetaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPagoTarjetaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoPagoTarjetaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPagoTarjetaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoPagoTarjeta(TipoPagoTarjeta tipopagotarjeta,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipopagotarjeta.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipopagotarjeta.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipopagotarjeta.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlTipoPagoTarjeta(TipoPagoTarjeta tipopagotarjeta,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoPagoTarjetaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipopagotarjeta.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoPagoTarjetaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipopagotarjeta.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoPagoTarjetaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipopagotarjeta.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(TipoPagoTarjetaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(tipopagotarjeta.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoTipoPagoTarjetasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoPagoTarjeta> tipopagotarjetasSeleccionados=new ArrayList<TipoPagoTarjeta>();
		
		tipopagotarjetasSeleccionados=this.getTipoPagoTarjetasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoPagoTarjeta(tipopagotarjetasSeleccionados);
		
		this.generarReporteTipoPagoTarjetas("Todos",tipopagotarjetasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoPagoTarjeta(ArrayList<TipoPagoTarjeta> tipopagotarjetasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoPagoTarjeta tipopagotarjetaAux:tipopagotarjetasSeleccionados) {
				tipopagotarjetaAux.setsDetalleGeneralEntityReporte(tipopagotarjetaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoPagoTarjetaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipopagotarjetaAux.setsDescripcionGeneralEntityReporte1(tipopagotarjetaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoPagoTarjetaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					tipopagotarjetaAux.setsDescripcionGeneralEntityReporte1(tipopagotarjetaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPagoTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoPagoTarjeta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoPagoTarjeta=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta=true;
				this.isVisibilidadCeldaGuardarCambiosTipoPagoTarjeta=true;
			}
			
			this.isVisibilidadCeldaModificarTipoPagoTarjeta=false;
			this.isVisibilidadCeldaActualizarTipoPagoTarjeta=false;
			this.isVisibilidadCeldaEliminarTipoPagoTarjeta=false;
			this.isVisibilidadCeldaCancelarTipoPagoTarjeta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPagoTarjeta=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPagoTarjeta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoPagoTarjeta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPagoTarjeta=false;
			this.isVisibilidadCeldaModificarTipoPagoTarjeta=false;
			this.isVisibilidadCeldaActualizarTipoPagoTarjeta=true;
			this.isVisibilidadCeldaEliminarTipoPagoTarjeta=false;
			this.isVisibilidadCeldaCancelarTipoPagoTarjeta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPagoTarjeta=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPagoTarjeta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoPagoTarjeta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPagoTarjeta=false;
			this.isVisibilidadCeldaModificarTipoPagoTarjeta=false;
			this.isVisibilidadCeldaActualizarTipoPagoTarjeta=true;
			this.isVisibilidadCeldaEliminarTipoPagoTarjeta=true;
			this.isVisibilidadCeldaCancelarTipoPagoTarjeta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPagoTarjeta=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPagoTarjeta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoPagoTarjeta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPagoTarjeta=false;
			this.isVisibilidadCeldaModificarTipoPagoTarjeta=false;
			this.isVisibilidadCeldaActualizarTipoPagoTarjeta=true;
			this.isVisibilidadCeldaEliminarTipoPagoTarjeta=false;
			this.isVisibilidadCeldaCancelarTipoPagoTarjeta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPagoTarjeta=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPagoTarjeta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoPagoTarjeta=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta=true;
			this.isVisibilidadCeldaGuardarCambiosTipoPagoTarjeta=true;
			this.isVisibilidadCeldaModificarTipoPagoTarjeta=false;
			this.isVisibilidadCeldaActualizarTipoPagoTarjeta=false;
			this.isVisibilidadCeldaEliminarTipoPagoTarjeta=false;
			this.isVisibilidadCeldaCancelarTipoPagoTarjeta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPagoTarjeta=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPagoTarjeta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoPagoTarjeta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPagoTarjeta=false;
			this.isVisibilidadCeldaActualizarTipoPagoTarjeta=false;
			this.isVisibilidadCeldaEliminarTipoPagoTarjeta=false;
			this.isVisibilidadCeldaCancelarTipoPagoTarjeta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPagoTarjeta=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPagoTarjeta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoPagoTarjeta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPagoTarjeta=false;
			this.isVisibilidadCeldaModificarTipoPagoTarjeta=true;
			this.isVisibilidadCeldaActualizarTipoPagoTarjeta=false;
			this.isVisibilidadCeldaEliminarTipoPagoTarjeta=false;
			this.isVisibilidadCeldaCancelarTipoPagoTarjeta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPagoTarjeta=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPagoTarjeta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoPagoTarjetaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoPagoTarjeta=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta=true;
			this.isVisibilidadCeldaGuardarCambiosTipoPagoTarjeta=true;
		} else {
			this.actualizarEstadoPanelsTipoPagoTarjeta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoPagoTarjeta=false;
			//this.isVisibilidadCeldaVerFormTipoPagoTarjeta=false;
			this.isVisibilidadCeldaDuplicarTipoPagoTarjeta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipopagotarjetaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoPagoTarjeta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPagoTarjeta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
			if(!tipopagotarjetaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta=false;												
			}
			
			this.jButtonCerrarTipoPagoTarjeta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoPagoTarjeta=false;
		}
		
		if(!this.permiteMantenimiento(this.tipopagotarjeta)) {
			this.isVisibilidadCeldaActualizarTipoPagoTarjeta=false;
			this.isVisibilidadCeldaEliminarTipoPagoTarjeta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoPagoTarjeta() {
		this.isVisibilidadCeldaNuevoTipoPagoTarjeta=false;
		this.isVisibilidadCeldaGuardarCambiosTipoPagoTarjeta=false;
	}
	
	public void actualizarEstadoPanelsTipoPagoTarjeta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoPagoTarjeta!=null) {
				this.jScrollPanelDatosEdicionTipoPagoTarjeta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoPagoTarjeta!=null) {
				this.jScrollPanelDatosTipoPagoTarjeta.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPagoTarjeta!=null) {
				this.jPanelPaginacionTipoPagoTarjeta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPagoTarjeta!=null) {
				this.jPanelParametrosReportesTipoPagoTarjeta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoPagoTarjeta!=null) {
				this.jScrollPanelDatosEdicionTipoPagoTarjeta.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoPagoTarjeta!=null) {
				this.jScrollPanelDatosTipoPagoTarjeta.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPagoTarjeta!=null) {
				this.jPanelPaginacionTipoPagoTarjeta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPagoTarjeta!=null) {
				this.jPanelParametrosReportesTipoPagoTarjeta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoPagoTarjeta!=null) {
				this.jScrollPanelDatosEdicionTipoPagoTarjeta.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoPagoTarjeta!=null) {
				this.jScrollPanelDatosTipoPagoTarjeta.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPagoTarjeta!=null) {
				this.jPanelPaginacionTipoPagoTarjeta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPagoTarjeta!=null) {
				this.jPanelParametrosReportesTipoPagoTarjeta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoPagoTarjeta!=null) {
				this.jScrollPanelDatosEdicionTipoPagoTarjeta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPagoTarjeta!=null) {
				this.jScrollPanelDatosTipoPagoTarjeta.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPagoTarjeta!=null) {
				this.jPanelPaginacionTipoPagoTarjeta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPagoTarjeta!=null) {
				this.jPanelParametrosReportesTipoPagoTarjeta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoPagoTarjeta!=null) {
				this.jScrollPanelDatosEdicionTipoPagoTarjeta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoPagoTarjeta!=null) {
				this.jScrollPanelDatosTipoPagoTarjeta.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPagoTarjeta!=null) {
				this.jPanelPaginacionTipoPagoTarjeta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPagoTarjeta!=null) {
				this.jPanelParametrosReportesTipoPagoTarjeta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoPagoTarjeta!=null) {
				this.jScrollPanelDatosEdicionTipoPagoTarjeta.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoPagoTarjeta!=null) {
				this.jScrollPanelDatosTipoPagoTarjeta.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPagoTarjeta!=null) {
				this.jPanelPaginacionTipoPagoTarjeta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPagoTarjeta!=null) {
				this.jPanelParametrosReportesTipoPagoTarjeta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoPagoTarjeta!=null) {
				this.jScrollPanelDatosEdicionTipoPagoTarjeta.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoPagoTarjeta!=null) {
				this.jScrollPanelDatosTipoPagoTarjeta.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPagoTarjeta!=null) {
				this.jPanelPaginacionTipoPagoTarjeta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPagoTarjeta!=null) {
				this.jPanelParametrosReportesTipoPagoTarjeta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoPagoTarjetaParaFormaPagoPuntoVentaes() throws Exception {
		Boolean isPaginaPopupFormaPagoPuntoVenta=false;

		try {

			if(this.tipopagotarjetaSessionBean==null) {
				this.tipopagotarjetaSessionBean=new TipoPagoTarjetaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaSessionBean=new FormaPagoPuntoVentaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaSessionBean.setsPathNavegacionActual(tipopagotarjetaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFormaPagoPuntoVenta=this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta(true);
			this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta(TipoPagoTarjetaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionTipoPagoTarjeta(true);
			this.jInternalFrameDetalleFormTipoPagoTarjeta.formapagopuntoventaSessionBean.setlidTipoPagoTarjetaActual(this.idTipoPagoTarjetaActual);

			tipopagotarjetaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoPagoTarjeta(true);
			tipopagotarjetaSessionBean.setlIdTipoPagoTarjetaActualForeignKey(this.idTipoPagoTarjetaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoPagoTarjetaSessionBean tipopagotarjetaSessionBean=new TipoPagoTarjetaSessionBean();
		
		if(this.tipopagotarjetaSessionBean==null) {
			this.tipopagotarjetaSessionBean=new TipoPagoTarjetaSessionBean();
		}
		
		this.tipopagotarjetaSessionBean.setsUltimaBusquedaTipoPagoTarjeta(this.getsAccionBusqueda());
		this.tipopagotarjetaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipopagotarjetaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoPagoTarjetaSessionBean tipopagotarjetaSessionBean=new TipoPagoTarjetaSessionBean();
		
		if(this.tipopagotarjetaSessionBean==null) {
			this.tipopagotarjetaSessionBean=new TipoPagoTarjetaSessionBean();
		}
		
		if(this.tipopagotarjetaSessionBean.getsUltimaBusquedaTipoPagoTarjeta()!=null&&!this.tipopagotarjetaSessionBean.getsUltimaBusquedaTipoPagoTarjeta().equals("")) {
			this.setsAccionBusqueda(tipopagotarjetaSessionBean.getsUltimaBusquedaTipoPagoTarjeta());
			this.setiNumeroPaginacion(tipopagotarjetaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipopagotarjetaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipopagotarjetaSessionBean.setsUltimaBusquedaTipoPagoTarjeta("");
		this.tipopagotarjetaSessionBean.setiNumeroPaginacion(TipoPagoTarjetaConstantesFunciones.INUMEROPAGINACION);
		this.tipopagotarjetaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoPagoTarjeta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoPagoTarjeta() {
		this.updateBorderResaltarBusquedasFormularioTipoPagoTarjeta();
		this.updateVisibilidadBusquedasFormularioTipoPagoTarjeta();
		this.updateHabilitarBusquedasFormularioTipoPagoTarjeta();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoPagoTarjeta() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoPagoTarjeta() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoPagoTarjeta() {
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
	
	public void updateControlesFormularioTipoPagoTarjeta() throws Exception {

		if(this.jInternalFrameDetalleFormTipoPagoTarjeta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoPagoTarjeta();
		this.updateVisibilidadResaltarControlesFormularioTipoPagoTarjeta();
		this.updateHabilitarResaltarControlesFormularioTipoPagoTarjeta();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoPagoTarjeta() throws Exception {
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipopagotarjetaConstantesFunciones.resaltaridTipoPagoTarjeta!=null && this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) {this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextFieldidTipoPagoTarjeta.setBorder(this.tipopagotarjetaConstantesFunciones.resaltaridTipoPagoTarjeta);}
		if(this.tipopagotarjetaConstantesFunciones.resaltarnombreTipoPagoTarjeta!=null && this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) {this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextAreanombreTipoPagoTarjeta.setBorder(this.tipopagotarjetaConstantesFunciones.resaltarnombreTipoPagoTarjeta);}
		if(this.tipopagotarjetaConstantesFunciones.resaltardescripcionTipoPagoTarjeta!=null && this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) {this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextAreadescripcionTipoPagoTarjeta.setBorder(this.tipopagotarjetaConstantesFunciones.resaltardescripcionTipoPagoTarjeta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoPagoTarjeta() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) {
	
		//this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextFieldidTipoPagoTarjeta.setVisible(this.tipopagotarjetaConstantesFunciones.mostraridTipoPagoTarjeta);
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jPanelidTipoPagoTarjeta.setVisible(this.tipopagotarjetaConstantesFunciones.mostraridTipoPagoTarjeta);
		//this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextAreanombreTipoPagoTarjeta.setVisible(this.tipopagotarjetaConstantesFunciones.mostrarnombreTipoPagoTarjeta);
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jPanelnombreTipoPagoTarjeta.setVisible(this.tipopagotarjetaConstantesFunciones.mostrarnombreTipoPagoTarjeta);
		//this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextAreadescripcionTipoPagoTarjeta.setVisible(this.tipopagotarjetaConstantesFunciones.mostrardescripcionTipoPagoTarjeta);
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jPaneldescripcionTipoPagoTarjeta.setVisible(this.tipopagotarjetaConstantesFunciones.mostrardescripcionTipoPagoTarjeta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoPagoTarjeta() throws Exception {
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoPagoTarjeta!=null) {
	
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextFieldidTipoPagoTarjeta.setEnabled(this.tipopagotarjetaConstantesFunciones.activaridTipoPagoTarjeta);
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextAreanombreTipoPagoTarjeta.setEnabled(this.tipopagotarjetaConstantesFunciones.activarnombreTipoPagoTarjeta);
		this.jInternalFrameDetalleFormTipoPagoTarjeta.jTextAreadescripcionTipoPagoTarjeta.setEnabled(this.tipopagotarjetaConstantesFunciones.activardescripcionTipoPagoTarjeta);
		}
	}
	
		
}