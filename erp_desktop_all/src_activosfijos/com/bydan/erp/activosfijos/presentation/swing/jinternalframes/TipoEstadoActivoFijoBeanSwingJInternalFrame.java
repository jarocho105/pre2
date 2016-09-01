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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;




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

import com.bydan.erp.activosfijos.util.TipoEstadoActivoFijoConstantesFunciones;
import com.bydan.erp.activosfijos.util.TipoEstadoActivoFijoParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.TipoEstadoActivoFijoParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.TipoEstadoActivoFijoBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.activosfijos.resources.reportes.AuxiliarReportes;


import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
public class TipoEstadoActivoFijoBeanSwingJInternalFrame extends TipoEstadoActivoFijoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoEstadoActivoFijoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoEstadoActivoFijo> tipoestadoactivofijoValidator = new ClassValidator<TipoEstadoActivoFijo>(TipoEstadoActivoFijo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoEstadoActivoFijo tipoestadoactivofijo;	
	public TipoEstadoActivoFijo tipoestadoactivofijoAux;
	public TipoEstadoActivoFijo tipoestadoactivofijoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoEstadoActivoFijo tipoestadoactivofijoTotales;
	public Long idTipoEstadoActivoFijoActual;
	public Long iIdNuevoTipoEstadoActivoFijo=0L;
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
	
	public Boolean isPermisoTodoTipoEstadoActivoFijo;
	public Boolean isPermisoNuevoTipoEstadoActivoFijo;
	public Boolean isPermisoActualizarTipoEstadoActivoFijo;
	public Boolean isPermisoActualizarOriginalTipoEstadoActivoFijo;
	public Boolean isPermisoEliminarTipoEstadoActivoFijo;
	public Boolean isPermisoGuardarCambiosTipoEstadoActivoFijo;
	public Boolean isPermisoConsultaTipoEstadoActivoFijo;
	public Boolean isPermisoBusquedaTipoEstadoActivoFijo;
	public Boolean isPermisoReporteTipoEstadoActivoFijo;
	public Boolean isPermisoPaginacionMedioTipoEstadoActivoFijo;
	public Boolean isPermisoPaginacionAltoTipoEstadoActivoFijo;
	public Boolean isPermisoPaginacionTodoTipoEstadoActivoFijo;
	public Boolean isPermisoCopiarTipoEstadoActivoFijo;
	public Boolean isPermisoVerFormTipoEstadoActivoFijo;
	public Boolean isPermisoDuplicarTipoEstadoActivoFijo;
	public Boolean isPermisoOrdenTipoEstadoActivoFijo;
	
	
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
	
	public TipoEstadoActivoFijoParameterReturnGeneral tipoestadoactivofijoReturnGeneral;
	public TipoEstadoActivoFijoParameterReturnGeneral tipoestadoactivofijoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoEstadoActivoFijo=false;
	public Boolean esParaAccionDesdeFormularioTipoEstadoActivoFijo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoEstadoActivoFijoLogic tipoestadoactivofijoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoEstadoActivoFijo tipoestadoactivofijoBean;
	public TipoEstadoActivoFijoConstantesFunciones tipoestadoactivofijoConstantesFunciones;
	//public TipoEstadoActivoFijoParameterReturnGeneral tipoestadoactivofijoReturnGeneral;
	
	//FK
	
	public PaisLogic paisLogic;
	
	//PARAMETROS
	
	
	//public List<TipoEstadoActivoFijo> tipoestadoactivofijos;	
	//public List<TipoEstadoActivoFijo> tipoestadoactivofijosEliminados;
	//public List<TipoEstadoActivoFijo> tipoestadoactivofijosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoEstadoActivoFijo=false;
	public Boolean isVisibilidadCeldaDuplicarTipoEstadoActivoFijo=true;
	public Boolean isVisibilidadCeldaCopiarTipoEstadoActivoFijo=true;
	public Boolean isVisibilidadCeldaVerFormTipoEstadoActivoFijo=true;
	public Boolean isVisibilidadCeldaOrdenTipoEstadoActivoFijo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo=false;
	public Boolean isVisibilidadCeldaModificarTipoEstadoActivoFijo=false;
	public Boolean isVisibilidadCeldaActualizarTipoEstadoActivoFijo=false;
	public Boolean isVisibilidadCeldaEliminarTipoEstadoActivoFijo=false;
	public Boolean isVisibilidadCeldaCancelarTipoEstadoActivoFijo=false;
	public Boolean isVisibilidadCeldaGuardarTipoEstadoActivoFijo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoEstadoActivoFijo=false;	
	
	
	public Boolean isVisibilidadFK_IdPais=false;
	
	public Long getiIdNuevoTipoEstadoActivoFijo() {
		return this.iIdNuevoTipoEstadoActivoFijo;
	}

	public void setiIdNuevoTipoEstadoActivoFijo(Long iIdNuevoTipoEstadoActivoFijo) {
		this.iIdNuevoTipoEstadoActivoFijo = iIdNuevoTipoEstadoActivoFijo;
	}
	
	public Long getidTipoEstadoActivoFijoActual() {
		return this.idTipoEstadoActivoFijoActual;
	}

	public void setidTipoEstadoActivoFijoActual(Long idTipoEstadoActivoFijoActual) {
		this.idTipoEstadoActivoFijoActual = idTipoEstadoActivoFijoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoEstadoActivoFijo gettipoestadoactivofijo() {
		return this.tipoestadoactivofijo;
	}

	public void settipoestadoactivofijo(TipoEstadoActivoFijo tipoestadoactivofijo) {
		this.tipoestadoactivofijo = tipoestadoactivofijo;
	}
	
	public TipoEstadoActivoFijo gettipoestadoactivofijoAux() {
		return this.tipoestadoactivofijoAux;
	}

	public void settipoestadoactivofijoAux(TipoEstadoActivoFijo tipoestadoactivofijoAux) {
		this.tipoestadoactivofijoAux = tipoestadoactivofijoAux;
	}				
	
	public TipoEstadoActivoFijo gettipoestadoactivofijoAnterior() {
		return this.tipoestadoactivofijoAnterior;
	}

	public void settipoestadoactivofijoAnterior(TipoEstadoActivoFijo tipoestadoactivofijoAnterior) {
		this.tipoestadoactivofijoAnterior = tipoestadoactivofijoAnterior;
	}	
	
	public TipoEstadoActivoFijo gettipoestadoactivofijoTotales() {
		return this.tipoestadoactivofijoTotales;
	}

	public void settipoestadoactivofijoTotales(TipoEstadoActivoFijo tipoestadoactivofijoTotales) {
		this.tipoestadoactivofijoTotales = tipoestadoactivofijoTotales;
	}	
	
	public TipoEstadoActivoFijo gettipoestadoactivofijoBean() {
		return this.tipoestadoactivofijoBean;
	}

	public void settipoestadoactivofijoBean(TipoEstadoActivoFijo tipoestadoactivofijoBean) {
		this.tipoestadoactivofijoBean = tipoestadoactivofijoBean;
	}	
	
	public TipoEstadoActivoFijoParameterReturnGeneral gettipoestadoactivofijoReturnGeneral() {
		return this.tipoestadoactivofijoReturnGeneral;
	}

	public void settipoestadoactivofijoReturnGeneral(TipoEstadoActivoFijoParameterReturnGeneral tipoestadoactivofijoReturnGeneral) {
		this.tipoestadoactivofijoReturnGeneral = tipoestadoactivofijoReturnGeneral;
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
	
	
	public TipoEstadoActivoFijoLogic getTipoEstadoActivoFijoLogic()	{		
		return tipoestadoactivofijoLogic;
	}

	public void setTipoEstadoActivoFijoLogic(TipoEstadoActivoFijoLogic tipoestadoactivofijoLogic) {
		this.tipoestadoactivofijoLogic = tipoestadoactivofijoLogic;
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
	
	public Boolean getIsEsNuevoTipoEstadoActivoFijo() {
		return isEsNuevoTipoEstadoActivoFijo;
	}

	public void setIsEsNuevoTipoEstadoActivoFijo(Boolean isEsNuevoTipoEstadoActivoFijo) {
		this.isEsNuevoTipoEstadoActivoFijo = isEsNuevoTipoEstadoActivoFijo;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoEstadoActivoFijo() {
		return esParaAccionDesdeFormularioTipoEstadoActivoFijo;
	}
	
	public void setEsParaAccionDesdeFormularioTipoEstadoActivoFijo(Boolean esParaAccionDesdeFormularioTipoEstadoActivoFijo) {
		this.esParaAccionDesdeFormularioTipoEstadoActivoFijo = esParaAccionDesdeFormularioTipoEstadoActivoFijo;
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

			if(this.tipoestadoactivofijoSessionBean==null) {
				this.tipoestadoactivofijoSessionBean=new TipoEstadoActivoFijoSessionBean();
			}

			if(!this.tipoestadoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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
					paisLogic.getEntityWithConnection(tipoestadoactivofijoSessionBean.getlidPaisActual());
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

					if(this.tipoestadoactivofijo!=null) {
						this.tipoestadoactivofijo.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {
						this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxid_paisTipoEstadoActivoFijo.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisTipoEstadoActivoFijo.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxid_paisTipoEstadoActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxid_paisTipoEstadoActivoFijo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisTipoEstadoActivoFijo!=null) {
						jComboBoxid_paisFK_IdPaisTipoEstadoActivoFijo.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisTipoEstadoActivoFijo!=null) {
							//jComboBoxid_paisFK_IdPaisTipoEstadoActivoFijo.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisTipoEstadoActivoFijo.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisTipoEstadoActivoFijo.setSelectedIndex(0);
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
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisTipoEstadoActivoFijoGenerico)throws Exception
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
				jComboBoxid_paisTipoEstadoActivoFijoGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisTipoEstadoActivoFijoGenerico!=null && jComboBoxid_paisTipoEstadoActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_paisTipoEstadoActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(TipoEstadoActivoFijo tipoestadoactivofijo,JComboBox jComboBoxid_paisTipoEstadoActivoFijoGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisTipoEstadoActivoFijoGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxid_paisTipoEstadoActivoFijo.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisTipoEstadoActivoFijoGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				tipoestadoactivofijo.setid_pais(paisAux.getId());
				tipoestadoactivofijo.setpais_descripcion(TipoEstadoActivoFijoConstantesFunciones.getPaisDescripcion(paisAux));
				tipoestadoactivofijo.setPais(paisAux);			}
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

					if(!TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) { 
							this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxid_paisTipoEstadoActivoFijo.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxid_paisTipoEstadoActivoFijo.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) { 
					}

					if(!TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoEstadoActivoFijo.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisTipoEstadoActivoFijo.addItem(pais);
							}
						}

						if(!TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {
							this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxid_paisTipoEstadoActivoFijo.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {
							this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxid_paisTipoEstadoActivoFijo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisTipoEstadoActivoFijo.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoEstadoActivoFijo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoEstadoActivoFijo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoEstadoActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesTipoEstadoActivoFijo(this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoEstadoActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesTipoEstadoActivoFijo(this.tipoestadoactivofijos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Pais.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoestadoactivofijoLogic.setTipoEstadoActivoFijos(this.tipoestadoactivofijos);
			tipoestadoactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoEstadoActivoFijoParameterReturnGeneral getTipoEstadoActivoFijoParameterGeneral() {
		return this.tipoestadoactivofijoParameterGeneral;
	}
	
	public void setTipoEstadoActivoFijoParameterGeneral(TipoEstadoActivoFijoParameterReturnGeneral tipoestadoactivofijoParameterGeneral) {
		this.tipoestadoactivofijoParameterGeneral = tipoestadoactivofijoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoEstadoActivoFijo() {
		return isPermisoTodoTipoEstadoActivoFijo;
	}

	public void setIsPermisoTodoTipoEstadoActivoFijo(Boolean isPermisoTodoTipoEstadoActivoFijo) {
		this.isPermisoTodoTipoEstadoActivoFijo = isPermisoTodoTipoEstadoActivoFijo;
	}

	public Boolean getIsPermisoNuevoTipoEstadoActivoFijo() {
		return isPermisoNuevoTipoEstadoActivoFijo;
	}

	public void setIsPermisoNuevoTipoEstadoActivoFijo(Boolean isPermisoNuevoTipoEstadoActivoFijo) {
		this.isPermisoNuevoTipoEstadoActivoFijo = isPermisoNuevoTipoEstadoActivoFijo;
	}

	public Boolean getIsPermisoActualizarTipoEstadoActivoFijo() {
		return isPermisoActualizarTipoEstadoActivoFijo;
	}

	public void setIsPermisoActualizarTipoEstadoActivoFijo(Boolean isPermisoActualizarTipoEstadoActivoFijo) {
		this.isPermisoActualizarTipoEstadoActivoFijo = isPermisoActualizarTipoEstadoActivoFijo;
	}

	public Boolean getIsPermisoEliminarTipoEstadoActivoFijo() {
		return isPermisoEliminarTipoEstadoActivoFijo;
	}

	public void setIsPermisoEliminarTipoEstadoActivoFijo(Boolean isPermisoEliminarTipoEstadoActivoFijo) {
		this.isPermisoEliminarTipoEstadoActivoFijo = isPermisoEliminarTipoEstadoActivoFijo;
	}

	public Boolean getIsPermisoGuardarCambiosTipoEstadoActivoFijo() {
		return isPermisoGuardarCambiosTipoEstadoActivoFijo;
	}

	public void setIsPermisoGuardarCambiosTipoEstadoActivoFijo(Boolean isPermisoGuardarCambiosTipoEstadoActivoFijo) {
		this.isPermisoGuardarCambiosTipoEstadoActivoFijo = isPermisoGuardarCambiosTipoEstadoActivoFijo;
	}
	
	public Boolean getIsPermisoConsultaTipoEstadoActivoFijo() {
		return isPermisoConsultaTipoEstadoActivoFijo;
	}

	public void setIsPermisoConsultaTipoEstadoActivoFijo(Boolean isPermisoConsultaTipoEstadoActivoFijo) {
		this.isPermisoConsultaTipoEstadoActivoFijo = isPermisoConsultaTipoEstadoActivoFijo;
	}

	public Boolean getIsPermisoBusquedaTipoEstadoActivoFijo() {
		return isPermisoBusquedaTipoEstadoActivoFijo;
	}

	public void setIsPermisoBusquedaTipoEstadoActivoFijo(Boolean isPermisoBusquedaTipoEstadoActivoFijo) {
		this.isPermisoBusquedaTipoEstadoActivoFijo = isPermisoBusquedaTipoEstadoActivoFijo;
	}

	public Boolean getIsPermisoReporteTipoEstadoActivoFijo() {
		return isPermisoReporteTipoEstadoActivoFijo;
	}

	public void setIsPermisoReporteTipoEstadoActivoFijo(Boolean isPermisoReporteTipoEstadoActivoFijo) {
		this.isPermisoReporteTipoEstadoActivoFijo = isPermisoReporteTipoEstadoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoEstadoActivoFijo() {
		return isPermisoPaginacionMedioTipoEstadoActivoFijo;
	}

	public void setIsPermisoPaginacionMedioTipoEstadoActivoFijo(Boolean isPermisoPaginacionMedioTipoEstadoActivoFijo) {
		this.isPermisoPaginacionMedioTipoEstadoActivoFijo = isPermisoPaginacionMedioTipoEstadoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoEstadoActivoFijo() {
		return isPermisoPaginacionTodoTipoEstadoActivoFijo;
	}

	public void setIsPermisoPaginacionTodoTipoEstadoActivoFijo(Boolean isPermisoPaginacionTodoTipoEstadoActivoFijo) {
		this.isPermisoPaginacionTodoTipoEstadoActivoFijo = isPermisoPaginacionTodoTipoEstadoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoEstadoActivoFijo() {
		return isPermisoPaginacionAltoTipoEstadoActivoFijo;
	}

	public void setIsPermisoPaginacionAltoTipoEstadoActivoFijo(Boolean isPermisoPaginacionAltoTipoEstadoActivoFijo) {
		this.isPermisoPaginacionAltoTipoEstadoActivoFijo = isPermisoPaginacionAltoTipoEstadoActivoFijo;
	}
	
	public Boolean getIsPermisoCopiarTipoEstadoActivoFijo() {
		return isPermisoCopiarTipoEstadoActivoFijo;
	}

	public void setIsPermisoCopiarTipoEstadoActivoFijo(Boolean isPermisoCopiarTipoEstadoActivoFijo) {
		this.isPermisoCopiarTipoEstadoActivoFijo = isPermisoCopiarTipoEstadoActivoFijo;
	}
	
	public Boolean getIsPermisoVerFormTipoEstadoActivoFijo() {
		return isPermisoVerFormTipoEstadoActivoFijo;
	}

	public void setIsPermisoVerFormTipoEstadoActivoFijo(Boolean isPermisoVerFormTipoEstadoActivoFijo) {
		this.isPermisoVerFormTipoEstadoActivoFijo = isPermisoVerFormTipoEstadoActivoFijo;
	}
	
	public Boolean getIsPermisoDuplicarTipoEstadoActivoFijo() {
		return isPermisoDuplicarTipoEstadoActivoFijo;
	}

	public void setIsPermisoDuplicarTipoEstadoActivoFijo(Boolean isPermisoDuplicarTipoEstadoActivoFijo) {
		this.isPermisoDuplicarTipoEstadoActivoFijo = isPermisoDuplicarTipoEstadoActivoFijo;
	}
	
	public Boolean getIsPermisoOrdenTipoEstadoActivoFijo() {
		return isPermisoOrdenTipoEstadoActivoFijo;
	}

	public void setIsPermisoOrdenTipoEstadoActivoFijo(Boolean isPermisoOrdenTipoEstadoActivoFijo) {
		this.isPermisoOrdenTipoEstadoActivoFijo = isPermisoOrdenTipoEstadoActivoFijo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoEstadoActivoFijo() {
		return isVisibilidadCeldaNuevoTipoEstadoActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoTipoEstadoActivoFijo(Boolean isVisibilidadCeldaNuevoTipoEstadoActivoFijo) {
		this.isVisibilidadCeldaNuevoTipoEstadoActivoFijo = isVisibilidadCeldaNuevoTipoEstadoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoEstadoActivoFijo() {
		return isVisibilidadCeldaDuplicarTipoEstadoActivoFijo;
	}

	public void setIsVisibilidadCeldaDuplicarTipoEstadoActivoFijo(Boolean isVisibilidadCeldaDuplicarTipoEstadoActivoFijo) {
		this.isVisibilidadCeldaDuplicarTipoEstadoActivoFijo = isVisibilidadCeldaDuplicarTipoEstadoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoEstadoActivoFijo() {
		return isVisibilidadCeldaCopiarTipoEstadoActivoFijo;
	}

	public void setIsVisibilidadCeldaCopiarTipoEstadoActivoFijo(Boolean isVisibilidadCeldaCopiarTipoEstadoActivoFijo) {
		this.isVisibilidadCeldaCopiarTipoEstadoActivoFijo = isVisibilidadCeldaCopiarTipoEstadoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoEstadoActivoFijo() {
		return isVisibilidadCeldaVerFormTipoEstadoActivoFijo;
	}

	public void setIsVisibilidadCeldaVerFormTipoEstadoActivoFijo(Boolean isVisibilidadCeldaVerFormTipoEstadoActivoFijo) {
		this.isVisibilidadCeldaVerFormTipoEstadoActivoFijo = isVisibilidadCeldaVerFormTipoEstadoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoEstadoActivoFijo() {
		return isVisibilidadCeldaOrdenTipoEstadoActivoFijo;
	}

	public void setIsVisibilidadCeldaOrdenTipoEstadoActivoFijo(Boolean isVisibilidadCeldaOrdenTipoEstadoActivoFijo) {
		this.isVisibilidadCeldaOrdenTipoEstadoActivoFijo = isVisibilidadCeldaOrdenTipoEstadoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo() {
		return isVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo(Boolean isVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo) {
		this.isVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo = isVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoEstadoActivoFijo() {
		return isVisibilidadCeldaModificarTipoEstadoActivoFijo;
	}

	public void setIsVisibilidadCeldaModificarTipoEstadoActivoFijo(Boolean isVisibilidadCeldaModificarTipoEstadoActivoFijo) {
		this.isVisibilidadCeldaModificarTipoEstadoActivoFijo = isVisibilidadCeldaModificarTipoEstadoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoEstadoActivoFijo() {
		return isVisibilidadCeldaActualizarTipoEstadoActivoFijo;
	}

	public void setIsVisibilidadCeldaActualizarTipoEstadoActivoFijo(Boolean isVisibilidadCeldaActualizarTipoEstadoActivoFijo) {
		this.isVisibilidadCeldaActualizarTipoEstadoActivoFijo = isVisibilidadCeldaActualizarTipoEstadoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoEstadoActivoFijo() {
		return isVisibilidadCeldaEliminarTipoEstadoActivoFijo;
	}

	public void setIsVisibilidadCeldaEliminarTipoEstadoActivoFijo(Boolean isVisibilidadCeldaEliminarTipoEstadoActivoFijo) {
		this.isVisibilidadCeldaEliminarTipoEstadoActivoFijo = isVisibilidadCeldaEliminarTipoEstadoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoEstadoActivoFijo() {
		return isVisibilidadCeldaCancelarTipoEstadoActivoFijo;
	}

	public void setIsVisibilidadCeldaCancelarTipoEstadoActivoFijo(Boolean isVisibilidadCeldaCancelarTipoEstadoActivoFijo) {
		this.isVisibilidadCeldaCancelarTipoEstadoActivoFijo = isVisibilidadCeldaCancelarTipoEstadoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoEstadoActivoFijo() {
		return isVisibilidadCeldaGuardarTipoEstadoActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarTipoEstadoActivoFijo(Boolean isVisibilidadCeldaGuardarTipoEstadoActivoFijo) {
		this.isVisibilidadCeldaGuardarTipoEstadoActivoFijo = isVisibilidadCeldaGuardarTipoEstadoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoEstadoActivoFijo() {
		return isVisibilidadCeldaGuardarCambiosTipoEstadoActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoEstadoActivoFijo(Boolean isVisibilidadCeldaGuardarCambiosTipoEstadoActivoFijo) {
		this.isVisibilidadCeldaGuardarCambiosTipoEstadoActivoFijo = isVisibilidadCeldaGuardarCambiosTipoEstadoActivoFijo;
	}
		
	public TipoEstadoActivoFijoSessionBean gettipoestadoactivofijoSessionBean() {
		return this.tipoestadoactivofijoSessionBean;
	}
	
	public void settipoestadoactivofijoSessionBean(TipoEstadoActivoFijoSessionBean tipoestadoactivofijoSessionBean) {
		this.tipoestadoactivofijoSessionBean=tipoestadoactivofijoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoEstadoActivoFijo(TipoEstadoActivoFijo tipoestadoactivofijo)throws Exception {
		try {
			
				this.setActualParaGuardarPaisForeignKey(tipoestadoactivofijo,null);
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
	
	public void bugActualizarReferenciaActual(TipoEstadoActivoFijo tipoestadoactivofijo,TipoEstadoActivoFijo tipoestadoactivofijoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoEstadoActivoFijo(tipoestadoactivofijo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoestadoactivofijoAux.setId(tipoestadoactivofijo.getId());
		tipoestadoactivofijoAux.setVersionRow(tipoestadoactivofijo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoEstadoActivoFijo();
		
			int intSelectedRow = this.jTableDatosTipoEstadoActivoFijo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoEstadoActivoFijo(this.tipoestadoactivofijo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoActivoFijo(this.tipoestadoactivofijo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoestadoactivofijoValidator.getInvalidValues(this.tipoestadoactivofijo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoestadoactivofijoLogic.setDatosCliente(datosCliente);
			tipoestadoactivofijoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoestadoactivofijoAux=new  TipoEstadoActivoFijo();
				
				tipoestadoactivofijoAux.setIsNew(true);
				tipoestadoactivofijoAux.setIsChanged(true);
				
				tipoestadoactivofijoAux.setTipoEstadoActivoFijoOriginal(this.tipoestadoactivofijo);
				
				tipoestadoactivofijoAux.setId(this.tipoestadoactivofijo.getId());	
				tipoestadoactivofijoAux.setVersionRow(this.tipoestadoactivofijo.getVersionRow());	
				tipoestadoactivofijoAux.setid_pais(this.tipoestadoactivofijo.getid_pais());	
				tipoestadoactivofijoAux.setnombre(this.tipoestadoactivofijo.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoestadoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoestadoactivofijoAux,tipoestadoactivofijoLogic.getTipoEstadoActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoestadoactivofijoAux,tipoestadoactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoestadoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoestadoactivofijoLogic.saveTipoEstadoActivoFijos();//WithConnection
						//tipoestadoactivofijoLogic.getSetVersionRowTipoEstadoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoestadoactivofijo,tipoestadoactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesTipoEstadoActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoestadoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoestadoactivofijoAux=new  TipoEstadoActivoFijo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado() && this.tipoestadoactivofijo.getId()>=0)) {
						
					tipoestadoactivofijoAux.setIsNew(false);
				}
				
				tipoestadoactivofijoAux.setIsDeleted(false);
			
				tipoestadoactivofijoAux.setId(this.tipoestadoactivofijo.getId());	
				tipoestadoactivofijoAux.setVersionRow(this.tipoestadoactivofijo.getVersionRow());	
				tipoestadoactivofijoAux.setid_pais(this.tipoestadoactivofijo.getid_pais());	
				tipoestadoactivofijoAux.setnombre(this.tipoestadoactivofijo.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoestadoactivofijoAux,tipoestadoactivofijoLogic.getTipoEstadoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoestadoactivofijoAux,tipoestadoactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoestadoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoestadoactivofijoLogic.saveTipoEstadoActivoFijos();//WithConnection
						//tipoestadoactivofijoLogic.getSetVersionRowTipoEstadoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoestadoactivofijo,tipoestadoactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesTipoEstadoActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoestadoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoestadoactivofijoAux=new  TipoEstadoActivoFijo();
				
				tipoestadoactivofijoAux.setIsNew(false);
				tipoestadoactivofijoAux.setIsChanged(false);
				
				tipoestadoactivofijoAux.setIsDeleted(true);
				
				tipoestadoactivofijoAux.setId(this.tipoestadoactivofijo.getId());	
				tipoestadoactivofijoAux.setVersionRow(this.tipoestadoactivofijo.getVersionRow());	
				tipoestadoactivofijoAux.setid_pais(this.tipoestadoactivofijo.getid_pais());	
				tipoestadoactivofijoAux.setnombre(this.tipoestadoactivofijo.getnombre());	
				
				if(this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoestadoactivofijoAux.getId()>=0) {	
						this.tipoestadoactivofijosEliminados.add(tipoestadoactivofijoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoestadoactivofijoAux,tipoestadoactivofijoLogic.getTipoEstadoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoestadoactivofijoAux,tipoestadoactivofijos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoestadoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoestadoactivofijoLogic.saveTipoEstadoActivoFijos();//WithConnection
						//tipoestadoactivofijoLogic.getSetVersionRowTipoEstadoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoestadoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoestadoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoestadoactivofijoAux,tipoestadoactivofijoLogic.getTipoEstadoActivoFijos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoestadoactivofijoAux,tipoestadoactivofijos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().addAll(this.tipoestadoactivofijosEliminados);
					
					tipoestadoactivofijoLogic.saveTipoEstadoActivoFijos();//WithConnection
					//tipoestadoactivofijoLogic.getSetVersionRowTipoEstadoActivoFijos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoEstadoActivoFijo();
				
				this.tipoestadoactivofijosEliminados= new ArrayList<TipoEstadoActivoFijo>();		
			}
			
			if(this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Estado Activo Fijo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Estado Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoestadoactivofijo=tipoestadoactivofijoAux;
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
      		//this.finishProcessTipoEstadoActivoFijo();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoEstadoActivoFijo tipoestadoactivofijoLocal) throws Exception {
		
		if(this.tipoestadoactivofijoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoEstadoActivoFijo tipoestadoactivofijoLocal) throws Exception {	
		if(this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				tipoestadoactivofijoLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoEstadoActivoFijoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoEstadoActivoFijo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoestadoactivofijoValidator.getInvalidValues(this.tipoestadoactivofijo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoEstadoActivoFijo tipoestadoactivofijo,List<TipoEstadoActivoFijo> tipoestadoactivofijos) throws Exception {
		try	{		
			TipoEstadoActivoFijoConstantesFunciones.actualizarLista(tipoestadoactivofijo,tipoestadoactivofijos,this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoEstadoActivoFijo tipoestadoactivofijo,List<TipoEstadoActivoFijo> tipoestadoactivofijos) throws Exception {
		try	{			
			TipoEstadoActivoFijoConstantesFunciones.actualizarSelectedLista(tipoestadoactivofijo,tipoestadoactivofijos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoEstadoActivoFijo> tipoestadoactivofijosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoestadoactivofijosLocal=this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoestadoactivofijosLocal=this.tipoestadoactivofijos;
			}
			//ARCHITECTURE
		
			for(TipoEstadoActivoFijo tipoestadoactivofijoLocal:tipoestadoactivofijosLocal) {
				if(this.permiteMantenimiento(tipoestadoactivofijoLocal) && tipoestadoactivofijoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoEstadoActivoFijoConstantesFunciones.getTipoEstadoActivoFijoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoEstadoActivoFijoConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jLabelid_paisTipoEstadoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoEstadoActivoFijoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jLabelnombreTipoEstadoActivoFijo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jLabelid_paisTipoEstadoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jLabelnombreTipoEstadoActivoFijo,"");
		
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
		this.iIdNuevoTipoEstadoActivoFijo--;	
		
		
		this.tipoestadoactivofijoAux=new TipoEstadoActivoFijo();
		
		this.tipoestadoactivofijoAux.setId(this.iIdNuevoTipoEstadoActivoFijo);
		this.tipoestadoactivofijoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().add(this.tipoestadoactivofijoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoestadoactivofijos.add(this.tipoestadoactivofijoAux);
		}
		//ARCHITECTURE
		
		this.tipoestadoactivofijo=this.tipoestadoactivofijoAux;
		
		if(TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoEstadoActivoFijo(this.tipoestadoactivofijo);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoEstadoActivoFijo(this.tipoestadoactivofijo);
		}
				
		//this.setDefaultControlesTipoEstadoActivoFijo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoEstadoActivoFijo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoEstadoActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoEstadoActivoFijo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoEstadoActivoFijo(this.tipoestadoactivofijoBean,this.tipoestadoactivofijo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoActivoFijo(this.tipoestadoactivofijo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoestadoactivofijoSessionBean.getConGuardarRelaciones()) {
			classes=TipoEstadoActivoFijoConstantesFunciones.getClassesRelationshipsOfTipoEstadoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoestadoactivofijoReturnGeneral=tipoestadoactivofijoLogic.procesarEventosTipoEstadoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos(),this.tipoestadoactivofijo,this.tipoestadoactivofijoParameterGeneral,this.isEsNuevoTipoEstadoActivoFijo,classes);//this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoEstadoActivoFijo(this.tipoestadoactivofijoReturnGeneral,this.tipoestadoactivofijoBean,false);
		
		if(this.tipoestadoactivofijoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoEstadoActivoFijo(this.tipoestadoactivofijoReturnGeneral.getTipoEstadoActivoFijo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoEstadoActivoFijo(this.tipoestadoactivofijoReturnGeneral.getTipoEstadoActivoFijo());
		}
		
		if(this.tipoestadoactivofijoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoEstadoActivoFijo(this.tipoestadoactivofijoReturnGeneral.getTipoEstadoActivoFijo(),classes);//this.tipoestadoactivofijoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoEstadoActivoFijo(this.tipoestadoactivofijo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoEstadoActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoEstadoActivoFijo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoEstadoActivoFijo(false);
						
			if(tipoestadoactivofijoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoEstadoActivoFijo();
			}
			
			this.actualizarVisualTableDatosTipoEstadoActivoFijo();
			
			this.jTableDatosTipoEstadoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoTipoEstadoActivoFijo(), this.getIndiceNuevoTipoEstadoActivoFijo());
			
			this.seleccionarFilaTablaTipoEstadoActivoFijoActual();
						
			this.actualizarEstadoCeldasBotonesTipoEstadoActivoFijo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoEstadoActivoFijo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTextAreanombreTipoEstadoActivoFijo.setEnabled(isHabilitar && this.tipoestadoactivofijoConstantesFunciones.activarnombreTipoEstadoActivoFijo);	
		
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxid_paisTipoEstadoActivoFijo.setEnabled(isHabilitar && this.tipoestadoactivofijoConstantesFunciones.activarid_paisTipoEstadoActivoFijo);
	};
	
	public void setDefaultControlesTipoEstadoActivoFijo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoEstadoActivoFijo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoestadoactivofijoSessionBean.setConGuardarRelaciones(true);			
			this.tipoestadoactivofijoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTabbedPaneRelacionesTipoEstadoActivoFijo.setVisible(true);
			
					
		} else {
			//this.tipoestadoactivofijoSessionBean.setConGuardarRelaciones(false);			
			this.tipoestadoactivofijoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTabbedPaneRelacionesTipoEstadoActivoFijo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoEstadoActivoFijo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEstadoActivoFijo tipoestadoactivofijoAux:this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos()) {
				if(tipoestadoactivofijoAux.getId().equals(this.iIdNuevoTipoEstadoActivoFijo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEstadoActivoFijo tipoestadoactivofijoAux:this.tipoestadoactivofijos) {
				if(tipoestadoactivofijoAux.getId().equals(this.iIdNuevoTipoEstadoActivoFijo)) {
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
	
	public int getIndiceActualTipoEstadoActivoFijo(TipoEstadoActivoFijo tipoestadoactivofijo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEstadoActivoFijo tipoestadoactivofijoAux:this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos()) {
				if(tipoestadoactivofijoAux.getId().equals(tipoestadoactivofijo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEstadoActivoFijo tipoestadoactivofijoAux:this.tipoestadoactivofijos) {
				if(tipoestadoactivofijoAux.getId().equals(tipoestadoactivofijo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoEstadoActivoFijo(TipoEstadoActivoFijo tipoestadoactivofijoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEstadoActivoFijo tipoestadoactivofijoAux:this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos()) {
				if(tipoestadoactivofijoAux.getTipoEstadoActivoFijoOriginal().getId().equals(tipoestadoactivofijoOriginal.getId())) {
					existe=true;
					tipoestadoactivofijoOriginal.setId(tipoestadoactivofijoAux.getId());
					tipoestadoactivofijoOriginal.setVersionRow(tipoestadoactivofijoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEstadoActivoFijo tipoestadoactivofijoAux:this.tipoestadoactivofijos) {
				if(tipoestadoactivofijoAux.getTipoEstadoActivoFijoOriginal().getId().equals(tipoestadoactivofijoOriginal.getId())) {
					existe=true;
					tipoestadoactivofijoOriginal.setId(tipoestadoactivofijoAux.getId());
					tipoestadoactivofijoOriginal.setVersionRow(tipoestadoactivofijoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoEstadoActivoFijo(Boolean esParaCancelar) throws Exception {
		tipoestadoactivofijosAux=new ArrayList<TipoEstadoActivoFijo>();
		tipoestadoactivofijoAux=new TipoEstadoActivoFijo();
		
		if(!this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoEstadoActivoFijo tipoestadoactivofijoAux:this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos()) {
					if(tipoestadoactivofijoAux.getId()<0) {
						tipoestadoactivofijosAux.add(tipoestadoactivofijoAux);
					}		
				}
				this.iIdNuevoTipoEstadoActivoFijo=0L;
				this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().removeAll(tipoestadoactivofijosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEstadoActivoFijo tipoestadoactivofijoAux:this.tipoestadoactivofijos) {
					if(tipoestadoactivofijoAux.getId()<0) {
						tipoestadoactivofijosAux.add(tipoestadoactivofijoAux);
					}		
				}
				this.iIdNuevoTipoEstadoActivoFijo=0L;
				this.tipoestadoactivofijos.removeAll(tipoestadoactivofijosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoEstadoActivoFijo 
					&& this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().size()>0
					) {
					tipoestadoactivofijoAux=this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().get(this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().size() - 1);
				
					if(tipoestadoactivofijoAux.getId()<0) {
						this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().remove(tipoestadoactivofijoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoEstadoActivoFijo && this.tipoestadoactivofijos.size()>0) {
					tipoestadoactivofijoAux=this.tipoestadoactivofijos.get(this.tipoestadoactivofijos.size() - 1);
				
					if(tipoestadoactivofijoAux.getId()<0) {
						this.tipoestadoactivofijos.remove(tipoestadoactivofijoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoEstadoActivoFijo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoestadoactivofijo.getId()<0) {
				this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().remove(this.tipoestadoactivofijo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoestadoactivofijo.getId()<0) {
				this.tipoestadoactivofijos.remove(this.tipoestadoactivofijo);
			}
		}			
	}
	
	public void setEstadosInicialesTipoEstadoActivoFijo(List<TipoEstadoActivoFijo> tipoestadoactivofijosAux) throws Exception {
		TipoEstadoActivoFijoConstantesFunciones.setEstadosInicialesTipoEstadoActivoFijo(tipoestadoactivofijosAux);
	}
	
	public void setEstadosInicialesTipoEstadoActivoFijo(TipoEstadoActivoFijo tipoestadoactivofijoAux) throws Exception {
		TipoEstadoActivoFijoConstantesFunciones.setEstadosInicialesTipoEstadoActivoFijo(tipoestadoactivofijoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoEstadoActivoFijoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoEstadoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoEstadoActivoFijoActual()) {
				if(!this.isEsNuevoTipoEstadoActivoFijo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoEstadoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoEstadoActivoFijo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoEstadoActivoFijoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Estado Activo Fijo ?", "MANTENIMIENTO DE Tipo Estado Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoEstadoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoEstadoActivoFijo tipoestadoactivofijo) throws Exception {
		TipoEstadoActivoFijoConstantesFunciones.seleccionarAsignar(this.tipoestadoactivofijo,tipoestadoactivofijo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoEstadoActivoFijo=this.isPermisoActualizarOriginalTipoEstadoActivoFijo;
			
			
			this.seleccionarAsignar(tipoestadoactivofijo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoEstadoActivoFijoConstantesFunciones.quitarEspaciosTipoEstadoActivoFijo(this.tipoestadoactivofijo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoEstadoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoestadoactivofijoSessionBean.setsFuncionBusquedaRapida(this.tipoestadoactivofijoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoEstadoActivoFijo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoEstadoActivoFijo(esParaCancelar);				
				this.cancelarNuevoTipoEstadoActivoFijo(esParaCancelar);								
			}
			
			this.tipoestadoactivofijo=new TipoEstadoActivoFijo();
			
			this.inicializarTipoEstadoActivoFijo();
			
			this.actualizarEstadoCeldasBotonesTipoEstadoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoEstadoActivoFijo() throws Exception {
		try {
			TipoEstadoActivoFijoConstantesFunciones.inicializarTipoEstadoActivoFijo(this.tipoestadoactivofijo);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoEstadoActivoFijos(String sAccionBusqueda,List<TipoEstadoActivoFijo> tipoestadoactivofijosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoEstadoActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoEstadoActivoFijoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoEstadoActivoFijoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoEstadoActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Estado Activo Fijos");		
		parameters.put("busquedapor", TipoEstadoActivoFijoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoEstadoActivoFijo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoEstadoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoEstadoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoEstadoActivoFijo=new JRBeanArrayDataSource(TipoEstadoActivoFijoJInternalFrame.TraerTipoEstadoActivoFijoBeans(tipoestadoactivofijosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoEstadoActivoFijo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoEstadoActivoFijoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoEstadoActivoFijoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoEstadoActivoFijoBean.TraerTipoEstadoActivoFijoBeans(tipoestadoactivofijosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoEstadoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,tipoestadoactivofijosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoEstadoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,tipoestadoactivofijosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoEstadoActivoFijoActionPerformed(null);
					//this.generarExcelReporteTipoEstadoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,tipoestadoactivofijosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoEstadoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,tipoestadoactivofijosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoEstadoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,tipoestadoactivofijosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoEstadoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,tipoestadoactivofijosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoEstadoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoEstadoActivoFijo> tipoestadoactivofijosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoestadoactivofijo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoEstadoActivoFijos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoEstadoActivoFijo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoEstadoActivoFijo tipoestadoactivofijo : tipoestadoactivofijosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoEstadoActivoFijoConstantesFunciones.generarExcelReporteDataTipoEstadoActivoFijo("NORMAL",row,workbook,tipoestadoactivofijo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Estado Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoEstadoActivoFijo(String sTipo,Row row,Workbook workbook) {
		
		TipoEstadoActivoFijoConstantesFunciones.generarExcelReporteHeaderTipoEstadoActivoFijo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoEstadoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoEstadoActivoFijo> tipoestadoactivofijosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoestadoactivofijo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoEstadoActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoEstadoActivoFijo tipoestadoactivofijo : tipoestadoactivofijosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoEstadoActivoFijoConstantesFunciones.getTipoEstadoActivoFijoDescripcion(tipoestadoactivofijo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoEstadoActivoFijoConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoEstadoActivoFijoConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoestadoactivofijo.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoEstadoActivoFijoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoEstadoActivoFijoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoestadoactivofijo.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Estado Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoEstadoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoEstadoActivoFijo> tipoestadoactivofijosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoEstadoActivoFijo> tipoestadoactivofijosRespaldo=null;
		
		classes=TipoEstadoActivoFijoConstantesFunciones.getClassesRelationshipsOfTipoEstadoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoestadoactivofijoLogic.setDatosCliente(this.datosCliente);
		this.tipoestadoactivofijoLogic.setDatosDeep(this.datosDeep);
		this.tipoestadoactivofijoLogic.setIsConDeep(true);
		
		tipoestadoactivofijosRespaldo=this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos();
		
		this.tipoestadoactivofijoLogic.setTipoEstadoActivoFijos(tipoestadoactivofijosParaReportes);	
		this.tipoestadoactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoestadoactivofijosParaReportes=this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos();
		this.tipoestadoactivofijoLogic.setTipoEstadoActivoFijos(tipoestadoactivofijosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoestadoactivofijo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoEstadoActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoEstadoActivoFijo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoEstadoActivoFijo tipoestadoactivofijo : tipoestadoactivofijosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoEstadoActivoFijo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoEstadoActivoFijoConstantesFunciones.generarExcelReporteDataTipoEstadoActivoFijo("NORMAL",row,workbook,tipoestadoactivofijo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoEstadoActivoFijoConstantesFunciones.getTipoEstadoActivoFijoDescripcion(tipoestadoactivofijo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Estado Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoEstadoActivoFijo() throws Exception {		
		this.startProcessTipoEstadoActivoFijo(true);
	}
	
	public void startProcessTipoEstadoActivoFijo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoEstadoActivoFijo ,this.jPanelParametrosReportesTipoEstadoActivoFijo, this.jScrollPanelDatosTipoEstadoActivoFijo,this.jPanelPaginacionTipoEstadoActivoFijo, this.jScrollPanelDatosEdicionTipoEstadoActivoFijo, this.jPanelAccionesTipoEstadoActivoFijo,this.jPanelAccionesFormularioTipoEstadoActivoFijo,this.jmenuBarTipoEstadoActivoFijo,this.jmenuBarDetalleTipoEstadoActivoFijo,this.jTtoolBarTipoEstadoActivoFijo,this.jTtoolBarDetalleTipoEstadoActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoEstadoActivoFijo=this.jTabbedPaneBusquedasTipoEstadoActivoFijo; 
		
		final JPanel jPanelParametrosReportesTipoEstadoActivoFijo=this.jPanelParametrosReportesTipoEstadoActivoFijo;
		//final JScrollPane jScrollPanelDatosTipoEstadoActivoFijo=this.jScrollPanelDatosTipoEstadoActivoFijo;
		final JTable jTableDatosTipoEstadoActivoFijo=this.jTableDatosTipoEstadoActivoFijo;		
		final JPanel jPanelPaginacionTipoEstadoActivoFijo=this.jPanelPaginacionTipoEstadoActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionTipoEstadoActivoFijo=this.jScrollPanelDatosEdicionTipoEstadoActivoFijo;
		final JPanel jPanelAccionesTipoEstadoActivoFijo=this.jPanelAccionesTipoEstadoActivoFijo;
		
		JPanel jPanelCamposAuxiliarTipoEstadoActivoFijo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoEstadoActivoFijo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {
			jPanelCamposAuxiliarTipoEstadoActivoFijo=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jPanelCamposTipoEstadoActivoFijo;
			jPanelAccionesFormularioAuxiliarTipoEstadoActivoFijo=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jPanelAccionesFormularioTipoEstadoActivoFijo;
		}
		
		final JPanel jPanelCamposTipoEstadoActivoFijo=jPanelCamposAuxiliarTipoEstadoActivoFijo;
		final JPanel jPanelAccionesFormularioTipoEstadoActivoFijo=jPanelAccionesFormularioAuxiliarTipoEstadoActivoFijo;
		
		
		final JMenuBar jmenuBarTipoEstadoActivoFijo=this.jmenuBarTipoEstadoActivoFijo;
		final JToolBar jTtoolBarTipoEstadoActivoFijo=this.jTtoolBarTipoEstadoActivoFijo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoEstadoActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoEstadoActivoFijo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {
			jmenuBarDetalleAuxiliarTipoEstadoActivoFijo=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jmenuBarDetalleTipoEstadoActivoFijo;
			jTtoolBarDetalleAuxiliarTipoEstadoActivoFijo=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTtoolBarDetalleTipoEstadoActivoFijo;
		}
		
		final JMenuBar jmenuBarDetalleTipoEstadoActivoFijo=jmenuBarDetalleAuxiliarTipoEstadoActivoFijo;
		final JToolBar jTtoolBarDetalleTipoEstadoActivoFijo=jTtoolBarDetalleAuxiliarTipoEstadoActivoFijo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoEstadoActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoEstadoActivoFijo;
			processRunnable.jTableDatos=jTableDatosTipoEstadoActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposTipoEstadoActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoEstadoActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoEstadoActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoEstadoActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoEstadoActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoEstadoActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarTipoEstadoActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoEstadoActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoEstadoActivoFijo ,jPanelParametrosReportesTipoEstadoActivoFijo,jTableDatosTipoEstadoActivoFijo, /*jScrollPanelDatosTipoEstadoActivoFijo,*/jPanelCamposTipoEstadoActivoFijo,jPanelPaginacionTipoEstadoActivoFijo, /*jScrollPanelDatosEdicionTipoEstadoActivoFijo,*/ jPanelAccionesTipoEstadoActivoFijo,jPanelAccionesFormularioTipoEstadoActivoFijo,jmenuBarTipoEstadoActivoFijo,jmenuBarDetalleTipoEstadoActivoFijo,jTtoolBarTipoEstadoActivoFijo,jTtoolBarDetalleTipoEstadoActivoFijo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoEstadoActivoFijo ,jPanelParametrosReportesTipoEstadoActivoFijo, jScrollPanelDatosTipoEstadoActivoFijo,jPanelPaginacionTipoEstadoActivoFijo, jScrollPanelDatosEdicionTipoEstadoActivoFijo, jPanelAccionesTipoEstadoActivoFijo,jPanelAccionesFormularioTipoEstadoActivoFijo,jmenuBarTipoEstadoActivoFijo,jmenuBarDetalleTipoEstadoActivoFijo,jTtoolBarTipoEstadoActivoFijo,jTtoolBarDetalleTipoEstadoActivoFijo);
						
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
	
	public void finishProcessTipoEstadoActivoFijo() {// throws Exception 
		this.finishProcessTipoEstadoActivoFijo(true);
	}
	
	public void finishProcessTipoEstadoActivoFijo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoEstadoActivoFijo ,this.jPanelParametrosReportesTipoEstadoActivoFijo, this.jScrollPanelDatosTipoEstadoActivoFijo,this.jPanelPaginacionTipoEstadoActivoFijo, this.jScrollPanelDatosEdicionTipoEstadoActivoFijo, this.jPanelAccionesTipoEstadoActivoFijo,this.jPanelAccionesFormularioTipoEstadoActivoFijo,this.jmenuBarTipoEstadoActivoFijo,this.jmenuBarDetalleTipoEstadoActivoFijo,this.jTtoolBarTipoEstadoActivoFijo,this.jTtoolBarDetalleTipoEstadoActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoEstadoActivoFijo=this.jTabbedPaneBusquedasTipoEstadoActivoFijo; 
		
		final JPanel jPanelParametrosReportesTipoEstadoActivoFijo=this.jPanelParametrosReportesTipoEstadoActivoFijo;
		//final JScrollPane jScrollPanelDatosTipoEstadoActivoFijo=this.jScrollPanelDatosTipoEstadoActivoFijo;
		final JTable jTableDatosTipoEstadoActivoFijo=this.jTableDatosTipoEstadoActivoFijo;		
		final JPanel jPanelPaginacionTipoEstadoActivoFijo=this.jPanelPaginacionTipoEstadoActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionTipoEstadoActivoFijo=this.jScrollPanelDatosEdicionTipoEstadoActivoFijo;
		final JPanel jPanelAccionesTipoEstadoActivoFijo=this.jPanelAccionesTipoEstadoActivoFijo;
		
		JPanel jPanelCamposAuxiliarTipoEstadoActivoFijo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoEstadoActivoFijo=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {
			jPanelCamposAuxiliarTipoEstadoActivoFijo=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jPanelCamposTipoEstadoActivoFijo;
			jPanelAccionesFormularioAuxiliarTipoEstadoActivoFijo=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jPanelAccionesFormularioTipoEstadoActivoFijo;
		}
		
		final JPanel jPanelCamposTipoEstadoActivoFijo=jPanelCamposAuxiliarTipoEstadoActivoFijo;
		final JPanel jPanelAccionesFormularioTipoEstadoActivoFijo=jPanelAccionesFormularioAuxiliarTipoEstadoActivoFijo;
		
		
		final JMenuBar jmenuBarTipoEstadoActivoFijo=this.jmenuBarTipoEstadoActivoFijo;		
		final JToolBar jTtoolBarTipoEstadoActivoFijo=this.jTtoolBarTipoEstadoActivoFijo;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoEstadoActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoEstadoActivoFijo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {
			jmenuBarDetalleAuxiliarTipoEstadoActivoFijo=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jmenuBarDetalleTipoEstadoActivoFijo;
			jTtoolBarDetalleAuxiliarTipoEstadoActivoFijo=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTtoolBarDetalleTipoEstadoActivoFijo;		
		}
		
		final JMenuBar jmenuBarDetalleTipoEstadoActivoFijo=jmenuBarDetalleAuxiliarTipoEstadoActivoFijo;
		final JToolBar jTtoolBarDetalleTipoEstadoActivoFijo=jTtoolBarDetalleAuxiliarTipoEstadoActivoFijo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoEstadoActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoEstadoActivoFijo;
			processRunnable.jTableDatos=jTableDatosTipoEstadoActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposTipoEstadoActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoEstadoActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoEstadoActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoEstadoActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoEstadoActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoEstadoActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarTipoEstadoActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoEstadoActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoEstadoActivoFijo ,jPanelParametrosReportesTipoEstadoActivoFijo, jTableDatosTipoEstadoActivoFijo,/*jScrollPanelDatosTipoEstadoActivoFijo,*/jPanelCamposTipoEstadoActivoFijo,jPanelPaginacionTipoEstadoActivoFijo, /*jScrollPanelDatosEdicionTipoEstadoActivoFijo,*/ jPanelAccionesTipoEstadoActivoFijo,jPanelAccionesFormularioTipoEstadoActivoFijo,jmenuBarTipoEstadoActivoFijo,jmenuBarDetalleTipoEstadoActivoFijo,jTtoolBarTipoEstadoActivoFijo,jTtoolBarDetalleTipoEstadoActivoFijo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoEstadoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoEstadoActivoFijo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoEstadoActivoFijo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoEstadoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoEstadoActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoEstadoActivoFijo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoEstadoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoEstadoActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoEstadoActivoFijo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoestadoactivofijoConstantesFunciones.getsFinalQueryTipoEstadoActivoFijo();
		String  finalQueryPaginacionTodos=this.tipoestadoactivofijoConstantesFunciones.getsFinalQueryTipoEstadoActivoFijo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoEstadoActivoFijoConstantesFunciones.getArrayColumnasGlobalesNoTipoEstadoActivoFijo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoEstadoActivoFijoConstantesFunciones.getArrayColumnasGlobalesTipoEstadoActivoFijo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoEstadoActivoFijoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoestadoactivofijosEliminados= new ArrayList<TipoEstadoActivoFijo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoEstadoActivoFijo();
		
				///*TipoEstadoActivoFijoSessionBean*/this.tipoestadoactivofijoSessionBean=new TipoEstadoActivoFijoSessionBean();
			
			if(this.tipoestadoactivofijoSessionBean==null) {
				this.tipoestadoactivofijoSessionBean=new TipoEstadoActivoFijoSessionBean();
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
					this.iNumeroPaginacion=TipoEstadoActivoFijoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoEstadoActivoFijoConstantesFunciones.getClassesForeignKeysOfTipoEstadoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoestadoactivofijo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoestadoactivofijosAux= new ArrayList<TipoEstadoActivoFijo>();
			
				
			tipoestadoactivofijoLogic.setDatosCliente(this.datosCliente);
			tipoestadoactivofijoLogic.setDatosDeep(this.datosDeep);
			tipoestadoactivofijoLogic.setIsConDeep(true);
			
			
			tipoestadoactivofijoLogic.getTipoEstadoActivoFijoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoestadoactivofijoLogic.getTodosTipoEstadoActivoFijos(finalQueryGlobal,pagination);
					
					//tipoestadoactivofijoLogic.getTodosTipoEstadoActivoFijosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoestadoactivofijoLogic.getTipoEstadoActivoFijos()==null|| tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoestadoactivofijosAux= new ArrayList<TipoEstadoActivoFijo>();
							tipoestadoactivofijosAux.addAll(tipoestadoactivofijoLogic.getTipoEstadoActivoFijos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoestadoactivofijosAux= new ArrayList<TipoEstadoActivoFijo>();
							tipoestadoactivofijosAux.addAll(tipoestadoactivofijos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoestadoactivofijoLogic.getTodosTipoEstadoActivoFijos(finalQueryGlobal+"",this.pagination);												
							
							//tipoestadoactivofijoLogic.getTodosTipoEstadoActivoFijosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoEstadoActivoFijos("Todos",tipoestadoactivofijoLogic.getTipoEstadoActivoFijos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoestadoactivofijoLogic.setTipoEstadoActivoFijos(new ArrayList<TipoEstadoActivoFijo>());					
							tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().addAll(tipoestadoactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoestadoactivofijos=new ArrayList<TipoEstadoActivoFijo>();
							tipoestadoactivofijos.addAll(tipoestadoactivofijosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoEstadoActivoFijo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoEstadoActivoFijo=this.idActual;
				
				} else if(this.idTipoEstadoActivoFijoActual!=null && this.idTipoEstadoActivoFijoActual!=0L) {
					idTipoEstadoActivoFijo=idTipoEstadoActivoFijoActual;
				}
				
					
				this.sDetalleReporte=TipoEstadoActivoFijoConstantesFunciones.getDetalleIndicePorId(idTipoEstadoActivoFijo);
				
				this.tipoestadoactivofijos=new ArrayList<TipoEstadoActivoFijo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoestadoactivofijoLogic.getEntity(idTipoEstadoActivoFijo);
					
					//tipoestadoactivofijoLogic.getEntityWithConnection(idTipoEstadoActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoestadoactivofijoLogic.setTipoEstadoActivoFijos(new ArrayList<TipoEstadoActivoFijo>());
					tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().add(tipoestadoactivofijoLogic.getTipoEstadoActivoFijo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoestadoactivofijos=new ArrayList<TipoEstadoActivoFijo>();
					this.tipoestadoactivofijos.add(tipoestadoactivofijo);
				}
				
				if(tipoestadoactivofijoLogic.getTipoEstadoActivoFijo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=TipoEstadoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoestadoactivofijoLogic.getTipoEstadoActivoFijosFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoEstadoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoEstadoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoestadoactivofijoLogic.getTipoEstadoActivoFijos()==null||tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoestadoactivofijos==null|| tipoestadoactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoestadoactivofijosAux=new ArrayList<TipoEstadoActivoFijo>();
						tipoestadoactivofijosAux.addAll(tipoestadoactivofijoLogic.getTipoEstadoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoestadoactivofijosAux=new ArrayList<TipoEstadoActivoFijo>();
							tipoestadoactivofijosAux.addAll(tipoestadoactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoestadoactivofijoLogic.getTipoEstadoActivoFijosFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoEstadoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoEstadoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoEstadoActivoFijos("FK_IdPais",tipoestadoactivofijoLogic.getTipoEstadoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoEstadoActivoFijos("FK_IdPais",tipoestadoactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoestadoactivofijoLogic.setTipoEstadoActivoFijos(new ArrayList<TipoEstadoActivoFijo>());
						tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().addAll(tipoestadoactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoestadoactivofijos=new ArrayList<TipoEstadoActivoFijo>();
							tipoestadoactivofijos.addAll(tipoestadoactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoEstadoActivoFijo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoEstadoActivoFijo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoestadoactivofijos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoestadoactivofijos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoEstadoActivoFijo tipoestadoactivofijo) {
		Boolean permite=true;
		
		if(this.tipoestadoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoEstadoActivoFijoConstantesFunciones.getOrderByListaTipoEstadoActivoFijo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoEstadoActivoFijoConstantesFunciones.getOrderByListaTipoEstadoActivoFijo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEstadoActivoFijo tipoestadoactivofijo:tipoestadoactivofijoLogic.getTipoEstadoActivoFijos()) {
				if(tipoestadoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoestadoactivofijoTotales=tipoestadoactivofijo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEstadoActivoFijo tipoestadoactivofijo:this.tipoestadoactivofijos) {
				if(tipoestadoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoestadoactivofijoTotales=tipoestadoactivofijo;
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
			this.tipoestadoactivofijoAux=new TipoEstadoActivoFijo();
			this.tipoestadoactivofijoAux.setsType(Constantes2.S_TOTALES);
			this.tipoestadoactivofijoAux.setIsNew(false);
			this.tipoestadoactivofijoAux.setIsChanged(false);
			this.tipoestadoactivofijoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoEstadoActivoFijoConstantesFunciones.TotalizarValoresFilaTipoEstadoActivoFijo(this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos(),this.tipoestadoactivofijoAux);
				
				this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().add(this.tipoestadoactivofijoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoEstadoActivoFijoConstantesFunciones.TotalizarValoresFilaTipoEstadoActivoFijo(this.tipoestadoactivofijos,this.tipoestadoactivofijoAux);
				
				this.tipoestadoactivofijos.add(this.tipoestadoactivofijoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoestadoactivofijoTotales=new TipoEstadoActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().remove(tipoestadoactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoestadoactivofijos.remove(tipoestadoactivofijoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoestadoactivofijoTotales=new TipoEstadoActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEstadoActivoFijo tipoestadoactivofijo:tipoestadoactivofijoLogic.getTipoEstadoActivoFijos()) {
				if(tipoestadoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoestadoactivofijoTotales=tipoestadoactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoEstadoActivoFijoConstantesFunciones.TotalizarValoresFilaTipoEstadoActivoFijo(this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos(),tipoestadoactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEstadoActivoFijo tipoestadoactivofijo:this.tipoestadoactivofijos) {
				if(tipoestadoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoestadoactivofijoTotales=tipoestadoactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoEstadoActivoFijoConstantesFunciones.TotalizarValoresFilaTipoEstadoActivoFijo(this.tipoestadoactivofijos,tipoestadoactivofijoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoEstadoActivoFijosFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoEstadoActivoFijoPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoEstadoActivoFijosFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoestadoactivofijoLogic.getTipoEstadoActivoFijosFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoEstadoActivoFijoPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoestadoactivofijoLogic.getTipoEstadoActivoFijoPorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoEstadoActivoFijo() {
		this.isPermisoTodoTipoEstadoActivoFijo=false;
		this.isPermisoNuevoTipoEstadoActivoFijo=false;
		this.isPermisoActualizarTipoEstadoActivoFijo=false;
		this.isPermisoActualizarOriginalTipoEstadoActivoFijo=false;
		this.isPermisoEliminarTipoEstadoActivoFijo=false;
		this.isPermisoGuardarCambiosTipoEstadoActivoFijo=false;
		this.isPermisoConsultaTipoEstadoActivoFijo=false;
		this.isPermisoBusquedaTipoEstadoActivoFijo=false;
		this.isPermisoReporteTipoEstadoActivoFijo=false;		
		this.isPermisoOrdenTipoEstadoActivoFijo=false;		
		this.isPermisoPaginacionMedioTipoEstadoActivoFijo=false;		
		this.isPermisoPaginacionAltoTipoEstadoActivoFijo=false;
		this.isPermisoPaginacionTodoTipoEstadoActivoFijo=false;
		this.isPermisoCopiarTipoEstadoActivoFijo=false;		
		this.isPermisoVerFormTipoEstadoActivoFijo=false;		
		this.isPermisoDuplicarTipoEstadoActivoFijo=false;		
		this.isPermisoOrdenTipoEstadoActivoFijo=false;		
	}
	
	public void setPermisosUsuarioTipoEstadoActivoFijo(Boolean isPermiso) {
		this.isPermisoTodoTipoEstadoActivoFijo=isPermiso;
		this.isPermisoNuevoTipoEstadoActivoFijo=isPermiso;
		this.isPermisoActualizarTipoEstadoActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalTipoEstadoActivoFijo=isPermiso;
		this.isPermisoEliminarTipoEstadoActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosTipoEstadoActivoFijo=isPermiso;
		this.isPermisoConsultaTipoEstadoActivoFijo=isPermiso;
		this.isPermisoBusquedaTipoEstadoActivoFijo=isPermiso;
		this.isPermisoReporteTipoEstadoActivoFijo=isPermiso;
		this.isPermisoOrdenTipoEstadoActivoFijo=isPermiso;		
		this.isPermisoPaginacionMedioTipoEstadoActivoFijo=isPermiso;		
		this.isPermisoPaginacionAltoTipoEstadoActivoFijo=isPermiso;		
		this.isPermisoPaginacionTodoTipoEstadoActivoFijo=isPermiso;		
		this.isPermisoCopiarTipoEstadoActivoFijo=isPermiso;		
		this.isPermisoVerFormTipoEstadoActivoFijo=isPermiso;		
		this.isPermisoDuplicarTipoEstadoActivoFijo=isPermiso;
		this.isPermisoOrdenTipoEstadoActivoFijo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoEstadoActivoFijo(Boolean isPermiso) {
		//this.isPermisoTodoTipoEstadoActivoFijo=isPermiso;
		this.isPermisoNuevoTipoEstadoActivoFijo=isPermiso;
		this.isPermisoActualizarTipoEstadoActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalTipoEstadoActivoFijo=isPermiso;
		this.isPermisoEliminarTipoEstadoActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosTipoEstadoActivoFijo=isPermiso;
		//this.isPermisoConsultaTipoEstadoActivoFijo=isPermiso;
		//this.isPermisoBusquedaTipoEstadoActivoFijo=isPermiso;
		//this.isPermisoReporteTipoEstadoActivoFijo=isPermiso;
		//this.isPermisoOrdenTipoEstadoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionMedioTipoEstadoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionAltoTipoEstadoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionTodoTipoEstadoActivoFijo=isPermiso;		
		//this.isPermisoCopiarTipoEstadoActivoFijo=isPermiso;		
		//this.isPermisoDuplicarTipoEstadoActivoFijo=isPermiso;
		//this.isPermisoOrdenTipoEstadoActivoFijo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoEstadoActivoFijoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoEstadoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoEstadoActivoFijo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoEstadoActivoFijoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoEstadoActivoFijoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoEstadoActivoFijoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoEstadoActivoFijoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoEstadoActivoFijo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoEstadoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoEstadoActivoFijoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoEstadoActivoFijo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoEstadoActivoFijo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoEstadoActivoFijo=this.isPermisoActualizarTipoEstadoActivoFijo;
			this.isPermisoEliminarTipoEstadoActivoFijo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoEstadoActivoFijo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoEstadoActivoFijo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoEstadoActivoFijo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoEstadoActivoFijo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoEstadoActivoFijo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoEstadoActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoEstadoActivoFijo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoEstadoActivoFijo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoEstadoActivoFijo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoEstadoActivoFijo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoEstadoActivoFijo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoEstadoActivoFijo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoEstadoActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoEstadoActivoFijo.setToolTipText(this.jTableDatosTipoEstadoActivoFijo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoEstadoActivoFijo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoEstadoActivoFijo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoEstadoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoEstadoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoEstadoActivoFijo() throws Exception {
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
	public void inicializarCombosForeignKeyTipoEstadoActivoFijoListas()throws Exception {
		try	{						
			
				this.paissForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoEstadoActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoEstadoActivoFijoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoEstadoActivoFijoListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoEstadoActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoEstadoActivoFijoParameterReturnGeneral tipoestadoactivofijoReturnGeneral=new TipoEstadoActivoFijoParameterReturnGeneral();
						
			


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.tipoestadoactivofijoConstantesFunciones.cargarid_paisTipoEstadoActivoFijo)
					 || (this.esRecargarFks && this.tipoestadoactivofijoConstantesFunciones.cargarid_paisTipoEstadoActivoFijo)) {

					if(!this.tipoestadoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+tipoestadoactivofijoSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoestadoactivofijoReturnGeneral=tipoestadoactivofijoLogic.cargarCombosLoteForeignKeyTipoEstadoActivoFijo(finalQueryGlobalPais);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=tipoestadoactivofijoReturnGeneral.getpaissForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoEstadoActivoFijo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPais();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {
			if(this.tipoestadoactivofijoSessionBean==null) {
				this.tipoestadoactivofijoSessionBean=new TipoEstadoActivoFijoSessionBean();
			}

			if(!this.tipoestadoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoEstadoActivoFijo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoEstadoActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoEstadoActivoFijo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoEstadoActivoFijo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoEstadoActivoFijo(TipoEstadoActivoFijo tipoestadoactivofijo)throws Exception {	
		try {
			
			this.setActualPaisForeignKey(tipoestadoactivofijo.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoEstadoActivoFijo(TipoEstadoActivoFijo tipoestadoactivofijo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoEstadoActivoFijo()throws Exception {	
		try {
			
			this.setActualPaisForeignKey(this.tipoestadoactivofijoConstantesFunciones.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoEstadoActivoFijo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoEstadoActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoEstadoActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoEstadoActivoFijo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoEstadoActivoFijo()throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoEstadoActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoEstadoActivoFijo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxid_paisTipoEstadoActivoFijo!=null && this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxid_paisTipoEstadoActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxid_paisTipoEstadoActivoFijo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoEstadoActivoFijoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoEstadoActivoFijoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoEstadoActivoFijoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoestadoactivofijoSessionBean=new TipoEstadoActivoFijoSessionBean(); 
		this.tipoestadoactivofijoConstantesFunciones=new TipoEstadoActivoFijoConstantesFunciones(); 
		this.tipoestadoactivofijoBean=new TipoEstadoActivoFijo();//(this.tipoestadoactivofijoConstantesFunciones); 		
		this.tipoestadoactivofijoReturnGeneral=new TipoEstadoActivoFijoParameterReturnGeneral(); 
		
		this.tipoestadoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoestadoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoEstadoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoEstadoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoEstadoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoEstadoActivoFijo(true);
			
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
			
			this.tipoestadoactivofijoConstantesFunciones=new TipoEstadoActivoFijoConstantesFunciones(); 
			this.tipoestadoactivofijoBean=new TipoEstadoActivoFijo();//this.tipoestadoactivofijoConstantesFunciones); 			
			this.tipoestadoactivofijoReturnGeneral=new TipoEstadoActivoFijoParameterReturnGeneral(); 
		
			TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Estado Activo Fijo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoestadoactivofijo=new TipoEstadoActivoFijo();
			this.tipoestadoactivofijos = new ArrayList<TipoEstadoActivoFijo>();
			this.tipoestadoactivofijosAux = new ArrayList<TipoEstadoActivoFijo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic=new TipoEstadoActivoFijoLogic();
				this.tipoestadoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoestadoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoestadoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoEstadoActivoFijo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo);	
					}
					
					if(this.jInternalFrameImportacionTipoEstadoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoEstadoActivoFijo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoEstadoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoEstadoActivoFijo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoEstadoActivoFijo);
				this.jInternalFrameDetalleFormTipoEstadoActivoFijo.setVisible(false);
				this.jInternalFrameDetalleFormTipoEstadoActivoFijo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo);
					this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoEstadoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoEstadoActivoFijo);
					this.jInternalFrameImportacionTipoEstadoActivoFijo.setVisible(false);
					this.jInternalFrameImportacionTipoEstadoActivoFijo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoEstadoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoEstadoActivoFijo);
					this.jInternalFrameOrderByTipoEstadoActivoFijo.setVisible(false);
					this.jInternalFrameOrderByTipoEstadoActivoFijo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoEstadoActivoFijoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoEstadoActivoFijoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoestadoactivofijoReturnGeneral=new TipoEstadoActivoFijoParameterReturnGeneral();
			
			this.tipoestadoactivofijoParameterGeneral=new TipoEstadoActivoFijoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoestadoactivofijoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoEstadoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoEstadoActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado(),this.tipoestadoactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoEstadoActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado(),this.tipoestadoactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaDuplicarTipoEstadoActivoFijo=true;
			this.isVisibilidadCeldaCopiarTipoEstadoActivoFijo=true;
			this.isVisibilidadCeldaVerFormTipoEstadoActivoFijo=true;
			this.isVisibilidadCeldaOrdenTipoEstadoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaModificarTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaEliminarTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaGuardarTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEstadoActivoFijo=false;
			
			
			this.isVisibilidadFK_IdPais=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoEstadoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoEstadoActivoFijo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoEstadoActivoFijo(false);
			
			this.setPermisosUsuarioTipoEstadoActivoFijo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado() && this.tipoestadoactivofijoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoEstadoActivoFijoClasesRelacionadas();
			}
			
			if(this.tipoestadoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoEstadoActivoFijoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoEstadoActivoFijo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoEstadoActivoFijo();
			}
			
			if(!this.isPermisoBusquedaTipoEstadoActivoFijo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoEstadoActivoFijo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoEstadoActivoFijo,this.isPermisoPaginacionMedioTipoEstadoActivoFijo,this.isPermisoPaginacionTodoTipoEstadoActivoFijo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoEstadoActivoFijoConstantesFunciones.getTiposSeleccionarTipoEstadoActivoFijo());
				
				this.tiposColumnasSelect=TipoEstadoActivoFijoConstantesFunciones.getTiposSeleccionarTipoEstadoActivoFijo(true);
				
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
			//if(!this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoEstadoActivoFijo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoEstadoActivoFijo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoEstadoActivoFijo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoEstadoActivoFijo() ;
			
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
				tipoestadoactivofijoImplementable= (TipoEstadoActivoFijoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoEstadoActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoestadoactivofijoImplementableHome= (TipoEstadoActivoFijoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoEstadoActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoestadoactivofijos= new ArrayList<TipoEstadoActivoFijo>();
			this.tipoestadoactivofijosEliminados= new ArrayList<TipoEstadoActivoFijo>();
						
			this.isEsNuevoTipoEstadoActivoFijo=false;
			this.esParaAccionDesdeFormularioTipoEstadoActivoFijo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.paissForeignKey=new ArrayList<Pais>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoEstadoActivoFijo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoEstadoActivoFijo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoEstadoActivoFijoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoEstadoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoEstadoActivoFijo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoEstadoActivoFijo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoEstadoActivoFijo();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoEstadoActivoFijo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoEstadoActivoFijo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoEstadoActivoFijo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoEstadoActivoFijo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoEstadoActivoFijo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoEstadoActivoFijo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoEstadoActivoFijo")) {
				iIndex=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTabbedPaneRelacionesTipoEstadoActivoFijo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTabbedPaneRelacionesTipoEstadoActivoFijo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoEstadoActivoFijo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoEstadoActivoFijo();	
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
	
	public void cargarCombosForeignKeyTipoEstadoActivoFijo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoEstadoActivoFijo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoEstadoActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoEstadoActivoFijoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoEstadoActivoFijo();
		
		this.cargarCombosFrameForeignKeyTipoEstadoActivoFijo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoEstadoActivoFijo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoEstadoActivoFijo();
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
	
	public void jButtonNuevoTipoEstadoActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoestadoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
			
			
			if(jTableDatosTipoEstadoActivoFijo.getRowCount()>=1) {
				jTableDatosTipoEstadoActivoFijo.removeRowSelectionInterval(0, jTableDatosTipoEstadoActivoFijo.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoEstadoActivoFijo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoEstadoActivoFijo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoEstadoActivoFijo(true);			
			//this.tipoestadoactivofijo=new TipoEstadoActivoFijo();
			//this.tipoestadoactivofijo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoEstadoActivoFijo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEstadoActivoFijo() ;
			
			if(TipoEstadoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoEstadoActivoFijo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoestadoactivofijo);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoestadoactivofijo);				
			
			TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
			
			if(this.tipoestadoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoEstadoActivoFijo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoEstadoActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoEstadoActivoFijo> tipoestadoactivofijosSeleccionados=new ArrayList<TipoEstadoActivoFijo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoEstadoActivoFijo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoEstadoActivoFijo.getSelectedRows().length;			
			}
			
			tipoestadoactivofijosSeleccionados=this.getTipoEstadoActivoFijosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoEstadoActivoFijo--;			
				//TipoEstadoActivoFijo tipoestadoactivofijoAux= new TipoEstadoActivoFijo();			
				//tipoestadoactivofijoAux.setId(this.iIdNuevoTipoEstadoActivoFijo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoEstadoActivoFijo tipoestadoactivofijoOrigen=new TipoEstadoActivoFijo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoEstadoActivoFijo tipoestadoactivofijoOrigen : tipoestadoactivofijosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoEstadoActivoFijo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoestadoactivofijoOrigen =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoestadoactivofijoOrigen =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoEstadoActivoFijo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoestadoactivofijo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoEstadoActivoFijo(tipoestadoactivofijoOrigen,this.tipoestadoactivofijo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoActivoFijo(this.tipoestadoactivofijo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().add(this.tipoestadoactivofijoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoestadoactivofijos.add(this.tipoestadoactivofijoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoEstadoActivoFijo(false);
				
				this.jTableDatosTipoEstadoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoTipoEstadoActivoFijo(), this.getIndiceNuevoTipoEstadoActivoFijo());
				
				int iLastRow =  this.jTableDatosTipoEstadoActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoEstadoActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoEstadoActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoEstadoActivoFijo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoEstadoActivoFijo> tipoestadoactivofijosSeleccionados=new ArrayList<TipoEstadoActivoFijo>();									
		
			TipoEstadoActivoFijo tipoestadoactivofijoOrigen=new TipoEstadoActivoFijo();
			TipoEstadoActivoFijo tipoestadoactivofijoDestino=new TipoEstadoActivoFijo();
				
			tipoestadoactivofijosSeleccionados=this.getTipoEstadoActivoFijosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoEstadoActivoFijo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoestadoactivofijosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoEstadoActivoFijo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoestadoactivofijoOrigen =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoestadoactivofijoOrigen =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoestadoactivofijoDestino =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoestadoactivofijoDestino =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoestadoactivofijoOrigen =tipoestadoactivofijosSeleccionados.get(0);
				tipoestadoactivofijoDestino =tipoestadoactivofijosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoEstadoActivoFijo(tipoestadoactivofijoOrigen,tipoestadoactivofijoDestino,true,false);
				
				tipoestadoactivofijoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoestadoactivofijoDestino,tipoestadoactivofijoLogic.getTipoEstadoActivoFijos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoestadoactivofijoDestino,tipoestadoactivofijos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoEstadoActivoFijo(false);
				
				//this.jTableDatosTipoEstadoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoTipoEstadoActivoFijo(), this.getIndiceNuevoTipoEstadoActivoFijo());
				
				int iLastRow =  this.jTableDatosTipoEstadoActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoEstadoActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoEstadoActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoEstadoActivoFijo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoEstadoActivoFijo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoEstadoActivoFijo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoEstadoActivoFijo.setVisible(!isVisible);
			this.jPanelPaginacionTipoEstadoActivoFijo.setVisible(!isVisible);
			this.jPanelAccionesTipoEstadoActivoFijo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoEstadoActivoFijo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoEstadoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoEstadoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoEstadoActivoFijo();
			
			this.abrirFrameOrderByTipoEstadoActivoFijo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoEstadoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoEstadoActivoFijo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoEstadoActivoFijo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo.isMaximum()) {
					this.jInternalFrameDetalleFormTipoEstadoActivoFijo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.setSize(this.jInternalFrameDetalleFormTipoEstadoActivoFijo.iWidthFormulario,this.jInternalFrameDetalleFormTipoEstadoActivoFijo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoEstadoActivoFijo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoEstadoActivoFijo.isMaximum()) {
						this.jInternalFrameDetalleFormTipoEstadoActivoFijo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jContentPaneDetalleTipoEstadoActivoFijo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTabbedPaneRelacionesTipoEstadoActivoFijo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jContentPaneDetalleTipoEstadoActivoFijo.getWidth(),TipoEstadoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTabbedPaneRelacionesTipoEstadoActivoFijo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jContentPaneDetalleTipoEstadoActivoFijo.getWidth(),TipoEstadoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTabbedPaneRelacionesTipoEstadoActivoFijo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jContentPaneDetalleTipoEstadoActivoFijo.getWidth(),TipoEstadoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoEstadoActivoFijo.setVisible(true);
	        this.jInternalFrameDetalleFormTipoEstadoActivoFijo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoEstadoActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoEstadoActivoFijo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoEstadoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEstadoActivoFijo,false,this);
				} else {
					this.jInternalFrameOrderByTipoEstadoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEstadoActivoFijo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoEstadoActivoFijo);
				this.jInternalFrameOrderByTipoEstadoActivoFijo.setVisible(false);
				this.jInternalFrameOrderByTipoEstadoActivoFijo.setSelected(false);
				
				this.jInternalFrameOrderByTipoEstadoActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoEstadoActivoFijo"));
				
				this.inicializarActualizarBindingTablaOrderByTipoEstadoActivoFijo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoEstadoActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoEstadoActivoFijo==null) {
				
				this.jInternalFrameImportacionTipoEstadoActivoFijo=new ImportacionJInternalFrame(TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoEstadoActivoFijo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoEstadoActivoFijo);
				this.jInternalFrameImportacionTipoEstadoActivoFijo.setVisible(false);
				this.jInternalFrameImportacionTipoEstadoActivoFijo.setSelected(false);


				this.jInternalFrameImportacionTipoEstadoActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoEstadoActivoFijo"));
				this.jInternalFrameImportacionTipoEstadoActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoEstadoActivoFijo"));
				this.jInternalFrameImportacionTipoEstadoActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoEstadoActivoFijo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoEstadoActivoFijo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo==null) {
				this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo=new ReporteDinamicoJInternalFrame(TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo);
				this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoEstadoActivoFijo"));
				this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoEstadoActivoFijo"));
				this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoEstadoActivoFijo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoEstadoActivoFijo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoEstadoActivoFijo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoEstadoActivoFijo);
			
	       	this.jInternalFrameDetalleFormTipoEstadoActivoFijo.setVisible(false);
	        this.jInternalFrameDetalleFormTipoEstadoActivoFijo.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoEstadoActivoFijo.dispose();
			//this.jInternalFrameDetalleFormTipoEstadoActivoFijo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoEstadoActivoFijo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoEstadoActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoEstadoActivoFijo.setVisible(true);
	        this.jInternalFrameImportacionTipoEstadoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoEstadoActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoEstadoActivoFijo.setVisible(true);
	        this.jInternalFrameOrderByTipoEstadoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoEstadoActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoEstadoActivoFijo.setVisible(false);
	        this.jInternalFrameOrderByTipoEstadoActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoEstadoActivoFijo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoEstadoActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoEstadoActivoFijo.setVisible(false);
	        this.jInternalFrameImportacionTipoEstadoActivoFijo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoEstadoActivoFijo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoEstadoActivoFijo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoEstadoActivoFijo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoEstadoActivoFijo(true);
			//this.isEsNuevoTipoEstadoActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoEstadoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoEstadoActivoFijo(false) ;
			
			if(tipoestadoactivofijoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoEstadoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoEstadoActivoFijo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEstadoActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoEstadoActivoFijoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoEstadoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoEstadoActivoFijo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoEstadoActivoFijo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoEstadoActivoFijo(true);
			//this.isEsNuevoTipoEstadoActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoestadoactivofijo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoEstadoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoEstadoActivoFijo(false) ;
			
			if(TipoEstadoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoEstadoActivoFijo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEstadoActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosTipoEstadoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEstadoActivoFijo,TipoEstadoActivoFijoConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoEstadoActivoFijo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoEstadoActivoFijo(false);
			
			//if(!this.isEsNuevoTipoEstadoActivoFijo) {								
				int intSelectedRow = this.jTableDatosTipoEstadoActivoFijo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoEstadoActivoFijo(this.tipoestadoactivofijo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoActivoFijo(this.tipoestadoactivofijo);
				
			}
			
			if(this.permiteMantenimiento(this.tipoestadoactivofijo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoEstadoActivoFijo=true;
					this.inicializarActualizarBindingTablaTipoEstadoActivoFijo(false);
					this.isEsNuevoTipoEstadoActivoFijo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoEstadoActivoFijo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoEstadoActivoFijo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoEstadoActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoEstadoActivoFijo(false);
				
				this.habilitarDeshabilitarControlesTipoEstadoActivoFijo(false);
			
												
				
				if(TipoEstadoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoEstadoActivoFijo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoEstadoActivoFijoActionPerformed(evt,tipoestadoactivofijoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoEstadoActivoFijo(this.tipoestadoactivofijo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoEstadoActivoFijo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoestadoactivofijoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoestadoactivofijo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoEstadoActivoFijo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstadoActivoFijo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoEstadoActivoFijo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.tipoestadoactivofijo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.tipoestadoactivofijo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoestadoactivofijo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoEstadoActivoFijoModel) this.jTableDatosTipoEstadoActivoFijo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoEstadoActivoFijo=true;
				this.inicializarActualizarBindingTablaTipoEstadoActivoFijo(false);
				this.isEsNuevoTipoEstadoActivoFijo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoEstadoActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoEstadoActivoFijo(false);
				
				this.habilitarDeshabilitarControlesTipoEstadoActivoFijo(false);
				
				
				
				if(TipoEstadoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoEstadoActivoFijo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoEstadoActivoFijo.getRowCount()>=1) {
				jTableDatosTipoEstadoActivoFijo.removeRowSelectionInterval(0, jTableDatosTipoEstadoActivoFijo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoEstadoActivoFijo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoEstadoActivoFijo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoEstadoActivoFijo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEstadoActivoFijo(false) ;
			
			this.isEsNuevoTipoEstadoActivoFijo=false;
			
			if(TipoEstadoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoEstadoActivoFijo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoEstadoActivoFijo(false);
				
				//SI ES MANUAL
				if(TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoEstadoActivoFijo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoEstadoActivoFijo--;			
			//TipoEstadoActivoFijo tipoestadoactivofijoAux= new TipoEstadoActivoFijo();			
			//tipoestadoactivofijoAux.setId(this.iIdNuevoTipoEstadoActivoFijo);
			
			if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoEstadoActivoFijo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoActivoFijo(this.tipoestadoactivofijo);
			
			this.tipoestadoactivofijo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().add(this.tipoestadoactivofijoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoestadoactivofijos.add(this.tipoestadoactivofijoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoEstadoActivoFijo(false);
			
			this.jTableDatosTipoEstadoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoTipoEstadoActivoFijo(), this.getIndiceNuevoTipoEstadoActivoFijo());
			
			int iLastRow =  this.jTableDatosTipoEstadoActivoFijo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoEstadoActivoFijo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoEstadoActivoFijo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoEstadoActivoFijo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoEstadoActivoFijo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEstadoActivoFijo(false);
			
			//SI ES MANUAL
			if(TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoEstadoActivoFijo();
			}
			
			//this.abrirFrameTreeTipoEstadoActivoFijo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Estado Activo FijoS ?", "MANTENIMIENTO DE Tipo Estado Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoEstadoActivoFijo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoEstadoActivoFijo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoestadoactivofijoReturnGeneral=tipoestadoactivofijoLogic.procesarImportacionTipoEstadoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoestadoactivofijoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoEstadoActivoFijoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoEstadoActivoFijo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoEstadoActivoFijo.setFileImportacion(this.jInternalFrameImportacionTipoEstadoActivoFijo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoEstadoActivoFijo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoEstadoActivoFijo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoEstadoActivoFijo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoEstadoActivoFijo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoEstadoActivoFijo> tipoestadoactivofijosSeleccionados=new ArrayList<TipoEstadoActivoFijo>();		

		tipoestadoactivofijosSeleccionados=this.getTipoEstadoActivoFijosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoEstadoActivoFijoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoEstadoActivoFijoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoEstadoActivoFijos("Todos",tipoestadoactivofijosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Estado Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoEstadoActivoFijoConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoEstadoActivoFijoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoEstadoActivoFijoConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case TipoEstadoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoEstadoActivoFijoConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case TipoEstadoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoEstadoActivoFijoConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case TipoEstadoActivoFijoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoEstadoActivoFijo> tipoestadoactivofijosSeleccionados=new ArrayList<TipoEstadoActivoFijo>();		
		
		tipoestadoactivofijosSeleccionados=this.getTipoEstadoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoestadoactivofijo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoEstadoActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoEstadoActivoFijoConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoEstadoActivoFijoConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(TipoEstadoActivoFijo tipoestadoactivofijo:tipoestadoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoestadoactivofijo.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoEstadoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoEstadoActivoFijoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoEstadoActivoFijo tipoestadoactivofijo:tipoestadoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoestadoactivofijo.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoEstadoActivoFijo(row);				
			//	iRow++;
			//}				
			
			//for(TipoEstadoActivoFijo tipoestadoactivofijoAux:tipoestadoactivofijosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoEstadoActivoFijo(tipoestadoactivofijoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Estado Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoestadoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEstadoActivoFijo(false);
			
			//SI ES MANUAL
			if(TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoEstadoActivoFijo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEstadoActivoFijo(false);
			
			//SI ES MANUAL
			if(TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoEstadoActivoFijo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEstadoActivoFijo(false);
			
			//SI ES MANUAL
			if(TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoEstadoActivoFijo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoEstadoActivoFijo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoEstadoActivoFijo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoEstadoActivoFijo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoEstadoActivoFijo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoEstadoActivoFijo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoEstadoActivoFijo.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoEstadoActivoFijo.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoEstadoActivoFijo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoEstadoActivoFijo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoEstadoActivoFijo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoEstadoActivoFijo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoEstadoActivoFijo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoEstadoActivoFijo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoEstadoActivoFijo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoEstadoActivoFijo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoEstadoActivoFijo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoEstadoActivoFijo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoEstadoActivoFijo();
		
		this.inicializarActualizarBindingBotonesManualTipoEstadoActivoFijo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoEstadoActivoFijo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoEstadoActivoFijo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoEstadoActivoFijo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoEstadoActivoFijo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoEstadoActivoFijo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoEstadoActivoFijo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoEstadoActivoFijo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jCheckBoxPostAccionNuevoTipoEstadoActivoFijo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jCheckBoxPostAccionSinCerrarTipoEstadoActivoFijo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jCheckBoxPostAccionSinMensajeTipoEstadoActivoFijo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoEstadoActivoFijo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoEstadoActivoFijo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoEstadoActivoFijo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {
				this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jCheckBoxPostAccionNuevoTipoEstadoActivoFijo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jCheckBoxPostAccionSinCerrarTipoEstadoActivoFijo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jCheckBoxPostAccionSinMensajeTipoEstadoActivoFijo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoEstadoActivoFijo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoEstadoActivoFijo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoEstadoActivoFijo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoEstadoActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoEstadoActivoFijo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoEstadoActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoEstadoActivoFijo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoEstadoActivoFijo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoEstadoActivoFijo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoEstadoActivoFijo(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoEstadoActivoFijo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoEstadoActivoFijo() throws Exception {
		try	{
			if(TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoEstadoActivoFijo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoEstadoActivoFijo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoEstadoActivoFijo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoEstadoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoEstadoActivoFijo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoEstadoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoEstadoActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoEstadoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoEstadoActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoEstadoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoEstadoActivoFijo.addItem(reporte);
			}
			
			
			if(!this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoEstadoActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoEstadoActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoEstadoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoEstadoActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoEstadoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoEstadoActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoEstadoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoEstadoActivoFijo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoEstadoActivoFijo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoEstadoActivoFijo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoEstadoActivoFijo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoEstadoActivoFijo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_paisFK_IdPaisTipoEstadoActivoFijo.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisTipoEstadoActivoFijo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoEstadoActivoFijo(Boolean esInicializar) throws Exception {				
		if(TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoEstadoActivoFijo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoEstadoActivoFijo() throws Exception {
		this.inicializarActualizarBindingTablaTipoEstadoActivoFijo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoEstadoActivoFijo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoEstadoActivoFijo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoEstadoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoEstadoActivoFijo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoEstadoActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoEstadoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoEstadoActivoFijo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoEstadoActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoEstadoActivoFijoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEstadoActivoFijoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoEstadoActivoFijoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoEstadoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoEstadoActivoFijo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoEstadoActivoFijoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoEstadoActivoFijo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoEstadoActivoFijo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoestadoactivofijos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoEstadoActivoFijo.setModel(new TipoEstadoActivoFijoModel(this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoEstadoActivoFijo.setModel(new TipoEstadoActivoFijoModel(this.tipoestadoactivofijos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoEstadoActivoFijo!=null && this.jInternalFrameOrderByTipoEstadoActivoFijo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoEstadoActivoFijo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoEstadoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEstadoActivoFijo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoEstadoActivoFijoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO,tipoestadoactivofijoConstantesFunciones.resaltarSeleccionarTipoEstadoActivoFijo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO,tipoestadoactivofijoConstantesFunciones.resaltarSeleccionarTipoEstadoActivoFijo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoEstadoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEstadoActivoFijo,TipoEstadoActivoFijoConstantesFunciones.LABEL_ID));

		if(this.tipoestadoactivofijoConstantesFunciones.mostraridTipoEstadoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoEstadoActivoFijoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoestadoactivofijoConstantesFunciones.resaltaridTipoEstadoActivoFijo,this.tipoestadoactivofijoConstantesFunciones.activaridTipoEstadoActivoFijo,this,true,"idTipoEstadoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoestadoactivofijoConstantesFunciones.resaltaridTipoEstadoActivoFijo,this.tipoestadoactivofijoConstantesFunciones.activaridTipoEstadoActivoFijo,this,true,"idTipoEstadoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoEstadoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEstadoActivoFijo,TipoEstadoActivoFijoConstantesFunciones.LABEL_IDPAIS));

		if(this.tipoestadoactivofijoConstantesFunciones.mostrarid_paisTipoEstadoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoEstadoActivoFijoConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.tipoestadoactivofijoConstantesFunciones.resaltarid_paisTipoEstadoActivoFijo,this,this.tipoestadoactivofijoConstantesFunciones.activarid_paisTipoEstadoActivoFijo));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.tipoestadoactivofijoConstantesFunciones.resaltarid_paisTipoEstadoActivoFijo,this,this.tipoestadoactivofijoConstantesFunciones.activarid_paisTipoEstadoActivoFijo,true,"id_paisTipoEstadoActivoFijo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoEstadoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoEstadoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEstadoActivoFijo,TipoEstadoActivoFijoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoestadoactivofijoConstantesFunciones.mostrarnombreTipoEstadoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoEstadoActivoFijoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoestadoactivofijoConstantesFunciones.resaltarnombreTipoEstadoActivoFijo,this.tipoestadoactivofijoConstantesFunciones.activarnombreTipoEstadoActivoFijo,this,true,"nombreTipoEstadoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoestadoactivofijoConstantesFunciones.resaltarnombreTipoEstadoActivoFijo,this.tipoestadoactivofijoConstantesFunciones.activarnombreTipoEstadoActivoFijo,this,true,"nombreTipoEstadoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoEstadoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoEstadoActivoFijo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoEstadoActivoFijo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoEstadoActivoFijo && this.isPermisoGuardarCambiosTipoEstadoActivoFijo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoEstadoActivoFijo.addColumn(tableColumn);
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
			
			this.jTableDatosTipoEstadoActivoFijo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoEstadoActivoFijo && this.isPermisoGuardarCambiosTipoEstadoActivoFijo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoEstadoActivoFijo && this.isPermisoGuardarCambiosTipoEstadoActivoFijo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoEstadoActivoFijo.moveColumn(this.jTableDatosTipoEstadoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoEstadoActivoFijo.moveColumn(this.jTableDatosTipoEstadoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoEstadoActivoFijo.moveColumn(this.jTableDatosTipoEstadoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoEstadoActivoFijo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoEstadoActivoFijo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoEstadoActivoFijo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoEstadoActivoFijo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoEstadoActivoFijo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoEstadoActivoFijo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoEstadoActivoFijo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoEstadoActivoFijo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoestadoactivofijos.size()-1;
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
		//this.jTableDatosTipoEstadoActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoEstadoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoEstadoActivoFijo();
			
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
				
				//this.isEsNuevoTipoEstadoActivoFijo=false;
					
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
			
				if(this.tipoestadoactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoEstadoActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoEstadoActivoFijo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoestadoactivofijo.getsType().equals("DUPLICADO")
				   || this.tipoestadoactivofijo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoEstadoActivoFijo=true;
				
				} else {
					this.isEsNuevoTipoEstadoActivoFijo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoestadoactivofijo.getId()>=0 && !this.tipoestadoactivofijo.getIsNew()) {						
						this.isEsNuevoTipoEstadoActivoFijo=false;
						
					} else {
						this.isEsNuevoTipoEstadoActivoFijo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoEstadoActivoFijo(esRelaciones);						
				
				this.seleccionarTipoEstadoActivoFijo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoestadoactivofijo.getId()<0) {
					this.isEsNuevoTipoEstadoActivoFijo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoEstadoActivoFijo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoEstadoActivoFijo(evt,rowIndex);
				}	
				
				if(this.tipoestadoactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoEstadoActivoFijo: " + this.dDif); 
					}
				}								
				
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoEstadoActivoFijo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoestadoactivofijo)) {
					if(this.tipoestadoactivofijo.getId()>0) {
						this.tipoestadoactivofijo.setIsDeleted(true);
						
						this.tipoestadoactivofijosEliminados.add(this.tipoestadoactivofijo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().remove(this.tipoestadoactivofijo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoestadoactivofijos.remove(this.tipoestadoactivofijo);				
					}
					
					
					((TipoEstadoActivoFijoModel) this.jTableDatosTipoEstadoActivoFijo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoEstadoActivoFijo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoEstadoActivoFijo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoEstadoActivoFijo) {
			
			if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoEstadoActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoEstadoActivoFijo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoEstadoActivoFijo(this.tipoestadoactivofijo);
				}
				
				//ARCHITECTURE
				try {
					

					//Pais
					if(!this.tipoestadoactivofijoConstantesFunciones.cargarid_paisTipoEstadoActivoFijo || this.tipoestadoactivofijoConstantesFunciones.event_dependid_paisTipoEstadoActivoFijo) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.tipoestadoactivofijo.getid_pais());
									//this.inicializarActualizarBindingTipoEstadoActivoFijo(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(tipoestadoactivofijo.getPais()!=null) {
							this.paissForeignKey.add(tipoestadoactivofijo.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.tipoestadoactivofijo.getid_pais(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoEstadoActivoFijo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoEstadoActivoFijo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoEstadoActivoFijo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoEstadoActivoFijo(TipoEstadoActivoFijo tipoestadoactivofijo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoEstadoActivoFijo(tipoestadoactivofijo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoEstadoActivoFijo(TipoEstadoActivoFijo tipoestadoactivofijo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoEstadoActivoFijo(tipoestadoactivofijo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoEstadoActivoFijo(tipoestadoactivofijo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoEstadoActivoFijo(tipoestadoactivofijo);
	}
	
	public void setVariablesObjetoActualToFormularioTipoEstadoActivoFijo(TipoEstadoActivoFijo tipoestadoactivofijo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTextFieldidTipoEstadoActivoFijo.setText(tipoestadoactivofijo.getId().toString());
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTextAreanombreTipoEstadoActivoFijo.setText(tipoestadoactivofijo.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoEstadoActivoFijo tipoestadoactivofijoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoestadoactivofijoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoEstadoActivoFijo tipoestadoactivofijoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoestadoactivofijoLocal=this.tipoestadoactivofijo;
			} else {
				tipoestadoactivofijoLocal=this.tipoestadoactivofijoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoestadoactivofijoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoEstadoActivoFijo(tipoestadoactivofijoLocal,true);
					
					if(tipoestadoactivofijoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoestadoactivofijoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoestadoactivofijoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoEstadoActivoFijo(TipoEstadoActivoFijo tipoestadoactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoEstadoActivoFijo(tipoestadoactivofijo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoActivoFijo(tipoestadoactivofijo);
	}
	
	public void setVariablesFormularioToObjetoActualTipoEstadoActivoFijo(TipoEstadoActivoFijo tipoestadoactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoEstadoActivoFijo(tipoestadoactivofijo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoEstadoActivoFijo(TipoEstadoActivoFijo tipoestadoactivofijo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTextFieldidTipoEstadoActivoFijo.getText()==null || this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTextFieldidTipoEstadoActivoFijo.getText()=="" || this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTextFieldidTipoEstadoActivoFijo.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTextFieldidTipoEstadoActivoFijo.setText("0");
			}

			if(conColumnasBase) {tipoestadoactivofijo.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTextFieldidTipoEstadoActivoFijo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoEstadoActivoFijoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jLabelIdTipoEstadoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoestadoactivofijo.setnombre(this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTextAreanombreTipoEstadoActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoEstadoActivoFijoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jLabelnombreTipoEstadoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoEstadoActivoFijo(TipoEstadoActivoFijo tipoestadoactivofijoBean,TipoEstadoActivoFijo tipoestadoactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tipoestadoactivofijoBean.getid_pais()!=null && !tipoestadoactivofijoBean.getid_pais().equals(-1L))) {tipoestadoactivofijo.setid_pais(tipoestadoactivofijoBean.getid_pais());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoEstadoActivoFijo(TipoEstadoActivoFijo tipoestadoactivofijoOrigen,TipoEstadoActivoFijo tipoestadoactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoestadoactivofijoOrigen.getId()!=null && !tipoestadoactivofijoOrigen.getId().equals(0L))) {tipoestadoactivofijo.setId(tipoestadoactivofijoOrigen.getId());}}
			if(conDefault || (!conDefault && tipoestadoactivofijoOrigen.getid_pais()!=null && !tipoestadoactivofijoOrigen.getid_pais().equals(-1L))) {tipoestadoactivofijo.setid_pais(tipoestadoactivofijoOrigen.getid_pais());}
			if(conDefault || (!conDefault && tipoestadoactivofijoOrigen.getnombre()!=null && !tipoestadoactivofijoOrigen.getnombre().equals(""))) {tipoestadoactivofijo.setnombre(tipoestadoactivofijoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoEstadoActivoFijo(TipoEstadoActivoFijo tipoestadoactivofijo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTextFieldidTipoEstadoActivoFijo.setText(tipoestadoactivofijo.getId().toString());
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTextAreanombreTipoEstadoActivoFijo.setText(tipoestadoactivofijo.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoEstadoActivoFijo(TipoEstadoActivoFijoBean tipoestadoactivofijoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTextFieldidTipoEstadoActivoFijo.setText(tipoestadoactivofijoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTextAreanombreTipoEstadoActivoFijo.setText(tipoestadoactivofijoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoEstadoActivoFijo(TipoEstadoActivoFijoParameterReturnGeneral tipoestadoactivofijoReturnGeneral,TipoEstadoActivoFijoBean tipoestadoactivofijoBean,Boolean conDefault) throws Exception { 
		try {
			TipoEstadoActivoFijo tipoestadoactivofijoLocal=new TipoEstadoActivoFijo();
			
			tipoestadoactivofijoLocal=tipoestadoactivofijoReturnGeneral.getTipoEstadoActivoFijo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoestadoactivofijoLocal.getId()!=null && !tipoestadoactivofijoLocal.getId().equals(0L))) {tipoestadoactivofijoBean.setId(tipoestadoactivofijoLocal.getId());}}
			if(conDefault || (!conDefault && tipoestadoactivofijoLocal.getid_pais()!=null && !tipoestadoactivofijoLocal.getid_pais().equals(-1L))) {tipoestadoactivofijoBean.setid_pais(tipoestadoactivofijoLocal.getid_pais());}
			if(conDefault || (!conDefault && tipoestadoactivofijoLocal.getnombre()!=null && !tipoestadoactivofijoLocal.getnombre().equals(""))) {tipoestadoactivofijoBean.setnombre(tipoestadoactivofijoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoEstadoActivoFijoGenerico(Long idTipoEstadoActivoFijoSeleccionado,JComboBox jComboBoxTipoEstadoActivoFijo,List<TipoEstadoActivoFijo> tipoestadoactivofijosLocal)throws Exception {
		try {
			TipoEstadoActivoFijo  tipoestadoactivofijoTemp=null;

			for(TipoEstadoActivoFijo tipoestadoactivofijoAux:tipoestadoactivofijosLocal) {
				if(tipoestadoactivofijoAux.getId()!=null && tipoestadoactivofijoAux.getId().equals(idTipoEstadoActivoFijoSeleccionado)) {
					tipoestadoactivofijoTemp=tipoestadoactivofijoAux;
					break;
				}
			}

			jComboBoxTipoEstadoActivoFijo.setSelectedItem(tipoestadoactivofijoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoEstadoActivoFijoGenerico(JComboBox jComboBoxTipoEstadoActivoFijo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoEstadoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoEstadoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoEstadoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoEstadoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoEstadoActivoFijo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoEstadoActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoEstadoActivoFijo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoEstadoActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoEstadoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoEstadoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoestadoactivofijo=(TipoEstadoActivoFijo) tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoestadoactivofijo =(TipoEstadoActivoFijo) tipoestadoactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!tipoestadoactivofijo.getIsNew() && !tipoestadoactivofijo.getIsChanged() && !tipoestadoactivofijo.getIsDeleted()) {
				sDescripcion=tipoestadoactivofijo.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=tipoestadoactivofijo.getpais_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoEstadoActivoFijo tipoestadoactivofijoRow=new TipoEstadoActivoFijo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoestadoactivofijoRow=(TipoEstadoActivoFijo) tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoestadoactivofijoRow=(TipoEstadoActivoFijo) tipoestadoactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoEstadoActivoFijo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoTipoEstadoActivoFijo && this.isPermisoNuevoTipoEstadoActivoFijo));			
			this.jButtonDuplicarTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarTipoEstadoActivoFijo && this.isPermisoDuplicarTipoEstadoActivoFijo));			
			this.jButtonCopiarTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarTipoEstadoActivoFijo && this.isPermisoCopiarTipoEstadoActivoFijo));
			this.jButtonVerFormTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormTipoEstadoActivoFijo && this.isPermisoVerFormTipoEstadoActivoFijo));
			
			this.jButtonAbrirOrderByTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenTipoEstadoActivoFijo && this.isPermisoOrdenTipoEstadoActivoFijo));			
			
			this.jButtonNuevoRelacionesTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo && this.isPermisoNuevoTipoEstadoActivoFijo));			
			this.jButtonNuevoGuardarCambiosTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoTipoEstadoActivoFijo && this.isPermisoNuevoTipoEstadoActivoFijo && this.isPermisoGuardarCambiosTipoEstadoActivoFijo));
			
			if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonModificarTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaModificarTipoEstadoActivoFijo && this.isPermisoActualizarTipoEstadoActivoFijo));	
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonActualizarTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarTipoEstadoActivoFijo && this.isPermisoActualizarTipoEstadoActivoFijo));	
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonEliminarTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarTipoEstadoActivoFijo && this.isPermisoEliminarTipoEstadoActivoFijo));
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonCancelarTipoEstadoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarTipoEstadoActivoFijo);							
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonGuardarCambiosTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarTipoEstadoActivoFijo && this.isPermisoGuardarCambiosTipoEstadoActivoFijo));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoEstadoActivoFijo && this.isPermisoGuardarCambiosTipoEstadoActivoFijo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoTipoEstadoActivoFijo && this.isPermisoNuevoTipoEstadoActivoFijo));						
			this.jButtonDuplicarToolBarTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarTipoEstadoActivoFijo && this.isPermisoDuplicarTipoEstadoActivoFijo));						
			this.jButtonCopiarToolBarTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarTipoEstadoActivoFijo && this.isPermisoCopiarTipoEstadoActivoFijo));			
			this.jButtonVerFormToolBarTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormTipoEstadoActivoFijo && this.isPermisoVerFormTipoEstadoActivoFijo));			
			this.jButtonAbrirOrderByToolBarTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenTipoEstadoActivoFijo && this.isPermisoOrdenTipoEstadoActivoFijo));
			this.jButtonNuevoRelacionesToolBarTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo && this.isPermisoNuevoTipoEstadoActivoFijo));			
			this.jButtonNuevoGuardarCambiosToolBarTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoTipoEstadoActivoFijo && this.isPermisoNuevoTipoEstadoActivoFijo && this.isPermisoGuardarCambiosTipoEstadoActivoFijo));			
			
			if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonModificarToolBarTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaModificarTipoEstadoActivoFijo && this.isPermisoActualizarTipoEstadoActivoFijo));	
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonActualizarToolBarTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarTipoEstadoActivoFijo  && this.isPermisoActualizarTipoEstadoActivoFijo));	
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonEliminarToolBarTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarTipoEstadoActivoFijo && this.isPermisoEliminarTipoEstadoActivoFijo));
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonCancelarToolBarTipoEstadoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarTipoEstadoActivoFijo);				
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonGuardarCambiosToolBarTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarTipoEstadoActivoFijo && this.isPermisoGuardarCambiosTipoEstadoActivoFijo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoEstadoActivoFijo && this.isPermisoGuardarCambiosTipoEstadoActivoFijo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoTipoEstadoActivoFijo && this.isPermisoNuevoTipoEstadoActivoFijo));			
			this.jMenuItemDuplicarTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarTipoEstadoActivoFijo && this.isPermisoDuplicarTipoEstadoActivoFijo));			
			this.jMenuItemCopiarTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarTipoEstadoActivoFijo && this.isPermisoCopiarTipoEstadoActivoFijo));			
			this.jMenuItemVerFormTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormTipoEstadoActivoFijo && this.isPermisoVerFormTipoEstadoActivoFijo));			
			this.jMenuItemAbrirOrderByTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenTipoEstadoActivoFijo && this.isPermisoOrdenTipoEstadoActivoFijo));			
			//this.jMenuItemMostrarOcultarTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenTipoEstadoActivoFijo && this.isPermisoOrdenTipoEstadoActivoFijo));
			this.jMenuItemDetalleAbrirOrderByTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenTipoEstadoActivoFijo && this.isPermisoOrdenTipoEstadoActivoFijo));			
			//this.jMenuItemDetalleMostrarOcultarTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenTipoEstadoActivoFijo && this.isPermisoOrdenTipoEstadoActivoFijo));			
			this.jMenuItemNuevoRelacionesTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo && this.isPermisoNuevoTipoEstadoActivoFijo));			
			this.jMenuItemNuevoGuardarCambiosTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoTipoEstadoActivoFijo && this.isPermisoNuevoTipoEstadoActivoFijo && this.isPermisoGuardarCambiosTipoEstadoActivoFijo));									
			
			if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jMenuItemModificarTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaModificarTipoEstadoActivoFijo && this.isPermisoActualizarTipoEstadoActivoFijo));	
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jMenuItemActualizarTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarTipoEstadoActivoFijo && this.isPermisoActualizarTipoEstadoActivoFijo));	
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jMenuItemEliminarTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarTipoEstadoActivoFijo && this.isPermisoEliminarTipoEstadoActivoFijo));
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jMenuItemCancelarTipoEstadoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarTipoEstadoActivoFijo);				
			}
			
			this.jMenuItemGuardarCambiosTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarTipoEstadoActivoFijo && this.isPermisoGuardarCambiosTipoEstadoActivoFijo));						
			this.jMenuItemGuardarCambiosTablaTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoEstadoActivoFijo && this.isPermisoGuardarCambiosTipoEstadoActivoFijo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoEstadoActivoFijo=this.jButtonNuevoTipoEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaDuplicarTipoEstadoActivoFijo=this.jButtonDuplicarTipoEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaCopiarTipoEstadoActivoFijo=this.jButtonCopiarTipoEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaVerFormTipoEstadoActivoFijo=this.jButtonVerFormTipoEstadoActivoFijo.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoEstadoActivoFijo=this.jButtonAbrirOrderByTipoEstadoActivoFijo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo=this.jButtonNuevoRelacionesTipoEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaModificarTipoEstadoActivoFijo=this.jButtonModificarTipoEstadoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {
			this.isVisibilidadCeldaActualizarTipoEstadoActivoFijo=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonActualizarTipoEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarTipoEstadoActivoFijo=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonEliminarTipoEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarTipoEstadoActivoFijo=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonCancelarTipoEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarTipoEstadoActivoFijo=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonGuardarCambiosTipoEstadoActivoFijo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoEstadoActivoFijo=this.jButtonGuardarCambiosTablaTipoEstadoActivoFijo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoEstadoActivoFijo=this.jButtonNuevoToolBarTipoEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo=this.jButtonNuevoRelacionesToolBarTipoEstadoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {
			this.isVisibilidadCeldaModificarTipoEstadoActivoFijo=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonModificarToolBarTipoEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarTipoEstadoActivoFijo=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonActualizarToolBarTipoEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarTipoEstadoActivoFijo=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonEliminarToolBarTipoEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarTipoEstadoActivoFijo=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonCancelarToolBarTipoEstadoActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoEstadoActivoFijo=this.jButtonGuardarCambiosToolBarTipoEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoEstadoActivoFijo=this.jButtonGuardarCambiosTablaToolBarTipoEstadoActivoFijo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoEstadoActivoFijo=this.jMenuItemNuevoTipoEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo=this.jMenuItemNuevoRelacionesTipoEstadoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {
			this.isVisibilidadCeldaModificarTipoEstadoActivoFijo=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jMenuItemModificarTipoEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarTipoEstadoActivoFijo=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jMenuItemActualizarTipoEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarTipoEstadoActivoFijo=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jMenuItemEliminarTipoEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarTipoEstadoActivoFijo=this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jMenuItemCancelarTipoEstadoActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoEstadoActivoFijo=this.jMenuItemGuardarCambiosTipoEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoEstadoActivoFijo=this.jMenuItemGuardarCambiosTablaTipoEstadoActivoFijo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoEstadoActivoFijo(Boolean esInicializar) {
		if(TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoestadoactivofijoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoEstadoActivoFijo();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoEstadoActivoFijo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoEstadoActivoFijo() {
		this.jButtonNuevoTipoEstadoActivoFijo.setVisible(this.isPermisoNuevoTipoEstadoActivoFijo);			
		this.jButtonDuplicarTipoEstadoActivoFijo.setVisible(this.isPermisoDuplicarTipoEstadoActivoFijo);			
		this.jButtonCopiarTipoEstadoActivoFijo.setVisible(this.isPermisoCopiarTipoEstadoActivoFijo);			
		this.jButtonVerFormTipoEstadoActivoFijo.setVisible(this.isPermisoVerFormTipoEstadoActivoFijo);			
		
		this.jButtonAbrirOrderByTipoEstadoActivoFijo.setVisible(this.isPermisoOrdenTipoEstadoActivoFijo);					
		
		this.jButtonNuevoRelacionesTipoEstadoActivoFijo.setVisible(this.isPermisoNuevoTipoEstadoActivoFijo);			
		
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonModificarTipoEstadoActivoFijo.setVisible(this.isPermisoActualizarTipoEstadoActivoFijo);	
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonActualizarTipoEstadoActivoFijo.setVisible(this.isPermisoActualizarTipoEstadoActivoFijo);	
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonEliminarTipoEstadoActivoFijo.setVisible(this.isPermisoEliminarTipoEstadoActivoFijo);
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonCancelarTipoEstadoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarTipoEstadoActivoFijo);						
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonGuardarCambiosTipoEstadoActivoFijo.setVisible(this.isPermisoGuardarCambiosTipoEstadoActivoFijo);							
		}
		
		this.jButtonGuardarCambiosTablaTipoEstadoActivoFijo.setVisible(this.isPermisoActualizarTipoEstadoActivoFijo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoEstadoActivoFijo() {
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonModificarTipoEstadoActivoFijo.setVisible(this.isPermisoActualizarTipoEstadoActivoFijo);	
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonActualizarTipoEstadoActivoFijo.setVisible(this.isPermisoActualizarTipoEstadoActivoFijo);	
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonEliminarTipoEstadoActivoFijo.setVisible(this.isPermisoEliminarTipoEstadoActivoFijo);
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonCancelarTipoEstadoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarTipoEstadoActivoFijo);							
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonGuardarCambiosTipoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarTipoEstadoActivoFijo && this.isPermisoGuardarCambiosTipoEstadoActivoFijo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoEstadoActivoFijo() {
		if(TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoEstadoActivoFijo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoEstadoActivoFijo() {
	}
	
	public void jTableDatosTipoEstadoActivoFijoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoEstadoActivoFijo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoEstadoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEstadoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoEstadoActivoFijo(this.gettipoestadoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoActivoFijo(this.tipoestadoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoestadoactivofijo==null) {
						this.tipoestadoactivofijo = new TipoEstadoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualTipoEstadoActivoFijo(this.tipoestadoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoActivoFijo(this.tipoestadoactivofijo);
				}

				if(this.tipoestadoactivofijo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoestadoactivofijo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoEstadoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisTipoEstadoActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebTipoEstadoActivoFijo(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEstadoActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoEstadoActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoEstadoActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoEstadoActivoFijo(this.gettipoestadoactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoActivoFijo(this.tipoestadoactivofijo);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.tipoestadoactivofijoLogic.getConnexion());

				if(this.tipoestadoactivofijo.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.tipoestadoactivofijo.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoEstadoActivoFijo=(TitledBorder)this.jScrollPanelDatosTipoEstadoActivoFijo.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderTipoEstadoActivoFijo.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisTipoEstadoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEstadoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoEstadoActivoFijo(this.gettipoestadoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoActivoFijo(this.tipoestadoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoestadoactivofijo==null) {
						this.tipoestadoactivofijo = new TipoEstadoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualTipoEstadoActivoFijo(this.tipoestadoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoActivoFijo(this.tipoestadoactivofijo);
				}

				if(this.tipoestadoactivofijo.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.tipoestadoactivofijo.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoEstadoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoEstadoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEstadoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoEstadoActivoFijo(this.gettipoestadoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoActivoFijo(this.tipoestadoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoestadoactivofijo==null) {
						this.tipoestadoactivofijo = new TipoEstadoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualTipoEstadoActivoFijo(this.tipoestadoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoActivoFijo(this.tipoestadoactivofijo);
				}

				if(this.tipoestadoactivofijo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoestadoactivofijo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoEstadoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdPaisTipoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoEstadoActivoFijo(false,false);

			this.getTipoEstadoActivoFijosFK_IdPais();

			this.inicializarActualizarBindingTipoEstadoActivoFijo(false);

			//if(TipoEstadoActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoEstadoActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoEstadoActivoFijo() {
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.dispose();
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo!=null) {
			this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.dispose();
			this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo=null;
		}
		
		if(this.jInternalFrameImportacionTipoEstadoActivoFijo!=null) {
			this.jInternalFrameImportacionTipoEstadoActivoFijo.setVisible(false);	    			
			this.jInternalFrameImportacionTipoEstadoActivoFijo.dispose();
			this.jInternalFrameImportacionTipoEstadoActivoFijo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoEstadoActivoFijo();
			
			TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoEstadoActivoFijo")) {
				jButtonNuevoTipoEstadoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoEstadoActivoFijo")) {
				jButtonDuplicarTipoEstadoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoEstadoActivoFijo")) {
				jButtonCopiarTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoEstadoActivoFijo")) {
				jButtonVerFormTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoEstadoActivoFijo")) {
				jButtonNuevoTipoEstadoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoEstadoActivoFijo")) {
				jButtonDuplicarTipoEstadoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoEstadoActivoFijo")) {
				jButtonNuevoTipoEstadoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoEstadoActivoFijo")) {
				jButtonDuplicarTipoEstadoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoEstadoActivoFijo")) {
				jButtonNuevoTipoEstadoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoEstadoActivoFijo")) {
				jButtonNuevoTipoEstadoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoEstadoActivoFijo")) {
				jButtonNuevoTipoEstadoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoEstadoActivoFijo")) {
				jButtonModificarTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoEstadoActivoFijo")) {
				jButtonModificarTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoEstadoActivoFijo")) {
				jButtonModificarTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoEstadoActivoFijo")) {
				jButtonActualizarTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoEstadoActivoFijo")) {
				jButtonActualizarTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoEstadoActivoFijo")) {
				jButtonActualizarTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoEstadoActivoFijo")) {
				jButtonEliminarTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoEstadoActivoFijo")) {
				jButtonEliminarTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoEstadoActivoFijo")) {
				jButtonEliminarTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoEstadoActivoFijo")) {
				jButtonCancelarTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoEstadoActivoFijo")) {
				jButtonCancelarTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoEstadoActivoFijo")) {
				jButtonCancelarTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoEstadoActivoFijo")) {
				jButtonCerrarTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoEstadoActivoFijo")) {
				jButtonCerrarTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoEstadoActivoFijo")) {
				jButtonCerrarTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoEstadoActivoFijo")) {
				jButtonMostrarOcultarTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoEstadoActivoFijo")) {
				jButtonCancelarTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoEstadoActivoFijo")) {
				jButtonGuardarCambiosTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoEstadoActivoFijo")) {
				jButtonGuardarCambiosTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoEstadoActivoFijo")) {
				jButtonCopiarTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoEstadoActivoFijo")) {
				jButtonVerFormTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoEstadoActivoFijo")) {
				jButtonGuardarCambiosTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoEstadoActivoFijo")) {
				jButtonCopiarTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoEstadoActivoFijo")) {
				jButtonVerFormTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoEstadoActivoFijo")) {
				jButtonGuardarCambiosTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoEstadoActivoFijo")) {
				jButtonGuardarCambiosTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoEstadoActivoFijo")) {
				jButtonGuardarCambiosTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoEstadoActivoFijo")) {
				jButtonRecargarInformacionTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoEstadoActivoFijo")) {
				jButtonRecargarInformacionTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoEstadoActivoFijo")) {
				jButtonRecargarInformacionTipoEstadoActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoEstadoActivoFijo")) {
				jButtonAnterioresTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoEstadoActivoFijo")) {
				jButtonAnterioresTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoEstadoActivoFijo")) {
				jButtonAnterioresTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoEstadoActivoFijo")) {
				jButtonSiguientesTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoEstadoActivoFijo")) {
				jButtonSiguientesTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoEstadoActivoFijo")) {
				jButtonSiguientesTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoEstadoActivoFijo") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoEstadoActivoFijo")) {
				jButtonAbrirOrderByTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoEstadoActivoFijo") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoEstadoActivoFijo")) {
				jButtonMostrarOcultarTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoEstadoActivoFijo")) {
				jButtonNuevoGuardarCambiosTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoEstadoActivoFijo")) {
				jButtonNuevoGuardarCambiosTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoEstadoActivoFijo")) {
				jButtonNuevoGuardarCambiosTipoEstadoActivoFijoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoEstadoActivoFijo")) {
				jButtonCerrarReporteDinamicoTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoEstadoActivoFijo")) {
				jButtonGenerarReporteDinamicoTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoEstadoActivoFijo")) {
				
				jButtonGenerarExcelReporteDinamicoTipoEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoEstadoActivoFijo")) {
				jButtonCerrarImportacionTipoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoEstadoActivoFijo")) {
				
				jButtonGenerarImportacionTipoEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoEstadoActivoFijo")) {
				
				jButtonAbrirImportacionTipoEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoEstadoActivoFijo")) {
				jComboBoxTiposAccionesTipoEstadoActivoFijoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoEstadoActivoFijo")) {
				jComboBoxTiposRelacionesTipoEstadoActivoFijoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoEstadoActivoFijo")) {
				jComboBoxTiposAccionesTipoEstadoActivoFijoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoEstadoActivoFijo")) {
				
				jComboBoxTiposSeleccionarTipoEstadoActivoFijoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoEstadoActivoFijo")) {
				jTextFieldValorCampoGeneralTipoEstadoActivoFijoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoEstadoActivoFijo")) {
				jButtonAbrirOrderByTipoEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoEstadoActivoFijo")) {
				jButtonAbrirOrderByTipoEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoEstadoActivoFijo")) {
				jButtonCerrarOrderByTipoEstadoActivoFijoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoEstadoActivoFijoBusqueda")) {
				this.jButtonidTipoEstadoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoEstadoActivoFijoUpdate")) {
				this.jButtonid_paisTipoEstadoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoEstadoActivoFijoBusqueda")) {
				this.jButtonid_paisTipoEstadoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoEstadoActivoFijoBusqueda")) {
				this.jButtonnombreTipoEstadoActivoFijoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdPaisTipoEstadoActivoFijo")) {
				this.jButtonFK_IdPaisTipoEstadoActivoFijoActionPerformed(evt);
			}
			
			;
			
			
			TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoEstadoActivoFijo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEstadoActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestadoactivofijo);
				
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
				
				


				
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstadoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstadoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoEstadoActivoFijo tipoestadoactivofijoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoestadoactivofijoLocal=this.tipoestadoactivofijo;
			} else {
				tipoestadoactivofijoLocal=this.tipoestadoactivofijoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestadoactivofijo);
				
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
							
				
				


				
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstadoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstadoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEstadoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEstadoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadoactivofijoAnterior =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoestadoactivofijoAnterior =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
			
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
			
			


			
			TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEstadoActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestadoactivofijo);
				
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
								
						
				


				
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstadoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstadoActivoFijo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestadoactivofijo);
				
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
								
				
				


				
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstadoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstadoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEstadoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEstadoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadoactivofijoAnterior =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoestadoactivofijoAnterior =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestadoactivofijo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEstadoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEstadoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadoactivofijoAnterior =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoestadoactivofijoAnterior =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEstadoActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoestadoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestadoactivofijo);
				
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
							
				
				


				
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstadoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstadoActivoFijo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEstadoActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoEstadoActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoestadoactivofijoAnterior =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoestadoactivofijoAnterior =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
			
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
			
			


			
			TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEstadoActivoFijoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoestadoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestadoactivofijo);
				
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
								
				
				


				
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstadoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstadoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEstadoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEstadoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadoactivofijoAnterior =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoestadoactivofijoAnterior =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEstadoActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoestadoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEstadoActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestadoactivofijo);
				
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoEstadoActivoFijo")) {
					jCheckBoxSeleccionarTodosTipoEstadoActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoEstadoActivoFijo")) {
					jCheckBoxSeleccionadosTipoEstadoActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoEstadoActivoFijo")) {
					
				}
				
				


				
				
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstadoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstadoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadoactivofijo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoestadoactivofijo);
				
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
												
				
				


				
				
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstadoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstadoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEstadoActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoEstadoActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoestadoactivofijoAnterior =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoestadoactivofijoAnterior =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEstadoActivoFijoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestadoactivofijo);
				
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
				
				
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
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
			
			


			
			TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEstadoActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestadoactivofijo);
				
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstadoActivoFijo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstadoActivoFijo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestadoactivofijo);
				
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
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
				
				


				
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstadoActivoFijo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstadoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEstadoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEstadoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadoactivofijoAnterior =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoestadoactivofijoAnterior =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoEstadoActivoFijo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoEstadoActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoEstadoActivoFijo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoestadoactivofijo =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoestadoactivofijo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoEstadoActivoFijo")) {
				
				}
				
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoEstadoActivoFijo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoEstadoActivoFijo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoEstadoActivoFijo")) {
			
			}
			
			TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoEstadoActivoFijo();
			
			TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoEstadoActivoFijo")) {
				jButtonNuevoTipoEstadoActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoEstadoActivoFijo")) {
				jButtonDuplicarTipoEstadoActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoEstadoActivoFijo")) {
				jButtonCopiarTipoEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoEstadoActivoFijo")) {
				jButtonVerFormTipoEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoEstadoActivoFijo")) {
				jButtonNuevoTipoEstadoActivoFijoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoEstadoActivoFijo")) {
				jButtonModificarTipoEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoEstadoActivoFijo")) {
				jButtonActualizarTipoEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoEstadoActivoFijo")) {
				jButtonEliminarTipoEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoEstadoActivoFijo")) {
				jButtonGuardarCambiosTipoEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoEstadoActivoFijo")) {
				jButtonCancelarTipoEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoEstadoActivoFijo")) {
				jButtonCerrarTipoEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoEstadoActivoFijo")) {
				jButtonGuardarCambiosTipoEstadoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoEstadoActivoFijo")) {
				jButtonNuevoGuardarCambiosTipoEstadoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoEstadoActivoFijo")) {
				jButtonAbrirOrderByTipoEstadoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoEstadoActivoFijo")) {
				jButtonRecargarInformacionTipoEstadoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoEstadoActivoFijo")) {
				jButtonAnterioresTipoEstadoActivoFijoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoEstadoActivoFijo")) {
				jButtonSiguientesTipoEstadoActivoFijoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoEstadoActivoFijoBusqueda")) {
				this.jButtonidTipoEstadoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoEstadoActivoFijoUpdate")) {
				this.jButtonid_paisTipoEstadoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoEstadoActivoFijoBusqueda")) {
				this.jButtonid_paisTipoEstadoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoEstadoActivoFijoBusqueda")) {
				this.jButtonnombreTipoEstadoActivoFijoBusquedaActionPerformed(evt);
			}
			
			TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoEstadoActivoFijo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoEstadoActivoFijo")) {
				closingInternalFrameTipoEstadoActivoFijo();
				
			} else if(sTipo.equals("jButtonCancelarTipoEstadoActivoFijo")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoEstadoActivoFijo = (JInternalFrameBase)evt.getSource();
	            	
	            TipoEstadoActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(TipoEstadoActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoEstadoActivoFijo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoEstadoActivoFijoActionPerformed(null);
			}
			
			TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoestadoactivofijo,new Object(),this.tipoestadoactivofijoParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoEstadoActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoEstadoActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoEstadoActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoestadoactivofijo)) {
			if(!esControlTabla) {
				if(TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoEstadoActivoFijo(this.tipoestadoactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoActivoFijo(this.tipoestadoactivofijo);			
				}
				
				if(this.tipoestadoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoEstadoActivoFijo(this.tipoestadoactivofijo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoestadoactivofijoReturnGeneral=tipoestadoactivofijoLogic.procesarEventosTipoEstadoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos(),this.tipoestadoactivofijo,this.tipoestadoactivofijoParameterGeneral,this.isEsNuevoTipoEstadoActivoFijo,classes);//this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoEstadoActivoFijo(this.tipoestadoactivofijoReturnGeneral,this.tipoestadoactivofijoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoestadoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoEstadoActivoFijo(classes,this.tipoestadoactivofijoReturnGeneral,this.tipoestadoactivofijoBean,false);
					}
						
					if(this.tipoestadoactivofijoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoEstadoActivoFijo(this.tipoestadoactivofijoReturnGeneral.getTipoEstadoActivoFijo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoEstadoActivoFijo(this.tipoestadoactivofijoReturnGeneral.getTipoEstadoActivoFijo());	
					}
						
					if(this.tipoestadoactivofijoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoEstadoActivoFijo(this.tipoestadoactivofijoReturnGeneral.getTipoEstadoActivoFijo(),classes);//this.tipoestadoactivofijoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoEstadoActivoFijo(this.tipoestadoactivofijo,classes);//this.tipoestadoactivofijoBean);									
				}
			
				if(TipoEstadoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoEstadoActivoFijo(this.tipoestadoactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoActivoFijo(this.tipoestadoactivofijo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoestadoactivofijoAnterior!=null) {
						this.tipoestadoactivofijo=this.tipoestadoactivofijoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoestadoactivofijoReturnGeneral=tipoestadoactivofijoLogic.procesarEventosTipoEstadoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos(),this.tipoestadoactivofijo,this.tipoestadoactivofijoParameterGeneral,this.isEsNuevoTipoEstadoActivoFijo,classes);//this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoestadoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoestadoactivofijoReturnGeneral.getTipoEstadoActivoFijo(),tipoestadoactivofijoLogic.getTipoEstadoActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoestadoactivofijoReturnGeneral.getTipoEstadoActivoFijo(),this.tipoestadoactivofijos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoEstadoActivoFijo.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoEstadoActivoFijo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoEstadoActivoFijo();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoEstadoActivoFijo() throws Exception {
		
		TipoEstadoActivoFijoModel tipoestadoactivofijoModel=(TipoEstadoActivoFijoModel)this.jTableDatosTipoEstadoActivoFijo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoestadoactivofijoModel.tipoestadoactivofijos=this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoestadoactivofijoModel.tipoestadoactivofijos=this.tipoestadoactivofijos;
		}
		
		
		((TipoEstadoActivoFijoModel) this.jTableDatosTipoEstadoActivoFijo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoEstadoActivoFijo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoestadoactivofijoAnterior(),this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoestadoactivofijoAnterior(),this.tipoestadoactivofijos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoEstadoActivoFijo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoEstadoActivoFijo(TipoEstadoActivoFijo tipoestadoactivofijo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
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
										
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoestadoactivofijo,new Object(),generalEntityParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoestadoactivofijoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoEstadoActivoFijoConstantesFunciones.getClassesRelationshipsOfTipoEstadoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoEstadoActivoFijoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoEstadoActivoFijo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoEstadoActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoestadoactivofijo,new Object(),generalEntityParameterGeneral,this.tipoestadoactivofijoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoEstadoActivoFijo(TipoEstadoActivoFijoBean tipoestadoactivofijoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoEstadoActivoFijo(ArrayList<Classe> classes,TipoEstadoActivoFijoReturnGeneral tipoestadoactivofijoReturnGeneral,TipoEstadoActivoFijoBean tipoestadoactivofijoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoEstadoActivoFijo(TipoEstadoActivoFijo tipoestadoactivofijo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoestadoactivofijo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo = new TipoEstadoActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.tipoestadoactivofijoSessionBean.getConGuardarRelaciones(),this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoEstadoActivoFijo);
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.setVisible(false);
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.tipoestadoactivofijoLogic=this.tipoestadoactivofijoLogic;
		
		this.cargarCombosFrameForeignKeyTipoEstadoActivoFijo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoEstadoActivoFijo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoEstadoActivoFijo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoEstadoActivoFijo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoEstadoActivoFijo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoEstadoActivoFijo"));
		
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonModificarTipoEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarTipoEstadoActivoFijo"));

		
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonModificarToolBarTipoEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoEstadoActivoFijo"));
					
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jMenuItemModificarTipoEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoEstadoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonActualizarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarTipoEstadoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonActualizarToolBarTipoEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoEstadoActivoFijo"));
						
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jMenuItemActualizarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoEstadoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonEliminarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarTipoEstadoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonEliminarToolBarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoEstadoActivoFijo"));
								
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jMenuItemEliminarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoEstadoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonCancelarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarTipoEstadoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonCancelarToolBarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoEstadoActivoFijo"));
					
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jMenuItemCancelarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoEstadoActivoFijo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jMenuItemDetalleCerrarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoEstadoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonGuardarCambiosToolBarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoEstadoActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonGuardarCambiosToolBarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoEstadoActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoEstadoActivoFijo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonidTipoEstadoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoEstadoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonid_paisTipoEstadoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoEstadoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonid_paisTipoEstadoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoEstadoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonnombreTipoEstadoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoEstadoActivoFijoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTabbedPaneRelacionesTipoEstadoActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoEstadoActivoFijo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoEstadoActivoFijo"));
		
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoEstadoActivoFijo"));
		}
		
		this.jTableDatosTipoEstadoActivoFijo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoEstadoActivoFijo"));
		
		this.jTableDatosTipoEstadoActivoFijo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoEstadoActivoFijo"));
		
		this.jButtonNuevoTipoEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoTipoEstadoActivoFijo"));
		
		this.jButtonDuplicarTipoEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarTipoEstadoActivoFijo"));
		
		this.jButtonCopiarTipoEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"CopiarTipoEstadoActivoFijo"));
		
		this.jButtonVerFormTipoEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"VerFormTipoEstadoActivoFijo"));
		
		
		this.jButtonNuevoToolBarTipoEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoEstadoActivoFijo"));
			
		this.jButtonDuplicarToolBarTipoEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoEstadoActivoFijo"));
			
		this.jMenuItemNuevoTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoEstadoActivoFijo"));
			
		this.jMenuItemDuplicarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoEstadoActivoFijo"));		
		
		
		this.jButtonNuevoRelacionesTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoEstadoActivoFijo"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoEstadoActivoFijo"));
			
		this.jMenuItemNuevoRelacionesTipoEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoEstadoActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonModificarTipoEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarTipoEstadoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonModificarToolBarTipoEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoEstadoActivoFijo"));
			
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jMenuItemModificarTipoEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoEstadoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonActualizarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarTipoEstadoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonActualizarToolBarTipoEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoEstadoActivoFijo"));
				
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jMenuItemActualizarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoEstadoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonEliminarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarTipoEstadoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonEliminarToolBarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoEstadoActivoFijo"));
						
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jMenuItemEliminarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoEstadoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonCancelarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarTipoEstadoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonCancelarToolBarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoEstadoActivoFijo"));
			
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jMenuItemCancelarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoEstadoActivoFijo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoEstadoActivoFijo"));		
		
		
		this.jButtonCerrarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarTipoEstadoActivoFijo"));
		
		
		this.jButtonCerrarToolBarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoEstadoActivoFijo"));
			
		this.jMenuItemCerrarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoEstadoActivoFijo"));
			
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jMenuItemDetalleCerrarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoEstadoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonGuardarCambiosTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoEstadoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonGuardarCambiosToolBarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoEstadoActivoFijo"));
		}
		
		this.jButtonCopiarToolBarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoEstadoActivoFijo"));
			
		this.jButtonVerFormToolBarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoEstadoActivoFijo"));
		
		this.jMenuItemGuardarCambiosTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoEstadoActivoFijo"));
			
		this.jMenuItemCopiarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoEstadoActivoFijo"));		
		
		this.jMenuItemVerFormTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoEstadoActivoFijo"));		
		
		
		this.jButtonGuardarCambiosTablaTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoEstadoActivoFijo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoEstadoActivoFijo"));
			
		this.jMenuItemGuardarCambiosTablaTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoEstadoActivoFijo"));		
		
		
		
		this.jButtonRecargarInformacionTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoEstadoActivoFijo"));
					
		this.jButtonRecargarInformacionToolBarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoEstadoActivoFijo"));
		
		this.jMenuItemRecargarInformacionTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoEstadoActivoFijo"));		
		
		
		
		this.jButtonAnterioresTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresTipoEstadoActivoFijo"));
		
		
		this.jButtonAnterioresToolBarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoEstadoActivoFijo"));
		
		this.jMenuItemAnterioresTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoEstadoActivoFijo"));		
		
		
		this.jButtonSiguientesTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesTipoEstadoActivoFijo"));
		
		
		this.jButtonSiguientesToolBarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoEstadoActivoFijo"));
			
		this.jMenuItemSiguientesTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoEstadoActivoFijo"));
			
		this.jMenuItemAbrirOrderByTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoEstadoActivoFijo"));
			
		this.jMenuItemMostrarOcultarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoEstadoActivoFijo"));
			
		this.jMenuItemDetalleAbrirOrderByTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoEstadoActivoFijo"));
			
		this.jMenuItemDetalleMostarOcultarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoEstadoActivoFijo"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoEstadoActivoFijo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoEstadoActivoFijo"));
			
		this.jMenuItemNuevoGuardarCambiosTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoEstadoActivoFijo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoEstadoActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoEstadoActivoFijo"));

		this.jCheckBoxSeleccionadosTipoEstadoActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoEstadoActivoFijo"));
		
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoEstadoActivoFijo"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoEstadoActivoFijo"));
			
		this.jComboBoxTiposAccionesTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoEstadoActivoFijo"));
					
		this.jComboBoxTiposSeleccionarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoEstadoActivoFijo"));
			
		this.jTextFieldValorCampoGeneralTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoEstadoActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonidTipoEstadoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoEstadoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonid_paisTipoEstadoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoEstadoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonid_paisTipoEstadoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoEstadoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonnombreTipoEstadoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoEstadoActivoFijoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdPaisTipoEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoEstadoActivoFijo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoEstadoActivoFijo"));
				this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoEstadoActivoFijo"));
				this.jInternalFrameReporteDinamicoTipoEstadoActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoEstadoActivoFijo"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoEstadoActivoFijo"));				
			//this.jButtonGenerarReporteDinamicoTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoEstadoActivoFijo"));
			//this.jButtonGenerarExcelReporteDinamicoTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoEstadoActivoFijo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoEstadoActivoFijo!=null) {
				this.jInternalFrameImportacionTipoEstadoActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoEstadoActivoFijo"));
				this.jInternalFrameImportacionTipoEstadoActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoEstadoActivoFijo"));
				this.jInternalFrameImportacionTipoEstadoActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoEstadoActivoFijo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoEstadoActivoFijo"));
			
			this.jButtonAbrirOrderByToolBarTipoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoEstadoActivoFijo"));			
			
			if(this.jInternalFrameOrderByTipoEstadoActivoFijo!=null) {
				this.jInternalFrameOrderByTipoEstadoActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoEstadoActivoFijo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTabbedPaneRelacionesTipoEstadoActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoEstadoActivoFijo"));
		
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
            		closingInternalFrameTipoEstadoActivoFijo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoEstadoActivoFijo = (JInternalFrameBase)event.getSource();
	            	
	            TipoEstadoActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(TipoEstadoActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoEstadoActivoFijo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoEstadoActivoFijoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoEstadoActivoFijo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoEstadoActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoEstadoActivoFijo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoEstadoActivoFijo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEstadoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEstadoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEstadoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoEstadoActivoFijo";
		inputMap = this.jButtonNuevoTipoEstadoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoEstadoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoEstadoActivoFijoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEstadoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEstadoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEstadoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoEstadoActivoFijo";
		inputMap = this.jButtonNuevoRelacionesTipoEstadoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoEstadoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoEstadoActivoFijoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoEstadoActivoFijo";
		inputMap = this.jButtonModificarTipoEstadoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoEstadoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoEstadoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoEstadoActivoFijo";
		inputMap = this.jButtonActualizarTipoEstadoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoEstadoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoEstadoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoEstadoActivoFijo";
		inputMap = this.jButtonEliminarTipoEstadoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoEstadoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoEstadoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoEstadoActivoFijo";
		inputMap = this.jButtonCancelarTipoEstadoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoEstadoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoEstadoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoEstadoActivoFijo";
		inputMap = this.jButtonCerrarTipoEstadoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoEstadoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoEstadoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonGuardarCambiosTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoEstadoActivoFijo";
		inputMap = this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonGuardarCambiosTipoEstadoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonGuardarCambiosTipoEstadoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoEstadoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoEstadoActivoFijo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoEstadoActivoFijoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoEstadoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoEstadoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoEstadoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoEstadoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoEstadoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoEstadoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonidTipoEstadoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoEstadoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonid_paisTipoEstadoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoEstadoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonid_paisTipoEstadoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoEstadoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jButtonnombreTipoEstadoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoEstadoActivoFijoBusqueda"));
		
		
		this.jButtonFK_IdPaisTipoEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoEstadoActivoFijo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoEstadoActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoEstadoActivoFijo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoEstadoActivoFijo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoEstadoActivoFijo tipoestadoactivofijoAux:this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos()) {
					tipoestadoactivofijoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEstadoActivoFijo tipoestadoactivofijoAux:tipoestadoactivofijos) {
					tipoestadoactivofijoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoEstadoActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoEstadoActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoEstadoActivoFijo tipoestadoactivofijoAux:this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos()) {
						tipoestadoactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoEstadoActivoFijo tipoestadoactivofijoAux:tipoestadoactivofijos) {
						tipoestadoactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoEstadoActivoFijo tipoestadoactivofijoAux:this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoEstadoActivoFijo tipoestadoactivofijoAux:tipoestadoactivofijos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoEstadoActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoEstadoActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoEstadoActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoEstadoActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoEstadoActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoEstadoActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoEstadoActivoFijo.getSelectedRows();
			
			TipoEstadoActivoFijo tipoestadoactivofijoLocal=new TipoEstadoActivoFijo();
			
			//this.seleccionarTodosTipoEstadoActivoFijo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoestadoactivofijoLocal =(TipoEstadoActivoFijo) this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos().toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoestadoactivofijoLocal =(TipoEstadoActivoFijo) this.tipoestadoactivofijos.toArray()[this.jTableDatosTipoEstadoActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoestadoactivofijoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoEstadoActivoFijo tipoestadoactivofijoAux:this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos()) {
						tipoestadoactivofijoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoEstadoActivoFijo tipoestadoactivofijoAux:tipoestadoactivofijos) {
						tipoestadoactivofijoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoEstadoActivoFijo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoEstadoActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoEstadoActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoEstadoActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoEstadoActivoFijoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoEstadoActivoFijoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoEstadoActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoEstadoActivoFijo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoEstadoActivoFijo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoEstadoActivoFijo tipoestadoactivofijoAux:this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos()) {
				
						if(sTipoSeleccionar.equals(TipoEstadoActivoFijoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoestadoactivofijoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEstadoActivoFijo tipoestadoactivofijoAux:tipoestadoactivofijos) {
					
						if(sTipoSeleccionar.equals(TipoEstadoActivoFijoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoestadoactivofijoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoEstadoActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoEstadoActivoFijoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoEstadoActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoEstadoActivoFijo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoEstadoActivoFijo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoEstadoActivoFijo) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoEstadoActivoFijo(conSplash);
				
					this.generarReporteTipoEstadoActivoFijosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEstadoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoEstadoActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesTipoEstadoActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoEstadoActivoFijosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoEstadoActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoEstadoActivoFijosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoEstadoActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoEstadoActivoFijo();
				
				this.exportarTipoEstadoActivoFijosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEstadoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoEstadoActivoFijos();
				//this.importarTipoEstadoActivoFijos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEstadoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoEstadoActivoFijo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoEstadoActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesTipoEstadoActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Estado Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoEstadoActivoFijo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoEstadoActivoFijo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoEstadoActivoFijo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Estado Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEstadoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoEstadoActivoFijo();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoEstadoActivoFijo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoEstadoActivoFijoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoEstadoActivoFijo();
			
			if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoEstadoActivoFijo> tipoestadoactivofijosSeleccionados=new ArrayList<TipoEstadoActivoFijo>();		
			TipoEstadoActivoFijo tipoestadoactivofijo=new TipoEstadoActivoFijo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoEstadoActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoEstadoActivoFijo.getSelectedItem();
			
			
			
			
			tipoestadoactivofijosSeleccionados=this.getTipoEstadoActivoFijosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoestadoactivofijosSeleccionados.size()==1) {
				for(TipoEstadoActivoFijo tipoestadoactivofijoAux:tipoestadoactivofijosSeleccionados) {
					tipoestadoactivofijo=tipoestadoactivofijoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoEstadoActivoFijo();
			
      		//this.finishProcessTipoEstadoActivoFijo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoEstadoActivoFijoReturnGeneral() throws Exception {
		if(this.tipoestadoactivofijoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoestadoactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoestadoactivofijoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoestadoactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoestadoactivofijoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoestadoactivofijoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoEstadoActivoFijo(false);
		}
		
		if(this.tipoestadoactivofijoReturnGeneral.getConRetornoLista() || this.tipoestadoactivofijoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoestadoactivofijoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoestadoactivofijoLogic.setTipoEstadoActivoFijos(this.tipoestadoactivofijoReturnGeneral.getTipoEstadoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoestadoactivofijoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoestadoactivofijoLogic.setTipoEstadoActivoFijo(this.tipoestadoactivofijoReturnGeneral.getTipoEstadoActivoFijo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoEstadoActivoFijo(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoEstadoActivoFijo() throws Exception {
		
		
	}
	
	public ArrayList<TipoEstadoActivoFijo> getTipoEstadoActivoFijosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoEstadoActivoFijo> tipoestadoactivofijosSeleccionados=new ArrayList<TipoEstadoActivoFijo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoEstadoActivoFijo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoEstadoActivoFijo tipoestadoactivofijoAux:tipoestadoactivofijoLogic.getTipoEstadoActivoFijos()) {
					if(tipoestadoactivofijoAux.getIsSelected()) {
						tipoestadoactivofijosSeleccionados.add(tipoestadoactivofijoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEstadoActivoFijo tipoestadoactivofijoAux:this.tipoestadoactivofijos) {
					if(tipoestadoactivofijoAux.getIsSelected()) {
						tipoestadoactivofijosSeleccionados.add(tipoestadoactivofijoAux);				
					}
				}
			}
			
			if(tipoestadoactivofijosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoestadoactivofijosSeleccionados.addAll(this.tipoestadoactivofijoLogic.getTipoEstadoActivoFijos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoestadoactivofijosSeleccionados.addAll(this.tipoestadoactivofijos);				
					}
				}
			}
		} else {
			tipoestadoactivofijosSeleccionados.add(this.tipoestadoactivofijo);
		}
		
		return tipoestadoactivofijosSeleccionados;
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
	
	public void generarReporteTipoEstadoActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoEstadoActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoEstadoActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoEstadoActivoFijosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoEstadoActivoFijosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Estado Activo Fijo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoEstadoActivoFijosSeleccionados() throws Exception {
		ArrayList<TipoEstadoActivoFijo> tipoestadoactivofijosSeleccionados=new ArrayList<TipoEstadoActivoFijo>();		
		
		tipoestadoactivofijosSeleccionados=this.getTipoEstadoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoEstadoActivoFijos("Todos",tipoestadoactivofijosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoEstadoActivoFijosSeleccionados() throws Exception {
		ArrayList<TipoEstadoActivoFijo> tipoestadoactivofijosSeleccionados=new ArrayList<TipoEstadoActivoFijo>();		
		
		tipoestadoactivofijosSeleccionados=this.getTipoEstadoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoEstadoActivoFijos("Todos",tipoestadoactivofijosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoEstadoActivoFijosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoEstadoActivoFijo> tipoestadoactivofijosSeleccionados=new ArrayList<TipoEstadoActivoFijo>();
		
		tipoestadoactivofijosSeleccionados=this.getTipoEstadoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoEstadoActivoFijos("Todos",tipoestadoactivofijosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoEstadoActivoFijosSeleccionados() throws Exception {
		ArrayList<TipoEstadoActivoFijo> tipoestadoactivofijosSeleccionados=new ArrayList<TipoEstadoActivoFijo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoEstadoActivoFijo();
		
		
		tipoestadoactivofijosSeleccionados=this.getTipoEstadoActivoFijosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoEstadoActivoFijo();
		
		
		//this.generarReporteTipoEstadoActivoFijos("Todos",tipoestadoactivofijosSeleccionados ,tipoestadoactivofijoImplementable,tipoestadoactivofijoImplementableHome);
	}
	
	public void mostrarImportacionTipoEstadoActivoFijos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoEstadoActivoFijo();
		
		this.abrirFrameImportacionTipoEstadoActivoFijo();		
		
			
		//this.generarReporteTipoEstadoActivoFijos("Todos",tipoestadoactivofijosSeleccionados ,tipoestadoactivofijoImplementable,tipoestadoactivofijoImplementableHome);
	}
	
	public void importarTipoEstadoActivoFijos() throws Exception {		
	
	}
	
	public void exportarTipoEstadoActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoEstadoActivoFijosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoEstadoActivoFijosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoEstadoActivoFijosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Estado Activo Fijo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoEstadoActivoFijosSeleccionados() throws Exception {
		ArrayList<TipoEstadoActivoFijo> tipoestadoactivofijosSeleccionados=new ArrayList<TipoEstadoActivoFijo>();		
		
		tipoestadoactivofijosSeleccionados=this.getTipoEstadoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoestadoactivofijo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoEstadoActivoFijo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoEstadoActivoFijo tipoestadoactivofijoAux:tipoestadoactivofijosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoEstadoActivoFijo(tipoestadoactivofijoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoestadoactivofijoAux.setsDetalleGeneralEntityReporte(tipoestadoactivofijoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Estado Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoEstadoActivoFijo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoEstadoActivoFijoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoEstadoActivoFijoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoEstadoActivoFijoConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoEstadoActivoFijoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoEstadoActivoFijo(TipoEstadoActivoFijo tipoestadoactivofijo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoestadoactivofijo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoestadoactivofijo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoestadoactivofijo.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoestadoactivofijo.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoEstadoActivoFijosSeleccionados() throws Exception {
		ArrayList<TipoEstadoActivoFijo> tipoestadoactivofijosSeleccionados=new ArrayList<TipoEstadoActivoFijo>();		
		
		tipoestadoactivofijosSeleccionados=this.getTipoEstadoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoestadoactivofijo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoEstadoActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoEstadoActivoFijo(row);				
				iRow++;
			}				
			
			for(TipoEstadoActivoFijo tipoestadoactivofijoAux:tipoestadoactivofijosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoEstadoActivoFijo(tipoestadoactivofijoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Estado Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoEstadoActivoFijosSeleccionados() throws Exception {
		ArrayList<TipoEstadoActivoFijo> tipoestadoactivofijosSeleccionados=new ArrayList<TipoEstadoActivoFijo>();		
		
		tipoestadoactivofijosSeleccionados=this.getTipoEstadoActivoFijosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoestadoactivofijo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoestadoactivofijos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoestadoactivofijo");
			//elementRoot.appendChild(element);
		
			for(TipoEstadoActivoFijo tipoestadoactivofijoAux:tipoestadoactivofijosSeleccionados) {
				element = document.createElement("tipoestadoactivofijo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoEstadoActivoFijo(tipoestadoactivofijoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Estado Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoEstadoActivoFijo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoEstadoActivoFijoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoEstadoActivoFijoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoEstadoActivoFijoConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoEstadoActivoFijoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoEstadoActivoFijo(TipoEstadoActivoFijo tipoestadoactivofijo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoestadoactivofijo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoestadoactivofijo.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoestadoactivofijo.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoEstadoActivoFijo(TipoEstadoActivoFijo tipoestadoactivofijo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoEstadoActivoFijoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoestadoactivofijo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoEstadoActivoFijoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoestadoactivofijo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpais_descripcion = document.createElement(TipoEstadoActivoFijoConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(tipoestadoactivofijo.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementnombre = document.createElement(TipoEstadoActivoFijoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoestadoactivofijo.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoEstadoActivoFijosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoEstadoActivoFijo> tipoestadoactivofijosSeleccionados=new ArrayList<TipoEstadoActivoFijo>();
		
		tipoestadoactivofijosSeleccionados=this.getTipoEstadoActivoFijosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoEstadoActivoFijo(tipoestadoactivofijosSeleccionados);
		
		this.generarReporteTipoEstadoActivoFijos("Todos",tipoestadoactivofijosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoEstadoActivoFijo(ArrayList<TipoEstadoActivoFijo> tipoestadoactivofijosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoEstadoActivoFijo tipoestadoactivofijoAux:tipoestadoactivofijosSeleccionados) {
				tipoestadoactivofijoAux.setsDetalleGeneralEntityReporte(tipoestadoactivofijoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoEstadoActivoFijoConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					tipoestadoactivofijoAux.setsDescripcionGeneralEntityReporte1(tipoestadoactivofijoAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoEstadoActivoFijoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoestadoactivofijoAux.setsDescripcionGeneralEntityReporte1(tipoestadoactivofijoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoEstadoActivoFijo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoEstadoActivoFijo=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo=true;
				this.isVisibilidadCeldaGuardarCambiosTipoEstadoActivoFijo=true;
			}
			
			this.isVisibilidadCeldaModificarTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaEliminarTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoEstadoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEstadoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEstadoActivoFijo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaModificarTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoEstadoActivoFijo=true;
			this.isVisibilidadCeldaEliminarTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoEstadoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEstadoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEstadoActivoFijo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaModificarTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoEstadoActivoFijo=true;
			this.isVisibilidadCeldaEliminarTipoEstadoActivoFijo=true;
			this.isVisibilidadCeldaCancelarTipoEstadoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEstadoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEstadoActivoFijo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaModificarTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoEstadoActivoFijo=true;
			this.isVisibilidadCeldaEliminarTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoEstadoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEstadoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoEstadoActivoFijo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoEstadoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoEstadoActivoFijo=true;
			this.isVisibilidadCeldaModificarTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaEliminarTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoEstadoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEstadoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEstadoActivoFijo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaActualizarTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaEliminarTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoEstadoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEstadoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoEstadoActivoFijo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaModificarTipoEstadoActivoFijo=true;
			this.isVisibilidadCeldaActualizarTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaEliminarTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaCancelarTipoEstadoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEstadoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoEstadoActivoFijo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoEstadoActivoFijoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoEstadoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoEstadoActivoFijo=true;
		} else {
			this.actualizarEstadoPanelsTipoEstadoActivoFijo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoEstadoActivoFijo=false;
			//this.isVisibilidadCeldaVerFormTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaDuplicarTipoEstadoActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoestadoactivofijoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEstadoActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!tipoestadoactivofijoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo=false;												
			}
			
			this.jButtonCerrarTipoEstadoActivoFijo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoActivoFijo=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoestadoactivofijo)) {
			this.isVisibilidadCeldaActualizarTipoEstadoActivoFijo=false;
			this.isVisibilidadCeldaEliminarTipoEstadoActivoFijo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoEstadoActivoFijo() {
	}
	
	public void actualizarEstadoPanelsTipoEstadoActivoFijo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoEstadoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoEstadoActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEstadoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoEstadoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoEstadoActivoFijo!=null) {
				this.jScrollPanelDatosTipoEstadoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEstadoActivoFijo!=null) {
				this.jPanelPaginacionTipoEstadoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEstadoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoEstadoActivoFijo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoEstadoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoEstadoActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEstadoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoEstadoActivoFijo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoEstadoActivoFijo!=null) {
				this.jScrollPanelDatosTipoEstadoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoEstadoActivoFijo!=null) {
				this.jPanelPaginacionTipoEstadoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoEstadoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoEstadoActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoEstadoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoEstadoActivoFijo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEstadoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoEstadoActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoEstadoActivoFijo!=null) {
				this.jScrollPanelDatosTipoEstadoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoEstadoActivoFijo!=null) {
				this.jPanelPaginacionTipoEstadoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoEstadoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoEstadoActivoFijo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoEstadoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoEstadoActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEstadoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoEstadoActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoEstadoActivoFijo!=null) {
				this.jScrollPanelDatosTipoEstadoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoEstadoActivoFijo!=null) {
				this.jPanelPaginacionTipoEstadoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoEstadoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoEstadoActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoEstadoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoEstadoActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEstadoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoEstadoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoEstadoActivoFijo!=null) {
				this.jScrollPanelDatosTipoEstadoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEstadoActivoFijo!=null) {
				this.jPanelPaginacionTipoEstadoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEstadoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoEstadoActivoFijo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoEstadoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoEstadoActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEstadoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoEstadoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoEstadoActivoFijo!=null) {
				this.jScrollPanelDatosTipoEstadoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEstadoActivoFijo!=null) {
				this.jPanelPaginacionTipoEstadoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEstadoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoEstadoActivoFijo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoEstadoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionTipoEstadoActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEstadoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoEstadoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoEstadoActivoFijo!=null) {
				this.jScrollPanelDatosTipoEstadoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEstadoActivoFijo!=null) {
				this.jPanelPaginacionTipoEstadoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEstadoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoEstadoActivoFijo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoEstadoActivoFijo!=null) {
					this.jTabbedPaneBusquedasTipoEstadoActivoFijo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoEstadoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoEstadoActivoFijo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEstadoActivoFijo!=null) {
				this.jTabbedPaneBusquedasTipoEstadoActivoFijo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoEstadoActivoFijo!=null) {
				this.jPanelParametrosReportesTipoEstadoActivoFijo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasTipoEstadoActivoFijo.remove(jPanelFK_IdPaisTipoEstadoActivoFijo);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoEstadoActivoFijoSessionBean tipoestadoactivofijoSessionBean=new TipoEstadoActivoFijoSessionBean();
		
		if(this.tipoestadoactivofijoSessionBean==null) {
			this.tipoestadoactivofijoSessionBean=new TipoEstadoActivoFijoSessionBean();
		}
		
		this.tipoestadoactivofijoSessionBean.setsUltimaBusquedaTipoEstadoActivoFijo(this.getsAccionBusqueda());
		this.tipoestadoactivofijoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoestadoactivofijoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			tipoestadoactivofijoSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoEstadoActivoFijoSessionBean tipoestadoactivofijoSessionBean=new TipoEstadoActivoFijoSessionBean();
		
		if(this.tipoestadoactivofijoSessionBean==null) {
			this.tipoestadoactivofijoSessionBean=new TipoEstadoActivoFijoSessionBean();
		}
		
		if(this.tipoestadoactivofijoSessionBean.getsUltimaBusquedaTipoEstadoActivoFijo()!=null&&!this.tipoestadoactivofijoSessionBean.getsUltimaBusquedaTipoEstadoActivoFijo().equals("")) {
			this.setsAccionBusqueda(tipoestadoactivofijoSessionBean.getsUltimaBusquedaTipoEstadoActivoFijo());
			this.setiNumeroPaginacion(tipoestadoactivofijoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoestadoactivofijoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(tipoestadoactivofijoSessionBean.getid_pais());
				tipoestadoactivofijoSessionBean.setid_pais(-1L);
			}
		}
		
		this.tipoestadoactivofijoSessionBean.setsUltimaBusquedaTipoEstadoActivoFijo("");
		this.tipoestadoactivofijoSessionBean.setiNumeroPaginacion(TipoEstadoActivoFijoConstantesFunciones.INUMEROPAGINACION);
		this.tipoestadoactivofijoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoEstadoActivoFijo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoEstadoActivoFijo() {
		this.updateBorderResaltarBusquedasFormularioTipoEstadoActivoFijo();
		this.updateVisibilidadBusquedasFormularioTipoEstadoActivoFijo();
		this.updateHabilitarBusquedasFormularioTipoEstadoActivoFijo();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoEstadoActivoFijo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoEstadoActivoFijo.getComponents().length>0) {
	

		if(this.tipoestadoactivofijoConstantesFunciones.resaltarFK_IdPaisTipoEstadoActivoFijo!=null) {
			index= this.jTabbedPaneBusquedasTipoEstadoActivoFijo.indexOfComponent(this.jPanelFK_IdPaisTipoEstadoActivoFijo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoEstadoActivoFijo.getComponent(index);
				jPanel.setBorder(this.tipoestadoactivofijoConstantesFunciones.resaltarFK_IdPaisTipoEstadoActivoFijo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoEstadoActivoFijo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoEstadoActivoFijo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoEstadoActivoFijo.indexOfComponent(this.jPanelFK_IdPaisTipoEstadoActivoFijo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoEstadoActivoFijo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoestadoactivofijoConstantesFunciones.mostrarFK_IdPaisTipoEstadoActivoFijo);
			if(!this.tipoestadoactivofijoConstantesFunciones.mostrarFK_IdPaisTipoEstadoActivoFijo && index>-1) {
				this.jTabbedPaneBusquedasTipoEstadoActivoFijo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoEstadoActivoFijo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoEstadoActivoFijo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoEstadoActivoFijo.indexOfComponent(this.jPanelFK_IdPaisTipoEstadoActivoFijo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoEstadoActivoFijo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoestadoactivofijoConstantesFunciones.activarFK_IdPaisTipoEstadoActivoFijo);
				this.jTabbedPaneBusquedasTipoEstadoActivoFijo.setEnabledAt(index,this.tipoestadoactivofijoConstantesFunciones.activarFK_IdPaisTipoEstadoActivoFijo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoEstadoActivoFijo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasTipoEstadoActivoFijo.indexOfComponent(this.jPanelFK_IdPaisTipoEstadoActivoFijo);

			this.jTabbedPaneBusquedasTipoEstadoActivoFijo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoEstadoActivoFijo.getComponent(index);

			this.tipoestadoactivofijoConstantesFunciones.setResaltarFK_IdPaisTipoEstadoActivoFijo(resaltar);

			jPanel.setBorder(this.tipoestadoactivofijoConstantesFunciones.resaltarFK_IdPaisTipoEstadoActivoFijo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoEstadoActivoFijo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoEstadoActivoFijo() throws Exception {

		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoEstadoActivoFijo();
		this.updateVisibilidadResaltarControlesFormularioTipoEstadoActivoFijo();
		this.updateHabilitarResaltarControlesFormularioTipoEstadoActivoFijo();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoEstadoActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoestadoactivofijoConstantesFunciones.resaltaridTipoEstadoActivoFijo!=null && this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTextFieldidTipoEstadoActivoFijo.setBorder(this.tipoestadoactivofijoConstantesFunciones.resaltaridTipoEstadoActivoFijo);}
		if(this.tipoestadoactivofijoConstantesFunciones.resaltarid_paisTipoEstadoActivoFijo!=null && this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxid_paisTipoEstadoActivoFijo.setBorder(this.tipoestadoactivofijoConstantesFunciones.resaltarid_paisTipoEstadoActivoFijo);}
		if(this.tipoestadoactivofijoConstantesFunciones.resaltarnombreTipoEstadoActivoFijo!=null && this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTextAreanombreTipoEstadoActivoFijo.setBorder(this.tipoestadoactivofijoConstantesFunciones.resaltarnombreTipoEstadoActivoFijo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoEstadoActivoFijo() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {
	
		//this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTextFieldidTipoEstadoActivoFijo.setVisible(this.tipoestadoactivofijoConstantesFunciones.mostraridTipoEstadoActivoFijo);
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jPanelidTipoEstadoActivoFijo.setVisible(this.tipoestadoactivofijoConstantesFunciones.mostraridTipoEstadoActivoFijo);
		//this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxid_paisTipoEstadoActivoFijo.setVisible(this.tipoestadoactivofijoConstantesFunciones.mostrarid_paisTipoEstadoActivoFijo);
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jPanelid_paisTipoEstadoActivoFijo.setVisible(this.tipoestadoactivofijoConstantesFunciones.mostrarid_paisTipoEstadoActivoFijo);
		//this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTextAreanombreTipoEstadoActivoFijo.setVisible(this.tipoestadoactivofijoConstantesFunciones.mostrarnombreTipoEstadoActivoFijo);
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jPanelnombreTipoEstadoActivoFijo.setVisible(this.tipoestadoactivofijoConstantesFunciones.mostrarnombreTipoEstadoActivoFijo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoEstadoActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoEstadoActivoFijo!=null) {
	
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTextFieldidTipoEstadoActivoFijo.setEnabled(this.tipoestadoactivofijoConstantesFunciones.activaridTipoEstadoActivoFijo);
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jComboBoxid_paisTipoEstadoActivoFijo.setEnabled(this.tipoestadoactivofijoConstantesFunciones.activarid_paisTipoEstadoActivoFijo);
		this.jInternalFrameDetalleFormTipoEstadoActivoFijo.jTextAreanombreTipoEstadoActivoFijo.setEnabled(this.tipoestadoactivofijoConstantesFunciones.activarnombreTipoEstadoActivoFijo);
		}
	}
	
		
}