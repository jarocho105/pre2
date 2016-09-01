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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;




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

import com.bydan.erp.importaciones.util.TipoCostoGastoImporConstantesFunciones;
import com.bydan.erp.importaciones.util.TipoCostoGastoImporParameterReturnGeneral;
//import com.bydan.erp.importaciones.util.TipoCostoGastoImporParameterGeneral;
//import com.bydan.erp.importaciones.presentation.report.source.TipoCostoGastoImporBean;
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

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.importaciones.resources.reportes.AuxiliarReportes;


import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.importaciones.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.importaciones.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoCostoGastoImporBeanSwingJInternalFrame extends TipoCostoGastoImporJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoCostoGastoImporBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoCostoGastoImpor> tipocostogastoimporValidator = new ClassValidator<TipoCostoGastoImpor>(TipoCostoGastoImpor.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoCostoGastoImpor tipocostogastoimpor;	
	public TipoCostoGastoImpor tipocostogastoimporAux;
	public TipoCostoGastoImpor tipocostogastoimporAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoCostoGastoImpor tipocostogastoimporTotales;
	public Long idTipoCostoGastoImporActual;
	public Long iIdNuevoTipoCostoGastoImpor=0L;
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
	
	public Boolean isPermisoTodoTipoCostoGastoImpor;
	public Boolean isPermisoNuevoTipoCostoGastoImpor;
	public Boolean isPermisoActualizarTipoCostoGastoImpor;
	public Boolean isPermisoActualizarOriginalTipoCostoGastoImpor;
	public Boolean isPermisoEliminarTipoCostoGastoImpor;
	public Boolean isPermisoGuardarCambiosTipoCostoGastoImpor;
	public Boolean isPermisoConsultaTipoCostoGastoImpor;
	public Boolean isPermisoBusquedaTipoCostoGastoImpor;
	public Boolean isPermisoReporteTipoCostoGastoImpor;
	public Boolean isPermisoPaginacionMedioTipoCostoGastoImpor;
	public Boolean isPermisoPaginacionAltoTipoCostoGastoImpor;
	public Boolean isPermisoPaginacionTodoTipoCostoGastoImpor;
	public Boolean isPermisoCopiarTipoCostoGastoImpor;
	public Boolean isPermisoVerFormTipoCostoGastoImpor;
	public Boolean isPermisoDuplicarTipoCostoGastoImpor;
	public Boolean isPermisoOrdenTipoCostoGastoImpor;
	
	
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
	
	public TipoCostoGastoImporParameterReturnGeneral tipocostogastoimporReturnGeneral;
	public TipoCostoGastoImporParameterReturnGeneral tipocostogastoimporParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoCostoGastoImpor=false;
	public Boolean esParaAccionDesdeFormularioTipoCostoGastoImpor=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoCostoGastoImporLogic tipocostogastoimporLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoCostoGastoImpor tipocostogastoimporBean;
	public TipoCostoGastoImporConstantesFunciones tipocostogastoimporConstantesFunciones;
	//public TipoCostoGastoImporParameterReturnGeneral tipocostogastoimporReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoCostoGastoImpor> tipocostogastoimpors;	
	//public List<TipoCostoGastoImpor> tipocostogastoimporsEliminados;
	//public List<TipoCostoGastoImpor> tipocostogastoimporsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoCostoGastoImpor=false;
	public Boolean isVisibilidadCeldaDuplicarTipoCostoGastoImpor=true;
	public Boolean isVisibilidadCeldaCopiarTipoCostoGastoImpor=true;
	public Boolean isVisibilidadCeldaVerFormTipoCostoGastoImpor=true;
	public Boolean isVisibilidadCeldaOrdenTipoCostoGastoImpor=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor=false;
	public Boolean isVisibilidadCeldaModificarTipoCostoGastoImpor=false;
	public Boolean isVisibilidadCeldaActualizarTipoCostoGastoImpor=false;
	public Boolean isVisibilidadCeldaEliminarTipoCostoGastoImpor=false;
	public Boolean isVisibilidadCeldaCancelarTipoCostoGastoImpor=false;
	public Boolean isVisibilidadCeldaGuardarTipoCostoGastoImpor=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoCostoGastoImpor=false;	
	
	
	
	public Long getiIdNuevoTipoCostoGastoImpor() {
		return this.iIdNuevoTipoCostoGastoImpor;
	}

	public void setiIdNuevoTipoCostoGastoImpor(Long iIdNuevoTipoCostoGastoImpor) {
		this.iIdNuevoTipoCostoGastoImpor = iIdNuevoTipoCostoGastoImpor;
	}
	
	public Long getidTipoCostoGastoImporActual() {
		return this.idTipoCostoGastoImporActual;
	}

	public void setidTipoCostoGastoImporActual(Long idTipoCostoGastoImporActual) {
		this.idTipoCostoGastoImporActual = idTipoCostoGastoImporActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoCostoGastoImpor gettipocostogastoimpor() {
		return this.tipocostogastoimpor;
	}

	public void settipocostogastoimpor(TipoCostoGastoImpor tipocostogastoimpor) {
		this.tipocostogastoimpor = tipocostogastoimpor;
	}
	
	public TipoCostoGastoImpor gettipocostogastoimporAux() {
		return this.tipocostogastoimporAux;
	}

	public void settipocostogastoimporAux(TipoCostoGastoImpor tipocostogastoimporAux) {
		this.tipocostogastoimporAux = tipocostogastoimporAux;
	}				
	
	public TipoCostoGastoImpor gettipocostogastoimporAnterior() {
		return this.tipocostogastoimporAnterior;
	}

	public void settipocostogastoimporAnterior(TipoCostoGastoImpor tipocostogastoimporAnterior) {
		this.tipocostogastoimporAnterior = tipocostogastoimporAnterior;
	}	
	
	public TipoCostoGastoImpor gettipocostogastoimporTotales() {
		return this.tipocostogastoimporTotales;
	}

	public void settipocostogastoimporTotales(TipoCostoGastoImpor tipocostogastoimporTotales) {
		this.tipocostogastoimporTotales = tipocostogastoimporTotales;
	}	
	
	public TipoCostoGastoImpor gettipocostogastoimporBean() {
		return this.tipocostogastoimporBean;
	}

	public void settipocostogastoimporBean(TipoCostoGastoImpor tipocostogastoimporBean) {
		this.tipocostogastoimporBean = tipocostogastoimporBean;
	}	
	
	public TipoCostoGastoImporParameterReturnGeneral gettipocostogastoimporReturnGeneral() {
		return this.tipocostogastoimporReturnGeneral;
	}

	public void settipocostogastoimporReturnGeneral(TipoCostoGastoImporParameterReturnGeneral tipocostogastoimporReturnGeneral) {
		this.tipocostogastoimporReturnGeneral = tipocostogastoimporReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoCostoGastoImporLogic getTipoCostoGastoImporLogic()	{		
		return tipocostogastoimporLogic;
	}

	public void setTipoCostoGastoImporLogic(TipoCostoGastoImporLogic tipocostogastoimporLogic) {
		this.tipocostogastoimporLogic = tipocostogastoimporLogic;
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
	
	public Boolean getIsEsNuevoTipoCostoGastoImpor() {
		return isEsNuevoTipoCostoGastoImpor;
	}

	public void setIsEsNuevoTipoCostoGastoImpor(Boolean isEsNuevoTipoCostoGastoImpor) {
		this.isEsNuevoTipoCostoGastoImpor = isEsNuevoTipoCostoGastoImpor;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoCostoGastoImpor() {
		return esParaAccionDesdeFormularioTipoCostoGastoImpor;
	}
	
	public void setEsParaAccionDesdeFormularioTipoCostoGastoImpor(Boolean esParaAccionDesdeFormularioTipoCostoGastoImpor) {
		this.esParaAccionDesdeFormularioTipoCostoGastoImpor = esParaAccionDesdeFormularioTipoCostoGastoImpor;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoCostoGastoImpor() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoCostoGastoImporConstantesFunciones.refrescarForeignKeysDescripcionesTipoCostoGastoImpor(this.tipocostogastoimporLogic.getTipoCostoGastoImpors());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoCostoGastoImporConstantesFunciones.refrescarForeignKeysDescripcionesTipoCostoGastoImpor(this.tipocostogastoimpors);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocostogastoimporLogic.setTipoCostoGastoImpors(this.tipocostogastoimpors);
			tipocostogastoimporLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoCostoGastoImporParameterReturnGeneral getTipoCostoGastoImporParameterGeneral() {
		return this.tipocostogastoimporParameterGeneral;
	}
	
	public void setTipoCostoGastoImporParameterGeneral(TipoCostoGastoImporParameterReturnGeneral tipocostogastoimporParameterGeneral) {
		this.tipocostogastoimporParameterGeneral = tipocostogastoimporParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoCostoGastoImpor() {
		return isPermisoTodoTipoCostoGastoImpor;
	}

	public void setIsPermisoTodoTipoCostoGastoImpor(Boolean isPermisoTodoTipoCostoGastoImpor) {
		this.isPermisoTodoTipoCostoGastoImpor = isPermisoTodoTipoCostoGastoImpor;
	}

	public Boolean getIsPermisoNuevoTipoCostoGastoImpor() {
		return isPermisoNuevoTipoCostoGastoImpor;
	}

	public void setIsPermisoNuevoTipoCostoGastoImpor(Boolean isPermisoNuevoTipoCostoGastoImpor) {
		this.isPermisoNuevoTipoCostoGastoImpor = isPermisoNuevoTipoCostoGastoImpor;
	}

	public Boolean getIsPermisoActualizarTipoCostoGastoImpor() {
		return isPermisoActualizarTipoCostoGastoImpor;
	}

	public void setIsPermisoActualizarTipoCostoGastoImpor(Boolean isPermisoActualizarTipoCostoGastoImpor) {
		this.isPermisoActualizarTipoCostoGastoImpor = isPermisoActualizarTipoCostoGastoImpor;
	}

	public Boolean getIsPermisoEliminarTipoCostoGastoImpor() {
		return isPermisoEliminarTipoCostoGastoImpor;
	}

	public void setIsPermisoEliminarTipoCostoGastoImpor(Boolean isPermisoEliminarTipoCostoGastoImpor) {
		this.isPermisoEliminarTipoCostoGastoImpor = isPermisoEliminarTipoCostoGastoImpor;
	}

	public Boolean getIsPermisoGuardarCambiosTipoCostoGastoImpor() {
		return isPermisoGuardarCambiosTipoCostoGastoImpor;
	}

	public void setIsPermisoGuardarCambiosTipoCostoGastoImpor(Boolean isPermisoGuardarCambiosTipoCostoGastoImpor) {
		this.isPermisoGuardarCambiosTipoCostoGastoImpor = isPermisoGuardarCambiosTipoCostoGastoImpor;
	}
	
	public Boolean getIsPermisoConsultaTipoCostoGastoImpor() {
		return isPermisoConsultaTipoCostoGastoImpor;
	}

	public void setIsPermisoConsultaTipoCostoGastoImpor(Boolean isPermisoConsultaTipoCostoGastoImpor) {
		this.isPermisoConsultaTipoCostoGastoImpor = isPermisoConsultaTipoCostoGastoImpor;
	}

	public Boolean getIsPermisoBusquedaTipoCostoGastoImpor() {
		return isPermisoBusquedaTipoCostoGastoImpor;
	}

	public void setIsPermisoBusquedaTipoCostoGastoImpor(Boolean isPermisoBusquedaTipoCostoGastoImpor) {
		this.isPermisoBusquedaTipoCostoGastoImpor = isPermisoBusquedaTipoCostoGastoImpor;
	}

	public Boolean getIsPermisoReporteTipoCostoGastoImpor() {
		return isPermisoReporteTipoCostoGastoImpor;
	}

	public void setIsPermisoReporteTipoCostoGastoImpor(Boolean isPermisoReporteTipoCostoGastoImpor) {
		this.isPermisoReporteTipoCostoGastoImpor = isPermisoReporteTipoCostoGastoImpor;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoCostoGastoImpor() {
		return isPermisoPaginacionMedioTipoCostoGastoImpor;
	}

	public void setIsPermisoPaginacionMedioTipoCostoGastoImpor(Boolean isPermisoPaginacionMedioTipoCostoGastoImpor) {
		this.isPermisoPaginacionMedioTipoCostoGastoImpor = isPermisoPaginacionMedioTipoCostoGastoImpor;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoCostoGastoImpor() {
		return isPermisoPaginacionTodoTipoCostoGastoImpor;
	}

	public void setIsPermisoPaginacionTodoTipoCostoGastoImpor(Boolean isPermisoPaginacionTodoTipoCostoGastoImpor) {
		this.isPermisoPaginacionTodoTipoCostoGastoImpor = isPermisoPaginacionTodoTipoCostoGastoImpor;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoCostoGastoImpor() {
		return isPermisoPaginacionAltoTipoCostoGastoImpor;
	}

	public void setIsPermisoPaginacionAltoTipoCostoGastoImpor(Boolean isPermisoPaginacionAltoTipoCostoGastoImpor) {
		this.isPermisoPaginacionAltoTipoCostoGastoImpor = isPermisoPaginacionAltoTipoCostoGastoImpor;
	}
	
	public Boolean getIsPermisoCopiarTipoCostoGastoImpor() {
		return isPermisoCopiarTipoCostoGastoImpor;
	}

	public void setIsPermisoCopiarTipoCostoGastoImpor(Boolean isPermisoCopiarTipoCostoGastoImpor) {
		this.isPermisoCopiarTipoCostoGastoImpor = isPermisoCopiarTipoCostoGastoImpor;
	}
	
	public Boolean getIsPermisoVerFormTipoCostoGastoImpor() {
		return isPermisoVerFormTipoCostoGastoImpor;
	}

	public void setIsPermisoVerFormTipoCostoGastoImpor(Boolean isPermisoVerFormTipoCostoGastoImpor) {
		this.isPermisoVerFormTipoCostoGastoImpor = isPermisoVerFormTipoCostoGastoImpor;
	}
	
	public Boolean getIsPermisoDuplicarTipoCostoGastoImpor() {
		return isPermisoDuplicarTipoCostoGastoImpor;
	}

	public void setIsPermisoDuplicarTipoCostoGastoImpor(Boolean isPermisoDuplicarTipoCostoGastoImpor) {
		this.isPermisoDuplicarTipoCostoGastoImpor = isPermisoDuplicarTipoCostoGastoImpor;
	}
	
	public Boolean getIsPermisoOrdenTipoCostoGastoImpor() {
		return isPermisoOrdenTipoCostoGastoImpor;
	}

	public void setIsPermisoOrdenTipoCostoGastoImpor(Boolean isPermisoOrdenTipoCostoGastoImpor) {
		this.isPermisoOrdenTipoCostoGastoImpor = isPermisoOrdenTipoCostoGastoImpor;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoCostoGastoImpor() {
		return isVisibilidadCeldaNuevoTipoCostoGastoImpor;
	}

	public void setIsVisibilidadCeldaNuevoTipoCostoGastoImpor(Boolean isVisibilidadCeldaNuevoTipoCostoGastoImpor) {
		this.isVisibilidadCeldaNuevoTipoCostoGastoImpor = isVisibilidadCeldaNuevoTipoCostoGastoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoCostoGastoImpor() {
		return isVisibilidadCeldaDuplicarTipoCostoGastoImpor;
	}

	public void setIsVisibilidadCeldaDuplicarTipoCostoGastoImpor(Boolean isVisibilidadCeldaDuplicarTipoCostoGastoImpor) {
		this.isVisibilidadCeldaDuplicarTipoCostoGastoImpor = isVisibilidadCeldaDuplicarTipoCostoGastoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoCostoGastoImpor() {
		return isVisibilidadCeldaCopiarTipoCostoGastoImpor;
	}

	public void setIsVisibilidadCeldaCopiarTipoCostoGastoImpor(Boolean isVisibilidadCeldaCopiarTipoCostoGastoImpor) {
		this.isVisibilidadCeldaCopiarTipoCostoGastoImpor = isVisibilidadCeldaCopiarTipoCostoGastoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoCostoGastoImpor() {
		return isVisibilidadCeldaVerFormTipoCostoGastoImpor;
	}

	public void setIsVisibilidadCeldaVerFormTipoCostoGastoImpor(Boolean isVisibilidadCeldaVerFormTipoCostoGastoImpor) {
		this.isVisibilidadCeldaVerFormTipoCostoGastoImpor = isVisibilidadCeldaVerFormTipoCostoGastoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoCostoGastoImpor() {
		return isVisibilidadCeldaOrdenTipoCostoGastoImpor;
	}

	public void setIsVisibilidadCeldaOrdenTipoCostoGastoImpor(Boolean isVisibilidadCeldaOrdenTipoCostoGastoImpor) {
		this.isVisibilidadCeldaOrdenTipoCostoGastoImpor = isVisibilidadCeldaOrdenTipoCostoGastoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor() {
		return isVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor(Boolean isVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor) {
		this.isVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor = isVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoCostoGastoImpor() {
		return isVisibilidadCeldaModificarTipoCostoGastoImpor;
	}

	public void setIsVisibilidadCeldaModificarTipoCostoGastoImpor(Boolean isVisibilidadCeldaModificarTipoCostoGastoImpor) {
		this.isVisibilidadCeldaModificarTipoCostoGastoImpor = isVisibilidadCeldaModificarTipoCostoGastoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoCostoGastoImpor() {
		return isVisibilidadCeldaActualizarTipoCostoGastoImpor;
	}

	public void setIsVisibilidadCeldaActualizarTipoCostoGastoImpor(Boolean isVisibilidadCeldaActualizarTipoCostoGastoImpor) {
		this.isVisibilidadCeldaActualizarTipoCostoGastoImpor = isVisibilidadCeldaActualizarTipoCostoGastoImpor;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoCostoGastoImpor() {
		return isVisibilidadCeldaEliminarTipoCostoGastoImpor;
	}

	public void setIsVisibilidadCeldaEliminarTipoCostoGastoImpor(Boolean isVisibilidadCeldaEliminarTipoCostoGastoImpor) {
		this.isVisibilidadCeldaEliminarTipoCostoGastoImpor = isVisibilidadCeldaEliminarTipoCostoGastoImpor;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoCostoGastoImpor() {
		return isVisibilidadCeldaCancelarTipoCostoGastoImpor;
	}

	public void setIsVisibilidadCeldaCancelarTipoCostoGastoImpor(Boolean isVisibilidadCeldaCancelarTipoCostoGastoImpor) {
		this.isVisibilidadCeldaCancelarTipoCostoGastoImpor = isVisibilidadCeldaCancelarTipoCostoGastoImpor;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoCostoGastoImpor() {
		return isVisibilidadCeldaGuardarTipoCostoGastoImpor;
	}

	public void setIsVisibilidadCeldaGuardarTipoCostoGastoImpor(Boolean isVisibilidadCeldaGuardarTipoCostoGastoImpor) {
		this.isVisibilidadCeldaGuardarTipoCostoGastoImpor = isVisibilidadCeldaGuardarTipoCostoGastoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoCostoGastoImpor() {
		return isVisibilidadCeldaGuardarCambiosTipoCostoGastoImpor;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoCostoGastoImpor(Boolean isVisibilidadCeldaGuardarCambiosTipoCostoGastoImpor) {
		this.isVisibilidadCeldaGuardarCambiosTipoCostoGastoImpor = isVisibilidadCeldaGuardarCambiosTipoCostoGastoImpor;
	}
		
	public TipoCostoGastoImporSessionBean gettipocostogastoimporSessionBean() {
		return this.tipocostogastoimporSessionBean;
	}
	
	public void settipocostogastoimporSessionBean(TipoCostoGastoImporSessionBean tipocostogastoimporSessionBean) {
		this.tipocostogastoimporSessionBean=tipocostogastoimporSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoCostoGastoImpor(TipoCostoGastoImpor tipocostogastoimpor)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoCostoGastoImpor tipocostogastoimpor,TipoCostoGastoImpor tipocostogastoimporAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoCostoGastoImpor(tipocostogastoimpor);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocostogastoimporAux.setId(tipocostogastoimpor.getId());
		tipocostogastoimporAux.setVersionRow(tipocostogastoimpor.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoCostoGastoImpor();
		
			int intSelectedRow = this.jTableDatosTipoCostoGastoImpor.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimpors.toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoCostoGastoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoCostoGastoImpor(this.tipocostogastoimpor,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoGastoImpor(this.tipocostogastoimpor);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocostogastoimporValidator.getInvalidValues(this.tipocostogastoimpor);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocostogastoimporLogic.setDatosCliente(datosCliente);
			tipocostogastoimporLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocostogastoimporAux=new  TipoCostoGastoImpor();
				
				tipocostogastoimporAux.setIsNew(true);
				tipocostogastoimporAux.setIsChanged(true);
				
				tipocostogastoimporAux.setTipoCostoGastoImporOriginal(this.tipocostogastoimpor);
				
				tipocostogastoimporAux.setId(this.tipocostogastoimpor.getId());	
				tipocostogastoimporAux.setVersionRow(this.tipocostogastoimpor.getVersionRow());	
				tipocostogastoimporAux.setcodigo(this.tipocostogastoimpor.getcodigo());	
				tipocostogastoimporAux.setnombre(this.tipocostogastoimpor.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocostogastoimporSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocostogastoimporSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocostogastoimporAux,tipocostogastoimporLogic.getTipoCostoGastoImpors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocostogastoimporAux,tipocostogastoimpors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocostogastoimporSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocostogastoimporSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocostogastoimporLogic.saveTipoCostoGastoImpors();//WithConnection
						//tipocostogastoimporLogic.getSetVersionRowTipoCostoGastoImpors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocostogastoimpor,tipocostogastoimporAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocostogastoimporAux=new  TipoCostoGastoImpor();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocostogastoimporSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocostogastoimporSessionBean.getEsGuardarRelacionado() && this.tipocostogastoimpor.getId()>=0)) {
						
					tipocostogastoimporAux.setIsNew(false);
				}
				
				tipocostogastoimporAux.setIsDeleted(false);
			
				tipocostogastoimporAux.setId(this.tipocostogastoimpor.getId());	
				tipocostogastoimporAux.setVersionRow(this.tipocostogastoimpor.getVersionRow());	
				tipocostogastoimporAux.setcodigo(this.tipocostogastoimpor.getcodigo());	
				tipocostogastoimporAux.setnombre(this.tipocostogastoimpor.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocostogastoimporAux,tipocostogastoimporLogic.getTipoCostoGastoImpors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocostogastoimporAux,tipocostogastoimpors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocostogastoimporSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocostogastoimporSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocostogastoimporLogic.saveTipoCostoGastoImpors();//WithConnection
						//tipocostogastoimporLogic.getSetVersionRowTipoCostoGastoImpors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocostogastoimpor,tipocostogastoimporAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocostogastoimporAux=new  TipoCostoGastoImpor();
				
				tipocostogastoimporAux.setIsNew(false);
				tipocostogastoimporAux.setIsChanged(false);
				
				tipocostogastoimporAux.setIsDeleted(true);
				
				tipocostogastoimporAux.setId(this.tipocostogastoimpor.getId());	
				tipocostogastoimporAux.setVersionRow(this.tipocostogastoimpor.getVersionRow());	
				tipocostogastoimporAux.setcodigo(this.tipocostogastoimpor.getcodigo());	
				tipocostogastoimporAux.setnombre(this.tipocostogastoimpor.getnombre());	
				
				if(this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocostogastoimporAux.getId()>=0) {	
						this.tipocostogastoimporsEliminados.add(tipocostogastoimporAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocostogastoimporAux,tipocostogastoimporLogic.getTipoCostoGastoImpors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocostogastoimporAux,tipocostogastoimpors);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocostogastoimporSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocostogastoimporSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocostogastoimporLogic.saveTipoCostoGastoImpors();//WithConnection
						//tipocostogastoimporLogic.getSetVersionRowTipoCostoGastoImpors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostogastoimporLogic.getTipoCostoGastoImpors().addAll(this.tipocostogastoimporsEliminados);
					
					tipocostogastoimporLogic.saveTipoCostoGastoImpors();//WithConnection
					//tipocostogastoimporLogic.getSetVersionRowTipoCostoGastoImpors();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipocostogastoimporsEliminados= new ArrayList<TipoCostoGastoImpor>();		
			}
			
			if(this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Costo Gasto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Costo Gasto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocostogastoimpor=tipocostogastoimporAux;
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
      		//this.finishProcessTipoCostoGastoImpor();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoCostoGastoImpor tipocostogastoimporLocal) throws Exception {
		
		if(this.tipocostogastoimporSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoCostoGastoImpor tipocostogastoimporLocal) throws Exception {	
		if(this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoCostoGastoImporActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoCostoGastoImpor.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimpors.toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocostogastoimporValidator.getInvalidValues(this.tipocostogastoimpor);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoCostoGastoImpor tipocostogastoimpor,List<TipoCostoGastoImpor> tipocostogastoimpors) throws Exception {
		try	{		
			TipoCostoGastoImporConstantesFunciones.actualizarLista(tipocostogastoimpor,tipocostogastoimpors,this.tipocostogastoimporSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoCostoGastoImpor tipocostogastoimpor,List<TipoCostoGastoImpor> tipocostogastoimpors) throws Exception {
		try	{			
			TipoCostoGastoImporConstantesFunciones.actualizarSelectedLista(tipocostogastoimpor,tipocostogastoimpors);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoCostoGastoImpor> tipocostogastoimporsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocostogastoimporsLocal=this.tipocostogastoimporLogic.getTipoCostoGastoImpors();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocostogastoimporsLocal=this.tipocostogastoimpors;
			}
			//ARCHITECTURE
		
			for(TipoCostoGastoImpor tipocostogastoimporLocal:tipocostogastoimporsLocal) {
				if(this.permiteMantenimiento(tipocostogastoimporLocal) && tipocostogastoimporLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoCostoGastoImporConstantesFunciones.getTipoCostoGastoImporLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoCostoGastoImporConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCostoGastoImpor.jLabelcodigoTipoCostoGastoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCostoGastoImporConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCostoGastoImpor.jLabelnombreTipoCostoGastoImpor,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCostoGastoImpor.jLabelcodigoTipoCostoGastoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCostoGastoImpor.jLabelnombreTipoCostoGastoImpor,"");
		
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
		this.iIdNuevoTipoCostoGastoImpor--;	
		
		
		this.tipocostogastoimporAux=new TipoCostoGastoImpor();
		
		this.tipocostogastoimporAux.setId(this.iIdNuevoTipoCostoGastoImpor);
		this.tipocostogastoimporAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocostogastoimporLogic.getTipoCostoGastoImpors().add(this.tipocostogastoimporAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocostogastoimpors.add(this.tipocostogastoimporAux);
		}
		//ARCHITECTURE
		
		this.tipocostogastoimpor=this.tipocostogastoimporAux;
		
		if(TipoCostoGastoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoCostoGastoImpor(this.tipocostogastoimpor);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCostoGastoImpor(this.tipocostogastoimpor);
		}
				
		//this.setDefaultControlesTipoCostoGastoImpor();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoCostoGastoImpor();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoCostoGastoImpor();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCostoGastoImpor();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCostoGastoImpor(this.tipocostogastoimporBean,this.tipocostogastoimpor,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoGastoImpor(this.tipocostogastoimpor);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocostogastoimporSessionBean.getConGuardarRelaciones()) {
			classes=TipoCostoGastoImporConstantesFunciones.getClassesRelationshipsOfTipoCostoGastoImpor(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocostogastoimporReturnGeneral=tipocostogastoimporLogic.procesarEventosTipoCostoGastoImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocostogastoimporLogic.getTipoCostoGastoImpors(),this.tipocostogastoimpor,this.tipocostogastoimporParameterGeneral,this.isEsNuevoTipoCostoGastoImpor,classes);//this.tipocostogastoimporLogic.getTipoCostoGastoImpor()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoCostoGastoImpor(this.tipocostogastoimporReturnGeneral,this.tipocostogastoimporBean,false);
		
		if(this.tipocostogastoimporReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCostoGastoImpor(this.tipocostogastoimporReturnGeneral.getTipoCostoGastoImpor());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoCostoGastoImpor(this.tipocostogastoimporReturnGeneral.getTipoCostoGastoImpor());
		}
		
		if(this.tipocostogastoimporReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoCostoGastoImpor(this.tipocostogastoimporReturnGeneral.getTipoCostoGastoImpor(),classes);//this.tipocostogastoimporBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoCostoGastoImpor(this.tipocostogastoimpor,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoCostoGastoImpor();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoCostoGastoImpor();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoCostoGastoImpor(false);
						
			if(tipocostogastoimporSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoCostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCostoGastoImpor();
			}
			
			this.actualizarVisualTableDatosTipoCostoGastoImpor();
			
			this.jTableDatosTipoCostoGastoImpor.setRowSelectionInterval(this.getIndiceNuevoTipoCostoGastoImpor(), this.getIndiceNuevoTipoCostoGastoImpor());
			
			this.seleccionarFilaTablaTipoCostoGastoImporActual();
						
			this.actualizarEstadoCeldasBotonesTipoCostoGastoImpor("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoCostoGastoImpor(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextFieldcodigoTipoCostoGastoImpor.setEnabled(isHabilitar && this.tipocostogastoimporConstantesFunciones.activarcodigoTipoCostoGastoImpor);
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextAreanombreTipoCostoGastoImpor.setEnabled(isHabilitar && this.tipocostogastoimporConstantesFunciones.activarnombreTipoCostoGastoImpor);	
		
	};
	
	public void setDefaultControlesTipoCostoGastoImpor() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoCostoGastoImpor(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocostogastoimporSessionBean.setConGuardarRelaciones(true);			
			this.tipocostogastoimporSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTabbedPaneRelacionesTipoCostoGastoImpor.setVisible(true);
			
					
		} else {
			//this.tipocostogastoimporSessionBean.setConGuardarRelaciones(false);			
			this.tipocostogastoimporSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTabbedPaneRelacionesTipoCostoGastoImpor.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoCostoGastoImpor() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCostoGastoImpor tipocostogastoimporAux:this.tipocostogastoimporLogic.getTipoCostoGastoImpors()) {
				if(tipocostogastoimporAux.getId().equals(this.iIdNuevoTipoCostoGastoImpor)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCostoGastoImpor tipocostogastoimporAux:this.tipocostogastoimpors) {
				if(tipocostogastoimporAux.getId().equals(this.iIdNuevoTipoCostoGastoImpor)) {
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
	
	public int getIndiceActualTipoCostoGastoImpor(TipoCostoGastoImpor tipocostogastoimpor,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCostoGastoImpor tipocostogastoimporAux:this.tipocostogastoimporLogic.getTipoCostoGastoImpors()) {
				if(tipocostogastoimporAux.getId().equals(tipocostogastoimpor.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCostoGastoImpor tipocostogastoimporAux:this.tipocostogastoimpors) {
				if(tipocostogastoimporAux.getId().equals(tipocostogastoimpor.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoCostoGastoImpor(TipoCostoGastoImpor tipocostogastoimporOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCostoGastoImpor tipocostogastoimporAux:this.tipocostogastoimporLogic.getTipoCostoGastoImpors()) {
				if(tipocostogastoimporAux.getTipoCostoGastoImporOriginal().getId().equals(tipocostogastoimporOriginal.getId())) {
					existe=true;
					tipocostogastoimporOriginal.setId(tipocostogastoimporAux.getId());
					tipocostogastoimporOriginal.setVersionRow(tipocostogastoimporAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCostoGastoImpor tipocostogastoimporAux:this.tipocostogastoimpors) {
				if(tipocostogastoimporAux.getTipoCostoGastoImporOriginal().getId().equals(tipocostogastoimporOriginal.getId())) {
					existe=true;
					tipocostogastoimporOriginal.setId(tipocostogastoimporAux.getId());
					tipocostogastoimporOriginal.setVersionRow(tipocostogastoimporAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoCostoGastoImpor(Boolean esParaCancelar) throws Exception {
		tipocostogastoimporsAux=new ArrayList<TipoCostoGastoImpor>();
		tipocostogastoimporAux=new TipoCostoGastoImpor();
		
		if(!this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCostoGastoImpor tipocostogastoimporAux:this.tipocostogastoimporLogic.getTipoCostoGastoImpors()) {
					if(tipocostogastoimporAux.getId()<0) {
						tipocostogastoimporsAux.add(tipocostogastoimporAux);
					}		
				}
				this.iIdNuevoTipoCostoGastoImpor=0L;
				this.tipocostogastoimporLogic.getTipoCostoGastoImpors().removeAll(tipocostogastoimporsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCostoGastoImpor tipocostogastoimporAux:this.tipocostogastoimpors) {
					if(tipocostogastoimporAux.getId()<0) {
						tipocostogastoimporsAux.add(tipocostogastoimporAux);
					}		
				}
				this.iIdNuevoTipoCostoGastoImpor=0L;
				this.tipocostogastoimpors.removeAll(tipocostogastoimporsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoCostoGastoImpor 
					&& this.tipocostogastoimporLogic.getTipoCostoGastoImpors().size()>0
					) {
					tipocostogastoimporAux=this.tipocostogastoimporLogic.getTipoCostoGastoImpors().get(this.tipocostogastoimporLogic.getTipoCostoGastoImpors().size() - 1);
				
					if(tipocostogastoimporAux.getId()<0) {
						this.tipocostogastoimporLogic.getTipoCostoGastoImpors().remove(tipocostogastoimporAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoCostoGastoImpor && this.tipocostogastoimpors.size()>0) {
					tipocostogastoimporAux=this.tipocostogastoimpors.get(this.tipocostogastoimpors.size() - 1);
				
					if(tipocostogastoimporAux.getId()<0) {
						this.tipocostogastoimpors.remove(tipocostogastoimporAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoCostoGastoImpor(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocostogastoimpor.getId()<0) {
				this.tipocostogastoimporLogic.getTipoCostoGastoImpors().remove(this.tipocostogastoimpor);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocostogastoimpor.getId()<0) {
				this.tipocostogastoimpors.remove(this.tipocostogastoimpor);
			}
		}			
	}
	
	public void setEstadosInicialesTipoCostoGastoImpor(List<TipoCostoGastoImpor> tipocostogastoimporsAux) throws Exception {
		TipoCostoGastoImporConstantesFunciones.setEstadosInicialesTipoCostoGastoImpor(tipocostogastoimporsAux);
	}
	
	public void setEstadosInicialesTipoCostoGastoImpor(TipoCostoGastoImpor tipocostogastoimporAux) throws Exception {
		TipoCostoGastoImporConstantesFunciones.setEstadosInicialesTipoCostoGastoImpor(tipocostogastoimporAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoCostoGastoImporActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoCostoGastoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoCostoGastoImporActual()) {
				if(!this.isEsNuevoTipoCostoGastoImpor) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoCostoGastoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoCostoGastoImpor=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoCostoGastoImporActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Costo Gasto ?", "MANTENIMIENTO DE Tipo Costo Gasto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoCostoGastoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoCostoGastoImpor tipocostogastoimpor) throws Exception {
		TipoCostoGastoImporConstantesFunciones.seleccionarAsignar(this.tipocostogastoimpor,tipocostogastoimpor);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoCostoGastoImpor=this.isPermisoActualizarOriginalTipoCostoGastoImpor;
			
			
			this.seleccionarAsignar(tipocostogastoimpor);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCostoGastoImporConstantesFunciones.quitarEspaciosTipoCostoGastoImpor(this.tipocostogastoimpor,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoCostoGastoImpor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocostogastoimporSessionBean.setsFuncionBusquedaRapida(this.tipocostogastoimporSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoCostoGastoImpor) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoCostoGastoImpor(esParaCancelar);				
				this.cancelarNuevoTipoCostoGastoImpor(esParaCancelar);								
			}
			
			this.tipocostogastoimpor=new TipoCostoGastoImpor();
			
			this.inicializarTipoCostoGastoImpor();
			
			this.actualizarEstadoCeldasBotonesTipoCostoGastoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoCostoGastoImpor() throws Exception {
		try {
			TipoCostoGastoImporConstantesFunciones.inicializarTipoCostoGastoImpor(this.tipocostogastoimpor);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocostogastoimporLogic.getTipoCostoGastoImpors().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoCostoGastoImpors(String sAccionBusqueda,List<TipoCostoGastoImpor> tipocostogastoimporsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoCostoGastoImpor"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoCostoGastoImporMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoCostoGastoImporMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoCostoGastoImpor"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Costo Gastos");		
		parameters.put("busquedapor", TipoCostoGastoImporConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoCostoGastoImpor=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoCostoGastoImporConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoCostoGastoImporConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoCostoGastoImpor=new JRBeanArrayDataSource(TipoCostoGastoImporJInternalFrame.TraerTipoCostoGastoImporBeans(tipocostogastoimporsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoCostoGastoImpor);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoCostoGastoImporConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoCostoGastoImporConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoCostoGastoImporBean.TraerTipoCostoGastoImporBeans(tipocostogastoimporsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoCostoGastoImpors(sAccionBusqueda,sTipoArchivoReporte,tipocostogastoimporsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoCostoGastoImpors(sAccionBusqueda,sTipoArchivoReporte,tipocostogastoimporsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoCostoGastoImporActionPerformed(null);
					//this.generarExcelReporteTipoCostoGastoImpors(sAccionBusqueda,sTipoArchivoReporte,tipocostogastoimporsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoCostoGastoImpors(sAccionBusqueda,sTipoArchivoReporte,tipocostogastoimporsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoCostoGastoImpors(sAccionBusqueda,sTipoArchivoReporte,tipocostogastoimporsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoCostoGastoImpors(sAccionBusqueda,sTipoArchivoReporte,tipocostogastoimporsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoCostoGastoImpors(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCostoGastoImpor> tipocostogastoimporsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocostogastoimpor";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCostoGastoImpors");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCostoGastoImpor("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoCostoGastoImpor tipocostogastoimpor : tipocostogastoimporsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoCostoGastoImporConstantesFunciones.generarExcelReporteDataTipoCostoGastoImpor("NORMAL",row,workbook,tipocostogastoimpor,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo Gasto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoCostoGastoImpor(String sTipo,Row row,Workbook workbook) {
		
		TipoCostoGastoImporConstantesFunciones.generarExcelReporteHeaderTipoCostoGastoImpor(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoCostoGastoImpors(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCostoGastoImpor> tipocostogastoimporsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocostogastoimpor_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCostoGastoImpors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoCostoGastoImpor tipocostogastoimpor : tipocostogastoimporsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoCostoGastoImporConstantesFunciones.getTipoCostoGastoImporDescripcion(tipocostogastoimpor));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCostoGastoImporConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCostoGastoImporConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocostogastoimpor.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCostoGastoImporConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCostoGastoImporConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocostogastoimpor.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo Gasto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoCostoGastoImpors(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCostoGastoImpor> tipocostogastoimporsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoCostoGastoImpor> tipocostogastoimporsRespaldo=null;
		
		classes=TipoCostoGastoImporConstantesFunciones.getClassesRelationshipsOfTipoCostoGastoImpor(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocostogastoimporLogic.setDatosCliente(this.datosCliente);
		this.tipocostogastoimporLogic.setDatosDeep(this.datosDeep);
		this.tipocostogastoimporLogic.setIsConDeep(true);
		
		tipocostogastoimporsRespaldo=this.tipocostogastoimporLogic.getTipoCostoGastoImpors();
		
		this.tipocostogastoimporLogic.setTipoCostoGastoImpors(tipocostogastoimporsParaReportes);	
		this.tipocostogastoimporLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocostogastoimporsParaReportes=this.tipocostogastoimporLogic.getTipoCostoGastoImpors();
		this.tipocostogastoimporLogic.setTipoCostoGastoImpors(tipocostogastoimporsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocostogastoimpor_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCostoGastoImpors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCostoGastoImpor("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoCostoGastoImpor tipocostogastoimpor : tipocostogastoimporsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoCostoGastoImpor("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoCostoGastoImporConstantesFunciones.generarExcelReporteDataTipoCostoGastoImpor("NORMAL",row,workbook,tipocostogastoimpor,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoCostoGastoImporConstantesFunciones.getTipoCostoGastoImporDescripcion(tipocostogastoimpor));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo Gasto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoCostoGastoImpor() throws Exception {		
		this.startProcessTipoCostoGastoImpor(true);
	}
	
	public void startProcessTipoCostoGastoImpor(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoCostoGastoImpor, this.jScrollPanelDatosTipoCostoGastoImpor,this.jPanelPaginacionTipoCostoGastoImpor, this.jScrollPanelDatosEdicionTipoCostoGastoImpor, this.jPanelAccionesTipoCostoGastoImpor,this.jPanelAccionesFormularioTipoCostoGastoImpor,this.jmenuBarTipoCostoGastoImpor,this.jmenuBarDetalleTipoCostoGastoImpor,this.jTtoolBarTipoCostoGastoImpor,this.jTtoolBarDetalleTipoCostoGastoImpor);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCostoGastoImpor=null; 
		
		final JPanel jPanelParametrosReportesTipoCostoGastoImpor=this.jPanelParametrosReportesTipoCostoGastoImpor;
		//final JScrollPane jScrollPanelDatosTipoCostoGastoImpor=this.jScrollPanelDatosTipoCostoGastoImpor;
		final JTable jTableDatosTipoCostoGastoImpor=this.jTableDatosTipoCostoGastoImpor;		
		final JPanel jPanelPaginacionTipoCostoGastoImpor=this.jPanelPaginacionTipoCostoGastoImpor;
		//final JScrollPane jScrollPanelDatosEdicionTipoCostoGastoImpor=this.jScrollPanelDatosEdicionTipoCostoGastoImpor;
		final JPanel jPanelAccionesTipoCostoGastoImpor=this.jPanelAccionesTipoCostoGastoImpor;
		
		JPanel jPanelCamposAuxiliarTipoCostoGastoImpor=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoCostoGastoImpor=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) {
			jPanelCamposAuxiliarTipoCostoGastoImpor=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jPanelCamposTipoCostoGastoImpor;
			jPanelAccionesFormularioAuxiliarTipoCostoGastoImpor=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jPanelAccionesFormularioTipoCostoGastoImpor;
		}
		
		final JPanel jPanelCamposTipoCostoGastoImpor=jPanelCamposAuxiliarTipoCostoGastoImpor;
		final JPanel jPanelAccionesFormularioTipoCostoGastoImpor=jPanelAccionesFormularioAuxiliarTipoCostoGastoImpor;
		
		
		final JMenuBar jmenuBarTipoCostoGastoImpor=this.jmenuBarTipoCostoGastoImpor;
		final JToolBar jTtoolBarTipoCostoGastoImpor=this.jTtoolBarTipoCostoGastoImpor;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoCostoGastoImpor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCostoGastoImpor=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) {
			jmenuBarDetalleAuxiliarTipoCostoGastoImpor=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jmenuBarDetalleTipoCostoGastoImpor;
			jTtoolBarDetalleAuxiliarTipoCostoGastoImpor=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTtoolBarDetalleTipoCostoGastoImpor;
		}
		
		final JMenuBar jmenuBarDetalleTipoCostoGastoImpor=jmenuBarDetalleAuxiliarTipoCostoGastoImpor;
		final JToolBar jTtoolBarDetalleTipoCostoGastoImpor=jTtoolBarDetalleAuxiliarTipoCostoGastoImpor;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCostoGastoImpor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCostoGastoImpor;
			processRunnable.jTableDatos=jTableDatosTipoCostoGastoImpor;
			processRunnable.jPanelCampos=jPanelCamposTipoCostoGastoImpor;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCostoGastoImpor;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCostoGastoImpor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCostoGastoImpor;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCostoGastoImpor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCostoGastoImpor;
			processRunnable.jTtoolBar=jTtoolBarTipoCostoGastoImpor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCostoGastoImpor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCostoGastoImpor ,jPanelParametrosReportesTipoCostoGastoImpor,jTableDatosTipoCostoGastoImpor, /*jScrollPanelDatosTipoCostoGastoImpor,*/jPanelCamposTipoCostoGastoImpor,jPanelPaginacionTipoCostoGastoImpor, /*jScrollPanelDatosEdicionTipoCostoGastoImpor,*/ jPanelAccionesTipoCostoGastoImpor,jPanelAccionesFormularioTipoCostoGastoImpor,jmenuBarTipoCostoGastoImpor,jmenuBarDetalleTipoCostoGastoImpor,jTtoolBarTipoCostoGastoImpor,jTtoolBarDetalleTipoCostoGastoImpor);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoCostoGastoImpor, jScrollPanelDatosTipoCostoGastoImpor,jPanelPaginacionTipoCostoGastoImpor, jScrollPanelDatosEdicionTipoCostoGastoImpor, jPanelAccionesTipoCostoGastoImpor,jPanelAccionesFormularioTipoCostoGastoImpor,jmenuBarTipoCostoGastoImpor,jmenuBarDetalleTipoCostoGastoImpor,jTtoolBarTipoCostoGastoImpor,jTtoolBarDetalleTipoCostoGastoImpor);
						
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
	
	public void finishProcessTipoCostoGastoImpor() {// throws Exception 
		this.finishProcessTipoCostoGastoImpor(true);
	}
	
	public void finishProcessTipoCostoGastoImpor(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoCostoGastoImpor, this.jScrollPanelDatosTipoCostoGastoImpor,this.jPanelPaginacionTipoCostoGastoImpor, this.jScrollPanelDatosEdicionTipoCostoGastoImpor, this.jPanelAccionesTipoCostoGastoImpor,this.jPanelAccionesFormularioTipoCostoGastoImpor,this.jmenuBarTipoCostoGastoImpor,this.jmenuBarDetalleTipoCostoGastoImpor,this.jTtoolBarTipoCostoGastoImpor,this.jTtoolBarDetalleTipoCostoGastoImpor);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCostoGastoImpor=null; 
		
		final JPanel jPanelParametrosReportesTipoCostoGastoImpor=this.jPanelParametrosReportesTipoCostoGastoImpor;
		//final JScrollPane jScrollPanelDatosTipoCostoGastoImpor=this.jScrollPanelDatosTipoCostoGastoImpor;
		final JTable jTableDatosTipoCostoGastoImpor=this.jTableDatosTipoCostoGastoImpor;		
		final JPanel jPanelPaginacionTipoCostoGastoImpor=this.jPanelPaginacionTipoCostoGastoImpor;
		//final JScrollPane jScrollPanelDatosEdicionTipoCostoGastoImpor=this.jScrollPanelDatosEdicionTipoCostoGastoImpor;
		final JPanel jPanelAccionesTipoCostoGastoImpor=this.jPanelAccionesTipoCostoGastoImpor;
		
		JPanel jPanelCamposAuxiliarTipoCostoGastoImpor=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoCostoGastoImpor=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) {
			jPanelCamposAuxiliarTipoCostoGastoImpor=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jPanelCamposTipoCostoGastoImpor;
			jPanelAccionesFormularioAuxiliarTipoCostoGastoImpor=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jPanelAccionesFormularioTipoCostoGastoImpor;
		}
		
		final JPanel jPanelCamposTipoCostoGastoImpor=jPanelCamposAuxiliarTipoCostoGastoImpor;
		final JPanel jPanelAccionesFormularioTipoCostoGastoImpor=jPanelAccionesFormularioAuxiliarTipoCostoGastoImpor;
		
		
		final JMenuBar jmenuBarTipoCostoGastoImpor=this.jmenuBarTipoCostoGastoImpor;		
		final JToolBar jTtoolBarTipoCostoGastoImpor=this.jTtoolBarTipoCostoGastoImpor;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoCostoGastoImpor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCostoGastoImpor=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) {
			jmenuBarDetalleAuxiliarTipoCostoGastoImpor=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jmenuBarDetalleTipoCostoGastoImpor;
			jTtoolBarDetalleAuxiliarTipoCostoGastoImpor=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTtoolBarDetalleTipoCostoGastoImpor;		
		}
		
		final JMenuBar jmenuBarDetalleTipoCostoGastoImpor=jmenuBarDetalleAuxiliarTipoCostoGastoImpor;
		final JToolBar jTtoolBarDetalleTipoCostoGastoImpor=jTtoolBarDetalleAuxiliarTipoCostoGastoImpor;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCostoGastoImpor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCostoGastoImpor;
			processRunnable.jTableDatos=jTableDatosTipoCostoGastoImpor;
			processRunnable.jPanelCampos=jPanelCamposTipoCostoGastoImpor;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCostoGastoImpor;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCostoGastoImpor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCostoGastoImpor;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCostoGastoImpor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCostoGastoImpor;
			processRunnable.jTtoolBar=jTtoolBarTipoCostoGastoImpor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCostoGastoImpor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoCostoGastoImpor ,jPanelParametrosReportesTipoCostoGastoImpor, jTableDatosTipoCostoGastoImpor,/*jScrollPanelDatosTipoCostoGastoImpor,*/jPanelCamposTipoCostoGastoImpor,jPanelPaginacionTipoCostoGastoImpor, /*jScrollPanelDatosEdicionTipoCostoGastoImpor,*/ jPanelAccionesTipoCostoGastoImpor,jPanelAccionesFormularioTipoCostoGastoImpor,jmenuBarTipoCostoGastoImpor,jmenuBarDetalleTipoCostoGastoImpor,jTtoolBarTipoCostoGastoImpor,jTtoolBarDetalleTipoCostoGastoImpor));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoCostoGastoImpor(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoCostoGastoImpor(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoCostoGastoImpor(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoCostoGastoImpor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoCostoGastoImpor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoCostoGastoImpor,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoCostoGastoImpor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoCostoGastoImpor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoCostoGastoImpor,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocostogastoimporConstantesFunciones.getsFinalQueryTipoCostoGastoImpor();
		String  finalQueryPaginacionTodos=this.tipocostogastoimporConstantesFunciones.getsFinalQueryTipoCostoGastoImpor();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoCostoGastoImporConstantesFunciones.getArrayColumnasGlobalesNoTipoCostoGastoImpor(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoCostoGastoImporConstantesFunciones.getArrayColumnasGlobalesTipoCostoGastoImpor(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoCostoGastoImporConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocostogastoimporsEliminados= new ArrayList<TipoCostoGastoImpor>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoCostoGastoImpor();
		
				///*TipoCostoGastoImporSessionBean*/this.tipocostogastoimporSessionBean=new TipoCostoGastoImporSessionBean();
			
			if(this.tipocostogastoimporSessionBean==null) {
				this.tipocostogastoimporSessionBean=new TipoCostoGastoImporSessionBean();
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
					this.iNumeroPaginacion=TipoCostoGastoImporConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoCostoGastoImporConstantesFunciones.getClassesForeignKeysOfTipoCostoGastoImpor(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocostogastoimpor."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocostogastoimporsAux= new ArrayList<TipoCostoGastoImpor>();
			
				
			tipocostogastoimporLogic.setDatosCliente(this.datosCliente);
			tipocostogastoimporLogic.setDatosDeep(this.datosDeep);
			tipocostogastoimporLogic.setIsConDeep(true);
			
			
			tipocostogastoimporLogic.getTipoCostoGastoImporDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocostogastoimporLogic.getTodosTipoCostoGastoImpors(finalQueryGlobal,pagination);
					
					//tipocostogastoimporLogic.getTodosTipoCostoGastoImporsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocostogastoimporLogic.getTipoCostoGastoImpors()==null|| tipocostogastoimporLogic.getTipoCostoGastoImpors().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocostogastoimporsAux= new ArrayList<TipoCostoGastoImpor>();
							tipocostogastoimporsAux.addAll(tipocostogastoimporLogic.getTipoCostoGastoImpors());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocostogastoimporsAux= new ArrayList<TipoCostoGastoImpor>();
							tipocostogastoimporsAux.addAll(tipocostogastoimpors);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocostogastoimporLogic.getTodosTipoCostoGastoImpors(finalQueryGlobal+"",this.pagination);												
							
							//tipocostogastoimporLogic.getTodosTipoCostoGastoImporsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoCostoGastoImpors("Todos",tipocostogastoimporLogic.getTipoCostoGastoImpors() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocostogastoimporLogic.setTipoCostoGastoImpors(new ArrayList<TipoCostoGastoImpor>());					
							tipocostogastoimporLogic.getTipoCostoGastoImpors().addAll(tipocostogastoimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocostogastoimpors=new ArrayList<TipoCostoGastoImpor>();
							tipocostogastoimpors.addAll(tipocostogastoimporsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoCostoGastoImpor=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoCostoGastoImpor=this.idActual;
				
				} else if(this.idTipoCostoGastoImporActual!=null && this.idTipoCostoGastoImporActual!=0L) {
					idTipoCostoGastoImpor=idTipoCostoGastoImporActual;
				}
				
					
				this.sDetalleReporte=TipoCostoGastoImporConstantesFunciones.getDetalleIndicePorId(idTipoCostoGastoImpor);
				
				this.tipocostogastoimpors=new ArrayList<TipoCostoGastoImpor>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocostogastoimporLogic.getEntity(idTipoCostoGastoImpor);
					
					//tipocostogastoimporLogic.getEntityWithConnection(idTipoCostoGastoImpor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocostogastoimporLogic.setTipoCostoGastoImpors(new ArrayList<TipoCostoGastoImpor>());
					tipocostogastoimporLogic.getTipoCostoGastoImpors().add(tipocostogastoimporLogic.getTipoCostoGastoImpor());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocostogastoimpors=new ArrayList<TipoCostoGastoImpor>();
					this.tipocostogastoimpors.add(tipocostogastoimpor);
				}
				
				if(tipocostogastoimporLogic.getTipoCostoGastoImpor()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoCostoGastoImpor();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoCostoGastoImpor();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocostogastoimporLogic.getTipoCostoGastoImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocostogastoimpors.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocostogastoimporLogic.getTipoCostoGastoImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocostogastoimpors.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoCostoGastoImpor tipocostogastoimpor) {
		Boolean permite=true;
		
		if(this.tipocostogastoimpor.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoCostoGastoImporConstantesFunciones.getOrderByListaTipoCostoGastoImpor();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoCostoGastoImporConstantesFunciones.getOrderByListaTipoCostoGastoImpor();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCostoGastoImpor tipocostogastoimpor:tipocostogastoimporLogic.getTipoCostoGastoImpors()) {
				if(tipocostogastoimpor.getsType().equals(Constantes2.S_TOTALES)) {
					tipocostogastoimporTotales=tipocostogastoimpor;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCostoGastoImpor tipocostogastoimpor:this.tipocostogastoimpors) {
				if(tipocostogastoimpor.getsType().equals(Constantes2.S_TOTALES)) {
					tipocostogastoimporTotales=tipocostogastoimpor;
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
			this.tipocostogastoimporAux=new TipoCostoGastoImpor();
			this.tipocostogastoimporAux.setsType(Constantes2.S_TOTALES);
			this.tipocostogastoimporAux.setIsNew(false);
			this.tipocostogastoimporAux.setIsChanged(false);
			this.tipocostogastoimporAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoCostoGastoImporConstantesFunciones.TotalizarValoresFilaTipoCostoGastoImpor(this.tipocostogastoimporLogic.getTipoCostoGastoImpors(),this.tipocostogastoimporAux);
				
				this.tipocostogastoimporLogic.getTipoCostoGastoImpors().add(this.tipocostogastoimporAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoCostoGastoImporConstantesFunciones.TotalizarValoresFilaTipoCostoGastoImpor(this.tipocostogastoimpors,this.tipocostogastoimporAux);
				
				this.tipocostogastoimpors.add(this.tipocostogastoimporAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocostogastoimporTotales=new TipoCostoGastoImpor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocostogastoimporLogic.getTipoCostoGastoImpors().remove(tipocostogastoimporTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocostogastoimpors.remove(tipocostogastoimporTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocostogastoimporTotales=new TipoCostoGastoImpor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCostoGastoImpor tipocostogastoimpor:tipocostogastoimporLogic.getTipoCostoGastoImpors()) {
				if(tipocostogastoimpor.getsType().equals(Constantes2.S_TOTALES)) {
					tipocostogastoimporTotales=tipocostogastoimpor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCostoGastoImporConstantesFunciones.TotalizarValoresFilaTipoCostoGastoImpor(this.tipocostogastoimporLogic.getTipoCostoGastoImpors(),tipocostogastoimporTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCostoGastoImpor tipocostogastoimpor:this.tipocostogastoimpors) {
				if(tipocostogastoimpor.getsType().equals(Constantes2.S_TOTALES)) {
					tipocostogastoimporTotales=tipocostogastoimpor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCostoGastoImporConstantesFunciones.TotalizarValoresFilaTipoCostoGastoImpor(this.tipocostogastoimpors,tipocostogastoimporTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoCostoGastoImpor() {
		this.isPermisoTodoTipoCostoGastoImpor=false;
		this.isPermisoNuevoTipoCostoGastoImpor=false;
		this.isPermisoActualizarTipoCostoGastoImpor=false;
		this.isPermisoActualizarOriginalTipoCostoGastoImpor=false;
		this.isPermisoEliminarTipoCostoGastoImpor=false;
		this.isPermisoGuardarCambiosTipoCostoGastoImpor=false;
		this.isPermisoConsultaTipoCostoGastoImpor=false;
		this.isPermisoBusquedaTipoCostoGastoImpor=false;
		this.isPermisoReporteTipoCostoGastoImpor=false;		
		this.isPermisoOrdenTipoCostoGastoImpor=false;		
		this.isPermisoPaginacionMedioTipoCostoGastoImpor=false;		
		this.isPermisoPaginacionAltoTipoCostoGastoImpor=false;
		this.isPermisoPaginacionTodoTipoCostoGastoImpor=false;
		this.isPermisoCopiarTipoCostoGastoImpor=false;		
		this.isPermisoVerFormTipoCostoGastoImpor=false;		
		this.isPermisoDuplicarTipoCostoGastoImpor=false;		
		this.isPermisoOrdenTipoCostoGastoImpor=false;		
	}
	
	public void setPermisosUsuarioTipoCostoGastoImpor(Boolean isPermiso) {
		this.isPermisoTodoTipoCostoGastoImpor=isPermiso;
		this.isPermisoNuevoTipoCostoGastoImpor=isPermiso;
		this.isPermisoActualizarTipoCostoGastoImpor=isPermiso;
		this.isPermisoActualizarOriginalTipoCostoGastoImpor=isPermiso;
		this.isPermisoEliminarTipoCostoGastoImpor=isPermiso;
		this.isPermisoGuardarCambiosTipoCostoGastoImpor=isPermiso;
		this.isPermisoConsultaTipoCostoGastoImpor=isPermiso;
		this.isPermisoBusquedaTipoCostoGastoImpor=isPermiso;
		this.isPermisoReporteTipoCostoGastoImpor=isPermiso;
		this.isPermisoOrdenTipoCostoGastoImpor=isPermiso;		
		this.isPermisoPaginacionMedioTipoCostoGastoImpor=isPermiso;		
		this.isPermisoPaginacionAltoTipoCostoGastoImpor=isPermiso;		
		this.isPermisoPaginacionTodoTipoCostoGastoImpor=isPermiso;		
		this.isPermisoCopiarTipoCostoGastoImpor=isPermiso;		
		this.isPermisoVerFormTipoCostoGastoImpor=isPermiso;		
		this.isPermisoDuplicarTipoCostoGastoImpor=isPermiso;
		this.isPermisoOrdenTipoCostoGastoImpor=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoCostoGastoImpor(Boolean isPermiso) {
		//this.isPermisoTodoTipoCostoGastoImpor=isPermiso;
		this.isPermisoNuevoTipoCostoGastoImpor=isPermiso;
		this.isPermisoActualizarTipoCostoGastoImpor=isPermiso;
		this.isPermisoActualizarOriginalTipoCostoGastoImpor=isPermiso;
		this.isPermisoEliminarTipoCostoGastoImpor=isPermiso;
		this.isPermisoGuardarCambiosTipoCostoGastoImpor=isPermiso;
		//this.isPermisoConsultaTipoCostoGastoImpor=isPermiso;
		//this.isPermisoBusquedaTipoCostoGastoImpor=isPermiso;
		//this.isPermisoReporteTipoCostoGastoImpor=isPermiso;
		//this.isPermisoOrdenTipoCostoGastoImpor=isPermiso;		
		//this.isPermisoPaginacionMedioTipoCostoGastoImpor=isPermiso;		
		//this.isPermisoPaginacionAltoTipoCostoGastoImpor=isPermiso;		
		//this.isPermisoPaginacionTodoTipoCostoGastoImpor=isPermiso;		
		//this.isPermisoCopiarTipoCostoGastoImpor=isPermiso;		
		//this.isPermisoDuplicarTipoCostoGastoImpor=isPermiso;
		//this.isPermisoOrdenTipoCostoGastoImpor=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoCostoGastoImporClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoCostoGastoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoCostoGastoImpor(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoCostoGastoImporClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoCostoGastoImporClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoCostoGastoImporClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoCostoGastoImporClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoCostoGastoImpor() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoCostoGastoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoCostoGastoImporConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoCostoGastoImpor=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoCostoGastoImpor=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoCostoGastoImpor=this.isPermisoActualizarTipoCostoGastoImpor;
			this.isPermisoEliminarTipoCostoGastoImpor=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoCostoGastoImpor=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoCostoGastoImpor=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoCostoGastoImpor=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoCostoGastoImpor=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoCostoGastoImpor=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCostoGastoImpor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoCostoGastoImpor=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoCostoGastoImpor=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoCostoGastoImpor=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoCostoGastoImpor=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoCostoGastoImpor=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoCostoGastoImpor=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCostoGastoImpor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoCostoGastoImpor.setToolTipText(this.jTableDatosTipoCostoGastoImpor.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoCostoGastoImpor(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoCostoGastoImpor(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoCostoGastoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoCostoGastoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoCostoGastoImpor() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoCostoGastoImporListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoCostoGastoImporListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoCostoGastoImporJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoCostoGastoImporListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoCostoGastoImporListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoCostoGastoImpor()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoCostoGastoImpor()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoCostoGastoImpor(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoCostoGastoImpor()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCostoGastoImpor();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoCostoGastoImpor(TipoCostoGastoImpor tipocostogastoimpor)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoCostoGastoImpor(TipoCostoGastoImpor tipocostogastoimpor,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoCostoGastoImpor()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCostoGastoImpor()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoCostoGastoImpor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoCostoGastoImpor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoCostoGastoImpor()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoCostoGastoImpor()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoCostoGastoImpor(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoCostoGastoImpor()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoCostoGastoImporBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoCostoGastoImporBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoCostoGastoImporBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocostogastoimporSessionBean=new TipoCostoGastoImporSessionBean(); 
		this.tipocostogastoimporConstantesFunciones=new TipoCostoGastoImporConstantesFunciones(); 
		this.tipocostogastoimporBean=new TipoCostoGastoImpor();//(this.tipocostogastoimporConstantesFunciones); 		
		this.tipocostogastoimporReturnGeneral=new TipoCostoGastoImporParameterReturnGeneral(); 
		
		this.tipocostogastoimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocostogastoimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoCostoGastoImporBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoCostoGastoImporBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoCostoGastoImporBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoCostoGastoImpor(true);
			
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
			
			this.tipocostogastoimporConstantesFunciones=new TipoCostoGastoImporConstantesFunciones(); 
			this.tipocostogastoimporBean=new TipoCostoGastoImpor();//this.tipocostogastoimporConstantesFunciones); 			
			this.tipocostogastoimporReturnGeneral=new TipoCostoGastoImporParameterReturnGeneral(); 
		
			TipoCostoGastoImporBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Costo Gasto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipocostogastoimpor=new TipoCostoGastoImpor();
			this.tipocostogastoimpors = new ArrayList<TipoCostoGastoImpor>();
			this.tipocostogastoimporsAux = new ArrayList<TipoCostoGastoImpor>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic=new TipoCostoGastoImporLogic();
				this.tipocostogastoimporLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocostogastoimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocostogastoimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoCostoGastoImpor);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoCostoGastoImpor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCostoGastoImpor);	
					}
					
					if(this.jInternalFrameImportacionTipoCostoGastoImpor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCostoGastoImpor);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoCostoGastoImpor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoCostoGastoImpor);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCostoGastoImpor);
				this.jInternalFrameDetalleFormTipoCostoGastoImpor.setVisible(false);
				this.jInternalFrameDetalleFormTipoCostoGastoImpor.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoCostoGastoImpor!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCostoGastoImpor);
					this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoCostoGastoImpor!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoCostoGastoImpor);
					this.jInternalFrameImportacionTipoCostoGastoImpor.setVisible(false);
					this.jInternalFrameImportacionTipoCostoGastoImpor.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoCostoGastoImpor!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoCostoGastoImpor);
					this.jInternalFrameOrderByTipoCostoGastoImpor.setVisible(false);
					this.jInternalFrameOrderByTipoCostoGastoImpor.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoCostoGastoImporActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoCostoGastoImporConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocostogastoimporReturnGeneral=new TipoCostoGastoImporParameterReturnGeneral();
			
			this.tipocostogastoimporParameterGeneral=new TipoCostoGastoImporParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocostogastoimporLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoCostoGastoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCostoGastoImporConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocostogastoimporSessionBean.getEsGuardarRelacionado(),this.tipocostogastoimporSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCostoGastoImporConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocostogastoimporSessionBean.getEsGuardarRelacionado(),this.tipocostogastoimporSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaDuplicarTipoCostoGastoImpor=true;
			this.isVisibilidadCeldaCopiarTipoCostoGastoImpor=true;
			this.isVisibilidadCeldaVerFormTipoCostoGastoImpor=true;
			this.isVisibilidadCeldaOrdenTipoCostoGastoImpor=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaModificarTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaActualizarTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaEliminarTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaCancelarTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaGuardarTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCostoGastoImpor=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoCostoGastoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoCostoGastoImpor();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoCostoGastoImpor(false);
			
			this.setPermisosUsuarioTipoCostoGastoImpor();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocostogastoimporSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocostogastoimporSessionBean.getEsGuardarRelacionado() && this.tipocostogastoimporSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoCostoGastoImporClasesRelacionadas();
			}
			
			if(this.tipocostogastoimporSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoCostoGastoImporClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoCostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoCostoGastoImpor();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoCostoGastoImpor();
			}
			
			if(!this.isPermisoBusquedaTipoCostoGastoImpor) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoCostoGastoImpor,this.isPermisoPaginacionMedioTipoCostoGastoImpor,this.isPermisoPaginacionTodoTipoCostoGastoImpor);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoCostoGastoImporConstantesFunciones.getTiposSeleccionarTipoCostoGastoImpor());
				
				this.tiposColumnasSelect=TipoCostoGastoImporConstantesFunciones.getTiposSeleccionarTipoCostoGastoImpor(true);
				
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
			//if(!this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoCostoGastoImpor();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoCostoGastoImpor(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoCostoGastoImpor(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCostoGastoImpor() ;
			
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
				tipocostogastoimporImplementable= (TipoCostoGastoImporImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCostoGastoImporConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocostogastoimporImplementableHome= (TipoCostoGastoImporImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCostoGastoImporConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocostogastoimpors= new ArrayList<TipoCostoGastoImpor>();
			this.tipocostogastoimporsEliminados= new ArrayList<TipoCostoGastoImpor>();
						
			this.isEsNuevoTipoCostoGastoImpor=false;
			this.esParaAccionDesdeFormularioTipoCostoGastoImpor=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoCostoGastoImpor(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoCostoGastoImpor();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoCostoGastoImporConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoCostoGastoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoCostoGastoImpor(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoCostoGastoImpor();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoCostoGastoImpor();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoCostoGastoImpor(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoCostoGastoImpor: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoCostoGastoImpor() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoCostoGastoImpor")) {
				iIndex=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTabbedPaneRelacionesTipoCostoGastoImpor.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTabbedPaneRelacionesTipoCostoGastoImpor.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoCostoGastoImpor.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoCostoGastoImpor();	
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
	
	public void cargarCombosForeignKeyTipoCostoGastoImpor(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoCostoGastoImpor(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoCostoGastoImpor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoCostoGastoImporListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoCostoGastoImpor();
		
		this.cargarCombosFrameForeignKeyTipoCostoGastoImpor();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoCostoGastoImpor();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoCostoGastoImpor();
		}
	}
	
	
	
	public void jButtonNuevoTipoCostoGastoImporActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocostogastoimporSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoCostoGastoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
			
			
			if(jTableDatosTipoCostoGastoImpor.getRowCount()>=1) {
				jTableDatosTipoCostoGastoImpor.removeRowSelectionInterval(0, jTableDatosTipoCostoGastoImpor.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoCostoGastoImpor=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoCostoGastoImpor(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoCostoGastoImpor(true);			
			//this.tipocostogastoimpor=new TipoCostoGastoImpor();
			//this.tipocostogastoimpor.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCostoGastoImpor(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCostoGastoImpor() ;
			
			if(TipoCostoGastoImporJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCostoGastoImpor(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocostogastoimpor);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocostogastoimpor);				
			
			TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
			
			if(this.tipocostogastoimporSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoCostoGastoImpor: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoCostoGastoImporActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoCostoGastoImpor> tipocostogastoimporsSeleccionados=new ArrayList<TipoCostoGastoImpor>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoCostoGastoImpor.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoCostoGastoImpor.getSelectedRows().length;			
			}
			
			tipocostogastoimporsSeleccionados=this.getTipoCostoGastoImporsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoCostoGastoImpor--;			
				//TipoCostoGastoImpor tipocostogastoimporAux= new TipoCostoGastoImpor();			
				//tipocostogastoimporAux.setId(this.iIdNuevoTipoCostoGastoImpor);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoCostoGastoImpor tipocostogastoimporOrigen=new TipoCostoGastoImpor();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoCostoGastoImpor tipocostogastoimporOrigen : tipocostogastoimporsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoCostoGastoImpor.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocostogastoimporOrigen =(TipoCostoGastoImpor) this.tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocostogastoimporOrigen =(TipoCostoGastoImpor) this.tipocostogastoimpors.toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoCostoGastoImpor();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocostogastoimpor.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoCostoGastoImpor(tipocostogastoimporOrigen,this.tipocostogastoimpor,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoGastoImpor(this.tipocostogastoimpor);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocostogastoimporLogic.getTipoCostoGastoImpors().add(this.tipocostogastoimporAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocostogastoimpors.add(this.tipocostogastoimporAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoCostoGastoImpor(false);
				
				this.jTableDatosTipoCostoGastoImpor.setRowSelectionInterval(this.getIndiceNuevoTipoCostoGastoImpor(), this.getIndiceNuevoTipoCostoGastoImpor());
				
				int iLastRow =  this.jTableDatosTipoCostoGastoImpor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCostoGastoImpor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCostoGastoImpor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCostoGastoImpor(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoCostoGastoImpor> tipocostogastoimporsSeleccionados=new ArrayList<TipoCostoGastoImpor>();									
		
			TipoCostoGastoImpor tipocostogastoimporOrigen=new TipoCostoGastoImpor();
			TipoCostoGastoImpor tipocostogastoimporDestino=new TipoCostoGastoImpor();
				
			tipocostogastoimporsSeleccionados=this.getTipoCostoGastoImporsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoCostoGastoImpor.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocostogastoimporsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoCostoGastoImpor.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocostogastoimporOrigen =(TipoCostoGastoImpor) this.tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocostogastoimporOrigen =(TipoCostoGastoImpor) this.tipocostogastoimpors.toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocostogastoimporDestino =(TipoCostoGastoImpor) this.tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocostogastoimporDestino =(TipoCostoGastoImpor) this.tipocostogastoimpors.toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocostogastoimporOrigen =tipocostogastoimporsSeleccionados.get(0);
				tipocostogastoimporDestino =tipocostogastoimporsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoCostoGastoImpor(tipocostogastoimporOrigen,tipocostogastoimporDestino,true,false);
				
				tipocostogastoimporDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocostogastoimporDestino,tipocostogastoimporLogic.getTipoCostoGastoImpors());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocostogastoimporDestino,tipocostogastoimpors);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoCostoGastoImpor(false);
				
				//this.jTableDatosTipoCostoGastoImpor.setRowSelectionInterval(this.getIndiceNuevoTipoCostoGastoImpor(), this.getIndiceNuevoTipoCostoGastoImpor());
				
				int iLastRow =  this.jTableDatosTipoCostoGastoImpor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCostoGastoImpor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCostoGastoImpor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCostoGastoImpor(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCostoGastoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoCostoGastoImpor.isVisible();
			
			
			this.jPanelParametrosReportesTipoCostoGastoImpor.setVisible(!isVisible);
			this.jPanelPaginacionTipoCostoGastoImpor.setVisible(!isVisible);
			this.jPanelAccionesTipoCostoGastoImpor.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoCostoGastoImpor();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoCostoGastoImpor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoCostoGastoImpor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoCostoGastoImpor();
			
			this.abrirFrameOrderByTipoCostoGastoImpor();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoCostoGastoImpor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoCostoGastoImpor(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCostoGastoImpor);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoCostoGastoImpor.isMaximum()) {
					this.jInternalFrameDetalleFormTipoCostoGastoImpor.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoCostoGastoImpor.setSize(this.jInternalFrameDetalleFormTipoCostoGastoImpor.iWidthFormulario,this.jInternalFrameDetalleFormTipoCostoGastoImpor.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoCostoGastoImpor.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoCostoGastoImpor.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoCostoGastoImpor.isMaximum()) {
						this.jInternalFrameDetalleFormTipoCostoGastoImpor.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoCostoGastoImpor.jContentPaneDetalleTipoCostoGastoImpor.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTabbedPaneRelacionesTipoCostoGastoImpor.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoCostoGastoImpor.jContentPaneDetalleTipoCostoGastoImpor.getWidth(),TipoCostoGastoImporConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTabbedPaneRelacionesTipoCostoGastoImpor.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoCostoGastoImpor.jContentPaneDetalleTipoCostoGastoImpor.getWidth(),TipoCostoGastoImporConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTabbedPaneRelacionesTipoCostoGastoImpor.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoCostoGastoImpor.jContentPaneDetalleTipoCostoGastoImpor.getWidth(),TipoCostoGastoImporConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoCostoGastoImpor.setVisible(true);
	        this.jInternalFrameDetalleFormTipoCostoGastoImpor.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoCostoGastoImpor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoCostoGastoImpor==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoCostoGastoImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCostoGastoImpor,false,this);
				} else {
					this.jInternalFrameOrderByTipoCostoGastoImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCostoGastoImpor,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoCostoGastoImpor);
				this.jInternalFrameOrderByTipoCostoGastoImpor.setVisible(false);
				this.jInternalFrameOrderByTipoCostoGastoImpor.setSelected(false);
				
				this.jInternalFrameOrderByTipoCostoGastoImpor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCostoGastoImpor"));
				
				this.inicializarActualizarBindingTablaOrderByTipoCostoGastoImpor();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoCostoGastoImpor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoCostoGastoImpor==null) {
				
				this.jInternalFrameImportacionTipoCostoGastoImpor=new ImportacionJInternalFrame(TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCostoGastoImpor);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoCostoGastoImpor);
				this.jInternalFrameImportacionTipoCostoGastoImpor.setVisible(false);
				this.jInternalFrameImportacionTipoCostoGastoImpor.setSelected(false);


				this.jInternalFrameImportacionTipoCostoGastoImpor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCostoGastoImpor"));
				this.jInternalFrameImportacionTipoCostoGastoImpor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCostoGastoImpor"));
				this.jInternalFrameImportacionTipoCostoGastoImpor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCostoGastoImpor"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoCostoGastoImpor() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoCostoGastoImpor==null) {
				this.jInternalFrameReporteDinamicoTipoCostoGastoImpor=new ReporteDinamicoJInternalFrame(TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCostoGastoImpor);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCostoGastoImpor);
				this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCostoGastoImpor"));
				this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCostoGastoImpor"));
				this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCostoGastoImpor"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCostoGastoImpor();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoCostoGastoImpor() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCostoGastoImpor);
			
	       	this.jInternalFrameDetalleFormTipoCostoGastoImpor.setVisible(false);
	        this.jInternalFrameDetalleFormTipoCostoGastoImpor.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoCostoGastoImpor.dispose();
			//this.jInternalFrameDetalleFormTipoCostoGastoImpor=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoCostoGastoImpor() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoCostoGastoImpor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoCostoGastoImpor.setVisible(true);
	        this.jInternalFrameImportacionTipoCostoGastoImpor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoCostoGastoImpor() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoCostoGastoImpor.setVisible(true);
	        this.jInternalFrameOrderByTipoCostoGastoImpor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoCostoGastoImpor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoCostoGastoImpor.setVisible(false);
	        this.jInternalFrameOrderByTipoCostoGastoImpor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoCostoGastoImpor() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoCostoGastoImpor() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoCostoGastoImpor.setVisible(false);
	        this.jInternalFrameImportacionTipoCostoGastoImpor.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoCostoGastoImpor(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoCostoGastoImpor(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCostoGastoImpor.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoCostoGastoImpor(true);
			//this.isEsNuevoTipoCostoGastoImpor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimpors.toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoCostoGastoImpor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCostoGastoImpor(false) ;
			
			if(tipocostogastoimporSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoCostoGastoImporJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCostoGastoImpor(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCostoGastoImpor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoCostoGastoImporActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoCostoGastoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimpors.toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoCostoGastoImpor(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCostoGastoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCostoGastoImpor.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoCostoGastoImpor(true);
			//this.isEsNuevoTipoCostoGastoImpor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimpors.toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocostogastoimpor.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoCostoGastoImpor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoCostoGastoImpor(false) ;
			
			if(TipoCostoGastoImporJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCostoGastoImpor(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCostoGastoImpor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoCostoGastoImpor(false);
			
			//if(!this.isEsNuevoTipoCostoGastoImpor) {								
				int intSelectedRow = this.jTableDatosTipoCostoGastoImpor.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimpors.toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoCostoGastoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoCostoGastoImpor(this.tipocostogastoimpor,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoGastoImpor(this.tipocostogastoimpor);
				
			}
			
			if(this.permiteMantenimiento(this.tipocostogastoimpor)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoCostoGastoImpor=true;
					this.inicializarActualizarBindingTablaTipoCostoGastoImpor(false);
					this.isEsNuevoTipoCostoGastoImpor=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoCostoGastoImpor=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoCostoGastoImpor=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCostoGastoImpor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCostoGastoImpor(false);
				
				this.habilitarDeshabilitarControlesTipoCostoGastoImpor(false);
			
												
				
				if(TipoCostoGastoImporJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoCostoGastoImpor();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoCostoGastoImporActionPerformed(evt,tipocostogastoimporSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoCostoGastoImpor(this.tipocostogastoimpor,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoCostoGastoImpor.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocostogastoimporSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocostogastoimpor.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoCostoGastoImpor.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCostoGastoImpor.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoCostoGastoImpor.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				this.tipocostogastoimpor.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimpors.toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				this.tipocostogastoimpor.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocostogastoimpor)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoCostoGastoImporModel) this.jTableDatosTipoCostoGastoImpor.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoCostoGastoImpor=true;
				this.inicializarActualizarBindingTablaTipoCostoGastoImpor(false);
				this.isEsNuevoTipoCostoGastoImpor=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCostoGastoImpor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCostoGastoImpor(false);
				
				this.habilitarDeshabilitarControlesTipoCostoGastoImpor(false);
				
				
				
				if(TipoCostoGastoImporJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoCostoGastoImpor();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoCostoGastoImpor.getRowCount()>=1) {
				jTableDatosTipoCostoGastoImpor.removeRowSelectionInterval(0, jTableDatosTipoCostoGastoImpor.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoCostoGastoImpor(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoCostoGastoImpor(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCostoGastoImpor(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCostoGastoImpor(false) ;
			
			this.isEsNuevoTipoCostoGastoImpor=false;
			
			if(TipoCostoGastoImporJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoCostoGastoImpor();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoCostoGastoImpor(false);
				
				//SI ES MANUAL
				if(TipoCostoGastoImporJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoCostoGastoImpor();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoCostoGastoImpor--;			
			//TipoCostoGastoImpor tipocostogastoimporAux= new TipoCostoGastoImpor();			
			//tipocostogastoimporAux.setId(this.iIdNuevoTipoCostoGastoImpor);
			
			if(this.jInternalFrameDetalleFormTipoCostoGastoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoCostoGastoImpor();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoGastoImpor(this.tipocostogastoimpor);
			
			this.tipocostogastoimpor.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocostogastoimporLogic.getTipoCostoGastoImpors().add(this.tipocostogastoimporAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocostogastoimpors.add(this.tipocostogastoimporAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoCostoGastoImpor(false);
			
			this.jTableDatosTipoCostoGastoImpor.setRowSelectionInterval(this.getIndiceNuevoTipoCostoGastoImpor(), this.getIndiceNuevoTipoCostoGastoImpor());
			
			int iLastRow =  this.jTableDatosTipoCostoGastoImpor.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoCostoGastoImpor.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoCostoGastoImpor.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoCostoGastoImpor(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoCostoGastoImpor(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCostoGastoImpor(false);
			
			//SI ES MANUAL
			if(TipoCostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCostoGastoImpor();
			}
			
			//this.abrirFrameTreeTipoCostoGastoImpor();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Costo GastoS ?", "MANTENIMIENTO DE Tipo Costo Gasto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoCostoGastoImpor.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoCostoGastoImpor();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocostogastoimporReturnGeneral=tipocostogastoimporLogic.procesarImportacionTipoCostoGastoImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocostogastoimporParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoCostoGastoImporReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoCostoGastoImpor.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoCostoGastoImpor.setFileImportacion(this.jInternalFrameImportacionTipoCostoGastoImpor.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoCostoGastoImpor.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoCostoGastoImpor.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoCostoGastoImpor.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoCostoGastoImpor.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoCostoGastoImpor> tipocostogastoimporsSeleccionados=new ArrayList<TipoCostoGastoImpor>();		

		tipocostogastoimporsSeleccionados=this.getTipoCostoGastoImporsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoCostoGastoImporBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoCostoGastoImporBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoCostoGastoImpors("Todos",tipocostogastoimporsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo Gasto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCostoGastoImporConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCostoGastoImporConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoCostoGastoImporConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoCostoGastoImporConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoCostoGastoImporConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoCostoGastoImporConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCostoGastoImporConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoCostoGastoImporConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoCostoGastoImpor> tipocostogastoimporsSeleccionados=new ArrayList<TipoCostoGastoImpor>();		
		
		tipocostogastoimporsSeleccionados=this.getTipoCostoGastoImporsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocostogastoimpor";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoCostoGastoImpors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoCostoGastoImporConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCostoGastoImporConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoCostoGastoImpor tipocostogastoimpor:tipocostogastoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocostogastoimpor.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCostoGastoImporConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCostoGastoImporConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoCostoGastoImpor tipocostogastoimpor:tipocostogastoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocostogastoimpor.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoCostoGastoImpor(row);				
			//	iRow++;
			//}				
			
			//for(TipoCostoGastoImpor tipocostogastoimporAux:tipocostogastoimporsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoCostoGastoImpor(tipocostogastoimporAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo Gasto",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocostogastoimporLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCostoGastoImpor(false);
			
			//SI ES MANUAL
			if(TipoCostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCostoGastoImpor();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCostoGastoImpor(false);
			
			//SI ES MANUAL
			if(TipoCostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCostoGastoImpor();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoCostoGastoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCostoGastoImpor(false);
			
			//SI ES MANUAL
			if(TipoCostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCostoGastoImpor();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostogastoimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoCostoGastoImpor() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoCostoGastoImpor.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoCostoGastoImpor.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoCostoGastoImpor.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoCostoGastoImpor.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoCostoGastoImpor.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoCostoGastoImpor.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoCostoGastoImpor.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoCostoGastoImpor(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoCostoGastoImpor(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoCostoGastoImpor(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoCostoGastoImpor(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoCostoGastoImpor(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoCostoGastoImpor(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCostoGastoImpor(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoCostoGastoImpor(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoCostoGastoImporJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoCostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoCostoGastoImpor() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoCostoGastoImpor();
		
		this.inicializarActualizarBindingBotonesManualTipoCostoGastoImpor(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCostoGastoImpor();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCostoGastoImpor() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCostoGastoImpor(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCostoGastoImpor(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoCostoGastoImpor.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoCostoGastoImpor.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoCostoGastoImpor.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jCheckBoxPostAccionNuevoTipoCostoGastoImpor.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jCheckBoxPostAccionSinCerrarTipoCostoGastoImpor.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jCheckBoxPostAccionSinMensajeTipoCostoGastoImpor.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoCostoGastoImpor.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoCostoGastoImpor.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoCostoGastoImpor.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) {
				this.jInternalFrameDetalleFormTipoCostoGastoImpor.jCheckBoxPostAccionNuevoTipoCostoGastoImpor.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoCostoGastoImpor.jCheckBoxPostAccionSinCerrarTipoCostoGastoImpor.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoCostoGastoImpor.jCheckBoxPostAccionSinMensajeTipoCostoGastoImpor.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoCostoGastoImpor.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoCostoGastoImpor.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoCostoGastoImpor.jComboBoxTiposAccionesFormularioTipoCostoGastoImpor.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoCostoGastoImpor.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoCostoGastoImpor!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoCostoGastoImpor.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoCostoGastoImpor.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoCostoGastoImpor.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoCostoGastoImpor.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoCostoGastoImpor!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoCostoGastoImpor.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoCostoGastoImpor.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoCostoGastoImpor(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoCostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCostoGastoImpor(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoCostoGastoImpor() throws Exception {
		try	{
			if(TipoCostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCostoGastoImpor();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCostoGastoImpor() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jComboBoxTiposAccionesFormularioTipoCostoGastoImpor.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jComboBoxTiposAccionesFormularioTipoCostoGastoImpor.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCostoGastoImpor() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoCostoGastoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoCostoGastoImpor.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoCostoGastoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoCostoGastoImpor.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoCostoGastoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoCostoGastoImpor.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoCostoGastoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoCostoGastoImpor.addItem(reporte);
			}
			
			
			if(!this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoCostoGastoImpor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoCostoGastoImpor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoCostoGastoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoCostoGastoImpor.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoCostoGastoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoCostoGastoImpor.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoCostoGastoImpor.jComboBoxTiposAccionesFormularioTipoCostoGastoImpor.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoCostoGastoImpor.jComboBoxTiposAccionesFormularioTipoCostoGastoImpor.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoCostoGastoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoCostoGastoImpor.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoCostoGastoImpor.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCostoGastoImpor();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCostoGastoImpor() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCostoGastoImpor!=null) {
				this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCostoGastoImpor!=null) {
				this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoCostoGastoImpor!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoCostoGastoImpor()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoCostoGastoImpor(Boolean esInicializar) throws Exception {				
		if(TipoCostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCostoGastoImpor();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoCostoGastoImpor() throws Exception {
		this.inicializarActualizarBindingTablaTipoCostoGastoImpor(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoCostoGastoImpor() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoCostoGastoImpor.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoCostoGastoImpor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCostoGastoImpor.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoCostoGastoImporPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoCostoGastoImpor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCostoGastoImpor.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoCostoGastoImporPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoCostoGastoImporOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCostoGastoImporOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoCostoGastoImporPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoCostoGastoImpor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCostoGastoImpor.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoCostoGastoImporPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoCostoGastoImpor.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoCostoGastoImpor(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocostogastoimporLogic.getTipoCostoGastoImpors().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocostogastoimpors.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoCostoGastoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoCostoGastoImpor.setModel(new TipoCostoGastoImporModel(this.tipocostogastoimporLogic.getTipoCostoGastoImpors(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoCostoGastoImpor.setModel(new TipoCostoGastoImporModel(this.tipocostogastoimpors,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoCostoGastoImpor!=null && this.jInternalFrameOrderByTipoCostoGastoImpor.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoCostoGastoImpor();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoCostoGastoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCostoGastoImpor,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoCostoGastoImporPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO,tipocostogastoimporConstantesFunciones.resaltarSeleccionarTipoCostoGastoImpor,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoCostoGastoImporConstantesFunciones.SCLASSWEBTITULO,tipocostogastoimporConstantesFunciones.resaltarSeleccionarTipoCostoGastoImpor,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoCostoGastoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCostoGastoImpor,TipoCostoGastoImporConstantesFunciones.LABEL_ID));

		if(this.tipocostogastoimporConstantesFunciones.mostraridTipoCostoGastoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCostoGastoImporConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocostogastoimporConstantesFunciones.resaltaridTipoCostoGastoImpor,this.tipocostogastoimporConstantesFunciones.activaridTipoCostoGastoImpor,this,true,"idTipoCostoGastoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocostogastoimporConstantesFunciones.resaltaridTipoCostoGastoImpor,this.tipocostogastoimporConstantesFunciones.activaridTipoCostoGastoImpor,this,true,"idTipoCostoGastoImpor","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCostoGastoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCostoGastoImpor,TipoCostoGastoImporConstantesFunciones.LABEL_CODIGO));

		if(this.tipocostogastoimporConstantesFunciones.mostrarcodigoTipoCostoGastoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCostoGastoImporConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocostogastoimporConstantesFunciones.resaltarcodigoTipoCostoGastoImpor,this.tipocostogastoimporConstantesFunciones.activarcodigoTipoCostoGastoImpor,this,true,"codigoTipoCostoGastoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocostogastoimporConstantesFunciones.resaltarcodigoTipoCostoGastoImpor,this.tipocostogastoimporConstantesFunciones.activarcodigoTipoCostoGastoImpor,this,true,"codigoTipoCostoGastoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCostoGastoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCostoGastoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCostoGastoImpor,TipoCostoGastoImporConstantesFunciones.LABEL_NOMBRE));

		if(this.tipocostogastoimporConstantesFunciones.mostrarnombreTipoCostoGastoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCostoGastoImporConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocostogastoimporConstantesFunciones.resaltarnombreTipoCostoGastoImpor,this.tipocostogastoimporConstantesFunciones.activarnombreTipoCostoGastoImpor,this,true,"nombreTipoCostoGastoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocostogastoimporConstantesFunciones.resaltarnombreTipoCostoGastoImpor,this.tipocostogastoimporConstantesFunciones.activarnombreTipoCostoGastoImpor,this,true,"nombreTipoCostoGastoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCostoGastoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCostoGastoImpor.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCostoGastoImpor.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoCostoGastoImpor && this.isPermisoGuardarCambiosTipoCostoGastoImpor) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoCostoGastoImpor.addColumn(tableColumn);
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
			
			this.jTableDatosTipoCostoGastoImpor.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCostoGastoImpor && this.isPermisoGuardarCambiosTipoCostoGastoImpor) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCostoGastoImpor && this.isPermisoGuardarCambiosTipoCostoGastoImpor) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoCostoGastoImpor.moveColumn(this.jTableDatosTipoCostoGastoImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoCostoGastoImpor.moveColumn(this.jTableDatosTipoCostoGastoImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoCostoGastoImpor.moveColumn(this.jTableDatosTipoCostoGastoImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoCostoGastoImpor.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoCostoGastoImpor.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoCostoGastoImpor,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoCostoGastoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoCostoGastoImpor.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoCostoGastoImpor.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoCostoGastoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoCostoGastoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoCostoGastoImpor.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoCostoGastoImpor.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoCostoGastoImpor.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocostogastoimporLogic.getTipoCostoGastoImpors().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocostogastoimpors.size()-1;
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
		//this.jTableDatosTipoCostoGastoImpor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoCostoGastoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoCostoGastoImpor();
			
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
				
				//this.isEsNuevoTipoCostoGastoImpor=false;
					
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
			
				if(this.tipocostogastoimporSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoCostoGastoImpor==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCostoGastoImpor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCostoGastoImpor.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimpors.toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocostogastoimpor.getsType().equals("DUPLICADO")
				   || this.tipocostogastoimpor.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoCostoGastoImpor=true;
				
				} else {
					this.isEsNuevoTipoCostoGastoImpor=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocostogastoimpor.getId()>=0 && !this.tipocostogastoimpor.getIsNew()) {						
						this.isEsNuevoTipoCostoGastoImpor=false;
						
					} else {
						this.isEsNuevoTipoCostoGastoImpor=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoCostoGastoImpor(esRelaciones);						
				
				this.seleccionarTipoCostoGastoImpor(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocostogastoimpor.getId()<0) {
					this.isEsNuevoTipoCostoGastoImpor=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoCostoGastoImpor(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoCostoGastoImpor(evt,rowIndex);
				}	
				
				if(this.tipocostogastoimporSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoCostoGastoImpor: " + this.dDif); 
					}
				}								
				
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoCostoGastoImpor(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocostogastoimpor)) {
					if(this.tipocostogastoimpor.getId()>0) {
						this.tipocostogastoimpor.setIsDeleted(true);
						
						this.tipocostogastoimporsEliminados.add(this.tipocostogastoimpor);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocostogastoimporLogic.getTipoCostoGastoImpors().remove(this.tipocostogastoimpor);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocostogastoimpors.remove(this.tipocostogastoimpor);				
					}
					
					
					((TipoCostoGastoImporModel) this.jTableDatosTipoCostoGastoImpor.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCostoGastoImpor(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoCostoGastoImpor(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoCostoGastoImpor) {
			
			if(this.jInternalFrameDetalleFormTipoCostoGastoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCostoGastoImpor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCostoGastoImpor.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimpors.toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoCostoGastoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoCostoGastoImpor(this.tipocostogastoimpor);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoCostoGastoImpor("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoCostoGastoImpor(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCostoGastoImpor() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCostoGastoImpor(TipoCostoGastoImpor tipocostogastoimpor) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoCostoGastoImpor(tipocostogastoimpor,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCostoGastoImpor(TipoCostoGastoImpor tipocostogastoimpor,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoCostoGastoImpor(tipocostogastoimpor);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoCostoGastoImpor(tipocostogastoimpor,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoCostoGastoImpor(tipocostogastoimpor);
	}
	
	public void setVariablesObjetoActualToFormularioTipoCostoGastoImpor(TipoCostoGastoImpor tipocostogastoimpor) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoCostoGastoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextFieldidTipoCostoGastoImpor.setText(tipocostogastoimpor.getId().toString());
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextFieldcodigoTipoCostoGastoImpor.setText(tipocostogastoimpor.getcodigo());
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextAreanombreTipoCostoGastoImpor.setText(tipocostogastoimpor.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoCostoGastoImpor tipocostogastoimporLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocostogastoimporLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoCostoGastoImpor tipocostogastoimporLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocostogastoimporLocal=this.tipocostogastoimpor;
			} else {
				tipocostogastoimporLocal=this.tipocostogastoimporAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocostogastoimporLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoCostoGastoImpor(tipocostogastoimporLocal,true);
					
					if(tipocostogastoimporSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocostogastoimporLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocostogastoimporLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoCostoGastoImpor(TipoCostoGastoImpor tipocostogastoimpor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCostoGastoImpor(tipocostogastoimpor,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoGastoImpor(tipocostogastoimpor);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCostoGastoImpor(TipoCostoGastoImpor tipocostogastoimpor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCostoGastoImpor(tipocostogastoimpor,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCostoGastoImpor(TipoCostoGastoImpor tipocostogastoimpor,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoCostoGastoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextFieldidTipoCostoGastoImpor.getText()==null || this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextFieldidTipoCostoGastoImpor.getText()=="" || this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextFieldidTipoCostoGastoImpor.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextFieldidTipoCostoGastoImpor.setText("0");
			}

			if(conColumnasBase) {tipocostogastoimpor.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextFieldidTipoCostoGastoImpor.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCostoGastoImporConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCostoGastoImpor.jLabelIdTipoCostoGastoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocostogastoimpor.setcodigo(this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextFieldcodigoTipoCostoGastoImpor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCostoGastoImporConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCostoGastoImpor.jLabelcodigoTipoCostoGastoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocostogastoimpor.setnombre(this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextAreanombreTipoCostoGastoImpor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCostoGastoImporConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCostoGastoImpor.jLabelnombreTipoCostoGastoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCostoGastoImpor(TipoCostoGastoImpor tipocostogastoimporBean,TipoCostoGastoImpor tipocostogastoimpor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoCostoGastoImpor(TipoCostoGastoImpor tipocostogastoimporOrigen,TipoCostoGastoImpor tipocostogastoimpor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocostogastoimporOrigen.getId()!=null && !tipocostogastoimporOrigen.getId().equals(0L))) {tipocostogastoimpor.setId(tipocostogastoimporOrigen.getId());}}
			if(conDefault || (!conDefault && tipocostogastoimporOrigen.getcodigo()!=null && !tipocostogastoimporOrigen.getcodigo().equals(""))) {tipocostogastoimpor.setcodigo(tipocostogastoimporOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipocostogastoimporOrigen.getnombre()!=null && !tipocostogastoimporOrigen.getnombre().equals(""))) {tipocostogastoimpor.setnombre(tipocostogastoimporOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCostoGastoImpor(TipoCostoGastoImpor tipocostogastoimpor) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextFieldidTipoCostoGastoImpor.setText(tipocostogastoimpor.getId().toString());
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextFieldcodigoTipoCostoGastoImpor.setText(tipocostogastoimpor.getcodigo());
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextAreanombreTipoCostoGastoImpor.setText(tipocostogastoimpor.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCostoGastoImpor(TipoCostoGastoImporBean tipocostogastoimporBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextFieldidTipoCostoGastoImpor.setText(tipocostogastoimporBean.getId().toString());
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextFieldcodigoTipoCostoGastoImpor.setText(tipocostogastoimporBean.getcodigo());
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextAreanombreTipoCostoGastoImpor.setText(tipocostogastoimporBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoCostoGastoImpor(TipoCostoGastoImporParameterReturnGeneral tipocostogastoimporReturnGeneral,TipoCostoGastoImporBean tipocostogastoimporBean,Boolean conDefault) throws Exception { 
		try {
			TipoCostoGastoImpor tipocostogastoimporLocal=new TipoCostoGastoImpor();
			
			tipocostogastoimporLocal=tipocostogastoimporReturnGeneral.getTipoCostoGastoImpor();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocostogastoimporLocal.getId()!=null && !tipocostogastoimporLocal.getId().equals(0L))) {tipocostogastoimporBean.setId(tipocostogastoimporLocal.getId());}}
			if(conDefault || (!conDefault && tipocostogastoimporLocal.getcodigo()!=null && !tipocostogastoimporLocal.getcodigo().equals(""))) {tipocostogastoimporBean.setcodigo(tipocostogastoimporLocal.getcodigo());}
			if(conDefault || (!conDefault && tipocostogastoimporLocal.getnombre()!=null && !tipocostogastoimporLocal.getnombre().equals(""))) {tipocostogastoimporBean.setnombre(tipocostogastoimporLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoCostoGastoImporGenerico(Long idTipoCostoGastoImporSeleccionado,JComboBox jComboBoxTipoCostoGastoImpor,List<TipoCostoGastoImpor> tipocostogastoimporsLocal)throws Exception {
		try {
			TipoCostoGastoImpor  tipocostogastoimporTemp=null;

			for(TipoCostoGastoImpor tipocostogastoimporAux:tipocostogastoimporsLocal) {
				if(tipocostogastoimporAux.getId()!=null && tipocostogastoimporAux.getId().equals(idTipoCostoGastoImporSeleccionado)) {
					tipocostogastoimporTemp=tipocostogastoimporAux;
					break;
				}
			}

			jComboBoxTipoCostoGastoImpor.setSelectedItem(tipocostogastoimporTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoCostoGastoImporGenerico(JComboBox jComboBoxTipoCostoGastoImpor,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCostoGastoImpor.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoCostoGastoImpor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCostoGastoImpor.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoCostoGastoImpor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocostogastoimpor=(TipoCostoGastoImpor) tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocostogastoimpor =(TipoCostoGastoImpor) tipocostogastoimpors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoCostoGastoImpor tipocostogastoimporRow=new TipoCostoGastoImpor();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocostogastoimporRow=(TipoCostoGastoImpor) tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocostogastoimporRow=(TipoCostoGastoImpor) tipocostogastoimpors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoCostoGastoImpor(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaNuevoTipoCostoGastoImpor && this.isPermisoNuevoTipoCostoGastoImpor));			
			this.jButtonDuplicarTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaDuplicarTipoCostoGastoImpor && this.isPermisoDuplicarTipoCostoGastoImpor));			
			this.jButtonCopiarTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaCopiarTipoCostoGastoImpor && this.isPermisoCopiarTipoCostoGastoImpor));
			this.jButtonVerFormTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaVerFormTipoCostoGastoImpor && this.isPermisoVerFormTipoCostoGastoImpor));
			
			this.jButtonAbrirOrderByTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaOrdenTipoCostoGastoImpor && this.isPermisoOrdenTipoCostoGastoImpor));			
			
			this.jButtonNuevoRelacionesTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor && this.isPermisoNuevoTipoCostoGastoImpor));			
			this.jButtonNuevoGuardarCambiosTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaNuevoTipoCostoGastoImpor && this.isPermisoNuevoTipoCostoGastoImpor && this.isPermisoGuardarCambiosTipoCostoGastoImpor));
			
			if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) {
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonModificarTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaModificarTipoCostoGastoImpor && this.isPermisoActualizarTipoCostoGastoImpor));	
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonActualizarTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaActualizarTipoCostoGastoImpor && this.isPermisoActualizarTipoCostoGastoImpor));	
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonEliminarTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaEliminarTipoCostoGastoImpor && this.isPermisoEliminarTipoCostoGastoImpor));
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonCancelarTipoCostoGastoImpor.setVisible(this.isVisibilidadCeldaCancelarTipoCostoGastoImpor);							
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonGuardarCambiosTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaGuardarTipoCostoGastoImpor && this.isPermisoGuardarCambiosTipoCostoGastoImpor));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCostoGastoImpor && this.isPermisoGuardarCambiosTipoCostoGastoImpor));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaNuevoTipoCostoGastoImpor && this.isPermisoNuevoTipoCostoGastoImpor));						
			this.jButtonDuplicarToolBarTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaDuplicarTipoCostoGastoImpor && this.isPermisoDuplicarTipoCostoGastoImpor));						
			this.jButtonCopiarToolBarTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaCopiarTipoCostoGastoImpor && this.isPermisoCopiarTipoCostoGastoImpor));			
			this.jButtonVerFormToolBarTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaVerFormTipoCostoGastoImpor && this.isPermisoVerFormTipoCostoGastoImpor));			
			this.jButtonAbrirOrderByToolBarTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaOrdenTipoCostoGastoImpor && this.isPermisoOrdenTipoCostoGastoImpor));
			this.jButtonNuevoRelacionesToolBarTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor && this.isPermisoNuevoTipoCostoGastoImpor));			
			this.jButtonNuevoGuardarCambiosToolBarTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaNuevoTipoCostoGastoImpor && this.isPermisoNuevoTipoCostoGastoImpor && this.isPermisoGuardarCambiosTipoCostoGastoImpor));			
			
			if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) {
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonModificarToolBarTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaModificarTipoCostoGastoImpor && this.isPermisoActualizarTipoCostoGastoImpor));	
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonActualizarToolBarTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaActualizarTipoCostoGastoImpor  && this.isPermisoActualizarTipoCostoGastoImpor));	
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonEliminarToolBarTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaEliminarTipoCostoGastoImpor && this.isPermisoEliminarTipoCostoGastoImpor));
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonCancelarToolBarTipoCostoGastoImpor.setVisible(this.isVisibilidadCeldaCancelarTipoCostoGastoImpor);				
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonGuardarCambiosToolBarTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaGuardarTipoCostoGastoImpor && this.isPermisoGuardarCambiosTipoCostoGastoImpor));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCostoGastoImpor && this.isPermisoGuardarCambiosTipoCostoGastoImpor));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaNuevoTipoCostoGastoImpor && this.isPermisoNuevoTipoCostoGastoImpor));			
			this.jMenuItemDuplicarTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaDuplicarTipoCostoGastoImpor && this.isPermisoDuplicarTipoCostoGastoImpor));			
			this.jMenuItemCopiarTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaCopiarTipoCostoGastoImpor && this.isPermisoCopiarTipoCostoGastoImpor));			
			this.jMenuItemVerFormTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaVerFormTipoCostoGastoImpor && this.isPermisoVerFormTipoCostoGastoImpor));			
			this.jMenuItemAbrirOrderByTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaOrdenTipoCostoGastoImpor && this.isPermisoOrdenTipoCostoGastoImpor));			
			//this.jMenuItemMostrarOcultarTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaOrdenTipoCostoGastoImpor && this.isPermisoOrdenTipoCostoGastoImpor));
			this.jMenuItemDetalleAbrirOrderByTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaOrdenTipoCostoGastoImpor && this.isPermisoOrdenTipoCostoGastoImpor));			
			//this.jMenuItemDetalleMostrarOcultarTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaOrdenTipoCostoGastoImpor && this.isPermisoOrdenTipoCostoGastoImpor));			
			this.jMenuItemNuevoRelacionesTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor && this.isPermisoNuevoTipoCostoGastoImpor));			
			this.jMenuItemNuevoGuardarCambiosTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaNuevoTipoCostoGastoImpor && this.isPermisoNuevoTipoCostoGastoImpor && this.isPermisoGuardarCambiosTipoCostoGastoImpor));									
			
			if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) {
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jMenuItemModificarTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaModificarTipoCostoGastoImpor && this.isPermisoActualizarTipoCostoGastoImpor));	
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jMenuItemActualizarTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaActualizarTipoCostoGastoImpor && this.isPermisoActualizarTipoCostoGastoImpor));	
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jMenuItemEliminarTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaEliminarTipoCostoGastoImpor && this.isPermisoEliminarTipoCostoGastoImpor));
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jMenuItemCancelarTipoCostoGastoImpor.setVisible(this.isVisibilidadCeldaCancelarTipoCostoGastoImpor);				
			}
			
			this.jMenuItemGuardarCambiosTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaGuardarTipoCostoGastoImpor && this.isPermisoGuardarCambiosTipoCostoGastoImpor));						
			this.jMenuItemGuardarCambiosTablaTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCostoGastoImpor && this.isPermisoGuardarCambiosTipoCostoGastoImpor));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoCostoGastoImpor=this.jButtonNuevoTipoCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaDuplicarTipoCostoGastoImpor=this.jButtonDuplicarTipoCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaCopiarTipoCostoGastoImpor=this.jButtonCopiarTipoCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaVerFormTipoCostoGastoImpor=this.jButtonVerFormTipoCostoGastoImpor.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoCostoGastoImpor=this.jButtonAbrirOrderByTipoCostoGastoImpor.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor=this.jButtonNuevoRelacionesTipoCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaModificarTipoCostoGastoImpor=this.jButtonModificarTipoCostoGastoImpor.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) {
			this.isVisibilidadCeldaActualizarTipoCostoGastoImpor=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonActualizarTipoCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaEliminarTipoCostoGastoImpor=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonEliminarTipoCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaCancelarTipoCostoGastoImpor=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonCancelarTipoCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaGuardarTipoCostoGastoImpor=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonGuardarCambiosTipoCostoGastoImpor.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoCostoGastoImpor=this.jButtonGuardarCambiosTablaTipoCostoGastoImpor.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoCostoGastoImpor=this.jButtonNuevoToolBarTipoCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor=this.jButtonNuevoRelacionesToolBarTipoCostoGastoImpor.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) {
			this.isVisibilidadCeldaModificarTipoCostoGastoImpor=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonModificarToolBarTipoCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaActualizarTipoCostoGastoImpor=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonActualizarToolBarTipoCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaEliminarTipoCostoGastoImpor=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonEliminarToolBarTipoCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaCancelarTipoCostoGastoImpor=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonCancelarToolBarTipoCostoGastoImpor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCostoGastoImpor=this.jButtonGuardarCambiosToolBarTipoCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCostoGastoImpor=this.jButtonGuardarCambiosTablaToolBarTipoCostoGastoImpor.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoCostoGastoImpor=this.jMenuItemNuevoTipoCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor=this.jMenuItemNuevoRelacionesTipoCostoGastoImpor.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) {
			this.isVisibilidadCeldaModificarTipoCostoGastoImpor=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jMenuItemModificarTipoCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaActualizarTipoCostoGastoImpor=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jMenuItemActualizarTipoCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaEliminarTipoCostoGastoImpor=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jMenuItemEliminarTipoCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaCancelarTipoCostoGastoImpor=this.jInternalFrameDetalleFormTipoCostoGastoImpor.jMenuItemCancelarTipoCostoGastoImpor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCostoGastoImpor=this.jMenuItemGuardarCambiosTipoCostoGastoImpor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCostoGastoImpor=this.jMenuItemGuardarCambiosTablaTipoCostoGastoImpor.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoCostoGastoImpor(Boolean esInicializar) {
		if(TipoCostoGastoImporJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocostogastoimporSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCostoGastoImpor();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoCostoGastoImpor(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoCostoGastoImpor() {
		this.jButtonNuevoTipoCostoGastoImpor.setVisible(this.isPermisoNuevoTipoCostoGastoImpor);			
		this.jButtonDuplicarTipoCostoGastoImpor.setVisible(this.isPermisoDuplicarTipoCostoGastoImpor);			
		this.jButtonCopiarTipoCostoGastoImpor.setVisible(this.isPermisoCopiarTipoCostoGastoImpor);			
		this.jButtonVerFormTipoCostoGastoImpor.setVisible(this.isPermisoVerFormTipoCostoGastoImpor);			
		
		this.jButtonAbrirOrderByTipoCostoGastoImpor.setVisible(this.isPermisoOrdenTipoCostoGastoImpor);					
		
		this.jButtonNuevoRelacionesTipoCostoGastoImpor.setVisible(this.isPermisoNuevoTipoCostoGastoImpor);			
		
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonModificarTipoCostoGastoImpor.setVisible(this.isPermisoActualizarTipoCostoGastoImpor);	
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonActualizarTipoCostoGastoImpor.setVisible(this.isPermisoActualizarTipoCostoGastoImpor);	
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonEliminarTipoCostoGastoImpor.setVisible(this.isPermisoEliminarTipoCostoGastoImpor);
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonCancelarTipoCostoGastoImpor.setVisible(this.isVisibilidadCeldaCancelarTipoCostoGastoImpor);						
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonGuardarCambiosTipoCostoGastoImpor.setVisible(this.isPermisoGuardarCambiosTipoCostoGastoImpor);							
		}
		
		this.jButtonGuardarCambiosTablaTipoCostoGastoImpor.setVisible(this.isPermisoActualizarTipoCostoGastoImpor);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCostoGastoImpor() {
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonModificarTipoCostoGastoImpor.setVisible(this.isPermisoActualizarTipoCostoGastoImpor);	
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonActualizarTipoCostoGastoImpor.setVisible(this.isPermisoActualizarTipoCostoGastoImpor);	
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonEliminarTipoCostoGastoImpor.setVisible(this.isPermisoEliminarTipoCostoGastoImpor);
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonCancelarTipoCostoGastoImpor.setVisible(this.isVisibilidadCeldaCancelarTipoCostoGastoImpor);							
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonGuardarCambiosTipoCostoGastoImpor.setVisible((this.isVisibilidadCeldaGuardarTipoCostoGastoImpor && this.isPermisoGuardarCambiosTipoCostoGastoImpor));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoCostoGastoImpor() {
		if(TipoCostoGastoImporJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoCostoGastoImpor();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoCostoGastoImpor() {
	}
	
	public void jTableDatosTipoCostoGastoImporListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoCostoGastoImpor(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoCostoGastoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostogastoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCostoGastoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCostoGastoImpor(this.gettipocostogastoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoGastoImpor(this.tipocostogastoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimpors.toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocostogastoimpor==null) {
						this.tipocostogastoimpor = new TipoCostoGastoImpor();
					}

					this.setVariablesFormularioToObjetoActualTipoCostoGastoImpor(this.tipocostogastoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoGastoImpor(this.tipocostogastoimpor);
				}

				if(this.tipocostogastoimpor.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocostogastoimpor.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCostoGastoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostogastoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostogastoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostogastoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoCostoGastoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostogastoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCostoGastoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCostoGastoImpor(this.gettipocostogastoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoGastoImpor(this.tipocostogastoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimpors.toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocostogastoimpor==null) {
						this.tipocostogastoimpor = new TipoCostoGastoImpor();
					}

					this.setVariablesFormularioToObjetoActualTipoCostoGastoImpor(this.tipocostogastoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoGastoImpor(this.tipocostogastoimpor);
				}

				if(this.tipocostogastoimpor.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipocostogastoimpor.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCostoGastoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostogastoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostogastoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostogastoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoCostoGastoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostogastoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCostoGastoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCostoGastoImpor(this.gettipocostogastoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoGastoImpor(this.tipocostogastoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimpors.toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocostogastoimpor==null) {
						this.tipocostogastoimpor = new TipoCostoGastoImpor();
					}

					this.setVariablesFormularioToObjetoActualTipoCostoGastoImpor(this.tipocostogastoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoGastoImpor(this.tipocostogastoimpor);
				}

				if(this.tipocostogastoimpor.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipocostogastoimpor.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCostoGastoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostogastoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostogastoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostogastoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoCostoGastoImpor() {
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) {
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.dispose();
			this.jInternalFrameDetalleFormTipoCostoGastoImpor=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoCostoGastoImpor!=null) {
			this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.dispose();
			this.jInternalFrameReporteDinamicoTipoCostoGastoImpor=null;
		}
		
		if(this.jInternalFrameImportacionTipoCostoGastoImpor!=null) {
			this.jInternalFrameImportacionTipoCostoGastoImpor.setVisible(false);	    			
			this.jInternalFrameImportacionTipoCostoGastoImpor.dispose();
			this.jInternalFrameImportacionTipoCostoGastoImpor=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoCostoGastoImpor();
			
			TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoCostoGastoImpor")) {
				jButtonNuevoTipoCostoGastoImporActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoCostoGastoImpor")) {
				jButtonDuplicarTipoCostoGastoImporActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoCostoGastoImpor")) {
				jButtonCopiarTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoCostoGastoImpor")) {
				jButtonVerFormTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoCostoGastoImpor")) {
				jButtonNuevoTipoCostoGastoImporActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoCostoGastoImpor")) {
				jButtonDuplicarTipoCostoGastoImporActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoCostoGastoImpor")) {
				jButtonNuevoTipoCostoGastoImporActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoCostoGastoImpor")) {
				jButtonDuplicarTipoCostoGastoImporActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoCostoGastoImpor")) {
				jButtonNuevoTipoCostoGastoImporActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoCostoGastoImpor")) {
				jButtonNuevoTipoCostoGastoImporActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoCostoGastoImpor")) {
				jButtonNuevoTipoCostoGastoImporActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoCostoGastoImpor")) {
				jButtonModificarTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoCostoGastoImpor")) {
				jButtonModificarTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoCostoGastoImpor")) {
				jButtonModificarTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoCostoGastoImpor")) {
				jButtonActualizarTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoCostoGastoImpor")) {
				jButtonActualizarTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoCostoGastoImpor")) {
				jButtonActualizarTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoCostoGastoImpor")) {
				jButtonEliminarTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoCostoGastoImpor")) {
				jButtonEliminarTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoCostoGastoImpor")) {
				jButtonEliminarTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoCostoGastoImpor")) {
				jButtonCancelarTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoCostoGastoImpor")) {
				jButtonCancelarTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoCostoGastoImpor")) {
				jButtonCancelarTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoCostoGastoImpor")) {
				jButtonCerrarTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoCostoGastoImpor")) {
				jButtonCerrarTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoCostoGastoImpor")) {
				jButtonCerrarTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoCostoGastoImpor")) {
				jButtonMostrarOcultarTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoCostoGastoImpor")) {
				jButtonCancelarTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoCostoGastoImpor")) {
				jButtonGuardarCambiosTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoCostoGastoImpor")) {
				jButtonGuardarCambiosTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoCostoGastoImpor")) {
				jButtonCopiarTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoCostoGastoImpor")) {
				jButtonVerFormTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoCostoGastoImpor")) {
				jButtonGuardarCambiosTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoCostoGastoImpor")) {
				jButtonCopiarTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoCostoGastoImpor")) {
				jButtonVerFormTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoCostoGastoImpor")) {
				jButtonGuardarCambiosTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoCostoGastoImpor")) {
				jButtonGuardarCambiosTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoCostoGastoImpor")) {
				jButtonGuardarCambiosTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoCostoGastoImpor")) {
				jButtonRecargarInformacionTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoCostoGastoImpor")) {
				jButtonRecargarInformacionTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoCostoGastoImpor")) {
				jButtonRecargarInformacionTipoCostoGastoImporActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoCostoGastoImpor")) {
				jButtonAnterioresTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoCostoGastoImpor")) {
				jButtonAnterioresTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoCostoGastoImpor")) {
				jButtonAnterioresTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoCostoGastoImpor")) {
				jButtonSiguientesTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoCostoGastoImpor")) {
				jButtonSiguientesTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoCostoGastoImpor")) {
				jButtonSiguientesTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoCostoGastoImpor") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoCostoGastoImpor")) {
				jButtonAbrirOrderByTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoCostoGastoImpor") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoCostoGastoImpor")) {
				jButtonMostrarOcultarTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCostoGastoImpor")) {
				jButtonNuevoGuardarCambiosTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoCostoGastoImpor")) {
				jButtonNuevoGuardarCambiosTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoCostoGastoImpor")) {
				jButtonNuevoGuardarCambiosTipoCostoGastoImporActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoCostoGastoImpor")) {
				jButtonCerrarReporteDinamicoTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoCostoGastoImpor")) {
				jButtonGenerarReporteDinamicoTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoCostoGastoImpor")) {
				
				jButtonGenerarExcelReporteDinamicoTipoCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoCostoGastoImpor")) {
				jButtonCerrarImportacionTipoCostoGastoImporActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoCostoGastoImpor")) {
				
				jButtonGenerarImportacionTipoCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoCostoGastoImpor")) {
				
				jButtonAbrirImportacionTipoCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoCostoGastoImpor")) {
				jComboBoxTiposAccionesTipoCostoGastoImporActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoCostoGastoImpor")) {
				jComboBoxTiposRelacionesTipoCostoGastoImporActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoCostoGastoImpor")) {
				jComboBoxTiposAccionesTipoCostoGastoImporActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoCostoGastoImpor")) {
				
				jComboBoxTiposSeleccionarTipoCostoGastoImporActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoCostoGastoImpor")) {
				jTextFieldValorCampoGeneralTipoCostoGastoImporActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoCostoGastoImpor")) {
				jButtonAbrirOrderByTipoCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoCostoGastoImpor")) {
				jButtonAbrirOrderByTipoCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoCostoGastoImpor")) {
				jButtonCerrarOrderByTipoCostoGastoImporActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCostoGastoImporBusqueda")) {
				this.jButtonidTipoCostoGastoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCostoGastoImporBusqueda")) {
				this.jButtoncodigoTipoCostoGastoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCostoGastoImporBusqueda")) {
				this.jButtonnombreTipoCostoGastoImporBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoCostoGastoImpor();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCostoGastoImporActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostogastoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocostogastoimpor);
				
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
				
				


				
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCostoGastoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCostoGastoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoCostoGastoImpor tipocostogastoimporLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocostogastoimporLocal=this.tipocostogastoimpor;
			} else {
				tipocostogastoimporLocal=this.tipocostogastoimporAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostogastoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocostogastoimpor);
				
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
							
				
				


				
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCostoGastoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCostoGastoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCostoGastoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCostoGastoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostogastoimporAnterior =(TipoCostoGastoImpor) this.tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocostogastoimporAnterior =(TipoCostoGastoImpor) this.tipocostogastoimpors.toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
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
			
			TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
			
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
			
			


			
			TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCostoGastoImporActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostogastoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocostogastoimpor);
				
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
								
						
				


				
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCostoGastoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCostoGastoImpor.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostogastoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocostogastoimpor);
				
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
								
				
				


				
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCostoGastoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCostoGastoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCostoGastoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCostoGastoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostogastoimporAnterior =(TipoCostoGastoImpor) this.tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocostogastoimporAnterior =(TipoCostoGastoImpor) this.tipocostogastoimpors.toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostogastoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocostogastoimpor);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCostoGastoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCostoGastoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostogastoimporAnterior =(TipoCostoGastoImpor) this.tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocostogastoimporAnterior =(TipoCostoGastoImpor) this.tipocostogastoimpors.toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCostoGastoImporActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostogastoimpor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocostogastoimpor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostogastoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocostogastoimpor);
				
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
							
				
				


				
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCostoGastoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCostoGastoImpor.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCostoGastoImporActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCostoGastoImpor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocostogastoimporAnterior =(TipoCostoGastoImpor) this.tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocostogastoimporAnterior =(TipoCostoGastoImpor) this.tipocostogastoimpors.toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
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
			
			TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
			
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
			
			


			
			TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCostoGastoImporActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostogastoimpor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocostogastoimpor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostogastoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocostogastoimpor);
				
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
								
				
				


				
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCostoGastoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCostoGastoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCostoGastoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCostoGastoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostogastoimporAnterior =(TipoCostoGastoImpor) this.tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocostogastoimporAnterior =(TipoCostoGastoImpor) this.tipocostogastoimpors.toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCostoGastoImporActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostogastoimpor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocostogastoimpor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCostoGastoImporActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostogastoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocostogastoimpor);
				
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoCostoGastoImpor")) {
					jCheckBoxSeleccionarTodosTipoCostoGastoImporItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoCostoGastoImpor")) {
					jCheckBoxSeleccionadosTipoCostoGastoImporItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoCostoGastoImpor")) {
					
				}
				
				


				
				
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCostoGastoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCostoGastoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostogastoimpor);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocostogastoimpor);
				
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
												
				
				


				
				
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCostoGastoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCostoGastoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCostoGastoImporActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCostoGastoImpor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocostogastoimporAnterior =(TipoCostoGastoImpor) this.tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocostogastoimporAnterior =(TipoCostoGastoImpor) this.tipocostogastoimpors.toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCostoGastoImporActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostogastoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocostogastoimpor);
				
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
				
				
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
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
			
			TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
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
			
			


			
			TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCostoGastoImporActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostogastoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocostogastoimpor);
				
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCostoGastoImpor.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCostoGastoImpor.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostogastoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocostogastoimpor);
				
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
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
				
				


				
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCostoGastoImpor.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCostoGastoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCostoGastoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCostoGastoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostogastoimporAnterior =(TipoCostoGastoImpor) this.tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocostogastoimporAnterior =(TipoCostoGastoImpor) this.tipocostogastoimpors.toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoCostoGastoImpor")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoCostoGastoImporListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoCostoGastoImpor.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocostogastoimpor =(TipoCostoGastoImpor) this.tipocostogastoimpors.toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocostogastoimpor);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoCostoGastoImpor")) {
				
				}
				
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoCostoGastoImpor")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoCostoGastoImpor.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoCostoGastoImpor")) {
			
			}
			
			TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoCostoGastoImpor();
			
			TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
			
			if(sTipo.equals("NuevoTipoCostoGastoImpor")) {
				jButtonNuevoTipoCostoGastoImporActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoCostoGastoImpor")) {
				jButtonDuplicarTipoCostoGastoImporActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoCostoGastoImpor")) {
				jButtonCopiarTipoCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoCostoGastoImpor")) {
				jButtonVerFormTipoCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoCostoGastoImpor")) {
				jButtonNuevoTipoCostoGastoImporActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoCostoGastoImpor")) {
				jButtonModificarTipoCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoCostoGastoImpor")) {
				jButtonActualizarTipoCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoCostoGastoImpor")) {
				jButtonEliminarTipoCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoCostoGastoImpor")) {
				jButtonGuardarCambiosTipoCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoCostoGastoImpor")) {
				jButtonCancelarTipoCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoCostoGastoImpor")) {
				jButtonCerrarTipoCostoGastoImporActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoCostoGastoImpor")) {
				jButtonGuardarCambiosTipoCostoGastoImporActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCostoGastoImpor")) {
				jButtonNuevoGuardarCambiosTipoCostoGastoImporActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoCostoGastoImpor")) {
				jButtonAbrirOrderByTipoCostoGastoImporActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoCostoGastoImpor")) {
				jButtonRecargarInformacionTipoCostoGastoImporActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoCostoGastoImpor")) {
				jButtonAnterioresTipoCostoGastoImporActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoCostoGastoImpor")) {
				jButtonSiguientesTipoCostoGastoImporActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCostoGastoImporBusqueda")) {
				this.jButtonidTipoCostoGastoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCostoGastoImporBusqueda")) {
				this.jButtoncodigoTipoCostoGastoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCostoGastoImporBusqueda")) {
				this.jButtonnombreTipoCostoGastoImporBusquedaActionPerformed(evt);
			}
			
			TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoCostoGastoImpor();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoCostoGastoImpor")) {
				closingInternalFrameTipoCostoGastoImpor();
				
			} else if(sTipo.equals("jButtonCancelarTipoCostoGastoImpor")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoCostoGastoImpor = (JInternalFrameBase)evt.getSource();
	            	
	            TipoCostoGastoImporBeanSwingJInternalFrame jInternalFrameParent=(TipoCostoGastoImporBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCostoGastoImpor.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoCostoGastoImporActionPerformed(null);
			}
			
			TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocostogastoimpor,new Object(),this.tipocostogastoimporParameterGeneral,this.tipocostogastoimporReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoCostoGastoImpor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoCostoGastoImpor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoCostoGastoImpor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocostogastoimpor)) {
			if(!esControlTabla) {
				if(TipoCostoGastoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoCostoGastoImpor(this.tipocostogastoimpor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoGastoImpor(this.tipocostogastoimpor);			
				}
				
				if(this.tipocostogastoimporSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoCostoGastoImpor(this.tipocostogastoimpor,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocostogastoimporReturnGeneral=tipocostogastoimporLogic.procesarEventosTipoCostoGastoImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocostogastoimporLogic.getTipoCostoGastoImpors(),this.tipocostogastoimpor,this.tipocostogastoimporParameterGeneral,this.isEsNuevoTipoCostoGastoImpor,classes);//this.tipocostogastoimporLogic.getTipoCostoGastoImpor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoCostoGastoImpor(this.tipocostogastoimporReturnGeneral,this.tipocostogastoimporBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocostogastoimporSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoCostoGastoImpor(classes,this.tipocostogastoimporReturnGeneral,this.tipocostogastoimporBean,false);
					}
						
					if(this.tipocostogastoimporReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoCostoGastoImpor(this.tipocostogastoimporReturnGeneral.getTipoCostoGastoImpor());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoCostoGastoImpor(this.tipocostogastoimporReturnGeneral.getTipoCostoGastoImpor());	
					}
						
					if(this.tipocostogastoimporReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoCostoGastoImpor(this.tipocostogastoimporReturnGeneral.getTipoCostoGastoImpor(),classes);//this.tipocostogastoimporBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoCostoGastoImpor(this.tipocostogastoimpor,classes);//this.tipocostogastoimporBean);									
				}
			
				if(TipoCostoGastoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoCostoGastoImpor(this.tipocostogastoimpor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoGastoImpor(this.tipocostogastoimpor);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocostogastoimporAnterior!=null) {
						this.tipocostogastoimpor=this.tipocostogastoimporAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocostogastoimporReturnGeneral=tipocostogastoimporLogic.procesarEventosTipoCostoGastoImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocostogastoimporLogic.getTipoCostoGastoImpors(),this.tipocostogastoimpor,this.tipocostogastoimporParameterGeneral,this.isEsNuevoTipoCostoGastoImpor,classes);//this.tipocostogastoimporLogic.getTipoCostoGastoImpor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocostogastoimporSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocostogastoimporSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocostogastoimporReturnGeneral.getTipoCostoGastoImpor(),tipocostogastoimporLogic.getTipoCostoGastoImpors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocostogastoimporReturnGeneral.getTipoCostoGastoImpor(),this.tipocostogastoimpors);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoCostoGastoImpor.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoCostoGastoImpor.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoCostoGastoImpor();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoCostoGastoImpor() throws Exception {
		
		TipoCostoGastoImporModel tipocostogastoimporModel=(TipoCostoGastoImporModel)this.jTableDatosTipoCostoGastoImpor.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocostogastoimporModel.tipocostogastoimpors=this.tipocostogastoimporLogic.getTipoCostoGastoImpors();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocostogastoimporModel.tipocostogastoimpors=this.tipocostogastoimpors;
		}
		
		
		((TipoCostoGastoImporModel) this.jTableDatosTipoCostoGastoImpor.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoCostoGastoImpor() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocostogastoimporAnterior(),this.tipocostogastoimporLogic.getTipoCostoGastoImpors());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocostogastoimporAnterior(),this.tipocostogastoimpors);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoCostoGastoImpor();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoCostoGastoImpor(TipoCostoGastoImpor tipocostogastoimpor,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
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
										
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocostogastoimpor,new Object(),generalEntityParameterGeneral,this.tipocostogastoimporReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocostogastoimporSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoCostoGastoImporConstantesFunciones.getClassesRelationshipsOfTipoCostoGastoImpor(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoCostoGastoImporConstantesFunciones.getClassesRelationshipsFromStringsOfTipoCostoGastoImpor(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoCostoGastoImpor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoCostoGastoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocostogastoimpor,new Object(),generalEntityParameterGeneral,this.tipocostogastoimporReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoCostoGastoImpor(TipoCostoGastoImporBean tipocostogastoimporBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoCostoGastoImpor(ArrayList<Classe> classes,TipoCostoGastoImporReturnGeneral tipocostogastoimporReturnGeneral,TipoCostoGastoImporBean tipocostogastoimporBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoCostoGastoImpor(TipoCostoGastoImpor tipocostogastoimpor,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipocostogastoimpor)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoCostoGastoImpor = new TipoCostoGastoImporDetalleFormJInternalFrame(jDesktopPane,this.tipocostogastoimporSessionBean.getConGuardarRelaciones(),this.tipocostogastoimporSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCostoGastoImpor);
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.setVisible(false);
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.tipocostogastoimporLogic=this.tipocostogastoimporLogic;
		
		this.cargarCombosFrameForeignKeyTipoCostoGastoImpor("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCostoGastoImpor();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCostoGastoImpor();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoCostoGastoImpor("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoCostoGastoImpor();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCostoGastoImpor"));
		
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonModificarTipoCostoGastoImpor.addActionListener(new ButtonActionListener(this,"ModificarTipoCostoGastoImpor"));

		
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonModificarToolBarTipoCostoGastoImpor.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCostoGastoImpor"));
					
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jMenuItemModificarTipoCostoGastoImpor.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCostoGastoImpor"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonActualizarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"ActualizarTipoCostoGastoImpor"));
		
		
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonActualizarToolBarTipoCostoGastoImpor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCostoGastoImpor"));
						
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jMenuItemActualizarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCostoGastoImpor"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonEliminarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"EliminarTipoCostoGastoImpor"));
		
		
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonEliminarToolBarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCostoGastoImpor"));
								
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jMenuItemEliminarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCostoGastoImpor"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonCancelarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"CancelarTipoCostoGastoImpor"));
		
		
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonCancelarToolBarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCostoGastoImpor"));
					
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jMenuItemCancelarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCostoGastoImpor"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jMenuItemDetalleCerrarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCostoGastoImpor"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonGuardarCambiosToolBarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCostoGastoImpor"));
		
		
		
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonGuardarCambiosToolBarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCostoGastoImpor"));
		
		
		
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jComboBoxTiposAccionesFormularioTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCostoGastoImpor"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonidTipoCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtoncodigoTipoCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonnombreTipoCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCostoGastoImporBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTabbedPaneRelacionesTipoCostoGastoImpor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCostoGastoImpor"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoCostoGastoImpor"));
		
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCostoGastoImpor"));
		}
		
		this.jTableDatosTipoCostoGastoImpor.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoCostoGastoImpor"));
		
		this.jTableDatosTipoCostoGastoImpor.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoCostoGastoImpor"));
		
		this.jButtonNuevoTipoCostoGastoImpor.addActionListener(new ButtonActionListener(this,"NuevoTipoCostoGastoImpor"));
		
		this.jButtonDuplicarTipoCostoGastoImpor.addActionListener(new ButtonActionListener(this,"DuplicarTipoCostoGastoImpor"));
		
		this.jButtonCopiarTipoCostoGastoImpor.addActionListener(new ButtonActionListener(this,"CopiarTipoCostoGastoImpor"));
		
		this.jButtonVerFormTipoCostoGastoImpor.addActionListener(new ButtonActionListener(this,"VerFormTipoCostoGastoImpor"));
		
		
		this.jButtonNuevoToolBarTipoCostoGastoImpor.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoCostoGastoImpor"));
			
		this.jButtonDuplicarToolBarTipoCostoGastoImpor.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoCostoGastoImpor"));
			
		this.jMenuItemNuevoTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoCostoGastoImpor"));
			
		this.jMenuItemDuplicarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoCostoGastoImpor"));		
		
		
		this.jButtonNuevoRelacionesTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoCostoGastoImpor"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoCostoGastoImpor.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoCostoGastoImpor"));
			
		this.jMenuItemNuevoRelacionesTipoCostoGastoImpor.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoCostoGastoImpor"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonModificarTipoCostoGastoImpor.addActionListener(new ButtonActionListener(this,"ModificarTipoCostoGastoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonModificarToolBarTipoCostoGastoImpor.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCostoGastoImpor"));
			
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jMenuItemModificarTipoCostoGastoImpor.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCostoGastoImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonActualizarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"ActualizarTipoCostoGastoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonActualizarToolBarTipoCostoGastoImpor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCostoGastoImpor"));
				
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jMenuItemActualizarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCostoGastoImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonEliminarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"EliminarTipoCostoGastoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonEliminarToolBarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCostoGastoImpor"));
						
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jMenuItemEliminarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCostoGastoImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonCancelarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"CancelarTipoCostoGastoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonCancelarToolBarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCostoGastoImpor"));
			
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jMenuItemCancelarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCostoGastoImpor"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoCostoGastoImpor"));		
		
		
		this.jButtonCerrarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"CerrarTipoCostoGastoImpor"));
		
		
		this.jButtonCerrarToolBarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoCostoGastoImpor"));
			
		this.jMenuItemCerrarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoCostoGastoImpor"));
			
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jMenuItemDetalleCerrarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCostoGastoImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonGuardarCambiosTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoCostoGastoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonGuardarCambiosToolBarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCostoGastoImpor"));
		}
		
		this.jButtonCopiarToolBarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoCostoGastoImpor"));
			
		this.jButtonVerFormToolBarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoCostoGastoImpor"));
		
		this.jMenuItemGuardarCambiosTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoCostoGastoImpor"));
			
		this.jMenuItemCopiarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoCostoGastoImpor"));		
		
		this.jMenuItemVerFormTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoCostoGastoImpor"));		
		
		
		this.jButtonGuardarCambiosTablaTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCostoGastoImpor"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoCostoGastoImpor"));
			
		this.jMenuItemGuardarCambiosTablaTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCostoGastoImpor"));		
		
		
		
		this.jButtonRecargarInformacionTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoCostoGastoImpor"));
					
		this.jButtonRecargarInformacionToolBarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoCostoGastoImpor"));
		
		this.jMenuItemRecargarInformacionTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoCostoGastoImpor"));		
		
		
		
		this.jButtonAnterioresTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"AnterioresTipoCostoGastoImpor"));
		
		
		this.jButtonAnterioresToolBarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoCostoGastoImpor"));
		
		this.jMenuItemAnterioresTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoCostoGastoImpor"));		
		
		
		this.jButtonSiguientesTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"SiguientesTipoCostoGastoImpor"));
		
		
		this.jButtonSiguientesToolBarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoCostoGastoImpor"));
			
		this.jMenuItemSiguientesTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoCostoGastoImpor"));
			
		this.jMenuItemAbrirOrderByTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoCostoGastoImpor"));
			
		this.jMenuItemMostrarOcultarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoCostoGastoImpor"));
			
		this.jMenuItemDetalleAbrirOrderByTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoCostoGastoImpor"));
			
		this.jMenuItemDetalleMostarOcultarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoCostoGastoImpor"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoCostoGastoImpor"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoCostoGastoImpor"));
			
		this.jMenuItemNuevoGuardarCambiosTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoCostoGastoImpor"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoCostoGastoImpor.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoCostoGastoImpor"));

		this.jCheckBoxSeleccionadosTipoCostoGastoImpor.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoCostoGastoImpor"));
		
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jComboBoxTiposAccionesFormularioTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCostoGastoImpor"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoCostoGastoImpor"));
			
		this.jComboBoxTiposAccionesTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoCostoGastoImpor"));
					
		this.jComboBoxTiposSeleccionarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoCostoGastoImpor"));
			
		this.jTextFieldValorCampoGeneralTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoCostoGastoImpor"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonidTipoCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtoncodigoTipoCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonnombreTipoCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCostoGastoImporBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoCostoGastoImpor!=null) {
				this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCostoGastoImpor"));
				this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCostoGastoImpor"));
				this.jInternalFrameReporteDinamicoTipoCostoGastoImpor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCostoGastoImpor"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCostoGastoImpor"));				
			//this.jButtonGenerarReporteDinamicoTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCostoGastoImpor"));
			//this.jButtonGenerarExcelReporteDinamicoTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCostoGastoImpor"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoCostoGastoImpor!=null) {
				this.jInternalFrameImportacionTipoCostoGastoImpor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCostoGastoImpor"));
				this.jInternalFrameImportacionTipoCostoGastoImpor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCostoGastoImpor"));
				this.jInternalFrameImportacionTipoCostoGastoImpor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCostoGastoImpor"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoCostoGastoImpor"));
			
			this.jButtonAbrirOrderByToolBarTipoCostoGastoImpor.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoCostoGastoImpor"));			
			
			if(this.jInternalFrameOrderByTipoCostoGastoImpor!=null) {
				this.jInternalFrameOrderByTipoCostoGastoImpor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCostoGastoImpor"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTabbedPaneRelacionesTipoCostoGastoImpor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCostoGastoImpor"));
		
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
            		closingInternalFrameTipoCostoGastoImpor();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoCostoGastoImpor = (JInternalFrameBase)event.getSource();
	            	
	            TipoCostoGastoImporBeanSwingJInternalFrame jInternalFrameParent=(TipoCostoGastoImporBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCostoGastoImpor.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoCostoGastoImporActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoCostoGastoImpor.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoCostoGastoImporListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoCostoGastoImpor.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoCostoGastoImpor.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCostoGastoImporActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCostoGastoImporActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCostoGastoImporActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoCostoGastoImpor";
		inputMap = this.jButtonNuevoTipoCostoGastoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoCostoGastoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCostoGastoImporActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCostoGastoImporActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCostoGastoImporActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCostoGastoImporActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoCostoGastoImpor";
		inputMap = this.jButtonNuevoRelacionesTipoCostoGastoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoCostoGastoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCostoGastoImporActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoCostoGastoImpor";
		inputMap = this.jButtonModificarTipoCostoGastoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoCostoGastoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoCostoGastoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoCostoGastoImpor";
		inputMap = this.jButtonActualizarTipoCostoGastoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoCostoGastoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoCostoGastoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoCostoGastoImpor";
		inputMap = this.jButtonEliminarTipoCostoGastoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoCostoGastoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoCostoGastoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoCostoGastoImpor";
		inputMap = this.jButtonCancelarTipoCostoGastoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoCostoGastoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoCostoGastoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoCostoGastoImpor";
		inputMap = this.jButtonCerrarTipoCostoGastoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoCostoGastoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoCostoGastoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonGuardarCambiosTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoCostoGastoImpor";
		inputMap = this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonGuardarCambiosTipoCostoGastoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonGuardarCambiosTipoCostoGastoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoCostoGastoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoCostoGastoImpor.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoCostoGastoImporItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoCostoGastoImpor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoCostoGastoImporActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoCostoGastoImpor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoCostoGastoImporActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoCostoGastoImpor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoCostoGastoImporActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonidTipoCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtoncodigoTipoCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCostoGastoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jButtonnombreTipoCostoGastoImporBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCostoGastoImporBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoCostoGastoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoCostoGastoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoCostoGastoImporActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoCostoGastoImpor.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoCostoGastoImpor(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoCostoGastoImpor tipocostogastoimporAux:this.tipocostogastoimporLogic.getTipoCostoGastoImpors()) {
					tipocostogastoimporAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCostoGastoImpor tipocostogastoimporAux:tipocostogastoimpors) {
					tipocostogastoimporAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoCostoGastoImporItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCostoGastoImpor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCostoGastoImpor tipocostogastoimporAux:this.tipocostogastoimporLogic.getTipoCostoGastoImpors()) {
						tipocostogastoimporAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCostoGastoImpor tipocostogastoimporAux:tipocostogastoimpors) {
						tipocostogastoimporAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoCostoGastoImpor tipocostogastoimporAux:this.tipocostogastoimporLogic.getTipoCostoGastoImpors()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCostoGastoImpor tipocostogastoimporAux:tipocostogastoimpors) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCostoGastoImpor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCostoGastoImpor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCostoGastoImpor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCostoGastoImpor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoCostoGastoImporItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCostoGastoImpor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoCostoGastoImpor.getSelectedRows();
			
			TipoCostoGastoImpor tipocostogastoimporLocal=new TipoCostoGastoImpor();
			
			//this.seleccionarTodosTipoCostoGastoImpor(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocostogastoimporLocal =(TipoCostoGastoImpor) this.tipocostogastoimporLogic.getTipoCostoGastoImpors().toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocostogastoimporLocal =(TipoCostoGastoImpor) this.tipocostogastoimpors.toArray()[this.jTableDatosTipoCostoGastoImpor.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocostogastoimporLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCostoGastoImpor tipocostogastoimporAux:this.tipocostogastoimporLogic.getTipoCostoGastoImpors()) {
						tipocostogastoimporAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCostoGastoImpor tipocostogastoimporAux:tipocostogastoimpors) {
						tipocostogastoimporAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoCostoGastoImpor(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCostoGastoImpor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCostoGastoImpor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCostoGastoImpor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoCostoGastoImporItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoCostoGastoImporParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoCostoGastoImporActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoCostoGastoImpor(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoCostoGastoImpor.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCostoGastoImpor tipocostogastoimporAux:this.tipocostogastoimporLogic.getTipoCostoGastoImpors()) {
				
						if(sTipoSeleccionar.equals(TipoCostoGastoImporConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocostogastoimporAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCostoGastoImporConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocostogastoimporAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCostoGastoImpor tipocostogastoimporAux:tipocostogastoimpors) {
					
						if(sTipoSeleccionar.equals(TipoCostoGastoImporConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocostogastoimporAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCostoGastoImporConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocostogastoimporAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCostoGastoImpor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoCostoGastoImporActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoCostoGastoImpor(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoCostoGastoImpor=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoCostoGastoImpor.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoCostoGastoImpor.jComboBoxTiposAccionesFormularioTipoCostoGastoImpor.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoCostoGastoImpor) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoCostoGastoImpor(conSplash);
				
					this.generarReporteTipoCostoGastoImporsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCostoGastoImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCostoGastoImpor.jComboBoxTiposAccionesFormularioTipoCostoGastoImpor.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoCostoGastoImporsSeleccionados();
				//this.jComboBoxTiposAccionesTipoCostoGastoImpor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCostoGastoImporsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoCostoGastoImpor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCostoGastoImporsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoCostoGastoImpor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCostoGastoImpor();
				
				this.exportarTipoCostoGastoImporsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCostoGastoImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCostoGastoImpor.jComboBoxTiposAccionesFormularioTipoCostoGastoImpor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoCostoGastoImpors();
				//this.importarTipoCostoGastoImpors();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCostoGastoImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCostoGastoImpor.jComboBoxTiposAccionesFormularioTipoCostoGastoImpor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCostoGastoImpor();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoCostoGastoImporsSeleccionados();
				//this.jComboBoxTiposAccionesTipoCostoGastoImpor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Costo Gasto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoCostoGastoImpor();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoCostoGastoImpor)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoCostoGastoImpor(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Costo Gasto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCostoGastoImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCostoGastoImpor.jComboBoxTiposAccionesFormularioTipoCostoGastoImpor.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoCostoGastoImpor();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoCostoGastoImpor(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoCostoGastoImporActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoCostoGastoImpor();
			
			if(this.jInternalFrameDetalleFormTipoCostoGastoImpor==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoCostoGastoImpor> tipocostogastoimporsSeleccionados=new ArrayList<TipoCostoGastoImpor>();		
			TipoCostoGastoImpor tipocostogastoimpor=new TipoCostoGastoImpor();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoCostoGastoImpor(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoCostoGastoImpor.getSelectedItem();
			
			
			
			
			tipocostogastoimporsSeleccionados=this.getTipoCostoGastoImporsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocostogastoimporsSeleccionados.size()==1) {
				for(TipoCostoGastoImpor tipocostogastoimporAux:tipocostogastoimporsSeleccionados) {
					tipocostogastoimpor=tipocostogastoimporAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoCostoGastoImpor();
			
      		//this.finishProcessTipoCostoGastoImpor(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoCostoGastoImporReturnGeneral() throws Exception {
		if(this.tipocostogastoimporReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocostogastoimporReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocostogastoimporReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocostogastoimporReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocostogastoimporReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocostogastoimporReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoCostoGastoImpor(false);
		}
		
		if(this.tipocostogastoimporReturnGeneral.getConRetornoLista() || this.tipocostogastoimporReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocostogastoimporReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocostogastoimporLogic.setTipoCostoGastoImpors(this.tipocostogastoimporReturnGeneral.getTipoCostoGastoImpors());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocostogastoimporReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocostogastoimporLogic.setTipoCostoGastoImpor(this.tipocostogastoimporReturnGeneral.getTipoCostoGastoImpor());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoCostoGastoImpor(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoCostoGastoImpor() throws Exception {
		
		
	}
	
	public ArrayList<TipoCostoGastoImpor> getTipoCostoGastoImporsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoCostoGastoImpor> tipocostogastoimporsSeleccionados=new ArrayList<TipoCostoGastoImpor>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoCostoGastoImpor) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoCostoGastoImpor tipocostogastoimporAux:tipocostogastoimporLogic.getTipoCostoGastoImpors()) {
					if(tipocostogastoimporAux.getIsSelected()) {
						tipocostogastoimporsSeleccionados.add(tipocostogastoimporAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCostoGastoImpor tipocostogastoimporAux:this.tipocostogastoimpors) {
					if(tipocostogastoimporAux.getIsSelected()) {
						tipocostogastoimporsSeleccionados.add(tipocostogastoimporAux);				
					}
				}
			}
			
			if(tipocostogastoimporsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocostogastoimporsSeleccionados.addAll(this.tipocostogastoimporLogic.getTipoCostoGastoImpors());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocostogastoimporsSeleccionados.addAll(this.tipocostogastoimpors);				
					}
				}
			}
		} else {
			tipocostogastoimporsSeleccionados.add(this.tipocostogastoimpor);
		}
		
		return tipocostogastoimporsSeleccionados;
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
	
	public void generarReporteTipoCostoGastoImporsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoCostoGastoImporsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoCostoGastoImporsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCostoGastoImporsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCostoGastoImporsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Costo Gasto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoCostoGastoImporsSeleccionados() throws Exception {
		ArrayList<TipoCostoGastoImpor> tipocostogastoimporsSeleccionados=new ArrayList<TipoCostoGastoImpor>();		
		
		tipocostogastoimporsSeleccionados=this.getTipoCostoGastoImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoCostoGastoImpors("Todos",tipocostogastoimporsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoCostoGastoImporsSeleccionados() throws Exception {
		ArrayList<TipoCostoGastoImpor> tipocostogastoimporsSeleccionados=new ArrayList<TipoCostoGastoImpor>();		
		
		tipocostogastoimporsSeleccionados=this.getTipoCostoGastoImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoCostoGastoImpors("Todos",tipocostogastoimporsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoCostoGastoImporsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoCostoGastoImpor> tipocostogastoimporsSeleccionados=new ArrayList<TipoCostoGastoImpor>();
		
		tipocostogastoimporsSeleccionados=this.getTipoCostoGastoImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoCostoGastoImpors("Todos",tipocostogastoimporsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoCostoGastoImporsSeleccionados() throws Exception {
		ArrayList<TipoCostoGastoImpor> tipocostogastoimporsSeleccionados=new ArrayList<TipoCostoGastoImpor>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoCostoGastoImpor();
		
		
		tipocostogastoimporsSeleccionados=this.getTipoCostoGastoImporsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoCostoGastoImpor();
		
		
		//this.generarReporteTipoCostoGastoImpors("Todos",tipocostogastoimporsSeleccionados ,tipocostogastoimporImplementable,tipocostogastoimporImplementableHome);
	}
	
	public void mostrarImportacionTipoCostoGastoImpors() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoCostoGastoImpor();
		
		this.abrirFrameImportacionTipoCostoGastoImpor();		
		
			
		//this.generarReporteTipoCostoGastoImpors("Todos",tipocostogastoimporsSeleccionados ,tipocostogastoimporImplementable,tipocostogastoimporImplementableHome);
	}
	
	public void importarTipoCostoGastoImpors() throws Exception {		
	
	}
	
	public void exportarTipoCostoGastoImporsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoCostoGastoImporsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoCostoGastoImporsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoCostoGastoImporsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Costo Gasto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoCostoGastoImporsSeleccionados() throws Exception {
		ArrayList<TipoCostoGastoImpor> tipocostogastoimporsSeleccionados=new ArrayList<TipoCostoGastoImpor>();		
		
		tipocostogastoimporsSeleccionados=this.getTipoCostoGastoImporsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocostogastoimpor."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoCostoGastoImpor(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoCostoGastoImpor tipocostogastoimporAux:tipocostogastoimporsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoCostoGastoImpor(tipocostogastoimporAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocostogastoimporAux.setsDetalleGeneralEntityReporte(tipocostogastoimporAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo Gasto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoCostoGastoImpor(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoCostoGastoImporConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCostoGastoImporConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCostoGastoImporConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCostoGastoImporConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoCostoGastoImpor(TipoCostoGastoImpor tipocostogastoimpor,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocostogastoimpor.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocostogastoimpor.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocostogastoimpor.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocostogastoimpor.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoCostoGastoImporsSeleccionados() throws Exception {
		ArrayList<TipoCostoGastoImpor> tipocostogastoimporsSeleccionados=new ArrayList<TipoCostoGastoImpor>();		
		
		tipocostogastoimporsSeleccionados=this.getTipoCostoGastoImporsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocostogastoimpor.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoCostoGastoImpors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoCostoGastoImpor(row);				
				iRow++;
			}				
			
			for(TipoCostoGastoImpor tipocostogastoimporAux:tipocostogastoimporsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoCostoGastoImpor(tipocostogastoimporAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo Gasto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoCostoGastoImporsSeleccionados() throws Exception {
		ArrayList<TipoCostoGastoImpor> tipocostogastoimporsSeleccionados=new ArrayList<TipoCostoGastoImpor>();		
		
		tipocostogastoimporsSeleccionados=this.getTipoCostoGastoImporsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocostogastoimpor.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocostogastoimpors");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocostogastoimpor");
			//elementRoot.appendChild(element);
		
			for(TipoCostoGastoImpor tipocostogastoimporAux:tipocostogastoimporsSeleccionados) {
				element = document.createElement("tipocostogastoimpor");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoCostoGastoImpor(tipocostogastoimporAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo Gasto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoCostoGastoImpor(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCostoGastoImporConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCostoGastoImporConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoCostoGastoImporConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCostoGastoImporConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoCostoGastoImpor(TipoCostoGastoImpor tipocostogastoimpor,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocostogastoimpor.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocostogastoimpor.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocostogastoimpor.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoCostoGastoImpor(TipoCostoGastoImpor tipocostogastoimpor,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoCostoGastoImporConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocostogastoimpor.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoCostoGastoImporConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocostogastoimpor.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoCostoGastoImporConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipocostogastoimpor.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoCostoGastoImporConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipocostogastoimpor.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoCostoGastoImporsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoCostoGastoImpor> tipocostogastoimporsSeleccionados=new ArrayList<TipoCostoGastoImpor>();
		
		tipocostogastoimporsSeleccionados=this.getTipoCostoGastoImporsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoCostoGastoImpor(tipocostogastoimporsSeleccionados);
		
		this.generarReporteTipoCostoGastoImpors("Todos",tipocostogastoimporsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoCostoGastoImpor(ArrayList<TipoCostoGastoImpor> tipocostogastoimporsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoCostoGastoImpor tipocostogastoimporAux:tipocostogastoimporsSeleccionados) {
				tipocostogastoimporAux.setsDetalleGeneralEntityReporte(tipocostogastoimporAux.toString());
			
				if(sTipoSeleccionar.equals(TipoCostoGastoImporConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipocostogastoimporAux.setsDescripcionGeneralEntityReporte1(tipocostogastoimporAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoCostoGastoImporConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipocostogastoimporAux.setsDescripcionGeneralEntityReporte1(tipocostogastoimporAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoGastoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoCostoGastoImpor(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoCostoGastoImpor=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor=true;
				this.isVisibilidadCeldaGuardarCambiosTipoCostoGastoImpor=true;
			}
			
			this.isVisibilidadCeldaModificarTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaActualizarTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaEliminarTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaCancelarTipoCostoGastoImpor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCostoGastoImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCostoGastoImpor=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaModificarTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaActualizarTipoCostoGastoImpor=true;
			this.isVisibilidadCeldaEliminarTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaCancelarTipoCostoGastoImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCostoGastoImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCostoGastoImpor=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaModificarTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaActualizarTipoCostoGastoImpor=true;
			this.isVisibilidadCeldaEliminarTipoCostoGastoImpor=true;
			this.isVisibilidadCeldaCancelarTipoCostoGastoImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCostoGastoImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCostoGastoImpor=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaModificarTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaActualizarTipoCostoGastoImpor=true;
			this.isVisibilidadCeldaEliminarTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaCancelarTipoCostoGastoImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCostoGastoImpor=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCostoGastoImpor=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoCostoGastoImpor=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCostoGastoImpor=true;
			this.isVisibilidadCeldaModificarTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaActualizarTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaEliminarTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaCancelarTipoCostoGastoImpor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCostoGastoImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCostoGastoImpor=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaActualizarTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaEliminarTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaCancelarTipoCostoGastoImpor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCostoGastoImpor=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCostoGastoImpor=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaModificarTipoCostoGastoImpor=true;
			this.isVisibilidadCeldaActualizarTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaEliminarTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaCancelarTipoCostoGastoImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCostoGastoImpor=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCostoGastoImpor=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoCostoGastoImporJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoCostoGastoImpor=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCostoGastoImpor=true;
		} else {
			this.actualizarEstadoPanelsTipoCostoGastoImpor(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoCostoGastoImpor=false;
			//this.isVisibilidadCeldaVerFormTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaDuplicarTipoCostoGastoImpor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocostogastoimporSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCostoGastoImpor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
			if(!tipocostogastoimporSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor=false;												
			}
			
			this.jButtonCerrarTipoCostoGastoImpor.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoGastoImpor=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocostogastoimpor)) {
			this.isVisibilidadCeldaActualizarTipoCostoGastoImpor=false;
			this.isVisibilidadCeldaEliminarTipoCostoGastoImpor=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCostoGastoImpor() {
	}
	
	public void actualizarEstadoPanelsTipoCostoGastoImpor(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoCostoGastoImpor!=null) {
				this.jScrollPanelDatosEdicionTipoCostoGastoImpor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCostoGastoImpor!=null) {
				this.jScrollPanelDatosTipoCostoGastoImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCostoGastoImpor!=null) {
				this.jPanelPaginacionTipoCostoGastoImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCostoGastoImpor!=null) {
				this.jPanelParametrosReportesTipoCostoGastoImpor.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoCostoGastoImpor!=null) {
				this.jScrollPanelDatosEdicionTipoCostoGastoImpor.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoCostoGastoImpor!=null) {
				this.jScrollPanelDatosTipoCostoGastoImpor.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCostoGastoImpor!=null) {
				this.jPanelPaginacionTipoCostoGastoImpor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCostoGastoImpor!=null) {
				this.jPanelParametrosReportesTipoCostoGastoImpor.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoCostoGastoImpor!=null) {
				this.jScrollPanelDatosEdicionTipoCostoGastoImpor.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoCostoGastoImpor!=null) {
				this.jScrollPanelDatosTipoCostoGastoImpor.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCostoGastoImpor!=null) {
				this.jPanelPaginacionTipoCostoGastoImpor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCostoGastoImpor!=null) {
				this.jPanelParametrosReportesTipoCostoGastoImpor.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoCostoGastoImpor!=null) {
				this.jScrollPanelDatosEdicionTipoCostoGastoImpor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCostoGastoImpor!=null) {
				this.jScrollPanelDatosTipoCostoGastoImpor.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCostoGastoImpor!=null) {
				this.jPanelPaginacionTipoCostoGastoImpor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCostoGastoImpor!=null) {
				this.jPanelParametrosReportesTipoCostoGastoImpor.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoCostoGastoImpor!=null) {
				this.jScrollPanelDatosEdicionTipoCostoGastoImpor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCostoGastoImpor!=null) {
				this.jScrollPanelDatosTipoCostoGastoImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCostoGastoImpor!=null) {
				this.jPanelPaginacionTipoCostoGastoImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCostoGastoImpor!=null) {
				this.jPanelParametrosReportesTipoCostoGastoImpor.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoCostoGastoImpor!=null) {
				this.jScrollPanelDatosEdicionTipoCostoGastoImpor.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoCostoGastoImpor!=null) {
				this.jScrollPanelDatosTipoCostoGastoImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCostoGastoImpor!=null) {
				this.jPanelPaginacionTipoCostoGastoImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCostoGastoImpor!=null) {
				this.jPanelParametrosReportesTipoCostoGastoImpor.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoCostoGastoImpor!=null) {
				this.jScrollPanelDatosEdicionTipoCostoGastoImpor.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoCostoGastoImpor!=null) {
				this.jScrollPanelDatosTipoCostoGastoImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCostoGastoImpor!=null) {
				this.jPanelPaginacionTipoCostoGastoImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCostoGastoImpor!=null) {
				this.jPanelParametrosReportesTipoCostoGastoImpor.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocostogastoimporSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoCostoGastoImporSessionBean tipocostogastoimporSessionBean=new TipoCostoGastoImporSessionBean();
		
		if(this.tipocostogastoimporSessionBean==null) {
			this.tipocostogastoimporSessionBean=new TipoCostoGastoImporSessionBean();
		}
		
		this.tipocostogastoimporSessionBean.setsUltimaBusquedaTipoCostoGastoImpor(this.getsAccionBusqueda());
		this.tipocostogastoimporSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocostogastoimporSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoCostoGastoImporSessionBean tipocostogastoimporSessionBean=new TipoCostoGastoImporSessionBean();
		
		if(this.tipocostogastoimporSessionBean==null) {
			this.tipocostogastoimporSessionBean=new TipoCostoGastoImporSessionBean();
		}
		
		if(this.tipocostogastoimporSessionBean.getsUltimaBusquedaTipoCostoGastoImpor()!=null&&!this.tipocostogastoimporSessionBean.getsUltimaBusquedaTipoCostoGastoImpor().equals("")) {
			this.setsAccionBusqueda(tipocostogastoimporSessionBean.getsUltimaBusquedaTipoCostoGastoImpor());
			this.setiNumeroPaginacion(tipocostogastoimporSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocostogastoimporSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipocostogastoimporSessionBean.setsUltimaBusquedaTipoCostoGastoImpor("");
		this.tipocostogastoimporSessionBean.setiNumeroPaginacion(TipoCostoGastoImporConstantesFunciones.INUMEROPAGINACION);
		this.tipocostogastoimporSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoCostoGastoImpor(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoCostoGastoImpor() {
		this.updateBorderResaltarBusquedasFormularioTipoCostoGastoImpor();
		this.updateVisibilidadBusquedasFormularioTipoCostoGastoImpor();
		this.updateHabilitarBusquedasFormularioTipoCostoGastoImpor();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoCostoGastoImpor() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoCostoGastoImpor() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoCostoGastoImpor() {
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
	
	public void updateControlesFormularioTipoCostoGastoImpor() throws Exception {

		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoCostoGastoImpor();
		this.updateVisibilidadResaltarControlesFormularioTipoCostoGastoImpor();
		this.updateHabilitarResaltarControlesFormularioTipoCostoGastoImpor();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoCostoGastoImpor() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocostogastoimporConstantesFunciones.resaltaridTipoCostoGastoImpor!=null && this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) {this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextFieldidTipoCostoGastoImpor.setBorder(this.tipocostogastoimporConstantesFunciones.resaltaridTipoCostoGastoImpor);}
		if(this.tipocostogastoimporConstantesFunciones.resaltarcodigoTipoCostoGastoImpor!=null && this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) {this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextFieldcodigoTipoCostoGastoImpor.setBorder(this.tipocostogastoimporConstantesFunciones.resaltarcodigoTipoCostoGastoImpor);}
		if(this.tipocostogastoimporConstantesFunciones.resaltarnombreTipoCostoGastoImpor!=null && this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) {this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextAreanombreTipoCostoGastoImpor.setBorder(this.tipocostogastoimporConstantesFunciones.resaltarnombreTipoCostoGastoImpor);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoCostoGastoImpor() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) {
	
		//this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextFieldidTipoCostoGastoImpor.setVisible(this.tipocostogastoimporConstantesFunciones.mostraridTipoCostoGastoImpor);
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jPanelidTipoCostoGastoImpor.setVisible(this.tipocostogastoimporConstantesFunciones.mostraridTipoCostoGastoImpor);
		//this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextFieldcodigoTipoCostoGastoImpor.setVisible(this.tipocostogastoimporConstantesFunciones.mostrarcodigoTipoCostoGastoImpor);
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jPanelcodigoTipoCostoGastoImpor.setVisible(this.tipocostogastoimporConstantesFunciones.mostrarcodigoTipoCostoGastoImpor);
		//this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextAreanombreTipoCostoGastoImpor.setVisible(this.tipocostogastoimporConstantesFunciones.mostrarnombreTipoCostoGastoImpor);
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jPanelnombreTipoCostoGastoImpor.setVisible(this.tipocostogastoimporConstantesFunciones.mostrarnombreTipoCostoGastoImpor);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoCostoGastoImpor() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCostoGastoImpor!=null) {
	
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextFieldidTipoCostoGastoImpor.setEnabled(this.tipocostogastoimporConstantesFunciones.activaridTipoCostoGastoImpor);
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextFieldcodigoTipoCostoGastoImpor.setEnabled(this.tipocostogastoimporConstantesFunciones.activarcodigoTipoCostoGastoImpor);
		this.jInternalFrameDetalleFormTipoCostoGastoImpor.jTextAreanombreTipoCostoGastoImpor.setEnabled(this.tipocostogastoimporConstantesFunciones.activarnombreTipoCostoGastoImpor);
		}
	}
	
		
}