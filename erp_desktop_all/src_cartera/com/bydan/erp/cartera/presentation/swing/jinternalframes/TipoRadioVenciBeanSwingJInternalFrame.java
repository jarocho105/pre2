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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.TipoRadioVenciConstantesFunciones;
import com.bydan.erp.cartera.util.TipoRadioVenciParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoRadioVenciParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoRadioVenciBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
public class TipoRadioVenciBeanSwingJInternalFrame extends TipoRadioVenciJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoRadioVenciBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoRadioVenci> tiporadiovenciValidator = new ClassValidator<TipoRadioVenci>(TipoRadioVenci.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoRadioVenci tiporadiovenci;	
	public TipoRadioVenci tiporadiovenciAux;
	public TipoRadioVenci tiporadiovenciAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoRadioVenci tiporadiovenciTotales;
	public Long idTipoRadioVenciActual;
	public Long iIdNuevoTipoRadioVenci=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosRadioVenciProve=false;

	public Boolean getIsTienePermisosRadioVenciProve() {
		return isTienePermisosRadioVenciProve;
	}

	public void setIsTienePermisosRadioVenciProve(Boolean isTienePermisosRadioVenciProve) {
		this.isTienePermisosRadioVenciProve= isTienePermisosRadioVenciProve;
	}


	public Boolean isTienePermisosRadioVenciClienteProve=false;

	public Boolean getIsTienePermisosRadioVenciClienteProve() {
		return isTienePermisosRadioVenciClienteProve;
	}

	public void setIsTienePermisosRadioVenciClienteProve(Boolean isTienePermisosRadioVenciClienteProve) {
		this.isTienePermisosRadioVenciClienteProve= isTienePermisosRadioVenciClienteProve;
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
	
	public Boolean isPermisoTodoTipoRadioVenci;
	public Boolean isPermisoNuevoTipoRadioVenci;
	public Boolean isPermisoActualizarTipoRadioVenci;
	public Boolean isPermisoActualizarOriginalTipoRadioVenci;
	public Boolean isPermisoEliminarTipoRadioVenci;
	public Boolean isPermisoGuardarCambiosTipoRadioVenci;
	public Boolean isPermisoConsultaTipoRadioVenci;
	public Boolean isPermisoBusquedaTipoRadioVenci;
	public Boolean isPermisoReporteTipoRadioVenci;
	public Boolean isPermisoPaginacionMedioTipoRadioVenci;
	public Boolean isPermisoPaginacionAltoTipoRadioVenci;
	public Boolean isPermisoPaginacionTodoTipoRadioVenci;
	public Boolean isPermisoCopiarTipoRadioVenci;
	public Boolean isPermisoVerFormTipoRadioVenci;
	public Boolean isPermisoDuplicarTipoRadioVenci;
	public Boolean isPermisoOrdenTipoRadioVenci;
	
	
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
	
	public TipoRadioVenciParameterReturnGeneral tiporadiovenciReturnGeneral;
	public TipoRadioVenciParameterReturnGeneral tiporadiovenciParameterGeneral;
	
	

	public RadioVenciProveLogic radiovenciproveLogic=null;

	public RadioVenciProveLogic getRadioVenciProveLogic() {
		return radiovenciproveLogic;
	}

	public void setRadioVenciProveLogic(RadioVenciProveLogic radiovenciproveLogic) {
		this.radiovenciproveLogic = radiovenciproveLogic;
	}


	public RadioVenciClienteProveLogic radiovenciclienteproveLogic=null;

	public RadioVenciClienteProveLogic getRadioVenciClienteProveLogic() {
		return radiovenciclienteproveLogic;
	}

	public void setRadioVenciClienteProveLogic(RadioVenciClienteProveLogic radiovenciclienteproveLogic) {
		this.radiovenciclienteproveLogic = radiovenciclienteproveLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoRadioVenci=false;
	public Boolean esParaAccionDesdeFormularioTipoRadioVenci=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoRadioVenciLogic tiporadiovenciLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoRadioVenci tiporadiovenciBean;
	public TipoRadioVenciConstantesFunciones tiporadiovenciConstantesFunciones;
	//public TipoRadioVenciParameterReturnGeneral tiporadiovenciReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoRadioVenci> tiporadiovencis;	
	//public List<TipoRadioVenci> tiporadiovencisEliminados;
	//public List<TipoRadioVenci> tiporadiovencisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoRadioVenci=false;
	public Boolean isVisibilidadCeldaDuplicarTipoRadioVenci=true;
	public Boolean isVisibilidadCeldaCopiarTipoRadioVenci=true;
	public Boolean isVisibilidadCeldaVerFormTipoRadioVenci=true;
	public Boolean isVisibilidadCeldaOrdenTipoRadioVenci=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoRadioVenci=false;
	public Boolean isVisibilidadCeldaModificarTipoRadioVenci=false;
	public Boolean isVisibilidadCeldaActualizarTipoRadioVenci=false;
	public Boolean isVisibilidadCeldaEliminarTipoRadioVenci=false;
	public Boolean isVisibilidadCeldaCancelarTipoRadioVenci=false;
	public Boolean isVisibilidadCeldaGuardarTipoRadioVenci=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoRadioVenci=false;	
	
	
	
	public Long getiIdNuevoTipoRadioVenci() {
		return this.iIdNuevoTipoRadioVenci;
	}

	public void setiIdNuevoTipoRadioVenci(Long iIdNuevoTipoRadioVenci) {
		this.iIdNuevoTipoRadioVenci = iIdNuevoTipoRadioVenci;
	}
	
	public Long getidTipoRadioVenciActual() {
		return this.idTipoRadioVenciActual;
	}

	public void setidTipoRadioVenciActual(Long idTipoRadioVenciActual) {
		this.idTipoRadioVenciActual = idTipoRadioVenciActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoRadioVenci gettiporadiovenci() {
		return this.tiporadiovenci;
	}

	public void settiporadiovenci(TipoRadioVenci tiporadiovenci) {
		this.tiporadiovenci = tiporadiovenci;
	}
	
	public TipoRadioVenci gettiporadiovenciAux() {
		return this.tiporadiovenciAux;
	}

	public void settiporadiovenciAux(TipoRadioVenci tiporadiovenciAux) {
		this.tiporadiovenciAux = tiporadiovenciAux;
	}				
	
	public TipoRadioVenci gettiporadiovenciAnterior() {
		return this.tiporadiovenciAnterior;
	}

	public void settiporadiovenciAnterior(TipoRadioVenci tiporadiovenciAnterior) {
		this.tiporadiovenciAnterior = tiporadiovenciAnterior;
	}	
	
	public TipoRadioVenci gettiporadiovenciTotales() {
		return this.tiporadiovenciTotales;
	}

	public void settiporadiovenciTotales(TipoRadioVenci tiporadiovenciTotales) {
		this.tiporadiovenciTotales = tiporadiovenciTotales;
	}	
	
	public TipoRadioVenci gettiporadiovenciBean() {
		return this.tiporadiovenciBean;
	}

	public void settiporadiovenciBean(TipoRadioVenci tiporadiovenciBean) {
		this.tiporadiovenciBean = tiporadiovenciBean;
	}	
	
	public TipoRadioVenciParameterReturnGeneral gettiporadiovenciReturnGeneral() {
		return this.tiporadiovenciReturnGeneral;
	}

	public void settiporadiovenciReturnGeneral(TipoRadioVenciParameterReturnGeneral tiporadiovenciReturnGeneral) {
		this.tiporadiovenciReturnGeneral = tiporadiovenciReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoRadioVenciLogic getTipoRadioVenciLogic()	{		
		return tiporadiovenciLogic;
	}

	public void setTipoRadioVenciLogic(TipoRadioVenciLogic tiporadiovenciLogic) {
		this.tiporadiovenciLogic = tiporadiovenciLogic;
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
	
	public Boolean getIsEsNuevoTipoRadioVenci() {
		return isEsNuevoTipoRadioVenci;
	}

	public void setIsEsNuevoTipoRadioVenci(Boolean isEsNuevoTipoRadioVenci) {
		this.isEsNuevoTipoRadioVenci = isEsNuevoTipoRadioVenci;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoRadioVenci() {
		return esParaAccionDesdeFormularioTipoRadioVenci;
	}
	
	public void setEsParaAccionDesdeFormularioTipoRadioVenci(Boolean esParaAccionDesdeFormularioTipoRadioVenci) {
		this.esParaAccionDesdeFormularioTipoRadioVenci = esParaAccionDesdeFormularioTipoRadioVenci;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoRadioVenci() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoRadioVenciConstantesFunciones.refrescarForeignKeysDescripcionesTipoRadioVenci(this.tiporadiovenciLogic.getTipoRadioVencis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoRadioVenciConstantesFunciones.refrescarForeignKeysDescripcionesTipoRadioVenci(this.tiporadiovencis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tiporadiovenciLogic.setTipoRadioVencis(this.tiporadiovencis);
			tiporadiovenciLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoRadioVenciParameterReturnGeneral getTipoRadioVenciParameterGeneral() {
		return this.tiporadiovenciParameterGeneral;
	}
	
	public void setTipoRadioVenciParameterGeneral(TipoRadioVenciParameterReturnGeneral tiporadiovenciParameterGeneral) {
		this.tiporadiovenciParameterGeneral = tiporadiovenciParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoRadioVenci() {
		return isPermisoTodoTipoRadioVenci;
	}

	public void setIsPermisoTodoTipoRadioVenci(Boolean isPermisoTodoTipoRadioVenci) {
		this.isPermisoTodoTipoRadioVenci = isPermisoTodoTipoRadioVenci;
	}

	public Boolean getIsPermisoNuevoTipoRadioVenci() {
		return isPermisoNuevoTipoRadioVenci;
	}

	public void setIsPermisoNuevoTipoRadioVenci(Boolean isPermisoNuevoTipoRadioVenci) {
		this.isPermisoNuevoTipoRadioVenci = isPermisoNuevoTipoRadioVenci;
	}

	public Boolean getIsPermisoActualizarTipoRadioVenci() {
		return isPermisoActualizarTipoRadioVenci;
	}

	public void setIsPermisoActualizarTipoRadioVenci(Boolean isPermisoActualizarTipoRadioVenci) {
		this.isPermisoActualizarTipoRadioVenci = isPermisoActualizarTipoRadioVenci;
	}

	public Boolean getIsPermisoEliminarTipoRadioVenci() {
		return isPermisoEliminarTipoRadioVenci;
	}

	public void setIsPermisoEliminarTipoRadioVenci(Boolean isPermisoEliminarTipoRadioVenci) {
		this.isPermisoEliminarTipoRadioVenci = isPermisoEliminarTipoRadioVenci;
	}

	public Boolean getIsPermisoGuardarCambiosTipoRadioVenci() {
		return isPermisoGuardarCambiosTipoRadioVenci;
	}

	public void setIsPermisoGuardarCambiosTipoRadioVenci(Boolean isPermisoGuardarCambiosTipoRadioVenci) {
		this.isPermisoGuardarCambiosTipoRadioVenci = isPermisoGuardarCambiosTipoRadioVenci;
	}
	
	public Boolean getIsPermisoConsultaTipoRadioVenci() {
		return isPermisoConsultaTipoRadioVenci;
	}

	public void setIsPermisoConsultaTipoRadioVenci(Boolean isPermisoConsultaTipoRadioVenci) {
		this.isPermisoConsultaTipoRadioVenci = isPermisoConsultaTipoRadioVenci;
	}

	public Boolean getIsPermisoBusquedaTipoRadioVenci() {
		return isPermisoBusquedaTipoRadioVenci;
	}

	public void setIsPermisoBusquedaTipoRadioVenci(Boolean isPermisoBusquedaTipoRadioVenci) {
		this.isPermisoBusquedaTipoRadioVenci = isPermisoBusquedaTipoRadioVenci;
	}

	public Boolean getIsPermisoReporteTipoRadioVenci() {
		return isPermisoReporteTipoRadioVenci;
	}

	public void setIsPermisoReporteTipoRadioVenci(Boolean isPermisoReporteTipoRadioVenci) {
		this.isPermisoReporteTipoRadioVenci = isPermisoReporteTipoRadioVenci;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoRadioVenci() {
		return isPermisoPaginacionMedioTipoRadioVenci;
	}

	public void setIsPermisoPaginacionMedioTipoRadioVenci(Boolean isPermisoPaginacionMedioTipoRadioVenci) {
		this.isPermisoPaginacionMedioTipoRadioVenci = isPermisoPaginacionMedioTipoRadioVenci;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoRadioVenci() {
		return isPermisoPaginacionTodoTipoRadioVenci;
	}

	public void setIsPermisoPaginacionTodoTipoRadioVenci(Boolean isPermisoPaginacionTodoTipoRadioVenci) {
		this.isPermisoPaginacionTodoTipoRadioVenci = isPermisoPaginacionTodoTipoRadioVenci;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoRadioVenci() {
		return isPermisoPaginacionAltoTipoRadioVenci;
	}

	public void setIsPermisoPaginacionAltoTipoRadioVenci(Boolean isPermisoPaginacionAltoTipoRadioVenci) {
		this.isPermisoPaginacionAltoTipoRadioVenci = isPermisoPaginacionAltoTipoRadioVenci;
	}
	
	public Boolean getIsPermisoCopiarTipoRadioVenci() {
		return isPermisoCopiarTipoRadioVenci;
	}

	public void setIsPermisoCopiarTipoRadioVenci(Boolean isPermisoCopiarTipoRadioVenci) {
		this.isPermisoCopiarTipoRadioVenci = isPermisoCopiarTipoRadioVenci;
	}
	
	public Boolean getIsPermisoVerFormTipoRadioVenci() {
		return isPermisoVerFormTipoRadioVenci;
	}

	public void setIsPermisoVerFormTipoRadioVenci(Boolean isPermisoVerFormTipoRadioVenci) {
		this.isPermisoVerFormTipoRadioVenci = isPermisoVerFormTipoRadioVenci;
	}
	
	public Boolean getIsPermisoDuplicarTipoRadioVenci() {
		return isPermisoDuplicarTipoRadioVenci;
	}

	public void setIsPermisoDuplicarTipoRadioVenci(Boolean isPermisoDuplicarTipoRadioVenci) {
		this.isPermisoDuplicarTipoRadioVenci = isPermisoDuplicarTipoRadioVenci;
	}
	
	public Boolean getIsPermisoOrdenTipoRadioVenci() {
		return isPermisoOrdenTipoRadioVenci;
	}

	public void setIsPermisoOrdenTipoRadioVenci(Boolean isPermisoOrdenTipoRadioVenci) {
		this.isPermisoOrdenTipoRadioVenci = isPermisoOrdenTipoRadioVenci;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoRadioVenci() {
		return isVisibilidadCeldaNuevoTipoRadioVenci;
	}

	public void setIsVisibilidadCeldaNuevoTipoRadioVenci(Boolean isVisibilidadCeldaNuevoTipoRadioVenci) {
		this.isVisibilidadCeldaNuevoTipoRadioVenci = isVisibilidadCeldaNuevoTipoRadioVenci;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoRadioVenci() {
		return isVisibilidadCeldaDuplicarTipoRadioVenci;
	}

	public void setIsVisibilidadCeldaDuplicarTipoRadioVenci(Boolean isVisibilidadCeldaDuplicarTipoRadioVenci) {
		this.isVisibilidadCeldaDuplicarTipoRadioVenci = isVisibilidadCeldaDuplicarTipoRadioVenci;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoRadioVenci() {
		return isVisibilidadCeldaCopiarTipoRadioVenci;
	}

	public void setIsVisibilidadCeldaCopiarTipoRadioVenci(Boolean isVisibilidadCeldaCopiarTipoRadioVenci) {
		this.isVisibilidadCeldaCopiarTipoRadioVenci = isVisibilidadCeldaCopiarTipoRadioVenci;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoRadioVenci() {
		return isVisibilidadCeldaVerFormTipoRadioVenci;
	}

	public void setIsVisibilidadCeldaVerFormTipoRadioVenci(Boolean isVisibilidadCeldaVerFormTipoRadioVenci) {
		this.isVisibilidadCeldaVerFormTipoRadioVenci = isVisibilidadCeldaVerFormTipoRadioVenci;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoRadioVenci() {
		return isVisibilidadCeldaOrdenTipoRadioVenci;
	}

	public void setIsVisibilidadCeldaOrdenTipoRadioVenci(Boolean isVisibilidadCeldaOrdenTipoRadioVenci) {
		this.isVisibilidadCeldaOrdenTipoRadioVenci = isVisibilidadCeldaOrdenTipoRadioVenci;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoRadioVenci() {
		return isVisibilidadCeldaNuevoRelacionesTipoRadioVenci;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoRadioVenci(Boolean isVisibilidadCeldaNuevoRelacionesTipoRadioVenci) {
		this.isVisibilidadCeldaNuevoRelacionesTipoRadioVenci = isVisibilidadCeldaNuevoRelacionesTipoRadioVenci;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoRadioVenci() {
		return isVisibilidadCeldaModificarTipoRadioVenci;
	}

	public void setIsVisibilidadCeldaModificarTipoRadioVenci(Boolean isVisibilidadCeldaModificarTipoRadioVenci) {
		this.isVisibilidadCeldaModificarTipoRadioVenci = isVisibilidadCeldaModificarTipoRadioVenci;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoRadioVenci() {
		return isVisibilidadCeldaActualizarTipoRadioVenci;
	}

	public void setIsVisibilidadCeldaActualizarTipoRadioVenci(Boolean isVisibilidadCeldaActualizarTipoRadioVenci) {
		this.isVisibilidadCeldaActualizarTipoRadioVenci = isVisibilidadCeldaActualizarTipoRadioVenci;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoRadioVenci() {
		return isVisibilidadCeldaEliminarTipoRadioVenci;
	}

	public void setIsVisibilidadCeldaEliminarTipoRadioVenci(Boolean isVisibilidadCeldaEliminarTipoRadioVenci) {
		this.isVisibilidadCeldaEliminarTipoRadioVenci = isVisibilidadCeldaEliminarTipoRadioVenci;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoRadioVenci() {
		return isVisibilidadCeldaCancelarTipoRadioVenci;
	}

	public void setIsVisibilidadCeldaCancelarTipoRadioVenci(Boolean isVisibilidadCeldaCancelarTipoRadioVenci) {
		this.isVisibilidadCeldaCancelarTipoRadioVenci = isVisibilidadCeldaCancelarTipoRadioVenci;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoRadioVenci() {
		return isVisibilidadCeldaGuardarTipoRadioVenci;
	}

	public void setIsVisibilidadCeldaGuardarTipoRadioVenci(Boolean isVisibilidadCeldaGuardarTipoRadioVenci) {
		this.isVisibilidadCeldaGuardarTipoRadioVenci = isVisibilidadCeldaGuardarTipoRadioVenci;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoRadioVenci() {
		return isVisibilidadCeldaGuardarCambiosTipoRadioVenci;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoRadioVenci(Boolean isVisibilidadCeldaGuardarCambiosTipoRadioVenci) {
		this.isVisibilidadCeldaGuardarCambiosTipoRadioVenci = isVisibilidadCeldaGuardarCambiosTipoRadioVenci;
	}
		
	public TipoRadioVenciSessionBean gettiporadiovenciSessionBean() {
		return this.tiporadiovenciSessionBean;
	}
	
	public void settiporadiovenciSessionBean(TipoRadioVenciSessionBean tiporadiovenciSessionBean) {
		this.tiporadiovenciSessionBean=tiporadiovenciSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoRadioVenci(TipoRadioVenci tiporadiovenci)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoRadioVenci tiporadiovenci,TipoRadioVenci tiporadiovenciAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoRadioVenci(tiporadiovenci);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tiporadiovenciAux.setId(tiporadiovenci.getId());
		tiporadiovenciAux.setVersionRow(tiporadiovenci.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoRadioVenci();
		
			int intSelectedRow = this.jTableDatosTipoRadioVenci.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenci =(TipoRadioVenci) this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tiporadiovenci =(TipoRadioVenci) this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoRadioVenciJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoRadioVenci(this.tiporadiovenci,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRadioVenci(this.tiporadiovenci);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tiporadiovenciValidator.getInvalidValues(this.tiporadiovenci);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tiporadiovenciLogic.setDatosCliente(datosCliente);
			tiporadiovenciLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tiporadiovenciAux=new  TipoRadioVenci();
				
				tiporadiovenciAux.setIsNew(true);
				tiporadiovenciAux.setIsChanged(true);
				
				tiporadiovenciAux.setTipoRadioVenciOriginal(this.tiporadiovenci);
				
				tiporadiovenciAux.setId(this.tiporadiovenci.getId());	
				tiporadiovenciAux.setVersionRow(this.tiporadiovenci.getVersionRow());	
				tiporadiovenciAux.setnombre(this.tiporadiovenci.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporadiovenciSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporadiovenciSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tiporadiovenciAux,tiporadiovenciLogic.getTipoRadioVencis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporadiovenciAux,tiporadiovencis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tiporadiovenciSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporadiovenciSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporadiovenciLogic.saveTipoRadioVencis();//WithConnection
						//tiporadiovenciLogic.getSetVersionRowTipoRadioVencis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporadiovenci,tiporadiovenciAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporadiovenciSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tiporadiovenciAux=new  TipoRadioVenci();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tiporadiovenciSessionBean.getEsGuardarRelacionado() 
					|| (this.tiporadiovenciSessionBean.getEsGuardarRelacionado() && this.tiporadiovenci.getId()>=0)) {
						
					tiporadiovenciAux.setIsNew(false);
				}
				
				tiporadiovenciAux.setIsDeleted(false);
			
				tiporadiovenciAux.setId(this.tiporadiovenci.getId());	
				tiporadiovenciAux.setVersionRow(this.tiporadiovenci.getVersionRow());	
				tiporadiovenciAux.setnombre(this.tiporadiovenci.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporadiovenciAux,tiporadiovenciLogic.getTipoRadioVencis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporadiovenciAux,tiporadiovencis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tiporadiovenciSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporadiovenciSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporadiovenciLogic.saveTipoRadioVencis();//WithConnection
						//tiporadiovenciLogic.getSetVersionRowTipoRadioVencis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporadiovenci,tiporadiovenciAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporadiovenciSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tiporadiovenciAux=new  TipoRadioVenci();
				
				tiporadiovenciAux.setIsNew(false);
				tiporadiovenciAux.setIsChanged(false);
				
				tiporadiovenciAux.setIsDeleted(true);
				
				tiporadiovenciAux.setId(this.tiporadiovenci.getId());	
				tiporadiovenciAux.setVersionRow(this.tiporadiovenci.getVersionRow());	
				tiporadiovenciAux.setnombre(this.tiporadiovenci.getnombre());	
				
				if(this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tiporadiovenciAux.getId()>=0) {	
						this.tiporadiovencisEliminados.add(tiporadiovenciAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tiporadiovenciAux,tiporadiovenciLogic.getTipoRadioVencis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporadiovenciAux,tiporadiovencis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tiporadiovenciSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporadiovenciSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporadiovenciLogic.saveTipoRadioVencis();//WithConnection
						//tiporadiovenciLogic.getSetVersionRowTipoRadioVencis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporadiovenciSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame.quitarFilaTotales();}
							tiporadiovenciAux.setRadioVenciProves(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame.radiovenciproveLogic.getRadioVenciProves());

							if(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame.quitarFilaTotales();}
							tiporadiovenciAux.setRadioVenciClienteProves(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame.radiovenciclienteproveLogic.getRadioVenciClienteProves());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tiporadiovenciSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tiporadiovenciSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tiporadiovenciAux,tiporadiovenciLogic.getTipoRadioVencis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tiporadiovenciAux,tiporadiovencis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenciLogic.getTipoRadioVencis().addAll(this.tiporadiovencisEliminados);
					
					tiporadiovenciLogic.saveTipoRadioVencis();//WithConnection
					//tiporadiovenciLogic.getSetVersionRowTipoRadioVencis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tiporadiovencisEliminados= new ArrayList<TipoRadioVenci>();		
			}
			
			if(this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Radio Venci GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Radio Venci",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tiporadiovenci=tiporadiovenciAux;
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
      		//this.finishProcessTipoRadioVenci();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoRadioVenci tiporadiovenciLocal) throws Exception {
		
		if(this.tiporadiovenciSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tiporadiovenciLocal.setRadioVenciProves(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame.radiovenciproveLogic.getRadioVenciProves());
				tiporadiovenciLocal.setRadioVenciClienteProves(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame.radiovenciclienteproveLogic.getRadioVenciClienteProves());
			
			} else {
			
				tiporadiovenciLocal.setRadioVenciProves(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame.radiovenciproves);
				tiporadiovenciLocal.setRadioVenciClienteProves(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame.radiovenciclienteproves);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoRadioVenci tiporadiovenciLocal) throws Exception {	
		if(this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoRadioVenciActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoRadioVenci.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporadiovenci =(TipoRadioVenci) this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tiporadiovenci =(TipoRadioVenci) this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tiporadiovenciValidator.getInvalidValues(this.tiporadiovenci);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoRadioVenci tiporadiovenci,List<TipoRadioVenci> tiporadiovencis) throws Exception {
		try	{		
			TipoRadioVenciConstantesFunciones.actualizarLista(tiporadiovenci,tiporadiovencis,this.tiporadiovenciSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoRadioVenci tiporadiovenci,List<TipoRadioVenci> tiporadiovencis) throws Exception {
		try	{			
			TipoRadioVenciConstantesFunciones.actualizarSelectedLista(tiporadiovenci,tiporadiovencis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoRadioVenci> tiporadiovencisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tiporadiovencisLocal=this.tiporadiovenciLogic.getTipoRadioVencis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tiporadiovencisLocal=this.tiporadiovencis;
			}
			//ARCHITECTURE
		
			for(TipoRadioVenci tiporadiovenciLocal:tiporadiovencisLocal) {
				if(this.permiteMantenimiento(tiporadiovenciLocal) && tiporadiovenciLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoRadioVenciConstantesFunciones.getTipoRadioVenciLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoRadioVenciConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRadioVenci.jLabelnombreTipoRadioVenci,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRadioVenci.jLabelnombreTipoRadioVenci,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("RadioVenciProve")) {
			if(this.tiporadiovenci==null) {
				this.tiporadiovenci= new TipoRadioVenci();
			}

			if(this.tiporadiovenciSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoRadioVenci
				this.setVariablesFormularioToObjetoActualTipoRadioVenci(this.tiporadiovenci,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRadioVenci(this.tiporadiovenci);

				this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame.getradiovenciprove().setTipoRadioVenci(this.tiporadiovenci);
			}

			return;
		}
		 else  if(sTipo.equals("RadioVenciClienteProve")) {
			if(this.tiporadiovenci==null) {
				this.tiporadiovenci= new TipoRadioVenci();
			}

			if(this.tiporadiovenciSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoRadioVenci
				this.setVariablesFormularioToObjetoActualTipoRadioVenci(this.tiporadiovenci,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRadioVenci(this.tiporadiovenci);

				this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame.getradiovenciclienteprove().setTipoRadioVenci(this.tiporadiovenci);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoRadioVenci--;	
		
		
		this.tiporadiovenciAux=new TipoRadioVenci();
		
		this.tiporadiovenciAux.setId(this.iIdNuevoTipoRadioVenci);
		this.tiporadiovenciAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporadiovenciLogic.getTipoRadioVencis().add(this.tiporadiovenciAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tiporadiovencis.add(this.tiporadiovenciAux);
		}
		//ARCHITECTURE
		
		this.tiporadiovenci=this.tiporadiovenciAux;
		
		if(TipoRadioVenciJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoRadioVenci(this.tiporadiovenci);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRadioVenci(this.tiporadiovenci);
		}
				
		//this.setDefaultControlesTipoRadioVenci();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoRadioVenci();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoRadioVenci();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRadioVenci();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRadioVenci(this.tiporadiovenciBean,this.tiporadiovenci,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRadioVenci(this.tiporadiovenci);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoRadioVenciConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tiporadiovenciSessionBean.getConGuardarRelaciones()) {
			classes=TipoRadioVenciConstantesFunciones.getClassesRelationshipsOfTipoRadioVenci(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tiporadiovenciReturnGeneral=tiporadiovenciLogic.procesarEventosTipoRadioVencisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporadiovenciLogic.getTipoRadioVencis(),this.tiporadiovenci,this.tiporadiovenciParameterGeneral,this.isEsNuevoTipoRadioVenci,classes);//this.tiporadiovenciLogic.getTipoRadioVenci()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoRadioVenci(this.tiporadiovenciReturnGeneral,this.tiporadiovenciBean,false);
		
		if(this.tiporadiovenciReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRadioVenci(this.tiporadiovenciReturnGeneral.getTipoRadioVenci());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoRadioVenci(this.tiporadiovenciReturnGeneral.getTipoRadioVenci());
		}
		
		if(this.tiporadiovenciReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoRadioVenci(this.tiporadiovenciReturnGeneral.getTipoRadioVenci(),classes);//this.tiporadiovenciBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoRadioVenci(this.tiporadiovenci,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoRadioVenci();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoRadioVenci();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoRadioVenci(false);
						
			if(tiporadiovenciSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame.radiovenciproveSessionBean.getEsGuardarRelacionado() && RadioVenciProveJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRadioVenciProveActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame.radiovenciclienteproveSessionBean.getEsGuardarRelacionado() && RadioVenciClienteProveJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRadioVenciClienteProveActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoRadioVenciJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRadioVenci();
			}
			
			this.actualizarVisualTableDatosTipoRadioVenci();
			
			this.jTableDatosTipoRadioVenci.setRowSelectionInterval(this.getIndiceNuevoTipoRadioVenci(), this.getIndiceNuevoTipoRadioVenci());
			
			this.seleccionarFilaTablaTipoRadioVenciActual();
						
			this.actualizarEstadoCeldasBotonesTipoRadioVenci("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoRadioVenci(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoRadioVenci.jTextAreanombreTipoRadioVenci.setEnabled(isHabilitar && this.tiporadiovenciConstantesFunciones.activarnombreTipoRadioVenci);	
		
	};
	
	public void setDefaultControlesTipoRadioVenci() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoRadioVenci(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tiporadiovenciSessionBean.setConGuardarRelaciones(true);			
			this.tiporadiovenciSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoRadioVenci.jTabbedPaneRelacionesTipoRadioVenci.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame.radiovenciproveSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame.radiovenciclienteproveSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tiporadiovenciSessionBean.setConGuardarRelaciones(false);			
			this.tiporadiovenciSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoRadioVenci.jTabbedPaneRelacionesTipoRadioVenci.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame.radiovenciproveSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame.radiovenciclienteproveSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoRadioVenci() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRadioVenci tiporadiovenciAux:this.tiporadiovenciLogic.getTipoRadioVencis()) {
				if(tiporadiovenciAux.getId().equals(this.iIdNuevoTipoRadioVenci)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRadioVenci tiporadiovenciAux:this.tiporadiovencis) {
				if(tiporadiovenciAux.getId().equals(this.iIdNuevoTipoRadioVenci)) {
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
	
	public int getIndiceActualTipoRadioVenci(TipoRadioVenci tiporadiovenci,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRadioVenci tiporadiovenciAux:this.tiporadiovenciLogic.getTipoRadioVencis()) {
				if(tiporadiovenciAux.getId().equals(tiporadiovenci.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRadioVenci tiporadiovenciAux:this.tiporadiovencis) {
				if(tiporadiovenciAux.getId().equals(tiporadiovenci.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoRadioVenci(TipoRadioVenci tiporadiovenciOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRadioVenci tiporadiovenciAux:this.tiporadiovenciLogic.getTipoRadioVencis()) {
				if(tiporadiovenciAux.getTipoRadioVenciOriginal().getId().equals(tiporadiovenciOriginal.getId())) {
					existe=true;
					tiporadiovenciOriginal.setId(tiporadiovenciAux.getId());
					tiporadiovenciOriginal.setVersionRow(tiporadiovenciAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRadioVenci tiporadiovenciAux:this.tiporadiovencis) {
				if(tiporadiovenciAux.getTipoRadioVenciOriginal().getId().equals(tiporadiovenciOriginal.getId())) {
					existe=true;
					tiporadiovenciOriginal.setId(tiporadiovenciAux.getId());
					tiporadiovenciOriginal.setVersionRow(tiporadiovenciAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoRadioVenci(Boolean esParaCancelar) throws Exception {
		tiporadiovencisAux=new ArrayList<TipoRadioVenci>();
		tiporadiovenciAux=new TipoRadioVenci();
		
		if(!this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRadioVenci tiporadiovenciAux:this.tiporadiovenciLogic.getTipoRadioVencis()) {
					if(tiporadiovenciAux.getId()<0) {
						tiporadiovencisAux.add(tiporadiovenciAux);
					}		
				}
				this.iIdNuevoTipoRadioVenci=0L;
				this.tiporadiovenciLogic.getTipoRadioVencis().removeAll(tiporadiovencisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRadioVenci tiporadiovenciAux:this.tiporadiovencis) {
					if(tiporadiovenciAux.getId()<0) {
						tiporadiovencisAux.add(tiporadiovenciAux);
					}		
				}
				this.iIdNuevoTipoRadioVenci=0L;
				this.tiporadiovencis.removeAll(tiporadiovencisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoRadioVenci 
					&& this.tiporadiovenciLogic.getTipoRadioVencis().size()>0
					) {
					tiporadiovenciAux=this.tiporadiovenciLogic.getTipoRadioVencis().get(this.tiporadiovenciLogic.getTipoRadioVencis().size() - 1);
				
					if(tiporadiovenciAux.getId()<0) {
						this.tiporadiovenciLogic.getTipoRadioVencis().remove(tiporadiovenciAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoRadioVenci && this.tiporadiovencis.size()>0) {
					tiporadiovenciAux=this.tiporadiovencis.get(this.tiporadiovencis.size() - 1);
				
					if(tiporadiovenciAux.getId()<0) {
						this.tiporadiovencis.remove(tiporadiovenciAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoRadioVenci(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tiporadiovenci.getId()<0) {
				this.tiporadiovenciLogic.getTipoRadioVencis().remove(this.tiporadiovenci);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tiporadiovenci.getId()<0) {
				this.tiporadiovencis.remove(this.tiporadiovenci);
			}
		}			
	}
	
	public void setEstadosInicialesTipoRadioVenci(List<TipoRadioVenci> tiporadiovencisAux) throws Exception {
		TipoRadioVenciConstantesFunciones.setEstadosInicialesTipoRadioVenci(tiporadiovencisAux);
	}
	
	public void setEstadosInicialesTipoRadioVenci(TipoRadioVenci tiporadiovenciAux) throws Exception {
		TipoRadioVenciConstantesFunciones.setEstadosInicialesTipoRadioVenci(tiporadiovenciAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoRadioVenciActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoRadioVenci("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoRadioVenciActual()) {
				if(!this.isEsNuevoTipoRadioVenci) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoRadioVenci("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoRadioVenci=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoRadioVenciActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Radio Venci ?", "MANTENIMIENTO DE Tipo Radio Venci", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoRadioVenci("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoRadioVenci tiporadiovenci) throws Exception {
		TipoRadioVenciConstantesFunciones.seleccionarAsignar(this.tiporadiovenci,tiporadiovenci);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoRadioVenci=this.isPermisoActualizarOriginalTipoRadioVenci;
			
			
			this.seleccionarAsignar(tiporadiovenci);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoRadioVenciConstantesFunciones.quitarEspaciosTipoRadioVenci(this.tiporadiovenci,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoRadioVenci("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tiporadiovenciSessionBean.setsFuncionBusquedaRapida(this.tiporadiovenciSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoRadioVenci) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoRadioVenci(esParaCancelar);				
				this.cancelarNuevoTipoRadioVenci(esParaCancelar);								
			}
			
			this.tiporadiovenci=new TipoRadioVenci();
			
			this.inicializarTipoRadioVenci();
			
			this.actualizarEstadoCeldasBotonesTipoRadioVenci("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoRadioVenci() throws Exception {
		try {
			TipoRadioVenciConstantesFunciones.inicializarTipoRadioVenci(this.tiporadiovenci);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tiporadiovenciLogic.getTipoRadioVencis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoRadioVencis(String sAccionBusqueda,List<TipoRadioVenci> tiporadiovencisParaReportes) throws Exception {
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
					sPathReporteFinal="TipoRadioVenci"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoRadioVenciMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoRadioVenciMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoRadioVenci"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Radio Vencis");		
		parameters.put("busquedapor", TipoRadioVenciConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(RadioVenciProve.class));
			classes.add(new Classe(RadioVenciClienteProve.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoRadioVenciLogic tiporadiovenciLogicAuxiliar=new TipoRadioVenciLogic();
					tiporadiovenciLogicAuxiliar.setDatosCliente(tiporadiovenciLogic.getDatosCliente());				
					tiporadiovenciLogicAuxiliar.setTipoRadioVencis(tiporadiovencisParaReportes);
					
					tiporadiovenciLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoRadioVenciWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tiporadiovencisParaReportes=tiporadiovenciLogicAuxiliar.getTipoRadioVencis();
					
					//tiporadiovenciLogic.getNewConnexionToDeep();
					
					//for (TipoRadioVenci tiporadiovenci:tiporadiovencisParaReportes) {
					//	tiporadiovenciLogic.deepLoad(tiporadiovenci, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tiporadiovenciLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tiporadiovenciLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileRadioVenciProve = AuxiliarReportes.class.getResourceAsStream("RadioVenciProveDetalleRelacionesDesign.jasper");
			parameters.put("subreport_radiovenciprove", reportFileRadioVenciProve);

			InputStream reportFileRadioVenciClienteProve = AuxiliarReportes.class.getResourceAsStream("RadioVenciClienteProveDetalleRelacionesDesign.jasper");
			parameters.put("subreport_radiovenciclienteprove", reportFileRadioVenciClienteProve);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoRadioVenci=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoRadioVenciConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoRadioVenciConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoRadioVenci=new JRBeanArrayDataSource(TipoRadioVenciJInternalFrame.TraerTipoRadioVenciBeans(tiporadiovencisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoRadioVenci);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoRadioVenciConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoRadioVenciConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoRadioVenciBean.TraerTipoRadioVenciBeans(tiporadiovencisParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoRadioVencis(sAccionBusqueda,sTipoArchivoReporte,tiporadiovencisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoRadioVencis(sAccionBusqueda,sTipoArchivoReporte,tiporadiovencisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoRadioVenciActionPerformed(null);
					//this.generarExcelReporteTipoRadioVencis(sAccionBusqueda,sTipoArchivoReporte,tiporadiovencisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoRadioVencis(sAccionBusqueda,sTipoArchivoReporte,tiporadiovencisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoRadioVencis(sAccionBusqueda,sTipoArchivoReporte,tiporadiovencisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoRadioVencis(sAccionBusqueda,sTipoArchivoReporte,tiporadiovencisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoRadioVencis(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRadioVenci> tiporadiovencisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporadiovenci";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRadioVencis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRadioVenci("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoRadioVenci tiporadiovenci : tiporadiovencisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoRadioVenciConstantesFunciones.generarExcelReporteDataTipoRadioVenci("NORMAL",row,workbook,tiporadiovenci,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Radio Venci",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoRadioVenci(String sTipo,Row row,Workbook workbook) {
		
		TipoRadioVenciConstantesFunciones.generarExcelReporteHeaderTipoRadioVenci(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoRadioVencis(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRadioVenci> tiporadiovencisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporadiovenci_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRadioVencis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoRadioVenci tiporadiovenci : tiporadiovencisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoRadioVenciConstantesFunciones.getTipoRadioVenciDescripcion(tiporadiovenci));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRadioVenciConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRadioVenciConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporadiovenci.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Radio Venci",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoRadioVencis(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRadioVenci> tiporadiovencisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoRadioVenci> tiporadiovencisRespaldo=null;
		
		classes=TipoRadioVenciConstantesFunciones.getClassesRelationshipsOfTipoRadioVenci(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tiporadiovenciLogic.setDatosCliente(this.datosCliente);
		this.tiporadiovenciLogic.setDatosDeep(this.datosDeep);
		this.tiporadiovenciLogic.setIsConDeep(true);
		
		tiporadiovencisRespaldo=this.tiporadiovenciLogic.getTipoRadioVencis();
		
		this.tiporadiovenciLogic.setTipoRadioVencis(tiporadiovencisParaReportes);	
		this.tiporadiovenciLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tiporadiovencisParaReportes=this.tiporadiovenciLogic.getTipoRadioVencis();
		this.tiporadiovenciLogic.setTipoRadioVencis(tiporadiovencisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporadiovenci_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRadioVencis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRadioVenci("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoRadioVenci tiporadiovenci : tiporadiovencisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoRadioVenci("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoRadioVenciConstantesFunciones.generarExcelReporteDataTipoRadioVenci("NORMAL",row,workbook,tiporadiovenci,cellStyleDataAux);
		
			
			


				//RadioVenciProve
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(RadioVenciProveConstantesFunciones.SCLASSWEBTITULO))) {

				if(tiporadiovenci.getRadioVenciProves()!=null && tiporadiovenci.getRadioVenciProves().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(RadioVenciProveConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					RadioVenciProveConstantesFunciones.generarExcelReporteHeaderRadioVenciProve("RELACIONADO",row,workbook);
				}

				if(tiporadiovenci.getRadioVenciProves()!=null) {
					i2=0;
					for(RadioVenciProve radiovenciprove : tiporadiovenci.getRadioVenciProves()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						RadioVenciProveConstantesFunciones.generarExcelReporteDataRadioVenciProve("RELACIONADO",row,workbook,radiovenciprove,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//RadioVenciClienteProve
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO))) {

				if(tiporadiovenci.getRadioVenciClienteProves()!=null && tiporadiovenci.getRadioVenciClienteProves().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					RadioVenciClienteProveConstantesFunciones.generarExcelReporteHeaderRadioVenciClienteProve("RELACIONADO",row,workbook);
				}

				if(tiporadiovenci.getRadioVenciClienteProves()!=null) {
					i2=0;
					for(RadioVenciClienteProve radiovenciclienteprove : tiporadiovenci.getRadioVenciClienteProves()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						RadioVenciClienteProveConstantesFunciones.generarExcelReporteDataRadioVenciClienteProve("RELACIONADO",row,workbook,radiovenciclienteprove,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoRadioVenciConstantesFunciones.getTipoRadioVenciDescripcion(tiporadiovenci));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Radio Venci",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRadioVenci.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRadioVenci.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRadioVenci.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRadioVenci.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoRadioVenci() throws Exception {		
		this.startProcessTipoRadioVenci(true);
	}
	
	public void startProcessTipoRadioVenci(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoRadioVenci, this.jScrollPanelDatosTipoRadioVenci,this.jPanelPaginacionTipoRadioVenci, this.jScrollPanelDatosEdicionTipoRadioVenci, this.jPanelAccionesTipoRadioVenci,this.jPanelAccionesFormularioTipoRadioVenci,this.jmenuBarTipoRadioVenci,this.jmenuBarDetalleTipoRadioVenci,this.jTtoolBarTipoRadioVenci,this.jTtoolBarDetalleTipoRadioVenci);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRadioVenci=null; 
		
		final JPanel jPanelParametrosReportesTipoRadioVenci=this.jPanelParametrosReportesTipoRadioVenci;
		//final JScrollPane jScrollPanelDatosTipoRadioVenci=this.jScrollPanelDatosTipoRadioVenci;
		final JTable jTableDatosTipoRadioVenci=this.jTableDatosTipoRadioVenci;		
		final JPanel jPanelPaginacionTipoRadioVenci=this.jPanelPaginacionTipoRadioVenci;
		//final JScrollPane jScrollPanelDatosEdicionTipoRadioVenci=this.jScrollPanelDatosEdicionTipoRadioVenci;
		final JPanel jPanelAccionesTipoRadioVenci=this.jPanelAccionesTipoRadioVenci;
		
		JPanel jPanelCamposAuxiliarTipoRadioVenci=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoRadioVenci=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) {
			jPanelCamposAuxiliarTipoRadioVenci=this.jInternalFrameDetalleFormTipoRadioVenci.jPanelCamposTipoRadioVenci;
			jPanelAccionesFormularioAuxiliarTipoRadioVenci=this.jInternalFrameDetalleFormTipoRadioVenci.jPanelAccionesFormularioTipoRadioVenci;
		}
		
		final JPanel jPanelCamposTipoRadioVenci=jPanelCamposAuxiliarTipoRadioVenci;
		final JPanel jPanelAccionesFormularioTipoRadioVenci=jPanelAccionesFormularioAuxiliarTipoRadioVenci;
		
		
		final JMenuBar jmenuBarTipoRadioVenci=this.jmenuBarTipoRadioVenci;
		final JToolBar jTtoolBarTipoRadioVenci=this.jTtoolBarTipoRadioVenci;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoRadioVenci=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRadioVenci=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) {
			jmenuBarDetalleAuxiliarTipoRadioVenci=this.jInternalFrameDetalleFormTipoRadioVenci.jmenuBarDetalleTipoRadioVenci;
			jTtoolBarDetalleAuxiliarTipoRadioVenci=this.jInternalFrameDetalleFormTipoRadioVenci.jTtoolBarDetalleTipoRadioVenci;
		}
		
		final JMenuBar jmenuBarDetalleTipoRadioVenci=jmenuBarDetalleAuxiliarTipoRadioVenci;
		final JToolBar jTtoolBarDetalleTipoRadioVenci=jTtoolBarDetalleAuxiliarTipoRadioVenci;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRadioVenci;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRadioVenci;
			processRunnable.jTableDatos=jTableDatosTipoRadioVenci;
			processRunnable.jPanelCampos=jPanelCamposTipoRadioVenci;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRadioVenci;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRadioVenci;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRadioVenci;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRadioVenci;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRadioVenci;
			processRunnable.jTtoolBar=jTtoolBarTipoRadioVenci;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRadioVenci;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoRadioVenci ,jPanelParametrosReportesTipoRadioVenci,jTableDatosTipoRadioVenci, /*jScrollPanelDatosTipoRadioVenci,*/jPanelCamposTipoRadioVenci,jPanelPaginacionTipoRadioVenci, /*jScrollPanelDatosEdicionTipoRadioVenci,*/ jPanelAccionesTipoRadioVenci,jPanelAccionesFormularioTipoRadioVenci,jmenuBarTipoRadioVenci,jmenuBarDetalleTipoRadioVenci,jTtoolBarTipoRadioVenci,jTtoolBarDetalleTipoRadioVenci);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoRadioVenci, jScrollPanelDatosTipoRadioVenci,jPanelPaginacionTipoRadioVenci, jScrollPanelDatosEdicionTipoRadioVenci, jPanelAccionesTipoRadioVenci,jPanelAccionesFormularioTipoRadioVenci,jmenuBarTipoRadioVenci,jmenuBarDetalleTipoRadioVenci,jTtoolBarTipoRadioVenci,jTtoolBarDetalleTipoRadioVenci);
						
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
	
	public void finishProcessTipoRadioVenci() {// throws Exception 
		this.finishProcessTipoRadioVenci(true);
	}
	
	public void finishProcessTipoRadioVenci(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoRadioVenci, this.jScrollPanelDatosTipoRadioVenci,this.jPanelPaginacionTipoRadioVenci, this.jScrollPanelDatosEdicionTipoRadioVenci, this.jPanelAccionesTipoRadioVenci,this.jPanelAccionesFormularioTipoRadioVenci,this.jmenuBarTipoRadioVenci,this.jmenuBarDetalleTipoRadioVenci,this.jTtoolBarTipoRadioVenci,this.jTtoolBarDetalleTipoRadioVenci);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRadioVenci=null; 
		
		final JPanel jPanelParametrosReportesTipoRadioVenci=this.jPanelParametrosReportesTipoRadioVenci;
		//final JScrollPane jScrollPanelDatosTipoRadioVenci=this.jScrollPanelDatosTipoRadioVenci;
		final JTable jTableDatosTipoRadioVenci=this.jTableDatosTipoRadioVenci;		
		final JPanel jPanelPaginacionTipoRadioVenci=this.jPanelPaginacionTipoRadioVenci;
		//final JScrollPane jScrollPanelDatosEdicionTipoRadioVenci=this.jScrollPanelDatosEdicionTipoRadioVenci;
		final JPanel jPanelAccionesTipoRadioVenci=this.jPanelAccionesTipoRadioVenci;
		
		JPanel jPanelCamposAuxiliarTipoRadioVenci=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoRadioVenci=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) {
			jPanelCamposAuxiliarTipoRadioVenci=this.jInternalFrameDetalleFormTipoRadioVenci.jPanelCamposTipoRadioVenci;
			jPanelAccionesFormularioAuxiliarTipoRadioVenci=this.jInternalFrameDetalleFormTipoRadioVenci.jPanelAccionesFormularioTipoRadioVenci;
		}
		
		final JPanel jPanelCamposTipoRadioVenci=jPanelCamposAuxiliarTipoRadioVenci;
		final JPanel jPanelAccionesFormularioTipoRadioVenci=jPanelAccionesFormularioAuxiliarTipoRadioVenci;
		
		
		final JMenuBar jmenuBarTipoRadioVenci=this.jmenuBarTipoRadioVenci;		
		final JToolBar jTtoolBarTipoRadioVenci=this.jTtoolBarTipoRadioVenci;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoRadioVenci=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRadioVenci=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) {
			jmenuBarDetalleAuxiliarTipoRadioVenci=this.jInternalFrameDetalleFormTipoRadioVenci.jmenuBarDetalleTipoRadioVenci;
			jTtoolBarDetalleAuxiliarTipoRadioVenci=this.jInternalFrameDetalleFormTipoRadioVenci.jTtoolBarDetalleTipoRadioVenci;		
		}
		
		final JMenuBar jmenuBarDetalleTipoRadioVenci=jmenuBarDetalleAuxiliarTipoRadioVenci;
		final JToolBar jTtoolBarDetalleTipoRadioVenci=jTtoolBarDetalleAuxiliarTipoRadioVenci;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRadioVenci;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRadioVenci;
			processRunnable.jTableDatos=jTableDatosTipoRadioVenci;
			processRunnable.jPanelCampos=jPanelCamposTipoRadioVenci;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRadioVenci;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRadioVenci;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRadioVenci;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRadioVenci;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRadioVenci;
			processRunnable.jTtoolBar=jTtoolBarTipoRadioVenci;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRadioVenci;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoRadioVenci ,jPanelParametrosReportesTipoRadioVenci, jTableDatosTipoRadioVenci,/*jScrollPanelDatosTipoRadioVenci,*/jPanelCamposTipoRadioVenci,jPanelPaginacionTipoRadioVenci, /*jScrollPanelDatosEdicionTipoRadioVenci,*/ jPanelAccionesTipoRadioVenci,jPanelAccionesFormularioTipoRadioVenci,jmenuBarTipoRadioVenci,jmenuBarDetalleTipoRadioVenci,jTtoolBarTipoRadioVenci,jTtoolBarDetalleTipoRadioVenci));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoRadioVenci(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoRadioVenci(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoRadioVenci(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoRadioVenci(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoRadioVenci,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoRadioVenci,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoRadioVenci(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoRadioVenci,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoRadioVenci,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tiporadiovenciConstantesFunciones.getsFinalQueryTipoRadioVenci();
		String  finalQueryPaginacionTodos=this.tiporadiovenciConstantesFunciones.getsFinalQueryTipoRadioVenci();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoRadioVenciConstantesFunciones.getArrayColumnasGlobalesNoTipoRadioVenci(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoRadioVenciConstantesFunciones.getArrayColumnasGlobalesTipoRadioVenci(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoRadioVenciConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tiporadiovencisEliminados= new ArrayList<TipoRadioVenci>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoRadioVenci();
		
				///*TipoRadioVenciSessionBean*/this.tiporadiovenciSessionBean=new TipoRadioVenciSessionBean();
			
			if(this.tiporadiovenciSessionBean==null) {
				this.tiporadiovenciSessionBean=new TipoRadioVenciSessionBean();
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
					this.iNumeroPaginacion=TipoRadioVenciConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoRadioVenciConstantesFunciones.getClassesForeignKeysOfTipoRadioVenci(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tiporadiovenci."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tiporadiovencisAux= new ArrayList<TipoRadioVenci>();
			
				
			tiporadiovenciLogic.setDatosCliente(this.datosCliente);
			tiporadiovenciLogic.setDatosDeep(this.datosDeep);
			tiporadiovenciLogic.setIsConDeep(true);
			
			
			tiporadiovenciLogic.getTipoRadioVenciDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tiporadiovenciLogic.getTodosTipoRadioVencis(finalQueryGlobal,pagination);
					
					//tiporadiovenciLogic.getTodosTipoRadioVencisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tiporadiovenciLogic.getTipoRadioVencis()==null|| tiporadiovenciLogic.getTipoRadioVencis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporadiovencisAux= new ArrayList<TipoRadioVenci>();
							tiporadiovencisAux.addAll(tiporadiovenciLogic.getTipoRadioVencis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporadiovencisAux= new ArrayList<TipoRadioVenci>();
							tiporadiovencisAux.addAll(tiporadiovencis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporadiovenciLogic.getTodosTipoRadioVencis(finalQueryGlobal+"",this.pagination);												
							
							//tiporadiovenciLogic.getTodosTipoRadioVencisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoRadioVencis("Todos",tiporadiovenciLogic.getTipoRadioVencis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporadiovenciLogic.setTipoRadioVencis(new ArrayList<TipoRadioVenci>());					
							tiporadiovenciLogic.getTipoRadioVencis().addAll(tiporadiovencisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporadiovencis=new ArrayList<TipoRadioVenci>();
							tiporadiovencis.addAll(tiporadiovencisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoRadioVenci=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoRadioVenci=this.idActual;
				
				} else if(this.idTipoRadioVenciActual!=null && this.idTipoRadioVenciActual!=0L) {
					idTipoRadioVenci=idTipoRadioVenciActual;
				}
				
					
				this.sDetalleReporte=TipoRadioVenciConstantesFunciones.getDetalleIndicePorId(idTipoRadioVenci);
				
				this.tiporadiovencis=new ArrayList<TipoRadioVenci>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tiporadiovenciLogic.getEntity(idTipoRadioVenci);
					
					//tiporadiovenciLogic.getEntityWithConnection(idTipoRadioVenci);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporadiovenciLogic.setTipoRadioVencis(new ArrayList<TipoRadioVenci>());
					tiporadiovenciLogic.getTipoRadioVencis().add(tiporadiovenciLogic.getTipoRadioVenci());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporadiovencis=new ArrayList<TipoRadioVenci>();
					this.tiporadiovencis.add(tiporadiovenci);
				}
				
				if(tiporadiovenciLogic.getTipoRadioVenci()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoRadioVenci();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoRadioVenci();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporadiovenciLogic.getTipoRadioVencis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporadiovencis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporadiovenciLogic.getTipoRadioVencis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporadiovencis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoRadioVenci tiporadiovenci) {
		Boolean permite=true;
		
		if(this.tiporadiovenci.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoRadioVenciConstantesFunciones.getOrderByListaTipoRadioVenci();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoRadioVenciConstantesFunciones.getOrderByListaTipoRadioVenci();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRadioVenci tiporadiovenci:tiporadiovenciLogic.getTipoRadioVencis()) {
				if(tiporadiovenci.getsType().equals(Constantes2.S_TOTALES)) {
					tiporadiovenciTotales=tiporadiovenci;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRadioVenci tiporadiovenci:this.tiporadiovencis) {
				if(tiporadiovenci.getsType().equals(Constantes2.S_TOTALES)) {
					tiporadiovenciTotales=tiporadiovenci;
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
			this.tiporadiovenciAux=new TipoRadioVenci();
			this.tiporadiovenciAux.setsType(Constantes2.S_TOTALES);
			this.tiporadiovenciAux.setIsNew(false);
			this.tiporadiovenciAux.setIsChanged(false);
			this.tiporadiovenciAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoRadioVenciConstantesFunciones.TotalizarValoresFilaTipoRadioVenci(this.tiporadiovenciLogic.getTipoRadioVencis(),this.tiporadiovenciAux);
				
				this.tiporadiovenciLogic.getTipoRadioVencis().add(this.tiporadiovenciAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoRadioVenciConstantesFunciones.TotalizarValoresFilaTipoRadioVenci(this.tiporadiovencis,this.tiporadiovenciAux);
				
				this.tiporadiovencis.add(this.tiporadiovenciAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tiporadiovenciTotales=new TipoRadioVenci();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporadiovenciLogic.getTipoRadioVencis().remove(tiporadiovenciTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporadiovencis.remove(tiporadiovenciTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tiporadiovenciTotales=new TipoRadioVenci();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRadioVenci tiporadiovenci:tiporadiovenciLogic.getTipoRadioVencis()) {
				if(tiporadiovenci.getsType().equals(Constantes2.S_TOTALES)) {
					tiporadiovenciTotales=tiporadiovenci;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoRadioVenciConstantesFunciones.TotalizarValoresFilaTipoRadioVenci(this.tiporadiovenciLogic.getTipoRadioVencis(),tiporadiovenciTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRadioVenci tiporadiovenci:this.tiporadiovencis) {
				if(tiporadiovenci.getsType().equals(Constantes2.S_TOTALES)) {
					tiporadiovenciTotales=tiporadiovenci;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoRadioVenciConstantesFunciones.TotalizarValoresFilaTipoRadioVenci(this.tiporadiovencis,tiporadiovenciTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoRadioVenciPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoRadioVenciPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporadiovenciLogic.getTipoRadioVenciPorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoRadioVenci() {
		this.isPermisoTodoTipoRadioVenci=false;
		this.isPermisoNuevoTipoRadioVenci=false;
		this.isPermisoActualizarTipoRadioVenci=false;
		this.isPermisoActualizarOriginalTipoRadioVenci=false;
		this.isPermisoEliminarTipoRadioVenci=false;
		this.isPermisoGuardarCambiosTipoRadioVenci=false;
		this.isPermisoConsultaTipoRadioVenci=false;
		this.isPermisoBusquedaTipoRadioVenci=false;
		this.isPermisoReporteTipoRadioVenci=false;		
		this.isPermisoOrdenTipoRadioVenci=false;		
		this.isPermisoPaginacionMedioTipoRadioVenci=false;		
		this.isPermisoPaginacionAltoTipoRadioVenci=false;
		this.isPermisoPaginacionTodoTipoRadioVenci=false;
		this.isPermisoCopiarTipoRadioVenci=false;		
		this.isPermisoVerFormTipoRadioVenci=false;		
		this.isPermisoDuplicarTipoRadioVenci=false;		
		this.isPermisoOrdenTipoRadioVenci=false;		
	}
	
	public void setPermisosUsuarioTipoRadioVenci(Boolean isPermiso) {
		this.isPermisoTodoTipoRadioVenci=isPermiso;
		this.isPermisoNuevoTipoRadioVenci=isPermiso;
		this.isPermisoActualizarTipoRadioVenci=isPermiso;
		this.isPermisoActualizarOriginalTipoRadioVenci=isPermiso;
		this.isPermisoEliminarTipoRadioVenci=isPermiso;
		this.isPermisoGuardarCambiosTipoRadioVenci=isPermiso;
		this.isPermisoConsultaTipoRadioVenci=isPermiso;
		this.isPermisoBusquedaTipoRadioVenci=isPermiso;
		this.isPermisoReporteTipoRadioVenci=isPermiso;
		this.isPermisoOrdenTipoRadioVenci=isPermiso;		
		this.isPermisoPaginacionMedioTipoRadioVenci=isPermiso;		
		this.isPermisoPaginacionAltoTipoRadioVenci=isPermiso;		
		this.isPermisoPaginacionTodoTipoRadioVenci=isPermiso;		
		this.isPermisoCopiarTipoRadioVenci=isPermiso;		
		this.isPermisoVerFormTipoRadioVenci=isPermiso;		
		this.isPermisoDuplicarTipoRadioVenci=isPermiso;
		this.isPermisoOrdenTipoRadioVenci=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoRadioVenci(Boolean isPermiso) {
		//this.isPermisoTodoTipoRadioVenci=isPermiso;
		this.isPermisoNuevoTipoRadioVenci=isPermiso;
		this.isPermisoActualizarTipoRadioVenci=isPermiso;
		this.isPermisoActualizarOriginalTipoRadioVenci=isPermiso;
		this.isPermisoEliminarTipoRadioVenci=isPermiso;
		this.isPermisoGuardarCambiosTipoRadioVenci=isPermiso;
		//this.isPermisoConsultaTipoRadioVenci=isPermiso;
		//this.isPermisoBusquedaTipoRadioVenci=isPermiso;
		//this.isPermisoReporteTipoRadioVenci=isPermiso;
		//this.isPermisoOrdenTipoRadioVenci=isPermiso;		
		//this.isPermisoPaginacionMedioTipoRadioVenci=isPermiso;		
		//this.isPermisoPaginacionAltoTipoRadioVenci=isPermiso;		
		//this.isPermisoPaginacionTodoTipoRadioVenci=isPermiso;		
		//this.isPermisoCopiarTipoRadioVenci=isPermiso;		
		//this.isPermisoDuplicarTipoRadioVenci=isPermiso;
		//this.isPermisoOrdenTipoRadioVenci=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoRadioVenciClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(RadioVenciProveConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(RadioVenciClienteProveConstantesFunciones.SNOMBREOPCION);
		
		if(TipoRadioVenciJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosRadioVenciProve=false;
		this.isTienePermisosRadioVenciProve=this.verificarGetPermisosUsuarioOpcionTipoRadioVenciClaseRelacionada(this.opcionsRelacionadas,RadioVenciProveConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosRadioVenciClienteProve=false;
		this.isTienePermisosRadioVenciClienteProve=this.verificarGetPermisosUsuarioOpcionTipoRadioVenciClaseRelacionada(this.opcionsRelacionadas,RadioVenciClienteProveConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoRadioVenci(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoRadioVenciClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosRadioVenciProve=conPermiso;
		this.isTienePermisosRadioVenciClienteProve=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoRadioVenciClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoRadioVenciClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoRadioVenciClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosRadioVenciProve && this.jInternalFrameDetalleFormTipoRadioVenci!=null && this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoRadioVenci.jTabbedPaneRelacionesTipoRadioVenci.remove(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosRadioVenciClienteProve && this.jInternalFrameDetalleFormTipoRadioVenci!=null && this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoRadioVenci.jTabbedPaneRelacionesTipoRadioVenci.remove(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoRadioVenci() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoRadioVenciJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoRadioVenciConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoRadioVenci=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoRadioVenci=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoRadioVenci=this.isPermisoActualizarTipoRadioVenci;
			this.isPermisoEliminarTipoRadioVenci=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoRadioVenci=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoRadioVenci=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoRadioVenci=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoRadioVenci=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoRadioVenci=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRadioVenci=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoRadioVenci=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoRadioVenci=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoRadioVenci=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoRadioVenci=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoRadioVenci=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoRadioVenci=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRadioVenci=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoRadioVenci.setToolTipText(this.jTableDatosTipoRadioVenci.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoRadioVenci(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoRadioVenci(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoRadioVenciJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoRadioVenciJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoRadioVenci() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosRadioVenciProve && this.tiporadiovenciConstantesFunciones.mostrarRadioVenciProveTipoRadioVenci && !TipoRadioVenciConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Dias Vencidos");
			reporte.setsDescripcion("Dias Vencidos");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosRadioVenciClienteProve && this.tiporadiovenciConstantesFunciones.mostrarRadioVenciClienteProveTipoRadioVenci && !TipoRadioVenciConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Dias Por Vencer");
			reporte.setsDescripcion("Dias Por Vencer");
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
	
		
	public void inicializarCombosForeignKeyTipoRadioVenciListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoRadioVenciListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoRadioVenciJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoRadioVenciListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoRadioVenciListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoRadioVenci()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoRadioVenci()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoRadioVenci(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoRadioVenci()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRadioVenci();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoRadioVenci(TipoRadioVenci tiporadiovenci)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoRadioVenci(TipoRadioVenci tiporadiovenci,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoRadioVenci()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRadioVenci()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoRadioVenci()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoRadioVenci()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoRadioVenci()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoRadioVenci()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoRadioVenci(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoRadioVenci()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoRadioVenciBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoRadioVenciBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoRadioVenciBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tiporadiovenciSessionBean=new TipoRadioVenciSessionBean(); 
		this.tiporadiovenciConstantesFunciones=new TipoRadioVenciConstantesFunciones(); 
		this.tiporadiovenciBean=new TipoRadioVenci();//(this.tiporadiovenciConstantesFunciones); 		
		this.tiporadiovenciReturnGeneral=new TipoRadioVenciParameterReturnGeneral(); 
		
		this.tiporadiovenciSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporadiovenciSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoRadioVenciBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoRadioVenciBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoRadioVenciBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoRadioVenci(true);
			
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
			
			this.tiporadiovenciConstantesFunciones=new TipoRadioVenciConstantesFunciones(); 
			this.tiporadiovenciBean=new TipoRadioVenci();//this.tiporadiovenciConstantesFunciones); 			
			this.tiporadiovenciReturnGeneral=new TipoRadioVenciParameterReturnGeneral(); 
		
			TipoRadioVenciBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Radio Venci Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tiporadiovenci=new TipoRadioVenci();
			this.tiporadiovencis = new ArrayList<TipoRadioVenci>();
			this.tiporadiovencisAux = new ArrayList<TipoRadioVenci>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic=new TipoRadioVenciLogic();
				this.tiporadiovenciLogic.getNewConnexionToDeep("");
			}
			
			//this.tiporadiovenciSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tiporadiovenciSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoRadioVenci);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoRadioVenci!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRadioVenci);	
					}
					
					if(this.jInternalFrameImportacionTipoRadioVenci!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRadioVenci);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoRadioVenci!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoRadioVenci);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRadioVenci);
				this.jInternalFrameDetalleFormTipoRadioVenci.setVisible(false);
				this.jInternalFrameDetalleFormTipoRadioVenci.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoRadioVenci!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRadioVenci);
					this.jInternalFrameReporteDinamicoTipoRadioVenci.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoRadioVenci.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoRadioVenci!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoRadioVenci);
					this.jInternalFrameImportacionTipoRadioVenci.setVisible(false);
					this.jInternalFrameImportacionTipoRadioVenci.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoRadioVenci!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoRadioVenci);
					this.jInternalFrameOrderByTipoRadioVenci.setVisible(false);
					this.jInternalFrameOrderByTipoRadioVenci.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoRadioVenciActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoRadioVenciConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tiporadiovenciReturnGeneral=new TipoRadioVenciParameterReturnGeneral();
			
			this.tiporadiovenciParameterGeneral=new TipoRadioVenciParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tiporadiovenciLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoRadioVenciJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(RadioVenciProveConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(RadioVenciClienteProveConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoRadioVenciConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporadiovenciSessionBean.getEsGuardarRelacionado(),this.tiporadiovenciSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoRadioVenciConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporadiovenciSessionBean.getEsGuardarRelacionado(),this.tiporadiovenciSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoRadioVenci=false;
			this.isVisibilidadCeldaDuplicarTipoRadioVenci=true;
			this.isVisibilidadCeldaCopiarTipoRadioVenci=true;
			this.isVisibilidadCeldaVerFormTipoRadioVenci=true;
			this.isVisibilidadCeldaOrdenTipoRadioVenci=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRadioVenci=false;
			this.isVisibilidadCeldaModificarTipoRadioVenci=false;
			this.isVisibilidadCeldaActualizarTipoRadioVenci=false;
			this.isVisibilidadCeldaEliminarTipoRadioVenci=false;
			this.isVisibilidadCeldaCancelarTipoRadioVenci=false;
			this.isVisibilidadCeldaGuardarTipoRadioVenci=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRadioVenci=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoRadioVenci("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoRadioVenci();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoRadioVenci(false);
			
			this.setPermisosUsuarioTipoRadioVenci();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporadiovenciSessionBean.getEsGuardarRelacionado() 
				|| (this.tiporadiovenciSessionBean.getEsGuardarRelacionado() && this.tiporadiovenciSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoRadioVenciClasesRelacionadas();
			}
			
			if(this.tiporadiovenciSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoRadioVenciClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoRadioVenciJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoRadioVenci();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoRadioVenci();
			}
			
			if(!this.isPermisoBusquedaTipoRadioVenci) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoRadioVenci,this.isPermisoPaginacionMedioTipoRadioVenci,this.isPermisoPaginacionTodoTipoRadioVenci);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoRadioVenciConstantesFunciones.getTiposSeleccionarTipoRadioVenci());
				
				this.tiposColumnasSelect=TipoRadioVenciConstantesFunciones.getTiposSeleccionarTipoRadioVenci(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoRadioVenci();				
				//this.tiposRelacionesSelect=TipoRadioVenciConstantesFunciones.getTiposRelacionesTipoRadioVenci(true);
				
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
			//if(!this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoRadioVenci();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoRadioVenci(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoRadioVenci(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRadioVenci() ;
			
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
			
			
			this.radiovenciproveLogic=new RadioVenciProveLogic();
			this.radiovenciclienteproveLogic=new RadioVenciClienteProveLogic(); 
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
				tiporadiovenciImplementable= (TipoRadioVenciImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoRadioVenciConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tiporadiovenciImplementableHome= (TipoRadioVenciImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoRadioVenciConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tiporadiovencis= new ArrayList<TipoRadioVenci>();
			this.tiporadiovencisEliminados= new ArrayList<TipoRadioVenci>();
						
			this.isEsNuevoTipoRadioVenci=false;
			this.esParaAccionDesdeFormularioTipoRadioVenci=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoRadioVenci(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoRadioVenci();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoRadioVenciConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoRadioVenci("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoRadioVenci(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoRadioVenci();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoRadioVenci();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoRadioVenci(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoRadioVenci: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoRadioVenci() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(RadioVenciProveConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(RadioVenciProveConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoRadioVenci")) {
				iIndex=this.jInternalFrameDetalleFormTipoRadioVenci.jTabbedPaneRelacionesTipoRadioVenci.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoRadioVenci.jTabbedPaneRelacionesTipoRadioVenci.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoRadioVenci.getSelectedRow();	
				
				

				if(sTitle.equals("Dias Por Vencers")) {
					if(!RadioVenciClienteProveJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoRadioVenci();

						this.cargarParteTabPanelRelacionadaRadioVenciClienteProve(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Dias Vencidoss")) {
					if(!RadioVenciProveJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoRadioVenci();

						this.cargarParteTabPanelRelacionadaRadioVenciProve(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoRadioVenci();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaRadioVenciClienteProve(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoRadioVenci.cargarSessionConBeanSwingJInternalFrameRadioVenciClienteProve(false,true,iIndex);
		this.jButtonRadioVenciClienteProveActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaRadioVenciClienteProve();

		//this.jTabbedPaneRelacionesTipoRadioVenci.updateUI();
		//this.jTabbedPaneRelacionesTipoRadioVenci.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoRadioVenci.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaRadioVenciProve(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoRadioVenci.cargarSessionConBeanSwingJInternalFrameRadioVenciProve(false,true,iIndex);
		this.jButtonRadioVenciProveActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaRadioVenciProve();

		//this.jTabbedPaneRelacionesTipoRadioVenci.updateUI();
		//this.jTabbedPaneRelacionesTipoRadioVenci.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoRadioVenci.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("RadioVenciProve")) {
				int row=this.jTableDatosTipoRadioVenci.getSelectedRow();
				jButtonRadioVenciProveActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("RadioVenciClienteProve")) {
				int row=this.jTableDatosTipoRadioVenci.getSelectedRow();
				jButtonRadioVenciClienteProveActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Dias Vencidos")) {

					if(this.isTienePermisosRadioVenciProve && this.tiporadiovenciConstantesFunciones.mostrarRadioVenciProveTipoRadioVenci && !TipoRadioVenciConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Dias Vencidoss"+"("+RadioVenciProveConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Dias Vencidoss");

						if(tiporadiovenciConstantesFunciones.resaltarRadioVenciProveTipoRadioVenci!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tiporadiovenciConstantesFunciones.resaltarRadioVenciProveTipoRadioVenci);
						}

						jmenuItem.setEnabled(this.tiporadiovenciConstantesFunciones.activarRadioVenciProveTipoRadioVenci);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"RadioVenciProve"));

						

						this.jInternalFrameDetalleFormTipoRadioVenci.jmenuDetalleTipoRadioVenci.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Dias Por Vencer")) {

					if(this.isTienePermisosRadioVenciClienteProve && this.tiporadiovenciConstantesFunciones.mostrarRadioVenciClienteProveTipoRadioVenci && !TipoRadioVenciConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Dias Por Vencers"+"("+RadioVenciClienteProveConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Dias Por Vencers");

						if(tiporadiovenciConstantesFunciones.resaltarRadioVenciClienteProveTipoRadioVenci!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tiporadiovenciConstantesFunciones.resaltarRadioVenciClienteProveTipoRadioVenci);
						}

						jmenuItem.setEnabled(this.tiporadiovenciConstantesFunciones.activarRadioVenciClienteProveTipoRadioVenci);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"RadioVenciClienteProve"));

						

						this.jInternalFrameDetalleFormTipoRadioVenci.jmenuDetalleTipoRadioVenci.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoRadioVenci(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoRadioVenci(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoRadioVenci(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoRadioVenciListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoRadioVenci();
		
		this.cargarCombosFrameForeignKeyTipoRadioVenci();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoRadioVenci();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoRadioVenci();
		}
	}
	
	
	
	public void jButtonNuevoTipoRadioVenciActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tiporadiovenciSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoRadioVenci==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
			
			
			if(jTableDatosTipoRadioVenci.getRowCount()>=1) {
				jTableDatosTipoRadioVenci.removeRowSelectionInterval(0, jTableDatosTipoRadioVenci.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoRadioVenci=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoRadioVenci(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoRadioVenci(true);			
			//this.tiporadiovenci=new TipoRadioVenci();
			//this.tiporadiovenci.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRadioVenci(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRadioVenci() ;
			
			if(TipoRadioVenciJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRadioVenci(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tiporadiovenci);	
			this.actualizarInformacion("INFO_PADRE",false,this.tiporadiovenci);				
			
			TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
			
			if(this.tiporadiovenciSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoRadioVenci: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoRadioVenciActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoRadioVenci> tiporadiovencisSeleccionados=new ArrayList<TipoRadioVenci>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoRadioVenci.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoRadioVenci.getSelectedRows().length;			
			}
			
			tiporadiovencisSeleccionados=this.getTipoRadioVencisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoRadioVenci--;			
				//TipoRadioVenci tiporadiovenciAux= new TipoRadioVenci();			
				//tiporadiovenciAux.setId(this.iIdNuevoTipoRadioVenci);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoRadioVenci tiporadiovenciOrigen=new TipoRadioVenci();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoRadioVenci tiporadiovenciOrigen : tiporadiovencisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoRadioVenci.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tiporadiovenciOrigen =(TipoRadioVenci) this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporadiovenciOrigen =(TipoRadioVenci) this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoRadioVenci();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tiporadiovenci.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoRadioVenci(tiporadiovenciOrigen,this.tiporadiovenci,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRadioVenci(this.tiporadiovenci);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporadiovenciLogic.getTipoRadioVencis().add(this.tiporadiovenciAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporadiovencis.add(this.tiporadiovenciAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoRadioVenci(false);
				
				this.jTableDatosTipoRadioVenci.setRowSelectionInterval(this.getIndiceNuevoTipoRadioVenci(), this.getIndiceNuevoTipoRadioVenci());
				
				int iLastRow =  this.jTableDatosTipoRadioVenci.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRadioVenci.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRadioVenci.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRadioVenci(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoRadioVenciActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoRadioVenci> tiporadiovencisSeleccionados=new ArrayList<TipoRadioVenci>();									
		
			TipoRadioVenci tiporadiovenciOrigen=new TipoRadioVenci();
			TipoRadioVenci tiporadiovenciDestino=new TipoRadioVenci();
				
			tiporadiovencisSeleccionados=this.getTipoRadioVencisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoRadioVenci.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tiporadiovencisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoRadioVenci.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporadiovenciOrigen =(TipoRadioVenci) this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporadiovenciOrigen =(TipoRadioVenci) this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporadiovenciDestino =(TipoRadioVenci) this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporadiovenciDestino =(TipoRadioVenci) this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tiporadiovenciOrigen =tiporadiovencisSeleccionados.get(0);
				tiporadiovenciDestino =tiporadiovencisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoRadioVenci(tiporadiovenciOrigen,tiporadiovenciDestino,true,false);
				
				tiporadiovenciDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporadiovenciDestino,tiporadiovenciLogic.getTipoRadioVencis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporadiovenciDestino,tiporadiovencis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoRadioVenci(false);
				
				//this.jTableDatosTipoRadioVenci.setRowSelectionInterval(this.getIndiceNuevoTipoRadioVenci(), this.getIndiceNuevoTipoRadioVenci());
				
				int iLastRow =  this.jTableDatosTipoRadioVenci.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRadioVenci.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRadioVenci.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRadioVenci(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoRadioVenciActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRadioVenci==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoRadioVenci.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoRadioVenciActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoRadioVenci.isVisible();
			
			
			this.jPanelParametrosReportesTipoRadioVenci.setVisible(!isVisible);
			this.jPanelPaginacionTipoRadioVenci.setVisible(!isVisible);
			this.jPanelAccionesTipoRadioVenci.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoRadioVenciActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoRadioVenci();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoRadioVenciActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoRadioVenci();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoRadioVenciActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoRadioVenci();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoRadioVenciActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoRadioVenci();
			
			this.abrirFrameOrderByTipoRadioVenci();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoRadioVenciActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoRadioVenci();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoRadioVenci(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRadioVenci);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoRadioVenci.isMaximum()) {
					this.jInternalFrameDetalleFormTipoRadioVenci.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoRadioVenci.setSize(this.jInternalFrameDetalleFormTipoRadioVenci.iWidthFormulario,this.jInternalFrameDetalleFormTipoRadioVenci.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoRadioVenci.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoRadioVenci.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoRadioVenci.isMaximum()) {
						this.jInternalFrameDetalleFormTipoRadioVenci.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoRadioVenci.jContentPaneDetalleTipoRadioVenci.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoRadioVenci.jTabbedPaneRelacionesTipoRadioVenci.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoRadioVenci.jContentPaneDetalleTipoRadioVenci.getWidth(),TipoRadioVenciConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRadioVenci.jTabbedPaneRelacionesTipoRadioVenci.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoRadioVenci.jContentPaneDetalleTipoRadioVenci.getWidth(),TipoRadioVenciConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRadioVenci.jTabbedPaneRelacionesTipoRadioVenci.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoRadioVenci.jContentPaneDetalleTipoRadioVenci.getWidth(),TipoRadioVenciConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(RadioVenciClienteProveJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaRadioVenciClienteProve();
					}

					if(RadioVenciProveJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaRadioVenciProve();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoRadioVenci.setVisible(true);
	        this.jInternalFrameDetalleFormTipoRadioVenci.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoRadioVenci() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoRadioVenci==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoRadioVenci=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRadioVenci,false,this);
				} else {
					this.jInternalFrameOrderByTipoRadioVenci=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRadioVenci,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoRadioVenci);
				this.jInternalFrameOrderByTipoRadioVenci.setVisible(false);
				this.jInternalFrameOrderByTipoRadioVenci.setSelected(false);
				
				this.jInternalFrameOrderByTipoRadioVenci.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRadioVenci"));
				
				this.inicializarActualizarBindingTablaOrderByTipoRadioVenci();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoRadioVenci() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoRadioVenci==null) {
				
				this.jInternalFrameImportacionTipoRadioVenci=new ImportacionJInternalFrame(TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRadioVenci);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoRadioVenci);
				this.jInternalFrameImportacionTipoRadioVenci.setVisible(false);
				this.jInternalFrameImportacionTipoRadioVenci.setSelected(false);


				this.jInternalFrameImportacionTipoRadioVenci.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRadioVenci"));
				this.jInternalFrameImportacionTipoRadioVenci.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRadioVenci"));
				this.jInternalFrameImportacionTipoRadioVenci.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRadioVenci"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoRadioVenci() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoRadioVenci==null) {
				this.jInternalFrameReporteDinamicoTipoRadioVenci=new ReporteDinamicoJInternalFrame(TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRadioVenci);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRadioVenci);
				this.jInternalFrameReporteDinamicoTipoRadioVenci.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoRadioVenci.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoRadioVenci.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRadioVenci"));
				this.jInternalFrameReporteDinamicoTipoRadioVenci.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRadioVenci"));
				this.jInternalFrameReporteDinamicoTipoRadioVenci.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRadioVenci"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRadioVenci();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaRadioVenciClienteProve() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame.jScrollPanelDatosRadioVenciClienteProve.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoRadioVenci.jContentPaneDetalleTipoRadioVenci.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame.jScrollPanelDatosRadioVenciClienteProve.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame.jScrollPanelDatosRadioVenciClienteProve.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame.jScrollPanelDatosRadioVenciClienteProve.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaRadioVenciProve() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame.jScrollPanelDatosRadioVenciProve.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoRadioVenci.jContentPaneDetalleTipoRadioVenci.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame.jScrollPanelDatosRadioVenciProve.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame.jScrollPanelDatosRadioVenciProve.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame.jScrollPanelDatosRadioVenciProve.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoRadioVenci() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRadioVenci);
			
	       	this.jInternalFrameDetalleFormTipoRadioVenci.setVisible(false);
	        this.jInternalFrameDetalleFormTipoRadioVenci.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoRadioVenci.dispose();
			//this.jInternalFrameDetalleFormTipoRadioVenci=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoRadioVenci() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoRadioVenci.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoRadioVenci.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoRadioVenci() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoRadioVenci.setVisible(true);
	        this.jInternalFrameImportacionTipoRadioVenci.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoRadioVenci() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoRadioVenci.setVisible(true);
	        this.jInternalFrameOrderByTipoRadioVenci.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoRadioVenci() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoRadioVenci.setVisible(false);
	        this.jInternalFrameOrderByTipoRadioVenci.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoRadioVenci() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoRadioVenci.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoRadioVenci.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoRadioVenci() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoRadioVenci.setVisible(false);
	        this.jInternalFrameImportacionTipoRadioVenci.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoRadioVenciActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoRadioVenci(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoRadioVenci(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRadioVenci.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoRadioVenci(true);
			//this.isEsNuevoTipoRadioVenci=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenci =(TipoRadioVenci) this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporadiovenci =(TipoRadioVenci) this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoRadioVenci("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRadioVenci(false) ;
			
			if(tiporadiovenciSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame.radiovenciproveSessionBean.getEsGuardarRelacionado() && RadioVenciProveJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRadioVenciProveActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame.radiovenciclienteproveSessionBean.getEsGuardarRelacionado() && RadioVenciClienteProveJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRadioVenciClienteProveActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoRadioVenciJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRadioVenci(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRadioVenci(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoRadioVenciActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoRadioVenci.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenci =(TipoRadioVenci) this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporadiovenci =(TipoRadioVenci) this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoRadioVenci(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRadioVenci==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRadioVenci.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoRadioVenci(true);
			//this.isEsNuevoTipoRadioVenci=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenci =(TipoRadioVenci) this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporadiovenci =(TipoRadioVenci) this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tiporadiovenci.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoRadioVenci("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoRadioVenci(false) ;
			
			if(TipoRadioVenciJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRadioVenci(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRadioVenci(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoRadioVenciActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoRadioVenci(false);
			
			//if(!this.isEsNuevoTipoRadioVenci) {								
				int intSelectedRow = this.jTableDatosTipoRadioVenci.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenci =(TipoRadioVenci) this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporadiovenci =(TipoRadioVenci) this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoRadioVenciJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoRadioVenci(this.tiporadiovenci,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRadioVenci(this.tiporadiovenci);
				
			}
			
			if(this.permiteMantenimiento(this.tiporadiovenci)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoRadioVenci=true;
					this.inicializarActualizarBindingTablaTipoRadioVenci(false);
					this.isEsNuevoTipoRadioVenci=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoRadioVenci=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoRadioVenci=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRadioVenci(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRadioVenci(false);
				
				this.habilitarDeshabilitarControlesTipoRadioVenci(false);
			
												
				
				if(TipoRadioVenciJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoRadioVenci();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoRadioVenciActionPerformed(evt,tiporadiovenciSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoRadioVenci(this.tiporadiovenci,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoRadioVenci.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tiporadiovenciSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tiporadiovenci.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoRadioVenci.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRadioVenci.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoRadioVenciActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoRadioVenci.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenci =(TipoRadioVenci) this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
				this.tiporadiovenci.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporadiovenci =(TipoRadioVenci) this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
				this.tiporadiovenci.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tiporadiovenci)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoRadioVenciModel) this.jTableDatosTipoRadioVenci.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoRadioVenci=true;
				this.inicializarActualizarBindingTablaTipoRadioVenci(false);
				this.isEsNuevoTipoRadioVenci=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRadioVenci(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRadioVenci(false);
				
				this.habilitarDeshabilitarControlesTipoRadioVenci(false);
				
				
				
				if(TipoRadioVenciJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoRadioVenci();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoRadioVenciActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoRadioVenci.getRowCount()>=1) {
				jTableDatosTipoRadioVenci.removeRowSelectionInterval(0, jTableDatosTipoRadioVenci.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoRadioVenci(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoRadioVenci(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRadioVenci(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRadioVenci(false) ;
			
			this.isEsNuevoTipoRadioVenci=false;
			
			if(TipoRadioVenciJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoRadioVenci();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoRadioVenciActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoRadioVenci(false);
				
				//SI ES MANUAL
				if(TipoRadioVenciJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoRadioVenci();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoRadioVenciActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoRadioVenci--;			
			//TipoRadioVenci tiporadiovenciAux= new TipoRadioVenci();			
			//tiporadiovenciAux.setId(this.iIdNuevoTipoRadioVenci);
			
			if(this.jInternalFrameDetalleFormTipoRadioVenci==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoRadioVenci();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoRadioVenci(this.tiporadiovenci);
			
			this.tiporadiovenci.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tiporadiovenciLogic.getTipoRadioVencis().add(this.tiporadiovenciAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tiporadiovencis.add(this.tiporadiovenciAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoRadioVenci(false);
			
			this.jTableDatosTipoRadioVenci.setRowSelectionInterval(this.getIndiceNuevoTipoRadioVenci(), this.getIndiceNuevoTipoRadioVenci());
			
			int iLastRow =  this.jTableDatosTipoRadioVenci.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoRadioVenci.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoRadioVenci.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoRadioVenci(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoRadioVenciActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoRadioVenci(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRadioVenci(false);
			
			//SI ES MANUAL
			if(TipoRadioVenciJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRadioVenci();
			}
			
			//this.abrirFrameTreeTipoRadioVenci();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoRadioVenciActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Radio VenciS ?", "MANTENIMIENTO DE Tipo Radio Venci", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoRadioVenci.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoRadioVenci();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tiporadiovenciReturnGeneral=tiporadiovenciLogic.procesarImportacionTipoRadioVencisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tiporadiovenciParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoRadioVenciReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoRadioVenciActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoRadioVenci.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoRadioVenci.setFileImportacion(this.jInternalFrameImportacionTipoRadioVenci.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoRadioVenci.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoRadioVenci.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoRadioVenci.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoRadioVenci.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoRadioVenciActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoRadioVenci> tiporadiovencisSeleccionados=new ArrayList<TipoRadioVenci>();		

		tiporadiovencisSeleccionados=this.getTipoRadioVencisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRadioVenci.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRadioVenci.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoRadioVenciBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoRadioVenciBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoRadioVencis("Todos",tiporadiovencisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Radio Venci",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRadioVenci.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRadioVenci.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoRadioVenciConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoRadioVenci.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRadioVenci.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRadioVenci.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoRadioVenciConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoRadioVenci.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoRadioVenciConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoRadioVenci.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRadioVenci.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoRadioVenciConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoRadioVenciActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoRadioVenci> tiporadiovencisSeleccionados=new ArrayList<TipoRadioVenci>();		
		
		tiporadiovencisSeleccionados=this.getTipoRadioVencisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporadiovenci";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoRadioVencis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoRadioVenci.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRadioVenci.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoRadioVenciConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRadioVenciConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoRadioVenci tiporadiovenci:tiporadiovencisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporadiovenci.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoRadioVenci(row);				
			//	iRow++;
			//}				
			
			//for(TipoRadioVenci tiporadiovenciAux:tiporadiovencisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoRadioVenci(tiporadiovenciAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Radio Venci",JOptionPane.INFORMATION_MESSAGE);
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
				this.tiporadiovenciLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRadioVenci(false);
			
			//SI ES MANUAL
			if(TipoRadioVenciJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRadioVenci();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoRadioVenciActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRadioVenci(false);
			
			//SI ES MANUAL
			if(TipoRadioVenciJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRadioVenci();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoRadioVenciActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRadioVenci(false);
			
			//SI ES MANUAL
			if(TipoRadioVenciJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRadioVenci();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporadiovenciLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoRadioVenci() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoRadioVenci.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoRadioVenci.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoRadioVenci.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoRadioVenci.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoRadioVenci.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoRadioVenci.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoRadioVenci.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoRadioVenci(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoRadioVenci(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoRadioVenci(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoRadioVenci(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoRadioVenci(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoRadioVenci(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRadioVenci(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoRadioVenci(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoRadioVenciJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoRadioVenciJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoRadioVenci() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoRadioVenci();
		
		this.inicializarActualizarBindingBotonesManualTipoRadioVenci(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRadioVenci();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRadioVenci() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRadioVenci(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRadioVenci(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoRadioVenci.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoRadioVenci.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoRadioVenci.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoRadioVenci.jCheckBoxPostAccionNuevoTipoRadioVenci.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoRadioVenci.jCheckBoxPostAccionSinCerrarTipoRadioVenci.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoRadioVenci.jCheckBoxPostAccionSinMensajeTipoRadioVenci.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoRadioVenci.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoRadioVenci.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoRadioVenci.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) {
				this.jInternalFrameDetalleFormTipoRadioVenci.jCheckBoxPostAccionNuevoTipoRadioVenci.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoRadioVenci.jCheckBoxPostAccionSinCerrarTipoRadioVenci.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoRadioVenci.jCheckBoxPostAccionSinMensajeTipoRadioVenci.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoRadioVenci.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoRadioVenci.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoRadioVenci.jComboBoxTiposAccionesFormularioTipoRadioVenci.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoRadioVenci.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoRadioVenci!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRadioVenci.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoRadioVenci.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoRadioVenci.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoRadioVenci.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoRadioVenci.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoRadioVenci!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRadioVenci.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoRadioVenci.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoRadioVenci.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoRadioVenci(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoRadioVenciJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRadioVenci(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoRadioVenci() throws Exception {
		try	{
			if(TipoRadioVenciJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRadioVenci();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRadioVenci() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoRadioVenci.jComboBoxTiposAccionesFormularioTipoRadioVenci.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoRadioVenci.jComboBoxTiposAccionesFormularioTipoRadioVenci.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRadioVenci() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoRadioVenci.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoRadioVenci.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoRadioVenci.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoRadioVenci.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoRadioVenci.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoRadioVenci.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoRadioVenci.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoRadioVenci.addItem(reporte);
			}
			
			
			if(!this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoRadioVenci.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoRadioVenci.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoRadioVenci.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoRadioVenci.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoRadioVenci.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoRadioVenci.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoRadioVenci.jComboBoxTiposAccionesFormularioTipoRadioVenci.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoRadioVenci.jComboBoxTiposAccionesFormularioTipoRadioVenci.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoRadioVenci.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoRadioVenci.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoRadioVenci.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRadioVenci();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRadioVenci() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRadioVenci!=null) {
				this.jInternalFrameReporteDinamicoTipoRadioVenci.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRadioVenci.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRadioVenci!=null) {
				this.jInternalFrameReporteDinamicoTipoRadioVenci.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRadioVenci.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoRadioVenci!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoRadioVenci.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRadioVenci.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRadioVenci.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoRadioVenci.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRadioVenci.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRadioVenci.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoRadioVenci()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoRadioVenci(Boolean esInicializar) throws Exception {				
		if(TipoRadioVenciJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRadioVenci();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoRadioVenci() throws Exception {
		this.inicializarActualizarBindingTablaTipoRadioVenci(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoRadioVenci() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoRadioVenci.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoRadioVenci.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRadioVenci.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoRadioVenciPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoRadioVenci.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRadioVenci.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoRadioVenciPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoRadioVenciOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRadioVenciOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoRadioVenciPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoRadioVenci.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRadioVenci.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoRadioVenciPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoRadioVenci.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoRadioVenci(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tiporadiovenciLogic.getTipoRadioVencis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tiporadiovencis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoRadioVenciJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoRadioVenci.setModel(new TipoRadioVenciModel(this.tiporadiovenciLogic.getTipoRadioVencis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoRadioVenci.setModel(new TipoRadioVenciModel(this.tiporadiovencis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoRadioVenci!=null && this.jInternalFrameOrderByTipoRadioVenci.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoRadioVenci();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoRadioVenci.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRadioVenci,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoRadioVenciPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO,tiporadiovenciConstantesFunciones.resaltarSeleccionarTipoRadioVenci,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO,tiporadiovenciConstantesFunciones.resaltarSeleccionarTipoRadioVenci,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoRadioVenci.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRadioVenci,TipoRadioVenciConstantesFunciones.LABEL_ID));

		if(this.tiporadiovenciConstantesFunciones.mostraridTipoRadioVenci && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRadioVenciConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiporadiovenciConstantesFunciones.resaltaridTipoRadioVenci,this.tiporadiovenciConstantesFunciones.activaridTipoRadioVenci,this,true,"idTipoRadioVenci","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporadiovenciConstantesFunciones.resaltaridTipoRadioVenci,this.tiporadiovenciConstantesFunciones.activaridTipoRadioVenci,this,true,"idTipoRadioVenci","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRadioVenci.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRadioVenci,TipoRadioVenciConstantesFunciones.LABEL_NOMBRE));

		if(this.tiporadiovenciConstantesFunciones.mostrarnombreTipoRadioVenci && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRadioVenciConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiporadiovenciConstantesFunciones.resaltarnombreTipoRadioVenci,this.tiporadiovenciConstantesFunciones.activarnombreTipoRadioVenci,this,true,"nombreTipoRadioVenci","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporadiovenciConstantesFunciones.resaltarnombreTipoRadioVenci,this.tiporadiovenciConstantesFunciones.activarnombreTipoRadioVenci,this,true,"nombreTipoRadioVenci","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRadioVenciPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tiporadiovenciSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosRadioVenciProve && this.tiporadiovenciConstantesFunciones.mostrarRadioVenciProveTipoRadioVenci && !TipoRadioVenciConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Dias Vencidoss");
				tableColumn.setHeaderValue("Dias Vencidoss");
				tableColumn.setCellRenderer(new RadioVenciProveTableCell(tiporadiovenciConstantesFunciones.resaltarRadioVenciProveTipoRadioVenci,this,this.tiporadiovenciConstantesFunciones.activarRadioVenciProveTipoRadioVenci));
				tableColumn.setCellEditor(new RadioVenciProveTableCell(tiporadiovenciConstantesFunciones.resaltarRadioVenciProveTipoRadioVenci,this,this.tiporadiovenciConstantesFunciones.activarRadioVenciProveTipoRadioVenci));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoRadioVenci.addColumn(tableColumn);
			}

			if(this.isTienePermisosRadioVenciClienteProve && this.tiporadiovenciConstantesFunciones.mostrarRadioVenciClienteProveTipoRadioVenci && !TipoRadioVenciConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Dias Por Vencers");
				tableColumn.setHeaderValue("Dias Por Vencers");
				tableColumn.setCellRenderer(new RadioVenciClienteProveTableCell(tiporadiovenciConstantesFunciones.resaltarRadioVenciClienteProveTipoRadioVenci,this,this.tiporadiovenciConstantesFunciones.activarRadioVenciClienteProveTipoRadioVenci));
				tableColumn.setCellEditor(new RadioVenciClienteProveTableCell(tiporadiovenciConstantesFunciones.resaltarRadioVenciClienteProveTipoRadioVenci,this,this.tiporadiovenciConstantesFunciones.activarRadioVenciClienteProveTipoRadioVenci));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoRadioVenci.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporadiovenciSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporadiovenciSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRadioVenci.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporadiovenciSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporadiovenciSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRadioVenci.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoRadioVenci && this.isPermisoGuardarCambiosTipoRadioVenci) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tiporadiovenciSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tiporadiovenciSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoRadioVenci.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tiporadiovenciSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoRadioVenci.addColumn(tableColumn);
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
			
			this.jTableDatosTipoRadioVenci.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRadioVenci && this.isPermisoGuardarCambiosTipoRadioVenci) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiporadiovenciSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRadioVenci && this.isPermisoGuardarCambiosTipoRadioVenci) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoRadioVenci.moveColumn(this.jTableDatosTipoRadioVenci.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoRadioVenci.moveColumn(this.jTableDatosTipoRadioVenci.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiporadiovenciSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoRadioVenci.moveColumn(this.jTableDatosTipoRadioVenci.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoRadioVenci.moveColumn(this.jTableDatosTipoRadioVenci.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoRadioVenci.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoRadioVenci.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoRadioVenci,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoRadioVenciJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoRadioVenci.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoRadioVenci.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoRadioVenciJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoRadioVenciJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoRadioVenci.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoRadioVenci.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoRadioVenci.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tiporadiovenciLogic.getTipoRadioVencis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tiporadiovencis.size()-1;
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
		//this.jTableDatosTipoRadioVenci.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoRadioVenci.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoRadioVenci();
			
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
				
				//this.isEsNuevoTipoRadioVenci=false;
					
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
			
				if(this.tiporadiovenciSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoRadioVenci==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRadioVenci.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRadioVenci.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenci =(TipoRadioVenci) this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporadiovenci =(TipoRadioVenci) this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tiporadiovenci.getsType().equals("DUPLICADO")
				   || this.tiporadiovenci.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoRadioVenci=true;
				
				} else {
					this.isEsNuevoTipoRadioVenci=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
					if(this.tiporadiovenci.getId()>=0 && !this.tiporadiovenci.getIsNew()) {						
						this.isEsNuevoTipoRadioVenci=false;
						
					} else {
						this.isEsNuevoTipoRadioVenci=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoRadioVenci(esRelaciones);						
				
				this.seleccionarTipoRadioVenci(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tiporadiovenci.getId()<0) {
					this.isEsNuevoTipoRadioVenci=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoRadioVenci(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoRadioVenci(evt,rowIndex);
				}	
				
				if(this.tiporadiovenciSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoRadioVenci: " + this.dDif); 
					}
				}								
				
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoRadioVenci(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tiporadiovenci)) {
					if(this.tiporadiovenci.getId()>0) {
						this.tiporadiovenci.setIsDeleted(true);
						
						this.tiporadiovencisEliminados.add(this.tiporadiovenci);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporadiovenciLogic.getTipoRadioVencis().remove(this.tiporadiovenci);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporadiovencis.remove(this.tiporadiovenci);				
					}
					
					
					((TipoRadioVenciModel) this.jTableDatosTipoRadioVenci.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRadioVenci(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoRadioVenci(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoRadioVenci) {
			
			if(this.jInternalFrameDetalleFormTipoRadioVenci==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRadioVenci.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRadioVenci.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenci =(TipoRadioVenci) this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporadiovenci =(TipoRadioVenci) this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoRadioVenciJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoRadioVenci(this.tiporadiovenci);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoRadioVenci("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoRadioVenci(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRadioVenci() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRadioVenci(TipoRadioVenci tiporadiovenci) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoRadioVenci(tiporadiovenci,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRadioVenci(TipoRadioVenci tiporadiovenci,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoRadioVenci(tiporadiovenci);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoRadioVenci(tiporadiovenci,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoRadioVenci(tiporadiovenci);
	}
	
	public void setVariablesObjetoActualToFormularioTipoRadioVenci(TipoRadioVenci tiporadiovenci) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoRadioVenci==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoRadioVenci.jTextFieldidTipoRadioVenci.setText(tiporadiovenci.getId().toString());
			this.jInternalFrameDetalleFormTipoRadioVenci.jTextAreanombreTipoRadioVenci.setText(tiporadiovenci.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoRadioVenci tiporadiovenciLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tiporadiovenciLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoRadioVenci tiporadiovenciLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tiporadiovenciLocal=this.tiporadiovenci;
			} else {
				tiporadiovenciLocal=this.tiporadiovenciAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tiporadiovenciLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoRadioVenci(tiporadiovenciLocal,true);
					
					if(tiporadiovenciSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tiporadiovenciLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tiporadiovenciLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoRadioVenci(TipoRadioVenci tiporadiovenci,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRadioVenci(tiporadiovenci,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRadioVenci(tiporadiovenci);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRadioVenci(TipoRadioVenci tiporadiovenci,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRadioVenci(tiporadiovenci,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRadioVenci(TipoRadioVenci tiporadiovenci,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoRadioVenci==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoRadioVenci.jTextFieldidTipoRadioVenci.getText()==null || this.jInternalFrameDetalleFormTipoRadioVenci.jTextFieldidTipoRadioVenci.getText()=="" || this.jInternalFrameDetalleFormTipoRadioVenci.jTextFieldidTipoRadioVenci.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoRadioVenci.jTextFieldidTipoRadioVenci.setText("0");
			}

			if(conColumnasBase) {tiporadiovenci.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoRadioVenci.jTextFieldidTipoRadioVenci.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRadioVenciConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRadioVenci.jLabelIdTipoRadioVenci,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporadiovenci.setnombre(this.jInternalFrameDetalleFormTipoRadioVenci.jTextAreanombreTipoRadioVenci.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRadioVenciConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRadioVenci.jLabelnombreTipoRadioVenci,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRadioVenci(TipoRadioVenci tiporadiovenciBean,TipoRadioVenci tiporadiovenci,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoRadioVenci(TipoRadioVenci tiporadiovenciOrigen,TipoRadioVenci tiporadiovenci,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporadiovenciOrigen.getId()!=null && !tiporadiovenciOrigen.getId().equals(0L))) {tiporadiovenci.setId(tiporadiovenciOrigen.getId());}}
			if(conDefault || (!conDefault && tiporadiovenciOrigen.getnombre()!=null && !tiporadiovenciOrigen.getnombre().equals(""))) {tiporadiovenci.setnombre(tiporadiovenciOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRadioVenci(TipoRadioVenci tiporadiovenci) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRadioVenci.jTextFieldidTipoRadioVenci.setText(tiporadiovenci.getId().toString());
			this.jInternalFrameDetalleFormTipoRadioVenci.jTextAreanombreTipoRadioVenci.setText(tiporadiovenci.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRadioVenci(TipoRadioVenciBean tiporadiovenciBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRadioVenci.jTextFieldidTipoRadioVenci.setText(tiporadiovenciBean.getId().toString());
			this.jInternalFrameDetalleFormTipoRadioVenci.jTextAreanombreTipoRadioVenci.setText(tiporadiovenciBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoRadioVenci(TipoRadioVenciParameterReturnGeneral tiporadiovenciReturnGeneral,TipoRadioVenciBean tiporadiovenciBean,Boolean conDefault) throws Exception { 
		try {
			TipoRadioVenci tiporadiovenciLocal=new TipoRadioVenci();
			
			tiporadiovenciLocal=tiporadiovenciReturnGeneral.getTipoRadioVenci();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporadiovenciLocal.getId()!=null && !tiporadiovenciLocal.getId().equals(0L))) {tiporadiovenciBean.setId(tiporadiovenciLocal.getId());}}
			if(conDefault || (!conDefault && tiporadiovenciLocal.getnombre()!=null && !tiporadiovenciLocal.getnombre().equals(""))) {tiporadiovenciBean.setnombre(tiporadiovenciLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoRadioVenciGenerico(Long idTipoRadioVenciSeleccionado,JComboBox jComboBoxTipoRadioVenci,List<TipoRadioVenci> tiporadiovencisLocal)throws Exception {
		try {
			TipoRadioVenci  tiporadiovenciTemp=null;

			for(TipoRadioVenci tiporadiovenciAux:tiporadiovencisLocal) {
				if(tiporadiovenciAux.getId()!=null && tiporadiovenciAux.getId().equals(idTipoRadioVenciSeleccionado)) {
					tiporadiovenciTemp=tiporadiovenciAux;
					break;
				}
			}

			jComboBoxTipoRadioVenci.setSelectedItem(tiporadiovenciTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoRadioVenciGenerico(JComboBox jComboBoxTipoRadioVenci,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoRadioVenci.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRadioVenci.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoRadioVenci.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRadioVenci.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRadioVenci.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoRadioVenci.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRadioVenci.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoRadioVenci.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoRadioVenci.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoRadioVenci.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("RadioVenciProve")) {
			jButtonRadioVenciProveActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("RadioVenciClienteProve")) {
			jButtonRadioVenciClienteProveActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporadiovenci=(TipoRadioVenci) tiporadiovenciLogic.getTipoRadioVencis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporadiovenci =(TipoRadioVenci) tiporadiovencis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoRadioVenci tiporadiovenciRow=new TipoRadioVenci();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporadiovenciRow=(TipoRadioVenci) tiporadiovenciLogic.getTipoRadioVencis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporadiovenciRow=(TipoRadioVenci) tiporadiovencis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonRadioVenciProveActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoRadioVenci tiporadiovenci) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoRadioVenci==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenciLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporadiovenci = (TipoRadioVenci)this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tiporadiovenci = (TipoRadioVenci)this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tiporadiovenci!=null) {
						this.tiporadiovenci = tiporadiovenci;
					} else {
						this.tiporadiovenci = new TipoRadioVenci();
					}
				}

				if(this.isTienePermisosRadioVenciProve && this.permiteMantenimiento(this.tiporadiovenci)) {
					RadioVenciProveBeanSwingJInternalFrame radiovenciproveBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFramePopup=new RadioVenciProveBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						radiovenciproveBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFramePopup;
					} else {
						radiovenciproveBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame;
					}

					List<TipoRadioVenci> tiporadiovencis=new ArrayList<TipoRadioVenci>();
					tiporadiovencis.add(this.tiporadiovenci);
					if(!esRelacionado) {
						//radiovenciproveBeanSwingJInternalFrame.radiovenciproveSessionBean.setConGuardarRelaciones(false);
						//radiovenciproveBeanSwingJInternalFrame.radiovenciproveSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					radiovenciproveBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoRadioVenci.cargarRadioVenciProveBeanSwingJInternalFrame(tiporadiovencis,this.tiporadiovenci,radiovenciproveBeanSwingJInternalFrame,/*conInicializar,*/radiovenciproveBeanSwingJInternalFrame.radiovenciproveSessionBean.getConGuardarRelaciones(),radiovenciproveBeanSwingJInternalFrame.radiovenciproveSessionBean.getEsGuardarRelacionado());
					radiovenciproveBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						radiovenciproveBeanSwingJInternalFrame.actualizarEstadoPanelsRadioVenciProve("no_relacionado");

						radiovenciproveBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(RadioVenciProveConstantesFunciones.ITAMANIOFILATABLA + (RadioVenciProveConstantesFunciones.ITAMANIOFILATABLA/2));

						radiovenciproveBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoRadioVenci=(TitledBorder)this.jScrollPanelDatosTipoRadioVenci.getBorder();
						TitledBorder titledBorderRadioVenciProve=(TitledBorder)radiovenciproveBeanSwingJInternalFrame.jScrollPanelDatosRadioVenciProve.getBorder();

						titledBorderRadioVenciProve.setTitle(titledBorderTipoRadioVenci.getTitle() + " -> Dias Vencidos");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,radiovenciproveBeanSwingJInternalFrame);
						}

						radiovenciproveBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(radiovenciproveBeanSwingJInternalFrame);

						radiovenciproveBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tiporadiovenciSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Dias Vencidos",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenciLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenciLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenciLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonRadioVenciClienteProveActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoRadioVenci tiporadiovenci) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoRadioVenci==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenciLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporadiovenci = (TipoRadioVenci)this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tiporadiovenci = (TipoRadioVenci)this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tiporadiovenci!=null) {
						this.tiporadiovenci = tiporadiovenci;
					} else {
						this.tiporadiovenci = new TipoRadioVenci();
					}
				}

				if(this.isTienePermisosRadioVenciClienteProve && this.permiteMantenimiento(this.tiporadiovenci)) {
					RadioVenciClienteProveBeanSwingJInternalFrame radiovenciclienteproveBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFramePopup=new RadioVenciClienteProveBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						radiovenciclienteproveBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFramePopup;
					} else {
						radiovenciclienteproveBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame;
					}

					List<TipoRadioVenci> tiporadiovencis=new ArrayList<TipoRadioVenci>();
					tiporadiovencis.add(this.tiporadiovenci);
					if(!esRelacionado) {
						//radiovenciclienteproveBeanSwingJInternalFrame.radiovenciclienteproveSessionBean.setConGuardarRelaciones(false);
						//radiovenciclienteproveBeanSwingJInternalFrame.radiovenciclienteproveSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					radiovenciclienteproveBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoRadioVenci.cargarRadioVenciClienteProveBeanSwingJInternalFrame(tiporadiovencis,this.tiporadiovenci,radiovenciclienteproveBeanSwingJInternalFrame,/*conInicializar,*/radiovenciclienteproveBeanSwingJInternalFrame.radiovenciclienteproveSessionBean.getConGuardarRelaciones(),radiovenciclienteproveBeanSwingJInternalFrame.radiovenciclienteproveSessionBean.getEsGuardarRelacionado());
					radiovenciclienteproveBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						radiovenciclienteproveBeanSwingJInternalFrame.actualizarEstadoPanelsRadioVenciClienteProve("no_relacionado");

						radiovenciclienteproveBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(RadioVenciClienteProveConstantesFunciones.ITAMANIOFILATABLA + (RadioVenciClienteProveConstantesFunciones.ITAMANIOFILATABLA/2));

						radiovenciclienteproveBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoRadioVenci=(TitledBorder)this.jScrollPanelDatosTipoRadioVenci.getBorder();
						TitledBorder titledBorderRadioVenciClienteProve=(TitledBorder)radiovenciclienteproveBeanSwingJInternalFrame.jScrollPanelDatosRadioVenciClienteProve.getBorder();

						titledBorderRadioVenciClienteProve.setTitle(titledBorderTipoRadioVenci.getTitle() + " -> Dias Por Vencer");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,radiovenciclienteproveBeanSwingJInternalFrame);
						}

						radiovenciclienteproveBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(radiovenciclienteproveBeanSwingJInternalFrame);

						radiovenciclienteproveBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tiporadiovenciSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Dias Por Vencer",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenciLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenciLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenciLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoRadioVenci(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoRadioVenci.setVisible((this.isVisibilidadCeldaNuevoTipoRadioVenci && this.isPermisoNuevoTipoRadioVenci));			
			this.jButtonDuplicarTipoRadioVenci.setVisible((this.isVisibilidadCeldaDuplicarTipoRadioVenci && this.isPermisoDuplicarTipoRadioVenci));			
			this.jButtonCopiarTipoRadioVenci.setVisible((this.isVisibilidadCeldaCopiarTipoRadioVenci && this.isPermisoCopiarTipoRadioVenci));
			this.jButtonVerFormTipoRadioVenci.setVisible((this.isVisibilidadCeldaVerFormTipoRadioVenci && this.isPermisoVerFormTipoRadioVenci));
			
			this.jButtonAbrirOrderByTipoRadioVenci.setVisible((this.isVisibilidadCeldaOrdenTipoRadioVenci && this.isPermisoOrdenTipoRadioVenci));			
			
			this.jButtonNuevoRelacionesTipoRadioVenci.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRadioVenci && this.isPermisoNuevoTipoRadioVenci));			
			this.jButtonNuevoGuardarCambiosTipoRadioVenci.setVisible((this.isVisibilidadCeldaNuevoTipoRadioVenci && this.isPermisoNuevoTipoRadioVenci && this.isPermisoGuardarCambiosTipoRadioVenci));
			
			if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) {
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonModificarTipoRadioVenci.setVisible((this.isVisibilidadCeldaModificarTipoRadioVenci && this.isPermisoActualizarTipoRadioVenci));	
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonActualizarTipoRadioVenci.setVisible((this.isVisibilidadCeldaActualizarTipoRadioVenci && this.isPermisoActualizarTipoRadioVenci));	
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonEliminarTipoRadioVenci.setVisible((this.isVisibilidadCeldaEliminarTipoRadioVenci && this.isPermisoEliminarTipoRadioVenci));
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonCancelarTipoRadioVenci.setVisible(this.isVisibilidadCeldaCancelarTipoRadioVenci);							
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonGuardarCambiosTipoRadioVenci.setVisible((this.isVisibilidadCeldaGuardarTipoRadioVenci && this.isPermisoGuardarCambiosTipoRadioVenci));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoRadioVenci.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRadioVenci && this.isPermisoGuardarCambiosTipoRadioVenci));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoRadioVenci.setVisible((this.isVisibilidadCeldaNuevoTipoRadioVenci && this.isPermisoNuevoTipoRadioVenci));						
			this.jButtonDuplicarToolBarTipoRadioVenci.setVisible((this.isVisibilidadCeldaDuplicarTipoRadioVenci && this.isPermisoDuplicarTipoRadioVenci));						
			this.jButtonCopiarToolBarTipoRadioVenci.setVisible((this.isVisibilidadCeldaCopiarTipoRadioVenci && this.isPermisoCopiarTipoRadioVenci));			
			this.jButtonVerFormToolBarTipoRadioVenci.setVisible((this.isVisibilidadCeldaVerFormTipoRadioVenci && this.isPermisoVerFormTipoRadioVenci));			
			this.jButtonAbrirOrderByToolBarTipoRadioVenci.setVisible((this.isVisibilidadCeldaOrdenTipoRadioVenci && this.isPermisoOrdenTipoRadioVenci));
			this.jButtonNuevoRelacionesToolBarTipoRadioVenci.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRadioVenci && this.isPermisoNuevoTipoRadioVenci));			
			this.jButtonNuevoGuardarCambiosToolBarTipoRadioVenci.setVisible((this.isVisibilidadCeldaNuevoTipoRadioVenci && this.isPermisoNuevoTipoRadioVenci && this.isPermisoGuardarCambiosTipoRadioVenci));			
			
			if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) {
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonModificarToolBarTipoRadioVenci.setVisible((this.isVisibilidadCeldaModificarTipoRadioVenci && this.isPermisoActualizarTipoRadioVenci));	
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonActualizarToolBarTipoRadioVenci.setVisible((this.isVisibilidadCeldaActualizarTipoRadioVenci  && this.isPermisoActualizarTipoRadioVenci));	
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonEliminarToolBarTipoRadioVenci.setVisible((this.isVisibilidadCeldaEliminarTipoRadioVenci && this.isPermisoEliminarTipoRadioVenci));
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonCancelarToolBarTipoRadioVenci.setVisible(this.isVisibilidadCeldaCancelarTipoRadioVenci);				
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonGuardarCambiosToolBarTipoRadioVenci.setVisible((this.isVisibilidadCeldaGuardarTipoRadioVenci && this.isPermisoGuardarCambiosTipoRadioVenci));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoRadioVenci.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRadioVenci && this.isPermisoGuardarCambiosTipoRadioVenci));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoRadioVenci.setVisible((this.isVisibilidadCeldaNuevoTipoRadioVenci && this.isPermisoNuevoTipoRadioVenci));			
			this.jMenuItemDuplicarTipoRadioVenci.setVisible((this.isVisibilidadCeldaDuplicarTipoRadioVenci && this.isPermisoDuplicarTipoRadioVenci));			
			this.jMenuItemCopiarTipoRadioVenci.setVisible((this.isVisibilidadCeldaCopiarTipoRadioVenci && this.isPermisoCopiarTipoRadioVenci));			
			this.jMenuItemVerFormTipoRadioVenci.setVisible((this.isVisibilidadCeldaVerFormTipoRadioVenci && this.isPermisoVerFormTipoRadioVenci));			
			this.jMenuItemAbrirOrderByTipoRadioVenci.setVisible((this.isVisibilidadCeldaOrdenTipoRadioVenci && this.isPermisoOrdenTipoRadioVenci));			
			//this.jMenuItemMostrarOcultarTipoRadioVenci.setVisible((this.isVisibilidadCeldaOrdenTipoRadioVenci && this.isPermisoOrdenTipoRadioVenci));
			this.jMenuItemDetalleAbrirOrderByTipoRadioVenci.setVisible((this.isVisibilidadCeldaOrdenTipoRadioVenci && this.isPermisoOrdenTipoRadioVenci));			
			//this.jMenuItemDetalleMostrarOcultarTipoRadioVenci.setVisible((this.isVisibilidadCeldaOrdenTipoRadioVenci && this.isPermisoOrdenTipoRadioVenci));			
			this.jMenuItemNuevoRelacionesTipoRadioVenci.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRadioVenci && this.isPermisoNuevoTipoRadioVenci));			
			this.jMenuItemNuevoGuardarCambiosTipoRadioVenci.setVisible((this.isVisibilidadCeldaNuevoTipoRadioVenci && this.isPermisoNuevoTipoRadioVenci && this.isPermisoGuardarCambiosTipoRadioVenci));									
			
			if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) {
			this.jInternalFrameDetalleFormTipoRadioVenci.jMenuItemModificarTipoRadioVenci.setVisible((this.isVisibilidadCeldaModificarTipoRadioVenci && this.isPermisoActualizarTipoRadioVenci));	
			this.jInternalFrameDetalleFormTipoRadioVenci.jMenuItemActualizarTipoRadioVenci.setVisible((this.isVisibilidadCeldaActualizarTipoRadioVenci && this.isPermisoActualizarTipoRadioVenci));	
			this.jInternalFrameDetalleFormTipoRadioVenci.jMenuItemEliminarTipoRadioVenci.setVisible((this.isVisibilidadCeldaEliminarTipoRadioVenci && this.isPermisoEliminarTipoRadioVenci));
			this.jInternalFrameDetalleFormTipoRadioVenci.jMenuItemCancelarTipoRadioVenci.setVisible(this.isVisibilidadCeldaCancelarTipoRadioVenci);				
			}
			
			this.jMenuItemGuardarCambiosTipoRadioVenci.setVisible((this.isVisibilidadCeldaGuardarTipoRadioVenci && this.isPermisoGuardarCambiosTipoRadioVenci));						
			this.jMenuItemGuardarCambiosTablaTipoRadioVenci.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRadioVenci && this.isPermisoGuardarCambiosTipoRadioVenci));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoRadioVenci=this.jButtonNuevoTipoRadioVenci.isVisible();
			this.isVisibilidadCeldaDuplicarTipoRadioVenci=this.jButtonDuplicarTipoRadioVenci.isVisible();
			this.isVisibilidadCeldaCopiarTipoRadioVenci=this.jButtonCopiarTipoRadioVenci.isVisible();
			this.isVisibilidadCeldaVerFormTipoRadioVenci=this.jButtonVerFormTipoRadioVenci.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoRadioVenci=this.jButtonAbrirOrderByTipoRadioVenci.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoRadioVenci=this.jButtonNuevoRelacionesTipoRadioVenci.isVisible();
			this.isVisibilidadCeldaModificarTipoRadioVenci=this.jButtonModificarTipoRadioVenci.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) {
			this.isVisibilidadCeldaActualizarTipoRadioVenci=this.jInternalFrameDetalleFormTipoRadioVenci.jButtonActualizarTipoRadioVenci.isVisible();
			this.isVisibilidadCeldaEliminarTipoRadioVenci=this.jInternalFrameDetalleFormTipoRadioVenci.jButtonEliminarTipoRadioVenci.isVisible();
			this.isVisibilidadCeldaCancelarTipoRadioVenci=this.jInternalFrameDetalleFormTipoRadioVenci.jButtonCancelarTipoRadioVenci.isVisible();
			this.isVisibilidadCeldaGuardarTipoRadioVenci=this.jInternalFrameDetalleFormTipoRadioVenci.jButtonGuardarCambiosTipoRadioVenci.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoRadioVenci=this.jButtonGuardarCambiosTablaTipoRadioVenci.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoRadioVenci=this.jButtonNuevoToolBarTipoRadioVenci.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRadioVenci=this.jButtonNuevoRelacionesToolBarTipoRadioVenci.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) {
			this.isVisibilidadCeldaModificarTipoRadioVenci=this.jInternalFrameDetalleFormTipoRadioVenci.jButtonModificarToolBarTipoRadioVenci.isVisible();
			this.isVisibilidadCeldaActualizarTipoRadioVenci=this.jInternalFrameDetalleFormTipoRadioVenci.jButtonActualizarToolBarTipoRadioVenci.isVisible();
			this.isVisibilidadCeldaEliminarTipoRadioVenci=this.jInternalFrameDetalleFormTipoRadioVenci.jButtonEliminarToolBarTipoRadioVenci.isVisible();
			this.isVisibilidadCeldaCancelarTipoRadioVenci=this.jInternalFrameDetalleFormTipoRadioVenci.jButtonCancelarToolBarTipoRadioVenci.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRadioVenci=this.jButtonGuardarCambiosToolBarTipoRadioVenci.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRadioVenci=this.jButtonGuardarCambiosTablaToolBarTipoRadioVenci.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoRadioVenci=this.jMenuItemNuevoTipoRadioVenci.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRadioVenci=this.jMenuItemNuevoRelacionesTipoRadioVenci.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) {
			this.isVisibilidadCeldaModificarTipoRadioVenci=this.jInternalFrameDetalleFormTipoRadioVenci.jMenuItemModificarTipoRadioVenci.isVisible();
			this.isVisibilidadCeldaActualizarTipoRadioVenci=this.jInternalFrameDetalleFormTipoRadioVenci.jMenuItemActualizarTipoRadioVenci.isVisible();
			this.isVisibilidadCeldaEliminarTipoRadioVenci=this.jInternalFrameDetalleFormTipoRadioVenci.jMenuItemEliminarTipoRadioVenci.isVisible();
			this.isVisibilidadCeldaCancelarTipoRadioVenci=this.jInternalFrameDetalleFormTipoRadioVenci.jMenuItemCancelarTipoRadioVenci.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRadioVenci=this.jMenuItemGuardarCambiosTipoRadioVenci.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRadioVenci=this.jMenuItemGuardarCambiosTablaTipoRadioVenci.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoRadioVenci(Boolean esInicializar) {
		if(TipoRadioVenciJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tiporadiovenciSessionBean.getConGuardarRelaciones()) {
				//if(this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRadioVenci();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoRadioVenci(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoRadioVenci() {
		this.jButtonNuevoTipoRadioVenci.setVisible(this.isPermisoNuevoTipoRadioVenci);			
		this.jButtonDuplicarTipoRadioVenci.setVisible(this.isPermisoDuplicarTipoRadioVenci);			
		this.jButtonCopiarTipoRadioVenci.setVisible(this.isPermisoCopiarTipoRadioVenci);			
		this.jButtonVerFormTipoRadioVenci.setVisible(this.isPermisoVerFormTipoRadioVenci);			
		
		this.jButtonAbrirOrderByTipoRadioVenci.setVisible(this.isPermisoOrdenTipoRadioVenci);					
		
		this.jButtonNuevoRelacionesTipoRadioVenci.setVisible(this.isPermisoNuevoTipoRadioVenci);			
		
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonModificarTipoRadioVenci.setVisible(this.isPermisoActualizarTipoRadioVenci);	
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonActualizarTipoRadioVenci.setVisible(this.isPermisoActualizarTipoRadioVenci);	
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonEliminarTipoRadioVenci.setVisible(this.isPermisoEliminarTipoRadioVenci);
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonCancelarTipoRadioVenci.setVisible(this.isVisibilidadCeldaCancelarTipoRadioVenci);						
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonGuardarCambiosTipoRadioVenci.setVisible(this.isPermisoGuardarCambiosTipoRadioVenci);							
		}
		
		this.jButtonGuardarCambiosTablaTipoRadioVenci.setVisible(this.isPermisoActualizarTipoRadioVenci);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRadioVenci() {
		this.jInternalFrameDetalleFormTipoRadioVenci.jButtonModificarTipoRadioVenci.setVisible(this.isPermisoActualizarTipoRadioVenci);	
		this.jInternalFrameDetalleFormTipoRadioVenci.jButtonActualizarTipoRadioVenci.setVisible(this.isPermisoActualizarTipoRadioVenci);	
		this.jInternalFrameDetalleFormTipoRadioVenci.jButtonEliminarTipoRadioVenci.setVisible(this.isPermisoEliminarTipoRadioVenci);
		this.jInternalFrameDetalleFormTipoRadioVenci.jButtonCancelarTipoRadioVenci.setVisible(this.isVisibilidadCeldaCancelarTipoRadioVenci);							
		this.jInternalFrameDetalleFormTipoRadioVenci.jButtonGuardarCambiosTipoRadioVenci.setVisible((this.isVisibilidadCeldaGuardarTipoRadioVenci && this.isPermisoGuardarCambiosTipoRadioVenci));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoRadioVenci() {
		if(TipoRadioVenciJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoRadioVenci();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoRadioVenci() {
	}
	
	public void jTableDatosTipoRadioVenciListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoRadioVenci(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoRadioVenciBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenciLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRadioVenci.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRadioVenci(this.gettiporadiovenci(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRadioVenci(this.tiporadiovenci);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporadiovenci =(TipoRadioVenci) this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporadiovenci =(TipoRadioVenci) this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporadiovenci==null) {
						this.tiporadiovenci = new TipoRadioVenci();
					}

					this.setVariablesFormularioToObjetoActualTipoRadioVenci(this.tiporadiovenci,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRadioVenci(this.tiporadiovenci);
				}

				if(this.tiporadiovenci.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tiporadiovenci.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRadioVenci(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenciLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenciLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenciLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoRadioVenciBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenciLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRadioVenci.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRadioVenci(this.gettiporadiovenci(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRadioVenci(this.tiporadiovenci);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporadiovenci =(TipoRadioVenci) this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporadiovenci =(TipoRadioVenci) this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporadiovenci==null) {
						this.tiporadiovenci = new TipoRadioVenci();
					}

					this.setVariablesFormularioToObjetoActualTipoRadioVenci(this.tiporadiovenci,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRadioVenci(this.tiporadiovenci);
				}

				if(this.tiporadiovenci.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tiporadiovenci.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRadioVenci(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenciLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenciLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenciLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoRadioVenci() {
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) {
		

		if(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) {
			this.jInternalFrameDetalleFormTipoRadioVenci.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoRadioVenci.dispose();
			this.jInternalFrameDetalleFormTipoRadioVenci=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoRadioVenci!=null) {
			this.jInternalFrameReporteDinamicoTipoRadioVenci.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoRadioVenci.dispose();
			this.jInternalFrameReporteDinamicoTipoRadioVenci=null;
		}
		
		if(this.jInternalFrameImportacionTipoRadioVenci!=null) {
			this.jInternalFrameImportacionTipoRadioVenci.setVisible(false);	    			
			this.jInternalFrameImportacionTipoRadioVenci.dispose();
			this.jInternalFrameImportacionTipoRadioVenci=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoRadioVenci();
			
			TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoRadioVenci")) {
				jButtonNuevoTipoRadioVenciActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoRadioVenci")) {
				jButtonDuplicarTipoRadioVenciActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoRadioVenci")) {
				jButtonCopiarTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoRadioVenci")) {
				jButtonVerFormTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoRadioVenci")) {
				jButtonNuevoTipoRadioVenciActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoRadioVenci")) {
				jButtonDuplicarTipoRadioVenciActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoRadioVenci")) {
				jButtonNuevoTipoRadioVenciActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoRadioVenci")) {
				jButtonDuplicarTipoRadioVenciActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoRadioVenci")) {
				jButtonNuevoTipoRadioVenciActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoRadioVenci")) {
				jButtonNuevoTipoRadioVenciActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoRadioVenci")) {
				jButtonNuevoTipoRadioVenciActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoRadioVenci")) {
				jButtonModificarTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoRadioVenci")) {
				jButtonModificarTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoRadioVenci")) {
				jButtonModificarTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoRadioVenci")) {
				jButtonActualizarTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoRadioVenci")) {
				jButtonActualizarTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoRadioVenci")) {
				jButtonActualizarTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoRadioVenci")) {
				jButtonEliminarTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoRadioVenci")) {
				jButtonEliminarTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoRadioVenci")) {
				jButtonEliminarTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoRadioVenci")) {
				jButtonCancelarTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoRadioVenci")) {
				jButtonCancelarTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoRadioVenci")) {
				jButtonCancelarTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoRadioVenci")) {
				jButtonCerrarTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoRadioVenci")) {
				jButtonCerrarTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoRadioVenci")) {
				jButtonCerrarTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoRadioVenci")) {
				jButtonMostrarOcultarTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoRadioVenci")) {
				jButtonCancelarTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoRadioVenci")) {
				jButtonGuardarCambiosTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoRadioVenci")) {
				jButtonGuardarCambiosTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoRadioVenci")) {
				jButtonCopiarTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoRadioVenci")) {
				jButtonVerFormTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoRadioVenci")) {
				jButtonGuardarCambiosTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoRadioVenci")) {
				jButtonCopiarTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoRadioVenci")) {
				jButtonVerFormTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoRadioVenci")) {
				jButtonGuardarCambiosTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoRadioVenci")) {
				jButtonGuardarCambiosTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoRadioVenci")) {
				jButtonGuardarCambiosTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoRadioVenci")) {
				jButtonRecargarInformacionTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoRadioVenci")) {
				jButtonRecargarInformacionTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoRadioVenci")) {
				jButtonRecargarInformacionTipoRadioVenciActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoRadioVenci")) {
				jButtonAnterioresTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoRadioVenci")) {
				jButtonAnterioresTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoRadioVenci")) {
				jButtonAnterioresTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoRadioVenci")) {
				jButtonSiguientesTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoRadioVenci")) {
				jButtonSiguientesTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoRadioVenci")) {
				jButtonSiguientesTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoRadioVenci") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoRadioVenci")) {
				jButtonAbrirOrderByTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoRadioVenci") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoRadioVenci")) {
				jButtonMostrarOcultarTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRadioVenci")) {
				jButtonNuevoGuardarCambiosTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoRadioVenci")) {
				jButtonNuevoGuardarCambiosTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoRadioVenci")) {
				jButtonNuevoGuardarCambiosTipoRadioVenciActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoRadioVenci")) {
				jButtonCerrarReporteDinamicoTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoRadioVenci")) {
				jButtonGenerarReporteDinamicoTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoRadioVenci")) {
				
				jButtonGenerarExcelReporteDinamicoTipoRadioVenciActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoRadioVenci")) {
				jButtonCerrarImportacionTipoRadioVenciActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoRadioVenci")) {
				
				jButtonGenerarImportacionTipoRadioVenciActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoRadioVenci")) {
				
				jButtonAbrirImportacionTipoRadioVenciActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoRadioVenci")) {
				jComboBoxTiposAccionesTipoRadioVenciActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoRadioVenci")) {
				jComboBoxTiposRelacionesTipoRadioVenciActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoRadioVenci")) {
				jComboBoxTiposAccionesTipoRadioVenciActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoRadioVenci")) {
				
				jComboBoxTiposSeleccionarTipoRadioVenciActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoRadioVenci")) {
				jTextFieldValorCampoGeneralTipoRadioVenciActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoRadioVenci")) {
				jButtonAbrirOrderByTipoRadioVenciActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoRadioVenci")) {
				jButtonAbrirOrderByTipoRadioVenciActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoRadioVenci")) {
				jButtonCerrarOrderByTipoRadioVenciActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoRadioVenciBusqueda")) {
				this.jButtonidTipoRadioVenciBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoRadioVenciBusqueda")) {
				this.jButtonnombreTipoRadioVenciBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoRadioVenci();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRadioVenciActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporadiovenci);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporadiovenci);
				
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
				
				


				
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRadioVenci.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRadioVenci.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoRadioVenci tiporadiovenciLocal=null;
			
			if(!this.getEsControlTabla()) {
				tiporadiovenciLocal=this.tiporadiovenci;
			} else {
				tiporadiovenciLocal=this.tiporadiovenciAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporadiovenci);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporadiovenci);
				
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
							
				
				


				
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRadioVenci.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRadioVenci.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRadioVenciActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRadioVenci.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenciAnterior =(TipoRadioVenci) this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporadiovenciAnterior =(TipoRadioVenci) this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
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
			
			TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
			
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
			
			


			
			TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRadioVenciActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporadiovenci);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporadiovenci);
				
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
								
						
				


				
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRadioVenci.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRadioVenci.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporadiovenci);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporadiovenci);
				
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
								
				
				


				
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRadioVenci.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRadioVenci.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRadioVenciActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRadioVenci.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenciAnterior =(TipoRadioVenci) this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporadiovenciAnterior =(TipoRadioVenci) this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporadiovenci);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporadiovenci);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRadioVenciActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRadioVenci.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenciAnterior =(TipoRadioVenci) this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporadiovenciAnterior =(TipoRadioVenci) this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRadioVenciActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporadiovenci);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporadiovenci);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporadiovenci);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporadiovenci);
				
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
							
				
				


				
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRadioVenci.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRadioVenci.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRadioVenciActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRadioVenci.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporadiovenciAnterior =(TipoRadioVenci) this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporadiovenciAnterior =(TipoRadioVenci) this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
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
			
			TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
			
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
			
			


			
			TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRadioVenciActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporadiovenci);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporadiovenci);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporadiovenci);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporadiovenci);
				
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
								
				
				


				
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRadioVenci.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRadioVenci.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRadioVenciActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRadioVenci.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenciAnterior =(TipoRadioVenci) this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporadiovenciAnterior =(TipoRadioVenci) this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRadioVenciActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporadiovenci);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporadiovenci);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRadioVenciActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporadiovenci);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporadiovenci);
				
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoRadioVenci")) {
					jCheckBoxSeleccionarTodosTipoRadioVenciItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoRadioVenci")) {
					jCheckBoxSeleccionadosTipoRadioVenciItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoRadioVenci")) {
					
				}
				
				


				
				
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRadioVenci.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRadioVenci.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporadiovenci);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tiporadiovenci);
				
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
												
				
				


				
				
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRadioVenci.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRadioVenci.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRadioVenciActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRadioVenci.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporadiovenciAnterior =(TipoRadioVenci) this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporadiovenciAnterior =(TipoRadioVenci) this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRadioVenciActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporadiovenci);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporadiovenci);
				
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
				
				
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
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
			
			TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
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
			
			


			
			TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRadioVenciActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporadiovenci);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporadiovenci);
				
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRadioVenci.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRadioVenci.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporadiovenci);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporadiovenci);
				
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
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
				
				


				
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRadioVenci.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRadioVenci.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRadioVenciActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRadioVenci.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporadiovenciAnterior =(TipoRadioVenci) this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporadiovenciAnterior =(TipoRadioVenci) this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoRadioVenci")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoRadioVenciListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoRadioVenci.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tiporadiovenci =(TipoRadioVenci) this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tiporadiovenci =(TipoRadioVenci) this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tiporadiovenci);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoRadioVenci")) {
				
				}
				
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoRadioVenci")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoRadioVenci.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoRadioVenci")) {
			
			}
			
			TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoRadioVenci();
			
			TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
			
			if(sTipo.equals("NuevoTipoRadioVenci")) {
				jButtonNuevoTipoRadioVenciActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoRadioVenci")) {
				jButtonDuplicarTipoRadioVenciActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoRadioVenci")) {
				jButtonCopiarTipoRadioVenciActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoRadioVenci")) {
				jButtonVerFormTipoRadioVenciActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoRadioVenci")) {
				jButtonNuevoTipoRadioVenciActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoRadioVenci")) {
				jButtonModificarTipoRadioVenciActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoRadioVenci")) {
				jButtonActualizarTipoRadioVenciActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoRadioVenci")) {
				jButtonEliminarTipoRadioVenciActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoRadioVenci")) {
				jButtonGuardarCambiosTipoRadioVenciActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoRadioVenci")) {
				jButtonCancelarTipoRadioVenciActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoRadioVenci")) {
				jButtonCerrarTipoRadioVenciActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoRadioVenci")) {
				jButtonGuardarCambiosTipoRadioVenciActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRadioVenci")) {
				jButtonNuevoGuardarCambiosTipoRadioVenciActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoRadioVenci")) {
				jButtonAbrirOrderByTipoRadioVenciActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoRadioVenci")) {
				jButtonRecargarInformacionTipoRadioVenciActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoRadioVenci")) {
				jButtonAnterioresTipoRadioVenciActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoRadioVenci")) {
				jButtonSiguientesTipoRadioVenciActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoRadioVenciBusqueda")) {
				this.jButtonidTipoRadioVenciBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoRadioVenciBusqueda")) {
				this.jButtonnombreTipoRadioVenciBusquedaActionPerformed(evt);
			}
			
			TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoRadioVenci();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoRadioVenci")) {
				closingInternalFrameTipoRadioVenci();
				
			} else if(sTipo.equals("jButtonCancelarTipoRadioVenci")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoRadioVenci = (JInternalFrameBase)evt.getSource();
	            	
	            TipoRadioVenciBeanSwingJInternalFrame jInternalFrameParent=(TipoRadioVenciBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRadioVenci.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoRadioVenciActionPerformed(null);
			}
			
			TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporadiovenci,new Object(),this.tiporadiovenciParameterGeneral,this.tiporadiovenciReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoRadioVenci(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoRadioVenci(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoRadioVenci(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tiporadiovenci)) {
			if(!esControlTabla) {
				if(TipoRadioVenciJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoRadioVenci(this.tiporadiovenci,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRadioVenci(this.tiporadiovenci);			
				}
				
				if(this.tiporadiovenciSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoRadioVenci(this.tiporadiovenci,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporadiovenciReturnGeneral=tiporadiovenciLogic.procesarEventosTipoRadioVencisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporadiovenciLogic.getTipoRadioVencis(),this.tiporadiovenci,this.tiporadiovenciParameterGeneral,this.isEsNuevoTipoRadioVenci,classes);//this.tiporadiovenciLogic.getTipoRadioVenci()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoRadioVenci(this.tiporadiovenciReturnGeneral,this.tiporadiovenciBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tiporadiovenciSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoRadioVenci(classes,this.tiporadiovenciReturnGeneral,this.tiporadiovenciBean,false);
					}
						
					if(this.tiporadiovenciReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoRadioVenci(this.tiporadiovenciReturnGeneral.getTipoRadioVenci());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoRadioVenci(this.tiporadiovenciReturnGeneral.getTipoRadioVenci());	
					}
						
					if(this.tiporadiovenciReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoRadioVenci(this.tiporadiovenciReturnGeneral.getTipoRadioVenci(),classes);//this.tiporadiovenciBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoRadioVenci(this.tiporadiovenci,classes);//this.tiporadiovenciBean);									
				}
			
				if(TipoRadioVenciJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoRadioVenci(this.tiporadiovenci,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRadioVenci(this.tiporadiovenci);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tiporadiovenciAnterior!=null) {
						this.tiporadiovenci=this.tiporadiovenciAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporadiovenciReturnGeneral=tiporadiovenciLogic.procesarEventosTipoRadioVencisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporadiovenciLogic.getTipoRadioVencis(),this.tiporadiovenci,this.tiporadiovenciParameterGeneral,this.isEsNuevoTipoRadioVenci,classes);//this.tiporadiovenciLogic.getTipoRadioVenci()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporadiovenciSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporadiovenciSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tiporadiovenciReturnGeneral.getTipoRadioVenci(),tiporadiovenciLogic.getTipoRadioVencis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tiporadiovenciReturnGeneral.getTipoRadioVenci(),this.tiporadiovencis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoRadioVenci.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoRadioVenci.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoRadioVenci();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoRadioVenci() throws Exception {
		
		TipoRadioVenciModel tiporadiovenciModel=(TipoRadioVenciModel)this.jTableDatosTipoRadioVenci.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporadiovenciModel.tiporadiovencis=this.tiporadiovenciLogic.getTipoRadioVencis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tiporadiovenciModel.tiporadiovencis=this.tiporadiovencis;
		}
		
		
		((TipoRadioVenciModel) this.jTableDatosTipoRadioVenci.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoRadioVenci() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettiporadiovenciAnterior(),this.tiporadiovenciLogic.getTipoRadioVencis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettiporadiovenciAnterior(),this.tiporadiovencis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoRadioVenci();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoRadioVenci(TipoRadioVenci tiporadiovenci,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(RadioVenciProve.class)) {
					this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame.radiovenciproveLogic.setRadioVenciProves(tiporadiovenci.getRadioVenciProves());
					this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame.inicializarActualizarBindingTablaRadioVenciProve(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(RadioVenciClienteProve.class)) {
					this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame.radiovenciclienteproveLogic.setRadioVenciClienteProves(tiporadiovenci.getRadioVenciClienteProves());
					this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame.inicializarActualizarBindingTablaRadioVenciClienteProve(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
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
										
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporadiovenci,new Object(),generalEntityParameterGeneral,this.tiporadiovenciReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tiporadiovenciSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoRadioVenciConstantesFunciones.getClassesRelationshipsOfTipoRadioVenci(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoRadioVenciConstantesFunciones.getClassesRelationshipsFromStringsOfTipoRadioVenci(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoRadioVenci(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoRadioVenciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporadiovenci,new Object(),generalEntityParameterGeneral,this.tiporadiovenciReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoRadioVenci(TipoRadioVenciBean tiporadiovenciBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(RadioVenciProve.class)) {
					this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame.radiovenciproveLogic.setRadioVenciProves(tiporadiovenci.getRadioVenciProves());
					this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame.inicializarActualizarBindingTablaRadioVenciProve(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(RadioVenciClienteProve.class)) {
					this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame.radiovenciclienteproveLogic.setRadioVenciClienteProves(tiporadiovenci.getRadioVenciClienteProves());
					this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame.inicializarActualizarBindingTablaRadioVenciClienteProve(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoRadioVenci(ArrayList<Classe> classes,TipoRadioVenciReturnGeneral tiporadiovenciReturnGeneral,TipoRadioVenciBean tiporadiovenciBean,Boolean conDefault) throws Exception {
		
			this.tiporadiovenciBean.setRadioVenciProves(tiporadiovenciReturnGeneral.getTipoRadioVenci().getRadioVenciProves());
			this.tiporadiovenciBean.setRadioVenciClienteProves(tiporadiovenciReturnGeneral.getTipoRadioVenci().getRadioVenciClienteProves());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoRadioVenci(TipoRadioVenci tiporadiovenci,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(RadioVenciProve.class)) {
					tiporadiovenci.setRadioVenciProves(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveBeanSwingJInternalFrame.radiovenciproveLogic.getRadioVenciProves());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(RadioVenciClienteProve.class)) {
					tiporadiovenci.setRadioVenciClienteProves(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveBeanSwingJInternalFrame.radiovenciclienteproveLogic.getRadioVenciClienteProves());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tiporadiovenci)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoRadioVenci = new TipoRadioVenciDetalleFormJInternalFrame(jDesktopPane,this.tiporadiovenciSessionBean.getConGuardarRelaciones(),this.tiporadiovenciSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRadioVenci);
		this.jInternalFrameDetalleFormTipoRadioVenci.setVisible(false);
		this.jInternalFrameDetalleFormTipoRadioVenci.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoRadioVenci.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoRadioVenci.tiporadiovenciLogic=this.tiporadiovenciLogic;
		
		this.cargarCombosFrameForeignKeyTipoRadioVenci("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRadioVenci();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRadioVenci();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoRadioVenci("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoRadioVenci();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoRadioVenci.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRadioVenci"));
		
		this.jInternalFrameDetalleFormTipoRadioVenci.jButtonModificarTipoRadioVenci.addActionListener(new ButtonActionListener(this,"ModificarTipoRadioVenci"));

		
		this.jInternalFrameDetalleFormTipoRadioVenci.jButtonModificarToolBarTipoRadioVenci.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRadioVenci"));
					
		this.jInternalFrameDetalleFormTipoRadioVenci.jMenuItemModificarTipoRadioVenci.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRadioVenci"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRadioVenci.jButtonActualizarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"ActualizarTipoRadioVenci"));
		
		
		this.jInternalFrameDetalleFormTipoRadioVenci.jButtonActualizarToolBarTipoRadioVenci.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRadioVenci"));
						
		this.jInternalFrameDetalleFormTipoRadioVenci.jMenuItemActualizarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRadioVenci"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRadioVenci.jButtonEliminarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"EliminarTipoRadioVenci"));
		
		
		this.jInternalFrameDetalleFormTipoRadioVenci.jButtonEliminarToolBarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRadioVenci"));
								
		this.jInternalFrameDetalleFormTipoRadioVenci.jMenuItemEliminarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRadioVenci"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRadioVenci.jButtonCancelarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"CancelarTipoRadioVenci"));
		
		
		this.jInternalFrameDetalleFormTipoRadioVenci.jButtonCancelarToolBarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRadioVenci"));
					
		this.jInternalFrameDetalleFormTipoRadioVenci.jMenuItemCancelarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRadioVenci"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoRadioVenci.jMenuItemDetalleCerrarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRadioVenci"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRadioVenci.jButtonGuardarCambiosToolBarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRadioVenci"));
		
		
		
		this.jInternalFrameDetalleFormTipoRadioVenci.jButtonGuardarCambiosToolBarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRadioVenci"));
		
		
		
		this.jInternalFrameDetalleFormTipoRadioVenci.jComboBoxTiposAccionesFormularioTipoRadioVenci.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRadioVenci"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRadioVenci.jButtonidTipoRadioVenciBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRadioVenciBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRadioVenci.jButtonnombreTipoRadioVenciBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRadioVenciBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoRadioVenci.jTabbedPaneRelacionesTipoRadioVenci.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRadioVenci"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoRadioVenci"));
		
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRadioVenci.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRadioVenci"));
		}
		
		this.jTableDatosTipoRadioVenci.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoRadioVenci"));
		
		this.jTableDatosTipoRadioVenci.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoRadioVenci"));
		
		this.jButtonNuevoTipoRadioVenci.addActionListener(new ButtonActionListener(this,"NuevoTipoRadioVenci"));
		
		this.jButtonDuplicarTipoRadioVenci.addActionListener(new ButtonActionListener(this,"DuplicarTipoRadioVenci"));
		
		this.jButtonCopiarTipoRadioVenci.addActionListener(new ButtonActionListener(this,"CopiarTipoRadioVenci"));
		
		this.jButtonVerFormTipoRadioVenci.addActionListener(new ButtonActionListener(this,"VerFormTipoRadioVenci"));
		
		
		this.jButtonNuevoToolBarTipoRadioVenci.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoRadioVenci"));
			
		this.jButtonDuplicarToolBarTipoRadioVenci.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoRadioVenci"));
			
		this.jMenuItemNuevoTipoRadioVenci.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoRadioVenci"));
			
		this.jMenuItemDuplicarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoRadioVenci"));		
		
		
		this.jButtonNuevoRelacionesTipoRadioVenci.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoRadioVenci"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoRadioVenci.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoRadioVenci"));
			
		this.jMenuItemNuevoRelacionesTipoRadioVenci.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoRadioVenci"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonModificarTipoRadioVenci.addActionListener(new ButtonActionListener(this,"ModificarTipoRadioVenci"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonModificarToolBarTipoRadioVenci.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRadioVenci"));
			
			this.jInternalFrameDetalleFormTipoRadioVenci.jMenuItemModificarTipoRadioVenci.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRadioVenci"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonActualizarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"ActualizarTipoRadioVenci"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonActualizarToolBarTipoRadioVenci.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRadioVenci"));
				
			this.jInternalFrameDetalleFormTipoRadioVenci.jMenuItemActualizarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRadioVenci"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonEliminarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"EliminarTipoRadioVenci"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonEliminarToolBarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRadioVenci"));
						
			this.jInternalFrameDetalleFormTipoRadioVenci.jMenuItemEliminarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRadioVenci"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonCancelarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"CancelarTipoRadioVenci"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonCancelarToolBarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRadioVenci"));
			
			this.jInternalFrameDetalleFormTipoRadioVenci.jMenuItemCancelarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRadioVenci"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoRadioVenci"));		
		
		
		this.jButtonCerrarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"CerrarTipoRadioVenci"));
		
		
		this.jButtonCerrarToolBarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoRadioVenci"));
			
		this.jMenuItemCerrarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoRadioVenci"));
			
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRadioVenci.jMenuItemDetalleCerrarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRadioVenci"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonGuardarCambiosTipoRadioVenci.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoRadioVenci"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRadioVenci.jButtonGuardarCambiosToolBarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRadioVenci"));
		}
		
		this.jButtonCopiarToolBarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoRadioVenci"));
			
		this.jButtonVerFormToolBarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoRadioVenci"));
		
		this.jMenuItemGuardarCambiosTipoRadioVenci.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoRadioVenci"));
			
		this.jMenuItemCopiarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoRadioVenci"));		
		
		this.jMenuItemVerFormTipoRadioVenci.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoRadioVenci"));		
		
		
		this.jButtonGuardarCambiosTablaTipoRadioVenci.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRadioVenci"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoRadioVenci"));
			
		this.jMenuItemGuardarCambiosTablaTipoRadioVenci.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRadioVenci"));		
		
		
		
		this.jButtonRecargarInformacionTipoRadioVenci.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoRadioVenci"));
					
		this.jButtonRecargarInformacionToolBarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoRadioVenci"));
		
		this.jMenuItemRecargarInformacionTipoRadioVenci.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoRadioVenci"));		
		
		
		
		this.jButtonAnterioresTipoRadioVenci.addActionListener (new ButtonActionListener(this,"AnterioresTipoRadioVenci"));
		
		
		this.jButtonAnterioresToolBarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoRadioVenci"));
		
		this.jMenuItemAnterioresTipoRadioVenci.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoRadioVenci"));		
		
		
		this.jButtonSiguientesTipoRadioVenci.addActionListener (new ButtonActionListener(this,"SiguientesTipoRadioVenci"));
		
		
		this.jButtonSiguientesToolBarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoRadioVenci"));
			
		this.jMenuItemSiguientesTipoRadioVenci.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoRadioVenci"));
			
		this.jMenuItemAbrirOrderByTipoRadioVenci.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoRadioVenci"));
			
		this.jMenuItemMostrarOcultarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoRadioVenci"));
			
		this.jMenuItemDetalleAbrirOrderByTipoRadioVenci.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoRadioVenci"));
			
		this.jMenuItemDetalleMostarOcultarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoRadioVenci"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoRadioVenci.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoRadioVenci"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoRadioVenci"));
			
		this.jMenuItemNuevoGuardarCambiosTipoRadioVenci.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoRadioVenci"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoRadioVenci.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoRadioVenci"));

		this.jCheckBoxSeleccionadosTipoRadioVenci.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoRadioVenci"));
		
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRadioVenci.jComboBoxTiposAccionesFormularioTipoRadioVenci.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRadioVenci"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoRadioVenci.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoRadioVenci"));
			
		this.jComboBoxTiposAccionesTipoRadioVenci.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoRadioVenci"));
					
		this.jComboBoxTiposSeleccionarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoRadioVenci"));
			
		this.jTextFieldValorCampoGeneralTipoRadioVenci.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoRadioVenci"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRadioVenci.jButtonidTipoRadioVenciBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRadioVenciBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRadioVenci.jButtonnombreTipoRadioVenciBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRadioVenciBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoRadioVenci!=null) {
				this.jInternalFrameReporteDinamicoTipoRadioVenci.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRadioVenci"));
				this.jInternalFrameReporteDinamicoTipoRadioVenci.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRadioVenci"));
				this.jInternalFrameReporteDinamicoTipoRadioVenci.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRadioVenci"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoRadioVenci.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRadioVenci"));				
			//this.jButtonGenerarReporteDinamicoTipoRadioVenci.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRadioVenci"));
			//this.jButtonGenerarExcelReporteDinamicoTipoRadioVenci.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRadioVenci"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoRadioVenci!=null) {
				this.jInternalFrameImportacionTipoRadioVenci.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRadioVenci"));
				this.jInternalFrameImportacionTipoRadioVenci.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRadioVenci"));
				this.jInternalFrameImportacionTipoRadioVenci.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRadioVenci"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoRadioVenci.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoRadioVenci"));
			
			this.jButtonAbrirOrderByToolBarTipoRadioVenci.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoRadioVenci"));			
			
			if(this.jInternalFrameOrderByTipoRadioVenci!=null) {
				this.jInternalFrameOrderByTipoRadioVenci.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRadioVenci"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRadioVenci.jTabbedPaneRelacionesTipoRadioVenci.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRadioVenci"));
		
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
            		closingInternalFrameTipoRadioVenci();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoRadioVenci.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoRadioVenci = (JInternalFrameBase)event.getSource();
	            	
	            TipoRadioVenciBeanSwingJInternalFrame jInternalFrameParent=(TipoRadioVenciBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRadioVenci.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoRadioVenciActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoRadioVenci.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoRadioVenciListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoRadioVenci.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoRadioVenci.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRadioVenciActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRadioVenciActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRadioVenciActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoRadioVenci";
		inputMap = this.jButtonNuevoTipoRadioVenci.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoRadioVenci.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoRadioVenciActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRadioVenciActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRadioVenciActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRadioVenciActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoRadioVenci";
		inputMap = this.jButtonNuevoRelacionesTipoRadioVenci.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoRadioVenci.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoRadioVenciActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoRadioVenci";
		inputMap = this.jButtonModificarTipoRadioVenci.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoRadioVenci.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoRadioVenciActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoRadioVenci";
		inputMap = this.jButtonActualizarTipoRadioVenci.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoRadioVenci.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoRadioVenciActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoRadioVenci";
		inputMap = this.jButtonEliminarTipoRadioVenci.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoRadioVenci.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoRadioVenciActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoRadioVenci";
		inputMap = this.jButtonCancelarTipoRadioVenci.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoRadioVenci.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoRadioVenciActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoRadioVenci";
		inputMap = this.jButtonCerrarTipoRadioVenci.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoRadioVenci.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoRadioVenciActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoRadioVenci.jButtonGuardarCambiosTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoRadioVenci";
		inputMap = this.jInternalFrameDetalleFormTipoRadioVenci.jButtonGuardarCambiosTipoRadioVenci.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoRadioVenci.jButtonGuardarCambiosTipoRadioVenci.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoRadioVenciActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoRadioVenci.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoRadioVenciItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoRadioVenci.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoRadioVenciActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoRadioVenci.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoRadioVenciActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoRadioVenci.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoRadioVenciActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRadioVenci.jButtonidTipoRadioVenciBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRadioVenciBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRadioVenci.jButtonnombreTipoRadioVenciBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRadioVenciBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoRadioVenci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoRadioVenciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoRadioVenciActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoRadioVenci.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoRadioVenci(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoRadioVenci tiporadiovenciAux:this.tiporadiovenciLogic.getTipoRadioVencis()) {
					tiporadiovenciAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRadioVenci tiporadiovenciAux:tiporadiovencis) {
					tiporadiovenciAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoRadioVenciItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRadioVenci(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRadioVenci tiporadiovenciAux:this.tiporadiovenciLogic.getTipoRadioVencis()) {
						tiporadiovenciAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRadioVenci tiporadiovenciAux:tiporadiovencis) {
						tiporadiovenciAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoRadioVenci tiporadiovenciAux:this.tiporadiovenciLogic.getTipoRadioVencis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRadioVenci tiporadiovenciAux:tiporadiovencis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRadioVenci(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRadioVenci.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRadioVenci.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRadioVenci,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoRadioVenciItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRadioVenci(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoRadioVenci.getSelectedRows();
			
			TipoRadioVenci tiporadiovenciLocal=new TipoRadioVenci();
			
			//this.seleccionarTodosTipoRadioVenci(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporadiovenciLocal =(TipoRadioVenci) this.tiporadiovenciLogic.getTipoRadioVencis().toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tiporadiovenciLocal =(TipoRadioVenci) this.tiporadiovencis.toArray()[this.jTableDatosTipoRadioVenci.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tiporadiovenciLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRadioVenci tiporadiovenciAux:this.tiporadiovenciLogic.getTipoRadioVencis()) {
						tiporadiovenciAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRadioVenci tiporadiovenciAux:tiporadiovencis) {
						tiporadiovenciAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoRadioVenci(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRadioVenci.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRadioVenci.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRadioVenci,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoRadioVenciItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoRadioVenciParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoRadioVenciActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoRadioVenci(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoRadioVenci.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRadioVenci tiporadiovenciAux:this.tiporadiovenciLogic.getTipoRadioVencis()) {
				
						if(sTipoSeleccionar.equals(TipoRadioVenciConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporadiovenciAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRadioVenci tiporadiovenciAux:tiporadiovencis) {
					
						if(sTipoSeleccionar.equals(TipoRadioVenciConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporadiovenciAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRadioVenci(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoRadioVenciActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoRadioVenci(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoRadioVenci=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoRadioVenci.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoRadioVenci.jComboBoxTiposAccionesFormularioTipoRadioVenci.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoRadioVenci) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoRadioVenci(conSplash);
				
					this.generarReporteTipoRadioVencisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRadioVenci.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRadioVenci.jComboBoxTiposAccionesFormularioTipoRadioVenci.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoRadioVencisSeleccionados();
				//this.jComboBoxTiposAccionesTipoRadioVenci.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRadioVencisSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoRadioVenci.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRadioVencisSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoRadioVenci.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRadioVenci();
				
				this.exportarTipoRadioVencisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRadioVenci.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRadioVenci.jComboBoxTiposAccionesFormularioTipoRadioVenci.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoRadioVencis();
				//this.importarTipoRadioVencis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRadioVenci.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRadioVenci.jComboBoxTiposAccionesFormularioTipoRadioVenci.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRadioVenci();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoRadioVencisSeleccionados();
				//this.jComboBoxTiposAccionesTipoRadioVenci.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Radio Venci", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoRadioVenci();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoRadioVenci)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoRadioVenci(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Radio Venci",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRadioVenci.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRadioVenci.jComboBoxTiposAccionesFormularioTipoRadioVenci.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoRadioVenci();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoRadioVenci(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoRadioVenciActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoRadioVenci();
			
			if(this.jInternalFrameDetalleFormTipoRadioVenci==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoRadioVenci> tiporadiovencisSeleccionados=new ArrayList<TipoRadioVenci>();		
			TipoRadioVenci tiporadiovenci=new TipoRadioVenci();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoRadioVenci(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoRadioVenci.getSelectedItem();
			
			
			
			
			tiporadiovencisSeleccionados=this.getTipoRadioVencisSeleccionados(true);
			//this.sTipoAccion;
			
			if(tiporadiovencisSeleccionados.size()==1) {
				for(TipoRadioVenci tiporadiovenciAux:tiporadiovencisSeleccionados) {
					tiporadiovenci=tiporadiovenciAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Dias Vencidos")) {
					jButtonRadioVenciProveActionPerformed(null,rowIndex,true,false,tiporadiovenci);
				}
				else if(this.sTipoRelacion.equals("Dias Por Vencer")) {
					jButtonRadioVenciClienteProveActionPerformed(null,rowIndex,true,false,tiporadiovenci);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoRadioVenci();
			
      		//this.finishProcessTipoRadioVenci(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoRadioVenciReturnGeneral() throws Exception {
		if(this.tiporadiovenciReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tiporadiovenciReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tiporadiovenciReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tiporadiovenciReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tiporadiovenciReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tiporadiovenciReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoRadioVenci(false);
		}
		
		if(this.tiporadiovenciReturnGeneral.getConRetornoLista() || this.tiporadiovenciReturnGeneral.getConRetornoObjeto()) {
			if(this.tiporadiovenciReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporadiovenciLogic.setTipoRadioVencis(this.tiporadiovenciReturnGeneral.getTipoRadioVencis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tiporadiovenciReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporadiovenciLogic.setTipoRadioVenci(this.tiporadiovenciReturnGeneral.getTipoRadioVenci());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoRadioVenci(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoRadioVenci() throws Exception {
		
		
	}
	
	public ArrayList<TipoRadioVenci> getTipoRadioVencisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoRadioVenci> tiporadiovencisSeleccionados=new ArrayList<TipoRadioVenci>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoRadioVenci) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoRadioVenci tiporadiovenciAux:tiporadiovenciLogic.getTipoRadioVencis()) {
					if(tiporadiovenciAux.getIsSelected()) {
						tiporadiovencisSeleccionados.add(tiporadiovenciAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRadioVenci tiporadiovenciAux:this.tiporadiovencis) {
					if(tiporadiovenciAux.getIsSelected()) {
						tiporadiovencisSeleccionados.add(tiporadiovenciAux);				
					}
				}
			}
			
			if(tiporadiovencisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tiporadiovencisSeleccionados.addAll(this.tiporadiovenciLogic.getTipoRadioVencis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tiporadiovencisSeleccionados.addAll(this.tiporadiovencis);				
					}
				}
			}
		} else {
			tiporadiovencisSeleccionados.add(this.tiporadiovenci);
		}
		
		return tiporadiovencisSeleccionados;
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
	
	public void generarReporteTipoRadioVencisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoRadioVencisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoRadioVencisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRadioVencisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRadioVencisSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoRadioVencisSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Radio Venci",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoRadioVencisSeleccionados() throws Exception {
		ArrayList<TipoRadioVenci> tiporadiovencisSeleccionados=new ArrayList<TipoRadioVenci>();		
		
		tiporadiovencisSeleccionados=this.getTipoRadioVencisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoRadioVencis("Todos",tiporadiovencisSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoRadioVencisSeleccionados() throws Exception {
		ArrayList<TipoRadioVenci> tiporadiovencisSeleccionados=new ArrayList<TipoRadioVenci>();		
		
		tiporadiovencisSeleccionados=this.getTipoRadioVencisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoRadioVencis("Todos",tiporadiovencisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoRadioVencisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoRadioVenci> tiporadiovencisSeleccionados=new ArrayList<TipoRadioVenci>();
		
		tiporadiovencisSeleccionados=this.getTipoRadioVencisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoRadioVencis("Todos",tiporadiovencisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoRadioVencisSeleccionados() throws Exception {
		ArrayList<TipoRadioVenci> tiporadiovencisSeleccionados=new ArrayList<TipoRadioVenci>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoRadioVenci();
		
		
		tiporadiovencisSeleccionados=this.getTipoRadioVencisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoRadioVenci();
		
		
		//this.generarReporteTipoRadioVencis("Todos",tiporadiovencisSeleccionados ,tiporadiovenciImplementable,tiporadiovenciImplementableHome);
	}
	
	public void mostrarImportacionTipoRadioVencis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoRadioVenci();
		
		this.abrirFrameImportacionTipoRadioVenci();		
		
			
		//this.generarReporteTipoRadioVencis("Todos",tiporadiovencisSeleccionados ,tiporadiovenciImplementable,tiporadiovenciImplementableHome);
	}
	
	public void importarTipoRadioVencis() throws Exception {		
	
	}
	
	public void exportarTipoRadioVencisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoRadioVencisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoRadioVencisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoRadioVencisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Radio Venci",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoRadioVencisSeleccionados() throws Exception {
		ArrayList<TipoRadioVenci> tiporadiovencisSeleccionados=new ArrayList<TipoRadioVenci>();		
		
		tiporadiovencisSeleccionados=this.getTipoRadioVencisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporadiovenci."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoRadioVenci(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoRadioVenci tiporadiovenciAux:tiporadiovencisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoRadioVenci(tiporadiovenciAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tiporadiovenciAux.setsDetalleGeneralEntityReporte(tiporadiovenciAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Radio Venci",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoRadioVenci(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoRadioVenciConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRadioVenciConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRadioVenciConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoRadioVenci(TipoRadioVenci tiporadiovenci,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tiporadiovenci.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporadiovenci.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporadiovenci.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoRadioVencisSeleccionados() throws Exception {
		ArrayList<TipoRadioVenci> tiporadiovencisSeleccionados=new ArrayList<TipoRadioVenci>();		
		
		tiporadiovencisSeleccionados=this.getTipoRadioVencisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporadiovenci.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoRadioVencis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoRadioVenci(row);				
				iRow++;
			}				
			
			for(TipoRadioVenci tiporadiovenciAux:tiporadiovencisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoRadioVenci(tiporadiovenciAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Radio Venci",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoRadioVencisSeleccionados() throws Exception {
		ArrayList<TipoRadioVenci> tiporadiovencisSeleccionados=new ArrayList<TipoRadioVenci>();		
		
		tiporadiovencisSeleccionados=this.getTipoRadioVencisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporadiovenci.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tiporadiovencis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tiporadiovenci");
			//elementRoot.appendChild(element);
		
			for(TipoRadioVenci tiporadiovenciAux:tiporadiovencisSeleccionados) {
				element = document.createElement("tiporadiovenci");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoRadioVenci(tiporadiovenciAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Radio Venci",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoRadioVenci(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRadioVenciConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRadioVenciConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoRadioVenciConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoRadioVenci(TipoRadioVenci tiporadiovenci,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tiporadiovenci.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporadiovenci.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoRadioVenci(TipoRadioVenci tiporadiovenci,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoRadioVenciConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tiporadiovenci.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoRadioVenciConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tiporadiovenci.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoRadioVenciConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tiporadiovenci.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoRadioVencisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoRadioVenci> tiporadiovencisSeleccionados=new ArrayList<TipoRadioVenci>();
		
		tiporadiovencisSeleccionados=this.getTipoRadioVencisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoRadioVenci(tiporadiovencisSeleccionados);
		
		this.generarReporteTipoRadioVencis("Todos",tiporadiovencisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoRadioVenci(ArrayList<TipoRadioVenci> tiporadiovencisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoRadioVenci tiporadiovenciAux:tiporadiovencisSeleccionados) {
				tiporadiovenciAux.setsDetalleGeneralEntityReporte(tiporadiovenciAux.toString());
			
				if(sTipoSeleccionar.equals(TipoRadioVenciConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tiporadiovenciAux.setsDescripcionGeneralEntityReporte1(tiporadiovenciAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRadioVenciConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoRadioVenci(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoRadioVenci=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoRadioVenci=true;
				this.isVisibilidadCeldaGuardarCambiosTipoRadioVenci=true;
			}
			
			this.isVisibilidadCeldaModificarTipoRadioVenci=false;
			this.isVisibilidadCeldaActualizarTipoRadioVenci=false;
			this.isVisibilidadCeldaEliminarTipoRadioVenci=false;
			this.isVisibilidadCeldaCancelarTipoRadioVenci=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRadioVenci=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRadioVenci=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoRadioVenci=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRadioVenci=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRadioVenci=false;
			this.isVisibilidadCeldaModificarTipoRadioVenci=false;
			this.isVisibilidadCeldaActualizarTipoRadioVenci=true;
			this.isVisibilidadCeldaEliminarTipoRadioVenci=false;
			this.isVisibilidadCeldaCancelarTipoRadioVenci=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRadioVenci=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRadioVenci=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoRadioVenci=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRadioVenci=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRadioVenci=false;
			this.isVisibilidadCeldaModificarTipoRadioVenci=false;
			this.isVisibilidadCeldaActualizarTipoRadioVenci=true;
			this.isVisibilidadCeldaEliminarTipoRadioVenci=true;
			this.isVisibilidadCeldaCancelarTipoRadioVenci=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRadioVenci=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRadioVenci=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoRadioVenci=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRadioVenci=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRadioVenci=false;
			this.isVisibilidadCeldaModificarTipoRadioVenci=false;
			this.isVisibilidadCeldaActualizarTipoRadioVenci=true;
			this.isVisibilidadCeldaEliminarTipoRadioVenci=false;
			this.isVisibilidadCeldaCancelarTipoRadioVenci=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRadioVenci=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRadioVenci=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoRadioVenci=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRadioVenci=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRadioVenci=true;
			this.isVisibilidadCeldaModificarTipoRadioVenci=false;
			this.isVisibilidadCeldaActualizarTipoRadioVenci=false;
			this.isVisibilidadCeldaEliminarTipoRadioVenci=false;
			this.isVisibilidadCeldaCancelarTipoRadioVenci=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRadioVenci=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRadioVenci=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoRadioVenci=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRadioVenci=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRadioVenci=false;
			this.isVisibilidadCeldaActualizarTipoRadioVenci=false;
			this.isVisibilidadCeldaEliminarTipoRadioVenci=false;
			this.isVisibilidadCeldaCancelarTipoRadioVenci=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRadioVenci=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRadioVenci=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoRadioVenci=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRadioVenci=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRadioVenci=false;
			this.isVisibilidadCeldaModificarTipoRadioVenci=true;
			this.isVisibilidadCeldaActualizarTipoRadioVenci=false;
			this.isVisibilidadCeldaEliminarTipoRadioVenci=false;
			this.isVisibilidadCeldaCancelarTipoRadioVenci=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRadioVenci=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRadioVenci=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoRadioVenciJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoRadioVenci=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRadioVenci=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRadioVenci=true;
		} else {
			this.actualizarEstadoPanelsTipoRadioVenci(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoRadioVenci=false;
			//this.isVisibilidadCeldaVerFormTipoRadioVenci=false;
			this.isVisibilidadCeldaDuplicarTipoRadioVenci=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tiporadiovenciSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRadioVenci=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoRadioVenci=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRadioVenci=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
			if(!tiporadiovenciSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoRadioVenci=false;												
			}
			
			this.jButtonCerrarTipoRadioVenci.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRadioVenci=false;
		}
		
		if(!this.permiteMantenimiento(this.tiporadiovenci)) {
			this.isVisibilidadCeldaActualizarTipoRadioVenci=false;
			this.isVisibilidadCeldaEliminarTipoRadioVenci=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRadioVenci() {
		this.isVisibilidadCeldaNuevoTipoRadioVenci=false;
		this.isVisibilidadCeldaGuardarCambiosTipoRadioVenci=false;
	}
	
	public void actualizarEstadoPanelsTipoRadioVenci(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoRadioVenci!=null) {
				this.jScrollPanelDatosEdicionTipoRadioVenci.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRadioVenci!=null) {
				this.jScrollPanelDatosTipoRadioVenci.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRadioVenci!=null) {
				this.jPanelPaginacionTipoRadioVenci.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRadioVenci!=null) {
				this.jPanelParametrosReportesTipoRadioVenci.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoRadioVenci!=null) {
				this.jScrollPanelDatosEdicionTipoRadioVenci.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoRadioVenci!=null) {
				this.jScrollPanelDatosTipoRadioVenci.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRadioVenci!=null) {
				this.jPanelPaginacionTipoRadioVenci.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRadioVenci!=null) {
				this.jPanelParametrosReportesTipoRadioVenci.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoRadioVenci!=null) {
				this.jScrollPanelDatosEdicionTipoRadioVenci.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoRadioVenci!=null) {
				this.jScrollPanelDatosTipoRadioVenci.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRadioVenci!=null) {
				this.jPanelPaginacionTipoRadioVenci.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRadioVenci!=null) {
				this.jPanelParametrosReportesTipoRadioVenci.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoRadioVenci!=null) {
				this.jScrollPanelDatosEdicionTipoRadioVenci.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRadioVenci!=null) {
				this.jScrollPanelDatosTipoRadioVenci.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRadioVenci!=null) {
				this.jPanelPaginacionTipoRadioVenci.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRadioVenci!=null) {
				this.jPanelParametrosReportesTipoRadioVenci.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoRadioVenci!=null) {
				this.jScrollPanelDatosEdicionTipoRadioVenci.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRadioVenci!=null) {
				this.jScrollPanelDatosTipoRadioVenci.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRadioVenci!=null) {
				this.jPanelPaginacionTipoRadioVenci.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRadioVenci!=null) {
				this.jPanelParametrosReportesTipoRadioVenci.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoRadioVenci!=null) {
				this.jScrollPanelDatosEdicionTipoRadioVenci.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoRadioVenci!=null) {
				this.jScrollPanelDatosTipoRadioVenci.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRadioVenci!=null) {
				this.jPanelPaginacionTipoRadioVenci.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRadioVenci!=null) {
				this.jPanelParametrosReportesTipoRadioVenci.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoRadioVenci!=null) {
				this.jScrollPanelDatosEdicionTipoRadioVenci.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoRadioVenci!=null) {
				this.jScrollPanelDatosTipoRadioVenci.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRadioVenci!=null) {
				this.jPanelPaginacionTipoRadioVenci.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRadioVenci!=null) {
				this.jPanelParametrosReportesTipoRadioVenci.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoRadioVenciParaRadioVenciProves() throws Exception {
		Boolean isPaginaPopupRadioVenciProve=false;

		try {

			if(this.tiporadiovenciSessionBean==null) {
				this.tiporadiovenciSessionBean=new TipoRadioVenciSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveSessionBean==null) {
				this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveSessionBean=new RadioVenciProveSessionBean();
			}

			this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveSessionBean.setsPathNavegacionActual(tiporadiovenciSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupRadioVenciProve=this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeRadioVenciProve(true);
			this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeRadioVenciProve(TipoRadioVenciConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveSessionBean.setisBusquedaDesdeForeignKeySesionTipoRadioVenci(true);
			this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciproveSessionBean.setlidTipoRadioVenciActual(this.idTipoRadioVenciActual);

			tiporadiovenciSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoRadioVenci(true);
			tiporadiovenciSessionBean.setlIdTipoRadioVenciActualForeignKey(this.idTipoRadioVenciActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoRadioVenciParaRadioVenciClienteProves() throws Exception {
		Boolean isPaginaPopupRadioVenciClienteProve=false;

		try {

			if(this.tiporadiovenciSessionBean==null) {
				this.tiporadiovenciSessionBean=new TipoRadioVenciSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveSessionBean==null) {
				this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveSessionBean=new RadioVenciClienteProveSessionBean();
			}

			this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveSessionBean.setsPathNavegacionActual(tiporadiovenciSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupRadioVenciClienteProve=this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeRadioVenciClienteProve(true);
			this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeRadioVenciClienteProve(TipoRadioVenciConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveSessionBean.setisBusquedaDesdeForeignKeySesionTipoRadioVenci(true);
			this.jInternalFrameDetalleFormTipoRadioVenci.radiovenciclienteproveSessionBean.setlidTipoRadioVenciActual(this.idTipoRadioVenciActual);

			tiporadiovenciSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoRadioVenci(true);
			tiporadiovenciSessionBean.setlIdTipoRadioVenciActualForeignKey(this.idTipoRadioVenciActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoRadioVenciSessionBean tiporadiovenciSessionBean=new TipoRadioVenciSessionBean();
		
		if(this.tiporadiovenciSessionBean==null) {
			this.tiporadiovenciSessionBean=new TipoRadioVenciSessionBean();
		}
		
		this.tiporadiovenciSessionBean.setsUltimaBusquedaTipoRadioVenci(this.getsAccionBusqueda());
		this.tiporadiovenciSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tiporadiovenciSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoRadioVenciSessionBean tiporadiovenciSessionBean=new TipoRadioVenciSessionBean();
		
		if(this.tiporadiovenciSessionBean==null) {
			this.tiporadiovenciSessionBean=new TipoRadioVenciSessionBean();
		}
		
		if(this.tiporadiovenciSessionBean.getsUltimaBusquedaTipoRadioVenci()!=null&&!this.tiporadiovenciSessionBean.getsUltimaBusquedaTipoRadioVenci().equals("")) {
			this.setsAccionBusqueda(tiporadiovenciSessionBean.getsUltimaBusquedaTipoRadioVenci());
			this.setiNumeroPaginacion(tiporadiovenciSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tiporadiovenciSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tiporadiovenciSessionBean.setsUltimaBusquedaTipoRadioVenci("");
		this.tiporadiovenciSessionBean.setiNumeroPaginacion(TipoRadioVenciConstantesFunciones.INUMEROPAGINACION);
		this.tiporadiovenciSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoRadioVenci(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoRadioVenci() {
		this.updateBorderResaltarBusquedasFormularioTipoRadioVenci();
		this.updateVisibilidadBusquedasFormularioTipoRadioVenci();
		this.updateHabilitarBusquedasFormularioTipoRadioVenci();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoRadioVenci() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoRadioVenci() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoRadioVenci() {
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
	
	public void updateControlesFormularioTipoRadioVenci() throws Exception {

		if(this.jInternalFrameDetalleFormTipoRadioVenci==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoRadioVenci();
		this.updateVisibilidadResaltarControlesFormularioTipoRadioVenci();
		this.updateHabilitarResaltarControlesFormularioTipoRadioVenci();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoRadioVenci() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRadioVenci==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tiporadiovenciConstantesFunciones.resaltaridTipoRadioVenci!=null && this.jInternalFrameDetalleFormTipoRadioVenci!=null) {this.jInternalFrameDetalleFormTipoRadioVenci.jTextFieldidTipoRadioVenci.setBorder(this.tiporadiovenciConstantesFunciones.resaltaridTipoRadioVenci);}
		if(this.tiporadiovenciConstantesFunciones.resaltarnombreTipoRadioVenci!=null && this.jInternalFrameDetalleFormTipoRadioVenci!=null) {this.jInternalFrameDetalleFormTipoRadioVenci.jTextAreanombreTipoRadioVenci.setBorder(this.tiporadiovenciConstantesFunciones.resaltarnombreTipoRadioVenci);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoRadioVenci() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoRadioVenci==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) {
	
		//this.jInternalFrameDetalleFormTipoRadioVenci.jTextFieldidTipoRadioVenci.setVisible(this.tiporadiovenciConstantesFunciones.mostraridTipoRadioVenci);
		this.jInternalFrameDetalleFormTipoRadioVenci.jPanelidTipoRadioVenci.setVisible(this.tiporadiovenciConstantesFunciones.mostraridTipoRadioVenci);
		//this.jInternalFrameDetalleFormTipoRadioVenci.jTextAreanombreTipoRadioVenci.setVisible(this.tiporadiovenciConstantesFunciones.mostrarnombreTipoRadioVenci);
		this.jInternalFrameDetalleFormTipoRadioVenci.jPanelnombreTipoRadioVenci.setVisible(this.tiporadiovenciConstantesFunciones.mostrarnombreTipoRadioVenci);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoRadioVenci() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRadioVenci==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRadioVenci!=null) {
	
		this.jInternalFrameDetalleFormTipoRadioVenci.jTextFieldidTipoRadioVenci.setEnabled(this.tiporadiovenciConstantesFunciones.activaridTipoRadioVenci);
		this.jInternalFrameDetalleFormTipoRadioVenci.jTextAreanombreTipoRadioVenci.setEnabled(this.tiporadiovenciConstantesFunciones.activarnombreTipoRadioVenci);
		}
	}
	
		
}