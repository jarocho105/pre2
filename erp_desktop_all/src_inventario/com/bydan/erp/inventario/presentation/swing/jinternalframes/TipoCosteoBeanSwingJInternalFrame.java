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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




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

import com.bydan.erp.inventario.util.TipoCosteoConstantesFunciones;
import com.bydan.erp.inventario.util.TipoCosteoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.TipoCosteoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.TipoCosteoBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoCosteoBeanSwingJInternalFrame extends TipoCosteoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoCosteoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoCosteo> tipocosteoValidator = new ClassValidator<TipoCosteo>(TipoCosteo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoCosteo tipocosteo;	
	public TipoCosteo tipocosteoAux;
	public TipoCosteo tipocosteoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoCosteo tipocosteoTotales;
	public Long idTipoCosteoActual;
	public Long iIdNuevoTipoCosteo=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosParametroInventarioDefecto=false;

	public Boolean getIsTienePermisosParametroInventarioDefecto() {
		return isTienePermisosParametroInventarioDefecto;
	}

	public void setIsTienePermisosParametroInventarioDefecto(Boolean isTienePermisosParametroInventarioDefecto) {
		this.isTienePermisosParametroInventarioDefecto= isTienePermisosParametroInventarioDefecto;
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
	
	public Boolean isPermisoTodoTipoCosteo;
	public Boolean isPermisoNuevoTipoCosteo;
	public Boolean isPermisoActualizarTipoCosteo;
	public Boolean isPermisoActualizarOriginalTipoCosteo;
	public Boolean isPermisoEliminarTipoCosteo;
	public Boolean isPermisoGuardarCambiosTipoCosteo;
	public Boolean isPermisoConsultaTipoCosteo;
	public Boolean isPermisoBusquedaTipoCosteo;
	public Boolean isPermisoReporteTipoCosteo;
	public Boolean isPermisoPaginacionMedioTipoCosteo;
	public Boolean isPermisoPaginacionAltoTipoCosteo;
	public Boolean isPermisoPaginacionTodoTipoCosteo;
	public Boolean isPermisoCopiarTipoCosteo;
	public Boolean isPermisoVerFormTipoCosteo;
	public Boolean isPermisoDuplicarTipoCosteo;
	public Boolean isPermisoOrdenTipoCosteo;
	
	
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
	
	public TipoCosteoParameterReturnGeneral tipocosteoReturnGeneral;
	public TipoCosteoParameterReturnGeneral tipocosteoParameterGeneral;
	
	

	public ParametroInventarioDefectoLogic parametroinventariodefectoLogic=null;

	public ParametroInventarioDefectoLogic getParametroInventarioDefectoLogic() {
		return parametroinventariodefectoLogic;
	}

	public void setParametroInventarioDefectoLogic(ParametroInventarioDefectoLogic parametroinventariodefectoLogic) {
		this.parametroinventariodefectoLogic = parametroinventariodefectoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoCosteo=false;
	public Boolean esParaAccionDesdeFormularioTipoCosteo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoCosteoLogic tipocosteoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoCosteo tipocosteoBean;
	public TipoCosteoConstantesFunciones tipocosteoConstantesFunciones;
	//public TipoCosteoParameterReturnGeneral tipocosteoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoCosteo> tipocosteos;	
	//public List<TipoCosteo> tipocosteosEliminados;
	//public List<TipoCosteo> tipocosteosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoCosteo=false;
	public Boolean isVisibilidadCeldaDuplicarTipoCosteo=true;
	public Boolean isVisibilidadCeldaCopiarTipoCosteo=true;
	public Boolean isVisibilidadCeldaVerFormTipoCosteo=true;
	public Boolean isVisibilidadCeldaOrdenTipoCosteo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoCosteo=false;
	public Boolean isVisibilidadCeldaModificarTipoCosteo=false;
	public Boolean isVisibilidadCeldaActualizarTipoCosteo=false;
	public Boolean isVisibilidadCeldaEliminarTipoCosteo=false;
	public Boolean isVisibilidadCeldaCancelarTipoCosteo=false;
	public Boolean isVisibilidadCeldaGuardarTipoCosteo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoCosteo=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	
	public Long getiIdNuevoTipoCosteo() {
		return this.iIdNuevoTipoCosteo;
	}

	public void setiIdNuevoTipoCosteo(Long iIdNuevoTipoCosteo) {
		this.iIdNuevoTipoCosteo = iIdNuevoTipoCosteo;
	}
	
	public Long getidTipoCosteoActual() {
		return this.idTipoCosteoActual;
	}

	public void setidTipoCosteoActual(Long idTipoCosteoActual) {
		this.idTipoCosteoActual = idTipoCosteoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoCosteo gettipocosteo() {
		return this.tipocosteo;
	}

	public void settipocosteo(TipoCosteo tipocosteo) {
		this.tipocosteo = tipocosteo;
	}
	
	public TipoCosteo gettipocosteoAux() {
		return this.tipocosteoAux;
	}

	public void settipocosteoAux(TipoCosteo tipocosteoAux) {
		this.tipocosteoAux = tipocosteoAux;
	}				
	
	public TipoCosteo gettipocosteoAnterior() {
		return this.tipocosteoAnterior;
	}

	public void settipocosteoAnterior(TipoCosteo tipocosteoAnterior) {
		this.tipocosteoAnterior = tipocosteoAnterior;
	}	
	
	public TipoCosteo gettipocosteoTotales() {
		return this.tipocosteoTotales;
	}

	public void settipocosteoTotales(TipoCosteo tipocosteoTotales) {
		this.tipocosteoTotales = tipocosteoTotales;
	}	
	
	public TipoCosteo gettipocosteoBean() {
		return this.tipocosteoBean;
	}

	public void settipocosteoBean(TipoCosteo tipocosteoBean) {
		this.tipocosteoBean = tipocosteoBean;
	}	
	
	public TipoCosteoParameterReturnGeneral gettipocosteoReturnGeneral() {
		return this.tipocosteoReturnGeneral;
	}

	public void settipocosteoReturnGeneral(TipoCosteoParameterReturnGeneral tipocosteoReturnGeneral) {
		this.tipocosteoReturnGeneral = tipocosteoReturnGeneral;
	}	
	
	
	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoCosteoLogic getTipoCosteoLogic()	{		
		return tipocosteoLogic;
	}

	public void setTipoCosteoLogic(TipoCosteoLogic tipocosteoLogic) {
		this.tipocosteoLogic = tipocosteoLogic;
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
	
	public Boolean getIsEsNuevoTipoCosteo() {
		return isEsNuevoTipoCosteo;
	}

	public void setIsEsNuevoTipoCosteo(Boolean isEsNuevoTipoCosteo) {
		this.isEsNuevoTipoCosteo = isEsNuevoTipoCosteo;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoCosteo() {
		return esParaAccionDesdeFormularioTipoCosteo;
	}
	
	public void setEsParaAccionDesdeFormularioTipoCosteo(Boolean esParaAccionDesdeFormularioTipoCosteo) {
		this.esParaAccionDesdeFormularioTipoCosteo = esParaAccionDesdeFormularioTipoCosteo;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoCosteo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoCosteoConstantesFunciones.refrescarForeignKeysDescripcionesTipoCosteo(this.tipocosteoLogic.getTipoCosteos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoCosteoConstantesFunciones.refrescarForeignKeysDescripcionesTipoCosteo(this.tipocosteos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocosteoLogic.setTipoCosteos(this.tipocosteos);
			tipocosteoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoCosteoParameterReturnGeneral getTipoCosteoParameterGeneral() {
		return this.tipocosteoParameterGeneral;
	}
	
	public void setTipoCosteoParameterGeneral(TipoCosteoParameterReturnGeneral tipocosteoParameterGeneral) {
		this.tipocosteoParameterGeneral = tipocosteoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoCosteo() {
		return isPermisoTodoTipoCosteo;
	}

	public void setIsPermisoTodoTipoCosteo(Boolean isPermisoTodoTipoCosteo) {
		this.isPermisoTodoTipoCosteo = isPermisoTodoTipoCosteo;
	}

	public Boolean getIsPermisoNuevoTipoCosteo() {
		return isPermisoNuevoTipoCosteo;
	}

	public void setIsPermisoNuevoTipoCosteo(Boolean isPermisoNuevoTipoCosteo) {
		this.isPermisoNuevoTipoCosteo = isPermisoNuevoTipoCosteo;
	}

	public Boolean getIsPermisoActualizarTipoCosteo() {
		return isPermisoActualizarTipoCosteo;
	}

	public void setIsPermisoActualizarTipoCosteo(Boolean isPermisoActualizarTipoCosteo) {
		this.isPermisoActualizarTipoCosteo = isPermisoActualizarTipoCosteo;
	}

	public Boolean getIsPermisoEliminarTipoCosteo() {
		return isPermisoEliminarTipoCosteo;
	}

	public void setIsPermisoEliminarTipoCosteo(Boolean isPermisoEliminarTipoCosteo) {
		this.isPermisoEliminarTipoCosteo = isPermisoEliminarTipoCosteo;
	}

	public Boolean getIsPermisoGuardarCambiosTipoCosteo() {
		return isPermisoGuardarCambiosTipoCosteo;
	}

	public void setIsPermisoGuardarCambiosTipoCosteo(Boolean isPermisoGuardarCambiosTipoCosteo) {
		this.isPermisoGuardarCambiosTipoCosteo = isPermisoGuardarCambiosTipoCosteo;
	}
	
	public Boolean getIsPermisoConsultaTipoCosteo() {
		return isPermisoConsultaTipoCosteo;
	}

	public void setIsPermisoConsultaTipoCosteo(Boolean isPermisoConsultaTipoCosteo) {
		this.isPermisoConsultaTipoCosteo = isPermisoConsultaTipoCosteo;
	}

	public Boolean getIsPermisoBusquedaTipoCosteo() {
		return isPermisoBusquedaTipoCosteo;
	}

	public void setIsPermisoBusquedaTipoCosteo(Boolean isPermisoBusquedaTipoCosteo) {
		this.isPermisoBusquedaTipoCosteo = isPermisoBusquedaTipoCosteo;
	}

	public Boolean getIsPermisoReporteTipoCosteo() {
		return isPermisoReporteTipoCosteo;
	}

	public void setIsPermisoReporteTipoCosteo(Boolean isPermisoReporteTipoCosteo) {
		this.isPermisoReporteTipoCosteo = isPermisoReporteTipoCosteo;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoCosteo() {
		return isPermisoPaginacionMedioTipoCosteo;
	}

	public void setIsPermisoPaginacionMedioTipoCosteo(Boolean isPermisoPaginacionMedioTipoCosteo) {
		this.isPermisoPaginacionMedioTipoCosteo = isPermisoPaginacionMedioTipoCosteo;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoCosteo() {
		return isPermisoPaginacionTodoTipoCosteo;
	}

	public void setIsPermisoPaginacionTodoTipoCosteo(Boolean isPermisoPaginacionTodoTipoCosteo) {
		this.isPermisoPaginacionTodoTipoCosteo = isPermisoPaginacionTodoTipoCosteo;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoCosteo() {
		return isPermisoPaginacionAltoTipoCosteo;
	}

	public void setIsPermisoPaginacionAltoTipoCosteo(Boolean isPermisoPaginacionAltoTipoCosteo) {
		this.isPermisoPaginacionAltoTipoCosteo = isPermisoPaginacionAltoTipoCosteo;
	}
	
	public Boolean getIsPermisoCopiarTipoCosteo() {
		return isPermisoCopiarTipoCosteo;
	}

	public void setIsPermisoCopiarTipoCosteo(Boolean isPermisoCopiarTipoCosteo) {
		this.isPermisoCopiarTipoCosteo = isPermisoCopiarTipoCosteo;
	}
	
	public Boolean getIsPermisoVerFormTipoCosteo() {
		return isPermisoVerFormTipoCosteo;
	}

	public void setIsPermisoVerFormTipoCosteo(Boolean isPermisoVerFormTipoCosteo) {
		this.isPermisoVerFormTipoCosteo = isPermisoVerFormTipoCosteo;
	}
	
	public Boolean getIsPermisoDuplicarTipoCosteo() {
		return isPermisoDuplicarTipoCosteo;
	}

	public void setIsPermisoDuplicarTipoCosteo(Boolean isPermisoDuplicarTipoCosteo) {
		this.isPermisoDuplicarTipoCosteo = isPermisoDuplicarTipoCosteo;
	}
	
	public Boolean getIsPermisoOrdenTipoCosteo() {
		return isPermisoOrdenTipoCosteo;
	}

	public void setIsPermisoOrdenTipoCosteo(Boolean isPermisoOrdenTipoCosteo) {
		this.isPermisoOrdenTipoCosteo = isPermisoOrdenTipoCosteo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoCosteo() {
		return isVisibilidadCeldaNuevoTipoCosteo;
	}

	public void setIsVisibilidadCeldaNuevoTipoCosteo(Boolean isVisibilidadCeldaNuevoTipoCosteo) {
		this.isVisibilidadCeldaNuevoTipoCosteo = isVisibilidadCeldaNuevoTipoCosteo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoCosteo() {
		return isVisibilidadCeldaDuplicarTipoCosteo;
	}

	public void setIsVisibilidadCeldaDuplicarTipoCosteo(Boolean isVisibilidadCeldaDuplicarTipoCosteo) {
		this.isVisibilidadCeldaDuplicarTipoCosteo = isVisibilidadCeldaDuplicarTipoCosteo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoCosteo() {
		return isVisibilidadCeldaCopiarTipoCosteo;
	}

	public void setIsVisibilidadCeldaCopiarTipoCosteo(Boolean isVisibilidadCeldaCopiarTipoCosteo) {
		this.isVisibilidadCeldaCopiarTipoCosteo = isVisibilidadCeldaCopiarTipoCosteo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoCosteo() {
		return isVisibilidadCeldaVerFormTipoCosteo;
	}

	public void setIsVisibilidadCeldaVerFormTipoCosteo(Boolean isVisibilidadCeldaVerFormTipoCosteo) {
		this.isVisibilidadCeldaVerFormTipoCosteo = isVisibilidadCeldaVerFormTipoCosteo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoCosteo() {
		return isVisibilidadCeldaOrdenTipoCosteo;
	}

	public void setIsVisibilidadCeldaOrdenTipoCosteo(Boolean isVisibilidadCeldaOrdenTipoCosteo) {
		this.isVisibilidadCeldaOrdenTipoCosteo = isVisibilidadCeldaOrdenTipoCosteo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoCosteo() {
		return isVisibilidadCeldaNuevoRelacionesTipoCosteo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoCosteo(Boolean isVisibilidadCeldaNuevoRelacionesTipoCosteo) {
		this.isVisibilidadCeldaNuevoRelacionesTipoCosteo = isVisibilidadCeldaNuevoRelacionesTipoCosteo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoCosteo() {
		return isVisibilidadCeldaModificarTipoCosteo;
	}

	public void setIsVisibilidadCeldaModificarTipoCosteo(Boolean isVisibilidadCeldaModificarTipoCosteo) {
		this.isVisibilidadCeldaModificarTipoCosteo = isVisibilidadCeldaModificarTipoCosteo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoCosteo() {
		return isVisibilidadCeldaActualizarTipoCosteo;
	}

	public void setIsVisibilidadCeldaActualizarTipoCosteo(Boolean isVisibilidadCeldaActualizarTipoCosteo) {
		this.isVisibilidadCeldaActualizarTipoCosteo = isVisibilidadCeldaActualizarTipoCosteo;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoCosteo() {
		return isVisibilidadCeldaEliminarTipoCosteo;
	}

	public void setIsVisibilidadCeldaEliminarTipoCosteo(Boolean isVisibilidadCeldaEliminarTipoCosteo) {
		this.isVisibilidadCeldaEliminarTipoCosteo = isVisibilidadCeldaEliminarTipoCosteo;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoCosteo() {
		return isVisibilidadCeldaCancelarTipoCosteo;
	}

	public void setIsVisibilidadCeldaCancelarTipoCosteo(Boolean isVisibilidadCeldaCancelarTipoCosteo) {
		this.isVisibilidadCeldaCancelarTipoCosteo = isVisibilidadCeldaCancelarTipoCosteo;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoCosteo() {
		return isVisibilidadCeldaGuardarTipoCosteo;
	}

	public void setIsVisibilidadCeldaGuardarTipoCosteo(Boolean isVisibilidadCeldaGuardarTipoCosteo) {
		this.isVisibilidadCeldaGuardarTipoCosteo = isVisibilidadCeldaGuardarTipoCosteo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoCosteo() {
		return isVisibilidadCeldaGuardarCambiosTipoCosteo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoCosteo(Boolean isVisibilidadCeldaGuardarCambiosTipoCosteo) {
		this.isVisibilidadCeldaGuardarCambiosTipoCosteo = isVisibilidadCeldaGuardarCambiosTipoCosteo;
	}
		
	public TipoCosteoSessionBean gettipocosteoSessionBean() {
		return this.tipocosteoSessionBean;
	}
	
	public void settipocosteoSessionBean(TipoCosteoSessionBean tipocosteoSessionBean) {
		this.tipocosteoSessionBean=tipocosteoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoCosteo(TipoCosteo tipocosteo)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoCosteo tipocosteo,TipoCosteo tipocosteoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoCosteo(tipocosteo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocosteoAux.setId(tipocosteo.getId());
		tipocosteoAux.setVersionRow(tipocosteo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoCosteo();
		
			int intSelectedRow = this.jTableDatosTipoCosteo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteo =(TipoCosteo) this.tipocosteoLogic.getTipoCosteos().toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocosteo =(TipoCosteo) this.tipocosteos.toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoCosteoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoCosteo(this.tipocosteo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteo(this.tipocosteo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocosteoValidator.getInvalidValues(this.tipocosteo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocosteoLogic.setDatosCliente(datosCliente);
			tipocosteoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocosteoAux=new  TipoCosteo();
				
				tipocosteoAux.setIsNew(true);
				tipocosteoAux.setIsChanged(true);
				
				tipocosteoAux.setTipoCosteoOriginal(this.tipocosteo);
				
				tipocosteoAux.setId(this.tipocosteo.getId());	
				tipocosteoAux.setVersionRow(this.tipocosteo.getVersionRow());	
				tipocosteoAux.setnombre(this.tipocosteo.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocosteoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocosteoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocosteoAux,tipocosteoLogic.getTipoCosteos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocosteoAux,tipocosteos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocosteoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocosteoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocosteoLogic.saveTipoCosteos();//WithConnection
						//tipocosteoLogic.getSetVersionRowTipoCosteos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocosteo,tipocosteoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocosteoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocosteoAux=new  TipoCosteo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocosteoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocosteoSessionBean.getEsGuardarRelacionado() && this.tipocosteo.getId()>=0)) {
						
					tipocosteoAux.setIsNew(false);
				}
				
				tipocosteoAux.setIsDeleted(false);
			
				tipocosteoAux.setId(this.tipocosteo.getId());	
				tipocosteoAux.setVersionRow(this.tipocosteo.getVersionRow());	
				tipocosteoAux.setnombre(this.tipocosteo.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocosteoAux,tipocosteoLogic.getTipoCosteos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocosteoAux,tipocosteos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocosteoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocosteoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocosteoLogic.saveTipoCosteos();//WithConnection
						//tipocosteoLogic.getSetVersionRowTipoCosteos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocosteo,tipocosteoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocosteoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocosteoAux=new  TipoCosteo();
				
				tipocosteoAux.setIsNew(false);
				tipocosteoAux.setIsChanged(false);
				
				tipocosteoAux.setIsDeleted(true);
				
				tipocosteoAux.setId(this.tipocosteo.getId());	
				tipocosteoAux.setVersionRow(this.tipocosteo.getVersionRow());	
				tipocosteoAux.setnombre(this.tipocosteo.getnombre());	
				
				if(this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocosteoAux.getId()>=0) {	
						this.tipocosteosEliminados.add(tipocosteoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocosteoAux,tipocosteoLogic.getTipoCosteos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocosteoAux,tipocosteos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocosteoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocosteoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocosteoLogic.saveTipoCosteos();//WithConnection
						//tipocosteoLogic.getSetVersionRowTipoCosteos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocosteoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocosteoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipocosteoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipocosteoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipocosteoAux,tipocosteoLogic.getTipoCosteos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipocosteoAux,tipocosteos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteoLogic.getTipoCosteos().addAll(this.tipocosteosEliminados);
					
					tipocosteoLogic.saveTipoCosteos();//WithConnection
					//tipocosteoLogic.getSetVersionRowTipoCosteos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipocosteosEliminados= new ArrayList<TipoCosteo>();		
			}
			
			if(this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocosteoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Costeo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Costeo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocosteo=tipocosteoAux;
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
      		//this.finishProcessTipoCosteo();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoCosteo tipocosteoLocal) throws Exception {
		
		if(this.tipocosteoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipocosteoLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
			
			} else {
			
				tipocosteoLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoCosteo tipocosteoLocal) throws Exception {	
		if(this.tipocosteoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoCosteoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoCosteo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocosteo =(TipoCosteo) this.tipocosteoLogic.getTipoCosteos().toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocosteo =(TipoCosteo) this.tipocosteos.toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocosteoValidator.getInvalidValues(this.tipocosteo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoCosteo tipocosteo,List<TipoCosteo> tipocosteos) throws Exception {
		try	{		
			TipoCosteoConstantesFunciones.actualizarLista(tipocosteo,tipocosteos,this.tipocosteoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoCosteo tipocosteo,List<TipoCosteo> tipocosteos) throws Exception {
		try	{			
			TipoCosteoConstantesFunciones.actualizarSelectedLista(tipocosteo,tipocosteos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoCosteo> tipocosteosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocosteosLocal=this.tipocosteoLogic.getTipoCosteos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocosteosLocal=this.tipocosteos;
			}
			//ARCHITECTURE
		
			for(TipoCosteo tipocosteoLocal:tipocosteosLocal) {
				if(this.permiteMantenimiento(tipocosteoLocal) && tipocosteoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoCosteoConstantesFunciones.getTipoCosteoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoCosteoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCosteo.jLabelnombreTipoCosteo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCosteo.jLabelnombreTipoCosteo,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ParametroInventarioDefecto")) {
			if(this.tipocosteo==null) {
				this.tipocosteo= new TipoCosteo();
			}

			if(this.tipocosteoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoCosteo
				this.setVariablesFormularioToObjetoActualTipoCosteo(this.tipocosteo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteo(this.tipocosteo);

				this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame.getparametroinventariodefecto().setTipoCosteo(this.tipocosteo);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoCosteo--;	
		
		
		this.tipocosteoAux=new TipoCosteo();
		
		this.tipocosteoAux.setId(this.iIdNuevoTipoCosteo);
		this.tipocosteoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocosteoLogic.getTipoCosteos().add(this.tipocosteoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocosteos.add(this.tipocosteoAux);
		}
		//ARCHITECTURE
		
		this.tipocosteo=this.tipocosteoAux;
		
		if(TipoCosteoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoCosteo(this.tipocosteo);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCosteo(this.tipocosteo);
		}
				
		//this.setDefaultControlesTipoCosteo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoCosteo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoCosteo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCosteo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCosteo(this.tipocosteoBean,this.tipocosteo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteo(this.tipocosteo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoCosteoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocosteoSessionBean.getConGuardarRelaciones()) {
			classes=TipoCosteoConstantesFunciones.getClassesRelationshipsOfTipoCosteo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocosteoReturnGeneral=tipocosteoLogic.procesarEventosTipoCosteosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocosteoLogic.getTipoCosteos(),this.tipocosteo,this.tipocosteoParameterGeneral,this.isEsNuevoTipoCosteo,classes);//this.tipocosteoLogic.getTipoCosteo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoCosteo(this.tipocosteoReturnGeneral,this.tipocosteoBean,false);
		
		if(this.tipocosteoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCosteo(this.tipocosteoReturnGeneral.getTipoCosteo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoCosteo(this.tipocosteoReturnGeneral.getTipoCosteo());
		}
		
		if(this.tipocosteoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoCosteo(this.tipocosteoReturnGeneral.getTipoCosteo(),classes);//this.tipocosteoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoCosteo(this.tipocosteo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoCosteo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoCosteo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoCosteo(false);
						
			if(tipocosteoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoCosteoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCosteo();
			}
			
			this.actualizarVisualTableDatosTipoCosteo();
			
			this.jTableDatosTipoCosteo.setRowSelectionInterval(this.getIndiceNuevoTipoCosteo(), this.getIndiceNuevoTipoCosteo());
			
			this.seleccionarFilaTablaTipoCosteoActual();
						
			this.actualizarEstadoCeldasBotonesTipoCosteo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoCosteo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoCosteo.jTextAreanombreTipoCosteo.setEnabled(isHabilitar && this.tipocosteoConstantesFunciones.activarnombreTipoCosteo);	
		
	};
	
	public void setDefaultControlesTipoCosteo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoCosteo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocosteoSessionBean.setConGuardarRelaciones(true);			
			this.tipocosteoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoCosteo.jTabbedPaneRelacionesTipoCosteo.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipocosteoSessionBean.setConGuardarRelaciones(false);			
			this.tipocosteoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoCosteo.jTabbedPaneRelacionesTipoCosteo.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoCosteo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCosteo tipocosteoAux:this.tipocosteoLogic.getTipoCosteos()) {
				if(tipocosteoAux.getId().equals(this.iIdNuevoTipoCosteo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCosteo tipocosteoAux:this.tipocosteos) {
				if(tipocosteoAux.getId().equals(this.iIdNuevoTipoCosteo)) {
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
	
	public int getIndiceActualTipoCosteo(TipoCosteo tipocosteo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCosteo tipocosteoAux:this.tipocosteoLogic.getTipoCosteos()) {
				if(tipocosteoAux.getId().equals(tipocosteo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCosteo tipocosteoAux:this.tipocosteos) {
				if(tipocosteoAux.getId().equals(tipocosteo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoCosteo(TipoCosteo tipocosteoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCosteo tipocosteoAux:this.tipocosteoLogic.getTipoCosteos()) {
				if(tipocosteoAux.getTipoCosteoOriginal().getId().equals(tipocosteoOriginal.getId())) {
					existe=true;
					tipocosteoOriginal.setId(tipocosteoAux.getId());
					tipocosteoOriginal.setVersionRow(tipocosteoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCosteo tipocosteoAux:this.tipocosteos) {
				if(tipocosteoAux.getTipoCosteoOriginal().getId().equals(tipocosteoOriginal.getId())) {
					existe=true;
					tipocosteoOriginal.setId(tipocosteoAux.getId());
					tipocosteoOriginal.setVersionRow(tipocosteoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoCosteo(Boolean esParaCancelar) throws Exception {
		tipocosteosAux=new ArrayList<TipoCosteo>();
		tipocosteoAux=new TipoCosteo();
		
		if(!this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCosteo tipocosteoAux:this.tipocosteoLogic.getTipoCosteos()) {
					if(tipocosteoAux.getId()<0) {
						tipocosteosAux.add(tipocosteoAux);
					}		
				}
				this.iIdNuevoTipoCosteo=0L;
				this.tipocosteoLogic.getTipoCosteos().removeAll(tipocosteosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCosteo tipocosteoAux:this.tipocosteos) {
					if(tipocosteoAux.getId()<0) {
						tipocosteosAux.add(tipocosteoAux);
					}		
				}
				this.iIdNuevoTipoCosteo=0L;
				this.tipocosteos.removeAll(tipocosteosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoCosteo 
					&& this.tipocosteoLogic.getTipoCosteos().size()>0
					) {
					tipocosteoAux=this.tipocosteoLogic.getTipoCosteos().get(this.tipocosteoLogic.getTipoCosteos().size() - 1);
				
					if(tipocosteoAux.getId()<0) {
						this.tipocosteoLogic.getTipoCosteos().remove(tipocosteoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoCosteo && this.tipocosteos.size()>0) {
					tipocosteoAux=this.tipocosteos.get(this.tipocosteos.size() - 1);
				
					if(tipocosteoAux.getId()<0) {
						this.tipocosteos.remove(tipocosteoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoCosteo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocosteo.getId()<0) {
				this.tipocosteoLogic.getTipoCosteos().remove(this.tipocosteo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocosteo.getId()<0) {
				this.tipocosteos.remove(this.tipocosteo);
			}
		}			
	}
	
	public void setEstadosInicialesTipoCosteo(List<TipoCosteo> tipocosteosAux) throws Exception {
		TipoCosteoConstantesFunciones.setEstadosInicialesTipoCosteo(tipocosteosAux);
	}
	
	public void setEstadosInicialesTipoCosteo(TipoCosteo tipocosteoAux) throws Exception {
		TipoCosteoConstantesFunciones.setEstadosInicialesTipoCosteo(tipocosteoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoCosteoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoCosteo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoCosteoActual()) {
				if(!this.isEsNuevoTipoCosteo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoCosteo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoCosteo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoCosteoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Costeo ?", "MANTENIMIENTO DE Tipo Costeo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoCosteo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoCosteo tipocosteo) throws Exception {
		TipoCosteoConstantesFunciones.seleccionarAsignar(this.tipocosteo,tipocosteo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoCosteo=this.isPermisoActualizarOriginalTipoCosteo;
			
			
			this.seleccionarAsignar(tipocosteo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCosteoConstantesFunciones.quitarEspaciosTipoCosteo(this.tipocosteo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoCosteo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocosteoSessionBean.setsFuncionBusquedaRapida(this.tipocosteoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoCosteo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoCosteo(esParaCancelar);				
				this.cancelarNuevoTipoCosteo(esParaCancelar);								
			}
			
			this.tipocosteo=new TipoCosteo();
			
			this.inicializarTipoCosteo();
			
			this.actualizarEstadoCeldasBotonesTipoCosteo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoCosteo() throws Exception {
		try {
			TipoCosteoConstantesFunciones.inicializarTipoCosteo(this.tipocosteo);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocosteoLogic.getTipoCosteos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoCosteos(String sAccionBusqueda,List<TipoCosteo> tipocosteosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoCosteo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoCosteoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoCosteoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoCosteo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Costeos");		
		parameters.put("busquedapor", TipoCosteoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ParametroInventarioDefecto.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoCosteoLogic tipocosteoLogicAuxiliar=new TipoCosteoLogic();
					tipocosteoLogicAuxiliar.setDatosCliente(tipocosteoLogic.getDatosCliente());				
					tipocosteoLogicAuxiliar.setTipoCosteos(tipocosteosParaReportes);
					
					tipocosteoLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoCosteoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipocosteosParaReportes=tipocosteoLogicAuxiliar.getTipoCosteos();
					
					//tipocosteoLogic.getNewConnexionToDeep();
					
					//for (TipoCosteo tipocosteo:tipocosteosParaReportes) {
					//	tipocosteoLogic.deepLoad(tipocosteo, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipocosteoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipocosteoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileParametroInventarioDefecto = AuxiliarReportes.class.getResourceAsStream("ParametroInventarioDefectoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametroinventariodefecto", reportFileParametroInventarioDefecto);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoCosteo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoCosteoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoCosteoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoCosteo=new JRBeanArrayDataSource(TipoCosteoJInternalFrame.TraerTipoCosteoBeans(tipocosteosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoCosteo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoCosteoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoCosteoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoCosteoBean.TraerTipoCosteoBeans(tipocosteosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoCosteos(sAccionBusqueda,sTipoArchivoReporte,tipocosteosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoCosteos(sAccionBusqueda,sTipoArchivoReporte,tipocosteosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoCosteoActionPerformed(null);
					//this.generarExcelReporteTipoCosteos(sAccionBusqueda,sTipoArchivoReporte,tipocosteosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoCosteos(sAccionBusqueda,sTipoArchivoReporte,tipocosteosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoCosteos(sAccionBusqueda,sTipoArchivoReporte,tipocosteosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoCosteos(sAccionBusqueda,sTipoArchivoReporte,tipocosteosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoCosteos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCosteo> tipocosteosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocosteo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCosteos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCosteo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoCosteo tipocosteo : tipocosteosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoCosteoConstantesFunciones.generarExcelReporteDataTipoCosteo("NORMAL",row,workbook,tipocosteo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocosteoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costeo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoCosteo(String sTipo,Row row,Workbook workbook) {
		
		TipoCosteoConstantesFunciones.generarExcelReporteHeaderTipoCosteo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoCosteos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCosteo> tipocosteosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocosteo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCosteos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoCosteo tipocosteo : tipocosteosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoCosteoConstantesFunciones.getTipoCosteoDescripcion(tipocosteo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCosteoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCosteoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocosteo.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocosteoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costeo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoCosteos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCosteo> tipocosteosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoCosteo> tipocosteosRespaldo=null;
		
		classes=TipoCosteoConstantesFunciones.getClassesRelationshipsOfTipoCosteo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocosteoLogic.setDatosCliente(this.datosCliente);
		this.tipocosteoLogic.setDatosDeep(this.datosDeep);
		this.tipocosteoLogic.setIsConDeep(true);
		
		tipocosteosRespaldo=this.tipocosteoLogic.getTipoCosteos();
		
		this.tipocosteoLogic.setTipoCosteos(tipocosteosParaReportes);	
		this.tipocosteoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocosteosParaReportes=this.tipocosteoLogic.getTipoCosteos();
		this.tipocosteoLogic.setTipoCosteos(tipocosteosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocosteo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCosteos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCosteo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoCosteo tipocosteo : tipocosteosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoCosteo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoCosteoConstantesFunciones.generarExcelReporteDataTipoCosteo("NORMAL",row,workbook,tipocosteo,cellStyleDataAux);
		
			
			


				//ParametroInventarioDefecto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipocosteo.getParametroInventarioDefectos()!=null && tipocosteo.getParametroInventarioDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroInventarioDefectoConstantesFunciones.generarExcelReporteHeaderParametroInventarioDefecto("RELACIONADO",row,workbook);
				}

				if(tipocosteo.getParametroInventarioDefectos()!=null) {
					i2=0;
					for(ParametroInventarioDefecto parametroinventariodefecto : tipocosteo.getParametroInventarioDefectos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ParametroInventarioDefectoConstantesFunciones.generarExcelReporteDataParametroInventarioDefecto("RELACIONADO",row,workbook,parametroinventariodefecto,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoCosteoConstantesFunciones.getTipoCosteoDescripcion(tipocosteo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocosteoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costeo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCosteo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCosteo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCosteo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCosteo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoCosteo() throws Exception {		
		this.startProcessTipoCosteo(true);
	}
	
	public void startProcessTipoCosteo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoCosteo ,this.jPanelParametrosReportesTipoCosteo, this.jScrollPanelDatosTipoCosteo,this.jPanelPaginacionTipoCosteo, this.jScrollPanelDatosEdicionTipoCosteo, this.jPanelAccionesTipoCosteo,this.jPanelAccionesFormularioTipoCosteo,this.jmenuBarTipoCosteo,this.jmenuBarDetalleTipoCosteo,this.jTtoolBarTipoCosteo,this.jTtoolBarDetalleTipoCosteo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCosteo=this.jTabbedPaneBusquedasTipoCosteo; 
		
		final JPanel jPanelParametrosReportesTipoCosteo=this.jPanelParametrosReportesTipoCosteo;
		//final JScrollPane jScrollPanelDatosTipoCosteo=this.jScrollPanelDatosTipoCosteo;
		final JTable jTableDatosTipoCosteo=this.jTableDatosTipoCosteo;		
		final JPanel jPanelPaginacionTipoCosteo=this.jPanelPaginacionTipoCosteo;
		//final JScrollPane jScrollPanelDatosEdicionTipoCosteo=this.jScrollPanelDatosEdicionTipoCosteo;
		final JPanel jPanelAccionesTipoCosteo=this.jPanelAccionesTipoCosteo;
		
		JPanel jPanelCamposAuxiliarTipoCosteo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoCosteo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) {
			jPanelCamposAuxiliarTipoCosteo=this.jInternalFrameDetalleFormTipoCosteo.jPanelCamposTipoCosteo;
			jPanelAccionesFormularioAuxiliarTipoCosteo=this.jInternalFrameDetalleFormTipoCosteo.jPanelAccionesFormularioTipoCosteo;
		}
		
		final JPanel jPanelCamposTipoCosteo=jPanelCamposAuxiliarTipoCosteo;
		final JPanel jPanelAccionesFormularioTipoCosteo=jPanelAccionesFormularioAuxiliarTipoCosteo;
		
		
		final JMenuBar jmenuBarTipoCosteo=this.jmenuBarTipoCosteo;
		final JToolBar jTtoolBarTipoCosteo=this.jTtoolBarTipoCosteo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoCosteo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCosteo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) {
			jmenuBarDetalleAuxiliarTipoCosteo=this.jInternalFrameDetalleFormTipoCosteo.jmenuBarDetalleTipoCosteo;
			jTtoolBarDetalleAuxiliarTipoCosteo=this.jInternalFrameDetalleFormTipoCosteo.jTtoolBarDetalleTipoCosteo;
		}
		
		final JMenuBar jmenuBarDetalleTipoCosteo=jmenuBarDetalleAuxiliarTipoCosteo;
		final JToolBar jTtoolBarDetalleTipoCosteo=jTtoolBarDetalleAuxiliarTipoCosteo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCosteo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCosteo;
			processRunnable.jTableDatos=jTableDatosTipoCosteo;
			processRunnable.jPanelCampos=jPanelCamposTipoCosteo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCosteo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCosteo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCosteo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCosteo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCosteo;
			processRunnable.jTtoolBar=jTtoolBarTipoCosteo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCosteo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCosteo ,jPanelParametrosReportesTipoCosteo,jTableDatosTipoCosteo, /*jScrollPanelDatosTipoCosteo,*/jPanelCamposTipoCosteo,jPanelPaginacionTipoCosteo, /*jScrollPanelDatosEdicionTipoCosteo,*/ jPanelAccionesTipoCosteo,jPanelAccionesFormularioTipoCosteo,jmenuBarTipoCosteo,jmenuBarDetalleTipoCosteo,jTtoolBarTipoCosteo,jTtoolBarDetalleTipoCosteo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCosteo ,jPanelParametrosReportesTipoCosteo, jScrollPanelDatosTipoCosteo,jPanelPaginacionTipoCosteo, jScrollPanelDatosEdicionTipoCosteo, jPanelAccionesTipoCosteo,jPanelAccionesFormularioTipoCosteo,jmenuBarTipoCosteo,jmenuBarDetalleTipoCosteo,jTtoolBarTipoCosteo,jTtoolBarDetalleTipoCosteo);
						
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
	
	public void finishProcessTipoCosteo() {// throws Exception 
		this.finishProcessTipoCosteo(true);
	}
	
	public void finishProcessTipoCosteo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoCosteo ,this.jPanelParametrosReportesTipoCosteo, this.jScrollPanelDatosTipoCosteo,this.jPanelPaginacionTipoCosteo, this.jScrollPanelDatosEdicionTipoCosteo, this.jPanelAccionesTipoCosteo,this.jPanelAccionesFormularioTipoCosteo,this.jmenuBarTipoCosteo,this.jmenuBarDetalleTipoCosteo,this.jTtoolBarTipoCosteo,this.jTtoolBarDetalleTipoCosteo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCosteo=this.jTabbedPaneBusquedasTipoCosteo; 
		
		final JPanel jPanelParametrosReportesTipoCosteo=this.jPanelParametrosReportesTipoCosteo;
		//final JScrollPane jScrollPanelDatosTipoCosteo=this.jScrollPanelDatosTipoCosteo;
		final JTable jTableDatosTipoCosteo=this.jTableDatosTipoCosteo;		
		final JPanel jPanelPaginacionTipoCosteo=this.jPanelPaginacionTipoCosteo;
		//final JScrollPane jScrollPanelDatosEdicionTipoCosteo=this.jScrollPanelDatosEdicionTipoCosteo;
		final JPanel jPanelAccionesTipoCosteo=this.jPanelAccionesTipoCosteo;
		
		JPanel jPanelCamposAuxiliarTipoCosteo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoCosteo=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) {
			jPanelCamposAuxiliarTipoCosteo=this.jInternalFrameDetalleFormTipoCosteo.jPanelCamposTipoCosteo;
			jPanelAccionesFormularioAuxiliarTipoCosteo=this.jInternalFrameDetalleFormTipoCosteo.jPanelAccionesFormularioTipoCosteo;
		}
		
		final JPanel jPanelCamposTipoCosteo=jPanelCamposAuxiliarTipoCosteo;
		final JPanel jPanelAccionesFormularioTipoCosteo=jPanelAccionesFormularioAuxiliarTipoCosteo;
		
		
		final JMenuBar jmenuBarTipoCosteo=this.jmenuBarTipoCosteo;		
		final JToolBar jTtoolBarTipoCosteo=this.jTtoolBarTipoCosteo;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoCosteo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCosteo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) {
			jmenuBarDetalleAuxiliarTipoCosteo=this.jInternalFrameDetalleFormTipoCosteo.jmenuBarDetalleTipoCosteo;
			jTtoolBarDetalleAuxiliarTipoCosteo=this.jInternalFrameDetalleFormTipoCosteo.jTtoolBarDetalleTipoCosteo;		
		}
		
		final JMenuBar jmenuBarDetalleTipoCosteo=jmenuBarDetalleAuxiliarTipoCosteo;
		final JToolBar jTtoolBarDetalleTipoCosteo=jTtoolBarDetalleAuxiliarTipoCosteo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCosteo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCosteo;
			processRunnable.jTableDatos=jTableDatosTipoCosteo;
			processRunnable.jPanelCampos=jPanelCamposTipoCosteo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCosteo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCosteo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCosteo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCosteo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCosteo;
			processRunnable.jTtoolBar=jTtoolBarTipoCosteo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCosteo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoCosteo ,jPanelParametrosReportesTipoCosteo, jTableDatosTipoCosteo,/*jScrollPanelDatosTipoCosteo,*/jPanelCamposTipoCosteo,jPanelPaginacionTipoCosteo, /*jScrollPanelDatosEdicionTipoCosteo,*/ jPanelAccionesTipoCosteo,jPanelAccionesFormularioTipoCosteo,jmenuBarTipoCosteo,jmenuBarDetalleTipoCosteo,jTtoolBarTipoCosteo,jTtoolBarDetalleTipoCosteo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoCosteo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoCosteo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoCosteo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoCosteo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoCosteo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoCosteo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoCosteo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoCosteo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoCosteo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocosteoConstantesFunciones.getsFinalQueryTipoCosteo();
		String  finalQueryPaginacionTodos=this.tipocosteoConstantesFunciones.getsFinalQueryTipoCosteo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoCosteoConstantesFunciones.getArrayColumnasGlobalesNoTipoCosteo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoCosteoConstantesFunciones.getArrayColumnasGlobalesTipoCosteo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoCosteoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocosteosEliminados= new ArrayList<TipoCosteo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoCosteo();
		
				///*TipoCosteoSessionBean*/this.tipocosteoSessionBean=new TipoCosteoSessionBean();
			
			if(this.tipocosteoSessionBean==null) {
				this.tipocosteoSessionBean=new TipoCosteoSessionBean();
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
					this.iNumeroPaginacion=TipoCosteoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoCosteoConstantesFunciones.getClassesForeignKeysOfTipoCosteo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocosteo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocosteosAux= new ArrayList<TipoCosteo>();
			
				
			tipocosteoLogic.setDatosCliente(this.datosCliente);
			tipocosteoLogic.setDatosDeep(this.datosDeep);
			tipocosteoLogic.setIsConDeep(true);
			
			
			tipocosteoLogic.getTipoCosteoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocosteoLogic.getTodosTipoCosteos(finalQueryGlobal,pagination);
					
					//tipocosteoLogic.getTodosTipoCosteosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocosteoLogic.getTipoCosteos()==null|| tipocosteoLogic.getTipoCosteos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocosteosAux= new ArrayList<TipoCosteo>();
							tipocosteosAux.addAll(tipocosteoLogic.getTipoCosteos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocosteosAux= new ArrayList<TipoCosteo>();
							tipocosteosAux.addAll(tipocosteos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocosteoLogic.getTodosTipoCosteos(finalQueryGlobal+"",this.pagination);												
							
							//tipocosteoLogic.getTodosTipoCosteosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoCosteos("Todos",tipocosteoLogic.getTipoCosteos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocosteoLogic.setTipoCosteos(new ArrayList<TipoCosteo>());					
							tipocosteoLogic.getTipoCosteos().addAll(tipocosteosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocosteos=new ArrayList<TipoCosteo>();
							tipocosteos.addAll(tipocosteosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoCosteo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoCosteo=this.idActual;
				
				} else if(this.idTipoCosteoActual!=null && this.idTipoCosteoActual!=0L) {
					idTipoCosteo=idTipoCosteoActual;
				}
				
					
				this.sDetalleReporte=TipoCosteoConstantesFunciones.getDetalleIndicePorId(idTipoCosteo);
				
				this.tipocosteos=new ArrayList<TipoCosteo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocosteoLogic.getEntity(idTipoCosteo);
					
					//tipocosteoLogic.getEntityWithConnection(idTipoCosteo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocosteoLogic.setTipoCosteos(new ArrayList<TipoCosteo>());
					tipocosteoLogic.getTipoCosteos().add(tipocosteoLogic.getTipoCosteo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocosteos=new ArrayList<TipoCosteo>();
					this.tipocosteos.add(tipocosteo);
				}
				
				if(tipocosteoLogic.getTipoCosteo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoCosteoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocosteoLogic.getTipoCosteosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCosteoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCosteoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocosteoLogic.getTipoCosteos()==null||tipocosteoLogic.getTipoCosteos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocosteos==null|| tipocosteos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocosteosAux=new ArrayList<TipoCosteo>();
						tipocosteosAux.addAll(tipocosteoLogic.getTipoCosteos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocosteosAux=new ArrayList<TipoCosteo>();
							tipocosteosAux.addAll(tipocosteos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocosteoLogic.getTipoCosteosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCosteoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCosteoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoCosteos("BusquedaPorNombre",tipocosteoLogic.getTipoCosteos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoCosteos("BusquedaPorNombre",tipocosteos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocosteoLogic.setTipoCosteos(new ArrayList<TipoCosteo>());
						tipocosteoLogic.getTipoCosteos().addAll(tipocosteosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocosteos=new ArrayList<TipoCosteo>();
							tipocosteos.addAll(tipocosteosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoCosteo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoCosteo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocosteoLogic.getTipoCosteos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocosteos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocosteoLogic.getTipoCosteos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocosteos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoCosteo tipocosteo) {
		Boolean permite=true;
		
		if(this.tipocosteo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoCosteoConstantesFunciones.getOrderByListaTipoCosteo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoCosteoConstantesFunciones.getOrderByListaTipoCosteo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCosteo tipocosteo:tipocosteoLogic.getTipoCosteos()) {
				if(tipocosteo.getsType().equals(Constantes2.S_TOTALES)) {
					tipocosteoTotales=tipocosteo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCosteo tipocosteo:this.tipocosteos) {
				if(tipocosteo.getsType().equals(Constantes2.S_TOTALES)) {
					tipocosteoTotales=tipocosteo;
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
			this.tipocosteoAux=new TipoCosteo();
			this.tipocosteoAux.setsType(Constantes2.S_TOTALES);
			this.tipocosteoAux.setIsNew(false);
			this.tipocosteoAux.setIsChanged(false);
			this.tipocosteoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoCosteoConstantesFunciones.TotalizarValoresFilaTipoCosteo(this.tipocosteoLogic.getTipoCosteos(),this.tipocosteoAux);
				
				this.tipocosteoLogic.getTipoCosteos().add(this.tipocosteoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoCosteoConstantesFunciones.TotalizarValoresFilaTipoCosteo(this.tipocosteos,this.tipocosteoAux);
				
				this.tipocosteos.add(this.tipocosteoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocosteoTotales=new TipoCosteo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocosteoLogic.getTipoCosteos().remove(tipocosteoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocosteos.remove(tipocosteoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocosteoTotales=new TipoCosteo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCosteo tipocosteo:tipocosteoLogic.getTipoCosteos()) {
				if(tipocosteo.getsType().equals(Constantes2.S_TOTALES)) {
					tipocosteoTotales=tipocosteo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCosteoConstantesFunciones.TotalizarValoresFilaTipoCosteo(this.tipocosteoLogic.getTipoCosteos(),tipocosteoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCosteo tipocosteo:this.tipocosteos) {
				if(tipocosteo.getsType().equals(Constantes2.S_TOTALES)) {
					tipocosteoTotales=tipocosteo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCosteoConstantesFunciones.TotalizarValoresFilaTipoCosteo(this.tipocosteos,tipocosteoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoCosteosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoCosteoPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoCosteosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocosteoLogic.getTipoCosteosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoCosteoPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocosteoLogic.getTipoCosteoPorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoCosteo() {
		this.isPermisoTodoTipoCosteo=false;
		this.isPermisoNuevoTipoCosteo=false;
		this.isPermisoActualizarTipoCosteo=false;
		this.isPermisoActualizarOriginalTipoCosteo=false;
		this.isPermisoEliminarTipoCosteo=false;
		this.isPermisoGuardarCambiosTipoCosteo=false;
		this.isPermisoConsultaTipoCosteo=false;
		this.isPermisoBusquedaTipoCosteo=false;
		this.isPermisoReporteTipoCosteo=false;		
		this.isPermisoOrdenTipoCosteo=false;		
		this.isPermisoPaginacionMedioTipoCosteo=false;		
		this.isPermisoPaginacionAltoTipoCosteo=false;
		this.isPermisoPaginacionTodoTipoCosteo=false;
		this.isPermisoCopiarTipoCosteo=false;		
		this.isPermisoVerFormTipoCosteo=false;		
		this.isPermisoDuplicarTipoCosteo=false;		
		this.isPermisoOrdenTipoCosteo=false;		
	}
	
	public void setPermisosUsuarioTipoCosteo(Boolean isPermiso) {
		this.isPermisoTodoTipoCosteo=isPermiso;
		this.isPermisoNuevoTipoCosteo=isPermiso;
		this.isPermisoActualizarTipoCosteo=isPermiso;
		this.isPermisoActualizarOriginalTipoCosteo=isPermiso;
		this.isPermisoEliminarTipoCosteo=isPermiso;
		this.isPermisoGuardarCambiosTipoCosteo=isPermiso;
		this.isPermisoConsultaTipoCosteo=isPermiso;
		this.isPermisoBusquedaTipoCosteo=isPermiso;
		this.isPermisoReporteTipoCosteo=isPermiso;
		this.isPermisoOrdenTipoCosteo=isPermiso;		
		this.isPermisoPaginacionMedioTipoCosteo=isPermiso;		
		this.isPermisoPaginacionAltoTipoCosteo=isPermiso;		
		this.isPermisoPaginacionTodoTipoCosteo=isPermiso;		
		this.isPermisoCopiarTipoCosteo=isPermiso;		
		this.isPermisoVerFormTipoCosteo=isPermiso;		
		this.isPermisoDuplicarTipoCosteo=isPermiso;
		this.isPermisoOrdenTipoCosteo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoCosteo(Boolean isPermiso) {
		//this.isPermisoTodoTipoCosteo=isPermiso;
		this.isPermisoNuevoTipoCosteo=isPermiso;
		this.isPermisoActualizarTipoCosteo=isPermiso;
		this.isPermisoActualizarOriginalTipoCosteo=isPermiso;
		this.isPermisoEliminarTipoCosteo=isPermiso;
		this.isPermisoGuardarCambiosTipoCosteo=isPermiso;
		//this.isPermisoConsultaTipoCosteo=isPermiso;
		//this.isPermisoBusquedaTipoCosteo=isPermiso;
		//this.isPermisoReporteTipoCosteo=isPermiso;
		//this.isPermisoOrdenTipoCosteo=isPermiso;		
		//this.isPermisoPaginacionMedioTipoCosteo=isPermiso;		
		//this.isPermisoPaginacionAltoTipoCosteo=isPermiso;		
		//this.isPermisoPaginacionTodoTipoCosteo=isPermiso;		
		//this.isPermisoCopiarTipoCosteo=isPermiso;		
		//this.isPermisoDuplicarTipoCosteo=isPermiso;
		//this.isPermisoOrdenTipoCosteo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoCosteoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoCosteoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosParametroInventarioDefecto=false;
		this.isTienePermisosParametroInventarioDefecto=this.verificarGetPermisosUsuarioOpcionTipoCosteoClaseRelacionada(this.opcionsRelacionadas,ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoCosteo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoCosteoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosParametroInventarioDefecto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoCosteoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoCosteoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoCosteoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosParametroInventarioDefecto && this.jInternalFrameDetalleFormTipoCosteo!=null && this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCosteo.jTabbedPaneRelacionesTipoCosteo.remove(this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoCosteo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoCosteoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoCosteoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoCosteo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoCosteo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoCosteo=this.isPermisoActualizarTipoCosteo;
			this.isPermisoEliminarTipoCosteo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoCosteo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoCosteo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoCosteo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoCosteo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoCosteo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCosteo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoCosteo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoCosteo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoCosteo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoCosteo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoCosteo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoCosteo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCosteo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoCosteo.setToolTipText(this.jTableDatosTipoCosteo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoCosteo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoCosteo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoCosteoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoCosteoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoCosteo() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosParametroInventarioDefecto && this.tipocosteoConstantesFunciones.mostrarParametroInventarioDefectoTipoCosteo && !TipoCosteoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parametro Inventario Defecto");
			reporte.setsDescripcion("Parametro Inventario Defecto");
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
	
		
	public void inicializarCombosForeignKeyTipoCosteoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoCosteoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoCosteoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoCosteoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoCosteoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoCosteo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoCosteo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoCosteo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoCosteo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCosteo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoCosteo(TipoCosteo tipocosteo)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoCosteo(TipoCosteo tipocosteo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoCosteo()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCosteo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoCosteo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoCosteo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoCosteo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoCosteo()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoCosteo(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoCosteo()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoCosteoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoCosteoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoCosteoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocosteoSessionBean=new TipoCosteoSessionBean(); 
		this.tipocosteoConstantesFunciones=new TipoCosteoConstantesFunciones(); 
		this.tipocosteoBean=new TipoCosteo();//(this.tipocosteoConstantesFunciones); 		
		this.tipocosteoReturnGeneral=new TipoCosteoParameterReturnGeneral(); 
		
		this.tipocosteoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocosteoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoCosteoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoCosteoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoCosteoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoCosteo(true);
			
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
			
			this.tipocosteoConstantesFunciones=new TipoCosteoConstantesFunciones(); 
			this.tipocosteoBean=new TipoCosteo();//this.tipocosteoConstantesFunciones); 			
			this.tipocosteoReturnGeneral=new TipoCosteoParameterReturnGeneral(); 
		
			TipoCosteoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Costeo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipocosteo=new TipoCosteo();
			this.tipocosteos = new ArrayList<TipoCosteo>();
			this.tipocosteosAux = new ArrayList<TipoCosteo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic=new TipoCosteoLogic();
				this.tipocosteoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocosteoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocosteoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoCosteo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoCosteo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCosteo);	
					}
					
					if(this.jInternalFrameImportacionTipoCosteo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCosteo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoCosteo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoCosteo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoCosteo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCosteo);
				this.jInternalFrameDetalleFormTipoCosteo.setVisible(false);
				this.jInternalFrameDetalleFormTipoCosteo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoCosteo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCosteo);
					this.jInternalFrameReporteDinamicoTipoCosteo.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoCosteo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoCosteo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoCosteo);
					this.jInternalFrameImportacionTipoCosteo.setVisible(false);
					this.jInternalFrameImportacionTipoCosteo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoCosteo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoCosteo);
					this.jInternalFrameOrderByTipoCosteo.setVisible(false);
					this.jInternalFrameOrderByTipoCosteo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoCosteoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoCosteoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocosteoReturnGeneral=new TipoCosteoParameterReturnGeneral();
			
			this.tipocosteoParameterGeneral=new TipoCosteoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocosteoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoCosteoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCosteoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocosteoSessionBean.getEsGuardarRelacionado(),this.tipocosteoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCosteoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocosteoSessionBean.getEsGuardarRelacionado(),this.tipocosteoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoCosteo=false;
			this.isVisibilidadCeldaDuplicarTipoCosteo=true;
			this.isVisibilidadCeldaCopiarTipoCosteo=true;
			this.isVisibilidadCeldaVerFormTipoCosteo=true;
			this.isVisibilidadCeldaOrdenTipoCosteo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteo=false;
			this.isVisibilidadCeldaModificarTipoCosteo=false;
			this.isVisibilidadCeldaActualizarTipoCosteo=false;
			this.isVisibilidadCeldaEliminarTipoCosteo=false;
			this.isVisibilidadCeldaCancelarTipoCosteo=false;
			this.isVisibilidadCeldaGuardarTipoCosteo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCosteo=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoCosteo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoCosteo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoCosteo(false);
			
			this.setPermisosUsuarioTipoCosteo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocosteoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocosteoSessionBean.getEsGuardarRelacionado() && this.tipocosteoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoCosteoClasesRelacionadas();
			}
			
			if(this.tipocosteoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoCosteoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoCosteoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoCosteo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoCosteo();
			}
			
			if(!this.isPermisoBusquedaTipoCosteo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoCosteo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocosteoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoCosteo,this.isPermisoPaginacionMedioTipoCosteo,this.isPermisoPaginacionTodoTipoCosteo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoCosteoConstantesFunciones.getTiposSeleccionarTipoCosteo());
				
				this.tiposColumnasSelect=TipoCosteoConstantesFunciones.getTiposSeleccionarTipoCosteo(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoCosteo();				
				//this.tiposRelacionesSelect=TipoCosteoConstantesFunciones.getTiposRelacionesTipoCosteo(true);
				
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
			//if(!this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoCosteo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoCosteo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoCosteo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCosteo() ;
			
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
			
			
			this.parametroinventariodefectoLogic=new ParametroInventarioDefectoLogic(); 
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
				tipocosteoImplementable= (TipoCosteoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCosteoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocosteoImplementableHome= (TipoCosteoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCosteoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocosteos= new ArrayList<TipoCosteo>();
			this.tipocosteosEliminados= new ArrayList<TipoCosteo>();
						
			this.isEsNuevoTipoCosteo=false;
			this.esParaAccionDesdeFormularioTipoCosteo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoCosteo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoCosteo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoCosteoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoCosteo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoCosteo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoCosteo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoCosteo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoCosteo();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoCosteo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoCosteo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoCosteo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoCosteo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoCosteo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoCosteo() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoCosteo")) {
				iIndex=this.jInternalFrameDetalleFormTipoCosteo.jTabbedPaneRelacionesTipoCosteo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoCosteo.jTabbedPaneRelacionesTipoCosteo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoCosteo.getSelectedRow();	
				
				

				if(sTitle.equals("Parametro Inventario Defectos")) {
					if(!ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoCosteo();

						this.cargarParteTabPanelRelacionadaParametroInventarioDefecto(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoCosteo();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaParametroInventarioDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoCosteo.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(false,true,iIndex);
		this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();

		//this.jTabbedPaneRelacionesTipoCosteo.updateUI();
		//this.jTabbedPaneRelacionesTipoCosteo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoCosteo.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ParametroInventarioDefecto")) {
				int row=this.jTableDatosTipoCosteo.getSelectedRow();
				jButtonParametroInventarioDefectoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Parametro Inventario Defecto")) {

					if(this.isTienePermisosParametroInventarioDefecto && this.tipocosteoConstantesFunciones.mostrarParametroInventarioDefectoTipoCosteo && !TipoCosteoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Inventario Defectos"+"("+ParametroInventarioDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Inventario Defectos");

						if(tipocosteoConstantesFunciones.resaltarParametroInventarioDefectoTipoCosteo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipocosteoConstantesFunciones.resaltarParametroInventarioDefectoTipoCosteo);
						}

						jmenuItem.setEnabled(this.tipocosteoConstantesFunciones.activarParametroInventarioDefectoTipoCosteo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroInventarioDefecto"));

						

						this.jInternalFrameDetalleFormTipoCosteo.jmenuDetalleTipoCosteo.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoCosteo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoCosteo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoCosteo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoCosteoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoCosteo();
		
		this.cargarCombosFrameForeignKeyTipoCosteo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoCosteo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoCosteo();
		}
	}
	
	
	
	public void jButtonNuevoTipoCosteoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocosteoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoCosteo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
			
			
			if(jTableDatosTipoCosteo.getRowCount()>=1) {
				jTableDatosTipoCosteo.removeRowSelectionInterval(0, jTableDatosTipoCosteo.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoCosteo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoCosteo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoCosteo(true);			
			//this.tipocosteo=new TipoCosteo();
			//this.tipocosteo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCosteo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCosteo() ;
			
			if(TipoCosteoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCosteo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocosteo);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocosteo);				
			
			TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
			
			if(this.tipocosteoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoCosteo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoCosteoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoCosteo> tipocosteosSeleccionados=new ArrayList<TipoCosteo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoCosteo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoCosteo.getSelectedRows().length;			
			}
			
			tipocosteosSeleccionados=this.getTipoCosteosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoCosteo--;			
				//TipoCosteo tipocosteoAux= new TipoCosteo();			
				//tipocosteoAux.setId(this.iIdNuevoTipoCosteo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoCosteo tipocosteoOrigen=new TipoCosteo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoCosteo tipocosteoOrigen : tipocosteosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoCosteo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocosteoOrigen =(TipoCosteo) this.tipocosteoLogic.getTipoCosteos().toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocosteoOrigen =(TipoCosteo) this.tipocosteos.toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoCosteo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocosteo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoCosteo(tipocosteoOrigen,this.tipocosteo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteo(this.tipocosteo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocosteoLogic.getTipoCosteos().add(this.tipocosteoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocosteos.add(this.tipocosteoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoCosteo(false);
				
				this.jTableDatosTipoCosteo.setRowSelectionInterval(this.getIndiceNuevoTipoCosteo(), this.getIndiceNuevoTipoCosteo());
				
				int iLastRow =  this.jTableDatosTipoCosteo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCosteo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCosteo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCosteo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoCosteoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoCosteo> tipocosteosSeleccionados=new ArrayList<TipoCosteo>();									
		
			TipoCosteo tipocosteoOrigen=new TipoCosteo();
			TipoCosteo tipocosteoDestino=new TipoCosteo();
				
			tipocosteosSeleccionados=this.getTipoCosteosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoCosteo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocosteosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoCosteo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocosteoOrigen =(TipoCosteo) this.tipocosteoLogic.getTipoCosteos().toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocosteoOrigen =(TipoCosteo) this.tipocosteos.toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocosteoDestino =(TipoCosteo) this.tipocosteoLogic.getTipoCosteos().toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocosteoDestino =(TipoCosteo) this.tipocosteos.toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocosteoOrigen =tipocosteosSeleccionados.get(0);
				tipocosteoDestino =tipocosteosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoCosteo(tipocosteoOrigen,tipocosteoDestino,true,false);
				
				tipocosteoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocosteoDestino,tipocosteoLogic.getTipoCosteos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocosteoDestino,tipocosteos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoCosteo(false);
				
				//this.jTableDatosTipoCosteo.setRowSelectionInterval(this.getIndiceNuevoTipoCosteo(), this.getIndiceNuevoTipoCosteo());
				
				int iLastRow =  this.jTableDatosTipoCosteo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCosteo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCosteo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCosteo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoCosteoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCosteo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoCosteo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoCosteoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoCosteo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoCosteo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoCosteo.setVisible(!isVisible);
			this.jPanelPaginacionTipoCosteo.setVisible(!isVisible);
			this.jPanelAccionesTipoCosteo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoCosteoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoCosteo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoCosteoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoCosteo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoCosteoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoCosteo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoCosteoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoCosteo();
			
			this.abrirFrameOrderByTipoCosteo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoCosteoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoCosteo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoCosteo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCosteo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoCosteo.isMaximum()) {
					this.jInternalFrameDetalleFormTipoCosteo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoCosteo.setSize(this.jInternalFrameDetalleFormTipoCosteo.iWidthFormulario,this.jInternalFrameDetalleFormTipoCosteo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoCosteo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoCosteo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoCosteo.isMaximum()) {
						this.jInternalFrameDetalleFormTipoCosteo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoCosteo.jContentPaneDetalleTipoCosteo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoCosteo.jTabbedPaneRelacionesTipoCosteo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoCosteo.jContentPaneDetalleTipoCosteo.getWidth(),TipoCosteoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCosteo.jTabbedPaneRelacionesTipoCosteo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoCosteo.jContentPaneDetalleTipoCosteo.getWidth(),TipoCosteoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCosteo.jTabbedPaneRelacionesTipoCosteo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoCosteo.jContentPaneDetalleTipoCosteo.getWidth(),TipoCosteoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoCosteo.setVisible(true);
	        this.jInternalFrameDetalleFormTipoCosteo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoCosteo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoCosteo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoCosteo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCosteo,false,this);
				} else {
					this.jInternalFrameOrderByTipoCosteo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCosteo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoCosteo);
				this.jInternalFrameOrderByTipoCosteo.setVisible(false);
				this.jInternalFrameOrderByTipoCosteo.setSelected(false);
				
				this.jInternalFrameOrderByTipoCosteo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCosteo"));
				
				this.inicializarActualizarBindingTablaOrderByTipoCosteo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoCosteo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoCosteo==null) {
				
				this.jInternalFrameImportacionTipoCosteo=new ImportacionJInternalFrame(TipoCosteoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCosteo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoCosteo);
				this.jInternalFrameImportacionTipoCosteo.setVisible(false);
				this.jInternalFrameImportacionTipoCosteo.setSelected(false);


				this.jInternalFrameImportacionTipoCosteo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCosteo"));
				this.jInternalFrameImportacionTipoCosteo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCosteo"));
				this.jInternalFrameImportacionTipoCosteo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCosteo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoCosteo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoCosteo==null) {
				this.jInternalFrameReporteDinamicoTipoCosteo=new ReporteDinamicoJInternalFrame(TipoCosteoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCosteo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCosteo);
				this.jInternalFrameReporteDinamicoTipoCosteo.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoCosteo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoCosteo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCosteo"));
				this.jInternalFrameReporteDinamicoTipoCosteo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCosteo"));
				this.jInternalFrameReporteDinamicoTipoCosteo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCosteo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCosteo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaParametroInventarioDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoCosteo.jContentPaneDetalleTipoCosteo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoCosteo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCosteo);
			
	       	this.jInternalFrameDetalleFormTipoCosteo.setVisible(false);
	        this.jInternalFrameDetalleFormTipoCosteo.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoCosteo.dispose();
			//this.jInternalFrameDetalleFormTipoCosteo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoCosteo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoCosteo.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoCosteo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoCosteo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoCosteo.setVisible(true);
	        this.jInternalFrameImportacionTipoCosteo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoCosteo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoCosteo.setVisible(true);
	        this.jInternalFrameOrderByTipoCosteo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoCosteo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoCosteo.setVisible(false);
	        this.jInternalFrameOrderByTipoCosteo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoCosteo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoCosteo.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoCosteo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoCosteo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoCosteo.setVisible(false);
	        this.jInternalFrameImportacionTipoCosteo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoCosteoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoCosteo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoCosteo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCosteo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoCosteo(true);
			//this.isEsNuevoTipoCosteo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteo =(TipoCosteo) this.tipocosteoLogic.getTipoCosteos().toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocosteo =(TipoCosteo) this.tipocosteos.toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoCosteo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCosteo(false) ;
			
			if(tipocosteoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoCosteoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCosteo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCosteo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoCosteoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoCosteo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteo =(TipoCosteo) this.tipocosteoLogic.getTipoCosteos().toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocosteo =(TipoCosteo) this.tipocosteos.toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoCosteo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCosteo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCosteo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoCosteo(true);
			//this.isEsNuevoTipoCosteo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteo =(TipoCosteo) this.tipocosteoLogic.getTipoCosteos().toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocosteo =(TipoCosteo) this.tipocosteos.toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocosteo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoCosteo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoCosteo(false) ;
			
			if(TipoCosteoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCosteo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCosteo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoCosteoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoCosteo(false);
			
			//if(!this.isEsNuevoTipoCosteo) {								
				int intSelectedRow = this.jTableDatosTipoCosteo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteo =(TipoCosteo) this.tipocosteoLogic.getTipoCosteos().toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocosteo =(TipoCosteo) this.tipocosteos.toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoCosteoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoCosteo(this.tipocosteo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteo(this.tipocosteo);
				
			}
			
			if(this.permiteMantenimiento(this.tipocosteo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoCosteo=true;
					this.inicializarActualizarBindingTablaTipoCosteo(false);
					this.isEsNuevoTipoCosteo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoCosteo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoCosteo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCosteo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCosteo(false);
				
				this.habilitarDeshabilitarControlesTipoCosteo(false);
			
												
				
				if(TipoCosteoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoCosteo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoCosteoActionPerformed(evt,tipocosteoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoCosteo(this.tipocosteo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoCosteo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocosteoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocosteo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoCosteo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosteo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoCosteoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoCosteo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteo =(TipoCosteo) this.tipocosteoLogic.getTipoCosteos().toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
				this.tipocosteo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocosteo =(TipoCosteo) this.tipocosteos.toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
				this.tipocosteo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocosteo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoCosteoModel) this.jTableDatosTipoCosteo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoCosteo=true;
				this.inicializarActualizarBindingTablaTipoCosteo(false);
				this.isEsNuevoTipoCosteo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCosteo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCosteo(false);
				
				this.habilitarDeshabilitarControlesTipoCosteo(false);
				
				
				
				if(TipoCosteoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoCosteo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoCosteoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoCosteo.getRowCount()>=1) {
				jTableDatosTipoCosteo.removeRowSelectionInterval(0, jTableDatosTipoCosteo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoCosteo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoCosteo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCosteo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCosteo(false) ;
			
			this.isEsNuevoTipoCosteo=false;
			
			if(TipoCosteoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoCosteo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoCosteoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoCosteo(false);
				
				//SI ES MANUAL
				if(TipoCosteoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoCosteo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoCosteoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoCosteo--;			
			//TipoCosteo tipocosteoAux= new TipoCosteo();			
			//tipocosteoAux.setId(this.iIdNuevoTipoCosteo);
			
			if(this.jInternalFrameDetalleFormTipoCosteo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoCosteo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteo(this.tipocosteo);
			
			this.tipocosteo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocosteoLogic.getTipoCosteos().add(this.tipocosteoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocosteos.add(this.tipocosteoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoCosteo(false);
			
			this.jTableDatosTipoCosteo.setRowSelectionInterval(this.getIndiceNuevoTipoCosteo(), this.getIndiceNuevoTipoCosteo());
			
			int iLastRow =  this.jTableDatosTipoCosteo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoCosteo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoCosteo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoCosteo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoCosteoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoCosteo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCosteo(false);
			
			//SI ES MANUAL
			if(TipoCosteoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCosteo();
			}
			
			//this.abrirFrameTreeTipoCosteo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoCosteoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo CosteoS ?", "MANTENIMIENTO DE Tipo Costeo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoCosteo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoCosteo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocosteoReturnGeneral=tipocosteoLogic.procesarImportacionTipoCosteosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocosteoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoCosteoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoCosteoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoCosteo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoCosteo.setFileImportacion(this.jInternalFrameImportacionTipoCosteo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoCosteo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoCosteo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoCosteo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoCosteo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoCosteoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoCosteo> tipocosteosSeleccionados=new ArrayList<TipoCosteo>();		

		tipocosteosSeleccionados=this.getTipoCosteosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCosteo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCosteo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoCosteoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoCosteoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoCosteos("Todos",tipocosteosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocosteoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costeo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCosteo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCosteo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCosteoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoCosteo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCosteo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCosteo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoCosteoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoCosteo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoCosteoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoCosteo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCosteo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCosteoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoCosteoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoCosteo> tipocosteosSeleccionados=new ArrayList<TipoCosteo>();		
		
		tipocosteosSeleccionados=this.getTipoCosteosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocosteo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoCosteos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoCosteo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCosteo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoCosteoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCosteoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoCosteo tipocosteo:tipocosteosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocosteo.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoCosteo(row);				
			//	iRow++;
			//}				
			
			//for(TipoCosteo tipocosteoAux:tipocosteosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoCosteo(tipocosteoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocosteoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costeo",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocosteoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCosteo(false);
			
			//SI ES MANUAL
			if(TipoCosteoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCosteo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoCosteoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCosteo(false);
			
			//SI ES MANUAL
			if(TipoCosteoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCosteo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoCosteoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCosteo(false);
			
			//SI ES MANUAL
			if(TipoCosteoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCosteo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoCosteo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoCosteo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoCosteo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoCosteo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoCosteo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoCosteo.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoCosteo.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoCosteo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoCosteo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoCosteo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoCosteo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoCosteo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoCosteo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoCosteo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCosteo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoCosteo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoCosteoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoCosteoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoCosteo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoCosteo();
		
		this.inicializarActualizarBindingBotonesManualTipoCosteo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCosteo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCosteo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCosteo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCosteo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoCosteo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoCosteo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoCosteo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoCosteo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoCosteo.jCheckBoxPostAccionNuevoTipoCosteo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoCosteo.jCheckBoxPostAccionSinCerrarTipoCosteo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoCosteo.jCheckBoxPostAccionSinMensajeTipoCosteo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoCosteo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoCosteo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoCosteo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoCosteo!=null) {
				this.jInternalFrameDetalleFormTipoCosteo.jCheckBoxPostAccionNuevoTipoCosteo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoCosteo.jCheckBoxPostAccionSinCerrarTipoCosteo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoCosteo.jCheckBoxPostAccionSinMensajeTipoCosteo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoCosteo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoCosteo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoCosteo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoCosteo.jComboBoxTiposAccionesFormularioTipoCosteo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoCosteo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoCosteo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCosteo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoCosteo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoCosteo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoCosteo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoCosteo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoCosteo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCosteo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoCosteo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoCosteo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoCosteo(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoCosteoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCosteo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoCosteo() throws Exception {
		try	{
			if(TipoCosteoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCosteo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCosteo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoCosteo.jComboBoxTiposAccionesFormularioTipoCosteo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoCosteo.jComboBoxTiposAccionesFormularioTipoCosteo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCosteo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoCosteo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoCosteo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoCosteo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoCosteo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoCosteo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoCosteo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoCosteo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoCosteo.addItem(reporte);
			}
			
			
			if(!this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoCosteo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoCosteo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoCosteo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoCosteo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoCosteo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoCosteo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoCosteo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoCosteo.jComboBoxTiposAccionesFormularioTipoCosteo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoCosteo.jComboBoxTiposAccionesFormularioTipoCosteo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoCosteo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoCosteo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoCosteo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCosteo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCosteo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCosteo!=null) {
				this.jInternalFrameReporteDinamicoTipoCosteo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCosteo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCosteo!=null) {
				this.jInternalFrameReporteDinamicoTipoCosteo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCosteo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoCosteo!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoCosteo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCosteo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCosteo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoCosteo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCosteo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCosteo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoCosteo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoCosteo.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoCosteo(Boolean esInicializar) throws Exception {				
		if(TipoCosteoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCosteo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoCosteo() throws Exception {
		this.inicializarActualizarBindingTablaTipoCosteo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoCosteo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoCosteo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoCosteo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCosteo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoCosteoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoCosteo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCosteo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoCosteoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoCosteoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCosteoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoCosteoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoCosteo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCosteo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoCosteoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoCosteo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoCosteo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocosteoLogic.getTipoCosteos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocosteos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoCosteoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoCosteo.setModel(new TipoCosteoModel(this.tipocosteoLogic.getTipoCosteos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoCosteo.setModel(new TipoCosteoModel(this.tipocosteos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoCosteo!=null && this.jInternalFrameOrderByTipoCosteo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoCosteo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoCosteo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCosteo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoCosteoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO,tipocosteoConstantesFunciones.resaltarSeleccionarTipoCosteo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoCosteoConstantesFunciones.SCLASSWEBTITULO,tipocosteoConstantesFunciones.resaltarSeleccionarTipoCosteo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoCosteo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCosteo,TipoCosteoConstantesFunciones.LABEL_ID));

		if(this.tipocosteoConstantesFunciones.mostraridTipoCosteo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCosteoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocosteoConstantesFunciones.resaltaridTipoCosteo,this.tipocosteoConstantesFunciones.activaridTipoCosteo,this,true,"idTipoCosteo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocosteoConstantesFunciones.resaltaridTipoCosteo,this.tipocosteoConstantesFunciones.activaridTipoCosteo,this,true,"idTipoCosteo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCosteo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCosteo,TipoCosteoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipocosteoConstantesFunciones.mostrarnombreTipoCosteo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCosteoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocosteoConstantesFunciones.resaltarnombreTipoCosteo,this.tipocosteoConstantesFunciones.activarnombreTipoCosteo,this,true,"nombreTipoCosteo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocosteoConstantesFunciones.resaltarnombreTipoCosteo,this.tipocosteoConstantesFunciones.activarnombreTipoCosteo,this,true,"nombreTipoCosteo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCosteoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocosteoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosParametroInventarioDefecto && this.tipocosteoConstantesFunciones.mostrarParametroInventarioDefectoTipoCosteo && !TipoCosteoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Inventario Defectos");
				tableColumn.setHeaderValue("Parametro Inventario Defectos");
				tableColumn.setCellRenderer(new ParametroInventarioDefectoTableCell(tipocosteoConstantesFunciones.resaltarParametroInventarioDefectoTipoCosteo,this,this.tipocosteoConstantesFunciones.activarParametroInventarioDefectoTipoCosteo));
				tableColumn.setCellEditor(new ParametroInventarioDefectoTableCell(tipocosteoConstantesFunciones.resaltarParametroInventarioDefectoTipoCosteo,this,this.tipocosteoConstantesFunciones.activarParametroInventarioDefectoTipoCosteo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoCosteo.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocosteoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocosteoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCosteo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocosteoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocosteoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCosteo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoCosteo && this.isPermisoGuardarCambiosTipoCosteo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocosteoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocosteoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoCosteo.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipocosteoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoCosteo.addColumn(tableColumn);
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
			
			this.jTableDatosTipoCosteo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCosteo && this.isPermisoGuardarCambiosTipoCosteo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocosteoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCosteo && this.isPermisoGuardarCambiosTipoCosteo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoCosteo.moveColumn(this.jTableDatosTipoCosteo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoCosteo.moveColumn(this.jTableDatosTipoCosteo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocosteoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoCosteo.moveColumn(this.jTableDatosTipoCosteo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoCosteo.moveColumn(this.jTableDatosTipoCosteo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoCosteo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoCosteo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoCosteo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoCosteoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoCosteo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoCosteo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoCosteoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoCosteoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoCosteo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoCosteo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoCosteo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocosteoLogic.getTipoCosteos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocosteos.size()-1;
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
		//this.jTableDatosTipoCosteo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoCosteo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoCosteo();
			
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
				
				//this.isEsNuevoTipoCosteo=false;
					
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
			
				if(this.tipocosteoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoCosteo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCosteo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCosteo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteo =(TipoCosteo) this.tipocosteoLogic.getTipoCosteos().toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocosteo =(TipoCosteo) this.tipocosteos.toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocosteo.getsType().equals("DUPLICADO")
				   || this.tipocosteo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoCosteo=true;
				
				} else {
					this.isEsNuevoTipoCosteo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocosteo.getId()>=0 && !this.tipocosteo.getIsNew()) {						
						this.isEsNuevoTipoCosteo=false;
						
					} else {
						this.isEsNuevoTipoCosteo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoCosteo(esRelaciones);						
				
				this.seleccionarTipoCosteo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocosteo.getId()<0) {
					this.isEsNuevoTipoCosteo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoCosteo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoCosteo(evt,rowIndex);
				}	
				
				if(this.tipocosteoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoCosteo: " + this.dDif); 
					}
				}								
				
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoCosteo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocosteo)) {
					if(this.tipocosteo.getId()>0) {
						this.tipocosteo.setIsDeleted(true);
						
						this.tipocosteosEliminados.add(this.tipocosteo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocosteoLogic.getTipoCosteos().remove(this.tipocosteo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocosteos.remove(this.tipocosteo);				
					}
					
					
					((TipoCosteoModel) this.jTableDatosTipoCosteo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCosteo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoCosteo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoCosteo) {
			
			if(this.jInternalFrameDetalleFormTipoCosteo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCosteo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCosteo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteo =(TipoCosteo) this.tipocosteoLogic.getTipoCosteos().toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocosteo =(TipoCosteo) this.tipocosteos.toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoCosteoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoCosteo(this.tipocosteo);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoCosteo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoCosteo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCosteo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCosteo(TipoCosteo tipocosteo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoCosteo(tipocosteo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCosteo(TipoCosteo tipocosteo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoCosteo(tipocosteo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoCosteo(tipocosteo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoCosteo(tipocosteo);
	}
	
	public void setVariablesObjetoActualToFormularioTipoCosteo(TipoCosteo tipocosteo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoCosteo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoCosteo.jTextFieldidTipoCosteo.setText(tipocosteo.getId().toString());
			this.jInternalFrameDetalleFormTipoCosteo.jTextAreanombreTipoCosteo.setText(tipocosteo.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoCosteo tipocosteoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocosteoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoCosteo tipocosteoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocosteoLocal=this.tipocosteo;
			} else {
				tipocosteoLocal=this.tipocosteoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocosteoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoCosteo(tipocosteoLocal,true);
					
					if(tipocosteoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocosteoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocosteoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoCosteo(TipoCosteo tipocosteo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCosteo(tipocosteo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteo(tipocosteo);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCosteo(TipoCosteo tipocosteo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCosteo(tipocosteo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCosteo(TipoCosteo tipocosteo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoCosteo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoCosteo.jTextFieldidTipoCosteo.getText()==null || this.jInternalFrameDetalleFormTipoCosteo.jTextFieldidTipoCosteo.getText()=="" || this.jInternalFrameDetalleFormTipoCosteo.jTextFieldidTipoCosteo.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoCosteo.jTextFieldidTipoCosteo.setText("0");
			}

			if(conColumnasBase) {tipocosteo.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoCosteo.jTextFieldidTipoCosteo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCosteoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCosteo.jLabelIdTipoCosteo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocosteo.setnombre(this.jInternalFrameDetalleFormTipoCosteo.jTextAreanombreTipoCosteo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCosteoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCosteo.jLabelnombreTipoCosteo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCosteo(TipoCosteo tipocosteoBean,TipoCosteo tipocosteo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoCosteo(TipoCosteo tipocosteoOrigen,TipoCosteo tipocosteo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocosteoOrigen.getId()!=null && !tipocosteoOrigen.getId().equals(0L))) {tipocosteo.setId(tipocosteoOrigen.getId());}}
			if(conDefault || (!conDefault && tipocosteoOrigen.getnombre()!=null && !tipocosteoOrigen.getnombre().equals(""))) {tipocosteo.setnombre(tipocosteoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCosteo(TipoCosteo tipocosteo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCosteo.jTextFieldidTipoCosteo.setText(tipocosteo.getId().toString());
			this.jInternalFrameDetalleFormTipoCosteo.jTextAreanombreTipoCosteo.setText(tipocosteo.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCosteo(TipoCosteoBean tipocosteoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCosteo.jTextFieldidTipoCosteo.setText(tipocosteoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoCosteo.jTextAreanombreTipoCosteo.setText(tipocosteoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoCosteo(TipoCosteoParameterReturnGeneral tipocosteoReturnGeneral,TipoCosteoBean tipocosteoBean,Boolean conDefault) throws Exception { 
		try {
			TipoCosteo tipocosteoLocal=new TipoCosteo();
			
			tipocosteoLocal=tipocosteoReturnGeneral.getTipoCosteo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocosteoLocal.getId()!=null && !tipocosteoLocal.getId().equals(0L))) {tipocosteoBean.setId(tipocosteoLocal.getId());}}
			if(conDefault || (!conDefault && tipocosteoLocal.getnombre()!=null && !tipocosteoLocal.getnombre().equals(""))) {tipocosteoBean.setnombre(tipocosteoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoCosteoGenerico(Long idTipoCosteoSeleccionado,JComboBox jComboBoxTipoCosteo,List<TipoCosteo> tipocosteosLocal)throws Exception {
		try {
			TipoCosteo  tipocosteoTemp=null;

			for(TipoCosteo tipocosteoAux:tipocosteosLocal) {
				if(tipocosteoAux.getId()!=null && tipocosteoAux.getId().equals(idTipoCosteoSeleccionado)) {
					tipocosteoTemp=tipocosteoAux;
					break;
				}
			}

			jComboBoxTipoCosteo.setSelectedItem(tipocosteoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoCosteoGenerico(JComboBox jComboBoxTipoCosteo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoCosteo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCosteo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoCosteo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCosteo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCosteo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoCosteo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCosteo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoCosteo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoCosteo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoCosteo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ParametroInventarioDefecto")) {
			jButtonParametroInventarioDefectoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocosteo=(TipoCosteo) tipocosteoLogic.getTipoCosteos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocosteo =(TipoCosteo) tipocosteos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoCosteo tipocosteoRow=new TipoCosteo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocosteoRow=(TipoCosteo) tipocosteoLogic.getTipoCosteos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocosteoRow=(TipoCosteo) tipocosteos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonParametroInventarioDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoCosteo tipocosteo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoCosteo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocosteo = (TipoCosteo)this.tipocosteoLogic.getTipoCosteos().toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipocosteo = (TipoCosteo)this.tipocosteos.toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipocosteo!=null) {
						this.tipocosteo = tipocosteo;
					} else {
						this.tipocosteo = new TipoCosteo();
					}
				}

				if(this.isTienePermisosParametroInventarioDefecto && this.permiteMantenimiento(this.tipocosteo)) {
					ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFramePopup=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFramePopup;
					} else {
						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame;
					}

					List<TipoCosteo> tipocosteos=new ArrayList<TipoCosteo>();
					tipocosteos.add(this.tipocosteo);
					if(!esRelacionado) {
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setConGuardarRelaciones(false);
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoCosteo.cargarParametroInventarioDefectoBeanSwingJInternalFrame(tipocosteos,this.tipocosteo,parametroinventariodefectoBeanSwingJInternalFrame,/*conInicializar,*/parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getConGuardarRelaciones(),parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("no_relacionado");

						parametroinventariodefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametroinventariodefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoCosteo=(TitledBorder)this.jScrollPanelDatosTipoCosteo.getBorder();
						TitledBorder titledBorderParametroInventarioDefecto=(TitledBorder)parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getBorder();

						titledBorderParametroInventarioDefecto.setTitle(titledBorderTipoCosteo.getTitle() + " -> Parametro Inventario Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametroinventariodefectoBeanSwingJInternalFrame);
						}

						parametroinventariodefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametroinventariodefectoBeanSwingJInternalFrame);

						parametroinventariodefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipocosteoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Inventario Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoCosteo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoCosteo.setVisible((this.isVisibilidadCeldaNuevoTipoCosteo && this.isPermisoNuevoTipoCosteo));			
			this.jButtonDuplicarTipoCosteo.setVisible((this.isVisibilidadCeldaDuplicarTipoCosteo && this.isPermisoDuplicarTipoCosteo));			
			this.jButtonCopiarTipoCosteo.setVisible((this.isVisibilidadCeldaCopiarTipoCosteo && this.isPermisoCopiarTipoCosteo));
			this.jButtonVerFormTipoCosteo.setVisible((this.isVisibilidadCeldaVerFormTipoCosteo && this.isPermisoVerFormTipoCosteo));
			
			this.jButtonAbrirOrderByTipoCosteo.setVisible((this.isVisibilidadCeldaOrdenTipoCosteo && this.isPermisoOrdenTipoCosteo));			
			
			this.jButtonNuevoRelacionesTipoCosteo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCosteo && this.isPermisoNuevoTipoCosteo));			
			this.jButtonNuevoGuardarCambiosTipoCosteo.setVisible((this.isVisibilidadCeldaNuevoTipoCosteo && this.isPermisoNuevoTipoCosteo && this.isPermisoGuardarCambiosTipoCosteo));
			
			if(this.jInternalFrameDetalleFormTipoCosteo!=null) {
			this.jInternalFrameDetalleFormTipoCosteo.jButtonModificarTipoCosteo.setVisible((this.isVisibilidadCeldaModificarTipoCosteo && this.isPermisoActualizarTipoCosteo));	
			this.jInternalFrameDetalleFormTipoCosteo.jButtonActualizarTipoCosteo.setVisible((this.isVisibilidadCeldaActualizarTipoCosteo && this.isPermisoActualizarTipoCosteo));	
			this.jInternalFrameDetalleFormTipoCosteo.jButtonEliminarTipoCosteo.setVisible((this.isVisibilidadCeldaEliminarTipoCosteo && this.isPermisoEliminarTipoCosteo));
			this.jInternalFrameDetalleFormTipoCosteo.jButtonCancelarTipoCosteo.setVisible(this.isVisibilidadCeldaCancelarTipoCosteo);							
			this.jInternalFrameDetalleFormTipoCosteo.jButtonGuardarCambiosTipoCosteo.setVisible((this.isVisibilidadCeldaGuardarTipoCosteo && this.isPermisoGuardarCambiosTipoCosteo));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoCosteo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCosteo && this.isPermisoGuardarCambiosTipoCosteo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoCosteo.setVisible((this.isVisibilidadCeldaNuevoTipoCosteo && this.isPermisoNuevoTipoCosteo));						
			this.jButtonDuplicarToolBarTipoCosteo.setVisible((this.isVisibilidadCeldaDuplicarTipoCosteo && this.isPermisoDuplicarTipoCosteo));						
			this.jButtonCopiarToolBarTipoCosteo.setVisible((this.isVisibilidadCeldaCopiarTipoCosteo && this.isPermisoCopiarTipoCosteo));			
			this.jButtonVerFormToolBarTipoCosteo.setVisible((this.isVisibilidadCeldaVerFormTipoCosteo && this.isPermisoVerFormTipoCosteo));			
			this.jButtonAbrirOrderByToolBarTipoCosteo.setVisible((this.isVisibilidadCeldaOrdenTipoCosteo && this.isPermisoOrdenTipoCosteo));
			this.jButtonNuevoRelacionesToolBarTipoCosteo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCosteo && this.isPermisoNuevoTipoCosteo));			
			this.jButtonNuevoGuardarCambiosToolBarTipoCosteo.setVisible((this.isVisibilidadCeldaNuevoTipoCosteo && this.isPermisoNuevoTipoCosteo && this.isPermisoGuardarCambiosTipoCosteo));			
			
			if(this.jInternalFrameDetalleFormTipoCosteo!=null) {
			this.jInternalFrameDetalleFormTipoCosteo.jButtonModificarToolBarTipoCosteo.setVisible((this.isVisibilidadCeldaModificarTipoCosteo && this.isPermisoActualizarTipoCosteo));	
			this.jInternalFrameDetalleFormTipoCosteo.jButtonActualizarToolBarTipoCosteo.setVisible((this.isVisibilidadCeldaActualizarTipoCosteo  && this.isPermisoActualizarTipoCosteo));	
			this.jInternalFrameDetalleFormTipoCosteo.jButtonEliminarToolBarTipoCosteo.setVisible((this.isVisibilidadCeldaEliminarTipoCosteo && this.isPermisoEliminarTipoCosteo));
			this.jInternalFrameDetalleFormTipoCosteo.jButtonCancelarToolBarTipoCosteo.setVisible(this.isVisibilidadCeldaCancelarTipoCosteo);				
			this.jInternalFrameDetalleFormTipoCosteo.jButtonGuardarCambiosToolBarTipoCosteo.setVisible((this.isVisibilidadCeldaGuardarTipoCosteo && this.isPermisoGuardarCambiosTipoCosteo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoCosteo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCosteo && this.isPermisoGuardarCambiosTipoCosteo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoCosteo.setVisible((this.isVisibilidadCeldaNuevoTipoCosteo && this.isPermisoNuevoTipoCosteo));			
			this.jMenuItemDuplicarTipoCosteo.setVisible((this.isVisibilidadCeldaDuplicarTipoCosteo && this.isPermisoDuplicarTipoCosteo));			
			this.jMenuItemCopiarTipoCosteo.setVisible((this.isVisibilidadCeldaCopiarTipoCosteo && this.isPermisoCopiarTipoCosteo));			
			this.jMenuItemVerFormTipoCosteo.setVisible((this.isVisibilidadCeldaVerFormTipoCosteo && this.isPermisoVerFormTipoCosteo));			
			this.jMenuItemAbrirOrderByTipoCosteo.setVisible((this.isVisibilidadCeldaOrdenTipoCosteo && this.isPermisoOrdenTipoCosteo));			
			//this.jMenuItemMostrarOcultarTipoCosteo.setVisible((this.isVisibilidadCeldaOrdenTipoCosteo && this.isPermisoOrdenTipoCosteo));
			this.jMenuItemDetalleAbrirOrderByTipoCosteo.setVisible((this.isVisibilidadCeldaOrdenTipoCosteo && this.isPermisoOrdenTipoCosteo));			
			//this.jMenuItemDetalleMostrarOcultarTipoCosteo.setVisible((this.isVisibilidadCeldaOrdenTipoCosteo && this.isPermisoOrdenTipoCosteo));			
			this.jMenuItemNuevoRelacionesTipoCosteo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCosteo && this.isPermisoNuevoTipoCosteo));			
			this.jMenuItemNuevoGuardarCambiosTipoCosteo.setVisible((this.isVisibilidadCeldaNuevoTipoCosteo && this.isPermisoNuevoTipoCosteo && this.isPermisoGuardarCambiosTipoCosteo));									
			
			if(this.jInternalFrameDetalleFormTipoCosteo!=null) {
			this.jInternalFrameDetalleFormTipoCosteo.jMenuItemModificarTipoCosteo.setVisible((this.isVisibilidadCeldaModificarTipoCosteo && this.isPermisoActualizarTipoCosteo));	
			this.jInternalFrameDetalleFormTipoCosteo.jMenuItemActualizarTipoCosteo.setVisible((this.isVisibilidadCeldaActualizarTipoCosteo && this.isPermisoActualizarTipoCosteo));	
			this.jInternalFrameDetalleFormTipoCosteo.jMenuItemEliminarTipoCosteo.setVisible((this.isVisibilidadCeldaEliminarTipoCosteo && this.isPermisoEliminarTipoCosteo));
			this.jInternalFrameDetalleFormTipoCosteo.jMenuItemCancelarTipoCosteo.setVisible(this.isVisibilidadCeldaCancelarTipoCosteo);				
			}
			
			this.jMenuItemGuardarCambiosTipoCosteo.setVisible((this.isVisibilidadCeldaGuardarTipoCosteo && this.isPermisoGuardarCambiosTipoCosteo));						
			this.jMenuItemGuardarCambiosTablaTipoCosteo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCosteo && this.isPermisoGuardarCambiosTipoCosteo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoCosteo=this.jButtonNuevoTipoCosteo.isVisible();
			this.isVisibilidadCeldaDuplicarTipoCosteo=this.jButtonDuplicarTipoCosteo.isVisible();
			this.isVisibilidadCeldaCopiarTipoCosteo=this.jButtonCopiarTipoCosteo.isVisible();
			this.isVisibilidadCeldaVerFormTipoCosteo=this.jButtonVerFormTipoCosteo.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoCosteo=this.jButtonAbrirOrderByTipoCosteo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteo=this.jButtonNuevoRelacionesTipoCosteo.isVisible();
			this.isVisibilidadCeldaModificarTipoCosteo=this.jButtonModificarTipoCosteo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCosteo!=null) {
			this.isVisibilidadCeldaActualizarTipoCosteo=this.jInternalFrameDetalleFormTipoCosteo.jButtonActualizarTipoCosteo.isVisible();
			this.isVisibilidadCeldaEliminarTipoCosteo=this.jInternalFrameDetalleFormTipoCosteo.jButtonEliminarTipoCosteo.isVisible();
			this.isVisibilidadCeldaCancelarTipoCosteo=this.jInternalFrameDetalleFormTipoCosteo.jButtonCancelarTipoCosteo.isVisible();
			this.isVisibilidadCeldaGuardarTipoCosteo=this.jInternalFrameDetalleFormTipoCosteo.jButtonGuardarCambiosTipoCosteo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoCosteo=this.jButtonGuardarCambiosTablaTipoCosteo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoCosteo=this.jButtonNuevoToolBarTipoCosteo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteo=this.jButtonNuevoRelacionesToolBarTipoCosteo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCosteo!=null) {
			this.isVisibilidadCeldaModificarTipoCosteo=this.jInternalFrameDetalleFormTipoCosteo.jButtonModificarToolBarTipoCosteo.isVisible();
			this.isVisibilidadCeldaActualizarTipoCosteo=this.jInternalFrameDetalleFormTipoCosteo.jButtonActualizarToolBarTipoCosteo.isVisible();
			this.isVisibilidadCeldaEliminarTipoCosteo=this.jInternalFrameDetalleFormTipoCosteo.jButtonEliminarToolBarTipoCosteo.isVisible();
			this.isVisibilidadCeldaCancelarTipoCosteo=this.jInternalFrameDetalleFormTipoCosteo.jButtonCancelarToolBarTipoCosteo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCosteo=this.jButtonGuardarCambiosToolBarTipoCosteo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCosteo=this.jButtonGuardarCambiosTablaToolBarTipoCosteo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoCosteo=this.jMenuItemNuevoTipoCosteo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteo=this.jMenuItemNuevoRelacionesTipoCosteo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCosteo!=null) {
			this.isVisibilidadCeldaModificarTipoCosteo=this.jInternalFrameDetalleFormTipoCosteo.jMenuItemModificarTipoCosteo.isVisible();
			this.isVisibilidadCeldaActualizarTipoCosteo=this.jInternalFrameDetalleFormTipoCosteo.jMenuItemActualizarTipoCosteo.isVisible();
			this.isVisibilidadCeldaEliminarTipoCosteo=this.jInternalFrameDetalleFormTipoCosteo.jMenuItemEliminarTipoCosteo.isVisible();
			this.isVisibilidadCeldaCancelarTipoCosteo=this.jInternalFrameDetalleFormTipoCosteo.jMenuItemCancelarTipoCosteo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCosteo=this.jMenuItemGuardarCambiosTipoCosteo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCosteo=this.jMenuItemGuardarCambiosTablaTipoCosteo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoCosteo(Boolean esInicializar) {
		if(TipoCosteoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocosteoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCosteo();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoCosteo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoCosteo() {
		this.jButtonNuevoTipoCosteo.setVisible(this.isPermisoNuevoTipoCosteo);			
		this.jButtonDuplicarTipoCosteo.setVisible(this.isPermisoDuplicarTipoCosteo);			
		this.jButtonCopiarTipoCosteo.setVisible(this.isPermisoCopiarTipoCosteo);			
		this.jButtonVerFormTipoCosteo.setVisible(this.isPermisoVerFormTipoCosteo);			
		
		this.jButtonAbrirOrderByTipoCosteo.setVisible(this.isPermisoOrdenTipoCosteo);					
		
		this.jButtonNuevoRelacionesTipoCosteo.setVisible(this.isPermisoNuevoTipoCosteo);			
		
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteo.jButtonModificarTipoCosteo.setVisible(this.isPermisoActualizarTipoCosteo);	
			this.jInternalFrameDetalleFormTipoCosteo.jButtonActualizarTipoCosteo.setVisible(this.isPermisoActualizarTipoCosteo);	
			this.jInternalFrameDetalleFormTipoCosteo.jButtonEliminarTipoCosteo.setVisible(this.isPermisoEliminarTipoCosteo);
			this.jInternalFrameDetalleFormTipoCosteo.jButtonCancelarTipoCosteo.setVisible(this.isVisibilidadCeldaCancelarTipoCosteo);						
			this.jInternalFrameDetalleFormTipoCosteo.jButtonGuardarCambiosTipoCosteo.setVisible(this.isPermisoGuardarCambiosTipoCosteo);							
		}
		
		this.jButtonGuardarCambiosTablaTipoCosteo.setVisible(this.isPermisoActualizarTipoCosteo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCosteo() {
		this.jInternalFrameDetalleFormTipoCosteo.jButtonModificarTipoCosteo.setVisible(this.isPermisoActualizarTipoCosteo);	
		this.jInternalFrameDetalleFormTipoCosteo.jButtonActualizarTipoCosteo.setVisible(this.isPermisoActualizarTipoCosteo);	
		this.jInternalFrameDetalleFormTipoCosteo.jButtonEliminarTipoCosteo.setVisible(this.isPermisoEliminarTipoCosteo);
		this.jInternalFrameDetalleFormTipoCosteo.jButtonCancelarTipoCosteo.setVisible(this.isVisibilidadCeldaCancelarTipoCosteo);							
		this.jInternalFrameDetalleFormTipoCosteo.jButtonGuardarCambiosTipoCosteo.setVisible((this.isVisibilidadCeldaGuardarTipoCosteo && this.isPermisoGuardarCambiosTipoCosteo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoCosteo() {
		if(TipoCosteoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoCosteo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoCosteo() {
	}
	
	public void jTableDatosTipoCosteoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoCosteo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoCosteoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCosteo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCosteo(this.gettipocosteo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteo(this.tipocosteo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocosteo =(TipoCosteo) this.tipocosteoLogic.getTipoCosteos().toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocosteo =(TipoCosteo) this.tipocosteos.toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocosteo==null) {
						this.tipocosteo = new TipoCosteo();
					}

					this.setVariablesFormularioToObjetoActualTipoCosteo(this.tipocosteo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteo(this.tipocosteo);
				}

				if(this.tipocosteo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocosteo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCosteo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoCosteoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCosteo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCosteo(this.gettipocosteo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteo(this.tipocosteo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocosteo =(TipoCosteo) this.tipocosteoLogic.getTipoCosteos().toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocosteo =(TipoCosteo) this.tipocosteos.toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocosteo==null) {
						this.tipocosteo = new TipoCosteo();
					}

					this.setVariablesFormularioToObjetoActualTipoCosteo(this.tipocosteo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteo(this.tipocosteo);
				}

				if(this.tipocosteo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipocosteo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCosteo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreTipoCosteoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoCosteo(false,false);

			this.getTipoCosteosBusquedaPorNombre();

			this.inicializarActualizarBindingTipoCosteo(false);

			//if(TipoCosteoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoCosteo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoCosteo() {
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) {
		

		if(this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) {
			this.jInternalFrameDetalleFormTipoCosteo.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoCosteo.dispose();
			this.jInternalFrameDetalleFormTipoCosteo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoCosteo!=null) {
			this.jInternalFrameReporteDinamicoTipoCosteo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoCosteo.dispose();
			this.jInternalFrameReporteDinamicoTipoCosteo=null;
		}
		
		if(this.jInternalFrameImportacionTipoCosteo!=null) {
			this.jInternalFrameImportacionTipoCosteo.setVisible(false);	    			
			this.jInternalFrameImportacionTipoCosteo.dispose();
			this.jInternalFrameImportacionTipoCosteo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoCosteo();
			
			TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoCosteo")) {
				jButtonNuevoTipoCosteoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoCosteo")) {
				jButtonDuplicarTipoCosteoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoCosteo")) {
				jButtonCopiarTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoCosteo")) {
				jButtonVerFormTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoCosteo")) {
				jButtonNuevoTipoCosteoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoCosteo")) {
				jButtonDuplicarTipoCosteoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoCosteo")) {
				jButtonNuevoTipoCosteoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoCosteo")) {
				jButtonDuplicarTipoCosteoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoCosteo")) {
				jButtonNuevoTipoCosteoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoCosteo")) {
				jButtonNuevoTipoCosteoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoCosteo")) {
				jButtonNuevoTipoCosteoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoCosteo")) {
				jButtonModificarTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoCosteo")) {
				jButtonModificarTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoCosteo")) {
				jButtonModificarTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoCosteo")) {
				jButtonActualizarTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoCosteo")) {
				jButtonActualizarTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoCosteo")) {
				jButtonActualizarTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoCosteo")) {
				jButtonEliminarTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoCosteo")) {
				jButtonEliminarTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoCosteo")) {
				jButtonEliminarTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoCosteo")) {
				jButtonCancelarTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoCosteo")) {
				jButtonCancelarTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoCosteo")) {
				jButtonCancelarTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoCosteo")) {
				jButtonCerrarTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoCosteo")) {
				jButtonCerrarTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoCosteo")) {
				jButtonCerrarTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoCosteo")) {
				jButtonMostrarOcultarTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoCosteo")) {
				jButtonCancelarTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoCosteo")) {
				jButtonGuardarCambiosTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoCosteo")) {
				jButtonGuardarCambiosTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoCosteo")) {
				jButtonCopiarTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoCosteo")) {
				jButtonVerFormTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoCosteo")) {
				jButtonGuardarCambiosTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoCosteo")) {
				jButtonCopiarTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoCosteo")) {
				jButtonVerFormTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoCosteo")) {
				jButtonGuardarCambiosTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoCosteo")) {
				jButtonGuardarCambiosTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoCosteo")) {
				jButtonGuardarCambiosTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoCosteo")) {
				jButtonRecargarInformacionTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoCosteo")) {
				jButtonRecargarInformacionTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoCosteo")) {
				jButtonRecargarInformacionTipoCosteoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoCosteo")) {
				jButtonAnterioresTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoCosteo")) {
				jButtonAnterioresTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoCosteo")) {
				jButtonAnterioresTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoCosteo")) {
				jButtonSiguientesTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoCosteo")) {
				jButtonSiguientesTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoCosteo")) {
				jButtonSiguientesTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoCosteo") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoCosteo")) {
				jButtonAbrirOrderByTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoCosteo") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoCosteo")) {
				jButtonMostrarOcultarTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCosteo")) {
				jButtonNuevoGuardarCambiosTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoCosteo")) {
				jButtonNuevoGuardarCambiosTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoCosteo")) {
				jButtonNuevoGuardarCambiosTipoCosteoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoCosteo")) {
				jButtonCerrarReporteDinamicoTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoCosteo")) {
				jButtonGenerarReporteDinamicoTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoCosteo")) {
				
				jButtonGenerarExcelReporteDinamicoTipoCosteoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoCosteo")) {
				jButtonCerrarImportacionTipoCosteoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoCosteo")) {
				
				jButtonGenerarImportacionTipoCosteoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoCosteo")) {
				
				jButtonAbrirImportacionTipoCosteoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoCosteo")) {
				jComboBoxTiposAccionesTipoCosteoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoCosteo")) {
				jComboBoxTiposRelacionesTipoCosteoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoCosteo")) {
				jComboBoxTiposAccionesTipoCosteoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoCosteo")) {
				
				jComboBoxTiposSeleccionarTipoCosteoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoCosteo")) {
				jTextFieldValorCampoGeneralTipoCosteoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoCosteo")) {
				jButtonAbrirOrderByTipoCosteoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoCosteo")) {
				jButtonAbrirOrderByTipoCosteoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoCosteo")) {
				jButtonCerrarOrderByTipoCosteoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCosteoBusqueda")) {
				this.jButtonidTipoCosteoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCosteoBusqueda")) {
				this.jButtonnombreTipoCosteoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreTipoCosteo")) {
				this.jButtonBusquedaPorNombreTipoCosteoActionPerformed(evt);
			}
			
			;
			
			
			TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoCosteo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCosteoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosteo);
				
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
				
				


				
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosteo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosteo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoCosteo tipocosteoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocosteoLocal=this.tipocosteo;
			} else {
				tipocosteoLocal=this.tipocosteoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosteo);
				
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
							
				
				


				
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosteo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosteo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCosteoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCosteo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteoAnterior =(TipoCosteo) this.tipocosteoLogic.getTipoCosteos().toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocosteoAnterior =(TipoCosteo) this.tipocosteos.toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
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
			
			TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
			
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
			
			


			
			TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCosteoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosteo);
				
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
								
						
				


				
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosteo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosteo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosteo);
				
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
								
				
				


				
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosteo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosteo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCosteoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCosteo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteoAnterior =(TipoCosteo) this.tipocosteoLogic.getTipoCosteos().toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocosteoAnterior =(TipoCosteo) this.tipocosteos.toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosteo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCosteoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCosteo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteoAnterior =(TipoCosteo) this.tipocosteoLogic.getTipoCosteos().toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocosteoAnterior =(TipoCosteo) this.tipocosteos.toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCosteoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocosteo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosteo);
				
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
							
				
				


				
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosteo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosteo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCosteoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCosteo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocosteoAnterior =(TipoCosteo) this.tipocosteoLogic.getTipoCosteos().toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocosteoAnterior =(TipoCosteo) this.tipocosteos.toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
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
			
			TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
			
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
			
			


			
			TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCosteoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocosteo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosteo);
				
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
								
				
				


				
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosteo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosteo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCosteoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCosteo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteoAnterior =(TipoCosteo) this.tipocosteoLogic.getTipoCosteos().toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocosteoAnterior =(TipoCosteo) this.tipocosteos.toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCosteoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocosteo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCosteoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosteo);
				
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoCosteo")) {
					jCheckBoxSeleccionarTodosTipoCosteoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoCosteo")) {
					jCheckBoxSeleccionadosTipoCosteoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoCosteo")) {
					
				}
				
				


				
				
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosteo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosteo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocosteo);
				
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
												
				
				


				
				
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosteo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosteo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCosteoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCosteo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocosteoAnterior =(TipoCosteo) this.tipocosteoLogic.getTipoCosteos().toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocosteoAnterior =(TipoCosteo) this.tipocosteos.toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCosteoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosteo);
				
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
				
				
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
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
			
			TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
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
			
			


			
			TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCosteoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosteo);
				
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosteo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosteo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosteo);
				
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
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
				
				


				
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosteo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosteo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCosteoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCosteo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteoAnterior =(TipoCosteo) this.tipocosteoLogic.getTipoCosteos().toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocosteoAnterior =(TipoCosteo) this.tipocosteos.toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoCosteo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoCosteoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoCosteo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocosteo =(TipoCosteo) this.tipocosteoLogic.getTipoCosteos().toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocosteo =(TipoCosteo) this.tipocosteos.toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocosteo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoCosteo")) {
				
				}
				
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoCosteo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoCosteo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoCosteo")) {
			
			}
			
			TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoCosteo();
			
			TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoCosteo")) {
				jButtonNuevoTipoCosteoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoCosteo")) {
				jButtonDuplicarTipoCosteoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoCosteo")) {
				jButtonCopiarTipoCosteoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoCosteo")) {
				jButtonVerFormTipoCosteoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoCosteo")) {
				jButtonNuevoTipoCosteoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoCosteo")) {
				jButtonModificarTipoCosteoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoCosteo")) {
				jButtonActualizarTipoCosteoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoCosteo")) {
				jButtonEliminarTipoCosteoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoCosteo")) {
				jButtonGuardarCambiosTipoCosteoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoCosteo")) {
				jButtonCancelarTipoCosteoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoCosteo")) {
				jButtonCerrarTipoCosteoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoCosteo")) {
				jButtonGuardarCambiosTipoCosteoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCosteo")) {
				jButtonNuevoGuardarCambiosTipoCosteoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoCosteo")) {
				jButtonAbrirOrderByTipoCosteoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoCosteo")) {
				jButtonRecargarInformacionTipoCosteoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoCosteo")) {
				jButtonAnterioresTipoCosteoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoCosteo")) {
				jButtonSiguientesTipoCosteoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCosteoBusqueda")) {
				this.jButtonidTipoCosteoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCosteoBusqueda")) {
				this.jButtonnombreTipoCosteoBusquedaActionPerformed(evt);
			}
			
			TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoCosteo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoCosteo")) {
				closingInternalFrameTipoCosteo();
				
			} else if(sTipo.equals("jButtonCancelarTipoCosteo")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoCosteo = (JInternalFrameBase)evt.getSource();
	            	
	            TipoCosteoBeanSwingJInternalFrame jInternalFrameParent=(TipoCosteoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCosteo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoCosteoActionPerformed(null);
			}
			
			TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocosteo,new Object(),this.tipocosteoParameterGeneral,this.tipocosteoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoCosteo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoCosteo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoCosteo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocosteo)) {
			if(!esControlTabla) {
				if(TipoCosteoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoCosteo(this.tipocosteo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteo(this.tipocosteo);			
				}
				
				if(this.tipocosteoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoCosteo(this.tipocosteo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocosteoReturnGeneral=tipocosteoLogic.procesarEventosTipoCosteosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocosteoLogic.getTipoCosteos(),this.tipocosteo,this.tipocosteoParameterGeneral,this.isEsNuevoTipoCosteo,classes);//this.tipocosteoLogic.getTipoCosteo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoCosteo(this.tipocosteoReturnGeneral,this.tipocosteoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocosteoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoCosteo(classes,this.tipocosteoReturnGeneral,this.tipocosteoBean,false);
					}
						
					if(this.tipocosteoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoCosteo(this.tipocosteoReturnGeneral.getTipoCosteo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoCosteo(this.tipocosteoReturnGeneral.getTipoCosteo());	
					}
						
					if(this.tipocosteoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoCosteo(this.tipocosteoReturnGeneral.getTipoCosteo(),classes);//this.tipocosteoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoCosteo(this.tipocosteo,classes);//this.tipocosteoBean);									
				}
			
				if(TipoCosteoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoCosteo(this.tipocosteo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteo(this.tipocosteo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocosteoAnterior!=null) {
						this.tipocosteo=this.tipocosteoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocosteoReturnGeneral=tipocosteoLogic.procesarEventosTipoCosteosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocosteoLogic.getTipoCosteos(),this.tipocosteo,this.tipocosteoParameterGeneral,this.isEsNuevoTipoCosteo,classes);//this.tipocosteoLogic.getTipoCosteo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocosteoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocosteoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocosteoReturnGeneral.getTipoCosteo(),tipocosteoLogic.getTipoCosteos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocosteoReturnGeneral.getTipoCosteo(),this.tipocosteos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoCosteo.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoCosteo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoCosteo();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoCosteo() throws Exception {
		
		TipoCosteoModel tipocosteoModel=(TipoCosteoModel)this.jTableDatosTipoCosteo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocosteoModel.tipocosteos=this.tipocosteoLogic.getTipoCosteos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocosteoModel.tipocosteos=this.tipocosteos;
		}
		
		
		((TipoCosteoModel) this.jTableDatosTipoCosteo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoCosteo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocosteoAnterior(),this.tipocosteoLogic.getTipoCosteos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocosteoAnterior(),this.tipocosteos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoCosteo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoCosteo(TipoCosteo tipocosteo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(tipocosteo.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
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
										
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocosteo,new Object(),generalEntityParameterGeneral,this.tipocosteoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocosteoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoCosteoConstantesFunciones.getClassesRelationshipsOfTipoCosteo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoCosteoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoCosteo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoCosteo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoCosteoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocosteo,new Object(),generalEntityParameterGeneral,this.tipocosteoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoCosteo(TipoCosteoBean tipocosteoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(tipocosteo.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoCosteo(ArrayList<Classe> classes,TipoCosteoReturnGeneral tipocosteoReturnGeneral,TipoCosteoBean tipocosteoBean,Boolean conDefault) throws Exception {
		
			this.tipocosteoBean.setParametroInventarioDefectos(tipocosteoReturnGeneral.getTipoCosteo().getParametroInventarioDefectos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoCosteo(TipoCosteo tipocosteo,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					tipocosteo.setParametroInventarioDefectos(this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipocosteo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoCosteo = new TipoCosteoDetalleFormJInternalFrame(jDesktopPane,this.tipocosteoSessionBean.getConGuardarRelaciones(),this.tipocosteoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCosteo);
		this.jInternalFrameDetalleFormTipoCosteo.setVisible(false);
		this.jInternalFrameDetalleFormTipoCosteo.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoCosteo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoCosteo.tipocosteoLogic=this.tipocosteoLogic;
		
		this.cargarCombosFrameForeignKeyTipoCosteo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCosteo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCosteo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoCosteo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoCosteo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoCosteo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCosteo"));
		
		this.jInternalFrameDetalleFormTipoCosteo.jButtonModificarTipoCosteo.addActionListener(new ButtonActionListener(this,"ModificarTipoCosteo"));

		
		this.jInternalFrameDetalleFormTipoCosteo.jButtonModificarToolBarTipoCosteo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCosteo"));
					
		this.jInternalFrameDetalleFormTipoCosteo.jMenuItemModificarTipoCosteo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCosteo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCosteo.jButtonActualizarTipoCosteo.addActionListener (new ButtonActionListener(this,"ActualizarTipoCosteo"));
		
		
		this.jInternalFrameDetalleFormTipoCosteo.jButtonActualizarToolBarTipoCosteo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCosteo"));
						
		this.jInternalFrameDetalleFormTipoCosteo.jMenuItemActualizarTipoCosteo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCosteo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCosteo.jButtonEliminarTipoCosteo.addActionListener (new ButtonActionListener(this,"EliminarTipoCosteo"));
		
		
		this.jInternalFrameDetalleFormTipoCosteo.jButtonEliminarToolBarTipoCosteo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCosteo"));
								
		this.jInternalFrameDetalleFormTipoCosteo.jMenuItemEliminarTipoCosteo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCosteo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCosteo.jButtonCancelarTipoCosteo.addActionListener (new ButtonActionListener(this,"CancelarTipoCosteo"));
		
		
		this.jInternalFrameDetalleFormTipoCosteo.jButtonCancelarToolBarTipoCosteo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCosteo"));
					
		this.jInternalFrameDetalleFormTipoCosteo.jMenuItemCancelarTipoCosteo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCosteo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoCosteo.jMenuItemDetalleCerrarTipoCosteo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCosteo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCosteo.jButtonGuardarCambiosToolBarTipoCosteo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCosteo"));
		
		
		
		this.jInternalFrameDetalleFormTipoCosteo.jButtonGuardarCambiosToolBarTipoCosteo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCosteo"));
		
		
		
		this.jInternalFrameDetalleFormTipoCosteo.jComboBoxTiposAccionesFormularioTipoCosteo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCosteo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCosteo.jButtonidTipoCosteoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCosteoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCosteo.jButtonnombreTipoCosteoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCosteoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoCosteo.jTabbedPaneRelacionesTipoCosteo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCosteo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoCosteo"));
		
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCosteo"));
		}
		
		this.jTableDatosTipoCosteo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoCosteo"));
		
		this.jTableDatosTipoCosteo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoCosteo"));
		
		this.jButtonNuevoTipoCosteo.addActionListener(new ButtonActionListener(this,"NuevoTipoCosteo"));
		
		this.jButtonDuplicarTipoCosteo.addActionListener(new ButtonActionListener(this,"DuplicarTipoCosteo"));
		
		this.jButtonCopiarTipoCosteo.addActionListener(new ButtonActionListener(this,"CopiarTipoCosteo"));
		
		this.jButtonVerFormTipoCosteo.addActionListener(new ButtonActionListener(this,"VerFormTipoCosteo"));
		
		
		this.jButtonNuevoToolBarTipoCosteo.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoCosteo"));
			
		this.jButtonDuplicarToolBarTipoCosteo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoCosteo"));
			
		this.jMenuItemNuevoTipoCosteo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoCosteo"));
			
		this.jMenuItemDuplicarTipoCosteo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoCosteo"));		
		
		
		this.jButtonNuevoRelacionesTipoCosteo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoCosteo"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoCosteo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoCosteo"));
			
		this.jMenuItemNuevoRelacionesTipoCosteo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoCosteo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteo.jButtonModificarTipoCosteo.addActionListener(new ButtonActionListener(this,"ModificarTipoCosteo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteo.jButtonModificarToolBarTipoCosteo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCosteo"));
			
			this.jInternalFrameDetalleFormTipoCosteo.jMenuItemModificarTipoCosteo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCosteo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoCosteo.jButtonActualizarTipoCosteo.addActionListener (new ButtonActionListener(this,"ActualizarTipoCosteo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteo.jButtonActualizarToolBarTipoCosteo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCosteo"));
				
			this.jInternalFrameDetalleFormTipoCosteo.jMenuItemActualizarTipoCosteo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCosteo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteo.jButtonEliminarTipoCosteo.addActionListener (new ButtonActionListener(this,"EliminarTipoCosteo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteo.jButtonEliminarToolBarTipoCosteo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCosteo"));
						
			this.jInternalFrameDetalleFormTipoCosteo.jMenuItemEliminarTipoCosteo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCosteo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteo.jButtonCancelarTipoCosteo.addActionListener (new ButtonActionListener(this,"CancelarTipoCosteo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteo.jButtonCancelarToolBarTipoCosteo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCosteo"));
			
			this.jInternalFrameDetalleFormTipoCosteo.jMenuItemCancelarTipoCosteo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCosteo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoCosteo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoCosteo"));		
		
		
		this.jButtonCerrarTipoCosteo.addActionListener (new ButtonActionListener(this,"CerrarTipoCosteo"));
		
		
		this.jButtonCerrarToolBarTipoCosteo.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoCosteo"));
			
		this.jMenuItemCerrarTipoCosteo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoCosteo"));
			
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteo.jMenuItemDetalleCerrarTipoCosteo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCosteo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteo.jButtonGuardarCambiosTipoCosteo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoCosteo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteo.jButtonGuardarCambiosToolBarTipoCosteo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCosteo"));
		}
		
		this.jButtonCopiarToolBarTipoCosteo.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoCosteo"));
			
		this.jButtonVerFormToolBarTipoCosteo.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoCosteo"));
		
		this.jMenuItemGuardarCambiosTipoCosteo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoCosteo"));
			
		this.jMenuItemCopiarTipoCosteo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoCosteo"));		
		
		this.jMenuItemVerFormTipoCosteo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoCosteo"));		
		
		
		this.jButtonGuardarCambiosTablaTipoCosteo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCosteo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCosteo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoCosteo"));
			
		this.jMenuItemGuardarCambiosTablaTipoCosteo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCosteo"));		
		
		
		
		this.jButtonRecargarInformacionTipoCosteo.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoCosteo"));
					
		this.jButtonRecargarInformacionToolBarTipoCosteo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoCosteo"));
		
		this.jMenuItemRecargarInformacionTipoCosteo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoCosteo"));		
		
		
		
		this.jButtonAnterioresTipoCosteo.addActionListener (new ButtonActionListener(this,"AnterioresTipoCosteo"));
		
		
		this.jButtonAnterioresToolBarTipoCosteo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoCosteo"));
		
		this.jMenuItemAnterioresTipoCosteo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoCosteo"));		
		
		
		this.jButtonSiguientesTipoCosteo.addActionListener (new ButtonActionListener(this,"SiguientesTipoCosteo"));
		
		
		this.jButtonSiguientesToolBarTipoCosteo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoCosteo"));
			
		this.jMenuItemSiguientesTipoCosteo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoCosteo"));
			
		this.jMenuItemAbrirOrderByTipoCosteo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoCosteo"));
			
		this.jMenuItemMostrarOcultarTipoCosteo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoCosteo"));
			
		this.jMenuItemDetalleAbrirOrderByTipoCosteo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoCosteo"));
			
		this.jMenuItemDetalleMostarOcultarTipoCosteo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoCosteo"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoCosteo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoCosteo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCosteo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoCosteo"));
			
		this.jMenuItemNuevoGuardarCambiosTipoCosteo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoCosteo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoCosteo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoCosteo"));

		this.jCheckBoxSeleccionadosTipoCosteo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoCosteo"));
		
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteo.jComboBoxTiposAccionesFormularioTipoCosteo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCosteo"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoCosteo.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoCosteo"));
			
		this.jComboBoxTiposAccionesTipoCosteo.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoCosteo"));
					
		this.jComboBoxTiposSeleccionarTipoCosteo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoCosteo"));
			
		this.jTextFieldValorCampoGeneralTipoCosteo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoCosteo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCosteo.jButtonidTipoCosteoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCosteoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCosteo.jButtonnombreTipoCosteoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCosteoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreTipoCosteo.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoCosteo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoCosteo!=null) {
				this.jInternalFrameReporteDinamicoTipoCosteo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCosteo"));
				this.jInternalFrameReporteDinamicoTipoCosteo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCosteo"));
				this.jInternalFrameReporteDinamicoTipoCosteo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCosteo"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoCosteo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCosteo"));				
			//this.jButtonGenerarReporteDinamicoTipoCosteo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCosteo"));
			//this.jButtonGenerarExcelReporteDinamicoTipoCosteo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCosteo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoCosteo!=null) {
				this.jInternalFrameImportacionTipoCosteo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCosteo"));
				this.jInternalFrameImportacionTipoCosteo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCosteo"));
				this.jInternalFrameImportacionTipoCosteo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCosteo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoCosteo.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoCosteo"));
			
			this.jButtonAbrirOrderByToolBarTipoCosteo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoCosteo"));			
			
			if(this.jInternalFrameOrderByTipoCosteo!=null) {
				this.jInternalFrameOrderByTipoCosteo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCosteo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoCosteo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteo.jTabbedPaneRelacionesTipoCosteo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCosteo"));
		
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
            		closingInternalFrameTipoCosteo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoCosteo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoCosteo = (JInternalFrameBase)event.getSource();
	            	
	            TipoCosteoBeanSwingJInternalFrame jInternalFrameParent=(TipoCosteoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCosteo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoCosteoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoCosteo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoCosteoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoCosteo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoCosteo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCosteoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCosteoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCosteoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoCosteo";
		inputMap = this.jButtonNuevoTipoCosteo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoCosteo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCosteoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCosteoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCosteoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCosteoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoCosteo";
		inputMap = this.jButtonNuevoRelacionesTipoCosteo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoCosteo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCosteoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoCosteo";
		inputMap = this.jButtonModificarTipoCosteo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoCosteo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoCosteoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoCosteo";
		inputMap = this.jButtonActualizarTipoCosteo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoCosteo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoCosteoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoCosteo";
		inputMap = this.jButtonEliminarTipoCosteo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoCosteo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoCosteoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoCosteo";
		inputMap = this.jButtonCancelarTipoCosteo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoCosteo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoCosteoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoCosteo";
		inputMap = this.jButtonCerrarTipoCosteo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoCosteo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoCosteoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoCosteo.jButtonGuardarCambiosTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoCosteo";
		inputMap = this.jInternalFrameDetalleFormTipoCosteo.jButtonGuardarCambiosTipoCosteo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoCosteo.jButtonGuardarCambiosTipoCosteo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoCosteoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoCosteo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoCosteoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoCosteo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoCosteoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoCosteo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoCosteoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoCosteo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoCosteoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCosteo.jButtonidTipoCosteoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCosteoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCosteo.jButtonnombreTipoCosteoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCosteoBusqueda"));
		
		
		this.jButtonBusquedaPorNombreTipoCosteo.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoCosteo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoCosteo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoCosteoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoCosteoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoCosteo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoCosteo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoCosteo tipocosteoAux:this.tipocosteoLogic.getTipoCosteos()) {
					tipocosteoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCosteo tipocosteoAux:tipocosteos) {
					tipocosteoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoCosteoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCosteo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCosteo tipocosteoAux:this.tipocosteoLogic.getTipoCosteos()) {
						tipocosteoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCosteo tipocosteoAux:tipocosteos) {
						tipocosteoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoCosteo tipocosteoAux:this.tipocosteoLogic.getTipoCosteos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCosteo tipocosteoAux:tipocosteos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCosteo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCosteo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCosteo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCosteo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoCosteoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCosteo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoCosteo.getSelectedRows();
			
			TipoCosteo tipocosteoLocal=new TipoCosteo();
			
			//this.seleccionarTodosTipoCosteo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocosteoLocal =(TipoCosteo) this.tipocosteoLogic.getTipoCosteos().toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocosteoLocal =(TipoCosteo) this.tipocosteos.toArray()[this.jTableDatosTipoCosteo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocosteoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCosteo tipocosteoAux:this.tipocosteoLogic.getTipoCosteos()) {
						tipocosteoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCosteo tipocosteoAux:tipocosteos) {
						tipocosteoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoCosteo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCosteo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCosteo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCosteo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoCosteoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoCosteoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoCosteoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoCosteo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoCosteo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCosteo tipocosteoAux:this.tipocosteoLogic.getTipoCosteos()) {
				
						if(sTipoSeleccionar.equals(TipoCosteoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocosteoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCosteo tipocosteoAux:tipocosteos) {
					
						if(sTipoSeleccionar.equals(TipoCosteoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocosteoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCosteo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoCosteoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoCosteo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoCosteo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoCosteo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoCosteo.jComboBoxTiposAccionesFormularioTipoCosteo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoCosteo) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoCosteo(conSplash);
				
					this.generarReporteTipoCosteosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCosteo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCosteo.jComboBoxTiposAccionesFormularioTipoCosteo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoCosteosSeleccionados();
				//this.jComboBoxTiposAccionesTipoCosteo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCosteosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoCosteo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCosteosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoCosteo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCosteo();
				
				this.exportarTipoCosteosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCosteo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCosteo.jComboBoxTiposAccionesFormularioTipoCosteo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoCosteos();
				//this.importarTipoCosteos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCosteo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCosteo.jComboBoxTiposAccionesFormularioTipoCosteo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCosteo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoCosteosSeleccionados();
				//this.jComboBoxTiposAccionesTipoCosteo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Costeo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoCosteo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoCosteo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoCosteo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Costeo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCosteo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCosteo.jComboBoxTiposAccionesFormularioTipoCosteo.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoCosteo();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoCosteo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoCosteoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoCosteo();
			
			if(this.jInternalFrameDetalleFormTipoCosteo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoCosteo> tipocosteosSeleccionados=new ArrayList<TipoCosteo>();		
			TipoCosteo tipocosteo=new TipoCosteo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoCosteo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoCosteo.getSelectedItem();
			
			
			
			
			tipocosteosSeleccionados=this.getTipoCosteosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocosteosSeleccionados.size()==1) {
				for(TipoCosteo tipocosteoAux:tipocosteosSeleccionados) {
					tipocosteo=tipocosteoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Parametro Inventario Defecto")) {
					jButtonParametroInventarioDefectoActionPerformed(null,rowIndex,true,false,tipocosteo);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoCosteo();
			
      		//this.finishProcessTipoCosteo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoCosteoReturnGeneral() throws Exception {
		if(this.tipocosteoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocosteoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocosteoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocosteoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocosteoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocosteoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoCosteo(false);
		}
		
		if(this.tipocosteoReturnGeneral.getConRetornoLista() || this.tipocosteoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocosteoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocosteoLogic.setTipoCosteos(this.tipocosteoReturnGeneral.getTipoCosteos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocosteoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocosteoLogic.setTipoCosteo(this.tipocosteoReturnGeneral.getTipoCosteo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoCosteo(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoCosteo() throws Exception {
		
		
	}
	
	public ArrayList<TipoCosteo> getTipoCosteosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoCosteo> tipocosteosSeleccionados=new ArrayList<TipoCosteo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoCosteo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoCosteo tipocosteoAux:tipocosteoLogic.getTipoCosteos()) {
					if(tipocosteoAux.getIsSelected()) {
						tipocosteosSeleccionados.add(tipocosteoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCosteo tipocosteoAux:this.tipocosteos) {
					if(tipocosteoAux.getIsSelected()) {
						tipocosteosSeleccionados.add(tipocosteoAux);				
					}
				}
			}
			
			if(tipocosteosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocosteosSeleccionados.addAll(this.tipocosteoLogic.getTipoCosteos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocosteosSeleccionados.addAll(this.tipocosteos);				
					}
				}
			}
		} else {
			tipocosteosSeleccionados.add(this.tipocosteo);
		}
		
		return tipocosteosSeleccionados;
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
	
	public void generarReporteTipoCosteosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoCosteosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoCosteosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCosteosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCosteosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoCosteosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Costeo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoCosteosSeleccionados() throws Exception {
		ArrayList<TipoCosteo> tipocosteosSeleccionados=new ArrayList<TipoCosteo>();		
		
		tipocosteosSeleccionados=this.getTipoCosteosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoCosteos("Todos",tipocosteosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoCosteosSeleccionados() throws Exception {
		ArrayList<TipoCosteo> tipocosteosSeleccionados=new ArrayList<TipoCosteo>();		
		
		tipocosteosSeleccionados=this.getTipoCosteosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoCosteos("Todos",tipocosteosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoCosteosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoCosteo> tipocosteosSeleccionados=new ArrayList<TipoCosteo>();
		
		tipocosteosSeleccionados=this.getTipoCosteosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoCosteos("Todos",tipocosteosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoCosteosSeleccionados() throws Exception {
		ArrayList<TipoCosteo> tipocosteosSeleccionados=new ArrayList<TipoCosteo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoCosteo();
		
		
		tipocosteosSeleccionados=this.getTipoCosteosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoCosteo();
		
		
		//this.generarReporteTipoCosteos("Todos",tipocosteosSeleccionados ,tipocosteoImplementable,tipocosteoImplementableHome);
	}
	
	public void mostrarImportacionTipoCosteos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoCosteo();
		
		this.abrirFrameImportacionTipoCosteo();		
		
			
		//this.generarReporteTipoCosteos("Todos",tipocosteosSeleccionados ,tipocosteoImplementable,tipocosteoImplementableHome);
	}
	
	public void importarTipoCosteos() throws Exception {		
	
	}
	
	public void exportarTipoCosteosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoCosteosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoCosteosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoCosteosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Costeo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoCosteosSeleccionados() throws Exception {
		ArrayList<TipoCosteo> tipocosteosSeleccionados=new ArrayList<TipoCosteo>();		
		
		tipocosteosSeleccionados=this.getTipoCosteosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocosteo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoCosteo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoCosteo tipocosteoAux:tipocosteosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoCosteo(tipocosteoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocosteoAux.setsDetalleGeneralEntityReporte(tipocosteoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocosteoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costeo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoCosteo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoCosteoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCosteoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCosteoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoCosteo(TipoCosteo tipocosteo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocosteo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocosteo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocosteo.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoCosteosSeleccionados() throws Exception {
		ArrayList<TipoCosteo> tipocosteosSeleccionados=new ArrayList<TipoCosteo>();		
		
		tipocosteosSeleccionados=this.getTipoCosteosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocosteo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoCosteos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoCosteo(row);				
				iRow++;
			}				
			
			for(TipoCosteo tipocosteoAux:tipocosteosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoCosteo(tipocosteoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocosteoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costeo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoCosteosSeleccionados() throws Exception {
		ArrayList<TipoCosteo> tipocosteosSeleccionados=new ArrayList<TipoCosteo>();		
		
		tipocosteosSeleccionados=this.getTipoCosteosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocosteo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocosteos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocosteo");
			//elementRoot.appendChild(element);
		
			for(TipoCosteo tipocosteoAux:tipocosteosSeleccionados) {
				element = document.createElement("tipocosteo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoCosteo(tipocosteoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocosteoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costeo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoCosteo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCosteoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCosteoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoCosteoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoCosteo(TipoCosteo tipocosteo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocosteo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocosteo.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoCosteo(TipoCosteo tipocosteo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoCosteoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocosteo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoCosteoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocosteo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoCosteoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipocosteo.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoCosteosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoCosteo> tipocosteosSeleccionados=new ArrayList<TipoCosteo>();
		
		tipocosteosSeleccionados=this.getTipoCosteosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoCosteo(tipocosteosSeleccionados);
		
		this.generarReporteTipoCosteos("Todos",tipocosteosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoCosteo(ArrayList<TipoCosteo> tipocosteosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoCosteo tipocosteoAux:tipocosteosSeleccionados) {
				tipocosteoAux.setsDetalleGeneralEntityReporte(tipocosteoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoCosteoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipocosteoAux.setsDescripcionGeneralEntityReporte1(tipocosteoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoCosteo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoCosteo=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoCosteo=true;
				this.isVisibilidadCeldaGuardarCambiosTipoCosteo=true;
			}
			
			this.isVisibilidadCeldaModificarTipoCosteo=false;
			this.isVisibilidadCeldaActualizarTipoCosteo=false;
			this.isVisibilidadCeldaEliminarTipoCosteo=false;
			this.isVisibilidadCeldaCancelarTipoCosteo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCosteo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCosteo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoCosteo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCosteo=false;
			this.isVisibilidadCeldaModificarTipoCosteo=false;
			this.isVisibilidadCeldaActualizarTipoCosteo=true;
			this.isVisibilidadCeldaEliminarTipoCosteo=false;
			this.isVisibilidadCeldaCancelarTipoCosteo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCosteo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCosteo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoCosteo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCosteo=false;
			this.isVisibilidadCeldaModificarTipoCosteo=false;
			this.isVisibilidadCeldaActualizarTipoCosteo=true;
			this.isVisibilidadCeldaEliminarTipoCosteo=true;
			this.isVisibilidadCeldaCancelarTipoCosteo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCosteo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCosteo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoCosteo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCosteo=false;
			this.isVisibilidadCeldaModificarTipoCosteo=false;
			this.isVisibilidadCeldaActualizarTipoCosteo=true;
			this.isVisibilidadCeldaEliminarTipoCosteo=false;
			this.isVisibilidadCeldaCancelarTipoCosteo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCosteo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCosteo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoCosteo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCosteo=true;
			this.isVisibilidadCeldaModificarTipoCosteo=false;
			this.isVisibilidadCeldaActualizarTipoCosteo=false;
			this.isVisibilidadCeldaEliminarTipoCosteo=false;
			this.isVisibilidadCeldaCancelarTipoCosteo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCosteo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCosteo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoCosteo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCosteo=false;
			this.isVisibilidadCeldaActualizarTipoCosteo=false;
			this.isVisibilidadCeldaEliminarTipoCosteo=false;
			this.isVisibilidadCeldaCancelarTipoCosteo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCosteo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCosteo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoCosteo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCosteo=false;
			this.isVisibilidadCeldaModificarTipoCosteo=true;
			this.isVisibilidadCeldaActualizarTipoCosteo=false;
			this.isVisibilidadCeldaEliminarTipoCosteo=false;
			this.isVisibilidadCeldaCancelarTipoCosteo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCosteo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCosteo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoCosteoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoCosteo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCosteo=true;
		} else {
			this.actualizarEstadoPanelsTipoCosteo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoCosteo=false;
			//this.isVisibilidadCeldaVerFormTipoCosteo=false;
			this.isVisibilidadCeldaDuplicarTipoCosteo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocosteoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteo=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoCosteo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCosteo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocosteoSessionBean.getEsGuardarRelacionado()) {
			if(!tipocosteoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoCosteo=false;												
			}
			
			this.jButtonCerrarTipoCosteo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteo=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocosteo)) {
			this.isVisibilidadCeldaActualizarTipoCosteo=false;
			this.isVisibilidadCeldaEliminarTipoCosteo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCosteo() {
		this.isVisibilidadCeldaNuevoTipoCosteo=false;
		this.isVisibilidadCeldaGuardarCambiosTipoCosteo=false;
	}
	
	public void actualizarEstadoPanelsTipoCosteo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoCosteo!=null) {
				this.jScrollPanelDatosEdicionTipoCosteo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCosteo!=null) {
				this.jTabbedPaneBusquedasTipoCosteo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCosteo!=null) {
				this.jScrollPanelDatosTipoCosteo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCosteo!=null) {
				this.jPanelPaginacionTipoCosteo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCosteo!=null) {
				this.jPanelParametrosReportesTipoCosteo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoCosteo!=null) {
				this.jScrollPanelDatosEdicionTipoCosteo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCosteo!=null) {
				this.jTabbedPaneBusquedasTipoCosteo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoCosteo!=null) {
				this.jScrollPanelDatosTipoCosteo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCosteo!=null) {
				this.jPanelPaginacionTipoCosteo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCosteo!=null) {
				this.jPanelParametrosReportesTipoCosteo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoCosteo!=null) {
				this.jScrollPanelDatosEdicionTipoCosteo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCosteo!=null) {
				this.jTabbedPaneBusquedasTipoCosteo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCosteo!=null) {
				this.jScrollPanelDatosTipoCosteo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCosteo!=null) {
				this.jPanelPaginacionTipoCosteo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCosteo!=null) {
				this.jPanelParametrosReportesTipoCosteo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoCosteo!=null) {
				this.jScrollPanelDatosEdicionTipoCosteo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCosteo!=null) {
				this.jTabbedPaneBusquedasTipoCosteo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCosteo!=null) {
				this.jScrollPanelDatosTipoCosteo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCosteo!=null) {
				this.jPanelPaginacionTipoCosteo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCosteo!=null) {
				this.jPanelParametrosReportesTipoCosteo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoCosteo!=null) {
				this.jScrollPanelDatosEdicionTipoCosteo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCosteo!=null) {
				this.jTabbedPaneBusquedasTipoCosteo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCosteo!=null) {
				this.jScrollPanelDatosTipoCosteo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCosteo!=null) {
				this.jPanelPaginacionTipoCosteo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCosteo!=null) {
				this.jPanelParametrosReportesTipoCosteo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoCosteo!=null) {
				this.jScrollPanelDatosEdicionTipoCosteo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCosteo!=null) {
				this.jTabbedPaneBusquedasTipoCosteo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCosteo!=null) {
				this.jScrollPanelDatosTipoCosteo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCosteo!=null) {
				this.jPanelPaginacionTipoCosteo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCosteo!=null) {
				this.jPanelParametrosReportesTipoCosteo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoCosteo!=null) {
				this.jScrollPanelDatosEdicionTipoCosteo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCosteo!=null) {
				this.jTabbedPaneBusquedasTipoCosteo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCosteo!=null) {
				this.jScrollPanelDatosTipoCosteo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCosteo!=null) {
				this.jPanelPaginacionTipoCosteo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCosteo!=null) {
				this.jPanelParametrosReportesTipoCosteo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoCosteo!=null) {
					this.jTabbedPaneBusquedasTipoCosteo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoCosteo!=null) {
				this.jPanelParametrosReportesTipoCosteo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocosteoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCosteo!=null) {
				this.jTabbedPaneBusquedasTipoCosteo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoCosteo!=null) {
				this.jPanelParametrosReportesTipoCosteo.setVisible(true);
			}
		}
	}	
	
	
	
	

	public String registrarSesionTipoCosteoParaParametroInventarioDefectos() throws Exception {
		Boolean isPaginaPopupParametroInventarioDefecto=false;

		try {

			if(this.tipocosteoSessionBean==null) {
				this.tipocosteoSessionBean=new TipoCosteoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoSessionBean.setsPathNavegacionActual(tipocosteoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroInventarioDefecto=this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(true);
			this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(TipoCosteoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoCosteo(true);
			this.jInternalFrameDetalleFormTipoCosteo.parametroinventariodefectoSessionBean.setlidTipoCosteoActual(this.idTipoCosteoActual);

			tipocosteoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoCosteo(true);
			tipocosteoSessionBean.setlIdTipoCosteoActualForeignKey(this.idTipoCosteoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoCosteoSessionBean tipocosteoSessionBean=new TipoCosteoSessionBean();
		
		if(this.tipocosteoSessionBean==null) {
			this.tipocosteoSessionBean=new TipoCosteoSessionBean();
		}
		
		this.tipocosteoSessionBean.setsUltimaBusquedaTipoCosteo(this.getsAccionBusqueda());
		this.tipocosteoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocosteoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipocosteoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoCosteoSessionBean tipocosteoSessionBean=new TipoCosteoSessionBean();
		
		if(this.tipocosteoSessionBean==null) {
			this.tipocosteoSessionBean=new TipoCosteoSessionBean();
		}
		
		if(this.tipocosteoSessionBean.getsUltimaBusquedaTipoCosteo()!=null&&!this.tipocosteoSessionBean.getsUltimaBusquedaTipoCosteo().equals("")) {
			this.setsAccionBusqueda(tipocosteoSessionBean.getsUltimaBusquedaTipoCosteo());
			this.setiNumeroPaginacion(tipocosteoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocosteoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipocosteoSessionBean.getnombre());
				tipocosteoSessionBean.setnombre("");
			}
		}
		
		this.tipocosteoSessionBean.setsUltimaBusquedaTipoCosteo("");
		this.tipocosteoSessionBean.setiNumeroPaginacion(TipoCosteoConstantesFunciones.INUMEROPAGINACION);
		this.tipocosteoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoCosteo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoCosteo() {
		this.updateBorderResaltarBusquedasFormularioTipoCosteo();
		this.updateVisibilidadBusquedasFormularioTipoCosteo();
		this.updateHabilitarBusquedasFormularioTipoCosteo();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoCosteo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoCosteo.getComponents().length>0) {
	

		if(this.tipocosteoConstantesFunciones.resaltarBusquedaPorNombreTipoCosteo!=null) {
			index= this.jTabbedPaneBusquedasTipoCosteo.indexOfComponent(this.jPanelBusquedaPorNombreTipoCosteo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCosteo.getComponent(index);
				jPanel.setBorder(this.tipocosteoConstantesFunciones.resaltarBusquedaPorNombreTipoCosteo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoCosteo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoCosteo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoCosteo.indexOfComponent(this.jPanelBusquedaPorNombreTipoCosteo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCosteo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipocosteoConstantesFunciones.mostrarBusquedaPorNombreTipoCosteo);
			if(!this.tipocosteoConstantesFunciones.mostrarBusquedaPorNombreTipoCosteo && index>-1) {
				this.jTabbedPaneBusquedasTipoCosteo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoCosteo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoCosteo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoCosteo.indexOfComponent(this.jPanelBusquedaPorNombreTipoCosteo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCosteo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipocosteoConstantesFunciones.activarBusquedaPorNombreTipoCosteo);
				this.jTabbedPaneBusquedasTipoCosteo.setEnabledAt(index,this.tipocosteoConstantesFunciones.activarBusquedaPorNombreTipoCosteo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoCosteo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoCosteo.indexOfComponent(this.jPanelBusquedaPorNombreTipoCosteo);

			this.jTabbedPaneBusquedasTipoCosteo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCosteo.getComponent(index);

			this.tipocosteoConstantesFunciones.setResaltarBusquedaPorNombreTipoCosteo(resaltar);

			jPanel.setBorder(this.tipocosteoConstantesFunciones.resaltarBusquedaPorNombreTipoCosteo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoCosteo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoCosteo() throws Exception {

		if(this.jInternalFrameDetalleFormTipoCosteo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoCosteo();
		this.updateVisibilidadResaltarControlesFormularioTipoCosteo();
		this.updateHabilitarResaltarControlesFormularioTipoCosteo();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoCosteo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCosteo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocosteoConstantesFunciones.resaltaridTipoCosteo!=null && this.jInternalFrameDetalleFormTipoCosteo!=null) {this.jInternalFrameDetalleFormTipoCosteo.jTextFieldidTipoCosteo.setBorder(this.tipocosteoConstantesFunciones.resaltaridTipoCosteo);}
		if(this.tipocosteoConstantesFunciones.resaltarnombreTipoCosteo!=null && this.jInternalFrameDetalleFormTipoCosteo!=null) {this.jInternalFrameDetalleFormTipoCosteo.jTextAreanombreTipoCosteo.setBorder(this.tipocosteoConstantesFunciones.resaltarnombreTipoCosteo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoCosteo() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoCosteo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) {
	
		//this.jInternalFrameDetalleFormTipoCosteo.jTextFieldidTipoCosteo.setVisible(this.tipocosteoConstantesFunciones.mostraridTipoCosteo);
		this.jInternalFrameDetalleFormTipoCosteo.jPanelidTipoCosteo.setVisible(this.tipocosteoConstantesFunciones.mostraridTipoCosteo);
		//this.jInternalFrameDetalleFormTipoCosteo.jTextAreanombreTipoCosteo.setVisible(this.tipocosteoConstantesFunciones.mostrarnombreTipoCosteo);
		this.jInternalFrameDetalleFormTipoCosteo.jPanelnombreTipoCosteo.setVisible(this.tipocosteoConstantesFunciones.mostrarnombreTipoCosteo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoCosteo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCosteo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCosteo!=null) {
	
		this.jInternalFrameDetalleFormTipoCosteo.jTextFieldidTipoCosteo.setEnabled(this.tipocosteoConstantesFunciones.activaridTipoCosteo);
		this.jInternalFrameDetalleFormTipoCosteo.jTextAreanombreTipoCosteo.setEnabled(this.tipocosteoConstantesFunciones.activarnombreTipoCosteo);
		}
	}
	
		
}