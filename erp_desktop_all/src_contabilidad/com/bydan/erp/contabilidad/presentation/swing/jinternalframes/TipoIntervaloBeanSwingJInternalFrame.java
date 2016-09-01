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

import com.bydan.erp.contabilidad.util.TipoIntervaloConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoIntervaloParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoIntervaloParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoIntervaloBean;
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

import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoIntervaloBeanSwingJInternalFrame extends TipoIntervaloJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoIntervaloBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoIntervalo> tipointervaloValidator = new ClassValidator<TipoIntervalo>(TipoIntervalo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoIntervalo tipointervalo;	
	public TipoIntervalo tipointervaloAux;
	public TipoIntervalo tipointervaloAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoIntervalo tipointervaloTotales;
	public Long idTipoIntervaloActual;
	public Long iIdNuevoTipoIntervalo=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosParametroContabilidadDefecto=false;

	public Boolean getIsTienePermisosParametroContabilidadDefecto() {
		return isTienePermisosParametroContabilidadDefecto;
	}

	public void setIsTienePermisosParametroContabilidadDefecto(Boolean isTienePermisosParametroContabilidadDefecto) {
		this.isTienePermisosParametroContabilidadDefecto= isTienePermisosParametroContabilidadDefecto;
	}


	public Boolean isTienePermisosTablaAmortiDetalle=false;

	public Boolean getIsTienePermisosTablaAmortiDetalle() {
		return isTienePermisosTablaAmortiDetalle;
	}

	public void setIsTienePermisosTablaAmortiDetalle(Boolean isTienePermisosTablaAmortiDetalle) {
		this.isTienePermisosTablaAmortiDetalle= isTienePermisosTablaAmortiDetalle;
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
	
	public Boolean isPermisoTodoTipoIntervalo;
	public Boolean isPermisoNuevoTipoIntervalo;
	public Boolean isPermisoActualizarTipoIntervalo;
	public Boolean isPermisoActualizarOriginalTipoIntervalo;
	public Boolean isPermisoEliminarTipoIntervalo;
	public Boolean isPermisoGuardarCambiosTipoIntervalo;
	public Boolean isPermisoConsultaTipoIntervalo;
	public Boolean isPermisoBusquedaTipoIntervalo;
	public Boolean isPermisoReporteTipoIntervalo;
	public Boolean isPermisoPaginacionMedioTipoIntervalo;
	public Boolean isPermisoPaginacionAltoTipoIntervalo;
	public Boolean isPermisoPaginacionTodoTipoIntervalo;
	public Boolean isPermisoCopiarTipoIntervalo;
	public Boolean isPermisoVerFormTipoIntervalo;
	public Boolean isPermisoDuplicarTipoIntervalo;
	public Boolean isPermisoOrdenTipoIntervalo;
	
	
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
	
	public TipoIntervaloParameterReturnGeneral tipointervaloReturnGeneral;
	public TipoIntervaloParameterReturnGeneral tipointervaloParameterGeneral;
	
	

	public ParametroContabilidadDefectoLogic parametrocontabilidaddefectoLogic=null;

	public ParametroContabilidadDefectoLogic getParametroContabilidadDefectoLogic() {
		return parametrocontabilidaddefectoLogic;
	}

	public void setParametroContabilidadDefectoLogic(ParametroContabilidadDefectoLogic parametrocontabilidaddefectoLogic) {
		this.parametrocontabilidaddefectoLogic = parametrocontabilidaddefectoLogic;
	}


	public TablaAmortiDetalleLogic tablaamortidetalleLogic=null;

	public TablaAmortiDetalleLogic getTablaAmortiDetalleLogic() {
		return tablaamortidetalleLogic;
	}

	public void setTablaAmortiDetalleLogic(TablaAmortiDetalleLogic tablaamortidetalleLogic) {
		this.tablaamortidetalleLogic = tablaamortidetalleLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoIntervalo=false;
	public Boolean esParaAccionDesdeFormularioTipoIntervalo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoIntervaloLogic tipointervaloLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoIntervalo tipointervaloBean;
	public TipoIntervaloConstantesFunciones tipointervaloConstantesFunciones;
	//public TipoIntervaloParameterReturnGeneral tipointervaloReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoIntervalo> tipointervalos;	
	//public List<TipoIntervalo> tipointervalosEliminados;
	//public List<TipoIntervalo> tipointervalosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoIntervalo=false;
	public Boolean isVisibilidadCeldaDuplicarTipoIntervalo=true;
	public Boolean isVisibilidadCeldaCopiarTipoIntervalo=true;
	public Boolean isVisibilidadCeldaVerFormTipoIntervalo=true;
	public Boolean isVisibilidadCeldaOrdenTipoIntervalo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoIntervalo=false;
	public Boolean isVisibilidadCeldaModificarTipoIntervalo=false;
	public Boolean isVisibilidadCeldaActualizarTipoIntervalo=false;
	public Boolean isVisibilidadCeldaEliminarTipoIntervalo=false;
	public Boolean isVisibilidadCeldaCancelarTipoIntervalo=false;
	public Boolean isVisibilidadCeldaGuardarTipoIntervalo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoIntervalo=false;	
	
	
	
	public Long getiIdNuevoTipoIntervalo() {
		return this.iIdNuevoTipoIntervalo;
	}

	public void setiIdNuevoTipoIntervalo(Long iIdNuevoTipoIntervalo) {
		this.iIdNuevoTipoIntervalo = iIdNuevoTipoIntervalo;
	}
	
	public Long getidTipoIntervaloActual() {
		return this.idTipoIntervaloActual;
	}

	public void setidTipoIntervaloActual(Long idTipoIntervaloActual) {
		this.idTipoIntervaloActual = idTipoIntervaloActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoIntervalo gettipointervalo() {
		return this.tipointervalo;
	}

	public void settipointervalo(TipoIntervalo tipointervalo) {
		this.tipointervalo = tipointervalo;
	}
	
	public TipoIntervalo gettipointervaloAux() {
		return this.tipointervaloAux;
	}

	public void settipointervaloAux(TipoIntervalo tipointervaloAux) {
		this.tipointervaloAux = tipointervaloAux;
	}				
	
	public TipoIntervalo gettipointervaloAnterior() {
		return this.tipointervaloAnterior;
	}

	public void settipointervaloAnterior(TipoIntervalo tipointervaloAnterior) {
		this.tipointervaloAnterior = tipointervaloAnterior;
	}	
	
	public TipoIntervalo gettipointervaloTotales() {
		return this.tipointervaloTotales;
	}

	public void settipointervaloTotales(TipoIntervalo tipointervaloTotales) {
		this.tipointervaloTotales = tipointervaloTotales;
	}	
	
	public TipoIntervalo gettipointervaloBean() {
		return this.tipointervaloBean;
	}

	public void settipointervaloBean(TipoIntervalo tipointervaloBean) {
		this.tipointervaloBean = tipointervaloBean;
	}	
	
	public TipoIntervaloParameterReturnGeneral gettipointervaloReturnGeneral() {
		return this.tipointervaloReturnGeneral;
	}

	public void settipointervaloReturnGeneral(TipoIntervaloParameterReturnGeneral tipointervaloReturnGeneral) {
		this.tipointervaloReturnGeneral = tipointervaloReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoIntervaloLogic getTipoIntervaloLogic()	{		
		return tipointervaloLogic;
	}

	public void setTipoIntervaloLogic(TipoIntervaloLogic tipointervaloLogic) {
		this.tipointervaloLogic = tipointervaloLogic;
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
	
	public Boolean getIsEsNuevoTipoIntervalo() {
		return isEsNuevoTipoIntervalo;
	}

	public void setIsEsNuevoTipoIntervalo(Boolean isEsNuevoTipoIntervalo) {
		this.isEsNuevoTipoIntervalo = isEsNuevoTipoIntervalo;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoIntervalo() {
		return esParaAccionDesdeFormularioTipoIntervalo;
	}
	
	public void setEsParaAccionDesdeFormularioTipoIntervalo(Boolean esParaAccionDesdeFormularioTipoIntervalo) {
		this.esParaAccionDesdeFormularioTipoIntervalo = esParaAccionDesdeFormularioTipoIntervalo;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoIntervalo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoIntervaloConstantesFunciones.refrescarForeignKeysDescripcionesTipoIntervalo(this.tipointervaloLogic.getTipoIntervalos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoIntervaloConstantesFunciones.refrescarForeignKeysDescripcionesTipoIntervalo(this.tipointervalos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipointervaloLogic.setTipoIntervalos(this.tipointervalos);
			tipointervaloLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoIntervaloParameterReturnGeneral getTipoIntervaloParameterGeneral() {
		return this.tipointervaloParameterGeneral;
	}
	
	public void setTipoIntervaloParameterGeneral(TipoIntervaloParameterReturnGeneral tipointervaloParameterGeneral) {
		this.tipointervaloParameterGeneral = tipointervaloParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoIntervalo() {
		return isPermisoTodoTipoIntervalo;
	}

	public void setIsPermisoTodoTipoIntervalo(Boolean isPermisoTodoTipoIntervalo) {
		this.isPermisoTodoTipoIntervalo = isPermisoTodoTipoIntervalo;
	}

	public Boolean getIsPermisoNuevoTipoIntervalo() {
		return isPermisoNuevoTipoIntervalo;
	}

	public void setIsPermisoNuevoTipoIntervalo(Boolean isPermisoNuevoTipoIntervalo) {
		this.isPermisoNuevoTipoIntervalo = isPermisoNuevoTipoIntervalo;
	}

	public Boolean getIsPermisoActualizarTipoIntervalo() {
		return isPermisoActualizarTipoIntervalo;
	}

	public void setIsPermisoActualizarTipoIntervalo(Boolean isPermisoActualizarTipoIntervalo) {
		this.isPermisoActualizarTipoIntervalo = isPermisoActualizarTipoIntervalo;
	}

	public Boolean getIsPermisoEliminarTipoIntervalo() {
		return isPermisoEliminarTipoIntervalo;
	}

	public void setIsPermisoEliminarTipoIntervalo(Boolean isPermisoEliminarTipoIntervalo) {
		this.isPermisoEliminarTipoIntervalo = isPermisoEliminarTipoIntervalo;
	}

	public Boolean getIsPermisoGuardarCambiosTipoIntervalo() {
		return isPermisoGuardarCambiosTipoIntervalo;
	}

	public void setIsPermisoGuardarCambiosTipoIntervalo(Boolean isPermisoGuardarCambiosTipoIntervalo) {
		this.isPermisoGuardarCambiosTipoIntervalo = isPermisoGuardarCambiosTipoIntervalo;
	}
	
	public Boolean getIsPermisoConsultaTipoIntervalo() {
		return isPermisoConsultaTipoIntervalo;
	}

	public void setIsPermisoConsultaTipoIntervalo(Boolean isPermisoConsultaTipoIntervalo) {
		this.isPermisoConsultaTipoIntervalo = isPermisoConsultaTipoIntervalo;
	}

	public Boolean getIsPermisoBusquedaTipoIntervalo() {
		return isPermisoBusquedaTipoIntervalo;
	}

	public void setIsPermisoBusquedaTipoIntervalo(Boolean isPermisoBusquedaTipoIntervalo) {
		this.isPermisoBusquedaTipoIntervalo = isPermisoBusquedaTipoIntervalo;
	}

	public Boolean getIsPermisoReporteTipoIntervalo() {
		return isPermisoReporteTipoIntervalo;
	}

	public void setIsPermisoReporteTipoIntervalo(Boolean isPermisoReporteTipoIntervalo) {
		this.isPermisoReporteTipoIntervalo = isPermisoReporteTipoIntervalo;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoIntervalo() {
		return isPermisoPaginacionMedioTipoIntervalo;
	}

	public void setIsPermisoPaginacionMedioTipoIntervalo(Boolean isPermisoPaginacionMedioTipoIntervalo) {
		this.isPermisoPaginacionMedioTipoIntervalo = isPermisoPaginacionMedioTipoIntervalo;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoIntervalo() {
		return isPermisoPaginacionTodoTipoIntervalo;
	}

	public void setIsPermisoPaginacionTodoTipoIntervalo(Boolean isPermisoPaginacionTodoTipoIntervalo) {
		this.isPermisoPaginacionTodoTipoIntervalo = isPermisoPaginacionTodoTipoIntervalo;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoIntervalo() {
		return isPermisoPaginacionAltoTipoIntervalo;
	}

	public void setIsPermisoPaginacionAltoTipoIntervalo(Boolean isPermisoPaginacionAltoTipoIntervalo) {
		this.isPermisoPaginacionAltoTipoIntervalo = isPermisoPaginacionAltoTipoIntervalo;
	}
	
	public Boolean getIsPermisoCopiarTipoIntervalo() {
		return isPermisoCopiarTipoIntervalo;
	}

	public void setIsPermisoCopiarTipoIntervalo(Boolean isPermisoCopiarTipoIntervalo) {
		this.isPermisoCopiarTipoIntervalo = isPermisoCopiarTipoIntervalo;
	}
	
	public Boolean getIsPermisoVerFormTipoIntervalo() {
		return isPermisoVerFormTipoIntervalo;
	}

	public void setIsPermisoVerFormTipoIntervalo(Boolean isPermisoVerFormTipoIntervalo) {
		this.isPermisoVerFormTipoIntervalo = isPermisoVerFormTipoIntervalo;
	}
	
	public Boolean getIsPermisoDuplicarTipoIntervalo() {
		return isPermisoDuplicarTipoIntervalo;
	}

	public void setIsPermisoDuplicarTipoIntervalo(Boolean isPermisoDuplicarTipoIntervalo) {
		this.isPermisoDuplicarTipoIntervalo = isPermisoDuplicarTipoIntervalo;
	}
	
	public Boolean getIsPermisoOrdenTipoIntervalo() {
		return isPermisoOrdenTipoIntervalo;
	}

	public void setIsPermisoOrdenTipoIntervalo(Boolean isPermisoOrdenTipoIntervalo) {
		this.isPermisoOrdenTipoIntervalo = isPermisoOrdenTipoIntervalo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoIntervalo() {
		return isVisibilidadCeldaNuevoTipoIntervalo;
	}

	public void setIsVisibilidadCeldaNuevoTipoIntervalo(Boolean isVisibilidadCeldaNuevoTipoIntervalo) {
		this.isVisibilidadCeldaNuevoTipoIntervalo = isVisibilidadCeldaNuevoTipoIntervalo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoIntervalo() {
		return isVisibilidadCeldaDuplicarTipoIntervalo;
	}

	public void setIsVisibilidadCeldaDuplicarTipoIntervalo(Boolean isVisibilidadCeldaDuplicarTipoIntervalo) {
		this.isVisibilidadCeldaDuplicarTipoIntervalo = isVisibilidadCeldaDuplicarTipoIntervalo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoIntervalo() {
		return isVisibilidadCeldaCopiarTipoIntervalo;
	}

	public void setIsVisibilidadCeldaCopiarTipoIntervalo(Boolean isVisibilidadCeldaCopiarTipoIntervalo) {
		this.isVisibilidadCeldaCopiarTipoIntervalo = isVisibilidadCeldaCopiarTipoIntervalo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoIntervalo() {
		return isVisibilidadCeldaVerFormTipoIntervalo;
	}

	public void setIsVisibilidadCeldaVerFormTipoIntervalo(Boolean isVisibilidadCeldaVerFormTipoIntervalo) {
		this.isVisibilidadCeldaVerFormTipoIntervalo = isVisibilidadCeldaVerFormTipoIntervalo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoIntervalo() {
		return isVisibilidadCeldaOrdenTipoIntervalo;
	}

	public void setIsVisibilidadCeldaOrdenTipoIntervalo(Boolean isVisibilidadCeldaOrdenTipoIntervalo) {
		this.isVisibilidadCeldaOrdenTipoIntervalo = isVisibilidadCeldaOrdenTipoIntervalo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoIntervalo() {
		return isVisibilidadCeldaNuevoRelacionesTipoIntervalo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoIntervalo(Boolean isVisibilidadCeldaNuevoRelacionesTipoIntervalo) {
		this.isVisibilidadCeldaNuevoRelacionesTipoIntervalo = isVisibilidadCeldaNuevoRelacionesTipoIntervalo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoIntervalo() {
		return isVisibilidadCeldaModificarTipoIntervalo;
	}

	public void setIsVisibilidadCeldaModificarTipoIntervalo(Boolean isVisibilidadCeldaModificarTipoIntervalo) {
		this.isVisibilidadCeldaModificarTipoIntervalo = isVisibilidadCeldaModificarTipoIntervalo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoIntervalo() {
		return isVisibilidadCeldaActualizarTipoIntervalo;
	}

	public void setIsVisibilidadCeldaActualizarTipoIntervalo(Boolean isVisibilidadCeldaActualizarTipoIntervalo) {
		this.isVisibilidadCeldaActualizarTipoIntervalo = isVisibilidadCeldaActualizarTipoIntervalo;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoIntervalo() {
		return isVisibilidadCeldaEliminarTipoIntervalo;
	}

	public void setIsVisibilidadCeldaEliminarTipoIntervalo(Boolean isVisibilidadCeldaEliminarTipoIntervalo) {
		this.isVisibilidadCeldaEliminarTipoIntervalo = isVisibilidadCeldaEliminarTipoIntervalo;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoIntervalo() {
		return isVisibilidadCeldaCancelarTipoIntervalo;
	}

	public void setIsVisibilidadCeldaCancelarTipoIntervalo(Boolean isVisibilidadCeldaCancelarTipoIntervalo) {
		this.isVisibilidadCeldaCancelarTipoIntervalo = isVisibilidadCeldaCancelarTipoIntervalo;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoIntervalo() {
		return isVisibilidadCeldaGuardarTipoIntervalo;
	}

	public void setIsVisibilidadCeldaGuardarTipoIntervalo(Boolean isVisibilidadCeldaGuardarTipoIntervalo) {
		this.isVisibilidadCeldaGuardarTipoIntervalo = isVisibilidadCeldaGuardarTipoIntervalo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoIntervalo() {
		return isVisibilidadCeldaGuardarCambiosTipoIntervalo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoIntervalo(Boolean isVisibilidadCeldaGuardarCambiosTipoIntervalo) {
		this.isVisibilidadCeldaGuardarCambiosTipoIntervalo = isVisibilidadCeldaGuardarCambiosTipoIntervalo;
	}
		
	public TipoIntervaloSessionBean gettipointervaloSessionBean() {
		return this.tipointervaloSessionBean;
	}
	
	public void settipointervaloSessionBean(TipoIntervaloSessionBean tipointervaloSessionBean) {
		this.tipointervaloSessionBean=tipointervaloSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoIntervalo(TipoIntervalo tipointervalo)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoIntervalo tipointervalo,TipoIntervalo tipointervaloAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoIntervalo(tipointervalo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipointervaloAux.setId(tipointervalo.getId());
		tipointervaloAux.setVersionRow(tipointervalo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoIntervalo();
		
			int intSelectedRow = this.jTableDatosTipoIntervalo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervalo =(TipoIntervalo) this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipointervalo =(TipoIntervalo) this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoIntervaloJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoIntervalo(this.tipointervalo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoIntervalo(this.tipointervalo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipointervaloValidator.getInvalidValues(this.tipointervalo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipointervaloLogic.setDatosCliente(datosCliente);
			tipointervaloLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipointervaloAux=new  TipoIntervalo();
				
				tipointervaloAux.setIsNew(true);
				tipointervaloAux.setIsChanged(true);
				
				tipointervaloAux.setTipoIntervaloOriginal(this.tipointervalo);
				
				tipointervaloAux.setId(this.tipointervalo.getId());	
				tipointervaloAux.setVersionRow(this.tipointervalo.getVersionRow());	
				tipointervaloAux.setnombre(this.tipointervalo.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipointervaloSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipointervaloSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipointervaloAux,tipointervaloLogic.getTipoIntervalos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipointervaloAux,tipointervalos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipointervaloSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipointervaloSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipointervaloLogic.saveTipoIntervalos();//WithConnection
						//tipointervaloLogic.getSetVersionRowTipoIntervalos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipointervalo,tipointervaloAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipointervaloSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipointervaloAux=new  TipoIntervalo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipointervaloSessionBean.getEsGuardarRelacionado() 
					|| (this.tipointervaloSessionBean.getEsGuardarRelacionado() && this.tipointervalo.getId()>=0)) {
						
					tipointervaloAux.setIsNew(false);
				}
				
				tipointervaloAux.setIsDeleted(false);
			
				tipointervaloAux.setId(this.tipointervalo.getId());	
				tipointervaloAux.setVersionRow(this.tipointervalo.getVersionRow());	
				tipointervaloAux.setnombre(this.tipointervalo.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipointervaloAux,tipointervaloLogic.getTipoIntervalos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipointervaloAux,tipointervalos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipointervaloSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipointervaloSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipointervaloLogic.saveTipoIntervalos();//WithConnection
						//tipointervaloLogic.getSetVersionRowTipoIntervalos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipointervalo,tipointervaloAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipointervaloSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipointervaloAux=new  TipoIntervalo();
				
				tipointervaloAux.setIsNew(false);
				tipointervaloAux.setIsChanged(false);
				
				tipointervaloAux.setIsDeleted(true);
				
				tipointervaloAux.setId(this.tipointervalo.getId());	
				tipointervaloAux.setVersionRow(this.tipointervalo.getVersionRow());	
				tipointervaloAux.setnombre(this.tipointervalo.getnombre());	
				
				if(this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipointervaloAux.getId()>=0) {	
						this.tipointervalosEliminados.add(tipointervaloAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipointervaloAux,tipointervaloLogic.getTipoIntervalos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipointervaloAux,tipointervalos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipointervaloSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipointervaloSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipointervaloLogic.saveTipoIntervalos();//WithConnection
						//tipointervaloLogic.getSetVersionRowTipoIntervalos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipointervaloSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipointervaloAux.setParametroContabilidadDefectos(this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());

							if(this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame.quitarFilaTotales();}
							tipointervaloAux.setTablaAmortiDetalles(this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame.tablaamortidetalleLogic.getTablaAmortiDetalles());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipointervaloSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipointervaloSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipointervaloAux,tipointervaloLogic.getTipoIntervalos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipointervaloAux,tipointervalos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervaloLogic.getTipoIntervalos().addAll(this.tipointervalosEliminados);
					
					tipointervaloLogic.saveTipoIntervalos();//WithConnection
					//tipointervaloLogic.getSetVersionRowTipoIntervalos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipointervalosEliminados= new ArrayList<TipoIntervalo>();		
			}
			
			if(this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipointervaloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Intervalo  GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Intervalo ",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipointervalo=tipointervaloAux;
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
      		//this.finishProcessTipoIntervalo();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoIntervalo tipointervaloLocal) throws Exception {
		
		if(this.tipointervaloSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipointervaloLocal.setParametroContabilidadDefectos(this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
				tipointervaloLocal.setTablaAmortiDetalles(this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame.tablaamortidetalleLogic.getTablaAmortiDetalles());
			
			} else {
			
				tipointervaloLocal.setParametroContabilidadDefectos(this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectos);
				tipointervaloLocal.setTablaAmortiDetalles(this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame.tablaamortidetalles);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoIntervalo tipointervaloLocal) throws Exception {	
		if(this.tipointervaloSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoIntervaloActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoIntervalo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipointervalo =(TipoIntervalo) this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipointervalo =(TipoIntervalo) this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipointervaloValidator.getInvalidValues(this.tipointervalo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoIntervalo tipointervalo,List<TipoIntervalo> tipointervalos) throws Exception {
		try	{		
			TipoIntervaloConstantesFunciones.actualizarLista(tipointervalo,tipointervalos,this.tipointervaloSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoIntervalo tipointervalo,List<TipoIntervalo> tipointervalos) throws Exception {
		try	{			
			TipoIntervaloConstantesFunciones.actualizarSelectedLista(tipointervalo,tipointervalos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoIntervalo> tipointervalosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipointervalosLocal=this.tipointervaloLogic.getTipoIntervalos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipointervalosLocal=this.tipointervalos;
			}
			//ARCHITECTURE
		
			for(TipoIntervalo tipointervaloLocal:tipointervalosLocal) {
				if(this.permiteMantenimiento(tipointervaloLocal) && tipointervaloLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoIntervaloConstantesFunciones.getTipoIntervaloLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoIntervaloConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoIntervalo.jLabelnombreTipoIntervalo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoIntervalo.jLabelnombreTipoIntervalo,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ParametroContabilidadDefecto")) {
			if(this.tipointervalo==null) {
				this.tipointervalo= new TipoIntervalo();
			}

			if(this.tipointervaloSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoIntervalo
				this.setVariablesFormularioToObjetoActualTipoIntervalo(this.tipointervalo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoIntervalo(this.tipointervalo);

				this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame.getparametrocontabilidaddefecto().setTipoIntervalo(this.tipointervalo);
			}

			return;
		}
		 else  if(sTipo.equals("TablaAmortiDetalle")) {
			if(this.tipointervalo==null) {
				this.tipointervalo= new TipoIntervalo();
			}

			if(this.tipointervaloSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoIntervalo
				this.setVariablesFormularioToObjetoActualTipoIntervalo(this.tipointervalo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoIntervalo(this.tipointervalo);

				this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame.gettablaamortidetalle().setTipoIntervalo(this.tipointervalo);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoIntervalo--;	
		
		
		this.tipointervaloAux=new TipoIntervalo();
		
		this.tipointervaloAux.setId(this.iIdNuevoTipoIntervalo);
		this.tipointervaloAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipointervaloLogic.getTipoIntervalos().add(this.tipointervaloAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipointervalos.add(this.tipointervaloAux);
		}
		//ARCHITECTURE
		
		this.tipointervalo=this.tipointervaloAux;
		
		if(TipoIntervaloJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoIntervalo(this.tipointervalo);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoIntervalo(this.tipointervalo);
		}
				
		//this.setDefaultControlesTipoIntervalo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoIntervalo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoIntervalo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoIntervalo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoIntervalo(this.tipointervaloBean,this.tipointervalo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoIntervalo(this.tipointervalo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoIntervaloConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipointervaloSessionBean.getConGuardarRelaciones()) {
			classes=TipoIntervaloConstantesFunciones.getClassesRelationshipsOfTipoIntervalo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipointervaloReturnGeneral=tipointervaloLogic.procesarEventosTipoIntervalosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipointervaloLogic.getTipoIntervalos(),this.tipointervalo,this.tipointervaloParameterGeneral,this.isEsNuevoTipoIntervalo,classes);//this.tipointervaloLogic.getTipoIntervalo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoIntervalo(this.tipointervaloReturnGeneral,this.tipointervaloBean,false);
		
		if(this.tipointervaloReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoIntervalo(this.tipointervaloReturnGeneral.getTipoIntervalo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoIntervalo(this.tipointervaloReturnGeneral.getTipoIntervalo());
		}
		
		if(this.tipointervaloReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoIntervalo(this.tipointervaloReturnGeneral.getTipoIntervalo(),classes);//this.tipointervaloBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoIntervalo(this.tipointervalo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoIntervalo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoIntervalo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoIntervalo(false);
						
			if(tipointervaloSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado() && ParametroContabilidadDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroContabilidadDefectoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame.tablaamortidetalleSessionBean.getEsGuardarRelacionado() && TablaAmortiDetalleJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTablaAmortiDetalleActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoIntervaloJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoIntervalo();
			}
			
			this.actualizarVisualTableDatosTipoIntervalo();
			
			this.jTableDatosTipoIntervalo.setRowSelectionInterval(this.getIndiceNuevoTipoIntervalo(), this.getIndiceNuevoTipoIntervalo());
			
			this.seleccionarFilaTablaTipoIntervaloActual();
						
			this.actualizarEstadoCeldasBotonesTipoIntervalo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoIntervalo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoIntervalo.jTextAreanombreTipoIntervalo.setEnabled(isHabilitar && this.tipointervaloConstantesFunciones.activarnombreTipoIntervalo);	
		
	};
	
	public void setDefaultControlesTipoIntervalo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoIntervalo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipointervaloSessionBean.setConGuardarRelaciones(true);			
			this.tipointervaloSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoIntervalo.jTabbedPaneRelacionesTipoIntervalo.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame.tablaamortidetalleSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipointervaloSessionBean.setConGuardarRelaciones(false);			
			this.tipointervaloSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoIntervalo.jTabbedPaneRelacionesTipoIntervalo.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame.tablaamortidetalleSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoIntervalo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIntervalo tipointervaloAux:this.tipointervaloLogic.getTipoIntervalos()) {
				if(tipointervaloAux.getId().equals(this.iIdNuevoTipoIntervalo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIntervalo tipointervaloAux:this.tipointervalos) {
				if(tipointervaloAux.getId().equals(this.iIdNuevoTipoIntervalo)) {
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
	
	public int getIndiceActualTipoIntervalo(TipoIntervalo tipointervalo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIntervalo tipointervaloAux:this.tipointervaloLogic.getTipoIntervalos()) {
				if(tipointervaloAux.getId().equals(tipointervalo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIntervalo tipointervaloAux:this.tipointervalos) {
				if(tipointervaloAux.getId().equals(tipointervalo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoIntervalo(TipoIntervalo tipointervaloOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIntervalo tipointervaloAux:this.tipointervaloLogic.getTipoIntervalos()) {
				if(tipointervaloAux.getTipoIntervaloOriginal().getId().equals(tipointervaloOriginal.getId())) {
					existe=true;
					tipointervaloOriginal.setId(tipointervaloAux.getId());
					tipointervaloOriginal.setVersionRow(tipointervaloAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIntervalo tipointervaloAux:this.tipointervalos) {
				if(tipointervaloAux.getTipoIntervaloOriginal().getId().equals(tipointervaloOriginal.getId())) {
					existe=true;
					tipointervaloOriginal.setId(tipointervaloAux.getId());
					tipointervaloOriginal.setVersionRow(tipointervaloAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoIntervalo(Boolean esParaCancelar) throws Exception {
		tipointervalosAux=new ArrayList<TipoIntervalo>();
		tipointervaloAux=new TipoIntervalo();
		
		if(!this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoIntervalo tipointervaloAux:this.tipointervaloLogic.getTipoIntervalos()) {
					if(tipointervaloAux.getId()<0) {
						tipointervalosAux.add(tipointervaloAux);
					}		
				}
				this.iIdNuevoTipoIntervalo=0L;
				this.tipointervaloLogic.getTipoIntervalos().removeAll(tipointervalosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoIntervalo tipointervaloAux:this.tipointervalos) {
					if(tipointervaloAux.getId()<0) {
						tipointervalosAux.add(tipointervaloAux);
					}		
				}
				this.iIdNuevoTipoIntervalo=0L;
				this.tipointervalos.removeAll(tipointervalosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoIntervalo 
					&& this.tipointervaloLogic.getTipoIntervalos().size()>0
					) {
					tipointervaloAux=this.tipointervaloLogic.getTipoIntervalos().get(this.tipointervaloLogic.getTipoIntervalos().size() - 1);
				
					if(tipointervaloAux.getId()<0) {
						this.tipointervaloLogic.getTipoIntervalos().remove(tipointervaloAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoIntervalo && this.tipointervalos.size()>0) {
					tipointervaloAux=this.tipointervalos.get(this.tipointervalos.size() - 1);
				
					if(tipointervaloAux.getId()<0) {
						this.tipointervalos.remove(tipointervaloAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoIntervalo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipointervalo.getId()<0) {
				this.tipointervaloLogic.getTipoIntervalos().remove(this.tipointervalo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipointervalo.getId()<0) {
				this.tipointervalos.remove(this.tipointervalo);
			}
		}			
	}
	
	public void setEstadosInicialesTipoIntervalo(List<TipoIntervalo> tipointervalosAux) throws Exception {
		TipoIntervaloConstantesFunciones.setEstadosInicialesTipoIntervalo(tipointervalosAux);
	}
	
	public void setEstadosInicialesTipoIntervalo(TipoIntervalo tipointervaloAux) throws Exception {
		TipoIntervaloConstantesFunciones.setEstadosInicialesTipoIntervalo(tipointervaloAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoIntervaloActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoIntervalo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoIntervaloActual()) {
				if(!this.isEsNuevoTipoIntervalo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoIntervalo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoIntervalo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoIntervaloActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Intervalo  ?", "MANTENIMIENTO DE Tipo Intervalo ", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoIntervalo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoIntervalo tipointervalo) throws Exception {
		TipoIntervaloConstantesFunciones.seleccionarAsignar(this.tipointervalo,tipointervalo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoIntervalo=this.isPermisoActualizarOriginalTipoIntervalo;
			
			
			this.seleccionarAsignar(tipointervalo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoIntervaloConstantesFunciones.quitarEspaciosTipoIntervalo(this.tipointervalo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoIntervalo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipointervaloSessionBean.setsFuncionBusquedaRapida(this.tipointervaloSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoIntervalo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoIntervalo(esParaCancelar);				
				this.cancelarNuevoTipoIntervalo(esParaCancelar);								
			}
			
			this.tipointervalo=new TipoIntervalo();
			
			this.inicializarTipoIntervalo();
			
			this.actualizarEstadoCeldasBotonesTipoIntervalo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoIntervalo() throws Exception {
		try {
			TipoIntervaloConstantesFunciones.inicializarTipoIntervalo(this.tipointervalo);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipointervaloLogic.getTipoIntervalos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoIntervalos(String sAccionBusqueda,List<TipoIntervalo> tipointervalosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoIntervalo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoIntervaloMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoIntervaloMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoIntervalo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Intervalo s");		
		parameters.put("busquedapor", TipoIntervaloConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ParametroContabilidadDefecto.class));
			classes.add(new Classe(TablaAmortiDetalle.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoIntervaloLogic tipointervaloLogicAuxiliar=new TipoIntervaloLogic();
					tipointervaloLogicAuxiliar.setDatosCliente(tipointervaloLogic.getDatosCliente());				
					tipointervaloLogicAuxiliar.setTipoIntervalos(tipointervalosParaReportes);
					
					tipointervaloLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoIntervaloWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipointervalosParaReportes=tipointervaloLogicAuxiliar.getTipoIntervalos();
					
					//tipointervaloLogic.getNewConnexionToDeep();
					
					//for (TipoIntervalo tipointervalo:tipointervalosParaReportes) {
					//	tipointervaloLogic.deepLoad(tipointervalo, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipointervaloLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipointervaloLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileParametroContabilidadDefecto = AuxiliarReportes.class.getResourceAsStream("ParametroContabilidadDefectoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametrocontabilidaddefecto", reportFileParametroContabilidadDefecto);

			InputStream reportFileTablaAmortiDetalle = AuxiliarReportes.class.getResourceAsStream("TablaAmortiDetalleDetalleRelacionesDesign.jasper");
			parameters.put("subreport_tablaamortidetalle", reportFileTablaAmortiDetalle);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoIntervalo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoIntervaloConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoIntervaloConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoIntervalo=new JRBeanArrayDataSource(TipoIntervaloJInternalFrame.TraerTipoIntervaloBeans(tipointervalosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoIntervalo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoIntervaloConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoIntervaloConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoIntervaloBean.TraerTipoIntervaloBeans(tipointervalosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoIntervalos(sAccionBusqueda,sTipoArchivoReporte,tipointervalosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoIntervalos(sAccionBusqueda,sTipoArchivoReporte,tipointervalosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoIntervaloActionPerformed(null);
					//this.generarExcelReporteTipoIntervalos(sAccionBusqueda,sTipoArchivoReporte,tipointervalosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoIntervalos(sAccionBusqueda,sTipoArchivoReporte,tipointervalosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoIntervalos(sAccionBusqueda,sTipoArchivoReporte,tipointervalosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoIntervalos(sAccionBusqueda,sTipoArchivoReporte,tipointervalosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoIntervalos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoIntervalo> tipointervalosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipointervalo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoIntervalos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoIntervalo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoIntervalo tipointervalo : tipointervalosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoIntervaloConstantesFunciones.generarExcelReporteDataTipoIntervalo("NORMAL",row,workbook,tipointervalo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipointervaloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Intervalo ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoIntervalo(String sTipo,Row row,Workbook workbook) {
		
		TipoIntervaloConstantesFunciones.generarExcelReporteHeaderTipoIntervalo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoIntervalos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoIntervalo> tipointervalosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipointervalo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoIntervalos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoIntervalo tipointervalo : tipointervalosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoIntervaloConstantesFunciones.getTipoIntervaloDescripcion(tipointervalo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoIntervaloConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoIntervaloConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipointervalo.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipointervaloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Intervalo ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoIntervalos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoIntervalo> tipointervalosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoIntervalo> tipointervalosRespaldo=null;
		
		classes=TipoIntervaloConstantesFunciones.getClassesRelationshipsOfTipoIntervalo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipointervaloLogic.setDatosCliente(this.datosCliente);
		this.tipointervaloLogic.setDatosDeep(this.datosDeep);
		this.tipointervaloLogic.setIsConDeep(true);
		
		tipointervalosRespaldo=this.tipointervaloLogic.getTipoIntervalos();
		
		this.tipointervaloLogic.setTipoIntervalos(tipointervalosParaReportes);	
		this.tipointervaloLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipointervalosParaReportes=this.tipointervaloLogic.getTipoIntervalos();
		this.tipointervaloLogic.setTipoIntervalos(tipointervalosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipointervalo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoIntervalos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoIntervalo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoIntervalo tipointervalo : tipointervalosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoIntervalo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoIntervaloConstantesFunciones.generarExcelReporteDataTipoIntervalo("NORMAL",row,workbook,tipointervalo,cellStyleDataAux);
		
			
			


				//ParametroContabilidadDefecto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipointervalo.getParametroContabilidadDefectos()!=null && tipointervalo.getParametroContabilidadDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroContabilidadDefectoConstantesFunciones.generarExcelReporteHeaderParametroContabilidadDefecto("RELACIONADO",row,workbook);
				}

				if(tipointervalo.getParametroContabilidadDefectos()!=null) {
					i2=0;
					for(ParametroContabilidadDefecto parametrocontabilidaddefecto : tipointervalo.getParametroContabilidadDefectos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ParametroContabilidadDefectoConstantesFunciones.generarExcelReporteDataParametroContabilidadDefecto("RELACIONADO",row,workbook,parametrocontabilidaddefecto,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//TablaAmortiDetalle
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipointervalo.getTablaAmortiDetalles()!=null && tipointervalo.getTablaAmortiDetalles().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					TablaAmortiDetalleConstantesFunciones.generarExcelReporteHeaderTablaAmortiDetalle("RELACIONADO",row,workbook);
				}

				if(tipointervalo.getTablaAmortiDetalles()!=null) {
					i2=0;
					for(TablaAmortiDetalle tablaamortidetalle : tipointervalo.getTablaAmortiDetalles()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						TablaAmortiDetalleConstantesFunciones.generarExcelReporteDataTablaAmortiDetalle("RELACIONADO",row,workbook,tablaamortidetalle,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoIntervaloConstantesFunciones.getTipoIntervaloDescripcion(tipointervalo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipointervaloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Intervalo ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoIntervalo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIntervalo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoIntervalo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIntervalo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoIntervalo() throws Exception {		
		this.startProcessTipoIntervalo(true);
	}
	
	public void startProcessTipoIntervalo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoIntervalo, this.jScrollPanelDatosTipoIntervalo,this.jPanelPaginacionTipoIntervalo, this.jScrollPanelDatosEdicionTipoIntervalo, this.jPanelAccionesTipoIntervalo,this.jPanelAccionesFormularioTipoIntervalo,this.jmenuBarTipoIntervalo,this.jmenuBarDetalleTipoIntervalo,this.jTtoolBarTipoIntervalo,this.jTtoolBarDetalleTipoIntervalo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoIntervalo=null; 
		
		final JPanel jPanelParametrosReportesTipoIntervalo=this.jPanelParametrosReportesTipoIntervalo;
		//final JScrollPane jScrollPanelDatosTipoIntervalo=this.jScrollPanelDatosTipoIntervalo;
		final JTable jTableDatosTipoIntervalo=this.jTableDatosTipoIntervalo;		
		final JPanel jPanelPaginacionTipoIntervalo=this.jPanelPaginacionTipoIntervalo;
		//final JScrollPane jScrollPanelDatosEdicionTipoIntervalo=this.jScrollPanelDatosEdicionTipoIntervalo;
		final JPanel jPanelAccionesTipoIntervalo=this.jPanelAccionesTipoIntervalo;
		
		JPanel jPanelCamposAuxiliarTipoIntervalo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoIntervalo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) {
			jPanelCamposAuxiliarTipoIntervalo=this.jInternalFrameDetalleFormTipoIntervalo.jPanelCamposTipoIntervalo;
			jPanelAccionesFormularioAuxiliarTipoIntervalo=this.jInternalFrameDetalleFormTipoIntervalo.jPanelAccionesFormularioTipoIntervalo;
		}
		
		final JPanel jPanelCamposTipoIntervalo=jPanelCamposAuxiliarTipoIntervalo;
		final JPanel jPanelAccionesFormularioTipoIntervalo=jPanelAccionesFormularioAuxiliarTipoIntervalo;
		
		
		final JMenuBar jmenuBarTipoIntervalo=this.jmenuBarTipoIntervalo;
		final JToolBar jTtoolBarTipoIntervalo=this.jTtoolBarTipoIntervalo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoIntervalo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoIntervalo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) {
			jmenuBarDetalleAuxiliarTipoIntervalo=this.jInternalFrameDetalleFormTipoIntervalo.jmenuBarDetalleTipoIntervalo;
			jTtoolBarDetalleAuxiliarTipoIntervalo=this.jInternalFrameDetalleFormTipoIntervalo.jTtoolBarDetalleTipoIntervalo;
		}
		
		final JMenuBar jmenuBarDetalleTipoIntervalo=jmenuBarDetalleAuxiliarTipoIntervalo;
		final JToolBar jTtoolBarDetalleTipoIntervalo=jTtoolBarDetalleAuxiliarTipoIntervalo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoIntervalo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoIntervalo;
			processRunnable.jTableDatos=jTableDatosTipoIntervalo;
			processRunnable.jPanelCampos=jPanelCamposTipoIntervalo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoIntervalo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoIntervalo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoIntervalo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoIntervalo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoIntervalo;
			processRunnable.jTtoolBar=jTtoolBarTipoIntervalo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoIntervalo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoIntervalo ,jPanelParametrosReportesTipoIntervalo,jTableDatosTipoIntervalo, /*jScrollPanelDatosTipoIntervalo,*/jPanelCamposTipoIntervalo,jPanelPaginacionTipoIntervalo, /*jScrollPanelDatosEdicionTipoIntervalo,*/ jPanelAccionesTipoIntervalo,jPanelAccionesFormularioTipoIntervalo,jmenuBarTipoIntervalo,jmenuBarDetalleTipoIntervalo,jTtoolBarTipoIntervalo,jTtoolBarDetalleTipoIntervalo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoIntervalo, jScrollPanelDatosTipoIntervalo,jPanelPaginacionTipoIntervalo, jScrollPanelDatosEdicionTipoIntervalo, jPanelAccionesTipoIntervalo,jPanelAccionesFormularioTipoIntervalo,jmenuBarTipoIntervalo,jmenuBarDetalleTipoIntervalo,jTtoolBarTipoIntervalo,jTtoolBarDetalleTipoIntervalo);
						
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
	
	public void finishProcessTipoIntervalo() {// throws Exception 
		this.finishProcessTipoIntervalo(true);
	}
	
	public void finishProcessTipoIntervalo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoIntervalo, this.jScrollPanelDatosTipoIntervalo,this.jPanelPaginacionTipoIntervalo, this.jScrollPanelDatosEdicionTipoIntervalo, this.jPanelAccionesTipoIntervalo,this.jPanelAccionesFormularioTipoIntervalo,this.jmenuBarTipoIntervalo,this.jmenuBarDetalleTipoIntervalo,this.jTtoolBarTipoIntervalo,this.jTtoolBarDetalleTipoIntervalo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoIntervalo=null; 
		
		final JPanel jPanelParametrosReportesTipoIntervalo=this.jPanelParametrosReportesTipoIntervalo;
		//final JScrollPane jScrollPanelDatosTipoIntervalo=this.jScrollPanelDatosTipoIntervalo;
		final JTable jTableDatosTipoIntervalo=this.jTableDatosTipoIntervalo;		
		final JPanel jPanelPaginacionTipoIntervalo=this.jPanelPaginacionTipoIntervalo;
		//final JScrollPane jScrollPanelDatosEdicionTipoIntervalo=this.jScrollPanelDatosEdicionTipoIntervalo;
		final JPanel jPanelAccionesTipoIntervalo=this.jPanelAccionesTipoIntervalo;
		
		JPanel jPanelCamposAuxiliarTipoIntervalo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoIntervalo=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) {
			jPanelCamposAuxiliarTipoIntervalo=this.jInternalFrameDetalleFormTipoIntervalo.jPanelCamposTipoIntervalo;
			jPanelAccionesFormularioAuxiliarTipoIntervalo=this.jInternalFrameDetalleFormTipoIntervalo.jPanelAccionesFormularioTipoIntervalo;
		}
		
		final JPanel jPanelCamposTipoIntervalo=jPanelCamposAuxiliarTipoIntervalo;
		final JPanel jPanelAccionesFormularioTipoIntervalo=jPanelAccionesFormularioAuxiliarTipoIntervalo;
		
		
		final JMenuBar jmenuBarTipoIntervalo=this.jmenuBarTipoIntervalo;		
		final JToolBar jTtoolBarTipoIntervalo=this.jTtoolBarTipoIntervalo;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoIntervalo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoIntervalo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) {
			jmenuBarDetalleAuxiliarTipoIntervalo=this.jInternalFrameDetalleFormTipoIntervalo.jmenuBarDetalleTipoIntervalo;
			jTtoolBarDetalleAuxiliarTipoIntervalo=this.jInternalFrameDetalleFormTipoIntervalo.jTtoolBarDetalleTipoIntervalo;		
		}
		
		final JMenuBar jmenuBarDetalleTipoIntervalo=jmenuBarDetalleAuxiliarTipoIntervalo;
		final JToolBar jTtoolBarDetalleTipoIntervalo=jTtoolBarDetalleAuxiliarTipoIntervalo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoIntervalo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoIntervalo;
			processRunnable.jTableDatos=jTableDatosTipoIntervalo;
			processRunnable.jPanelCampos=jPanelCamposTipoIntervalo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoIntervalo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoIntervalo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoIntervalo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoIntervalo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoIntervalo;
			processRunnable.jTtoolBar=jTtoolBarTipoIntervalo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoIntervalo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoIntervalo ,jPanelParametrosReportesTipoIntervalo, jTableDatosTipoIntervalo,/*jScrollPanelDatosTipoIntervalo,*/jPanelCamposTipoIntervalo,jPanelPaginacionTipoIntervalo, /*jScrollPanelDatosEdicionTipoIntervalo,*/ jPanelAccionesTipoIntervalo,jPanelAccionesFormularioTipoIntervalo,jmenuBarTipoIntervalo,jmenuBarDetalleTipoIntervalo,jTtoolBarTipoIntervalo,jTtoolBarDetalleTipoIntervalo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoIntervalo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoIntervalo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoIntervalo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoIntervalo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoIntervalo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoIntervalo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoIntervalo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoIntervalo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoIntervalo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipointervaloConstantesFunciones.getsFinalQueryTipoIntervalo();
		String  finalQueryPaginacionTodos=this.tipointervaloConstantesFunciones.getsFinalQueryTipoIntervalo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoIntervaloConstantesFunciones.getArrayColumnasGlobalesNoTipoIntervalo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoIntervaloConstantesFunciones.getArrayColumnasGlobalesTipoIntervalo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoIntervaloConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipointervalosEliminados= new ArrayList<TipoIntervalo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoIntervalo();
		
				///*TipoIntervaloSessionBean*/this.tipointervaloSessionBean=new TipoIntervaloSessionBean();
			
			if(this.tipointervaloSessionBean==null) {
				this.tipointervaloSessionBean=new TipoIntervaloSessionBean();
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
					this.iNumeroPaginacion=TipoIntervaloConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoIntervaloConstantesFunciones.getClassesForeignKeysOfTipoIntervalo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipointervalo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipointervalosAux= new ArrayList<TipoIntervalo>();
			
				
			tipointervaloLogic.setDatosCliente(this.datosCliente);
			tipointervaloLogic.setDatosDeep(this.datosDeep);
			tipointervaloLogic.setIsConDeep(true);
			
			
			tipointervaloLogic.getTipoIntervaloDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipointervaloLogic.getTodosTipoIntervalos(finalQueryGlobal,pagination);
					
					//tipointervaloLogic.getTodosTipoIntervalosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipointervaloLogic.getTipoIntervalos()==null|| tipointervaloLogic.getTipoIntervalos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipointervalosAux= new ArrayList<TipoIntervalo>();
							tipointervalosAux.addAll(tipointervaloLogic.getTipoIntervalos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipointervalosAux= new ArrayList<TipoIntervalo>();
							tipointervalosAux.addAll(tipointervalos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipointervaloLogic.getTodosTipoIntervalos(finalQueryGlobal+"",this.pagination);												
							
							//tipointervaloLogic.getTodosTipoIntervalosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoIntervalos("Todos",tipointervaloLogic.getTipoIntervalos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipointervaloLogic.setTipoIntervalos(new ArrayList<TipoIntervalo>());					
							tipointervaloLogic.getTipoIntervalos().addAll(tipointervalosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipointervalos=new ArrayList<TipoIntervalo>();
							tipointervalos.addAll(tipointervalosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoIntervalo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoIntervalo=this.idActual;
				
				} else if(this.idTipoIntervaloActual!=null && this.idTipoIntervaloActual!=0L) {
					idTipoIntervalo=idTipoIntervaloActual;
				}
				
					
				this.sDetalleReporte=TipoIntervaloConstantesFunciones.getDetalleIndicePorId(idTipoIntervalo);
				
				this.tipointervalos=new ArrayList<TipoIntervalo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipointervaloLogic.getEntity(idTipoIntervalo);
					
					//tipointervaloLogic.getEntityWithConnection(idTipoIntervalo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipointervaloLogic.setTipoIntervalos(new ArrayList<TipoIntervalo>());
					tipointervaloLogic.getTipoIntervalos().add(tipointervaloLogic.getTipoIntervalo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipointervalos=new ArrayList<TipoIntervalo>();
					this.tipointervalos.add(tipointervalo);
				}
				
				if(tipointervaloLogic.getTipoIntervalo()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoIntervalo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoIntervalo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipointervaloLogic.getTipoIntervalos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipointervalos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipointervaloLogic.getTipoIntervalos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipointervalos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoIntervalo tipointervalo) {
		Boolean permite=true;
		
		if(this.tipointervalo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoIntervaloConstantesFunciones.getOrderByListaTipoIntervalo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoIntervaloConstantesFunciones.getOrderByListaTipoIntervalo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIntervalo tipointervalo:tipointervaloLogic.getTipoIntervalos()) {
				if(tipointervalo.getsType().equals(Constantes2.S_TOTALES)) {
					tipointervaloTotales=tipointervalo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIntervalo tipointervalo:this.tipointervalos) {
				if(tipointervalo.getsType().equals(Constantes2.S_TOTALES)) {
					tipointervaloTotales=tipointervalo;
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
			this.tipointervaloAux=new TipoIntervalo();
			this.tipointervaloAux.setsType(Constantes2.S_TOTALES);
			this.tipointervaloAux.setIsNew(false);
			this.tipointervaloAux.setIsChanged(false);
			this.tipointervaloAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoIntervaloConstantesFunciones.TotalizarValoresFilaTipoIntervalo(this.tipointervaloLogic.getTipoIntervalos(),this.tipointervaloAux);
				
				this.tipointervaloLogic.getTipoIntervalos().add(this.tipointervaloAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoIntervaloConstantesFunciones.TotalizarValoresFilaTipoIntervalo(this.tipointervalos,this.tipointervaloAux);
				
				this.tipointervalos.add(this.tipointervaloAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipointervaloTotales=new TipoIntervalo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipointervaloLogic.getTipoIntervalos().remove(tipointervaloTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipointervalos.remove(tipointervaloTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipointervaloTotales=new TipoIntervalo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIntervalo tipointervalo:tipointervaloLogic.getTipoIntervalos()) {
				if(tipointervalo.getsType().equals(Constantes2.S_TOTALES)) {
					tipointervaloTotales=tipointervalo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoIntervaloConstantesFunciones.TotalizarValoresFilaTipoIntervalo(this.tipointervaloLogic.getTipoIntervalos(),tipointervaloTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIntervalo tipointervalo:this.tipointervalos) {
				if(tipointervalo.getsType().equals(Constantes2.S_TOTALES)) {
					tipointervaloTotales=tipointervalo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoIntervaloConstantesFunciones.TotalizarValoresFilaTipoIntervalo(this.tipointervalos,tipointervaloTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoIntervaloPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoIntervaloPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipointervaloLogic.getTipoIntervaloPorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoIntervalo() {
		this.isPermisoTodoTipoIntervalo=false;
		this.isPermisoNuevoTipoIntervalo=false;
		this.isPermisoActualizarTipoIntervalo=false;
		this.isPermisoActualizarOriginalTipoIntervalo=false;
		this.isPermisoEliminarTipoIntervalo=false;
		this.isPermisoGuardarCambiosTipoIntervalo=false;
		this.isPermisoConsultaTipoIntervalo=false;
		this.isPermisoBusquedaTipoIntervalo=false;
		this.isPermisoReporteTipoIntervalo=false;		
		this.isPermisoOrdenTipoIntervalo=false;		
		this.isPermisoPaginacionMedioTipoIntervalo=false;		
		this.isPermisoPaginacionAltoTipoIntervalo=false;
		this.isPermisoPaginacionTodoTipoIntervalo=false;
		this.isPermisoCopiarTipoIntervalo=false;		
		this.isPermisoVerFormTipoIntervalo=false;		
		this.isPermisoDuplicarTipoIntervalo=false;		
		this.isPermisoOrdenTipoIntervalo=false;		
	}
	
	public void setPermisosUsuarioTipoIntervalo(Boolean isPermiso) {
		this.isPermisoTodoTipoIntervalo=isPermiso;
		this.isPermisoNuevoTipoIntervalo=isPermiso;
		this.isPermisoActualizarTipoIntervalo=isPermiso;
		this.isPermisoActualizarOriginalTipoIntervalo=isPermiso;
		this.isPermisoEliminarTipoIntervalo=isPermiso;
		this.isPermisoGuardarCambiosTipoIntervalo=isPermiso;
		this.isPermisoConsultaTipoIntervalo=isPermiso;
		this.isPermisoBusquedaTipoIntervalo=isPermiso;
		this.isPermisoReporteTipoIntervalo=isPermiso;
		this.isPermisoOrdenTipoIntervalo=isPermiso;		
		this.isPermisoPaginacionMedioTipoIntervalo=isPermiso;		
		this.isPermisoPaginacionAltoTipoIntervalo=isPermiso;		
		this.isPermisoPaginacionTodoTipoIntervalo=isPermiso;		
		this.isPermisoCopiarTipoIntervalo=isPermiso;		
		this.isPermisoVerFormTipoIntervalo=isPermiso;		
		this.isPermisoDuplicarTipoIntervalo=isPermiso;
		this.isPermisoOrdenTipoIntervalo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoIntervalo(Boolean isPermiso) {
		//this.isPermisoTodoTipoIntervalo=isPermiso;
		this.isPermisoNuevoTipoIntervalo=isPermiso;
		this.isPermisoActualizarTipoIntervalo=isPermiso;
		this.isPermisoActualizarOriginalTipoIntervalo=isPermiso;
		this.isPermisoEliminarTipoIntervalo=isPermiso;
		this.isPermisoGuardarCambiosTipoIntervalo=isPermiso;
		//this.isPermisoConsultaTipoIntervalo=isPermiso;
		//this.isPermisoBusquedaTipoIntervalo=isPermiso;
		//this.isPermisoReporteTipoIntervalo=isPermiso;
		//this.isPermisoOrdenTipoIntervalo=isPermiso;		
		//this.isPermisoPaginacionMedioTipoIntervalo=isPermiso;		
		//this.isPermisoPaginacionAltoTipoIntervalo=isPermiso;		
		//this.isPermisoPaginacionTodoTipoIntervalo=isPermiso;		
		//this.isPermisoCopiarTipoIntervalo=isPermiso;		
		//this.isPermisoDuplicarTipoIntervalo=isPermiso;
		//this.isPermisoOrdenTipoIntervalo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoIntervaloClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ParametroContabilidadDefectoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(TablaAmortiDetalleConstantesFunciones.SNOMBREOPCION);
		
		if(TipoIntervaloJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosParametroContabilidadDefecto=false;
		this.isTienePermisosParametroContabilidadDefecto=this.verificarGetPermisosUsuarioOpcionTipoIntervaloClaseRelacionada(this.opcionsRelacionadas,ParametroContabilidadDefectoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosTablaAmortiDetalle=false;
		this.isTienePermisosTablaAmortiDetalle=this.verificarGetPermisosUsuarioOpcionTipoIntervaloClaseRelacionada(this.opcionsRelacionadas,TablaAmortiDetalleConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoIntervalo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoIntervaloClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosParametroContabilidadDefecto=conPermiso;
		this.isTienePermisosTablaAmortiDetalle=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoIntervaloClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoIntervaloClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoIntervaloClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosParametroContabilidadDefecto && this.jInternalFrameDetalleFormTipoIntervalo!=null && this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoIntervalo.jTabbedPaneRelacionesTipoIntervalo.remove(this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosTablaAmortiDetalle && this.jInternalFrameDetalleFormTipoIntervalo!=null && this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoIntervalo.jTabbedPaneRelacionesTipoIntervalo.remove(this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoIntervalo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoIntervaloJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoIntervaloConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoIntervalo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoIntervalo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoIntervalo=this.isPermisoActualizarTipoIntervalo;
			this.isPermisoEliminarTipoIntervalo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoIntervalo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoIntervalo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoIntervalo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoIntervalo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoIntervalo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoIntervalo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoIntervalo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoIntervalo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoIntervalo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoIntervalo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoIntervalo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoIntervalo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoIntervalo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoIntervalo.setToolTipText(this.jTableDatosTipoIntervalo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoIntervalo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoIntervalo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoIntervaloJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoIntervaloJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoIntervalo() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosParametroContabilidadDefecto && this.tipointervaloConstantesFunciones.mostrarParametroContabilidadDefectoTipoIntervalo && !TipoIntervaloConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parametro Contabilidad Defecto");
			reporte.setsDescripcion("Parametro Contabilidad Defecto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosTablaAmortiDetalle && this.tipointervaloConstantesFunciones.mostrarTablaAmortiDetalleTipoIntervalo && !TipoIntervaloConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Tabla Amortizacion Detalle");
			reporte.setsDescripcion("Tabla Amortizacion Detalle");
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
	
		
	public void inicializarCombosForeignKeyTipoIntervaloListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoIntervaloListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoIntervaloJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoIntervaloListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoIntervaloListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoIntervalo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoIntervalo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoIntervalo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoIntervalo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoIntervalo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoIntervalo(TipoIntervalo tipointervalo)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoIntervalo(TipoIntervalo tipointervalo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoIntervalo()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoIntervalo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoIntervalo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoIntervalo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoIntervalo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoIntervalo()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoIntervalo(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoIntervalo()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoIntervaloBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoIntervaloBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoIntervaloBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipointervaloSessionBean=new TipoIntervaloSessionBean(); 
		this.tipointervaloConstantesFunciones=new TipoIntervaloConstantesFunciones(); 
		this.tipointervaloBean=new TipoIntervalo();//(this.tipointervaloConstantesFunciones); 		
		this.tipointervaloReturnGeneral=new TipoIntervaloParameterReturnGeneral(); 
		
		this.tipointervaloSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipointervaloSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoIntervaloBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoIntervaloBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoIntervaloBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoIntervalo(true);
			
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
			
			this.tipointervaloConstantesFunciones=new TipoIntervaloConstantesFunciones(); 
			this.tipointervaloBean=new TipoIntervalo();//this.tipointervaloConstantesFunciones); 			
			this.tipointervaloReturnGeneral=new TipoIntervaloParameterReturnGeneral(); 
		
			TipoIntervaloBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Intervalo  Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipointervalo=new TipoIntervalo();
			this.tipointervalos = new ArrayList<TipoIntervalo>();
			this.tipointervalosAux = new ArrayList<TipoIntervalo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic=new TipoIntervaloLogic();
				this.tipointervaloLogic.getNewConnexionToDeep("");
			}
			
			//this.tipointervaloSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipointervaloSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoIntervalo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoIntervalo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoIntervalo);	
					}
					
					if(this.jInternalFrameImportacionTipoIntervalo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoIntervalo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoIntervalo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoIntervalo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoIntervalo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoIntervalo);
				this.jInternalFrameDetalleFormTipoIntervalo.setVisible(false);
				this.jInternalFrameDetalleFormTipoIntervalo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoIntervalo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoIntervalo);
					this.jInternalFrameReporteDinamicoTipoIntervalo.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoIntervalo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoIntervalo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoIntervalo);
					this.jInternalFrameImportacionTipoIntervalo.setVisible(false);
					this.jInternalFrameImportacionTipoIntervalo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoIntervalo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoIntervalo);
					this.jInternalFrameOrderByTipoIntervalo.setVisible(false);
					this.jInternalFrameOrderByTipoIntervalo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoIntervaloActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoIntervaloConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipointervaloReturnGeneral=new TipoIntervaloParameterReturnGeneral();
			
			this.tipointervaloParameterGeneral=new TipoIntervaloParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipointervaloLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoIntervaloJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ParametroContabilidadDefectoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(TablaAmortiDetalleConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoIntervaloConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipointervaloSessionBean.getEsGuardarRelacionado(),this.tipointervaloSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoIntervaloConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipointervaloSessionBean.getEsGuardarRelacionado(),this.tipointervaloSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoIntervalo=false;
			this.isVisibilidadCeldaDuplicarTipoIntervalo=true;
			this.isVisibilidadCeldaCopiarTipoIntervalo=true;
			this.isVisibilidadCeldaVerFormTipoIntervalo=true;
			this.isVisibilidadCeldaOrdenTipoIntervalo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoIntervalo=false;
			this.isVisibilidadCeldaModificarTipoIntervalo=false;
			this.isVisibilidadCeldaActualizarTipoIntervalo=false;
			this.isVisibilidadCeldaEliminarTipoIntervalo=false;
			this.isVisibilidadCeldaCancelarTipoIntervalo=false;
			this.isVisibilidadCeldaGuardarTipoIntervalo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIntervalo=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoIntervalo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoIntervalo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoIntervalo(false);
			
			this.setPermisosUsuarioTipoIntervalo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipointervaloSessionBean.getEsGuardarRelacionado() 
				|| (this.tipointervaloSessionBean.getEsGuardarRelacionado() && this.tipointervaloSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoIntervaloClasesRelacionadas();
			}
			
			if(this.tipointervaloSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoIntervaloClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoIntervaloJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoIntervalo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoIntervalo();
			}
			
			if(!this.isPermisoBusquedaTipoIntervalo) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipointervaloSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoIntervalo,this.isPermisoPaginacionMedioTipoIntervalo,this.isPermisoPaginacionTodoTipoIntervalo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoIntervaloConstantesFunciones.getTiposSeleccionarTipoIntervalo());
				
				this.tiposColumnasSelect=TipoIntervaloConstantesFunciones.getTiposSeleccionarTipoIntervalo(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoIntervalo();				
				//this.tiposRelacionesSelect=TipoIntervaloConstantesFunciones.getTiposRelacionesTipoIntervalo(true);
				
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
			//if(!this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoIntervalo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoIntervalo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoIntervalo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoIntervalo() ;
			
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
			
			
			this.parametrocontabilidaddefectoLogic=new ParametroContabilidadDefectoLogic();
			this.tablaamortidetalleLogic=new TablaAmortiDetalleLogic(); 
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
				tipointervaloImplementable= (TipoIntervaloImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoIntervaloConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipointervaloImplementableHome= (TipoIntervaloImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoIntervaloConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipointervalos= new ArrayList<TipoIntervalo>();
			this.tipointervalosEliminados= new ArrayList<TipoIntervalo>();
						
			this.isEsNuevoTipoIntervalo=false;
			this.esParaAccionDesdeFormularioTipoIntervalo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoIntervalo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoIntervalo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoIntervaloConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoIntervalo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoIntervalo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoIntervalo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoIntervalo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoIntervalo();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoIntervalo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoIntervalo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoIntervalo() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoIntervalo")) {
				iIndex=this.jInternalFrameDetalleFormTipoIntervalo.jTabbedPaneRelacionesTipoIntervalo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoIntervalo.jTabbedPaneRelacionesTipoIntervalo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoIntervalo.getSelectedRow();	
				
				

				if(sTitle.equals("Parametro Contabilidad Defectos")) {
					if(!ParametroContabilidadDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoIntervalo();

						this.cargarParteTabPanelRelacionadaParametroContabilidadDefecto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Tabla Amortizacion Detalles")) {
					if(!TablaAmortiDetalleJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoIntervalo();

						this.cargarParteTabPanelRelacionadaTablaAmortiDetalle(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoIntervalo();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaParametroContabilidadDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoIntervalo.cargarSessionConBeanSwingJInternalFrameParametroContabilidadDefecto(false,true,iIndex);
		this.jButtonParametroContabilidadDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroContabilidadDefecto();

		//this.jTabbedPaneRelacionesTipoIntervalo.updateUI();
		//this.jTabbedPaneRelacionesTipoIntervalo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoIntervalo.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaTablaAmortiDetalle(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoIntervalo.cargarSessionConBeanSwingJInternalFrameTablaAmortiDetalle(false,true,iIndex);
		this.jButtonTablaAmortiDetalleActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaTablaAmortiDetalle();

		//this.jTabbedPaneRelacionesTipoIntervalo.updateUI();
		//this.jTabbedPaneRelacionesTipoIntervalo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoIntervalo.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ParametroContabilidadDefecto")) {
				int row=this.jTableDatosTipoIntervalo.getSelectedRow();
				jButtonParametroContabilidadDefectoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("TablaAmortiDetalle")) {
				int row=this.jTableDatosTipoIntervalo.getSelectedRow();
				jButtonTablaAmortiDetalleActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Parametro Contabilidad Defecto")) {

					if(this.isTienePermisosParametroContabilidadDefecto && this.tipointervaloConstantesFunciones.mostrarParametroContabilidadDefectoTipoIntervalo && !TipoIntervaloConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Contabilidad Defectos"+"("+ParametroContabilidadDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Contabilidad Defectos");

						if(tipointervaloConstantesFunciones.resaltarParametroContabilidadDefectoTipoIntervalo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipointervaloConstantesFunciones.resaltarParametroContabilidadDefectoTipoIntervalo);
						}

						jmenuItem.setEnabled(this.tipointervaloConstantesFunciones.activarParametroContabilidadDefectoTipoIntervalo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroContabilidadDefecto"));

						

						this.jInternalFrameDetalleFormTipoIntervalo.jmenuDetalleTipoIntervalo.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Tabla Amortizacion Detalle")) {

					if(this.isTienePermisosTablaAmortiDetalle && this.tipointervaloConstantesFunciones.mostrarTablaAmortiDetalleTipoIntervalo && !TipoIntervaloConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Tabla Amortizacion Detalles"+"("+TablaAmortiDetalleConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Tabla Amortizacion Detalles");

						if(tipointervaloConstantesFunciones.resaltarTablaAmortiDetalleTipoIntervalo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipointervaloConstantesFunciones.resaltarTablaAmortiDetalleTipoIntervalo);
						}

						jmenuItem.setEnabled(this.tipointervaloConstantesFunciones.activarTablaAmortiDetalleTipoIntervalo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"TablaAmortiDetalle"));

						

						this.jInternalFrameDetalleFormTipoIntervalo.jmenuDetalleTipoIntervalo.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoIntervalo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoIntervalo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoIntervalo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoIntervaloListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoIntervalo();
		
		this.cargarCombosFrameForeignKeyTipoIntervalo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoIntervalo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoIntervalo();
		}
	}
	
	
	
	public void jButtonNuevoTipoIntervaloActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipointervaloSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoIntervalo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
			
			
			if(jTableDatosTipoIntervalo.getRowCount()>=1) {
				jTableDatosTipoIntervalo.removeRowSelectionInterval(0, jTableDatosTipoIntervalo.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoIntervalo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoIntervalo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoIntervalo(true);			
			//this.tipointervalo=new TipoIntervalo();
			//this.tipointervalo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoIntervalo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoIntervalo() ;
			
			if(TipoIntervaloJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoIntervalo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipointervalo);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipointervalo);				
			
			TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
			
			if(this.tipointervaloSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoIntervalo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoIntervaloActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoIntervalo> tipointervalosSeleccionados=new ArrayList<TipoIntervalo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoIntervalo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoIntervalo.getSelectedRows().length;			
			}
			
			tipointervalosSeleccionados=this.getTipoIntervalosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoIntervalo--;			
				//TipoIntervalo tipointervaloAux= new TipoIntervalo();			
				//tipointervaloAux.setId(this.iIdNuevoTipoIntervalo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoIntervalo tipointervaloOrigen=new TipoIntervalo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoIntervalo tipointervaloOrigen : tipointervalosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoIntervalo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipointervaloOrigen =(TipoIntervalo) this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipointervaloOrigen =(TipoIntervalo) this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoIntervalo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipointervalo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoIntervalo(tipointervaloOrigen,this.tipointervalo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIntervalo(this.tipointervalo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipointervaloLogic.getTipoIntervalos().add(this.tipointervaloAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipointervalos.add(this.tipointervaloAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoIntervalo(false);
				
				this.jTableDatosTipoIntervalo.setRowSelectionInterval(this.getIndiceNuevoTipoIntervalo(), this.getIndiceNuevoTipoIntervalo());
				
				int iLastRow =  this.jTableDatosTipoIntervalo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoIntervalo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoIntervalo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoIntervalo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoIntervaloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoIntervalo> tipointervalosSeleccionados=new ArrayList<TipoIntervalo>();									
		
			TipoIntervalo tipointervaloOrigen=new TipoIntervalo();
			TipoIntervalo tipointervaloDestino=new TipoIntervalo();
				
			tipointervalosSeleccionados=this.getTipoIntervalosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoIntervalo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipointervalosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoIntervalo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipointervaloOrigen =(TipoIntervalo) this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipointervaloOrigen =(TipoIntervalo) this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipointervaloDestino =(TipoIntervalo) this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipointervaloDestino =(TipoIntervalo) this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipointervaloOrigen =tipointervalosSeleccionados.get(0);
				tipointervaloDestino =tipointervalosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoIntervalo(tipointervaloOrigen,tipointervaloDestino,true,false);
				
				tipointervaloDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipointervaloDestino,tipointervaloLogic.getTipoIntervalos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipointervaloDestino,tipointervalos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoIntervalo(false);
				
				//this.jTableDatosTipoIntervalo.setRowSelectionInterval(this.getIndiceNuevoTipoIntervalo(), this.getIndiceNuevoTipoIntervalo());
				
				int iLastRow =  this.jTableDatosTipoIntervalo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoIntervalo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoIntervalo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoIntervalo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoIntervaloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoIntervalo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoIntervalo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoIntervaloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoIntervalo.isVisible();
			
			
			this.jPanelParametrosReportesTipoIntervalo.setVisible(!isVisible);
			this.jPanelPaginacionTipoIntervalo.setVisible(!isVisible);
			this.jPanelAccionesTipoIntervalo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoIntervaloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoIntervalo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoIntervaloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoIntervalo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoIntervaloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoIntervalo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoIntervaloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoIntervalo();
			
			this.abrirFrameOrderByTipoIntervalo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoIntervaloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoIntervalo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoIntervalo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoIntervalo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoIntervalo.isMaximum()) {
					this.jInternalFrameDetalleFormTipoIntervalo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoIntervalo.setSize(this.jInternalFrameDetalleFormTipoIntervalo.iWidthFormulario,this.jInternalFrameDetalleFormTipoIntervalo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoIntervalo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoIntervalo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoIntervalo.isMaximum()) {
						this.jInternalFrameDetalleFormTipoIntervalo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoIntervalo.jContentPaneDetalleTipoIntervalo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoIntervalo.jTabbedPaneRelacionesTipoIntervalo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoIntervalo.jContentPaneDetalleTipoIntervalo.getWidth(),TipoIntervaloConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoIntervalo.jTabbedPaneRelacionesTipoIntervalo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoIntervalo.jContentPaneDetalleTipoIntervalo.getWidth(),TipoIntervaloConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoIntervalo.jTabbedPaneRelacionesTipoIntervalo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoIntervalo.jContentPaneDetalleTipoIntervalo.getWidth(),TipoIntervaloConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ParametroContabilidadDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroContabilidadDefecto();
					}

					if(TablaAmortiDetalleJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaTablaAmortiDetalle();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoIntervalo.setVisible(true);
	        this.jInternalFrameDetalleFormTipoIntervalo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoIntervalo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoIntervalo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoIntervalo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoIntervalo,false,this);
				} else {
					this.jInternalFrameOrderByTipoIntervalo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoIntervalo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoIntervalo);
				this.jInternalFrameOrderByTipoIntervalo.setVisible(false);
				this.jInternalFrameOrderByTipoIntervalo.setSelected(false);
				
				this.jInternalFrameOrderByTipoIntervalo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoIntervalo"));
				
				this.inicializarActualizarBindingTablaOrderByTipoIntervalo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoIntervalo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoIntervalo==null) {
				
				this.jInternalFrameImportacionTipoIntervalo=new ImportacionJInternalFrame(TipoIntervaloConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoIntervalo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoIntervalo);
				this.jInternalFrameImportacionTipoIntervalo.setVisible(false);
				this.jInternalFrameImportacionTipoIntervalo.setSelected(false);


				this.jInternalFrameImportacionTipoIntervalo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoIntervalo"));
				this.jInternalFrameImportacionTipoIntervalo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoIntervalo"));
				this.jInternalFrameImportacionTipoIntervalo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoIntervalo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoIntervalo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoIntervalo==null) {
				this.jInternalFrameReporteDinamicoTipoIntervalo=new ReporteDinamicoJInternalFrame(TipoIntervaloConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoIntervalo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoIntervalo);
				this.jInternalFrameReporteDinamicoTipoIntervalo.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoIntervalo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoIntervalo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoIntervalo"));
				this.jInternalFrameReporteDinamicoTipoIntervalo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoIntervalo"));
				this.jInternalFrameReporteDinamicoTipoIntervalo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoIntervalo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoIntervalo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaParametroContabilidadDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroContabilidadDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoIntervalo.jContentPaneDetalleTipoIntervalo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroContabilidadDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroContabilidadDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroContabilidadDefecto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaTablaAmortiDetalle() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame.jScrollPanelDatosTablaAmortiDetalle.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoIntervalo.jContentPaneDetalleTipoIntervalo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame.jScrollPanelDatosTablaAmortiDetalle.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame.jScrollPanelDatosTablaAmortiDetalle.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame.jScrollPanelDatosTablaAmortiDetalle.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoIntervalo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoIntervalo);
			
	       	this.jInternalFrameDetalleFormTipoIntervalo.setVisible(false);
	        this.jInternalFrameDetalleFormTipoIntervalo.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoIntervalo.dispose();
			//this.jInternalFrameDetalleFormTipoIntervalo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoIntervalo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoIntervalo.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoIntervalo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoIntervalo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoIntervalo.setVisible(true);
	        this.jInternalFrameImportacionTipoIntervalo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoIntervalo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoIntervalo.setVisible(true);
	        this.jInternalFrameOrderByTipoIntervalo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoIntervalo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoIntervalo.setVisible(false);
	        this.jInternalFrameOrderByTipoIntervalo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoIntervalo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoIntervalo.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoIntervalo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoIntervalo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoIntervalo.setVisible(false);
	        this.jInternalFrameImportacionTipoIntervalo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoIntervaloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoIntervalo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoIntervalo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoIntervalo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoIntervalo(true);
			//this.isEsNuevoTipoIntervalo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervalo =(TipoIntervalo) this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipointervalo =(TipoIntervalo) this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoIntervalo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoIntervalo(false) ;
			
			if(tipointervaloSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado() && ParametroContabilidadDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroContabilidadDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame.tablaamortidetalleSessionBean.getEsGuardarRelacionado() && TablaAmortiDetalleJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTablaAmortiDetalleActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoIntervaloJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoIntervalo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoIntervalo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoIntervaloActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoIntervalo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervalo =(TipoIntervalo) this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipointervalo =(TipoIntervalo) this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoIntervalo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoIntervalo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoIntervalo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoIntervalo(true);
			//this.isEsNuevoTipoIntervalo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervalo =(TipoIntervalo) this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipointervalo =(TipoIntervalo) this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipointervalo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoIntervalo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoIntervalo(false) ;
			
			if(TipoIntervaloJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoIntervalo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoIntervalo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoIntervaloActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoIntervalo(false);
			
			//if(!this.isEsNuevoTipoIntervalo) {								
				int intSelectedRow = this.jTableDatosTipoIntervalo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervalo =(TipoIntervalo) this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipointervalo =(TipoIntervalo) this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoIntervaloJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoIntervalo(this.tipointervalo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoIntervalo(this.tipointervalo);
				
			}
			
			if(this.permiteMantenimiento(this.tipointervalo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoIntervalo=true;
					this.inicializarActualizarBindingTablaTipoIntervalo(false);
					this.isEsNuevoTipoIntervalo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoIntervalo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoIntervalo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoIntervalo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoIntervalo(false);
				
				this.habilitarDeshabilitarControlesTipoIntervalo(false);
			
												
				
				if(TipoIntervaloJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoIntervalo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoIntervaloActionPerformed(evt,tipointervaloSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoIntervalo(this.tipointervalo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoIntervalo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipointervaloSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipointervalo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoIntervalo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIntervalo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoIntervaloActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoIntervalo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervalo =(TipoIntervalo) this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
				this.tipointervalo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipointervalo =(TipoIntervalo) this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
				this.tipointervalo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipointervalo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoIntervaloModel) this.jTableDatosTipoIntervalo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoIntervalo=true;
				this.inicializarActualizarBindingTablaTipoIntervalo(false);
				this.isEsNuevoTipoIntervalo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoIntervalo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoIntervalo(false);
				
				this.habilitarDeshabilitarControlesTipoIntervalo(false);
				
				
				
				if(TipoIntervaloJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoIntervalo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoIntervaloActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoIntervalo.getRowCount()>=1) {
				jTableDatosTipoIntervalo.removeRowSelectionInterval(0, jTableDatosTipoIntervalo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoIntervalo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoIntervalo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoIntervalo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoIntervalo(false) ;
			
			this.isEsNuevoTipoIntervalo=false;
			
			if(TipoIntervaloJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoIntervalo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoIntervaloActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoIntervalo(false);
				
				//SI ES MANUAL
				if(TipoIntervaloJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoIntervalo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoIntervaloActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoIntervalo--;			
			//TipoIntervalo tipointervaloAux= new TipoIntervalo();			
			//tipointervaloAux.setId(this.iIdNuevoTipoIntervalo);
			
			if(this.jInternalFrameDetalleFormTipoIntervalo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoIntervalo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoIntervalo(this.tipointervalo);
			
			this.tipointervalo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipointervaloLogic.getTipoIntervalos().add(this.tipointervaloAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipointervalos.add(this.tipointervaloAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoIntervalo(false);
			
			this.jTableDatosTipoIntervalo.setRowSelectionInterval(this.getIndiceNuevoTipoIntervalo(), this.getIndiceNuevoTipoIntervalo());
			
			int iLastRow =  this.jTableDatosTipoIntervalo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoIntervalo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoIntervalo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoIntervalo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoIntervaloActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoIntervalo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoIntervalo(false);
			
			//SI ES MANUAL
			if(TipoIntervaloJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoIntervalo();
			}
			
			//this.abrirFrameTreeTipoIntervalo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoIntervaloActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Intervalo S ?", "MANTENIMIENTO DE Tipo Intervalo ", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoIntervalo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoIntervalo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipointervaloReturnGeneral=tipointervaloLogic.procesarImportacionTipoIntervalosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipointervaloParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoIntervaloReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoIntervaloActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoIntervalo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoIntervalo.setFileImportacion(this.jInternalFrameImportacionTipoIntervalo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoIntervalo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoIntervalo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoIntervalo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoIntervalo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoIntervaloActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoIntervalo> tipointervalosSeleccionados=new ArrayList<TipoIntervalo>();		

		tipointervalosSeleccionados=this.getTipoIntervalosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoIntervalo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoIntervalo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoIntervaloBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoIntervaloBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoIntervalos("Todos",tipointervalosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipointervaloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Intervalo ",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoIntervalo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIntervalo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoIntervaloConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoIntervalo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoIntervalo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoIntervalo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoIntervaloConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoIntervalo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoIntervaloConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoIntervalo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIntervalo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoIntervaloConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoIntervaloActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoIntervalo> tipointervalosSeleccionados=new ArrayList<TipoIntervalo>();		
		
		tipointervalosSeleccionados=this.getTipoIntervalosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipointervalo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoIntervalos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoIntervalo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIntervalo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoIntervaloConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoIntervaloConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoIntervalo tipointervalo:tipointervalosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipointervalo.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoIntervalo(row);				
			//	iRow++;
			//}				
			
			//for(TipoIntervalo tipointervaloAux:tipointervalosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoIntervalo(tipointervaloAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipointervaloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Intervalo ",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipointervaloLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoIntervalo(false);
			
			//SI ES MANUAL
			if(TipoIntervaloJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoIntervalo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoIntervaloActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoIntervalo(false);
			
			//SI ES MANUAL
			if(TipoIntervaloJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoIntervalo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoIntervaloActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoIntervalo(false);
			
			//SI ES MANUAL
			if(TipoIntervaloJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoIntervalo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipointervaloLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoIntervalo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoIntervalo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoIntervalo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoIntervalo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoIntervalo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoIntervalo.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoIntervalo.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoIntervalo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoIntervalo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoIntervalo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoIntervalo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoIntervalo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoIntervalo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoIntervalo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoIntervalo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoIntervalo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoIntervaloJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoIntervaloJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoIntervalo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoIntervalo();
		
		this.inicializarActualizarBindingBotonesManualTipoIntervalo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoIntervalo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoIntervalo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoIntervalo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoIntervalo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoIntervalo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoIntervalo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoIntervalo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoIntervalo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoIntervalo.jCheckBoxPostAccionNuevoTipoIntervalo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoIntervalo.jCheckBoxPostAccionSinCerrarTipoIntervalo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoIntervalo.jCheckBoxPostAccionSinMensajeTipoIntervalo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoIntervalo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoIntervalo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoIntervalo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoIntervalo!=null) {
				this.jInternalFrameDetalleFormTipoIntervalo.jCheckBoxPostAccionNuevoTipoIntervalo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoIntervalo.jCheckBoxPostAccionSinCerrarTipoIntervalo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoIntervalo.jCheckBoxPostAccionSinMensajeTipoIntervalo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoIntervalo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoIntervalo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoIntervalo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoIntervalo.jComboBoxTiposAccionesFormularioTipoIntervalo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoIntervalo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoIntervalo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoIntervalo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoIntervalo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoIntervalo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoIntervalo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoIntervalo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoIntervalo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoIntervalo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoIntervalo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoIntervalo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoIntervalo(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoIntervaloJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoIntervalo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoIntervalo() throws Exception {
		try	{
			if(TipoIntervaloJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoIntervalo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoIntervalo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoIntervalo.jComboBoxTiposAccionesFormularioTipoIntervalo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoIntervalo.jComboBoxTiposAccionesFormularioTipoIntervalo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoIntervalo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoIntervalo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoIntervalo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoIntervalo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoIntervalo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoIntervalo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoIntervalo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoIntervalo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoIntervalo.addItem(reporte);
			}
			
			
			if(!this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoIntervalo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoIntervalo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoIntervalo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoIntervalo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoIntervalo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoIntervalo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoIntervalo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoIntervalo.jComboBoxTiposAccionesFormularioTipoIntervalo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoIntervalo.jComboBoxTiposAccionesFormularioTipoIntervalo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoIntervalo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoIntervalo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoIntervalo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoIntervalo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoIntervalo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoIntervalo!=null) {
				this.jInternalFrameReporteDinamicoTipoIntervalo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoIntervalo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoIntervalo!=null) {
				this.jInternalFrameReporteDinamicoTipoIntervalo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoIntervalo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoIntervalo!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoIntervalo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoIntervalo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoIntervalo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoIntervalo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoIntervalo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoIntervalo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoIntervalo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoIntervalo(Boolean esInicializar) throws Exception {				
		if(TipoIntervaloJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoIntervalo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoIntervalo() throws Exception {
		this.inicializarActualizarBindingTablaTipoIntervalo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoIntervalo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoIntervalo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoIntervalo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoIntervalo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoIntervaloPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoIntervalo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoIntervalo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoIntervaloPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoIntervaloOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoIntervaloOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoIntervaloPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoIntervalo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoIntervalo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoIntervaloPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoIntervalo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoIntervalo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipointervaloLogic.getTipoIntervalos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipointervalos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoIntervaloJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoIntervalo.setModel(new TipoIntervaloModel(this.tipointervaloLogic.getTipoIntervalos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoIntervalo.setModel(new TipoIntervaloModel(this.tipointervalos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoIntervalo!=null && this.jInternalFrameOrderByTipoIntervalo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoIntervalo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoIntervalo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoIntervalo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoIntervaloPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO,tipointervaloConstantesFunciones.resaltarSeleccionarTipoIntervalo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO,tipointervaloConstantesFunciones.resaltarSeleccionarTipoIntervalo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoIntervalo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoIntervalo,TipoIntervaloConstantesFunciones.LABEL_ID));

		if(this.tipointervaloConstantesFunciones.mostraridTipoIntervalo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoIntervaloConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipointervaloConstantesFunciones.resaltaridTipoIntervalo,this.tipointervaloConstantesFunciones.activaridTipoIntervalo,this,true,"idTipoIntervalo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipointervaloConstantesFunciones.resaltaridTipoIntervalo,this.tipointervaloConstantesFunciones.activaridTipoIntervalo,this,true,"idTipoIntervalo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoIntervalo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoIntervalo,TipoIntervaloConstantesFunciones.LABEL_NOMBRE));

		if(this.tipointervaloConstantesFunciones.mostrarnombreTipoIntervalo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoIntervaloConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipointervaloConstantesFunciones.resaltarnombreTipoIntervalo,this.tipointervaloConstantesFunciones.activarnombreTipoIntervalo,this,true,"nombreTipoIntervalo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipointervaloConstantesFunciones.resaltarnombreTipoIntervalo,this.tipointervaloConstantesFunciones.activarnombreTipoIntervalo,this,true,"nombreTipoIntervalo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoIntervaloPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipointervaloSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosParametroContabilidadDefecto && this.tipointervaloConstantesFunciones.mostrarParametroContabilidadDefectoTipoIntervalo && !TipoIntervaloConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Contabilidad Defectos");
				tableColumn.setHeaderValue("Parametro Contabilidad Defectos");
				tableColumn.setCellRenderer(new ParametroContabilidadDefectoTableCell(tipointervaloConstantesFunciones.resaltarParametroContabilidadDefectoTipoIntervalo,this,this.tipointervaloConstantesFunciones.activarParametroContabilidadDefectoTipoIntervalo));
				tableColumn.setCellEditor(new ParametroContabilidadDefectoTableCell(tipointervaloConstantesFunciones.resaltarParametroContabilidadDefectoTipoIntervalo,this,this.tipointervaloConstantesFunciones.activarParametroContabilidadDefectoTipoIntervalo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoIntervalo.addColumn(tableColumn);
			}

			if(this.isTienePermisosTablaAmortiDetalle && this.tipointervaloConstantesFunciones.mostrarTablaAmortiDetalleTipoIntervalo && !TipoIntervaloConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Tabla Amortizacion Detalles");
				tableColumn.setHeaderValue("Tabla Amortizacion Detalles");
				tableColumn.setCellRenderer(new TablaAmortiDetalleTableCell(tipointervaloConstantesFunciones.resaltarTablaAmortiDetalleTipoIntervalo,this,this.tipointervaloConstantesFunciones.activarTablaAmortiDetalleTipoIntervalo));
				tableColumn.setCellEditor(new TablaAmortiDetalleTableCell(tipointervaloConstantesFunciones.resaltarTablaAmortiDetalleTipoIntervalo,this,this.tipointervaloConstantesFunciones.activarTablaAmortiDetalleTipoIntervalo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoIntervalo.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipointervaloSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipointervaloSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoIntervalo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipointervaloSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipointervaloSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoIntervalo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoIntervalo && this.isPermisoGuardarCambiosTipoIntervalo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipointervaloSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipointervaloSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoIntervalo.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipointervaloSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoIntervalo.addColumn(tableColumn);
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
			
			this.jTableDatosTipoIntervalo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoIntervalo && this.isPermisoGuardarCambiosTipoIntervalo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipointervaloSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoIntervalo && this.isPermisoGuardarCambiosTipoIntervalo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoIntervalo.moveColumn(this.jTableDatosTipoIntervalo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoIntervalo.moveColumn(this.jTableDatosTipoIntervalo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipointervaloSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoIntervalo.moveColumn(this.jTableDatosTipoIntervalo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoIntervalo.moveColumn(this.jTableDatosTipoIntervalo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoIntervalo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoIntervalo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoIntervalo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoIntervaloJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoIntervalo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoIntervalo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoIntervaloJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoIntervaloJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoIntervalo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoIntervalo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoIntervalo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipointervaloLogic.getTipoIntervalos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipointervalos.size()-1;
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
		//this.jTableDatosTipoIntervalo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoIntervalo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoIntervalo();
			
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
				
				//this.isEsNuevoTipoIntervalo=false;
					
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
			
				if(this.tipointervaloSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoIntervalo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoIntervalo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoIntervalo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervalo =(TipoIntervalo) this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipointervalo =(TipoIntervalo) this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipointervalo.getsType().equals("DUPLICADO")
				   || this.tipointervalo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoIntervalo=true;
				
				} else {
					this.isEsNuevoTipoIntervalo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
					if(this.tipointervalo.getId()>=0 && !this.tipointervalo.getIsNew()) {						
						this.isEsNuevoTipoIntervalo=false;
						
					} else {
						this.isEsNuevoTipoIntervalo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoIntervalo(esRelaciones);						
				
				this.seleccionarTipoIntervalo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipointervalo.getId()<0) {
					this.isEsNuevoTipoIntervalo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoIntervalo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoIntervalo(evt,rowIndex);
				}	
				
				if(this.tipointervaloSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoIntervalo: " + this.dDif); 
					}
				}								
				
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoIntervalo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipointervalo)) {
					if(this.tipointervalo.getId()>0) {
						this.tipointervalo.setIsDeleted(true);
						
						this.tipointervalosEliminados.add(this.tipointervalo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipointervaloLogic.getTipoIntervalos().remove(this.tipointervalo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipointervalos.remove(this.tipointervalo);				
					}
					
					
					((TipoIntervaloModel) this.jTableDatosTipoIntervalo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoIntervalo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoIntervalo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoIntervalo) {
			
			if(this.jInternalFrameDetalleFormTipoIntervalo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoIntervalo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoIntervalo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervalo =(TipoIntervalo) this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipointervalo =(TipoIntervalo) this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoIntervaloJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoIntervalo(this.tipointervalo);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoIntervalo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoIntervalo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoIntervalo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoIntervalo(TipoIntervalo tipointervalo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoIntervalo(tipointervalo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoIntervalo(TipoIntervalo tipointervalo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoIntervalo(tipointervalo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoIntervalo(tipointervalo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoIntervalo(tipointervalo);
	}
	
	public void setVariablesObjetoActualToFormularioTipoIntervalo(TipoIntervalo tipointervalo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoIntervalo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoIntervalo.jTextFieldidTipoIntervalo.setText(tipointervalo.getId().toString());
			this.jInternalFrameDetalleFormTipoIntervalo.jTextAreanombreTipoIntervalo.setText(tipointervalo.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoIntervalo tipointervaloLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipointervaloLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoIntervalo tipointervaloLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipointervaloLocal=this.tipointervalo;
			} else {
				tipointervaloLocal=this.tipointervaloAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipointervaloLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoIntervalo(tipointervaloLocal,true);
					
					if(tipointervaloSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipointervaloLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipointervaloLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoIntervalo(TipoIntervalo tipointervalo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoIntervalo(tipointervalo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoIntervalo(tipointervalo);
	}
	
	public void setVariablesFormularioToObjetoActualTipoIntervalo(TipoIntervalo tipointervalo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoIntervalo(tipointervalo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoIntervalo(TipoIntervalo tipointervalo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoIntervalo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoIntervalo.jTextFieldidTipoIntervalo.getText()==null || this.jInternalFrameDetalleFormTipoIntervalo.jTextFieldidTipoIntervalo.getText()=="" || this.jInternalFrameDetalleFormTipoIntervalo.jTextFieldidTipoIntervalo.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoIntervalo.jTextFieldidTipoIntervalo.setText("0");
			}

			if(conColumnasBase) {tipointervalo.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoIntervalo.jTextFieldidTipoIntervalo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoIntervaloConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoIntervalo.jLabelIdTipoIntervalo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipointervalo.setnombre(this.jInternalFrameDetalleFormTipoIntervalo.jTextAreanombreTipoIntervalo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoIntervaloConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoIntervalo.jLabelnombreTipoIntervalo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoIntervalo(TipoIntervalo tipointervaloBean,TipoIntervalo tipointervalo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoIntervalo(TipoIntervalo tipointervaloOrigen,TipoIntervalo tipointervalo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipointervaloOrigen.getId()!=null && !tipointervaloOrigen.getId().equals(0L))) {tipointervalo.setId(tipointervaloOrigen.getId());}}
			if(conDefault || (!conDefault && tipointervaloOrigen.getnombre()!=null && !tipointervaloOrigen.getnombre().equals(""))) {tipointervalo.setnombre(tipointervaloOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoIntervalo(TipoIntervalo tipointervalo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoIntervalo.jTextFieldidTipoIntervalo.setText(tipointervalo.getId().toString());
			this.jInternalFrameDetalleFormTipoIntervalo.jTextAreanombreTipoIntervalo.setText(tipointervalo.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoIntervalo(TipoIntervaloBean tipointervaloBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoIntervalo.jTextFieldidTipoIntervalo.setText(tipointervaloBean.getId().toString());
			this.jInternalFrameDetalleFormTipoIntervalo.jTextAreanombreTipoIntervalo.setText(tipointervaloBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoIntervalo(TipoIntervaloParameterReturnGeneral tipointervaloReturnGeneral,TipoIntervaloBean tipointervaloBean,Boolean conDefault) throws Exception { 
		try {
			TipoIntervalo tipointervaloLocal=new TipoIntervalo();
			
			tipointervaloLocal=tipointervaloReturnGeneral.getTipoIntervalo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipointervaloLocal.getId()!=null && !tipointervaloLocal.getId().equals(0L))) {tipointervaloBean.setId(tipointervaloLocal.getId());}}
			if(conDefault || (!conDefault && tipointervaloLocal.getnombre()!=null && !tipointervaloLocal.getnombre().equals(""))) {tipointervaloBean.setnombre(tipointervaloLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoIntervaloGenerico(Long idTipoIntervaloSeleccionado,JComboBox jComboBoxTipoIntervalo,List<TipoIntervalo> tipointervalosLocal)throws Exception {
		try {
			TipoIntervalo  tipointervaloTemp=null;

			for(TipoIntervalo tipointervaloAux:tipointervalosLocal) {
				if(tipointervaloAux.getId()!=null && tipointervaloAux.getId().equals(idTipoIntervaloSeleccionado)) {
					tipointervaloTemp=tipointervaloAux;
					break;
				}
			}

			jComboBoxTipoIntervalo.setSelectedItem(tipointervaloTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoIntervaloGenerico(JComboBox jComboBoxTipoIntervalo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoIntervalo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoIntervalo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoIntervalo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoIntervalo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoIntervalo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoIntervalo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoIntervalo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoIntervalo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoIntervalo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoIntervalo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ParametroContabilidadDefecto")) {
			jButtonParametroContabilidadDefectoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("TablaAmortiDetalle")) {
			jButtonTablaAmortiDetalleActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipointervalo=(TipoIntervalo) tipointervaloLogic.getTipoIntervalos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipointervalo =(TipoIntervalo) tipointervalos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoIntervalo tipointervaloRow=new TipoIntervalo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipointervaloRow=(TipoIntervalo) tipointervaloLogic.getTipoIntervalos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipointervaloRow=(TipoIntervalo) tipointervalos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonParametroContabilidadDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoIntervalo tipointervalo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoIntervalo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervaloLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipointervalo = (TipoIntervalo)this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipointervalo = (TipoIntervalo)this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipointervalo!=null) {
						this.tipointervalo = tipointervalo;
					} else {
						this.tipointervalo = new TipoIntervalo();
					}
				}

				if(this.isTienePermisosParametroContabilidadDefecto && this.permiteMantenimiento(this.tipointervalo)) {
					ParametroContabilidadDefectoBeanSwingJInternalFrame parametrocontabilidaddefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFramePopup=new ParametroContabilidadDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametrocontabilidaddefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFramePopup;
					} else {
						parametrocontabilidaddefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame;
					}

					List<TipoIntervalo> tipointervalos=new ArrayList<TipoIntervalo>();
					tipointervalos.add(this.tipointervalo);
					if(!esRelacionado) {
						//parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.setConGuardarRelaciones(false);
						//parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametrocontabilidaddefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoIntervalo.cargarParametroContabilidadDefectoBeanSwingJInternalFrame(tipointervalos,this.tipointervalo,parametrocontabilidaddefectoBeanSwingJInternalFrame,/*conInicializar,*/parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones(),parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado());
					parametrocontabilidaddefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametrocontabilidaddefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroContabilidadDefecto("no_relacionado");

						parametrocontabilidaddefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroContabilidadDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroContabilidadDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametrocontabilidaddefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoIntervalo=(TitledBorder)this.jScrollPanelDatosTipoIntervalo.getBorder();
						TitledBorder titledBorderParametroContabilidadDefecto=(TitledBorder)parametrocontabilidaddefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroContabilidadDefecto.getBorder();

						titledBorderParametroContabilidadDefecto.setTitle(titledBorderTipoIntervalo.getTitle() + " -> Parametro Contabilidad Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametrocontabilidaddefectoBeanSwingJInternalFrame);
						}

						parametrocontabilidaddefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametrocontabilidaddefectoBeanSwingJInternalFrame);

						parametrocontabilidaddefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipointervaloSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Contabilidad Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervaloLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervaloLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervaloLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonTablaAmortiDetalleActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoIntervalo tipointervalo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoIntervalo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervaloLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipointervalo = (TipoIntervalo)this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipointervalo = (TipoIntervalo)this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipointervalo!=null) {
						this.tipointervalo = tipointervalo;
					} else {
						this.tipointervalo = new TipoIntervalo();
					}
				}

				if(this.isTienePermisosTablaAmortiDetalle && this.permiteMantenimiento(this.tipointervalo)) {
					TablaAmortiDetalleBeanSwingJInternalFrame tablaamortidetalleBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFramePopup=new TablaAmortiDetalleBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						tablaamortidetalleBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFramePopup;
					} else {
						tablaamortidetalleBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame;
					}

					List<TipoIntervalo> tipointervalos=new ArrayList<TipoIntervalo>();
					tipointervalos.add(this.tipointervalo);
					if(!esRelacionado) {
						//tablaamortidetalleBeanSwingJInternalFrame.tablaamortidetalleSessionBean.setConGuardarRelaciones(false);
						//tablaamortidetalleBeanSwingJInternalFrame.tablaamortidetalleSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					tablaamortidetalleBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoIntervalo.cargarTablaAmortiDetalleBeanSwingJInternalFrame(tipointervalos,this.tipointervalo,tablaamortidetalleBeanSwingJInternalFrame,/*conInicializar,*/tablaamortidetalleBeanSwingJInternalFrame.tablaamortidetalleSessionBean.getConGuardarRelaciones(),tablaamortidetalleBeanSwingJInternalFrame.tablaamortidetalleSessionBean.getEsGuardarRelacionado());
					tablaamortidetalleBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						tablaamortidetalleBeanSwingJInternalFrame.actualizarEstadoPanelsTablaAmortiDetalle("no_relacionado");

						tablaamortidetalleBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(TablaAmortiDetalleConstantesFunciones.ITAMANIOFILATABLA + (TablaAmortiDetalleConstantesFunciones.ITAMANIOFILATABLA/2));

						tablaamortidetalleBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoIntervalo=(TitledBorder)this.jScrollPanelDatosTipoIntervalo.getBorder();
						TitledBorder titledBorderTablaAmortiDetalle=(TitledBorder)tablaamortidetalleBeanSwingJInternalFrame.jScrollPanelDatosTablaAmortiDetalle.getBorder();

						titledBorderTablaAmortiDetalle.setTitle(titledBorderTipoIntervalo.getTitle() + " -> Tabla Amortizacion Detalle");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,tablaamortidetalleBeanSwingJInternalFrame);
						}

						tablaamortidetalleBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(tablaamortidetalleBeanSwingJInternalFrame);

						tablaamortidetalleBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipointervaloSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Tabla Amortizacion Detalle",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervaloLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervaloLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervaloLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoIntervalo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoIntervalo.setVisible((this.isVisibilidadCeldaNuevoTipoIntervalo && this.isPermisoNuevoTipoIntervalo));			
			this.jButtonDuplicarTipoIntervalo.setVisible((this.isVisibilidadCeldaDuplicarTipoIntervalo && this.isPermisoDuplicarTipoIntervalo));			
			this.jButtonCopiarTipoIntervalo.setVisible((this.isVisibilidadCeldaCopiarTipoIntervalo && this.isPermisoCopiarTipoIntervalo));
			this.jButtonVerFormTipoIntervalo.setVisible((this.isVisibilidadCeldaVerFormTipoIntervalo && this.isPermisoVerFormTipoIntervalo));
			
			this.jButtonAbrirOrderByTipoIntervalo.setVisible((this.isVisibilidadCeldaOrdenTipoIntervalo && this.isPermisoOrdenTipoIntervalo));			
			
			this.jButtonNuevoRelacionesTipoIntervalo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoIntervalo && this.isPermisoNuevoTipoIntervalo));			
			this.jButtonNuevoGuardarCambiosTipoIntervalo.setVisible((this.isVisibilidadCeldaNuevoTipoIntervalo && this.isPermisoNuevoTipoIntervalo && this.isPermisoGuardarCambiosTipoIntervalo));
			
			if(this.jInternalFrameDetalleFormTipoIntervalo!=null) {
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonModificarTipoIntervalo.setVisible((this.isVisibilidadCeldaModificarTipoIntervalo && this.isPermisoActualizarTipoIntervalo));	
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonActualizarTipoIntervalo.setVisible((this.isVisibilidadCeldaActualizarTipoIntervalo && this.isPermisoActualizarTipoIntervalo));	
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonEliminarTipoIntervalo.setVisible((this.isVisibilidadCeldaEliminarTipoIntervalo && this.isPermisoEliminarTipoIntervalo));
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonCancelarTipoIntervalo.setVisible(this.isVisibilidadCeldaCancelarTipoIntervalo);							
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonGuardarCambiosTipoIntervalo.setVisible((this.isVisibilidadCeldaGuardarTipoIntervalo && this.isPermisoGuardarCambiosTipoIntervalo));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoIntervalo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoIntervalo && this.isPermisoGuardarCambiosTipoIntervalo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoIntervalo.setVisible((this.isVisibilidadCeldaNuevoTipoIntervalo && this.isPermisoNuevoTipoIntervalo));						
			this.jButtonDuplicarToolBarTipoIntervalo.setVisible((this.isVisibilidadCeldaDuplicarTipoIntervalo && this.isPermisoDuplicarTipoIntervalo));						
			this.jButtonCopiarToolBarTipoIntervalo.setVisible((this.isVisibilidadCeldaCopiarTipoIntervalo && this.isPermisoCopiarTipoIntervalo));			
			this.jButtonVerFormToolBarTipoIntervalo.setVisible((this.isVisibilidadCeldaVerFormTipoIntervalo && this.isPermisoVerFormTipoIntervalo));			
			this.jButtonAbrirOrderByToolBarTipoIntervalo.setVisible((this.isVisibilidadCeldaOrdenTipoIntervalo && this.isPermisoOrdenTipoIntervalo));
			this.jButtonNuevoRelacionesToolBarTipoIntervalo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoIntervalo && this.isPermisoNuevoTipoIntervalo));			
			this.jButtonNuevoGuardarCambiosToolBarTipoIntervalo.setVisible((this.isVisibilidadCeldaNuevoTipoIntervalo && this.isPermisoNuevoTipoIntervalo && this.isPermisoGuardarCambiosTipoIntervalo));			
			
			if(this.jInternalFrameDetalleFormTipoIntervalo!=null) {
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonModificarToolBarTipoIntervalo.setVisible((this.isVisibilidadCeldaModificarTipoIntervalo && this.isPermisoActualizarTipoIntervalo));	
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonActualizarToolBarTipoIntervalo.setVisible((this.isVisibilidadCeldaActualizarTipoIntervalo  && this.isPermisoActualizarTipoIntervalo));	
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonEliminarToolBarTipoIntervalo.setVisible((this.isVisibilidadCeldaEliminarTipoIntervalo && this.isPermisoEliminarTipoIntervalo));
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonCancelarToolBarTipoIntervalo.setVisible(this.isVisibilidadCeldaCancelarTipoIntervalo);				
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonGuardarCambiosToolBarTipoIntervalo.setVisible((this.isVisibilidadCeldaGuardarTipoIntervalo && this.isPermisoGuardarCambiosTipoIntervalo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoIntervalo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoIntervalo && this.isPermisoGuardarCambiosTipoIntervalo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoIntervalo.setVisible((this.isVisibilidadCeldaNuevoTipoIntervalo && this.isPermisoNuevoTipoIntervalo));			
			this.jMenuItemDuplicarTipoIntervalo.setVisible((this.isVisibilidadCeldaDuplicarTipoIntervalo && this.isPermisoDuplicarTipoIntervalo));			
			this.jMenuItemCopiarTipoIntervalo.setVisible((this.isVisibilidadCeldaCopiarTipoIntervalo && this.isPermisoCopiarTipoIntervalo));			
			this.jMenuItemVerFormTipoIntervalo.setVisible((this.isVisibilidadCeldaVerFormTipoIntervalo && this.isPermisoVerFormTipoIntervalo));			
			this.jMenuItemAbrirOrderByTipoIntervalo.setVisible((this.isVisibilidadCeldaOrdenTipoIntervalo && this.isPermisoOrdenTipoIntervalo));			
			//this.jMenuItemMostrarOcultarTipoIntervalo.setVisible((this.isVisibilidadCeldaOrdenTipoIntervalo && this.isPermisoOrdenTipoIntervalo));
			this.jMenuItemDetalleAbrirOrderByTipoIntervalo.setVisible((this.isVisibilidadCeldaOrdenTipoIntervalo && this.isPermisoOrdenTipoIntervalo));			
			//this.jMenuItemDetalleMostrarOcultarTipoIntervalo.setVisible((this.isVisibilidadCeldaOrdenTipoIntervalo && this.isPermisoOrdenTipoIntervalo));			
			this.jMenuItemNuevoRelacionesTipoIntervalo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoIntervalo && this.isPermisoNuevoTipoIntervalo));			
			this.jMenuItemNuevoGuardarCambiosTipoIntervalo.setVisible((this.isVisibilidadCeldaNuevoTipoIntervalo && this.isPermisoNuevoTipoIntervalo && this.isPermisoGuardarCambiosTipoIntervalo));									
			
			if(this.jInternalFrameDetalleFormTipoIntervalo!=null) {
			this.jInternalFrameDetalleFormTipoIntervalo.jMenuItemModificarTipoIntervalo.setVisible((this.isVisibilidadCeldaModificarTipoIntervalo && this.isPermisoActualizarTipoIntervalo));	
			this.jInternalFrameDetalleFormTipoIntervalo.jMenuItemActualizarTipoIntervalo.setVisible((this.isVisibilidadCeldaActualizarTipoIntervalo && this.isPermisoActualizarTipoIntervalo));	
			this.jInternalFrameDetalleFormTipoIntervalo.jMenuItemEliminarTipoIntervalo.setVisible((this.isVisibilidadCeldaEliminarTipoIntervalo && this.isPermisoEliminarTipoIntervalo));
			this.jInternalFrameDetalleFormTipoIntervalo.jMenuItemCancelarTipoIntervalo.setVisible(this.isVisibilidadCeldaCancelarTipoIntervalo);				
			}
			
			this.jMenuItemGuardarCambiosTipoIntervalo.setVisible((this.isVisibilidadCeldaGuardarTipoIntervalo && this.isPermisoGuardarCambiosTipoIntervalo));						
			this.jMenuItemGuardarCambiosTablaTipoIntervalo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoIntervalo && this.isPermisoGuardarCambiosTipoIntervalo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoIntervalo=this.jButtonNuevoTipoIntervalo.isVisible();
			this.isVisibilidadCeldaDuplicarTipoIntervalo=this.jButtonDuplicarTipoIntervalo.isVisible();
			this.isVisibilidadCeldaCopiarTipoIntervalo=this.jButtonCopiarTipoIntervalo.isVisible();
			this.isVisibilidadCeldaVerFormTipoIntervalo=this.jButtonVerFormTipoIntervalo.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoIntervalo=this.jButtonAbrirOrderByTipoIntervalo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoIntervalo=this.jButtonNuevoRelacionesTipoIntervalo.isVisible();
			this.isVisibilidadCeldaModificarTipoIntervalo=this.jButtonModificarTipoIntervalo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoIntervalo!=null) {
			this.isVisibilidadCeldaActualizarTipoIntervalo=this.jInternalFrameDetalleFormTipoIntervalo.jButtonActualizarTipoIntervalo.isVisible();
			this.isVisibilidadCeldaEliminarTipoIntervalo=this.jInternalFrameDetalleFormTipoIntervalo.jButtonEliminarTipoIntervalo.isVisible();
			this.isVisibilidadCeldaCancelarTipoIntervalo=this.jInternalFrameDetalleFormTipoIntervalo.jButtonCancelarTipoIntervalo.isVisible();
			this.isVisibilidadCeldaGuardarTipoIntervalo=this.jInternalFrameDetalleFormTipoIntervalo.jButtonGuardarCambiosTipoIntervalo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoIntervalo=this.jButtonGuardarCambiosTablaTipoIntervalo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoIntervalo=this.jButtonNuevoToolBarTipoIntervalo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoIntervalo=this.jButtonNuevoRelacionesToolBarTipoIntervalo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoIntervalo!=null) {
			this.isVisibilidadCeldaModificarTipoIntervalo=this.jInternalFrameDetalleFormTipoIntervalo.jButtonModificarToolBarTipoIntervalo.isVisible();
			this.isVisibilidadCeldaActualizarTipoIntervalo=this.jInternalFrameDetalleFormTipoIntervalo.jButtonActualizarToolBarTipoIntervalo.isVisible();
			this.isVisibilidadCeldaEliminarTipoIntervalo=this.jInternalFrameDetalleFormTipoIntervalo.jButtonEliminarToolBarTipoIntervalo.isVisible();
			this.isVisibilidadCeldaCancelarTipoIntervalo=this.jInternalFrameDetalleFormTipoIntervalo.jButtonCancelarToolBarTipoIntervalo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoIntervalo=this.jButtonGuardarCambiosToolBarTipoIntervalo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoIntervalo=this.jButtonGuardarCambiosTablaToolBarTipoIntervalo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoIntervalo=this.jMenuItemNuevoTipoIntervalo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoIntervalo=this.jMenuItemNuevoRelacionesTipoIntervalo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoIntervalo!=null) {
			this.isVisibilidadCeldaModificarTipoIntervalo=this.jInternalFrameDetalleFormTipoIntervalo.jMenuItemModificarTipoIntervalo.isVisible();
			this.isVisibilidadCeldaActualizarTipoIntervalo=this.jInternalFrameDetalleFormTipoIntervalo.jMenuItemActualizarTipoIntervalo.isVisible();
			this.isVisibilidadCeldaEliminarTipoIntervalo=this.jInternalFrameDetalleFormTipoIntervalo.jMenuItemEliminarTipoIntervalo.isVisible();
			this.isVisibilidadCeldaCancelarTipoIntervalo=this.jInternalFrameDetalleFormTipoIntervalo.jMenuItemCancelarTipoIntervalo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoIntervalo=this.jMenuItemGuardarCambiosTipoIntervalo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoIntervalo=this.jMenuItemGuardarCambiosTablaTipoIntervalo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoIntervalo(Boolean esInicializar) {
		if(TipoIntervaloJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipointervaloSessionBean.getConGuardarRelaciones()) {
				//if(this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoIntervalo();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoIntervalo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoIntervalo() {
		this.jButtonNuevoTipoIntervalo.setVisible(this.isPermisoNuevoTipoIntervalo);			
		this.jButtonDuplicarTipoIntervalo.setVisible(this.isPermisoDuplicarTipoIntervalo);			
		this.jButtonCopiarTipoIntervalo.setVisible(this.isPermisoCopiarTipoIntervalo);			
		this.jButtonVerFormTipoIntervalo.setVisible(this.isPermisoVerFormTipoIntervalo);			
		
		this.jButtonAbrirOrderByTipoIntervalo.setVisible(this.isPermisoOrdenTipoIntervalo);					
		
		this.jButtonNuevoRelacionesTipoIntervalo.setVisible(this.isPermisoNuevoTipoIntervalo);			
		
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonModificarTipoIntervalo.setVisible(this.isPermisoActualizarTipoIntervalo);	
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonActualizarTipoIntervalo.setVisible(this.isPermisoActualizarTipoIntervalo);	
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonEliminarTipoIntervalo.setVisible(this.isPermisoEliminarTipoIntervalo);
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonCancelarTipoIntervalo.setVisible(this.isVisibilidadCeldaCancelarTipoIntervalo);						
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonGuardarCambiosTipoIntervalo.setVisible(this.isPermisoGuardarCambiosTipoIntervalo);							
		}
		
		this.jButtonGuardarCambiosTablaTipoIntervalo.setVisible(this.isPermisoActualizarTipoIntervalo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoIntervalo() {
		this.jInternalFrameDetalleFormTipoIntervalo.jButtonModificarTipoIntervalo.setVisible(this.isPermisoActualizarTipoIntervalo);	
		this.jInternalFrameDetalleFormTipoIntervalo.jButtonActualizarTipoIntervalo.setVisible(this.isPermisoActualizarTipoIntervalo);	
		this.jInternalFrameDetalleFormTipoIntervalo.jButtonEliminarTipoIntervalo.setVisible(this.isPermisoEliminarTipoIntervalo);
		this.jInternalFrameDetalleFormTipoIntervalo.jButtonCancelarTipoIntervalo.setVisible(this.isVisibilidadCeldaCancelarTipoIntervalo);							
		this.jInternalFrameDetalleFormTipoIntervalo.jButtonGuardarCambiosTipoIntervalo.setVisible((this.isVisibilidadCeldaGuardarTipoIntervalo && this.isPermisoGuardarCambiosTipoIntervalo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoIntervalo() {
		if(TipoIntervaloJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoIntervalo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoIntervalo() {
	}
	
	public void jTableDatosTipoIntervaloListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoIntervalo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoIntervaloBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervaloLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoIntervalo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoIntervalo(this.gettipointervalo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIntervalo(this.tipointervalo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipointervalo =(TipoIntervalo) this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipointervalo =(TipoIntervalo) this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipointervalo==null) {
						this.tipointervalo = new TipoIntervalo();
					}

					this.setVariablesFormularioToObjetoActualTipoIntervalo(this.tipointervalo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIntervalo(this.tipointervalo);
				}

				if(this.tipointervalo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipointervalo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoIntervalo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervaloLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervaloLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervaloLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoIntervaloBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervaloLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoIntervalo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoIntervalo(this.gettipointervalo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIntervalo(this.tipointervalo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipointervalo =(TipoIntervalo) this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipointervalo =(TipoIntervalo) this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipointervalo==null) {
						this.tipointervalo = new TipoIntervalo();
					}

					this.setVariablesFormularioToObjetoActualTipoIntervalo(this.tipointervalo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIntervalo(this.tipointervalo);
				}

				if(this.tipointervalo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipointervalo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoIntervalo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervaloLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervaloLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervaloLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoIntervalo() {
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) {
		

		if(this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) {
			this.jInternalFrameDetalleFormTipoIntervalo.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoIntervalo.dispose();
			this.jInternalFrameDetalleFormTipoIntervalo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoIntervalo!=null) {
			this.jInternalFrameReporteDinamicoTipoIntervalo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoIntervalo.dispose();
			this.jInternalFrameReporteDinamicoTipoIntervalo=null;
		}
		
		if(this.jInternalFrameImportacionTipoIntervalo!=null) {
			this.jInternalFrameImportacionTipoIntervalo.setVisible(false);	    			
			this.jInternalFrameImportacionTipoIntervalo.dispose();
			this.jInternalFrameImportacionTipoIntervalo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoIntervalo();
			
			TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoIntervalo")) {
				jButtonNuevoTipoIntervaloActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoIntervalo")) {
				jButtonDuplicarTipoIntervaloActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoIntervalo")) {
				jButtonCopiarTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoIntervalo")) {
				jButtonVerFormTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoIntervalo")) {
				jButtonNuevoTipoIntervaloActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoIntervalo")) {
				jButtonDuplicarTipoIntervaloActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoIntervalo")) {
				jButtonNuevoTipoIntervaloActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoIntervalo")) {
				jButtonDuplicarTipoIntervaloActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoIntervalo")) {
				jButtonNuevoTipoIntervaloActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoIntervalo")) {
				jButtonNuevoTipoIntervaloActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoIntervalo")) {
				jButtonNuevoTipoIntervaloActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoIntervalo")) {
				jButtonModificarTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoIntervalo")) {
				jButtonModificarTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoIntervalo")) {
				jButtonModificarTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoIntervalo")) {
				jButtonActualizarTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoIntervalo")) {
				jButtonActualizarTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoIntervalo")) {
				jButtonActualizarTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoIntervalo")) {
				jButtonEliminarTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoIntervalo")) {
				jButtonEliminarTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoIntervalo")) {
				jButtonEliminarTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoIntervalo")) {
				jButtonCancelarTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoIntervalo")) {
				jButtonCancelarTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoIntervalo")) {
				jButtonCancelarTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoIntervalo")) {
				jButtonCerrarTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoIntervalo")) {
				jButtonCerrarTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoIntervalo")) {
				jButtonCerrarTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoIntervalo")) {
				jButtonMostrarOcultarTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoIntervalo")) {
				jButtonCancelarTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoIntervalo")) {
				jButtonGuardarCambiosTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoIntervalo")) {
				jButtonGuardarCambiosTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoIntervalo")) {
				jButtonCopiarTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoIntervalo")) {
				jButtonVerFormTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoIntervalo")) {
				jButtonGuardarCambiosTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoIntervalo")) {
				jButtonCopiarTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoIntervalo")) {
				jButtonVerFormTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoIntervalo")) {
				jButtonGuardarCambiosTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoIntervalo")) {
				jButtonGuardarCambiosTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoIntervalo")) {
				jButtonGuardarCambiosTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoIntervalo")) {
				jButtonRecargarInformacionTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoIntervalo")) {
				jButtonRecargarInformacionTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoIntervalo")) {
				jButtonRecargarInformacionTipoIntervaloActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoIntervalo")) {
				jButtonAnterioresTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoIntervalo")) {
				jButtonAnterioresTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoIntervalo")) {
				jButtonAnterioresTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoIntervalo")) {
				jButtonSiguientesTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoIntervalo")) {
				jButtonSiguientesTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoIntervalo")) {
				jButtonSiguientesTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoIntervalo") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoIntervalo")) {
				jButtonAbrirOrderByTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoIntervalo") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoIntervalo")) {
				jButtonMostrarOcultarTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoIntervalo")) {
				jButtonNuevoGuardarCambiosTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoIntervalo")) {
				jButtonNuevoGuardarCambiosTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoIntervalo")) {
				jButtonNuevoGuardarCambiosTipoIntervaloActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoIntervalo")) {
				jButtonCerrarReporteDinamicoTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoIntervalo")) {
				jButtonGenerarReporteDinamicoTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoIntervalo")) {
				
				jButtonGenerarExcelReporteDinamicoTipoIntervaloActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoIntervalo")) {
				jButtonCerrarImportacionTipoIntervaloActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoIntervalo")) {
				
				jButtonGenerarImportacionTipoIntervaloActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoIntervalo")) {
				
				jButtonAbrirImportacionTipoIntervaloActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoIntervalo")) {
				jComboBoxTiposAccionesTipoIntervaloActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoIntervalo")) {
				jComboBoxTiposRelacionesTipoIntervaloActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoIntervalo")) {
				jComboBoxTiposAccionesTipoIntervaloActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoIntervalo")) {
				
				jComboBoxTiposSeleccionarTipoIntervaloActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoIntervalo")) {
				jTextFieldValorCampoGeneralTipoIntervaloActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoIntervalo")) {
				jButtonAbrirOrderByTipoIntervaloActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoIntervalo")) {
				jButtonAbrirOrderByTipoIntervaloActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoIntervalo")) {
				jButtonCerrarOrderByTipoIntervaloActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoIntervaloBusqueda")) {
				this.jButtonidTipoIntervaloBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoIntervaloBusqueda")) {
				this.jButtonnombreTipoIntervaloBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoIntervalo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIntervaloActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointervalo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipointervalo);
				
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
				
				


				
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIntervalo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIntervalo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoIntervalo tipointervaloLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipointervaloLocal=this.tipointervalo;
			} else {
				tipointervaloLocal=this.tipointervaloAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointervalo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipointervalo);
				
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
							
				
				


				
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIntervalo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIntervalo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIntervaloActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIntervalo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervaloAnterior =(TipoIntervalo) this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipointervaloAnterior =(TipoIntervalo) this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
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
			
			TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
			
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
			
			


			
			TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIntervaloActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointervalo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipointervalo);
				
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
								
						
				


				
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIntervalo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIntervalo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointervalo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipointervalo);
				
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
								
				
				


				
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIntervalo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIntervalo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIntervaloActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIntervalo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervaloAnterior =(TipoIntervalo) this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipointervaloAnterior =(TipoIntervalo) this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointervalo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipointervalo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIntervaloActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIntervalo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervaloAnterior =(TipoIntervalo) this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipointervaloAnterior =(TipoIntervalo) this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIntervaloActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointervalo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipointervalo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointervalo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipointervalo);
				
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
							
				
				


				
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIntervalo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIntervalo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIntervaloActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoIntervalo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipointervaloAnterior =(TipoIntervalo) this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipointervaloAnterior =(TipoIntervalo) this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
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
			
			TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
			
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
			
			


			
			TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIntervaloActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointervalo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipointervalo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointervalo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipointervalo);
				
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
								
				
				


				
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIntervalo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIntervalo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIntervaloActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIntervalo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervaloAnterior =(TipoIntervalo) this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipointervaloAnterior =(TipoIntervalo) this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIntervaloActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointervalo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipointervalo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIntervaloActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointervalo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipointervalo);
				
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoIntervalo")) {
					jCheckBoxSeleccionarTodosTipoIntervaloItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoIntervalo")) {
					jCheckBoxSeleccionadosTipoIntervaloItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoIntervalo")) {
					
				}
				
				


				
				
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIntervalo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIntervalo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointervalo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipointervalo);
				
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
												
				
				


				
				
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIntervalo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIntervalo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIntervaloActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoIntervalo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipointervaloAnterior =(TipoIntervalo) this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipointervaloAnterior =(TipoIntervalo) this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIntervaloActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointervalo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipointervalo);
				
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
				
				
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
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
			
			TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
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
			
			


			
			TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIntervaloActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointervalo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipointervalo);
				
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIntervalo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIntervalo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipointervalo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipointervalo);
				
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
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
				
				


				
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIntervalo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIntervalo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIntervaloActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIntervalo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipointervaloAnterior =(TipoIntervalo) this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipointervaloAnterior =(TipoIntervalo) this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoIntervalo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoIntervaloListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoIntervalo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipointervalo =(TipoIntervalo) this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipointervalo =(TipoIntervalo) this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipointervalo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoIntervalo")) {
				
				}
				
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoIntervalo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoIntervalo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoIntervalo")) {
			
			}
			
			TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoIntervalo();
			
			TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
			
			if(sTipo.equals("NuevoTipoIntervalo")) {
				jButtonNuevoTipoIntervaloActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoIntervalo")) {
				jButtonDuplicarTipoIntervaloActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoIntervalo")) {
				jButtonCopiarTipoIntervaloActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoIntervalo")) {
				jButtonVerFormTipoIntervaloActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoIntervalo")) {
				jButtonNuevoTipoIntervaloActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoIntervalo")) {
				jButtonModificarTipoIntervaloActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoIntervalo")) {
				jButtonActualizarTipoIntervaloActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoIntervalo")) {
				jButtonEliminarTipoIntervaloActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoIntervalo")) {
				jButtonGuardarCambiosTipoIntervaloActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoIntervalo")) {
				jButtonCancelarTipoIntervaloActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoIntervalo")) {
				jButtonCerrarTipoIntervaloActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoIntervalo")) {
				jButtonGuardarCambiosTipoIntervaloActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoIntervalo")) {
				jButtonNuevoGuardarCambiosTipoIntervaloActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoIntervalo")) {
				jButtonAbrirOrderByTipoIntervaloActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoIntervalo")) {
				jButtonRecargarInformacionTipoIntervaloActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoIntervalo")) {
				jButtonAnterioresTipoIntervaloActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoIntervalo")) {
				jButtonSiguientesTipoIntervaloActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoIntervaloBusqueda")) {
				this.jButtonidTipoIntervaloBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoIntervaloBusqueda")) {
				this.jButtonnombreTipoIntervaloBusquedaActionPerformed(evt);
			}
			
			TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoIntervalo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoIntervalo")) {
				closingInternalFrameTipoIntervalo();
				
			} else if(sTipo.equals("jButtonCancelarTipoIntervalo")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoIntervalo = (JInternalFrameBase)evt.getSource();
	            	
	            TipoIntervaloBeanSwingJInternalFrame jInternalFrameParent=(TipoIntervaloBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoIntervalo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoIntervaloActionPerformed(null);
			}
			
			TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipointervalo,new Object(),this.tipointervaloParameterGeneral,this.tipointervaloReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoIntervalo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoIntervalo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoIntervalo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipointervalo)) {
			if(!esControlTabla) {
				if(TipoIntervaloJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoIntervalo(this.tipointervalo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIntervalo(this.tipointervalo);			
				}
				
				if(this.tipointervaloSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoIntervalo(this.tipointervalo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipointervaloReturnGeneral=tipointervaloLogic.procesarEventosTipoIntervalosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipointervaloLogic.getTipoIntervalos(),this.tipointervalo,this.tipointervaloParameterGeneral,this.isEsNuevoTipoIntervalo,classes);//this.tipointervaloLogic.getTipoIntervalo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoIntervalo(this.tipointervaloReturnGeneral,this.tipointervaloBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipointervaloSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoIntervalo(classes,this.tipointervaloReturnGeneral,this.tipointervaloBean,false);
					}
						
					if(this.tipointervaloReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoIntervalo(this.tipointervaloReturnGeneral.getTipoIntervalo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoIntervalo(this.tipointervaloReturnGeneral.getTipoIntervalo());	
					}
						
					if(this.tipointervaloReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoIntervalo(this.tipointervaloReturnGeneral.getTipoIntervalo(),classes);//this.tipointervaloBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoIntervalo(this.tipointervalo,classes);//this.tipointervaloBean);									
				}
			
				if(TipoIntervaloJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoIntervalo(this.tipointervalo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIntervalo(this.tipointervalo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipointervaloAnterior!=null) {
						this.tipointervalo=this.tipointervaloAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipointervaloReturnGeneral=tipointervaloLogic.procesarEventosTipoIntervalosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipointervaloLogic.getTipoIntervalos(),this.tipointervalo,this.tipointervaloParameterGeneral,this.isEsNuevoTipoIntervalo,classes);//this.tipointervaloLogic.getTipoIntervalo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipointervaloSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipointervaloSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipointervaloReturnGeneral.getTipoIntervalo(),tipointervaloLogic.getTipoIntervalos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipointervaloReturnGeneral.getTipoIntervalo(),this.tipointervalos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoIntervalo.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoIntervalo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoIntervalo();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoIntervalo() throws Exception {
		
		TipoIntervaloModel tipointervaloModel=(TipoIntervaloModel)this.jTableDatosTipoIntervalo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipointervaloModel.tipointervalos=this.tipointervaloLogic.getTipoIntervalos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipointervaloModel.tipointervalos=this.tipointervalos;
		}
		
		
		((TipoIntervaloModel) this.jTableDatosTipoIntervalo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoIntervalo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipointervaloAnterior(),this.tipointervaloLogic.getTipoIntervalos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipointervaloAnterior(),this.tipointervalos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoIntervalo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoIntervalo(TipoIntervalo tipointervalo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroContabilidadDefecto.class)) {
					this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.setParametroContabilidadDefectos(tipointervalo.getParametroContabilidadDefectos());
					this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroContabilidadDefecto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(TablaAmortiDetalle.class)) {
					this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame.tablaamortidetalleLogic.setTablaAmortiDetalles(tipointervalo.getTablaAmortiDetalles());
					this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame.inicializarActualizarBindingTablaTablaAmortiDetalle(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
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
										
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipointervalo,new Object(),generalEntityParameterGeneral,this.tipointervaloReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipointervaloSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoIntervaloConstantesFunciones.getClassesRelationshipsOfTipoIntervalo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoIntervaloConstantesFunciones.getClassesRelationshipsFromStringsOfTipoIntervalo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoIntervalo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoIntervaloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipointervalo,new Object(),generalEntityParameterGeneral,this.tipointervaloReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoIntervalo(TipoIntervaloBean tipointervaloBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroContabilidadDefecto.class)) {
					this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.setParametroContabilidadDefectos(tipointervalo.getParametroContabilidadDefectos());
					this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroContabilidadDefecto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(TablaAmortiDetalle.class)) {
					this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame.tablaamortidetalleLogic.setTablaAmortiDetalles(tipointervalo.getTablaAmortiDetalles());
					this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame.inicializarActualizarBindingTablaTablaAmortiDetalle(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoIntervalo(ArrayList<Classe> classes,TipoIntervaloReturnGeneral tipointervaloReturnGeneral,TipoIntervaloBean tipointervaloBean,Boolean conDefault) throws Exception {
		
			this.tipointervaloBean.setParametroContabilidadDefectos(tipointervaloReturnGeneral.getTipoIntervalo().getParametroContabilidadDefectos());
			this.tipointervaloBean.setTablaAmortiDetalles(tipointervaloReturnGeneral.getTipoIntervalo().getTablaAmortiDetalles());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoIntervalo(TipoIntervalo tipointervalo,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroContabilidadDefecto.class)) {
					tipointervalo.setParametroContabilidadDefectos(this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(TablaAmortiDetalle.class)) {
					tipointervalo.setTablaAmortiDetalles(this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleBeanSwingJInternalFrame.tablaamortidetalleLogic.getTablaAmortiDetalles());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipointervalo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoIntervalo = new TipoIntervaloDetalleFormJInternalFrame(jDesktopPane,this.tipointervaloSessionBean.getConGuardarRelaciones(),this.tipointervaloSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoIntervalo);
		this.jInternalFrameDetalleFormTipoIntervalo.setVisible(false);
		this.jInternalFrameDetalleFormTipoIntervalo.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoIntervalo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoIntervalo.tipointervaloLogic=this.tipointervaloLogic;
		
		this.cargarCombosFrameForeignKeyTipoIntervalo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoIntervalo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoIntervalo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoIntervalo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoIntervalo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoIntervalo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoIntervalo"));
		
		this.jInternalFrameDetalleFormTipoIntervalo.jButtonModificarTipoIntervalo.addActionListener(new ButtonActionListener(this,"ModificarTipoIntervalo"));

		
		this.jInternalFrameDetalleFormTipoIntervalo.jButtonModificarToolBarTipoIntervalo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoIntervalo"));
					
		this.jInternalFrameDetalleFormTipoIntervalo.jMenuItemModificarTipoIntervalo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoIntervalo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoIntervalo.jButtonActualizarTipoIntervalo.addActionListener (new ButtonActionListener(this,"ActualizarTipoIntervalo"));
		
		
		this.jInternalFrameDetalleFormTipoIntervalo.jButtonActualizarToolBarTipoIntervalo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoIntervalo"));
						
		this.jInternalFrameDetalleFormTipoIntervalo.jMenuItemActualizarTipoIntervalo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoIntervalo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoIntervalo.jButtonEliminarTipoIntervalo.addActionListener (new ButtonActionListener(this,"EliminarTipoIntervalo"));
		
		
		this.jInternalFrameDetalleFormTipoIntervalo.jButtonEliminarToolBarTipoIntervalo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoIntervalo"));
								
		this.jInternalFrameDetalleFormTipoIntervalo.jMenuItemEliminarTipoIntervalo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoIntervalo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoIntervalo.jButtonCancelarTipoIntervalo.addActionListener (new ButtonActionListener(this,"CancelarTipoIntervalo"));
		
		
		this.jInternalFrameDetalleFormTipoIntervalo.jButtonCancelarToolBarTipoIntervalo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoIntervalo"));
					
		this.jInternalFrameDetalleFormTipoIntervalo.jMenuItemCancelarTipoIntervalo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoIntervalo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoIntervalo.jMenuItemDetalleCerrarTipoIntervalo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoIntervalo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoIntervalo.jButtonGuardarCambiosToolBarTipoIntervalo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoIntervalo"));
		
		
		
		this.jInternalFrameDetalleFormTipoIntervalo.jButtonGuardarCambiosToolBarTipoIntervalo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoIntervalo"));
		
		
		
		this.jInternalFrameDetalleFormTipoIntervalo.jComboBoxTiposAccionesFormularioTipoIntervalo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoIntervalo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIntervalo.jButtonidTipoIntervaloBusqueda.addActionListener(new ButtonActionListener(this,"idTipoIntervaloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIntervalo.jButtonnombreTipoIntervaloBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoIntervaloBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoIntervalo.jTabbedPaneRelacionesTipoIntervalo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoIntervalo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoIntervalo"));
		
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIntervalo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoIntervalo"));
		}
		
		this.jTableDatosTipoIntervalo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoIntervalo"));
		
		this.jTableDatosTipoIntervalo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoIntervalo"));
		
		this.jButtonNuevoTipoIntervalo.addActionListener(new ButtonActionListener(this,"NuevoTipoIntervalo"));
		
		this.jButtonDuplicarTipoIntervalo.addActionListener(new ButtonActionListener(this,"DuplicarTipoIntervalo"));
		
		this.jButtonCopiarTipoIntervalo.addActionListener(new ButtonActionListener(this,"CopiarTipoIntervalo"));
		
		this.jButtonVerFormTipoIntervalo.addActionListener(new ButtonActionListener(this,"VerFormTipoIntervalo"));
		
		
		this.jButtonNuevoToolBarTipoIntervalo.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoIntervalo"));
			
		this.jButtonDuplicarToolBarTipoIntervalo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoIntervalo"));
			
		this.jMenuItemNuevoTipoIntervalo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoIntervalo"));
			
		this.jMenuItemDuplicarTipoIntervalo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoIntervalo"));		
		
		
		this.jButtonNuevoRelacionesTipoIntervalo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoIntervalo"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoIntervalo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoIntervalo"));
			
		this.jMenuItemNuevoRelacionesTipoIntervalo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoIntervalo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonModificarTipoIntervalo.addActionListener(new ButtonActionListener(this,"ModificarTipoIntervalo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonModificarToolBarTipoIntervalo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoIntervalo"));
			
			this.jInternalFrameDetalleFormTipoIntervalo.jMenuItemModificarTipoIntervalo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoIntervalo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonActualizarTipoIntervalo.addActionListener (new ButtonActionListener(this,"ActualizarTipoIntervalo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonActualizarToolBarTipoIntervalo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoIntervalo"));
				
			this.jInternalFrameDetalleFormTipoIntervalo.jMenuItemActualizarTipoIntervalo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoIntervalo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonEliminarTipoIntervalo.addActionListener (new ButtonActionListener(this,"EliminarTipoIntervalo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonEliminarToolBarTipoIntervalo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoIntervalo"));
						
			this.jInternalFrameDetalleFormTipoIntervalo.jMenuItemEliminarTipoIntervalo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoIntervalo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonCancelarTipoIntervalo.addActionListener (new ButtonActionListener(this,"CancelarTipoIntervalo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonCancelarToolBarTipoIntervalo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoIntervalo"));
			
			this.jInternalFrameDetalleFormTipoIntervalo.jMenuItemCancelarTipoIntervalo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoIntervalo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoIntervalo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoIntervalo"));		
		
		
		this.jButtonCerrarTipoIntervalo.addActionListener (new ButtonActionListener(this,"CerrarTipoIntervalo"));
		
		
		this.jButtonCerrarToolBarTipoIntervalo.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoIntervalo"));
			
		this.jMenuItemCerrarTipoIntervalo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoIntervalo"));
			
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIntervalo.jMenuItemDetalleCerrarTipoIntervalo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoIntervalo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonGuardarCambiosTipoIntervalo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoIntervalo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIntervalo.jButtonGuardarCambiosToolBarTipoIntervalo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoIntervalo"));
		}
		
		this.jButtonCopiarToolBarTipoIntervalo.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoIntervalo"));
			
		this.jButtonVerFormToolBarTipoIntervalo.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoIntervalo"));
		
		this.jMenuItemGuardarCambiosTipoIntervalo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoIntervalo"));
			
		this.jMenuItemCopiarTipoIntervalo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoIntervalo"));		
		
		this.jMenuItemVerFormTipoIntervalo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoIntervalo"));		
		
		
		this.jButtonGuardarCambiosTablaTipoIntervalo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoIntervalo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoIntervalo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoIntervalo"));
			
		this.jMenuItemGuardarCambiosTablaTipoIntervalo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoIntervalo"));		
		
		
		
		this.jButtonRecargarInformacionTipoIntervalo.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoIntervalo"));
					
		this.jButtonRecargarInformacionToolBarTipoIntervalo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoIntervalo"));
		
		this.jMenuItemRecargarInformacionTipoIntervalo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoIntervalo"));		
		
		
		
		this.jButtonAnterioresTipoIntervalo.addActionListener (new ButtonActionListener(this,"AnterioresTipoIntervalo"));
		
		
		this.jButtonAnterioresToolBarTipoIntervalo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoIntervalo"));
		
		this.jMenuItemAnterioresTipoIntervalo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoIntervalo"));		
		
		
		this.jButtonSiguientesTipoIntervalo.addActionListener (new ButtonActionListener(this,"SiguientesTipoIntervalo"));
		
		
		this.jButtonSiguientesToolBarTipoIntervalo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoIntervalo"));
			
		this.jMenuItemSiguientesTipoIntervalo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoIntervalo"));
			
		this.jMenuItemAbrirOrderByTipoIntervalo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoIntervalo"));
			
		this.jMenuItemMostrarOcultarTipoIntervalo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoIntervalo"));
			
		this.jMenuItemDetalleAbrirOrderByTipoIntervalo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoIntervalo"));
			
		this.jMenuItemDetalleMostarOcultarTipoIntervalo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoIntervalo"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoIntervalo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoIntervalo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoIntervalo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoIntervalo"));
			
		this.jMenuItemNuevoGuardarCambiosTipoIntervalo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoIntervalo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoIntervalo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoIntervalo"));

		this.jCheckBoxSeleccionadosTipoIntervalo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoIntervalo"));
		
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIntervalo.jComboBoxTiposAccionesFormularioTipoIntervalo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoIntervalo"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoIntervalo.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoIntervalo"));
			
		this.jComboBoxTiposAccionesTipoIntervalo.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoIntervalo"));
					
		this.jComboBoxTiposSeleccionarTipoIntervalo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoIntervalo"));
			
		this.jTextFieldValorCampoGeneralTipoIntervalo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoIntervalo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIntervalo.jButtonidTipoIntervaloBusqueda.addActionListener(new ButtonActionListener(this,"idTipoIntervaloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIntervalo.jButtonnombreTipoIntervaloBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoIntervaloBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoIntervalo!=null) {
				this.jInternalFrameReporteDinamicoTipoIntervalo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoIntervalo"));
				this.jInternalFrameReporteDinamicoTipoIntervalo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoIntervalo"));
				this.jInternalFrameReporteDinamicoTipoIntervalo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoIntervalo"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoIntervalo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoIntervalo"));				
			//this.jButtonGenerarReporteDinamicoTipoIntervalo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoIntervalo"));
			//this.jButtonGenerarExcelReporteDinamicoTipoIntervalo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoIntervalo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoIntervalo!=null) {
				this.jInternalFrameImportacionTipoIntervalo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoIntervalo"));
				this.jInternalFrameImportacionTipoIntervalo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoIntervalo"));
				this.jInternalFrameImportacionTipoIntervalo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoIntervalo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoIntervalo.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoIntervalo"));
			
			this.jButtonAbrirOrderByToolBarTipoIntervalo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoIntervalo"));			
			
			if(this.jInternalFrameOrderByTipoIntervalo!=null) {
				this.jInternalFrameOrderByTipoIntervalo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoIntervalo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoIntervalo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIntervalo.jTabbedPaneRelacionesTipoIntervalo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoIntervalo"));
		
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
            		closingInternalFrameTipoIntervalo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoIntervalo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoIntervalo = (JInternalFrameBase)event.getSource();
	            	
	            TipoIntervaloBeanSwingJInternalFrame jInternalFrameParent=(TipoIntervaloBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoIntervalo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoIntervaloActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoIntervalo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoIntervaloListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoIntervalo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoIntervalo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIntervaloActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIntervaloActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIntervaloActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoIntervalo";
		inputMap = this.jButtonNuevoTipoIntervalo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoIntervalo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoIntervaloActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIntervaloActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIntervaloActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIntervaloActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoIntervalo";
		inputMap = this.jButtonNuevoRelacionesTipoIntervalo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoIntervalo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoIntervaloActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoIntervalo";
		inputMap = this.jButtonModificarTipoIntervalo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoIntervalo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoIntervaloActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoIntervalo";
		inputMap = this.jButtonActualizarTipoIntervalo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoIntervalo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoIntervaloActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoIntervalo";
		inputMap = this.jButtonEliminarTipoIntervalo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoIntervalo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoIntervaloActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoIntervalo";
		inputMap = this.jButtonCancelarTipoIntervalo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoIntervalo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoIntervaloActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoIntervalo";
		inputMap = this.jButtonCerrarTipoIntervalo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoIntervalo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoIntervaloActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoIntervalo.jButtonGuardarCambiosTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoIntervalo";
		inputMap = this.jInternalFrameDetalleFormTipoIntervalo.jButtonGuardarCambiosTipoIntervalo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoIntervalo.jButtonGuardarCambiosTipoIntervalo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoIntervaloActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoIntervalo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoIntervaloItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoIntervalo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoIntervaloActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoIntervalo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoIntervaloActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoIntervalo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoIntervaloActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIntervalo.jButtonidTipoIntervaloBusqueda.addActionListener(new ButtonActionListener(this,"idTipoIntervaloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIntervalo.jButtonnombreTipoIntervaloBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoIntervaloBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoIntervalo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoIntervaloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoIntervaloActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoIntervalo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoIntervalo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoIntervalo tipointervaloAux:this.tipointervaloLogic.getTipoIntervalos()) {
					tipointervaloAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoIntervalo tipointervaloAux:tipointervalos) {
					tipointervaloAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoIntervaloItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoIntervalo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoIntervalo tipointervaloAux:this.tipointervaloLogic.getTipoIntervalos()) {
						tipointervaloAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoIntervalo tipointervaloAux:tipointervalos) {
						tipointervaloAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoIntervalo tipointervaloAux:this.tipointervaloLogic.getTipoIntervalos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoIntervalo tipointervaloAux:tipointervalos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoIntervalo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoIntervalo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoIntervalo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoIntervalo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoIntervaloItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoIntervalo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoIntervalo.getSelectedRows();
			
			TipoIntervalo tipointervaloLocal=new TipoIntervalo();
			
			//this.seleccionarTodosTipoIntervalo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipointervaloLocal =(TipoIntervalo) this.tipointervaloLogic.getTipoIntervalos().toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipointervaloLocal =(TipoIntervalo) this.tipointervalos.toArray()[this.jTableDatosTipoIntervalo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipointervaloLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoIntervalo tipointervaloAux:this.tipointervaloLogic.getTipoIntervalos()) {
						tipointervaloAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoIntervalo tipointervaloAux:tipointervalos) {
						tipointervaloAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoIntervalo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoIntervalo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoIntervalo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoIntervalo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoIntervaloItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoIntervaloParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoIntervaloActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoIntervalo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoIntervalo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoIntervalo tipointervaloAux:this.tipointervaloLogic.getTipoIntervalos()) {
				
						if(sTipoSeleccionar.equals(TipoIntervaloConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipointervaloAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoIntervalo tipointervaloAux:tipointervalos) {
					
						if(sTipoSeleccionar.equals(TipoIntervaloConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipointervaloAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoIntervalo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoIntervaloActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoIntervalo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoIntervalo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoIntervalo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoIntervalo.jComboBoxTiposAccionesFormularioTipoIntervalo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoIntervalo) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoIntervalo(conSplash);
				
					this.generarReporteTipoIntervalosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoIntervalo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoIntervalo.jComboBoxTiposAccionesFormularioTipoIntervalo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoIntervalosSeleccionados();
				//this.jComboBoxTiposAccionesTipoIntervalo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoIntervalosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoIntervalo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoIntervalosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoIntervalo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoIntervalo();
				
				this.exportarTipoIntervalosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoIntervalo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoIntervalo.jComboBoxTiposAccionesFormularioTipoIntervalo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoIntervalos();
				//this.importarTipoIntervalos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoIntervalo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoIntervalo.jComboBoxTiposAccionesFormularioTipoIntervalo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoIntervalo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoIntervalosSeleccionados();
				//this.jComboBoxTiposAccionesTipoIntervalo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Intervalo ", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoIntervalo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoIntervalo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoIntervalo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Intervalo ",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoIntervalo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoIntervalo.jComboBoxTiposAccionesFormularioTipoIntervalo.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoIntervalo();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoIntervalo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoIntervaloActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoIntervalo();
			
			if(this.jInternalFrameDetalleFormTipoIntervalo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoIntervalo> tipointervalosSeleccionados=new ArrayList<TipoIntervalo>();		
			TipoIntervalo tipointervalo=new TipoIntervalo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoIntervalo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoIntervalo.getSelectedItem();
			
			
			
			
			tipointervalosSeleccionados=this.getTipoIntervalosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipointervalosSeleccionados.size()==1) {
				for(TipoIntervalo tipointervaloAux:tipointervalosSeleccionados) {
					tipointervalo=tipointervaloAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Parametro Contabilidad Defecto")) {
					jButtonParametroContabilidadDefectoActionPerformed(null,rowIndex,true,false,tipointervalo);
				}
				else if(this.sTipoRelacion.equals("Tabla Amortizacion Detalle")) {
					jButtonTablaAmortiDetalleActionPerformed(null,rowIndex,true,false,tipointervalo);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoIntervalo();
			
      		//this.finishProcessTipoIntervalo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoIntervaloReturnGeneral() throws Exception {
		if(this.tipointervaloReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipointervaloReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipointervaloReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipointervaloReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipointervaloReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipointervaloReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoIntervalo(false);
		}
		
		if(this.tipointervaloReturnGeneral.getConRetornoLista() || this.tipointervaloReturnGeneral.getConRetornoObjeto()) {
			if(this.tipointervaloReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipointervaloLogic.setTipoIntervalos(this.tipointervaloReturnGeneral.getTipoIntervalos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipointervaloReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipointervaloLogic.setTipoIntervalo(this.tipointervaloReturnGeneral.getTipoIntervalo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoIntervalo(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoIntervalo() throws Exception {
		
		
	}
	
	public ArrayList<TipoIntervalo> getTipoIntervalosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoIntervalo> tipointervalosSeleccionados=new ArrayList<TipoIntervalo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoIntervalo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoIntervalo tipointervaloAux:tipointervaloLogic.getTipoIntervalos()) {
					if(tipointervaloAux.getIsSelected()) {
						tipointervalosSeleccionados.add(tipointervaloAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoIntervalo tipointervaloAux:this.tipointervalos) {
					if(tipointervaloAux.getIsSelected()) {
						tipointervalosSeleccionados.add(tipointervaloAux);				
					}
				}
			}
			
			if(tipointervalosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipointervalosSeleccionados.addAll(this.tipointervaloLogic.getTipoIntervalos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipointervalosSeleccionados.addAll(this.tipointervalos);				
					}
				}
			}
		} else {
			tipointervalosSeleccionados.add(this.tipointervalo);
		}
		
		return tipointervalosSeleccionados;
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
	
	public void generarReporteTipoIntervalosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoIntervalosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoIntervalosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoIntervalosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoIntervalosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoIntervalosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Intervalo ",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoIntervalosSeleccionados() throws Exception {
		ArrayList<TipoIntervalo> tipointervalosSeleccionados=new ArrayList<TipoIntervalo>();		
		
		tipointervalosSeleccionados=this.getTipoIntervalosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoIntervalos("Todos",tipointervalosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoIntervalosSeleccionados() throws Exception {
		ArrayList<TipoIntervalo> tipointervalosSeleccionados=new ArrayList<TipoIntervalo>();		
		
		tipointervalosSeleccionados=this.getTipoIntervalosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoIntervalos("Todos",tipointervalosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoIntervalosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoIntervalo> tipointervalosSeleccionados=new ArrayList<TipoIntervalo>();
		
		tipointervalosSeleccionados=this.getTipoIntervalosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoIntervalos("Todos",tipointervalosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoIntervalosSeleccionados() throws Exception {
		ArrayList<TipoIntervalo> tipointervalosSeleccionados=new ArrayList<TipoIntervalo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoIntervalo();
		
		
		tipointervalosSeleccionados=this.getTipoIntervalosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoIntervalo();
		
		
		//this.generarReporteTipoIntervalos("Todos",tipointervalosSeleccionados ,tipointervaloImplementable,tipointervaloImplementableHome);
	}
	
	public void mostrarImportacionTipoIntervalos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoIntervalo();
		
		this.abrirFrameImportacionTipoIntervalo();		
		
			
		//this.generarReporteTipoIntervalos("Todos",tipointervalosSeleccionados ,tipointervaloImplementable,tipointervaloImplementableHome);
	}
	
	public void importarTipoIntervalos() throws Exception {		
	
	}
	
	public void exportarTipoIntervalosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoIntervalosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoIntervalosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoIntervalosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Intervalo ",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoIntervalosSeleccionados() throws Exception {
		ArrayList<TipoIntervalo> tipointervalosSeleccionados=new ArrayList<TipoIntervalo>();		
		
		tipointervalosSeleccionados=this.getTipoIntervalosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipointervalo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoIntervalo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoIntervalo tipointervaloAux:tipointervalosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoIntervalo(tipointervaloAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipointervaloAux.setsDetalleGeneralEntityReporte(tipointervaloAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipointervaloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Intervalo ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoIntervalo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoIntervaloConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoIntervaloConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoIntervaloConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoIntervalo(TipoIntervalo tipointervalo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipointervalo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipointervalo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipointervalo.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoIntervalosSeleccionados() throws Exception {
		ArrayList<TipoIntervalo> tipointervalosSeleccionados=new ArrayList<TipoIntervalo>();		
		
		tipointervalosSeleccionados=this.getTipoIntervalosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipointervalo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoIntervalos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoIntervalo(row);				
				iRow++;
			}				
			
			for(TipoIntervalo tipointervaloAux:tipointervalosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoIntervalo(tipointervaloAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipointervaloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Intervalo ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoIntervalosSeleccionados() throws Exception {
		ArrayList<TipoIntervalo> tipointervalosSeleccionados=new ArrayList<TipoIntervalo>();		
		
		tipointervalosSeleccionados=this.getTipoIntervalosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipointervalo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipointervalos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipointervalo");
			//elementRoot.appendChild(element);
		
			for(TipoIntervalo tipointervaloAux:tipointervalosSeleccionados) {
				element = document.createElement("tipointervalo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoIntervalo(tipointervaloAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipointervaloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Intervalo ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoIntervalo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoIntervaloConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoIntervaloConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoIntervaloConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoIntervalo(TipoIntervalo tipointervalo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipointervalo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipointervalo.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoIntervalo(TipoIntervalo tipointervalo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoIntervaloConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipointervalo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoIntervaloConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipointervalo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoIntervaloConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipointervalo.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoIntervalosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoIntervalo> tipointervalosSeleccionados=new ArrayList<TipoIntervalo>();
		
		tipointervalosSeleccionados=this.getTipoIntervalosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoIntervalo(tipointervalosSeleccionados);
		
		this.generarReporteTipoIntervalos("Todos",tipointervalosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoIntervalo(ArrayList<TipoIntervalo> tipointervalosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoIntervalo tipointervaloAux:tipointervalosSeleccionados) {
				tipointervaloAux.setsDetalleGeneralEntityReporte(tipointervaloAux.toString());
			
				if(sTipoSeleccionar.equals(TipoIntervaloConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipointervaloAux.setsDescripcionGeneralEntityReporte1(tipointervaloAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIntervaloConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoIntervalo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoIntervalo=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoIntervalo=true;
				this.isVisibilidadCeldaGuardarCambiosTipoIntervalo=true;
			}
			
			this.isVisibilidadCeldaModificarTipoIntervalo=false;
			this.isVisibilidadCeldaActualizarTipoIntervalo=false;
			this.isVisibilidadCeldaEliminarTipoIntervalo=false;
			this.isVisibilidadCeldaCancelarTipoIntervalo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIntervalo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoIntervalo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoIntervalo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIntervalo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIntervalo=false;
			this.isVisibilidadCeldaModificarTipoIntervalo=false;
			this.isVisibilidadCeldaActualizarTipoIntervalo=true;
			this.isVisibilidadCeldaEliminarTipoIntervalo=false;
			this.isVisibilidadCeldaCancelarTipoIntervalo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIntervalo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoIntervalo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoIntervalo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIntervalo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIntervalo=false;
			this.isVisibilidadCeldaModificarTipoIntervalo=false;
			this.isVisibilidadCeldaActualizarTipoIntervalo=true;
			this.isVisibilidadCeldaEliminarTipoIntervalo=true;
			this.isVisibilidadCeldaCancelarTipoIntervalo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIntervalo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoIntervalo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoIntervalo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIntervalo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIntervalo=false;
			this.isVisibilidadCeldaModificarTipoIntervalo=false;
			this.isVisibilidadCeldaActualizarTipoIntervalo=true;
			this.isVisibilidadCeldaEliminarTipoIntervalo=false;
			this.isVisibilidadCeldaCancelarTipoIntervalo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIntervalo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoIntervalo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoIntervalo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoIntervalo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoIntervalo=true;
			this.isVisibilidadCeldaModificarTipoIntervalo=false;
			this.isVisibilidadCeldaActualizarTipoIntervalo=false;
			this.isVisibilidadCeldaEliminarTipoIntervalo=false;
			this.isVisibilidadCeldaCancelarTipoIntervalo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIntervalo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoIntervalo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoIntervalo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIntervalo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIntervalo=false;
			this.isVisibilidadCeldaActualizarTipoIntervalo=false;
			this.isVisibilidadCeldaEliminarTipoIntervalo=false;
			this.isVisibilidadCeldaCancelarTipoIntervalo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIntervalo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoIntervalo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoIntervalo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIntervalo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIntervalo=false;
			this.isVisibilidadCeldaModificarTipoIntervalo=true;
			this.isVisibilidadCeldaActualizarTipoIntervalo=false;
			this.isVisibilidadCeldaEliminarTipoIntervalo=false;
			this.isVisibilidadCeldaCancelarTipoIntervalo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIntervalo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoIntervalo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoIntervaloJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoIntervalo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoIntervalo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoIntervalo=true;
		} else {
			this.actualizarEstadoPanelsTipoIntervalo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoIntervalo=false;
			//this.isVisibilidadCeldaVerFormTipoIntervalo=false;
			this.isVisibilidadCeldaDuplicarTipoIntervalo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipointervaloSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoIntervalo=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoIntervalo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIntervalo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipointervaloSessionBean.getEsGuardarRelacionado()) {
			if(!tipointervaloSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoIntervalo=false;												
			}
			
			this.jButtonCerrarTipoIntervalo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoIntervalo=false;
		}
		
		if(!this.permiteMantenimiento(this.tipointervalo)) {
			this.isVisibilidadCeldaActualizarTipoIntervalo=false;
			this.isVisibilidadCeldaEliminarTipoIntervalo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoIntervalo() {
		this.isVisibilidadCeldaNuevoTipoIntervalo=false;
		this.isVisibilidadCeldaGuardarCambiosTipoIntervalo=false;
	}
	
	public void actualizarEstadoPanelsTipoIntervalo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoIntervalo!=null) {
				this.jScrollPanelDatosEdicionTipoIntervalo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoIntervalo!=null) {
				this.jScrollPanelDatosTipoIntervalo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoIntervalo!=null) {
				this.jPanelPaginacionTipoIntervalo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoIntervalo!=null) {
				this.jPanelParametrosReportesTipoIntervalo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoIntervalo!=null) {
				this.jScrollPanelDatosEdicionTipoIntervalo.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoIntervalo!=null) {
				this.jScrollPanelDatosTipoIntervalo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoIntervalo!=null) {
				this.jPanelPaginacionTipoIntervalo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoIntervalo!=null) {
				this.jPanelParametrosReportesTipoIntervalo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoIntervalo!=null) {
				this.jScrollPanelDatosEdicionTipoIntervalo.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoIntervalo!=null) {
				this.jScrollPanelDatosTipoIntervalo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoIntervalo!=null) {
				this.jPanelPaginacionTipoIntervalo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoIntervalo!=null) {
				this.jPanelParametrosReportesTipoIntervalo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoIntervalo!=null) {
				this.jScrollPanelDatosEdicionTipoIntervalo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoIntervalo!=null) {
				this.jScrollPanelDatosTipoIntervalo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoIntervalo!=null) {
				this.jPanelPaginacionTipoIntervalo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoIntervalo!=null) {
				this.jPanelParametrosReportesTipoIntervalo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoIntervalo!=null) {
				this.jScrollPanelDatosEdicionTipoIntervalo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoIntervalo!=null) {
				this.jScrollPanelDatosTipoIntervalo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoIntervalo!=null) {
				this.jPanelPaginacionTipoIntervalo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoIntervalo!=null) {
				this.jPanelParametrosReportesTipoIntervalo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoIntervalo!=null) {
				this.jScrollPanelDatosEdicionTipoIntervalo.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoIntervalo!=null) {
				this.jScrollPanelDatosTipoIntervalo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoIntervalo!=null) {
				this.jPanelPaginacionTipoIntervalo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoIntervalo!=null) {
				this.jPanelParametrosReportesTipoIntervalo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoIntervalo!=null) {
				this.jScrollPanelDatosEdicionTipoIntervalo.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoIntervalo!=null) {
				this.jScrollPanelDatosTipoIntervalo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoIntervalo!=null) {
				this.jPanelPaginacionTipoIntervalo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoIntervalo!=null) {
				this.jPanelParametrosReportesTipoIntervalo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoIntervaloParaParametroContabilidadDefectos() throws Exception {
		Boolean isPaginaPopupParametroContabilidadDefecto=false;

		try {

			if(this.tipointervaloSessionBean==null) {
				this.tipointervaloSessionBean=new TipoIntervaloSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoSessionBean.setsPathNavegacionActual(tipointervaloSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroContabilidadDefecto=this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroContabilidadDefecto(true);
			this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroContabilidadDefecto(TipoIntervaloConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoIntervalo(true);
			this.jInternalFrameDetalleFormTipoIntervalo.parametrocontabilidaddefectoSessionBean.setlidTipoIntervaloActual(this.idTipoIntervaloActual);

			tipointervaloSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoIntervalo(true);
			tipointervaloSessionBean.setlIdTipoIntervaloActualForeignKey(this.idTipoIntervaloActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoIntervaloParaTablaAmortiDetalles() throws Exception {
		Boolean isPaginaPopupTablaAmortiDetalle=false;

		try {

			if(this.tipointervaloSessionBean==null) {
				this.tipointervaloSessionBean=new TipoIntervaloSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleSessionBean==null) {
				this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleSessionBean=new TablaAmortiDetalleSessionBean();
			}

			this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleSessionBean.setsPathNavegacionActual(tipointervaloSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupTablaAmortiDetalle=this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeTablaAmortiDetalle(true);
			this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeTablaAmortiDetalle(TipoIntervaloConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleSessionBean.setisBusquedaDesdeForeignKeySesionTipoIntervalo(true);
			this.jInternalFrameDetalleFormTipoIntervalo.tablaamortidetalleSessionBean.setlidTipoIntervaloActual(this.idTipoIntervaloActual);

			tipointervaloSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoIntervalo(true);
			tipointervaloSessionBean.setlIdTipoIntervaloActualForeignKey(this.idTipoIntervaloActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoIntervaloSessionBean tipointervaloSessionBean=new TipoIntervaloSessionBean();
		
		if(this.tipointervaloSessionBean==null) {
			this.tipointervaloSessionBean=new TipoIntervaloSessionBean();
		}
		
		this.tipointervaloSessionBean.setsUltimaBusquedaTipoIntervalo(this.getsAccionBusqueda());
		this.tipointervaloSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipointervaloSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoIntervaloSessionBean tipointervaloSessionBean=new TipoIntervaloSessionBean();
		
		if(this.tipointervaloSessionBean==null) {
			this.tipointervaloSessionBean=new TipoIntervaloSessionBean();
		}
		
		if(this.tipointervaloSessionBean.getsUltimaBusquedaTipoIntervalo()!=null&&!this.tipointervaloSessionBean.getsUltimaBusquedaTipoIntervalo().equals("")) {
			this.setsAccionBusqueda(tipointervaloSessionBean.getsUltimaBusquedaTipoIntervalo());
			this.setiNumeroPaginacion(tipointervaloSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipointervaloSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipointervaloSessionBean.setsUltimaBusquedaTipoIntervalo("");
		this.tipointervaloSessionBean.setiNumeroPaginacion(TipoIntervaloConstantesFunciones.INUMEROPAGINACION);
		this.tipointervaloSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoIntervalo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoIntervalo() {
		this.updateBorderResaltarBusquedasFormularioTipoIntervalo();
		this.updateVisibilidadBusquedasFormularioTipoIntervalo();
		this.updateHabilitarBusquedasFormularioTipoIntervalo();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoIntervalo() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoIntervalo() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoIntervalo() {
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
	
	public void updateControlesFormularioTipoIntervalo() throws Exception {

		if(this.jInternalFrameDetalleFormTipoIntervalo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoIntervalo();
		this.updateVisibilidadResaltarControlesFormularioTipoIntervalo();
		this.updateHabilitarResaltarControlesFormularioTipoIntervalo();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoIntervalo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoIntervalo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipointervaloConstantesFunciones.resaltaridTipoIntervalo!=null && this.jInternalFrameDetalleFormTipoIntervalo!=null) {this.jInternalFrameDetalleFormTipoIntervalo.jTextFieldidTipoIntervalo.setBorder(this.tipointervaloConstantesFunciones.resaltaridTipoIntervalo);}
		if(this.tipointervaloConstantesFunciones.resaltarnombreTipoIntervalo!=null && this.jInternalFrameDetalleFormTipoIntervalo!=null) {this.jInternalFrameDetalleFormTipoIntervalo.jTextAreanombreTipoIntervalo.setBorder(this.tipointervaloConstantesFunciones.resaltarnombreTipoIntervalo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoIntervalo() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoIntervalo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) {
	
		//this.jInternalFrameDetalleFormTipoIntervalo.jTextFieldidTipoIntervalo.setVisible(this.tipointervaloConstantesFunciones.mostraridTipoIntervalo);
		this.jInternalFrameDetalleFormTipoIntervalo.jPanelidTipoIntervalo.setVisible(this.tipointervaloConstantesFunciones.mostraridTipoIntervalo);
		//this.jInternalFrameDetalleFormTipoIntervalo.jTextAreanombreTipoIntervalo.setVisible(this.tipointervaloConstantesFunciones.mostrarnombreTipoIntervalo);
		this.jInternalFrameDetalleFormTipoIntervalo.jPanelnombreTipoIntervalo.setVisible(this.tipointervaloConstantesFunciones.mostrarnombreTipoIntervalo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoIntervalo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoIntervalo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoIntervalo!=null) {
	
		this.jInternalFrameDetalleFormTipoIntervalo.jTextFieldidTipoIntervalo.setEnabled(this.tipointervaloConstantesFunciones.activaridTipoIntervalo);
		this.jInternalFrameDetalleFormTipoIntervalo.jTextAreanombreTipoIntervalo.setEnabled(this.tipointervaloConstantesFunciones.activarnombreTipoIntervalo);
		}
	}
	
		
}