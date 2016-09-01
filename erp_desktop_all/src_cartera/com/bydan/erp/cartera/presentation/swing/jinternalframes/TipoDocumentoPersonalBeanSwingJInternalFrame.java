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

import com.bydan.erp.cartera.util.TipoDocumentoPersonalConstantesFunciones;
import com.bydan.erp.cartera.util.TipoDocumentoPersonalParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoDocumentoPersonalParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoDocumentoPersonalBean;
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

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoDocumentoPersonalBeanSwingJInternalFrame extends TipoDocumentoPersonalJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoDocumentoPersonalBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoDocumentoPersonal> tipodocumentopersonalValidator = new ClassValidator<TipoDocumentoPersonal>(TipoDocumentoPersonal.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoDocumentoPersonal tipodocumentopersonal;	
	public TipoDocumentoPersonal tipodocumentopersonalAux;
	public TipoDocumentoPersonal tipodocumentopersonalAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoDocumentoPersonal tipodocumentopersonalTotales;
	public Long idTipoDocumentoPersonalActual;
	public Long iIdNuevoTipoDocumentoPersonal=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboPais="";

	public List<Pais> paissForeignKey;

	public List<Pais> getpaissForeignKey() {
		return paissForeignKey;
	}

	public void setpaissForeignKey(List<Pais> paissForeignKey) {
		this.paissForeignKey = paissForeignKey;
	}

	//OBJETO FK ACTUAL
	public Pais paisForeignKey;

	public Pais getpaisForeignKey() {
		return paisForeignKey;
	}

	public void setpaisForeignKey(Pais paisForeignKey) {
		this.paisForeignKey = paisForeignKey;
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
	
	public Boolean isPermisoTodoTipoDocumentoPersonal;
	public Boolean isPermisoNuevoTipoDocumentoPersonal;
	public Boolean isPermisoActualizarTipoDocumentoPersonal;
	public Boolean isPermisoActualizarOriginalTipoDocumentoPersonal;
	public Boolean isPermisoEliminarTipoDocumentoPersonal;
	public Boolean isPermisoGuardarCambiosTipoDocumentoPersonal;
	public Boolean isPermisoConsultaTipoDocumentoPersonal;
	public Boolean isPermisoBusquedaTipoDocumentoPersonal;
	public Boolean isPermisoReporteTipoDocumentoPersonal;
	public Boolean isPermisoPaginacionMedioTipoDocumentoPersonal;
	public Boolean isPermisoPaginacionAltoTipoDocumentoPersonal;
	public Boolean isPermisoPaginacionTodoTipoDocumentoPersonal;
	public Boolean isPermisoCopiarTipoDocumentoPersonal;
	public Boolean isPermisoVerFormTipoDocumentoPersonal;
	public Boolean isPermisoDuplicarTipoDocumentoPersonal;
	public Boolean isPermisoOrdenTipoDocumentoPersonal;
	
	
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
	
	public TipoDocumentoPersonalParameterReturnGeneral tipodocumentopersonalReturnGeneral;
	public TipoDocumentoPersonalParameterReturnGeneral tipodocumentopersonalParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoDocumentoPersonal=false;
	public Boolean esParaAccionDesdeFormularioTipoDocumentoPersonal=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoDocumentoPersonalLogic tipodocumentopersonalLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoDocumentoPersonal tipodocumentopersonalBean;
	public TipoDocumentoPersonalConstantesFunciones tipodocumentopersonalConstantesFunciones;
	//public TipoDocumentoPersonalParameterReturnGeneral tipodocumentopersonalReturnGeneral;
	
	//FK
	
	public PaisLogic paisLogic;
	
	//PARAMETROS
	
	
	//public List<TipoDocumentoPersonal> tipodocumentopersonals;	
	//public List<TipoDocumentoPersonal> tipodocumentopersonalsEliminados;
	//public List<TipoDocumentoPersonal> tipodocumentopersonalsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoDocumentoPersonal=false;
	public Boolean isVisibilidadCeldaDuplicarTipoDocumentoPersonal=true;
	public Boolean isVisibilidadCeldaCopiarTipoDocumentoPersonal=true;
	public Boolean isVisibilidadCeldaVerFormTipoDocumentoPersonal=true;
	public Boolean isVisibilidadCeldaOrdenTipoDocumentoPersonal=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal=false;
	public Boolean isVisibilidadCeldaModificarTipoDocumentoPersonal=false;
	public Boolean isVisibilidadCeldaActualizarTipoDocumentoPersonal=false;
	public Boolean isVisibilidadCeldaEliminarTipoDocumentoPersonal=false;
	public Boolean isVisibilidadCeldaCancelarTipoDocumentoPersonal=false;
	public Boolean isVisibilidadCeldaGuardarTipoDocumentoPersonal=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoDocumentoPersonal=false;	
	
	
	public Boolean isVisibilidadFK_IdPais=false;
	
	public Long getiIdNuevoTipoDocumentoPersonal() {
		return this.iIdNuevoTipoDocumentoPersonal;
	}

	public void setiIdNuevoTipoDocumentoPersonal(Long iIdNuevoTipoDocumentoPersonal) {
		this.iIdNuevoTipoDocumentoPersonal = iIdNuevoTipoDocumentoPersonal;
	}
	
	public Long getidTipoDocumentoPersonalActual() {
		return this.idTipoDocumentoPersonalActual;
	}

	public void setidTipoDocumentoPersonalActual(Long idTipoDocumentoPersonalActual) {
		this.idTipoDocumentoPersonalActual = idTipoDocumentoPersonalActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoDocumentoPersonal gettipodocumentopersonal() {
		return this.tipodocumentopersonal;
	}

	public void settipodocumentopersonal(TipoDocumentoPersonal tipodocumentopersonal) {
		this.tipodocumentopersonal = tipodocumentopersonal;
	}
	
	public TipoDocumentoPersonal gettipodocumentopersonalAux() {
		return this.tipodocumentopersonalAux;
	}

	public void settipodocumentopersonalAux(TipoDocumentoPersonal tipodocumentopersonalAux) {
		this.tipodocumentopersonalAux = tipodocumentopersonalAux;
	}				
	
	public TipoDocumentoPersonal gettipodocumentopersonalAnterior() {
		return this.tipodocumentopersonalAnterior;
	}

	public void settipodocumentopersonalAnterior(TipoDocumentoPersonal tipodocumentopersonalAnterior) {
		this.tipodocumentopersonalAnterior = tipodocumentopersonalAnterior;
	}	
	
	public TipoDocumentoPersonal gettipodocumentopersonalTotales() {
		return this.tipodocumentopersonalTotales;
	}

	public void settipodocumentopersonalTotales(TipoDocumentoPersonal tipodocumentopersonalTotales) {
		this.tipodocumentopersonalTotales = tipodocumentopersonalTotales;
	}	
	
	public TipoDocumentoPersonal gettipodocumentopersonalBean() {
		return this.tipodocumentopersonalBean;
	}

	public void settipodocumentopersonalBean(TipoDocumentoPersonal tipodocumentopersonalBean) {
		this.tipodocumentopersonalBean = tipodocumentopersonalBean;
	}	
	
	public TipoDocumentoPersonalParameterReturnGeneral gettipodocumentopersonalReturnGeneral() {
		return this.tipodocumentopersonalReturnGeneral;
	}

	public void settipodocumentopersonalReturnGeneral(TipoDocumentoPersonalParameterReturnGeneral tipodocumentopersonalReturnGeneral) {
		this.tipodocumentopersonalReturnGeneral = tipodocumentopersonalReturnGeneral;
	}	
	
	
	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoDocumentoPersonalLogic getTipoDocumentoPersonalLogic()	{		
		return tipodocumentopersonalLogic;
	}

	public void setTipoDocumentoPersonalLogic(TipoDocumentoPersonalLogic tipodocumentopersonalLogic) {
		this.tipodocumentopersonalLogic = tipodocumentopersonalLogic;
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
	
	public Boolean getIsEsNuevoTipoDocumentoPersonal() {
		return isEsNuevoTipoDocumentoPersonal;
	}

	public void setIsEsNuevoTipoDocumentoPersonal(Boolean isEsNuevoTipoDocumentoPersonal) {
		this.isEsNuevoTipoDocumentoPersonal = isEsNuevoTipoDocumentoPersonal;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoDocumentoPersonal() {
		return esParaAccionDesdeFormularioTipoDocumentoPersonal;
	}
	
	public void setEsParaAccionDesdeFormularioTipoDocumentoPersonal(Boolean esParaAccionDesdeFormularioTipoDocumentoPersonal) {
		this.esParaAccionDesdeFormularioTipoDocumentoPersonal = esParaAccionDesdeFormularioTipoDocumentoPersonal;
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
	
	
	public void cargarCombosPaissForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.paissForeignKey=new ArrayList<Pais>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PaisLogic paisLogic=new PaisLogic();

			paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.tipodocumentopersonalSessionBean==null) {
				this.tipodocumentopersonalSessionBean=new TipoDocumentoPersonalSessionBean();
			}

			if(!this.tipodocumentopersonalSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

					paisLogic.getTodosPaissWithConnection(sFinalQuery,new Pagination());

					this.paissForeignKey=paisLogic.getPaiss();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPais(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getEntityWithConnection(tipodocumentopersonalSessionBean.getlidPaisActual());
					this.paissForeignKey.add(paisLogic.getPais());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualPaisForeignKey(Long idPaisSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(paisTemp!=null) {

					if(this.tipodocumentopersonal!=null) {
						this.tipodocumentopersonal.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {
						this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxid_paisTipoDocumentoPersonal.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisTipoDocumentoPersonal.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {
						if(this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxid_paisTipoDocumentoPersonal.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxid_paisTipoDocumentoPersonal.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisTipoDocumentoPersonal!=null) {
						jComboBoxid_paisFK_IdPaisTipoDocumentoPersonal.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisTipoDocumentoPersonal!=null) {
							//jComboBoxid_paisFK_IdPaisTipoDocumentoPersonal.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisTipoDocumentoPersonal.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisTipoDocumentoPersonal.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualPaisForeignKeyDescripcion(Long idPaisSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}


			sDescripcion=PaisConstantesFunciones.getPaisDescripcion(paisTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisTipoDocumentoPersonalGenerico)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(paisTemp!=null) {
				jComboBoxid_paisTipoDocumentoPersonalGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisTipoDocumentoPersonalGenerico!=null && jComboBoxid_paisTipoDocumentoPersonalGenerico.getItemCount()>0) {
					jComboBoxid_paisTipoDocumentoPersonalGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(TipoDocumentoPersonal tipodocumentopersonal,JComboBox jComboBoxid_paisTipoDocumentoPersonalGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisTipoDocumentoPersonalGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxid_paisTipoDocumentoPersonal.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisTipoDocumentoPersonalGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				tipodocumentopersonal.setid_pais(paisAux.getId());
				tipodocumentopersonal.setpais_descripcion(TipoDocumentoPersonalConstantesFunciones.getPaisDescripcion(paisAux));
				tipodocumentopersonal.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) { 
							this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxid_paisTipoDocumentoPersonal.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxid_paisTipoDocumentoPersonal.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) { 
					}

					if(!TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoDocumentoPersonal.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisTipoDocumentoPersonal.addItem(pais);
							}
						}

						if(!TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {
							this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxid_paisTipoDocumentoPersonal.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {
							this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxid_paisTipoDocumentoPersonal.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisTipoDocumentoPersonal.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoDocumentoPersonal.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoDocumentoPersonal() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoDocumentoPersonalConstantesFunciones.refrescarForeignKeysDescripcionesTipoDocumentoPersonal(this.tipodocumentopersonalLogic.getTipoDocumentoPersonals());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoDocumentoPersonalConstantesFunciones.refrescarForeignKeysDescripcionesTipoDocumentoPersonal(this.tipodocumentopersonals);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Pais.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipodocumentopersonalLogic.setTipoDocumentoPersonals(this.tipodocumentopersonals);
			tipodocumentopersonalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoDocumentoPersonalParameterReturnGeneral getTipoDocumentoPersonalParameterGeneral() {
		return this.tipodocumentopersonalParameterGeneral;
	}
	
	public void setTipoDocumentoPersonalParameterGeneral(TipoDocumentoPersonalParameterReturnGeneral tipodocumentopersonalParameterGeneral) {
		this.tipodocumentopersonalParameterGeneral = tipodocumentopersonalParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoDocumentoPersonal() {
		return isPermisoTodoTipoDocumentoPersonal;
	}

	public void setIsPermisoTodoTipoDocumentoPersonal(Boolean isPermisoTodoTipoDocumentoPersonal) {
		this.isPermisoTodoTipoDocumentoPersonal = isPermisoTodoTipoDocumentoPersonal;
	}

	public Boolean getIsPermisoNuevoTipoDocumentoPersonal() {
		return isPermisoNuevoTipoDocumentoPersonal;
	}

	public void setIsPermisoNuevoTipoDocumentoPersonal(Boolean isPermisoNuevoTipoDocumentoPersonal) {
		this.isPermisoNuevoTipoDocumentoPersonal = isPermisoNuevoTipoDocumentoPersonal;
	}

	public Boolean getIsPermisoActualizarTipoDocumentoPersonal() {
		return isPermisoActualizarTipoDocumentoPersonal;
	}

	public void setIsPermisoActualizarTipoDocumentoPersonal(Boolean isPermisoActualizarTipoDocumentoPersonal) {
		this.isPermisoActualizarTipoDocumentoPersonal = isPermisoActualizarTipoDocumentoPersonal;
	}

	public Boolean getIsPermisoEliminarTipoDocumentoPersonal() {
		return isPermisoEliminarTipoDocumentoPersonal;
	}

	public void setIsPermisoEliminarTipoDocumentoPersonal(Boolean isPermisoEliminarTipoDocumentoPersonal) {
		this.isPermisoEliminarTipoDocumentoPersonal = isPermisoEliminarTipoDocumentoPersonal;
	}

	public Boolean getIsPermisoGuardarCambiosTipoDocumentoPersonal() {
		return isPermisoGuardarCambiosTipoDocumentoPersonal;
	}

	public void setIsPermisoGuardarCambiosTipoDocumentoPersonal(Boolean isPermisoGuardarCambiosTipoDocumentoPersonal) {
		this.isPermisoGuardarCambiosTipoDocumentoPersonal = isPermisoGuardarCambiosTipoDocumentoPersonal;
	}
	
	public Boolean getIsPermisoConsultaTipoDocumentoPersonal() {
		return isPermisoConsultaTipoDocumentoPersonal;
	}

	public void setIsPermisoConsultaTipoDocumentoPersonal(Boolean isPermisoConsultaTipoDocumentoPersonal) {
		this.isPermisoConsultaTipoDocumentoPersonal = isPermisoConsultaTipoDocumentoPersonal;
	}

	public Boolean getIsPermisoBusquedaTipoDocumentoPersonal() {
		return isPermisoBusquedaTipoDocumentoPersonal;
	}

	public void setIsPermisoBusquedaTipoDocumentoPersonal(Boolean isPermisoBusquedaTipoDocumentoPersonal) {
		this.isPermisoBusquedaTipoDocumentoPersonal = isPermisoBusquedaTipoDocumentoPersonal;
	}

	public Boolean getIsPermisoReporteTipoDocumentoPersonal() {
		return isPermisoReporteTipoDocumentoPersonal;
	}

	public void setIsPermisoReporteTipoDocumentoPersonal(Boolean isPermisoReporteTipoDocumentoPersonal) {
		this.isPermisoReporteTipoDocumentoPersonal = isPermisoReporteTipoDocumentoPersonal;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoDocumentoPersonal() {
		return isPermisoPaginacionMedioTipoDocumentoPersonal;
	}

	public void setIsPermisoPaginacionMedioTipoDocumentoPersonal(Boolean isPermisoPaginacionMedioTipoDocumentoPersonal) {
		this.isPermisoPaginacionMedioTipoDocumentoPersonal = isPermisoPaginacionMedioTipoDocumentoPersonal;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoDocumentoPersonal() {
		return isPermisoPaginacionTodoTipoDocumentoPersonal;
	}

	public void setIsPermisoPaginacionTodoTipoDocumentoPersonal(Boolean isPermisoPaginacionTodoTipoDocumentoPersonal) {
		this.isPermisoPaginacionTodoTipoDocumentoPersonal = isPermisoPaginacionTodoTipoDocumentoPersonal;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoDocumentoPersonal() {
		return isPermisoPaginacionAltoTipoDocumentoPersonal;
	}

	public void setIsPermisoPaginacionAltoTipoDocumentoPersonal(Boolean isPermisoPaginacionAltoTipoDocumentoPersonal) {
		this.isPermisoPaginacionAltoTipoDocumentoPersonal = isPermisoPaginacionAltoTipoDocumentoPersonal;
	}
	
	public Boolean getIsPermisoCopiarTipoDocumentoPersonal() {
		return isPermisoCopiarTipoDocumentoPersonal;
	}

	public void setIsPermisoCopiarTipoDocumentoPersonal(Boolean isPermisoCopiarTipoDocumentoPersonal) {
		this.isPermisoCopiarTipoDocumentoPersonal = isPermisoCopiarTipoDocumentoPersonal;
	}
	
	public Boolean getIsPermisoVerFormTipoDocumentoPersonal() {
		return isPermisoVerFormTipoDocumentoPersonal;
	}

	public void setIsPermisoVerFormTipoDocumentoPersonal(Boolean isPermisoVerFormTipoDocumentoPersonal) {
		this.isPermisoVerFormTipoDocumentoPersonal = isPermisoVerFormTipoDocumentoPersonal;
	}
	
	public Boolean getIsPermisoDuplicarTipoDocumentoPersonal() {
		return isPermisoDuplicarTipoDocumentoPersonal;
	}

	public void setIsPermisoDuplicarTipoDocumentoPersonal(Boolean isPermisoDuplicarTipoDocumentoPersonal) {
		this.isPermisoDuplicarTipoDocumentoPersonal = isPermisoDuplicarTipoDocumentoPersonal;
	}
	
	public Boolean getIsPermisoOrdenTipoDocumentoPersonal() {
		return isPermisoOrdenTipoDocumentoPersonal;
	}

	public void setIsPermisoOrdenTipoDocumentoPersonal(Boolean isPermisoOrdenTipoDocumentoPersonal) {
		this.isPermisoOrdenTipoDocumentoPersonal = isPermisoOrdenTipoDocumentoPersonal;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoDocumentoPersonal() {
		return isVisibilidadCeldaNuevoTipoDocumentoPersonal;
	}

	public void setIsVisibilidadCeldaNuevoTipoDocumentoPersonal(Boolean isVisibilidadCeldaNuevoTipoDocumentoPersonal) {
		this.isVisibilidadCeldaNuevoTipoDocumentoPersonal = isVisibilidadCeldaNuevoTipoDocumentoPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoDocumentoPersonal() {
		return isVisibilidadCeldaDuplicarTipoDocumentoPersonal;
	}

	public void setIsVisibilidadCeldaDuplicarTipoDocumentoPersonal(Boolean isVisibilidadCeldaDuplicarTipoDocumentoPersonal) {
		this.isVisibilidadCeldaDuplicarTipoDocumentoPersonal = isVisibilidadCeldaDuplicarTipoDocumentoPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoDocumentoPersonal() {
		return isVisibilidadCeldaCopiarTipoDocumentoPersonal;
	}

	public void setIsVisibilidadCeldaCopiarTipoDocumentoPersonal(Boolean isVisibilidadCeldaCopiarTipoDocumentoPersonal) {
		this.isVisibilidadCeldaCopiarTipoDocumentoPersonal = isVisibilidadCeldaCopiarTipoDocumentoPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoDocumentoPersonal() {
		return isVisibilidadCeldaVerFormTipoDocumentoPersonal;
	}

	public void setIsVisibilidadCeldaVerFormTipoDocumentoPersonal(Boolean isVisibilidadCeldaVerFormTipoDocumentoPersonal) {
		this.isVisibilidadCeldaVerFormTipoDocumentoPersonal = isVisibilidadCeldaVerFormTipoDocumentoPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoDocumentoPersonal() {
		return isVisibilidadCeldaOrdenTipoDocumentoPersonal;
	}

	public void setIsVisibilidadCeldaOrdenTipoDocumentoPersonal(Boolean isVisibilidadCeldaOrdenTipoDocumentoPersonal) {
		this.isVisibilidadCeldaOrdenTipoDocumentoPersonal = isVisibilidadCeldaOrdenTipoDocumentoPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal() {
		return isVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal(Boolean isVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal) {
		this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal = isVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoDocumentoPersonal() {
		return isVisibilidadCeldaModificarTipoDocumentoPersonal;
	}

	public void setIsVisibilidadCeldaModificarTipoDocumentoPersonal(Boolean isVisibilidadCeldaModificarTipoDocumentoPersonal) {
		this.isVisibilidadCeldaModificarTipoDocumentoPersonal = isVisibilidadCeldaModificarTipoDocumentoPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoDocumentoPersonal() {
		return isVisibilidadCeldaActualizarTipoDocumentoPersonal;
	}

	public void setIsVisibilidadCeldaActualizarTipoDocumentoPersonal(Boolean isVisibilidadCeldaActualizarTipoDocumentoPersonal) {
		this.isVisibilidadCeldaActualizarTipoDocumentoPersonal = isVisibilidadCeldaActualizarTipoDocumentoPersonal;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoDocumentoPersonal() {
		return isVisibilidadCeldaEliminarTipoDocumentoPersonal;
	}

	public void setIsVisibilidadCeldaEliminarTipoDocumentoPersonal(Boolean isVisibilidadCeldaEliminarTipoDocumentoPersonal) {
		this.isVisibilidadCeldaEliminarTipoDocumentoPersonal = isVisibilidadCeldaEliminarTipoDocumentoPersonal;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoDocumentoPersonal() {
		return isVisibilidadCeldaCancelarTipoDocumentoPersonal;
	}

	public void setIsVisibilidadCeldaCancelarTipoDocumentoPersonal(Boolean isVisibilidadCeldaCancelarTipoDocumentoPersonal) {
		this.isVisibilidadCeldaCancelarTipoDocumentoPersonal = isVisibilidadCeldaCancelarTipoDocumentoPersonal;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoDocumentoPersonal() {
		return isVisibilidadCeldaGuardarTipoDocumentoPersonal;
	}

	public void setIsVisibilidadCeldaGuardarTipoDocumentoPersonal(Boolean isVisibilidadCeldaGuardarTipoDocumentoPersonal) {
		this.isVisibilidadCeldaGuardarTipoDocumentoPersonal = isVisibilidadCeldaGuardarTipoDocumentoPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoDocumentoPersonal() {
		return isVisibilidadCeldaGuardarCambiosTipoDocumentoPersonal;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoDocumentoPersonal(Boolean isVisibilidadCeldaGuardarCambiosTipoDocumentoPersonal) {
		this.isVisibilidadCeldaGuardarCambiosTipoDocumentoPersonal = isVisibilidadCeldaGuardarCambiosTipoDocumentoPersonal;
	}
		
	public TipoDocumentoPersonalSessionBean gettipodocumentopersonalSessionBean() {
		return this.tipodocumentopersonalSessionBean;
	}
	
	public void settipodocumentopersonalSessionBean(TipoDocumentoPersonalSessionBean tipodocumentopersonalSessionBean) {
		this.tipodocumentopersonalSessionBean=tipodocumentopersonalSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoPersonal(TipoDocumentoPersonal tipodocumentopersonal)throws Exception {
		try {
			
				this.setActualParaGuardarPaisForeignKey(tipodocumentopersonal,null);
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
	
	public void bugActualizarReferenciaActual(TipoDocumentoPersonal tipodocumentopersonal,TipoDocumentoPersonal tipodocumentopersonalAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoDocumentoPersonal(tipodocumentopersonal);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipodocumentopersonalAux.setId(tipodocumentopersonal.getId());
		tipodocumentopersonalAux.setVersionRow(tipodocumentopersonal.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoDocumentoPersonal();
		
			int intSelectedRow = this.jTableDatosTipoDocumentoPersonal.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoDocumentoPersonal(this.tipodocumentopersonal,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoPersonal(this.tipodocumentopersonal);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipodocumentopersonalValidator.getInvalidValues(this.tipodocumentopersonal);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipodocumentopersonalLogic.setDatosCliente(datosCliente);
			tipodocumentopersonalLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipodocumentopersonalAux=new  TipoDocumentoPersonal();
				
				tipodocumentopersonalAux.setIsNew(true);
				tipodocumentopersonalAux.setIsChanged(true);
				
				tipodocumentopersonalAux.setTipoDocumentoPersonalOriginal(this.tipodocumentopersonal);
				
				tipodocumentopersonalAux.setId(this.tipodocumentopersonal.getId());	
				tipodocumentopersonalAux.setVersionRow(this.tipodocumentopersonal.getVersionRow());	
				tipodocumentopersonalAux.setid_pais(this.tipodocumentopersonal.getid_pais());	
				tipodocumentopersonalAux.setcodigo(this.tipodocumentopersonal.getcodigo());	
				tipodocumentopersonalAux.setnombre(this.tipodocumentopersonal.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodocumentopersonalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipodocumentopersonalAux,tipodocumentopersonalLogic.getTipoDocumentoPersonals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodocumentopersonalAux,tipodocumentopersonals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipodocumentopersonalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentopersonalLogic.saveTipoDocumentoPersonals();//WithConnection
						//tipodocumentopersonalLogic.getSetVersionRowTipoDocumentoPersonals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodocumentopersonal,tipodocumentopersonalAux);
					
					this.refrescarForeignKeysDescripcionesTipoDocumentoPersonal();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipodocumentopersonalAux=new  TipoDocumentoPersonal();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado() 
					|| (this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado() && this.tipodocumentopersonal.getId()>=0)) {
						
					tipodocumentopersonalAux.setIsNew(false);
				}
				
				tipodocumentopersonalAux.setIsDeleted(false);
			
				tipodocumentopersonalAux.setId(this.tipodocumentopersonal.getId());	
				tipodocumentopersonalAux.setVersionRow(this.tipodocumentopersonal.getVersionRow());	
				tipodocumentopersonalAux.setid_pais(this.tipodocumentopersonal.getid_pais());	
				tipodocumentopersonalAux.setcodigo(this.tipodocumentopersonal.getcodigo());	
				tipodocumentopersonalAux.setnombre(this.tipodocumentopersonal.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodocumentopersonalAux,tipodocumentopersonalLogic.getTipoDocumentoPersonals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodocumentopersonalAux,tipodocumentopersonals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipodocumentopersonalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentopersonalLogic.saveTipoDocumentoPersonals();//WithConnection
						//tipodocumentopersonalLogic.getSetVersionRowTipoDocumentoPersonals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodocumentopersonal,tipodocumentopersonalAux);
					
					this.refrescarForeignKeysDescripcionesTipoDocumentoPersonal();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipodocumentopersonalAux=new  TipoDocumentoPersonal();
				
				tipodocumentopersonalAux.setIsNew(false);
				tipodocumentopersonalAux.setIsChanged(false);
				
				tipodocumentopersonalAux.setIsDeleted(true);
				
				tipodocumentopersonalAux.setId(this.tipodocumentopersonal.getId());	
				tipodocumentopersonalAux.setVersionRow(this.tipodocumentopersonal.getVersionRow());	
				tipodocumentopersonalAux.setid_pais(this.tipodocumentopersonal.getid_pais());	
				tipodocumentopersonalAux.setcodigo(this.tipodocumentopersonal.getcodigo());	
				tipodocumentopersonalAux.setnombre(this.tipodocumentopersonal.getnombre());	
				
				if(this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipodocumentopersonalAux.getId()>=0) {	
						this.tipodocumentopersonalsEliminados.add(tipodocumentopersonalAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipodocumentopersonalAux,tipodocumentopersonalLogic.getTipoDocumentoPersonals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodocumentopersonalAux,tipodocumentopersonals);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipodocumentopersonalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentopersonalLogic.saveTipoDocumentoPersonals();//WithConnection
						//tipodocumentopersonalLogic.getSetVersionRowTipoDocumentoPersonals();//WithConnection
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
					this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().addAll(this.tipodocumentopersonalsEliminados);
					
					tipodocumentopersonalLogic.saveTipoDocumentoPersonals();//WithConnection
					//tipodocumentopersonalLogic.getSetVersionRowTipoDocumentoPersonals();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoDocumentoPersonal();
				
				this.tipodocumentopersonalsEliminados= new ArrayList<TipoDocumentoPersonal>();		
			}
			
			if(this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Documento Personal GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Documento Personal",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipodocumentopersonal=tipodocumentopersonalAux;
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
      		//this.finishProcessTipoDocumentoPersonal();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoDocumentoPersonal tipodocumentopersonalLocal) throws Exception {
		
		if(this.tipodocumentopersonalSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoDocumentoPersonal tipodocumentopersonalLocal) throws Exception {	
		if(this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				tipodocumentopersonalLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoDocumentoPersonalActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoDocumentoPersonal.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipodocumentopersonalValidator.getInvalidValues(this.tipodocumentopersonal);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoDocumentoPersonal tipodocumentopersonal,List<TipoDocumentoPersonal> tipodocumentopersonals) throws Exception {
		try	{		
			TipoDocumentoPersonalConstantesFunciones.actualizarLista(tipodocumentopersonal,tipodocumentopersonals,this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoDocumentoPersonal tipodocumentopersonal,List<TipoDocumentoPersonal> tipodocumentopersonals) throws Exception {
		try	{			
			TipoDocumentoPersonalConstantesFunciones.actualizarSelectedLista(tipodocumentopersonal,tipodocumentopersonals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoDocumentoPersonal> tipodocumentopersonalsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipodocumentopersonalsLocal=this.tipodocumentopersonalLogic.getTipoDocumentoPersonals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipodocumentopersonalsLocal=this.tipodocumentopersonals;
			}
			//ARCHITECTURE
		
			for(TipoDocumentoPersonal tipodocumentopersonalLocal:tipodocumentopersonalsLocal) {
				if(this.permiteMantenimiento(tipodocumentopersonalLocal) && tipodocumentopersonalLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoDocumentoPersonalConstantesFunciones.getTipoDocumentoPersonalLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoDocumentoPersonalConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDocumentoPersonal.jLabelid_paisTipoDocumentoPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDocumentoPersonalConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDocumentoPersonal.jLabelcodigoTipoDocumentoPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDocumentoPersonalConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDocumentoPersonal.jLabelnombreTipoDocumentoPersonal,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDocumentoPersonal.jLabelid_paisTipoDocumentoPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDocumentoPersonal.jLabelcodigoTipoDocumentoPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDocumentoPersonal.jLabelnombreTipoDocumentoPersonal,"");
		
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
		this.iIdNuevoTipoDocumentoPersonal--;	
		
		
		this.tipodocumentopersonalAux=new TipoDocumentoPersonal();
		
		this.tipodocumentopersonalAux.setId(this.iIdNuevoTipoDocumentoPersonal);
		this.tipodocumentopersonalAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().add(this.tipodocumentopersonalAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipodocumentopersonals.add(this.tipodocumentopersonalAux);
		}
		//ARCHITECTURE
		
		this.tipodocumentopersonal=this.tipodocumentopersonalAux;
		
		if(TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoDocumentoPersonal(this.tipodocumentopersonal);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDocumentoPersonal(this.tipodocumentopersonal);
		}
				
		//this.setDefaultControlesTipoDocumentoPersonal();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoDocumentoPersonal();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoDocumentoPersonal();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDocumentoPersonal();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDocumentoPersonal(this.tipodocumentopersonalBean,this.tipodocumentopersonal,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoPersonal(this.tipodocumentopersonal);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipodocumentopersonalSessionBean.getConGuardarRelaciones()) {
			classes=TipoDocumentoPersonalConstantesFunciones.getClassesRelationshipsOfTipoDocumentoPersonal(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipodocumentopersonalReturnGeneral=tipodocumentopersonalLogic.procesarEventosTipoDocumentoPersonalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodocumentopersonalLogic.getTipoDocumentoPersonals(),this.tipodocumentopersonal,this.tipodocumentopersonalParameterGeneral,this.isEsNuevoTipoDocumentoPersonal,classes);//this.tipodocumentopersonalLogic.getTipoDocumentoPersonal()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoDocumentoPersonal(this.tipodocumentopersonalReturnGeneral,this.tipodocumentopersonalBean,false);
		
		if(this.tipodocumentopersonalReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDocumentoPersonal(this.tipodocumentopersonalReturnGeneral.getTipoDocumentoPersonal());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoDocumentoPersonal(this.tipodocumentopersonalReturnGeneral.getTipoDocumentoPersonal());
		}
		
		if(this.tipodocumentopersonalReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoDocumentoPersonal(this.tipodocumentopersonalReturnGeneral.getTipoDocumentoPersonal(),classes);//this.tipodocumentopersonalBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoDocumentoPersonal(this.tipodocumentopersonal,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoDocumentoPersonal();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoDocumentoPersonal();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoDocumentoPersonal(false);
						
			if(tipodocumentopersonalSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDocumentoPersonal();
			}
			
			this.actualizarVisualTableDatosTipoDocumentoPersonal();
			
			this.jTableDatosTipoDocumentoPersonal.setRowSelectionInterval(this.getIndiceNuevoTipoDocumentoPersonal(), this.getIndiceNuevoTipoDocumentoPersonal());
			
			this.seleccionarFilaTablaTipoDocumentoPersonalActual();
						
			this.actualizarEstadoCeldasBotonesTipoDocumentoPersonal("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoDocumentoPersonal(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextFieldcodigoTipoDocumentoPersonal.setEnabled(isHabilitar && this.tipodocumentopersonalConstantesFunciones.activarcodigoTipoDocumentoPersonal);
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextAreanombreTipoDocumentoPersonal.setEnabled(isHabilitar && this.tipodocumentopersonalConstantesFunciones.activarnombreTipoDocumentoPersonal);	
		
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxid_paisTipoDocumentoPersonal.setEnabled(isHabilitar && this.tipodocumentopersonalConstantesFunciones.activarid_paisTipoDocumentoPersonal);
	};
	
	public void setDefaultControlesTipoDocumentoPersonal() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoDocumentoPersonal(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipodocumentopersonalSessionBean.setConGuardarRelaciones(true);			
			this.tipodocumentopersonalSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTabbedPaneRelacionesTipoDocumentoPersonal.setVisible(true);
			
					
		} else {
			//this.tipodocumentopersonalSessionBean.setConGuardarRelaciones(false);			
			this.tipodocumentopersonalSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTabbedPaneRelacionesTipoDocumentoPersonal.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoDocumentoPersonal() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDocumentoPersonal tipodocumentopersonalAux:this.tipodocumentopersonalLogic.getTipoDocumentoPersonals()) {
				if(tipodocumentopersonalAux.getId().equals(this.iIdNuevoTipoDocumentoPersonal)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDocumentoPersonal tipodocumentopersonalAux:this.tipodocumentopersonals) {
				if(tipodocumentopersonalAux.getId().equals(this.iIdNuevoTipoDocumentoPersonal)) {
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
	
	public int getIndiceActualTipoDocumentoPersonal(TipoDocumentoPersonal tipodocumentopersonal,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDocumentoPersonal tipodocumentopersonalAux:this.tipodocumentopersonalLogic.getTipoDocumentoPersonals()) {
				if(tipodocumentopersonalAux.getId().equals(tipodocumentopersonal.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDocumentoPersonal tipodocumentopersonalAux:this.tipodocumentopersonals) {
				if(tipodocumentopersonalAux.getId().equals(tipodocumentopersonal.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoDocumentoPersonal(TipoDocumentoPersonal tipodocumentopersonalOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDocumentoPersonal tipodocumentopersonalAux:this.tipodocumentopersonalLogic.getTipoDocumentoPersonals()) {
				if(tipodocumentopersonalAux.getTipoDocumentoPersonalOriginal().getId().equals(tipodocumentopersonalOriginal.getId())) {
					existe=true;
					tipodocumentopersonalOriginal.setId(tipodocumentopersonalAux.getId());
					tipodocumentopersonalOriginal.setVersionRow(tipodocumentopersonalAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDocumentoPersonal tipodocumentopersonalAux:this.tipodocumentopersonals) {
				if(tipodocumentopersonalAux.getTipoDocumentoPersonalOriginal().getId().equals(tipodocumentopersonalOriginal.getId())) {
					existe=true;
					tipodocumentopersonalOriginal.setId(tipodocumentopersonalAux.getId());
					tipodocumentopersonalOriginal.setVersionRow(tipodocumentopersonalAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoDocumentoPersonal(Boolean esParaCancelar) throws Exception {
		tipodocumentopersonalsAux=new ArrayList<TipoDocumentoPersonal>();
		tipodocumentopersonalAux=new TipoDocumentoPersonal();
		
		if(!this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDocumentoPersonal tipodocumentopersonalAux:this.tipodocumentopersonalLogic.getTipoDocumentoPersonals()) {
					if(tipodocumentopersonalAux.getId()<0) {
						tipodocumentopersonalsAux.add(tipodocumentopersonalAux);
					}		
				}
				this.iIdNuevoTipoDocumentoPersonal=0L;
				this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().removeAll(tipodocumentopersonalsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDocumentoPersonal tipodocumentopersonalAux:this.tipodocumentopersonals) {
					if(tipodocumentopersonalAux.getId()<0) {
						tipodocumentopersonalsAux.add(tipodocumentopersonalAux);
					}		
				}
				this.iIdNuevoTipoDocumentoPersonal=0L;
				this.tipodocumentopersonals.removeAll(tipodocumentopersonalsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoDocumentoPersonal 
					&& this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().size()>0
					) {
					tipodocumentopersonalAux=this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().get(this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().size() - 1);
				
					if(tipodocumentopersonalAux.getId()<0) {
						this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().remove(tipodocumentopersonalAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoDocumentoPersonal && this.tipodocumentopersonals.size()>0) {
					tipodocumentopersonalAux=this.tipodocumentopersonals.get(this.tipodocumentopersonals.size() - 1);
				
					if(tipodocumentopersonalAux.getId()<0) {
						this.tipodocumentopersonals.remove(tipodocumentopersonalAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoDocumentoPersonal(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipodocumentopersonal.getId()<0) {
				this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().remove(this.tipodocumentopersonal);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipodocumentopersonal.getId()<0) {
				this.tipodocumentopersonals.remove(this.tipodocumentopersonal);
			}
		}			
	}
	
	public void setEstadosInicialesTipoDocumentoPersonal(List<TipoDocumentoPersonal> tipodocumentopersonalsAux) throws Exception {
		TipoDocumentoPersonalConstantesFunciones.setEstadosInicialesTipoDocumentoPersonal(tipodocumentopersonalsAux);
	}
	
	public void setEstadosInicialesTipoDocumentoPersonal(TipoDocumentoPersonal tipodocumentopersonalAux) throws Exception {
		TipoDocumentoPersonalConstantesFunciones.setEstadosInicialesTipoDocumentoPersonal(tipodocumentopersonalAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoDocumentoPersonalActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoDocumentoPersonal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoDocumentoPersonalActual()) {
				if(!this.isEsNuevoTipoDocumentoPersonal) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoDocumentoPersonal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoDocumentoPersonal=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoDocumentoPersonalActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Documento Personal ?", "MANTENIMIENTO DE Tipo Documento Personal", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoDocumentoPersonal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoDocumentoPersonal tipodocumentopersonal) throws Exception {
		TipoDocumentoPersonalConstantesFunciones.seleccionarAsignar(this.tipodocumentopersonal,tipodocumentopersonal);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoDocumentoPersonal=this.isPermisoActualizarOriginalTipoDocumentoPersonal;
			
			
			this.seleccionarAsignar(tipodocumentopersonal);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoDocumentoPersonalConstantesFunciones.quitarEspaciosTipoDocumentoPersonal(this.tipodocumentopersonal,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoDocumentoPersonal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipodocumentopersonalSessionBean.setsFuncionBusquedaRapida(this.tipodocumentopersonalSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoDocumentoPersonal) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoDocumentoPersonal(esParaCancelar);				
				this.cancelarNuevoTipoDocumentoPersonal(esParaCancelar);								
			}
			
			this.tipodocumentopersonal=new TipoDocumentoPersonal();
			
			this.inicializarTipoDocumentoPersonal();
			
			this.actualizarEstadoCeldasBotonesTipoDocumentoPersonal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoDocumentoPersonal() throws Exception {
		try {
			TipoDocumentoPersonalConstantesFunciones.inicializarTipoDocumentoPersonal(this.tipodocumentopersonal);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoDocumentoPersonals(String sAccionBusqueda,List<TipoDocumentoPersonal> tipodocumentopersonalsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoDocumentoPersonal"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoDocumentoPersonalMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoDocumentoPersonalMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoDocumentoPersonal"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Documento Personals");		
		parameters.put("busquedapor", TipoDocumentoPersonalConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoDocumentoPersonal=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoDocumentoPersonalConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoDocumentoPersonalConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoDocumentoPersonal=new JRBeanArrayDataSource(TipoDocumentoPersonalJInternalFrame.TraerTipoDocumentoPersonalBeans(tipodocumentopersonalsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoDocumentoPersonal);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoDocumentoPersonalConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoDocumentoPersonalConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoDocumentoPersonalBean.TraerTipoDocumentoPersonalBeans(tipodocumentopersonalsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoDocumentoPersonals(sAccionBusqueda,sTipoArchivoReporte,tipodocumentopersonalsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoDocumentoPersonals(sAccionBusqueda,sTipoArchivoReporte,tipodocumentopersonalsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoDocumentoPersonalActionPerformed(null);
					//this.generarExcelReporteTipoDocumentoPersonals(sAccionBusqueda,sTipoArchivoReporte,tipodocumentopersonalsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoDocumentoPersonals(sAccionBusqueda,sTipoArchivoReporte,tipodocumentopersonalsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoDocumentoPersonals(sAccionBusqueda,sTipoArchivoReporte,tipodocumentopersonalsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoDocumentoPersonals(sAccionBusqueda,sTipoArchivoReporte,tipodocumentopersonalsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoDocumentoPersonals(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDocumentoPersonal> tipodocumentopersonalsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodocumentopersonal";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDocumentoPersonals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDocumentoPersonal("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoDocumentoPersonal tipodocumentopersonal : tipodocumentopersonalsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoDocumentoPersonalConstantesFunciones.generarExcelReporteDataTipoDocumentoPersonal("NORMAL",row,workbook,tipodocumentopersonal,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Documento Personal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoDocumentoPersonal(String sTipo,Row row,Workbook workbook) {
		
		TipoDocumentoPersonalConstantesFunciones.generarExcelReporteHeaderTipoDocumentoPersonal(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoDocumentoPersonals(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDocumentoPersonal> tipodocumentopersonalsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodocumentopersonal_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDocumentoPersonals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoDocumentoPersonal tipodocumentopersonal : tipodocumentopersonalsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoDocumentoPersonalConstantesFunciones.getTipoDocumentoPersonalDescripcion(tipodocumentopersonal));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDocumentoPersonalConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDocumentoPersonalConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodocumentopersonal.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDocumentoPersonalConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDocumentoPersonalConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodocumentopersonal.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDocumentoPersonalConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDocumentoPersonalConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodocumentopersonal.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Documento Personal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoDocumentoPersonals(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDocumentoPersonal> tipodocumentopersonalsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoDocumentoPersonal> tipodocumentopersonalsRespaldo=null;
		
		classes=TipoDocumentoPersonalConstantesFunciones.getClassesRelationshipsOfTipoDocumentoPersonal(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipodocumentopersonalLogic.setDatosCliente(this.datosCliente);
		this.tipodocumentopersonalLogic.setDatosDeep(this.datosDeep);
		this.tipodocumentopersonalLogic.setIsConDeep(true);
		
		tipodocumentopersonalsRespaldo=this.tipodocumentopersonalLogic.getTipoDocumentoPersonals();
		
		this.tipodocumentopersonalLogic.setTipoDocumentoPersonals(tipodocumentopersonalsParaReportes);	
		this.tipodocumentopersonalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipodocumentopersonalsParaReportes=this.tipodocumentopersonalLogic.getTipoDocumentoPersonals();
		this.tipodocumentopersonalLogic.setTipoDocumentoPersonals(tipodocumentopersonalsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodocumentopersonal_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDocumentoPersonals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDocumentoPersonal("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoDocumentoPersonal tipodocumentopersonal : tipodocumentopersonalsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoDocumentoPersonal("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoDocumentoPersonalConstantesFunciones.generarExcelReporteDataTipoDocumentoPersonal("NORMAL",row,workbook,tipodocumentopersonal,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoDocumentoPersonalConstantesFunciones.getTipoDocumentoPersonalDescripcion(tipodocumentopersonal));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Documento Personal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoDocumentoPersonal() throws Exception {		
		this.startProcessTipoDocumentoPersonal(true);
	}
	
	public void startProcessTipoDocumentoPersonal(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoDocumentoPersonal ,this.jPanelParametrosReportesTipoDocumentoPersonal, this.jScrollPanelDatosTipoDocumentoPersonal,this.jPanelPaginacionTipoDocumentoPersonal, this.jScrollPanelDatosEdicionTipoDocumentoPersonal, this.jPanelAccionesTipoDocumentoPersonal,this.jPanelAccionesFormularioTipoDocumentoPersonal,this.jmenuBarTipoDocumentoPersonal,this.jmenuBarDetalleTipoDocumentoPersonal,this.jTtoolBarTipoDocumentoPersonal,this.jTtoolBarDetalleTipoDocumentoPersonal);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDocumentoPersonal=this.jTabbedPaneBusquedasTipoDocumentoPersonal; 
		
		final JPanel jPanelParametrosReportesTipoDocumentoPersonal=this.jPanelParametrosReportesTipoDocumentoPersonal;
		//final JScrollPane jScrollPanelDatosTipoDocumentoPersonal=this.jScrollPanelDatosTipoDocumentoPersonal;
		final JTable jTableDatosTipoDocumentoPersonal=this.jTableDatosTipoDocumentoPersonal;		
		final JPanel jPanelPaginacionTipoDocumentoPersonal=this.jPanelPaginacionTipoDocumentoPersonal;
		//final JScrollPane jScrollPanelDatosEdicionTipoDocumentoPersonal=this.jScrollPanelDatosEdicionTipoDocumentoPersonal;
		final JPanel jPanelAccionesTipoDocumentoPersonal=this.jPanelAccionesTipoDocumentoPersonal;
		
		JPanel jPanelCamposAuxiliarTipoDocumentoPersonal=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoDocumentoPersonal=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {
			jPanelCamposAuxiliarTipoDocumentoPersonal=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jPanelCamposTipoDocumentoPersonal;
			jPanelAccionesFormularioAuxiliarTipoDocumentoPersonal=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jPanelAccionesFormularioTipoDocumentoPersonal;
		}
		
		final JPanel jPanelCamposTipoDocumentoPersonal=jPanelCamposAuxiliarTipoDocumentoPersonal;
		final JPanel jPanelAccionesFormularioTipoDocumentoPersonal=jPanelAccionesFormularioAuxiliarTipoDocumentoPersonal;
		
		
		final JMenuBar jmenuBarTipoDocumentoPersonal=this.jmenuBarTipoDocumentoPersonal;
		final JToolBar jTtoolBarTipoDocumentoPersonal=this.jTtoolBarTipoDocumentoPersonal;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoDocumentoPersonal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDocumentoPersonal=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {
			jmenuBarDetalleAuxiliarTipoDocumentoPersonal=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jmenuBarDetalleTipoDocumentoPersonal;
			jTtoolBarDetalleAuxiliarTipoDocumentoPersonal=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTtoolBarDetalleTipoDocumentoPersonal;
		}
		
		final JMenuBar jmenuBarDetalleTipoDocumentoPersonal=jmenuBarDetalleAuxiliarTipoDocumentoPersonal;
		final JToolBar jTtoolBarDetalleTipoDocumentoPersonal=jTtoolBarDetalleAuxiliarTipoDocumentoPersonal;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDocumentoPersonal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDocumentoPersonal;
			processRunnable.jTableDatos=jTableDatosTipoDocumentoPersonal;
			processRunnable.jPanelCampos=jPanelCamposTipoDocumentoPersonal;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDocumentoPersonal;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDocumentoPersonal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDocumentoPersonal;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDocumentoPersonal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDocumentoPersonal;
			processRunnable.jTtoolBar=jTtoolBarTipoDocumentoPersonal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDocumentoPersonal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDocumentoPersonal ,jPanelParametrosReportesTipoDocumentoPersonal,jTableDatosTipoDocumentoPersonal, /*jScrollPanelDatosTipoDocumentoPersonal,*/jPanelCamposTipoDocumentoPersonal,jPanelPaginacionTipoDocumentoPersonal, /*jScrollPanelDatosEdicionTipoDocumentoPersonal,*/ jPanelAccionesTipoDocumentoPersonal,jPanelAccionesFormularioTipoDocumentoPersonal,jmenuBarTipoDocumentoPersonal,jmenuBarDetalleTipoDocumentoPersonal,jTtoolBarTipoDocumentoPersonal,jTtoolBarDetalleTipoDocumentoPersonal);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDocumentoPersonal ,jPanelParametrosReportesTipoDocumentoPersonal, jScrollPanelDatosTipoDocumentoPersonal,jPanelPaginacionTipoDocumentoPersonal, jScrollPanelDatosEdicionTipoDocumentoPersonal, jPanelAccionesTipoDocumentoPersonal,jPanelAccionesFormularioTipoDocumentoPersonal,jmenuBarTipoDocumentoPersonal,jmenuBarDetalleTipoDocumentoPersonal,jTtoolBarTipoDocumentoPersonal,jTtoolBarDetalleTipoDocumentoPersonal);
						
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
	
	public void finishProcessTipoDocumentoPersonal() {// throws Exception 
		this.finishProcessTipoDocumentoPersonal(true);
	}
	
	public void finishProcessTipoDocumentoPersonal(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoDocumentoPersonal ,this.jPanelParametrosReportesTipoDocumentoPersonal, this.jScrollPanelDatosTipoDocumentoPersonal,this.jPanelPaginacionTipoDocumentoPersonal, this.jScrollPanelDatosEdicionTipoDocumentoPersonal, this.jPanelAccionesTipoDocumentoPersonal,this.jPanelAccionesFormularioTipoDocumentoPersonal,this.jmenuBarTipoDocumentoPersonal,this.jmenuBarDetalleTipoDocumentoPersonal,this.jTtoolBarTipoDocumentoPersonal,this.jTtoolBarDetalleTipoDocumentoPersonal);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDocumentoPersonal=this.jTabbedPaneBusquedasTipoDocumentoPersonal; 
		
		final JPanel jPanelParametrosReportesTipoDocumentoPersonal=this.jPanelParametrosReportesTipoDocumentoPersonal;
		//final JScrollPane jScrollPanelDatosTipoDocumentoPersonal=this.jScrollPanelDatosTipoDocumentoPersonal;
		final JTable jTableDatosTipoDocumentoPersonal=this.jTableDatosTipoDocumentoPersonal;		
		final JPanel jPanelPaginacionTipoDocumentoPersonal=this.jPanelPaginacionTipoDocumentoPersonal;
		//final JScrollPane jScrollPanelDatosEdicionTipoDocumentoPersonal=this.jScrollPanelDatosEdicionTipoDocumentoPersonal;
		final JPanel jPanelAccionesTipoDocumentoPersonal=this.jPanelAccionesTipoDocumentoPersonal;
		
		JPanel jPanelCamposAuxiliarTipoDocumentoPersonal=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoDocumentoPersonal=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {
			jPanelCamposAuxiliarTipoDocumentoPersonal=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jPanelCamposTipoDocumentoPersonal;
			jPanelAccionesFormularioAuxiliarTipoDocumentoPersonal=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jPanelAccionesFormularioTipoDocumentoPersonal;
		}
		
		final JPanel jPanelCamposTipoDocumentoPersonal=jPanelCamposAuxiliarTipoDocumentoPersonal;
		final JPanel jPanelAccionesFormularioTipoDocumentoPersonal=jPanelAccionesFormularioAuxiliarTipoDocumentoPersonal;
		
		
		final JMenuBar jmenuBarTipoDocumentoPersonal=this.jmenuBarTipoDocumentoPersonal;		
		final JToolBar jTtoolBarTipoDocumentoPersonal=this.jTtoolBarTipoDocumentoPersonal;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoDocumentoPersonal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDocumentoPersonal=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {
			jmenuBarDetalleAuxiliarTipoDocumentoPersonal=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jmenuBarDetalleTipoDocumentoPersonal;
			jTtoolBarDetalleAuxiliarTipoDocumentoPersonal=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTtoolBarDetalleTipoDocumentoPersonal;		
		}
		
		final JMenuBar jmenuBarDetalleTipoDocumentoPersonal=jmenuBarDetalleAuxiliarTipoDocumentoPersonal;
		final JToolBar jTtoolBarDetalleTipoDocumentoPersonal=jTtoolBarDetalleAuxiliarTipoDocumentoPersonal;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDocumentoPersonal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDocumentoPersonal;
			processRunnable.jTableDatos=jTableDatosTipoDocumentoPersonal;
			processRunnable.jPanelCampos=jPanelCamposTipoDocumentoPersonal;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDocumentoPersonal;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDocumentoPersonal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDocumentoPersonal;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDocumentoPersonal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDocumentoPersonal;
			processRunnable.jTtoolBar=jTtoolBarTipoDocumentoPersonal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDocumentoPersonal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoDocumentoPersonal ,jPanelParametrosReportesTipoDocumentoPersonal, jTableDatosTipoDocumentoPersonal,/*jScrollPanelDatosTipoDocumentoPersonal,*/jPanelCamposTipoDocumentoPersonal,jPanelPaginacionTipoDocumentoPersonal, /*jScrollPanelDatosEdicionTipoDocumentoPersonal,*/ jPanelAccionesTipoDocumentoPersonal,jPanelAccionesFormularioTipoDocumentoPersonal,jmenuBarTipoDocumentoPersonal,jmenuBarDetalleTipoDocumentoPersonal,jTtoolBarTipoDocumentoPersonal,jTtoolBarDetalleTipoDocumentoPersonal));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoDocumentoPersonal(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoDocumentoPersonal(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoDocumentoPersonal(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoDocumentoPersonal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoDocumentoPersonal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoDocumentoPersonal,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoDocumentoPersonal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoDocumentoPersonal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoDocumentoPersonal,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipodocumentopersonalConstantesFunciones.getsFinalQueryTipoDocumentoPersonal();
		String  finalQueryPaginacionTodos=this.tipodocumentopersonalConstantesFunciones.getsFinalQueryTipoDocumentoPersonal();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoDocumentoPersonalConstantesFunciones.getArrayColumnasGlobalesNoTipoDocumentoPersonal(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoDocumentoPersonalConstantesFunciones.getArrayColumnasGlobalesTipoDocumentoPersonal(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoDocumentoPersonalConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipodocumentopersonalsEliminados= new ArrayList<TipoDocumentoPersonal>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoDocumentoPersonal();
		
				///*TipoDocumentoPersonalSessionBean*/this.tipodocumentopersonalSessionBean=new TipoDocumentoPersonalSessionBean();
			
			if(this.tipodocumentopersonalSessionBean==null) {
				this.tipodocumentopersonalSessionBean=new TipoDocumentoPersonalSessionBean();
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
					this.iNumeroPaginacion=TipoDocumentoPersonalConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoDocumentoPersonalConstantesFunciones.getClassesForeignKeysOfTipoDocumentoPersonal(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipodocumentopersonal."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipodocumentopersonalsAux= new ArrayList<TipoDocumentoPersonal>();
			
				
			tipodocumentopersonalLogic.setDatosCliente(this.datosCliente);
			tipodocumentopersonalLogic.setDatosDeep(this.datosDeep);
			tipodocumentopersonalLogic.setIsConDeep(true);
			
			
			tipodocumentopersonalLogic.getTipoDocumentoPersonalDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipodocumentopersonalLogic.getTodosTipoDocumentoPersonals(finalQueryGlobal,pagination);
					
					//tipodocumentopersonalLogic.getTodosTipoDocumentoPersonalsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipodocumentopersonalLogic.getTipoDocumentoPersonals()==null|| tipodocumentopersonalLogic.getTipoDocumentoPersonals().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodocumentopersonalsAux= new ArrayList<TipoDocumentoPersonal>();
							tipodocumentopersonalsAux.addAll(tipodocumentopersonalLogic.getTipoDocumentoPersonals());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentopersonalsAux= new ArrayList<TipoDocumentoPersonal>();
							tipodocumentopersonalsAux.addAll(tipodocumentopersonals);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodocumentopersonalLogic.getTodosTipoDocumentoPersonals(finalQueryGlobal+"",this.pagination);												
							
							//tipodocumentopersonalLogic.getTodosTipoDocumentoPersonalsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoDocumentoPersonals("Todos",tipodocumentopersonalLogic.getTipoDocumentoPersonals() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodocumentopersonalLogic.setTipoDocumentoPersonals(new ArrayList<TipoDocumentoPersonal>());					
							tipodocumentopersonalLogic.getTipoDocumentoPersonals().addAll(tipodocumentopersonalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentopersonals=new ArrayList<TipoDocumentoPersonal>();
							tipodocumentopersonals.addAll(tipodocumentopersonalsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoDocumentoPersonal=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoDocumentoPersonal=this.idActual;
				
				} else if(this.idTipoDocumentoPersonalActual!=null && this.idTipoDocumentoPersonalActual!=0L) {
					idTipoDocumentoPersonal=idTipoDocumentoPersonalActual;
				}
				
					
				this.sDetalleReporte=TipoDocumentoPersonalConstantesFunciones.getDetalleIndicePorId(idTipoDocumentoPersonal);
				
				this.tipodocumentopersonals=new ArrayList<TipoDocumentoPersonal>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipodocumentopersonalLogic.getEntity(idTipoDocumentoPersonal);
					
					//tipodocumentopersonalLogic.getEntityWithConnection(idTipoDocumentoPersonal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentopersonalLogic.setTipoDocumentoPersonals(new ArrayList<TipoDocumentoPersonal>());
					tipodocumentopersonalLogic.getTipoDocumentoPersonals().add(tipodocumentopersonalLogic.getTipoDocumentoPersonal());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodocumentopersonals=new ArrayList<TipoDocumentoPersonal>();
					this.tipodocumentopersonals.add(tipodocumentopersonal);
				}
				
				if(tipodocumentopersonalLogic.getTipoDocumentoPersonal()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=TipoDocumentoPersonalConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodocumentopersonalLogic.getTipoDocumentoPersonalsFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDocumentoPersonalConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDocumentoPersonalConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodocumentopersonalLogic.getTipoDocumentoPersonals()==null||tipodocumentopersonalLogic.getTipoDocumentoPersonals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodocumentopersonals==null|| tipodocumentopersonals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentopersonalsAux=new ArrayList<TipoDocumentoPersonal>();
						tipodocumentopersonalsAux.addAll(tipodocumentopersonalLogic.getTipoDocumentoPersonals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentopersonalsAux=new ArrayList<TipoDocumentoPersonal>();
							tipodocumentopersonalsAux.addAll(tipodocumentopersonals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodocumentopersonalLogic.getTipoDocumentoPersonalsFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDocumentoPersonalConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDocumentoPersonalConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDocumentoPersonals("FK_IdPais",tipodocumentopersonalLogic.getTipoDocumentoPersonals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDocumentoPersonals("FK_IdPais",tipodocumentopersonals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentopersonalLogic.setTipoDocumentoPersonals(new ArrayList<TipoDocumentoPersonal>());
						tipodocumentopersonalLogic.getTipoDocumentoPersonals().addAll(tipodocumentopersonalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentopersonals=new ArrayList<TipoDocumentoPersonal>();
							tipodocumentopersonals.addAll(tipodocumentopersonalsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoDocumentoPersonal();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoDocumentoPersonal();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodocumentopersonalLogic.getTipoDocumentoPersonals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodocumentopersonals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodocumentopersonalLogic.getTipoDocumentoPersonals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodocumentopersonals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoDocumentoPersonal tipodocumentopersonal) {
		Boolean permite=true;
		
		if(this.tipodocumentopersonal.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoDocumentoPersonalConstantesFunciones.getOrderByListaTipoDocumentoPersonal();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoDocumentoPersonalConstantesFunciones.getOrderByListaTipoDocumentoPersonal();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDocumentoPersonal tipodocumentopersonal:tipodocumentopersonalLogic.getTipoDocumentoPersonals()) {
				if(tipodocumentopersonal.getsType().equals(Constantes2.S_TOTALES)) {
					tipodocumentopersonalTotales=tipodocumentopersonal;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDocumentoPersonal tipodocumentopersonal:this.tipodocumentopersonals) {
				if(tipodocumentopersonal.getsType().equals(Constantes2.S_TOTALES)) {
					tipodocumentopersonalTotales=tipodocumentopersonal;
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
			this.tipodocumentopersonalAux=new TipoDocumentoPersonal();
			this.tipodocumentopersonalAux.setsType(Constantes2.S_TOTALES);
			this.tipodocumentopersonalAux.setIsNew(false);
			this.tipodocumentopersonalAux.setIsChanged(false);
			this.tipodocumentopersonalAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoDocumentoPersonalConstantesFunciones.TotalizarValoresFilaTipoDocumentoPersonal(this.tipodocumentopersonalLogic.getTipoDocumentoPersonals(),this.tipodocumentopersonalAux);
				
				this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().add(this.tipodocumentopersonalAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoDocumentoPersonalConstantesFunciones.TotalizarValoresFilaTipoDocumentoPersonal(this.tipodocumentopersonals,this.tipodocumentopersonalAux);
				
				this.tipodocumentopersonals.add(this.tipodocumentopersonalAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipodocumentopersonalTotales=new TipoDocumentoPersonal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().remove(tipodocumentopersonalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodocumentopersonals.remove(tipodocumentopersonalTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipodocumentopersonalTotales=new TipoDocumentoPersonal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDocumentoPersonal tipodocumentopersonal:tipodocumentopersonalLogic.getTipoDocumentoPersonals()) {
				if(tipodocumentopersonal.getsType().equals(Constantes2.S_TOTALES)) {
					tipodocumentopersonalTotales=tipodocumentopersonal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDocumentoPersonalConstantesFunciones.TotalizarValoresFilaTipoDocumentoPersonal(this.tipodocumentopersonalLogic.getTipoDocumentoPersonals(),tipodocumentopersonalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDocumentoPersonal tipodocumentopersonal:this.tipodocumentopersonals) {
				if(tipodocumentopersonal.getsType().equals(Constantes2.S_TOTALES)) {
					tipodocumentopersonalTotales=tipodocumentopersonal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDocumentoPersonalConstantesFunciones.TotalizarValoresFilaTipoDocumentoPersonal(this.tipodocumentopersonals,tipodocumentopersonalTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoDocumentoPersonalsFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoDocumentoPersonalsFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentopersonalLogic.getTipoDocumentoPersonalsFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
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
	
	public void inicializarPermisosTipoDocumentoPersonal() {
		this.isPermisoTodoTipoDocumentoPersonal=false;
		this.isPermisoNuevoTipoDocumentoPersonal=false;
		this.isPermisoActualizarTipoDocumentoPersonal=false;
		this.isPermisoActualizarOriginalTipoDocumentoPersonal=false;
		this.isPermisoEliminarTipoDocumentoPersonal=false;
		this.isPermisoGuardarCambiosTipoDocumentoPersonal=false;
		this.isPermisoConsultaTipoDocumentoPersonal=false;
		this.isPermisoBusquedaTipoDocumentoPersonal=false;
		this.isPermisoReporteTipoDocumentoPersonal=false;		
		this.isPermisoOrdenTipoDocumentoPersonal=false;		
		this.isPermisoPaginacionMedioTipoDocumentoPersonal=false;		
		this.isPermisoPaginacionAltoTipoDocumentoPersonal=false;
		this.isPermisoPaginacionTodoTipoDocumentoPersonal=false;
		this.isPermisoCopiarTipoDocumentoPersonal=false;		
		this.isPermisoVerFormTipoDocumentoPersonal=false;		
		this.isPermisoDuplicarTipoDocumentoPersonal=false;		
		this.isPermisoOrdenTipoDocumentoPersonal=false;		
	}
	
	public void setPermisosUsuarioTipoDocumentoPersonal(Boolean isPermiso) {
		this.isPermisoTodoTipoDocumentoPersonal=isPermiso;
		this.isPermisoNuevoTipoDocumentoPersonal=isPermiso;
		this.isPermisoActualizarTipoDocumentoPersonal=isPermiso;
		this.isPermisoActualizarOriginalTipoDocumentoPersonal=isPermiso;
		this.isPermisoEliminarTipoDocumentoPersonal=isPermiso;
		this.isPermisoGuardarCambiosTipoDocumentoPersonal=isPermiso;
		this.isPermisoConsultaTipoDocumentoPersonal=isPermiso;
		this.isPermisoBusquedaTipoDocumentoPersonal=isPermiso;
		this.isPermisoReporteTipoDocumentoPersonal=isPermiso;
		this.isPermisoOrdenTipoDocumentoPersonal=isPermiso;		
		this.isPermisoPaginacionMedioTipoDocumentoPersonal=isPermiso;		
		this.isPermisoPaginacionAltoTipoDocumentoPersonal=isPermiso;		
		this.isPermisoPaginacionTodoTipoDocumentoPersonal=isPermiso;		
		this.isPermisoCopiarTipoDocumentoPersonal=isPermiso;		
		this.isPermisoVerFormTipoDocumentoPersonal=isPermiso;		
		this.isPermisoDuplicarTipoDocumentoPersonal=isPermiso;
		this.isPermisoOrdenTipoDocumentoPersonal=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoDocumentoPersonal(Boolean isPermiso) {
		//this.isPermisoTodoTipoDocumentoPersonal=isPermiso;
		this.isPermisoNuevoTipoDocumentoPersonal=isPermiso;
		this.isPermisoActualizarTipoDocumentoPersonal=isPermiso;
		this.isPermisoActualizarOriginalTipoDocumentoPersonal=isPermiso;
		this.isPermisoEliminarTipoDocumentoPersonal=isPermiso;
		this.isPermisoGuardarCambiosTipoDocumentoPersonal=isPermiso;
		//this.isPermisoConsultaTipoDocumentoPersonal=isPermiso;
		//this.isPermisoBusquedaTipoDocumentoPersonal=isPermiso;
		//this.isPermisoReporteTipoDocumentoPersonal=isPermiso;
		//this.isPermisoOrdenTipoDocumentoPersonal=isPermiso;		
		//this.isPermisoPaginacionMedioTipoDocumentoPersonal=isPermiso;		
		//this.isPermisoPaginacionAltoTipoDocumentoPersonal=isPermiso;		
		//this.isPermisoPaginacionTodoTipoDocumentoPersonal=isPermiso;		
		//this.isPermisoCopiarTipoDocumentoPersonal=isPermiso;		
		//this.isPermisoDuplicarTipoDocumentoPersonal=isPermiso;
		//this.isPermisoOrdenTipoDocumentoPersonal=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoDocumentoPersonalClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoDocumentoPersonalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoDocumentoPersonal(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoDocumentoPersonalClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoDocumentoPersonalClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoDocumentoPersonalClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoDocumentoPersonalClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoDocumentoPersonal() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoDocumentoPersonalJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoDocumentoPersonalConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoDocumentoPersonal=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoDocumentoPersonal=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoDocumentoPersonal=this.isPermisoActualizarTipoDocumentoPersonal;
			this.isPermisoEliminarTipoDocumentoPersonal=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoDocumentoPersonal=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoDocumentoPersonal=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoDocumentoPersonal=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoDocumentoPersonal=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoDocumentoPersonal=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDocumentoPersonal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoDocumentoPersonal=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoDocumentoPersonal=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoDocumentoPersonal=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoDocumentoPersonal=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoDocumentoPersonal=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoDocumentoPersonal=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDocumentoPersonal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoDocumentoPersonal.setToolTipText(this.jTableDatosTipoDocumentoPersonal.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoDocumentoPersonal(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoDocumentoPersonal(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoDocumentoPersonalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoDocumentoPersonalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoDocumentoPersonal() throws Exception {
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
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyTipoDocumentoPersonalListas()throws Exception {
		try	{						
			
				this.paissForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoDocumentoPersonalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoDocumentoPersonalJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoDocumentoPersonalListas(false);
			} else {
			
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyPaisListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.paissForeignKey==null||this.paissForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PaisConstantesFunciones.SFINALQUERY;

				this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTipoDocumentoPersonalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoDocumentoPersonalParameterReturnGeneral tipodocumentopersonalReturnGeneral=new TipoDocumentoPersonalParameterReturnGeneral();
						
			


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.tipodocumentopersonalConstantesFunciones.cargarid_paisTipoDocumentoPersonal)
					 || (this.esRecargarFks && this.tipodocumentopersonalConstantesFunciones.cargarid_paisTipoDocumentoPersonal)) {

					if(!this.tipodocumentopersonalSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+tipodocumentopersonalSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipodocumentopersonalReturnGeneral=tipodocumentopersonalLogic.cargarCombosLoteForeignKeyTipoDocumentoPersonal(finalQueryGlobalPais);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=tipodocumentopersonalReturnGeneral.getpaissForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoDocumentoPersonal()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPais();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {
			if(this.tipodocumentopersonalSessionBean==null) {
				this.tipodocumentopersonalSessionBean=new TipoDocumentoPersonalSessionBean();
			}

			if(!this.tipodocumentopersonalSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				Pais pais=new Pais();
				PaisConstantesFunciones.setPaisDescripcion(pais,Constantes.SMENSAJE_ESCOJA_OPCION);
				pais.setId(null);

				if(!PaisConstantesFunciones.ExisteEnLista(this.paissForeignKey,pais,true)) {

					this.paissForeignKey.add(0,pais);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTipoDocumentoPersonal()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoDocumentoPersonal(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoDocumentoPersonal()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDocumentoPersonal();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoDocumentoPersonal(TipoDocumentoPersonal tipodocumentopersonal)throws Exception {	
		try {
			
			this.setActualPaisForeignKey(tipodocumentopersonal.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoDocumentoPersonal(TipoDocumentoPersonal tipodocumentopersonal,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoDocumentoPersonal()throws Exception {	
		try {
			
			this.setActualPaisForeignKey(this.tipodocumentopersonalConstantesFunciones.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDocumentoPersonal()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoDocumentoPersonal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoDocumentoPersonal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoDocumentoPersonal()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoDocumentoPersonal()throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoDocumentoPersonal(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoDocumentoPersonal()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxid_paisTipoDocumentoPersonal!=null && this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxid_paisTipoDocumentoPersonal.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxid_paisTipoDocumentoPersonal.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoDocumentoPersonalBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoDocumentoPersonalBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoDocumentoPersonalBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipodocumentopersonalSessionBean=new TipoDocumentoPersonalSessionBean(); 
		this.tipodocumentopersonalConstantesFunciones=new TipoDocumentoPersonalConstantesFunciones(); 
		this.tipodocumentopersonalBean=new TipoDocumentoPersonal();//(this.tipodocumentopersonalConstantesFunciones); 		
		this.tipodocumentopersonalReturnGeneral=new TipoDocumentoPersonalParameterReturnGeneral(); 
		
		this.tipodocumentopersonalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodocumentopersonalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoDocumentoPersonalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoDocumentoPersonalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoDocumentoPersonalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoDocumentoPersonal(true);
			
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
			
			this.tipodocumentopersonalConstantesFunciones=new TipoDocumentoPersonalConstantesFunciones(); 
			this.tipodocumentopersonalBean=new TipoDocumentoPersonal();//this.tipodocumentopersonalConstantesFunciones); 			
			this.tipodocumentopersonalReturnGeneral=new TipoDocumentoPersonalParameterReturnGeneral(); 
		
			TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Documento Personal Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipodocumentopersonal=new TipoDocumentoPersonal();
			this.tipodocumentopersonals = new ArrayList<TipoDocumentoPersonal>();
			this.tipodocumentopersonalsAux = new ArrayList<TipoDocumentoPersonal>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic=new TipoDocumentoPersonalLogic();
				this.tipodocumentopersonalLogic.getNewConnexionToDeep("");
			}
			
			//this.tipodocumentopersonalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipodocumentopersonalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoDocumentoPersonal);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoDocumentoPersonal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDocumentoPersonal);	
					}
					
					if(this.jInternalFrameImportacionTipoDocumentoPersonal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDocumentoPersonal);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoDocumentoPersonal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoDocumentoPersonal);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDocumentoPersonal);
				this.jInternalFrameDetalleFormTipoDocumentoPersonal.setVisible(false);
				this.jInternalFrameDetalleFormTipoDocumentoPersonal.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoDocumentoPersonal!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDocumentoPersonal);
					this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoDocumentoPersonal!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoDocumentoPersonal);
					this.jInternalFrameImportacionTipoDocumentoPersonal.setVisible(false);
					this.jInternalFrameImportacionTipoDocumentoPersonal.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoDocumentoPersonal!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoDocumentoPersonal);
					this.jInternalFrameOrderByTipoDocumentoPersonal.setVisible(false);
					this.jInternalFrameOrderByTipoDocumentoPersonal.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoDocumentoPersonalActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoDocumentoPersonalConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipodocumentopersonalReturnGeneral=new TipoDocumentoPersonalParameterReturnGeneral();
			
			this.tipodocumentopersonalParameterGeneral=new TipoDocumentoPersonalParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipodocumentopersonalLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoDocumentoPersonalJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDocumentoPersonalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado(),this.tipodocumentopersonalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDocumentoPersonalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado(),this.tipodocumentopersonalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaDuplicarTipoDocumentoPersonal=true;
			this.isVisibilidadCeldaCopiarTipoDocumentoPersonal=true;
			this.isVisibilidadCeldaVerFormTipoDocumentoPersonal=true;
			this.isVisibilidadCeldaOrdenTipoDocumentoPersonal=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaModificarTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaActualizarTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaEliminarTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaCancelarTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaGuardarTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumentoPersonal=false;
			
			
			this.isVisibilidadFK_IdPais=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoDocumentoPersonal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoDocumentoPersonal();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoDocumentoPersonal(false);
			
			this.setPermisosUsuarioTipoDocumentoPersonal();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado() 
				|| (this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado() && this.tipodocumentopersonalSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoDocumentoPersonalClasesRelacionadas();
			}
			
			if(this.tipodocumentopersonalSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoDocumentoPersonalClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoDocumentoPersonal();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoDocumentoPersonal();
			}
			
			if(!this.isPermisoBusquedaTipoDocumentoPersonal) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoDocumentoPersonal.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoDocumentoPersonal,this.isPermisoPaginacionMedioTipoDocumentoPersonal,this.isPermisoPaginacionTodoTipoDocumentoPersonal);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoDocumentoPersonalConstantesFunciones.getTiposSeleccionarTipoDocumentoPersonal());
				
				this.tiposColumnasSelect=TipoDocumentoPersonalConstantesFunciones.getTiposSeleccionarTipoDocumentoPersonal(true);
				
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
			//if(!this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoDocumentoPersonal();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoDocumentoPersonal(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoDocumentoPersonal(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDocumentoPersonal() ;
			
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
			
			this.paisLogic=new PaisLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipodocumentopersonalImplementable= (TipoDocumentoPersonalImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDocumentoPersonalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipodocumentopersonalImplementableHome= (TipoDocumentoPersonalImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDocumentoPersonalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipodocumentopersonals= new ArrayList<TipoDocumentoPersonal>();
			this.tipodocumentopersonalsEliminados= new ArrayList<TipoDocumentoPersonal>();
						
			this.isEsNuevoTipoDocumentoPersonal=false;
			this.esParaAccionDesdeFormularioTipoDocumentoPersonal=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.paissForeignKey=new ArrayList<Pais>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoDocumentoPersonal(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoDocumentoPersonal();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoDocumentoPersonalConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoDocumentoPersonal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoDocumentoPersonal(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoDocumentoPersonal();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoDocumentoPersonal();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoDocumentoPersonal.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoDocumentoPersonal.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoDocumentoPersonal.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoDocumentoPersonal(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoDocumentoPersonal: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoDocumentoPersonal() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoDocumentoPersonal")) {
				iIndex=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTabbedPaneRelacionesTipoDocumentoPersonal.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTabbedPaneRelacionesTipoDocumentoPersonal.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoDocumentoPersonal.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoDocumentoPersonal();	
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
	
	public void cargarCombosForeignKeyTipoDocumentoPersonal(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoDocumentoPersonal(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoDocumentoPersonal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoDocumentoPersonalListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoDocumentoPersonal();
		
		this.cargarCombosFrameForeignKeyTipoDocumentoPersonal();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoDocumentoPersonal();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoDocumentoPersonal();
		}
	}
	
	

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPais(this.paissForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTipoDocumentoPersonalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipodocumentopersonalSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoDocumentoPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
			
			
			if(jTableDatosTipoDocumentoPersonal.getRowCount()>=1) {
				jTableDatosTipoDocumentoPersonal.removeRowSelectionInterval(0, jTableDatosTipoDocumentoPersonal.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoDocumentoPersonal=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoDocumentoPersonal(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoDocumentoPersonal(true);			
			//this.tipodocumentopersonal=new TipoDocumentoPersonal();
			//this.tipodocumentopersonal.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDocumentoPersonal(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDocumentoPersonal() ;
			
			if(TipoDocumentoPersonalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDocumentoPersonal(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipodocumentopersonal);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentopersonal);				
			
			TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
			
			if(this.tipodocumentopersonalSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoDocumentoPersonal: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoDocumentoPersonalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoDocumentoPersonal> tipodocumentopersonalsSeleccionados=new ArrayList<TipoDocumentoPersonal>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoDocumentoPersonal.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoDocumentoPersonal.getSelectedRows().length;			
			}
			
			tipodocumentopersonalsSeleccionados=this.getTipoDocumentoPersonalsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoDocumentoPersonal--;			
				//TipoDocumentoPersonal tipodocumentopersonalAux= new TipoDocumentoPersonal();			
				//tipodocumentopersonalAux.setId(this.iIdNuevoTipoDocumentoPersonal);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoDocumentoPersonal tipodocumentopersonalOrigen=new TipoDocumentoPersonal();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoDocumentoPersonal tipodocumentopersonalOrigen : tipodocumentopersonalsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoDocumentoPersonal.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipodocumentopersonalOrigen =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentopersonalOrigen =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoDocumentoPersonal();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipodocumentopersonal.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoDocumentoPersonal(tipodocumentopersonalOrigen,this.tipodocumentopersonal,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoPersonal(this.tipodocumentopersonal);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().add(this.tipodocumentopersonalAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodocumentopersonals.add(this.tipodocumentopersonalAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoDocumentoPersonal(false);
				
				this.jTableDatosTipoDocumentoPersonal.setRowSelectionInterval(this.getIndiceNuevoTipoDocumentoPersonal(), this.getIndiceNuevoTipoDocumentoPersonal());
				
				int iLastRow =  this.jTableDatosTipoDocumentoPersonal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDocumentoPersonal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDocumentoPersonal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDocumentoPersonal(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoDocumentoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoDocumentoPersonal> tipodocumentopersonalsSeleccionados=new ArrayList<TipoDocumentoPersonal>();									
		
			TipoDocumentoPersonal tipodocumentopersonalOrigen=new TipoDocumentoPersonal();
			TipoDocumentoPersonal tipodocumentopersonalDestino=new TipoDocumentoPersonal();
				
			tipodocumentopersonalsSeleccionados=this.getTipoDocumentoPersonalsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoDocumentoPersonal.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipodocumentopersonalsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoDocumentoPersonal.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentopersonalOrigen =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodocumentopersonalOrigen =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentopersonalDestino =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodocumentopersonalDestino =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipodocumentopersonalOrigen =tipodocumentopersonalsSeleccionados.get(0);
				tipodocumentopersonalDestino =tipodocumentopersonalsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoDocumentoPersonal(tipodocumentopersonalOrigen,tipodocumentopersonalDestino,true,false);
				
				tipodocumentopersonalDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodocumentopersonalDestino,tipodocumentopersonalLogic.getTipoDocumentoPersonals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodocumentopersonalDestino,tipodocumentopersonals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoDocumentoPersonal(false);
				
				//this.jTableDatosTipoDocumentoPersonal.setRowSelectionInterval(this.getIndiceNuevoTipoDocumentoPersonal(), this.getIndiceNuevoTipoDocumentoPersonal());
				
				int iLastRow =  this.jTableDatosTipoDocumentoPersonal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDocumentoPersonal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDocumentoPersonal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDocumentoPersonal(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoDocumentoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDocumentoPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoDocumentoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoDocumentoPersonal.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoDocumentoPersonal.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoDocumentoPersonal.setVisible(!isVisible);
			this.jPanelPaginacionTipoDocumentoPersonal.setVisible(!isVisible);
			this.jPanelAccionesTipoDocumentoPersonal.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoDocumentoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoDocumentoPersonal();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoDocumentoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoDocumentoPersonal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoDocumentoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoDocumentoPersonal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoDocumentoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoDocumentoPersonal();
			
			this.abrirFrameOrderByTipoDocumentoPersonal();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoDocumentoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoDocumentoPersonal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoDocumentoPersonal(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDocumentoPersonal);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoDocumentoPersonal.isMaximum()) {
					this.jInternalFrameDetalleFormTipoDocumentoPersonal.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoDocumentoPersonal.setSize(this.jInternalFrameDetalleFormTipoDocumentoPersonal.iWidthFormulario,this.jInternalFrameDetalleFormTipoDocumentoPersonal.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoDocumentoPersonal.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoDocumentoPersonal.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoDocumentoPersonal.isMaximum()) {
						this.jInternalFrameDetalleFormTipoDocumentoPersonal.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoDocumentoPersonal.jContentPaneDetalleTipoDocumentoPersonal.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTabbedPaneRelacionesTipoDocumentoPersonal.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoDocumentoPersonal.jContentPaneDetalleTipoDocumentoPersonal.getWidth(),TipoDocumentoPersonalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTabbedPaneRelacionesTipoDocumentoPersonal.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoDocumentoPersonal.jContentPaneDetalleTipoDocumentoPersonal.getWidth(),TipoDocumentoPersonalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTabbedPaneRelacionesTipoDocumentoPersonal.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoDocumentoPersonal.jContentPaneDetalleTipoDocumentoPersonal.getWidth(),TipoDocumentoPersonalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoDocumentoPersonal.setVisible(true);
	        this.jInternalFrameDetalleFormTipoDocumentoPersonal.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoDocumentoPersonal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoDocumentoPersonal==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoDocumentoPersonal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDocumentoPersonal,false,this);
				} else {
					this.jInternalFrameOrderByTipoDocumentoPersonal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDocumentoPersonal,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoDocumentoPersonal);
				this.jInternalFrameOrderByTipoDocumentoPersonal.setVisible(false);
				this.jInternalFrameOrderByTipoDocumentoPersonal.setSelected(false);
				
				this.jInternalFrameOrderByTipoDocumentoPersonal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDocumentoPersonal"));
				
				this.inicializarActualizarBindingTablaOrderByTipoDocumentoPersonal();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoDocumentoPersonal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoDocumentoPersonal==null) {
				
				this.jInternalFrameImportacionTipoDocumentoPersonal=new ImportacionJInternalFrame(TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDocumentoPersonal);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoDocumentoPersonal);
				this.jInternalFrameImportacionTipoDocumentoPersonal.setVisible(false);
				this.jInternalFrameImportacionTipoDocumentoPersonal.setSelected(false);


				this.jInternalFrameImportacionTipoDocumentoPersonal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDocumentoPersonal"));
				this.jInternalFrameImportacionTipoDocumentoPersonal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDocumentoPersonal"));
				this.jInternalFrameImportacionTipoDocumentoPersonal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDocumentoPersonal"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoDocumentoPersonal() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoDocumentoPersonal==null) {
				this.jInternalFrameReporteDinamicoTipoDocumentoPersonal=new ReporteDinamicoJInternalFrame(TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDocumentoPersonal);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDocumentoPersonal);
				this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDocumentoPersonal"));
				this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDocumentoPersonal"));
				this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDocumentoPersonal"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDocumentoPersonal();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoDocumentoPersonal() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDocumentoPersonal);
			
	       	this.jInternalFrameDetalleFormTipoDocumentoPersonal.setVisible(false);
	        this.jInternalFrameDetalleFormTipoDocumentoPersonal.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoDocumentoPersonal.dispose();
			//this.jInternalFrameDetalleFormTipoDocumentoPersonal=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoDocumentoPersonal() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoDocumentoPersonal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoDocumentoPersonal.setVisible(true);
	        this.jInternalFrameImportacionTipoDocumentoPersonal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoDocumentoPersonal() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoDocumentoPersonal.setVisible(true);
	        this.jInternalFrameOrderByTipoDocumentoPersonal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoDocumentoPersonal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoDocumentoPersonal.setVisible(false);
	        this.jInternalFrameOrderByTipoDocumentoPersonal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoDocumentoPersonal() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoDocumentoPersonal() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoDocumentoPersonal.setVisible(false);
	        this.jInternalFrameImportacionTipoDocumentoPersonal.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoDocumentoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoDocumentoPersonal(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoDocumentoPersonal(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDocumentoPersonal.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoDocumentoPersonal(true);
			//this.isEsNuevoTipoDocumentoPersonal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoDocumentoPersonal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDocumentoPersonal(false) ;
			
			if(tipodocumentopersonalSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoDocumentoPersonalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDocumentoPersonal(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDocumentoPersonal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoDocumentoPersonalActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoDocumentoPersonal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoDocumentoPersonal(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDocumentoPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDocumentoPersonal.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoDocumentoPersonal(true);
			//this.isEsNuevoTipoDocumentoPersonal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipodocumentopersonal.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoDocumentoPersonal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoDocumentoPersonal(false) ;
			
			if(TipoDocumentoPersonalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDocumentoPersonal(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDocumentoPersonal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosTipoDocumentoPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumentoPersonal,TipoDocumentoPersonalConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoDocumentoPersonal.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoDocumentoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoDocumentoPersonal(false);
			
			//if(!this.isEsNuevoTipoDocumentoPersonal) {								
				int intSelectedRow = this.jTableDatosTipoDocumentoPersonal.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoDocumentoPersonal(this.tipodocumentopersonal,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoPersonal(this.tipodocumentopersonal);
				
			}
			
			if(this.permiteMantenimiento(this.tipodocumentopersonal)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoDocumentoPersonal=true;
					this.inicializarActualizarBindingTablaTipoDocumentoPersonal(false);
					this.isEsNuevoTipoDocumentoPersonal=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoDocumentoPersonal=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoDocumentoPersonal=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDocumentoPersonal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDocumentoPersonal(false);
				
				this.habilitarDeshabilitarControlesTipoDocumentoPersonal(false);
			
												
				
				if(TipoDocumentoPersonalJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoDocumentoPersonal();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoDocumentoPersonalActionPerformed(evt,tipodocumentopersonalSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoDocumentoPersonal(this.tipodocumentopersonal,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoDocumentoPersonal.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipodocumentopersonalSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipodocumentopersonal.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoDocumentoPersonal.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumentoPersonal.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoDocumentoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoDocumentoPersonal.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
				this.tipodocumentopersonal.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
				this.tipodocumentopersonal.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipodocumentopersonal)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoDocumentoPersonalModel) this.jTableDatosTipoDocumentoPersonal.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoDocumentoPersonal=true;
				this.inicializarActualizarBindingTablaTipoDocumentoPersonal(false);
				this.isEsNuevoTipoDocumentoPersonal=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDocumentoPersonal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDocumentoPersonal(false);
				
				this.habilitarDeshabilitarControlesTipoDocumentoPersonal(false);
				
				
				
				if(TipoDocumentoPersonalJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoDocumentoPersonal();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoDocumentoPersonalActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoDocumentoPersonal.getRowCount()>=1) {
				jTableDatosTipoDocumentoPersonal.removeRowSelectionInterval(0, jTableDatosTipoDocumentoPersonal.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoDocumentoPersonal(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoDocumentoPersonal(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDocumentoPersonal(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDocumentoPersonal(false) ;
			
			this.isEsNuevoTipoDocumentoPersonal=false;
			
			if(TipoDocumentoPersonalJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoDocumentoPersonal();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoDocumentoPersonalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoDocumentoPersonal(false);
				
				//SI ES MANUAL
				if(TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoDocumentoPersonal();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoDocumentoPersonalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoDocumentoPersonal--;			
			//TipoDocumentoPersonal tipodocumentopersonalAux= new TipoDocumentoPersonal();			
			//tipodocumentopersonalAux.setId(this.iIdNuevoTipoDocumentoPersonal);
			
			if(this.jInternalFrameDetalleFormTipoDocumentoPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoDocumentoPersonal();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoPersonal(this.tipodocumentopersonal);
			
			this.tipodocumentopersonal.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().add(this.tipodocumentopersonalAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipodocumentopersonals.add(this.tipodocumentopersonalAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoDocumentoPersonal(false);
			
			this.jTableDatosTipoDocumentoPersonal.setRowSelectionInterval(this.getIndiceNuevoTipoDocumentoPersonal(), this.getIndiceNuevoTipoDocumentoPersonal());
			
			int iLastRow =  this.jTableDatosTipoDocumentoPersonal.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoDocumentoPersonal.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoDocumentoPersonal.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoDocumentoPersonal(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoDocumentoPersonalActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoDocumentoPersonal(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDocumentoPersonal(false);
			
			//SI ES MANUAL
			if(TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDocumentoPersonal();
			}
			
			//this.abrirFrameTreeTipoDocumentoPersonal();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoDocumentoPersonalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Documento PersonalS ?", "MANTENIMIENTO DE Tipo Documento Personal", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoDocumentoPersonal.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoDocumentoPersonal();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipodocumentopersonalReturnGeneral=tipodocumentopersonalLogic.procesarImportacionTipoDocumentoPersonalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipodocumentopersonalParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoDocumentoPersonalReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoDocumentoPersonalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoDocumentoPersonal.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoDocumentoPersonal.setFileImportacion(this.jInternalFrameImportacionTipoDocumentoPersonal.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoDocumentoPersonal.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoDocumentoPersonal.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoDocumentoPersonal.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoDocumentoPersonal.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoDocumentoPersonalActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoDocumentoPersonal> tipodocumentopersonalsSeleccionados=new ArrayList<TipoDocumentoPersonal>();		

		tipodocumentopersonalsSeleccionados=this.getTipoDocumentoPersonalsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoDocumentoPersonalBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoDocumentoPersonalBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoDocumentoPersonals("Todos",tipodocumentopersonalsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Documento Personal",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDocumentoPersonalConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDocumentoPersonalConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDocumentoPersonalConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoDocumentoPersonalConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case TipoDocumentoPersonalConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoDocumentoPersonalConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoDocumentoPersonalConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case TipoDocumentoPersonalConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoDocumentoPersonalConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDocumentoPersonalConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case TipoDocumentoPersonalConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoDocumentoPersonalConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoDocumentoPersonalActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoDocumentoPersonal> tipodocumentopersonalsSeleccionados=new ArrayList<TipoDocumentoPersonal>();		
		
		tipodocumentopersonalsSeleccionados=this.getTipoDocumentoPersonalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodocumentopersonal";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoDocumentoPersonals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoDocumentoPersonalConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDocumentoPersonalConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(TipoDocumentoPersonal tipodocumentopersonal:tipodocumentopersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodocumentopersonal.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDocumentoPersonalConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDocumentoPersonalConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoDocumentoPersonal tipodocumentopersonal:tipodocumentopersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodocumentopersonal.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDocumentoPersonalConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDocumentoPersonalConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoDocumentoPersonal tipodocumentopersonal:tipodocumentopersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodocumentopersonal.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoDocumentoPersonal(row);				
			//	iRow++;
			//}				
			
			//for(TipoDocumentoPersonal tipodocumentopersonalAux:tipodocumentopersonalsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoDocumentoPersonal(tipodocumentopersonalAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Documento Personal",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipodocumentopersonalLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDocumentoPersonal(false);
			
			//SI ES MANUAL
			if(TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDocumentoPersonal();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoDocumentoPersonalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDocumentoPersonal(false);
			
			//SI ES MANUAL
			if(TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDocumentoPersonal();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoDocumentoPersonalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDocumentoPersonal(false);
			
			//SI ES MANUAL
			if(TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDocumentoPersonal();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoDocumentoPersonal() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoDocumentoPersonal.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoDocumentoPersonal.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoDocumentoPersonal.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoDocumentoPersonal.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoDocumentoPersonal.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoDocumentoPersonal.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoDocumentoPersonal.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoDocumentoPersonal(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoDocumentoPersonal(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoDocumentoPersonal(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoDocumentoPersonal(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoDocumentoPersonal(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoDocumentoPersonal(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDocumentoPersonal(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoDocumentoPersonal(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoDocumentoPersonal() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoDocumentoPersonal();
		
		this.inicializarActualizarBindingBotonesManualTipoDocumentoPersonal(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDocumentoPersonal();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDocumentoPersonal() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDocumentoPersonal(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDocumentoPersonal(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoDocumentoPersonal.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoDocumentoPersonal.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoDocumentoPersonal.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jCheckBoxPostAccionNuevoTipoDocumentoPersonal.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jCheckBoxPostAccionSinCerrarTipoDocumentoPersonal.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jCheckBoxPostAccionSinMensajeTipoDocumentoPersonal.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoDocumentoPersonal.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoDocumentoPersonal.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoDocumentoPersonal.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {
				this.jInternalFrameDetalleFormTipoDocumentoPersonal.jCheckBoxPostAccionNuevoTipoDocumentoPersonal.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoDocumentoPersonal.jCheckBoxPostAccionSinCerrarTipoDocumentoPersonal.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoDocumentoPersonal.jCheckBoxPostAccionSinMensajeTipoDocumentoPersonal.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoDocumentoPersonal.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoDocumentoPersonal.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxTiposAccionesFormularioTipoDocumentoPersonal.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoDocumentoPersonal.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoDocumentoPersonal!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoDocumentoPersonal.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoDocumentoPersonal.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoDocumentoPersonal.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoDocumentoPersonal.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoDocumentoPersonal!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoDocumentoPersonal.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoDocumentoPersonal.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoDocumentoPersonal(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDocumentoPersonal(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoDocumentoPersonal() throws Exception {
		try	{
			if(TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDocumentoPersonal();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDocumentoPersonal() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxTiposAccionesFormularioTipoDocumentoPersonal.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxTiposAccionesFormularioTipoDocumentoPersonal.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDocumentoPersonal() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoDocumentoPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoDocumentoPersonal.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoDocumentoPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoDocumentoPersonal.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoDocumentoPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoDocumentoPersonal.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoDocumentoPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoDocumentoPersonal.addItem(reporte);
			}
			
			
			if(!this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoDocumentoPersonal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoDocumentoPersonal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoDocumentoPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoDocumentoPersonal.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoDocumentoPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoDocumentoPersonal.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxTiposAccionesFormularioTipoDocumentoPersonal.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxTiposAccionesFormularioTipoDocumentoPersonal.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoDocumentoPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoDocumentoPersonal.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoDocumentoPersonal.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDocumentoPersonal();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDocumentoPersonal() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDocumentoPersonal!=null) {
				this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDocumentoPersonal!=null) {
				this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoDocumentoPersonal!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoDocumentoPersonal()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_paisFK_IdPaisTipoDocumentoPersonal.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisTipoDocumentoPersonal.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoDocumentoPersonal(Boolean esInicializar) throws Exception {				
		if(TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDocumentoPersonal();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoDocumentoPersonal() throws Exception {
		this.inicializarActualizarBindingTablaTipoDocumentoPersonal(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoDocumentoPersonal() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoDocumentoPersonal.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoDocumentoPersonal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDocumentoPersonal.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoDocumentoPersonalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoDocumentoPersonal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDocumentoPersonal.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoDocumentoPersonalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoDocumentoPersonalOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumentoPersonalOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoDocumentoPersonalPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoDocumentoPersonal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDocumentoPersonal.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoDocumentoPersonalPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoDocumentoPersonal.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoDocumentoPersonal(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipodocumentopersonalLogic.getTipoDocumentoPersonals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipodocumentopersonals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoDocumentoPersonal.setModel(new TipoDocumentoPersonalModel(this.tipodocumentopersonalLogic.getTipoDocumentoPersonals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoDocumentoPersonal.setModel(new TipoDocumentoPersonalModel(this.tipodocumentopersonals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoDocumentoPersonal!=null && this.jInternalFrameOrderByTipoDocumentoPersonal.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoDocumentoPersonal();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoDocumentoPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumentoPersonal,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoDocumentoPersonalPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO,tipodocumentopersonalConstantesFunciones.resaltarSeleccionarTipoDocumentoPersonal,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoDocumentoPersonalConstantesFunciones.SCLASSWEBTITULO,tipodocumentopersonalConstantesFunciones.resaltarSeleccionarTipoDocumentoPersonal,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoDocumentoPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumentoPersonal,TipoDocumentoPersonalConstantesFunciones.LABEL_ID));

		if(this.tipodocumentopersonalConstantesFunciones.mostraridTipoDocumentoPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDocumentoPersonalConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipodocumentopersonalConstantesFunciones.resaltaridTipoDocumentoPersonal,this.tipodocumentopersonalConstantesFunciones.activaridTipoDocumentoPersonal,this,true,"idTipoDocumentoPersonal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodocumentopersonalConstantesFunciones.resaltaridTipoDocumentoPersonal,this.tipodocumentopersonalConstantesFunciones.activaridTipoDocumentoPersonal,this,true,"idTipoDocumentoPersonal","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDocumentoPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumentoPersonal,TipoDocumentoPersonalConstantesFunciones.LABEL_IDPAIS));

		if(this.tipodocumentopersonalConstantesFunciones.mostrarid_paisTipoDocumentoPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDocumentoPersonalConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.tipodocumentopersonalConstantesFunciones.resaltarid_paisTipoDocumentoPersonal,this,this.tipodocumentopersonalConstantesFunciones.activarid_paisTipoDocumentoPersonal));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.tipodocumentopersonalConstantesFunciones.resaltarid_paisTipoDocumentoPersonal,this,this.tipodocumentopersonalConstantesFunciones.activarid_paisTipoDocumentoPersonal,true,"id_paisTipoDocumentoPersonal","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDocumentoPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDocumentoPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumentoPersonal,TipoDocumentoPersonalConstantesFunciones.LABEL_CODIGO));

		if(this.tipodocumentopersonalConstantesFunciones.mostrarcodigoTipoDocumentoPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDocumentoPersonalConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodocumentopersonalConstantesFunciones.resaltarcodigoTipoDocumentoPersonal,this.tipodocumentopersonalConstantesFunciones.activarcodigoTipoDocumentoPersonal,this,true,"codigoTipoDocumentoPersonal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodocumentopersonalConstantesFunciones.resaltarcodigoTipoDocumentoPersonal,this.tipodocumentopersonalConstantesFunciones.activarcodigoTipoDocumentoPersonal,this,true,"codigoTipoDocumentoPersonal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDocumentoPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDocumentoPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumentoPersonal,TipoDocumentoPersonalConstantesFunciones.LABEL_NOMBRE));

		if(this.tipodocumentopersonalConstantesFunciones.mostrarnombreTipoDocumentoPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDocumentoPersonalConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodocumentopersonalConstantesFunciones.resaltarnombreTipoDocumentoPersonal,this.tipodocumentopersonalConstantesFunciones.activarnombreTipoDocumentoPersonal,this,true,"nombreTipoDocumentoPersonal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodocumentopersonalConstantesFunciones.resaltarnombreTipoDocumentoPersonal,this.tipodocumentopersonalConstantesFunciones.activarnombreTipoDocumentoPersonal,this,true,"nombreTipoDocumentoPersonal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDocumentoPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDocumentoPersonal.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDocumentoPersonal.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoDocumentoPersonal && this.isPermisoGuardarCambiosTipoDocumentoPersonal) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoDocumentoPersonal.addColumn(tableColumn);
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
			
			this.jTableDatosTipoDocumentoPersonal.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDocumentoPersonal && this.isPermisoGuardarCambiosTipoDocumentoPersonal) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDocumentoPersonal && this.isPermisoGuardarCambiosTipoDocumentoPersonal) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoDocumentoPersonal.moveColumn(this.jTableDatosTipoDocumentoPersonal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoDocumentoPersonal.moveColumn(this.jTableDatosTipoDocumentoPersonal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoDocumentoPersonal.moveColumn(this.jTableDatosTipoDocumentoPersonal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoDocumentoPersonal.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoDocumentoPersonal.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoDocumentoPersonal,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoDocumentoPersonal.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoDocumentoPersonal.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoDocumentoPersonal.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoDocumentoPersonal.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoDocumentoPersonal.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipodocumentopersonalLogic.getTipoDocumentoPersonals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipodocumentopersonals.size()-1;
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
		//this.jTableDatosTipoDocumentoPersonal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoDocumentoPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoDocumentoPersonal();
			
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
				
				//this.isEsNuevoTipoDocumentoPersonal=false;
					
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
			
				if(this.tipodocumentopersonalSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoDocumentoPersonal==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDocumentoPersonal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDocumentoPersonal.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipodocumentopersonal.getsType().equals("DUPLICADO")
				   || this.tipodocumentopersonal.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoDocumentoPersonal=true;
				
				} else {
					this.isEsNuevoTipoDocumentoPersonal=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
					if(this.tipodocumentopersonal.getId()>=0 && !this.tipodocumentopersonal.getIsNew()) {						
						this.isEsNuevoTipoDocumentoPersonal=false;
						
					} else {
						this.isEsNuevoTipoDocumentoPersonal=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoDocumentoPersonal(esRelaciones);						
				
				this.seleccionarTipoDocumentoPersonal(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipodocumentopersonal.getId()<0) {
					this.isEsNuevoTipoDocumentoPersonal=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoDocumentoPersonal(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoDocumentoPersonal(evt,rowIndex);
				}	
				
				if(this.tipodocumentopersonalSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoDocumentoPersonal: " + this.dDif); 
					}
				}								
				
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoDocumentoPersonal(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipodocumentopersonal)) {
					if(this.tipodocumentopersonal.getId()>0) {
						this.tipodocumentopersonal.setIsDeleted(true);
						
						this.tipodocumentopersonalsEliminados.add(this.tipodocumentopersonal);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().remove(this.tipodocumentopersonal);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodocumentopersonals.remove(this.tipodocumentopersonal);				
					}
					
					
					((TipoDocumentoPersonalModel) this.jTableDatosTipoDocumentoPersonal.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDocumentoPersonal(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoDocumentoPersonal(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoDocumentoPersonal) {
			
			if(this.jInternalFrameDetalleFormTipoDocumentoPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDocumentoPersonal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDocumentoPersonal.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoDocumentoPersonal(this.tipodocumentopersonal);
				}
				
				//ARCHITECTURE
				try {
					

					//Pais
					if(!this.tipodocumentopersonalConstantesFunciones.cargarid_paisTipoDocumentoPersonal || this.tipodocumentopersonalConstantesFunciones.event_dependid_paisTipoDocumentoPersonal) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.tipodocumentopersonal.getid_pais());
									//this.inicializarActualizarBindingTipoDocumentoPersonal(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(tipodocumentopersonal.getPais()!=null) {
							this.paissForeignKey.add(tipodocumentopersonal.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.tipodocumentopersonal.getid_pais(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoDocumentoPersonal("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoDocumentoPersonal(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDocumentoPersonal() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDocumentoPersonal(TipoDocumentoPersonal tipodocumentopersonal) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoDocumentoPersonal(tipodocumentopersonal,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDocumentoPersonal(TipoDocumentoPersonal tipodocumentopersonal,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoDocumentoPersonal(tipodocumentopersonal);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoDocumentoPersonal(tipodocumentopersonal,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoDocumentoPersonal(tipodocumentopersonal);
	}
	
	public void setVariablesObjetoActualToFormularioTipoDocumentoPersonal(TipoDocumentoPersonal tipodocumentopersonal) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoDocumentoPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextFieldidTipoDocumentoPersonal.setText(tipodocumentopersonal.getId().toString());
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextFieldcodigoTipoDocumentoPersonal.setText(tipodocumentopersonal.getcodigo());
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextAreanombreTipoDocumentoPersonal.setText(tipodocumentopersonal.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoDocumentoPersonal tipodocumentopersonalLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipodocumentopersonalLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoDocumentoPersonal tipodocumentopersonalLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipodocumentopersonalLocal=this.tipodocumentopersonal;
			} else {
				tipodocumentopersonalLocal=this.tipodocumentopersonalAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipodocumentopersonalLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoDocumentoPersonal(tipodocumentopersonalLocal,true);
					
					if(tipodocumentopersonalSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipodocumentopersonalLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipodocumentopersonalLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoDocumentoPersonal(TipoDocumentoPersonal tipodocumentopersonal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDocumentoPersonal(tipodocumentopersonal,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoPersonal(tipodocumentopersonal);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDocumentoPersonal(TipoDocumentoPersonal tipodocumentopersonal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDocumentoPersonal(tipodocumentopersonal,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDocumentoPersonal(TipoDocumentoPersonal tipodocumentopersonal,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoDocumentoPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextFieldidTipoDocumentoPersonal.getText()==null || this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextFieldidTipoDocumentoPersonal.getText()=="" || this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextFieldidTipoDocumentoPersonal.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextFieldidTipoDocumentoPersonal.setText("0");
			}

			if(conColumnasBase) {tipodocumentopersonal.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextFieldidTipoDocumentoPersonal.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDocumentoPersonalConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDocumentoPersonal.jLabelIdTipoDocumentoPersonal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodocumentopersonal.setcodigo(this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextFieldcodigoTipoDocumentoPersonal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDocumentoPersonalConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDocumentoPersonal.jLabelcodigoTipoDocumentoPersonal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodocumentopersonal.setnombre(this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextAreanombreTipoDocumentoPersonal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDocumentoPersonalConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDocumentoPersonal.jLabelnombreTipoDocumentoPersonal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDocumentoPersonal(TipoDocumentoPersonal tipodocumentopersonalBean,TipoDocumentoPersonal tipodocumentopersonal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tipodocumentopersonalBean.getid_pais()!=null && !tipodocumentopersonalBean.getid_pais().equals(-1L))) {tipodocumentopersonal.setid_pais(tipodocumentopersonalBean.getid_pais());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoDocumentoPersonal(TipoDocumentoPersonal tipodocumentopersonalOrigen,TipoDocumentoPersonal tipodocumentopersonal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodocumentopersonalOrigen.getId()!=null && !tipodocumentopersonalOrigen.getId().equals(0L))) {tipodocumentopersonal.setId(tipodocumentopersonalOrigen.getId());}}
			if(conDefault || (!conDefault && tipodocumentopersonalOrigen.getid_pais()!=null && !tipodocumentopersonalOrigen.getid_pais().equals(-1L))) {tipodocumentopersonal.setid_pais(tipodocumentopersonalOrigen.getid_pais());}
			if(conDefault || (!conDefault && tipodocumentopersonalOrigen.getcodigo()!=null && !tipodocumentopersonalOrigen.getcodigo().equals(""))) {tipodocumentopersonal.setcodigo(tipodocumentopersonalOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipodocumentopersonalOrigen.getnombre()!=null && !tipodocumentopersonalOrigen.getnombre().equals(""))) {tipodocumentopersonal.setnombre(tipodocumentopersonalOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDocumentoPersonal(TipoDocumentoPersonal tipodocumentopersonal) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextFieldidTipoDocumentoPersonal.setText(tipodocumentopersonal.getId().toString());
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextFieldcodigoTipoDocumentoPersonal.setText(tipodocumentopersonal.getcodigo());
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextAreanombreTipoDocumentoPersonal.setText(tipodocumentopersonal.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDocumentoPersonal(TipoDocumentoPersonalBean tipodocumentopersonalBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextFieldidTipoDocumentoPersonal.setText(tipodocumentopersonalBean.getId().toString());
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextFieldcodigoTipoDocumentoPersonal.setText(tipodocumentopersonalBean.getcodigo());
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextAreanombreTipoDocumentoPersonal.setText(tipodocumentopersonalBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoDocumentoPersonal(TipoDocumentoPersonalParameterReturnGeneral tipodocumentopersonalReturnGeneral,TipoDocumentoPersonalBean tipodocumentopersonalBean,Boolean conDefault) throws Exception { 
		try {
			TipoDocumentoPersonal tipodocumentopersonalLocal=new TipoDocumentoPersonal();
			
			tipodocumentopersonalLocal=tipodocumentopersonalReturnGeneral.getTipoDocumentoPersonal();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodocumentopersonalLocal.getId()!=null && !tipodocumentopersonalLocal.getId().equals(0L))) {tipodocumentopersonalBean.setId(tipodocumentopersonalLocal.getId());}}
			if(conDefault || (!conDefault && tipodocumentopersonalLocal.getid_pais()!=null && !tipodocumentopersonalLocal.getid_pais().equals(-1L))) {tipodocumentopersonalBean.setid_pais(tipodocumentopersonalLocal.getid_pais());}
			if(conDefault || (!conDefault && tipodocumentopersonalLocal.getcodigo()!=null && !tipodocumentopersonalLocal.getcodigo().equals(""))) {tipodocumentopersonalBean.setcodigo(tipodocumentopersonalLocal.getcodigo());}
			if(conDefault || (!conDefault && tipodocumentopersonalLocal.getnombre()!=null && !tipodocumentopersonalLocal.getnombre().equals(""))) {tipodocumentopersonalBean.setnombre(tipodocumentopersonalLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoDocumentoPersonalGenerico(Long idTipoDocumentoPersonalSeleccionado,JComboBox jComboBoxTipoDocumentoPersonal,List<TipoDocumentoPersonal> tipodocumentopersonalsLocal)throws Exception {
		try {
			TipoDocumentoPersonal  tipodocumentopersonalTemp=null;

			for(TipoDocumentoPersonal tipodocumentopersonalAux:tipodocumentopersonalsLocal) {
				if(tipodocumentopersonalAux.getId()!=null && tipodocumentopersonalAux.getId().equals(idTipoDocumentoPersonalSeleccionado)) {
					tipodocumentopersonalTemp=tipodocumentopersonalAux;
					break;
				}
			}

			jComboBoxTipoDocumentoPersonal.setSelectedItem(tipodocumentopersonalTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoDocumentoPersonalGenerico(JComboBox jComboBoxTipoDocumentoPersonal,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoDocumentoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDocumentoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoDocumentoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDocumentoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDocumentoPersonal.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoDocumentoPersonal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDocumentoPersonal.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoDocumentoPersonal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoDocumentoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoDocumentoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodocumentopersonal=(TipoDocumentoPersonal) tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodocumentopersonal =(TipoDocumentoPersonal) tipodocumentopersonals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!tipodocumentopersonal.getIsNew() && !tipodocumentopersonal.getIsChanged() && !tipodocumentopersonal.getIsDeleted()) {
				sDescripcion=tipodocumentopersonal.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=tipodocumentopersonal.getpais_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoDocumentoPersonal tipodocumentopersonalRow=new TipoDocumentoPersonal();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodocumentopersonalRow=(TipoDocumentoPersonal) tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodocumentopersonalRow=(TipoDocumentoPersonal) tipodocumentopersonals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoDocumentoPersonal(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaNuevoTipoDocumentoPersonal && this.isPermisoNuevoTipoDocumentoPersonal));			
			this.jButtonDuplicarTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaDuplicarTipoDocumentoPersonal && this.isPermisoDuplicarTipoDocumentoPersonal));			
			this.jButtonCopiarTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaCopiarTipoDocumentoPersonal && this.isPermisoCopiarTipoDocumentoPersonal));
			this.jButtonVerFormTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaVerFormTipoDocumentoPersonal && this.isPermisoVerFormTipoDocumentoPersonal));
			
			this.jButtonAbrirOrderByTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaOrdenTipoDocumentoPersonal && this.isPermisoOrdenTipoDocumentoPersonal));			
			
			this.jButtonNuevoRelacionesTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal && this.isPermisoNuevoTipoDocumentoPersonal));			
			this.jButtonNuevoGuardarCambiosTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaNuevoTipoDocumentoPersonal && this.isPermisoNuevoTipoDocumentoPersonal && this.isPermisoGuardarCambiosTipoDocumentoPersonal));
			
			if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonModificarTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaModificarTipoDocumentoPersonal && this.isPermisoActualizarTipoDocumentoPersonal));	
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonActualizarTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaActualizarTipoDocumentoPersonal && this.isPermisoActualizarTipoDocumentoPersonal));	
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonEliminarTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaEliminarTipoDocumentoPersonal && this.isPermisoEliminarTipoDocumentoPersonal));
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonCancelarTipoDocumentoPersonal.setVisible(this.isVisibilidadCeldaCancelarTipoDocumentoPersonal);							
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonGuardarCambiosTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaGuardarTipoDocumentoPersonal && this.isPermisoGuardarCambiosTipoDocumentoPersonal));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDocumentoPersonal && this.isPermisoGuardarCambiosTipoDocumentoPersonal));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaNuevoTipoDocumentoPersonal && this.isPermisoNuevoTipoDocumentoPersonal));						
			this.jButtonDuplicarToolBarTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaDuplicarTipoDocumentoPersonal && this.isPermisoDuplicarTipoDocumentoPersonal));						
			this.jButtonCopiarToolBarTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaCopiarTipoDocumentoPersonal && this.isPermisoCopiarTipoDocumentoPersonal));			
			this.jButtonVerFormToolBarTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaVerFormTipoDocumentoPersonal && this.isPermisoVerFormTipoDocumentoPersonal));			
			this.jButtonAbrirOrderByToolBarTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaOrdenTipoDocumentoPersonal && this.isPermisoOrdenTipoDocumentoPersonal));
			this.jButtonNuevoRelacionesToolBarTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal && this.isPermisoNuevoTipoDocumentoPersonal));			
			this.jButtonNuevoGuardarCambiosToolBarTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaNuevoTipoDocumentoPersonal && this.isPermisoNuevoTipoDocumentoPersonal && this.isPermisoGuardarCambiosTipoDocumentoPersonal));			
			
			if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonModificarToolBarTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaModificarTipoDocumentoPersonal && this.isPermisoActualizarTipoDocumentoPersonal));	
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonActualizarToolBarTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaActualizarTipoDocumentoPersonal  && this.isPermisoActualizarTipoDocumentoPersonal));	
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonEliminarToolBarTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaEliminarTipoDocumentoPersonal && this.isPermisoEliminarTipoDocumentoPersonal));
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonCancelarToolBarTipoDocumentoPersonal.setVisible(this.isVisibilidadCeldaCancelarTipoDocumentoPersonal);				
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonGuardarCambiosToolBarTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaGuardarTipoDocumentoPersonal && this.isPermisoGuardarCambiosTipoDocumentoPersonal));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDocumentoPersonal && this.isPermisoGuardarCambiosTipoDocumentoPersonal));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaNuevoTipoDocumentoPersonal && this.isPermisoNuevoTipoDocumentoPersonal));			
			this.jMenuItemDuplicarTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaDuplicarTipoDocumentoPersonal && this.isPermisoDuplicarTipoDocumentoPersonal));			
			this.jMenuItemCopiarTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaCopiarTipoDocumentoPersonal && this.isPermisoCopiarTipoDocumentoPersonal));			
			this.jMenuItemVerFormTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaVerFormTipoDocumentoPersonal && this.isPermisoVerFormTipoDocumentoPersonal));			
			this.jMenuItemAbrirOrderByTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaOrdenTipoDocumentoPersonal && this.isPermisoOrdenTipoDocumentoPersonal));			
			//this.jMenuItemMostrarOcultarTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaOrdenTipoDocumentoPersonal && this.isPermisoOrdenTipoDocumentoPersonal));
			this.jMenuItemDetalleAbrirOrderByTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaOrdenTipoDocumentoPersonal && this.isPermisoOrdenTipoDocumentoPersonal));			
			//this.jMenuItemDetalleMostrarOcultarTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaOrdenTipoDocumentoPersonal && this.isPermisoOrdenTipoDocumentoPersonal));			
			this.jMenuItemNuevoRelacionesTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal && this.isPermisoNuevoTipoDocumentoPersonal));			
			this.jMenuItemNuevoGuardarCambiosTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaNuevoTipoDocumentoPersonal && this.isPermisoNuevoTipoDocumentoPersonal && this.isPermisoGuardarCambiosTipoDocumentoPersonal));									
			
			if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jMenuItemModificarTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaModificarTipoDocumentoPersonal && this.isPermisoActualizarTipoDocumentoPersonal));	
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jMenuItemActualizarTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaActualizarTipoDocumentoPersonal && this.isPermisoActualizarTipoDocumentoPersonal));	
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jMenuItemEliminarTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaEliminarTipoDocumentoPersonal && this.isPermisoEliminarTipoDocumentoPersonal));
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jMenuItemCancelarTipoDocumentoPersonal.setVisible(this.isVisibilidadCeldaCancelarTipoDocumentoPersonal);				
			}
			
			this.jMenuItemGuardarCambiosTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaGuardarTipoDocumentoPersonal && this.isPermisoGuardarCambiosTipoDocumentoPersonal));						
			this.jMenuItemGuardarCambiosTablaTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDocumentoPersonal && this.isPermisoGuardarCambiosTipoDocumentoPersonal));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoDocumentoPersonal=this.jButtonNuevoTipoDocumentoPersonal.isVisible();
			this.isVisibilidadCeldaDuplicarTipoDocumentoPersonal=this.jButtonDuplicarTipoDocumentoPersonal.isVisible();
			this.isVisibilidadCeldaCopiarTipoDocumentoPersonal=this.jButtonCopiarTipoDocumentoPersonal.isVisible();
			this.isVisibilidadCeldaVerFormTipoDocumentoPersonal=this.jButtonVerFormTipoDocumentoPersonal.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoDocumentoPersonal=this.jButtonAbrirOrderByTipoDocumentoPersonal.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal=this.jButtonNuevoRelacionesTipoDocumentoPersonal.isVisible();
			this.isVisibilidadCeldaModificarTipoDocumentoPersonal=this.jButtonModificarTipoDocumentoPersonal.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {
			this.isVisibilidadCeldaActualizarTipoDocumentoPersonal=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonActualizarTipoDocumentoPersonal.isVisible();
			this.isVisibilidadCeldaEliminarTipoDocumentoPersonal=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonEliminarTipoDocumentoPersonal.isVisible();
			this.isVisibilidadCeldaCancelarTipoDocumentoPersonal=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonCancelarTipoDocumentoPersonal.isVisible();
			this.isVisibilidadCeldaGuardarTipoDocumentoPersonal=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonGuardarCambiosTipoDocumentoPersonal.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoDocumentoPersonal=this.jButtonGuardarCambiosTablaTipoDocumentoPersonal.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoDocumentoPersonal=this.jButtonNuevoToolBarTipoDocumentoPersonal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal=this.jButtonNuevoRelacionesToolBarTipoDocumentoPersonal.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {
			this.isVisibilidadCeldaModificarTipoDocumentoPersonal=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonModificarToolBarTipoDocumentoPersonal.isVisible();
			this.isVisibilidadCeldaActualizarTipoDocumentoPersonal=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonActualizarToolBarTipoDocumentoPersonal.isVisible();
			this.isVisibilidadCeldaEliminarTipoDocumentoPersonal=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonEliminarToolBarTipoDocumentoPersonal.isVisible();
			this.isVisibilidadCeldaCancelarTipoDocumentoPersonal=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonCancelarToolBarTipoDocumentoPersonal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDocumentoPersonal=this.jButtonGuardarCambiosToolBarTipoDocumentoPersonal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDocumentoPersonal=this.jButtonGuardarCambiosTablaToolBarTipoDocumentoPersonal.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoDocumentoPersonal=this.jMenuItemNuevoTipoDocumentoPersonal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal=this.jMenuItemNuevoRelacionesTipoDocumentoPersonal.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {
			this.isVisibilidadCeldaModificarTipoDocumentoPersonal=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jMenuItemModificarTipoDocumentoPersonal.isVisible();
			this.isVisibilidadCeldaActualizarTipoDocumentoPersonal=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jMenuItemActualizarTipoDocumentoPersonal.isVisible();
			this.isVisibilidadCeldaEliminarTipoDocumentoPersonal=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jMenuItemEliminarTipoDocumentoPersonal.isVisible();
			this.isVisibilidadCeldaCancelarTipoDocumentoPersonal=this.jInternalFrameDetalleFormTipoDocumentoPersonal.jMenuItemCancelarTipoDocumentoPersonal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDocumentoPersonal=this.jMenuItemGuardarCambiosTipoDocumentoPersonal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDocumentoPersonal=this.jMenuItemGuardarCambiosTablaTipoDocumentoPersonal.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoDocumentoPersonal(Boolean esInicializar) {
		if(TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipodocumentopersonalSessionBean.getConGuardarRelaciones()) {
				//if(this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDocumentoPersonal();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoDocumentoPersonal(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoDocumentoPersonal() {
		this.jButtonNuevoTipoDocumentoPersonal.setVisible(this.isPermisoNuevoTipoDocumentoPersonal);			
		this.jButtonDuplicarTipoDocumentoPersonal.setVisible(this.isPermisoDuplicarTipoDocumentoPersonal);			
		this.jButtonCopiarTipoDocumentoPersonal.setVisible(this.isPermisoCopiarTipoDocumentoPersonal);			
		this.jButtonVerFormTipoDocumentoPersonal.setVisible(this.isPermisoVerFormTipoDocumentoPersonal);			
		
		this.jButtonAbrirOrderByTipoDocumentoPersonal.setVisible(this.isPermisoOrdenTipoDocumentoPersonal);					
		
		this.jButtonNuevoRelacionesTipoDocumentoPersonal.setVisible(this.isPermisoNuevoTipoDocumentoPersonal);			
		
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonModificarTipoDocumentoPersonal.setVisible(this.isPermisoActualizarTipoDocumentoPersonal);	
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonActualizarTipoDocumentoPersonal.setVisible(this.isPermisoActualizarTipoDocumentoPersonal);	
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonEliminarTipoDocumentoPersonal.setVisible(this.isPermisoEliminarTipoDocumentoPersonal);
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonCancelarTipoDocumentoPersonal.setVisible(this.isVisibilidadCeldaCancelarTipoDocumentoPersonal);						
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonGuardarCambiosTipoDocumentoPersonal.setVisible(this.isPermisoGuardarCambiosTipoDocumentoPersonal);							
		}
		
		this.jButtonGuardarCambiosTablaTipoDocumentoPersonal.setVisible(this.isPermisoActualizarTipoDocumentoPersonal);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDocumentoPersonal() {
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonModificarTipoDocumentoPersonal.setVisible(this.isPermisoActualizarTipoDocumentoPersonal);	
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonActualizarTipoDocumentoPersonal.setVisible(this.isPermisoActualizarTipoDocumentoPersonal);	
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonEliminarTipoDocumentoPersonal.setVisible(this.isPermisoEliminarTipoDocumentoPersonal);
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonCancelarTipoDocumentoPersonal.setVisible(this.isVisibilidadCeldaCancelarTipoDocumentoPersonal);							
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonGuardarCambiosTipoDocumentoPersonal.setVisible((this.isVisibilidadCeldaGuardarTipoDocumentoPersonal && this.isPermisoGuardarCambiosTipoDocumentoPersonal));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoDocumentoPersonal() {
		if(TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoDocumentoPersonal();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoDocumentoPersonal() {
	}
	
	public void jTableDatosTipoDocumentoPersonalListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoDocumentoPersonal(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoDocumentoPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDocumentoPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDocumentoPersonal(this.gettipodocumentopersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoPersonal(this.tipodocumentopersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodocumentopersonal==null) {
						this.tipodocumentopersonal = new TipoDocumentoPersonal();
					}

					this.setVariablesFormularioToObjetoActualTipoDocumentoPersonal(this.tipodocumentopersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoPersonal(this.tipodocumentopersonal);
				}

				if(this.tipodocumentopersonal.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipodocumentopersonal.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDocumentoPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisTipoDocumentoPersonalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebTipoDocumentoPersonal(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDocumentoPersonal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoDocumentoPersonal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoDocumentoPersonal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoDocumentoPersonal(this.gettipodocumentopersonal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoPersonal(this.tipodocumentopersonal);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.tipodocumentopersonalLogic.getConnexion());

				if(this.tipodocumentopersonal.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.tipodocumentopersonal.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoDocumentoPersonal=(TitledBorder)this.jScrollPanelDatosTipoDocumentoPersonal.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderTipoDocumentoPersonal.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisTipoDocumentoPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDocumentoPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDocumentoPersonal(this.gettipodocumentopersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoPersonal(this.tipodocumentopersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodocumentopersonal==null) {
						this.tipodocumentopersonal = new TipoDocumentoPersonal();
					}

					this.setVariablesFormularioToObjetoActualTipoDocumentoPersonal(this.tipodocumentopersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoPersonal(this.tipodocumentopersonal);
				}

				if(this.tipodocumentopersonal.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.tipodocumentopersonal.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDocumentoPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoDocumentoPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDocumentoPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDocumentoPersonal(this.gettipodocumentopersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoPersonal(this.tipodocumentopersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodocumentopersonal==null) {
						this.tipodocumentopersonal = new TipoDocumentoPersonal();
					}

					this.setVariablesFormularioToObjetoActualTipoDocumentoPersonal(this.tipodocumentopersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoPersonal(this.tipodocumentopersonal);
				}

				if(this.tipodocumentopersonal.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipodocumentopersonal.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDocumentoPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoDocumentoPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDocumentoPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDocumentoPersonal(this.gettipodocumentopersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoPersonal(this.tipodocumentopersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodocumentopersonal==null) {
						this.tipodocumentopersonal = new TipoDocumentoPersonal();
					}

					this.setVariablesFormularioToObjetoActualTipoDocumentoPersonal(this.tipodocumentopersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoPersonal(this.tipodocumentopersonal);
				}

				if(this.tipodocumentopersonal.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipodocumentopersonal.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDocumentoPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdPaisTipoDocumentoPersonalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDocumentoPersonal(false,false);

			this.getTipoDocumentoPersonalsFK_IdPais();

			this.inicializarActualizarBindingTipoDocumentoPersonal(false);

			//if(TipoDocumentoPersonalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDocumentoPersonal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentopersonalLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoDocumentoPersonal() {
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.dispose();
			this.jInternalFrameDetalleFormTipoDocumentoPersonal=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoDocumentoPersonal!=null) {
			this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.dispose();
			this.jInternalFrameReporteDinamicoTipoDocumentoPersonal=null;
		}
		
		if(this.jInternalFrameImportacionTipoDocumentoPersonal!=null) {
			this.jInternalFrameImportacionTipoDocumentoPersonal.setVisible(false);	    			
			this.jInternalFrameImportacionTipoDocumentoPersonal.dispose();
			this.jInternalFrameImportacionTipoDocumentoPersonal=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoDocumentoPersonal();
			
			TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoDocumentoPersonal")) {
				jButtonNuevoTipoDocumentoPersonalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoDocumentoPersonal")) {
				jButtonDuplicarTipoDocumentoPersonalActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoDocumentoPersonal")) {
				jButtonCopiarTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoDocumentoPersonal")) {
				jButtonVerFormTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoDocumentoPersonal")) {
				jButtonNuevoTipoDocumentoPersonalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoDocumentoPersonal")) {
				jButtonDuplicarTipoDocumentoPersonalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoDocumentoPersonal")) {
				jButtonNuevoTipoDocumentoPersonalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoDocumentoPersonal")) {
				jButtonDuplicarTipoDocumentoPersonalActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoDocumentoPersonal")) {
				jButtonNuevoTipoDocumentoPersonalActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoDocumentoPersonal")) {
				jButtonNuevoTipoDocumentoPersonalActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoDocumentoPersonal")) {
				jButtonNuevoTipoDocumentoPersonalActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoDocumentoPersonal")) {
				jButtonModificarTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoDocumentoPersonal")) {
				jButtonModificarTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoDocumentoPersonal")) {
				jButtonModificarTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoDocumentoPersonal")) {
				jButtonActualizarTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoDocumentoPersonal")) {
				jButtonActualizarTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoDocumentoPersonal")) {
				jButtonActualizarTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoDocumentoPersonal")) {
				jButtonEliminarTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoDocumentoPersonal")) {
				jButtonEliminarTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoDocumentoPersonal")) {
				jButtonEliminarTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoDocumentoPersonal")) {
				jButtonCancelarTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoDocumentoPersonal")) {
				jButtonCancelarTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoDocumentoPersonal")) {
				jButtonCancelarTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoDocumentoPersonal")) {
				jButtonCerrarTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoDocumentoPersonal")) {
				jButtonCerrarTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoDocumentoPersonal")) {
				jButtonCerrarTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoDocumentoPersonal")) {
				jButtonMostrarOcultarTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoDocumentoPersonal")) {
				jButtonCancelarTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoDocumentoPersonal")) {
				jButtonGuardarCambiosTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoDocumentoPersonal")) {
				jButtonGuardarCambiosTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoDocumentoPersonal")) {
				jButtonCopiarTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoDocumentoPersonal")) {
				jButtonVerFormTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoDocumentoPersonal")) {
				jButtonGuardarCambiosTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoDocumentoPersonal")) {
				jButtonCopiarTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoDocumentoPersonal")) {
				jButtonVerFormTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoDocumentoPersonal")) {
				jButtonGuardarCambiosTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoDocumentoPersonal")) {
				jButtonGuardarCambiosTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoDocumentoPersonal")) {
				jButtonGuardarCambiosTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoDocumentoPersonal")) {
				jButtonRecargarInformacionTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoDocumentoPersonal")) {
				jButtonRecargarInformacionTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoDocumentoPersonal")) {
				jButtonRecargarInformacionTipoDocumentoPersonalActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoDocumentoPersonal")) {
				jButtonAnterioresTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoDocumentoPersonal")) {
				jButtonAnterioresTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoDocumentoPersonal")) {
				jButtonAnterioresTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoDocumentoPersonal")) {
				jButtonSiguientesTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoDocumentoPersonal")) {
				jButtonSiguientesTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoDocumentoPersonal")) {
				jButtonSiguientesTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoDocumentoPersonal") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoDocumentoPersonal")) {
				jButtonAbrirOrderByTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoDocumentoPersonal") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoDocumentoPersonal")) {
				jButtonMostrarOcultarTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDocumentoPersonal")) {
				jButtonNuevoGuardarCambiosTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoDocumentoPersonal")) {
				jButtonNuevoGuardarCambiosTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoDocumentoPersonal")) {
				jButtonNuevoGuardarCambiosTipoDocumentoPersonalActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoDocumentoPersonal")) {
				jButtonCerrarReporteDinamicoTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoDocumentoPersonal")) {
				jButtonGenerarReporteDinamicoTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoDocumentoPersonal")) {
				
				jButtonGenerarExcelReporteDinamicoTipoDocumentoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoDocumentoPersonal")) {
				jButtonCerrarImportacionTipoDocumentoPersonalActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoDocumentoPersonal")) {
				
				jButtonGenerarImportacionTipoDocumentoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoDocumentoPersonal")) {
				
				jButtonAbrirImportacionTipoDocumentoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoDocumentoPersonal")) {
				jComboBoxTiposAccionesTipoDocumentoPersonalActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoDocumentoPersonal")) {
				jComboBoxTiposRelacionesTipoDocumentoPersonalActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoDocumentoPersonal")) {
				jComboBoxTiposAccionesTipoDocumentoPersonalActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoDocumentoPersonal")) {
				
				jComboBoxTiposSeleccionarTipoDocumentoPersonalActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoDocumentoPersonal")) {
				jTextFieldValorCampoGeneralTipoDocumentoPersonalActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoDocumentoPersonal")) {
				jButtonAbrirOrderByTipoDocumentoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoDocumentoPersonal")) {
				jButtonAbrirOrderByTipoDocumentoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoDocumentoPersonal")) {
				jButtonCerrarOrderByTipoDocumentoPersonalActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDocumentoPersonalBusqueda")) {
				this.jButtonidTipoDocumentoPersonalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoDocumentoPersonalUpdate")) {
				this.jButtonid_paisTipoDocumentoPersonalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoDocumentoPersonalBusqueda")) {
				this.jButtonid_paisTipoDocumentoPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDocumentoPersonalBusqueda")) {
				this.jButtoncodigoTipoDocumentoPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDocumentoPersonalBusqueda")) {
				this.jButtonnombreTipoDocumentoPersonalBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdPaisTipoDocumentoPersonal")) {
				this.jButtonFK_IdPaisTipoDocumentoPersonalActionPerformed(evt);
			}
			
			;
			
			
			TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoDocumentoPersonal();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDocumentoPersonalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentopersonal);
				
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
				
				


				
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumentoPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumentoPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoDocumentoPersonal tipodocumentopersonalLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipodocumentopersonalLocal=this.tipodocumentopersonal;
			} else {
				tipodocumentopersonalLocal=this.tipodocumentopersonalAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentopersonal);
				
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
							
				
				


				
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumentoPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumentoPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDocumentoPersonalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDocumentoPersonal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonalAnterior =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodocumentopersonalAnterior =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
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
			
			TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
			
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
			
			


			
			TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDocumentoPersonalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentopersonal);
				
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
								
						
				


				
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumentoPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumentoPersonal.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentopersonal);
				
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
								
				
				


				
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumentoPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumentoPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDocumentoPersonalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDocumentoPersonal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonalAnterior =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodocumentopersonalAnterior =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentopersonal);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDocumentoPersonalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDocumentoPersonal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonalAnterior =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodocumentopersonalAnterior =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDocumentoPersonalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentopersonal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentopersonal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentopersonal);
				
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
							
				
				


				
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumentoPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumentoPersonal.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDocumentoPersonalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDocumentoPersonal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodocumentopersonalAnterior =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodocumentopersonalAnterior =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
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
			
			TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
			
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
			
			


			
			TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDocumentoPersonalActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentopersonal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentopersonal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentopersonal);
				
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
								
				
				


				
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumentoPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumentoPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDocumentoPersonalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDocumentoPersonal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonalAnterior =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodocumentopersonalAnterior =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDocumentoPersonalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentopersonal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentopersonal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDocumentoPersonalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentopersonal);
				
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoDocumentoPersonal")) {
					jCheckBoxSeleccionarTodosTipoDocumentoPersonalItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoDocumentoPersonal")) {
					jCheckBoxSeleccionadosTipoDocumentoPersonalItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoDocumentoPersonal")) {
					
				}
				
				


				
				
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumentoPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumentoPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentopersonal);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentopersonal);
				
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
												
				
				


				
				
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumentoPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumentoPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDocumentoPersonalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDocumentoPersonal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodocumentopersonalAnterior =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodocumentopersonalAnterior =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDocumentoPersonalActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentopersonal);
				
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
				
				
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
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
			
			TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
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
			
			


			
			TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDocumentoPersonalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentopersonal);
				
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumentoPersonal.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumentoPersonal.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentopersonal);
				
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
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
				
				


				
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumentoPersonal.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumentoPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDocumentoPersonalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDocumentoPersonal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentopersonalAnterior =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodocumentopersonalAnterior =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoDocumentoPersonal")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoDocumentoPersonalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoDocumentoPersonal.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipodocumentopersonal =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipodocumentopersonal);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoDocumentoPersonal")) {
				
				}
				
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoDocumentoPersonal")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoDocumentoPersonal.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoDocumentoPersonal")) {
			
			}
			
			TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoDocumentoPersonal();
			
			TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
			
			if(sTipo.equals("NuevoTipoDocumentoPersonal")) {
				jButtonNuevoTipoDocumentoPersonalActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoDocumentoPersonal")) {
				jButtonDuplicarTipoDocumentoPersonalActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoDocumentoPersonal")) {
				jButtonCopiarTipoDocumentoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoDocumentoPersonal")) {
				jButtonVerFormTipoDocumentoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoDocumentoPersonal")) {
				jButtonNuevoTipoDocumentoPersonalActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoDocumentoPersonal")) {
				jButtonModificarTipoDocumentoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoDocumentoPersonal")) {
				jButtonActualizarTipoDocumentoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoDocumentoPersonal")) {
				jButtonEliminarTipoDocumentoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoDocumentoPersonal")) {
				jButtonGuardarCambiosTipoDocumentoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoDocumentoPersonal")) {
				jButtonCancelarTipoDocumentoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoDocumentoPersonal")) {
				jButtonCerrarTipoDocumentoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoDocumentoPersonal")) {
				jButtonGuardarCambiosTipoDocumentoPersonalActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDocumentoPersonal")) {
				jButtonNuevoGuardarCambiosTipoDocumentoPersonalActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoDocumentoPersonal")) {
				jButtonAbrirOrderByTipoDocumentoPersonalActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoDocumentoPersonal")) {
				jButtonRecargarInformacionTipoDocumentoPersonalActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoDocumentoPersonal")) {
				jButtonAnterioresTipoDocumentoPersonalActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoDocumentoPersonal")) {
				jButtonSiguientesTipoDocumentoPersonalActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDocumentoPersonalBusqueda")) {
				this.jButtonidTipoDocumentoPersonalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoDocumentoPersonalUpdate")) {
				this.jButtonid_paisTipoDocumentoPersonalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoDocumentoPersonalBusqueda")) {
				this.jButtonid_paisTipoDocumentoPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDocumentoPersonalBusqueda")) {
				this.jButtoncodigoTipoDocumentoPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDocumentoPersonalBusqueda")) {
				this.jButtonnombreTipoDocumentoPersonalBusquedaActionPerformed(evt);
			}
			
			TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoDocumentoPersonal();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoDocumentoPersonal")) {
				closingInternalFrameTipoDocumentoPersonal();
				
			} else if(sTipo.equals("jButtonCancelarTipoDocumentoPersonal")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoDocumentoPersonal = (JInternalFrameBase)evt.getSource();
	            	
	            TipoDocumentoPersonalBeanSwingJInternalFrame jInternalFrameParent=(TipoDocumentoPersonalBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDocumentoPersonal.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoDocumentoPersonalActionPerformed(null);
			}
			
			TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodocumentopersonal,new Object(),this.tipodocumentopersonalParameterGeneral,this.tipodocumentopersonalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoDocumentoPersonal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoDocumentoPersonal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoDocumentoPersonal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipodocumentopersonal)) {
			if(!esControlTabla) {
				if(TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoDocumentoPersonal(this.tipodocumentopersonal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoPersonal(this.tipodocumentopersonal);			
				}
				
				if(this.tipodocumentopersonalSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoDocumentoPersonal(this.tipodocumentopersonal,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodocumentopersonalReturnGeneral=tipodocumentopersonalLogic.procesarEventosTipoDocumentoPersonalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodocumentopersonalLogic.getTipoDocumentoPersonals(),this.tipodocumentopersonal,this.tipodocumentopersonalParameterGeneral,this.isEsNuevoTipoDocumentoPersonal,classes);//this.tipodocumentopersonalLogic.getTipoDocumentoPersonal()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoDocumentoPersonal(this.tipodocumentopersonalReturnGeneral,this.tipodocumentopersonalBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipodocumentopersonalSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoDocumentoPersonal(classes,this.tipodocumentopersonalReturnGeneral,this.tipodocumentopersonalBean,false);
					}
						
					if(this.tipodocumentopersonalReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoDocumentoPersonal(this.tipodocumentopersonalReturnGeneral.getTipoDocumentoPersonal());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoDocumentoPersonal(this.tipodocumentopersonalReturnGeneral.getTipoDocumentoPersonal());	
					}
						
					if(this.tipodocumentopersonalReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoDocumentoPersonal(this.tipodocumentopersonalReturnGeneral.getTipoDocumentoPersonal(),classes);//this.tipodocumentopersonalBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoDocumentoPersonal(this.tipodocumentopersonal,classes);//this.tipodocumentopersonalBean);									
				}
			
				if(TipoDocumentoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoDocumentoPersonal(this.tipodocumentopersonal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoPersonal(this.tipodocumentopersonal);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipodocumentopersonalAnterior!=null) {
						this.tipodocumentopersonal=this.tipodocumentopersonalAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodocumentopersonalReturnGeneral=tipodocumentopersonalLogic.procesarEventosTipoDocumentoPersonalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodocumentopersonalLogic.getTipoDocumentoPersonals(),this.tipodocumentopersonal,this.tipodocumentopersonalParameterGeneral,this.isEsNuevoTipoDocumentoPersonal,classes);//this.tipodocumentopersonalLogic.getTipoDocumentoPersonal()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodocumentopersonalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipodocumentopersonalReturnGeneral.getTipoDocumentoPersonal(),tipodocumentopersonalLogic.getTipoDocumentoPersonals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipodocumentopersonalReturnGeneral.getTipoDocumentoPersonal(),this.tipodocumentopersonals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoDocumentoPersonal.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoDocumentoPersonal.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoDocumentoPersonal();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoDocumentoPersonal() throws Exception {
		
		TipoDocumentoPersonalModel tipodocumentopersonalModel=(TipoDocumentoPersonalModel)this.jTableDatosTipoDocumentoPersonal.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodocumentopersonalModel.tipodocumentopersonals=this.tipodocumentopersonalLogic.getTipoDocumentoPersonals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipodocumentopersonalModel.tipodocumentopersonals=this.tipodocumentopersonals;
		}
		
		
		((TipoDocumentoPersonalModel) this.jTableDatosTipoDocumentoPersonal.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoDocumentoPersonal() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipodocumentopersonalAnterior(),this.tipodocumentopersonalLogic.getTipoDocumentoPersonals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipodocumentopersonalAnterior(),this.tipodocumentopersonals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoDocumentoPersonal();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoDocumentoPersonal(TipoDocumentoPersonal tipodocumentopersonal,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
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
										
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodocumentopersonal,new Object(),generalEntityParameterGeneral,this.tipodocumentopersonalReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipodocumentopersonalSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoDocumentoPersonalConstantesFunciones.getClassesRelationshipsOfTipoDocumentoPersonal(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoDocumentoPersonalConstantesFunciones.getClassesRelationshipsFromStringsOfTipoDocumentoPersonal(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoDocumentoPersonal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoDocumentoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodocumentopersonal,new Object(),generalEntityParameterGeneral,this.tipodocumentopersonalReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoDocumentoPersonal(TipoDocumentoPersonalBean tipodocumentopersonalBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoDocumentoPersonal(ArrayList<Classe> classes,TipoDocumentoPersonalReturnGeneral tipodocumentopersonalReturnGeneral,TipoDocumentoPersonalBean tipodocumentopersonalBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoDocumentoPersonal(TipoDocumentoPersonal tipodocumentopersonal,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipodocumentopersonal)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoDocumentoPersonal = new TipoDocumentoPersonalDetalleFormJInternalFrame(jDesktopPane,this.tipodocumentopersonalSessionBean.getConGuardarRelaciones(),this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDocumentoPersonal);
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.setVisible(false);
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.tipodocumentopersonalLogic=this.tipodocumentopersonalLogic;
		
		this.cargarCombosFrameForeignKeyTipoDocumentoPersonal("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDocumentoPersonal();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDocumentoPersonal();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoDocumentoPersonal("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoDocumentoPersonal();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDocumentoPersonal"));
		
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonModificarTipoDocumentoPersonal.addActionListener(new ButtonActionListener(this,"ModificarTipoDocumentoPersonal"));

		
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonModificarToolBarTipoDocumentoPersonal.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDocumentoPersonal"));
					
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jMenuItemModificarTipoDocumentoPersonal.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDocumentoPersonal"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonActualizarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"ActualizarTipoDocumentoPersonal"));
		
		
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonActualizarToolBarTipoDocumentoPersonal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDocumentoPersonal"));
						
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jMenuItemActualizarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDocumentoPersonal"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonEliminarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"EliminarTipoDocumentoPersonal"));
		
		
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonEliminarToolBarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDocumentoPersonal"));
								
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jMenuItemEliminarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDocumentoPersonal"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonCancelarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"CancelarTipoDocumentoPersonal"));
		
		
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonCancelarToolBarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDocumentoPersonal"));
					
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jMenuItemCancelarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDocumentoPersonal"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jMenuItemDetalleCerrarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDocumentoPersonal"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonGuardarCambiosToolBarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDocumentoPersonal"));
		
		
		
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonGuardarCambiosToolBarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDocumentoPersonal"));
		
		
		
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxTiposAccionesFormularioTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDocumentoPersonal"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonidTipoDocumentoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDocumentoPersonalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonid_paisTipoDocumentoPersonalUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoDocumentoPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonid_paisTipoDocumentoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoDocumentoPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtoncodigoTipoDocumentoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDocumentoPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonnombreTipoDocumentoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDocumentoPersonalBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTabbedPaneRelacionesTipoDocumentoPersonal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDocumentoPersonal"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoDocumentoPersonal"));
		
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDocumentoPersonal"));
		}
		
		this.jTableDatosTipoDocumentoPersonal.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoDocumentoPersonal"));
		
		this.jTableDatosTipoDocumentoPersonal.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoDocumentoPersonal"));
		
		this.jButtonNuevoTipoDocumentoPersonal.addActionListener(new ButtonActionListener(this,"NuevoTipoDocumentoPersonal"));
		
		this.jButtonDuplicarTipoDocumentoPersonal.addActionListener(new ButtonActionListener(this,"DuplicarTipoDocumentoPersonal"));
		
		this.jButtonCopiarTipoDocumentoPersonal.addActionListener(new ButtonActionListener(this,"CopiarTipoDocumentoPersonal"));
		
		this.jButtonVerFormTipoDocumentoPersonal.addActionListener(new ButtonActionListener(this,"VerFormTipoDocumentoPersonal"));
		
		
		this.jButtonNuevoToolBarTipoDocumentoPersonal.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoDocumentoPersonal"));
			
		this.jButtonDuplicarToolBarTipoDocumentoPersonal.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoDocumentoPersonal"));
			
		this.jMenuItemNuevoTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoDocumentoPersonal"));
			
		this.jMenuItemDuplicarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoDocumentoPersonal"));		
		
		
		this.jButtonNuevoRelacionesTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoDocumentoPersonal"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoDocumentoPersonal.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoDocumentoPersonal"));
			
		this.jMenuItemNuevoRelacionesTipoDocumentoPersonal.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoDocumentoPersonal"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonModificarTipoDocumentoPersonal.addActionListener(new ButtonActionListener(this,"ModificarTipoDocumentoPersonal"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonModificarToolBarTipoDocumentoPersonal.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDocumentoPersonal"));
			
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jMenuItemModificarTipoDocumentoPersonal.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDocumentoPersonal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonActualizarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"ActualizarTipoDocumentoPersonal"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonActualizarToolBarTipoDocumentoPersonal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDocumentoPersonal"));
				
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jMenuItemActualizarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDocumentoPersonal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonEliminarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"EliminarTipoDocumentoPersonal"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonEliminarToolBarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDocumentoPersonal"));
						
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jMenuItemEliminarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDocumentoPersonal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonCancelarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"CancelarTipoDocumentoPersonal"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonCancelarToolBarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDocumentoPersonal"));
			
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jMenuItemCancelarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDocumentoPersonal"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoDocumentoPersonal"));		
		
		
		this.jButtonCerrarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"CerrarTipoDocumentoPersonal"));
		
		
		this.jButtonCerrarToolBarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoDocumentoPersonal"));
			
		this.jMenuItemCerrarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoDocumentoPersonal"));
			
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jMenuItemDetalleCerrarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDocumentoPersonal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonGuardarCambiosTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoDocumentoPersonal"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonGuardarCambiosToolBarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDocumentoPersonal"));
		}
		
		this.jButtonCopiarToolBarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoDocumentoPersonal"));
			
		this.jButtonVerFormToolBarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoDocumentoPersonal"));
		
		this.jMenuItemGuardarCambiosTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoDocumentoPersonal"));
			
		this.jMenuItemCopiarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoDocumentoPersonal"));		
		
		this.jMenuItemVerFormTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoDocumentoPersonal"));		
		
		
		this.jButtonGuardarCambiosTablaTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDocumentoPersonal"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoDocumentoPersonal"));
			
		this.jMenuItemGuardarCambiosTablaTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDocumentoPersonal"));		
		
		
		
		this.jButtonRecargarInformacionTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoDocumentoPersonal"));
					
		this.jButtonRecargarInformacionToolBarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoDocumentoPersonal"));
		
		this.jMenuItemRecargarInformacionTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoDocumentoPersonal"));		
		
		
		
		this.jButtonAnterioresTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"AnterioresTipoDocumentoPersonal"));
		
		
		this.jButtonAnterioresToolBarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoDocumentoPersonal"));
		
		this.jMenuItemAnterioresTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoDocumentoPersonal"));		
		
		
		this.jButtonSiguientesTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"SiguientesTipoDocumentoPersonal"));
		
		
		this.jButtonSiguientesToolBarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoDocumentoPersonal"));
			
		this.jMenuItemSiguientesTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoDocumentoPersonal"));
			
		this.jMenuItemAbrirOrderByTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoDocumentoPersonal"));
			
		this.jMenuItemMostrarOcultarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoDocumentoPersonal"));
			
		this.jMenuItemDetalleAbrirOrderByTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoDocumentoPersonal"));
			
		this.jMenuItemDetalleMostarOcultarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoDocumentoPersonal"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoDocumentoPersonal"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoDocumentoPersonal"));
			
		this.jMenuItemNuevoGuardarCambiosTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoDocumentoPersonal"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoDocumentoPersonal.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoDocumentoPersonal"));

		this.jCheckBoxSeleccionadosTipoDocumentoPersonal.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoDocumentoPersonal"));
		
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxTiposAccionesFormularioTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDocumentoPersonal"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoDocumentoPersonal"));
			
		this.jComboBoxTiposAccionesTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoDocumentoPersonal"));
					
		this.jComboBoxTiposSeleccionarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoDocumentoPersonal"));
			
		this.jTextFieldValorCampoGeneralTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoDocumentoPersonal"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonidTipoDocumentoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDocumentoPersonalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonid_paisTipoDocumentoPersonalUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoDocumentoPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonid_paisTipoDocumentoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoDocumentoPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtoncodigoTipoDocumentoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDocumentoPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonnombreTipoDocumentoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDocumentoPersonalBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdPaisTipoDocumentoPersonal.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoDocumentoPersonal"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoDocumentoPersonal!=null) {
				this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDocumentoPersonal"));
				this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDocumentoPersonal"));
				this.jInternalFrameReporteDinamicoTipoDocumentoPersonal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDocumentoPersonal"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDocumentoPersonal"));				
			//this.jButtonGenerarReporteDinamicoTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDocumentoPersonal"));
			//this.jButtonGenerarExcelReporteDinamicoTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDocumentoPersonal"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoDocumentoPersonal!=null) {
				this.jInternalFrameImportacionTipoDocumentoPersonal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDocumentoPersonal"));
				this.jInternalFrameImportacionTipoDocumentoPersonal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDocumentoPersonal"));
				this.jInternalFrameImportacionTipoDocumentoPersonal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDocumentoPersonal"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoDocumentoPersonal"));
			
			this.jButtonAbrirOrderByToolBarTipoDocumentoPersonal.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoDocumentoPersonal"));			
			
			if(this.jInternalFrameOrderByTipoDocumentoPersonal!=null) {
				this.jInternalFrameOrderByTipoDocumentoPersonal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDocumentoPersonal"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTabbedPaneRelacionesTipoDocumentoPersonal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDocumentoPersonal"));
		
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
            		closingInternalFrameTipoDocumentoPersonal();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoDocumentoPersonal = (JInternalFrameBase)event.getSource();
	            	
	            TipoDocumentoPersonalBeanSwingJInternalFrame jInternalFrameParent=(TipoDocumentoPersonalBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDocumentoPersonal.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoDocumentoPersonalActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoDocumentoPersonal.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoDocumentoPersonalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoDocumentoPersonal.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoDocumentoPersonal.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDocumentoPersonalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDocumentoPersonalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDocumentoPersonalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoDocumentoPersonal";
		inputMap = this.jButtonNuevoTipoDocumentoPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoDocumentoPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDocumentoPersonalActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDocumentoPersonalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDocumentoPersonalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDocumentoPersonalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoDocumentoPersonal";
		inputMap = this.jButtonNuevoRelacionesTipoDocumentoPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoDocumentoPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDocumentoPersonalActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoDocumentoPersonal";
		inputMap = this.jButtonModificarTipoDocumentoPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoDocumentoPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoDocumentoPersonalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoDocumentoPersonal";
		inputMap = this.jButtonActualizarTipoDocumentoPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoDocumentoPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoDocumentoPersonalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoDocumentoPersonal";
		inputMap = this.jButtonEliminarTipoDocumentoPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoDocumentoPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoDocumentoPersonalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoDocumentoPersonal";
		inputMap = this.jButtonCancelarTipoDocumentoPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoDocumentoPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoDocumentoPersonalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoDocumentoPersonal";
		inputMap = this.jButtonCerrarTipoDocumentoPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoDocumentoPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoDocumentoPersonalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonGuardarCambiosTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoDocumentoPersonal";
		inputMap = this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonGuardarCambiosTipoDocumentoPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonGuardarCambiosTipoDocumentoPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoDocumentoPersonalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoDocumentoPersonal.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoDocumentoPersonalItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoDocumentoPersonal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoDocumentoPersonalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoDocumentoPersonal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoDocumentoPersonalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoDocumentoPersonal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoDocumentoPersonalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonidTipoDocumentoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDocumentoPersonalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonid_paisTipoDocumentoPersonalUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoDocumentoPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonid_paisTipoDocumentoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoDocumentoPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtoncodigoTipoDocumentoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDocumentoPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jButtonnombreTipoDocumentoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDocumentoPersonalBusqueda"));
		
		
		this.jButtonFK_IdPaisTipoDocumentoPersonal.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoDocumentoPersonal"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoDocumentoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoDocumentoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoDocumentoPersonalActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoDocumentoPersonal.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoDocumentoPersonal(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoDocumentoPersonal tipodocumentopersonalAux:this.tipodocumentopersonalLogic.getTipoDocumentoPersonals()) {
					tipodocumentopersonalAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDocumentoPersonal tipodocumentopersonalAux:tipodocumentopersonals) {
					tipodocumentopersonalAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoDocumentoPersonalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDocumentoPersonal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDocumentoPersonal tipodocumentopersonalAux:this.tipodocumentopersonalLogic.getTipoDocumentoPersonals()) {
						tipodocumentopersonalAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDocumentoPersonal tipodocumentopersonalAux:tipodocumentopersonals) {
						tipodocumentopersonalAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoDocumentoPersonal tipodocumentopersonalAux:this.tipodocumentopersonalLogic.getTipoDocumentoPersonals()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDocumentoPersonal tipodocumentopersonalAux:tipodocumentopersonals) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDocumentoPersonal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDocumentoPersonal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDocumentoPersonal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumentoPersonal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoDocumentoPersonalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDocumentoPersonal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoDocumentoPersonal.getSelectedRows();
			
			TipoDocumentoPersonal tipodocumentopersonalLocal=new TipoDocumentoPersonal();
			
			//this.seleccionarTodosTipoDocumentoPersonal(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentopersonalLocal =(TipoDocumentoPersonal) this.tipodocumentopersonalLogic.getTipoDocumentoPersonals().toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipodocumentopersonalLocal =(TipoDocumentoPersonal) this.tipodocumentopersonals.toArray()[this.jTableDatosTipoDocumentoPersonal.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipodocumentopersonalLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDocumentoPersonal tipodocumentopersonalAux:this.tipodocumentopersonalLogic.getTipoDocumentoPersonals()) {
						tipodocumentopersonalAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDocumentoPersonal tipodocumentopersonalAux:tipodocumentopersonals) {
						tipodocumentopersonalAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoDocumentoPersonal(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDocumentoPersonal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDocumentoPersonal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumentoPersonal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoDocumentoPersonalItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoDocumentoPersonalParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoDocumentoPersonalActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoDocumentoPersonal(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoDocumentoPersonal.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDocumentoPersonal tipodocumentopersonalAux:this.tipodocumentopersonalLogic.getTipoDocumentoPersonals()) {
				
						if(sTipoSeleccionar.equals(TipoDocumentoPersonalConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodocumentopersonalAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDocumentoPersonalConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodocumentopersonalAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDocumentoPersonal tipodocumentopersonalAux:tipodocumentopersonals) {
					
						if(sTipoSeleccionar.equals(TipoDocumentoPersonalConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodocumentopersonalAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDocumentoPersonalConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodocumentopersonalAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDocumentoPersonal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoDocumentoPersonalActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoDocumentoPersonal(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoDocumentoPersonal=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoDocumentoPersonal.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxTiposAccionesFormularioTipoDocumentoPersonal.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoDocumentoPersonal) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoDocumentoPersonal(conSplash);
				
					this.generarReporteTipoDocumentoPersonalsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDocumentoPersonal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxTiposAccionesFormularioTipoDocumentoPersonal.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoDocumentoPersonalsSeleccionados();
				//this.jComboBoxTiposAccionesTipoDocumentoPersonal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDocumentoPersonalsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoDocumentoPersonal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDocumentoPersonalsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoDocumentoPersonal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDocumentoPersonal();
				
				this.exportarTipoDocumentoPersonalsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDocumentoPersonal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxTiposAccionesFormularioTipoDocumentoPersonal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoDocumentoPersonals();
				//this.importarTipoDocumentoPersonals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDocumentoPersonal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxTiposAccionesFormularioTipoDocumentoPersonal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDocumentoPersonal();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoDocumentoPersonalsSeleccionados();
				//this.jComboBoxTiposAccionesTipoDocumentoPersonal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Documento Personal", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoDocumentoPersonal();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoDocumentoPersonal)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoDocumentoPersonal(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Documento Personal",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDocumentoPersonal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxTiposAccionesFormularioTipoDocumentoPersonal.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoDocumentoPersonal();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoDocumentoPersonal(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoDocumentoPersonalActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoDocumentoPersonal();
			
			if(this.jInternalFrameDetalleFormTipoDocumentoPersonal==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoDocumentoPersonal> tipodocumentopersonalsSeleccionados=new ArrayList<TipoDocumentoPersonal>();		
			TipoDocumentoPersonal tipodocumentopersonal=new TipoDocumentoPersonal();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoDocumentoPersonal(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoDocumentoPersonal.getSelectedItem();
			
			
			
			
			tipodocumentopersonalsSeleccionados=this.getTipoDocumentoPersonalsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipodocumentopersonalsSeleccionados.size()==1) {
				for(TipoDocumentoPersonal tipodocumentopersonalAux:tipodocumentopersonalsSeleccionados) {
					tipodocumentopersonal=tipodocumentopersonalAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoDocumentoPersonal();
			
      		//this.finishProcessTipoDocumentoPersonal(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoDocumentoPersonalReturnGeneral() throws Exception {
		if(this.tipodocumentopersonalReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipodocumentopersonalReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipodocumentopersonalReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipodocumentopersonalReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipodocumentopersonalReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipodocumentopersonalReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoDocumentoPersonal(false);
		}
		
		if(this.tipodocumentopersonalReturnGeneral.getConRetornoLista() || this.tipodocumentopersonalReturnGeneral.getConRetornoObjeto()) {
			if(this.tipodocumentopersonalReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodocumentopersonalLogic.setTipoDocumentoPersonals(this.tipodocumentopersonalReturnGeneral.getTipoDocumentoPersonals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipodocumentopersonalReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodocumentopersonalLogic.setTipoDocumentoPersonal(this.tipodocumentopersonalReturnGeneral.getTipoDocumentoPersonal());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoDocumentoPersonal(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoDocumentoPersonal() throws Exception {
		
		
	}
	
	public ArrayList<TipoDocumentoPersonal> getTipoDocumentoPersonalsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoDocumentoPersonal> tipodocumentopersonalsSeleccionados=new ArrayList<TipoDocumentoPersonal>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoDocumentoPersonal) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoDocumentoPersonal tipodocumentopersonalAux:tipodocumentopersonalLogic.getTipoDocumentoPersonals()) {
					if(tipodocumentopersonalAux.getIsSelected()) {
						tipodocumentopersonalsSeleccionados.add(tipodocumentopersonalAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDocumentoPersonal tipodocumentopersonalAux:this.tipodocumentopersonals) {
					if(tipodocumentopersonalAux.getIsSelected()) {
						tipodocumentopersonalsSeleccionados.add(tipodocumentopersonalAux);				
					}
				}
			}
			
			if(tipodocumentopersonalsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipodocumentopersonalsSeleccionados.addAll(this.tipodocumentopersonalLogic.getTipoDocumentoPersonals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipodocumentopersonalsSeleccionados.addAll(this.tipodocumentopersonals);				
					}
				}
			}
		} else {
			tipodocumentopersonalsSeleccionados.add(this.tipodocumentopersonal);
		}
		
		return tipodocumentopersonalsSeleccionados;
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
	
	public void generarReporteTipoDocumentoPersonalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoDocumentoPersonalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoDocumentoPersonalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDocumentoPersonalsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDocumentoPersonalsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Documento Personal",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoDocumentoPersonalsSeleccionados() throws Exception {
		ArrayList<TipoDocumentoPersonal> tipodocumentopersonalsSeleccionados=new ArrayList<TipoDocumentoPersonal>();		
		
		tipodocumentopersonalsSeleccionados=this.getTipoDocumentoPersonalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoDocumentoPersonals("Todos",tipodocumentopersonalsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoDocumentoPersonalsSeleccionados() throws Exception {
		ArrayList<TipoDocumentoPersonal> tipodocumentopersonalsSeleccionados=new ArrayList<TipoDocumentoPersonal>();		
		
		tipodocumentopersonalsSeleccionados=this.getTipoDocumentoPersonalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoDocumentoPersonals("Todos",tipodocumentopersonalsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoDocumentoPersonalsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoDocumentoPersonal> tipodocumentopersonalsSeleccionados=new ArrayList<TipoDocumentoPersonal>();
		
		tipodocumentopersonalsSeleccionados=this.getTipoDocumentoPersonalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoDocumentoPersonals("Todos",tipodocumentopersonalsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoDocumentoPersonalsSeleccionados() throws Exception {
		ArrayList<TipoDocumentoPersonal> tipodocumentopersonalsSeleccionados=new ArrayList<TipoDocumentoPersonal>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoDocumentoPersonal();
		
		
		tipodocumentopersonalsSeleccionados=this.getTipoDocumentoPersonalsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoDocumentoPersonal();
		
		
		//this.generarReporteTipoDocumentoPersonals("Todos",tipodocumentopersonalsSeleccionados ,tipodocumentopersonalImplementable,tipodocumentopersonalImplementableHome);
	}
	
	public void mostrarImportacionTipoDocumentoPersonals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoDocumentoPersonal();
		
		this.abrirFrameImportacionTipoDocumentoPersonal();		
		
			
		//this.generarReporteTipoDocumentoPersonals("Todos",tipodocumentopersonalsSeleccionados ,tipodocumentopersonalImplementable,tipodocumentopersonalImplementableHome);
	}
	
	public void importarTipoDocumentoPersonals() throws Exception {		
	
	}
	
	public void exportarTipoDocumentoPersonalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoDocumentoPersonalsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoDocumentoPersonalsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoDocumentoPersonalsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Documento Personal",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoDocumentoPersonalsSeleccionados() throws Exception {
		ArrayList<TipoDocumentoPersonal> tipodocumentopersonalsSeleccionados=new ArrayList<TipoDocumentoPersonal>();		
		
		tipodocumentopersonalsSeleccionados=this.getTipoDocumentoPersonalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodocumentopersonal."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoDocumentoPersonal(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoDocumentoPersonal tipodocumentopersonalAux:tipodocumentopersonalsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoDocumentoPersonal(tipodocumentopersonalAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipodocumentopersonalAux.setsDetalleGeneralEntityReporte(tipodocumentopersonalAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Documento Personal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoDocumentoPersonal(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoDocumentoPersonalConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDocumentoPersonalConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDocumentoPersonalConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDocumentoPersonalConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDocumentoPersonalConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoDocumentoPersonal(TipoDocumentoPersonal tipodocumentopersonal,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipodocumentopersonal.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodocumentopersonal.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodocumentopersonal.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodocumentopersonal.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodocumentopersonal.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoDocumentoPersonalsSeleccionados() throws Exception {
		ArrayList<TipoDocumentoPersonal> tipodocumentopersonalsSeleccionados=new ArrayList<TipoDocumentoPersonal>();		
		
		tipodocumentopersonalsSeleccionados=this.getTipoDocumentoPersonalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodocumentopersonal.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoDocumentoPersonals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoDocumentoPersonal(row);				
				iRow++;
			}				
			
			for(TipoDocumentoPersonal tipodocumentopersonalAux:tipodocumentopersonalsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoDocumentoPersonal(tipodocumentopersonalAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Documento Personal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoDocumentoPersonalsSeleccionados() throws Exception {
		ArrayList<TipoDocumentoPersonal> tipodocumentopersonalsSeleccionados=new ArrayList<TipoDocumentoPersonal>();		
		
		tipodocumentopersonalsSeleccionados=this.getTipoDocumentoPersonalsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodocumentopersonal.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipodocumentopersonals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipodocumentopersonal");
			//elementRoot.appendChild(element);
		
			for(TipoDocumentoPersonal tipodocumentopersonalAux:tipodocumentopersonalsSeleccionados) {
				element = document.createElement("tipodocumentopersonal");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoDocumentoPersonal(tipodocumentopersonalAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Documento Personal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoDocumentoPersonal(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDocumentoPersonalConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDocumentoPersonalConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoDocumentoPersonalConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDocumentoPersonalConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDocumentoPersonalConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoDocumentoPersonal(TipoDocumentoPersonal tipodocumentopersonal,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipodocumentopersonal.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodocumentopersonal.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodocumentopersonal.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodocumentopersonal.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoDocumentoPersonal(TipoDocumentoPersonal tipodocumentopersonal,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoDocumentoPersonalConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipodocumentopersonal.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoDocumentoPersonalConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipodocumentopersonal.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpais_descripcion = document.createElement(TipoDocumentoPersonalConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(tipodocumentopersonal.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementcodigo = document.createElement(TipoDocumentoPersonalConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipodocumentopersonal.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoDocumentoPersonalConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipodocumentopersonal.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoDocumentoPersonalsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoDocumentoPersonal> tipodocumentopersonalsSeleccionados=new ArrayList<TipoDocumentoPersonal>();
		
		tipodocumentopersonalsSeleccionados=this.getTipoDocumentoPersonalsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoDocumentoPersonal(tipodocumentopersonalsSeleccionados);
		
		this.generarReporteTipoDocumentoPersonals("Todos",tipodocumentopersonalsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoDocumentoPersonal(ArrayList<TipoDocumentoPersonal> tipodocumentopersonalsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoDocumentoPersonal tipodocumentopersonalAux:tipodocumentopersonalsSeleccionados) {
				tipodocumentopersonalAux.setsDetalleGeneralEntityReporte(tipodocumentopersonalAux.toString());
			
				if(sTipoSeleccionar.equals(TipoDocumentoPersonalConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					tipodocumentopersonalAux.setsDescripcionGeneralEntityReporte1(tipodocumentopersonalAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoDocumentoPersonalConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipodocumentopersonalAux.setsDescripcionGeneralEntityReporte1(tipodocumentopersonalAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoDocumentoPersonalConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipodocumentopersonalAux.setsDescripcionGeneralEntityReporte1(tipodocumentopersonalAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoDocumentoPersonal(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoDocumentoPersonal=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal=true;
				this.isVisibilidadCeldaGuardarCambiosTipoDocumentoPersonal=true;
			}
			
			this.isVisibilidadCeldaModificarTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaActualizarTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaEliminarTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaCancelarTipoDocumentoPersonal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDocumentoPersonal=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDocumentoPersonal=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaModificarTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaActualizarTipoDocumentoPersonal=true;
			this.isVisibilidadCeldaEliminarTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaCancelarTipoDocumentoPersonal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDocumentoPersonal=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDocumentoPersonal=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaModificarTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaActualizarTipoDocumentoPersonal=true;
			this.isVisibilidadCeldaEliminarTipoDocumentoPersonal=true;
			this.isVisibilidadCeldaCancelarTipoDocumentoPersonal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDocumentoPersonal=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDocumentoPersonal=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaModificarTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaActualizarTipoDocumentoPersonal=true;
			this.isVisibilidadCeldaEliminarTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaCancelarTipoDocumentoPersonal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDocumentoPersonal=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDocumentoPersonal=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoDocumentoPersonal=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumentoPersonal=true;
			this.isVisibilidadCeldaModificarTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaActualizarTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaEliminarTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaCancelarTipoDocumentoPersonal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDocumentoPersonal=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDocumentoPersonal=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaActualizarTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaEliminarTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaCancelarTipoDocumentoPersonal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDocumentoPersonal=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDocumentoPersonal=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaModificarTipoDocumentoPersonal=true;
			this.isVisibilidadCeldaActualizarTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaEliminarTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaCancelarTipoDocumentoPersonal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDocumentoPersonal=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDocumentoPersonal=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoDocumentoPersonalJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoDocumentoPersonal=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumentoPersonal=true;
		} else {
			this.actualizarEstadoPanelsTipoDocumentoPersonal(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoDocumentoPersonal=false;
			//this.isVisibilidadCeldaVerFormTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaDuplicarTipoDocumentoPersonal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipodocumentopersonalSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumentoPersonal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
			if(!tipodocumentopersonalSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal=false;												
			}
			
			this.jButtonCerrarTipoDocumentoPersonal.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoPersonal=false;
		}
		
		if(!this.permiteMantenimiento(this.tipodocumentopersonal)) {
			this.isVisibilidadCeldaActualizarTipoDocumentoPersonal=false;
			this.isVisibilidadCeldaEliminarTipoDocumentoPersonal=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDocumentoPersonal() {
	}
	
	public void actualizarEstadoPanelsTipoDocumentoPersonal(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoDocumentoPersonal!=null) {
				this.jScrollPanelDatosEdicionTipoDocumentoPersonal.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDocumentoPersonal!=null) {
				this.jTabbedPaneBusquedasTipoDocumentoPersonal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDocumentoPersonal!=null) {
				this.jScrollPanelDatosTipoDocumentoPersonal.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDocumentoPersonal!=null) {
				this.jPanelPaginacionTipoDocumentoPersonal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDocumentoPersonal!=null) {
				this.jPanelParametrosReportesTipoDocumentoPersonal.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoDocumentoPersonal!=null) {
				this.jScrollPanelDatosEdicionTipoDocumentoPersonal.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDocumentoPersonal!=null) {
				this.jTabbedPaneBusquedasTipoDocumentoPersonal.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoDocumentoPersonal!=null) {
				this.jScrollPanelDatosTipoDocumentoPersonal.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDocumentoPersonal!=null) {
				this.jPanelPaginacionTipoDocumentoPersonal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDocumentoPersonal!=null) {
				this.jPanelParametrosReportesTipoDocumentoPersonal.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoDocumentoPersonal!=null) {
				this.jScrollPanelDatosEdicionTipoDocumentoPersonal.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDocumentoPersonal!=null) {
				this.jTabbedPaneBusquedasTipoDocumentoPersonal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDocumentoPersonal!=null) {
				this.jScrollPanelDatosTipoDocumentoPersonal.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDocumentoPersonal!=null) {
				this.jPanelPaginacionTipoDocumentoPersonal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDocumentoPersonal!=null) {
				this.jPanelParametrosReportesTipoDocumentoPersonal.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoDocumentoPersonal!=null) {
				this.jScrollPanelDatosEdicionTipoDocumentoPersonal.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDocumentoPersonal!=null) {
				this.jTabbedPaneBusquedasTipoDocumentoPersonal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDocumentoPersonal!=null) {
				this.jScrollPanelDatosTipoDocumentoPersonal.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDocumentoPersonal!=null) {
				this.jPanelPaginacionTipoDocumentoPersonal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDocumentoPersonal!=null) {
				this.jPanelParametrosReportesTipoDocumentoPersonal.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoDocumentoPersonal!=null) {
				this.jScrollPanelDatosEdicionTipoDocumentoPersonal.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDocumentoPersonal!=null) {
				this.jTabbedPaneBusquedasTipoDocumentoPersonal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDocumentoPersonal!=null) {
				this.jScrollPanelDatosTipoDocumentoPersonal.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDocumentoPersonal!=null) {
				this.jPanelPaginacionTipoDocumentoPersonal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDocumentoPersonal!=null) {
				this.jPanelParametrosReportesTipoDocumentoPersonal.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoDocumentoPersonal!=null) {
				this.jScrollPanelDatosEdicionTipoDocumentoPersonal.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDocumentoPersonal!=null) {
				this.jTabbedPaneBusquedasTipoDocumentoPersonal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDocumentoPersonal!=null) {
				this.jScrollPanelDatosTipoDocumentoPersonal.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDocumentoPersonal!=null) {
				this.jPanelPaginacionTipoDocumentoPersonal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDocumentoPersonal!=null) {
				this.jPanelParametrosReportesTipoDocumentoPersonal.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoDocumentoPersonal!=null) {
				this.jScrollPanelDatosEdicionTipoDocumentoPersonal.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDocumentoPersonal!=null) {
				this.jTabbedPaneBusquedasTipoDocumentoPersonal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDocumentoPersonal!=null) {
				this.jScrollPanelDatosTipoDocumentoPersonal.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDocumentoPersonal!=null) {
				this.jPanelPaginacionTipoDocumentoPersonal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDocumentoPersonal!=null) {
				this.jPanelParametrosReportesTipoDocumentoPersonal.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoDocumentoPersonal!=null) {
					this.jTabbedPaneBusquedasTipoDocumentoPersonal.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoDocumentoPersonal!=null) {
				this.jPanelParametrosReportesTipoDocumentoPersonal.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipodocumentopersonalSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDocumentoPersonal!=null) {
				this.jTabbedPaneBusquedasTipoDocumentoPersonal.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoDocumentoPersonal!=null) {
				this.jPanelParametrosReportesTipoDocumentoPersonal.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasTipoDocumentoPersonal.remove(jPanelFK_IdPaisTipoDocumentoPersonal);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoDocumentoPersonalSessionBean tipodocumentopersonalSessionBean=new TipoDocumentoPersonalSessionBean();
		
		if(this.tipodocumentopersonalSessionBean==null) {
			this.tipodocumentopersonalSessionBean=new TipoDocumentoPersonalSessionBean();
		}
		
		this.tipodocumentopersonalSessionBean.setsUltimaBusquedaTipoDocumentoPersonal(this.getsAccionBusqueda());
		this.tipodocumentopersonalSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipodocumentopersonalSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			tipodocumentopersonalSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoDocumentoPersonalSessionBean tipodocumentopersonalSessionBean=new TipoDocumentoPersonalSessionBean();
		
		if(this.tipodocumentopersonalSessionBean==null) {
			this.tipodocumentopersonalSessionBean=new TipoDocumentoPersonalSessionBean();
		}
		
		if(this.tipodocumentopersonalSessionBean.getsUltimaBusquedaTipoDocumentoPersonal()!=null&&!this.tipodocumentopersonalSessionBean.getsUltimaBusquedaTipoDocumentoPersonal().equals("")) {
			this.setsAccionBusqueda(tipodocumentopersonalSessionBean.getsUltimaBusquedaTipoDocumentoPersonal());
			this.setiNumeroPaginacion(tipodocumentopersonalSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipodocumentopersonalSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(tipodocumentopersonalSessionBean.getid_pais());
				tipodocumentopersonalSessionBean.setid_pais(-1L);
			}
		}
		
		this.tipodocumentopersonalSessionBean.setsUltimaBusquedaTipoDocumentoPersonal("");
		this.tipodocumentopersonalSessionBean.setiNumeroPaginacion(TipoDocumentoPersonalConstantesFunciones.INUMEROPAGINACION);
		this.tipodocumentopersonalSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoDocumentoPersonal(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoDocumentoPersonal() {
		this.updateBorderResaltarBusquedasFormularioTipoDocumentoPersonal();
		this.updateVisibilidadBusquedasFormularioTipoDocumentoPersonal();
		this.updateHabilitarBusquedasFormularioTipoDocumentoPersonal();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoDocumentoPersonal() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoDocumentoPersonal.getComponents().length>0) {
	

		if(this.tipodocumentopersonalConstantesFunciones.resaltarFK_IdPaisTipoDocumentoPersonal!=null) {
			index= this.jTabbedPaneBusquedasTipoDocumentoPersonal.indexOfComponent(this.jPanelFK_IdPaisTipoDocumentoPersonal);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumentoPersonal.getComponent(index);
				jPanel.setBorder(this.tipodocumentopersonalConstantesFunciones.resaltarFK_IdPaisTipoDocumentoPersonal);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoDocumentoPersonal() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoDocumentoPersonal.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoDocumentoPersonal.indexOfComponent(this.jPanelFK_IdPaisTipoDocumentoPersonal);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumentoPersonal.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipodocumentopersonalConstantesFunciones.mostrarFK_IdPaisTipoDocumentoPersonal);
			if(!this.tipodocumentopersonalConstantesFunciones.mostrarFK_IdPaisTipoDocumentoPersonal && index>-1) {
				this.jTabbedPaneBusquedasTipoDocumentoPersonal.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoDocumentoPersonal() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoDocumentoPersonal.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoDocumentoPersonal.indexOfComponent(this.jPanelFK_IdPaisTipoDocumentoPersonal);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumentoPersonal.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipodocumentopersonalConstantesFunciones.activarFK_IdPaisTipoDocumentoPersonal);
				this.jTabbedPaneBusquedasTipoDocumentoPersonal.setEnabledAt(index,this.tipodocumentopersonalConstantesFunciones.activarFK_IdPaisTipoDocumentoPersonal);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoDocumentoPersonal(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasTipoDocumentoPersonal.indexOfComponent(this.jPanelFK_IdPaisTipoDocumentoPersonal);

			this.jTabbedPaneBusquedasTipoDocumentoPersonal.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumentoPersonal.getComponent(index);

			this.tipodocumentopersonalConstantesFunciones.setResaltarFK_IdPaisTipoDocumentoPersonal(resaltar);

			jPanel.setBorder(this.tipodocumentopersonalConstantesFunciones.resaltarFK_IdPaisTipoDocumentoPersonal);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoDocumentoPersonal.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoDocumentoPersonal() throws Exception {

		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoDocumentoPersonal();
		this.updateVisibilidadResaltarControlesFormularioTipoDocumentoPersonal();
		this.updateHabilitarResaltarControlesFormularioTipoDocumentoPersonal();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoDocumentoPersonal() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipodocumentopersonalConstantesFunciones.resaltaridTipoDocumentoPersonal!=null && this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextFieldidTipoDocumentoPersonal.setBorder(this.tipodocumentopersonalConstantesFunciones.resaltaridTipoDocumentoPersonal);}
		if(this.tipodocumentopersonalConstantesFunciones.resaltarid_paisTipoDocumentoPersonal!=null && this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxid_paisTipoDocumentoPersonal.setBorder(this.tipodocumentopersonalConstantesFunciones.resaltarid_paisTipoDocumentoPersonal);}
		if(this.tipodocumentopersonalConstantesFunciones.resaltarcodigoTipoDocumentoPersonal!=null && this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextFieldcodigoTipoDocumentoPersonal.setBorder(this.tipodocumentopersonalConstantesFunciones.resaltarcodigoTipoDocumentoPersonal);}
		if(this.tipodocumentopersonalConstantesFunciones.resaltarnombreTipoDocumentoPersonal!=null && this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextAreanombreTipoDocumentoPersonal.setBorder(this.tipodocumentopersonalConstantesFunciones.resaltarnombreTipoDocumentoPersonal);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoDocumentoPersonal() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {
	
		//this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextFieldidTipoDocumentoPersonal.setVisible(this.tipodocumentopersonalConstantesFunciones.mostraridTipoDocumentoPersonal);
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jPanelidTipoDocumentoPersonal.setVisible(this.tipodocumentopersonalConstantesFunciones.mostraridTipoDocumentoPersonal);
		//this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxid_paisTipoDocumentoPersonal.setVisible(this.tipodocumentopersonalConstantesFunciones.mostrarid_paisTipoDocumentoPersonal);
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jPanelid_paisTipoDocumentoPersonal.setVisible(this.tipodocumentopersonalConstantesFunciones.mostrarid_paisTipoDocumentoPersonal);
		//this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextFieldcodigoTipoDocumentoPersonal.setVisible(this.tipodocumentopersonalConstantesFunciones.mostrarcodigoTipoDocumentoPersonal);
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jPanelcodigoTipoDocumentoPersonal.setVisible(this.tipodocumentopersonalConstantesFunciones.mostrarcodigoTipoDocumentoPersonal);
		//this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextAreanombreTipoDocumentoPersonal.setVisible(this.tipodocumentopersonalConstantesFunciones.mostrarnombreTipoDocumentoPersonal);
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jPanelnombreTipoDocumentoPersonal.setVisible(this.tipodocumentopersonalConstantesFunciones.mostrarnombreTipoDocumentoPersonal);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoDocumentoPersonal() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDocumentoPersonal!=null) {
	
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextFieldidTipoDocumentoPersonal.setEnabled(this.tipodocumentopersonalConstantesFunciones.activaridTipoDocumentoPersonal);
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jComboBoxid_paisTipoDocumentoPersonal.setEnabled(this.tipodocumentopersonalConstantesFunciones.activarid_paisTipoDocumentoPersonal);
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextFieldcodigoTipoDocumentoPersonal.setEnabled(this.tipodocumentopersonalConstantesFunciones.activarcodigoTipoDocumentoPersonal);
		this.jInternalFrameDetalleFormTipoDocumentoPersonal.jTextAreanombreTipoDocumentoPersonal.setEnabled(this.tipodocumentopersonalConstantesFunciones.activarnombreTipoDocumentoPersonal);
		}
	}
	
		
}