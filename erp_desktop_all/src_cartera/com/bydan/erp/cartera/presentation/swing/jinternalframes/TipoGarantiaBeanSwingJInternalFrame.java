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

import com.bydan.erp.cartera.util.TipoGarantiaConstantesFunciones;
import com.bydan.erp.cartera.util.TipoGarantiaParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoGarantiaParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoGarantiaBean;
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
public class TipoGarantiaBeanSwingJInternalFrame extends TipoGarantiaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoGarantiaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoGarantia> tipogarantiaValidator = new ClassValidator<TipoGarantia>(TipoGarantia.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoGarantia tipogarantia;	
	public TipoGarantia tipogarantiaAux;
	public TipoGarantia tipogarantiaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoGarantia tipogarantiaTotales;
	public Long idTipoGarantiaActual;
	public Long iIdNuevoTipoGarantia=0L;
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
	
	public Boolean isPermisoTodoTipoGarantia;
	public Boolean isPermisoNuevoTipoGarantia;
	public Boolean isPermisoActualizarTipoGarantia;
	public Boolean isPermisoActualizarOriginalTipoGarantia;
	public Boolean isPermisoEliminarTipoGarantia;
	public Boolean isPermisoGuardarCambiosTipoGarantia;
	public Boolean isPermisoConsultaTipoGarantia;
	public Boolean isPermisoBusquedaTipoGarantia;
	public Boolean isPermisoReporteTipoGarantia;
	public Boolean isPermisoPaginacionMedioTipoGarantia;
	public Boolean isPermisoPaginacionAltoTipoGarantia;
	public Boolean isPermisoPaginacionTodoTipoGarantia;
	public Boolean isPermisoCopiarTipoGarantia;
	public Boolean isPermisoVerFormTipoGarantia;
	public Boolean isPermisoDuplicarTipoGarantia;
	public Boolean isPermisoOrdenTipoGarantia;
	
	
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
	
	public TipoGarantiaParameterReturnGeneral tipogarantiaReturnGeneral;
	public TipoGarantiaParameterReturnGeneral tipogarantiaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoGarantia=false;
	public Boolean esParaAccionDesdeFormularioTipoGarantia=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoGarantiaLogic tipogarantiaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoGarantia tipogarantiaBean;
	public TipoGarantiaConstantesFunciones tipogarantiaConstantesFunciones;
	//public TipoGarantiaParameterReturnGeneral tipogarantiaReturnGeneral;
	
	//FK
	
	public PaisLogic paisLogic;
	
	//PARAMETROS
	
	
	//public List<TipoGarantia> tipogarantias;	
	//public List<TipoGarantia> tipogarantiasEliminados;
	//public List<TipoGarantia> tipogarantiasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoGarantia=false;
	public Boolean isVisibilidadCeldaDuplicarTipoGarantia=true;
	public Boolean isVisibilidadCeldaCopiarTipoGarantia=true;
	public Boolean isVisibilidadCeldaVerFormTipoGarantia=true;
	public Boolean isVisibilidadCeldaOrdenTipoGarantia=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoGarantia=false;
	public Boolean isVisibilidadCeldaModificarTipoGarantia=false;
	public Boolean isVisibilidadCeldaActualizarTipoGarantia=false;
	public Boolean isVisibilidadCeldaEliminarTipoGarantia=false;
	public Boolean isVisibilidadCeldaCancelarTipoGarantia=false;
	public Boolean isVisibilidadCeldaGuardarTipoGarantia=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoGarantia=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdPais=false;
	
	public Long getiIdNuevoTipoGarantia() {
		return this.iIdNuevoTipoGarantia;
	}

	public void setiIdNuevoTipoGarantia(Long iIdNuevoTipoGarantia) {
		this.iIdNuevoTipoGarantia = iIdNuevoTipoGarantia;
	}
	
	public Long getidTipoGarantiaActual() {
		return this.idTipoGarantiaActual;
	}

	public void setidTipoGarantiaActual(Long idTipoGarantiaActual) {
		this.idTipoGarantiaActual = idTipoGarantiaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoGarantia gettipogarantia() {
		return this.tipogarantia;
	}

	public void settipogarantia(TipoGarantia tipogarantia) {
		this.tipogarantia = tipogarantia;
	}
	
	public TipoGarantia gettipogarantiaAux() {
		return this.tipogarantiaAux;
	}

	public void settipogarantiaAux(TipoGarantia tipogarantiaAux) {
		this.tipogarantiaAux = tipogarantiaAux;
	}				
	
	public TipoGarantia gettipogarantiaAnterior() {
		return this.tipogarantiaAnterior;
	}

	public void settipogarantiaAnterior(TipoGarantia tipogarantiaAnterior) {
		this.tipogarantiaAnterior = tipogarantiaAnterior;
	}	
	
	public TipoGarantia gettipogarantiaTotales() {
		return this.tipogarantiaTotales;
	}

	public void settipogarantiaTotales(TipoGarantia tipogarantiaTotales) {
		this.tipogarantiaTotales = tipogarantiaTotales;
	}	
	
	public TipoGarantia gettipogarantiaBean() {
		return this.tipogarantiaBean;
	}

	public void settipogarantiaBean(TipoGarantia tipogarantiaBean) {
		this.tipogarantiaBean = tipogarantiaBean;
	}	
	
	public TipoGarantiaParameterReturnGeneral gettipogarantiaReturnGeneral() {
		return this.tipogarantiaReturnGeneral;
	}

	public void settipogarantiaReturnGeneral(TipoGarantiaParameterReturnGeneral tipogarantiaReturnGeneral) {
		this.tipogarantiaReturnGeneral = tipogarantiaReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
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
	
	
	public TipoGarantiaLogic getTipoGarantiaLogic()	{		
		return tipogarantiaLogic;
	}

	public void setTipoGarantiaLogic(TipoGarantiaLogic tipogarantiaLogic) {
		this.tipogarantiaLogic = tipogarantiaLogic;
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
	
	public Boolean getIsEsNuevoTipoGarantia() {
		return isEsNuevoTipoGarantia;
	}

	public void setIsEsNuevoTipoGarantia(Boolean isEsNuevoTipoGarantia) {
		this.isEsNuevoTipoGarantia = isEsNuevoTipoGarantia;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoGarantia() {
		return esParaAccionDesdeFormularioTipoGarantia;
	}
	
	public void setEsParaAccionDesdeFormularioTipoGarantia(Boolean esParaAccionDesdeFormularioTipoGarantia) {
		this.esParaAccionDesdeFormularioTipoGarantia = esParaAccionDesdeFormularioTipoGarantia;
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

			if(this.tipogarantiaSessionBean==null) {
				this.tipogarantiaSessionBean=new TipoGarantiaSessionBean();
			}

			if(!this.tipogarantiaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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
					paisLogic.getEntityWithConnection(tipogarantiaSessionBean.getlidPaisActual());
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

					if(this.tipogarantia!=null) {
						this.tipogarantia.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormTipoGarantia!=null) {
						this.jInternalFrameDetalleFormTipoGarantia.jComboBoxid_paisTipoGarantia.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisTipoGarantia.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormTipoGarantia!=null) {
						if(this.jInternalFrameDetalleFormTipoGarantia.jComboBoxid_paisTipoGarantia.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoGarantia.jComboBoxid_paisTipoGarantia.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisTipoGarantia!=null) {
						jComboBoxid_paisFK_IdPaisTipoGarantia.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisTipoGarantia!=null) {
							//jComboBoxid_paisFK_IdPaisTipoGarantia.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisTipoGarantia.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisTipoGarantia.setSelectedIndex(0);
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
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisTipoGarantiaGenerico)throws Exception
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
				jComboBoxid_paisTipoGarantiaGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisTipoGarantiaGenerico!=null && jComboBoxid_paisTipoGarantiaGenerico.getItemCount()>0) {
					jComboBoxid_paisTipoGarantiaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(TipoGarantia tipogarantia,JComboBox jComboBoxid_paisTipoGarantiaGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisTipoGarantiaGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormTipoGarantia.jComboBoxid_paisTipoGarantia.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisTipoGarantiaGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				tipogarantia.setid_pais(paisAux.getId());
				tipogarantia.setpais_descripcion(TipoGarantiaConstantesFunciones.getPaisDescripcion(paisAux));
				tipogarantia.setPais(paisAux);			}
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

					if(!TipoGarantiaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoGarantia!=null) { 
							this.jInternalFrameDetalleFormTipoGarantia.jComboBoxid_paisTipoGarantia.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormTipoGarantia.jComboBoxid_paisTipoGarantia.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoGarantia!=null) { 
					}

					if(!TipoGarantiaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoGarantiaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoGarantia.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisTipoGarantia.addItem(pais);
							}
						}

						if(!TipoGarantiaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoGarantia!=null) {
							this.jInternalFrameDetalleFormTipoGarantia.jComboBoxid_paisTipoGarantia.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoGarantia!=null) {
							this.jInternalFrameDetalleFormTipoGarantia.jComboBoxid_paisTipoGarantia.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisTipoGarantia.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoGarantia.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoGarantia() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoGarantiaConstantesFunciones.refrescarForeignKeysDescripcionesTipoGarantia(this.tipogarantiaLogic.getTipoGarantias());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoGarantiaConstantesFunciones.refrescarForeignKeysDescripcionesTipoGarantia(this.tipogarantias);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Pais.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipogarantiaLogic.setTipoGarantias(this.tipogarantias);
			tipogarantiaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoGarantiaParameterReturnGeneral getTipoGarantiaParameterGeneral() {
		return this.tipogarantiaParameterGeneral;
	}
	
	public void setTipoGarantiaParameterGeneral(TipoGarantiaParameterReturnGeneral tipogarantiaParameterGeneral) {
		this.tipogarantiaParameterGeneral = tipogarantiaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoGarantia() {
		return isPermisoTodoTipoGarantia;
	}

	public void setIsPermisoTodoTipoGarantia(Boolean isPermisoTodoTipoGarantia) {
		this.isPermisoTodoTipoGarantia = isPermisoTodoTipoGarantia;
	}

	public Boolean getIsPermisoNuevoTipoGarantia() {
		return isPermisoNuevoTipoGarantia;
	}

	public void setIsPermisoNuevoTipoGarantia(Boolean isPermisoNuevoTipoGarantia) {
		this.isPermisoNuevoTipoGarantia = isPermisoNuevoTipoGarantia;
	}

	public Boolean getIsPermisoActualizarTipoGarantia() {
		return isPermisoActualizarTipoGarantia;
	}

	public void setIsPermisoActualizarTipoGarantia(Boolean isPermisoActualizarTipoGarantia) {
		this.isPermisoActualizarTipoGarantia = isPermisoActualizarTipoGarantia;
	}

	public Boolean getIsPermisoEliminarTipoGarantia() {
		return isPermisoEliminarTipoGarantia;
	}

	public void setIsPermisoEliminarTipoGarantia(Boolean isPermisoEliminarTipoGarantia) {
		this.isPermisoEliminarTipoGarantia = isPermisoEliminarTipoGarantia;
	}

	public Boolean getIsPermisoGuardarCambiosTipoGarantia() {
		return isPermisoGuardarCambiosTipoGarantia;
	}

	public void setIsPermisoGuardarCambiosTipoGarantia(Boolean isPermisoGuardarCambiosTipoGarantia) {
		this.isPermisoGuardarCambiosTipoGarantia = isPermisoGuardarCambiosTipoGarantia;
	}
	
	public Boolean getIsPermisoConsultaTipoGarantia() {
		return isPermisoConsultaTipoGarantia;
	}

	public void setIsPermisoConsultaTipoGarantia(Boolean isPermisoConsultaTipoGarantia) {
		this.isPermisoConsultaTipoGarantia = isPermisoConsultaTipoGarantia;
	}

	public Boolean getIsPermisoBusquedaTipoGarantia() {
		return isPermisoBusquedaTipoGarantia;
	}

	public void setIsPermisoBusquedaTipoGarantia(Boolean isPermisoBusquedaTipoGarantia) {
		this.isPermisoBusquedaTipoGarantia = isPermisoBusquedaTipoGarantia;
	}

	public Boolean getIsPermisoReporteTipoGarantia() {
		return isPermisoReporteTipoGarantia;
	}

	public void setIsPermisoReporteTipoGarantia(Boolean isPermisoReporteTipoGarantia) {
		this.isPermisoReporteTipoGarantia = isPermisoReporteTipoGarantia;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoGarantia() {
		return isPermisoPaginacionMedioTipoGarantia;
	}

	public void setIsPermisoPaginacionMedioTipoGarantia(Boolean isPermisoPaginacionMedioTipoGarantia) {
		this.isPermisoPaginacionMedioTipoGarantia = isPermisoPaginacionMedioTipoGarantia;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoGarantia() {
		return isPermisoPaginacionTodoTipoGarantia;
	}

	public void setIsPermisoPaginacionTodoTipoGarantia(Boolean isPermisoPaginacionTodoTipoGarantia) {
		this.isPermisoPaginacionTodoTipoGarantia = isPermisoPaginacionTodoTipoGarantia;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoGarantia() {
		return isPermisoPaginacionAltoTipoGarantia;
	}

	public void setIsPermisoPaginacionAltoTipoGarantia(Boolean isPermisoPaginacionAltoTipoGarantia) {
		this.isPermisoPaginacionAltoTipoGarantia = isPermisoPaginacionAltoTipoGarantia;
	}
	
	public Boolean getIsPermisoCopiarTipoGarantia() {
		return isPermisoCopiarTipoGarantia;
	}

	public void setIsPermisoCopiarTipoGarantia(Boolean isPermisoCopiarTipoGarantia) {
		this.isPermisoCopiarTipoGarantia = isPermisoCopiarTipoGarantia;
	}
	
	public Boolean getIsPermisoVerFormTipoGarantia() {
		return isPermisoVerFormTipoGarantia;
	}

	public void setIsPermisoVerFormTipoGarantia(Boolean isPermisoVerFormTipoGarantia) {
		this.isPermisoVerFormTipoGarantia = isPermisoVerFormTipoGarantia;
	}
	
	public Boolean getIsPermisoDuplicarTipoGarantia() {
		return isPermisoDuplicarTipoGarantia;
	}

	public void setIsPermisoDuplicarTipoGarantia(Boolean isPermisoDuplicarTipoGarantia) {
		this.isPermisoDuplicarTipoGarantia = isPermisoDuplicarTipoGarantia;
	}
	
	public Boolean getIsPermisoOrdenTipoGarantia() {
		return isPermisoOrdenTipoGarantia;
	}

	public void setIsPermisoOrdenTipoGarantia(Boolean isPermisoOrdenTipoGarantia) {
		this.isPermisoOrdenTipoGarantia = isPermisoOrdenTipoGarantia;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoGarantia() {
		return isVisibilidadCeldaNuevoTipoGarantia;
	}

	public void setIsVisibilidadCeldaNuevoTipoGarantia(Boolean isVisibilidadCeldaNuevoTipoGarantia) {
		this.isVisibilidadCeldaNuevoTipoGarantia = isVisibilidadCeldaNuevoTipoGarantia;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoGarantia() {
		return isVisibilidadCeldaDuplicarTipoGarantia;
	}

	public void setIsVisibilidadCeldaDuplicarTipoGarantia(Boolean isVisibilidadCeldaDuplicarTipoGarantia) {
		this.isVisibilidadCeldaDuplicarTipoGarantia = isVisibilidadCeldaDuplicarTipoGarantia;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoGarantia() {
		return isVisibilidadCeldaCopiarTipoGarantia;
	}

	public void setIsVisibilidadCeldaCopiarTipoGarantia(Boolean isVisibilidadCeldaCopiarTipoGarantia) {
		this.isVisibilidadCeldaCopiarTipoGarantia = isVisibilidadCeldaCopiarTipoGarantia;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoGarantia() {
		return isVisibilidadCeldaVerFormTipoGarantia;
	}

	public void setIsVisibilidadCeldaVerFormTipoGarantia(Boolean isVisibilidadCeldaVerFormTipoGarantia) {
		this.isVisibilidadCeldaVerFormTipoGarantia = isVisibilidadCeldaVerFormTipoGarantia;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoGarantia() {
		return isVisibilidadCeldaOrdenTipoGarantia;
	}

	public void setIsVisibilidadCeldaOrdenTipoGarantia(Boolean isVisibilidadCeldaOrdenTipoGarantia) {
		this.isVisibilidadCeldaOrdenTipoGarantia = isVisibilidadCeldaOrdenTipoGarantia;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoGarantia() {
		return isVisibilidadCeldaNuevoRelacionesTipoGarantia;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoGarantia(Boolean isVisibilidadCeldaNuevoRelacionesTipoGarantia) {
		this.isVisibilidadCeldaNuevoRelacionesTipoGarantia = isVisibilidadCeldaNuevoRelacionesTipoGarantia;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoGarantia() {
		return isVisibilidadCeldaModificarTipoGarantia;
	}

	public void setIsVisibilidadCeldaModificarTipoGarantia(Boolean isVisibilidadCeldaModificarTipoGarantia) {
		this.isVisibilidadCeldaModificarTipoGarantia = isVisibilidadCeldaModificarTipoGarantia;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoGarantia() {
		return isVisibilidadCeldaActualizarTipoGarantia;
	}

	public void setIsVisibilidadCeldaActualizarTipoGarantia(Boolean isVisibilidadCeldaActualizarTipoGarantia) {
		this.isVisibilidadCeldaActualizarTipoGarantia = isVisibilidadCeldaActualizarTipoGarantia;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoGarantia() {
		return isVisibilidadCeldaEliminarTipoGarantia;
	}

	public void setIsVisibilidadCeldaEliminarTipoGarantia(Boolean isVisibilidadCeldaEliminarTipoGarantia) {
		this.isVisibilidadCeldaEliminarTipoGarantia = isVisibilidadCeldaEliminarTipoGarantia;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoGarantia() {
		return isVisibilidadCeldaCancelarTipoGarantia;
	}

	public void setIsVisibilidadCeldaCancelarTipoGarantia(Boolean isVisibilidadCeldaCancelarTipoGarantia) {
		this.isVisibilidadCeldaCancelarTipoGarantia = isVisibilidadCeldaCancelarTipoGarantia;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoGarantia() {
		return isVisibilidadCeldaGuardarTipoGarantia;
	}

	public void setIsVisibilidadCeldaGuardarTipoGarantia(Boolean isVisibilidadCeldaGuardarTipoGarantia) {
		this.isVisibilidadCeldaGuardarTipoGarantia = isVisibilidadCeldaGuardarTipoGarantia;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoGarantia() {
		return isVisibilidadCeldaGuardarCambiosTipoGarantia;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoGarantia(Boolean isVisibilidadCeldaGuardarCambiosTipoGarantia) {
		this.isVisibilidadCeldaGuardarCambiosTipoGarantia = isVisibilidadCeldaGuardarCambiosTipoGarantia;
	}
		
	public TipoGarantiaSessionBean gettipogarantiaSessionBean() {
		return this.tipogarantiaSessionBean;
	}
	
	public void settipogarantiaSessionBean(TipoGarantiaSessionBean tipogarantiaSessionBean) {
		this.tipogarantiaSessionBean=tipogarantiaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoGarantia(TipoGarantia tipogarantia)throws Exception {
		try {
			
				this.setActualParaGuardarPaisForeignKey(tipogarantia,null);
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
	
	public void bugActualizarReferenciaActual(TipoGarantia tipogarantia,TipoGarantia tipogarantiaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoGarantia(tipogarantia);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipogarantiaAux.setId(tipogarantia.getId());
		tipogarantiaAux.setVersionRow(tipogarantia.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoGarantia();
		
			int intSelectedRow = this.jTableDatosTipoGarantia.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantia =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipogarantia =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoGarantiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoGarantia(this.tipogarantia,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantia(this.tipogarantia);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipogarantiaValidator.getInvalidValues(this.tipogarantia);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipogarantiaLogic.setDatosCliente(datosCliente);
			tipogarantiaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipogarantiaAux=new  TipoGarantia();
				
				tipogarantiaAux.setIsNew(true);
				tipogarantiaAux.setIsChanged(true);
				
				tipogarantiaAux.setTipoGarantiaOriginal(this.tipogarantia);
				
				tipogarantiaAux.setId(this.tipogarantia.getId());	
				tipogarantiaAux.setVersionRow(this.tipogarantia.getVersionRow());	
				tipogarantiaAux.setid_pais(this.tipogarantia.getid_pais());	
				tipogarantiaAux.setcodigo(this.tipogarantia.getcodigo());	
				tipogarantiaAux.setnombre(this.tipogarantia.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipogarantiaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipogarantiaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipogarantiaAux,tipogarantiaLogic.getTipoGarantias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogarantiaAux,tipogarantias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipogarantiaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogarantiaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogarantiaLogic.saveTipoGarantias();//WithConnection
						//tipogarantiaLogic.getSetVersionRowTipoGarantias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipogarantia,tipogarantiaAux);
					
					this.refrescarForeignKeysDescripcionesTipoGarantia();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogarantiaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipogarantiaAux=new  TipoGarantia();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipogarantiaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipogarantiaSessionBean.getEsGuardarRelacionado() && this.tipogarantia.getId()>=0)) {
						
					tipogarantiaAux.setIsNew(false);
				}
				
				tipogarantiaAux.setIsDeleted(false);
			
				tipogarantiaAux.setId(this.tipogarantia.getId());	
				tipogarantiaAux.setVersionRow(this.tipogarantia.getVersionRow());	
				tipogarantiaAux.setid_pais(this.tipogarantia.getid_pais());	
				tipogarantiaAux.setcodigo(this.tipogarantia.getcodigo());	
				tipogarantiaAux.setnombre(this.tipogarantia.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipogarantiaAux,tipogarantiaLogic.getTipoGarantias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogarantiaAux,tipogarantias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipogarantiaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogarantiaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogarantiaLogic.saveTipoGarantias();//WithConnection
						//tipogarantiaLogic.getSetVersionRowTipoGarantias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipogarantia,tipogarantiaAux);
					
					this.refrescarForeignKeysDescripcionesTipoGarantia();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogarantiaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipogarantiaAux=new  TipoGarantia();
				
				tipogarantiaAux.setIsNew(false);
				tipogarantiaAux.setIsChanged(false);
				
				tipogarantiaAux.setIsDeleted(true);
				
				tipogarantiaAux.setId(this.tipogarantia.getId());	
				tipogarantiaAux.setVersionRow(this.tipogarantia.getVersionRow());	
				tipogarantiaAux.setid_pais(this.tipogarantia.getid_pais());	
				tipogarantiaAux.setcodigo(this.tipogarantia.getcodigo());	
				tipogarantiaAux.setnombre(this.tipogarantia.getnombre());	
				
				if(this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipogarantiaAux.getId()>=0) {	
						this.tipogarantiasEliminados.add(tipogarantiaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipogarantiaAux,tipogarantiaLogic.getTipoGarantias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogarantiaAux,tipogarantias);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipogarantiaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogarantiaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogarantiaLogic.saveTipoGarantias();//WithConnection
						//tipogarantiaLogic.getSetVersionRowTipoGarantias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogarantiaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipogarantiaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipogarantiaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipogarantiaAux,tipogarantiaLogic.getTipoGarantias());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipogarantiaAux,tipogarantias);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaLogic.getTipoGarantias().addAll(this.tipogarantiasEliminados);
					
					tipogarantiaLogic.saveTipoGarantias();//WithConnection
					//tipogarantiaLogic.getSetVersionRowTipoGarantias();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoGarantia();
				
				this.tipogarantiasEliminados= new ArrayList<TipoGarantia>();		
			}
			
			if(this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Garantia GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Garantia",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipogarantia=tipogarantiaAux;
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
      		//this.finishProcessTipoGarantia();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoGarantia tipogarantiaLocal) throws Exception {
		
		if(this.tipogarantiaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoGarantia tipogarantiaLocal) throws Exception {	
		if(this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				tipogarantiaLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoGarantiaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoGarantia.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipogarantia =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipogarantia =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipogarantiaValidator.getInvalidValues(this.tipogarantia);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoGarantia tipogarantia,List<TipoGarantia> tipogarantias) throws Exception {
		try	{		
			TipoGarantiaConstantesFunciones.actualizarLista(tipogarantia,tipogarantias,this.tipogarantiaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoGarantia tipogarantia,List<TipoGarantia> tipogarantias) throws Exception {
		try	{			
			TipoGarantiaConstantesFunciones.actualizarSelectedLista(tipogarantia,tipogarantias);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoGarantia> tipogarantiasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipogarantiasLocal=this.tipogarantiaLogic.getTipoGarantias();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipogarantiasLocal=this.tipogarantias;
			}
			//ARCHITECTURE
		
			for(TipoGarantia tipogarantiaLocal:tipogarantiasLocal) {
				if(this.permiteMantenimiento(tipogarantiaLocal) && tipogarantiaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoGarantiaConstantesFunciones.getTipoGarantiaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoGarantiaConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGarantia.jLabelid_paisTipoGarantia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoGarantiaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGarantia.jLabelcodigoTipoGarantia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoGarantiaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGarantia.jLabelnombreTipoGarantia,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGarantia.jLabelid_paisTipoGarantia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGarantia.jLabelcodigoTipoGarantia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGarantia.jLabelnombreTipoGarantia,"");
		
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
		this.iIdNuevoTipoGarantia--;	
		
		
		this.tipogarantiaAux=new TipoGarantia();
		
		this.tipogarantiaAux.setId(this.iIdNuevoTipoGarantia);
		this.tipogarantiaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipogarantiaLogic.getTipoGarantias().add(this.tipogarantiaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipogarantias.add(this.tipogarantiaAux);
		}
		//ARCHITECTURE
		
		this.tipogarantia=this.tipogarantiaAux;
		
		if(TipoGarantiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoGarantia(this.tipogarantia);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoGarantia(this.tipogarantia);
		}
				
		//this.setDefaultControlesTipoGarantia();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoGarantia();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoGarantia();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGarantia();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoGarantia(this.tipogarantiaBean,this.tipogarantia,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantia(this.tipogarantia);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoGarantiaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipogarantiaSessionBean.getConGuardarRelaciones()) {
			classes=TipoGarantiaConstantesFunciones.getClassesRelationshipsOfTipoGarantia(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipogarantiaReturnGeneral=tipogarantiaLogic.procesarEventosTipoGarantiasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogarantiaLogic.getTipoGarantias(),this.tipogarantia,this.tipogarantiaParameterGeneral,this.isEsNuevoTipoGarantia,classes);//this.tipogarantiaLogic.getTipoGarantia()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoGarantia(this.tipogarantiaReturnGeneral,this.tipogarantiaBean,false);
		
		if(this.tipogarantiaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoGarantia(this.tipogarantiaReturnGeneral.getTipoGarantia());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoGarantia(this.tipogarantiaReturnGeneral.getTipoGarantia());
		}
		
		if(this.tipogarantiaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoGarantia(this.tipogarantiaReturnGeneral.getTipoGarantia(),classes);//this.tipogarantiaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoGarantia(this.tipogarantia,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoGarantia();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoGarantia();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoGarantia(false);
						
			if(tipogarantiaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoGarantiaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGarantia();
			}
			
			this.actualizarVisualTableDatosTipoGarantia();
			
			this.jTableDatosTipoGarantia.setRowSelectionInterval(this.getIndiceNuevoTipoGarantia(), this.getIndiceNuevoTipoGarantia());
			
			this.seleccionarFilaTablaTipoGarantiaActual();
						
			this.actualizarEstadoCeldasBotonesTipoGarantia("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoGarantia(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoGarantia.jTextFieldcodigoTipoGarantia.setEnabled(isHabilitar && this.tipogarantiaConstantesFunciones.activarcodigoTipoGarantia);
		this.jInternalFrameDetalleFormTipoGarantia.jTextAreanombreTipoGarantia.setEnabled(isHabilitar && this.tipogarantiaConstantesFunciones.activarnombreTipoGarantia);	
		
		this.jInternalFrameDetalleFormTipoGarantia.jComboBoxid_paisTipoGarantia.setEnabled(isHabilitar && this.tipogarantiaConstantesFunciones.activarid_paisTipoGarantia);
	};
	
	public void setDefaultControlesTipoGarantia() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoGarantia(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipogarantiaSessionBean.setConGuardarRelaciones(true);			
			this.tipogarantiaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoGarantia.jTabbedPaneRelacionesTipoGarantia.setVisible(true);
			
					
		} else {
			//this.tipogarantiaSessionBean.setConGuardarRelaciones(false);			
			this.tipogarantiaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoGarantia.jTabbedPaneRelacionesTipoGarantia.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoGarantia() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGarantia tipogarantiaAux:this.tipogarantiaLogic.getTipoGarantias()) {
				if(tipogarantiaAux.getId().equals(this.iIdNuevoTipoGarantia)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGarantia tipogarantiaAux:this.tipogarantias) {
				if(tipogarantiaAux.getId().equals(this.iIdNuevoTipoGarantia)) {
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
	
	public int getIndiceActualTipoGarantia(TipoGarantia tipogarantia,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGarantia tipogarantiaAux:this.tipogarantiaLogic.getTipoGarantias()) {
				if(tipogarantiaAux.getId().equals(tipogarantia.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGarantia tipogarantiaAux:this.tipogarantias) {
				if(tipogarantiaAux.getId().equals(tipogarantia.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoGarantia(TipoGarantia tipogarantiaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGarantia tipogarantiaAux:this.tipogarantiaLogic.getTipoGarantias()) {
				if(tipogarantiaAux.getTipoGarantiaOriginal().getId().equals(tipogarantiaOriginal.getId())) {
					existe=true;
					tipogarantiaOriginal.setId(tipogarantiaAux.getId());
					tipogarantiaOriginal.setVersionRow(tipogarantiaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGarantia tipogarantiaAux:this.tipogarantias) {
				if(tipogarantiaAux.getTipoGarantiaOriginal().getId().equals(tipogarantiaOriginal.getId())) {
					existe=true;
					tipogarantiaOriginal.setId(tipogarantiaAux.getId());
					tipogarantiaOriginal.setVersionRow(tipogarantiaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoGarantia(Boolean esParaCancelar) throws Exception {
		tipogarantiasAux=new ArrayList<TipoGarantia>();
		tipogarantiaAux=new TipoGarantia();
		
		if(!this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoGarantia tipogarantiaAux:this.tipogarantiaLogic.getTipoGarantias()) {
					if(tipogarantiaAux.getId()<0) {
						tipogarantiasAux.add(tipogarantiaAux);
					}		
				}
				this.iIdNuevoTipoGarantia=0L;
				this.tipogarantiaLogic.getTipoGarantias().removeAll(tipogarantiasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGarantia tipogarantiaAux:this.tipogarantias) {
					if(tipogarantiaAux.getId()<0) {
						tipogarantiasAux.add(tipogarantiaAux);
					}		
				}
				this.iIdNuevoTipoGarantia=0L;
				this.tipogarantias.removeAll(tipogarantiasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoGarantia 
					&& this.tipogarantiaLogic.getTipoGarantias().size()>0
					) {
					tipogarantiaAux=this.tipogarantiaLogic.getTipoGarantias().get(this.tipogarantiaLogic.getTipoGarantias().size() - 1);
				
					if(tipogarantiaAux.getId()<0) {
						this.tipogarantiaLogic.getTipoGarantias().remove(tipogarantiaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoGarantia && this.tipogarantias.size()>0) {
					tipogarantiaAux=this.tipogarantias.get(this.tipogarantias.size() - 1);
				
					if(tipogarantiaAux.getId()<0) {
						this.tipogarantias.remove(tipogarantiaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoGarantia(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipogarantia.getId()<0) {
				this.tipogarantiaLogic.getTipoGarantias().remove(this.tipogarantia);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipogarantia.getId()<0) {
				this.tipogarantias.remove(this.tipogarantia);
			}
		}			
	}
	
	public void setEstadosInicialesTipoGarantia(List<TipoGarantia> tipogarantiasAux) throws Exception {
		TipoGarantiaConstantesFunciones.setEstadosInicialesTipoGarantia(tipogarantiasAux);
	}
	
	public void setEstadosInicialesTipoGarantia(TipoGarantia tipogarantiaAux) throws Exception {
		TipoGarantiaConstantesFunciones.setEstadosInicialesTipoGarantia(tipogarantiaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoGarantiaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoGarantia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoGarantiaActual()) {
				if(!this.isEsNuevoTipoGarantia) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoGarantia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoGarantia=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoGarantiaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Garantia ?", "MANTENIMIENTO DE Tipo Garantia", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoGarantia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoGarantia tipogarantia) throws Exception {
		TipoGarantiaConstantesFunciones.seleccionarAsignar(this.tipogarantia,tipogarantia);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoGarantia=this.isPermisoActualizarOriginalTipoGarantia;
			
			
			this.seleccionarAsignar(tipogarantia);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoGarantiaConstantesFunciones.quitarEspaciosTipoGarantia(this.tipogarantia,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoGarantia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipogarantiaSessionBean.setsFuncionBusquedaRapida(this.tipogarantiaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoGarantia) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoGarantia(esParaCancelar);				
				this.cancelarNuevoTipoGarantia(esParaCancelar);								
			}
			
			this.tipogarantia=new TipoGarantia();
			
			this.inicializarTipoGarantia();
			
			this.actualizarEstadoCeldasBotonesTipoGarantia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoGarantia() throws Exception {
		try {
			TipoGarantiaConstantesFunciones.inicializarTipoGarantia(this.tipogarantia);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipogarantiaLogic.getTipoGarantias().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoGarantias(String sAccionBusqueda,List<TipoGarantia> tipogarantiasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoGarantia"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoGarantiaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoGarantiaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoGarantia"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Garantias");		
		parameters.put("busquedapor", TipoGarantiaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoGarantia=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoGarantiaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoGarantiaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoGarantia=new JRBeanArrayDataSource(TipoGarantiaJInternalFrame.TraerTipoGarantiaBeans(tipogarantiasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoGarantia);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoGarantiaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoGarantiaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoGarantiaBean.TraerTipoGarantiaBeans(tipogarantiasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoGarantias(sAccionBusqueda,sTipoArchivoReporte,tipogarantiasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoGarantias(sAccionBusqueda,sTipoArchivoReporte,tipogarantiasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoGarantiaActionPerformed(null);
					//this.generarExcelReporteTipoGarantias(sAccionBusqueda,sTipoArchivoReporte,tipogarantiasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoGarantias(sAccionBusqueda,sTipoArchivoReporte,tipogarantiasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoGarantias(sAccionBusqueda,sTipoArchivoReporte,tipogarantiasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoGarantias(sAccionBusqueda,sTipoArchivoReporte,tipogarantiasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoGarantias(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGarantia> tipogarantiasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogarantia";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGarantias");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoGarantia("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoGarantia tipogarantia : tipogarantiasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoGarantiaConstantesFunciones.generarExcelReporteDataTipoGarantia("NORMAL",row,workbook,tipogarantia,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Garantia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoGarantia(String sTipo,Row row,Workbook workbook) {
		
		TipoGarantiaConstantesFunciones.generarExcelReporteHeaderTipoGarantia(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoGarantias(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGarantia> tipogarantiasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogarantia_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGarantias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoGarantia tipogarantia : tipogarantiasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoGarantiaConstantesFunciones.getTipoGarantiaDescripcion(tipogarantia));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGarantiaConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGarantiaConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipogarantia.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGarantiaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGarantiaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipogarantia.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGarantiaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGarantiaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipogarantia.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Garantia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoGarantias(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGarantia> tipogarantiasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoGarantia> tipogarantiasRespaldo=null;
		
		classes=TipoGarantiaConstantesFunciones.getClassesRelationshipsOfTipoGarantia(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipogarantiaLogic.setDatosCliente(this.datosCliente);
		this.tipogarantiaLogic.setDatosDeep(this.datosDeep);
		this.tipogarantiaLogic.setIsConDeep(true);
		
		tipogarantiasRespaldo=this.tipogarantiaLogic.getTipoGarantias();
		
		this.tipogarantiaLogic.setTipoGarantias(tipogarantiasParaReportes);	
		this.tipogarantiaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipogarantiasParaReportes=this.tipogarantiaLogic.getTipoGarantias();
		this.tipogarantiaLogic.setTipoGarantias(tipogarantiasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogarantia_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGarantias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoGarantia("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoGarantia tipogarantia : tipogarantiasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoGarantia("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoGarantiaConstantesFunciones.generarExcelReporteDataTipoGarantia("NORMAL",row,workbook,tipogarantia,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoGarantiaConstantesFunciones.getTipoGarantiaDescripcion(tipogarantia));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Garantia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGarantia.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGarantia.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGarantia.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGarantia.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoGarantia() throws Exception {		
		this.startProcessTipoGarantia(true);
	}
	
	public void startProcessTipoGarantia(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoGarantia ,this.jPanelParametrosReportesTipoGarantia, this.jScrollPanelDatosTipoGarantia,this.jPanelPaginacionTipoGarantia, this.jScrollPanelDatosEdicionTipoGarantia, this.jPanelAccionesTipoGarantia,this.jPanelAccionesFormularioTipoGarantia,this.jmenuBarTipoGarantia,this.jmenuBarDetalleTipoGarantia,this.jTtoolBarTipoGarantia,this.jTtoolBarDetalleTipoGarantia);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoGarantia=this.jTabbedPaneBusquedasTipoGarantia; 
		
		final JPanel jPanelParametrosReportesTipoGarantia=this.jPanelParametrosReportesTipoGarantia;
		//final JScrollPane jScrollPanelDatosTipoGarantia=this.jScrollPanelDatosTipoGarantia;
		final JTable jTableDatosTipoGarantia=this.jTableDatosTipoGarantia;		
		final JPanel jPanelPaginacionTipoGarantia=this.jPanelPaginacionTipoGarantia;
		//final JScrollPane jScrollPanelDatosEdicionTipoGarantia=this.jScrollPanelDatosEdicionTipoGarantia;
		final JPanel jPanelAccionesTipoGarantia=this.jPanelAccionesTipoGarantia;
		
		JPanel jPanelCamposAuxiliarTipoGarantia=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoGarantia=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) {
			jPanelCamposAuxiliarTipoGarantia=this.jInternalFrameDetalleFormTipoGarantia.jPanelCamposTipoGarantia;
			jPanelAccionesFormularioAuxiliarTipoGarantia=this.jInternalFrameDetalleFormTipoGarantia.jPanelAccionesFormularioTipoGarantia;
		}
		
		final JPanel jPanelCamposTipoGarantia=jPanelCamposAuxiliarTipoGarantia;
		final JPanel jPanelAccionesFormularioTipoGarantia=jPanelAccionesFormularioAuxiliarTipoGarantia;
		
		
		final JMenuBar jmenuBarTipoGarantia=this.jmenuBarTipoGarantia;
		final JToolBar jTtoolBarTipoGarantia=this.jTtoolBarTipoGarantia;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoGarantia=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoGarantia=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) {
			jmenuBarDetalleAuxiliarTipoGarantia=this.jInternalFrameDetalleFormTipoGarantia.jmenuBarDetalleTipoGarantia;
			jTtoolBarDetalleAuxiliarTipoGarantia=this.jInternalFrameDetalleFormTipoGarantia.jTtoolBarDetalleTipoGarantia;
		}
		
		final JMenuBar jmenuBarDetalleTipoGarantia=jmenuBarDetalleAuxiliarTipoGarantia;
		final JToolBar jTtoolBarDetalleTipoGarantia=jTtoolBarDetalleAuxiliarTipoGarantia;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoGarantia;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoGarantia;
			processRunnable.jTableDatos=jTableDatosTipoGarantia;
			processRunnable.jPanelCampos=jPanelCamposTipoGarantia;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoGarantia;
			processRunnable.jPanelAcciones=jPanelAccionesTipoGarantia;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoGarantia;
			
			
			processRunnable.jmenuBar=jmenuBarTipoGarantia;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoGarantia;
			processRunnable.jTtoolBar=jTtoolBarTipoGarantia;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoGarantia;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoGarantia ,jPanelParametrosReportesTipoGarantia,jTableDatosTipoGarantia, /*jScrollPanelDatosTipoGarantia,*/jPanelCamposTipoGarantia,jPanelPaginacionTipoGarantia, /*jScrollPanelDatosEdicionTipoGarantia,*/ jPanelAccionesTipoGarantia,jPanelAccionesFormularioTipoGarantia,jmenuBarTipoGarantia,jmenuBarDetalleTipoGarantia,jTtoolBarTipoGarantia,jTtoolBarDetalleTipoGarantia);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoGarantia ,jPanelParametrosReportesTipoGarantia, jScrollPanelDatosTipoGarantia,jPanelPaginacionTipoGarantia, jScrollPanelDatosEdicionTipoGarantia, jPanelAccionesTipoGarantia,jPanelAccionesFormularioTipoGarantia,jmenuBarTipoGarantia,jmenuBarDetalleTipoGarantia,jTtoolBarTipoGarantia,jTtoolBarDetalleTipoGarantia);
						
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
	
	public void finishProcessTipoGarantia() {// throws Exception 
		this.finishProcessTipoGarantia(true);
	}
	
	public void finishProcessTipoGarantia(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoGarantia ,this.jPanelParametrosReportesTipoGarantia, this.jScrollPanelDatosTipoGarantia,this.jPanelPaginacionTipoGarantia, this.jScrollPanelDatosEdicionTipoGarantia, this.jPanelAccionesTipoGarantia,this.jPanelAccionesFormularioTipoGarantia,this.jmenuBarTipoGarantia,this.jmenuBarDetalleTipoGarantia,this.jTtoolBarTipoGarantia,this.jTtoolBarDetalleTipoGarantia);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoGarantia=this.jTabbedPaneBusquedasTipoGarantia; 
		
		final JPanel jPanelParametrosReportesTipoGarantia=this.jPanelParametrosReportesTipoGarantia;
		//final JScrollPane jScrollPanelDatosTipoGarantia=this.jScrollPanelDatosTipoGarantia;
		final JTable jTableDatosTipoGarantia=this.jTableDatosTipoGarantia;		
		final JPanel jPanelPaginacionTipoGarantia=this.jPanelPaginacionTipoGarantia;
		//final JScrollPane jScrollPanelDatosEdicionTipoGarantia=this.jScrollPanelDatosEdicionTipoGarantia;
		final JPanel jPanelAccionesTipoGarantia=this.jPanelAccionesTipoGarantia;
		
		JPanel jPanelCamposAuxiliarTipoGarantia=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoGarantia=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) {
			jPanelCamposAuxiliarTipoGarantia=this.jInternalFrameDetalleFormTipoGarantia.jPanelCamposTipoGarantia;
			jPanelAccionesFormularioAuxiliarTipoGarantia=this.jInternalFrameDetalleFormTipoGarantia.jPanelAccionesFormularioTipoGarantia;
		}
		
		final JPanel jPanelCamposTipoGarantia=jPanelCamposAuxiliarTipoGarantia;
		final JPanel jPanelAccionesFormularioTipoGarantia=jPanelAccionesFormularioAuxiliarTipoGarantia;
		
		
		final JMenuBar jmenuBarTipoGarantia=this.jmenuBarTipoGarantia;		
		final JToolBar jTtoolBarTipoGarantia=this.jTtoolBarTipoGarantia;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoGarantia=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoGarantia=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) {
			jmenuBarDetalleAuxiliarTipoGarantia=this.jInternalFrameDetalleFormTipoGarantia.jmenuBarDetalleTipoGarantia;
			jTtoolBarDetalleAuxiliarTipoGarantia=this.jInternalFrameDetalleFormTipoGarantia.jTtoolBarDetalleTipoGarantia;		
		}
		
		final JMenuBar jmenuBarDetalleTipoGarantia=jmenuBarDetalleAuxiliarTipoGarantia;
		final JToolBar jTtoolBarDetalleTipoGarantia=jTtoolBarDetalleAuxiliarTipoGarantia;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoGarantia;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoGarantia;
			processRunnable.jTableDatos=jTableDatosTipoGarantia;
			processRunnable.jPanelCampos=jPanelCamposTipoGarantia;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoGarantia;
			processRunnable.jPanelAcciones=jPanelAccionesTipoGarantia;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoGarantia;
			
			
			processRunnable.jmenuBar=jmenuBarTipoGarantia;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoGarantia;
			processRunnable.jTtoolBar=jTtoolBarTipoGarantia;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoGarantia;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoGarantia ,jPanelParametrosReportesTipoGarantia, jTableDatosTipoGarantia,/*jScrollPanelDatosTipoGarantia,*/jPanelCamposTipoGarantia,jPanelPaginacionTipoGarantia, /*jScrollPanelDatosEdicionTipoGarantia,*/ jPanelAccionesTipoGarantia,jPanelAccionesFormularioTipoGarantia,jmenuBarTipoGarantia,jmenuBarDetalleTipoGarantia,jTtoolBarTipoGarantia,jTtoolBarDetalleTipoGarantia));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoGarantia(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoGarantia(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoGarantia(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoGarantia(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoGarantia,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoGarantia,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoGarantia(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoGarantia,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoGarantia,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipogarantiaConstantesFunciones.getsFinalQueryTipoGarantia();
		String  finalQueryPaginacionTodos=this.tipogarantiaConstantesFunciones.getsFinalQueryTipoGarantia();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoGarantiaConstantesFunciones.getArrayColumnasGlobalesNoTipoGarantia(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoGarantiaConstantesFunciones.getArrayColumnasGlobalesTipoGarantia(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoGarantiaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipogarantiasEliminados= new ArrayList<TipoGarantia>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoGarantia();
		
				///*TipoGarantiaSessionBean*/this.tipogarantiaSessionBean=new TipoGarantiaSessionBean();
			
			if(this.tipogarantiaSessionBean==null) {
				this.tipogarantiaSessionBean=new TipoGarantiaSessionBean();
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
					this.iNumeroPaginacion=TipoGarantiaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoGarantiaConstantesFunciones.getClassesForeignKeysOfTipoGarantia(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipogarantia."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipogarantiasAux= new ArrayList<TipoGarantia>();
			
				
			tipogarantiaLogic.setDatosCliente(this.datosCliente);
			tipogarantiaLogic.setDatosDeep(this.datosDeep);
			tipogarantiaLogic.setIsConDeep(true);
			
			
			tipogarantiaLogic.getTipoGarantiaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipogarantiaLogic.getTodosTipoGarantias(finalQueryGlobal,pagination);
					
					//tipogarantiaLogic.getTodosTipoGarantiasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipogarantiaLogic.getTipoGarantias()==null|| tipogarantiaLogic.getTipoGarantias().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogarantiasAux= new ArrayList<TipoGarantia>();
							tipogarantiasAux.addAll(tipogarantiaLogic.getTipoGarantias());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogarantiasAux= new ArrayList<TipoGarantia>();
							tipogarantiasAux.addAll(tipogarantias);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogarantiaLogic.getTodosTipoGarantias(finalQueryGlobal+"",this.pagination);												
							
							//tipogarantiaLogic.getTodosTipoGarantiasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoGarantias("Todos",tipogarantiaLogic.getTipoGarantias() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogarantiaLogic.setTipoGarantias(new ArrayList<TipoGarantia>());					
							tipogarantiaLogic.getTipoGarantias().addAll(tipogarantiasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogarantias=new ArrayList<TipoGarantia>();
							tipogarantias.addAll(tipogarantiasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoGarantia=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoGarantia=this.idActual;
				
				} else if(this.idTipoGarantiaActual!=null && this.idTipoGarantiaActual!=0L) {
					idTipoGarantia=idTipoGarantiaActual;
				}
				
					
				this.sDetalleReporte=TipoGarantiaConstantesFunciones.getDetalleIndicePorId(idTipoGarantia);
				
				this.tipogarantias=new ArrayList<TipoGarantia>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipogarantiaLogic.getEntity(idTipoGarantia);
					
					//tipogarantiaLogic.getEntityWithConnection(idTipoGarantia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogarantiaLogic.setTipoGarantias(new ArrayList<TipoGarantia>());
					tipogarantiaLogic.getTipoGarantias().add(tipogarantiaLogic.getTipoGarantia());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogarantias=new ArrayList<TipoGarantia>();
					this.tipogarantias.add(tipogarantia);
				}
				
				if(tipogarantiaLogic.getTipoGarantia()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoGarantiaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipogarantiaLogic.getTipoGarantiasBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGarantiaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGarantiaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipogarantiaLogic.getTipoGarantias()==null||tipogarantiaLogic.getTipoGarantias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipogarantias==null|| tipogarantias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogarantiasAux=new ArrayList<TipoGarantia>();
						tipogarantiasAux.addAll(tipogarantiaLogic.getTipoGarantias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogarantiasAux=new ArrayList<TipoGarantia>();
							tipogarantiasAux.addAll(tipogarantias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipogarantiaLogic.getTipoGarantiasBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGarantiaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGarantiaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoGarantias("BusquedaPorCodigo",tipogarantiaLogic.getTipoGarantias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoGarantias("BusquedaPorCodigo",tipogarantias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogarantiaLogic.setTipoGarantias(new ArrayList<TipoGarantia>());
						tipogarantiaLogic.getTipoGarantias().addAll(tipogarantiasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogarantias=new ArrayList<TipoGarantia>();
							tipogarantias.addAll(tipogarantiasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoGarantiaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipogarantiaLogic.getTipoGarantiasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGarantiaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGarantiaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipogarantiaLogic.getTipoGarantias()==null||tipogarantiaLogic.getTipoGarantias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipogarantias==null|| tipogarantias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogarantiasAux=new ArrayList<TipoGarantia>();
						tipogarantiasAux.addAll(tipogarantiaLogic.getTipoGarantias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogarantiasAux=new ArrayList<TipoGarantia>();
							tipogarantiasAux.addAll(tipogarantias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipogarantiaLogic.getTipoGarantiasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGarantiaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGarantiaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoGarantias("BusquedaPorNombre",tipogarantiaLogic.getTipoGarantias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoGarantias("BusquedaPorNombre",tipogarantias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogarantiaLogic.setTipoGarantias(new ArrayList<TipoGarantia>());
						tipogarantiaLogic.getTipoGarantias().addAll(tipogarantiasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogarantias=new ArrayList<TipoGarantia>();
							tipogarantias.addAll(tipogarantiasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=TipoGarantiaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipogarantiaLogic.getTipoGarantiasFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGarantiaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGarantiaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipogarantiaLogic.getTipoGarantias()==null||tipogarantiaLogic.getTipoGarantias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipogarantias==null|| tipogarantias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogarantiasAux=new ArrayList<TipoGarantia>();
						tipogarantiasAux.addAll(tipogarantiaLogic.getTipoGarantias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogarantiasAux=new ArrayList<TipoGarantia>();
							tipogarantiasAux.addAll(tipogarantias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipogarantiaLogic.getTipoGarantiasFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGarantiaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGarantiaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoGarantias("FK_IdPais",tipogarantiaLogic.getTipoGarantias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoGarantias("FK_IdPais",tipogarantias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogarantiaLogic.setTipoGarantias(new ArrayList<TipoGarantia>());
						tipogarantiaLogic.getTipoGarantias().addAll(tipogarantiasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogarantias=new ArrayList<TipoGarantia>();
							tipogarantias.addAll(tipogarantiasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoGarantia();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoGarantia();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipogarantiaLogic.getTipoGarantias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogarantias.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipogarantiaLogic.getTipoGarantias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogarantias.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoGarantia tipogarantia) {
		Boolean permite=true;
		
		if(this.tipogarantia.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoGarantiaConstantesFunciones.getOrderByListaTipoGarantia();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoGarantiaConstantesFunciones.getOrderByListaTipoGarantia();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGarantia tipogarantia:tipogarantiaLogic.getTipoGarantias()) {
				if(tipogarantia.getsType().equals(Constantes2.S_TOTALES)) {
					tipogarantiaTotales=tipogarantia;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGarantia tipogarantia:this.tipogarantias) {
				if(tipogarantia.getsType().equals(Constantes2.S_TOTALES)) {
					tipogarantiaTotales=tipogarantia;
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
			this.tipogarantiaAux=new TipoGarantia();
			this.tipogarantiaAux.setsType(Constantes2.S_TOTALES);
			this.tipogarantiaAux.setIsNew(false);
			this.tipogarantiaAux.setIsChanged(false);
			this.tipogarantiaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoGarantiaConstantesFunciones.TotalizarValoresFilaTipoGarantia(this.tipogarantiaLogic.getTipoGarantias(),this.tipogarantiaAux);
				
				this.tipogarantiaLogic.getTipoGarantias().add(this.tipogarantiaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoGarantiaConstantesFunciones.TotalizarValoresFilaTipoGarantia(this.tipogarantias,this.tipogarantiaAux);
				
				this.tipogarantias.add(this.tipogarantiaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipogarantiaTotales=new TipoGarantia();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipogarantiaLogic.getTipoGarantias().remove(tipogarantiaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipogarantias.remove(tipogarantiaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipogarantiaTotales=new TipoGarantia();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGarantia tipogarantia:tipogarantiaLogic.getTipoGarantias()) {
				if(tipogarantia.getsType().equals(Constantes2.S_TOTALES)) {
					tipogarantiaTotales=tipogarantia;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoGarantiaConstantesFunciones.TotalizarValoresFilaTipoGarantia(this.tipogarantiaLogic.getTipoGarantias(),tipogarantiaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGarantia tipogarantia:this.tipogarantias) {
				if(tipogarantia.getsType().equals(Constantes2.S_TOTALES)) {
					tipogarantiaTotales=tipogarantia;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoGarantiaConstantesFunciones.TotalizarValoresFilaTipoGarantia(this.tipogarantias,tipogarantiaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoGarantiasBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoGarantiasBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoGarantiasFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoGarantiaPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoGarantiasBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogarantiaLogic.getTipoGarantiasBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoGarantiasBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogarantiaLogic.getTipoGarantiasBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoGarantiasFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogarantiaLogic.getTipoGarantiasFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoGarantiaPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogarantiaLogic.getTipoGarantiaPorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoGarantia() {
		this.isPermisoTodoTipoGarantia=false;
		this.isPermisoNuevoTipoGarantia=false;
		this.isPermisoActualizarTipoGarantia=false;
		this.isPermisoActualizarOriginalTipoGarantia=false;
		this.isPermisoEliminarTipoGarantia=false;
		this.isPermisoGuardarCambiosTipoGarantia=false;
		this.isPermisoConsultaTipoGarantia=false;
		this.isPermisoBusquedaTipoGarantia=false;
		this.isPermisoReporteTipoGarantia=false;		
		this.isPermisoOrdenTipoGarantia=false;		
		this.isPermisoPaginacionMedioTipoGarantia=false;		
		this.isPermisoPaginacionAltoTipoGarantia=false;
		this.isPermisoPaginacionTodoTipoGarantia=false;
		this.isPermisoCopiarTipoGarantia=false;		
		this.isPermisoVerFormTipoGarantia=false;		
		this.isPermisoDuplicarTipoGarantia=false;		
		this.isPermisoOrdenTipoGarantia=false;		
	}
	
	public void setPermisosUsuarioTipoGarantia(Boolean isPermiso) {
		this.isPermisoTodoTipoGarantia=isPermiso;
		this.isPermisoNuevoTipoGarantia=isPermiso;
		this.isPermisoActualizarTipoGarantia=isPermiso;
		this.isPermisoActualizarOriginalTipoGarantia=isPermiso;
		this.isPermisoEliminarTipoGarantia=isPermiso;
		this.isPermisoGuardarCambiosTipoGarantia=isPermiso;
		this.isPermisoConsultaTipoGarantia=isPermiso;
		this.isPermisoBusquedaTipoGarantia=isPermiso;
		this.isPermisoReporteTipoGarantia=isPermiso;
		this.isPermisoOrdenTipoGarantia=isPermiso;		
		this.isPermisoPaginacionMedioTipoGarantia=isPermiso;		
		this.isPermisoPaginacionAltoTipoGarantia=isPermiso;		
		this.isPermisoPaginacionTodoTipoGarantia=isPermiso;		
		this.isPermisoCopiarTipoGarantia=isPermiso;		
		this.isPermisoVerFormTipoGarantia=isPermiso;		
		this.isPermisoDuplicarTipoGarantia=isPermiso;
		this.isPermisoOrdenTipoGarantia=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoGarantia(Boolean isPermiso) {
		//this.isPermisoTodoTipoGarantia=isPermiso;
		this.isPermisoNuevoTipoGarantia=isPermiso;
		this.isPermisoActualizarTipoGarantia=isPermiso;
		this.isPermisoActualizarOriginalTipoGarantia=isPermiso;
		this.isPermisoEliminarTipoGarantia=isPermiso;
		this.isPermisoGuardarCambiosTipoGarantia=isPermiso;
		//this.isPermisoConsultaTipoGarantia=isPermiso;
		//this.isPermisoBusquedaTipoGarantia=isPermiso;
		//this.isPermisoReporteTipoGarantia=isPermiso;
		//this.isPermisoOrdenTipoGarantia=isPermiso;		
		//this.isPermisoPaginacionMedioTipoGarantia=isPermiso;		
		//this.isPermisoPaginacionAltoTipoGarantia=isPermiso;		
		//this.isPermisoPaginacionTodoTipoGarantia=isPermiso;		
		//this.isPermisoCopiarTipoGarantia=isPermiso;		
		//this.isPermisoDuplicarTipoGarantia=isPermiso;
		//this.isPermisoOrdenTipoGarantia=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoGarantiaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoGarantiaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoGarantia(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoGarantiaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoGarantiaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoGarantiaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoGarantiaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoGarantia() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoGarantiaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoGarantiaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoGarantia=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoGarantia=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoGarantia=this.isPermisoActualizarTipoGarantia;
			this.isPermisoEliminarTipoGarantia=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoGarantia=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoGarantia=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoGarantia=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoGarantia=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoGarantia=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoGarantia=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoGarantia=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoGarantia=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoGarantia=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoGarantia=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoGarantia=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoGarantia=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoGarantia=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoGarantia.setToolTipText(this.jTableDatosTipoGarantia.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoGarantia(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoGarantia(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoGarantiaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoGarantiaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoGarantia() throws Exception {
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
	public void inicializarCombosForeignKeyTipoGarantiaListas()throws Exception {
		try	{						
			
				this.paissForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoGarantiaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoGarantiaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoGarantiaListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoGarantiaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoGarantiaParameterReturnGeneral tipogarantiaReturnGeneral=new TipoGarantiaParameterReturnGeneral();
						
			


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.tipogarantiaConstantesFunciones.cargarid_paisTipoGarantia)
					 || (this.esRecargarFks && this.tipogarantiaConstantesFunciones.cargarid_paisTipoGarantia)) {

					if(!this.tipogarantiaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+tipogarantiaSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipogarantiaReturnGeneral=tipogarantiaLogic.cargarCombosLoteForeignKeyTipoGarantia(finalQueryGlobalPais);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=tipogarantiaReturnGeneral.getpaissForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoGarantia()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPais();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {
			if(this.tipogarantiaSessionBean==null) {
				this.tipogarantiaSessionBean=new TipoGarantiaSessionBean();
			}

			if(!this.tipogarantiaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoGarantia()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoGarantia(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoGarantia()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGarantia();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoGarantia(TipoGarantia tipogarantia)throws Exception {	
		try {
			
			this.setActualPaisForeignKey(tipogarantia.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoGarantia(TipoGarantia tipogarantia,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoGarantia()throws Exception {	
		try {
			
			this.setActualPaisForeignKey(this.tipogarantiaConstantesFunciones.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGarantia()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoGarantia()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoGarantia()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoGarantia()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoGarantia()throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoGarantia(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoGarantia()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoGarantia.jComboBoxid_paisTipoGarantia!=null && this.jInternalFrameDetalleFormTipoGarantia.jComboBoxid_paisTipoGarantia.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoGarantia.jComboBoxid_paisTipoGarantia.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoGarantiaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoGarantiaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoGarantiaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipogarantiaSessionBean=new TipoGarantiaSessionBean(); 
		this.tipogarantiaConstantesFunciones=new TipoGarantiaConstantesFunciones(); 
		this.tipogarantiaBean=new TipoGarantia();//(this.tipogarantiaConstantesFunciones); 		
		this.tipogarantiaReturnGeneral=new TipoGarantiaParameterReturnGeneral(); 
		
		this.tipogarantiaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogarantiaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoGarantiaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoGarantiaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoGarantiaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoGarantia(true);
			
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
			
			this.tipogarantiaConstantesFunciones=new TipoGarantiaConstantesFunciones(); 
			this.tipogarantiaBean=new TipoGarantia();//this.tipogarantiaConstantesFunciones); 			
			this.tipogarantiaReturnGeneral=new TipoGarantiaParameterReturnGeneral(); 
		
			TipoGarantiaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Garantia Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipogarantia=new TipoGarantia();
			this.tipogarantias = new ArrayList<TipoGarantia>();
			this.tipogarantiasAux = new ArrayList<TipoGarantia>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic=new TipoGarantiaLogic();
				this.tipogarantiaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipogarantiaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipogarantiaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoGarantia);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoGarantia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoGarantia);	
					}
					
					if(this.jInternalFrameImportacionTipoGarantia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoGarantia);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoGarantia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoGarantia);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoGarantia!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoGarantia);
				this.jInternalFrameDetalleFormTipoGarantia.setVisible(false);
				this.jInternalFrameDetalleFormTipoGarantia.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoGarantia!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoGarantia);
					this.jInternalFrameReporteDinamicoTipoGarantia.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoGarantia.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoGarantia!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoGarantia);
					this.jInternalFrameImportacionTipoGarantia.setVisible(false);
					this.jInternalFrameImportacionTipoGarantia.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoGarantia!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoGarantia);
					this.jInternalFrameOrderByTipoGarantia.setVisible(false);
					this.jInternalFrameOrderByTipoGarantia.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoGarantiaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoGarantiaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipogarantiaReturnGeneral=new TipoGarantiaParameterReturnGeneral();
			
			this.tipogarantiaParameterGeneral=new TipoGarantiaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipogarantiaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoGarantiaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoGarantiaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipogarantiaSessionBean.getEsGuardarRelacionado(),this.tipogarantiaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoGarantiaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipogarantiaSessionBean.getEsGuardarRelacionado(),this.tipogarantiaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoGarantia=false;
			this.isVisibilidadCeldaDuplicarTipoGarantia=true;
			this.isVisibilidadCeldaCopiarTipoGarantia=true;
			this.isVisibilidadCeldaVerFormTipoGarantia=true;
			this.isVisibilidadCeldaOrdenTipoGarantia=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantia=false;
			this.isVisibilidadCeldaModificarTipoGarantia=false;
			this.isVisibilidadCeldaActualizarTipoGarantia=false;
			this.isVisibilidadCeldaEliminarTipoGarantia=false;
			this.isVisibilidadCeldaCancelarTipoGarantia=false;
			this.isVisibilidadCeldaGuardarTipoGarantia=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGarantia=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdPais=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoGarantia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoGarantia();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoGarantia(false);
			
			this.setPermisosUsuarioTipoGarantia();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogarantiaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipogarantiaSessionBean.getEsGuardarRelacionado() && this.tipogarantiaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoGarantiaClasesRelacionadas();
			}
			
			if(this.tipogarantiaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoGarantiaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoGarantiaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoGarantia();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoGarantia();
			}
			
			if(!this.isPermisoBusquedaTipoGarantia) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoGarantia.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoGarantia,this.isPermisoPaginacionMedioTipoGarantia,this.isPermisoPaginacionTodoTipoGarantia);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoGarantiaConstantesFunciones.getTiposSeleccionarTipoGarantia());
				
				this.tiposColumnasSelect=TipoGarantiaConstantesFunciones.getTiposSeleccionarTipoGarantia(true);
				
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
			//if(!this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoGarantia();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoGarantia(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoGarantia(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGarantia() ;
			
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
				tipogarantiaImplementable= (TipoGarantiaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoGarantiaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipogarantiaImplementableHome= (TipoGarantiaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoGarantiaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipogarantias= new ArrayList<TipoGarantia>();
			this.tipogarantiasEliminados= new ArrayList<TipoGarantia>();
						
			this.isEsNuevoTipoGarantia=false;
			this.esParaAccionDesdeFormularioTipoGarantia=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.paissForeignKey=new ArrayList<Pais>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoGarantia(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoGarantia();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoGarantiaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoGarantia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoGarantia(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoGarantia!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoGarantia();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoGarantia();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoGarantia.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoGarantia.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoGarantia.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoGarantia(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoGarantia: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoGarantia() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoGarantia")) {
				iIndex=this.jInternalFrameDetalleFormTipoGarantia.jTabbedPaneRelacionesTipoGarantia.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoGarantia.jTabbedPaneRelacionesTipoGarantia.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoGarantia.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoGarantia();	
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
	
	public void cargarCombosForeignKeyTipoGarantia(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoGarantia(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoGarantia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoGarantiaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoGarantia();
		
		this.cargarCombosFrameForeignKeyTipoGarantia();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoGarantia();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoGarantia();
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
	
	public void jButtonNuevoTipoGarantiaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipogarantiaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoGarantia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
			
			
			if(jTableDatosTipoGarantia.getRowCount()>=1) {
				jTableDatosTipoGarantia.removeRowSelectionInterval(0, jTableDatosTipoGarantia.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoGarantia=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoGarantia(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoGarantia(true);			
			//this.tipogarantia=new TipoGarantia();
			//this.tipogarantia.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGarantia(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGarantia() ;
			
			if(TipoGarantiaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGarantia(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipogarantia);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipogarantia);				
			
			TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
			
			if(this.tipogarantiaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoGarantia: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoGarantiaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoGarantia> tipogarantiasSeleccionados=new ArrayList<TipoGarantia>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoGarantia.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoGarantia.getSelectedRows().length;			
			}
			
			tipogarantiasSeleccionados=this.getTipoGarantiasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoGarantia--;			
				//TipoGarantia tipogarantiaAux= new TipoGarantia();			
				//tipogarantiaAux.setId(this.iIdNuevoTipoGarantia);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoGarantia tipogarantiaOrigen=new TipoGarantia();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoGarantia tipogarantiaOrigen : tipogarantiasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoGarantia.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipogarantiaOrigen =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogarantiaOrigen =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoGarantia();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipogarantia.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoGarantia(tipogarantiaOrigen,this.tipogarantia,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantia(this.tipogarantia);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipogarantiaLogic.getTipoGarantias().add(this.tipogarantiaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipogarantias.add(this.tipogarantiaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoGarantia(false);
				
				this.jTableDatosTipoGarantia.setRowSelectionInterval(this.getIndiceNuevoTipoGarantia(), this.getIndiceNuevoTipoGarantia());
				
				int iLastRow =  this.jTableDatosTipoGarantia.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoGarantia.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoGarantia.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGarantia(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoGarantiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoGarantia> tipogarantiasSeleccionados=new ArrayList<TipoGarantia>();									
		
			TipoGarantia tipogarantiaOrigen=new TipoGarantia();
			TipoGarantia tipogarantiaDestino=new TipoGarantia();
				
			tipogarantiasSeleccionados=this.getTipoGarantiasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoGarantia.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipogarantiasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoGarantia.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogarantiaOrigen =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipogarantiaOrigen =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogarantiaDestino =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipogarantiaDestino =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipogarantiaOrigen =tipogarantiasSeleccionados.get(0);
				tipogarantiaDestino =tipogarantiasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoGarantia(tipogarantiaOrigen,tipogarantiaDestino,true,false);
				
				tipogarantiaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipogarantiaDestino,tipogarantiaLogic.getTipoGarantias());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogarantiaDestino,tipogarantias);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoGarantia(false);
				
				//this.jTableDatosTipoGarantia.setRowSelectionInterval(this.getIndiceNuevoTipoGarantia(), this.getIndiceNuevoTipoGarantia());
				
				int iLastRow =  this.jTableDatosTipoGarantia.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoGarantia.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoGarantia.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGarantia(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoGarantiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoGarantia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoGarantia.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoGarantiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoGarantia.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoGarantia.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoGarantia.setVisible(!isVisible);
			this.jPanelPaginacionTipoGarantia.setVisible(!isVisible);
			this.jPanelAccionesTipoGarantia.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoGarantiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoGarantia();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoGarantiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoGarantia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoGarantiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoGarantia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoGarantiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoGarantia();
			
			this.abrirFrameOrderByTipoGarantia();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoGarantiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoGarantia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoGarantia(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoGarantia);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoGarantia.isMaximum()) {
					this.jInternalFrameDetalleFormTipoGarantia.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoGarantia.setSize(this.jInternalFrameDetalleFormTipoGarantia.iWidthFormulario,this.jInternalFrameDetalleFormTipoGarantia.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoGarantia.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoGarantia.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoGarantia.isMaximum()) {
						this.jInternalFrameDetalleFormTipoGarantia.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoGarantia.jContentPaneDetalleTipoGarantia.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoGarantia.jTabbedPaneRelacionesTipoGarantia.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoGarantia.jContentPaneDetalleTipoGarantia.getWidth(),TipoGarantiaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoGarantia.jTabbedPaneRelacionesTipoGarantia.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoGarantia.jContentPaneDetalleTipoGarantia.getWidth(),TipoGarantiaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoGarantia.jTabbedPaneRelacionesTipoGarantia.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoGarantia.jContentPaneDetalleTipoGarantia.getWidth(),TipoGarantiaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoGarantia.setVisible(true);
	        this.jInternalFrameDetalleFormTipoGarantia.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoGarantia() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoGarantia==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoGarantia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGarantia,false,this);
				} else {
					this.jInternalFrameOrderByTipoGarantia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGarantia,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoGarantia);
				this.jInternalFrameOrderByTipoGarantia.setVisible(false);
				this.jInternalFrameOrderByTipoGarantia.setSelected(false);
				
				this.jInternalFrameOrderByTipoGarantia.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoGarantia"));
				
				this.inicializarActualizarBindingTablaOrderByTipoGarantia();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoGarantia() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoGarantia==null) {
				
				this.jInternalFrameImportacionTipoGarantia=new ImportacionJInternalFrame(TipoGarantiaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoGarantia);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoGarantia);
				this.jInternalFrameImportacionTipoGarantia.setVisible(false);
				this.jInternalFrameImportacionTipoGarantia.setSelected(false);


				this.jInternalFrameImportacionTipoGarantia.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoGarantia"));
				this.jInternalFrameImportacionTipoGarantia.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoGarantia"));
				this.jInternalFrameImportacionTipoGarantia.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoGarantia"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoGarantia() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoGarantia==null) {
				this.jInternalFrameReporteDinamicoTipoGarantia=new ReporteDinamicoJInternalFrame(TipoGarantiaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoGarantia);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoGarantia);
				this.jInternalFrameReporteDinamicoTipoGarantia.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoGarantia.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoGarantia.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGarantia"));
				this.jInternalFrameReporteDinamicoTipoGarantia.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGarantia"));
				this.jInternalFrameReporteDinamicoTipoGarantia.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGarantia"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGarantia();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoGarantia() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoGarantia);
			
	       	this.jInternalFrameDetalleFormTipoGarantia.setVisible(false);
	        this.jInternalFrameDetalleFormTipoGarantia.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoGarantia.dispose();
			//this.jInternalFrameDetalleFormTipoGarantia=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoGarantia() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoGarantia.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoGarantia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoGarantia() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoGarantia.setVisible(true);
	        this.jInternalFrameImportacionTipoGarantia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoGarantia() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoGarantia.setVisible(true);
	        this.jInternalFrameOrderByTipoGarantia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoGarantia() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoGarantia.setVisible(false);
	        this.jInternalFrameOrderByTipoGarantia.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoGarantia() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoGarantia.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoGarantia.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoGarantia() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoGarantia.setVisible(false);
	        this.jInternalFrameImportacionTipoGarantia.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoGarantiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoGarantia(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoGarantia(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoGarantia.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoGarantia(true);
			//this.isEsNuevoTipoGarantia=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantia =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogarantia =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoGarantia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGarantia(false) ;
			
			if(tipogarantiaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoGarantiaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGarantia(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGarantia(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoGarantiaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoGarantia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantia =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogarantia =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoGarantia(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoGarantia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoGarantia.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoGarantia(true);
			//this.isEsNuevoTipoGarantia=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantia =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogarantia =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipogarantia.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoGarantia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoGarantia(false) ;
			
			if(TipoGarantiaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGarantia(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGarantia(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosTipoGarantia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGarantia,TipoGarantiaConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoGarantia.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoGarantiaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoGarantia(false);
			
			//if(!this.isEsNuevoTipoGarantia) {								
				int intSelectedRow = this.jTableDatosTipoGarantia.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantia =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogarantia =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoGarantiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoGarantia(this.tipogarantia,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantia(this.tipogarantia);
				
			}
			
			if(this.permiteMantenimiento(this.tipogarantia)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoGarantia=true;
					this.inicializarActualizarBindingTablaTipoGarantia(false);
					this.isEsNuevoTipoGarantia=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoGarantia=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoGarantia=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoGarantia(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGarantia(false);
				
				this.habilitarDeshabilitarControlesTipoGarantia(false);
			
												
				
				if(TipoGarantiaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoGarantia();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoGarantiaActionPerformed(evt,tipogarantiaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoGarantia(this.tipogarantia,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoGarantia.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipogarantiaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipogarantia.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoGarantia.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGarantia.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoGarantiaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoGarantia.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantia =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
				this.tipogarantia.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogarantia =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
				this.tipogarantia.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipogarantia)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoGarantiaModel) this.jTableDatosTipoGarantia.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoGarantia=true;
				this.inicializarActualizarBindingTablaTipoGarantia(false);
				this.isEsNuevoTipoGarantia=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoGarantia(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGarantia(false);
				
				this.habilitarDeshabilitarControlesTipoGarantia(false);
				
				
				
				if(TipoGarantiaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoGarantia();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoGarantiaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoGarantia.getRowCount()>=1) {
				jTableDatosTipoGarantia.removeRowSelectionInterval(0, jTableDatosTipoGarantia.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoGarantia(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoGarantia(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGarantia(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGarantia(false) ;
			
			this.isEsNuevoTipoGarantia=false;
			
			if(TipoGarantiaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoGarantia();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoGarantiaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoGarantia(false);
				
				//SI ES MANUAL
				if(TipoGarantiaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoGarantia();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoGarantiaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoGarantia--;			
			//TipoGarantia tipogarantiaAux= new TipoGarantia();			
			//tipogarantiaAux.setId(this.iIdNuevoTipoGarantia);
			
			if(this.jInternalFrameDetalleFormTipoGarantia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoGarantia();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantia(this.tipogarantia);
			
			this.tipogarantia.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipogarantiaLogic.getTipoGarantias().add(this.tipogarantiaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipogarantias.add(this.tipogarantiaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoGarantia(false);
			
			this.jTableDatosTipoGarantia.setRowSelectionInterval(this.getIndiceNuevoTipoGarantia(), this.getIndiceNuevoTipoGarantia());
			
			int iLastRow =  this.jTableDatosTipoGarantia.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoGarantia.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoGarantia.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoGarantia(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoGarantiaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoGarantia(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGarantia(false);
			
			//SI ES MANUAL
			if(TipoGarantiaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGarantia();
			}
			
			//this.abrirFrameTreeTipoGarantia();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoGarantiaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo GarantiaS ?", "MANTENIMIENTO DE Tipo Garantia", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoGarantia.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoGarantia();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipogarantiaReturnGeneral=tipogarantiaLogic.procesarImportacionTipoGarantiasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipogarantiaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoGarantiaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoGarantiaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoGarantia.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoGarantia.setFileImportacion(this.jInternalFrameImportacionTipoGarantia.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoGarantia.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoGarantia.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoGarantia.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoGarantia.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoGarantiaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoGarantia> tipogarantiasSeleccionados=new ArrayList<TipoGarantia>();		

		tipogarantiasSeleccionados=this.getTipoGarantiasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGarantia.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGarantia.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoGarantiaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoGarantiaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoGarantias("Todos",tipogarantiasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Garantia",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGarantia.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGarantia.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoGarantiaConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoGarantiaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoGarantiaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoGarantia.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoGarantia.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoGarantia.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoGarantiaConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case TipoGarantiaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoGarantiaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoGarantia.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoGarantiaConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case TipoGarantiaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoGarantiaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoGarantia.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGarantia.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoGarantiaConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case TipoGarantiaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoGarantiaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoGarantiaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoGarantia> tipogarantiasSeleccionados=new ArrayList<TipoGarantia>();		
		
		tipogarantiasSeleccionados=this.getTipoGarantiasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogarantia";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoGarantias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoGarantia.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGarantia.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoGarantiaConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGarantiaConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(TipoGarantia tipogarantia:tipogarantiasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipogarantia.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoGarantiaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGarantiaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoGarantia tipogarantia:tipogarantiasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipogarantia.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoGarantiaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGarantiaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoGarantia tipogarantia:tipogarantiasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipogarantia.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoGarantia(row);				
			//	iRow++;
			//}				
			
			//for(TipoGarantia tipogarantiaAux:tipogarantiasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoGarantia(tipogarantiaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Garantia",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipogarantiaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGarantia(false);
			
			//SI ES MANUAL
			if(TipoGarantiaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGarantia();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoGarantiaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGarantia(false);
			
			//SI ES MANUAL
			if(TipoGarantiaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoGarantia();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoGarantiaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGarantia(false);
			
			//SI ES MANUAL
			if(TipoGarantiaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoGarantia();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoGarantia() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoGarantia.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoGarantia.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoGarantia.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoGarantia.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoGarantia.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoGarantia.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoGarantia.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoGarantia(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoGarantia(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoGarantia(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoGarantia(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoGarantia(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoGarantia(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGarantia(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoGarantia(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoGarantiaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoGarantiaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoGarantia() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoGarantia();
		
		this.inicializarActualizarBindingBotonesManualTipoGarantia(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoGarantia();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGarantia() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGarantia(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGarantia(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoGarantia.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoGarantia.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoGarantia.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoGarantia!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoGarantia.jCheckBoxPostAccionNuevoTipoGarantia.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoGarantia.jCheckBoxPostAccionSinCerrarTipoGarantia.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoGarantia.jCheckBoxPostAccionSinMensajeTipoGarantia.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoGarantia.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoGarantia.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoGarantia.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoGarantia!=null) {
				this.jInternalFrameDetalleFormTipoGarantia.jCheckBoxPostAccionNuevoTipoGarantia.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoGarantia.jCheckBoxPostAccionSinCerrarTipoGarantia.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoGarantia.jCheckBoxPostAccionSinMensajeTipoGarantia.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoGarantia.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoGarantia.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoGarantia!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoGarantia.jComboBoxTiposAccionesFormularioTipoGarantia.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoGarantia.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoGarantia!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGarantia.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoGarantia.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoGarantia.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoGarantia.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoGarantia.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoGarantia!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGarantia.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoGarantia.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoGarantia.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoGarantia(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoGarantiaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGarantia(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoGarantia() throws Exception {
		try	{
			if(TipoGarantiaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoGarantia();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoGarantia() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoGarantia.jComboBoxTiposAccionesFormularioTipoGarantia.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoGarantia.jComboBoxTiposAccionesFormularioTipoGarantia.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoGarantia() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoGarantia.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoGarantia.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoGarantia.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoGarantia.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoGarantia.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoGarantia.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoGarantia.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoGarantia.addItem(reporte);
			}
			
			
			if(!this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoGarantia.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoGarantia.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoGarantia.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoGarantia.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoGarantia.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoGarantia.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoGarantia!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoGarantia.jComboBoxTiposAccionesFormularioTipoGarantia.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoGarantia.jComboBoxTiposAccionesFormularioTipoGarantia.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoGarantia.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoGarantia.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoGarantia.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGarantia();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGarantia() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoGarantia!=null) {
				this.jInternalFrameReporteDinamicoTipoGarantia.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoGarantia.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoGarantia!=null) {
				this.jInternalFrameReporteDinamicoTipoGarantia.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoGarantia.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoGarantia!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoGarantia.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoGarantia.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoGarantia.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoGarantia.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoGarantia.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoGarantia.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoGarantia()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoGarantia.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoGarantia.getText();
		if(this.jComboBoxid_paisFK_IdPaisTipoGarantia.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisTipoGarantia.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoGarantia(Boolean esInicializar) throws Exception {				
		if(TipoGarantiaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoGarantia();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoGarantia() throws Exception {
		this.inicializarActualizarBindingTablaTipoGarantia(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoGarantia() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoGarantia.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoGarantia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGarantia.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoGarantiaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoGarantia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGarantia.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoGarantiaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoGarantiaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGarantiaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoGarantiaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoGarantia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGarantia.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoGarantiaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoGarantia.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoGarantia(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipogarantiaLogic.getTipoGarantias().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipogarantias.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoGarantiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoGarantia.setModel(new TipoGarantiaModel(this.tipogarantiaLogic.getTipoGarantias(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoGarantia.setModel(new TipoGarantiaModel(this.tipogarantias,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoGarantia!=null && this.jInternalFrameOrderByTipoGarantia.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoGarantia();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoGarantia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGarantia,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoGarantiaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO,tipogarantiaConstantesFunciones.resaltarSeleccionarTipoGarantia,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO,tipogarantiaConstantesFunciones.resaltarSeleccionarTipoGarantia,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoGarantia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGarantia,TipoGarantiaConstantesFunciones.LABEL_ID));

		if(this.tipogarantiaConstantesFunciones.mostraridTipoGarantia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGarantiaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipogarantiaConstantesFunciones.resaltaridTipoGarantia,this.tipogarantiaConstantesFunciones.activaridTipoGarantia,this,true,"idTipoGarantia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogarantiaConstantesFunciones.resaltaridTipoGarantia,this.tipogarantiaConstantesFunciones.activaridTipoGarantia,this,true,"idTipoGarantia","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGarantia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGarantia,TipoGarantiaConstantesFunciones.LABEL_IDPAIS));

		if(this.tipogarantiaConstantesFunciones.mostrarid_paisTipoGarantia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGarantiaConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.tipogarantiaConstantesFunciones.resaltarid_paisTipoGarantia,this,this.tipogarantiaConstantesFunciones.activarid_paisTipoGarantia));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.tipogarantiaConstantesFunciones.resaltarid_paisTipoGarantia,this,this.tipogarantiaConstantesFunciones.activarid_paisTipoGarantia,true,"id_paisTipoGarantia","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoGarantiaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGarantia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGarantia,TipoGarantiaConstantesFunciones.LABEL_CODIGO));

		if(this.tipogarantiaConstantesFunciones.mostrarcodigoTipoGarantia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGarantiaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipogarantiaConstantesFunciones.resaltarcodigoTipoGarantia,this.tipogarantiaConstantesFunciones.activarcodigoTipoGarantia,this,true,"codigoTipoGarantia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogarantiaConstantesFunciones.resaltarcodigoTipoGarantia,this.tipogarantiaConstantesFunciones.activarcodigoTipoGarantia,this,true,"codigoTipoGarantia","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoGarantiaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGarantia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGarantia,TipoGarantiaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipogarantiaConstantesFunciones.mostrarnombreTipoGarantia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGarantiaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipogarantiaConstantesFunciones.resaltarnombreTipoGarantia,this.tipogarantiaConstantesFunciones.activarnombreTipoGarantia,this,true,"nombreTipoGarantia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogarantiaConstantesFunciones.resaltarnombreTipoGarantia,this.tipogarantiaConstantesFunciones.activarnombreTipoGarantia,this,true,"nombreTipoGarantia","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoGarantiaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipogarantiaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipogarantiaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipogarantiaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoGarantia.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipogarantiaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipogarantiaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoGarantia.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoGarantia && this.isPermisoGuardarCambiosTipoGarantia) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipogarantiaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipogarantiaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoGarantia.addColumn(tableColumn);
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
			
			this.jTableDatosTipoGarantia.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoGarantia && this.isPermisoGuardarCambiosTipoGarantia) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoGarantia && this.isPermisoGuardarCambiosTipoGarantia) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoGarantia.moveColumn(this.jTableDatosTipoGarantia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoGarantia.moveColumn(this.jTableDatosTipoGarantia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoGarantia.moveColumn(this.jTableDatosTipoGarantia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoGarantia.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoGarantia.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoGarantia,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoGarantiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoGarantia.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoGarantia.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoGarantiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoGarantiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoGarantia.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoGarantia.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoGarantia.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipogarantiaLogic.getTipoGarantias().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipogarantias.size()-1;
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
		//this.jTableDatosTipoGarantia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoGarantia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoGarantia();
			
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
				
				//this.isEsNuevoTipoGarantia=false;
					
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
			
				if(this.tipogarantiaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoGarantia==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoGarantia.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoGarantia.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantia =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogarantia =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipogarantia.getsType().equals("DUPLICADO")
				   || this.tipogarantia.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoGarantia=true;
				
				} else {
					this.isEsNuevoTipoGarantia=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipogarantia.getId()>=0 && !this.tipogarantia.getIsNew()) {						
						this.isEsNuevoTipoGarantia=false;
						
					} else {
						this.isEsNuevoTipoGarantia=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoGarantia(esRelaciones);						
				
				this.seleccionarTipoGarantia(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipogarantia.getId()<0) {
					this.isEsNuevoTipoGarantia=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoGarantia(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoGarantia(evt,rowIndex);
				}	
				
				if(this.tipogarantiaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoGarantia: " + this.dDif); 
					}
				}								
				
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoGarantia(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipogarantia)) {
					if(this.tipogarantia.getId()>0) {
						this.tipogarantia.setIsDeleted(true);
						
						this.tipogarantiasEliminados.add(this.tipogarantia);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipogarantiaLogic.getTipoGarantias().remove(this.tipogarantia);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipogarantias.remove(this.tipogarantia);				
					}
					
					
					((TipoGarantiaModel) this.jTableDatosTipoGarantia.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGarantia(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoGarantia(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoGarantia) {
			
			if(this.jInternalFrameDetalleFormTipoGarantia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoGarantia.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoGarantia.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantia =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogarantia =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoGarantiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoGarantia(this.tipogarantia);
				}
				
				//ARCHITECTURE
				try {
					

					//Pais
					if(!this.tipogarantiaConstantesFunciones.cargarid_paisTipoGarantia || this.tipogarantiaConstantesFunciones.event_dependid_paisTipoGarantia) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.tipogarantia.getid_pais());
									//this.inicializarActualizarBindingTipoGarantia(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(tipogarantia.getPais()!=null) {
							this.paissForeignKey.add(tipogarantia.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.tipogarantia.getid_pais(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoGarantia("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoGarantia(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGarantia() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoGarantia(TipoGarantia tipogarantia) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoGarantia(tipogarantia,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoGarantia(TipoGarantia tipogarantia,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoGarantia(tipogarantia);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoGarantia(tipogarantia,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoGarantia(tipogarantia);
	}
	
	public void setVariablesObjetoActualToFormularioTipoGarantia(TipoGarantia tipogarantia) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoGarantia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoGarantia.jTextFieldidTipoGarantia.setText(tipogarantia.getId().toString());
			this.jInternalFrameDetalleFormTipoGarantia.jTextFieldcodigoTipoGarantia.setText(tipogarantia.getcodigo());
			this.jInternalFrameDetalleFormTipoGarantia.jTextAreanombreTipoGarantia.setText(tipogarantia.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoGarantia tipogarantiaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipogarantiaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoGarantia tipogarantiaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipogarantiaLocal=this.tipogarantia;
			} else {
				tipogarantiaLocal=this.tipogarantiaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipogarantiaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoGarantia(tipogarantiaLocal,true);
					
					if(tipogarantiaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipogarantiaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipogarantiaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoGarantia(TipoGarantia tipogarantia,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoGarantia(tipogarantia,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantia(tipogarantia);
	}
	
	public void setVariablesFormularioToObjetoActualTipoGarantia(TipoGarantia tipogarantia,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoGarantia(tipogarantia,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoGarantia(TipoGarantia tipogarantia,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoGarantia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoGarantia.jTextFieldidTipoGarantia.getText()==null || this.jInternalFrameDetalleFormTipoGarantia.jTextFieldidTipoGarantia.getText()=="" || this.jInternalFrameDetalleFormTipoGarantia.jTextFieldidTipoGarantia.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoGarantia.jTextFieldidTipoGarantia.setText("0");
			}

			if(conColumnasBase) {tipogarantia.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoGarantia.jTextFieldidTipoGarantia.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGarantiaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGarantia.jLabelIdTipoGarantia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipogarantia.setcodigo(this.jInternalFrameDetalleFormTipoGarantia.jTextFieldcodigoTipoGarantia.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGarantiaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGarantia.jLabelcodigoTipoGarantia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipogarantia.setnombre(this.jInternalFrameDetalleFormTipoGarantia.jTextAreanombreTipoGarantia.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGarantiaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGarantia.jLabelnombreTipoGarantia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoGarantia(TipoGarantia tipogarantiaBean,TipoGarantia tipogarantia,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tipogarantiaBean.getid_pais()!=null && !tipogarantiaBean.getid_pais().equals(-1L))) {tipogarantia.setid_pais(tipogarantiaBean.getid_pais());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoGarantia(TipoGarantia tipogarantiaOrigen,TipoGarantia tipogarantia,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipogarantiaOrigen.getId()!=null && !tipogarantiaOrigen.getId().equals(0L))) {tipogarantia.setId(tipogarantiaOrigen.getId());}}
			if(conDefault || (!conDefault && tipogarantiaOrigen.getid_pais()!=null && !tipogarantiaOrigen.getid_pais().equals(-1L))) {tipogarantia.setid_pais(tipogarantiaOrigen.getid_pais());}
			if(conDefault || (!conDefault && tipogarantiaOrigen.getcodigo()!=null && !tipogarantiaOrigen.getcodigo().equals(""))) {tipogarantia.setcodigo(tipogarantiaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipogarantiaOrigen.getnombre()!=null && !tipogarantiaOrigen.getnombre().equals(""))) {tipogarantia.setnombre(tipogarantiaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoGarantia(TipoGarantia tipogarantia) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoGarantia.jTextFieldidTipoGarantia.setText(tipogarantia.getId().toString());
			this.jInternalFrameDetalleFormTipoGarantia.jTextFieldcodigoTipoGarantia.setText(tipogarantia.getcodigo());
			this.jInternalFrameDetalleFormTipoGarantia.jTextAreanombreTipoGarantia.setText(tipogarantia.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoGarantia(TipoGarantiaBean tipogarantiaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoGarantia.jTextFieldidTipoGarantia.setText(tipogarantiaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoGarantia.jTextFieldcodigoTipoGarantia.setText(tipogarantiaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoGarantia.jTextAreanombreTipoGarantia.setText(tipogarantiaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoGarantia(TipoGarantiaParameterReturnGeneral tipogarantiaReturnGeneral,TipoGarantiaBean tipogarantiaBean,Boolean conDefault) throws Exception { 
		try {
			TipoGarantia tipogarantiaLocal=new TipoGarantia();
			
			tipogarantiaLocal=tipogarantiaReturnGeneral.getTipoGarantia();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipogarantiaLocal.getId()!=null && !tipogarantiaLocal.getId().equals(0L))) {tipogarantiaBean.setId(tipogarantiaLocal.getId());}}
			if(conDefault || (!conDefault && tipogarantiaLocal.getid_pais()!=null && !tipogarantiaLocal.getid_pais().equals(-1L))) {tipogarantiaBean.setid_pais(tipogarantiaLocal.getid_pais());}
			if(conDefault || (!conDefault && tipogarantiaLocal.getcodigo()!=null && !tipogarantiaLocal.getcodigo().equals(""))) {tipogarantiaBean.setcodigo(tipogarantiaLocal.getcodigo());}
			if(conDefault || (!conDefault && tipogarantiaLocal.getnombre()!=null && !tipogarantiaLocal.getnombre().equals(""))) {tipogarantiaBean.setnombre(tipogarantiaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoGarantiaGenerico(Long idTipoGarantiaSeleccionado,JComboBox jComboBoxTipoGarantia,List<TipoGarantia> tipogarantiasLocal)throws Exception {
		try {
			TipoGarantia  tipogarantiaTemp=null;

			for(TipoGarantia tipogarantiaAux:tipogarantiasLocal) {
				if(tipogarantiaAux.getId()!=null && tipogarantiaAux.getId().equals(idTipoGarantiaSeleccionado)) {
					tipogarantiaTemp=tipogarantiaAux;
					break;
				}
			}

			jComboBoxTipoGarantia.setSelectedItem(tipogarantiaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoGarantiaGenerico(JComboBox jComboBoxTipoGarantia,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoGarantia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoGarantia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoGarantia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoGarantia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoGarantia.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoGarantia.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoGarantia.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoGarantia.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoGarantia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoGarantia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogarantia=(TipoGarantia) tipogarantiaLogic.getTipoGarantias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipogarantia =(TipoGarantia) tipogarantias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!tipogarantia.getIsNew() && !tipogarantia.getIsChanged() && !tipogarantia.getIsDeleted()) {
				sDescripcion=tipogarantia.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=tipogarantia.getpais_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoGarantia tipogarantiaRow=new TipoGarantia();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogarantiaRow=(TipoGarantia) tipogarantiaLogic.getTipoGarantias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipogarantiaRow=(TipoGarantia) tipogarantias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoGarantia(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoGarantia.setVisible((this.isVisibilidadCeldaNuevoTipoGarantia && this.isPermisoNuevoTipoGarantia));			
			this.jButtonDuplicarTipoGarantia.setVisible((this.isVisibilidadCeldaDuplicarTipoGarantia && this.isPermisoDuplicarTipoGarantia));			
			this.jButtonCopiarTipoGarantia.setVisible((this.isVisibilidadCeldaCopiarTipoGarantia && this.isPermisoCopiarTipoGarantia));
			this.jButtonVerFormTipoGarantia.setVisible((this.isVisibilidadCeldaVerFormTipoGarantia && this.isPermisoVerFormTipoGarantia));
			
			this.jButtonAbrirOrderByTipoGarantia.setVisible((this.isVisibilidadCeldaOrdenTipoGarantia && this.isPermisoOrdenTipoGarantia));			
			
			this.jButtonNuevoRelacionesTipoGarantia.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGarantia && this.isPermisoNuevoTipoGarantia));			
			this.jButtonNuevoGuardarCambiosTipoGarantia.setVisible((this.isVisibilidadCeldaNuevoTipoGarantia && this.isPermisoNuevoTipoGarantia && this.isPermisoGuardarCambiosTipoGarantia));
			
			if(this.jInternalFrameDetalleFormTipoGarantia!=null) {
			this.jInternalFrameDetalleFormTipoGarantia.jButtonModificarTipoGarantia.setVisible((this.isVisibilidadCeldaModificarTipoGarantia && this.isPermisoActualizarTipoGarantia));	
			this.jInternalFrameDetalleFormTipoGarantia.jButtonActualizarTipoGarantia.setVisible((this.isVisibilidadCeldaActualizarTipoGarantia && this.isPermisoActualizarTipoGarantia));	
			this.jInternalFrameDetalleFormTipoGarantia.jButtonEliminarTipoGarantia.setVisible((this.isVisibilidadCeldaEliminarTipoGarantia && this.isPermisoEliminarTipoGarantia));
			this.jInternalFrameDetalleFormTipoGarantia.jButtonCancelarTipoGarantia.setVisible(this.isVisibilidadCeldaCancelarTipoGarantia);							
			this.jInternalFrameDetalleFormTipoGarantia.jButtonGuardarCambiosTipoGarantia.setVisible((this.isVisibilidadCeldaGuardarTipoGarantia && this.isPermisoGuardarCambiosTipoGarantia));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoGarantia.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGarantia && this.isPermisoGuardarCambiosTipoGarantia));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoGarantia.setVisible((this.isVisibilidadCeldaNuevoTipoGarantia && this.isPermisoNuevoTipoGarantia));						
			this.jButtonDuplicarToolBarTipoGarantia.setVisible((this.isVisibilidadCeldaDuplicarTipoGarantia && this.isPermisoDuplicarTipoGarantia));						
			this.jButtonCopiarToolBarTipoGarantia.setVisible((this.isVisibilidadCeldaCopiarTipoGarantia && this.isPermisoCopiarTipoGarantia));			
			this.jButtonVerFormToolBarTipoGarantia.setVisible((this.isVisibilidadCeldaVerFormTipoGarantia && this.isPermisoVerFormTipoGarantia));			
			this.jButtonAbrirOrderByToolBarTipoGarantia.setVisible((this.isVisibilidadCeldaOrdenTipoGarantia && this.isPermisoOrdenTipoGarantia));
			this.jButtonNuevoRelacionesToolBarTipoGarantia.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGarantia && this.isPermisoNuevoTipoGarantia));			
			this.jButtonNuevoGuardarCambiosToolBarTipoGarantia.setVisible((this.isVisibilidadCeldaNuevoTipoGarantia && this.isPermisoNuevoTipoGarantia && this.isPermisoGuardarCambiosTipoGarantia));			
			
			if(this.jInternalFrameDetalleFormTipoGarantia!=null) {
			this.jInternalFrameDetalleFormTipoGarantia.jButtonModificarToolBarTipoGarantia.setVisible((this.isVisibilidadCeldaModificarTipoGarantia && this.isPermisoActualizarTipoGarantia));	
			this.jInternalFrameDetalleFormTipoGarantia.jButtonActualizarToolBarTipoGarantia.setVisible((this.isVisibilidadCeldaActualizarTipoGarantia  && this.isPermisoActualizarTipoGarantia));	
			this.jInternalFrameDetalleFormTipoGarantia.jButtonEliminarToolBarTipoGarantia.setVisible((this.isVisibilidadCeldaEliminarTipoGarantia && this.isPermisoEliminarTipoGarantia));
			this.jInternalFrameDetalleFormTipoGarantia.jButtonCancelarToolBarTipoGarantia.setVisible(this.isVisibilidadCeldaCancelarTipoGarantia);				
			this.jInternalFrameDetalleFormTipoGarantia.jButtonGuardarCambiosToolBarTipoGarantia.setVisible((this.isVisibilidadCeldaGuardarTipoGarantia && this.isPermisoGuardarCambiosTipoGarantia));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoGarantia.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGarantia && this.isPermisoGuardarCambiosTipoGarantia));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoGarantia.setVisible((this.isVisibilidadCeldaNuevoTipoGarantia && this.isPermisoNuevoTipoGarantia));			
			this.jMenuItemDuplicarTipoGarantia.setVisible((this.isVisibilidadCeldaDuplicarTipoGarantia && this.isPermisoDuplicarTipoGarantia));			
			this.jMenuItemCopiarTipoGarantia.setVisible((this.isVisibilidadCeldaCopiarTipoGarantia && this.isPermisoCopiarTipoGarantia));			
			this.jMenuItemVerFormTipoGarantia.setVisible((this.isVisibilidadCeldaVerFormTipoGarantia && this.isPermisoVerFormTipoGarantia));			
			this.jMenuItemAbrirOrderByTipoGarantia.setVisible((this.isVisibilidadCeldaOrdenTipoGarantia && this.isPermisoOrdenTipoGarantia));			
			//this.jMenuItemMostrarOcultarTipoGarantia.setVisible((this.isVisibilidadCeldaOrdenTipoGarantia && this.isPermisoOrdenTipoGarantia));
			this.jMenuItemDetalleAbrirOrderByTipoGarantia.setVisible((this.isVisibilidadCeldaOrdenTipoGarantia && this.isPermisoOrdenTipoGarantia));			
			//this.jMenuItemDetalleMostrarOcultarTipoGarantia.setVisible((this.isVisibilidadCeldaOrdenTipoGarantia && this.isPermisoOrdenTipoGarantia));			
			this.jMenuItemNuevoRelacionesTipoGarantia.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGarantia && this.isPermisoNuevoTipoGarantia));			
			this.jMenuItemNuevoGuardarCambiosTipoGarantia.setVisible((this.isVisibilidadCeldaNuevoTipoGarantia && this.isPermisoNuevoTipoGarantia && this.isPermisoGuardarCambiosTipoGarantia));									
			
			if(this.jInternalFrameDetalleFormTipoGarantia!=null) {
			this.jInternalFrameDetalleFormTipoGarantia.jMenuItemModificarTipoGarantia.setVisible((this.isVisibilidadCeldaModificarTipoGarantia && this.isPermisoActualizarTipoGarantia));	
			this.jInternalFrameDetalleFormTipoGarantia.jMenuItemActualizarTipoGarantia.setVisible((this.isVisibilidadCeldaActualizarTipoGarantia && this.isPermisoActualizarTipoGarantia));	
			this.jInternalFrameDetalleFormTipoGarantia.jMenuItemEliminarTipoGarantia.setVisible((this.isVisibilidadCeldaEliminarTipoGarantia && this.isPermisoEliminarTipoGarantia));
			this.jInternalFrameDetalleFormTipoGarantia.jMenuItemCancelarTipoGarantia.setVisible(this.isVisibilidadCeldaCancelarTipoGarantia);				
			}
			
			this.jMenuItemGuardarCambiosTipoGarantia.setVisible((this.isVisibilidadCeldaGuardarTipoGarantia && this.isPermisoGuardarCambiosTipoGarantia));						
			this.jMenuItemGuardarCambiosTablaTipoGarantia.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGarantia && this.isPermisoGuardarCambiosTipoGarantia));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoGarantia=this.jButtonNuevoTipoGarantia.isVisible();
			this.isVisibilidadCeldaDuplicarTipoGarantia=this.jButtonDuplicarTipoGarantia.isVisible();
			this.isVisibilidadCeldaCopiarTipoGarantia=this.jButtonCopiarTipoGarantia.isVisible();
			this.isVisibilidadCeldaVerFormTipoGarantia=this.jButtonVerFormTipoGarantia.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoGarantia=this.jButtonAbrirOrderByTipoGarantia.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantia=this.jButtonNuevoRelacionesTipoGarantia.isVisible();
			this.isVisibilidadCeldaModificarTipoGarantia=this.jButtonModificarTipoGarantia.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGarantia!=null) {
			this.isVisibilidadCeldaActualizarTipoGarantia=this.jInternalFrameDetalleFormTipoGarantia.jButtonActualizarTipoGarantia.isVisible();
			this.isVisibilidadCeldaEliminarTipoGarantia=this.jInternalFrameDetalleFormTipoGarantia.jButtonEliminarTipoGarantia.isVisible();
			this.isVisibilidadCeldaCancelarTipoGarantia=this.jInternalFrameDetalleFormTipoGarantia.jButtonCancelarTipoGarantia.isVisible();
			this.isVisibilidadCeldaGuardarTipoGarantia=this.jInternalFrameDetalleFormTipoGarantia.jButtonGuardarCambiosTipoGarantia.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoGarantia=this.jButtonGuardarCambiosTablaTipoGarantia.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoGarantia=this.jButtonNuevoToolBarTipoGarantia.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantia=this.jButtonNuevoRelacionesToolBarTipoGarantia.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGarantia!=null) {
			this.isVisibilidadCeldaModificarTipoGarantia=this.jInternalFrameDetalleFormTipoGarantia.jButtonModificarToolBarTipoGarantia.isVisible();
			this.isVisibilidadCeldaActualizarTipoGarantia=this.jInternalFrameDetalleFormTipoGarantia.jButtonActualizarToolBarTipoGarantia.isVisible();
			this.isVisibilidadCeldaEliminarTipoGarantia=this.jInternalFrameDetalleFormTipoGarantia.jButtonEliminarToolBarTipoGarantia.isVisible();
			this.isVisibilidadCeldaCancelarTipoGarantia=this.jInternalFrameDetalleFormTipoGarantia.jButtonCancelarToolBarTipoGarantia.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoGarantia=this.jButtonGuardarCambiosToolBarTipoGarantia.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoGarantia=this.jButtonGuardarCambiosTablaToolBarTipoGarantia.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoGarantia=this.jMenuItemNuevoTipoGarantia.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantia=this.jMenuItemNuevoRelacionesTipoGarantia.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGarantia!=null) {
			this.isVisibilidadCeldaModificarTipoGarantia=this.jInternalFrameDetalleFormTipoGarantia.jMenuItemModificarTipoGarantia.isVisible();
			this.isVisibilidadCeldaActualizarTipoGarantia=this.jInternalFrameDetalleFormTipoGarantia.jMenuItemActualizarTipoGarantia.isVisible();
			this.isVisibilidadCeldaEliminarTipoGarantia=this.jInternalFrameDetalleFormTipoGarantia.jMenuItemEliminarTipoGarantia.isVisible();
			this.isVisibilidadCeldaCancelarTipoGarantia=this.jInternalFrameDetalleFormTipoGarantia.jMenuItemCancelarTipoGarantia.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoGarantia=this.jMenuItemGuardarCambiosTipoGarantia.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoGarantia=this.jMenuItemGuardarCambiosTablaTipoGarantia.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoGarantia(Boolean esInicializar) {
		if(TipoGarantiaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipogarantiaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoGarantia();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoGarantia(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoGarantia() {
		this.jButtonNuevoTipoGarantia.setVisible(this.isPermisoNuevoTipoGarantia);			
		this.jButtonDuplicarTipoGarantia.setVisible(this.isPermisoDuplicarTipoGarantia);			
		this.jButtonCopiarTipoGarantia.setVisible(this.isPermisoCopiarTipoGarantia);			
		this.jButtonVerFormTipoGarantia.setVisible(this.isPermisoVerFormTipoGarantia);			
		
		this.jButtonAbrirOrderByTipoGarantia.setVisible(this.isPermisoOrdenTipoGarantia);					
		
		this.jButtonNuevoRelacionesTipoGarantia.setVisible(this.isPermisoNuevoTipoGarantia);			
		
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantia.jButtonModificarTipoGarantia.setVisible(this.isPermisoActualizarTipoGarantia);	
			this.jInternalFrameDetalleFormTipoGarantia.jButtonActualizarTipoGarantia.setVisible(this.isPermisoActualizarTipoGarantia);	
			this.jInternalFrameDetalleFormTipoGarantia.jButtonEliminarTipoGarantia.setVisible(this.isPermisoEliminarTipoGarantia);
			this.jInternalFrameDetalleFormTipoGarantia.jButtonCancelarTipoGarantia.setVisible(this.isVisibilidadCeldaCancelarTipoGarantia);						
			this.jInternalFrameDetalleFormTipoGarantia.jButtonGuardarCambiosTipoGarantia.setVisible(this.isPermisoGuardarCambiosTipoGarantia);							
		}
		
		this.jButtonGuardarCambiosTablaTipoGarantia.setVisible(this.isPermisoActualizarTipoGarantia);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoGarantia() {
		this.jInternalFrameDetalleFormTipoGarantia.jButtonModificarTipoGarantia.setVisible(this.isPermisoActualizarTipoGarantia);	
		this.jInternalFrameDetalleFormTipoGarantia.jButtonActualizarTipoGarantia.setVisible(this.isPermisoActualizarTipoGarantia);	
		this.jInternalFrameDetalleFormTipoGarantia.jButtonEliminarTipoGarantia.setVisible(this.isPermisoEliminarTipoGarantia);
		this.jInternalFrameDetalleFormTipoGarantia.jButtonCancelarTipoGarantia.setVisible(this.isVisibilidadCeldaCancelarTipoGarantia);							
		this.jInternalFrameDetalleFormTipoGarantia.jButtonGuardarCambiosTipoGarantia.setVisible((this.isVisibilidadCeldaGuardarTipoGarantia && this.isPermisoGuardarCambiosTipoGarantia));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoGarantia() {
		if(TipoGarantiaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoGarantia();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoGarantia() {
	}
	
	public void jTableDatosTipoGarantiaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoGarantia(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoGarantiaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGarantia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGarantia(this.gettipogarantia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantia(this.tipogarantia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogarantia =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogarantia =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogarantia==null) {
						this.tipogarantia = new TipoGarantia();
					}

					this.setVariablesFormularioToObjetoActualTipoGarantia(this.tipogarantia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantia(this.tipogarantia);
				}

				if(this.tipogarantia.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipogarantia.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGarantia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisTipoGarantiaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebTipoGarantia(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGarantia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoGarantia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoGarantia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantia =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogarantia =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoGarantia(this.gettipogarantia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantia(this.tipogarantia);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.tipogarantiaLogic.getConnexion());

				if(this.tipogarantia.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.tipogarantia.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoGarantia=(TitledBorder)this.jScrollPanelDatosTipoGarantia.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderTipoGarantia.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisTipoGarantiaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGarantia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGarantia(this.gettipogarantia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantia(this.tipogarantia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogarantia =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogarantia =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogarantia==null) {
						this.tipogarantia = new TipoGarantia();
					}

					this.setVariablesFormularioToObjetoActualTipoGarantia(this.tipogarantia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantia(this.tipogarantia);
				}

				if(this.tipogarantia.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.tipogarantia.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGarantia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoGarantiaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGarantia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGarantia(this.gettipogarantia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantia(this.tipogarantia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogarantia =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogarantia =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogarantia==null) {
						this.tipogarantia = new TipoGarantia();
					}

					this.setVariablesFormularioToObjetoActualTipoGarantia(this.tipogarantia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantia(this.tipogarantia);
				}

				if(this.tipogarantia.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipogarantia.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGarantia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoGarantiaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGarantia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGarantia(this.gettipogarantia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantia(this.tipogarantia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogarantia =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogarantia =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogarantia==null) {
						this.tipogarantia = new TipoGarantia();
					}

					this.setVariablesFormularioToObjetoActualTipoGarantia(this.tipogarantia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantia(this.tipogarantia);
				}

				if(this.tipogarantia.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipogarantia.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGarantia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoGarantiaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoGarantia(false,false);

			this.getTipoGarantiasBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoGarantia(false);

			//if(TipoGarantiaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoGarantia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoGarantiaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoGarantia(false,false);

			this.getTipoGarantiasBusquedaPorNombre();

			this.inicializarActualizarBindingTipoGarantia(false);

			//if(TipoGarantiaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoGarantia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisTipoGarantiaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoGarantia(false,false);

			this.getTipoGarantiasFK_IdPais();

			this.inicializarActualizarBindingTipoGarantia(false);

			//if(TipoGarantiaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoGarantia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogarantiaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoGarantia() {
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) {
			this.jInternalFrameDetalleFormTipoGarantia.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoGarantia.dispose();
			this.jInternalFrameDetalleFormTipoGarantia=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoGarantia!=null) {
			this.jInternalFrameReporteDinamicoTipoGarantia.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoGarantia.dispose();
			this.jInternalFrameReporteDinamicoTipoGarantia=null;
		}
		
		if(this.jInternalFrameImportacionTipoGarantia!=null) {
			this.jInternalFrameImportacionTipoGarantia.setVisible(false);	    			
			this.jInternalFrameImportacionTipoGarantia.dispose();
			this.jInternalFrameImportacionTipoGarantia=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoGarantia();
			
			TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoGarantia")) {
				jButtonNuevoTipoGarantiaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoGarantia")) {
				jButtonDuplicarTipoGarantiaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoGarantia")) {
				jButtonCopiarTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoGarantia")) {
				jButtonVerFormTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoGarantia")) {
				jButtonNuevoTipoGarantiaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoGarantia")) {
				jButtonDuplicarTipoGarantiaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoGarantia")) {
				jButtonNuevoTipoGarantiaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoGarantia")) {
				jButtonDuplicarTipoGarantiaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoGarantia")) {
				jButtonNuevoTipoGarantiaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoGarantia")) {
				jButtonNuevoTipoGarantiaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoGarantia")) {
				jButtonNuevoTipoGarantiaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoGarantia")) {
				jButtonModificarTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoGarantia")) {
				jButtonModificarTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoGarantia")) {
				jButtonModificarTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoGarantia")) {
				jButtonActualizarTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoGarantia")) {
				jButtonActualizarTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoGarantia")) {
				jButtonActualizarTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoGarantia")) {
				jButtonEliminarTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoGarantia")) {
				jButtonEliminarTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoGarantia")) {
				jButtonEliminarTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoGarantia")) {
				jButtonCancelarTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoGarantia")) {
				jButtonCancelarTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoGarantia")) {
				jButtonCancelarTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoGarantia")) {
				jButtonCerrarTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoGarantia")) {
				jButtonCerrarTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoGarantia")) {
				jButtonCerrarTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoGarantia")) {
				jButtonMostrarOcultarTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoGarantia")) {
				jButtonCancelarTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoGarantia")) {
				jButtonGuardarCambiosTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoGarantia")) {
				jButtonGuardarCambiosTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoGarantia")) {
				jButtonCopiarTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoGarantia")) {
				jButtonVerFormTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoGarantia")) {
				jButtonGuardarCambiosTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoGarantia")) {
				jButtonCopiarTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoGarantia")) {
				jButtonVerFormTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoGarantia")) {
				jButtonGuardarCambiosTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoGarantia")) {
				jButtonGuardarCambiosTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoGarantia")) {
				jButtonGuardarCambiosTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoGarantia")) {
				jButtonRecargarInformacionTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoGarantia")) {
				jButtonRecargarInformacionTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoGarantia")) {
				jButtonRecargarInformacionTipoGarantiaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoGarantia")) {
				jButtonAnterioresTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoGarantia")) {
				jButtonAnterioresTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoGarantia")) {
				jButtonAnterioresTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoGarantia")) {
				jButtonSiguientesTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoGarantia")) {
				jButtonSiguientesTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoGarantia")) {
				jButtonSiguientesTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoGarantia") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoGarantia")) {
				jButtonAbrirOrderByTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoGarantia") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoGarantia")) {
				jButtonMostrarOcultarTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoGarantia")) {
				jButtonNuevoGuardarCambiosTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoGarantia")) {
				jButtonNuevoGuardarCambiosTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoGarantia")) {
				jButtonNuevoGuardarCambiosTipoGarantiaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoGarantia")) {
				jButtonCerrarReporteDinamicoTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoGarantia")) {
				jButtonGenerarReporteDinamicoTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoGarantia")) {
				
				jButtonGenerarExcelReporteDinamicoTipoGarantiaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoGarantia")) {
				jButtonCerrarImportacionTipoGarantiaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoGarantia")) {
				
				jButtonGenerarImportacionTipoGarantiaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoGarantia")) {
				
				jButtonAbrirImportacionTipoGarantiaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoGarantia")) {
				jComboBoxTiposAccionesTipoGarantiaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoGarantia")) {
				jComboBoxTiposRelacionesTipoGarantiaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoGarantia")) {
				jComboBoxTiposAccionesTipoGarantiaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoGarantia")) {
				
				jComboBoxTiposSeleccionarTipoGarantiaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoGarantia")) {
				jTextFieldValorCampoGeneralTipoGarantiaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoGarantia")) {
				jButtonAbrirOrderByTipoGarantiaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoGarantia")) {
				jButtonAbrirOrderByTipoGarantiaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoGarantia")) {
				jButtonCerrarOrderByTipoGarantiaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoGarantiaBusqueda")) {
				this.jButtonidTipoGarantiaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoGarantiaUpdate")) {
				this.jButtonid_paisTipoGarantiaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoGarantiaBusqueda")) {
				this.jButtonid_paisTipoGarantiaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoGarantiaBusqueda")) {
				this.jButtoncodigoTipoGarantiaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoGarantiaBusqueda")) {
				this.jButtonnombreTipoGarantiaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoGarantia")) {
				this.jButtonBusquedaPorCodigoTipoGarantiaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoGarantia")) {
				this.jButtonBusquedaPorNombreTipoGarantiaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisTipoGarantia")) {
				this.jButtonFK_IdPaisTipoGarantiaActionPerformed(evt);
			}
			
			;
			
			
			TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoGarantia();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGarantiaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogarantia);
				
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
				
				


				
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGarantia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGarantia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoGarantia tipogarantiaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipogarantiaLocal=this.tipogarantia;
			} else {
				tipogarantiaLocal=this.tipogarantiaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogarantia);
				
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
							
				
				


				
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGarantia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGarantia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGarantiaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGarantia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaAnterior =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogarantiaAnterior =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
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
			
			TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
			
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
			
			


			
			TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGarantiaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogarantia);
				
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
								
						
				


				
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGarantia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGarantia.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogarantia);
				
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
								
				
				


				
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGarantia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGarantia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGarantiaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGarantia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaAnterior =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogarantiaAnterior =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogarantia);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGarantiaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGarantia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaAnterior =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogarantiaAnterior =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGarantiaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogarantia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogarantia);
				
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
							
				
				


				
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGarantia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGarantia.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGarantiaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoGarantia.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogarantiaAnterior =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipogarantiaAnterior =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
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
			
			TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
			
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
			
			


			
			TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGarantiaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogarantia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogarantia);
				
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
								
				
				


				
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGarantia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGarantia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGarantiaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGarantia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaAnterior =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogarantiaAnterior =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGarantiaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogarantia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGarantiaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogarantia);
				
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoGarantia")) {
					jCheckBoxSeleccionarTodosTipoGarantiaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoGarantia")) {
					jCheckBoxSeleccionadosTipoGarantiaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoGarantia")) {
					
				}
				
				


				
				
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGarantia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGarantia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantia);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipogarantia);
				
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
												
				
				


				
				
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGarantia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGarantia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGarantiaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoGarantia.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogarantiaAnterior =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipogarantiaAnterior =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGarantiaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogarantia);
				
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
				
				
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
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
			
			TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
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
			
			


			
			TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGarantiaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogarantia);
				
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGarantia.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGarantia.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogarantia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogarantia);
				
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
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
				
				


				
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGarantia.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGarantia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGarantiaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGarantia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogarantiaAnterior =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogarantiaAnterior =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoGarantia")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoGarantiaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoGarantia.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipogarantia =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipogarantia =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipogarantia);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoGarantia")) {
				
				}
				
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoGarantia")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoGarantia.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoGarantia")) {
			
			}
			
			TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoGarantia();
			
			TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoGarantia")) {
				jButtonNuevoTipoGarantiaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoGarantia")) {
				jButtonDuplicarTipoGarantiaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoGarantia")) {
				jButtonCopiarTipoGarantiaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoGarantia")) {
				jButtonVerFormTipoGarantiaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoGarantia")) {
				jButtonNuevoTipoGarantiaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoGarantia")) {
				jButtonModificarTipoGarantiaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoGarantia")) {
				jButtonActualizarTipoGarantiaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoGarantia")) {
				jButtonEliminarTipoGarantiaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoGarantia")) {
				jButtonGuardarCambiosTipoGarantiaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoGarantia")) {
				jButtonCancelarTipoGarantiaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoGarantia")) {
				jButtonCerrarTipoGarantiaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoGarantia")) {
				jButtonGuardarCambiosTipoGarantiaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoGarantia")) {
				jButtonNuevoGuardarCambiosTipoGarantiaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoGarantia")) {
				jButtonAbrirOrderByTipoGarantiaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoGarantia")) {
				jButtonRecargarInformacionTipoGarantiaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoGarantia")) {
				jButtonAnterioresTipoGarantiaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoGarantia")) {
				jButtonSiguientesTipoGarantiaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoGarantiaBusqueda")) {
				this.jButtonidTipoGarantiaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoGarantiaUpdate")) {
				this.jButtonid_paisTipoGarantiaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoGarantiaBusqueda")) {
				this.jButtonid_paisTipoGarantiaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoGarantiaBusqueda")) {
				this.jButtoncodigoTipoGarantiaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoGarantiaBusqueda")) {
				this.jButtonnombreTipoGarantiaBusquedaActionPerformed(evt);
			}
			
			TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoGarantia();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoGarantia")) {
				closingInternalFrameTipoGarantia();
				
			} else if(sTipo.equals("jButtonCancelarTipoGarantia")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoGarantia = (JInternalFrameBase)evt.getSource();
	            	
	            TipoGarantiaBeanSwingJInternalFrame jInternalFrameParent=(TipoGarantiaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoGarantia.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoGarantiaActionPerformed(null);
			}
			
			TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipogarantia,new Object(),this.tipogarantiaParameterGeneral,this.tipogarantiaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoGarantia(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoGarantia(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoGarantia(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipogarantia)) {
			if(!esControlTabla) {
				if(TipoGarantiaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoGarantia(this.tipogarantia,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantia(this.tipogarantia);			
				}
				
				if(this.tipogarantiaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoGarantia(this.tipogarantia,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipogarantiaReturnGeneral=tipogarantiaLogic.procesarEventosTipoGarantiasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogarantiaLogic.getTipoGarantias(),this.tipogarantia,this.tipogarantiaParameterGeneral,this.isEsNuevoTipoGarantia,classes);//this.tipogarantiaLogic.getTipoGarantia()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoGarantia(this.tipogarantiaReturnGeneral,this.tipogarantiaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipogarantiaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoGarantia(classes,this.tipogarantiaReturnGeneral,this.tipogarantiaBean,false);
					}
						
					if(this.tipogarantiaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoGarantia(this.tipogarantiaReturnGeneral.getTipoGarantia());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoGarantia(this.tipogarantiaReturnGeneral.getTipoGarantia());	
					}
						
					if(this.tipogarantiaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoGarantia(this.tipogarantiaReturnGeneral.getTipoGarantia(),classes);//this.tipogarantiaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoGarantia(this.tipogarantia,classes);//this.tipogarantiaBean);									
				}
			
				if(TipoGarantiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoGarantia(this.tipogarantia,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGarantia(this.tipogarantia);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipogarantiaAnterior!=null) {
						this.tipogarantia=this.tipogarantiaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipogarantiaReturnGeneral=tipogarantiaLogic.procesarEventosTipoGarantiasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogarantiaLogic.getTipoGarantias(),this.tipogarantia,this.tipogarantiaParameterGeneral,this.isEsNuevoTipoGarantia,classes);//this.tipogarantiaLogic.getTipoGarantia()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipogarantiaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipogarantiaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipogarantiaReturnGeneral.getTipoGarantia(),tipogarantiaLogic.getTipoGarantias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipogarantiaReturnGeneral.getTipoGarantia(),this.tipogarantias);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoGarantia.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoGarantia.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoGarantia();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoGarantia() throws Exception {
		
		TipoGarantiaModel tipogarantiaModel=(TipoGarantiaModel)this.jTableDatosTipoGarantia.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogarantiaModel.tipogarantias=this.tipogarantiaLogic.getTipoGarantias();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipogarantiaModel.tipogarantias=this.tipogarantias;
		}
		
		
		((TipoGarantiaModel) this.jTableDatosTipoGarantia.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoGarantia() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipogarantiaAnterior(),this.tipogarantiaLogic.getTipoGarantias());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipogarantiaAnterior(),this.tipogarantias);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoGarantia();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoGarantia(TipoGarantia tipogarantia,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
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
										
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogarantia,new Object(),generalEntityParameterGeneral,this.tipogarantiaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipogarantiaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoGarantiaConstantesFunciones.getClassesRelationshipsOfTipoGarantia(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoGarantiaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoGarantia(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoGarantia(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoGarantiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogarantia,new Object(),generalEntityParameterGeneral,this.tipogarantiaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoGarantia(TipoGarantiaBean tipogarantiaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoGarantia(ArrayList<Classe> classes,TipoGarantiaReturnGeneral tipogarantiaReturnGeneral,TipoGarantiaBean tipogarantiaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoGarantia(TipoGarantia tipogarantia,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipogarantia)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoGarantia = new TipoGarantiaDetalleFormJInternalFrame(jDesktopPane,this.tipogarantiaSessionBean.getConGuardarRelaciones(),this.tipogarantiaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoGarantia);
		this.jInternalFrameDetalleFormTipoGarantia.setVisible(false);
		this.jInternalFrameDetalleFormTipoGarantia.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoGarantia.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoGarantia.tipogarantiaLogic=this.tipogarantiaLogic;
		
		this.cargarCombosFrameForeignKeyTipoGarantia("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoGarantia();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoGarantia();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoGarantia("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoGarantia();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoGarantia.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoGarantia"));
		
		this.jInternalFrameDetalleFormTipoGarantia.jButtonModificarTipoGarantia.addActionListener(new ButtonActionListener(this,"ModificarTipoGarantia"));

		
		this.jInternalFrameDetalleFormTipoGarantia.jButtonModificarToolBarTipoGarantia.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoGarantia"));
					
		this.jInternalFrameDetalleFormTipoGarantia.jMenuItemModificarTipoGarantia.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoGarantia"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGarantia.jButtonActualizarTipoGarantia.addActionListener (new ButtonActionListener(this,"ActualizarTipoGarantia"));
		
		
		this.jInternalFrameDetalleFormTipoGarantia.jButtonActualizarToolBarTipoGarantia.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoGarantia"));
						
		this.jInternalFrameDetalleFormTipoGarantia.jMenuItemActualizarTipoGarantia.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoGarantia"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGarantia.jButtonEliminarTipoGarantia.addActionListener (new ButtonActionListener(this,"EliminarTipoGarantia"));
		
		
		this.jInternalFrameDetalleFormTipoGarantia.jButtonEliminarToolBarTipoGarantia.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoGarantia"));
								
		this.jInternalFrameDetalleFormTipoGarantia.jMenuItemEliminarTipoGarantia.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoGarantia"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGarantia.jButtonCancelarTipoGarantia.addActionListener (new ButtonActionListener(this,"CancelarTipoGarantia"));
		
		
		this.jInternalFrameDetalleFormTipoGarantia.jButtonCancelarToolBarTipoGarantia.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoGarantia"));
					
		this.jInternalFrameDetalleFormTipoGarantia.jMenuItemCancelarTipoGarantia.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoGarantia"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoGarantia.jMenuItemDetalleCerrarTipoGarantia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoGarantia"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGarantia.jButtonGuardarCambiosToolBarTipoGarantia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGarantia"));
		
		
		
		this.jInternalFrameDetalleFormTipoGarantia.jButtonGuardarCambiosToolBarTipoGarantia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGarantia"));
		
		
		
		this.jInternalFrameDetalleFormTipoGarantia.jComboBoxTiposAccionesFormularioTipoGarantia.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoGarantia"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantia.jButtonidTipoGarantiaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGarantiaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoGarantia.jButtonid_paisTipoGarantiaUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoGarantiaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantia.jButtonid_paisTipoGarantiaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoGarantiaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantia.jButtoncodigoTipoGarantiaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoGarantiaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantia.jButtonnombreTipoGarantiaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGarantiaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoGarantia.jTabbedPaneRelacionesTipoGarantia.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoGarantia"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoGarantia"));
		
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantia.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoGarantia"));
		}
		
		this.jTableDatosTipoGarantia.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoGarantia"));
		
		this.jTableDatosTipoGarantia.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoGarantia"));
		
		this.jButtonNuevoTipoGarantia.addActionListener(new ButtonActionListener(this,"NuevoTipoGarantia"));
		
		this.jButtonDuplicarTipoGarantia.addActionListener(new ButtonActionListener(this,"DuplicarTipoGarantia"));
		
		this.jButtonCopiarTipoGarantia.addActionListener(new ButtonActionListener(this,"CopiarTipoGarantia"));
		
		this.jButtonVerFormTipoGarantia.addActionListener(new ButtonActionListener(this,"VerFormTipoGarantia"));
		
		
		this.jButtonNuevoToolBarTipoGarantia.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoGarantia"));
			
		this.jButtonDuplicarToolBarTipoGarantia.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoGarantia"));
			
		this.jMenuItemNuevoTipoGarantia.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoGarantia"));
			
		this.jMenuItemDuplicarTipoGarantia.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoGarantia"));		
		
		
		this.jButtonNuevoRelacionesTipoGarantia.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoGarantia"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoGarantia.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoGarantia"));
			
		this.jMenuItemNuevoRelacionesTipoGarantia.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoGarantia"));		
		
		
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantia.jButtonModificarTipoGarantia.addActionListener(new ButtonActionListener(this,"ModificarTipoGarantia"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantia.jButtonModificarToolBarTipoGarantia.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoGarantia"));
			
			this.jInternalFrameDetalleFormTipoGarantia.jMenuItemModificarTipoGarantia.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoGarantia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoGarantia.jButtonActualizarTipoGarantia.addActionListener (new ButtonActionListener(this,"ActualizarTipoGarantia"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantia.jButtonActualizarToolBarTipoGarantia.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoGarantia"));
				
			this.jInternalFrameDetalleFormTipoGarantia.jMenuItemActualizarTipoGarantia.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoGarantia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantia.jButtonEliminarTipoGarantia.addActionListener (new ButtonActionListener(this,"EliminarTipoGarantia"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantia.jButtonEliminarToolBarTipoGarantia.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoGarantia"));
						
			this.jInternalFrameDetalleFormTipoGarantia.jMenuItemEliminarTipoGarantia.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoGarantia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantia.jButtonCancelarTipoGarantia.addActionListener (new ButtonActionListener(this,"CancelarTipoGarantia"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantia.jButtonCancelarToolBarTipoGarantia.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoGarantia"));
			
			this.jInternalFrameDetalleFormTipoGarantia.jMenuItemCancelarTipoGarantia.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoGarantia"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoGarantia.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoGarantia"));		
		
		
		this.jButtonCerrarTipoGarantia.addActionListener (new ButtonActionListener(this,"CerrarTipoGarantia"));
		
		
		this.jButtonCerrarToolBarTipoGarantia.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoGarantia"));
			
		this.jMenuItemCerrarTipoGarantia.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoGarantia"));
			
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantia.jMenuItemDetalleCerrarTipoGarantia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoGarantia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantia.jButtonGuardarCambiosTipoGarantia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoGarantia"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantia.jButtonGuardarCambiosToolBarTipoGarantia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGarantia"));
		}
		
		this.jButtonCopiarToolBarTipoGarantia.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoGarantia"));
			
		this.jButtonVerFormToolBarTipoGarantia.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoGarantia"));
		
		this.jMenuItemGuardarCambiosTipoGarantia.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoGarantia"));
			
		this.jMenuItemCopiarTipoGarantia.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoGarantia"));		
		
		this.jMenuItemVerFormTipoGarantia.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoGarantia"));		
		
		
		this.jButtonGuardarCambiosTablaTipoGarantia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoGarantia"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoGarantia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoGarantia"));
			
		this.jMenuItemGuardarCambiosTablaTipoGarantia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoGarantia"));		
		
		
		
		this.jButtonRecargarInformacionTipoGarantia.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoGarantia"));
					
		this.jButtonRecargarInformacionToolBarTipoGarantia.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoGarantia"));
		
		this.jMenuItemRecargarInformacionTipoGarantia.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoGarantia"));		
		
		
		
		this.jButtonAnterioresTipoGarantia.addActionListener (new ButtonActionListener(this,"AnterioresTipoGarantia"));
		
		
		this.jButtonAnterioresToolBarTipoGarantia.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoGarantia"));
		
		this.jMenuItemAnterioresTipoGarantia.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoGarantia"));		
		
		
		this.jButtonSiguientesTipoGarantia.addActionListener (new ButtonActionListener(this,"SiguientesTipoGarantia"));
		
		
		this.jButtonSiguientesToolBarTipoGarantia.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoGarantia"));
			
		this.jMenuItemSiguientesTipoGarantia.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoGarantia"));
			
		this.jMenuItemAbrirOrderByTipoGarantia.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoGarantia"));
			
		this.jMenuItemMostrarOcultarTipoGarantia.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoGarantia"));
			
		this.jMenuItemDetalleAbrirOrderByTipoGarantia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoGarantia"));
			
		this.jMenuItemDetalleMostarOcultarTipoGarantia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoGarantia"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoGarantia.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoGarantia"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGarantia.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoGarantia"));
			
		this.jMenuItemNuevoGuardarCambiosTipoGarantia.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoGarantia"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoGarantia.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoGarantia"));

		this.jCheckBoxSeleccionadosTipoGarantia.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoGarantia"));
		
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantia.jComboBoxTiposAccionesFormularioTipoGarantia.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoGarantia"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoGarantia.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoGarantia"));
			
		this.jComboBoxTiposAccionesTipoGarantia.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoGarantia"));
					
		this.jComboBoxTiposSeleccionarTipoGarantia.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoGarantia"));
			
		this.jTextFieldValorCampoGeneralTipoGarantia.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoGarantia"));		
		
		
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantia.jButtonidTipoGarantiaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGarantiaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoGarantia.jButtonid_paisTipoGarantiaUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoGarantiaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantia.jButtonid_paisTipoGarantiaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoGarantiaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantia.jButtoncodigoTipoGarantiaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoGarantiaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantia.jButtonnombreTipoGarantiaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGarantiaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoGarantia.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoGarantia"));

			this.jButtonBusquedaPorNombreTipoGarantia.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoGarantia"));

			this.jButtonFK_IdPaisTipoGarantia.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoGarantia"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoGarantia!=null) {
				this.jInternalFrameReporteDinamicoTipoGarantia.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGarantia"));
				this.jInternalFrameReporteDinamicoTipoGarantia.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGarantia"));
				this.jInternalFrameReporteDinamicoTipoGarantia.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGarantia"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoGarantia.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGarantia"));				
			//this.jButtonGenerarReporteDinamicoTipoGarantia.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGarantia"));
			//this.jButtonGenerarExcelReporteDinamicoTipoGarantia.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGarantia"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoGarantia!=null) {
				this.jInternalFrameImportacionTipoGarantia.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoGarantia"));
				this.jInternalFrameImportacionTipoGarantia.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoGarantia"));
				this.jInternalFrameImportacionTipoGarantia.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoGarantia"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoGarantia.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoGarantia"));
			
			this.jButtonAbrirOrderByToolBarTipoGarantia.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoGarantia"));			
			
			if(this.jInternalFrameOrderByTipoGarantia!=null) {
				this.jInternalFrameOrderByTipoGarantia.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoGarantia"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoGarantia!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGarantia.jTabbedPaneRelacionesTipoGarantia.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoGarantia"));
		
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
            		closingInternalFrameTipoGarantia();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoGarantia.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoGarantia = (JInternalFrameBase)event.getSource();
	            	
	            TipoGarantiaBeanSwingJInternalFrame jInternalFrameParent=(TipoGarantiaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoGarantia.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoGarantiaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoGarantia.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoGarantiaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoGarantia.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoGarantia.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGarantiaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGarantiaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGarantiaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoGarantia";
		inputMap = this.jButtonNuevoTipoGarantia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoGarantia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoGarantiaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGarantiaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGarantiaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGarantiaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoGarantia";
		inputMap = this.jButtonNuevoRelacionesTipoGarantia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoGarantia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoGarantiaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoGarantia";
		inputMap = this.jButtonModificarTipoGarantia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoGarantia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoGarantiaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoGarantia";
		inputMap = this.jButtonActualizarTipoGarantia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoGarantia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoGarantiaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoGarantia";
		inputMap = this.jButtonEliminarTipoGarantia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoGarantia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoGarantiaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoGarantia";
		inputMap = this.jButtonCancelarTipoGarantia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoGarantia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoGarantiaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoGarantia";
		inputMap = this.jButtonCerrarTipoGarantia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoGarantia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoGarantiaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoGarantia.jButtonGuardarCambiosTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoGarantia";
		inputMap = this.jInternalFrameDetalleFormTipoGarantia.jButtonGuardarCambiosTipoGarantia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoGarantia.jButtonGuardarCambiosTipoGarantia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoGarantiaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoGarantia.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoGarantiaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoGarantia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoGarantiaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoGarantia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoGarantiaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoGarantia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoGarantiaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantia.jButtonidTipoGarantiaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGarantiaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoGarantia.jButtonid_paisTipoGarantiaUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoGarantiaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantia.jButtonid_paisTipoGarantiaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoGarantiaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantia.jButtoncodigoTipoGarantiaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoGarantiaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGarantia.jButtonnombreTipoGarantiaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGarantiaBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoGarantia.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoGarantia"));

		this.jButtonBusquedaPorNombreTipoGarantia.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoGarantia"));

		this.jButtonFK_IdPaisTipoGarantia.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoGarantia"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoGarantia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoGarantiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoGarantiaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoGarantia.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoGarantia(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoGarantia tipogarantiaAux:this.tipogarantiaLogic.getTipoGarantias()) {
					tipogarantiaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGarantia tipogarantiaAux:tipogarantias) {
					tipogarantiaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoGarantiaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoGarantia(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoGarantia tipogarantiaAux:this.tipogarantiaLogic.getTipoGarantias()) {
						tipogarantiaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGarantia tipogarantiaAux:tipogarantias) {
						tipogarantiaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoGarantia tipogarantiaAux:this.tipogarantiaLogic.getTipoGarantias()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGarantia tipogarantiaAux:tipogarantias) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoGarantia(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoGarantia.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoGarantia.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoGarantia,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoGarantiaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoGarantia(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoGarantia.getSelectedRows();
			
			TipoGarantia tipogarantiaLocal=new TipoGarantia();
			
			//this.seleccionarTodosTipoGarantia(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogarantiaLocal =(TipoGarantia) this.tipogarantiaLogic.getTipoGarantias().toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipogarantiaLocal =(TipoGarantia) this.tipogarantias.toArray()[this.jTableDatosTipoGarantia.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipogarantiaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoGarantia tipogarantiaAux:this.tipogarantiaLogic.getTipoGarantias()) {
						tipogarantiaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGarantia tipogarantiaAux:tipogarantias) {
						tipogarantiaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoGarantia(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoGarantia.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoGarantia.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoGarantia,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoGarantiaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoGarantiaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoGarantiaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoGarantia(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoGarantia.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoGarantia tipogarantiaAux:this.tipogarantiaLogic.getTipoGarantias()) {
				
						if(sTipoSeleccionar.equals(TipoGarantiaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipogarantiaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoGarantiaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipogarantiaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGarantia tipogarantiaAux:tipogarantias) {
					
						if(sTipoSeleccionar.equals(TipoGarantiaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipogarantiaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoGarantiaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipogarantiaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoGarantia(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoGarantiaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoGarantia(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoGarantia=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoGarantia.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoGarantia.jComboBoxTiposAccionesFormularioTipoGarantia.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoGarantia) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoGarantia(conSplash);
				
					this.generarReporteTipoGarantiasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGarantia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGarantia.jComboBoxTiposAccionesFormularioTipoGarantia.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoGarantiasSeleccionados();
				//this.jComboBoxTiposAccionesTipoGarantia.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoGarantiasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoGarantia.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoGarantiasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoGarantia.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoGarantia();
				
				this.exportarTipoGarantiasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGarantia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGarantia.jComboBoxTiposAccionesFormularioTipoGarantia.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoGarantias();
				//this.importarTipoGarantias();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGarantia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGarantia.jComboBoxTiposAccionesFormularioTipoGarantia.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoGarantia();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoGarantiasSeleccionados();
				//this.jComboBoxTiposAccionesTipoGarantia.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Garantia", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoGarantia();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoGarantia)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoGarantia(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Garantia",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGarantia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGarantia.jComboBoxTiposAccionesFormularioTipoGarantia.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoGarantia();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoGarantia(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoGarantiaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoGarantia();
			
			if(this.jInternalFrameDetalleFormTipoGarantia==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoGarantia> tipogarantiasSeleccionados=new ArrayList<TipoGarantia>();		
			TipoGarantia tipogarantia=new TipoGarantia();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoGarantia(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoGarantia.getSelectedItem();
			
			
			
			
			tipogarantiasSeleccionados=this.getTipoGarantiasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipogarantiasSeleccionados.size()==1) {
				for(TipoGarantia tipogarantiaAux:tipogarantiasSeleccionados) {
					tipogarantia=tipogarantiaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoGarantia();
			
      		//this.finishProcessTipoGarantia(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoGarantiaReturnGeneral() throws Exception {
		if(this.tipogarantiaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipogarantiaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipogarantiaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipogarantiaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipogarantiaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipogarantiaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoGarantia(false);
		}
		
		if(this.tipogarantiaReturnGeneral.getConRetornoLista() || this.tipogarantiaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipogarantiaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipogarantiaLogic.setTipoGarantias(this.tipogarantiaReturnGeneral.getTipoGarantias());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipogarantiaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipogarantiaLogic.setTipoGarantia(this.tipogarantiaReturnGeneral.getTipoGarantia());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoGarantia(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoGarantia() throws Exception {
		
		
	}
	
	public ArrayList<TipoGarantia> getTipoGarantiasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoGarantia> tipogarantiasSeleccionados=new ArrayList<TipoGarantia>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoGarantia) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoGarantia tipogarantiaAux:tipogarantiaLogic.getTipoGarantias()) {
					if(tipogarantiaAux.getIsSelected()) {
						tipogarantiasSeleccionados.add(tipogarantiaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGarantia tipogarantiaAux:this.tipogarantias) {
					if(tipogarantiaAux.getIsSelected()) {
						tipogarantiasSeleccionados.add(tipogarantiaAux);				
					}
				}
			}
			
			if(tipogarantiasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipogarantiasSeleccionados.addAll(this.tipogarantiaLogic.getTipoGarantias());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipogarantiasSeleccionados.addAll(this.tipogarantias);				
					}
				}
			}
		} else {
			tipogarantiasSeleccionados.add(this.tipogarantia);
		}
		
		return tipogarantiasSeleccionados;
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
	
	public void generarReporteTipoGarantiasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoGarantiasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoGarantiasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoGarantiasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoGarantiasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Garantia",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoGarantiasSeleccionados() throws Exception {
		ArrayList<TipoGarantia> tipogarantiasSeleccionados=new ArrayList<TipoGarantia>();		
		
		tipogarantiasSeleccionados=this.getTipoGarantiasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoGarantias("Todos",tipogarantiasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoGarantiasSeleccionados() throws Exception {
		ArrayList<TipoGarantia> tipogarantiasSeleccionados=new ArrayList<TipoGarantia>();		
		
		tipogarantiasSeleccionados=this.getTipoGarantiasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoGarantias("Todos",tipogarantiasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoGarantiasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoGarantia> tipogarantiasSeleccionados=new ArrayList<TipoGarantia>();
		
		tipogarantiasSeleccionados=this.getTipoGarantiasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoGarantias("Todos",tipogarantiasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoGarantiasSeleccionados() throws Exception {
		ArrayList<TipoGarantia> tipogarantiasSeleccionados=new ArrayList<TipoGarantia>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoGarantia();
		
		
		tipogarantiasSeleccionados=this.getTipoGarantiasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoGarantia();
		
		
		//this.generarReporteTipoGarantias("Todos",tipogarantiasSeleccionados ,tipogarantiaImplementable,tipogarantiaImplementableHome);
	}
	
	public void mostrarImportacionTipoGarantias() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoGarantia();
		
		this.abrirFrameImportacionTipoGarantia();		
		
			
		//this.generarReporteTipoGarantias("Todos",tipogarantiasSeleccionados ,tipogarantiaImplementable,tipogarantiaImplementableHome);
	}
	
	public void importarTipoGarantias() throws Exception {		
	
	}
	
	public void exportarTipoGarantiasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoGarantiasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoGarantiasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoGarantiasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Garantia",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoGarantiasSeleccionados() throws Exception {
		ArrayList<TipoGarantia> tipogarantiasSeleccionados=new ArrayList<TipoGarantia>();		
		
		tipogarantiasSeleccionados=this.getTipoGarantiasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogarantia."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoGarantia(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoGarantia tipogarantiaAux:tipogarantiasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoGarantia(tipogarantiaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipogarantiaAux.setsDetalleGeneralEntityReporte(tipogarantiaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Garantia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoGarantia(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoGarantiaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGarantiaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGarantiaConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGarantiaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGarantiaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoGarantia(TipoGarantia tipogarantia,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipogarantia.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogarantia.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogarantia.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogarantia.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogarantia.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoGarantiasSeleccionados() throws Exception {
		ArrayList<TipoGarantia> tipogarantiasSeleccionados=new ArrayList<TipoGarantia>();		
		
		tipogarantiasSeleccionados=this.getTipoGarantiasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogarantia.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoGarantias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoGarantia(row);				
				iRow++;
			}				
			
			for(TipoGarantia tipogarantiaAux:tipogarantiasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoGarantia(tipogarantiaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Garantia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoGarantiasSeleccionados() throws Exception {
		ArrayList<TipoGarantia> tipogarantiasSeleccionados=new ArrayList<TipoGarantia>();		
		
		tipogarantiasSeleccionados=this.getTipoGarantiasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogarantia.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipogarantias");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipogarantia");
			//elementRoot.appendChild(element);
		
			for(TipoGarantia tipogarantiaAux:tipogarantiasSeleccionados) {
				element = document.createElement("tipogarantia");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoGarantia(tipogarantiaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Garantia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoGarantia(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGarantiaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGarantiaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoGarantiaConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGarantiaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGarantiaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoGarantia(TipoGarantia tipogarantia,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipogarantia.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipogarantia.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipogarantia.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipogarantia.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoGarantia(TipoGarantia tipogarantia,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoGarantiaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipogarantia.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoGarantiaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipogarantia.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpais_descripcion = document.createElement(TipoGarantiaConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(tipogarantia.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementcodigo = document.createElement(TipoGarantiaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipogarantia.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoGarantiaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipogarantia.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoGarantiasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoGarantia> tipogarantiasSeleccionados=new ArrayList<TipoGarantia>();
		
		tipogarantiasSeleccionados=this.getTipoGarantiasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoGarantia(tipogarantiasSeleccionados);
		
		this.generarReporteTipoGarantias("Todos",tipogarantiasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoGarantia(ArrayList<TipoGarantia> tipogarantiasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoGarantia tipogarantiaAux:tipogarantiasSeleccionados) {
				tipogarantiaAux.setsDetalleGeneralEntityReporte(tipogarantiaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoGarantiaConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					tipogarantiaAux.setsDescripcionGeneralEntityReporte1(tipogarantiaAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoGarantiaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipogarantiaAux.setsDescripcionGeneralEntityReporte1(tipogarantiaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoGarantiaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipogarantiaAux.setsDescripcionGeneralEntityReporte1(tipogarantiaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGarantiaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoGarantia(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoGarantia=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoGarantia=true;
				this.isVisibilidadCeldaGuardarCambiosTipoGarantia=true;
			}
			
			this.isVisibilidadCeldaModificarTipoGarantia=false;
			this.isVisibilidadCeldaActualizarTipoGarantia=false;
			this.isVisibilidadCeldaEliminarTipoGarantia=false;
			this.isVisibilidadCeldaCancelarTipoGarantia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGarantia=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGarantia=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoGarantia=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantia=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGarantia=false;
			this.isVisibilidadCeldaModificarTipoGarantia=false;
			this.isVisibilidadCeldaActualizarTipoGarantia=true;
			this.isVisibilidadCeldaEliminarTipoGarantia=false;
			this.isVisibilidadCeldaCancelarTipoGarantia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGarantia=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGarantia=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoGarantia=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantia=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGarantia=false;
			this.isVisibilidadCeldaModificarTipoGarantia=false;
			this.isVisibilidadCeldaActualizarTipoGarantia=true;
			this.isVisibilidadCeldaEliminarTipoGarantia=true;
			this.isVisibilidadCeldaCancelarTipoGarantia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGarantia=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGarantia=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoGarantia=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantia=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGarantia=false;
			this.isVisibilidadCeldaModificarTipoGarantia=false;
			this.isVisibilidadCeldaActualizarTipoGarantia=true;
			this.isVisibilidadCeldaEliminarTipoGarantia=false;
			this.isVisibilidadCeldaCancelarTipoGarantia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGarantia=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGarantia=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoGarantia=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantia=true;
			this.isVisibilidadCeldaGuardarCambiosTipoGarantia=true;
			this.isVisibilidadCeldaModificarTipoGarantia=false;
			this.isVisibilidadCeldaActualizarTipoGarantia=false;
			this.isVisibilidadCeldaEliminarTipoGarantia=false;
			this.isVisibilidadCeldaCancelarTipoGarantia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGarantia=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGarantia=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoGarantia=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantia=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGarantia=false;
			this.isVisibilidadCeldaActualizarTipoGarantia=false;
			this.isVisibilidadCeldaEliminarTipoGarantia=false;
			this.isVisibilidadCeldaCancelarTipoGarantia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGarantia=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGarantia=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoGarantia=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantia=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGarantia=false;
			this.isVisibilidadCeldaModificarTipoGarantia=true;
			this.isVisibilidadCeldaActualizarTipoGarantia=false;
			this.isVisibilidadCeldaEliminarTipoGarantia=false;
			this.isVisibilidadCeldaCancelarTipoGarantia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGarantia=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGarantia=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoGarantiaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoGarantia=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantia=true;
			this.isVisibilidadCeldaGuardarCambiosTipoGarantia=true;
		} else {
			this.actualizarEstadoPanelsTipoGarantia(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoGarantia=false;
			//this.isVisibilidadCeldaVerFormTipoGarantia=false;
			this.isVisibilidadCeldaDuplicarTipoGarantia=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipogarantiaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantia=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoGarantia=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGarantia=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipogarantiaSessionBean.getEsGuardarRelacionado()) {
			if(!tipogarantiaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoGarantia=false;												
			}
			
			this.jButtonCerrarTipoGarantia.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoGarantia=false;
		}
		
		if(!this.permiteMantenimiento(this.tipogarantia)) {
			this.isVisibilidadCeldaActualizarTipoGarantia=false;
			this.isVisibilidadCeldaEliminarTipoGarantia=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoGarantia() {
	}
	
	public void actualizarEstadoPanelsTipoGarantia(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoGarantia!=null) {
				this.jScrollPanelDatosEdicionTipoGarantia.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGarantia!=null) {
				this.jTabbedPaneBusquedasTipoGarantia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGarantia!=null) {
				this.jScrollPanelDatosTipoGarantia.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGarantia!=null) {
				this.jPanelPaginacionTipoGarantia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGarantia!=null) {
				this.jPanelParametrosReportesTipoGarantia.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoGarantia!=null) {
				this.jScrollPanelDatosEdicionTipoGarantia.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGarantia!=null) {
				this.jTabbedPaneBusquedasTipoGarantia.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoGarantia!=null) {
				this.jScrollPanelDatosTipoGarantia.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGarantia!=null) {
				this.jPanelPaginacionTipoGarantia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGarantia!=null) {
				this.jPanelParametrosReportesTipoGarantia.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoGarantia!=null) {
				this.jScrollPanelDatosEdicionTipoGarantia.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGarantia!=null) {
				this.jTabbedPaneBusquedasTipoGarantia.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoGarantia!=null) {
				this.jScrollPanelDatosTipoGarantia.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGarantia!=null) {
				this.jPanelPaginacionTipoGarantia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGarantia!=null) {
				this.jPanelParametrosReportesTipoGarantia.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoGarantia!=null) {
				this.jScrollPanelDatosEdicionTipoGarantia.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGarantia!=null) {
				this.jTabbedPaneBusquedasTipoGarantia.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoGarantia!=null) {
				this.jScrollPanelDatosTipoGarantia.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGarantia!=null) {
				this.jPanelPaginacionTipoGarantia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGarantia!=null) {
				this.jPanelParametrosReportesTipoGarantia.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoGarantia!=null) {
				this.jScrollPanelDatosEdicionTipoGarantia.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGarantia!=null) {
				this.jTabbedPaneBusquedasTipoGarantia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGarantia!=null) {
				this.jScrollPanelDatosTipoGarantia.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGarantia!=null) {
				this.jPanelPaginacionTipoGarantia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGarantia!=null) {
				this.jPanelParametrosReportesTipoGarantia.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoGarantia!=null) {
				this.jScrollPanelDatosEdicionTipoGarantia.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGarantia!=null) {
				this.jTabbedPaneBusquedasTipoGarantia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGarantia!=null) {
				this.jScrollPanelDatosTipoGarantia.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGarantia!=null) {
				this.jPanelPaginacionTipoGarantia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGarantia!=null) {
				this.jPanelParametrosReportesTipoGarantia.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoGarantia!=null) {
				this.jScrollPanelDatosEdicionTipoGarantia.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGarantia!=null) {
				this.jTabbedPaneBusquedasTipoGarantia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGarantia!=null) {
				this.jScrollPanelDatosTipoGarantia.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGarantia!=null) {
				this.jPanelPaginacionTipoGarantia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGarantia!=null) {
				this.jPanelParametrosReportesTipoGarantia.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoGarantia!=null) {
					this.jTabbedPaneBusquedasTipoGarantia.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoGarantia!=null) {
				this.jPanelParametrosReportesTipoGarantia.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGarantia!=null) {
				this.jTabbedPaneBusquedasTipoGarantia.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoGarantia!=null) {
				this.jPanelParametrosReportesTipoGarantia.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadBusquedaPorCodigo=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoGarantia.remove(jPanelBusquedaPorCodigoTipoGarantia);}

			this.isVisibilidadBusquedaPorNombre=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoGarantia.remove(jPanelBusquedaPorNombreTipoGarantia);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasTipoGarantia.remove(jPanelFK_IdPaisTipoGarantia);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoGarantiaSessionBean tipogarantiaSessionBean=new TipoGarantiaSessionBean();
		
		if(this.tipogarantiaSessionBean==null) {
			this.tipogarantiaSessionBean=new TipoGarantiaSessionBean();
		}
		
		this.tipogarantiaSessionBean.setsUltimaBusquedaTipoGarantia(this.getsAccionBusqueda());
		this.tipogarantiaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipogarantiaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tipogarantiaSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipogarantiaSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			tipogarantiaSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoGarantiaSessionBean tipogarantiaSessionBean=new TipoGarantiaSessionBean();
		
		if(this.tipogarantiaSessionBean==null) {
			this.tipogarantiaSessionBean=new TipoGarantiaSessionBean();
		}
		
		if(this.tipogarantiaSessionBean.getsUltimaBusquedaTipoGarantia()!=null&&!this.tipogarantiaSessionBean.getsUltimaBusquedaTipoGarantia().equals("")) {
			this.setsAccionBusqueda(tipogarantiaSessionBean.getsUltimaBusquedaTipoGarantia());
			this.setiNumeroPaginacion(tipogarantiaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipogarantiaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tipogarantiaSessionBean.getcodigo());
				tipogarantiaSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipogarantiaSessionBean.getnombre());
				tipogarantiaSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(tipogarantiaSessionBean.getid_pais());
				tipogarantiaSessionBean.setid_pais(-1L);
			}
		}
		
		this.tipogarantiaSessionBean.setsUltimaBusquedaTipoGarantia("");
		this.tipogarantiaSessionBean.setiNumeroPaginacion(TipoGarantiaConstantesFunciones.INUMEROPAGINACION);
		this.tipogarantiaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoGarantia(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoGarantia() {
		this.updateBorderResaltarBusquedasFormularioTipoGarantia();
		this.updateVisibilidadBusquedasFormularioTipoGarantia();
		this.updateHabilitarBusquedasFormularioTipoGarantia();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoGarantia() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoGarantia.getComponents().length>0) {
	

		if(this.tipogarantiaConstantesFunciones.resaltarBusquedaPorCodigoTipoGarantia!=null) {
			index= this.jTabbedPaneBusquedasTipoGarantia.indexOfComponent(this.jPanelBusquedaPorCodigoTipoGarantia);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGarantia.getComponent(index);
				jPanel.setBorder(this.tipogarantiaConstantesFunciones.resaltarBusquedaPorCodigoTipoGarantia);
			}
		}

		if(this.tipogarantiaConstantesFunciones.resaltarBusquedaPorNombreTipoGarantia!=null) {
			index= this.jTabbedPaneBusquedasTipoGarantia.indexOfComponent(this.jPanelBusquedaPorNombreTipoGarantia);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGarantia.getComponent(index);
				jPanel.setBorder(this.tipogarantiaConstantesFunciones.resaltarBusquedaPorNombreTipoGarantia);
			}
		}

		if(this.tipogarantiaConstantesFunciones.resaltarFK_IdPaisTipoGarantia!=null) {
			index= this.jTabbedPaneBusquedasTipoGarantia.indexOfComponent(this.jPanelFK_IdPaisTipoGarantia);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGarantia.getComponent(index);
				jPanel.setBorder(this.tipogarantiaConstantesFunciones.resaltarFK_IdPaisTipoGarantia);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoGarantia() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoGarantia.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoGarantia.indexOfComponent(this.jPanelBusquedaPorCodigoTipoGarantia);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGarantia.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipogarantiaConstantesFunciones.mostrarBusquedaPorCodigoTipoGarantia);
			if(!this.tipogarantiaConstantesFunciones.mostrarBusquedaPorCodigoTipoGarantia && index>-1) {
				this.jTabbedPaneBusquedasTipoGarantia.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoGarantia.indexOfComponent(this.jPanelBusquedaPorNombreTipoGarantia);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGarantia.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipogarantiaConstantesFunciones.mostrarBusquedaPorNombreTipoGarantia);
			if(!this.tipogarantiaConstantesFunciones.mostrarBusquedaPorNombreTipoGarantia && index>-1) {
				this.jTabbedPaneBusquedasTipoGarantia.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoGarantia.indexOfComponent(this.jPanelFK_IdPaisTipoGarantia);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGarantia.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipogarantiaConstantesFunciones.mostrarFK_IdPaisTipoGarantia);
			if(!this.tipogarantiaConstantesFunciones.mostrarFK_IdPaisTipoGarantia && index>-1) {
				this.jTabbedPaneBusquedasTipoGarantia.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoGarantia() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoGarantia.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoGarantia.indexOfComponent(this.jPanelBusquedaPorCodigoTipoGarantia);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGarantia.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipogarantiaConstantesFunciones.activarBusquedaPorCodigoTipoGarantia);
				this.jTabbedPaneBusquedasTipoGarantia.setEnabledAt(index,this.tipogarantiaConstantesFunciones.activarBusquedaPorCodigoTipoGarantia);
			}

			index= this.jTabbedPaneBusquedasTipoGarantia.indexOfComponent(this.jPanelBusquedaPorNombreTipoGarantia);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGarantia.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipogarantiaConstantesFunciones.activarBusquedaPorNombreTipoGarantia);
				this.jTabbedPaneBusquedasTipoGarantia.setEnabledAt(index,this.tipogarantiaConstantesFunciones.activarBusquedaPorNombreTipoGarantia);
			}

			index= this.jTabbedPaneBusquedasTipoGarantia.indexOfComponent(this.jPanelFK_IdPaisTipoGarantia);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGarantia.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipogarantiaConstantesFunciones.activarFK_IdPaisTipoGarantia);
				this.jTabbedPaneBusquedasTipoGarantia.setEnabledAt(index,this.tipogarantiaConstantesFunciones.activarFK_IdPaisTipoGarantia);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoGarantia(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoGarantia.indexOfComponent(this.jPanelBusquedaPorCodigoTipoGarantia);

			this.jTabbedPaneBusquedasTipoGarantia.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGarantia.getComponent(index);

			this.tipogarantiaConstantesFunciones.setResaltarBusquedaPorCodigoTipoGarantia(resaltar);

			jPanel.setBorder(this.tipogarantiaConstantesFunciones.resaltarBusquedaPorCodigoTipoGarantia);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoGarantia.indexOfComponent(this.jPanelBusquedaPorNombreTipoGarantia);

			this.jTabbedPaneBusquedasTipoGarantia.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGarantia.getComponent(index);

			this.tipogarantiaConstantesFunciones.setResaltarBusquedaPorNombreTipoGarantia(resaltar);

			jPanel.setBorder(this.tipogarantiaConstantesFunciones.resaltarBusquedaPorNombreTipoGarantia);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasTipoGarantia.indexOfComponent(this.jPanelFK_IdPaisTipoGarantia);

			this.jTabbedPaneBusquedasTipoGarantia.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGarantia.getComponent(index);

			this.tipogarantiaConstantesFunciones.setResaltarFK_IdPaisTipoGarantia(resaltar);

			jPanel.setBorder(this.tipogarantiaConstantesFunciones.resaltarFK_IdPaisTipoGarantia);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoGarantia.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoGarantia() throws Exception {

		if(this.jInternalFrameDetalleFormTipoGarantia==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoGarantia();
		this.updateVisibilidadResaltarControlesFormularioTipoGarantia();
		this.updateHabilitarResaltarControlesFormularioTipoGarantia();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoGarantia() throws Exception {
		if(this.jInternalFrameDetalleFormTipoGarantia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipogarantiaConstantesFunciones.resaltaridTipoGarantia!=null && this.jInternalFrameDetalleFormTipoGarantia!=null) {this.jInternalFrameDetalleFormTipoGarantia.jTextFieldidTipoGarantia.setBorder(this.tipogarantiaConstantesFunciones.resaltaridTipoGarantia);}
		if(this.tipogarantiaConstantesFunciones.resaltarid_paisTipoGarantia!=null && this.jInternalFrameDetalleFormTipoGarantia!=null) {this.jInternalFrameDetalleFormTipoGarantia.jComboBoxid_paisTipoGarantia.setBorder(this.tipogarantiaConstantesFunciones.resaltarid_paisTipoGarantia);}
		if(this.tipogarantiaConstantesFunciones.resaltarcodigoTipoGarantia!=null && this.jInternalFrameDetalleFormTipoGarantia!=null) {this.jInternalFrameDetalleFormTipoGarantia.jTextFieldcodigoTipoGarantia.setBorder(this.tipogarantiaConstantesFunciones.resaltarcodigoTipoGarantia);}
		if(this.tipogarantiaConstantesFunciones.resaltarnombreTipoGarantia!=null && this.jInternalFrameDetalleFormTipoGarantia!=null) {this.jInternalFrameDetalleFormTipoGarantia.jTextAreanombreTipoGarantia.setBorder(this.tipogarantiaConstantesFunciones.resaltarnombreTipoGarantia);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoGarantia() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoGarantia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) {
	
		//this.jInternalFrameDetalleFormTipoGarantia.jTextFieldidTipoGarantia.setVisible(this.tipogarantiaConstantesFunciones.mostraridTipoGarantia);
		this.jInternalFrameDetalleFormTipoGarantia.jPanelidTipoGarantia.setVisible(this.tipogarantiaConstantesFunciones.mostraridTipoGarantia);
		//this.jInternalFrameDetalleFormTipoGarantia.jComboBoxid_paisTipoGarantia.setVisible(this.tipogarantiaConstantesFunciones.mostrarid_paisTipoGarantia);
		this.jInternalFrameDetalleFormTipoGarantia.jPanelid_paisTipoGarantia.setVisible(this.tipogarantiaConstantesFunciones.mostrarid_paisTipoGarantia);
		//this.jInternalFrameDetalleFormTipoGarantia.jTextFieldcodigoTipoGarantia.setVisible(this.tipogarantiaConstantesFunciones.mostrarcodigoTipoGarantia);
		this.jInternalFrameDetalleFormTipoGarantia.jPanelcodigoTipoGarantia.setVisible(this.tipogarantiaConstantesFunciones.mostrarcodigoTipoGarantia);
		//this.jInternalFrameDetalleFormTipoGarantia.jTextAreanombreTipoGarantia.setVisible(this.tipogarantiaConstantesFunciones.mostrarnombreTipoGarantia);
		this.jInternalFrameDetalleFormTipoGarantia.jPanelnombreTipoGarantia.setVisible(this.tipogarantiaConstantesFunciones.mostrarnombreTipoGarantia);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoGarantia() throws Exception {
		if(this.jInternalFrameDetalleFormTipoGarantia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoGarantia!=null) {
	
		this.jInternalFrameDetalleFormTipoGarantia.jTextFieldidTipoGarantia.setEnabled(this.tipogarantiaConstantesFunciones.activaridTipoGarantia);
		this.jInternalFrameDetalleFormTipoGarantia.jComboBoxid_paisTipoGarantia.setEnabled(this.tipogarantiaConstantesFunciones.activarid_paisTipoGarantia);
		this.jInternalFrameDetalleFormTipoGarantia.jTextFieldcodigoTipoGarantia.setEnabled(this.tipogarantiaConstantesFunciones.activarcodigoTipoGarantia);
		this.jInternalFrameDetalleFormTipoGarantia.jTextAreanombreTipoGarantia.setEnabled(this.tipogarantiaConstantesFunciones.activarnombreTipoGarantia);
		}
	}
	
		
}