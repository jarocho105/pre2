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

import com.bydan.erp.activosfijos.util.TipoCalculoDepreciacionConstantesFunciones;
import com.bydan.erp.activosfijos.util.TipoCalculoDepreciacionParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.TipoCalculoDepreciacionParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.TipoCalculoDepreciacionBean;
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
public class TipoCalculoDepreciacionBeanSwingJInternalFrame extends TipoCalculoDepreciacionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoCalculoDepreciacionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoCalculoDepreciacion> tipocalculodepreciacionValidator = new ClassValidator<TipoCalculoDepreciacion>(TipoCalculoDepreciacion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoCalculoDepreciacion tipocalculodepreciacion;	
	public TipoCalculoDepreciacion tipocalculodepreciacionAux;
	public TipoCalculoDepreciacion tipocalculodepreciacionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoCalculoDepreciacion tipocalculodepreciacionTotales;
	public Long idTipoCalculoDepreciacionActual;
	public Long iIdNuevoTipoCalculoDepreciacion=0L;
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
	
	public Boolean isPermisoTodoTipoCalculoDepreciacion;
	public Boolean isPermisoNuevoTipoCalculoDepreciacion;
	public Boolean isPermisoActualizarTipoCalculoDepreciacion;
	public Boolean isPermisoActualizarOriginalTipoCalculoDepreciacion;
	public Boolean isPermisoEliminarTipoCalculoDepreciacion;
	public Boolean isPermisoGuardarCambiosTipoCalculoDepreciacion;
	public Boolean isPermisoConsultaTipoCalculoDepreciacion;
	public Boolean isPermisoBusquedaTipoCalculoDepreciacion;
	public Boolean isPermisoReporteTipoCalculoDepreciacion;
	public Boolean isPermisoPaginacionMedioTipoCalculoDepreciacion;
	public Boolean isPermisoPaginacionAltoTipoCalculoDepreciacion;
	public Boolean isPermisoPaginacionTodoTipoCalculoDepreciacion;
	public Boolean isPermisoCopiarTipoCalculoDepreciacion;
	public Boolean isPermisoVerFormTipoCalculoDepreciacion;
	public Boolean isPermisoDuplicarTipoCalculoDepreciacion;
	public Boolean isPermisoOrdenTipoCalculoDepreciacion;
	
	
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
	
	public TipoCalculoDepreciacionParameterReturnGeneral tipocalculodepreciacionReturnGeneral;
	public TipoCalculoDepreciacionParameterReturnGeneral tipocalculodepreciacionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoCalculoDepreciacion=false;
	public Boolean esParaAccionDesdeFormularioTipoCalculoDepreciacion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoCalculoDepreciacionLogic tipocalculodepreciacionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoCalculoDepreciacion tipocalculodepreciacionBean;
	public TipoCalculoDepreciacionConstantesFunciones tipocalculodepreciacionConstantesFunciones;
	//public TipoCalculoDepreciacionParameterReturnGeneral tipocalculodepreciacionReturnGeneral;
	
	//FK
	
	public PaisLogic paisLogic;
	
	//PARAMETROS
	
	
	//public List<TipoCalculoDepreciacion> tipocalculodepreciacions;	
	//public List<TipoCalculoDepreciacion> tipocalculodepreciacionsEliminados;
	//public List<TipoCalculoDepreciacion> tipocalculodepreciacionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoCalculoDepreciacion=false;
	public Boolean isVisibilidadCeldaDuplicarTipoCalculoDepreciacion=true;
	public Boolean isVisibilidadCeldaCopiarTipoCalculoDepreciacion=true;
	public Boolean isVisibilidadCeldaVerFormTipoCalculoDepreciacion=true;
	public Boolean isVisibilidadCeldaOrdenTipoCalculoDepreciacion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion=false;
	public Boolean isVisibilidadCeldaModificarTipoCalculoDepreciacion=false;
	public Boolean isVisibilidadCeldaActualizarTipoCalculoDepreciacion=false;
	public Boolean isVisibilidadCeldaEliminarTipoCalculoDepreciacion=false;
	public Boolean isVisibilidadCeldaCancelarTipoCalculoDepreciacion=false;
	public Boolean isVisibilidadCeldaGuardarTipoCalculoDepreciacion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoCalculoDepreciacion=false;	
	
	
	public Boolean isVisibilidadFK_IdPais=false;
	
	public Long getiIdNuevoTipoCalculoDepreciacion() {
		return this.iIdNuevoTipoCalculoDepreciacion;
	}

	public void setiIdNuevoTipoCalculoDepreciacion(Long iIdNuevoTipoCalculoDepreciacion) {
		this.iIdNuevoTipoCalculoDepreciacion = iIdNuevoTipoCalculoDepreciacion;
	}
	
	public Long getidTipoCalculoDepreciacionActual() {
		return this.idTipoCalculoDepreciacionActual;
	}

	public void setidTipoCalculoDepreciacionActual(Long idTipoCalculoDepreciacionActual) {
		this.idTipoCalculoDepreciacionActual = idTipoCalculoDepreciacionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoCalculoDepreciacion gettipocalculodepreciacion() {
		return this.tipocalculodepreciacion;
	}

	public void settipocalculodepreciacion(TipoCalculoDepreciacion tipocalculodepreciacion) {
		this.tipocalculodepreciacion = tipocalculodepreciacion;
	}
	
	public TipoCalculoDepreciacion gettipocalculodepreciacionAux() {
		return this.tipocalculodepreciacionAux;
	}

	public void settipocalculodepreciacionAux(TipoCalculoDepreciacion tipocalculodepreciacionAux) {
		this.tipocalculodepreciacionAux = tipocalculodepreciacionAux;
	}				
	
	public TipoCalculoDepreciacion gettipocalculodepreciacionAnterior() {
		return this.tipocalculodepreciacionAnterior;
	}

	public void settipocalculodepreciacionAnterior(TipoCalculoDepreciacion tipocalculodepreciacionAnterior) {
		this.tipocalculodepreciacionAnterior = tipocalculodepreciacionAnterior;
	}	
	
	public TipoCalculoDepreciacion gettipocalculodepreciacionTotales() {
		return this.tipocalculodepreciacionTotales;
	}

	public void settipocalculodepreciacionTotales(TipoCalculoDepreciacion tipocalculodepreciacionTotales) {
		this.tipocalculodepreciacionTotales = tipocalculodepreciacionTotales;
	}	
	
	public TipoCalculoDepreciacion gettipocalculodepreciacionBean() {
		return this.tipocalculodepreciacionBean;
	}

	public void settipocalculodepreciacionBean(TipoCalculoDepreciacion tipocalculodepreciacionBean) {
		this.tipocalculodepreciacionBean = tipocalculodepreciacionBean;
	}	
	
	public TipoCalculoDepreciacionParameterReturnGeneral gettipocalculodepreciacionReturnGeneral() {
		return this.tipocalculodepreciacionReturnGeneral;
	}

	public void settipocalculodepreciacionReturnGeneral(TipoCalculoDepreciacionParameterReturnGeneral tipocalculodepreciacionReturnGeneral) {
		this.tipocalculodepreciacionReturnGeneral = tipocalculodepreciacionReturnGeneral;
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
	
	
	public TipoCalculoDepreciacionLogic getTipoCalculoDepreciacionLogic()	{		
		return tipocalculodepreciacionLogic;
	}

	public void setTipoCalculoDepreciacionLogic(TipoCalculoDepreciacionLogic tipocalculodepreciacionLogic) {
		this.tipocalculodepreciacionLogic = tipocalculodepreciacionLogic;
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
	
	public Boolean getIsEsNuevoTipoCalculoDepreciacion() {
		return isEsNuevoTipoCalculoDepreciacion;
	}

	public void setIsEsNuevoTipoCalculoDepreciacion(Boolean isEsNuevoTipoCalculoDepreciacion) {
		this.isEsNuevoTipoCalculoDepreciacion = isEsNuevoTipoCalculoDepreciacion;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoCalculoDepreciacion() {
		return esParaAccionDesdeFormularioTipoCalculoDepreciacion;
	}
	
	public void setEsParaAccionDesdeFormularioTipoCalculoDepreciacion(Boolean esParaAccionDesdeFormularioTipoCalculoDepreciacion) {
		this.esParaAccionDesdeFormularioTipoCalculoDepreciacion = esParaAccionDesdeFormularioTipoCalculoDepreciacion;
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

			if(this.tipocalculodepreciacionSessionBean==null) {
				this.tipocalculodepreciacionSessionBean=new TipoCalculoDepreciacionSessionBean();
			}

			if(!this.tipocalculodepreciacionSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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
					paisLogic.getEntityWithConnection(tipocalculodepreciacionSessionBean.getlidPaisActual());
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

					if(this.tipocalculodepreciacion!=null) {
						this.tipocalculodepreciacion.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {
						this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxid_paisTipoCalculoDepreciacion.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisTipoCalculoDepreciacion.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {
						if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxid_paisTipoCalculoDepreciacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxid_paisTipoCalculoDepreciacion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisTipoCalculoDepreciacion!=null) {
						jComboBoxid_paisFK_IdPaisTipoCalculoDepreciacion.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisTipoCalculoDepreciacion!=null) {
							//jComboBoxid_paisFK_IdPaisTipoCalculoDepreciacion.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisTipoCalculoDepreciacion.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisTipoCalculoDepreciacion.setSelectedIndex(0);
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
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisTipoCalculoDepreciacionGenerico)throws Exception
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
				jComboBoxid_paisTipoCalculoDepreciacionGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisTipoCalculoDepreciacionGenerico!=null && jComboBoxid_paisTipoCalculoDepreciacionGenerico.getItemCount()>0) {
					jComboBoxid_paisTipoCalculoDepreciacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(TipoCalculoDepreciacion tipocalculodepreciacion,JComboBox jComboBoxid_paisTipoCalculoDepreciacionGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisTipoCalculoDepreciacionGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxid_paisTipoCalculoDepreciacion.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisTipoCalculoDepreciacionGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				tipocalculodepreciacion.setid_pais(paisAux.getId());
				tipocalculodepreciacion.setpais_descripcion(TipoCalculoDepreciacionConstantesFunciones.getPaisDescripcion(paisAux));
				tipocalculodepreciacion.setPais(paisAux);			}
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

					if(!TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) { 
							this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxid_paisTipoCalculoDepreciacion.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxid_paisTipoCalculoDepreciacion.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) { 
					}

					if(!TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoCalculoDepreciacion.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisTipoCalculoDepreciacion.addItem(pais);
							}
						}

						if(!TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {
							this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxid_paisTipoCalculoDepreciacion.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {
							this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxid_paisTipoCalculoDepreciacion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisTipoCalculoDepreciacion.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoCalculoDepreciacion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoCalculoDepreciacion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoCalculoDepreciacionConstantesFunciones.refrescarForeignKeysDescripcionesTipoCalculoDepreciacion(this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoCalculoDepreciacionConstantesFunciones.refrescarForeignKeysDescripcionesTipoCalculoDepreciacion(this.tipocalculodepreciacions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Pais.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocalculodepreciacionLogic.setTipoCalculoDepreciacions(this.tipocalculodepreciacions);
			tipocalculodepreciacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoCalculoDepreciacionParameterReturnGeneral getTipoCalculoDepreciacionParameterGeneral() {
		return this.tipocalculodepreciacionParameterGeneral;
	}
	
	public void setTipoCalculoDepreciacionParameterGeneral(TipoCalculoDepreciacionParameterReturnGeneral tipocalculodepreciacionParameterGeneral) {
		this.tipocalculodepreciacionParameterGeneral = tipocalculodepreciacionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoCalculoDepreciacion() {
		return isPermisoTodoTipoCalculoDepreciacion;
	}

	public void setIsPermisoTodoTipoCalculoDepreciacion(Boolean isPermisoTodoTipoCalculoDepreciacion) {
		this.isPermisoTodoTipoCalculoDepreciacion = isPermisoTodoTipoCalculoDepreciacion;
	}

	public Boolean getIsPermisoNuevoTipoCalculoDepreciacion() {
		return isPermisoNuevoTipoCalculoDepreciacion;
	}

	public void setIsPermisoNuevoTipoCalculoDepreciacion(Boolean isPermisoNuevoTipoCalculoDepreciacion) {
		this.isPermisoNuevoTipoCalculoDepreciacion = isPermisoNuevoTipoCalculoDepreciacion;
	}

	public Boolean getIsPermisoActualizarTipoCalculoDepreciacion() {
		return isPermisoActualizarTipoCalculoDepreciacion;
	}

	public void setIsPermisoActualizarTipoCalculoDepreciacion(Boolean isPermisoActualizarTipoCalculoDepreciacion) {
		this.isPermisoActualizarTipoCalculoDepreciacion = isPermisoActualizarTipoCalculoDepreciacion;
	}

	public Boolean getIsPermisoEliminarTipoCalculoDepreciacion() {
		return isPermisoEliminarTipoCalculoDepreciacion;
	}

	public void setIsPermisoEliminarTipoCalculoDepreciacion(Boolean isPermisoEliminarTipoCalculoDepreciacion) {
		this.isPermisoEliminarTipoCalculoDepreciacion = isPermisoEliminarTipoCalculoDepreciacion;
	}

	public Boolean getIsPermisoGuardarCambiosTipoCalculoDepreciacion() {
		return isPermisoGuardarCambiosTipoCalculoDepreciacion;
	}

	public void setIsPermisoGuardarCambiosTipoCalculoDepreciacion(Boolean isPermisoGuardarCambiosTipoCalculoDepreciacion) {
		this.isPermisoGuardarCambiosTipoCalculoDepreciacion = isPermisoGuardarCambiosTipoCalculoDepreciacion;
	}
	
	public Boolean getIsPermisoConsultaTipoCalculoDepreciacion() {
		return isPermisoConsultaTipoCalculoDepreciacion;
	}

	public void setIsPermisoConsultaTipoCalculoDepreciacion(Boolean isPermisoConsultaTipoCalculoDepreciacion) {
		this.isPermisoConsultaTipoCalculoDepreciacion = isPermisoConsultaTipoCalculoDepreciacion;
	}

	public Boolean getIsPermisoBusquedaTipoCalculoDepreciacion() {
		return isPermisoBusquedaTipoCalculoDepreciacion;
	}

	public void setIsPermisoBusquedaTipoCalculoDepreciacion(Boolean isPermisoBusquedaTipoCalculoDepreciacion) {
		this.isPermisoBusquedaTipoCalculoDepreciacion = isPermisoBusquedaTipoCalculoDepreciacion;
	}

	public Boolean getIsPermisoReporteTipoCalculoDepreciacion() {
		return isPermisoReporteTipoCalculoDepreciacion;
	}

	public void setIsPermisoReporteTipoCalculoDepreciacion(Boolean isPermisoReporteTipoCalculoDepreciacion) {
		this.isPermisoReporteTipoCalculoDepreciacion = isPermisoReporteTipoCalculoDepreciacion;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoCalculoDepreciacion() {
		return isPermisoPaginacionMedioTipoCalculoDepreciacion;
	}

	public void setIsPermisoPaginacionMedioTipoCalculoDepreciacion(Boolean isPermisoPaginacionMedioTipoCalculoDepreciacion) {
		this.isPermisoPaginacionMedioTipoCalculoDepreciacion = isPermisoPaginacionMedioTipoCalculoDepreciacion;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoCalculoDepreciacion() {
		return isPermisoPaginacionTodoTipoCalculoDepreciacion;
	}

	public void setIsPermisoPaginacionTodoTipoCalculoDepreciacion(Boolean isPermisoPaginacionTodoTipoCalculoDepreciacion) {
		this.isPermisoPaginacionTodoTipoCalculoDepreciacion = isPermisoPaginacionTodoTipoCalculoDepreciacion;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoCalculoDepreciacion() {
		return isPermisoPaginacionAltoTipoCalculoDepreciacion;
	}

	public void setIsPermisoPaginacionAltoTipoCalculoDepreciacion(Boolean isPermisoPaginacionAltoTipoCalculoDepreciacion) {
		this.isPermisoPaginacionAltoTipoCalculoDepreciacion = isPermisoPaginacionAltoTipoCalculoDepreciacion;
	}
	
	public Boolean getIsPermisoCopiarTipoCalculoDepreciacion() {
		return isPermisoCopiarTipoCalculoDepreciacion;
	}

	public void setIsPermisoCopiarTipoCalculoDepreciacion(Boolean isPermisoCopiarTipoCalculoDepreciacion) {
		this.isPermisoCopiarTipoCalculoDepreciacion = isPermisoCopiarTipoCalculoDepreciacion;
	}
	
	public Boolean getIsPermisoVerFormTipoCalculoDepreciacion() {
		return isPermisoVerFormTipoCalculoDepreciacion;
	}

	public void setIsPermisoVerFormTipoCalculoDepreciacion(Boolean isPermisoVerFormTipoCalculoDepreciacion) {
		this.isPermisoVerFormTipoCalculoDepreciacion = isPermisoVerFormTipoCalculoDepreciacion;
	}
	
	public Boolean getIsPermisoDuplicarTipoCalculoDepreciacion() {
		return isPermisoDuplicarTipoCalculoDepreciacion;
	}

	public void setIsPermisoDuplicarTipoCalculoDepreciacion(Boolean isPermisoDuplicarTipoCalculoDepreciacion) {
		this.isPermisoDuplicarTipoCalculoDepreciacion = isPermisoDuplicarTipoCalculoDepreciacion;
	}
	
	public Boolean getIsPermisoOrdenTipoCalculoDepreciacion() {
		return isPermisoOrdenTipoCalculoDepreciacion;
	}

	public void setIsPermisoOrdenTipoCalculoDepreciacion(Boolean isPermisoOrdenTipoCalculoDepreciacion) {
		this.isPermisoOrdenTipoCalculoDepreciacion = isPermisoOrdenTipoCalculoDepreciacion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoCalculoDepreciacion() {
		return isVisibilidadCeldaNuevoTipoCalculoDepreciacion;
	}

	public void setIsVisibilidadCeldaNuevoTipoCalculoDepreciacion(Boolean isVisibilidadCeldaNuevoTipoCalculoDepreciacion) {
		this.isVisibilidadCeldaNuevoTipoCalculoDepreciacion = isVisibilidadCeldaNuevoTipoCalculoDepreciacion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoCalculoDepreciacion() {
		return isVisibilidadCeldaDuplicarTipoCalculoDepreciacion;
	}

	public void setIsVisibilidadCeldaDuplicarTipoCalculoDepreciacion(Boolean isVisibilidadCeldaDuplicarTipoCalculoDepreciacion) {
		this.isVisibilidadCeldaDuplicarTipoCalculoDepreciacion = isVisibilidadCeldaDuplicarTipoCalculoDepreciacion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoCalculoDepreciacion() {
		return isVisibilidadCeldaCopiarTipoCalculoDepreciacion;
	}

	public void setIsVisibilidadCeldaCopiarTipoCalculoDepreciacion(Boolean isVisibilidadCeldaCopiarTipoCalculoDepreciacion) {
		this.isVisibilidadCeldaCopiarTipoCalculoDepreciacion = isVisibilidadCeldaCopiarTipoCalculoDepreciacion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoCalculoDepreciacion() {
		return isVisibilidadCeldaVerFormTipoCalculoDepreciacion;
	}

	public void setIsVisibilidadCeldaVerFormTipoCalculoDepreciacion(Boolean isVisibilidadCeldaVerFormTipoCalculoDepreciacion) {
		this.isVisibilidadCeldaVerFormTipoCalculoDepreciacion = isVisibilidadCeldaVerFormTipoCalculoDepreciacion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoCalculoDepreciacion() {
		return isVisibilidadCeldaOrdenTipoCalculoDepreciacion;
	}

	public void setIsVisibilidadCeldaOrdenTipoCalculoDepreciacion(Boolean isVisibilidadCeldaOrdenTipoCalculoDepreciacion) {
		this.isVisibilidadCeldaOrdenTipoCalculoDepreciacion = isVisibilidadCeldaOrdenTipoCalculoDepreciacion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion() {
		return isVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion(Boolean isVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion) {
		this.isVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion = isVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoCalculoDepreciacion() {
		return isVisibilidadCeldaModificarTipoCalculoDepreciacion;
	}

	public void setIsVisibilidadCeldaModificarTipoCalculoDepreciacion(Boolean isVisibilidadCeldaModificarTipoCalculoDepreciacion) {
		this.isVisibilidadCeldaModificarTipoCalculoDepreciacion = isVisibilidadCeldaModificarTipoCalculoDepreciacion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoCalculoDepreciacion() {
		return isVisibilidadCeldaActualizarTipoCalculoDepreciacion;
	}

	public void setIsVisibilidadCeldaActualizarTipoCalculoDepreciacion(Boolean isVisibilidadCeldaActualizarTipoCalculoDepreciacion) {
		this.isVisibilidadCeldaActualizarTipoCalculoDepreciacion = isVisibilidadCeldaActualizarTipoCalculoDepreciacion;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoCalculoDepreciacion() {
		return isVisibilidadCeldaEliminarTipoCalculoDepreciacion;
	}

	public void setIsVisibilidadCeldaEliminarTipoCalculoDepreciacion(Boolean isVisibilidadCeldaEliminarTipoCalculoDepreciacion) {
		this.isVisibilidadCeldaEliminarTipoCalculoDepreciacion = isVisibilidadCeldaEliminarTipoCalculoDepreciacion;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoCalculoDepreciacion() {
		return isVisibilidadCeldaCancelarTipoCalculoDepreciacion;
	}

	public void setIsVisibilidadCeldaCancelarTipoCalculoDepreciacion(Boolean isVisibilidadCeldaCancelarTipoCalculoDepreciacion) {
		this.isVisibilidadCeldaCancelarTipoCalculoDepreciacion = isVisibilidadCeldaCancelarTipoCalculoDepreciacion;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoCalculoDepreciacion() {
		return isVisibilidadCeldaGuardarTipoCalculoDepreciacion;
	}

	public void setIsVisibilidadCeldaGuardarTipoCalculoDepreciacion(Boolean isVisibilidadCeldaGuardarTipoCalculoDepreciacion) {
		this.isVisibilidadCeldaGuardarTipoCalculoDepreciacion = isVisibilidadCeldaGuardarTipoCalculoDepreciacion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoCalculoDepreciacion() {
		return isVisibilidadCeldaGuardarCambiosTipoCalculoDepreciacion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoCalculoDepreciacion(Boolean isVisibilidadCeldaGuardarCambiosTipoCalculoDepreciacion) {
		this.isVisibilidadCeldaGuardarCambiosTipoCalculoDepreciacion = isVisibilidadCeldaGuardarCambiosTipoCalculoDepreciacion;
	}
		
	public TipoCalculoDepreciacionSessionBean gettipocalculodepreciacionSessionBean() {
		return this.tipocalculodepreciacionSessionBean;
	}
	
	public void settipocalculodepreciacionSessionBean(TipoCalculoDepreciacionSessionBean tipocalculodepreciacionSessionBean) {
		this.tipocalculodepreciacionSessionBean=tipocalculodepreciacionSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoCalculoDepreciacion(TipoCalculoDepreciacion tipocalculodepreciacion)throws Exception {
		try {
			
				this.setActualParaGuardarPaisForeignKey(tipocalculodepreciacion,null);
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
	
	public void bugActualizarReferenciaActual(TipoCalculoDepreciacion tipocalculodepreciacion,TipoCalculoDepreciacion tipocalculodepreciacionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoCalculoDepreciacion(tipocalculodepreciacion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocalculodepreciacionAux.setId(tipocalculodepreciacion.getId());
		tipocalculodepreciacionAux.setVersionRow(tipocalculodepreciacion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoCalculoDepreciacion();
		
			int intSelectedRow = this.jTableDatosTipoCalculoDepreciacion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoCalculoDepreciacion(this.tipocalculodepreciacion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculoDepreciacion(this.tipocalculodepreciacion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocalculodepreciacionValidator.getInvalidValues(this.tipocalculodepreciacion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocalculodepreciacionLogic.setDatosCliente(datosCliente);
			tipocalculodepreciacionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocalculodepreciacionAux=new  TipoCalculoDepreciacion();
				
				tipocalculodepreciacionAux.setIsNew(true);
				tipocalculodepreciacionAux.setIsChanged(true);
				
				tipocalculodepreciacionAux.setTipoCalculoDepreciacionOriginal(this.tipocalculodepreciacion);
				
				tipocalculodepreciacionAux.setId(this.tipocalculodepreciacion.getId());	
				tipocalculodepreciacionAux.setVersionRow(this.tipocalculodepreciacion.getVersionRow());	
				tipocalculodepreciacionAux.setid_pais(this.tipocalculodepreciacion.getid_pais());	
				tipocalculodepreciacionAux.setnombre(this.tipocalculodepreciacion.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocalculodepreciacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocalculodepreciacionAux,tipocalculodepreciacionLogic.getTipoCalculoDepreciacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocalculodepreciacionAux,tipocalculodepreciacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocalculodepreciacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocalculodepreciacionLogic.saveTipoCalculoDepreciacions();//WithConnection
						//tipocalculodepreciacionLogic.getSetVersionRowTipoCalculoDepreciacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocalculodepreciacion,tipocalculodepreciacionAux);
					
					this.refrescarForeignKeysDescripcionesTipoCalculoDepreciacion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocalculodepreciacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocalculodepreciacionAux=new  TipoCalculoDepreciacion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado() && this.tipocalculodepreciacion.getId()>=0)) {
						
					tipocalculodepreciacionAux.setIsNew(false);
				}
				
				tipocalculodepreciacionAux.setIsDeleted(false);
			
				tipocalculodepreciacionAux.setId(this.tipocalculodepreciacion.getId());	
				tipocalculodepreciacionAux.setVersionRow(this.tipocalculodepreciacion.getVersionRow());	
				tipocalculodepreciacionAux.setid_pais(this.tipocalculodepreciacion.getid_pais());	
				tipocalculodepreciacionAux.setnombre(this.tipocalculodepreciacion.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocalculodepreciacionAux,tipocalculodepreciacionLogic.getTipoCalculoDepreciacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocalculodepreciacionAux,tipocalculodepreciacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocalculodepreciacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocalculodepreciacionLogic.saveTipoCalculoDepreciacions();//WithConnection
						//tipocalculodepreciacionLogic.getSetVersionRowTipoCalculoDepreciacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocalculodepreciacion,tipocalculodepreciacionAux);
					
					this.refrescarForeignKeysDescripcionesTipoCalculoDepreciacion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocalculodepreciacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocalculodepreciacionAux=new  TipoCalculoDepreciacion();
				
				tipocalculodepreciacionAux.setIsNew(false);
				tipocalculodepreciacionAux.setIsChanged(false);
				
				tipocalculodepreciacionAux.setIsDeleted(true);
				
				tipocalculodepreciacionAux.setId(this.tipocalculodepreciacion.getId());	
				tipocalculodepreciacionAux.setVersionRow(this.tipocalculodepreciacion.getVersionRow());	
				tipocalculodepreciacionAux.setid_pais(this.tipocalculodepreciacion.getid_pais());	
				tipocalculodepreciacionAux.setnombre(this.tipocalculodepreciacion.getnombre());	
				
				if(this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocalculodepreciacionAux.getId()>=0) {	
						this.tipocalculodepreciacionsEliminados.add(tipocalculodepreciacionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocalculodepreciacionAux,tipocalculodepreciacionLogic.getTipoCalculoDepreciacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocalculodepreciacionAux,tipocalculodepreciacions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocalculodepreciacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocalculodepreciacionLogic.saveTipoCalculoDepreciacions();//WithConnection
						//tipocalculodepreciacionLogic.getSetVersionRowTipoCalculoDepreciacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocalculodepreciacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipocalculodepreciacionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipocalculodepreciacionAux,tipocalculodepreciacionLogic.getTipoCalculoDepreciacions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipocalculodepreciacionAux,tipocalculodepreciacions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().addAll(this.tipocalculodepreciacionsEliminados);
					
					tipocalculodepreciacionLogic.saveTipoCalculoDepreciacions();//WithConnection
					//tipocalculodepreciacionLogic.getSetVersionRowTipoCalculoDepreciacions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoCalculoDepreciacion();
				
				this.tipocalculodepreciacionsEliminados= new ArrayList<TipoCalculoDepreciacion>();		
			}
			
			if(this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Calculo Depreciacion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Calculo Depreciacion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocalculodepreciacion=tipocalculodepreciacionAux;
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
      		//this.finishProcessTipoCalculoDepreciacion();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoCalculoDepreciacion tipocalculodepreciacionLocal) throws Exception {
		
		if(this.tipocalculodepreciacionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoCalculoDepreciacion tipocalculodepreciacionLocal) throws Exception {	
		if(this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				tipocalculodepreciacionLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoCalculoDepreciacionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoCalculoDepreciacion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocalculodepreciacionValidator.getInvalidValues(this.tipocalculodepreciacion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoCalculoDepreciacion tipocalculodepreciacion,List<TipoCalculoDepreciacion> tipocalculodepreciacions) throws Exception {
		try	{		
			TipoCalculoDepreciacionConstantesFunciones.actualizarLista(tipocalculodepreciacion,tipocalculodepreciacions,this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoCalculoDepreciacion tipocalculodepreciacion,List<TipoCalculoDepreciacion> tipocalculodepreciacions) throws Exception {
		try	{			
			TipoCalculoDepreciacionConstantesFunciones.actualizarSelectedLista(tipocalculodepreciacion,tipocalculodepreciacions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoCalculoDepreciacion> tipocalculodepreciacionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocalculodepreciacionsLocal=this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocalculodepreciacionsLocal=this.tipocalculodepreciacions;
			}
			//ARCHITECTURE
		
			for(TipoCalculoDepreciacion tipocalculodepreciacionLocal:tipocalculodepreciacionsLocal) {
				if(this.permiteMantenimiento(tipocalculodepreciacionLocal) && tipocalculodepreciacionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoCalculoDepreciacionConstantesFunciones.getTipoCalculoDepreciacionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoCalculoDepreciacionConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jLabelid_paisTipoCalculoDepreciacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCalculoDepreciacionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jLabelnombreTipoCalculoDepreciacion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jLabelid_paisTipoCalculoDepreciacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jLabelnombreTipoCalculoDepreciacion,"");
		
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
		this.iIdNuevoTipoCalculoDepreciacion--;	
		
		
		this.tipocalculodepreciacionAux=new TipoCalculoDepreciacion();
		
		this.tipocalculodepreciacionAux.setId(this.iIdNuevoTipoCalculoDepreciacion);
		this.tipocalculodepreciacionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().add(this.tipocalculodepreciacionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocalculodepreciacions.add(this.tipocalculodepreciacionAux);
		}
		//ARCHITECTURE
		
		this.tipocalculodepreciacion=this.tipocalculodepreciacionAux;
		
		if(TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoCalculoDepreciacion(this.tipocalculodepreciacion);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCalculoDepreciacion(this.tipocalculodepreciacion);
		}
				
		//this.setDefaultControlesTipoCalculoDepreciacion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoCalculoDepreciacion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoCalculoDepreciacion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCalculoDepreciacion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCalculoDepreciacion(this.tipocalculodepreciacionBean,this.tipocalculodepreciacion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculoDepreciacion(this.tipocalculodepreciacion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocalculodepreciacionSessionBean.getConGuardarRelaciones()) {
			classes=TipoCalculoDepreciacionConstantesFunciones.getClassesRelationshipsOfTipoCalculoDepreciacion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocalculodepreciacionReturnGeneral=tipocalculodepreciacionLogic.procesarEventosTipoCalculoDepreciacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions(),this.tipocalculodepreciacion,this.tipocalculodepreciacionParameterGeneral,this.isEsNuevoTipoCalculoDepreciacion,classes);//this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoCalculoDepreciacion(this.tipocalculodepreciacionReturnGeneral,this.tipocalculodepreciacionBean,false);
		
		if(this.tipocalculodepreciacionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCalculoDepreciacion(this.tipocalculodepreciacionReturnGeneral.getTipoCalculoDepreciacion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoCalculoDepreciacion(this.tipocalculodepreciacionReturnGeneral.getTipoCalculoDepreciacion());
		}
		
		if(this.tipocalculodepreciacionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoCalculoDepreciacion(this.tipocalculodepreciacionReturnGeneral.getTipoCalculoDepreciacion(),classes);//this.tipocalculodepreciacionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoCalculoDepreciacion(this.tipocalculodepreciacion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoCalculoDepreciacion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoCalculoDepreciacion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoCalculoDepreciacion(false);
						
			if(tipocalculodepreciacionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCalculoDepreciacion();
			}
			
			this.actualizarVisualTableDatosTipoCalculoDepreciacion();
			
			this.jTableDatosTipoCalculoDepreciacion.setRowSelectionInterval(this.getIndiceNuevoTipoCalculoDepreciacion(), this.getIndiceNuevoTipoCalculoDepreciacion());
			
			this.seleccionarFilaTablaTipoCalculoDepreciacionActual();
						
			this.actualizarEstadoCeldasBotonesTipoCalculoDepreciacion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoCalculoDepreciacion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTextAreanombreTipoCalculoDepreciacion.setEnabled(isHabilitar && this.tipocalculodepreciacionConstantesFunciones.activarnombreTipoCalculoDepreciacion);	
		
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxid_paisTipoCalculoDepreciacion.setEnabled(isHabilitar && this.tipocalculodepreciacionConstantesFunciones.activarid_paisTipoCalculoDepreciacion);
	};
	
	public void setDefaultControlesTipoCalculoDepreciacion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoCalculoDepreciacion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocalculodepreciacionSessionBean.setConGuardarRelaciones(true);			
			this.tipocalculodepreciacionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTabbedPaneRelacionesTipoCalculoDepreciacion.setVisible(true);
			
					
		} else {
			//this.tipocalculodepreciacionSessionBean.setConGuardarRelaciones(false);			
			this.tipocalculodepreciacionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTabbedPaneRelacionesTipoCalculoDepreciacion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoCalculoDepreciacion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCalculoDepreciacion tipocalculodepreciacionAux:this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions()) {
				if(tipocalculodepreciacionAux.getId().equals(this.iIdNuevoTipoCalculoDepreciacion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCalculoDepreciacion tipocalculodepreciacionAux:this.tipocalculodepreciacions) {
				if(tipocalculodepreciacionAux.getId().equals(this.iIdNuevoTipoCalculoDepreciacion)) {
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
	
	public int getIndiceActualTipoCalculoDepreciacion(TipoCalculoDepreciacion tipocalculodepreciacion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCalculoDepreciacion tipocalculodepreciacionAux:this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions()) {
				if(tipocalculodepreciacionAux.getId().equals(tipocalculodepreciacion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCalculoDepreciacion tipocalculodepreciacionAux:this.tipocalculodepreciacions) {
				if(tipocalculodepreciacionAux.getId().equals(tipocalculodepreciacion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoCalculoDepreciacion(TipoCalculoDepreciacion tipocalculodepreciacionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCalculoDepreciacion tipocalculodepreciacionAux:this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions()) {
				if(tipocalculodepreciacionAux.getTipoCalculoDepreciacionOriginal().getId().equals(tipocalculodepreciacionOriginal.getId())) {
					existe=true;
					tipocalculodepreciacionOriginal.setId(tipocalculodepreciacionAux.getId());
					tipocalculodepreciacionOriginal.setVersionRow(tipocalculodepreciacionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCalculoDepreciacion tipocalculodepreciacionAux:this.tipocalculodepreciacions) {
				if(tipocalculodepreciacionAux.getTipoCalculoDepreciacionOriginal().getId().equals(tipocalculodepreciacionOriginal.getId())) {
					existe=true;
					tipocalculodepreciacionOriginal.setId(tipocalculodepreciacionAux.getId());
					tipocalculodepreciacionOriginal.setVersionRow(tipocalculodepreciacionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoCalculoDepreciacion(Boolean esParaCancelar) throws Exception {
		tipocalculodepreciacionsAux=new ArrayList<TipoCalculoDepreciacion>();
		tipocalculodepreciacionAux=new TipoCalculoDepreciacion();
		
		if(!this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCalculoDepreciacion tipocalculodepreciacionAux:this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions()) {
					if(tipocalculodepreciacionAux.getId()<0) {
						tipocalculodepreciacionsAux.add(tipocalculodepreciacionAux);
					}		
				}
				this.iIdNuevoTipoCalculoDepreciacion=0L;
				this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().removeAll(tipocalculodepreciacionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCalculoDepreciacion tipocalculodepreciacionAux:this.tipocalculodepreciacions) {
					if(tipocalculodepreciacionAux.getId()<0) {
						tipocalculodepreciacionsAux.add(tipocalculodepreciacionAux);
					}		
				}
				this.iIdNuevoTipoCalculoDepreciacion=0L;
				this.tipocalculodepreciacions.removeAll(tipocalculodepreciacionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoCalculoDepreciacion 
					&& this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().size()>0
					) {
					tipocalculodepreciacionAux=this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().get(this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().size() - 1);
				
					if(tipocalculodepreciacionAux.getId()<0) {
						this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().remove(tipocalculodepreciacionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoCalculoDepreciacion && this.tipocalculodepreciacions.size()>0) {
					tipocalculodepreciacionAux=this.tipocalculodepreciacions.get(this.tipocalculodepreciacions.size() - 1);
				
					if(tipocalculodepreciacionAux.getId()<0) {
						this.tipocalculodepreciacions.remove(tipocalculodepreciacionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoCalculoDepreciacion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocalculodepreciacion.getId()<0) {
				this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().remove(this.tipocalculodepreciacion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocalculodepreciacion.getId()<0) {
				this.tipocalculodepreciacions.remove(this.tipocalculodepreciacion);
			}
		}			
	}
	
	public void setEstadosInicialesTipoCalculoDepreciacion(List<TipoCalculoDepreciacion> tipocalculodepreciacionsAux) throws Exception {
		TipoCalculoDepreciacionConstantesFunciones.setEstadosInicialesTipoCalculoDepreciacion(tipocalculodepreciacionsAux);
	}
	
	public void setEstadosInicialesTipoCalculoDepreciacion(TipoCalculoDepreciacion tipocalculodepreciacionAux) throws Exception {
		TipoCalculoDepreciacionConstantesFunciones.setEstadosInicialesTipoCalculoDepreciacion(tipocalculodepreciacionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoCalculoDepreciacionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoCalculoDepreciacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoCalculoDepreciacionActual()) {
				if(!this.isEsNuevoTipoCalculoDepreciacion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoCalculoDepreciacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoCalculoDepreciacion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoCalculoDepreciacionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Calculo Depreciacion ?", "MANTENIMIENTO DE Tipo Calculo Depreciacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoCalculoDepreciacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoCalculoDepreciacion tipocalculodepreciacion) throws Exception {
		TipoCalculoDepreciacionConstantesFunciones.seleccionarAsignar(this.tipocalculodepreciacion,tipocalculodepreciacion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoCalculoDepreciacion=this.isPermisoActualizarOriginalTipoCalculoDepreciacion;
			
			
			this.seleccionarAsignar(tipocalculodepreciacion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCalculoDepreciacionConstantesFunciones.quitarEspaciosTipoCalculoDepreciacion(this.tipocalculodepreciacion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoCalculoDepreciacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocalculodepreciacionSessionBean.setsFuncionBusquedaRapida(this.tipocalculodepreciacionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoCalculoDepreciacion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoCalculoDepreciacion(esParaCancelar);				
				this.cancelarNuevoTipoCalculoDepreciacion(esParaCancelar);								
			}
			
			this.tipocalculodepreciacion=new TipoCalculoDepreciacion();
			
			this.inicializarTipoCalculoDepreciacion();
			
			this.actualizarEstadoCeldasBotonesTipoCalculoDepreciacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoCalculoDepreciacion() throws Exception {
		try {
			TipoCalculoDepreciacionConstantesFunciones.inicializarTipoCalculoDepreciacion(this.tipocalculodepreciacion);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoCalculoDepreciacions(String sAccionBusqueda,List<TipoCalculoDepreciacion> tipocalculodepreciacionsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoCalculoDepreciacion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoCalculoDepreciacionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoCalculoDepreciacionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoCalculoDepreciacion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Calculo Depreciacions");		
		parameters.put("busquedapor", TipoCalculoDepreciacionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoCalculoDepreciacion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoCalculoDepreciacionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoCalculoDepreciacionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoCalculoDepreciacion=new JRBeanArrayDataSource(TipoCalculoDepreciacionJInternalFrame.TraerTipoCalculoDepreciacionBeans(tipocalculodepreciacionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoCalculoDepreciacion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoCalculoDepreciacionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoCalculoDepreciacionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoCalculoDepreciacionBean.TraerTipoCalculoDepreciacionBeans(tipocalculodepreciacionsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoCalculoDepreciacions(sAccionBusqueda,sTipoArchivoReporte,tipocalculodepreciacionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoCalculoDepreciacions(sAccionBusqueda,sTipoArchivoReporte,tipocalculodepreciacionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoCalculoDepreciacionActionPerformed(null);
					//this.generarExcelReporteTipoCalculoDepreciacions(sAccionBusqueda,sTipoArchivoReporte,tipocalculodepreciacionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoCalculoDepreciacions(sAccionBusqueda,sTipoArchivoReporte,tipocalculodepreciacionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoCalculoDepreciacions(sAccionBusqueda,sTipoArchivoReporte,tipocalculodepreciacionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoCalculoDepreciacions(sAccionBusqueda,sTipoArchivoReporte,tipocalculodepreciacionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoCalculoDepreciacions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCalculoDepreciacion> tipocalculodepreciacionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocalculodepreciacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCalculoDepreciacions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCalculoDepreciacion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoCalculoDepreciacion tipocalculodepreciacion : tipocalculodepreciacionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoCalculoDepreciacionConstantesFunciones.generarExcelReporteDataTipoCalculoDepreciacion("NORMAL",row,workbook,tipocalculodepreciacion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Calculo Depreciacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoCalculoDepreciacion(String sTipo,Row row,Workbook workbook) {
		
		TipoCalculoDepreciacionConstantesFunciones.generarExcelReporteHeaderTipoCalculoDepreciacion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoCalculoDepreciacions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCalculoDepreciacion> tipocalculodepreciacionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocalculodepreciacion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCalculoDepreciacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoCalculoDepreciacion tipocalculodepreciacion : tipocalculodepreciacionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoCalculoDepreciacionConstantesFunciones.getTipoCalculoDepreciacionDescripcion(tipocalculodepreciacion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCalculoDepreciacionConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCalculoDepreciacionConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocalculodepreciacion.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCalculoDepreciacionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCalculoDepreciacionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocalculodepreciacion.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Calculo Depreciacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoCalculoDepreciacions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCalculoDepreciacion> tipocalculodepreciacionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoCalculoDepreciacion> tipocalculodepreciacionsRespaldo=null;
		
		classes=TipoCalculoDepreciacionConstantesFunciones.getClassesRelationshipsOfTipoCalculoDepreciacion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocalculodepreciacionLogic.setDatosCliente(this.datosCliente);
		this.tipocalculodepreciacionLogic.setDatosDeep(this.datosDeep);
		this.tipocalculodepreciacionLogic.setIsConDeep(true);
		
		tipocalculodepreciacionsRespaldo=this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions();
		
		this.tipocalculodepreciacionLogic.setTipoCalculoDepreciacions(tipocalculodepreciacionsParaReportes);	
		this.tipocalculodepreciacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocalculodepreciacionsParaReportes=this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions();
		this.tipocalculodepreciacionLogic.setTipoCalculoDepreciacions(tipocalculodepreciacionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocalculodepreciacion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCalculoDepreciacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCalculoDepreciacion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoCalculoDepreciacion tipocalculodepreciacion : tipocalculodepreciacionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoCalculoDepreciacion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoCalculoDepreciacionConstantesFunciones.generarExcelReporteDataTipoCalculoDepreciacion("NORMAL",row,workbook,tipocalculodepreciacion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoCalculoDepreciacionConstantesFunciones.getTipoCalculoDepreciacionDescripcion(tipocalculodepreciacion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Calculo Depreciacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoCalculoDepreciacion() throws Exception {		
		this.startProcessTipoCalculoDepreciacion(true);
	}
	
	public void startProcessTipoCalculoDepreciacion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoCalculoDepreciacion ,this.jPanelParametrosReportesTipoCalculoDepreciacion, this.jScrollPanelDatosTipoCalculoDepreciacion,this.jPanelPaginacionTipoCalculoDepreciacion, this.jScrollPanelDatosEdicionTipoCalculoDepreciacion, this.jPanelAccionesTipoCalculoDepreciacion,this.jPanelAccionesFormularioTipoCalculoDepreciacion,this.jmenuBarTipoCalculoDepreciacion,this.jmenuBarDetalleTipoCalculoDepreciacion,this.jTtoolBarTipoCalculoDepreciacion,this.jTtoolBarDetalleTipoCalculoDepreciacion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCalculoDepreciacion=this.jTabbedPaneBusquedasTipoCalculoDepreciacion; 
		
		final JPanel jPanelParametrosReportesTipoCalculoDepreciacion=this.jPanelParametrosReportesTipoCalculoDepreciacion;
		//final JScrollPane jScrollPanelDatosTipoCalculoDepreciacion=this.jScrollPanelDatosTipoCalculoDepreciacion;
		final JTable jTableDatosTipoCalculoDepreciacion=this.jTableDatosTipoCalculoDepreciacion;		
		final JPanel jPanelPaginacionTipoCalculoDepreciacion=this.jPanelPaginacionTipoCalculoDepreciacion;
		//final JScrollPane jScrollPanelDatosEdicionTipoCalculoDepreciacion=this.jScrollPanelDatosEdicionTipoCalculoDepreciacion;
		final JPanel jPanelAccionesTipoCalculoDepreciacion=this.jPanelAccionesTipoCalculoDepreciacion;
		
		JPanel jPanelCamposAuxiliarTipoCalculoDepreciacion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoCalculoDepreciacion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {
			jPanelCamposAuxiliarTipoCalculoDepreciacion=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jPanelCamposTipoCalculoDepreciacion;
			jPanelAccionesFormularioAuxiliarTipoCalculoDepreciacion=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jPanelAccionesFormularioTipoCalculoDepreciacion;
		}
		
		final JPanel jPanelCamposTipoCalculoDepreciacion=jPanelCamposAuxiliarTipoCalculoDepreciacion;
		final JPanel jPanelAccionesFormularioTipoCalculoDepreciacion=jPanelAccionesFormularioAuxiliarTipoCalculoDepreciacion;
		
		
		final JMenuBar jmenuBarTipoCalculoDepreciacion=this.jmenuBarTipoCalculoDepreciacion;
		final JToolBar jTtoolBarTipoCalculoDepreciacion=this.jTtoolBarTipoCalculoDepreciacion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoCalculoDepreciacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCalculoDepreciacion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {
			jmenuBarDetalleAuxiliarTipoCalculoDepreciacion=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jmenuBarDetalleTipoCalculoDepreciacion;
			jTtoolBarDetalleAuxiliarTipoCalculoDepreciacion=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTtoolBarDetalleTipoCalculoDepreciacion;
		}
		
		final JMenuBar jmenuBarDetalleTipoCalculoDepreciacion=jmenuBarDetalleAuxiliarTipoCalculoDepreciacion;
		final JToolBar jTtoolBarDetalleTipoCalculoDepreciacion=jTtoolBarDetalleAuxiliarTipoCalculoDepreciacion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCalculoDepreciacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCalculoDepreciacion;
			processRunnable.jTableDatos=jTableDatosTipoCalculoDepreciacion;
			processRunnable.jPanelCampos=jPanelCamposTipoCalculoDepreciacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCalculoDepreciacion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCalculoDepreciacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCalculoDepreciacion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCalculoDepreciacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCalculoDepreciacion;
			processRunnable.jTtoolBar=jTtoolBarTipoCalculoDepreciacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCalculoDepreciacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCalculoDepreciacion ,jPanelParametrosReportesTipoCalculoDepreciacion,jTableDatosTipoCalculoDepreciacion, /*jScrollPanelDatosTipoCalculoDepreciacion,*/jPanelCamposTipoCalculoDepreciacion,jPanelPaginacionTipoCalculoDepreciacion, /*jScrollPanelDatosEdicionTipoCalculoDepreciacion,*/ jPanelAccionesTipoCalculoDepreciacion,jPanelAccionesFormularioTipoCalculoDepreciacion,jmenuBarTipoCalculoDepreciacion,jmenuBarDetalleTipoCalculoDepreciacion,jTtoolBarTipoCalculoDepreciacion,jTtoolBarDetalleTipoCalculoDepreciacion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCalculoDepreciacion ,jPanelParametrosReportesTipoCalculoDepreciacion, jScrollPanelDatosTipoCalculoDepreciacion,jPanelPaginacionTipoCalculoDepreciacion, jScrollPanelDatosEdicionTipoCalculoDepreciacion, jPanelAccionesTipoCalculoDepreciacion,jPanelAccionesFormularioTipoCalculoDepreciacion,jmenuBarTipoCalculoDepreciacion,jmenuBarDetalleTipoCalculoDepreciacion,jTtoolBarTipoCalculoDepreciacion,jTtoolBarDetalleTipoCalculoDepreciacion);
						
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
	
	public void finishProcessTipoCalculoDepreciacion() {// throws Exception 
		this.finishProcessTipoCalculoDepreciacion(true);
	}
	
	public void finishProcessTipoCalculoDepreciacion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoCalculoDepreciacion ,this.jPanelParametrosReportesTipoCalculoDepreciacion, this.jScrollPanelDatosTipoCalculoDepreciacion,this.jPanelPaginacionTipoCalculoDepreciacion, this.jScrollPanelDatosEdicionTipoCalculoDepreciacion, this.jPanelAccionesTipoCalculoDepreciacion,this.jPanelAccionesFormularioTipoCalculoDepreciacion,this.jmenuBarTipoCalculoDepreciacion,this.jmenuBarDetalleTipoCalculoDepreciacion,this.jTtoolBarTipoCalculoDepreciacion,this.jTtoolBarDetalleTipoCalculoDepreciacion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCalculoDepreciacion=this.jTabbedPaneBusquedasTipoCalculoDepreciacion; 
		
		final JPanel jPanelParametrosReportesTipoCalculoDepreciacion=this.jPanelParametrosReportesTipoCalculoDepreciacion;
		//final JScrollPane jScrollPanelDatosTipoCalculoDepreciacion=this.jScrollPanelDatosTipoCalculoDepreciacion;
		final JTable jTableDatosTipoCalculoDepreciacion=this.jTableDatosTipoCalculoDepreciacion;		
		final JPanel jPanelPaginacionTipoCalculoDepreciacion=this.jPanelPaginacionTipoCalculoDepreciacion;
		//final JScrollPane jScrollPanelDatosEdicionTipoCalculoDepreciacion=this.jScrollPanelDatosEdicionTipoCalculoDepreciacion;
		final JPanel jPanelAccionesTipoCalculoDepreciacion=this.jPanelAccionesTipoCalculoDepreciacion;
		
		JPanel jPanelCamposAuxiliarTipoCalculoDepreciacion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoCalculoDepreciacion=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {
			jPanelCamposAuxiliarTipoCalculoDepreciacion=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jPanelCamposTipoCalculoDepreciacion;
			jPanelAccionesFormularioAuxiliarTipoCalculoDepreciacion=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jPanelAccionesFormularioTipoCalculoDepreciacion;
		}
		
		final JPanel jPanelCamposTipoCalculoDepreciacion=jPanelCamposAuxiliarTipoCalculoDepreciacion;
		final JPanel jPanelAccionesFormularioTipoCalculoDepreciacion=jPanelAccionesFormularioAuxiliarTipoCalculoDepreciacion;
		
		
		final JMenuBar jmenuBarTipoCalculoDepreciacion=this.jmenuBarTipoCalculoDepreciacion;		
		final JToolBar jTtoolBarTipoCalculoDepreciacion=this.jTtoolBarTipoCalculoDepreciacion;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoCalculoDepreciacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCalculoDepreciacion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {
			jmenuBarDetalleAuxiliarTipoCalculoDepreciacion=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jmenuBarDetalleTipoCalculoDepreciacion;
			jTtoolBarDetalleAuxiliarTipoCalculoDepreciacion=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTtoolBarDetalleTipoCalculoDepreciacion;		
		}
		
		final JMenuBar jmenuBarDetalleTipoCalculoDepreciacion=jmenuBarDetalleAuxiliarTipoCalculoDepreciacion;
		final JToolBar jTtoolBarDetalleTipoCalculoDepreciacion=jTtoolBarDetalleAuxiliarTipoCalculoDepreciacion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCalculoDepreciacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCalculoDepreciacion;
			processRunnable.jTableDatos=jTableDatosTipoCalculoDepreciacion;
			processRunnable.jPanelCampos=jPanelCamposTipoCalculoDepreciacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCalculoDepreciacion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCalculoDepreciacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCalculoDepreciacion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCalculoDepreciacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCalculoDepreciacion;
			processRunnable.jTtoolBar=jTtoolBarTipoCalculoDepreciacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCalculoDepreciacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoCalculoDepreciacion ,jPanelParametrosReportesTipoCalculoDepreciacion, jTableDatosTipoCalculoDepreciacion,/*jScrollPanelDatosTipoCalculoDepreciacion,*/jPanelCamposTipoCalculoDepreciacion,jPanelPaginacionTipoCalculoDepreciacion, /*jScrollPanelDatosEdicionTipoCalculoDepreciacion,*/ jPanelAccionesTipoCalculoDepreciacion,jPanelAccionesFormularioTipoCalculoDepreciacion,jmenuBarTipoCalculoDepreciacion,jmenuBarDetalleTipoCalculoDepreciacion,jTtoolBarTipoCalculoDepreciacion,jTtoolBarDetalleTipoCalculoDepreciacion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoCalculoDepreciacion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoCalculoDepreciacion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoCalculoDepreciacion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoCalculoDepreciacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoCalculoDepreciacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoCalculoDepreciacion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoCalculoDepreciacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoCalculoDepreciacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoCalculoDepreciacion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocalculodepreciacionConstantesFunciones.getsFinalQueryTipoCalculoDepreciacion();
		String  finalQueryPaginacionTodos=this.tipocalculodepreciacionConstantesFunciones.getsFinalQueryTipoCalculoDepreciacion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoCalculoDepreciacionConstantesFunciones.getArrayColumnasGlobalesNoTipoCalculoDepreciacion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoCalculoDepreciacionConstantesFunciones.getArrayColumnasGlobalesTipoCalculoDepreciacion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoCalculoDepreciacionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocalculodepreciacionsEliminados= new ArrayList<TipoCalculoDepreciacion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoCalculoDepreciacion();
		
				///*TipoCalculoDepreciacionSessionBean*/this.tipocalculodepreciacionSessionBean=new TipoCalculoDepreciacionSessionBean();
			
			if(this.tipocalculodepreciacionSessionBean==null) {
				this.tipocalculodepreciacionSessionBean=new TipoCalculoDepreciacionSessionBean();
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
					this.iNumeroPaginacion=TipoCalculoDepreciacionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoCalculoDepreciacionConstantesFunciones.getClassesForeignKeysOfTipoCalculoDepreciacion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocalculodepreciacion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocalculodepreciacionsAux= new ArrayList<TipoCalculoDepreciacion>();
			
				
			tipocalculodepreciacionLogic.setDatosCliente(this.datosCliente);
			tipocalculodepreciacionLogic.setDatosDeep(this.datosDeep);
			tipocalculodepreciacionLogic.setIsConDeep(true);
			
			
			tipocalculodepreciacionLogic.getTipoCalculoDepreciacionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocalculodepreciacionLogic.getTodosTipoCalculoDepreciacions(finalQueryGlobal,pagination);
					
					//tipocalculodepreciacionLogic.getTodosTipoCalculoDepreciacionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocalculodepreciacionLogic.getTipoCalculoDepreciacions()==null|| tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocalculodepreciacionsAux= new ArrayList<TipoCalculoDepreciacion>();
							tipocalculodepreciacionsAux.addAll(tipocalculodepreciacionLogic.getTipoCalculoDepreciacions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocalculodepreciacionsAux= new ArrayList<TipoCalculoDepreciacion>();
							tipocalculodepreciacionsAux.addAll(tipocalculodepreciacions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocalculodepreciacionLogic.getTodosTipoCalculoDepreciacions(finalQueryGlobal+"",this.pagination);												
							
							//tipocalculodepreciacionLogic.getTodosTipoCalculoDepreciacionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoCalculoDepreciacions("Todos",tipocalculodepreciacionLogic.getTipoCalculoDepreciacions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocalculodepreciacionLogic.setTipoCalculoDepreciacions(new ArrayList<TipoCalculoDepreciacion>());					
							tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().addAll(tipocalculodepreciacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocalculodepreciacions=new ArrayList<TipoCalculoDepreciacion>();
							tipocalculodepreciacions.addAll(tipocalculodepreciacionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoCalculoDepreciacion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoCalculoDepreciacion=this.idActual;
				
				} else if(this.idTipoCalculoDepreciacionActual!=null && this.idTipoCalculoDepreciacionActual!=0L) {
					idTipoCalculoDepreciacion=idTipoCalculoDepreciacionActual;
				}
				
					
				this.sDetalleReporte=TipoCalculoDepreciacionConstantesFunciones.getDetalleIndicePorId(idTipoCalculoDepreciacion);
				
				this.tipocalculodepreciacions=new ArrayList<TipoCalculoDepreciacion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocalculodepreciacionLogic.getEntity(idTipoCalculoDepreciacion);
					
					//tipocalculodepreciacionLogic.getEntityWithConnection(idTipoCalculoDepreciacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocalculodepreciacionLogic.setTipoCalculoDepreciacions(new ArrayList<TipoCalculoDepreciacion>());
					tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().add(tipocalculodepreciacionLogic.getTipoCalculoDepreciacion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocalculodepreciacions=new ArrayList<TipoCalculoDepreciacion>();
					this.tipocalculodepreciacions.add(tipocalculodepreciacion);
				}
				
				if(tipocalculodepreciacionLogic.getTipoCalculoDepreciacion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=TipoCalculoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocalculodepreciacionLogic.getTipoCalculoDepreciacionsFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCalculoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCalculoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocalculodepreciacionLogic.getTipoCalculoDepreciacions()==null||tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocalculodepreciacions==null|| tipocalculodepreciacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocalculodepreciacionsAux=new ArrayList<TipoCalculoDepreciacion>();
						tipocalculodepreciacionsAux.addAll(tipocalculodepreciacionLogic.getTipoCalculoDepreciacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocalculodepreciacionsAux=new ArrayList<TipoCalculoDepreciacion>();
							tipocalculodepreciacionsAux.addAll(tipocalculodepreciacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocalculodepreciacionLogic.getTipoCalculoDepreciacionsFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCalculoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCalculoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoCalculoDepreciacions("FK_IdPais",tipocalculodepreciacionLogic.getTipoCalculoDepreciacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoCalculoDepreciacions("FK_IdPais",tipocalculodepreciacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocalculodepreciacionLogic.setTipoCalculoDepreciacions(new ArrayList<TipoCalculoDepreciacion>());
						tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().addAll(tipocalculodepreciacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocalculodepreciacions=new ArrayList<TipoCalculoDepreciacion>();
							tipocalculodepreciacions.addAll(tipocalculodepreciacionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoCalculoDepreciacion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoCalculoDepreciacion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocalculodepreciacions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocalculodepreciacions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoCalculoDepreciacion tipocalculodepreciacion) {
		Boolean permite=true;
		
		if(this.tipocalculodepreciacion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoCalculoDepreciacionConstantesFunciones.getOrderByListaTipoCalculoDepreciacion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoCalculoDepreciacionConstantesFunciones.getOrderByListaTipoCalculoDepreciacion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCalculoDepreciacion tipocalculodepreciacion:tipocalculodepreciacionLogic.getTipoCalculoDepreciacions()) {
				if(tipocalculodepreciacion.getsType().equals(Constantes2.S_TOTALES)) {
					tipocalculodepreciacionTotales=tipocalculodepreciacion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCalculoDepreciacion tipocalculodepreciacion:this.tipocalculodepreciacions) {
				if(tipocalculodepreciacion.getsType().equals(Constantes2.S_TOTALES)) {
					tipocalculodepreciacionTotales=tipocalculodepreciacion;
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
			this.tipocalculodepreciacionAux=new TipoCalculoDepreciacion();
			this.tipocalculodepreciacionAux.setsType(Constantes2.S_TOTALES);
			this.tipocalculodepreciacionAux.setIsNew(false);
			this.tipocalculodepreciacionAux.setIsChanged(false);
			this.tipocalculodepreciacionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoCalculoDepreciacionConstantesFunciones.TotalizarValoresFilaTipoCalculoDepreciacion(this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions(),this.tipocalculodepreciacionAux);
				
				this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().add(this.tipocalculodepreciacionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoCalculoDepreciacionConstantesFunciones.TotalizarValoresFilaTipoCalculoDepreciacion(this.tipocalculodepreciacions,this.tipocalculodepreciacionAux);
				
				this.tipocalculodepreciacions.add(this.tipocalculodepreciacionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocalculodepreciacionTotales=new TipoCalculoDepreciacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().remove(tipocalculodepreciacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocalculodepreciacions.remove(tipocalculodepreciacionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocalculodepreciacionTotales=new TipoCalculoDepreciacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCalculoDepreciacion tipocalculodepreciacion:tipocalculodepreciacionLogic.getTipoCalculoDepreciacions()) {
				if(tipocalculodepreciacion.getsType().equals(Constantes2.S_TOTALES)) {
					tipocalculodepreciacionTotales=tipocalculodepreciacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCalculoDepreciacionConstantesFunciones.TotalizarValoresFilaTipoCalculoDepreciacion(this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions(),tipocalculodepreciacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCalculoDepreciacion tipocalculodepreciacion:this.tipocalculodepreciacions) {
				if(tipocalculodepreciacion.getsType().equals(Constantes2.S_TOTALES)) {
					tipocalculodepreciacionTotales=tipocalculodepreciacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCalculoDepreciacionConstantesFunciones.TotalizarValoresFilaTipoCalculoDepreciacion(this.tipocalculodepreciacions,tipocalculodepreciacionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoCalculoDepreciacionsFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoCalculoDepreciacionPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoCalculoDepreciacionsFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocalculodepreciacionLogic.getTipoCalculoDepreciacionsFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoCalculoDepreciacionPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocalculodepreciacionLogic.getTipoCalculoDepreciacionPorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoCalculoDepreciacion() {
		this.isPermisoTodoTipoCalculoDepreciacion=false;
		this.isPermisoNuevoTipoCalculoDepreciacion=false;
		this.isPermisoActualizarTipoCalculoDepreciacion=false;
		this.isPermisoActualizarOriginalTipoCalculoDepreciacion=false;
		this.isPermisoEliminarTipoCalculoDepreciacion=false;
		this.isPermisoGuardarCambiosTipoCalculoDepreciacion=false;
		this.isPermisoConsultaTipoCalculoDepreciacion=false;
		this.isPermisoBusquedaTipoCalculoDepreciacion=false;
		this.isPermisoReporteTipoCalculoDepreciacion=false;		
		this.isPermisoOrdenTipoCalculoDepreciacion=false;		
		this.isPermisoPaginacionMedioTipoCalculoDepreciacion=false;		
		this.isPermisoPaginacionAltoTipoCalculoDepreciacion=false;
		this.isPermisoPaginacionTodoTipoCalculoDepreciacion=false;
		this.isPermisoCopiarTipoCalculoDepreciacion=false;		
		this.isPermisoVerFormTipoCalculoDepreciacion=false;		
		this.isPermisoDuplicarTipoCalculoDepreciacion=false;		
		this.isPermisoOrdenTipoCalculoDepreciacion=false;		
	}
	
	public void setPermisosUsuarioTipoCalculoDepreciacion(Boolean isPermiso) {
		this.isPermisoTodoTipoCalculoDepreciacion=isPermiso;
		this.isPermisoNuevoTipoCalculoDepreciacion=isPermiso;
		this.isPermisoActualizarTipoCalculoDepreciacion=isPermiso;
		this.isPermisoActualizarOriginalTipoCalculoDepreciacion=isPermiso;
		this.isPermisoEliminarTipoCalculoDepreciacion=isPermiso;
		this.isPermisoGuardarCambiosTipoCalculoDepreciacion=isPermiso;
		this.isPermisoConsultaTipoCalculoDepreciacion=isPermiso;
		this.isPermisoBusquedaTipoCalculoDepreciacion=isPermiso;
		this.isPermisoReporteTipoCalculoDepreciacion=isPermiso;
		this.isPermisoOrdenTipoCalculoDepreciacion=isPermiso;		
		this.isPermisoPaginacionMedioTipoCalculoDepreciacion=isPermiso;		
		this.isPermisoPaginacionAltoTipoCalculoDepreciacion=isPermiso;		
		this.isPermisoPaginacionTodoTipoCalculoDepreciacion=isPermiso;		
		this.isPermisoCopiarTipoCalculoDepreciacion=isPermiso;		
		this.isPermisoVerFormTipoCalculoDepreciacion=isPermiso;		
		this.isPermisoDuplicarTipoCalculoDepreciacion=isPermiso;
		this.isPermisoOrdenTipoCalculoDepreciacion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoCalculoDepreciacion(Boolean isPermiso) {
		//this.isPermisoTodoTipoCalculoDepreciacion=isPermiso;
		this.isPermisoNuevoTipoCalculoDepreciacion=isPermiso;
		this.isPermisoActualizarTipoCalculoDepreciacion=isPermiso;
		this.isPermisoActualizarOriginalTipoCalculoDepreciacion=isPermiso;
		this.isPermisoEliminarTipoCalculoDepreciacion=isPermiso;
		this.isPermisoGuardarCambiosTipoCalculoDepreciacion=isPermiso;
		//this.isPermisoConsultaTipoCalculoDepreciacion=isPermiso;
		//this.isPermisoBusquedaTipoCalculoDepreciacion=isPermiso;
		//this.isPermisoReporteTipoCalculoDepreciacion=isPermiso;
		//this.isPermisoOrdenTipoCalculoDepreciacion=isPermiso;		
		//this.isPermisoPaginacionMedioTipoCalculoDepreciacion=isPermiso;		
		//this.isPermisoPaginacionAltoTipoCalculoDepreciacion=isPermiso;		
		//this.isPermisoPaginacionTodoTipoCalculoDepreciacion=isPermiso;		
		//this.isPermisoCopiarTipoCalculoDepreciacion=isPermiso;		
		//this.isPermisoDuplicarTipoCalculoDepreciacion=isPermiso;
		//this.isPermisoOrdenTipoCalculoDepreciacion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoCalculoDepreciacionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoCalculoDepreciacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoCalculoDepreciacion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoCalculoDepreciacionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoCalculoDepreciacionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoCalculoDepreciacionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoCalculoDepreciacionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoCalculoDepreciacion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoCalculoDepreciacionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoCalculoDepreciacionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoCalculoDepreciacion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoCalculoDepreciacion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoCalculoDepreciacion=this.isPermisoActualizarTipoCalculoDepreciacion;
			this.isPermisoEliminarTipoCalculoDepreciacion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoCalculoDepreciacion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoCalculoDepreciacion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoCalculoDepreciacion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoCalculoDepreciacion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoCalculoDepreciacion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCalculoDepreciacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoCalculoDepreciacion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoCalculoDepreciacion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoCalculoDepreciacion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoCalculoDepreciacion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoCalculoDepreciacion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoCalculoDepreciacion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCalculoDepreciacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoCalculoDepreciacion.setToolTipText(this.jTableDatosTipoCalculoDepreciacion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoCalculoDepreciacion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoCalculoDepreciacion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoCalculoDepreciacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoCalculoDepreciacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoCalculoDepreciacion() throws Exception {
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
	public void inicializarCombosForeignKeyTipoCalculoDepreciacionListas()throws Exception {
		try	{						
			
				this.paissForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoCalculoDepreciacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoCalculoDepreciacionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoCalculoDepreciacionListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoCalculoDepreciacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoCalculoDepreciacionParameterReturnGeneral tipocalculodepreciacionReturnGeneral=new TipoCalculoDepreciacionParameterReturnGeneral();
						
			


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.tipocalculodepreciacionConstantesFunciones.cargarid_paisTipoCalculoDepreciacion)
					 || (this.esRecargarFks && this.tipocalculodepreciacionConstantesFunciones.cargarid_paisTipoCalculoDepreciacion)) {

					if(!this.tipocalculodepreciacionSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+tipocalculodepreciacionSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipocalculodepreciacionReturnGeneral=tipocalculodepreciacionLogic.cargarCombosLoteForeignKeyTipoCalculoDepreciacion(finalQueryGlobalPais);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=tipocalculodepreciacionReturnGeneral.getpaissForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoCalculoDepreciacion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPais();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {
			if(this.tipocalculodepreciacionSessionBean==null) {
				this.tipocalculodepreciacionSessionBean=new TipoCalculoDepreciacionSessionBean();
			}

			if(!this.tipocalculodepreciacionSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoCalculoDepreciacion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoCalculoDepreciacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoCalculoDepreciacion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCalculoDepreciacion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoCalculoDepreciacion(TipoCalculoDepreciacion tipocalculodepreciacion)throws Exception {	
		try {
			
			this.setActualPaisForeignKey(tipocalculodepreciacion.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoCalculoDepreciacion(TipoCalculoDepreciacion tipocalculodepreciacion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoCalculoDepreciacion()throws Exception {	
		try {
			
			this.setActualPaisForeignKey(this.tipocalculodepreciacionConstantesFunciones.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCalculoDepreciacion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoCalculoDepreciacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoCalculoDepreciacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoCalculoDepreciacion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoCalculoDepreciacion()throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoCalculoDepreciacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoCalculoDepreciacion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxid_paisTipoCalculoDepreciacion!=null && this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxid_paisTipoCalculoDepreciacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxid_paisTipoCalculoDepreciacion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoCalculoDepreciacionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoCalculoDepreciacionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoCalculoDepreciacionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocalculodepreciacionSessionBean=new TipoCalculoDepreciacionSessionBean(); 
		this.tipocalculodepreciacionConstantesFunciones=new TipoCalculoDepreciacionConstantesFunciones(); 
		this.tipocalculodepreciacionBean=new TipoCalculoDepreciacion();//(this.tipocalculodepreciacionConstantesFunciones); 		
		this.tipocalculodepreciacionReturnGeneral=new TipoCalculoDepreciacionParameterReturnGeneral(); 
		
		this.tipocalculodepreciacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocalculodepreciacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoCalculoDepreciacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoCalculoDepreciacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoCalculoDepreciacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoCalculoDepreciacion(true);
			
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
			
			this.tipocalculodepreciacionConstantesFunciones=new TipoCalculoDepreciacionConstantesFunciones(); 
			this.tipocalculodepreciacionBean=new TipoCalculoDepreciacion();//this.tipocalculodepreciacionConstantesFunciones); 			
			this.tipocalculodepreciacionReturnGeneral=new TipoCalculoDepreciacionParameterReturnGeneral(); 
		
			TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Calculo Depreciacion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipocalculodepreciacion=new TipoCalculoDepreciacion();
			this.tipocalculodepreciacions = new ArrayList<TipoCalculoDepreciacion>();
			this.tipocalculodepreciacionsAux = new ArrayList<TipoCalculoDepreciacion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic=new TipoCalculoDepreciacionLogic();
				this.tipocalculodepreciacionLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocalculodepreciacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocalculodepreciacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoCalculoDepreciacion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion);	
					}
					
					if(this.jInternalFrameImportacionTipoCalculoDepreciacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCalculoDepreciacion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoCalculoDepreciacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoCalculoDepreciacion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCalculoDepreciacion);
				this.jInternalFrameDetalleFormTipoCalculoDepreciacion.setVisible(false);
				this.jInternalFrameDetalleFormTipoCalculoDepreciacion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion);
					this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoCalculoDepreciacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoCalculoDepreciacion);
					this.jInternalFrameImportacionTipoCalculoDepreciacion.setVisible(false);
					this.jInternalFrameImportacionTipoCalculoDepreciacion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoCalculoDepreciacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoCalculoDepreciacion);
					this.jInternalFrameOrderByTipoCalculoDepreciacion.setVisible(false);
					this.jInternalFrameOrderByTipoCalculoDepreciacion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoCalculoDepreciacionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoCalculoDepreciacionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocalculodepreciacionReturnGeneral=new TipoCalculoDepreciacionParameterReturnGeneral();
			
			this.tipocalculodepreciacionParameterGeneral=new TipoCalculoDepreciacionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocalculodepreciacionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoCalculoDepreciacionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCalculoDepreciacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado(),this.tipocalculodepreciacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCalculoDepreciacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado(),this.tipocalculodepreciacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaDuplicarTipoCalculoDepreciacion=true;
			this.isVisibilidadCeldaCopiarTipoCalculoDepreciacion=true;
			this.isVisibilidadCeldaVerFormTipoCalculoDepreciacion=true;
			this.isVisibilidadCeldaOrdenTipoCalculoDepreciacion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaModificarTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaActualizarTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaEliminarTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaCancelarTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaGuardarTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCalculoDepreciacion=false;
			
			
			this.isVisibilidadFK_IdPais=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoCalculoDepreciacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoCalculoDepreciacion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoCalculoDepreciacion(false);
			
			this.setPermisosUsuarioTipoCalculoDepreciacion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado() && this.tipocalculodepreciacionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoCalculoDepreciacionClasesRelacionadas();
			}
			
			if(this.tipocalculodepreciacionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoCalculoDepreciacionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoCalculoDepreciacion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoCalculoDepreciacion();
			}
			
			if(!this.isPermisoBusquedaTipoCalculoDepreciacion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoCalculoDepreciacion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoCalculoDepreciacion,this.isPermisoPaginacionMedioTipoCalculoDepreciacion,this.isPermisoPaginacionTodoTipoCalculoDepreciacion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoCalculoDepreciacionConstantesFunciones.getTiposSeleccionarTipoCalculoDepreciacion());
				
				this.tiposColumnasSelect=TipoCalculoDepreciacionConstantesFunciones.getTiposSeleccionarTipoCalculoDepreciacion(true);
				
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
			//if(!this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoCalculoDepreciacion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoCalculoDepreciacion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoCalculoDepreciacion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCalculoDepreciacion() ;
			
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
				tipocalculodepreciacionImplementable= (TipoCalculoDepreciacionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCalculoDepreciacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocalculodepreciacionImplementableHome= (TipoCalculoDepreciacionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCalculoDepreciacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocalculodepreciacions= new ArrayList<TipoCalculoDepreciacion>();
			this.tipocalculodepreciacionsEliminados= new ArrayList<TipoCalculoDepreciacion>();
						
			this.isEsNuevoTipoCalculoDepreciacion=false;
			this.esParaAccionDesdeFormularioTipoCalculoDepreciacion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.paissForeignKey=new ArrayList<Pais>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoCalculoDepreciacion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoCalculoDepreciacion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoCalculoDepreciacionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoCalculoDepreciacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoCalculoDepreciacion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoCalculoDepreciacion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoCalculoDepreciacion();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoCalculoDepreciacion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoCalculoDepreciacion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoCalculoDepreciacion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoCalculoDepreciacion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoCalculoDepreciacion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoCalculoDepreciacion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoCalculoDepreciacion")) {
				iIndex=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTabbedPaneRelacionesTipoCalculoDepreciacion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTabbedPaneRelacionesTipoCalculoDepreciacion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoCalculoDepreciacion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoCalculoDepreciacion();	
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
	
	public void cargarCombosForeignKeyTipoCalculoDepreciacion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoCalculoDepreciacion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoCalculoDepreciacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoCalculoDepreciacionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoCalculoDepreciacion();
		
		this.cargarCombosFrameForeignKeyTipoCalculoDepreciacion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoCalculoDepreciacion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoCalculoDepreciacion();
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
	
	public void jButtonNuevoTipoCalculoDepreciacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocalculodepreciacionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
			
			
			if(jTableDatosTipoCalculoDepreciacion.getRowCount()>=1) {
				jTableDatosTipoCalculoDepreciacion.removeRowSelectionInterval(0, jTableDatosTipoCalculoDepreciacion.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoCalculoDepreciacion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoCalculoDepreciacion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoCalculoDepreciacion(true);			
			//this.tipocalculodepreciacion=new TipoCalculoDepreciacion();
			//this.tipocalculodepreciacion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCalculoDepreciacion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCalculoDepreciacion() ;
			
			if(TipoCalculoDepreciacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCalculoDepreciacion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocalculodepreciacion);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocalculodepreciacion);				
			
			TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
			
			if(this.tipocalculodepreciacionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoCalculoDepreciacion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoCalculoDepreciacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoCalculoDepreciacion> tipocalculodepreciacionsSeleccionados=new ArrayList<TipoCalculoDepreciacion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoCalculoDepreciacion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoCalculoDepreciacion.getSelectedRows().length;			
			}
			
			tipocalculodepreciacionsSeleccionados=this.getTipoCalculoDepreciacionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoCalculoDepreciacion--;			
				//TipoCalculoDepreciacion tipocalculodepreciacionAux= new TipoCalculoDepreciacion();			
				//tipocalculodepreciacionAux.setId(this.iIdNuevoTipoCalculoDepreciacion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoCalculoDepreciacion tipocalculodepreciacionOrigen=new TipoCalculoDepreciacion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoCalculoDepreciacion tipocalculodepreciacionOrigen : tipocalculodepreciacionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoCalculoDepreciacion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocalculodepreciacionOrigen =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocalculodepreciacionOrigen =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoCalculoDepreciacion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocalculodepreciacion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoCalculoDepreciacion(tipocalculodepreciacionOrigen,this.tipocalculodepreciacion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculoDepreciacion(this.tipocalculodepreciacion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().add(this.tipocalculodepreciacionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocalculodepreciacions.add(this.tipocalculodepreciacionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoCalculoDepreciacion(false);
				
				this.jTableDatosTipoCalculoDepreciacion.setRowSelectionInterval(this.getIndiceNuevoTipoCalculoDepreciacion(), this.getIndiceNuevoTipoCalculoDepreciacion());
				
				int iLastRow =  this.jTableDatosTipoCalculoDepreciacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCalculoDepreciacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCalculoDepreciacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCalculoDepreciacion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoCalculoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoCalculoDepreciacion> tipocalculodepreciacionsSeleccionados=new ArrayList<TipoCalculoDepreciacion>();									
		
			TipoCalculoDepreciacion tipocalculodepreciacionOrigen=new TipoCalculoDepreciacion();
			TipoCalculoDepreciacion tipocalculodepreciacionDestino=new TipoCalculoDepreciacion();
				
			tipocalculodepreciacionsSeleccionados=this.getTipoCalculoDepreciacionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoCalculoDepreciacion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocalculodepreciacionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoCalculoDepreciacion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocalculodepreciacionOrigen =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocalculodepreciacionOrigen =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocalculodepreciacionDestino =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocalculodepreciacionDestino =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocalculodepreciacionOrigen =tipocalculodepreciacionsSeleccionados.get(0);
				tipocalculodepreciacionDestino =tipocalculodepreciacionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoCalculoDepreciacion(tipocalculodepreciacionOrigen,tipocalculodepreciacionDestino,true,false);
				
				tipocalculodepreciacionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocalculodepreciacionDestino,tipocalculodepreciacionLogic.getTipoCalculoDepreciacions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocalculodepreciacionDestino,tipocalculodepreciacions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoCalculoDepreciacion(false);
				
				//this.jTableDatosTipoCalculoDepreciacion.setRowSelectionInterval(this.getIndiceNuevoTipoCalculoDepreciacion(), this.getIndiceNuevoTipoCalculoDepreciacion());
				
				int iLastRow =  this.jTableDatosTipoCalculoDepreciacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCalculoDepreciacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCalculoDepreciacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCalculoDepreciacion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoCalculoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoCalculoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoCalculoDepreciacion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoCalculoDepreciacion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoCalculoDepreciacion.setVisible(!isVisible);
			this.jPanelPaginacionTipoCalculoDepreciacion.setVisible(!isVisible);
			this.jPanelAccionesTipoCalculoDepreciacion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoCalculoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoCalculoDepreciacion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoCalculoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoCalculoDepreciacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoCalculoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoCalculoDepreciacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoCalculoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoCalculoDepreciacion();
			
			this.abrirFrameOrderByTipoCalculoDepreciacion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoCalculoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoCalculoDepreciacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoCalculoDepreciacion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCalculoDepreciacion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion.isMaximum()) {
					this.jInternalFrameDetalleFormTipoCalculoDepreciacion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.setSize(this.jInternalFrameDetalleFormTipoCalculoDepreciacion.iWidthFormulario,this.jInternalFrameDetalleFormTipoCalculoDepreciacion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoCalculoDepreciacion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoCalculoDepreciacion.isMaximum()) {
						this.jInternalFrameDetalleFormTipoCalculoDepreciacion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jContentPaneDetalleTipoCalculoDepreciacion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTabbedPaneRelacionesTipoCalculoDepreciacion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jContentPaneDetalleTipoCalculoDepreciacion.getWidth(),TipoCalculoDepreciacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTabbedPaneRelacionesTipoCalculoDepreciacion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jContentPaneDetalleTipoCalculoDepreciacion.getWidth(),TipoCalculoDepreciacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTabbedPaneRelacionesTipoCalculoDepreciacion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jContentPaneDetalleTipoCalculoDepreciacion.getWidth(),TipoCalculoDepreciacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoCalculoDepreciacion.setVisible(true);
	        this.jInternalFrameDetalleFormTipoCalculoDepreciacion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoCalculoDepreciacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoCalculoDepreciacion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoCalculoDepreciacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCalculoDepreciacion,false,this);
				} else {
					this.jInternalFrameOrderByTipoCalculoDepreciacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCalculoDepreciacion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoCalculoDepreciacion);
				this.jInternalFrameOrderByTipoCalculoDepreciacion.setVisible(false);
				this.jInternalFrameOrderByTipoCalculoDepreciacion.setSelected(false);
				
				this.jInternalFrameOrderByTipoCalculoDepreciacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCalculoDepreciacion"));
				
				this.inicializarActualizarBindingTablaOrderByTipoCalculoDepreciacion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoCalculoDepreciacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoCalculoDepreciacion==null) {
				
				this.jInternalFrameImportacionTipoCalculoDepreciacion=new ImportacionJInternalFrame(TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCalculoDepreciacion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoCalculoDepreciacion);
				this.jInternalFrameImportacionTipoCalculoDepreciacion.setVisible(false);
				this.jInternalFrameImportacionTipoCalculoDepreciacion.setSelected(false);


				this.jInternalFrameImportacionTipoCalculoDepreciacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCalculoDepreciacion"));
				this.jInternalFrameImportacionTipoCalculoDepreciacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCalculoDepreciacion"));
				this.jInternalFrameImportacionTipoCalculoDepreciacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCalculoDepreciacion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoCalculoDepreciacion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion==null) {
				this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion=new ReporteDinamicoJInternalFrame(TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion);
				this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCalculoDepreciacion"));
				this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCalculoDepreciacion"));
				this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCalculoDepreciacion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCalculoDepreciacion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoCalculoDepreciacion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCalculoDepreciacion);
			
	       	this.jInternalFrameDetalleFormTipoCalculoDepreciacion.setVisible(false);
	        this.jInternalFrameDetalleFormTipoCalculoDepreciacion.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoCalculoDepreciacion.dispose();
			//this.jInternalFrameDetalleFormTipoCalculoDepreciacion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoCalculoDepreciacion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoCalculoDepreciacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoCalculoDepreciacion.setVisible(true);
	        this.jInternalFrameImportacionTipoCalculoDepreciacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoCalculoDepreciacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoCalculoDepreciacion.setVisible(true);
	        this.jInternalFrameOrderByTipoCalculoDepreciacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoCalculoDepreciacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoCalculoDepreciacion.setVisible(false);
	        this.jInternalFrameOrderByTipoCalculoDepreciacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoCalculoDepreciacion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoCalculoDepreciacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoCalculoDepreciacion.setVisible(false);
	        this.jInternalFrameImportacionTipoCalculoDepreciacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoCalculoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoCalculoDepreciacion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoCalculoDepreciacion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCalculoDepreciacion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoCalculoDepreciacion(true);
			//this.isEsNuevoTipoCalculoDepreciacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoCalculoDepreciacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCalculoDepreciacion(false) ;
			
			if(tipocalculodepreciacionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoCalculoDepreciacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCalculoDepreciacion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCalculoDepreciacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoCalculoDepreciacionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoCalculoDepreciacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoCalculoDepreciacion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCalculoDepreciacion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoCalculoDepreciacion(true);
			//this.isEsNuevoTipoCalculoDepreciacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocalculodepreciacion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoCalculoDepreciacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoCalculoDepreciacion(false) ;
			
			if(TipoCalculoDepreciacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCalculoDepreciacion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCalculoDepreciacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosTipoCalculoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCalculoDepreciacion,TipoCalculoDepreciacionConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoCalculoDepreciacion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoCalculoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoCalculoDepreciacion(false);
			
			//if(!this.isEsNuevoTipoCalculoDepreciacion) {								
				int intSelectedRow = this.jTableDatosTipoCalculoDepreciacion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoCalculoDepreciacion(this.tipocalculodepreciacion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculoDepreciacion(this.tipocalculodepreciacion);
				
			}
			
			if(this.permiteMantenimiento(this.tipocalculodepreciacion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoCalculoDepreciacion=true;
					this.inicializarActualizarBindingTablaTipoCalculoDepreciacion(false);
					this.isEsNuevoTipoCalculoDepreciacion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoCalculoDepreciacion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoCalculoDepreciacion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCalculoDepreciacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCalculoDepreciacion(false);
				
				this.habilitarDeshabilitarControlesTipoCalculoDepreciacion(false);
			
												
				
				if(TipoCalculoDepreciacionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoCalculoDepreciacion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoCalculoDepreciacionActionPerformed(evt,tipocalculodepreciacionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoCalculoDepreciacion(this.tipocalculodepreciacion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoCalculoDepreciacion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocalculodepreciacionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocalculodepreciacion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoCalculoDepreciacion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalculoDepreciacion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoCalculoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoCalculoDepreciacion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				this.tipocalculodepreciacion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				this.tipocalculodepreciacion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocalculodepreciacion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoCalculoDepreciacionModel) this.jTableDatosTipoCalculoDepreciacion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoCalculoDepreciacion=true;
				this.inicializarActualizarBindingTablaTipoCalculoDepreciacion(false);
				this.isEsNuevoTipoCalculoDepreciacion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCalculoDepreciacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCalculoDepreciacion(false);
				
				this.habilitarDeshabilitarControlesTipoCalculoDepreciacion(false);
				
				
				
				if(TipoCalculoDepreciacionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoCalculoDepreciacion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoCalculoDepreciacionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoCalculoDepreciacion.getRowCount()>=1) {
				jTableDatosTipoCalculoDepreciacion.removeRowSelectionInterval(0, jTableDatosTipoCalculoDepreciacion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoCalculoDepreciacion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoCalculoDepreciacion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCalculoDepreciacion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCalculoDepreciacion(false) ;
			
			this.isEsNuevoTipoCalculoDepreciacion=false;
			
			if(TipoCalculoDepreciacionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoCalculoDepreciacion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoCalculoDepreciacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoCalculoDepreciacion(false);
				
				//SI ES MANUAL
				if(TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoCalculoDepreciacion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoCalculoDepreciacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoCalculoDepreciacion--;			
			//TipoCalculoDepreciacion tipocalculodepreciacionAux= new TipoCalculoDepreciacion();			
			//tipocalculodepreciacionAux.setId(this.iIdNuevoTipoCalculoDepreciacion);
			
			if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoCalculoDepreciacion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculoDepreciacion(this.tipocalculodepreciacion);
			
			this.tipocalculodepreciacion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().add(this.tipocalculodepreciacionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocalculodepreciacions.add(this.tipocalculodepreciacionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoCalculoDepreciacion(false);
			
			this.jTableDatosTipoCalculoDepreciacion.setRowSelectionInterval(this.getIndiceNuevoTipoCalculoDepreciacion(), this.getIndiceNuevoTipoCalculoDepreciacion());
			
			int iLastRow =  this.jTableDatosTipoCalculoDepreciacion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoCalculoDepreciacion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoCalculoDepreciacion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoCalculoDepreciacion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoCalculoDepreciacionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoCalculoDepreciacion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCalculoDepreciacion(false);
			
			//SI ES MANUAL
			if(TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCalculoDepreciacion();
			}
			
			//this.abrirFrameTreeTipoCalculoDepreciacion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoCalculoDepreciacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Calculo DepreciacionS ?", "MANTENIMIENTO DE Tipo Calculo Depreciacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoCalculoDepreciacion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoCalculoDepreciacion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocalculodepreciacionReturnGeneral=tipocalculodepreciacionLogic.procesarImportacionTipoCalculoDepreciacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocalculodepreciacionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoCalculoDepreciacionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoCalculoDepreciacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoCalculoDepreciacion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoCalculoDepreciacion.setFileImportacion(this.jInternalFrameImportacionTipoCalculoDepreciacion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoCalculoDepreciacion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoCalculoDepreciacion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoCalculoDepreciacion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoCalculoDepreciacion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoCalculoDepreciacionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoCalculoDepreciacion> tipocalculodepreciacionsSeleccionados=new ArrayList<TipoCalculoDepreciacion>();		

		tipocalculodepreciacionsSeleccionados=this.getTipoCalculoDepreciacionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoCalculoDepreciacionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoCalculoDepreciacionBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoCalculoDepreciacions("Todos",tipocalculodepreciacionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Calculo Depreciacion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCalculoDepreciacionConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCalculoDepreciacionConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoCalculoDepreciacionConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case TipoCalculoDepreciacionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoCalculoDepreciacionConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case TipoCalculoDepreciacionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCalculoDepreciacionConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case TipoCalculoDepreciacionConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoCalculoDepreciacionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoCalculoDepreciacion> tipocalculodepreciacionsSeleccionados=new ArrayList<TipoCalculoDepreciacion>();		
		
		tipocalculodepreciacionsSeleccionados=this.getTipoCalculoDepreciacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocalculodepreciacion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoCalculoDepreciacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoCalculoDepreciacionConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCalculoDepreciacionConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(TipoCalculoDepreciacion tipocalculodepreciacion:tipocalculodepreciacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocalculodepreciacion.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCalculoDepreciacionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCalculoDepreciacionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoCalculoDepreciacion tipocalculodepreciacion:tipocalculodepreciacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocalculodepreciacion.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoCalculoDepreciacion(row);				
			//	iRow++;
			//}				
			
			//for(TipoCalculoDepreciacion tipocalculodepreciacionAux:tipocalculodepreciacionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoCalculoDepreciacion(tipocalculodepreciacionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Calculo Depreciacion",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocalculodepreciacionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCalculoDepreciacion(false);
			
			//SI ES MANUAL
			if(TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCalculoDepreciacion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoCalculoDepreciacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCalculoDepreciacion(false);
			
			//SI ES MANUAL
			if(TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCalculoDepreciacion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoCalculoDepreciacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCalculoDepreciacion(false);
			
			//SI ES MANUAL
			if(TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCalculoDepreciacion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoCalculoDepreciacion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoCalculoDepreciacion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoCalculoDepreciacion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoCalculoDepreciacion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoCalculoDepreciacion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoCalculoDepreciacion.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoCalculoDepreciacion.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoCalculoDepreciacion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoCalculoDepreciacion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoCalculoDepreciacion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoCalculoDepreciacion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoCalculoDepreciacion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoCalculoDepreciacion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoCalculoDepreciacion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCalculoDepreciacion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoCalculoDepreciacion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoCalculoDepreciacion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoCalculoDepreciacion();
		
		this.inicializarActualizarBindingBotonesManualTipoCalculoDepreciacion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCalculoDepreciacion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCalculoDepreciacion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCalculoDepreciacion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCalculoDepreciacion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoCalculoDepreciacion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoCalculoDepreciacion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoCalculoDepreciacion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jCheckBoxPostAccionNuevoTipoCalculoDepreciacion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jCheckBoxPostAccionSinCerrarTipoCalculoDepreciacion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jCheckBoxPostAccionSinMensajeTipoCalculoDepreciacion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoCalculoDepreciacion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoCalculoDepreciacion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoCalculoDepreciacion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {
				this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jCheckBoxPostAccionNuevoTipoCalculoDepreciacion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jCheckBoxPostAccionSinCerrarTipoCalculoDepreciacion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jCheckBoxPostAccionSinMensajeTipoCalculoDepreciacion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoCalculoDepreciacion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoCalculoDepreciacion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoCalculoDepreciacion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoCalculoDepreciacion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoCalculoDepreciacion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoCalculoDepreciacion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoCalculoDepreciacion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoCalculoDepreciacion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoCalculoDepreciacion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoCalculoDepreciacion(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCalculoDepreciacion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoCalculoDepreciacion() throws Exception {
		try	{
			if(TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCalculoDepreciacion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCalculoDepreciacion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCalculoDepreciacion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoCalculoDepreciacion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoCalculoDepreciacion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoCalculoDepreciacion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoCalculoDepreciacion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoCalculoDepreciacion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoCalculoDepreciacion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoCalculoDepreciacion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoCalculoDepreciacion.addItem(reporte);
			}
			
			
			if(!this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoCalculoDepreciacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoCalculoDepreciacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoCalculoDepreciacion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoCalculoDepreciacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoCalculoDepreciacion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoCalculoDepreciacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoCalculoDepreciacion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoCalculoDepreciacion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoCalculoDepreciacion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCalculoDepreciacion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCalculoDepreciacion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion!=null) {
				this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion!=null) {
				this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoCalculoDepreciacion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_paisFK_IdPaisTipoCalculoDepreciacion.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisTipoCalculoDepreciacion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoCalculoDepreciacion(Boolean esInicializar) throws Exception {				
		if(TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCalculoDepreciacion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoCalculoDepreciacion() throws Exception {
		this.inicializarActualizarBindingTablaTipoCalculoDepreciacion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoCalculoDepreciacion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoCalculoDepreciacion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoCalculoDepreciacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCalculoDepreciacion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoCalculoDepreciacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoCalculoDepreciacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCalculoDepreciacion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoCalculoDepreciacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoCalculoDepreciacionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCalculoDepreciacionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoCalculoDepreciacionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoCalculoDepreciacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCalculoDepreciacion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoCalculoDepreciacionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoCalculoDepreciacion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoCalculoDepreciacion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocalculodepreciacions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoCalculoDepreciacion.setModel(new TipoCalculoDepreciacionModel(this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoCalculoDepreciacion.setModel(new TipoCalculoDepreciacionModel(this.tipocalculodepreciacions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoCalculoDepreciacion!=null && this.jInternalFrameOrderByTipoCalculoDepreciacion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoCalculoDepreciacion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoCalculoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCalculoDepreciacion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoCalculoDepreciacionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO,tipocalculodepreciacionConstantesFunciones.resaltarSeleccionarTipoCalculoDepreciacion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO,tipocalculodepreciacionConstantesFunciones.resaltarSeleccionarTipoCalculoDepreciacion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoCalculoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCalculoDepreciacion,TipoCalculoDepreciacionConstantesFunciones.LABEL_ID));

		if(this.tipocalculodepreciacionConstantesFunciones.mostraridTipoCalculoDepreciacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCalculoDepreciacionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocalculodepreciacionConstantesFunciones.resaltaridTipoCalculoDepreciacion,this.tipocalculodepreciacionConstantesFunciones.activaridTipoCalculoDepreciacion,this,true,"idTipoCalculoDepreciacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocalculodepreciacionConstantesFunciones.resaltaridTipoCalculoDepreciacion,this.tipocalculodepreciacionConstantesFunciones.activaridTipoCalculoDepreciacion,this,true,"idTipoCalculoDepreciacion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCalculoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCalculoDepreciacion,TipoCalculoDepreciacionConstantesFunciones.LABEL_IDPAIS));

		if(this.tipocalculodepreciacionConstantesFunciones.mostrarid_paisTipoCalculoDepreciacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCalculoDepreciacionConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.tipocalculodepreciacionConstantesFunciones.resaltarid_paisTipoCalculoDepreciacion,this,this.tipocalculodepreciacionConstantesFunciones.activarid_paisTipoCalculoDepreciacion));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.tipocalculodepreciacionConstantesFunciones.resaltarid_paisTipoCalculoDepreciacion,this,this.tipocalculodepreciacionConstantesFunciones.activarid_paisTipoCalculoDepreciacion,true,"id_paisTipoCalculoDepreciacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCalculoDepreciacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCalculoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCalculoDepreciacion,TipoCalculoDepreciacionConstantesFunciones.LABEL_NOMBRE));

		if(this.tipocalculodepreciacionConstantesFunciones.mostrarnombreTipoCalculoDepreciacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCalculoDepreciacionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocalculodepreciacionConstantesFunciones.resaltarnombreTipoCalculoDepreciacion,this.tipocalculodepreciacionConstantesFunciones.activarnombreTipoCalculoDepreciacion,this,true,"nombreTipoCalculoDepreciacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocalculodepreciacionConstantesFunciones.resaltarnombreTipoCalculoDepreciacion,this.tipocalculodepreciacionConstantesFunciones.activarnombreTipoCalculoDepreciacion,this,true,"nombreTipoCalculoDepreciacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCalculoDepreciacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCalculoDepreciacion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCalculoDepreciacion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoCalculoDepreciacion && this.isPermisoGuardarCambiosTipoCalculoDepreciacion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoCalculoDepreciacion.addColumn(tableColumn);
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
			
			this.jTableDatosTipoCalculoDepreciacion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCalculoDepreciacion && this.isPermisoGuardarCambiosTipoCalculoDepreciacion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCalculoDepreciacion && this.isPermisoGuardarCambiosTipoCalculoDepreciacion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoCalculoDepreciacion.moveColumn(this.jTableDatosTipoCalculoDepreciacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoCalculoDepreciacion.moveColumn(this.jTableDatosTipoCalculoDepreciacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoCalculoDepreciacion.moveColumn(this.jTableDatosTipoCalculoDepreciacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoCalculoDepreciacion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoCalculoDepreciacion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoCalculoDepreciacion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoCalculoDepreciacion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoCalculoDepreciacion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoCalculoDepreciacion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoCalculoDepreciacion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoCalculoDepreciacion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocalculodepreciacions.size()-1;
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
		//this.jTableDatosTipoCalculoDepreciacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoCalculoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoCalculoDepreciacion();
			
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
				
				//this.isEsNuevoTipoCalculoDepreciacion=false;
					
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
			
				if(this.tipocalculodepreciacionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCalculoDepreciacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCalculoDepreciacion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocalculodepreciacion.getsType().equals("DUPLICADO")
				   || this.tipocalculodepreciacion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoCalculoDepreciacion=true;
				
				} else {
					this.isEsNuevoTipoCalculoDepreciacion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocalculodepreciacion.getId()>=0 && !this.tipocalculodepreciacion.getIsNew()) {						
						this.isEsNuevoTipoCalculoDepreciacion=false;
						
					} else {
						this.isEsNuevoTipoCalculoDepreciacion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoCalculoDepreciacion(esRelaciones);						
				
				this.seleccionarTipoCalculoDepreciacion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocalculodepreciacion.getId()<0) {
					this.isEsNuevoTipoCalculoDepreciacion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoCalculoDepreciacion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoCalculoDepreciacion(evt,rowIndex);
				}	
				
				if(this.tipocalculodepreciacionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoCalculoDepreciacion: " + this.dDif); 
					}
				}								
				
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoCalculoDepreciacion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocalculodepreciacion)) {
					if(this.tipocalculodepreciacion.getId()>0) {
						this.tipocalculodepreciacion.setIsDeleted(true);
						
						this.tipocalculodepreciacionsEliminados.add(this.tipocalculodepreciacion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().remove(this.tipocalculodepreciacion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocalculodepreciacions.remove(this.tipocalculodepreciacion);				
					}
					
					
					((TipoCalculoDepreciacionModel) this.jTableDatosTipoCalculoDepreciacion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCalculoDepreciacion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoCalculoDepreciacion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoCalculoDepreciacion) {
			
			if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCalculoDepreciacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCalculoDepreciacion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoCalculoDepreciacion(this.tipocalculodepreciacion);
				}
				
				//ARCHITECTURE
				try {
					

					//Pais
					if(!this.tipocalculodepreciacionConstantesFunciones.cargarid_paisTipoCalculoDepreciacion || this.tipocalculodepreciacionConstantesFunciones.event_dependid_paisTipoCalculoDepreciacion) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.tipocalculodepreciacion.getid_pais());
									//this.inicializarActualizarBindingTipoCalculoDepreciacion(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(tipocalculodepreciacion.getPais()!=null) {
							this.paissForeignKey.add(tipocalculodepreciacion.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.tipocalculodepreciacion.getid_pais(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoCalculoDepreciacion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoCalculoDepreciacion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCalculoDepreciacion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCalculoDepreciacion(TipoCalculoDepreciacion tipocalculodepreciacion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoCalculoDepreciacion(tipocalculodepreciacion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCalculoDepreciacion(TipoCalculoDepreciacion tipocalculodepreciacion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoCalculoDepreciacion(tipocalculodepreciacion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoCalculoDepreciacion(tipocalculodepreciacion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoCalculoDepreciacion(tipocalculodepreciacion);
	}
	
	public void setVariablesObjetoActualToFormularioTipoCalculoDepreciacion(TipoCalculoDepreciacion tipocalculodepreciacion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTextFieldidTipoCalculoDepreciacion.setText(tipocalculodepreciacion.getId().toString());
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTextAreanombreTipoCalculoDepreciacion.setText(tipocalculodepreciacion.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoCalculoDepreciacion tipocalculodepreciacionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocalculodepreciacionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoCalculoDepreciacion tipocalculodepreciacionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocalculodepreciacionLocal=this.tipocalculodepreciacion;
			} else {
				tipocalculodepreciacionLocal=this.tipocalculodepreciacionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocalculodepreciacionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoCalculoDepreciacion(tipocalculodepreciacionLocal,true);
					
					if(tipocalculodepreciacionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocalculodepreciacionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocalculodepreciacionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoCalculoDepreciacion(TipoCalculoDepreciacion tipocalculodepreciacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCalculoDepreciacion(tipocalculodepreciacion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculoDepreciacion(tipocalculodepreciacion);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCalculoDepreciacion(TipoCalculoDepreciacion tipocalculodepreciacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCalculoDepreciacion(tipocalculodepreciacion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCalculoDepreciacion(TipoCalculoDepreciacion tipocalculodepreciacion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTextFieldidTipoCalculoDepreciacion.getText()==null || this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTextFieldidTipoCalculoDepreciacion.getText()=="" || this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTextFieldidTipoCalculoDepreciacion.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTextFieldidTipoCalculoDepreciacion.setText("0");
			}

			if(conColumnasBase) {tipocalculodepreciacion.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTextFieldidTipoCalculoDepreciacion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCalculoDepreciacionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jLabelIdTipoCalculoDepreciacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocalculodepreciacion.setnombre(this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTextAreanombreTipoCalculoDepreciacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCalculoDepreciacionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jLabelnombreTipoCalculoDepreciacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCalculoDepreciacion(TipoCalculoDepreciacion tipocalculodepreciacionBean,TipoCalculoDepreciacion tipocalculodepreciacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tipocalculodepreciacionBean.getid_pais()!=null && !tipocalculodepreciacionBean.getid_pais().equals(-1L))) {tipocalculodepreciacion.setid_pais(tipocalculodepreciacionBean.getid_pais());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoCalculoDepreciacion(TipoCalculoDepreciacion tipocalculodepreciacionOrigen,TipoCalculoDepreciacion tipocalculodepreciacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocalculodepreciacionOrigen.getId()!=null && !tipocalculodepreciacionOrigen.getId().equals(0L))) {tipocalculodepreciacion.setId(tipocalculodepreciacionOrigen.getId());}}
			if(conDefault || (!conDefault && tipocalculodepreciacionOrigen.getid_pais()!=null && !tipocalculodepreciacionOrigen.getid_pais().equals(-1L))) {tipocalculodepreciacion.setid_pais(tipocalculodepreciacionOrigen.getid_pais());}
			if(conDefault || (!conDefault && tipocalculodepreciacionOrigen.getnombre()!=null && !tipocalculodepreciacionOrigen.getnombre().equals(""))) {tipocalculodepreciacion.setnombre(tipocalculodepreciacionOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCalculoDepreciacion(TipoCalculoDepreciacion tipocalculodepreciacion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTextFieldidTipoCalculoDepreciacion.setText(tipocalculodepreciacion.getId().toString());
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTextAreanombreTipoCalculoDepreciacion.setText(tipocalculodepreciacion.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCalculoDepreciacion(TipoCalculoDepreciacionBean tipocalculodepreciacionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTextFieldidTipoCalculoDepreciacion.setText(tipocalculodepreciacionBean.getId().toString());
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTextAreanombreTipoCalculoDepreciacion.setText(tipocalculodepreciacionBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoCalculoDepreciacion(TipoCalculoDepreciacionParameterReturnGeneral tipocalculodepreciacionReturnGeneral,TipoCalculoDepreciacionBean tipocalculodepreciacionBean,Boolean conDefault) throws Exception { 
		try {
			TipoCalculoDepreciacion tipocalculodepreciacionLocal=new TipoCalculoDepreciacion();
			
			tipocalculodepreciacionLocal=tipocalculodepreciacionReturnGeneral.getTipoCalculoDepreciacion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocalculodepreciacionLocal.getId()!=null && !tipocalculodepreciacionLocal.getId().equals(0L))) {tipocalculodepreciacionBean.setId(tipocalculodepreciacionLocal.getId());}}
			if(conDefault || (!conDefault && tipocalculodepreciacionLocal.getid_pais()!=null && !tipocalculodepreciacionLocal.getid_pais().equals(-1L))) {tipocalculodepreciacionBean.setid_pais(tipocalculodepreciacionLocal.getid_pais());}
			if(conDefault || (!conDefault && tipocalculodepreciacionLocal.getnombre()!=null && !tipocalculodepreciacionLocal.getnombre().equals(""))) {tipocalculodepreciacionBean.setnombre(tipocalculodepreciacionLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoCalculoDepreciacionGenerico(Long idTipoCalculoDepreciacionSeleccionado,JComboBox jComboBoxTipoCalculoDepreciacion,List<TipoCalculoDepreciacion> tipocalculodepreciacionsLocal)throws Exception {
		try {
			TipoCalculoDepreciacion  tipocalculodepreciacionTemp=null;

			for(TipoCalculoDepreciacion tipocalculodepreciacionAux:tipocalculodepreciacionsLocal) {
				if(tipocalculodepreciacionAux.getId()!=null && tipocalculodepreciacionAux.getId().equals(idTipoCalculoDepreciacionSeleccionado)) {
					tipocalculodepreciacionTemp=tipocalculodepreciacionAux;
					break;
				}
			}

			jComboBoxTipoCalculoDepreciacion.setSelectedItem(tipocalculodepreciacionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoCalculoDepreciacionGenerico(JComboBox jComboBoxTipoCalculoDepreciacion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoCalculoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCalculoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoCalculoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCalculoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCalculoDepreciacion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoCalculoDepreciacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCalculoDepreciacion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoCalculoDepreciacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoCalculoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoCalculoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocalculodepreciacion=(TipoCalculoDepreciacion) tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocalculodepreciacion =(TipoCalculoDepreciacion) tipocalculodepreciacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!tipocalculodepreciacion.getIsNew() && !tipocalculodepreciacion.getIsChanged() && !tipocalculodepreciacion.getIsDeleted()) {
				sDescripcion=tipocalculodepreciacion.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=tipocalculodepreciacion.getpais_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoCalculoDepreciacion tipocalculodepreciacionRow=new TipoCalculoDepreciacion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocalculodepreciacionRow=(TipoCalculoDepreciacion) tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocalculodepreciacionRow=(TipoCalculoDepreciacion) tipocalculodepreciacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoCalculoDepreciacion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoTipoCalculoDepreciacion && this.isPermisoNuevoTipoCalculoDepreciacion));			
			this.jButtonDuplicarTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaDuplicarTipoCalculoDepreciacion && this.isPermisoDuplicarTipoCalculoDepreciacion));			
			this.jButtonCopiarTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaCopiarTipoCalculoDepreciacion && this.isPermisoCopiarTipoCalculoDepreciacion));
			this.jButtonVerFormTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaVerFormTipoCalculoDepreciacion && this.isPermisoVerFormTipoCalculoDepreciacion));
			
			this.jButtonAbrirOrderByTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaOrdenTipoCalculoDepreciacion && this.isPermisoOrdenTipoCalculoDepreciacion));			
			
			this.jButtonNuevoRelacionesTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion && this.isPermisoNuevoTipoCalculoDepreciacion));			
			this.jButtonNuevoGuardarCambiosTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoTipoCalculoDepreciacion && this.isPermisoNuevoTipoCalculoDepreciacion && this.isPermisoGuardarCambiosTipoCalculoDepreciacion));
			
			if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonModificarTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaModificarTipoCalculoDepreciacion && this.isPermisoActualizarTipoCalculoDepreciacion));	
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonActualizarTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaActualizarTipoCalculoDepreciacion && this.isPermisoActualizarTipoCalculoDepreciacion));	
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonEliminarTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaEliminarTipoCalculoDepreciacion && this.isPermisoEliminarTipoCalculoDepreciacion));
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonCancelarTipoCalculoDepreciacion.setVisible(this.isVisibilidadCeldaCancelarTipoCalculoDepreciacion);							
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonGuardarCambiosTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaGuardarTipoCalculoDepreciacion && this.isPermisoGuardarCambiosTipoCalculoDepreciacion));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCalculoDepreciacion && this.isPermisoGuardarCambiosTipoCalculoDepreciacion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoTipoCalculoDepreciacion && this.isPermisoNuevoTipoCalculoDepreciacion));						
			this.jButtonDuplicarToolBarTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaDuplicarTipoCalculoDepreciacion && this.isPermisoDuplicarTipoCalculoDepreciacion));						
			this.jButtonCopiarToolBarTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaCopiarTipoCalculoDepreciacion && this.isPermisoCopiarTipoCalculoDepreciacion));			
			this.jButtonVerFormToolBarTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaVerFormTipoCalculoDepreciacion && this.isPermisoVerFormTipoCalculoDepreciacion));			
			this.jButtonAbrirOrderByToolBarTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaOrdenTipoCalculoDepreciacion && this.isPermisoOrdenTipoCalculoDepreciacion));
			this.jButtonNuevoRelacionesToolBarTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion && this.isPermisoNuevoTipoCalculoDepreciacion));			
			this.jButtonNuevoGuardarCambiosToolBarTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoTipoCalculoDepreciacion && this.isPermisoNuevoTipoCalculoDepreciacion && this.isPermisoGuardarCambiosTipoCalculoDepreciacion));			
			
			if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonModificarToolBarTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaModificarTipoCalculoDepreciacion && this.isPermisoActualizarTipoCalculoDepreciacion));	
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonActualizarToolBarTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaActualizarTipoCalculoDepreciacion  && this.isPermisoActualizarTipoCalculoDepreciacion));	
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonEliminarToolBarTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaEliminarTipoCalculoDepreciacion && this.isPermisoEliminarTipoCalculoDepreciacion));
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonCancelarToolBarTipoCalculoDepreciacion.setVisible(this.isVisibilidadCeldaCancelarTipoCalculoDepreciacion);				
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonGuardarCambiosToolBarTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaGuardarTipoCalculoDepreciacion && this.isPermisoGuardarCambiosTipoCalculoDepreciacion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCalculoDepreciacion && this.isPermisoGuardarCambiosTipoCalculoDepreciacion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoTipoCalculoDepreciacion && this.isPermisoNuevoTipoCalculoDepreciacion));			
			this.jMenuItemDuplicarTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaDuplicarTipoCalculoDepreciacion && this.isPermisoDuplicarTipoCalculoDepreciacion));			
			this.jMenuItemCopiarTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaCopiarTipoCalculoDepreciacion && this.isPermisoCopiarTipoCalculoDepreciacion));			
			this.jMenuItemVerFormTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaVerFormTipoCalculoDepreciacion && this.isPermisoVerFormTipoCalculoDepreciacion));			
			this.jMenuItemAbrirOrderByTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaOrdenTipoCalculoDepreciacion && this.isPermisoOrdenTipoCalculoDepreciacion));			
			//this.jMenuItemMostrarOcultarTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaOrdenTipoCalculoDepreciacion && this.isPermisoOrdenTipoCalculoDepreciacion));
			this.jMenuItemDetalleAbrirOrderByTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaOrdenTipoCalculoDepreciacion && this.isPermisoOrdenTipoCalculoDepreciacion));			
			//this.jMenuItemDetalleMostrarOcultarTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaOrdenTipoCalculoDepreciacion && this.isPermisoOrdenTipoCalculoDepreciacion));			
			this.jMenuItemNuevoRelacionesTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion && this.isPermisoNuevoTipoCalculoDepreciacion));			
			this.jMenuItemNuevoGuardarCambiosTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoTipoCalculoDepreciacion && this.isPermisoNuevoTipoCalculoDepreciacion && this.isPermisoGuardarCambiosTipoCalculoDepreciacion));									
			
			if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jMenuItemModificarTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaModificarTipoCalculoDepreciacion && this.isPermisoActualizarTipoCalculoDepreciacion));	
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jMenuItemActualizarTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaActualizarTipoCalculoDepreciacion && this.isPermisoActualizarTipoCalculoDepreciacion));	
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jMenuItemEliminarTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaEliminarTipoCalculoDepreciacion && this.isPermisoEliminarTipoCalculoDepreciacion));
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jMenuItemCancelarTipoCalculoDepreciacion.setVisible(this.isVisibilidadCeldaCancelarTipoCalculoDepreciacion);				
			}
			
			this.jMenuItemGuardarCambiosTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaGuardarTipoCalculoDepreciacion && this.isPermisoGuardarCambiosTipoCalculoDepreciacion));						
			this.jMenuItemGuardarCambiosTablaTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCalculoDepreciacion && this.isPermisoGuardarCambiosTipoCalculoDepreciacion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoCalculoDepreciacion=this.jButtonNuevoTipoCalculoDepreciacion.isVisible();
			this.isVisibilidadCeldaDuplicarTipoCalculoDepreciacion=this.jButtonDuplicarTipoCalculoDepreciacion.isVisible();
			this.isVisibilidadCeldaCopiarTipoCalculoDepreciacion=this.jButtonCopiarTipoCalculoDepreciacion.isVisible();
			this.isVisibilidadCeldaVerFormTipoCalculoDepreciacion=this.jButtonVerFormTipoCalculoDepreciacion.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoCalculoDepreciacion=this.jButtonAbrirOrderByTipoCalculoDepreciacion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion=this.jButtonNuevoRelacionesTipoCalculoDepreciacion.isVisible();
			this.isVisibilidadCeldaModificarTipoCalculoDepreciacion=this.jButtonModificarTipoCalculoDepreciacion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {
			this.isVisibilidadCeldaActualizarTipoCalculoDepreciacion=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonActualizarTipoCalculoDepreciacion.isVisible();
			this.isVisibilidadCeldaEliminarTipoCalculoDepreciacion=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonEliminarTipoCalculoDepreciacion.isVisible();
			this.isVisibilidadCeldaCancelarTipoCalculoDepreciacion=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonCancelarTipoCalculoDepreciacion.isVisible();
			this.isVisibilidadCeldaGuardarTipoCalculoDepreciacion=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonGuardarCambiosTipoCalculoDepreciacion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoCalculoDepreciacion=this.jButtonGuardarCambiosTablaTipoCalculoDepreciacion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoCalculoDepreciacion=this.jButtonNuevoToolBarTipoCalculoDepreciacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion=this.jButtonNuevoRelacionesToolBarTipoCalculoDepreciacion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {
			this.isVisibilidadCeldaModificarTipoCalculoDepreciacion=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonModificarToolBarTipoCalculoDepreciacion.isVisible();
			this.isVisibilidadCeldaActualizarTipoCalculoDepreciacion=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonActualizarToolBarTipoCalculoDepreciacion.isVisible();
			this.isVisibilidadCeldaEliminarTipoCalculoDepreciacion=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonEliminarToolBarTipoCalculoDepreciacion.isVisible();
			this.isVisibilidadCeldaCancelarTipoCalculoDepreciacion=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonCancelarToolBarTipoCalculoDepreciacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCalculoDepreciacion=this.jButtonGuardarCambiosToolBarTipoCalculoDepreciacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCalculoDepreciacion=this.jButtonGuardarCambiosTablaToolBarTipoCalculoDepreciacion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoCalculoDepreciacion=this.jMenuItemNuevoTipoCalculoDepreciacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion=this.jMenuItemNuevoRelacionesTipoCalculoDepreciacion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {
			this.isVisibilidadCeldaModificarTipoCalculoDepreciacion=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jMenuItemModificarTipoCalculoDepreciacion.isVisible();
			this.isVisibilidadCeldaActualizarTipoCalculoDepreciacion=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jMenuItemActualizarTipoCalculoDepreciacion.isVisible();
			this.isVisibilidadCeldaEliminarTipoCalculoDepreciacion=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jMenuItemEliminarTipoCalculoDepreciacion.isVisible();
			this.isVisibilidadCeldaCancelarTipoCalculoDepreciacion=this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jMenuItemCancelarTipoCalculoDepreciacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCalculoDepreciacion=this.jMenuItemGuardarCambiosTipoCalculoDepreciacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCalculoDepreciacion=this.jMenuItemGuardarCambiosTablaTipoCalculoDepreciacion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoCalculoDepreciacion(Boolean esInicializar) {
		if(TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocalculodepreciacionSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCalculoDepreciacion();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoCalculoDepreciacion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoCalculoDepreciacion() {
		this.jButtonNuevoTipoCalculoDepreciacion.setVisible(this.isPermisoNuevoTipoCalculoDepreciacion);			
		this.jButtonDuplicarTipoCalculoDepreciacion.setVisible(this.isPermisoDuplicarTipoCalculoDepreciacion);			
		this.jButtonCopiarTipoCalculoDepreciacion.setVisible(this.isPermisoCopiarTipoCalculoDepreciacion);			
		this.jButtonVerFormTipoCalculoDepreciacion.setVisible(this.isPermisoVerFormTipoCalculoDepreciacion);			
		
		this.jButtonAbrirOrderByTipoCalculoDepreciacion.setVisible(this.isPermisoOrdenTipoCalculoDepreciacion);					
		
		this.jButtonNuevoRelacionesTipoCalculoDepreciacion.setVisible(this.isPermisoNuevoTipoCalculoDepreciacion);			
		
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonModificarTipoCalculoDepreciacion.setVisible(this.isPermisoActualizarTipoCalculoDepreciacion);	
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonActualizarTipoCalculoDepreciacion.setVisible(this.isPermisoActualizarTipoCalculoDepreciacion);	
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonEliminarTipoCalculoDepreciacion.setVisible(this.isPermisoEliminarTipoCalculoDepreciacion);
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonCancelarTipoCalculoDepreciacion.setVisible(this.isVisibilidadCeldaCancelarTipoCalculoDepreciacion);						
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonGuardarCambiosTipoCalculoDepreciacion.setVisible(this.isPermisoGuardarCambiosTipoCalculoDepreciacion);							
		}
		
		this.jButtonGuardarCambiosTablaTipoCalculoDepreciacion.setVisible(this.isPermisoActualizarTipoCalculoDepreciacion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCalculoDepreciacion() {
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonModificarTipoCalculoDepreciacion.setVisible(this.isPermisoActualizarTipoCalculoDepreciacion);	
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonActualizarTipoCalculoDepreciacion.setVisible(this.isPermisoActualizarTipoCalculoDepreciacion);	
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonEliminarTipoCalculoDepreciacion.setVisible(this.isPermisoEliminarTipoCalculoDepreciacion);
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonCancelarTipoCalculoDepreciacion.setVisible(this.isVisibilidadCeldaCancelarTipoCalculoDepreciacion);							
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonGuardarCambiosTipoCalculoDepreciacion.setVisible((this.isVisibilidadCeldaGuardarTipoCalculoDepreciacion && this.isPermisoGuardarCambiosTipoCalculoDepreciacion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoCalculoDepreciacion() {
		if(TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoCalculoDepreciacion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoCalculoDepreciacion() {
	}
	
	public void jTableDatosTipoCalculoDepreciacionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoCalculoDepreciacion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoCalculoDepreciacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculodepreciacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCalculoDepreciacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCalculoDepreciacion(this.gettipocalculodepreciacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculoDepreciacion(this.tipocalculodepreciacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocalculodepreciacion==null) {
						this.tipocalculodepreciacion = new TipoCalculoDepreciacion();
					}

					this.setVariablesFormularioToObjetoActualTipoCalculoDepreciacion(this.tipocalculodepreciacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculoDepreciacion(this.tipocalculodepreciacion);
				}

				if(this.tipocalculodepreciacion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocalculodepreciacion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCalculoDepreciacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculodepreciacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculodepreciacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculodepreciacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisTipoCalculoDepreciacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebTipoCalculoDepreciacion(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCalculoDepreciacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoCalculoDepreciacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoCalculoDepreciacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoCalculoDepreciacion(this.gettipocalculodepreciacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculoDepreciacion(this.tipocalculodepreciacion);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.tipocalculodepreciacionLogic.getConnexion());

				if(this.tipocalculodepreciacion.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.tipocalculodepreciacion.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoCalculoDepreciacion=(TitledBorder)this.jScrollPanelDatosTipoCalculoDepreciacion.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderTipoCalculoDepreciacion.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisTipoCalculoDepreciacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculodepreciacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCalculoDepreciacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCalculoDepreciacion(this.gettipocalculodepreciacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculoDepreciacion(this.tipocalculodepreciacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocalculodepreciacion==null) {
						this.tipocalculodepreciacion = new TipoCalculoDepreciacion();
					}

					this.setVariablesFormularioToObjetoActualTipoCalculoDepreciacion(this.tipocalculodepreciacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculoDepreciacion(this.tipocalculodepreciacion);
				}

				if(this.tipocalculodepreciacion.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.tipocalculodepreciacion.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCalculoDepreciacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculodepreciacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculodepreciacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculodepreciacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoCalculoDepreciacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculodepreciacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCalculoDepreciacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCalculoDepreciacion(this.gettipocalculodepreciacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculoDepreciacion(this.tipocalculodepreciacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocalculodepreciacion==null) {
						this.tipocalculodepreciacion = new TipoCalculoDepreciacion();
					}

					this.setVariablesFormularioToObjetoActualTipoCalculoDepreciacion(this.tipocalculodepreciacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculoDepreciacion(this.tipocalculodepreciacion);
				}

				if(this.tipocalculodepreciacion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipocalculodepreciacion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCalculoDepreciacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculodepreciacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculodepreciacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculodepreciacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdPaisTipoCalculoDepreciacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoCalculoDepreciacion(false,false);

			this.getTipoCalculoDepreciacionsFK_IdPais();

			this.inicializarActualizarBindingTipoCalculoDepreciacion(false);

			//if(TipoCalculoDepreciacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoCalculoDepreciacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocalculodepreciacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoCalculoDepreciacion() {
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.dispose();
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion!=null) {
			this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.dispose();
			this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion=null;
		}
		
		if(this.jInternalFrameImportacionTipoCalculoDepreciacion!=null) {
			this.jInternalFrameImportacionTipoCalculoDepreciacion.setVisible(false);	    			
			this.jInternalFrameImportacionTipoCalculoDepreciacion.dispose();
			this.jInternalFrameImportacionTipoCalculoDepreciacion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoCalculoDepreciacion();
			
			TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoCalculoDepreciacion")) {
				jButtonNuevoTipoCalculoDepreciacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoCalculoDepreciacion")) {
				jButtonDuplicarTipoCalculoDepreciacionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoCalculoDepreciacion")) {
				jButtonCopiarTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoCalculoDepreciacion")) {
				jButtonVerFormTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoCalculoDepreciacion")) {
				jButtonNuevoTipoCalculoDepreciacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoCalculoDepreciacion")) {
				jButtonDuplicarTipoCalculoDepreciacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoCalculoDepreciacion")) {
				jButtonNuevoTipoCalculoDepreciacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoCalculoDepreciacion")) {
				jButtonDuplicarTipoCalculoDepreciacionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoCalculoDepreciacion")) {
				jButtonNuevoTipoCalculoDepreciacionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoCalculoDepreciacion")) {
				jButtonNuevoTipoCalculoDepreciacionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoCalculoDepreciacion")) {
				jButtonNuevoTipoCalculoDepreciacionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoCalculoDepreciacion")) {
				jButtonModificarTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoCalculoDepreciacion")) {
				jButtonModificarTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoCalculoDepreciacion")) {
				jButtonModificarTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoCalculoDepreciacion")) {
				jButtonActualizarTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoCalculoDepreciacion")) {
				jButtonActualizarTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoCalculoDepreciacion")) {
				jButtonActualizarTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoCalculoDepreciacion")) {
				jButtonEliminarTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoCalculoDepreciacion")) {
				jButtonEliminarTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoCalculoDepreciacion")) {
				jButtonEliminarTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoCalculoDepreciacion")) {
				jButtonCancelarTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoCalculoDepreciacion")) {
				jButtonCancelarTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoCalculoDepreciacion")) {
				jButtonCancelarTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoCalculoDepreciacion")) {
				jButtonCerrarTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoCalculoDepreciacion")) {
				jButtonCerrarTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoCalculoDepreciacion")) {
				jButtonCerrarTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoCalculoDepreciacion")) {
				jButtonMostrarOcultarTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoCalculoDepreciacion")) {
				jButtonCancelarTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoCalculoDepreciacion")) {
				jButtonGuardarCambiosTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoCalculoDepreciacion")) {
				jButtonGuardarCambiosTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoCalculoDepreciacion")) {
				jButtonCopiarTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoCalculoDepreciacion")) {
				jButtonVerFormTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoCalculoDepreciacion")) {
				jButtonGuardarCambiosTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoCalculoDepreciacion")) {
				jButtonCopiarTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoCalculoDepreciacion")) {
				jButtonVerFormTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoCalculoDepreciacion")) {
				jButtonGuardarCambiosTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoCalculoDepreciacion")) {
				jButtonGuardarCambiosTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoCalculoDepreciacion")) {
				jButtonGuardarCambiosTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoCalculoDepreciacion")) {
				jButtonRecargarInformacionTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoCalculoDepreciacion")) {
				jButtonRecargarInformacionTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoCalculoDepreciacion")) {
				jButtonRecargarInformacionTipoCalculoDepreciacionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoCalculoDepreciacion")) {
				jButtonAnterioresTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoCalculoDepreciacion")) {
				jButtonAnterioresTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoCalculoDepreciacion")) {
				jButtonAnterioresTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoCalculoDepreciacion")) {
				jButtonSiguientesTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoCalculoDepreciacion")) {
				jButtonSiguientesTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoCalculoDepreciacion")) {
				jButtonSiguientesTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoCalculoDepreciacion") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoCalculoDepreciacion")) {
				jButtonAbrirOrderByTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoCalculoDepreciacion") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoCalculoDepreciacion")) {
				jButtonMostrarOcultarTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCalculoDepreciacion")) {
				jButtonNuevoGuardarCambiosTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoCalculoDepreciacion")) {
				jButtonNuevoGuardarCambiosTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoCalculoDepreciacion")) {
				jButtonNuevoGuardarCambiosTipoCalculoDepreciacionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoCalculoDepreciacion")) {
				jButtonCerrarReporteDinamicoTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoCalculoDepreciacion")) {
				jButtonGenerarReporteDinamicoTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoCalculoDepreciacion")) {
				
				jButtonGenerarExcelReporteDinamicoTipoCalculoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoCalculoDepreciacion")) {
				jButtonCerrarImportacionTipoCalculoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoCalculoDepreciacion")) {
				
				jButtonGenerarImportacionTipoCalculoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoCalculoDepreciacion")) {
				
				jButtonAbrirImportacionTipoCalculoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoCalculoDepreciacion")) {
				jComboBoxTiposAccionesTipoCalculoDepreciacionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoCalculoDepreciacion")) {
				jComboBoxTiposRelacionesTipoCalculoDepreciacionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoCalculoDepreciacion")) {
				jComboBoxTiposAccionesTipoCalculoDepreciacionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoCalculoDepreciacion")) {
				
				jComboBoxTiposSeleccionarTipoCalculoDepreciacionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoCalculoDepreciacion")) {
				jTextFieldValorCampoGeneralTipoCalculoDepreciacionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoCalculoDepreciacion")) {
				jButtonAbrirOrderByTipoCalculoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoCalculoDepreciacion")) {
				jButtonAbrirOrderByTipoCalculoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoCalculoDepreciacion")) {
				jButtonCerrarOrderByTipoCalculoDepreciacionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCalculoDepreciacionBusqueda")) {
				this.jButtonidTipoCalculoDepreciacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoCalculoDepreciacionUpdate")) {
				this.jButtonid_paisTipoCalculoDepreciacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoCalculoDepreciacionBusqueda")) {
				this.jButtonid_paisTipoCalculoDepreciacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCalculoDepreciacionBusqueda")) {
				this.jButtonnombreTipoCalculoDepreciacionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdPaisTipoCalculoDepreciacion")) {
				this.jButtonFK_IdPaisTipoCalculoDepreciacionActionPerformed(evt);
			}
			
			;
			
			
			TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoCalculoDepreciacion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCalculoDepreciacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculodepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalculodepreciacion);
				
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
				
				


				
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalculoDepreciacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalculoDepreciacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoCalculoDepreciacion tipocalculodepreciacionLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocalculodepreciacionLocal=this.tipocalculodepreciacion;
			} else {
				tipocalculodepreciacionLocal=this.tipocalculodepreciacionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculodepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalculodepreciacion);
				
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
							
				
				


				
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalculoDepreciacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalculoDepreciacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCalculoDepreciacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCalculoDepreciacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculodepreciacionAnterior =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocalculodepreciacionAnterior =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
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
			
			TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
			
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
			
			


			
			TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCalculoDepreciacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculodepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalculodepreciacion);
				
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
								
						
				


				
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalculoDepreciacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalculoDepreciacion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculodepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalculodepreciacion);
				
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
								
				
				


				
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalculoDepreciacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalculoDepreciacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCalculoDepreciacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCalculoDepreciacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculodepreciacionAnterior =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocalculodepreciacionAnterior =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculodepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalculodepreciacion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCalculoDepreciacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCalculoDepreciacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculodepreciacionAnterior =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocalculodepreciacionAnterior =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCalculoDepreciacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculodepreciacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocalculodepreciacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculodepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalculodepreciacion);
				
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
							
				
				


				
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalculoDepreciacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalculoDepreciacion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCalculoDepreciacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCalculoDepreciacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocalculodepreciacionAnterior =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocalculodepreciacionAnterior =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
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
			
			TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
			
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
			
			


			
			TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCalculoDepreciacionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculodepreciacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocalculodepreciacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculodepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalculodepreciacion);
				
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
								
				
				


				
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalculoDepreciacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalculoDepreciacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCalculoDepreciacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCalculoDepreciacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculodepreciacionAnterior =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocalculodepreciacionAnterior =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCalculoDepreciacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculodepreciacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocalculodepreciacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCalculoDepreciacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculodepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalculodepreciacion);
				
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoCalculoDepreciacion")) {
					jCheckBoxSeleccionarTodosTipoCalculoDepreciacionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoCalculoDepreciacion")) {
					jCheckBoxSeleccionadosTipoCalculoDepreciacionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoCalculoDepreciacion")) {
					
				}
				
				


				
				
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalculoDepreciacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalculoDepreciacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculodepreciacion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocalculodepreciacion);
				
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
												
				
				


				
				
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalculoDepreciacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalculoDepreciacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCalculoDepreciacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCalculoDepreciacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocalculodepreciacionAnterior =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocalculodepreciacionAnterior =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCalculoDepreciacionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculodepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalculodepreciacion);
				
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
				
				
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
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
			
			TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
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
			
			


			
			TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCalculoDepreciacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculodepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalculodepreciacion);
				
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalculoDepreciacion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalculoDepreciacion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocalculodepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocalculodepreciacion);
				
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
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
				
				


				
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCalculoDepreciacion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCalculoDepreciacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCalculoDepreciacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCalculoDepreciacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocalculodepreciacionAnterior =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocalculodepreciacionAnterior =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoCalculoDepreciacion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoCalculoDepreciacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoCalculoDepreciacion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocalculodepreciacion =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocalculodepreciacion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoCalculoDepreciacion")) {
				
				}
				
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoCalculoDepreciacion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoCalculoDepreciacion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoCalculoDepreciacion")) {
			
			}
			
			TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoCalculoDepreciacion();
			
			TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
			
			if(sTipo.equals("NuevoTipoCalculoDepreciacion")) {
				jButtonNuevoTipoCalculoDepreciacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoCalculoDepreciacion")) {
				jButtonDuplicarTipoCalculoDepreciacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoCalculoDepreciacion")) {
				jButtonCopiarTipoCalculoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoCalculoDepreciacion")) {
				jButtonVerFormTipoCalculoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoCalculoDepreciacion")) {
				jButtonNuevoTipoCalculoDepreciacionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoCalculoDepreciacion")) {
				jButtonModificarTipoCalculoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoCalculoDepreciacion")) {
				jButtonActualizarTipoCalculoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoCalculoDepreciacion")) {
				jButtonEliminarTipoCalculoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoCalculoDepreciacion")) {
				jButtonGuardarCambiosTipoCalculoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoCalculoDepreciacion")) {
				jButtonCancelarTipoCalculoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoCalculoDepreciacion")) {
				jButtonCerrarTipoCalculoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoCalculoDepreciacion")) {
				jButtonGuardarCambiosTipoCalculoDepreciacionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCalculoDepreciacion")) {
				jButtonNuevoGuardarCambiosTipoCalculoDepreciacionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoCalculoDepreciacion")) {
				jButtonAbrirOrderByTipoCalculoDepreciacionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoCalculoDepreciacion")) {
				jButtonRecargarInformacionTipoCalculoDepreciacionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoCalculoDepreciacion")) {
				jButtonAnterioresTipoCalculoDepreciacionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoCalculoDepreciacion")) {
				jButtonSiguientesTipoCalculoDepreciacionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCalculoDepreciacionBusqueda")) {
				this.jButtonidTipoCalculoDepreciacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoCalculoDepreciacionUpdate")) {
				this.jButtonid_paisTipoCalculoDepreciacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoCalculoDepreciacionBusqueda")) {
				this.jButtonid_paisTipoCalculoDepreciacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCalculoDepreciacionBusqueda")) {
				this.jButtonnombreTipoCalculoDepreciacionBusquedaActionPerformed(evt);
			}
			
			TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoCalculoDepreciacion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoCalculoDepreciacion")) {
				closingInternalFrameTipoCalculoDepreciacion();
				
			} else if(sTipo.equals("jButtonCancelarTipoCalculoDepreciacion")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoCalculoDepreciacion = (JInternalFrameBase)evt.getSource();
	            	
	            TipoCalculoDepreciacionBeanSwingJInternalFrame jInternalFrameParent=(TipoCalculoDepreciacionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCalculoDepreciacion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoCalculoDepreciacionActionPerformed(null);
			}
			
			TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocalculodepreciacion,new Object(),this.tipocalculodepreciacionParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoCalculoDepreciacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoCalculoDepreciacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoCalculoDepreciacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocalculodepreciacion)) {
			if(!esControlTabla) {
				if(TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoCalculoDepreciacion(this.tipocalculodepreciacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculoDepreciacion(this.tipocalculodepreciacion);			
				}
				
				if(this.tipocalculodepreciacionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoCalculoDepreciacion(this.tipocalculodepreciacion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocalculodepreciacionReturnGeneral=tipocalculodepreciacionLogic.procesarEventosTipoCalculoDepreciacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions(),this.tipocalculodepreciacion,this.tipocalculodepreciacionParameterGeneral,this.isEsNuevoTipoCalculoDepreciacion,classes);//this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoCalculoDepreciacion(this.tipocalculodepreciacionReturnGeneral,this.tipocalculodepreciacionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocalculodepreciacionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoCalculoDepreciacion(classes,this.tipocalculodepreciacionReturnGeneral,this.tipocalculodepreciacionBean,false);
					}
						
					if(this.tipocalculodepreciacionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoCalculoDepreciacion(this.tipocalculodepreciacionReturnGeneral.getTipoCalculoDepreciacion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoCalculoDepreciacion(this.tipocalculodepreciacionReturnGeneral.getTipoCalculoDepreciacion());	
					}
						
					if(this.tipocalculodepreciacionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoCalculoDepreciacion(this.tipocalculodepreciacionReturnGeneral.getTipoCalculoDepreciacion(),classes);//this.tipocalculodepreciacionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoCalculoDepreciacion(this.tipocalculodepreciacion,classes);//this.tipocalculodepreciacionBean);									
				}
			
				if(TipoCalculoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoCalculoDepreciacion(this.tipocalculodepreciacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCalculoDepreciacion(this.tipocalculodepreciacion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocalculodepreciacionAnterior!=null) {
						this.tipocalculodepreciacion=this.tipocalculodepreciacionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocalculodepreciacionReturnGeneral=tipocalculodepreciacionLogic.procesarEventosTipoCalculoDepreciacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions(),this.tipocalculodepreciacion,this.tipocalculodepreciacionParameterGeneral,this.isEsNuevoTipoCalculoDepreciacion,classes);//this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocalculodepreciacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocalculodepreciacionReturnGeneral.getTipoCalculoDepreciacion(),tipocalculodepreciacionLogic.getTipoCalculoDepreciacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocalculodepreciacionReturnGeneral.getTipoCalculoDepreciacion(),this.tipocalculodepreciacions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoCalculoDepreciacion.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoCalculoDepreciacion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoCalculoDepreciacion();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoCalculoDepreciacion() throws Exception {
		
		TipoCalculoDepreciacionModel tipocalculodepreciacionModel=(TipoCalculoDepreciacionModel)this.jTableDatosTipoCalculoDepreciacion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocalculodepreciacionModel.tipocalculodepreciacions=this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocalculodepreciacionModel.tipocalculodepreciacions=this.tipocalculodepreciacions;
		}
		
		
		((TipoCalculoDepreciacionModel) this.jTableDatosTipoCalculoDepreciacion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoCalculoDepreciacion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocalculodepreciacionAnterior(),this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocalculodepreciacionAnterior(),this.tipocalculodepreciacions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoCalculoDepreciacion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoCalculoDepreciacion(TipoCalculoDepreciacion tipocalculodepreciacion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
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
										
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocalculodepreciacion,new Object(),generalEntityParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocalculodepreciacionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoCalculoDepreciacionConstantesFunciones.getClassesRelationshipsOfTipoCalculoDepreciacion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoCalculoDepreciacionConstantesFunciones.getClassesRelationshipsFromStringsOfTipoCalculoDepreciacion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoCalculoDepreciacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocalculodepreciacion,new Object(),generalEntityParameterGeneral,this.tipocalculodepreciacionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoCalculoDepreciacion(TipoCalculoDepreciacionBean tipocalculodepreciacionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoCalculoDepreciacion(ArrayList<Classe> classes,TipoCalculoDepreciacionReturnGeneral tipocalculodepreciacionReturnGeneral,TipoCalculoDepreciacionBean tipocalculodepreciacionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoCalculoDepreciacion(TipoCalculoDepreciacion tipocalculodepreciacion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipocalculodepreciacion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion = new TipoCalculoDepreciacionDetalleFormJInternalFrame(jDesktopPane,this.tipocalculodepreciacionSessionBean.getConGuardarRelaciones(),this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCalculoDepreciacion);
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.setVisible(false);
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.tipocalculodepreciacionLogic=this.tipocalculodepreciacionLogic;
		
		this.cargarCombosFrameForeignKeyTipoCalculoDepreciacion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCalculoDepreciacion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCalculoDepreciacion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoCalculoDepreciacion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoCalculoDepreciacion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCalculoDepreciacion"));
		
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonModificarTipoCalculoDepreciacion.addActionListener(new ButtonActionListener(this,"ModificarTipoCalculoDepreciacion"));

		
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonModificarToolBarTipoCalculoDepreciacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCalculoDepreciacion"));
					
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jMenuItemModificarTipoCalculoDepreciacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCalculoDepreciacion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonActualizarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"ActualizarTipoCalculoDepreciacion"));
		
		
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonActualizarToolBarTipoCalculoDepreciacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCalculoDepreciacion"));
						
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jMenuItemActualizarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCalculoDepreciacion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonEliminarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"EliminarTipoCalculoDepreciacion"));
		
		
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonEliminarToolBarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCalculoDepreciacion"));
								
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jMenuItemEliminarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCalculoDepreciacion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonCancelarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"CancelarTipoCalculoDepreciacion"));
		
		
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonCancelarToolBarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCalculoDepreciacion"));
					
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jMenuItemCancelarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCalculoDepreciacion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jMenuItemDetalleCerrarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCalculoDepreciacion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonGuardarCambiosToolBarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCalculoDepreciacion"));
		
		
		
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonGuardarCambiosToolBarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCalculoDepreciacion"));
		
		
		
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCalculoDepreciacion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonidTipoCalculoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCalculoDepreciacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonid_paisTipoCalculoDepreciacionUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoCalculoDepreciacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonid_paisTipoCalculoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoCalculoDepreciacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonnombreTipoCalculoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCalculoDepreciacionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTabbedPaneRelacionesTipoCalculoDepreciacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCalculoDepreciacion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoCalculoDepreciacion"));
		
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCalculoDepreciacion"));
		}
		
		this.jTableDatosTipoCalculoDepreciacion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoCalculoDepreciacion"));
		
		this.jTableDatosTipoCalculoDepreciacion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoCalculoDepreciacion"));
		
		this.jButtonNuevoTipoCalculoDepreciacion.addActionListener(new ButtonActionListener(this,"NuevoTipoCalculoDepreciacion"));
		
		this.jButtonDuplicarTipoCalculoDepreciacion.addActionListener(new ButtonActionListener(this,"DuplicarTipoCalculoDepreciacion"));
		
		this.jButtonCopiarTipoCalculoDepreciacion.addActionListener(new ButtonActionListener(this,"CopiarTipoCalculoDepreciacion"));
		
		this.jButtonVerFormTipoCalculoDepreciacion.addActionListener(new ButtonActionListener(this,"VerFormTipoCalculoDepreciacion"));
		
		
		this.jButtonNuevoToolBarTipoCalculoDepreciacion.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoCalculoDepreciacion"));
			
		this.jButtonDuplicarToolBarTipoCalculoDepreciacion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoCalculoDepreciacion"));
			
		this.jMenuItemNuevoTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoCalculoDepreciacion"));
			
		this.jMenuItemDuplicarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoCalculoDepreciacion"));		
		
		
		this.jButtonNuevoRelacionesTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoCalculoDepreciacion"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoCalculoDepreciacion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoCalculoDepreciacion"));
			
		this.jMenuItemNuevoRelacionesTipoCalculoDepreciacion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoCalculoDepreciacion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonModificarTipoCalculoDepreciacion.addActionListener(new ButtonActionListener(this,"ModificarTipoCalculoDepreciacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonModificarToolBarTipoCalculoDepreciacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCalculoDepreciacion"));
			
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jMenuItemModificarTipoCalculoDepreciacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCalculoDepreciacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonActualizarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"ActualizarTipoCalculoDepreciacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonActualizarToolBarTipoCalculoDepreciacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCalculoDepreciacion"));
				
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jMenuItemActualizarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCalculoDepreciacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonEliminarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"EliminarTipoCalculoDepreciacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonEliminarToolBarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCalculoDepreciacion"));
						
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jMenuItemEliminarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCalculoDepreciacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonCancelarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"CancelarTipoCalculoDepreciacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonCancelarToolBarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCalculoDepreciacion"));
			
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jMenuItemCancelarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCalculoDepreciacion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoCalculoDepreciacion"));		
		
		
		this.jButtonCerrarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"CerrarTipoCalculoDepreciacion"));
		
		
		this.jButtonCerrarToolBarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoCalculoDepreciacion"));
			
		this.jMenuItemCerrarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoCalculoDepreciacion"));
			
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jMenuItemDetalleCerrarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCalculoDepreciacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonGuardarCambiosTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoCalculoDepreciacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonGuardarCambiosToolBarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCalculoDepreciacion"));
		}
		
		this.jButtonCopiarToolBarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoCalculoDepreciacion"));
			
		this.jButtonVerFormToolBarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoCalculoDepreciacion"));
		
		this.jMenuItemGuardarCambiosTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoCalculoDepreciacion"));
			
		this.jMenuItemCopiarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoCalculoDepreciacion"));		
		
		this.jMenuItemVerFormTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoCalculoDepreciacion"));		
		
		
		this.jButtonGuardarCambiosTablaTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCalculoDepreciacion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoCalculoDepreciacion"));
			
		this.jMenuItemGuardarCambiosTablaTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCalculoDepreciacion"));		
		
		
		
		this.jButtonRecargarInformacionTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoCalculoDepreciacion"));
					
		this.jButtonRecargarInformacionToolBarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoCalculoDepreciacion"));
		
		this.jMenuItemRecargarInformacionTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoCalculoDepreciacion"));		
		
		
		
		this.jButtonAnterioresTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"AnterioresTipoCalculoDepreciacion"));
		
		
		this.jButtonAnterioresToolBarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoCalculoDepreciacion"));
		
		this.jMenuItemAnterioresTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoCalculoDepreciacion"));		
		
		
		this.jButtonSiguientesTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"SiguientesTipoCalculoDepreciacion"));
		
		
		this.jButtonSiguientesToolBarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoCalculoDepreciacion"));
			
		this.jMenuItemSiguientesTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoCalculoDepreciacion"));
			
		this.jMenuItemAbrirOrderByTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoCalculoDepreciacion"));
			
		this.jMenuItemMostrarOcultarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoCalculoDepreciacion"));
			
		this.jMenuItemDetalleAbrirOrderByTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoCalculoDepreciacion"));
			
		this.jMenuItemDetalleMostarOcultarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoCalculoDepreciacion"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoCalculoDepreciacion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoCalculoDepreciacion"));
			
		this.jMenuItemNuevoGuardarCambiosTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoCalculoDepreciacion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoCalculoDepreciacion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoCalculoDepreciacion"));

		this.jCheckBoxSeleccionadosTipoCalculoDepreciacion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoCalculoDepreciacion"));
		
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCalculoDepreciacion"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoCalculoDepreciacion"));
			
		this.jComboBoxTiposAccionesTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoCalculoDepreciacion"));
					
		this.jComboBoxTiposSeleccionarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoCalculoDepreciacion"));
			
		this.jTextFieldValorCampoGeneralTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoCalculoDepreciacion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonidTipoCalculoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCalculoDepreciacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonid_paisTipoCalculoDepreciacionUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoCalculoDepreciacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonid_paisTipoCalculoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoCalculoDepreciacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonnombreTipoCalculoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCalculoDepreciacionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdPaisTipoCalculoDepreciacion.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoCalculoDepreciacion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion!=null) {
				this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCalculoDepreciacion"));
				this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCalculoDepreciacion"));
				this.jInternalFrameReporteDinamicoTipoCalculoDepreciacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCalculoDepreciacion"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCalculoDepreciacion"));				
			//this.jButtonGenerarReporteDinamicoTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCalculoDepreciacion"));
			//this.jButtonGenerarExcelReporteDinamicoTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCalculoDepreciacion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoCalculoDepreciacion!=null) {
				this.jInternalFrameImportacionTipoCalculoDepreciacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCalculoDepreciacion"));
				this.jInternalFrameImportacionTipoCalculoDepreciacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCalculoDepreciacion"));
				this.jInternalFrameImportacionTipoCalculoDepreciacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCalculoDepreciacion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoCalculoDepreciacion"));
			
			this.jButtonAbrirOrderByToolBarTipoCalculoDepreciacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoCalculoDepreciacion"));			
			
			if(this.jInternalFrameOrderByTipoCalculoDepreciacion!=null) {
				this.jInternalFrameOrderByTipoCalculoDepreciacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCalculoDepreciacion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTabbedPaneRelacionesTipoCalculoDepreciacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCalculoDepreciacion"));
		
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
            		closingInternalFrameTipoCalculoDepreciacion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoCalculoDepreciacion = (JInternalFrameBase)event.getSource();
	            	
	            TipoCalculoDepreciacionBeanSwingJInternalFrame jInternalFrameParent=(TipoCalculoDepreciacionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCalculoDepreciacion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoCalculoDepreciacionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoCalculoDepreciacion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoCalculoDepreciacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoCalculoDepreciacion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoCalculoDepreciacion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCalculoDepreciacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCalculoDepreciacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCalculoDepreciacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoCalculoDepreciacion";
		inputMap = this.jButtonNuevoTipoCalculoDepreciacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoCalculoDepreciacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCalculoDepreciacionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCalculoDepreciacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCalculoDepreciacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCalculoDepreciacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoCalculoDepreciacion";
		inputMap = this.jButtonNuevoRelacionesTipoCalculoDepreciacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoCalculoDepreciacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCalculoDepreciacionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoCalculoDepreciacion";
		inputMap = this.jButtonModificarTipoCalculoDepreciacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoCalculoDepreciacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoCalculoDepreciacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoCalculoDepreciacion";
		inputMap = this.jButtonActualizarTipoCalculoDepreciacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoCalculoDepreciacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoCalculoDepreciacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoCalculoDepreciacion";
		inputMap = this.jButtonEliminarTipoCalculoDepreciacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoCalculoDepreciacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoCalculoDepreciacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoCalculoDepreciacion";
		inputMap = this.jButtonCancelarTipoCalculoDepreciacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoCalculoDepreciacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoCalculoDepreciacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoCalculoDepreciacion";
		inputMap = this.jButtonCerrarTipoCalculoDepreciacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoCalculoDepreciacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoCalculoDepreciacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonGuardarCambiosTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoCalculoDepreciacion";
		inputMap = this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonGuardarCambiosTipoCalculoDepreciacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonGuardarCambiosTipoCalculoDepreciacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoCalculoDepreciacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoCalculoDepreciacion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoCalculoDepreciacionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoCalculoDepreciacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoCalculoDepreciacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoCalculoDepreciacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoCalculoDepreciacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoCalculoDepreciacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoCalculoDepreciacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonidTipoCalculoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCalculoDepreciacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonid_paisTipoCalculoDepreciacionUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoCalculoDepreciacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonid_paisTipoCalculoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoCalculoDepreciacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jButtonnombreTipoCalculoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCalculoDepreciacionBusqueda"));
		
		
		this.jButtonFK_IdPaisTipoCalculoDepreciacion.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoCalculoDepreciacion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoCalculoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoCalculoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoCalculoDepreciacionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoCalculoDepreciacion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoCalculoDepreciacion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoCalculoDepreciacion tipocalculodepreciacionAux:this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions()) {
					tipocalculodepreciacionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCalculoDepreciacion tipocalculodepreciacionAux:tipocalculodepreciacions) {
					tipocalculodepreciacionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoCalculoDepreciacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCalculoDepreciacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCalculoDepreciacion tipocalculodepreciacionAux:this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions()) {
						tipocalculodepreciacionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCalculoDepreciacion tipocalculodepreciacionAux:tipocalculodepreciacions) {
						tipocalculodepreciacionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoCalculoDepreciacion tipocalculodepreciacionAux:this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCalculoDepreciacion tipocalculodepreciacionAux:tipocalculodepreciacions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCalculoDepreciacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCalculoDepreciacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCalculoDepreciacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCalculoDepreciacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoCalculoDepreciacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCalculoDepreciacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoCalculoDepreciacion.getSelectedRows();
			
			TipoCalculoDepreciacion tipocalculodepreciacionLocal=new TipoCalculoDepreciacion();
			
			//this.seleccionarTodosTipoCalculoDepreciacion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocalculodepreciacionLocal =(TipoCalculoDepreciacion) this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions().toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocalculodepreciacionLocal =(TipoCalculoDepreciacion) this.tipocalculodepreciacions.toArray()[this.jTableDatosTipoCalculoDepreciacion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocalculodepreciacionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCalculoDepreciacion tipocalculodepreciacionAux:this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions()) {
						tipocalculodepreciacionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCalculoDepreciacion tipocalculodepreciacionAux:tipocalculodepreciacions) {
						tipocalculodepreciacionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoCalculoDepreciacion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCalculoDepreciacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCalculoDepreciacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCalculoDepreciacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoCalculoDepreciacionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoCalculoDepreciacionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoCalculoDepreciacionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoCalculoDepreciacion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoCalculoDepreciacion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCalculoDepreciacion tipocalculodepreciacionAux:this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions()) {
				
						if(sTipoSeleccionar.equals(TipoCalculoDepreciacionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocalculodepreciacionAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCalculoDepreciacion tipocalculodepreciacionAux:tipocalculodepreciacions) {
					
						if(sTipoSeleccionar.equals(TipoCalculoDepreciacionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocalculodepreciacionAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCalculoDepreciacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoCalculoDepreciacionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoCalculoDepreciacion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoCalculoDepreciacion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoCalculoDepreciacion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoCalculoDepreciacion) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoCalculoDepreciacion(conSplash);
				
					this.generarReporteTipoCalculoDepreciacionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCalculoDepreciacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoCalculoDepreciacionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoCalculoDepreciacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCalculoDepreciacionsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoCalculoDepreciacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCalculoDepreciacionsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoCalculoDepreciacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCalculoDepreciacion();
				
				this.exportarTipoCalculoDepreciacionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCalculoDepreciacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoCalculoDepreciacions();
				//this.importarTipoCalculoDepreciacions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCalculoDepreciacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCalculoDepreciacion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoCalculoDepreciacionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoCalculoDepreciacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Calculo Depreciacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoCalculoDepreciacion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoCalculoDepreciacion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoCalculoDepreciacion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Calculo Depreciacion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCalculoDepreciacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoCalculoDepreciacion();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoCalculoDepreciacion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoCalculoDepreciacionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoCalculoDepreciacion();
			
			if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoCalculoDepreciacion> tipocalculodepreciacionsSeleccionados=new ArrayList<TipoCalculoDepreciacion>();		
			TipoCalculoDepreciacion tipocalculodepreciacion=new TipoCalculoDepreciacion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoCalculoDepreciacion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoCalculoDepreciacion.getSelectedItem();
			
			
			
			
			tipocalculodepreciacionsSeleccionados=this.getTipoCalculoDepreciacionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocalculodepreciacionsSeleccionados.size()==1) {
				for(TipoCalculoDepreciacion tipocalculodepreciacionAux:tipocalculodepreciacionsSeleccionados) {
					tipocalculodepreciacion=tipocalculodepreciacionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoCalculoDepreciacion();
			
      		//this.finishProcessTipoCalculoDepreciacion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoCalculoDepreciacionReturnGeneral() throws Exception {
		if(this.tipocalculodepreciacionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocalculodepreciacionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocalculodepreciacionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocalculodepreciacionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocalculodepreciacionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocalculodepreciacionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoCalculoDepreciacion(false);
		}
		
		if(this.tipocalculodepreciacionReturnGeneral.getConRetornoLista() || this.tipocalculodepreciacionReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocalculodepreciacionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocalculodepreciacionLogic.setTipoCalculoDepreciacions(this.tipocalculodepreciacionReturnGeneral.getTipoCalculoDepreciacions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocalculodepreciacionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocalculodepreciacionLogic.setTipoCalculoDepreciacion(this.tipocalculodepreciacionReturnGeneral.getTipoCalculoDepreciacion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoCalculoDepreciacion(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoCalculoDepreciacion() throws Exception {
		
		
	}
	
	public ArrayList<TipoCalculoDepreciacion> getTipoCalculoDepreciacionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoCalculoDepreciacion> tipocalculodepreciacionsSeleccionados=new ArrayList<TipoCalculoDepreciacion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoCalculoDepreciacion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoCalculoDepreciacion tipocalculodepreciacionAux:tipocalculodepreciacionLogic.getTipoCalculoDepreciacions()) {
					if(tipocalculodepreciacionAux.getIsSelected()) {
						tipocalculodepreciacionsSeleccionados.add(tipocalculodepreciacionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCalculoDepreciacion tipocalculodepreciacionAux:this.tipocalculodepreciacions) {
					if(tipocalculodepreciacionAux.getIsSelected()) {
						tipocalculodepreciacionsSeleccionados.add(tipocalculodepreciacionAux);				
					}
				}
			}
			
			if(tipocalculodepreciacionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocalculodepreciacionsSeleccionados.addAll(this.tipocalculodepreciacionLogic.getTipoCalculoDepreciacions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocalculodepreciacionsSeleccionados.addAll(this.tipocalculodepreciacions);				
					}
				}
			}
		} else {
			tipocalculodepreciacionsSeleccionados.add(this.tipocalculodepreciacion);
		}
		
		return tipocalculodepreciacionsSeleccionados;
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
	
	public void generarReporteTipoCalculoDepreciacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoCalculoDepreciacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoCalculoDepreciacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCalculoDepreciacionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCalculoDepreciacionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Calculo Depreciacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoCalculoDepreciacionsSeleccionados() throws Exception {
		ArrayList<TipoCalculoDepreciacion> tipocalculodepreciacionsSeleccionados=new ArrayList<TipoCalculoDepreciacion>();		
		
		tipocalculodepreciacionsSeleccionados=this.getTipoCalculoDepreciacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoCalculoDepreciacions("Todos",tipocalculodepreciacionsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoCalculoDepreciacionsSeleccionados() throws Exception {
		ArrayList<TipoCalculoDepreciacion> tipocalculodepreciacionsSeleccionados=new ArrayList<TipoCalculoDepreciacion>();		
		
		tipocalculodepreciacionsSeleccionados=this.getTipoCalculoDepreciacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoCalculoDepreciacions("Todos",tipocalculodepreciacionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoCalculoDepreciacionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoCalculoDepreciacion> tipocalculodepreciacionsSeleccionados=new ArrayList<TipoCalculoDepreciacion>();
		
		tipocalculodepreciacionsSeleccionados=this.getTipoCalculoDepreciacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoCalculoDepreciacions("Todos",tipocalculodepreciacionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoCalculoDepreciacionsSeleccionados() throws Exception {
		ArrayList<TipoCalculoDepreciacion> tipocalculodepreciacionsSeleccionados=new ArrayList<TipoCalculoDepreciacion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoCalculoDepreciacion();
		
		
		tipocalculodepreciacionsSeleccionados=this.getTipoCalculoDepreciacionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoCalculoDepreciacion();
		
		
		//this.generarReporteTipoCalculoDepreciacions("Todos",tipocalculodepreciacionsSeleccionados ,tipocalculodepreciacionImplementable,tipocalculodepreciacionImplementableHome);
	}
	
	public void mostrarImportacionTipoCalculoDepreciacions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoCalculoDepreciacion();
		
		this.abrirFrameImportacionTipoCalculoDepreciacion();		
		
			
		//this.generarReporteTipoCalculoDepreciacions("Todos",tipocalculodepreciacionsSeleccionados ,tipocalculodepreciacionImplementable,tipocalculodepreciacionImplementableHome);
	}
	
	public void importarTipoCalculoDepreciacions() throws Exception {		
	
	}
	
	public void exportarTipoCalculoDepreciacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoCalculoDepreciacionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoCalculoDepreciacionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoCalculoDepreciacionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Calculo Depreciacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoCalculoDepreciacionsSeleccionados() throws Exception {
		ArrayList<TipoCalculoDepreciacion> tipocalculodepreciacionsSeleccionados=new ArrayList<TipoCalculoDepreciacion>();		
		
		tipocalculodepreciacionsSeleccionados=this.getTipoCalculoDepreciacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocalculodepreciacion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoCalculoDepreciacion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoCalculoDepreciacion tipocalculodepreciacionAux:tipocalculodepreciacionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoCalculoDepreciacion(tipocalculodepreciacionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocalculodepreciacionAux.setsDetalleGeneralEntityReporte(tipocalculodepreciacionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Calculo Depreciacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoCalculoDepreciacion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoCalculoDepreciacionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCalculoDepreciacionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCalculoDepreciacionConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCalculoDepreciacionConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoCalculoDepreciacion(TipoCalculoDepreciacion tipocalculodepreciacion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocalculodepreciacion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocalculodepreciacion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocalculodepreciacion.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocalculodepreciacion.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoCalculoDepreciacionsSeleccionados() throws Exception {
		ArrayList<TipoCalculoDepreciacion> tipocalculodepreciacionsSeleccionados=new ArrayList<TipoCalculoDepreciacion>();		
		
		tipocalculodepreciacionsSeleccionados=this.getTipoCalculoDepreciacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocalculodepreciacion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoCalculoDepreciacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoCalculoDepreciacion(row);				
				iRow++;
			}				
			
			for(TipoCalculoDepreciacion tipocalculodepreciacionAux:tipocalculodepreciacionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoCalculoDepreciacion(tipocalculodepreciacionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Calculo Depreciacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoCalculoDepreciacionsSeleccionados() throws Exception {
		ArrayList<TipoCalculoDepreciacion> tipocalculodepreciacionsSeleccionados=new ArrayList<TipoCalculoDepreciacion>();		
		
		tipocalculodepreciacionsSeleccionados=this.getTipoCalculoDepreciacionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocalculodepreciacion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocalculodepreciacions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocalculodepreciacion");
			//elementRoot.appendChild(element);
		
			for(TipoCalculoDepreciacion tipocalculodepreciacionAux:tipocalculodepreciacionsSeleccionados) {
				element = document.createElement("tipocalculodepreciacion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoCalculoDepreciacion(tipocalculodepreciacionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Calculo Depreciacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoCalculoDepreciacion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCalculoDepreciacionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCalculoDepreciacionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoCalculoDepreciacionConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCalculoDepreciacionConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoCalculoDepreciacion(TipoCalculoDepreciacion tipocalculodepreciacion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocalculodepreciacion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocalculodepreciacion.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocalculodepreciacion.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoCalculoDepreciacion(TipoCalculoDepreciacion tipocalculodepreciacion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoCalculoDepreciacionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocalculodepreciacion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoCalculoDepreciacionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocalculodepreciacion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpais_descripcion = document.createElement(TipoCalculoDepreciacionConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(tipocalculodepreciacion.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementnombre = document.createElement(TipoCalculoDepreciacionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipocalculodepreciacion.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoCalculoDepreciacionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoCalculoDepreciacion> tipocalculodepreciacionsSeleccionados=new ArrayList<TipoCalculoDepreciacion>();
		
		tipocalculodepreciacionsSeleccionados=this.getTipoCalculoDepreciacionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoCalculoDepreciacion(tipocalculodepreciacionsSeleccionados);
		
		this.generarReporteTipoCalculoDepreciacions("Todos",tipocalculodepreciacionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoCalculoDepreciacion(ArrayList<TipoCalculoDepreciacion> tipocalculodepreciacionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoCalculoDepreciacion tipocalculodepreciacionAux:tipocalculodepreciacionsSeleccionados) {
				tipocalculodepreciacionAux.setsDetalleGeneralEntityReporte(tipocalculodepreciacionAux.toString());
			
				if(sTipoSeleccionar.equals(TipoCalculoDepreciacionConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					tipocalculodepreciacionAux.setsDescripcionGeneralEntityReporte1(tipocalculodepreciacionAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoCalculoDepreciacionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipocalculodepreciacionAux.setsDescripcionGeneralEntityReporte1(tipocalculodepreciacionAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCalculoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoCalculoDepreciacion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoCalculoDepreciacion=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion=true;
				this.isVisibilidadCeldaGuardarCambiosTipoCalculoDepreciacion=true;
			}
			
			this.isVisibilidadCeldaModificarTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaActualizarTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaEliminarTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaCancelarTipoCalculoDepreciacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCalculoDepreciacion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCalculoDepreciacion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaModificarTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaActualizarTipoCalculoDepreciacion=true;
			this.isVisibilidadCeldaEliminarTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaCancelarTipoCalculoDepreciacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCalculoDepreciacion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCalculoDepreciacion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaModificarTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaActualizarTipoCalculoDepreciacion=true;
			this.isVisibilidadCeldaEliminarTipoCalculoDepreciacion=true;
			this.isVisibilidadCeldaCancelarTipoCalculoDepreciacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCalculoDepreciacion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCalculoDepreciacion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaModificarTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaActualizarTipoCalculoDepreciacion=true;
			this.isVisibilidadCeldaEliminarTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaCancelarTipoCalculoDepreciacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCalculoDepreciacion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCalculoDepreciacion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoCalculoDepreciacion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCalculoDepreciacion=true;
			this.isVisibilidadCeldaModificarTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaActualizarTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaEliminarTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaCancelarTipoCalculoDepreciacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCalculoDepreciacion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCalculoDepreciacion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaActualizarTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaEliminarTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaCancelarTipoCalculoDepreciacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCalculoDepreciacion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCalculoDepreciacion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaModificarTipoCalculoDepreciacion=true;
			this.isVisibilidadCeldaActualizarTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaEliminarTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaCancelarTipoCalculoDepreciacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCalculoDepreciacion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCalculoDepreciacion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoCalculoDepreciacionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoCalculoDepreciacion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCalculoDepreciacion=true;
		} else {
			this.actualizarEstadoPanelsTipoCalculoDepreciacion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoCalculoDepreciacion=false;
			//this.isVisibilidadCeldaVerFormTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaDuplicarTipoCalculoDepreciacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocalculodepreciacionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCalculoDepreciacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
			if(!tipocalculodepreciacionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion=false;												
			}
			
			this.jButtonCerrarTipoCalculoDepreciacion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCalculoDepreciacion=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocalculodepreciacion)) {
			this.isVisibilidadCeldaActualizarTipoCalculoDepreciacion=false;
			this.isVisibilidadCeldaEliminarTipoCalculoDepreciacion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCalculoDepreciacion() {
	}
	
	public void actualizarEstadoPanelsTipoCalculoDepreciacion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoCalculoDepreciacion!=null) {
				this.jScrollPanelDatosEdicionTipoCalculoDepreciacion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCalculoDepreciacion!=null) {
				this.jTabbedPaneBusquedasTipoCalculoDepreciacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCalculoDepreciacion!=null) {
				this.jScrollPanelDatosTipoCalculoDepreciacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCalculoDepreciacion!=null) {
				this.jPanelPaginacionTipoCalculoDepreciacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCalculoDepreciacion!=null) {
				this.jPanelParametrosReportesTipoCalculoDepreciacion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoCalculoDepreciacion!=null) {
				this.jScrollPanelDatosEdicionTipoCalculoDepreciacion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCalculoDepreciacion!=null) {
				this.jTabbedPaneBusquedasTipoCalculoDepreciacion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoCalculoDepreciacion!=null) {
				this.jScrollPanelDatosTipoCalculoDepreciacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCalculoDepreciacion!=null) {
				this.jPanelPaginacionTipoCalculoDepreciacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCalculoDepreciacion!=null) {
				this.jPanelParametrosReportesTipoCalculoDepreciacion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoCalculoDepreciacion!=null) {
				this.jScrollPanelDatosEdicionTipoCalculoDepreciacion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCalculoDepreciacion!=null) {
				this.jTabbedPaneBusquedasTipoCalculoDepreciacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCalculoDepreciacion!=null) {
				this.jScrollPanelDatosTipoCalculoDepreciacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCalculoDepreciacion!=null) {
				this.jPanelPaginacionTipoCalculoDepreciacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCalculoDepreciacion!=null) {
				this.jPanelParametrosReportesTipoCalculoDepreciacion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoCalculoDepreciacion!=null) {
				this.jScrollPanelDatosEdicionTipoCalculoDepreciacion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCalculoDepreciacion!=null) {
				this.jTabbedPaneBusquedasTipoCalculoDepreciacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCalculoDepreciacion!=null) {
				this.jScrollPanelDatosTipoCalculoDepreciacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCalculoDepreciacion!=null) {
				this.jPanelPaginacionTipoCalculoDepreciacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCalculoDepreciacion!=null) {
				this.jPanelParametrosReportesTipoCalculoDepreciacion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoCalculoDepreciacion!=null) {
				this.jScrollPanelDatosEdicionTipoCalculoDepreciacion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCalculoDepreciacion!=null) {
				this.jTabbedPaneBusquedasTipoCalculoDepreciacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCalculoDepreciacion!=null) {
				this.jScrollPanelDatosTipoCalculoDepreciacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCalculoDepreciacion!=null) {
				this.jPanelPaginacionTipoCalculoDepreciacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCalculoDepreciacion!=null) {
				this.jPanelParametrosReportesTipoCalculoDepreciacion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoCalculoDepreciacion!=null) {
				this.jScrollPanelDatosEdicionTipoCalculoDepreciacion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCalculoDepreciacion!=null) {
				this.jTabbedPaneBusquedasTipoCalculoDepreciacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCalculoDepreciacion!=null) {
				this.jScrollPanelDatosTipoCalculoDepreciacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCalculoDepreciacion!=null) {
				this.jPanelPaginacionTipoCalculoDepreciacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCalculoDepreciacion!=null) {
				this.jPanelParametrosReportesTipoCalculoDepreciacion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoCalculoDepreciacion!=null) {
				this.jScrollPanelDatosEdicionTipoCalculoDepreciacion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCalculoDepreciacion!=null) {
				this.jTabbedPaneBusquedasTipoCalculoDepreciacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCalculoDepreciacion!=null) {
				this.jScrollPanelDatosTipoCalculoDepreciacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCalculoDepreciacion!=null) {
				this.jPanelPaginacionTipoCalculoDepreciacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCalculoDepreciacion!=null) {
				this.jPanelParametrosReportesTipoCalculoDepreciacion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoCalculoDepreciacion!=null) {
					this.jTabbedPaneBusquedasTipoCalculoDepreciacion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoCalculoDepreciacion!=null) {
				this.jPanelParametrosReportesTipoCalculoDepreciacion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCalculoDepreciacion!=null) {
				this.jTabbedPaneBusquedasTipoCalculoDepreciacion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoCalculoDepreciacion!=null) {
				this.jPanelParametrosReportesTipoCalculoDepreciacion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasTipoCalculoDepreciacion.remove(jPanelFK_IdPaisTipoCalculoDepreciacion);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoCalculoDepreciacionSessionBean tipocalculodepreciacionSessionBean=new TipoCalculoDepreciacionSessionBean();
		
		if(this.tipocalculodepreciacionSessionBean==null) {
			this.tipocalculodepreciacionSessionBean=new TipoCalculoDepreciacionSessionBean();
		}
		
		this.tipocalculodepreciacionSessionBean.setsUltimaBusquedaTipoCalculoDepreciacion(this.getsAccionBusqueda());
		this.tipocalculodepreciacionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocalculodepreciacionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			tipocalculodepreciacionSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoCalculoDepreciacionSessionBean tipocalculodepreciacionSessionBean=new TipoCalculoDepreciacionSessionBean();
		
		if(this.tipocalculodepreciacionSessionBean==null) {
			this.tipocalculodepreciacionSessionBean=new TipoCalculoDepreciacionSessionBean();
		}
		
		if(this.tipocalculodepreciacionSessionBean.getsUltimaBusquedaTipoCalculoDepreciacion()!=null&&!this.tipocalculodepreciacionSessionBean.getsUltimaBusquedaTipoCalculoDepreciacion().equals("")) {
			this.setsAccionBusqueda(tipocalculodepreciacionSessionBean.getsUltimaBusquedaTipoCalculoDepreciacion());
			this.setiNumeroPaginacion(tipocalculodepreciacionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocalculodepreciacionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(tipocalculodepreciacionSessionBean.getid_pais());
				tipocalculodepreciacionSessionBean.setid_pais(-1L);
			}
		}
		
		this.tipocalculodepreciacionSessionBean.setsUltimaBusquedaTipoCalculoDepreciacion("");
		this.tipocalculodepreciacionSessionBean.setiNumeroPaginacion(TipoCalculoDepreciacionConstantesFunciones.INUMEROPAGINACION);
		this.tipocalculodepreciacionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoCalculoDepreciacion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoCalculoDepreciacion() {
		this.updateBorderResaltarBusquedasFormularioTipoCalculoDepreciacion();
		this.updateVisibilidadBusquedasFormularioTipoCalculoDepreciacion();
		this.updateHabilitarBusquedasFormularioTipoCalculoDepreciacion();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoCalculoDepreciacion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoCalculoDepreciacion.getComponents().length>0) {
	

		if(this.tipocalculodepreciacionConstantesFunciones.resaltarFK_IdPaisTipoCalculoDepreciacion!=null) {
			index= this.jTabbedPaneBusquedasTipoCalculoDepreciacion.indexOfComponent(this.jPanelFK_IdPaisTipoCalculoDepreciacion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCalculoDepreciacion.getComponent(index);
				jPanel.setBorder(this.tipocalculodepreciacionConstantesFunciones.resaltarFK_IdPaisTipoCalculoDepreciacion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoCalculoDepreciacion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoCalculoDepreciacion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoCalculoDepreciacion.indexOfComponent(this.jPanelFK_IdPaisTipoCalculoDepreciacion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCalculoDepreciacion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipocalculodepreciacionConstantesFunciones.mostrarFK_IdPaisTipoCalculoDepreciacion);
			if(!this.tipocalculodepreciacionConstantesFunciones.mostrarFK_IdPaisTipoCalculoDepreciacion && index>-1) {
				this.jTabbedPaneBusquedasTipoCalculoDepreciacion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoCalculoDepreciacion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoCalculoDepreciacion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoCalculoDepreciacion.indexOfComponent(this.jPanelFK_IdPaisTipoCalculoDepreciacion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCalculoDepreciacion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipocalculodepreciacionConstantesFunciones.activarFK_IdPaisTipoCalculoDepreciacion);
				this.jTabbedPaneBusquedasTipoCalculoDepreciacion.setEnabledAt(index,this.tipocalculodepreciacionConstantesFunciones.activarFK_IdPaisTipoCalculoDepreciacion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoCalculoDepreciacion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasTipoCalculoDepreciacion.indexOfComponent(this.jPanelFK_IdPaisTipoCalculoDepreciacion);

			this.jTabbedPaneBusquedasTipoCalculoDepreciacion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCalculoDepreciacion.getComponent(index);

			this.tipocalculodepreciacionConstantesFunciones.setResaltarFK_IdPaisTipoCalculoDepreciacion(resaltar);

			jPanel.setBorder(this.tipocalculodepreciacionConstantesFunciones.resaltarFK_IdPaisTipoCalculoDepreciacion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoCalculoDepreciacion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoCalculoDepreciacion() throws Exception {

		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoCalculoDepreciacion();
		this.updateVisibilidadResaltarControlesFormularioTipoCalculoDepreciacion();
		this.updateHabilitarResaltarControlesFormularioTipoCalculoDepreciacion();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoCalculoDepreciacion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocalculodepreciacionConstantesFunciones.resaltaridTipoCalculoDepreciacion!=null && this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTextFieldidTipoCalculoDepreciacion.setBorder(this.tipocalculodepreciacionConstantesFunciones.resaltaridTipoCalculoDepreciacion);}
		if(this.tipocalculodepreciacionConstantesFunciones.resaltarid_paisTipoCalculoDepreciacion!=null && this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxid_paisTipoCalculoDepreciacion.setBorder(this.tipocalculodepreciacionConstantesFunciones.resaltarid_paisTipoCalculoDepreciacion);}
		if(this.tipocalculodepreciacionConstantesFunciones.resaltarnombreTipoCalculoDepreciacion!=null && this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTextAreanombreTipoCalculoDepreciacion.setBorder(this.tipocalculodepreciacionConstantesFunciones.resaltarnombreTipoCalculoDepreciacion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoCalculoDepreciacion() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {
	
		//this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTextFieldidTipoCalculoDepreciacion.setVisible(this.tipocalculodepreciacionConstantesFunciones.mostraridTipoCalculoDepreciacion);
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jPanelidTipoCalculoDepreciacion.setVisible(this.tipocalculodepreciacionConstantesFunciones.mostraridTipoCalculoDepreciacion);
		//this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxid_paisTipoCalculoDepreciacion.setVisible(this.tipocalculodepreciacionConstantesFunciones.mostrarid_paisTipoCalculoDepreciacion);
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jPanelid_paisTipoCalculoDepreciacion.setVisible(this.tipocalculodepreciacionConstantesFunciones.mostrarid_paisTipoCalculoDepreciacion);
		//this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTextAreanombreTipoCalculoDepreciacion.setVisible(this.tipocalculodepreciacionConstantesFunciones.mostrarnombreTipoCalculoDepreciacion);
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jPanelnombreTipoCalculoDepreciacion.setVisible(this.tipocalculodepreciacionConstantesFunciones.mostrarnombreTipoCalculoDepreciacion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoCalculoDepreciacion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCalculoDepreciacion!=null) {
	
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTextFieldidTipoCalculoDepreciacion.setEnabled(this.tipocalculodepreciacionConstantesFunciones.activaridTipoCalculoDepreciacion);
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jComboBoxid_paisTipoCalculoDepreciacion.setEnabled(this.tipocalculodepreciacionConstantesFunciones.activarid_paisTipoCalculoDepreciacion);
		this.jInternalFrameDetalleFormTipoCalculoDepreciacion.jTextAreanombreTipoCalculoDepreciacion.setEnabled(this.tipocalculodepreciacionConstantesFunciones.activarnombreTipoCalculoDepreciacion);
		}
	}
	
		
}