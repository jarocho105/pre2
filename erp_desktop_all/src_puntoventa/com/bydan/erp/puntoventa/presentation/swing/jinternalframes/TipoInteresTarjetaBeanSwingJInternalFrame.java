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

import com.bydan.erp.puntoventa.util.TipoInteresTarjetaConstantesFunciones;
import com.bydan.erp.puntoventa.util.TipoInteresTarjetaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.TipoInteresTarjetaParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.TipoInteresTarjetaBean;
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
public class TipoInteresTarjetaBeanSwingJInternalFrame extends TipoInteresTarjetaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoInteresTarjetaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoInteresTarjeta> tipointerestarjetaValidator = new ClassValidator<TipoInteresTarjeta>(TipoInteresTarjeta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoInteresTarjeta tipointerestarjeta;	
	public TipoInteresTarjeta tipointerestarjetaAux;
	public TipoInteresTarjeta tipointerestarjetaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoInteresTarjeta tipointerestarjetaTotales;
	public Long idTipoInteresTarjetaActual;
	public Long iIdNuevoTipoInteresTarjeta=0L;
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
	
	public Boolean isPermisoTodoTipoInteresTarjeta;
	public Boolean isPermisoNuevoTipoInteresTarjeta;
	public Boolean isPermisoActualizarTipoInteresTarjeta;
	public Boolean isPermisoActualizarOriginalTipoInteresTarjeta;
	public Boolean isPermisoEliminarTipoInteresTarjeta;
	public Boolean isPermisoGuardarCambiosTipoInteresTarjeta;
	public Boolean isPermisoConsultaTipoInteresTarjeta;
	public Boolean isPermisoBusquedaTipoInteresTarjeta;
	public Boolean isPermisoReporteTipoInteresTarjeta;
	public Boolean isPermisoPaginacionMedioTipoInteresTarjeta;
	public Boolean isPermisoPaginacionAltoTipoInteresTarjeta;
	public Boolean isPermisoPaginacionTodoTipoInteresTarjeta;
	public Boolean isPermisoCopiarTipoInteresTarjeta;
	public Boolean isPermisoVerFormTipoInteresTarjeta;
	public Boolean isPermisoDuplicarTipoInteresTarjeta;
	public Boolean isPermisoOrdenTipoInteresTarjeta;
	
	
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
	
	public TipoInteresTarjetaParameterReturnGeneral tipointerestarjetaReturnGeneral;
	public TipoInteresTarjetaParameterReturnGeneral tipointerestarjetaParameterGeneral;
	
	

	public FormaPagoPuntoVentaLogic formapagopuntoventaLogic=null;

	public FormaPagoPuntoVentaLogic getFormaPagoPuntoVentaLogic() {
		return formapagopuntoventaLogic;
	}

	public void setFormaPagoPuntoVentaLogic(FormaPagoPuntoVentaLogic formapagopuntoventaLogic) {
		this.formapagopuntoventaLogic = formapagopuntoventaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoInteresTarjeta=false;
	public Boolean esParaAccionDesdeFormularioTipoInteresTarjeta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoInteresTarjetaLogic tipointerestarjetaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoInteresTarjeta tipointerestarjetaBean;
	public TipoInteresTarjetaConstantesFunciones tipointerestarjetaConstantesFunciones;
	//public TipoInteresTarjetaParameterReturnGeneral tipointerestarjetaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoInteresTarjeta> tipointerestarjetas;	
	//public List<TipoInteresTarjeta> tipointerestarjetasEliminados;
	//public List<TipoInteresTarjeta> tipointerestarjetasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoInteresTarjeta=false;
	public Boolean isVisibilidadCeldaDuplicarTipoInteresTarjeta=true;
	public Boolean isVisibilidadCeldaCopiarTipoInteresTarjeta=true;
	public Boolean isVisibilidadCeldaVerFormTipoInteresTarjeta=true;
	public Boolean isVisibilidadCeldaOrdenTipoInteresTarjeta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta=false;
	public Boolean isVisibilidadCeldaModificarTipoInteresTarjeta=false;
	public Boolean isVisibilidadCeldaActualizarTipoInteresTarjeta=false;
	public Boolean isVisibilidadCeldaEliminarTipoInteresTarjeta=false;
	public Boolean isVisibilidadCeldaCancelarTipoInteresTarjeta=false;
	public Boolean isVisibilidadCeldaGuardarTipoInteresTarjeta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoInteresTarjeta=false;	
	
	
	
	public Long getiIdNuevoTipoInteresTarjeta() {
		return this.iIdNuevoTipoInteresTarjeta;
	}

	public void setiIdNuevoTipoInteresTarjeta(Long iIdNuevoTipoInteresTarjeta) {
		this.iIdNuevoTipoInteresTarjeta = iIdNuevoTipoInteresTarjeta;
	}
	
	public Long getidTipoInteresTarjetaActual() {
		return this.idTipoInteresTarjetaActual;
	}

	public void setidTipoInteresTarjetaActual(Long idTipoInteresTarjetaActual) {
		this.idTipoInteresTarjetaActual = idTipoInteresTarjetaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoInteresTarjeta gettipointerestarjeta() {
		return this.tipointerestarjeta;
	}

	public void settipointerestarjeta(TipoInteresTarjeta tipointerestarjeta) {
		this.tipointerestarjeta = tipointerestarjeta;
	}
	
	public TipoInteresTarjeta gettipointerestarjetaAux() {
		return this.tipointerestarjetaAux;
	}

	public void settipointerestarjetaAux(TipoInteresTarjeta tipointerestarjetaAux) {
		this.tipointerestarjetaAux = tipointerestarjetaAux;
	}				
	
	public TipoInteresTarjeta gettipointerestarjetaAnterior() {
		return this.tipointerestarjetaAnterior;
	}

	public void settipointerestarjetaAnterior(TipoInteresTarjeta tipointerestarjetaAnterior) {
		this.tipointerestarjetaAnterior = tipointerestarjetaAnterior;
	}	
	
	public TipoInteresTarjeta gettipointerestarjetaTotales() {
		return this.tipointerestarjetaTotales;
	}

	public void settipointerestarjetaTotales(TipoInteresTarjeta tipointerestarjetaTotales) {
		this.tipointerestarjetaTotales = tipointerestarjetaTotales;
	}	
	
	public TipoInteresTarjeta gettipointerestarjetaBean() {
		return this.tipointerestarjetaBean;
	}

	public void settipointerestarjetaBean(TipoInteresTarjeta tipointerestarjetaBean) {
		this.tipointerestarjetaBean = tipointerestarjetaBean;
	}	
	
	public TipoInteresTarjetaParameterReturnGeneral gettipointerestarjetaReturnGeneral() {
		return this.tipointerestarjetaReturnGeneral;
	}

	public void settipointerestarjetaReturnGeneral(TipoInteresTarjetaParameterReturnGeneral tipointerestarjetaReturnGeneral) {
		this.tipointerestarjetaReturnGeneral = tipointerestarjetaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoInteresTarjetaLogic getTipoInteresTarjetaLogic()	{		
		return tipointerestarjetaLogic;
	}

	public void setTipoInteresTarjetaLogic(TipoInteresTarjetaLogic tipointerestarjetaLogic) {
		this.tipointerestarjetaLogic = tipointerestarjetaLogic;
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
	
	public Boolean getIsEsNuevoTipoInteresTarjeta() {
		return isEsNuevoTipoInteresTarjeta;
	}

	public void setIsEsNuevoTipoInteresTarjeta(Boolean isEsNuevoTipoInteresTarjeta) {
		this.isEsNuevoTipoInteresTarjeta = isEsNuevoTipoInteresTarjeta;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoInteresTarjeta() {
		return esParaAccionDesdeFormularioTipoInteresTarjeta;
	}
	
	public void setEsParaAccionDesdeFormularioTipoInteresTarjeta(Boolean esParaAccionDesdeFormularioTipoInteresTarjeta) {
		this.esParaAccionDesdeFormularioTipoInteresTarjeta = esParaAccionDesdeFormularioTipoInteresTarjeta;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoInteresTarjeta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoInteresTarjetaConstantesFunciones.refrescarForeignKeysDescripcionesTipoInteresTarjeta(this.tipointerestarjetaLogic.getTipoInteresTarjetas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoInteresTarjetaConstantesFunciones.refrescarForeignKeysDescripcionesTipoInteresTarjeta(this.tipointerestarjetas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipointerestarjetaLogic.setTipoInteresTarjetas(this.tipointerestarjetas);
			tipointerestarjetaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoInteresTarjetaParameterReturnGeneral getTipoInteresTarjetaParameterGeneral() {
		return this.tipointerestarjetaParameterGeneral;
	}
	
	public void setTipoInteresTarjetaParameterGeneral(TipoInteresTarjetaParameterReturnGeneral tipointerestarjetaParameterGeneral) {
		this.tipointerestarjetaParameterGeneral = tipointerestarjetaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoInteresTarjeta() {
		return isPermisoTodoTipoInteresTarjeta;
	}

	public void setIsPermisoTodoTipoInteresTarjeta(Boolean isPermisoTodoTipoInteresTarjeta) {
		this.isPermisoTodoTipoInteresTarjeta = isPermisoTodoTipoInteresTarjeta;
	}

	public Boolean getIsPermisoNuevoTipoInteresTarjeta() {
		return isPermisoNuevoTipoInteresTarjeta;
	}

	public void setIsPermisoNuevoTipoInteresTarjeta(Boolean isPermisoNuevoTipoInteresTarjeta) {
		this.isPermisoNuevoTipoInteresTarjeta = isPermisoNuevoTipoInteresTarjeta;
	}

	public Boolean getIsPermisoActualizarTipoInteresTarjeta() {
		return isPermisoActualizarTipoInteresTarjeta;
	}

	public void setIsPermisoActualizarTipoInteresTarjeta(Boolean isPermisoActualizarTipoInteresTarjeta) {
		this.isPermisoActualizarTipoInteresTarjeta = isPermisoActualizarTipoInteresTarjeta;
	}

	public Boolean getIsPermisoEliminarTipoInteresTarjeta() {
		return isPermisoEliminarTipoInteresTarjeta;
	}

	public void setIsPermisoEliminarTipoInteresTarjeta(Boolean isPermisoEliminarTipoInteresTarjeta) {
		this.isPermisoEliminarTipoInteresTarjeta = isPermisoEliminarTipoInteresTarjeta;
	}

	public Boolean getIsPermisoGuardarCambiosTipoInteresTarjeta() {
		return isPermisoGuardarCambiosTipoInteresTarjeta;
	}

	public void setIsPermisoGuardarCambiosTipoInteresTarjeta(Boolean isPermisoGuardarCambiosTipoInteresTarjeta) {
		this.isPermisoGuardarCambiosTipoInteresTarjeta = isPermisoGuardarCambiosTipoInteresTarjeta;
	}
	
	public Boolean getIsPermisoConsultaTipoInteresTarjeta() {
		return isPermisoConsultaTipoInteresTarjeta;
	}

	public void setIsPermisoConsultaTipoInteresTarjeta(Boolean isPermisoConsultaTipoInteresTarjeta) {
		this.isPermisoConsultaTipoInteresTarjeta = isPermisoConsultaTipoInteresTarjeta;
	}

	public Boolean getIsPermisoBusquedaTipoInteresTarjeta() {
		return isPermisoBusquedaTipoInteresTarjeta;
	}

	public void setIsPermisoBusquedaTipoInteresTarjeta(Boolean isPermisoBusquedaTipoInteresTarjeta) {
		this.isPermisoBusquedaTipoInteresTarjeta = isPermisoBusquedaTipoInteresTarjeta;
	}

	public Boolean getIsPermisoReporteTipoInteresTarjeta() {
		return isPermisoReporteTipoInteresTarjeta;
	}

	public void setIsPermisoReporteTipoInteresTarjeta(Boolean isPermisoReporteTipoInteresTarjeta) {
		this.isPermisoReporteTipoInteresTarjeta = isPermisoReporteTipoInteresTarjeta;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoInteresTarjeta() {
		return isPermisoPaginacionMedioTipoInteresTarjeta;
	}

	public void setIsPermisoPaginacionMedioTipoInteresTarjeta(Boolean isPermisoPaginacionMedioTipoInteresTarjeta) {
		this.isPermisoPaginacionMedioTipoInteresTarjeta = isPermisoPaginacionMedioTipoInteresTarjeta;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoInteresTarjeta() {
		return isPermisoPaginacionTodoTipoInteresTarjeta;
	}

	public void setIsPermisoPaginacionTodoTipoInteresTarjeta(Boolean isPermisoPaginacionTodoTipoInteresTarjeta) {
		this.isPermisoPaginacionTodoTipoInteresTarjeta = isPermisoPaginacionTodoTipoInteresTarjeta;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoInteresTarjeta() {
		return isPermisoPaginacionAltoTipoInteresTarjeta;
	}

	public void setIsPermisoPaginacionAltoTipoInteresTarjeta(Boolean isPermisoPaginacionAltoTipoInteresTarjeta) {
		this.isPermisoPaginacionAltoTipoInteresTarjeta = isPermisoPaginacionAltoTipoInteresTarjeta;
	}
	
	public Boolean getIsPermisoCopiarTipoInteresTarjeta() {
		return isPermisoCopiarTipoInteresTarjeta;
	}

	public void setIsPermisoCopiarTipoInteresTarjeta(Boolean isPermisoCopiarTipoInteresTarjeta) {
		this.isPermisoCopiarTipoInteresTarjeta = isPermisoCopiarTipoInteresTarjeta;
	}
	
	public Boolean getIsPermisoVerFormTipoInteresTarjeta() {
		return isPermisoVerFormTipoInteresTarjeta;
	}

	public void setIsPermisoVerFormTipoInteresTarjeta(Boolean isPermisoVerFormTipoInteresTarjeta) {
		this.isPermisoVerFormTipoInteresTarjeta = isPermisoVerFormTipoInteresTarjeta;
	}
	
	public Boolean getIsPermisoDuplicarTipoInteresTarjeta() {
		return isPermisoDuplicarTipoInteresTarjeta;
	}

	public void setIsPermisoDuplicarTipoInteresTarjeta(Boolean isPermisoDuplicarTipoInteresTarjeta) {
		this.isPermisoDuplicarTipoInteresTarjeta = isPermisoDuplicarTipoInteresTarjeta;
	}
	
	public Boolean getIsPermisoOrdenTipoInteresTarjeta() {
		return isPermisoOrdenTipoInteresTarjeta;
	}

	public void setIsPermisoOrdenTipoInteresTarjeta(Boolean isPermisoOrdenTipoInteresTarjeta) {
		this.isPermisoOrdenTipoInteresTarjeta = isPermisoOrdenTipoInteresTarjeta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoInteresTarjeta() {
		return isVisibilidadCeldaNuevoTipoInteresTarjeta;
	}

	public void setIsVisibilidadCeldaNuevoTipoInteresTarjeta(Boolean isVisibilidadCeldaNuevoTipoInteresTarjeta) {
		this.isVisibilidadCeldaNuevoTipoInteresTarjeta = isVisibilidadCeldaNuevoTipoInteresTarjeta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoInteresTarjeta() {
		return isVisibilidadCeldaDuplicarTipoInteresTarjeta;
	}

	public void setIsVisibilidadCeldaDuplicarTipoInteresTarjeta(Boolean isVisibilidadCeldaDuplicarTipoInteresTarjeta) {
		this.isVisibilidadCeldaDuplicarTipoInteresTarjeta = isVisibilidadCeldaDuplicarTipoInteresTarjeta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoInteresTarjeta() {
		return isVisibilidadCeldaCopiarTipoInteresTarjeta;
	}

	public void setIsVisibilidadCeldaCopiarTipoInteresTarjeta(Boolean isVisibilidadCeldaCopiarTipoInteresTarjeta) {
		this.isVisibilidadCeldaCopiarTipoInteresTarjeta = isVisibilidadCeldaCopiarTipoInteresTarjeta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoInteresTarjeta() {
		return isVisibilidadCeldaVerFormTipoInteresTarjeta;
	}

	public void setIsVisibilidadCeldaVerFormTipoInteresTarjeta(Boolean isVisibilidadCeldaVerFormTipoInteresTarjeta) {
		this.isVisibilidadCeldaVerFormTipoInteresTarjeta = isVisibilidadCeldaVerFormTipoInteresTarjeta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoInteresTarjeta() {
		return isVisibilidadCeldaOrdenTipoInteresTarjeta;
	}

	public void setIsVisibilidadCeldaOrdenTipoInteresTarjeta(Boolean isVisibilidadCeldaOrdenTipoInteresTarjeta) {
		this.isVisibilidadCeldaOrdenTipoInteresTarjeta = isVisibilidadCeldaOrdenTipoInteresTarjeta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta() {
		return isVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta(Boolean isVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta) {
		this.isVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta = isVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoInteresTarjeta() {
		return isVisibilidadCeldaModificarTipoInteresTarjeta;
	}

	public void setIsVisibilidadCeldaModificarTipoInteresTarjeta(Boolean isVisibilidadCeldaModificarTipoInteresTarjeta) {
		this.isVisibilidadCeldaModificarTipoInteresTarjeta = isVisibilidadCeldaModificarTipoInteresTarjeta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoInteresTarjeta() {
		return isVisibilidadCeldaActualizarTipoInteresTarjeta;
	}

	public void setIsVisibilidadCeldaActualizarTipoInteresTarjeta(Boolean isVisibilidadCeldaActualizarTipoInteresTarjeta) {
		this.isVisibilidadCeldaActualizarTipoInteresTarjeta = isVisibilidadCeldaActualizarTipoInteresTarjeta;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoInteresTarjeta() {
		return isVisibilidadCeldaEliminarTipoInteresTarjeta;
	}

	public void setIsVisibilidadCeldaEliminarTipoInteresTarjeta(Boolean isVisibilidadCeldaEliminarTipoInteresTarjeta) {
		this.isVisibilidadCeldaEliminarTipoInteresTarjeta = isVisibilidadCeldaEliminarTipoInteresTarjeta;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoInteresTarjeta() {
		return isVisibilidadCeldaCancelarTipoInteresTarjeta;
	}

	public void setIsVisibilidadCeldaCancelarTipoInteresTarjeta(Boolean isVisibilidadCeldaCancelarTipoInteresTarjeta) {
		this.isVisibilidadCeldaCancelarTipoInteresTarjeta = isVisibilidadCeldaCancelarTipoInteresTarjeta;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoInteresTarjeta() {
		return isVisibilidadCeldaGuardarTipoInteresTarjeta;
	}

	public void setIsVisibilidadCeldaGuardarTipoInteresTarjeta(Boolean isVisibilidadCeldaGuardarTipoInteresTarjeta) {
		this.isVisibilidadCeldaGuardarTipoInteresTarjeta = isVisibilidadCeldaGuardarTipoInteresTarjeta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoInteresTarjeta() {
		return isVisibilidadCeldaGuardarCambiosTipoInteresTarjeta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoInteresTarjeta(Boolean isVisibilidadCeldaGuardarCambiosTipoInteresTarjeta) {
		this.isVisibilidadCeldaGuardarCambiosTipoInteresTarjeta = isVisibilidadCeldaGuardarCambiosTipoInteresTarjeta;
	}
		
	public TipoInteresTarjetaSessionBean gettipointerestarjetaSessionBean() {
		return this.tipointerestarjetaSessionBean;
	}
	
	public void settipointerestarjetaSessionBean(TipoInteresTarjetaSessionBean tipointerestarjetaSessionBean) {
		this.tipointerestarjetaSessionBean=tipointerestarjetaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoInteresTarjeta(TipoInteresTarjeta tipointerestarjeta)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoInteresTarjeta tipointerestarjeta,TipoInteresTarjeta tipointerestarjetaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoInteresTarjeta(tipointerestarjeta);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipointerestarjetaAux.setId(tipointerestarjeta.getId());
		tipointerestarjetaAux.setVersionRow(tipointerestarjeta.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoInteresTarjeta();
		
			int intSelectedRow = this.jTableDatosTipoInteresTarjeta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoInteresTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoInteresTarjeta(this.tipointerestarjeta,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoInteresTarjeta(this.tipointerestarjeta);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipointerestarjetaValidator.getInvalidValues(this.tipointerestarjeta);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipointerestarjetaLogic.setDatosCliente(datosCliente);
			tipointerestarjetaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipointerestarjetaAux=new  TipoInteresTarjeta();
				
				tipointerestarjetaAux.setIsNew(true);
				tipointerestarjetaAux.setIsChanged(true);
				
				tipointerestarjetaAux.setTipoInteresTarjetaOriginal(this.tipointerestarjeta);
				
				tipointerestarjetaAux.setId(this.tipointerestarjeta.getId());	
				tipointerestarjetaAux.setVersionRow(this.tipointerestarjeta.getVersionRow());	
				tipointerestarjetaAux.setnombre(this.tipointerestarjeta.getnombre());	
				tipointerestarjetaAux.setdescripcion(this.tipointerestarjeta.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipointerestarjetaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipointerestarjetaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipointerestarjetaAux,tipointerestarjetaLogic.getTipoInteresTarjetas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipointerestarjetaAux,tipointerestarjetas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipointerestarjetaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipointerestarjetaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipointerestarjetaLogic.saveTipoInteresTarjetas();//WithConnection
						//tipointerestarjetaLogic.getSetVersionRowTipoInteresTarjetas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipointerestarjeta,tipointerestarjetaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipointerestarjetaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipointerestarjetaAux=new  TipoInteresTarjeta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipointerestarjetaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipointerestarjetaSessionBean.getEsGuardarRelacionado() && this.tipointerestarjeta.getId()>=0)) {
						
					tipointerestarjetaAux.setIsNew(false);
				}
				
				tipointerestarjetaAux.setIsDeleted(false);
			
				tipointerestarjetaAux.setId(this.tipointerestarjeta.getId());	
				tipointerestarjetaAux.setVersionRow(this.tipointerestarjeta.getVersionRow());	
				tipointerestarjetaAux.setnombre(this.tipointerestarjeta.getnombre());	
				tipointerestarjetaAux.setdescripcion(this.tipointerestarjeta.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipointerestarjetaAux,tipointerestarjetaLogic.getTipoInteresTarjetas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipointerestarjetaAux,tipointerestarjetas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipointerestarjetaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipointerestarjetaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipointerestarjetaLogic.saveTipoInteresTarjetas();//WithConnection
						//tipointerestarjetaLogic.getSetVersionRowTipoInteresTarjetas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipointerestarjeta,tipointerestarjetaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipointerestarjetaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipointerestarjetaAux=new  TipoInteresTarjeta();
				
				tipointerestarjetaAux.setIsNew(false);
				tipointerestarjetaAux.setIsChanged(false);
				
				tipointerestarjetaAux.setIsDeleted(true);
				
				tipointerestarjetaAux.setId(this.tipointerestarjeta.getId());	
				tipointerestarjetaAux.setVersionRow(this.tipointerestarjeta.getVersionRow());	
				tipointerestarjetaAux.setnombre(this.tipointerestarjeta.getnombre());	
				tipointerestarjetaAux.setdescripcion(this.tipointerestarjeta.getdescripcion());	
				
				if(this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipointerestarjetaAux.getId()>=0) {	
						this.tipointerestarjetasEliminados.add(tipointerestarjetaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipointerestarjetaAux,tipointerestarjetaLogic.getTipoInteresTarjetas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipointerestarjetaAux,tipointerestarjetas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipointerestarjetaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipointerestarjetaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipointerestarjetaLogic.saveTipoInteresTarjetas();//WithConnection
						//tipointerestarjetaLogic.getSetVersionRowTipoInteresTarjetas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipointerestarjetaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipointerestarjetaAux.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipointerestarjetaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipointerestarjetaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipointerestarjetaAux,tipointerestarjetaLogic.getTipoInteresTarjetas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipointerestarjetaAux,tipointerestarjetas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjetaLogic.getTipoInteresTarjetas().addAll(this.tipointerestarjetasEliminados);
					
					tipointerestarjetaLogic.saveTipoInteresTarjetas();//WithConnection
					//tipointerestarjetaLogic.getSetVersionRowTipoInteresTarjetas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipointerestarjetasEliminados= new ArrayList<TipoInteresTarjeta>();		
			}
			
			if(this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Interes Tarjeta GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Interes Tarjeta",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipointerestarjeta=tipointerestarjetaAux;
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
      		//this.finishProcessTipoInteresTarjeta();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoInteresTarjeta tipointerestarjetaLocal) throws Exception {
		
		if(this.tipointerestarjetaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipointerestarjetaLocal.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());
			
			} else {
			
				tipointerestarjetaLocal.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoInteresTarjeta tipointerestarjetaLocal) throws Exception {	
		if(this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoInteresTarjetaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoInteresTarjeta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipointerestarjetaValidator.getInvalidValues(this.tipointerestarjeta);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoInteresTarjeta tipointerestarjeta,List<TipoInteresTarjeta> tipointerestarjetas) throws Exception {
		try	{		
			TipoInteresTarjetaConstantesFunciones.actualizarLista(tipointerestarjeta,tipointerestarjetas,this.tipointerestarjetaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoInteresTarjeta tipointerestarjeta,List<TipoInteresTarjeta> tipointerestarjetas) throws Exception {
		try	{			
			TipoInteresTarjetaConstantesFunciones.actualizarSelectedLista(tipointerestarjeta,tipointerestarjetas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoInteresTarjeta> tipointerestarjetasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipointerestarjetasLocal=this.tipointerestarjetaLogic.getTipoInteresTarjetas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipointerestarjetasLocal=this.tipointerestarjetas;
			}
			//ARCHITECTURE
		
			for(TipoInteresTarjeta tipointerestarjetaLocal:tipointerestarjetasLocal) {
				if(this.permiteMantenimiento(tipointerestarjetaLocal) && tipointerestarjetaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoInteresTarjetaConstantesFunciones.getTipoInteresTarjetaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoInteresTarjetaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInteresTarjeta.jLabelnombreTipoInteresTarjeta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoInteresTarjetaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInteresTarjeta.jLabeldescripcionTipoInteresTarjeta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoInteresTarjeta.jLabelnombreTipoInteresTarjeta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoInteresTarjeta.jLabeldescripcionTipoInteresTarjeta,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("FormaPagoPuntoVenta")) {
			if(this.tipointerestarjeta==null) {
				this.tipointerestarjeta= new TipoInteresTarjeta();
			}

			if(this.tipointerestarjetaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoInteresTarjeta
				this.setVariablesFormularioToObjetoActualTipoInteresTarjeta(this.tipointerestarjeta,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoInteresTarjeta(this.tipointerestarjeta);

				this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame.getformapagopuntoventa().setTipoInteresTarjeta(this.tipointerestarjeta);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoInteresTarjeta--;	
		
		
		this.tipointerestarjetaAux=new TipoInteresTarjeta();
		
		this.tipointerestarjetaAux.setId(this.iIdNuevoTipoInteresTarjeta);
		this.tipointerestarjetaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipointerestarjetaLogic.getTipoInteresTarjetas().add(this.tipointerestarjetaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipointerestarjetas.add(this.tipointerestarjetaAux);
		}
		//ARCHITECTURE
		
		this.tipointerestarjeta=this.tipointerestarjetaAux;
		
		if(TipoInteresTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoInteresTarjeta(this.tipointerestarjeta);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoInteresTarjeta(this.tipointerestarjeta);
		}
				
		//this.setDefaultControlesTipoInteresTarjeta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoInteresTarjeta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoInteresTarjeta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoInteresTarjeta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoInteresTarjeta(this.tipointerestarjetaBean,this.tipointerestarjeta,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoInteresTarjeta(this.tipointerestarjeta);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipointerestarjetaSessionBean.getConGuardarRelaciones()) {
			classes=TipoInteresTarjetaConstantesFunciones.getClassesRelationshipsOfTipoInteresTarjeta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipointerestarjetaReturnGeneral=tipointerestarjetaLogic.procesarEventosTipoInteresTarjetasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipointerestarjetaLogic.getTipoInteresTarjetas(),this.tipointerestarjeta,this.tipointerestarjetaParameterGeneral,this.isEsNuevoTipoInteresTarjeta,classes);//this.tipointerestarjetaLogic.getTipoInteresTarjeta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoInteresTarjeta(this.tipointerestarjetaReturnGeneral,this.tipointerestarjetaBean,false);
		
		if(this.tipointerestarjetaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoInteresTarjeta(this.tipointerestarjetaReturnGeneral.getTipoInteresTarjeta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoInteresTarjeta(this.tipointerestarjetaReturnGeneral.getTipoInteresTarjeta());
		}
		
		if(this.tipointerestarjetaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoInteresTarjeta(this.tipointerestarjetaReturnGeneral.getTipoInteresTarjeta(),classes);//this.tipointerestarjetaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoInteresTarjeta(this.tipointerestarjeta,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoInteresTarjeta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoInteresTarjeta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoInteresTarjeta(false);
						
			if(tipointerestarjetaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.getEsGuardarRelacionado() && FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormaPagoPuntoVentaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoInteresTarjetaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoInteresTarjeta();
			}
			
			this.actualizarVisualTableDatosTipoInteresTarjeta();
			
			this.jTableDatosTipoInteresTarjeta.setRowSelectionInterval(this.getIndiceNuevoTipoInteresTarjeta(), this.getIndiceNuevoTipoInteresTarjeta());
			
			this.seleccionarFilaTablaTipoInteresTarjetaActual();
						
			this.actualizarEstadoCeldasBotonesTipoInteresTarjeta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoInteresTarjeta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextAreanombreTipoInteresTarjeta.setEnabled(isHabilitar && this.tipointerestarjetaConstantesFunciones.activarnombreTipoInteresTarjeta);
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextAreadescripcionTipoInteresTarjeta.setEnabled(isHabilitar && this.tipointerestarjetaConstantesFunciones.activardescripcionTipoInteresTarjeta);	
		
	};
	
	public void setDefaultControlesTipoInteresTarjeta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoInteresTarjeta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipointerestarjetaSessionBean.setConGuardarRelaciones(true);			
			this.tipointerestarjetaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jTabbedPaneRelacionesTipoInteresTarjeta.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipointerestarjetaSessionBean.setConGuardarRelaciones(false);			
			this.tipointerestarjetaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jTabbedPaneRelacionesTipoInteresTarjeta.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoInteresTarjeta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInteresTarjeta tipointerestarjetaAux:this.tipointerestarjetaLogic.getTipoInteresTarjetas()) {
				if(tipointerestarjetaAux.getId().equals(this.iIdNuevoTipoInteresTarjeta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInteresTarjeta tipointerestarjetaAux:this.tipointerestarjetas) {
				if(tipointerestarjetaAux.getId().equals(this.iIdNuevoTipoInteresTarjeta)) {
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
	
	public int getIndiceActualTipoInteresTarjeta(TipoInteresTarjeta tipointerestarjeta,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInteresTarjeta tipointerestarjetaAux:this.tipointerestarjetaLogic.getTipoInteresTarjetas()) {
				if(tipointerestarjetaAux.getId().equals(tipointerestarjeta.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInteresTarjeta tipointerestarjetaAux:this.tipointerestarjetas) {
				if(tipointerestarjetaAux.getId().equals(tipointerestarjeta.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoInteresTarjeta(TipoInteresTarjeta tipointerestarjetaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInteresTarjeta tipointerestarjetaAux:this.tipointerestarjetaLogic.getTipoInteresTarjetas()) {
				if(tipointerestarjetaAux.getTipoInteresTarjetaOriginal().getId().equals(tipointerestarjetaOriginal.getId())) {
					existe=true;
					tipointerestarjetaOriginal.setId(tipointerestarjetaAux.getId());
					tipointerestarjetaOriginal.setVersionRow(tipointerestarjetaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInteresTarjeta tipointerestarjetaAux:this.tipointerestarjetas) {
				if(tipointerestarjetaAux.getTipoInteresTarjetaOriginal().getId().equals(tipointerestarjetaOriginal.getId())) {
					existe=true;
					tipointerestarjetaOriginal.setId(tipointerestarjetaAux.getId());
					tipointerestarjetaOriginal.setVersionRow(tipointerestarjetaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoInteresTarjeta(Boolean esParaCancelar) throws Exception {
		tipointerestarjetasAux=new ArrayList<TipoInteresTarjeta>();
		tipointerestarjetaAux=new TipoInteresTarjeta();
		
		if(!this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoInteresTarjeta tipointerestarjetaAux:this.tipointerestarjetaLogic.getTipoInteresTarjetas()) {
					if(tipointerestarjetaAux.getId()<0) {
						tipointerestarjetasAux.add(tipointerestarjetaAux);
					}		
				}
				this.iIdNuevoTipoInteresTarjeta=0L;
				this.tipointerestarjetaLogic.getTipoInteresTarjetas().removeAll(tipointerestarjetasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoInteresTarjeta tipointerestarjetaAux:this.tipointerestarjetas) {
					if(tipointerestarjetaAux.getId()<0) {
						tipointerestarjetasAux.add(tipointerestarjetaAux);
					}		
				}
				this.iIdNuevoTipoInteresTarjeta=0L;
				this.tipointerestarjetas.removeAll(tipointerestarjetasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoInteresTarjeta 
					&& this.tipointerestarjetaLogic.getTipoInteresTarjetas().size()>0
					) {
					tipointerestarjetaAux=this.tipointerestarjetaLogic.getTipoInteresTarjetas().get(this.tipointerestarjetaLogic.getTipoInteresTarjetas().size() - 1);
				
					if(tipointerestarjetaAux.getId()<0) {
						this.tipointerestarjetaLogic.getTipoInteresTarjetas().remove(tipointerestarjetaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoInteresTarjeta && this.tipointerestarjetas.size()>0) {
					tipointerestarjetaAux=this.tipointerestarjetas.get(this.tipointerestarjetas.size() - 1);
				
					if(tipointerestarjetaAux.getId()<0) {
						this.tipointerestarjetas.remove(tipointerestarjetaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoInteresTarjeta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipointerestarjeta.getId()<0) {
				this.tipointerestarjetaLogic.getTipoInteresTarjetas().remove(this.tipointerestarjeta);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipointerestarjeta.getId()<0) {
				this.tipointerestarjetas.remove(this.tipointerestarjeta);
			}
		}			
	}
	
	public void setEstadosInicialesTipoInteresTarjeta(List<TipoInteresTarjeta> tipointerestarjetasAux) throws Exception {
		TipoInteresTarjetaConstantesFunciones.setEstadosInicialesTipoInteresTarjeta(tipointerestarjetasAux);
	}
	
	public void setEstadosInicialesTipoInteresTarjeta(TipoInteresTarjeta tipointerestarjetaAux) throws Exception {
		TipoInteresTarjetaConstantesFunciones.setEstadosInicialesTipoInteresTarjeta(tipointerestarjetaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoInteresTarjetaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoInteresTarjeta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoInteresTarjetaActual()) {
				if(!this.isEsNuevoTipoInteresTarjeta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoInteresTarjeta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoInteresTarjeta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoInteresTarjetaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Interes Tarjeta ?", "MANTENIMIENTO DE Tipo Interes Tarjeta", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoInteresTarjeta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoInteresTarjeta tipointerestarjeta) throws Exception {
		TipoInteresTarjetaConstantesFunciones.seleccionarAsignar(this.tipointerestarjeta,tipointerestarjeta);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoInteresTarjeta=this.isPermisoActualizarOriginalTipoInteresTarjeta;
			
			
			this.seleccionarAsignar(tipointerestarjeta);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoInteresTarjetaConstantesFunciones.quitarEspaciosTipoInteresTarjeta(this.tipointerestarjeta,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoInteresTarjeta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipointerestarjetaSessionBean.setsFuncionBusquedaRapida(this.tipointerestarjetaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoInteresTarjeta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoInteresTarjeta(esParaCancelar);				
				this.cancelarNuevoTipoInteresTarjeta(esParaCancelar);								
			}
			
			this.tipointerestarjeta=new TipoInteresTarjeta();
			
			this.inicializarTipoInteresTarjeta();
			
			this.actualizarEstadoCeldasBotonesTipoInteresTarjeta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoInteresTarjeta() throws Exception {
		try {
			TipoInteresTarjetaConstantesFunciones.inicializarTipoInteresTarjeta(this.tipointerestarjeta);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipointerestarjetaLogic.getTipoInteresTarjetas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoInteresTarjetas(String sAccionBusqueda,List<TipoInteresTarjeta> tipointerestarjetasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoInteresTarjeta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoInteresTarjetaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoInteresTarjetaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoInteresTarjeta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Interes Tarjetas");		
		parameters.put("busquedapor", TipoInteresTarjetaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
					
					TipoInteresTarjetaLogic tipointerestarjetaLogicAuxiliar=new TipoInteresTarjetaLogic();
					tipointerestarjetaLogicAuxiliar.setDatosCliente(tipointerestarjetaLogic.getDatosCliente());				
					tipointerestarjetaLogicAuxiliar.setTipoInteresTarjetas(tipointerestarjetasParaReportes);
					
					tipointerestarjetaLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoInteresTarjetaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipointerestarjetasParaReportes=tipointerestarjetaLogicAuxiliar.getTipoInteresTarjetas();
					
					//tipointerestarjetaLogic.getNewConnexionToDeep();
					
					//for (TipoInteresTarjeta tipointerestarjeta:tipointerestarjetasParaReportes) {
					//	tipointerestarjetaLogic.deepLoad(tipointerestarjeta, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipointerestarjetaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipointerestarjetaLogic.closeNewConnexionToDeep();
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoInteresTarjeta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoInteresTarjetaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoInteresTarjetaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoInteresTarjeta=new JRBeanArrayDataSource(TipoInteresTarjetaJInternalFrame.TraerTipoInteresTarjetaBeans(tipointerestarjetasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoInteresTarjeta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoInteresTarjetaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoInteresTarjetaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoInteresTarjetaBean.TraerTipoInteresTarjetaBeans(tipointerestarjetasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoInteresTarjetas(sAccionBusqueda,sTipoArchivoReporte,tipointerestarjetasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoInteresTarjetas(sAccionBusqueda,sTipoArchivoReporte,tipointerestarjetasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoInteresTarjetaActionPerformed(null);
					//this.generarExcelReporteTipoInteresTarjetas(sAccionBusqueda,sTipoArchivoReporte,tipointerestarjetasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoInteresTarjetas(sAccionBusqueda,sTipoArchivoReporte,tipointerestarjetasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoInteresTarjetas(sAccionBusqueda,sTipoArchivoReporte,tipointerestarjetasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoInteresTarjetas(sAccionBusqueda,sTipoArchivoReporte,tipointerestarjetasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoInteresTarjetas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoInteresTarjeta> tipointerestarjetasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipointerestarjeta";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoInteresTarjetas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoInteresTarjeta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoInteresTarjeta tipointerestarjeta : tipointerestarjetasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoInteresTarjetaConstantesFunciones.generarExcelReporteDataTipoInteresTarjeta("NORMAL",row,workbook,tipointerestarjeta,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Interes Tarjeta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoInteresTarjeta(String sTipo,Row row,Workbook workbook) {
		
		TipoInteresTarjetaConstantesFunciones.generarExcelReporteHeaderTipoInteresTarjeta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoInteresTarjetas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoInteresTarjeta> tipointerestarjetasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipointerestarjeta_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoInteresTarjetas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoInteresTarjeta tipointerestarjeta : tipointerestarjetasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoInteresTarjetaConstantesFunciones.getTipoInteresTarjetaDescripcion(tipointerestarjeta));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoInteresTarjetaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoInteresTarjetaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipointerestarjeta.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoInteresTarjetaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoInteresTarjetaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipointerestarjeta.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Interes Tarjeta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoInteresTarjetas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoInteresTarjeta> tipointerestarjetasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoInteresTarjeta> tipointerestarjetasRespaldo=null;
		
		classes=TipoInteresTarjetaConstantesFunciones.getClassesRelationshipsOfTipoInteresTarjeta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipointerestarjetaLogic.setDatosCliente(this.datosCliente);
		this.tipointerestarjetaLogic.setDatosDeep(this.datosDeep);
		this.tipointerestarjetaLogic.setIsConDeep(true);
		
		tipointerestarjetasRespaldo=this.tipointerestarjetaLogic.getTipoInteresTarjetas();
		
		this.tipointerestarjetaLogic.setTipoInteresTarjetas(tipointerestarjetasParaReportes);	
		this.tipointerestarjetaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipointerestarjetasParaReportes=this.tipointerestarjetaLogic.getTipoInteresTarjetas();
		this.tipointerestarjetaLogic.setTipoInteresTarjetas(tipointerestarjetasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipointerestarjeta_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoInteresTarjetas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoInteresTarjeta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoInteresTarjeta tipointerestarjeta : tipointerestarjetasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoInteresTarjeta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoInteresTarjetaConstantesFunciones.generarExcelReporteDataTipoInteresTarjeta("NORMAL",row,workbook,tipointerestarjeta,cellStyleDataAux);
		
			
			


				//FormaPagoPuntoVenta
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipointerestarjeta.getFormaPagoPuntoVentas()!=null && tipointerestarjeta.getFormaPagoPuntoVentas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FormaPagoPuntoVentaConstantesFunciones.generarExcelReporteHeaderFormaPagoPuntoVenta("RELACIONADO",row,workbook);
				}

				if(tipointerestarjeta.getFormaPagoPuntoVentas()!=null) {
					i2=0;
					for(FormaPagoPuntoVenta formapagopuntoventa : tipointerestarjeta.getFormaPagoPuntoVentas()) {
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
		cell.setCellValue(TipoInteresTarjetaConstantesFunciones.getTipoInteresTarjetaDescripcion(tipointerestarjeta));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Interes Tarjeta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoInteresTarjeta() throws Exception {		
		this.startProcessTipoInteresTarjeta(true);
	}
	
	public void startProcessTipoInteresTarjeta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoInteresTarjeta, this.jScrollPanelDatosTipoInteresTarjeta,this.jPanelPaginacionTipoInteresTarjeta, this.jScrollPanelDatosEdicionTipoInteresTarjeta, this.jPanelAccionesTipoInteresTarjeta,this.jPanelAccionesFormularioTipoInteresTarjeta,this.jmenuBarTipoInteresTarjeta,this.jmenuBarDetalleTipoInteresTarjeta,this.jTtoolBarTipoInteresTarjeta,this.jTtoolBarDetalleTipoInteresTarjeta);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoInteresTarjeta=null; 
		
		final JPanel jPanelParametrosReportesTipoInteresTarjeta=this.jPanelParametrosReportesTipoInteresTarjeta;
		//final JScrollPane jScrollPanelDatosTipoInteresTarjeta=this.jScrollPanelDatosTipoInteresTarjeta;
		final JTable jTableDatosTipoInteresTarjeta=this.jTableDatosTipoInteresTarjeta;		
		final JPanel jPanelPaginacionTipoInteresTarjeta=this.jPanelPaginacionTipoInteresTarjeta;
		//final JScrollPane jScrollPanelDatosEdicionTipoInteresTarjeta=this.jScrollPanelDatosEdicionTipoInteresTarjeta;
		final JPanel jPanelAccionesTipoInteresTarjeta=this.jPanelAccionesTipoInteresTarjeta;
		
		JPanel jPanelCamposAuxiliarTipoInteresTarjeta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoInteresTarjeta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) {
			jPanelCamposAuxiliarTipoInteresTarjeta=this.jInternalFrameDetalleFormTipoInteresTarjeta.jPanelCamposTipoInteresTarjeta;
			jPanelAccionesFormularioAuxiliarTipoInteresTarjeta=this.jInternalFrameDetalleFormTipoInteresTarjeta.jPanelAccionesFormularioTipoInteresTarjeta;
		}
		
		final JPanel jPanelCamposTipoInteresTarjeta=jPanelCamposAuxiliarTipoInteresTarjeta;
		final JPanel jPanelAccionesFormularioTipoInteresTarjeta=jPanelAccionesFormularioAuxiliarTipoInteresTarjeta;
		
		
		final JMenuBar jmenuBarTipoInteresTarjeta=this.jmenuBarTipoInteresTarjeta;
		final JToolBar jTtoolBarTipoInteresTarjeta=this.jTtoolBarTipoInteresTarjeta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoInteresTarjeta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoInteresTarjeta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) {
			jmenuBarDetalleAuxiliarTipoInteresTarjeta=this.jInternalFrameDetalleFormTipoInteresTarjeta.jmenuBarDetalleTipoInteresTarjeta;
			jTtoolBarDetalleAuxiliarTipoInteresTarjeta=this.jInternalFrameDetalleFormTipoInteresTarjeta.jTtoolBarDetalleTipoInteresTarjeta;
		}
		
		final JMenuBar jmenuBarDetalleTipoInteresTarjeta=jmenuBarDetalleAuxiliarTipoInteresTarjeta;
		final JToolBar jTtoolBarDetalleTipoInteresTarjeta=jTtoolBarDetalleAuxiliarTipoInteresTarjeta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoInteresTarjeta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoInteresTarjeta;
			processRunnable.jTableDatos=jTableDatosTipoInteresTarjeta;
			processRunnable.jPanelCampos=jPanelCamposTipoInteresTarjeta;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoInteresTarjeta;
			processRunnable.jPanelAcciones=jPanelAccionesTipoInteresTarjeta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoInteresTarjeta;
			
			
			processRunnable.jmenuBar=jmenuBarTipoInteresTarjeta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoInteresTarjeta;
			processRunnable.jTtoolBar=jTtoolBarTipoInteresTarjeta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoInteresTarjeta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoInteresTarjeta ,jPanelParametrosReportesTipoInteresTarjeta,jTableDatosTipoInteresTarjeta, /*jScrollPanelDatosTipoInteresTarjeta,*/jPanelCamposTipoInteresTarjeta,jPanelPaginacionTipoInteresTarjeta, /*jScrollPanelDatosEdicionTipoInteresTarjeta,*/ jPanelAccionesTipoInteresTarjeta,jPanelAccionesFormularioTipoInteresTarjeta,jmenuBarTipoInteresTarjeta,jmenuBarDetalleTipoInteresTarjeta,jTtoolBarTipoInteresTarjeta,jTtoolBarDetalleTipoInteresTarjeta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoInteresTarjeta, jScrollPanelDatosTipoInteresTarjeta,jPanelPaginacionTipoInteresTarjeta, jScrollPanelDatosEdicionTipoInteresTarjeta, jPanelAccionesTipoInteresTarjeta,jPanelAccionesFormularioTipoInteresTarjeta,jmenuBarTipoInteresTarjeta,jmenuBarDetalleTipoInteresTarjeta,jTtoolBarTipoInteresTarjeta,jTtoolBarDetalleTipoInteresTarjeta);
						
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
	
	public void finishProcessTipoInteresTarjeta() {// throws Exception 
		this.finishProcessTipoInteresTarjeta(true);
	}
	
	public void finishProcessTipoInteresTarjeta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoInteresTarjeta, this.jScrollPanelDatosTipoInteresTarjeta,this.jPanelPaginacionTipoInteresTarjeta, this.jScrollPanelDatosEdicionTipoInteresTarjeta, this.jPanelAccionesTipoInteresTarjeta,this.jPanelAccionesFormularioTipoInteresTarjeta,this.jmenuBarTipoInteresTarjeta,this.jmenuBarDetalleTipoInteresTarjeta,this.jTtoolBarTipoInteresTarjeta,this.jTtoolBarDetalleTipoInteresTarjeta);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoInteresTarjeta=null; 
		
		final JPanel jPanelParametrosReportesTipoInteresTarjeta=this.jPanelParametrosReportesTipoInteresTarjeta;
		//final JScrollPane jScrollPanelDatosTipoInteresTarjeta=this.jScrollPanelDatosTipoInteresTarjeta;
		final JTable jTableDatosTipoInteresTarjeta=this.jTableDatosTipoInteresTarjeta;		
		final JPanel jPanelPaginacionTipoInteresTarjeta=this.jPanelPaginacionTipoInteresTarjeta;
		//final JScrollPane jScrollPanelDatosEdicionTipoInteresTarjeta=this.jScrollPanelDatosEdicionTipoInteresTarjeta;
		final JPanel jPanelAccionesTipoInteresTarjeta=this.jPanelAccionesTipoInteresTarjeta;
		
		JPanel jPanelCamposAuxiliarTipoInteresTarjeta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoInteresTarjeta=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) {
			jPanelCamposAuxiliarTipoInteresTarjeta=this.jInternalFrameDetalleFormTipoInteresTarjeta.jPanelCamposTipoInteresTarjeta;
			jPanelAccionesFormularioAuxiliarTipoInteresTarjeta=this.jInternalFrameDetalleFormTipoInteresTarjeta.jPanelAccionesFormularioTipoInteresTarjeta;
		}
		
		final JPanel jPanelCamposTipoInteresTarjeta=jPanelCamposAuxiliarTipoInteresTarjeta;
		final JPanel jPanelAccionesFormularioTipoInteresTarjeta=jPanelAccionesFormularioAuxiliarTipoInteresTarjeta;
		
		
		final JMenuBar jmenuBarTipoInteresTarjeta=this.jmenuBarTipoInteresTarjeta;		
		final JToolBar jTtoolBarTipoInteresTarjeta=this.jTtoolBarTipoInteresTarjeta;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoInteresTarjeta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoInteresTarjeta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) {
			jmenuBarDetalleAuxiliarTipoInteresTarjeta=this.jInternalFrameDetalleFormTipoInteresTarjeta.jmenuBarDetalleTipoInteresTarjeta;
			jTtoolBarDetalleAuxiliarTipoInteresTarjeta=this.jInternalFrameDetalleFormTipoInteresTarjeta.jTtoolBarDetalleTipoInteresTarjeta;		
		}
		
		final JMenuBar jmenuBarDetalleTipoInteresTarjeta=jmenuBarDetalleAuxiliarTipoInteresTarjeta;
		final JToolBar jTtoolBarDetalleTipoInteresTarjeta=jTtoolBarDetalleAuxiliarTipoInteresTarjeta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoInteresTarjeta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoInteresTarjeta;
			processRunnable.jTableDatos=jTableDatosTipoInteresTarjeta;
			processRunnable.jPanelCampos=jPanelCamposTipoInteresTarjeta;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoInteresTarjeta;
			processRunnable.jPanelAcciones=jPanelAccionesTipoInteresTarjeta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoInteresTarjeta;
			
			
			processRunnable.jmenuBar=jmenuBarTipoInteresTarjeta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoInteresTarjeta;
			processRunnable.jTtoolBar=jTtoolBarTipoInteresTarjeta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoInteresTarjeta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoInteresTarjeta ,jPanelParametrosReportesTipoInteresTarjeta, jTableDatosTipoInteresTarjeta,/*jScrollPanelDatosTipoInteresTarjeta,*/jPanelCamposTipoInteresTarjeta,jPanelPaginacionTipoInteresTarjeta, /*jScrollPanelDatosEdicionTipoInteresTarjeta,*/ jPanelAccionesTipoInteresTarjeta,jPanelAccionesFormularioTipoInteresTarjeta,jmenuBarTipoInteresTarjeta,jmenuBarDetalleTipoInteresTarjeta,jTtoolBarTipoInteresTarjeta,jTtoolBarDetalleTipoInteresTarjeta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoInteresTarjeta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoInteresTarjeta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoInteresTarjeta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoInteresTarjeta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoInteresTarjeta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoInteresTarjeta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoInteresTarjeta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoInteresTarjeta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoInteresTarjeta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipointerestarjetaConstantesFunciones.getsFinalQueryTipoInteresTarjeta();
		String  finalQueryPaginacionTodos=this.tipointerestarjetaConstantesFunciones.getsFinalQueryTipoInteresTarjeta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoInteresTarjetaConstantesFunciones.getArrayColumnasGlobalesNoTipoInteresTarjeta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoInteresTarjetaConstantesFunciones.getArrayColumnasGlobalesTipoInteresTarjeta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoInteresTarjetaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipointerestarjetasEliminados= new ArrayList<TipoInteresTarjeta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoInteresTarjeta();
		
				///*TipoInteresTarjetaSessionBean*/this.tipointerestarjetaSessionBean=new TipoInteresTarjetaSessionBean();
			
			if(this.tipointerestarjetaSessionBean==null) {
				this.tipointerestarjetaSessionBean=new TipoInteresTarjetaSessionBean();
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
					this.iNumeroPaginacion=TipoInteresTarjetaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoInteresTarjetaConstantesFunciones.getClassesForeignKeysOfTipoInteresTarjeta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipointerestarjeta."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipointerestarjetasAux= new ArrayList<TipoInteresTarjeta>();
			
				
			tipointerestarjetaLogic.setDatosCliente(this.datosCliente);
			tipointerestarjetaLogic.setDatosDeep(this.datosDeep);
			tipointerestarjetaLogic.setIsConDeep(true);
			
			
			tipointerestarjetaLogic.getTipoInteresTarjetaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipointerestarjetaLogic.getTodosTipoInteresTarjetas(finalQueryGlobal,pagination);
					
					//tipointerestarjetaLogic.getTodosTipoInteresTarjetasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipointerestarjetaLogic.getTipoInteresTarjetas()==null|| tipointerestarjetaLogic.getTipoInteresTarjetas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipointerestarjetasAux= new ArrayList<TipoInteresTarjeta>();
							tipointerestarjetasAux.addAll(tipointerestarjetaLogic.getTipoInteresTarjetas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipointerestarjetasAux= new ArrayList<TipoInteresTarjeta>();
							tipointerestarjetasAux.addAll(tipointerestarjetas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipointerestarjetaLogic.getTodosTipoInteresTarjetas(finalQueryGlobal+"",this.pagination);												
							
							//tipointerestarjetaLogic.getTodosTipoInteresTarjetasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoInteresTarjetas("Todos",tipointerestarjetaLogic.getTipoInteresTarjetas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipointerestarjetaLogic.setTipoInteresTarjetas(new ArrayList<TipoInteresTarjeta>());					
							tipointerestarjetaLogic.getTipoInteresTarjetas().addAll(tipointerestarjetasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipointerestarjetas=new ArrayList<TipoInteresTarjeta>();
							tipointerestarjetas.addAll(tipointerestarjetasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoInteresTarjeta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoInteresTarjeta=this.idActual;
				
				} else if(this.idTipoInteresTarjetaActual!=null && this.idTipoInteresTarjetaActual!=0L) {
					idTipoInteresTarjeta=idTipoInteresTarjetaActual;
				}
				
					
				this.sDetalleReporte=TipoInteresTarjetaConstantesFunciones.getDetalleIndicePorId(idTipoInteresTarjeta);
				
				this.tipointerestarjetas=new ArrayList<TipoInteresTarjeta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipointerestarjetaLogic.getEntity(idTipoInteresTarjeta);
					
					//tipointerestarjetaLogic.getEntityWithConnection(idTipoInteresTarjeta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipointerestarjetaLogic.setTipoInteresTarjetas(new ArrayList<TipoInteresTarjeta>());
					tipointerestarjetaLogic.getTipoInteresTarjetas().add(tipointerestarjetaLogic.getTipoInteresTarjeta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipointerestarjetas=new ArrayList<TipoInteresTarjeta>();
					this.tipointerestarjetas.add(tipointerestarjeta);
				}
				
				if(tipointerestarjetaLogic.getTipoInteresTarjeta()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoInteresTarjeta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoInteresTarjeta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipointerestarjetaLogic.getTipoInteresTarjetas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipointerestarjetas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipointerestarjetaLogic.getTipoInteresTarjetas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipointerestarjetas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoInteresTarjeta tipointerestarjeta) {
		Boolean permite=true;
		
		if(this.tipointerestarjeta.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoInteresTarjetaConstantesFunciones.getOrderByListaTipoInteresTarjeta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoInteresTarjetaConstantesFunciones.getOrderByListaTipoInteresTarjeta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInteresTarjeta tipointerestarjeta:tipointerestarjetaLogic.getTipoInteresTarjetas()) {
				if(tipointerestarjeta.getsType().equals(Constantes2.S_TOTALES)) {
					tipointerestarjetaTotales=tipointerestarjeta;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInteresTarjeta tipointerestarjeta:this.tipointerestarjetas) {
				if(tipointerestarjeta.getsType().equals(Constantes2.S_TOTALES)) {
					tipointerestarjetaTotales=tipointerestarjeta;
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
			this.tipointerestarjetaAux=new TipoInteresTarjeta();
			this.tipointerestarjetaAux.setsType(Constantes2.S_TOTALES);
			this.tipointerestarjetaAux.setIsNew(false);
			this.tipointerestarjetaAux.setIsChanged(false);
			this.tipointerestarjetaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoInteresTarjetaConstantesFunciones.TotalizarValoresFilaTipoInteresTarjeta(this.tipointerestarjetaLogic.getTipoInteresTarjetas(),this.tipointerestarjetaAux);
				
				this.tipointerestarjetaLogic.getTipoInteresTarjetas().add(this.tipointerestarjetaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoInteresTarjetaConstantesFunciones.TotalizarValoresFilaTipoInteresTarjeta(this.tipointerestarjetas,this.tipointerestarjetaAux);
				
				this.tipointerestarjetas.add(this.tipointerestarjetaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipointerestarjetaTotales=new TipoInteresTarjeta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipointerestarjetaLogic.getTipoInteresTarjetas().remove(tipointerestarjetaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipointerestarjetas.remove(tipointerestarjetaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipointerestarjetaTotales=new TipoInteresTarjeta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInteresTarjeta tipointerestarjeta:tipointerestarjetaLogic.getTipoInteresTarjetas()) {
				if(tipointerestarjeta.getsType().equals(Constantes2.S_TOTALES)) {
					tipointerestarjetaTotales=tipointerestarjeta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoInteresTarjetaConstantesFunciones.TotalizarValoresFilaTipoInteresTarjeta(this.tipointerestarjetaLogic.getTipoInteresTarjetas(),tipointerestarjetaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInteresTarjeta tipointerestarjeta:this.tipointerestarjetas) {
				if(tipointerestarjeta.getsType().equals(Constantes2.S_TOTALES)) {
					tipointerestarjetaTotales=tipointerestarjeta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoInteresTarjetaConstantesFunciones.TotalizarValoresFilaTipoInteresTarjeta(this.tipointerestarjetas,tipointerestarjetaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoInteresTarjeta() {
		this.isPermisoTodoTipoInteresTarjeta=false;
		this.isPermisoNuevoTipoInteresTarjeta=false;
		this.isPermisoActualizarTipoInteresTarjeta=false;
		this.isPermisoActualizarOriginalTipoInteresTarjeta=false;
		this.isPermisoEliminarTipoInteresTarjeta=false;
		this.isPermisoGuardarCambiosTipoInteresTarjeta=false;
		this.isPermisoConsultaTipoInteresTarjeta=false;
		this.isPermisoBusquedaTipoInteresTarjeta=false;
		this.isPermisoReporteTipoInteresTarjeta=false;		
		this.isPermisoOrdenTipoInteresTarjeta=false;		
		this.isPermisoPaginacionMedioTipoInteresTarjeta=false;		
		this.isPermisoPaginacionAltoTipoInteresTarjeta=false;
		this.isPermisoPaginacionTodoTipoInteresTarjeta=false;
		this.isPermisoCopiarTipoInteresTarjeta=false;		
		this.isPermisoVerFormTipoInteresTarjeta=false;		
		this.isPermisoDuplicarTipoInteresTarjeta=false;		
		this.isPermisoOrdenTipoInteresTarjeta=false;		
	}
	
	public void setPermisosUsuarioTipoInteresTarjeta(Boolean isPermiso) {
		this.isPermisoTodoTipoInteresTarjeta=isPermiso;
		this.isPermisoNuevoTipoInteresTarjeta=isPermiso;
		this.isPermisoActualizarTipoInteresTarjeta=isPermiso;
		this.isPermisoActualizarOriginalTipoInteresTarjeta=isPermiso;
		this.isPermisoEliminarTipoInteresTarjeta=isPermiso;
		this.isPermisoGuardarCambiosTipoInteresTarjeta=isPermiso;
		this.isPermisoConsultaTipoInteresTarjeta=isPermiso;
		this.isPermisoBusquedaTipoInteresTarjeta=isPermiso;
		this.isPermisoReporteTipoInteresTarjeta=isPermiso;
		this.isPermisoOrdenTipoInteresTarjeta=isPermiso;		
		this.isPermisoPaginacionMedioTipoInteresTarjeta=isPermiso;		
		this.isPermisoPaginacionAltoTipoInteresTarjeta=isPermiso;		
		this.isPermisoPaginacionTodoTipoInteresTarjeta=isPermiso;		
		this.isPermisoCopiarTipoInteresTarjeta=isPermiso;		
		this.isPermisoVerFormTipoInteresTarjeta=isPermiso;		
		this.isPermisoDuplicarTipoInteresTarjeta=isPermiso;
		this.isPermisoOrdenTipoInteresTarjeta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoInteresTarjeta(Boolean isPermiso) {
		//this.isPermisoTodoTipoInteresTarjeta=isPermiso;
		this.isPermisoNuevoTipoInteresTarjeta=isPermiso;
		this.isPermisoActualizarTipoInteresTarjeta=isPermiso;
		this.isPermisoActualizarOriginalTipoInteresTarjeta=isPermiso;
		this.isPermisoEliminarTipoInteresTarjeta=isPermiso;
		this.isPermisoGuardarCambiosTipoInteresTarjeta=isPermiso;
		//this.isPermisoConsultaTipoInteresTarjeta=isPermiso;
		//this.isPermisoBusquedaTipoInteresTarjeta=isPermiso;
		//this.isPermisoReporteTipoInteresTarjeta=isPermiso;
		//this.isPermisoOrdenTipoInteresTarjeta=isPermiso;		
		//this.isPermisoPaginacionMedioTipoInteresTarjeta=isPermiso;		
		//this.isPermisoPaginacionAltoTipoInteresTarjeta=isPermiso;		
		//this.isPermisoPaginacionTodoTipoInteresTarjeta=isPermiso;		
		//this.isPermisoCopiarTipoInteresTarjeta=isPermiso;		
		//this.isPermisoDuplicarTipoInteresTarjeta=isPermiso;
		//this.isPermisoOrdenTipoInteresTarjeta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoInteresTarjetaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(FormaPagoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		
		if(TipoInteresTarjetaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosFormaPagoPuntoVenta=this.verificarGetPermisosUsuarioOpcionTipoInteresTarjetaClaseRelacionada(this.opcionsRelacionadas,FormaPagoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoInteresTarjeta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoInteresTarjetaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosFormaPagoPuntoVenta=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoInteresTarjetaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoInteresTarjetaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoInteresTarjetaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosFormaPagoPuntoVenta && this.jInternalFrameDetalleFormTipoInteresTarjeta!=null && this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jTabbedPaneRelacionesTipoInteresTarjeta.remove(this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoInteresTarjeta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoInteresTarjetaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoInteresTarjetaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoInteresTarjeta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoInteresTarjeta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoInteresTarjeta=this.isPermisoActualizarTipoInteresTarjeta;
			this.isPermisoEliminarTipoInteresTarjeta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoInteresTarjeta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoInteresTarjeta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoInteresTarjeta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoInteresTarjeta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoInteresTarjeta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoInteresTarjeta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoInteresTarjeta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoInteresTarjeta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoInteresTarjeta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoInteresTarjeta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoInteresTarjeta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoInteresTarjeta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoInteresTarjeta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoInteresTarjeta.setToolTipText(this.jTableDatosTipoInteresTarjeta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoInteresTarjeta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoInteresTarjeta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoInteresTarjetaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoInteresTarjetaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoInteresTarjeta() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosFormaPagoPuntoVenta && this.tipointerestarjetaConstantesFunciones.mostrarFormaPagoPuntoVentaTipoInteresTarjeta && !TipoInteresTarjetaConstantesFunciones.ISGUARDARREL) {

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
	
		
	public void inicializarCombosForeignKeyTipoInteresTarjetaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoInteresTarjetaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoInteresTarjetaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoInteresTarjetaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoInteresTarjetaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoInteresTarjeta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoInteresTarjeta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoInteresTarjeta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoInteresTarjeta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoInteresTarjeta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoInteresTarjeta(TipoInteresTarjeta tipointerestarjeta)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoInteresTarjeta(TipoInteresTarjeta tipointerestarjeta,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoInteresTarjeta()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoInteresTarjeta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoInteresTarjeta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoInteresTarjeta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoInteresTarjeta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoInteresTarjeta()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoInteresTarjeta(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoInteresTarjeta()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoInteresTarjetaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoInteresTarjetaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoInteresTarjetaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipointerestarjetaSessionBean=new TipoInteresTarjetaSessionBean(); 
		this.tipointerestarjetaConstantesFunciones=new TipoInteresTarjetaConstantesFunciones(); 
		this.tipointerestarjetaBean=new TipoInteresTarjeta();//(this.tipointerestarjetaConstantesFunciones); 		
		this.tipointerestarjetaReturnGeneral=new TipoInteresTarjetaParameterReturnGeneral(); 
		
		this.tipointerestarjetaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipointerestarjetaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoInteresTarjetaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoInteresTarjetaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoInteresTarjetaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoInteresTarjeta(true);
			
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
			
			this.tipointerestarjetaConstantesFunciones=new TipoInteresTarjetaConstantesFunciones(); 
			this.tipointerestarjetaBean=new TipoInteresTarjeta();//this.tipointerestarjetaConstantesFunciones); 			
			this.tipointerestarjetaReturnGeneral=new TipoInteresTarjetaParameterReturnGeneral(); 
		
			TipoInteresTarjetaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Interes Tarjeta Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipointerestarjeta=new TipoInteresTarjeta();
			this.tipointerestarjetas = new ArrayList<TipoInteresTarjeta>();
			this.tipointerestarjetasAux = new ArrayList<TipoInteresTarjeta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic=new TipoInteresTarjetaLogic();
				this.tipointerestarjetaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipointerestarjetaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipointerestarjetaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoInteresTarjeta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoInteresTarjeta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoInteresTarjeta);	
					}
					
					if(this.jInternalFrameImportacionTipoInteresTarjeta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoInteresTarjeta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoInteresTarjeta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoInteresTarjeta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoInteresTarjeta);
				this.jInternalFrameDetalleFormTipoInteresTarjeta.setVisible(false);
				this.jInternalFrameDetalleFormTipoInteresTarjeta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoInteresTarjeta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoInteresTarjeta);
					this.jInternalFrameReporteDinamicoTipoInteresTarjeta.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoInteresTarjeta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoInteresTarjeta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoInteresTarjeta);
					this.jInternalFrameImportacionTipoInteresTarjeta.setVisible(false);
					this.jInternalFrameImportacionTipoInteresTarjeta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoInteresTarjeta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoInteresTarjeta);
					this.jInternalFrameOrderByTipoInteresTarjeta.setVisible(false);
					this.jInternalFrameOrderByTipoInteresTarjeta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoInteresTarjetaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoInteresTarjetaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipointerestarjetaReturnGeneral=new TipoInteresTarjetaParameterReturnGeneral();
			
			this.tipointerestarjetaParameterGeneral=new TipoInteresTarjetaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipointerestarjetaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoInteresTarjetaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(FormaPagoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoInteresTarjetaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipointerestarjetaSessionBean.getEsGuardarRelacionado(),this.tipointerestarjetaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoInteresTarjetaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipointerestarjetaSessionBean.getEsGuardarRelacionado(),this.tipointerestarjetaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoInteresTarjeta=false;
			this.isVisibilidadCeldaDuplicarTipoInteresTarjeta=true;
			this.isVisibilidadCeldaCopiarTipoInteresTarjeta=true;
			this.isVisibilidadCeldaVerFormTipoInteresTarjeta=true;
			this.isVisibilidadCeldaOrdenTipoInteresTarjeta=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta=false;
			this.isVisibilidadCeldaModificarTipoInteresTarjeta=false;
			this.isVisibilidadCeldaActualizarTipoInteresTarjeta=false;
			this.isVisibilidadCeldaEliminarTipoInteresTarjeta=false;
			this.isVisibilidadCeldaCancelarTipoInteresTarjeta=false;
			this.isVisibilidadCeldaGuardarTipoInteresTarjeta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInteresTarjeta=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoInteresTarjeta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoInteresTarjeta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoInteresTarjeta(false);
			
			this.setPermisosUsuarioTipoInteresTarjeta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipointerestarjetaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipointerestarjetaSessionBean.getEsGuardarRelacionado() && this.tipointerestarjetaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoInteresTarjetaClasesRelacionadas();
			}
			
			if(this.tipointerestarjetaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoInteresTarjetaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoInteresTarjetaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoInteresTarjeta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoInteresTarjeta();
			}
			
			if(!this.isPermisoBusquedaTipoInteresTarjeta) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoInteresTarjeta,this.isPermisoPaginacionMedioTipoInteresTarjeta,this.isPermisoPaginacionTodoTipoInteresTarjeta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoInteresTarjetaConstantesFunciones.getTiposSeleccionarTipoInteresTarjeta());
				
				this.tiposColumnasSelect=TipoInteresTarjetaConstantesFunciones.getTiposSeleccionarTipoInteresTarjeta(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoInteresTarjeta();				
				//this.tiposRelacionesSelect=TipoInteresTarjetaConstantesFunciones.getTiposRelacionesTipoInteresTarjeta(true);
				
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
			//if(!this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoInteresTarjeta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoInteresTarjeta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoInteresTarjeta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoInteresTarjeta() ;
			
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
				tipointerestarjetaImplementable= (TipoInteresTarjetaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoInteresTarjetaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipointerestarjetaImplementableHome= (TipoInteresTarjetaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoInteresTarjetaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipointerestarjetas= new ArrayList<TipoInteresTarjeta>();
			this.tipointerestarjetasEliminados= new ArrayList<TipoInteresTarjeta>();
						
			this.isEsNuevoTipoInteresTarjeta=false;
			this.esParaAccionDesdeFormularioTipoInteresTarjeta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoInteresTarjeta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoInteresTarjeta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoInteresTarjetaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoInteresTarjeta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoInteresTarjeta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoInteresTarjeta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoInteresTarjeta();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoInteresTarjeta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoInteresTarjeta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoInteresTarjeta() {
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
			if(sTipo.equals("RelacionesTipoInteresTarjeta")) {
				iIndex=this.jInternalFrameDetalleFormTipoInteresTarjeta.jTabbedPaneRelacionesTipoInteresTarjeta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoInteresTarjeta.jTabbedPaneRelacionesTipoInteresTarjeta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoInteresTarjeta.getSelectedRow();	
				
				

				if(sTitle.equals("Forma Pagoes")) {
					if(!FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoInteresTarjeta();

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
				this.finishProcessTipoInteresTarjeta();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaFormaPagoPuntoVenta(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoInteresTarjeta.cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(false,true,iIndex);
		this.jButtonFormaPagoPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFormaPagoPuntoVenta();

		//this.jTabbedPaneRelacionesTipoInteresTarjeta.updateUI();
		//this.jTabbedPaneRelacionesTipoInteresTarjeta.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoInteresTarjeta.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("FormaPagoPuntoVenta")) {
				int row=this.jTableDatosTipoInteresTarjeta.getSelectedRow();
				jButtonFormaPagoPuntoVentaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Forma Pago")) {

					if(this.isTienePermisosFormaPagoPuntoVenta && this.tipointerestarjetaConstantesFunciones.mostrarFormaPagoPuntoVentaTipoInteresTarjeta && !TipoInteresTarjetaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Forma Pagoes"+"("+FormaPagoPuntoVentaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Forma Pagoes");

						if(tipointerestarjetaConstantesFunciones.resaltarFormaPagoPuntoVentaTipoInteresTarjeta!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipointerestarjetaConstantesFunciones.resaltarFormaPagoPuntoVentaTipoInteresTarjeta);
						}

						jmenuItem.setEnabled(this.tipointerestarjetaConstantesFunciones.activarFormaPagoPuntoVentaTipoInteresTarjeta);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FormaPagoPuntoVenta"));

						

						this.jInternalFrameDetalleFormTipoInteresTarjeta.jmenuDetalleTipoInteresTarjeta.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoInteresTarjeta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoInteresTarjeta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoInteresTarjeta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoInteresTarjetaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoInteresTarjeta();
		
		this.cargarCombosFrameForeignKeyTipoInteresTarjeta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoInteresTarjeta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoInteresTarjeta();
		}
	}
	
	
	
	public void jButtonNuevoTipoInteresTarjetaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipointerestarjetaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoInteresTarjeta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
			
			
			if(jTableDatosTipoInteresTarjeta.getRowCount()>=1) {
				jTableDatosTipoInteresTarjeta.removeRowSelectionInterval(0, jTableDatosTipoInteresTarjeta.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoInteresTarjeta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoInteresTarjeta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoInteresTarjeta(true);			
			//this.tipointerestarjeta=new TipoInteresTarjeta();
			//this.tipointerestarjeta.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoInteresTarjeta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoInteresTarjeta() ;
			
			if(TipoInteresTarjetaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoInteresTarjeta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipointerestarjeta);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipointerestarjeta);				
			
			TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
			
			if(this.tipointerestarjetaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoInteresTarjeta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoInteresTarjetaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoInteresTarjeta> tipointerestarjetasSeleccionados=new ArrayList<TipoInteresTarjeta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoInteresTarjeta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoInteresTarjeta.getSelectedRows().length;			
			}
			
			tipointerestarjetasSeleccionados=this.getTipoInteresTarjetasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoInteresTarjeta--;			
				//TipoInteresTarjeta tipointerestarjetaAux= new TipoInteresTarjeta();			
				//tipointerestarjetaAux.setId(this.iIdNuevoTipoInteresTarjeta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoInteresTarjeta tipointerestarjetaOrigen=new TipoInteresTarjeta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoInteresTarjeta tipointerestarjetaOrigen : tipointerestarjetasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoInteresTarjeta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipointerestarjetaOrigen =(TipoInteresTarjeta) this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipointerestarjetaOrigen =(TipoInteresTarjeta) this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoInteresTarjeta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipointerestarjeta.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoInteresTarjeta(tipointerestarjetaOrigen,this.tipointerestarjeta,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInteresTarjeta(this.tipointerestarjeta);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipointerestarjetaLogic.getTipoInteresTarjetas().add(this.tipointerestarjetaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipointerestarjetas.add(this.tipointerestarjetaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoInteresTarjeta(false);
				
				this.jTableDatosTipoInteresTarjeta.setRowSelectionInterval(this.getIndiceNuevoTipoInteresTarjeta(), this.getIndiceNuevoTipoInteresTarjeta());
				
				int iLastRow =  this.jTableDatosTipoInteresTarjeta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoInteresTarjeta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoInteresTarjeta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoInteresTarjeta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoInteresTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoInteresTarjeta> tipointerestarjetasSeleccionados=new ArrayList<TipoInteresTarjeta>();									
		
			TipoInteresTarjeta tipointerestarjetaOrigen=new TipoInteresTarjeta();
			TipoInteresTarjeta tipointerestarjetaDestino=new TipoInteresTarjeta();
				
			tipointerestarjetasSeleccionados=this.getTipoInteresTarjetasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoInteresTarjeta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipointerestarjetasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoInteresTarjeta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipointerestarjetaOrigen =(TipoInteresTarjeta) this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipointerestarjetaOrigen =(TipoInteresTarjeta) this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipointerestarjetaDestino =(TipoInteresTarjeta) this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipointerestarjetaDestino =(TipoInteresTarjeta) this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipointerestarjetaOrigen =tipointerestarjetasSeleccionados.get(0);
				tipointerestarjetaDestino =tipointerestarjetasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoInteresTarjeta(tipointerestarjetaOrigen,tipointerestarjetaDestino,true,false);
				
				tipointerestarjetaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipointerestarjetaDestino,tipointerestarjetaLogic.getTipoInteresTarjetas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipointerestarjetaDestino,tipointerestarjetas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoInteresTarjeta(false);
				
				//this.jTableDatosTipoInteresTarjeta.setRowSelectionInterval(this.getIndiceNuevoTipoInteresTarjeta(), this.getIndiceNuevoTipoInteresTarjeta());
				
				int iLastRow =  this.jTableDatosTipoInteresTarjeta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoInteresTarjeta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoInteresTarjeta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoInteresTarjeta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoInteresTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoInteresTarjeta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoInteresTarjeta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoInteresTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoInteresTarjeta.isVisible();
			
			
			this.jPanelParametrosReportesTipoInteresTarjeta.setVisible(!isVisible);
			this.jPanelPaginacionTipoInteresTarjeta.setVisible(!isVisible);
			this.jPanelAccionesTipoInteresTarjeta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoInteresTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoInteresTarjeta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoInteresTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoInteresTarjeta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoInteresTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoInteresTarjeta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoInteresTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoInteresTarjeta();
			
			this.abrirFrameOrderByTipoInteresTarjeta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoInteresTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoInteresTarjeta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoInteresTarjeta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoInteresTarjeta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoInteresTarjeta.isMaximum()) {
					this.jInternalFrameDetalleFormTipoInteresTarjeta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoInteresTarjeta.setSize(this.jInternalFrameDetalleFormTipoInteresTarjeta.iWidthFormulario,this.jInternalFrameDetalleFormTipoInteresTarjeta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoInteresTarjeta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoInteresTarjeta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoInteresTarjeta.isMaximum()) {
						this.jInternalFrameDetalleFormTipoInteresTarjeta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoInteresTarjeta.jContentPaneDetalleTipoInteresTarjeta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoInteresTarjeta.jTabbedPaneRelacionesTipoInteresTarjeta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoInteresTarjeta.jContentPaneDetalleTipoInteresTarjeta.getWidth(),TipoInteresTarjetaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoInteresTarjeta.jTabbedPaneRelacionesTipoInteresTarjeta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoInteresTarjeta.jContentPaneDetalleTipoInteresTarjeta.getWidth(),TipoInteresTarjetaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoInteresTarjeta.jTabbedPaneRelacionesTipoInteresTarjeta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoInteresTarjeta.jContentPaneDetalleTipoInteresTarjeta.getWidth(),TipoInteresTarjetaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFormaPagoPuntoVenta();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoInteresTarjeta.setVisible(true);
	        this.jInternalFrameDetalleFormTipoInteresTarjeta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoInteresTarjeta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoInteresTarjeta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoInteresTarjeta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoInteresTarjeta,false,this);
				} else {
					this.jInternalFrameOrderByTipoInteresTarjeta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoInteresTarjeta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoInteresTarjeta);
				this.jInternalFrameOrderByTipoInteresTarjeta.setVisible(false);
				this.jInternalFrameOrderByTipoInteresTarjeta.setSelected(false);
				
				this.jInternalFrameOrderByTipoInteresTarjeta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoInteresTarjeta"));
				
				this.inicializarActualizarBindingTablaOrderByTipoInteresTarjeta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoInteresTarjeta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoInteresTarjeta==null) {
				
				this.jInternalFrameImportacionTipoInteresTarjeta=new ImportacionJInternalFrame(TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoInteresTarjeta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoInteresTarjeta);
				this.jInternalFrameImportacionTipoInteresTarjeta.setVisible(false);
				this.jInternalFrameImportacionTipoInteresTarjeta.setSelected(false);


				this.jInternalFrameImportacionTipoInteresTarjeta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoInteresTarjeta"));
				this.jInternalFrameImportacionTipoInteresTarjeta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoInteresTarjeta"));
				this.jInternalFrameImportacionTipoInteresTarjeta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoInteresTarjeta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoInteresTarjeta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoInteresTarjeta==null) {
				this.jInternalFrameReporteDinamicoTipoInteresTarjeta=new ReporteDinamicoJInternalFrame(TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoInteresTarjeta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoInteresTarjeta);
				this.jInternalFrameReporteDinamicoTipoInteresTarjeta.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoInteresTarjeta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoInteresTarjeta"));
				this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoInteresTarjeta"));
				this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoInteresTarjeta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoInteresTarjeta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaFormaPagoPuntoVenta() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoInteresTarjeta.jContentPaneDetalleTipoInteresTarjeta.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoInteresTarjeta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoInteresTarjeta);
			
	       	this.jInternalFrameDetalleFormTipoInteresTarjeta.setVisible(false);
	        this.jInternalFrameDetalleFormTipoInteresTarjeta.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoInteresTarjeta.dispose();
			//this.jInternalFrameDetalleFormTipoInteresTarjeta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoInteresTarjeta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoInteresTarjeta.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoInteresTarjeta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoInteresTarjeta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoInteresTarjeta.setVisible(true);
	        this.jInternalFrameImportacionTipoInteresTarjeta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoInteresTarjeta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoInteresTarjeta.setVisible(true);
	        this.jInternalFrameOrderByTipoInteresTarjeta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoInteresTarjeta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoInteresTarjeta.setVisible(false);
	        this.jInternalFrameOrderByTipoInteresTarjeta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoInteresTarjeta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoInteresTarjeta.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoInteresTarjeta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoInteresTarjeta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoInteresTarjeta.setVisible(false);
	        this.jInternalFrameImportacionTipoInteresTarjeta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoInteresTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoInteresTarjeta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoInteresTarjeta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoInteresTarjeta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoInteresTarjeta(true);
			//this.isEsNuevoTipoInteresTarjeta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoInteresTarjeta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoInteresTarjeta(false) ;
			
			if(tipointerestarjetaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.getEsGuardarRelacionado() && FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormaPagoPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoInteresTarjetaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoInteresTarjeta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoInteresTarjeta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoInteresTarjetaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoInteresTarjeta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoInteresTarjeta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoInteresTarjeta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoInteresTarjeta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoInteresTarjeta(true);
			//this.isEsNuevoTipoInteresTarjeta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipointerestarjeta.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoInteresTarjeta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoInteresTarjeta(false) ;
			
			if(TipoInteresTarjetaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoInteresTarjeta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoInteresTarjeta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoInteresTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoInteresTarjeta(false);
			
			//if(!this.isEsNuevoTipoInteresTarjeta) {								
				int intSelectedRow = this.jTableDatosTipoInteresTarjeta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoInteresTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoInteresTarjeta(this.tipointerestarjeta,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoInteresTarjeta(this.tipointerestarjeta);
				
			}
			
			if(this.permiteMantenimiento(this.tipointerestarjeta)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoInteresTarjeta=true;
					this.inicializarActualizarBindingTablaTipoInteresTarjeta(false);
					this.isEsNuevoTipoInteresTarjeta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoInteresTarjeta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoInteresTarjeta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoInteresTarjeta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoInteresTarjeta(false);
				
				this.habilitarDeshabilitarControlesTipoInteresTarjeta(false);
			
												
				
				if(TipoInteresTarjetaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoInteresTarjeta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoInteresTarjetaActionPerformed(evt,tipointerestarjetaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoInteresTarjeta(this.tipointerestarjeta,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoInteresTarjeta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipointerestarjetaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipointerestarjeta.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoInteresTarjeta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInteresTarjeta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoInteresTarjetaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoInteresTarjeta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
				this.tipointerestarjeta.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
				this.tipointerestarjeta.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipointerestarjeta)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoInteresTarjetaModel) this.jTableDatosTipoInteresTarjeta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoInteresTarjeta=true;
				this.inicializarActualizarBindingTablaTipoInteresTarjeta(false);
				this.isEsNuevoTipoInteresTarjeta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoInteresTarjeta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoInteresTarjeta(false);
				
				this.habilitarDeshabilitarControlesTipoInteresTarjeta(false);
				
				
				
				if(TipoInteresTarjetaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoInteresTarjeta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoInteresTarjetaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoInteresTarjeta.getRowCount()>=1) {
				jTableDatosTipoInteresTarjeta.removeRowSelectionInterval(0, jTableDatosTipoInteresTarjeta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoInteresTarjeta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoInteresTarjeta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoInteresTarjeta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoInteresTarjeta(false) ;
			
			this.isEsNuevoTipoInteresTarjeta=false;
			
			if(TipoInteresTarjetaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoInteresTarjeta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoInteresTarjetaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoInteresTarjeta(false);
				
				//SI ES MANUAL
				if(TipoInteresTarjetaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoInteresTarjeta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoInteresTarjetaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoInteresTarjeta--;			
			//TipoInteresTarjeta tipointerestarjetaAux= new TipoInteresTarjeta();			
			//tipointerestarjetaAux.setId(this.iIdNuevoTipoInteresTarjeta);
			
			if(this.jInternalFrameDetalleFormTipoInteresTarjeta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoInteresTarjeta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoInteresTarjeta(this.tipointerestarjeta);
			
			this.tipointerestarjeta.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipointerestarjetaLogic.getTipoInteresTarjetas().add(this.tipointerestarjetaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipointerestarjetas.add(this.tipointerestarjetaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoInteresTarjeta(false);
			
			this.jTableDatosTipoInteresTarjeta.setRowSelectionInterval(this.getIndiceNuevoTipoInteresTarjeta(), this.getIndiceNuevoTipoInteresTarjeta());
			
			int iLastRow =  this.jTableDatosTipoInteresTarjeta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoInteresTarjeta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoInteresTarjeta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoInteresTarjeta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoInteresTarjetaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoInteresTarjeta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoInteresTarjeta(false);
			
			//SI ES MANUAL
			if(TipoInteresTarjetaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoInteresTarjeta();
			}
			
			//this.abrirFrameTreeTipoInteresTarjeta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoInteresTarjetaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Interes TarjetaS ?", "MANTENIMIENTO DE Tipo Interes Tarjeta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoInteresTarjeta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoInteresTarjeta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipointerestarjetaReturnGeneral=tipointerestarjetaLogic.procesarImportacionTipoInteresTarjetasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipointerestarjetaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoInteresTarjetaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoInteresTarjetaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoInteresTarjeta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoInteresTarjeta.setFileImportacion(this.jInternalFrameImportacionTipoInteresTarjeta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoInteresTarjeta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoInteresTarjeta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoInteresTarjeta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoInteresTarjeta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoInteresTarjetaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoInteresTarjeta> tipointerestarjetasSeleccionados=new ArrayList<TipoInteresTarjeta>();		

		tipointerestarjetasSeleccionados=this.getTipoInteresTarjetasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoInteresTarjetaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoInteresTarjetaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoInteresTarjetas("Todos",tipointerestarjetasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Interes Tarjeta",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoInteresTarjetaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoInteresTarjetaConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoInteresTarjetaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoInteresTarjetaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoInteresTarjetaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoInteresTarjetaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoInteresTarjetaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoInteresTarjetaConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoInteresTarjetaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoInteresTarjeta> tipointerestarjetasSeleccionados=new ArrayList<TipoInteresTarjeta>();		
		
		tipointerestarjetasSeleccionados=this.getTipoInteresTarjetasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipointerestarjeta";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoInteresTarjetas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoInteresTarjetaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoInteresTarjetaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoInteresTarjeta tipointerestarjeta:tipointerestarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipointerestarjeta.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoInteresTarjetaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoInteresTarjetaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(TipoInteresTarjeta tipointerestarjeta:tipointerestarjetasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipointerestarjeta.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelTipoInteresTarjeta(row);				
			//	iRow++;
			//}				
			
			//for(TipoInteresTarjeta tipointerestarjetaAux:tipointerestarjetasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoInteresTarjeta(tipointerestarjetaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Interes Tarjeta",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipointerestarjetaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoInteresTarjeta(false);
			
			//SI ES MANUAL
			if(TipoInteresTarjetaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoInteresTarjeta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoInteresTarjetaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoInteresTarjeta(false);
			
			//SI ES MANUAL
			if(TipoInteresTarjetaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoInteresTarjeta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoInteresTarjetaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoInteresTarjeta(false);
			
			//SI ES MANUAL
			if(TipoInteresTarjetaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoInteresTarjeta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointerestarjetaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoInteresTarjeta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoInteresTarjeta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoInteresTarjeta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoInteresTarjeta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoInteresTarjeta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoInteresTarjeta.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoInteresTarjeta.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoInteresTarjeta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoInteresTarjeta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoInteresTarjeta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoInteresTarjeta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoInteresTarjeta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoInteresTarjeta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoInteresTarjeta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoInteresTarjeta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoInteresTarjeta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoInteresTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoInteresTarjetaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoInteresTarjeta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoInteresTarjeta();
		
		this.inicializarActualizarBindingBotonesManualTipoInteresTarjeta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoInteresTarjeta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoInteresTarjeta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoInteresTarjeta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoInteresTarjeta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoInteresTarjeta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoInteresTarjeta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoInteresTarjeta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoInteresTarjeta.jCheckBoxPostAccionNuevoTipoInteresTarjeta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoInteresTarjeta.jCheckBoxPostAccionSinCerrarTipoInteresTarjeta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoInteresTarjeta.jCheckBoxPostAccionSinMensajeTipoInteresTarjeta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoInteresTarjeta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoInteresTarjeta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoInteresTarjeta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) {
				this.jInternalFrameDetalleFormTipoInteresTarjeta.jCheckBoxPostAccionNuevoTipoInteresTarjeta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoInteresTarjeta.jCheckBoxPostAccionSinCerrarTipoInteresTarjeta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoInteresTarjeta.jCheckBoxPostAccionSinMensajeTipoInteresTarjeta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoInteresTarjeta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoInteresTarjeta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoInteresTarjeta.jComboBoxTiposAccionesFormularioTipoInteresTarjeta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoInteresTarjeta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoInteresTarjeta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoInteresTarjeta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoInteresTarjeta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoInteresTarjeta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoInteresTarjeta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoInteresTarjeta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoInteresTarjeta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoInteresTarjeta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoInteresTarjeta(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoInteresTarjetaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoInteresTarjeta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoInteresTarjeta() throws Exception {
		try	{
			if(TipoInteresTarjetaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoInteresTarjeta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoInteresTarjeta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jComboBoxTiposAccionesFormularioTipoInteresTarjeta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jComboBoxTiposAccionesFormularioTipoInteresTarjeta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoInteresTarjeta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoInteresTarjeta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoInteresTarjeta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoInteresTarjeta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoInteresTarjeta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoInteresTarjeta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoInteresTarjeta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoInteresTarjeta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoInteresTarjeta.addItem(reporte);
			}
			
			
			if(!this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoInteresTarjeta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoInteresTarjeta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoInteresTarjeta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoInteresTarjeta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoInteresTarjeta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoInteresTarjeta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoInteresTarjeta.jComboBoxTiposAccionesFormularioTipoInteresTarjeta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoInteresTarjeta.jComboBoxTiposAccionesFormularioTipoInteresTarjeta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoInteresTarjeta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoInteresTarjeta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoInteresTarjeta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoInteresTarjeta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoInteresTarjeta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoInteresTarjeta!=null) {
				this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoInteresTarjeta!=null) {
				this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoInteresTarjeta!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoInteresTarjeta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoInteresTarjeta(Boolean esInicializar) throws Exception {				
		if(TipoInteresTarjetaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoInteresTarjeta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoInteresTarjeta() throws Exception {
		this.inicializarActualizarBindingTablaTipoInteresTarjeta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoInteresTarjeta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoInteresTarjeta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoInteresTarjeta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoInteresTarjeta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoInteresTarjetaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoInteresTarjeta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoInteresTarjeta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoInteresTarjetaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoInteresTarjetaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInteresTarjetaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoInteresTarjetaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoInteresTarjeta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoInteresTarjeta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoInteresTarjetaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoInteresTarjeta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoInteresTarjeta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipointerestarjetaLogic.getTipoInteresTarjetas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipointerestarjetas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoInteresTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoInteresTarjeta.setModel(new TipoInteresTarjetaModel(this.tipointerestarjetaLogic.getTipoInteresTarjetas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoInteresTarjeta.setModel(new TipoInteresTarjetaModel(this.tipointerestarjetas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoInteresTarjeta!=null && this.jInternalFrameOrderByTipoInteresTarjeta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoInteresTarjeta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoInteresTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInteresTarjeta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoInteresTarjetaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO,tipointerestarjetaConstantesFunciones.resaltarSeleccionarTipoInteresTarjeta,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO,tipointerestarjetaConstantesFunciones.resaltarSeleccionarTipoInteresTarjeta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoInteresTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInteresTarjeta,TipoInteresTarjetaConstantesFunciones.LABEL_ID));

		if(this.tipointerestarjetaConstantesFunciones.mostraridTipoInteresTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoInteresTarjetaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipointerestarjetaConstantesFunciones.resaltaridTipoInteresTarjeta,this.tipointerestarjetaConstantesFunciones.activaridTipoInteresTarjeta,this,true,"idTipoInteresTarjeta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipointerestarjetaConstantesFunciones.resaltaridTipoInteresTarjeta,this.tipointerestarjetaConstantesFunciones.activaridTipoInteresTarjeta,this,true,"idTipoInteresTarjeta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoInteresTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInteresTarjeta,TipoInteresTarjetaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipointerestarjetaConstantesFunciones.mostrarnombreTipoInteresTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoInteresTarjetaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipointerestarjetaConstantesFunciones.resaltarnombreTipoInteresTarjeta,this.tipointerestarjetaConstantesFunciones.activarnombreTipoInteresTarjeta,this,true,"nombreTipoInteresTarjeta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipointerestarjetaConstantesFunciones.resaltarnombreTipoInteresTarjeta,this.tipointerestarjetaConstantesFunciones.activarnombreTipoInteresTarjeta,this,true,"nombreTipoInteresTarjeta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoInteresTarjetaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoInteresTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInteresTarjeta,TipoInteresTarjetaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.tipointerestarjetaConstantesFunciones.mostrardescripcionTipoInteresTarjeta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoInteresTarjetaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipointerestarjetaConstantesFunciones.resaltardescripcionTipoInteresTarjeta,this.tipointerestarjetaConstantesFunciones.activardescripcionTipoInteresTarjeta,this,true,"descripcionTipoInteresTarjeta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipointerestarjetaConstantesFunciones.resaltardescripcionTipoInteresTarjeta,this.tipointerestarjetaConstantesFunciones.activardescripcionTipoInteresTarjeta,this,true,"descripcionTipoInteresTarjeta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoInteresTarjetaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosFormaPagoPuntoVenta && this.tipointerestarjetaConstantesFunciones.mostrarFormaPagoPuntoVentaTipoInteresTarjeta && !TipoInteresTarjetaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Forma Pagoes");
				tableColumn.setHeaderValue("Forma Pagoes");
				tableColumn.setCellRenderer(new FormaPagoPuntoVentaTableCell(tipointerestarjetaConstantesFunciones.resaltarFormaPagoPuntoVentaTipoInteresTarjeta,this,this.tipointerestarjetaConstantesFunciones.activarFormaPagoPuntoVentaTipoInteresTarjeta));
				tableColumn.setCellEditor(new FormaPagoPuntoVentaTableCell(tipointerestarjetaConstantesFunciones.resaltarFormaPagoPuntoVentaTipoInteresTarjeta,this,this.tipointerestarjetaConstantesFunciones.activarFormaPagoPuntoVentaTipoInteresTarjeta));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoInteresTarjeta.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoInteresTarjeta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoInteresTarjeta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoInteresTarjeta && this.isPermisoGuardarCambiosTipoInteresTarjeta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoInteresTarjeta.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipointerestarjetaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoInteresTarjeta.addColumn(tableColumn);
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
			
			this.jTableDatosTipoInteresTarjeta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoInteresTarjeta && this.isPermisoGuardarCambiosTipoInteresTarjeta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipointerestarjetaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoInteresTarjeta && this.isPermisoGuardarCambiosTipoInteresTarjeta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoInteresTarjeta.moveColumn(this.jTableDatosTipoInteresTarjeta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoInteresTarjeta.moveColumn(this.jTableDatosTipoInteresTarjeta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipointerestarjetaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoInteresTarjeta.moveColumn(this.jTableDatosTipoInteresTarjeta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoInteresTarjeta.moveColumn(this.jTableDatosTipoInteresTarjeta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoInteresTarjeta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoInteresTarjeta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoInteresTarjeta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoInteresTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoInteresTarjeta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoInteresTarjeta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoInteresTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoInteresTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoInteresTarjeta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoInteresTarjeta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoInteresTarjeta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipointerestarjetaLogic.getTipoInteresTarjetas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipointerestarjetas.size()-1;
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
		//this.jTableDatosTipoInteresTarjeta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoInteresTarjeta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoInteresTarjeta();
			
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
				
				//this.isEsNuevoTipoInteresTarjeta=false;
					
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
			
				if(this.tipointerestarjetaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoInteresTarjeta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoInteresTarjeta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoInteresTarjeta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipointerestarjeta.getsType().equals("DUPLICADO")
				   || this.tipointerestarjeta.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoInteresTarjeta=true;
				
				} else {
					this.isEsNuevoTipoInteresTarjeta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipointerestarjeta.getId()>=0 && !this.tipointerestarjeta.getIsNew()) {						
						this.isEsNuevoTipoInteresTarjeta=false;
						
					} else {
						this.isEsNuevoTipoInteresTarjeta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoInteresTarjeta(esRelaciones);						
				
				this.seleccionarTipoInteresTarjeta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipointerestarjeta.getId()<0) {
					this.isEsNuevoTipoInteresTarjeta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoInteresTarjeta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoInteresTarjeta(evt,rowIndex);
				}	
				
				if(this.tipointerestarjetaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoInteresTarjeta: " + this.dDif); 
					}
				}								
				
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoInteresTarjeta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipointerestarjeta)) {
					if(this.tipointerestarjeta.getId()>0) {
						this.tipointerestarjeta.setIsDeleted(true);
						
						this.tipointerestarjetasEliminados.add(this.tipointerestarjeta);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipointerestarjetaLogic.getTipoInteresTarjetas().remove(this.tipointerestarjeta);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipointerestarjetas.remove(this.tipointerestarjeta);				
					}
					
					
					((TipoInteresTarjetaModel) this.jTableDatosTipoInteresTarjeta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoInteresTarjeta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoInteresTarjeta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoInteresTarjeta) {
			
			if(this.jInternalFrameDetalleFormTipoInteresTarjeta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoInteresTarjeta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoInteresTarjeta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoInteresTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoInteresTarjeta(this.tipointerestarjeta);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoInteresTarjeta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoInteresTarjeta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoInteresTarjeta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoInteresTarjeta(TipoInteresTarjeta tipointerestarjeta) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoInteresTarjeta(tipointerestarjeta,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoInteresTarjeta(TipoInteresTarjeta tipointerestarjeta,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoInteresTarjeta(tipointerestarjeta);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoInteresTarjeta(tipointerestarjeta,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoInteresTarjeta(tipointerestarjeta);
	}
	
	public void setVariablesObjetoActualToFormularioTipoInteresTarjeta(TipoInteresTarjeta tipointerestarjeta) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoInteresTarjeta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextFieldidTipoInteresTarjeta.setText(tipointerestarjeta.getId().toString());
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextAreanombreTipoInteresTarjeta.setText(tipointerestarjeta.getnombre());
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextAreadescripcionTipoInteresTarjeta.setText(tipointerestarjeta.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoInteresTarjeta tipointerestarjetaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipointerestarjetaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoInteresTarjeta tipointerestarjetaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipointerestarjetaLocal=this.tipointerestarjeta;
			} else {
				tipointerestarjetaLocal=this.tipointerestarjetaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipointerestarjetaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoInteresTarjeta(tipointerestarjetaLocal,true);
					
					if(tipointerestarjetaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipointerestarjetaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipointerestarjetaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoInteresTarjeta(TipoInteresTarjeta tipointerestarjeta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoInteresTarjeta(tipointerestarjeta,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoInteresTarjeta(tipointerestarjeta);
	}
	
	public void setVariablesFormularioToObjetoActualTipoInteresTarjeta(TipoInteresTarjeta tipointerestarjeta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoInteresTarjeta(tipointerestarjeta,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoInteresTarjeta(TipoInteresTarjeta tipointerestarjeta,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoInteresTarjeta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextFieldidTipoInteresTarjeta.getText()==null || this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextFieldidTipoInteresTarjeta.getText()=="" || this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextFieldidTipoInteresTarjeta.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextFieldidTipoInteresTarjeta.setText("0");
			}

			if(conColumnasBase) {tipointerestarjeta.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextFieldidTipoInteresTarjeta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoInteresTarjetaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInteresTarjeta.jLabelIdTipoInteresTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipointerestarjeta.setnombre(this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextAreanombreTipoInteresTarjeta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoInteresTarjetaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInteresTarjeta.jLabelnombreTipoInteresTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipointerestarjeta.setdescripcion(this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextAreadescripcionTipoInteresTarjeta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoInteresTarjetaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInteresTarjeta.jLabeldescripcionTipoInteresTarjeta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoInteresTarjeta(TipoInteresTarjeta tipointerestarjetaBean,TipoInteresTarjeta tipointerestarjeta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoInteresTarjeta(TipoInteresTarjeta tipointerestarjetaOrigen,TipoInteresTarjeta tipointerestarjeta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipointerestarjetaOrigen.getId()!=null && !tipointerestarjetaOrigen.getId().equals(0L))) {tipointerestarjeta.setId(tipointerestarjetaOrigen.getId());}}
			if(conDefault || (!conDefault && tipointerestarjetaOrigen.getnombre()!=null && !tipointerestarjetaOrigen.getnombre().equals(""))) {tipointerestarjeta.setnombre(tipointerestarjetaOrigen.getnombre());}
			if(conDefault || (!conDefault && tipointerestarjetaOrigen.getdescripcion()!=null && !tipointerestarjetaOrigen.getdescripcion().equals(""))) {tipointerestarjeta.setdescripcion(tipointerestarjetaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoInteresTarjeta(TipoInteresTarjeta tipointerestarjeta) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextFieldidTipoInteresTarjeta.setText(tipointerestarjeta.getId().toString());
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextAreanombreTipoInteresTarjeta.setText(tipointerestarjeta.getnombre());
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextAreadescripcionTipoInteresTarjeta.setText(tipointerestarjeta.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoInteresTarjeta(TipoInteresTarjetaBean tipointerestarjetaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextFieldidTipoInteresTarjeta.setText(tipointerestarjetaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextAreanombreTipoInteresTarjeta.setText(tipointerestarjetaBean.getnombre());
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextAreadescripcionTipoInteresTarjeta.setText(tipointerestarjetaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoInteresTarjeta(TipoInteresTarjetaParameterReturnGeneral tipointerestarjetaReturnGeneral,TipoInteresTarjetaBean tipointerestarjetaBean,Boolean conDefault) throws Exception { 
		try {
			TipoInteresTarjeta tipointerestarjetaLocal=new TipoInteresTarjeta();
			
			tipointerestarjetaLocal=tipointerestarjetaReturnGeneral.getTipoInteresTarjeta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipointerestarjetaLocal.getId()!=null && !tipointerestarjetaLocal.getId().equals(0L))) {tipointerestarjetaBean.setId(tipointerestarjetaLocal.getId());}}
			if(conDefault || (!conDefault && tipointerestarjetaLocal.getnombre()!=null && !tipointerestarjetaLocal.getnombre().equals(""))) {tipointerestarjetaBean.setnombre(tipointerestarjetaLocal.getnombre());}
			if(conDefault || (!conDefault && tipointerestarjetaLocal.getdescripcion()!=null && !tipointerestarjetaLocal.getdescripcion().equals(""))) {tipointerestarjetaBean.setdescripcion(tipointerestarjetaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoInteresTarjetaGenerico(Long idTipoInteresTarjetaSeleccionado,JComboBox jComboBoxTipoInteresTarjeta,List<TipoInteresTarjeta> tipointerestarjetasLocal)throws Exception {
		try {
			TipoInteresTarjeta  tipointerestarjetaTemp=null;

			for(TipoInteresTarjeta tipointerestarjetaAux:tipointerestarjetasLocal) {
				if(tipointerestarjetaAux.getId()!=null && tipointerestarjetaAux.getId().equals(idTipoInteresTarjetaSeleccionado)) {
					tipointerestarjetaTemp=tipointerestarjetaAux;
					break;
				}
			}

			jComboBoxTipoInteresTarjeta.setSelectedItem(tipointerestarjetaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoInteresTarjetaGenerico(JComboBox jComboBoxTipoInteresTarjeta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoInteresTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoInteresTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoInteresTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoInteresTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoInteresTarjeta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoInteresTarjeta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoInteresTarjeta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoInteresTarjeta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoInteresTarjeta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoInteresTarjeta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipointerestarjeta=(TipoInteresTarjeta) tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipointerestarjeta =(TipoInteresTarjeta) tipointerestarjetas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoInteresTarjeta tipointerestarjetaRow=new TipoInteresTarjeta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipointerestarjetaRow=(TipoInteresTarjeta) tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipointerestarjetaRow=(TipoInteresTarjeta) tipointerestarjetas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonFormaPagoPuntoVentaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoInteresTarjeta tipointerestarjeta) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoInteresTarjeta==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjetaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipointerestarjeta = (TipoInteresTarjeta)this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipointerestarjeta = (TipoInteresTarjeta)this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipointerestarjeta!=null) {
						this.tipointerestarjeta = tipointerestarjeta;
					} else {
						this.tipointerestarjeta = new TipoInteresTarjeta();
					}
				}

				if(this.isTienePermisosFormaPagoPuntoVenta && this.permiteMantenimiento(this.tipointerestarjeta)) {
					FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFramePopup=new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						formapagopuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFramePopup;
					} else {
						formapagopuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame;
					}

					List<TipoInteresTarjeta> tipointerestarjetas=new ArrayList<TipoInteresTarjeta>();
					tipointerestarjetas.add(this.tipointerestarjeta);
					if(!esRelacionado) {
						//formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setConGuardarRelaciones(false);
						//formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					formapagopuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoInteresTarjeta.cargarFormaPagoPuntoVentaBeanSwingJInternalFrame(tipointerestarjetas,this.tipointerestarjeta,formapagopuntoventaBeanSwingJInternalFrame,/*conInicializar,*/formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.getConGuardarRelaciones(),formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.getEsGuardarRelacionado());
					formapagopuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPagoPuntoVenta("no_relacionado");

						formapagopuntoventaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FormaPagoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA + (FormaPagoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA/2));

						formapagopuntoventaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoInteresTarjeta=(TitledBorder)this.jScrollPanelDatosTipoInteresTarjeta.getBorder();
						TitledBorder titledBorderFormaPagoPuntoVenta=(TitledBorder)formapagopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFormaPagoPuntoVenta.getBorder();

						titledBorderFormaPagoPuntoVenta.setTitle(titledBorderTipoInteresTarjeta.getTitle() + " -> Forma Pago");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,formapagopuntoventaBeanSwingJInternalFrame);
						}

						formapagopuntoventaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(formapagopuntoventaBeanSwingJInternalFrame);

						formapagopuntoventaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipointerestarjetaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Forma Pago",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjetaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjetaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoInteresTarjeta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaNuevoTipoInteresTarjeta && this.isPermisoNuevoTipoInteresTarjeta));			
			this.jButtonDuplicarTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaDuplicarTipoInteresTarjeta && this.isPermisoDuplicarTipoInteresTarjeta));			
			this.jButtonCopiarTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaCopiarTipoInteresTarjeta && this.isPermisoCopiarTipoInteresTarjeta));
			this.jButtonVerFormTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaVerFormTipoInteresTarjeta && this.isPermisoVerFormTipoInteresTarjeta));
			
			this.jButtonAbrirOrderByTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaOrdenTipoInteresTarjeta && this.isPermisoOrdenTipoInteresTarjeta));			
			
			this.jButtonNuevoRelacionesTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta && this.isPermisoNuevoTipoInteresTarjeta));			
			this.jButtonNuevoGuardarCambiosTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaNuevoTipoInteresTarjeta && this.isPermisoNuevoTipoInteresTarjeta && this.isPermisoGuardarCambiosTipoInteresTarjeta));
			
			if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) {
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonModificarTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaModificarTipoInteresTarjeta && this.isPermisoActualizarTipoInteresTarjeta));	
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonActualizarTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaActualizarTipoInteresTarjeta && this.isPermisoActualizarTipoInteresTarjeta));	
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonEliminarTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaEliminarTipoInteresTarjeta && this.isPermisoEliminarTipoInteresTarjeta));
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonCancelarTipoInteresTarjeta.setVisible(this.isVisibilidadCeldaCancelarTipoInteresTarjeta);							
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonGuardarCambiosTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaGuardarTipoInteresTarjeta && this.isPermisoGuardarCambiosTipoInteresTarjeta));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoInteresTarjeta && this.isPermisoGuardarCambiosTipoInteresTarjeta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaNuevoTipoInteresTarjeta && this.isPermisoNuevoTipoInteresTarjeta));						
			this.jButtonDuplicarToolBarTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaDuplicarTipoInteresTarjeta && this.isPermisoDuplicarTipoInteresTarjeta));						
			this.jButtonCopiarToolBarTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaCopiarTipoInteresTarjeta && this.isPermisoCopiarTipoInteresTarjeta));			
			this.jButtonVerFormToolBarTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaVerFormTipoInteresTarjeta && this.isPermisoVerFormTipoInteresTarjeta));			
			this.jButtonAbrirOrderByToolBarTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaOrdenTipoInteresTarjeta && this.isPermisoOrdenTipoInteresTarjeta));
			this.jButtonNuevoRelacionesToolBarTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta && this.isPermisoNuevoTipoInteresTarjeta));			
			this.jButtonNuevoGuardarCambiosToolBarTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaNuevoTipoInteresTarjeta && this.isPermisoNuevoTipoInteresTarjeta && this.isPermisoGuardarCambiosTipoInteresTarjeta));			
			
			if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) {
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonModificarToolBarTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaModificarTipoInteresTarjeta && this.isPermisoActualizarTipoInteresTarjeta));	
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonActualizarToolBarTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaActualizarTipoInteresTarjeta  && this.isPermisoActualizarTipoInteresTarjeta));	
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonEliminarToolBarTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaEliminarTipoInteresTarjeta && this.isPermisoEliminarTipoInteresTarjeta));
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonCancelarToolBarTipoInteresTarjeta.setVisible(this.isVisibilidadCeldaCancelarTipoInteresTarjeta);				
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonGuardarCambiosToolBarTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaGuardarTipoInteresTarjeta && this.isPermisoGuardarCambiosTipoInteresTarjeta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoInteresTarjeta && this.isPermisoGuardarCambiosTipoInteresTarjeta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaNuevoTipoInteresTarjeta && this.isPermisoNuevoTipoInteresTarjeta));			
			this.jMenuItemDuplicarTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaDuplicarTipoInteresTarjeta && this.isPermisoDuplicarTipoInteresTarjeta));			
			this.jMenuItemCopiarTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaCopiarTipoInteresTarjeta && this.isPermisoCopiarTipoInteresTarjeta));			
			this.jMenuItemVerFormTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaVerFormTipoInteresTarjeta && this.isPermisoVerFormTipoInteresTarjeta));			
			this.jMenuItemAbrirOrderByTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaOrdenTipoInteresTarjeta && this.isPermisoOrdenTipoInteresTarjeta));			
			//this.jMenuItemMostrarOcultarTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaOrdenTipoInteresTarjeta && this.isPermisoOrdenTipoInteresTarjeta));
			this.jMenuItemDetalleAbrirOrderByTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaOrdenTipoInteresTarjeta && this.isPermisoOrdenTipoInteresTarjeta));			
			//this.jMenuItemDetalleMostrarOcultarTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaOrdenTipoInteresTarjeta && this.isPermisoOrdenTipoInteresTarjeta));			
			this.jMenuItemNuevoRelacionesTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta && this.isPermisoNuevoTipoInteresTarjeta));			
			this.jMenuItemNuevoGuardarCambiosTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaNuevoTipoInteresTarjeta && this.isPermisoNuevoTipoInteresTarjeta && this.isPermisoGuardarCambiosTipoInteresTarjeta));									
			
			if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) {
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jMenuItemModificarTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaModificarTipoInteresTarjeta && this.isPermisoActualizarTipoInteresTarjeta));	
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jMenuItemActualizarTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaActualizarTipoInteresTarjeta && this.isPermisoActualizarTipoInteresTarjeta));	
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jMenuItemEliminarTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaEliminarTipoInteresTarjeta && this.isPermisoEliminarTipoInteresTarjeta));
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jMenuItemCancelarTipoInteresTarjeta.setVisible(this.isVisibilidadCeldaCancelarTipoInteresTarjeta);				
			}
			
			this.jMenuItemGuardarCambiosTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaGuardarTipoInteresTarjeta && this.isPermisoGuardarCambiosTipoInteresTarjeta));						
			this.jMenuItemGuardarCambiosTablaTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoInteresTarjeta && this.isPermisoGuardarCambiosTipoInteresTarjeta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoInteresTarjeta=this.jButtonNuevoTipoInteresTarjeta.isVisible();
			this.isVisibilidadCeldaDuplicarTipoInteresTarjeta=this.jButtonDuplicarTipoInteresTarjeta.isVisible();
			this.isVisibilidadCeldaCopiarTipoInteresTarjeta=this.jButtonCopiarTipoInteresTarjeta.isVisible();
			this.isVisibilidadCeldaVerFormTipoInteresTarjeta=this.jButtonVerFormTipoInteresTarjeta.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoInteresTarjeta=this.jButtonAbrirOrderByTipoInteresTarjeta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta=this.jButtonNuevoRelacionesTipoInteresTarjeta.isVisible();
			this.isVisibilidadCeldaModificarTipoInteresTarjeta=this.jButtonModificarTipoInteresTarjeta.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) {
			this.isVisibilidadCeldaActualizarTipoInteresTarjeta=this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonActualizarTipoInteresTarjeta.isVisible();
			this.isVisibilidadCeldaEliminarTipoInteresTarjeta=this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonEliminarTipoInteresTarjeta.isVisible();
			this.isVisibilidadCeldaCancelarTipoInteresTarjeta=this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonCancelarTipoInteresTarjeta.isVisible();
			this.isVisibilidadCeldaGuardarTipoInteresTarjeta=this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonGuardarCambiosTipoInteresTarjeta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoInteresTarjeta=this.jButtonGuardarCambiosTablaTipoInteresTarjeta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoInteresTarjeta=this.jButtonNuevoToolBarTipoInteresTarjeta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta=this.jButtonNuevoRelacionesToolBarTipoInteresTarjeta.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) {
			this.isVisibilidadCeldaModificarTipoInteresTarjeta=this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonModificarToolBarTipoInteresTarjeta.isVisible();
			this.isVisibilidadCeldaActualizarTipoInteresTarjeta=this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonActualizarToolBarTipoInteresTarjeta.isVisible();
			this.isVisibilidadCeldaEliminarTipoInteresTarjeta=this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonEliminarToolBarTipoInteresTarjeta.isVisible();
			this.isVisibilidadCeldaCancelarTipoInteresTarjeta=this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonCancelarToolBarTipoInteresTarjeta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoInteresTarjeta=this.jButtonGuardarCambiosToolBarTipoInteresTarjeta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoInteresTarjeta=this.jButtonGuardarCambiosTablaToolBarTipoInteresTarjeta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoInteresTarjeta=this.jMenuItemNuevoTipoInteresTarjeta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta=this.jMenuItemNuevoRelacionesTipoInteresTarjeta.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) {
			this.isVisibilidadCeldaModificarTipoInteresTarjeta=this.jInternalFrameDetalleFormTipoInteresTarjeta.jMenuItemModificarTipoInteresTarjeta.isVisible();
			this.isVisibilidadCeldaActualizarTipoInteresTarjeta=this.jInternalFrameDetalleFormTipoInteresTarjeta.jMenuItemActualizarTipoInteresTarjeta.isVisible();
			this.isVisibilidadCeldaEliminarTipoInteresTarjeta=this.jInternalFrameDetalleFormTipoInteresTarjeta.jMenuItemEliminarTipoInteresTarjeta.isVisible();
			this.isVisibilidadCeldaCancelarTipoInteresTarjeta=this.jInternalFrameDetalleFormTipoInteresTarjeta.jMenuItemCancelarTipoInteresTarjeta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoInteresTarjeta=this.jMenuItemGuardarCambiosTipoInteresTarjeta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoInteresTarjeta=this.jMenuItemGuardarCambiosTablaTipoInteresTarjeta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoInteresTarjeta(Boolean esInicializar) {
		if(TipoInteresTarjetaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipointerestarjetaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoInteresTarjeta();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoInteresTarjeta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoInteresTarjeta() {
		this.jButtonNuevoTipoInteresTarjeta.setVisible(this.isPermisoNuevoTipoInteresTarjeta);			
		this.jButtonDuplicarTipoInteresTarjeta.setVisible(this.isPermisoDuplicarTipoInteresTarjeta);			
		this.jButtonCopiarTipoInteresTarjeta.setVisible(this.isPermisoCopiarTipoInteresTarjeta);			
		this.jButtonVerFormTipoInteresTarjeta.setVisible(this.isPermisoVerFormTipoInteresTarjeta);			
		
		this.jButtonAbrirOrderByTipoInteresTarjeta.setVisible(this.isPermisoOrdenTipoInteresTarjeta);					
		
		this.jButtonNuevoRelacionesTipoInteresTarjeta.setVisible(this.isPermisoNuevoTipoInteresTarjeta);			
		
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonModificarTipoInteresTarjeta.setVisible(this.isPermisoActualizarTipoInteresTarjeta);	
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonActualizarTipoInteresTarjeta.setVisible(this.isPermisoActualizarTipoInteresTarjeta);	
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonEliminarTipoInteresTarjeta.setVisible(this.isPermisoEliminarTipoInteresTarjeta);
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonCancelarTipoInteresTarjeta.setVisible(this.isVisibilidadCeldaCancelarTipoInteresTarjeta);						
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonGuardarCambiosTipoInteresTarjeta.setVisible(this.isPermisoGuardarCambiosTipoInteresTarjeta);							
		}
		
		this.jButtonGuardarCambiosTablaTipoInteresTarjeta.setVisible(this.isPermisoActualizarTipoInteresTarjeta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoInteresTarjeta() {
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonModificarTipoInteresTarjeta.setVisible(this.isPermisoActualizarTipoInteresTarjeta);	
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonActualizarTipoInteresTarjeta.setVisible(this.isPermisoActualizarTipoInteresTarjeta);	
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonEliminarTipoInteresTarjeta.setVisible(this.isPermisoEliminarTipoInteresTarjeta);
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonCancelarTipoInteresTarjeta.setVisible(this.isVisibilidadCeldaCancelarTipoInteresTarjeta);							
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonGuardarCambiosTipoInteresTarjeta.setVisible((this.isVisibilidadCeldaGuardarTipoInteresTarjeta && this.isPermisoGuardarCambiosTipoInteresTarjeta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoInteresTarjeta() {
		if(TipoInteresTarjetaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoInteresTarjeta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoInteresTarjeta() {
	}
	
	public void jTableDatosTipoInteresTarjetaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoInteresTarjeta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoInteresTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoInteresTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoInteresTarjeta(this.gettipointerestarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInteresTarjeta(this.tipointerestarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipointerestarjeta==null) {
						this.tipointerestarjeta = new TipoInteresTarjeta();
					}

					this.setVariablesFormularioToObjetoActualTipoInteresTarjeta(this.tipointerestarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInteresTarjeta(this.tipointerestarjeta);
				}

				if(this.tipointerestarjeta.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipointerestarjeta.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoInteresTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoInteresTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoInteresTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoInteresTarjeta(this.gettipointerestarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInteresTarjeta(this.tipointerestarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipointerestarjeta==null) {
						this.tipointerestarjeta = new TipoInteresTarjeta();
					}

					this.setVariablesFormularioToObjetoActualTipoInteresTarjeta(this.tipointerestarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInteresTarjeta(this.tipointerestarjeta);
				}

				if(this.tipointerestarjeta.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipointerestarjeta.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoInteresTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTipoInteresTarjetaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjetaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoInteresTarjeta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoInteresTarjeta(this.gettipointerestarjeta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInteresTarjeta(this.tipointerestarjeta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipointerestarjeta==null) {
						this.tipointerestarjeta = new TipoInteresTarjeta();
					}

					this.setVariablesFormularioToObjetoActualTipoInteresTarjeta(this.tipointerestarjeta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInteresTarjeta(this.tipointerestarjeta);
				}

				if(this.tipointerestarjeta.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.tipointerestarjeta.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoInteresTarjeta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjetaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjetaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjetaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoInteresTarjeta() {
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) {
		

		if(this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) {
			this.jInternalFrameDetalleFormTipoInteresTarjeta.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoInteresTarjeta.dispose();
			this.jInternalFrameDetalleFormTipoInteresTarjeta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoInteresTarjeta!=null) {
			this.jInternalFrameReporteDinamicoTipoInteresTarjeta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoInteresTarjeta.dispose();
			this.jInternalFrameReporteDinamicoTipoInteresTarjeta=null;
		}
		
		if(this.jInternalFrameImportacionTipoInteresTarjeta!=null) {
			this.jInternalFrameImportacionTipoInteresTarjeta.setVisible(false);	    			
			this.jInternalFrameImportacionTipoInteresTarjeta.dispose();
			this.jInternalFrameImportacionTipoInteresTarjeta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoInteresTarjeta();
			
			TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoInteresTarjeta")) {
				jButtonNuevoTipoInteresTarjetaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoInteresTarjeta")) {
				jButtonDuplicarTipoInteresTarjetaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoInteresTarjeta")) {
				jButtonCopiarTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoInteresTarjeta")) {
				jButtonVerFormTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoInteresTarjeta")) {
				jButtonNuevoTipoInteresTarjetaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoInteresTarjeta")) {
				jButtonDuplicarTipoInteresTarjetaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoInteresTarjeta")) {
				jButtonNuevoTipoInteresTarjetaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoInteresTarjeta")) {
				jButtonDuplicarTipoInteresTarjetaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoInteresTarjeta")) {
				jButtonNuevoTipoInteresTarjetaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoInteresTarjeta")) {
				jButtonNuevoTipoInteresTarjetaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoInteresTarjeta")) {
				jButtonNuevoTipoInteresTarjetaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoInteresTarjeta")) {
				jButtonModificarTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoInteresTarjeta")) {
				jButtonModificarTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoInteresTarjeta")) {
				jButtonModificarTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoInteresTarjeta")) {
				jButtonActualizarTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoInteresTarjeta")) {
				jButtonActualizarTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoInteresTarjeta")) {
				jButtonActualizarTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoInteresTarjeta")) {
				jButtonEliminarTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoInteresTarjeta")) {
				jButtonEliminarTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoInteresTarjeta")) {
				jButtonEliminarTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoInteresTarjeta")) {
				jButtonCancelarTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoInteresTarjeta")) {
				jButtonCancelarTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoInteresTarjeta")) {
				jButtonCancelarTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoInteresTarjeta")) {
				jButtonCerrarTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoInteresTarjeta")) {
				jButtonCerrarTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoInteresTarjeta")) {
				jButtonCerrarTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoInteresTarjeta")) {
				jButtonMostrarOcultarTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoInteresTarjeta")) {
				jButtonCancelarTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoInteresTarjeta")) {
				jButtonGuardarCambiosTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoInteresTarjeta")) {
				jButtonGuardarCambiosTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoInteresTarjeta")) {
				jButtonCopiarTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoInteresTarjeta")) {
				jButtonVerFormTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoInteresTarjeta")) {
				jButtonGuardarCambiosTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoInteresTarjeta")) {
				jButtonCopiarTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoInteresTarjeta")) {
				jButtonVerFormTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoInteresTarjeta")) {
				jButtonGuardarCambiosTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoInteresTarjeta")) {
				jButtonGuardarCambiosTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoInteresTarjeta")) {
				jButtonGuardarCambiosTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoInteresTarjeta")) {
				jButtonRecargarInformacionTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoInteresTarjeta")) {
				jButtonRecargarInformacionTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoInteresTarjeta")) {
				jButtonRecargarInformacionTipoInteresTarjetaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoInteresTarjeta")) {
				jButtonAnterioresTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoInteresTarjeta")) {
				jButtonAnterioresTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoInteresTarjeta")) {
				jButtonAnterioresTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoInteresTarjeta")) {
				jButtonSiguientesTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoInteresTarjeta")) {
				jButtonSiguientesTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoInteresTarjeta")) {
				jButtonSiguientesTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoInteresTarjeta") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoInteresTarjeta")) {
				jButtonAbrirOrderByTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoInteresTarjeta") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoInteresTarjeta")) {
				jButtonMostrarOcultarTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoInteresTarjeta")) {
				jButtonNuevoGuardarCambiosTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoInteresTarjeta")) {
				jButtonNuevoGuardarCambiosTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoInteresTarjeta")) {
				jButtonNuevoGuardarCambiosTipoInteresTarjetaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoInteresTarjeta")) {
				jButtonCerrarReporteDinamicoTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoInteresTarjeta")) {
				jButtonGenerarReporteDinamicoTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoInteresTarjeta")) {
				
				jButtonGenerarExcelReporteDinamicoTipoInteresTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoInteresTarjeta")) {
				jButtonCerrarImportacionTipoInteresTarjetaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoInteresTarjeta")) {
				
				jButtonGenerarImportacionTipoInteresTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoInteresTarjeta")) {
				
				jButtonAbrirImportacionTipoInteresTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoInteresTarjeta")) {
				jComboBoxTiposAccionesTipoInteresTarjetaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoInteresTarjeta")) {
				jComboBoxTiposRelacionesTipoInteresTarjetaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoInteresTarjeta")) {
				jComboBoxTiposAccionesTipoInteresTarjetaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoInteresTarjeta")) {
				
				jComboBoxTiposSeleccionarTipoInteresTarjetaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoInteresTarjeta")) {
				jTextFieldValorCampoGeneralTipoInteresTarjetaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoInteresTarjeta")) {
				jButtonAbrirOrderByTipoInteresTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoInteresTarjeta")) {
				jButtonAbrirOrderByTipoInteresTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoInteresTarjeta")) {
				jButtonCerrarOrderByTipoInteresTarjetaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoInteresTarjetaBusqueda")) {
				this.jButtonidTipoInteresTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoInteresTarjetaBusqueda")) {
				this.jButtonnombreTipoInteresTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoInteresTarjetaBusqueda")) {
				this.jButtondescripcionTipoInteresTarjetaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoInteresTarjeta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInteresTarjetaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointerestarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipointerestarjeta);
				
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
				
				


				
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInteresTarjeta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInteresTarjeta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoInteresTarjeta tipointerestarjetaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipointerestarjetaLocal=this.tipointerestarjeta;
			} else {
				tipointerestarjetaLocal=this.tipointerestarjetaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointerestarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipointerestarjeta);
				
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
							
				
				


				
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInteresTarjeta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInteresTarjeta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInteresTarjetaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInteresTarjeta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjetaAnterior =(TipoInteresTarjeta) this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipointerestarjetaAnterior =(TipoInteresTarjeta) this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
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
			
			TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
			
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
			
			


			
			TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInteresTarjetaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointerestarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipointerestarjeta);
				
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
								
						
				


				
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInteresTarjeta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInteresTarjeta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointerestarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipointerestarjeta);
				
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
								
				
				


				
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInteresTarjeta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInteresTarjeta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInteresTarjetaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInteresTarjeta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjetaAnterior =(TipoInteresTarjeta) this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipointerestarjetaAnterior =(TipoInteresTarjeta) this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointerestarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipointerestarjeta);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInteresTarjetaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInteresTarjeta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjetaAnterior =(TipoInteresTarjeta) this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipointerestarjetaAnterior =(TipoInteresTarjeta) this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInteresTarjetaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointerestarjeta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipointerestarjeta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointerestarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipointerestarjeta);
				
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
							
				
				


				
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInteresTarjeta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInteresTarjeta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInteresTarjetaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoInteresTarjeta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipointerestarjetaAnterior =(TipoInteresTarjeta) this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipointerestarjetaAnterior =(TipoInteresTarjeta) this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
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
			
			TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
			
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
			
			


			
			TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInteresTarjetaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointerestarjeta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipointerestarjeta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointerestarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipointerestarjeta);
				
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
								
				
				


				
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInteresTarjeta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInteresTarjeta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInteresTarjetaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInteresTarjeta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjetaAnterior =(TipoInteresTarjeta) this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipointerestarjetaAnterior =(TipoInteresTarjeta) this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInteresTarjetaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointerestarjeta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipointerestarjeta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInteresTarjetaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointerestarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipointerestarjeta);
				
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoInteresTarjeta")) {
					jCheckBoxSeleccionarTodosTipoInteresTarjetaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoInteresTarjeta")) {
					jCheckBoxSeleccionadosTipoInteresTarjetaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoInteresTarjeta")) {
					
				}
				
				


				
				
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInteresTarjeta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInteresTarjeta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointerestarjeta);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipointerestarjeta);
				
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
												
				
				


				
				
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInteresTarjeta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInteresTarjeta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInteresTarjetaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoInteresTarjeta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipointerestarjetaAnterior =(TipoInteresTarjeta) this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipointerestarjetaAnterior =(TipoInteresTarjeta) this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInteresTarjetaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointerestarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipointerestarjeta);
				
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
				
				
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
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
			
			TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
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
			
			


			
			TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInteresTarjetaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointerestarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipointerestarjeta);
				
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInteresTarjeta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInteresTarjeta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointerestarjeta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipointerestarjeta);
				
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
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
				
				


				
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInteresTarjeta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInteresTarjeta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInteresTarjetaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInteresTarjeta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointerestarjetaAnterior =(TipoInteresTarjeta) this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipointerestarjetaAnterior =(TipoInteresTarjeta) this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoInteresTarjeta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoInteresTarjetaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoInteresTarjeta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipointerestarjeta =(TipoInteresTarjeta) this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipointerestarjeta);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoInteresTarjeta")) {
				
				}
				
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoInteresTarjeta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoInteresTarjeta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoInteresTarjeta")) {
			
			}
			
			TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoInteresTarjeta();
			
			TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoInteresTarjeta")) {
				jButtonNuevoTipoInteresTarjetaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoInteresTarjeta")) {
				jButtonDuplicarTipoInteresTarjetaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoInteresTarjeta")) {
				jButtonCopiarTipoInteresTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoInteresTarjeta")) {
				jButtonVerFormTipoInteresTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoInteresTarjeta")) {
				jButtonNuevoTipoInteresTarjetaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoInteresTarjeta")) {
				jButtonModificarTipoInteresTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoInteresTarjeta")) {
				jButtonActualizarTipoInteresTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoInteresTarjeta")) {
				jButtonEliminarTipoInteresTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoInteresTarjeta")) {
				jButtonGuardarCambiosTipoInteresTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoInteresTarjeta")) {
				jButtonCancelarTipoInteresTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoInteresTarjeta")) {
				jButtonCerrarTipoInteresTarjetaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoInteresTarjeta")) {
				jButtonGuardarCambiosTipoInteresTarjetaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoInteresTarjeta")) {
				jButtonNuevoGuardarCambiosTipoInteresTarjetaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoInteresTarjeta")) {
				jButtonAbrirOrderByTipoInteresTarjetaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoInteresTarjeta")) {
				jButtonRecargarInformacionTipoInteresTarjetaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoInteresTarjeta")) {
				jButtonAnterioresTipoInteresTarjetaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoInteresTarjeta")) {
				jButtonSiguientesTipoInteresTarjetaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoInteresTarjetaBusqueda")) {
				this.jButtonidTipoInteresTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoInteresTarjetaBusqueda")) {
				this.jButtonnombreTipoInteresTarjetaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoInteresTarjetaBusqueda")) {
				this.jButtondescripcionTipoInteresTarjetaBusquedaActionPerformed(evt);
			}
			
			TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoInteresTarjeta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoInteresTarjeta")) {
				closingInternalFrameTipoInteresTarjeta();
				
			} else if(sTipo.equals("jButtonCancelarTipoInteresTarjeta")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoInteresTarjeta = (JInternalFrameBase)evt.getSource();
	            	
	            TipoInteresTarjetaBeanSwingJInternalFrame jInternalFrameParent=(TipoInteresTarjetaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoInteresTarjeta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoInteresTarjetaActionPerformed(null);
			}
			
			TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipointerestarjeta,new Object(),this.tipointerestarjetaParameterGeneral,this.tipointerestarjetaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoInteresTarjeta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoInteresTarjeta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoInteresTarjeta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipointerestarjeta)) {
			if(!esControlTabla) {
				if(TipoInteresTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoInteresTarjeta(this.tipointerestarjeta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInteresTarjeta(this.tipointerestarjeta);			
				}
				
				if(this.tipointerestarjetaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoInteresTarjeta(this.tipointerestarjeta,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipointerestarjetaReturnGeneral=tipointerestarjetaLogic.procesarEventosTipoInteresTarjetasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipointerestarjetaLogic.getTipoInteresTarjetas(),this.tipointerestarjeta,this.tipointerestarjetaParameterGeneral,this.isEsNuevoTipoInteresTarjeta,classes);//this.tipointerestarjetaLogic.getTipoInteresTarjeta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoInteresTarjeta(this.tipointerestarjetaReturnGeneral,this.tipointerestarjetaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipointerestarjetaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoInteresTarjeta(classes,this.tipointerestarjetaReturnGeneral,this.tipointerestarjetaBean,false);
					}
						
					if(this.tipointerestarjetaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoInteresTarjeta(this.tipointerestarjetaReturnGeneral.getTipoInteresTarjeta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoInteresTarjeta(this.tipointerestarjetaReturnGeneral.getTipoInteresTarjeta());	
					}
						
					if(this.tipointerestarjetaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoInteresTarjeta(this.tipointerestarjetaReturnGeneral.getTipoInteresTarjeta(),classes);//this.tipointerestarjetaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoInteresTarjeta(this.tipointerestarjeta,classes);//this.tipointerestarjetaBean);									
				}
			
				if(TipoInteresTarjetaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoInteresTarjeta(this.tipointerestarjeta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInteresTarjeta(this.tipointerestarjeta);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipointerestarjetaAnterior!=null) {
						this.tipointerestarjeta=this.tipointerestarjetaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipointerestarjetaReturnGeneral=tipointerestarjetaLogic.procesarEventosTipoInteresTarjetasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipointerestarjetaLogic.getTipoInteresTarjetas(),this.tipointerestarjeta,this.tipointerestarjetaParameterGeneral,this.isEsNuevoTipoInteresTarjeta,classes);//this.tipointerestarjetaLogic.getTipoInteresTarjeta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipointerestarjetaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipointerestarjetaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipointerestarjetaReturnGeneral.getTipoInteresTarjeta(),tipointerestarjetaLogic.getTipoInteresTarjetas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipointerestarjetaReturnGeneral.getTipoInteresTarjeta(),this.tipointerestarjetas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoInteresTarjeta.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoInteresTarjeta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoInteresTarjeta();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoInteresTarjeta() throws Exception {
		
		TipoInteresTarjetaModel tipointerestarjetaModel=(TipoInteresTarjetaModel)this.jTableDatosTipoInteresTarjeta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipointerestarjetaModel.tipointerestarjetas=this.tipointerestarjetaLogic.getTipoInteresTarjetas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipointerestarjetaModel.tipointerestarjetas=this.tipointerestarjetas;
		}
		
		
		((TipoInteresTarjetaModel) this.jTableDatosTipoInteresTarjeta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoInteresTarjeta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipointerestarjetaAnterior(),this.tipointerestarjetaLogic.getTipoInteresTarjetas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipointerestarjetaAnterior(),this.tipointerestarjetas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoInteresTarjeta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoInteresTarjeta(TipoInteresTarjeta tipointerestarjeta,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FormaPagoPuntoVenta.class)) {
					this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.setFormaPagoPuntoVentas(tipointerestarjeta.getFormaPagoPuntoVentas());
					this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormaPagoPuntoVenta(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
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
										
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipointerestarjeta,new Object(),generalEntityParameterGeneral,this.tipointerestarjetaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipointerestarjetaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoInteresTarjetaConstantesFunciones.getClassesRelationshipsOfTipoInteresTarjeta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoInteresTarjetaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoInteresTarjeta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoInteresTarjeta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoInteresTarjetaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipointerestarjeta,new Object(),generalEntityParameterGeneral,this.tipointerestarjetaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoInteresTarjeta(TipoInteresTarjetaBean tipointerestarjetaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FormaPagoPuntoVenta.class)) {
					this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.setFormaPagoPuntoVentas(tipointerestarjeta.getFormaPagoPuntoVentas());
					this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormaPagoPuntoVenta(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoInteresTarjeta(ArrayList<Classe> classes,TipoInteresTarjetaReturnGeneral tipointerestarjetaReturnGeneral,TipoInteresTarjetaBean tipointerestarjetaBean,Boolean conDefault) throws Exception {
		
			this.tipointerestarjetaBean.setFormaPagoPuntoVentas(tipointerestarjetaReturnGeneral.getTipoInteresTarjeta().getFormaPagoPuntoVentas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoInteresTarjeta(TipoInteresTarjeta tipointerestarjeta,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(FormaPagoPuntoVenta.class)) {
					tipointerestarjeta.setFormaPagoPuntoVentas(this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaLogic.getFormaPagoPuntoVentas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipointerestarjeta)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoInteresTarjeta = new TipoInteresTarjetaDetalleFormJInternalFrame(jDesktopPane,this.tipointerestarjetaSessionBean.getConGuardarRelaciones(),this.tipointerestarjetaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoInteresTarjeta);
		this.jInternalFrameDetalleFormTipoInteresTarjeta.setVisible(false);
		this.jInternalFrameDetalleFormTipoInteresTarjeta.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoInteresTarjeta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoInteresTarjeta.tipointerestarjetaLogic=this.tipointerestarjetaLogic;
		
		this.cargarCombosFrameForeignKeyTipoInteresTarjeta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoInteresTarjeta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoInteresTarjeta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoInteresTarjeta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoInteresTarjeta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoInteresTarjeta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoInteresTarjeta"));
		
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonModificarTipoInteresTarjeta.addActionListener(new ButtonActionListener(this,"ModificarTipoInteresTarjeta"));

		
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonModificarToolBarTipoInteresTarjeta.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoInteresTarjeta"));
					
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jMenuItemModificarTipoInteresTarjeta.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoInteresTarjeta"));		
		
		
		
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonActualizarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"ActualizarTipoInteresTarjeta"));
		
		
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonActualizarToolBarTipoInteresTarjeta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoInteresTarjeta"));
						
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jMenuItemActualizarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoInteresTarjeta"));		
		
		
		
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonEliminarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"EliminarTipoInteresTarjeta"));
		
		
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonEliminarToolBarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoInteresTarjeta"));
								
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jMenuItemEliminarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoInteresTarjeta"));		
		
		
		
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonCancelarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"CancelarTipoInteresTarjeta"));
		
		
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonCancelarToolBarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoInteresTarjeta"));
					
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jMenuItemCancelarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoInteresTarjeta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jMenuItemDetalleCerrarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoInteresTarjeta"));		
		
		
		
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonGuardarCambiosToolBarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoInteresTarjeta"));
		
		
		
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonGuardarCambiosToolBarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoInteresTarjeta"));
		
		
		
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jComboBoxTiposAccionesFormularioTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoInteresTarjeta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonidTipoInteresTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoInteresTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonnombreTipoInteresTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoInteresTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtondescripcionTipoInteresTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoInteresTarjetaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jTabbedPaneRelacionesTipoInteresTarjeta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoInteresTarjeta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoInteresTarjeta"));
		
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInteresTarjeta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoInteresTarjeta"));
		}
		
		this.jTableDatosTipoInteresTarjeta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoInteresTarjeta"));
		
		this.jTableDatosTipoInteresTarjeta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoInteresTarjeta"));
		
		this.jButtonNuevoTipoInteresTarjeta.addActionListener(new ButtonActionListener(this,"NuevoTipoInteresTarjeta"));
		
		this.jButtonDuplicarTipoInteresTarjeta.addActionListener(new ButtonActionListener(this,"DuplicarTipoInteresTarjeta"));
		
		this.jButtonCopiarTipoInteresTarjeta.addActionListener(new ButtonActionListener(this,"CopiarTipoInteresTarjeta"));
		
		this.jButtonVerFormTipoInteresTarjeta.addActionListener(new ButtonActionListener(this,"VerFormTipoInteresTarjeta"));
		
		
		this.jButtonNuevoToolBarTipoInteresTarjeta.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoInteresTarjeta"));
			
		this.jButtonDuplicarToolBarTipoInteresTarjeta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoInteresTarjeta"));
			
		this.jMenuItemNuevoTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoInteresTarjeta"));
			
		this.jMenuItemDuplicarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoInteresTarjeta"));		
		
		
		this.jButtonNuevoRelacionesTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoInteresTarjeta"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoInteresTarjeta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoInteresTarjeta"));
			
		this.jMenuItemNuevoRelacionesTipoInteresTarjeta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoInteresTarjeta"));		
		
		
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonModificarTipoInteresTarjeta.addActionListener(new ButtonActionListener(this,"ModificarTipoInteresTarjeta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonModificarToolBarTipoInteresTarjeta.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoInteresTarjeta"));
			
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jMenuItemModificarTipoInteresTarjeta.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoInteresTarjeta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonActualizarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"ActualizarTipoInteresTarjeta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonActualizarToolBarTipoInteresTarjeta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoInteresTarjeta"));
				
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jMenuItemActualizarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoInteresTarjeta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonEliminarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"EliminarTipoInteresTarjeta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonEliminarToolBarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoInteresTarjeta"));
						
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jMenuItemEliminarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoInteresTarjeta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonCancelarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"CancelarTipoInteresTarjeta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonCancelarToolBarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoInteresTarjeta"));
			
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jMenuItemCancelarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoInteresTarjeta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoInteresTarjeta"));		
		
		
		this.jButtonCerrarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"CerrarTipoInteresTarjeta"));
		
		
		this.jButtonCerrarToolBarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoInteresTarjeta"));
			
		this.jMenuItemCerrarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoInteresTarjeta"));
			
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jMenuItemDetalleCerrarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoInteresTarjeta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonGuardarCambiosTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoInteresTarjeta"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonGuardarCambiosToolBarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoInteresTarjeta"));
		}
		
		this.jButtonCopiarToolBarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoInteresTarjeta"));
			
		this.jButtonVerFormToolBarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoInteresTarjeta"));
		
		this.jMenuItemGuardarCambiosTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoInteresTarjeta"));
			
		this.jMenuItemCopiarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoInteresTarjeta"));		
		
		this.jMenuItemVerFormTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoInteresTarjeta"));		
		
		
		this.jButtonGuardarCambiosTablaTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoInteresTarjeta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoInteresTarjeta"));
			
		this.jMenuItemGuardarCambiosTablaTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoInteresTarjeta"));		
		
		
		
		this.jButtonRecargarInformacionTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoInteresTarjeta"));
					
		this.jButtonRecargarInformacionToolBarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoInteresTarjeta"));
		
		this.jMenuItemRecargarInformacionTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoInteresTarjeta"));		
		
		
		
		this.jButtonAnterioresTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"AnterioresTipoInteresTarjeta"));
		
		
		this.jButtonAnterioresToolBarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoInteresTarjeta"));
		
		this.jMenuItemAnterioresTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoInteresTarjeta"));		
		
		
		this.jButtonSiguientesTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"SiguientesTipoInteresTarjeta"));
		
		
		this.jButtonSiguientesToolBarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoInteresTarjeta"));
			
		this.jMenuItemSiguientesTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoInteresTarjeta"));
			
		this.jMenuItemAbrirOrderByTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoInteresTarjeta"));
			
		this.jMenuItemMostrarOcultarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoInteresTarjeta"));
			
		this.jMenuItemDetalleAbrirOrderByTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoInteresTarjeta"));
			
		this.jMenuItemDetalleMostarOcultarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoInteresTarjeta"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoInteresTarjeta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoInteresTarjeta"));
			
		this.jMenuItemNuevoGuardarCambiosTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoInteresTarjeta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoInteresTarjeta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoInteresTarjeta"));

		this.jCheckBoxSeleccionadosTipoInteresTarjeta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoInteresTarjeta"));
		
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jComboBoxTiposAccionesFormularioTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoInteresTarjeta"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoInteresTarjeta"));
			
		this.jComboBoxTiposAccionesTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoInteresTarjeta"));
					
		this.jComboBoxTiposSeleccionarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoInteresTarjeta"));
			
		this.jTextFieldValorCampoGeneralTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoInteresTarjeta"));		
		
		
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonidTipoInteresTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoInteresTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonnombreTipoInteresTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoInteresTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtondescripcionTipoInteresTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoInteresTarjetaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoInteresTarjeta!=null) {
				this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoInteresTarjeta"));
				this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoInteresTarjeta"));
				this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoInteresTarjeta"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoInteresTarjeta"));				
			//this.jButtonGenerarReporteDinamicoTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoInteresTarjeta"));
			//this.jButtonGenerarExcelReporteDinamicoTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoInteresTarjeta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoInteresTarjeta!=null) {
				this.jInternalFrameImportacionTipoInteresTarjeta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoInteresTarjeta"));
				this.jInternalFrameImportacionTipoInteresTarjeta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoInteresTarjeta"));
				this.jInternalFrameImportacionTipoInteresTarjeta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoInteresTarjeta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoInteresTarjeta"));
			
			this.jButtonAbrirOrderByToolBarTipoInteresTarjeta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoInteresTarjeta"));			
			
			if(this.jInternalFrameOrderByTipoInteresTarjeta!=null) {
				this.jInternalFrameOrderByTipoInteresTarjeta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoInteresTarjeta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInteresTarjeta.jTabbedPaneRelacionesTipoInteresTarjeta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoInteresTarjeta"));
		
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
            		closingInternalFrameTipoInteresTarjeta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoInteresTarjeta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoInteresTarjeta = (JInternalFrameBase)event.getSource();
	            	
	            TipoInteresTarjetaBeanSwingJInternalFrame jInternalFrameParent=(TipoInteresTarjetaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoInteresTarjeta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoInteresTarjetaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoInteresTarjeta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoInteresTarjetaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoInteresTarjeta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoInteresTarjeta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInteresTarjetaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInteresTarjetaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInteresTarjetaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoInteresTarjeta";
		inputMap = this.jButtonNuevoTipoInteresTarjeta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoInteresTarjeta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoInteresTarjetaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInteresTarjetaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInteresTarjetaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInteresTarjetaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoInteresTarjeta";
		inputMap = this.jButtonNuevoRelacionesTipoInteresTarjeta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoInteresTarjeta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoInteresTarjetaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoInteresTarjeta";
		inputMap = this.jButtonModificarTipoInteresTarjeta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoInteresTarjeta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoInteresTarjetaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoInteresTarjeta";
		inputMap = this.jButtonActualizarTipoInteresTarjeta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoInteresTarjeta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoInteresTarjetaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoInteresTarjeta";
		inputMap = this.jButtonEliminarTipoInteresTarjeta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoInteresTarjeta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoInteresTarjetaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoInteresTarjeta";
		inputMap = this.jButtonCancelarTipoInteresTarjeta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoInteresTarjeta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoInteresTarjetaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoInteresTarjeta";
		inputMap = this.jButtonCerrarTipoInteresTarjeta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoInteresTarjeta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoInteresTarjetaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonGuardarCambiosTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoInteresTarjeta";
		inputMap = this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonGuardarCambiosTipoInteresTarjeta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonGuardarCambiosTipoInteresTarjeta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoInteresTarjetaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoInteresTarjeta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoInteresTarjetaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoInteresTarjeta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoInteresTarjetaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoInteresTarjeta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoInteresTarjetaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoInteresTarjeta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoInteresTarjetaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonidTipoInteresTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoInteresTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtonnombreTipoInteresTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoInteresTarjetaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jButtondescripcionTipoInteresTarjetaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoInteresTarjetaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoInteresTarjeta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoInteresTarjetaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoInteresTarjetaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoInteresTarjeta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoInteresTarjeta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoInteresTarjeta tipointerestarjetaAux:this.tipointerestarjetaLogic.getTipoInteresTarjetas()) {
					tipointerestarjetaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoInteresTarjeta tipointerestarjetaAux:tipointerestarjetas) {
					tipointerestarjetaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoInteresTarjetaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoInteresTarjeta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoInteresTarjeta tipointerestarjetaAux:this.tipointerestarjetaLogic.getTipoInteresTarjetas()) {
						tipointerestarjetaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoInteresTarjeta tipointerestarjetaAux:tipointerestarjetas) {
						tipointerestarjetaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoInteresTarjeta tipointerestarjetaAux:this.tipointerestarjetaLogic.getTipoInteresTarjetas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoInteresTarjeta tipointerestarjetaAux:tipointerestarjetas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoInteresTarjeta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoInteresTarjeta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoInteresTarjeta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoInteresTarjeta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoInteresTarjetaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoInteresTarjeta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoInteresTarjeta.getSelectedRows();
			
			TipoInteresTarjeta tipointerestarjetaLocal=new TipoInteresTarjeta();
			
			//this.seleccionarTodosTipoInteresTarjeta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipointerestarjetaLocal =(TipoInteresTarjeta) this.tipointerestarjetaLogic.getTipoInteresTarjetas().toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipointerestarjetaLocal =(TipoInteresTarjeta) this.tipointerestarjetas.toArray()[this.jTableDatosTipoInteresTarjeta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipointerestarjetaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoInteresTarjeta tipointerestarjetaAux:this.tipointerestarjetaLogic.getTipoInteresTarjetas()) {
						tipointerestarjetaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoInteresTarjeta tipointerestarjetaAux:tipointerestarjetas) {
						tipointerestarjetaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoInteresTarjeta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoInteresTarjeta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoInteresTarjeta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoInteresTarjeta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoInteresTarjetaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoInteresTarjetaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoInteresTarjetaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoInteresTarjeta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoInteresTarjeta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoInteresTarjeta tipointerestarjetaAux:this.tipointerestarjetaLogic.getTipoInteresTarjetas()) {
				
						if(sTipoSeleccionar.equals(TipoInteresTarjetaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipointerestarjetaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoInteresTarjetaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipointerestarjetaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoInteresTarjeta tipointerestarjetaAux:tipointerestarjetas) {
					
						if(sTipoSeleccionar.equals(TipoInteresTarjetaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipointerestarjetaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoInteresTarjetaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipointerestarjetaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoInteresTarjeta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoInteresTarjetaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoInteresTarjeta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoInteresTarjeta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoInteresTarjeta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoInteresTarjeta.jComboBoxTiposAccionesFormularioTipoInteresTarjeta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoInteresTarjeta) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoInteresTarjeta(conSplash);
				
					this.generarReporteTipoInteresTarjetasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoInteresTarjeta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoInteresTarjeta.jComboBoxTiposAccionesFormularioTipoInteresTarjeta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoInteresTarjetasSeleccionados();
				//this.jComboBoxTiposAccionesTipoInteresTarjeta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoInteresTarjetasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoInteresTarjeta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoInteresTarjetasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoInteresTarjeta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoInteresTarjeta();
				
				this.exportarTipoInteresTarjetasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoInteresTarjeta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoInteresTarjeta.jComboBoxTiposAccionesFormularioTipoInteresTarjeta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoInteresTarjetas();
				//this.importarTipoInteresTarjetas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoInteresTarjeta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoInteresTarjeta.jComboBoxTiposAccionesFormularioTipoInteresTarjeta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoInteresTarjeta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoInteresTarjetasSeleccionados();
				//this.jComboBoxTiposAccionesTipoInteresTarjeta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Interes Tarjeta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoInteresTarjeta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoInteresTarjeta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoInteresTarjeta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Interes Tarjeta",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoInteresTarjeta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoInteresTarjeta.jComboBoxTiposAccionesFormularioTipoInteresTarjeta.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoInteresTarjeta();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoInteresTarjeta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoInteresTarjetaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoInteresTarjeta();
			
			if(this.jInternalFrameDetalleFormTipoInteresTarjeta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoInteresTarjeta> tipointerestarjetasSeleccionados=new ArrayList<TipoInteresTarjeta>();		
			TipoInteresTarjeta tipointerestarjeta=new TipoInteresTarjeta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoInteresTarjeta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoInteresTarjeta.getSelectedItem();
			
			
			
			
			tipointerestarjetasSeleccionados=this.getTipoInteresTarjetasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipointerestarjetasSeleccionados.size()==1) {
				for(TipoInteresTarjeta tipointerestarjetaAux:tipointerestarjetasSeleccionados) {
					tipointerestarjeta=tipointerestarjetaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Forma Pago")) {
					jButtonFormaPagoPuntoVentaActionPerformed(null,rowIndex,true,false,tipointerestarjeta);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoInteresTarjeta();
			
      		//this.finishProcessTipoInteresTarjeta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoInteresTarjetaReturnGeneral() throws Exception {
		if(this.tipointerestarjetaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipointerestarjetaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipointerestarjetaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipointerestarjetaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipointerestarjetaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipointerestarjetaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoInteresTarjeta(false);
		}
		
		if(this.tipointerestarjetaReturnGeneral.getConRetornoLista() || this.tipointerestarjetaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipointerestarjetaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipointerestarjetaLogic.setTipoInteresTarjetas(this.tipointerestarjetaReturnGeneral.getTipoInteresTarjetas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipointerestarjetaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipointerestarjetaLogic.setTipoInteresTarjeta(this.tipointerestarjetaReturnGeneral.getTipoInteresTarjeta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoInteresTarjeta(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoInteresTarjeta() throws Exception {
		
		
	}
	
	public ArrayList<TipoInteresTarjeta> getTipoInteresTarjetasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoInteresTarjeta> tipointerestarjetasSeleccionados=new ArrayList<TipoInteresTarjeta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoInteresTarjeta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoInteresTarjeta tipointerestarjetaAux:tipointerestarjetaLogic.getTipoInteresTarjetas()) {
					if(tipointerestarjetaAux.getIsSelected()) {
						tipointerestarjetasSeleccionados.add(tipointerestarjetaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoInteresTarjeta tipointerestarjetaAux:this.tipointerestarjetas) {
					if(tipointerestarjetaAux.getIsSelected()) {
						tipointerestarjetasSeleccionados.add(tipointerestarjetaAux);				
					}
				}
			}
			
			if(tipointerestarjetasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipointerestarjetasSeleccionados.addAll(this.tipointerestarjetaLogic.getTipoInteresTarjetas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipointerestarjetasSeleccionados.addAll(this.tipointerestarjetas);				
					}
				}
			}
		} else {
			tipointerestarjetasSeleccionados.add(this.tipointerestarjeta);
		}
		
		return tipointerestarjetasSeleccionados;
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
	
	public void generarReporteTipoInteresTarjetasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoInteresTarjetasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoInteresTarjetasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoInteresTarjetasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoInteresTarjetasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoInteresTarjetasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Interes Tarjeta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoInteresTarjetasSeleccionados() throws Exception {
		ArrayList<TipoInteresTarjeta> tipointerestarjetasSeleccionados=new ArrayList<TipoInteresTarjeta>();		
		
		tipointerestarjetasSeleccionados=this.getTipoInteresTarjetasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoInteresTarjetas("Todos",tipointerestarjetasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoInteresTarjetasSeleccionados() throws Exception {
		ArrayList<TipoInteresTarjeta> tipointerestarjetasSeleccionados=new ArrayList<TipoInteresTarjeta>();		
		
		tipointerestarjetasSeleccionados=this.getTipoInteresTarjetasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoInteresTarjetas("Todos",tipointerestarjetasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoInteresTarjetasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoInteresTarjeta> tipointerestarjetasSeleccionados=new ArrayList<TipoInteresTarjeta>();
		
		tipointerestarjetasSeleccionados=this.getTipoInteresTarjetasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoInteresTarjetas("Todos",tipointerestarjetasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoInteresTarjetasSeleccionados() throws Exception {
		ArrayList<TipoInteresTarjeta> tipointerestarjetasSeleccionados=new ArrayList<TipoInteresTarjeta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoInteresTarjeta();
		
		
		tipointerestarjetasSeleccionados=this.getTipoInteresTarjetasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoInteresTarjeta();
		
		
		//this.generarReporteTipoInteresTarjetas("Todos",tipointerestarjetasSeleccionados ,tipointerestarjetaImplementable,tipointerestarjetaImplementableHome);
	}
	
	public void mostrarImportacionTipoInteresTarjetas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoInteresTarjeta();
		
		this.abrirFrameImportacionTipoInteresTarjeta();		
		
			
		//this.generarReporteTipoInteresTarjetas("Todos",tipointerestarjetasSeleccionados ,tipointerestarjetaImplementable,tipointerestarjetaImplementableHome);
	}
	
	public void importarTipoInteresTarjetas() throws Exception {		
	
	}
	
	public void exportarTipoInteresTarjetasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoInteresTarjetasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoInteresTarjetasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoInteresTarjetasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Interes Tarjeta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoInteresTarjetasSeleccionados() throws Exception {
		ArrayList<TipoInteresTarjeta> tipointerestarjetasSeleccionados=new ArrayList<TipoInteresTarjeta>();		
		
		tipointerestarjetasSeleccionados=this.getTipoInteresTarjetasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipointerestarjeta."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoInteresTarjeta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoInteresTarjeta tipointerestarjetaAux:tipointerestarjetasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoInteresTarjeta(tipointerestarjetaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipointerestarjetaAux.setsDetalleGeneralEntityReporte(tipointerestarjetaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Interes Tarjeta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoInteresTarjeta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoInteresTarjetaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoInteresTarjetaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoInteresTarjetaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoInteresTarjetaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoInteresTarjeta(TipoInteresTarjeta tipointerestarjeta,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipointerestarjeta.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipointerestarjeta.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipointerestarjeta.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipointerestarjeta.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoInteresTarjetasSeleccionados() throws Exception {
		ArrayList<TipoInteresTarjeta> tipointerestarjetasSeleccionados=new ArrayList<TipoInteresTarjeta>();		
		
		tipointerestarjetasSeleccionados=this.getTipoInteresTarjetasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipointerestarjeta.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoInteresTarjetas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoInteresTarjeta(row);				
				iRow++;
			}				
			
			for(TipoInteresTarjeta tipointerestarjetaAux:tipointerestarjetasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoInteresTarjeta(tipointerestarjetaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Interes Tarjeta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoInteresTarjetasSeleccionados() throws Exception {
		ArrayList<TipoInteresTarjeta> tipointerestarjetasSeleccionados=new ArrayList<TipoInteresTarjeta>();		
		
		tipointerestarjetasSeleccionados=this.getTipoInteresTarjetasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipointerestarjeta.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipointerestarjetas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipointerestarjeta");
			//elementRoot.appendChild(element);
		
			for(TipoInteresTarjeta tipointerestarjetaAux:tipointerestarjetasSeleccionados) {
				element = document.createElement("tipointerestarjeta");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoInteresTarjeta(tipointerestarjetaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Interes Tarjeta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoInteresTarjeta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoInteresTarjetaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoInteresTarjetaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoInteresTarjetaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoInteresTarjetaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoInteresTarjeta(TipoInteresTarjeta tipointerestarjeta,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipointerestarjeta.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipointerestarjeta.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipointerestarjeta.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlTipoInteresTarjeta(TipoInteresTarjeta tipointerestarjeta,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoInteresTarjetaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipointerestarjeta.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoInteresTarjetaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipointerestarjeta.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoInteresTarjetaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipointerestarjeta.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(TipoInteresTarjetaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(tipointerestarjeta.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoTipoInteresTarjetasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoInteresTarjeta> tipointerestarjetasSeleccionados=new ArrayList<TipoInteresTarjeta>();
		
		tipointerestarjetasSeleccionados=this.getTipoInteresTarjetasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoInteresTarjeta(tipointerestarjetasSeleccionados);
		
		this.generarReporteTipoInteresTarjetas("Todos",tipointerestarjetasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoInteresTarjeta(ArrayList<TipoInteresTarjeta> tipointerestarjetasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoInteresTarjeta tipointerestarjetaAux:tipointerestarjetasSeleccionados) {
				tipointerestarjetaAux.setsDetalleGeneralEntityReporte(tipointerestarjetaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoInteresTarjetaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipointerestarjetaAux.setsDescripcionGeneralEntityReporte1(tipointerestarjetaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoInteresTarjetaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					tipointerestarjetaAux.setsDescripcionGeneralEntityReporte1(tipointerestarjetaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInteresTarjetaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoInteresTarjeta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoInteresTarjeta=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta=true;
				this.isVisibilidadCeldaGuardarCambiosTipoInteresTarjeta=true;
			}
			
			this.isVisibilidadCeldaModificarTipoInteresTarjeta=false;
			this.isVisibilidadCeldaActualizarTipoInteresTarjeta=false;
			this.isVisibilidadCeldaEliminarTipoInteresTarjeta=false;
			this.isVisibilidadCeldaCancelarTipoInteresTarjeta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInteresTarjeta=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoInteresTarjeta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoInteresTarjeta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInteresTarjeta=false;
			this.isVisibilidadCeldaModificarTipoInteresTarjeta=false;
			this.isVisibilidadCeldaActualizarTipoInteresTarjeta=true;
			this.isVisibilidadCeldaEliminarTipoInteresTarjeta=false;
			this.isVisibilidadCeldaCancelarTipoInteresTarjeta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInteresTarjeta=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoInteresTarjeta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoInteresTarjeta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInteresTarjeta=false;
			this.isVisibilidadCeldaModificarTipoInteresTarjeta=false;
			this.isVisibilidadCeldaActualizarTipoInteresTarjeta=true;
			this.isVisibilidadCeldaEliminarTipoInteresTarjeta=true;
			this.isVisibilidadCeldaCancelarTipoInteresTarjeta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInteresTarjeta=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoInteresTarjeta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoInteresTarjeta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInteresTarjeta=false;
			this.isVisibilidadCeldaModificarTipoInteresTarjeta=false;
			this.isVisibilidadCeldaActualizarTipoInteresTarjeta=true;
			this.isVisibilidadCeldaEliminarTipoInteresTarjeta=false;
			this.isVisibilidadCeldaCancelarTipoInteresTarjeta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInteresTarjeta=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoInteresTarjeta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoInteresTarjeta=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta=true;
			this.isVisibilidadCeldaGuardarCambiosTipoInteresTarjeta=true;
			this.isVisibilidadCeldaModificarTipoInteresTarjeta=false;
			this.isVisibilidadCeldaActualizarTipoInteresTarjeta=false;
			this.isVisibilidadCeldaEliminarTipoInteresTarjeta=false;
			this.isVisibilidadCeldaCancelarTipoInteresTarjeta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInteresTarjeta=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoInteresTarjeta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoInteresTarjeta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInteresTarjeta=false;
			this.isVisibilidadCeldaActualizarTipoInteresTarjeta=false;
			this.isVisibilidadCeldaEliminarTipoInteresTarjeta=false;
			this.isVisibilidadCeldaCancelarTipoInteresTarjeta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInteresTarjeta=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoInteresTarjeta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoInteresTarjeta=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInteresTarjeta=false;
			this.isVisibilidadCeldaModificarTipoInteresTarjeta=true;
			this.isVisibilidadCeldaActualizarTipoInteresTarjeta=false;
			this.isVisibilidadCeldaEliminarTipoInteresTarjeta=false;
			this.isVisibilidadCeldaCancelarTipoInteresTarjeta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInteresTarjeta=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoInteresTarjeta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoInteresTarjetaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoInteresTarjeta=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta=true;
			this.isVisibilidadCeldaGuardarCambiosTipoInteresTarjeta=true;
		} else {
			this.actualizarEstadoPanelsTipoInteresTarjeta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoInteresTarjeta=false;
			//this.isVisibilidadCeldaVerFormTipoInteresTarjeta=false;
			this.isVisibilidadCeldaDuplicarTipoInteresTarjeta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipointerestarjetaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoInteresTarjeta=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInteresTarjeta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
			if(!tipointerestarjetaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta=false;												
			}
			
			this.jButtonCerrarTipoInteresTarjeta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoInteresTarjeta=false;
		}
		
		if(!this.permiteMantenimiento(this.tipointerestarjeta)) {
			this.isVisibilidadCeldaActualizarTipoInteresTarjeta=false;
			this.isVisibilidadCeldaEliminarTipoInteresTarjeta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoInteresTarjeta() {
		this.isVisibilidadCeldaNuevoTipoInteresTarjeta=false;
		this.isVisibilidadCeldaGuardarCambiosTipoInteresTarjeta=false;
	}
	
	public void actualizarEstadoPanelsTipoInteresTarjeta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoInteresTarjeta!=null) {
				this.jScrollPanelDatosEdicionTipoInteresTarjeta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoInteresTarjeta!=null) {
				this.jScrollPanelDatosTipoInteresTarjeta.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoInteresTarjeta!=null) {
				this.jPanelPaginacionTipoInteresTarjeta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoInteresTarjeta!=null) {
				this.jPanelParametrosReportesTipoInteresTarjeta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoInteresTarjeta!=null) {
				this.jScrollPanelDatosEdicionTipoInteresTarjeta.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoInteresTarjeta!=null) {
				this.jScrollPanelDatosTipoInteresTarjeta.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoInteresTarjeta!=null) {
				this.jPanelPaginacionTipoInteresTarjeta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoInteresTarjeta!=null) {
				this.jPanelParametrosReportesTipoInteresTarjeta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoInteresTarjeta!=null) {
				this.jScrollPanelDatosEdicionTipoInteresTarjeta.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoInteresTarjeta!=null) {
				this.jScrollPanelDatosTipoInteresTarjeta.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoInteresTarjeta!=null) {
				this.jPanelPaginacionTipoInteresTarjeta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoInteresTarjeta!=null) {
				this.jPanelParametrosReportesTipoInteresTarjeta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoInteresTarjeta!=null) {
				this.jScrollPanelDatosEdicionTipoInteresTarjeta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoInteresTarjeta!=null) {
				this.jScrollPanelDatosTipoInteresTarjeta.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoInteresTarjeta!=null) {
				this.jPanelPaginacionTipoInteresTarjeta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoInteresTarjeta!=null) {
				this.jPanelParametrosReportesTipoInteresTarjeta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoInteresTarjeta!=null) {
				this.jScrollPanelDatosEdicionTipoInteresTarjeta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoInteresTarjeta!=null) {
				this.jScrollPanelDatosTipoInteresTarjeta.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoInteresTarjeta!=null) {
				this.jPanelPaginacionTipoInteresTarjeta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoInteresTarjeta!=null) {
				this.jPanelParametrosReportesTipoInteresTarjeta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoInteresTarjeta!=null) {
				this.jScrollPanelDatosEdicionTipoInteresTarjeta.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoInteresTarjeta!=null) {
				this.jScrollPanelDatosTipoInteresTarjeta.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoInteresTarjeta!=null) {
				this.jPanelPaginacionTipoInteresTarjeta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoInteresTarjeta!=null) {
				this.jPanelParametrosReportesTipoInteresTarjeta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoInteresTarjeta!=null) {
				this.jScrollPanelDatosEdicionTipoInteresTarjeta.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoInteresTarjeta!=null) {
				this.jScrollPanelDatosTipoInteresTarjeta.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoInteresTarjeta!=null) {
				this.jPanelPaginacionTipoInteresTarjeta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoInteresTarjeta!=null) {
				this.jPanelParametrosReportesTipoInteresTarjeta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoInteresTarjetaParaFormaPagoPuntoVentaes() throws Exception {
		Boolean isPaginaPopupFormaPagoPuntoVenta=false;

		try {

			if(this.tipointerestarjetaSessionBean==null) {
				this.tipointerestarjetaSessionBean=new TipoInteresTarjetaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaSessionBean=new FormaPagoPuntoVentaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaSessionBean.setsPathNavegacionActual(tipointerestarjetaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFormaPagoPuntoVenta=this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta(true);
			this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormaPagoPuntoVenta(TipoInteresTarjetaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionTipoInteresTarjeta(true);
			this.jInternalFrameDetalleFormTipoInteresTarjeta.formapagopuntoventaSessionBean.setlidTipoInteresTarjetaActual(this.idTipoInteresTarjetaActual);

			tipointerestarjetaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoInteresTarjeta(true);
			tipointerestarjetaSessionBean.setlIdTipoInteresTarjetaActualForeignKey(this.idTipoInteresTarjetaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoInteresTarjetaSessionBean tipointerestarjetaSessionBean=new TipoInteresTarjetaSessionBean();
		
		if(this.tipointerestarjetaSessionBean==null) {
			this.tipointerestarjetaSessionBean=new TipoInteresTarjetaSessionBean();
		}
		
		this.tipointerestarjetaSessionBean.setsUltimaBusquedaTipoInteresTarjeta(this.getsAccionBusqueda());
		this.tipointerestarjetaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipointerestarjetaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoInteresTarjetaSessionBean tipointerestarjetaSessionBean=new TipoInteresTarjetaSessionBean();
		
		if(this.tipointerestarjetaSessionBean==null) {
			this.tipointerestarjetaSessionBean=new TipoInteresTarjetaSessionBean();
		}
		
		if(this.tipointerestarjetaSessionBean.getsUltimaBusquedaTipoInteresTarjeta()!=null&&!this.tipointerestarjetaSessionBean.getsUltimaBusquedaTipoInteresTarjeta().equals("")) {
			this.setsAccionBusqueda(tipointerestarjetaSessionBean.getsUltimaBusquedaTipoInteresTarjeta());
			this.setiNumeroPaginacion(tipointerestarjetaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipointerestarjetaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipointerestarjetaSessionBean.setsUltimaBusquedaTipoInteresTarjeta("");
		this.tipointerestarjetaSessionBean.setiNumeroPaginacion(TipoInteresTarjetaConstantesFunciones.INUMEROPAGINACION);
		this.tipointerestarjetaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoInteresTarjeta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoInteresTarjeta() {
		this.updateBorderResaltarBusquedasFormularioTipoInteresTarjeta();
		this.updateVisibilidadBusquedasFormularioTipoInteresTarjeta();
		this.updateHabilitarBusquedasFormularioTipoInteresTarjeta();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoInteresTarjeta() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoInteresTarjeta() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoInteresTarjeta() {
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
	
	public void updateControlesFormularioTipoInteresTarjeta() throws Exception {

		if(this.jInternalFrameDetalleFormTipoInteresTarjeta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoInteresTarjeta();
		this.updateVisibilidadResaltarControlesFormularioTipoInteresTarjeta();
		this.updateHabilitarResaltarControlesFormularioTipoInteresTarjeta();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoInteresTarjeta() throws Exception {
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipointerestarjetaConstantesFunciones.resaltaridTipoInteresTarjeta!=null && this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) {this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextFieldidTipoInteresTarjeta.setBorder(this.tipointerestarjetaConstantesFunciones.resaltaridTipoInteresTarjeta);}
		if(this.tipointerestarjetaConstantesFunciones.resaltarnombreTipoInteresTarjeta!=null && this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) {this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextAreanombreTipoInteresTarjeta.setBorder(this.tipointerestarjetaConstantesFunciones.resaltarnombreTipoInteresTarjeta);}
		if(this.tipointerestarjetaConstantesFunciones.resaltardescripcionTipoInteresTarjeta!=null && this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) {this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextAreadescripcionTipoInteresTarjeta.setBorder(this.tipointerestarjetaConstantesFunciones.resaltardescripcionTipoInteresTarjeta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoInteresTarjeta() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) {
	
		//this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextFieldidTipoInteresTarjeta.setVisible(this.tipointerestarjetaConstantesFunciones.mostraridTipoInteresTarjeta);
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jPanelidTipoInteresTarjeta.setVisible(this.tipointerestarjetaConstantesFunciones.mostraridTipoInteresTarjeta);
		//this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextAreanombreTipoInteresTarjeta.setVisible(this.tipointerestarjetaConstantesFunciones.mostrarnombreTipoInteresTarjeta);
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jPanelnombreTipoInteresTarjeta.setVisible(this.tipointerestarjetaConstantesFunciones.mostrarnombreTipoInteresTarjeta);
		//this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextAreadescripcionTipoInteresTarjeta.setVisible(this.tipointerestarjetaConstantesFunciones.mostrardescripcionTipoInteresTarjeta);
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jPaneldescripcionTipoInteresTarjeta.setVisible(this.tipointerestarjetaConstantesFunciones.mostrardescripcionTipoInteresTarjeta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoInteresTarjeta() throws Exception {
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoInteresTarjeta!=null) {
	
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextFieldidTipoInteresTarjeta.setEnabled(this.tipointerestarjetaConstantesFunciones.activaridTipoInteresTarjeta);
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextAreanombreTipoInteresTarjeta.setEnabled(this.tipointerestarjetaConstantesFunciones.activarnombreTipoInteresTarjeta);
		this.jInternalFrameDetalleFormTipoInteresTarjeta.jTextAreadescripcionTipoInteresTarjeta.setEnabled(this.tipointerestarjetaConstantesFunciones.activardescripcionTipoInteresTarjeta);
		}
	}
	
		
}