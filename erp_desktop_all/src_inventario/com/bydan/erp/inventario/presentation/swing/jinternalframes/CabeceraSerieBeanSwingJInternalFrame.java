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

import com.bydan.erp.inventario.util.CabeceraSerieConstantesFunciones;
import com.bydan.erp.inventario.util.CabeceraSerieParameterReturnGeneral;
//import com.bydan.erp.inventario.util.CabeceraSerieParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.CabeceraSerieBean;
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

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CabeceraSerieBeanSwingJInternalFrame extends CabeceraSerieJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CabeceraSerieBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CabeceraSerie> cabeceraserieValidator = new ClassValidator<CabeceraSerie>(CabeceraSerie.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CabeceraSerie cabeceraserie;	
	public CabeceraSerie cabeceraserieAux;
	public CabeceraSerie cabeceraserieAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CabeceraSerie cabeceraserieTotales;
	public Long idCabeceraSerieActual;
	public Long iIdNuevoCabeceraSerie=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
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
	
	public Boolean isPermisoTodoCabeceraSerie;
	public Boolean isPermisoNuevoCabeceraSerie;
	public Boolean isPermisoActualizarCabeceraSerie;
	public Boolean isPermisoActualizarOriginalCabeceraSerie;
	public Boolean isPermisoEliminarCabeceraSerie;
	public Boolean isPermisoGuardarCambiosCabeceraSerie;
	public Boolean isPermisoConsultaCabeceraSerie;
	public Boolean isPermisoBusquedaCabeceraSerie;
	public Boolean isPermisoReporteCabeceraSerie;
	public Boolean isPermisoPaginacionMedioCabeceraSerie;
	public Boolean isPermisoPaginacionAltoCabeceraSerie;
	public Boolean isPermisoPaginacionTodoCabeceraSerie;
	public Boolean isPermisoCopiarCabeceraSerie;
	public Boolean isPermisoVerFormCabeceraSerie;
	public Boolean isPermisoDuplicarCabeceraSerie;
	public Boolean isPermisoOrdenCabeceraSerie;
	
	
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
	
	public CabeceraSerieParameterReturnGeneral cabeceraserieReturnGeneral;
	public CabeceraSerieParameterReturnGeneral cabeceraserieParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCabeceraSerie=false;
	public Boolean esParaAccionDesdeFormularioCabeceraSerie=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CabeceraSerieSessionBeanAdditional cabeceraserieSessionBeanAdditional=null;
	
	public CabeceraSerieSessionBeanAdditional getCabeceraSerieSessionBeanAdditional() {
		return this.cabeceraserieSessionBeanAdditional;
	}
	
	public void setCabeceraSerieSessionBeanAdditional(CabeceraSerieSessionBeanAdditional cabeceraserieSessionBeanAdditional) {
		try {
			this.cabeceraserieSessionBeanAdditional=cabeceraserieSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CabeceraSerieBeanSwingJInternalFrameAdditional cabeceraserieBeanSwingJInternalFrameAdditional=null;
	//public class CabeceraSerieBeanSwingJInternalFrame
	
	public CabeceraSerieBeanSwingJInternalFrameAdditional getCabeceraSerieBeanSwingJInternalFrameAdditional() {
		return this.cabeceraserieBeanSwingJInternalFrameAdditional;
	}
	
	public void setCabeceraSerieBeanSwingJInternalFrameAdditional(CabeceraSerieBeanSwingJInternalFrameAdditional cabeceraserieBeanSwingJInternalFrameAdditional) {
		try {
			this.cabeceraserieBeanSwingJInternalFrameAdditional=cabeceraserieBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CabeceraSerieLogic cabeceraserieLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CabeceraSerie cabeceraserieBean;
	public CabeceraSerieConstantesFunciones cabeceraserieConstantesFunciones;
	//public CabeceraSerieParameterReturnGeneral cabeceraserieReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<CabeceraSerie> cabeceraseries;	
	//public List<CabeceraSerie> cabeceraseriesEliminados;
	//public List<CabeceraSerie> cabeceraseriesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCabeceraSerie=false;
	public Boolean isVisibilidadCeldaDuplicarCabeceraSerie=true;
	public Boolean isVisibilidadCeldaCopiarCabeceraSerie=true;
	public Boolean isVisibilidadCeldaVerFormCabeceraSerie=true;
	public Boolean isVisibilidadCeldaOrdenCabeceraSerie=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCabeceraSerie=false;
	public Boolean isVisibilidadCeldaModificarCabeceraSerie=false;
	public Boolean isVisibilidadCeldaActualizarCabeceraSerie=false;
	public Boolean isVisibilidadCeldaEliminarCabeceraSerie=false;
	public Boolean isVisibilidadCeldaCancelarCabeceraSerie=false;
	public Boolean isVisibilidadCeldaGuardarCabeceraSerie=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCabeceraSerie=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoCabeceraSerie() {
		return this.iIdNuevoCabeceraSerie;
	}

	public void setiIdNuevoCabeceraSerie(Long iIdNuevoCabeceraSerie) {
		this.iIdNuevoCabeceraSerie = iIdNuevoCabeceraSerie;
	}
	
	public Long getidCabeceraSerieActual() {
		return this.idCabeceraSerieActual;
	}

	public void setidCabeceraSerieActual(Long idCabeceraSerieActual) {
		this.idCabeceraSerieActual = idCabeceraSerieActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CabeceraSerie getcabeceraserie() {
		return this.cabeceraserie;
	}

	public void setcabeceraserie(CabeceraSerie cabeceraserie) {
		this.cabeceraserie = cabeceraserie;
	}
	
	public CabeceraSerie getcabeceraserieAux() {
		return this.cabeceraserieAux;
	}

	public void setcabeceraserieAux(CabeceraSerie cabeceraserieAux) {
		this.cabeceraserieAux = cabeceraserieAux;
	}				
	
	public CabeceraSerie getcabeceraserieAnterior() {
		return this.cabeceraserieAnterior;
	}

	public void setcabeceraserieAnterior(CabeceraSerie cabeceraserieAnterior) {
		this.cabeceraserieAnterior = cabeceraserieAnterior;
	}	
	
	public CabeceraSerie getcabeceraserieTotales() {
		return this.cabeceraserieTotales;
	}

	public void setcabeceraserieTotales(CabeceraSerie cabeceraserieTotales) {
		this.cabeceraserieTotales = cabeceraserieTotales;
	}	
	
	public CabeceraSerie getcabeceraserieBean() {
		return this.cabeceraserieBean;
	}

	public void setcabeceraserieBean(CabeceraSerie cabeceraserieBean) {
		this.cabeceraserieBean = cabeceraserieBean;
	}	
	
	public CabeceraSerieParameterReturnGeneral getcabeceraserieReturnGeneral() {
		return this.cabeceraserieReturnGeneral;
	}

	public void setcabeceraserieReturnGeneral(CabeceraSerieParameterReturnGeneral cabeceraserieReturnGeneral) {
		this.cabeceraserieReturnGeneral = cabeceraserieReturnGeneral;
	}	
	
	
	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CabeceraSerieLogic getCabeceraSerieLogic()	{		
		return cabeceraserieLogic;
	}

	public void setCabeceraSerieLogic(CabeceraSerieLogic cabeceraserieLogic) {
		this.cabeceraserieLogic = cabeceraserieLogic;
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
	
	public Boolean getIsEsNuevoCabeceraSerie() {
		return isEsNuevoCabeceraSerie;
	}

	public void setIsEsNuevoCabeceraSerie(Boolean isEsNuevoCabeceraSerie) {
		this.isEsNuevoCabeceraSerie = isEsNuevoCabeceraSerie;
	}

	public Boolean getEsParaAccionDesdeFormularioCabeceraSerie() {
		return esParaAccionDesdeFormularioCabeceraSerie;
	}
	
	public void setEsParaAccionDesdeFormularioCabeceraSerie(Boolean esParaAccionDesdeFormularioCabeceraSerie) {
		this.esParaAccionDesdeFormularioCabeceraSerie = esParaAccionDesdeFormularioCabeceraSerie;
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
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.cabeceraserieSessionBean==null) {
				this.cabeceraserieSessionBean=new CabeceraSerieSessionBean();
			}

			if(!this.cabeceraserieSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(cabeceraserieSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
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

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.cabeceraserie!=null) {
						this.cabeceraserie.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCabeceraSerie!=null) {
						this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxid_empresaCabeceraSerie.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCabeceraSerie.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCabeceraSerie!=null) {
						if(this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxid_empresaCabeceraSerie.getItemCount()>0) {
							this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxid_empresaCabeceraSerie.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCabeceraSerieGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaCabeceraSerieGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCabeceraSerieGenerico!=null && jComboBoxid_empresaCabeceraSerieGenerico.getItemCount()>0) {
					jComboBoxid_empresaCabeceraSerieGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CabeceraSerie cabeceraserie,JComboBox jComboBoxid_empresaCabeceraSerieGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCabeceraSerieGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxid_empresaCabeceraSerie.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCabeceraSerieGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cabeceraserie.setid_empresa(empresaAux.getId());
				cabeceraserie.setempresa_descripcion(CabeceraSerieConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cabeceraserie.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CabeceraSerieJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCabeceraSerie!=null) { 
							this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxid_empresaCabeceraSerie.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxid_empresaCabeceraSerie.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCabeceraSerie!=null) { 
					}

					if(!CabeceraSerieJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCabeceraSerie!=null) {
							this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxid_empresaCabeceraSerie.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCabeceraSerie!=null) {
							this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxid_empresaCabeceraSerie.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCabeceraSerie() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CabeceraSerieConstantesFunciones.refrescarForeignKeysDescripcionesCabeceraSerie(this.cabeceraserieLogic.getCabeceraSeries());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CabeceraSerieConstantesFunciones.refrescarForeignKeysDescripcionesCabeceraSerie(this.cabeceraseries);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//cabeceraserieLogic.setCabeceraSeries(this.cabeceraseries);
			cabeceraserieLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CabeceraSerieParameterReturnGeneral getCabeceraSerieParameterGeneral() {
		return this.cabeceraserieParameterGeneral;
	}
	
	public void setCabeceraSerieParameterGeneral(CabeceraSerieParameterReturnGeneral cabeceraserieParameterGeneral) {
		this.cabeceraserieParameterGeneral = cabeceraserieParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCabeceraSerie() {
		return isPermisoTodoCabeceraSerie;
	}

	public void setIsPermisoTodoCabeceraSerie(Boolean isPermisoTodoCabeceraSerie) {
		this.isPermisoTodoCabeceraSerie = isPermisoTodoCabeceraSerie;
	}

	public Boolean getIsPermisoNuevoCabeceraSerie() {
		return isPermisoNuevoCabeceraSerie;
	}

	public void setIsPermisoNuevoCabeceraSerie(Boolean isPermisoNuevoCabeceraSerie) {
		this.isPermisoNuevoCabeceraSerie = isPermisoNuevoCabeceraSerie;
	}

	public Boolean getIsPermisoActualizarCabeceraSerie() {
		return isPermisoActualizarCabeceraSerie;
	}

	public void setIsPermisoActualizarCabeceraSerie(Boolean isPermisoActualizarCabeceraSerie) {
		this.isPermisoActualizarCabeceraSerie = isPermisoActualizarCabeceraSerie;
	}

	public Boolean getIsPermisoEliminarCabeceraSerie() {
		return isPermisoEliminarCabeceraSerie;
	}

	public void setIsPermisoEliminarCabeceraSerie(Boolean isPermisoEliminarCabeceraSerie) {
		this.isPermisoEliminarCabeceraSerie = isPermisoEliminarCabeceraSerie;
	}

	public Boolean getIsPermisoGuardarCambiosCabeceraSerie() {
		return isPermisoGuardarCambiosCabeceraSerie;
	}

	public void setIsPermisoGuardarCambiosCabeceraSerie(Boolean isPermisoGuardarCambiosCabeceraSerie) {
		this.isPermisoGuardarCambiosCabeceraSerie = isPermisoGuardarCambiosCabeceraSerie;
	}
	
	public Boolean getIsPermisoConsultaCabeceraSerie() {
		return isPermisoConsultaCabeceraSerie;
	}

	public void setIsPermisoConsultaCabeceraSerie(Boolean isPermisoConsultaCabeceraSerie) {
		this.isPermisoConsultaCabeceraSerie = isPermisoConsultaCabeceraSerie;
	}

	public Boolean getIsPermisoBusquedaCabeceraSerie() {
		return isPermisoBusquedaCabeceraSerie;
	}

	public void setIsPermisoBusquedaCabeceraSerie(Boolean isPermisoBusquedaCabeceraSerie) {
		this.isPermisoBusquedaCabeceraSerie = isPermisoBusquedaCabeceraSerie;
	}

	public Boolean getIsPermisoReporteCabeceraSerie() {
		return isPermisoReporteCabeceraSerie;
	}

	public void setIsPermisoReporteCabeceraSerie(Boolean isPermisoReporteCabeceraSerie) {
		this.isPermisoReporteCabeceraSerie = isPermisoReporteCabeceraSerie;
	}
	
	public Boolean getIsPermisoPaginacionMedioCabeceraSerie() {
		return isPermisoPaginacionMedioCabeceraSerie;
	}

	public void setIsPermisoPaginacionMedioCabeceraSerie(Boolean isPermisoPaginacionMedioCabeceraSerie) {
		this.isPermisoPaginacionMedioCabeceraSerie = isPermisoPaginacionMedioCabeceraSerie;
	}
	
	public Boolean getIsPermisoPaginacionTodoCabeceraSerie() {
		return isPermisoPaginacionTodoCabeceraSerie;
	}

	public void setIsPermisoPaginacionTodoCabeceraSerie(Boolean isPermisoPaginacionTodoCabeceraSerie) {
		this.isPermisoPaginacionTodoCabeceraSerie = isPermisoPaginacionTodoCabeceraSerie;
	}
	
	public Boolean getIsPermisoPaginacionAltoCabeceraSerie() {
		return isPermisoPaginacionAltoCabeceraSerie;
	}

	public void setIsPermisoPaginacionAltoCabeceraSerie(Boolean isPermisoPaginacionAltoCabeceraSerie) {
		this.isPermisoPaginacionAltoCabeceraSerie = isPermisoPaginacionAltoCabeceraSerie;
	}
	
	public Boolean getIsPermisoCopiarCabeceraSerie() {
		return isPermisoCopiarCabeceraSerie;
	}

	public void setIsPermisoCopiarCabeceraSerie(Boolean isPermisoCopiarCabeceraSerie) {
		this.isPermisoCopiarCabeceraSerie = isPermisoCopiarCabeceraSerie;
	}
	
	public Boolean getIsPermisoVerFormCabeceraSerie() {
		return isPermisoVerFormCabeceraSerie;
	}

	public void setIsPermisoVerFormCabeceraSerie(Boolean isPermisoVerFormCabeceraSerie) {
		this.isPermisoVerFormCabeceraSerie = isPermisoVerFormCabeceraSerie;
	}
	
	public Boolean getIsPermisoDuplicarCabeceraSerie() {
		return isPermisoDuplicarCabeceraSerie;
	}

	public void setIsPermisoDuplicarCabeceraSerie(Boolean isPermisoDuplicarCabeceraSerie) {
		this.isPermisoDuplicarCabeceraSerie = isPermisoDuplicarCabeceraSerie;
	}
	
	public Boolean getIsPermisoOrdenCabeceraSerie() {
		return isPermisoOrdenCabeceraSerie;
	}

	public void setIsPermisoOrdenCabeceraSerie(Boolean isPermisoOrdenCabeceraSerie) {
		this.isPermisoOrdenCabeceraSerie = isPermisoOrdenCabeceraSerie;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCabeceraSerie() {
		return isVisibilidadCeldaNuevoCabeceraSerie;
	}

	public void setIsVisibilidadCeldaNuevoCabeceraSerie(Boolean isVisibilidadCeldaNuevoCabeceraSerie) {
		this.isVisibilidadCeldaNuevoCabeceraSerie = isVisibilidadCeldaNuevoCabeceraSerie;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCabeceraSerie() {
		return isVisibilidadCeldaDuplicarCabeceraSerie;
	}

	public void setIsVisibilidadCeldaDuplicarCabeceraSerie(Boolean isVisibilidadCeldaDuplicarCabeceraSerie) {
		this.isVisibilidadCeldaDuplicarCabeceraSerie = isVisibilidadCeldaDuplicarCabeceraSerie;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCabeceraSerie() {
		return isVisibilidadCeldaCopiarCabeceraSerie;
	}

	public void setIsVisibilidadCeldaCopiarCabeceraSerie(Boolean isVisibilidadCeldaCopiarCabeceraSerie) {
		this.isVisibilidadCeldaCopiarCabeceraSerie = isVisibilidadCeldaCopiarCabeceraSerie;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCabeceraSerie() {
		return isVisibilidadCeldaVerFormCabeceraSerie;
	}

	public void setIsVisibilidadCeldaVerFormCabeceraSerie(Boolean isVisibilidadCeldaVerFormCabeceraSerie) {
		this.isVisibilidadCeldaVerFormCabeceraSerie = isVisibilidadCeldaVerFormCabeceraSerie;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCabeceraSerie() {
		return isVisibilidadCeldaOrdenCabeceraSerie;
	}

	public void setIsVisibilidadCeldaOrdenCabeceraSerie(Boolean isVisibilidadCeldaOrdenCabeceraSerie) {
		this.isVisibilidadCeldaOrdenCabeceraSerie = isVisibilidadCeldaOrdenCabeceraSerie;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCabeceraSerie() {
		return isVisibilidadCeldaNuevoRelacionesCabeceraSerie;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCabeceraSerie(Boolean isVisibilidadCeldaNuevoRelacionesCabeceraSerie) {
		this.isVisibilidadCeldaNuevoRelacionesCabeceraSerie = isVisibilidadCeldaNuevoRelacionesCabeceraSerie;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCabeceraSerie() {
		return isVisibilidadCeldaModificarCabeceraSerie;
	}

	public void setIsVisibilidadCeldaModificarCabeceraSerie(Boolean isVisibilidadCeldaModificarCabeceraSerie) {
		this.isVisibilidadCeldaModificarCabeceraSerie = isVisibilidadCeldaModificarCabeceraSerie;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCabeceraSerie() {
		return isVisibilidadCeldaActualizarCabeceraSerie;
	}

	public void setIsVisibilidadCeldaActualizarCabeceraSerie(Boolean isVisibilidadCeldaActualizarCabeceraSerie) {
		this.isVisibilidadCeldaActualizarCabeceraSerie = isVisibilidadCeldaActualizarCabeceraSerie;
	}

	public Boolean getIsVisibilidadCeldaEliminarCabeceraSerie() {
		return isVisibilidadCeldaEliminarCabeceraSerie;
	}

	public void setIsVisibilidadCeldaEliminarCabeceraSerie(Boolean isVisibilidadCeldaEliminarCabeceraSerie) {
		this.isVisibilidadCeldaEliminarCabeceraSerie = isVisibilidadCeldaEliminarCabeceraSerie;
	}

	public Boolean getIsVisibilidadCeldaCancelarCabeceraSerie() {
		return isVisibilidadCeldaCancelarCabeceraSerie;
	}

	public void setIsVisibilidadCeldaCancelarCabeceraSerie(Boolean isVisibilidadCeldaCancelarCabeceraSerie) {
		this.isVisibilidadCeldaCancelarCabeceraSerie = isVisibilidadCeldaCancelarCabeceraSerie;
	}

	public Boolean getIsVisibilidadCeldaGuardarCabeceraSerie() {
		return isVisibilidadCeldaGuardarCabeceraSerie;
	}

	public void setIsVisibilidadCeldaGuardarCabeceraSerie(Boolean isVisibilidadCeldaGuardarCabeceraSerie) {
		this.isVisibilidadCeldaGuardarCabeceraSerie = isVisibilidadCeldaGuardarCabeceraSerie;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCabeceraSerie() {
		return isVisibilidadCeldaGuardarCambiosCabeceraSerie;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCabeceraSerie(Boolean isVisibilidadCeldaGuardarCambiosCabeceraSerie) {
		this.isVisibilidadCeldaGuardarCambiosCabeceraSerie = isVisibilidadCeldaGuardarCambiosCabeceraSerie;
	}
		
	public CabeceraSerieSessionBean getcabeceraserieSessionBean() {
		return this.cabeceraserieSessionBean;
	}
	
	public void setcabeceraserieSessionBean(CabeceraSerieSessionBean cabeceraserieSessionBean) {
		this.cabeceraserieSessionBean=cabeceraserieSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCabeceraSerie(CabeceraSerie cabeceraserie)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cabeceraserie,null);
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
	
	public void bugActualizarReferenciaActual(CabeceraSerie cabeceraserie,CabeceraSerie cabeceraserieAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCabeceraSerie(cabeceraserie);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cabeceraserieAux.setId(cabeceraserie.getId());
		cabeceraserieAux.setVersionRow(cabeceraserie.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCabeceraSerie();
		
			int intSelectedRow = this.jTableDatosCabeceraSerie.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserie =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.cabeceraserie =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CabeceraSerieJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCabeceraSerie(this.cabeceraserie,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCabeceraSerie(this.cabeceraserie);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cabeceraserieValidator.getInvalidValues(this.cabeceraserie);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cabeceraserieLogic.setDatosCliente(datosCliente);
			cabeceraserieLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cabeceraserieAux=new  CabeceraSerie();
				
				cabeceraserieAux.setIsNew(true);
				cabeceraserieAux.setIsChanged(true);
				
				cabeceraserieAux.setCabeceraSerieOriginal(this.cabeceraserie);
				
				cabeceraserieAux.setId(this.cabeceraserie.getId());	
				cabeceraserieAux.setVersionRow(this.cabeceraserie.getVersionRow());	
				cabeceraserieAux.setid_empresa(this.cabeceraserie.getid_empresa());	
				cabeceraserieAux.setnombre(this.cabeceraserie.getnombre());	
				cabeceraserieAux.setformula(this.cabeceraserie.getformula());	
				cabeceraserieAux.setcon_formula(this.cabeceraserie.getcon_formula());	
				cabeceraserieAux.setcon_totalizar(this.cabeceraserie.getcon_totalizar());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cabeceraserieSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cabeceraserieSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cabeceraserieAux,cabeceraserieLogic.getCabeceraSeries());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cabeceraserieAux,cabeceraseries);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cabeceraserieSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cabeceraserieSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cabeceraserieLogic.saveCabeceraSeries();//WithConnection
						//cabeceraserieLogic.getSetVersionRowCabeceraSeries();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cabeceraserie,cabeceraserieAux);
					
					this.refrescarForeignKeysDescripcionesCabeceraSerie();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cabeceraserieSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cabeceraserieLogic.saveCabeceraSerieRelaciones(cabeceraserieAux);//WithConnection
								//cabeceraserieLogic.getSetVersionRowCabeceraSeries();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cabeceraserie,cabeceraserieAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cabeceraserieSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cabeceraserieSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cabeceraserieAux,cabeceraserieLogic.getCabeceraSeries());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cabeceraserieAux,cabeceraseries);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cabeceraserie,cabeceraserieAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cabeceraserieAux=new  CabeceraSerie();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado() 
					|| (this.cabeceraserieSessionBean.getEsGuardarRelacionado() && this.cabeceraserie.getId()>=0)) {
						
					cabeceraserieAux.setIsNew(false);
				}
				
				cabeceraserieAux.setIsDeleted(false);
			
				cabeceraserieAux.setId(this.cabeceraserie.getId());	
				cabeceraserieAux.setVersionRow(this.cabeceraserie.getVersionRow());	
				cabeceraserieAux.setid_empresa(this.cabeceraserie.getid_empresa());	
				cabeceraserieAux.setnombre(this.cabeceraserie.getnombre());	
				cabeceraserieAux.setformula(this.cabeceraserie.getformula());	
				cabeceraserieAux.setcon_formula(this.cabeceraserie.getcon_formula());	
				cabeceraserieAux.setcon_totalizar(this.cabeceraserie.getcon_totalizar());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cabeceraserieAux,cabeceraserieLogic.getCabeceraSeries());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cabeceraserieAux,cabeceraseries);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cabeceraserieSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cabeceraserieSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cabeceraserieLogic.saveCabeceraSeries();//WithConnection
						//cabeceraserieLogic.getSetVersionRowCabeceraSeries();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cabeceraserie,cabeceraserieAux);
					
					this.refrescarForeignKeysDescripcionesCabeceraSerie();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cabeceraserieSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cabeceraserieLogic.saveCabeceraSerieRelaciones(cabeceraserieAux);//WithConnection
								//cabeceraserieLogic.getSetVersionRowCabeceraSeries();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cabeceraserie,cabeceraserieAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cabeceraserieSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cabeceraserieSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cabeceraserieAux,cabeceraserieLogic.getCabeceraSeries());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cabeceraserieAux,cabeceraseries);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cabeceraserie,cabeceraserieAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cabeceraserieAux=new  CabeceraSerie();
				
				cabeceraserieAux.setIsNew(false);
				cabeceraserieAux.setIsChanged(false);
				
				cabeceraserieAux.setIsDeleted(true);
				
				cabeceraserieAux.setId(this.cabeceraserie.getId());	
				cabeceraserieAux.setVersionRow(this.cabeceraserie.getVersionRow());	
				cabeceraserieAux.setid_empresa(this.cabeceraserie.getid_empresa());	
				cabeceraserieAux.setnombre(this.cabeceraserie.getnombre());	
				cabeceraserieAux.setformula(this.cabeceraserie.getformula());	
				cabeceraserieAux.setcon_formula(this.cabeceraserie.getcon_formula());	
				cabeceraserieAux.setcon_totalizar(this.cabeceraserie.getcon_totalizar());	
				
				if(this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cabeceraserieAux.getId()>=0) {	
						this.cabeceraseriesEliminados.add(cabeceraserieAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cabeceraserieAux,cabeceraserieLogic.getCabeceraSeries());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cabeceraserieAux,cabeceraseries);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cabeceraserieSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cabeceraserieSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cabeceraserieLogic.saveCabeceraSeries();//WithConnection
						//cabeceraserieLogic.getSetVersionRowCabeceraSeries();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cabeceraserieSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cabeceraserieLogic.saveCabeceraSerieRelaciones(cabeceraserieAux);//WithConnection
								//cabeceraserieLogic.getSetVersionRowCabeceraSeries();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.cabeceraserieSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cabeceraserieSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cabeceraserieAux,cabeceraserieLogic.getCabeceraSeries());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cabeceraserieAux,cabeceraseries);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.getCabeceraSeries().addAll(this.cabeceraseriesEliminados);
					
					cabeceraserieLogic.saveCabeceraSeries();//WithConnection
					//cabeceraserieLogic.getSetVersionRowCabeceraSeries();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCabeceraSerie();
				
				this.cabeceraseriesEliminados= new ArrayList<CabeceraSerie>();		
			}
			
			if(this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Cabecera Serie GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Cabecera Serie",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.cabeceraserie=cabeceraserieAux;
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
      		//this.finishProcessCabeceraSerie();
      	}
		
	}	
	
	public void actualizarRelaciones(CabeceraSerie cabeceraserieLocal) throws Exception {
		
		if(this.cabeceraserieSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CabeceraSerie cabeceraserieLocal) throws Exception {	
		if(this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cabeceraserieLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCabeceraSerieActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCabeceraSerie.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cabeceraserie =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cabeceraserie =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cabeceraserieValidator.getInvalidValues(this.cabeceraserie);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CabeceraSerie cabeceraserie,List<CabeceraSerie> cabeceraseries) throws Exception {
		try	{		
			CabeceraSerieConstantesFunciones.actualizarLista(cabeceraserie,cabeceraseries,this.cabeceraserieSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CabeceraSerie cabeceraserie,List<CabeceraSerie> cabeceraseries) throws Exception {
		try	{			
			CabeceraSerieConstantesFunciones.actualizarSelectedLista(cabeceraserie,cabeceraseries);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CabeceraSerie> cabeceraseriesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cabeceraseriesLocal=this.cabeceraserieLogic.getCabeceraSeries();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cabeceraseriesLocal=this.cabeceraseries;
			}
			//ARCHITECTURE
		
			for(CabeceraSerie cabeceraserieLocal:cabeceraseriesLocal) {
				if(this.permiteMantenimiento(cabeceraserieLocal) && cabeceraserieLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CabeceraSerieConstantesFunciones.getCabeceraSerieLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CabeceraSerieConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCabeceraSerie.jLabelid_empresaCabeceraSerie,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CabeceraSerieConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCabeceraSerie.jLabelnombreCabeceraSerie,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CabeceraSerieConstantesFunciones.FORMULA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCabeceraSerie.jLabelformulaCabeceraSerie,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CabeceraSerieConstantesFunciones.CONFORMULA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCabeceraSerie.jLabelcon_formulaCabeceraSerie,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CabeceraSerieConstantesFunciones.CONTOTALIZAR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCabeceraSerie.jLabelcon_totalizarCabeceraSerie,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCabeceraSerie.jLabelid_empresaCabeceraSerie,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCabeceraSerie.jLabelnombreCabeceraSerie,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCabeceraSerie.jLabelformulaCabeceraSerie,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCabeceraSerie.jLabelcon_formulaCabeceraSerie,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCabeceraSerie.jLabelcon_totalizarCabeceraSerie,"");
		
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
		this.iIdNuevoCabeceraSerie--;	
		
		
		this.cabeceraserieAux=new CabeceraSerie();
		
		this.cabeceraserieAux.setId(this.iIdNuevoCabeceraSerie);
		this.cabeceraserieAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cabeceraserieLogic.getCabeceraSeries().add(this.cabeceraserieAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cabeceraseries.add(this.cabeceraserieAux);
		}
		//ARCHITECTURE
		
		this.cabeceraserie=this.cabeceraserieAux;
		
		if(CabeceraSerieJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCabeceraSerie(this.cabeceraserie);
			this.setVariablesObjetoActualToFormularioForeignKeyCabeceraSerie(this.cabeceraserie);
		}
				
		//this.setDefaultControlesCabeceraSerie();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCabeceraSerie();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCabeceraSerie();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCabeceraSerie();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCabeceraSerie(this.cabeceraserieBean,this.cabeceraserie,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCabeceraSerie(this.cabeceraserie);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CabeceraSerieConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cabeceraserieSessionBean.getConGuardarRelaciones()) {
			classes=CabeceraSerieConstantesFunciones.getClassesRelationshipsOfCabeceraSerie(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cabeceraserieReturnGeneral=cabeceraserieLogic.procesarEventosCabeceraSeriesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cabeceraserieLogic.getCabeceraSeries(),this.cabeceraserie,this.cabeceraserieParameterGeneral,this.isEsNuevoCabeceraSerie,classes);//this.cabeceraserieLogic.getCabeceraSerie()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCabeceraSerie(this.cabeceraserieReturnGeneral,this.cabeceraserieBean,false);
		
		if(this.cabeceraserieReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCabeceraSerie(this.cabeceraserieReturnGeneral.getCabeceraSerie());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCabeceraSerie(this.cabeceraserieReturnGeneral.getCabeceraSerie());
		}
		
		if(this.cabeceraserieReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCabeceraSerie(this.cabeceraserieReturnGeneral.getCabeceraSerie(),classes);//this.cabeceraserieBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCabeceraSerie(this.cabeceraserie,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCabeceraSerie();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCabeceraSerie();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CabeceraSerieBeanSwingJInternalFrameAdditional.RecargarFormCabeceraSerie(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCabeceraSerie(false);
						
			if(cabeceraserieSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CabeceraSerieJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCabeceraSerie();
			}
			
			this.actualizarVisualTableDatosCabeceraSerie();
			
			this.jTableDatosCabeceraSerie.setRowSelectionInterval(this.getIndiceNuevoCabeceraSerie(), this.getIndiceNuevoCabeceraSerie());
			
			this.seleccionarFilaTablaCabeceraSerieActual();
						
			this.actualizarEstadoCeldasBotonesCabeceraSerie("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCabeceraSerie(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCabeceraSerie.jTextFieldnombreCabeceraSerie.setEnabled(isHabilitar && this.cabeceraserieConstantesFunciones.activarnombreCabeceraSerie);
		this.jInternalFrameDetalleFormCabeceraSerie.jTextAreaformulaCabeceraSerie.setEnabled(isHabilitar && this.cabeceraserieConstantesFunciones.activarformulaCabeceraSerie);
		this.jInternalFrameDetalleFormCabeceraSerie.jCheckBoxcon_formulaCabeceraSerie.setEnabled(isHabilitar && this.cabeceraserieConstantesFunciones.activarcon_formulaCabeceraSerie);
		this.jInternalFrameDetalleFormCabeceraSerie.jCheckBoxcon_totalizarCabeceraSerie.setEnabled(isHabilitar && this.cabeceraserieConstantesFunciones.activarcon_totalizarCabeceraSerie);	
		//
		this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxid_empresaCabeceraSerie.setEnabled(isHabilitar && this.cabeceraserieConstantesFunciones.activarid_empresaCabeceraSerie);
	};
	
	public void setDefaultControlesCabeceraSerie() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCabeceraSerie(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cabeceraserieSessionBean.setConGuardarRelaciones(true);			
			this.cabeceraserieSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCabeceraSerie.jTabbedPaneRelacionesCabeceraSerie.setVisible(true);
			
					
		} else {
			//this.cabeceraserieSessionBean.setConGuardarRelaciones(false);			
			this.cabeceraserieSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCabeceraSerie.jTabbedPaneRelacionesCabeceraSerie.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCabeceraSerie() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CabeceraSerie cabeceraserieAux:this.cabeceraserieLogic.getCabeceraSeries()) {
				if(cabeceraserieAux.getId().equals(this.iIdNuevoCabeceraSerie)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CabeceraSerie cabeceraserieAux:this.cabeceraseries) {
				if(cabeceraserieAux.getId().equals(this.iIdNuevoCabeceraSerie)) {
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
	
	public int getIndiceActualCabeceraSerie(CabeceraSerie cabeceraserie,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CabeceraSerie cabeceraserieAux:this.cabeceraserieLogic.getCabeceraSeries()) {
				if(cabeceraserieAux.getId().equals(cabeceraserie.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CabeceraSerie cabeceraserieAux:this.cabeceraseries) {
				if(cabeceraserieAux.getId().equals(cabeceraserie.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCabeceraSerie(CabeceraSerie cabeceraserieOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CabeceraSerie cabeceraserieAux:this.cabeceraserieLogic.getCabeceraSeries()) {
				if(cabeceraserieAux.getCabeceraSerieOriginal().getId().equals(cabeceraserieOriginal.getId())) {
					existe=true;
					cabeceraserieOriginal.setId(cabeceraserieAux.getId());
					cabeceraserieOriginal.setVersionRow(cabeceraserieAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CabeceraSerie cabeceraserieAux:this.cabeceraseries) {
				if(cabeceraserieAux.getCabeceraSerieOriginal().getId().equals(cabeceraserieOriginal.getId())) {
					existe=true;
					cabeceraserieOriginal.setId(cabeceraserieAux.getId());
					cabeceraserieOriginal.setVersionRow(cabeceraserieAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCabeceraSerie(Boolean esParaCancelar) throws Exception {
		cabeceraseriesAux=new ArrayList<CabeceraSerie>();
		cabeceraserieAux=new CabeceraSerie();
		
		if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CabeceraSerie cabeceraserieAux:this.cabeceraserieLogic.getCabeceraSeries()) {
					if(cabeceraserieAux.getId()<0) {
						cabeceraseriesAux.add(cabeceraserieAux);
					}		
				}
				this.iIdNuevoCabeceraSerie=0L;
				this.cabeceraserieLogic.getCabeceraSeries().removeAll(cabeceraseriesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CabeceraSerie cabeceraserieAux:this.cabeceraseries) {
					if(cabeceraserieAux.getId()<0) {
						cabeceraseriesAux.add(cabeceraserieAux);
					}		
				}
				this.iIdNuevoCabeceraSerie=0L;
				this.cabeceraseries.removeAll(cabeceraseriesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCabeceraSerie 
					&& this.cabeceraserieLogic.getCabeceraSeries().size()>0
					) {
					cabeceraserieAux=this.cabeceraserieLogic.getCabeceraSeries().get(this.cabeceraserieLogic.getCabeceraSeries().size() - 1);
				
					if(cabeceraserieAux.getId()<0) {
						this.cabeceraserieLogic.getCabeceraSeries().remove(cabeceraserieAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCabeceraSerie && this.cabeceraseries.size()>0) {
					cabeceraserieAux=this.cabeceraseries.get(this.cabeceraseries.size() - 1);
				
					if(cabeceraserieAux.getId()<0) {
						this.cabeceraseries.remove(cabeceraserieAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCabeceraSerie(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cabeceraserie.getId()<0) {
				this.cabeceraserieLogic.getCabeceraSeries().remove(this.cabeceraserie);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cabeceraserie.getId()<0) {
				this.cabeceraseries.remove(this.cabeceraserie);
			}
		}			
	}
	
	public void setEstadosInicialesCabeceraSerie(List<CabeceraSerie> cabeceraseriesAux) throws Exception {
		CabeceraSerieConstantesFunciones.setEstadosInicialesCabeceraSerie(cabeceraseriesAux);
	}
	
	public void setEstadosInicialesCabeceraSerie(CabeceraSerie cabeceraserieAux) throws Exception {
		CabeceraSerieConstantesFunciones.setEstadosInicialesCabeceraSerie(cabeceraserieAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCabeceraSerieActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCabeceraSerie("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCabeceraSerieActual()) {
				if(!this.isEsNuevoCabeceraSerie) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCabeceraSerie("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCabeceraSerie=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCabeceraSerieActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cabecera Serie ?", "MANTENIMIENTO DE Cabecera Serie", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCabeceraSerie("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CabeceraSerie cabeceraserie) throws Exception {
		CabeceraSerieConstantesFunciones.seleccionarAsignar(this.cabeceraserie,cabeceraserie);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCabeceraSerie=this.isPermisoActualizarOriginalCabeceraSerie;
			
			
			this.seleccionarAsignar(cabeceraserie);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CabeceraSerieConstantesFunciones.quitarEspaciosCabeceraSerie(this.cabeceraserie,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCabeceraSerie("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cabeceraserieSessionBean.setsFuncionBusquedaRapida(this.cabeceraserieSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCabeceraSerie) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCabeceraSerie(esParaCancelar);				
				this.cancelarNuevoCabeceraSerie(esParaCancelar);								
			}
			
			this.cabeceraserie=new CabeceraSerie();
			
			this.inicializarCabeceraSerie();
			
			this.actualizarEstadoCeldasBotonesCabeceraSerie("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCabeceraSerie() throws Exception {
		try {
			CabeceraSerieConstantesFunciones.inicializarCabeceraSerie(this.cabeceraserie);
			
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
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cabeceraserieLogic.getCabeceraSeries().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCabeceraSeries(String sAccionBusqueda,List<CabeceraSerie> cabeceraseriesParaReportes) throws Exception {
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
					sPathReporteFinal="CabeceraSerie"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CabeceraSerieMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CabeceraSerieMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CabeceraSerie"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cabecera Seriees");		
		parameters.put("busquedapor", CabeceraSerieConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCabeceraSerie=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CabeceraSerieConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CabeceraSerieConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCabeceraSerie=new JRBeanArrayDataSource(CabeceraSerieJInternalFrame.TraerCabeceraSerieBeans(cabeceraseriesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCabeceraSerie);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CabeceraSerieConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CabeceraSerieConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CabeceraSerieBean.TraerCabeceraSerieBeans(cabeceraseriesParaReportes).toArray()));
							
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
				this.generarExcelReporteCabeceraSeries(sAccionBusqueda,sTipoArchivoReporte,cabeceraseriesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCabeceraSeries(sAccionBusqueda,sTipoArchivoReporte,cabeceraseriesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCabeceraSerieActionPerformed(null);
					//this.generarExcelReporteCabeceraSeries(sAccionBusqueda,sTipoArchivoReporte,cabeceraseriesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCabeceraSeries(sAccionBusqueda,sTipoArchivoReporte,cabeceraseriesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCabeceraSeries(sAccionBusqueda,sTipoArchivoReporte,cabeceraseriesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCabeceraSeries(sAccionBusqueda,sTipoArchivoReporte,cabeceraseriesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCabeceraSeries(String sAccionBusqueda,String sTipoArchivoReporte,List<CabeceraSerie> cabeceraseriesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cabeceraserie";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CabeceraSeries");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCabeceraSerie("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CabeceraSerie cabeceraserie : cabeceraseriesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CabeceraSerieConstantesFunciones.generarExcelReporteDataCabeceraSerie("NORMAL",row,workbook,cabeceraserie,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cabecera Serie",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCabeceraSerie(String sTipo,Row row,Workbook workbook) {
		
		CabeceraSerieConstantesFunciones.generarExcelReporteHeaderCabeceraSerie(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCabeceraSeries(String sAccionBusqueda,String sTipoArchivoReporte,List<CabeceraSerie> cabeceraseriesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cabeceraserie_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CabeceraSeries");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CabeceraSerie cabeceraserie : cabeceraseriesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CabeceraSerieConstantesFunciones.getCabeceraSerieDescripcion(cabeceraserie));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CabeceraSerieConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CabeceraSerieConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cabeceraserie.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CabeceraSerieConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CabeceraSerieConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cabeceraserie.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CabeceraSerieConstantesFunciones.LABEL_FORMULA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CabeceraSerieConstantesFunciones.LABEL_FORMULA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cabeceraserie.getformula());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CabeceraSerieConstantesFunciones.LABEL_CONFORMULA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CabeceraSerieConstantesFunciones.LABEL_CONFORMULA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(cabeceraserie.getcon_formula()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CabeceraSerieConstantesFunciones.LABEL_CONTOTALIZAR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CabeceraSerieConstantesFunciones.LABEL_CONTOTALIZAR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(cabeceraserie.getcon_totalizar()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cabecera Serie",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCabeceraSeries(String sAccionBusqueda,String sTipoArchivoReporte,List<CabeceraSerie> cabeceraseriesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CabeceraSerie> cabeceraseriesRespaldo=null;
		
		classes=CabeceraSerieConstantesFunciones.getClassesRelationshipsOfCabeceraSerie(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cabeceraserieLogic.setDatosCliente(this.datosCliente);
		this.cabeceraserieLogic.setDatosDeep(this.datosDeep);
		this.cabeceraserieLogic.setIsConDeep(true);
		
		cabeceraseriesRespaldo=this.cabeceraserieLogic.getCabeceraSeries();
		
		this.cabeceraserieLogic.setCabeceraSeries(cabeceraseriesParaReportes);	
		this.cabeceraserieLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cabeceraseriesParaReportes=this.cabeceraserieLogic.getCabeceraSeries();
		this.cabeceraserieLogic.setCabeceraSeries(cabeceraseriesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cabeceraserie_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CabeceraSeries");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCabeceraSerie("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CabeceraSerie cabeceraserie : cabeceraseriesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCabeceraSerie("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CabeceraSerieConstantesFunciones.generarExcelReporteDataCabeceraSerie("NORMAL",row,workbook,cabeceraserie,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CabeceraSerieConstantesFunciones.getCabeceraSerieDescripcion(cabeceraserie));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cabecera Serie",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCabeceraSerie.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCabeceraSerie.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCabeceraSerie.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCabeceraSerie.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCabeceraSerie() throws Exception {		
		this.startProcessCabeceraSerie(true);
	}
	
	public void startProcessCabeceraSerie(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCabeceraSerie ,this.jPanelParametrosReportesCabeceraSerie, this.jScrollPanelDatosCabeceraSerie,this.jPanelPaginacionCabeceraSerie, this.jScrollPanelDatosEdicionCabeceraSerie, this.jPanelAccionesCabeceraSerie,this.jPanelAccionesFormularioCabeceraSerie,this.jmenuBarCabeceraSerie,this.jmenuBarDetalleCabeceraSerie,this.jTtoolBarCabeceraSerie,this.jTtoolBarDetalleCabeceraSerie);		
		
		final JTabbedPane jTabbedPaneBusquedasCabeceraSerie=this.jTabbedPaneBusquedasCabeceraSerie; 
		
		final JPanel jPanelParametrosReportesCabeceraSerie=this.jPanelParametrosReportesCabeceraSerie;
		//final JScrollPane jScrollPanelDatosCabeceraSerie=this.jScrollPanelDatosCabeceraSerie;
		final JTable jTableDatosCabeceraSerie=this.jTableDatosCabeceraSerie;		
		final JPanel jPanelPaginacionCabeceraSerie=this.jPanelPaginacionCabeceraSerie;
		//final JScrollPane jScrollPanelDatosEdicionCabeceraSerie=this.jScrollPanelDatosEdicionCabeceraSerie;
		final JPanel jPanelAccionesCabeceraSerie=this.jPanelAccionesCabeceraSerie;
		
		JPanel jPanelCamposAuxiliarCabeceraSerie=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCabeceraSerie=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) {
			jPanelCamposAuxiliarCabeceraSerie=this.jInternalFrameDetalleFormCabeceraSerie.jPanelCamposCabeceraSerie;
			jPanelAccionesFormularioAuxiliarCabeceraSerie=this.jInternalFrameDetalleFormCabeceraSerie.jPanelAccionesFormularioCabeceraSerie;
		}
		
		final JPanel jPanelCamposCabeceraSerie=jPanelCamposAuxiliarCabeceraSerie;
		final JPanel jPanelAccionesFormularioCabeceraSerie=jPanelAccionesFormularioAuxiliarCabeceraSerie;
		
		
		final JMenuBar jmenuBarCabeceraSerie=this.jmenuBarCabeceraSerie;
		final JToolBar jTtoolBarCabeceraSerie=this.jTtoolBarCabeceraSerie;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCabeceraSerie=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCabeceraSerie=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) {
			jmenuBarDetalleAuxiliarCabeceraSerie=this.jInternalFrameDetalleFormCabeceraSerie.jmenuBarDetalleCabeceraSerie;
			jTtoolBarDetalleAuxiliarCabeceraSerie=this.jInternalFrameDetalleFormCabeceraSerie.jTtoolBarDetalleCabeceraSerie;
		}
		
		final JMenuBar jmenuBarDetalleCabeceraSerie=jmenuBarDetalleAuxiliarCabeceraSerie;
		final JToolBar jTtoolBarDetalleCabeceraSerie=jTtoolBarDetalleAuxiliarCabeceraSerie;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCabeceraSerie;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCabeceraSerie;
			processRunnable.jTableDatos=jTableDatosCabeceraSerie;
			processRunnable.jPanelCampos=jPanelCamposCabeceraSerie;
			processRunnable.jPanelPaginacion=jPanelPaginacionCabeceraSerie;
			processRunnable.jPanelAcciones=jPanelAccionesCabeceraSerie;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCabeceraSerie;
			
			
			processRunnable.jmenuBar=jmenuBarCabeceraSerie;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCabeceraSerie;
			processRunnable.jTtoolBar=jTtoolBarCabeceraSerie;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCabeceraSerie;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCabeceraSerie ,jPanelParametrosReportesCabeceraSerie,jTableDatosCabeceraSerie, /*jScrollPanelDatosCabeceraSerie,*/jPanelCamposCabeceraSerie,jPanelPaginacionCabeceraSerie, /*jScrollPanelDatosEdicionCabeceraSerie,*/ jPanelAccionesCabeceraSerie,jPanelAccionesFormularioCabeceraSerie,jmenuBarCabeceraSerie,jmenuBarDetalleCabeceraSerie,jTtoolBarCabeceraSerie,jTtoolBarDetalleCabeceraSerie);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCabeceraSerie ,jPanelParametrosReportesCabeceraSerie, jScrollPanelDatosCabeceraSerie,jPanelPaginacionCabeceraSerie, jScrollPanelDatosEdicionCabeceraSerie, jPanelAccionesCabeceraSerie,jPanelAccionesFormularioCabeceraSerie,jmenuBarCabeceraSerie,jmenuBarDetalleCabeceraSerie,jTtoolBarCabeceraSerie,jTtoolBarDetalleCabeceraSerie);
						
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
	
	public void finishProcessCabeceraSerie() {// throws Exception 
		this.finishProcessCabeceraSerie(true);
	}
	
	public void finishProcessCabeceraSerie(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCabeceraSerie ,this.jPanelParametrosReportesCabeceraSerie, this.jScrollPanelDatosCabeceraSerie,this.jPanelPaginacionCabeceraSerie, this.jScrollPanelDatosEdicionCabeceraSerie, this.jPanelAccionesCabeceraSerie,this.jPanelAccionesFormularioCabeceraSerie,this.jmenuBarCabeceraSerie,this.jmenuBarDetalleCabeceraSerie,this.jTtoolBarCabeceraSerie,this.jTtoolBarDetalleCabeceraSerie);		
		
		final JTabbedPane jTabbedPaneBusquedasCabeceraSerie=this.jTabbedPaneBusquedasCabeceraSerie; 
		
		final JPanel jPanelParametrosReportesCabeceraSerie=this.jPanelParametrosReportesCabeceraSerie;
		//final JScrollPane jScrollPanelDatosCabeceraSerie=this.jScrollPanelDatosCabeceraSerie;
		final JTable jTableDatosCabeceraSerie=this.jTableDatosCabeceraSerie;		
		final JPanel jPanelPaginacionCabeceraSerie=this.jPanelPaginacionCabeceraSerie;
		//final JScrollPane jScrollPanelDatosEdicionCabeceraSerie=this.jScrollPanelDatosEdicionCabeceraSerie;
		final JPanel jPanelAccionesCabeceraSerie=this.jPanelAccionesCabeceraSerie;
		
		JPanel jPanelCamposAuxiliarCabeceraSerie=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCabeceraSerie=new JPanel();
		
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) {
			jPanelCamposAuxiliarCabeceraSerie=this.jInternalFrameDetalleFormCabeceraSerie.jPanelCamposCabeceraSerie;
			jPanelAccionesFormularioAuxiliarCabeceraSerie=this.jInternalFrameDetalleFormCabeceraSerie.jPanelAccionesFormularioCabeceraSerie;
		}
		
		final JPanel jPanelCamposCabeceraSerie=jPanelCamposAuxiliarCabeceraSerie;
		final JPanel jPanelAccionesFormularioCabeceraSerie=jPanelAccionesFormularioAuxiliarCabeceraSerie;
		
		
		final JMenuBar jmenuBarCabeceraSerie=this.jmenuBarCabeceraSerie;		
		final JToolBar jTtoolBarCabeceraSerie=this.jTtoolBarCabeceraSerie;
				
		JMenuBar jmenuBarDetalleAuxiliarCabeceraSerie=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCabeceraSerie=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) {
			jmenuBarDetalleAuxiliarCabeceraSerie=this.jInternalFrameDetalleFormCabeceraSerie.jmenuBarDetalleCabeceraSerie;
			jTtoolBarDetalleAuxiliarCabeceraSerie=this.jInternalFrameDetalleFormCabeceraSerie.jTtoolBarDetalleCabeceraSerie;		
		}
		
		final JMenuBar jmenuBarDetalleCabeceraSerie=jmenuBarDetalleAuxiliarCabeceraSerie;
		final JToolBar jTtoolBarDetalleCabeceraSerie=jTtoolBarDetalleAuxiliarCabeceraSerie;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCabeceraSerie;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCabeceraSerie;
			processRunnable.jTableDatos=jTableDatosCabeceraSerie;
			processRunnable.jPanelCampos=jPanelCamposCabeceraSerie;
			processRunnable.jPanelPaginacion=jPanelPaginacionCabeceraSerie;
			processRunnable.jPanelAcciones=jPanelAccionesCabeceraSerie;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCabeceraSerie;
			
			
			processRunnable.jmenuBar=jmenuBarCabeceraSerie;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCabeceraSerie;
			processRunnable.jTtoolBar=jTtoolBarCabeceraSerie;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCabeceraSerie;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCabeceraSerie ,jPanelParametrosReportesCabeceraSerie, jTableDatosCabeceraSerie,/*jScrollPanelDatosCabeceraSerie,*/jPanelCamposCabeceraSerie,jPanelPaginacionCabeceraSerie, /*jScrollPanelDatosEdicionCabeceraSerie,*/ jPanelAccionesCabeceraSerie,jPanelAccionesFormularioCabeceraSerie,jmenuBarCabeceraSerie,jmenuBarDetalleCabeceraSerie,jTtoolBarCabeceraSerie,jTtoolBarDetalleCabeceraSerie));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCabeceraSerie(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCabeceraSerie(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCabeceraSerie(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCabeceraSerie(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCabeceraSerie,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCabeceraSerie,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCabeceraSerie(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCabeceraSerie,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCabeceraSerie,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cabeceraserieConstantesFunciones.getsFinalQueryCabeceraSerie();
		String  finalQueryPaginacionTodos=this.cabeceraserieConstantesFunciones.getsFinalQueryCabeceraSerie();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CabeceraSerieConstantesFunciones.getArrayColumnasGlobalesNoCabeceraSerie(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CabeceraSerieConstantesFunciones.getArrayColumnasGlobalesCabeceraSerie(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CabeceraSerieConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cabeceraseriesEliminados= new ArrayList<CabeceraSerie>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCabeceraSerie();
		
				///*CabeceraSerieSessionBean*/this.cabeceraserieSessionBean=new CabeceraSerieSessionBean();
			
			if(this.cabeceraserieSessionBean==null) {
				this.cabeceraserieSessionBean=new CabeceraSerieSessionBean();
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
					this.iNumeroPaginacion=CabeceraSerieConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CabeceraSerieConstantesFunciones.getClassesForeignKeysOfCabeceraSerie(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cabeceraserie."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cabeceraseriesAux= new ArrayList<CabeceraSerie>();
			
				
			cabeceraserieLogic.setDatosCliente(this.datosCliente);
			cabeceraserieLogic.setDatosDeep(this.datosDeep);
			cabeceraserieLogic.setIsConDeep(true);
			
			
			cabeceraserieLogic.getCabeceraSerieDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cabeceraserieLogic.getTodosCabeceraSeries(finalQueryGlobal,pagination);
					
					//cabeceraserieLogic.getTodosCabeceraSeriesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cabeceraserieLogic.getCabeceraSeries()==null|| cabeceraserieLogic.getCabeceraSeries().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cabeceraseriesAux= new ArrayList<CabeceraSerie>();
							cabeceraseriesAux.addAll(cabeceraserieLogic.getCabeceraSeries());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cabeceraseriesAux= new ArrayList<CabeceraSerie>();
							cabeceraseriesAux.addAll(cabeceraseries);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cabeceraserieLogic.getTodosCabeceraSeries(finalQueryGlobal+"",this.pagination);												
							
							//cabeceraserieLogic.getTodosCabeceraSeriesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCabeceraSeries("Todos",cabeceraserieLogic.getCabeceraSeries() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cabeceraserieLogic.setCabeceraSeries(new ArrayList<CabeceraSerie>());					
							cabeceraserieLogic.getCabeceraSeries().addAll(cabeceraseriesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cabeceraseries=new ArrayList<CabeceraSerie>();
							cabeceraseries.addAll(cabeceraseriesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCabeceraSerie=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCabeceraSerie=this.idActual;
				
				} else if(this.idCabeceraSerieActual!=null && this.idCabeceraSerieActual!=0L) {
					idCabeceraSerie=idCabeceraSerieActual;
				}
				
					
				this.sDetalleReporte=CabeceraSerieConstantesFunciones.getDetalleIndicePorId(idCabeceraSerie);
				
				this.cabeceraseries=new ArrayList<CabeceraSerie>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cabeceraserieLogic.getEntity(idCabeceraSerie);
					
					//cabeceraserieLogic.getEntityWithConnection(idCabeceraSerie);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cabeceraserieLogic.setCabeceraSeries(new ArrayList<CabeceraSerie>());
					cabeceraserieLogic.getCabeceraSeries().add(cabeceraserieLogic.getCabeceraSerie());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cabeceraseries=new ArrayList<CabeceraSerie>();
					this.cabeceraseries.add(cabeceraserie);
				}
				
				if(cabeceraserieLogic.getCabeceraSerie()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=CabeceraSerieConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cabeceraserieLogic.getCabeceraSeriesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CabeceraSerieConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CabeceraSerieConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cabeceraserieLogic.getCabeceraSeries()==null||cabeceraserieLogic.getCabeceraSeries().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cabeceraseries==null|| cabeceraseries.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cabeceraseriesAux=new ArrayList<CabeceraSerie>();
						cabeceraseriesAux.addAll(cabeceraserieLogic.getCabeceraSeries());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cabeceraseriesAux=new ArrayList<CabeceraSerie>();
							cabeceraseriesAux.addAll(cabeceraseries);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cabeceraserieLogic.getCabeceraSeriesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CabeceraSerieConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CabeceraSerieConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCabeceraSeries("BusquedaPorNombre",cabeceraserieLogic.getCabeceraSeries());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCabeceraSeries("BusquedaPorNombre",cabeceraseries);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cabeceraserieLogic.setCabeceraSeries(new ArrayList<CabeceraSerie>());
						cabeceraserieLogic.getCabeceraSeries().addAll(cabeceraseriesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cabeceraseries=new ArrayList<CabeceraSerie>();
							cabeceraseries.addAll(cabeceraseriesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CabeceraSerieConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cabeceraserieLogic.getCabeceraSeriesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CabeceraSerieConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CabeceraSerieConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cabeceraserieLogic.getCabeceraSeries()==null||cabeceraserieLogic.getCabeceraSeries().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cabeceraseries==null|| cabeceraseries.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cabeceraseriesAux=new ArrayList<CabeceraSerie>();
						cabeceraseriesAux.addAll(cabeceraserieLogic.getCabeceraSeries());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cabeceraseriesAux=new ArrayList<CabeceraSerie>();
							cabeceraseriesAux.addAll(cabeceraseries);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cabeceraserieLogic.getCabeceraSeriesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CabeceraSerieConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CabeceraSerieConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCabeceraSeries("FK_IdEmpresa",cabeceraserieLogic.getCabeceraSeries());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCabeceraSeries("FK_IdEmpresa",cabeceraseries);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cabeceraserieLogic.setCabeceraSeries(new ArrayList<CabeceraSerie>());
						cabeceraserieLogic.getCabeceraSeries().addAll(cabeceraseriesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cabeceraseries=new ArrayList<CabeceraSerie>();
							cabeceraseries.addAll(cabeceraseriesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCabeceraSerie();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCabeceraSerie();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cabeceraserieLogic.getCabeceraSeries().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cabeceraseries.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cabeceraserieLogic.getCabeceraSeries().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cabeceraseries.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CabeceraSerie cabeceraserie) {
		Boolean permite=true;
		
		if(this.cabeceraserie.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CabeceraSerieConstantesFunciones.getOrderByListaCabeceraSerie();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CabeceraSerieConstantesFunciones.getOrderByListaCabeceraSerie();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CabeceraSerie cabeceraserie:cabeceraserieLogic.getCabeceraSeries()) {
				if(cabeceraserie.getsType().equals(Constantes2.S_TOTALES)) {
					cabeceraserieTotales=cabeceraserie;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CabeceraSerie cabeceraserie:this.cabeceraseries) {
				if(cabeceraserie.getsType().equals(Constantes2.S_TOTALES)) {
					cabeceraserieTotales=cabeceraserie;
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
			this.cabeceraserieAux=new CabeceraSerie();
			this.cabeceraserieAux.setsType(Constantes2.S_TOTALES);
			this.cabeceraserieAux.setIsNew(false);
			this.cabeceraserieAux.setIsChanged(false);
			this.cabeceraserieAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CabeceraSerieConstantesFunciones.TotalizarValoresFilaCabeceraSerie(this.cabeceraserieLogic.getCabeceraSeries(),this.cabeceraserieAux);
				
				this.cabeceraserieLogic.getCabeceraSeries().add(this.cabeceraserieAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CabeceraSerieConstantesFunciones.TotalizarValoresFilaCabeceraSerie(this.cabeceraseries,this.cabeceraserieAux);
				
				this.cabeceraseries.add(this.cabeceraserieAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cabeceraserieTotales=new CabeceraSerie();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cabeceraserieLogic.getCabeceraSeries().remove(cabeceraserieTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cabeceraseries.remove(cabeceraserieTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cabeceraserieTotales=new CabeceraSerie();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CabeceraSerie cabeceraserie:cabeceraserieLogic.getCabeceraSeries()) {
				if(cabeceraserie.getsType().equals(Constantes2.S_TOTALES)) {
					cabeceraserieTotales=cabeceraserie;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CabeceraSerieConstantesFunciones.TotalizarValoresFilaCabeceraSerie(this.cabeceraserieLogic.getCabeceraSeries(),cabeceraserieTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CabeceraSerie cabeceraserie:this.cabeceraseries) {
				if(cabeceraserie.getsType().equals(Constantes2.S_TOTALES)) {
					cabeceraserieTotales=cabeceraserie;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CabeceraSerieConstantesFunciones.TotalizarValoresFilaCabeceraSerie(this.cabeceraseries,cabeceraserieTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCabeceraSeriesBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCabeceraSeriesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCabeceraSeriesBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cabeceraserieLogic.getCabeceraSeriesBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCabeceraSeriesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cabeceraserieLogic.getCabeceraSeriesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosCabeceraSerie() {
		this.isPermisoTodoCabeceraSerie=false;
		this.isPermisoNuevoCabeceraSerie=false;
		this.isPermisoActualizarCabeceraSerie=false;
		this.isPermisoActualizarOriginalCabeceraSerie=false;
		this.isPermisoEliminarCabeceraSerie=false;
		this.isPermisoGuardarCambiosCabeceraSerie=false;
		this.isPermisoConsultaCabeceraSerie=false;
		this.isPermisoBusquedaCabeceraSerie=false;
		this.isPermisoReporteCabeceraSerie=false;		
		this.isPermisoOrdenCabeceraSerie=false;		
		this.isPermisoPaginacionMedioCabeceraSerie=false;		
		this.isPermisoPaginacionAltoCabeceraSerie=false;
		this.isPermisoPaginacionTodoCabeceraSerie=false;
		this.isPermisoCopiarCabeceraSerie=false;		
		this.isPermisoVerFormCabeceraSerie=false;		
		this.isPermisoDuplicarCabeceraSerie=false;		
		this.isPermisoOrdenCabeceraSerie=false;		
	}
	
	public void setPermisosUsuarioCabeceraSerie(Boolean isPermiso) {
		this.isPermisoTodoCabeceraSerie=isPermiso;
		this.isPermisoNuevoCabeceraSerie=isPermiso;
		this.isPermisoActualizarCabeceraSerie=isPermiso;
		this.isPermisoActualizarOriginalCabeceraSerie=isPermiso;
		this.isPermisoEliminarCabeceraSerie=isPermiso;
		this.isPermisoGuardarCambiosCabeceraSerie=isPermiso;
		this.isPermisoConsultaCabeceraSerie=isPermiso;
		this.isPermisoBusquedaCabeceraSerie=isPermiso;
		this.isPermisoReporteCabeceraSerie=isPermiso;
		this.isPermisoOrdenCabeceraSerie=isPermiso;		
		this.isPermisoPaginacionMedioCabeceraSerie=isPermiso;		
		this.isPermisoPaginacionAltoCabeceraSerie=isPermiso;		
		this.isPermisoPaginacionTodoCabeceraSerie=isPermiso;		
		this.isPermisoCopiarCabeceraSerie=isPermiso;		
		this.isPermisoVerFormCabeceraSerie=isPermiso;		
		this.isPermisoDuplicarCabeceraSerie=isPermiso;
		this.isPermisoOrdenCabeceraSerie=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCabeceraSerie(Boolean isPermiso) {
		//this.isPermisoTodoCabeceraSerie=isPermiso;
		this.isPermisoNuevoCabeceraSerie=isPermiso;
		this.isPermisoActualizarCabeceraSerie=isPermiso;
		this.isPermisoActualizarOriginalCabeceraSerie=isPermiso;
		this.isPermisoEliminarCabeceraSerie=isPermiso;
		this.isPermisoGuardarCambiosCabeceraSerie=isPermiso;
		//this.isPermisoConsultaCabeceraSerie=isPermiso;
		//this.isPermisoBusquedaCabeceraSerie=isPermiso;
		//this.isPermisoReporteCabeceraSerie=isPermiso;
		//this.isPermisoOrdenCabeceraSerie=isPermiso;		
		//this.isPermisoPaginacionMedioCabeceraSerie=isPermiso;		
		//this.isPermisoPaginacionAltoCabeceraSerie=isPermiso;		
		//this.isPermisoPaginacionTodoCabeceraSerie=isPermiso;		
		//this.isPermisoCopiarCabeceraSerie=isPermiso;		
		//this.isPermisoDuplicarCabeceraSerie=isPermiso;
		//this.isPermisoOrdenCabeceraSerie=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCabeceraSerieClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CabeceraSerieJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCabeceraSerie(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCabeceraSerieClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCabeceraSerieClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCabeceraSerieClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCabeceraSerieClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCabeceraSerie() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CabeceraSerieJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CabeceraSerieConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCabeceraSerie=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCabeceraSerie=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCabeceraSerie=this.isPermisoActualizarCabeceraSerie;
			this.isPermisoEliminarCabeceraSerie=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCabeceraSerie=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCabeceraSerie=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCabeceraSerie=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCabeceraSerie=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCabeceraSerie=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCabeceraSerie=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCabeceraSerie=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCabeceraSerie=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCabeceraSerie=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCabeceraSerie=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCabeceraSerie=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCabeceraSerie=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCabeceraSerie=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCabeceraSerie.setToolTipText(this.jTableDatosCabeceraSerie.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCabeceraSerie(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCabeceraSerie(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CabeceraSerieJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CabeceraSerieJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCabeceraSerie() throws Exception {
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
	public void inicializarCombosForeignKeyCabeceraSerieListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCabeceraSerieListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CabeceraSerieJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCabeceraSerieListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCabeceraSerieListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CabeceraSerieParameterReturnGeneral cabeceraserieReturnGeneral=new CabeceraSerieParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.cabeceraserieConstantesFunciones.cargarid_empresaCabeceraSerie)
					 || (this.esRecargarFks && this.cabeceraserieConstantesFunciones.cargarid_empresaCabeceraSerie)) {

					if(!this.cabeceraserieSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+cabeceraserieSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cabeceraserieReturnGeneral=cabeceraserieLogic.cargarCombosLoteForeignKeyCabeceraSerie(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=cabeceraserieReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCabeceraSerie()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cabeceraserieSessionBean==null) {
				this.cabeceraserieSessionBean=new CabeceraSerieSessionBean();
			}

			if(!this.cabeceraserieSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCabeceraSerie()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCabeceraSerie(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCabeceraSerie()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCabeceraSerie();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCabeceraSerie(CabeceraSerie cabeceraserie)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCabeceraSerie(CabeceraSerie cabeceraserie,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCabeceraSerie()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCabeceraSerie()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCabeceraSerie()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCabeceraSerie()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCabeceraSerie()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCabeceraSerie()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCabeceraSerie(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCabeceraSerie()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxid_empresaCabeceraSerie!=null && this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxid_empresaCabeceraSerie.getItemCount()>0) {
				this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxid_empresaCabeceraSerie.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public CabeceraSerieBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CabeceraSerieBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CabeceraSerieBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cabeceraserieSessionBean=new CabeceraSerieSessionBean(); 
		this.cabeceraserieConstantesFunciones=new CabeceraSerieConstantesFunciones(); 
		this.cabeceraserieBean=new CabeceraSerie();//(this.cabeceraserieConstantesFunciones); 		
		this.cabeceraserieReturnGeneral=new CabeceraSerieParameterReturnGeneral(); 
		
		this.cabeceraserieSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cabeceraserieSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CabeceraSerieBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CabeceraSerieBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CabeceraSerieBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCabeceraSerie(true);
			
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
			
			this.cabeceraserieConstantesFunciones=new CabeceraSerieConstantesFunciones(); 
			this.cabeceraserieBean=new CabeceraSerie();//this.cabeceraserieConstantesFunciones); 			
			this.cabeceraserieReturnGeneral=new CabeceraSerieParameterReturnGeneral(); 
		
			CabeceraSerieBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cabecera Serie Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.cabeceraserie=new CabeceraSerie();
			this.cabeceraseries = new ArrayList<CabeceraSerie>();
			this.cabeceraseriesAux = new ArrayList<CabeceraSerie>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic=new CabeceraSerieLogic();
				this.cabeceraserieLogic.getNewConnexionToDeep("");
			}
			
			//this.cabeceraserieSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cabeceraserieSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCabeceraSerie);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCabeceraSerie!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCabeceraSerie);	
					}
					
					if(this.jInternalFrameImportacionCabeceraSerie!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCabeceraSerie);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCabeceraSerie!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCabeceraSerie);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCabeceraSerie!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCabeceraSerie);
				this.jInternalFrameDetalleFormCabeceraSerie.setVisible(false);
				this.jInternalFrameDetalleFormCabeceraSerie.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCabeceraSerie!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCabeceraSerie);
					this.jInternalFrameReporteDinamicoCabeceraSerie.setVisible(false);
					this.jInternalFrameReporteDinamicoCabeceraSerie.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCabeceraSerie!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCabeceraSerie);
					this.jInternalFrameImportacionCabeceraSerie.setVisible(false);
					this.jInternalFrameImportacionCabeceraSerie.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCabeceraSerie!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCabeceraSerie);
					this.jInternalFrameOrderByCabeceraSerie.setVisible(false);
					this.jInternalFrameOrderByCabeceraSerie.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCabeceraSerieActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CabeceraSerieConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cabeceraserieReturnGeneral=new CabeceraSerieParameterReturnGeneral();
			
			this.cabeceraserieParameterGeneral=new CabeceraSerieParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cabeceraserieLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CabeceraSerieJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CabeceraSerieConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cabeceraserieSessionBean.getEsGuardarRelacionado(),this.cabeceraserieSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CabeceraSerieConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cabeceraserieSessionBean.getEsGuardarRelacionado(),this.cabeceraserieSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCabeceraSerie=false;
			this.isVisibilidadCeldaDuplicarCabeceraSerie=true;
			this.isVisibilidadCeldaCopiarCabeceraSerie=true;
			this.isVisibilidadCeldaVerFormCabeceraSerie=true;
			this.isVisibilidadCeldaOrdenCabeceraSerie=true;
			this.isVisibilidadCeldaNuevoRelacionesCabeceraSerie=false;
			this.isVisibilidadCeldaModificarCabeceraSerie=false;
			this.isVisibilidadCeldaActualizarCabeceraSerie=false;
			this.isVisibilidadCeldaEliminarCabeceraSerie=false;
			this.isVisibilidadCeldaCancelarCabeceraSerie=false;
			this.isVisibilidadCeldaGuardarCabeceraSerie=false;
			this.isVisibilidadCeldaGuardarCambiosCabeceraSerie=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCabeceraSerie("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCabeceraSerie();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCabeceraSerie(false);
			
			this.setPermisosUsuarioCabeceraSerie();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado() 
				|| (this.cabeceraserieSessionBean.getEsGuardarRelacionado() && this.cabeceraserieSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCabeceraSerieClasesRelacionadas();
			}
			
			if(this.cabeceraserieSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCabeceraSerieClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CabeceraSerieJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCabeceraSerie();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCabeceraSerie();
			}
			
			if(!this.isPermisoBusquedaCabeceraSerie) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCabeceraSerie.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCabeceraSerie,this.isPermisoPaginacionMedioCabeceraSerie,this.isPermisoPaginacionTodoCabeceraSerie);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CabeceraSerieConstantesFunciones.getTiposSeleccionarCabeceraSerie());
				
				this.tiposColumnasSelect=CabeceraSerieConstantesFunciones.getTiposSeleccionarCabeceraSerie(true);
				
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
			//if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCabeceraSerie();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioCabeceraSerie(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioCabeceraSerie(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCabeceraSerie() ;
			
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
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cabeceraserieImplementable= (CabeceraSerieImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CabeceraSerieConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cabeceraserieImplementableHome= (CabeceraSerieImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CabeceraSerieConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cabeceraseries= new ArrayList<CabeceraSerie>();
			this.cabeceraseriesEliminados= new ArrayList<CabeceraSerie>();
						
			this.isEsNuevoCabeceraSerie=false;
			this.esParaAccionDesdeFormularioCabeceraSerie=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCabeceraSerie(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCabeceraSerie();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CabeceraSerieBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CabeceraSerieConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCabeceraSerie("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCabeceraSerie(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCabeceraSerie!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCabeceraSerie();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCabeceraSerie();
			}
			
			CabeceraSerieBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCabeceraSerie.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCabeceraSerie.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCabeceraSerie.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCabeceraSerie(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CabeceraSerie: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCabeceraSerie() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCabeceraSerie")) {
				iIndex=this.jInternalFrameDetalleFormCabeceraSerie.jTabbedPaneRelacionesCabeceraSerie.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCabeceraSerie.jTabbedPaneRelacionesCabeceraSerie.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCabeceraSerie.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCabeceraSerie();	
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
	
	public void cargarCombosForeignKeyCabeceraSerie(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCabeceraSerie(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCabeceraSerie(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCabeceraSerieListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCabeceraSerie();
		
		this.cargarCombosFrameForeignKeyCabeceraSerie();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCabeceraSerie();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCabeceraSerie();
		}
	}
	
	
	
	public void jButtonNuevoCabeceraSerieActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cabeceraserieSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCabeceraSerie==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
			
			
			if(jTableDatosCabeceraSerie.getRowCount()>=1) {
				jTableDatosCabeceraSerie.removeRowSelectionInterval(0, jTableDatosCabeceraSerie.getRowCount()-1);						
			}
			
			this.isEsNuevoCabeceraSerie=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCabeceraSerie(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCabeceraSerie(true);			
			//this.cabeceraserie=new CabeceraSerie();
			//this.cabeceraserie.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCabeceraSerie(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCabeceraSerie() ;
			
			if(CabeceraSerieJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCabeceraSerie(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cabeceraserie);	
			this.actualizarInformacion("INFO_PADRE",false,this.cabeceraserie);				
			
			CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
			
			if(this.cabeceraserieSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CabeceraSerie: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCabeceraSerieActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CabeceraSerie> cabeceraseriesSeleccionados=new ArrayList<CabeceraSerie>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCabeceraSerie.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCabeceraSerie.getSelectedRows().length;			
			}
			
			cabeceraseriesSeleccionados=this.getCabeceraSeriesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCabeceraSerie--;			
				//CabeceraSerie cabeceraserieAux= new CabeceraSerie();			
				//cabeceraserieAux.setId(this.iIdNuevoCabeceraSerie);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CabeceraSerie cabeceraserieOrigen=new CabeceraSerie();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CabeceraSerie cabeceraserieOrigen : cabeceraseriesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCabeceraSerie.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cabeceraserieOrigen =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cabeceraserieOrigen =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCabeceraSerie();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cabeceraserie.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCabeceraSerie(cabeceraserieOrigen,this.cabeceraserie,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCabeceraSerie(this.cabeceraserie);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cabeceraserieLogic.getCabeceraSeries().add(this.cabeceraserieAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cabeceraseries.add(this.cabeceraserieAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCabeceraSerie(false);
				
				this.jTableDatosCabeceraSerie.setRowSelectionInterval(this.getIndiceNuevoCabeceraSerie(), this.getIndiceNuevoCabeceraSerie());
				
				int iLastRow =  this.jTableDatosCabeceraSerie.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCabeceraSerie.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCabeceraSerie.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCabeceraSerie(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCabeceraSerieActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CabeceraSerie> cabeceraseriesSeleccionados=new ArrayList<CabeceraSerie>();									
		
			CabeceraSerie cabeceraserieOrigen=new CabeceraSerie();
			CabeceraSerie cabeceraserieDestino=new CabeceraSerie();
				
			cabeceraseriesSeleccionados=this.getCabeceraSeriesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCabeceraSerie.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cabeceraseriesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCabeceraSerie.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cabeceraserieOrigen =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cabeceraserieOrigen =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cabeceraserieDestino =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cabeceraserieDestino =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cabeceraserieOrigen =cabeceraseriesSeleccionados.get(0);
				cabeceraserieDestino =cabeceraseriesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCabeceraSerie(cabeceraserieOrigen,cabeceraserieDestino,true,false);
				
				cabeceraserieDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cabeceraserieDestino,cabeceraserieLogic.getCabeceraSeries());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cabeceraserieDestino,cabeceraseries);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCabeceraSerie(false);
				
				//this.jTableDatosCabeceraSerie.setRowSelectionInterval(this.getIndiceNuevoCabeceraSerie(), this.getIndiceNuevoCabeceraSerie());
				
				int iLastRow =  this.jTableDatosCabeceraSerie.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCabeceraSerie.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCabeceraSerie.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCabeceraSerie(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCabeceraSerieActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCabeceraSerie==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCabeceraSerie.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCabeceraSerieActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCabeceraSerie.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCabeceraSerie.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCabeceraSerie.setVisible(!isVisible);
			this.jPanelPaginacionCabeceraSerie.setVisible(!isVisible);
			this.jPanelAccionesCabeceraSerie.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCabeceraSerieActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCabeceraSerie();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCabeceraSerieActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCabeceraSerie();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCabeceraSerieActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCabeceraSerie();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCabeceraSerieActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCabeceraSerie();
			
			this.abrirFrameOrderByCabeceraSerie();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCabeceraSerieActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCabeceraSerie();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCabeceraSerie(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCabeceraSerie);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCabeceraSerie.isMaximum()) {
					this.jInternalFrameDetalleFormCabeceraSerie.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCabeceraSerie.setSize(this.jInternalFrameDetalleFormCabeceraSerie.iWidthFormulario,this.jInternalFrameDetalleFormCabeceraSerie.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCabeceraSerie.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCabeceraSerie.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCabeceraSerie.isMaximum()) {
						this.jInternalFrameDetalleFormCabeceraSerie.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCabeceraSerie.jContentPaneDetalleCabeceraSerie.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCabeceraSerie.jTabbedPaneRelacionesCabeceraSerie.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCabeceraSerie.jContentPaneDetalleCabeceraSerie.getWidth(),CabeceraSerieConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCabeceraSerie.jTabbedPaneRelacionesCabeceraSerie.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCabeceraSerie.jContentPaneDetalleCabeceraSerie.getWidth(),CabeceraSerieConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCabeceraSerie.jTabbedPaneRelacionesCabeceraSerie.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCabeceraSerie.jContentPaneDetalleCabeceraSerie.getWidth(),CabeceraSerieConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCabeceraSerie.setVisible(true);
	        this.jInternalFrameDetalleFormCabeceraSerie.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCabeceraSerie() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCabeceraSerie==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCabeceraSerie=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCabeceraSerie,false,this);
				} else {
					this.jInternalFrameOrderByCabeceraSerie=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCabeceraSerie,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCabeceraSerie);
				this.jInternalFrameOrderByCabeceraSerie.setVisible(false);
				this.jInternalFrameOrderByCabeceraSerie.setSelected(false);
				
				this.jInternalFrameOrderByCabeceraSerie.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCabeceraSerie"));
				
				this.inicializarActualizarBindingTablaOrderByCabeceraSerie();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCabeceraSerie() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCabeceraSerie==null) {
				
				this.jInternalFrameImportacionCabeceraSerie=new ImportacionJInternalFrame(CabeceraSerieConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCabeceraSerie);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCabeceraSerie);
				this.jInternalFrameImportacionCabeceraSerie.setVisible(false);
				this.jInternalFrameImportacionCabeceraSerie.setSelected(false);


				this.jInternalFrameImportacionCabeceraSerie.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCabeceraSerie"));
				this.jInternalFrameImportacionCabeceraSerie.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCabeceraSerie"));
				this.jInternalFrameImportacionCabeceraSerie.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCabeceraSerie"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCabeceraSerie() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCabeceraSerie==null) {
				this.jInternalFrameReporteDinamicoCabeceraSerie=new ReporteDinamicoJInternalFrame(CabeceraSerieConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCabeceraSerie);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCabeceraSerie);
				this.jInternalFrameReporteDinamicoCabeceraSerie.setVisible(false);
				this.jInternalFrameReporteDinamicoCabeceraSerie.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCabeceraSerie.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCabeceraSerie"));
				this.jInternalFrameReporteDinamicoCabeceraSerie.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCabeceraSerie"));
				this.jInternalFrameReporteDinamicoCabeceraSerie.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCabeceraSerie"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCabeceraSerie();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCabeceraSerie() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCabeceraSerie);
			
	       	this.jInternalFrameDetalleFormCabeceraSerie.setVisible(false);
	        this.jInternalFrameDetalleFormCabeceraSerie.setSelected(false);
			
			//this.jInternalFrameDetalleFormCabeceraSerie.dispose();
			//this.jInternalFrameDetalleFormCabeceraSerie=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCabeceraSerie() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCabeceraSerie.setVisible(true);
	        this.jInternalFrameReporteDinamicoCabeceraSerie.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCabeceraSerie() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCabeceraSerie.setVisible(true);
	        this.jInternalFrameImportacionCabeceraSerie.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCabeceraSerie() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCabeceraSerie.setVisible(true);
	        this.jInternalFrameOrderByCabeceraSerie.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCabeceraSerie() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCabeceraSerie.setVisible(false);
	        this.jInternalFrameOrderByCabeceraSerie.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCabeceraSerie() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCabeceraSerie.setVisible(false);
	        this.jInternalFrameReporteDinamicoCabeceraSerie.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCabeceraSerie() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCabeceraSerie.setVisible(false);
	        this.jInternalFrameImportacionCabeceraSerie.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCabeceraSerieActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCabeceraSerie(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCabeceraSerie(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCabeceraSerie.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCabeceraSerie(true);
			//this.isEsNuevoCabeceraSerie=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserie =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cabeceraserie =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCabeceraSerie("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCabeceraSerie(false) ;
			
			if(cabeceraserieSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CabeceraSerieJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCabeceraSerie(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCabeceraSerie(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCabeceraSerieActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCabeceraSerie.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserie =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cabeceraserie =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCabeceraSerie(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCabeceraSerie==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCabeceraSerie.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCabeceraSerie(true);
			//this.isEsNuevoCabeceraSerie=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserie =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cabeceraserie =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cabeceraserie.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCabeceraSerie("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCabeceraSerie(false) ;
			
			if(CabeceraSerieJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCabeceraSerie(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCabeceraSerie(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarCabeceraSerieActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCabeceraSerie(false);
			
			//if(!this.isEsNuevoCabeceraSerie) {								
				int intSelectedRow = this.jTableDatosCabeceraSerie.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserie =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cabeceraserie =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CabeceraSerieJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCabeceraSerie(this.cabeceraserie,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCabeceraSerie(this.cabeceraserie);
				
			}
			
			if(this.permiteMantenimiento(this.cabeceraserie)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCabeceraSerie=true;
					this.inicializarActualizarBindingTablaCabeceraSerie(false);
					this.isEsNuevoCabeceraSerie=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCabeceraSerie=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCabeceraSerie=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCabeceraSerie(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCabeceraSerie(false);
				
				this.habilitarDeshabilitarControlesCabeceraSerie(false);
			
												
				
				if(CabeceraSerieJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCabeceraSerie();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCabeceraSerieActionPerformed(evt,cabeceraserieSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCabeceraSerie(this.cabeceraserie,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCabeceraSerie.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cabeceraserieSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cabeceraserie.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CabeceraSerie.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CabeceraSerie.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCabeceraSerieActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCabeceraSerie.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserie =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
				this.cabeceraserie.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cabeceraserie =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
				this.cabeceraserie.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cabeceraserie)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CabeceraSerieModel) this.jTableDatosCabeceraSerie.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCabeceraSerie=true;
				this.inicializarActualizarBindingTablaCabeceraSerie(false);
				this.isEsNuevoCabeceraSerie=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCabeceraSerie(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCabeceraSerie(false);
				
				this.habilitarDeshabilitarControlesCabeceraSerie(false);
				
				
				
				if(CabeceraSerieJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCabeceraSerie();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCabeceraSerieActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCabeceraSerie.getRowCount()>=1) {
				jTableDatosCabeceraSerie.removeRowSelectionInterval(0, jTableDatosCabeceraSerie.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCabeceraSerie(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCabeceraSerie(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCabeceraSerie(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCabeceraSerie(false) ;
			
			this.isEsNuevoCabeceraSerie=false;
			
			if(CabeceraSerieJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCabeceraSerie();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCabeceraSerieActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCabeceraSerie(false);
				
				//SI ES MANUAL
				if(CabeceraSerieJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCabeceraSerie();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCabeceraSerieActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCabeceraSerie--;			
			//CabeceraSerie cabeceraserieAux= new CabeceraSerie();			
			//cabeceraserieAux.setId(this.iIdNuevoCabeceraSerie);
			
			if(this.jInternalFrameDetalleFormCabeceraSerie==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCabeceraSerie();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCabeceraSerie(this.cabeceraserie);
			
			this.cabeceraserie.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cabeceraserieLogic.getCabeceraSeries().add(this.cabeceraserieAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cabeceraseries.add(this.cabeceraserieAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCabeceraSerie(false);
			
			this.jTableDatosCabeceraSerie.setRowSelectionInterval(this.getIndiceNuevoCabeceraSerie(), this.getIndiceNuevoCabeceraSerie());
			
			int iLastRow =  this.jTableDatosCabeceraSerie.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCabeceraSerie.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCabeceraSerie.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCabeceraSerie(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCabeceraSerieActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCabeceraSerie(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCabeceraSerie(false);
			
			//SI ES MANUAL
			if(CabeceraSerieJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCabeceraSerie();
			}
			
			//this.abrirFrameTreeCabeceraSerie();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCabeceraSerieActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Cabecera SerieES ?", "MANTENIMIENTO DE Cabecera Serie", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCabeceraSerie.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCabeceraSerie();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cabeceraserieReturnGeneral=cabeceraserieLogic.procesarImportacionCabeceraSeriesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cabeceraserieParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCabeceraSerieReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCabeceraSerieActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCabeceraSerie.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCabeceraSerie.setFileImportacion(this.jInternalFrameImportacionCabeceraSerie.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCabeceraSerie.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCabeceraSerie.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCabeceraSerie.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCabeceraSerie.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCabeceraSerieActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CabeceraSerie> cabeceraseriesSeleccionados=new ArrayList<CabeceraSerie>();		

		cabeceraseriesSeleccionados=this.getCabeceraSeriesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCabeceraSerie.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCabeceraSerie.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CabeceraSerieBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CabeceraSerieBaseDesign.jrxml";
			
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
			
			this.generarReporteCabeceraSeries("Todos",cabeceraseriesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cabecera Serie",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCabeceraSerie.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCabeceraSerie.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CabeceraSerieConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CabeceraSerieConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CabeceraSerieConstantesFunciones.LABEL_FORMULA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rmula_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rmula_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rmula_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rmula_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CabeceraSerieConstantesFunciones.LABEL_CONFORMULA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nFormula_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nFormula_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nFormula_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nFormula_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CabeceraSerieConstantesFunciones.LABEL_CONTOTALIZAR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nTotalizar_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nTotalizar_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nTotalizar_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nTotalizar_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCabeceraSerie.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCabeceraSerie.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCabeceraSerie.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CabeceraSerieConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CabeceraSerieConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case CabeceraSerieConstantesFunciones.LABEL_FORMULA:
					sNombreCampoCategoria="formula";
					break;

				case CabeceraSerieConstantesFunciones.LABEL_CONFORMULA:
					sNombreCampoCategoria="con_formula";
					break;

				case CabeceraSerieConstantesFunciones.LABEL_CONTOTALIZAR:
					sNombreCampoCategoria="con_totalizar";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCabeceraSerie.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CabeceraSerieConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CabeceraSerieConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case CabeceraSerieConstantesFunciones.LABEL_FORMULA:
					sNombreCampoCategoriaValor="formula";
					break;

				case CabeceraSerieConstantesFunciones.LABEL_CONFORMULA:
					sNombreCampoCategoriaValor="con_formula";
					break;

				case CabeceraSerieConstantesFunciones.LABEL_CONTOTALIZAR:
					sNombreCampoCategoriaValor="con_totalizar";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCabeceraSerie.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCabeceraSerie.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CabeceraSerieConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CabeceraSerieConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case CabeceraSerieConstantesFunciones.LABEL_FORMULA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formula",sNombreCampoCategoria,sNombreCampoCategoriaValor,"formula");
					break;

				case CabeceraSerieConstantesFunciones.LABEL_CONFORMULA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Formula",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_formula");
					break;

				case CabeceraSerieConstantesFunciones.LABEL_CONTOTALIZAR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Totalizar",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_totalizar");
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
	
	public void jButtonGenerarExcelReporteDinamicoCabeceraSerieActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CabeceraSerie> cabeceraseriesSeleccionados=new ArrayList<CabeceraSerie>();		
		
		cabeceraseriesSeleccionados=this.getCabeceraSeriesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cabeceraserie";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CabeceraSeries");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCabeceraSerie.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCabeceraSerie.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CabeceraSerieConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CabeceraSerieConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CabeceraSerie cabeceraserie:cabeceraseriesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cabeceraserie.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CabeceraSerieConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CabeceraSerieConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(CabeceraSerie cabeceraserie:cabeceraseriesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cabeceraserie.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CabeceraSerieConstantesFunciones.LABEL_FORMULA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CabeceraSerieConstantesFunciones.LABEL_FORMULA);
					iRow++;

					for(CabeceraSerie cabeceraserie:cabeceraseriesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cabeceraserie.getformula());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CabeceraSerieConstantesFunciones.LABEL_CONFORMULA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CabeceraSerieConstantesFunciones.LABEL_CONFORMULA);
					iRow++;

					for(CabeceraSerie cabeceraserie:cabeceraseriesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cabeceraserie.getcon_formula());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CabeceraSerieConstantesFunciones.LABEL_CONTOTALIZAR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CabeceraSerieConstantesFunciones.LABEL_CONTOTALIZAR);
					iRow++;

					for(CabeceraSerie cabeceraserie:cabeceraseriesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cabeceraserie.getcon_totalizar());
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
			//	this.getFilaCabeceraExportarExcelCabeceraSerie(row);				
			//	iRow++;
			//}				
			
			//for(CabeceraSerie cabeceraserieAux:cabeceraseriesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCabeceraSerie(cabeceraserieAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cabecera Serie",JOptionPane.INFORMATION_MESSAGE);
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
				this.cabeceraserieLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCabeceraSerie(false);
			
			//SI ES MANUAL
			if(CabeceraSerieJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCabeceraSerie();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCabeceraSerieActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCabeceraSerie(false);
			
			//SI ES MANUAL
			if(CabeceraSerieJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCabeceraSerie();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCabeceraSerieActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCabeceraSerie(false);
			
			//SI ES MANUAL
			if(CabeceraSerieJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCabeceraSerie();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCabeceraSerie() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCabeceraSerie.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCabeceraSerie.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCabeceraSerie.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCabeceraSerie.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCabeceraSerie.setMinimumSize(dimensionMinimum);
		this.jTableDatosCabeceraSerie.setMaximumSize(dimensionMaximum);
		this.jTableDatosCabeceraSerie.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCabeceraSerie(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCabeceraSerie(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCabeceraSerie(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCabeceraSerie(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCabeceraSerie(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCabeceraSerie(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCabeceraSerie(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCabeceraSerie(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CabeceraSerieJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CabeceraSerieJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCabeceraSerie() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCabeceraSerie();
		
		this.inicializarActualizarBindingBotonesManualCabeceraSerie(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCabeceraSerie();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCabeceraSerie() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCabeceraSerie(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCabeceraSerie(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCabeceraSerie.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCabeceraSerie.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCabeceraSerie.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCabeceraSerie!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCabeceraSerie.jCheckBoxPostAccionNuevoCabeceraSerie.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCabeceraSerie.jCheckBoxPostAccionSinCerrarCabeceraSerie.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCabeceraSerie.jCheckBoxPostAccionSinMensajeCabeceraSerie.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCabeceraSerie.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCabeceraSerie.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCabeceraSerie.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCabeceraSerie!=null) {
				this.jInternalFrameDetalleFormCabeceraSerie.jCheckBoxPostAccionNuevoCabeceraSerie.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCabeceraSerie.jCheckBoxPostAccionSinCerrarCabeceraSerie.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCabeceraSerie.jCheckBoxPostAccionSinMensajeCabeceraSerie.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCabeceraSerie.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCabeceraSerie.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCabeceraSerie!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxTiposAccionesFormularioCabeceraSerie.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCabeceraSerie.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCabeceraSerie!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCabeceraSerie.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCabeceraSerie.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCabeceraSerie.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCabeceraSerie.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCabeceraSerie.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCabeceraSerie!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCabeceraSerie.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCabeceraSerie.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCabeceraSerie.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCabeceraSerie(Boolean esInicializar) throws Exception {
		try	{	
			if(CabeceraSerieJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCabeceraSerie(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCabeceraSerie() throws Exception {
		try	{
			if(CabeceraSerieJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCabeceraSerie();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCabeceraSerie() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxTiposAccionesFormularioCabeceraSerie.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxTiposAccionesFormularioCabeceraSerie.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCabeceraSerie() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCabeceraSerie.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCabeceraSerie.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCabeceraSerie.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCabeceraSerie.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCabeceraSerie.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCabeceraSerie.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCabeceraSerie.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCabeceraSerie.addItem(reporte);
			}
			
			
			if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCabeceraSerie.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCabeceraSerie.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCabeceraSerie.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCabeceraSerie.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCabeceraSerie.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCabeceraSerie.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCabeceraSerie!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxTiposAccionesFormularioCabeceraSerie.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxTiposAccionesFormularioCabeceraSerie.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCabeceraSerie.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCabeceraSerie.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCabeceraSerie.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCabeceraSerie();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCabeceraSerie() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCabeceraSerie!=null) {
				this.jInternalFrameReporteDinamicoCabeceraSerie.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCabeceraSerie.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCabeceraSerie!=null) {
				this.jInternalFrameReporteDinamicoCabeceraSerie.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCabeceraSerie.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCabeceraSerie!=null) {
				
				if(this.jInternalFrameReporteDinamicoCabeceraSerie.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCabeceraSerie.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCabeceraSerie.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCabeceraSerie.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCabeceraSerie.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCabeceraSerie.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCabeceraSerie()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextFieldnombreBusquedaPorNombreCabeceraSerie.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCabeceraSerie(Boolean esInicializar) throws Exception {				
		if(CabeceraSerieJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCabeceraSerie();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCabeceraSerie() throws Exception {
		this.inicializarActualizarBindingTablaCabeceraSerie(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCabeceraSerie() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCabeceraSerie.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCabeceraSerie.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCabeceraSerie.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CabeceraSeriePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCabeceraSerie.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCabeceraSerie.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CabeceraSeriePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCabeceraSerieOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCabeceraSerieOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CabeceraSeriePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCabeceraSerie.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCabeceraSerie.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CabeceraSeriePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCabeceraSerie.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCabeceraSerie(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cabeceraserieLogic.getCabeceraSeries().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cabeceraseries.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CabeceraSerieJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCabeceraSerie.setModel(new CabeceraSerieModel(this.cabeceraserieLogic.getCabeceraSeries(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCabeceraSerie.setModel(new CabeceraSerieModel(this.cabeceraseries,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCabeceraSerie!=null && this.jInternalFrameOrderByCabeceraSerie.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCabeceraSerie();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCabeceraSerie.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCabeceraSerie,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CabeceraSeriePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO,cabeceraserieConstantesFunciones.resaltarSeleccionarCabeceraSerie,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO,cabeceraserieConstantesFunciones.resaltarSeleccionarCabeceraSerie,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCabeceraSerie.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCabeceraSerie,CabeceraSerieConstantesFunciones.LABEL_ID));

		if(this.cabeceraserieConstantesFunciones.mostraridCabeceraSerie && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CabeceraSerieConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cabeceraserieConstantesFunciones.resaltaridCabeceraSerie,this.cabeceraserieConstantesFunciones.activaridCabeceraSerie,this,true,"idCabeceraSerie","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cabeceraserieConstantesFunciones.resaltaridCabeceraSerie,this.cabeceraserieConstantesFunciones.activaridCabeceraSerie,this,true,"idCabeceraSerie","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCabeceraSerie.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCabeceraSerie,CabeceraSerieConstantesFunciones.LABEL_IDEMPRESA));

		if(this.cabeceraserieConstantesFunciones.mostrarid_empresaCabeceraSerie && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CabeceraSerieConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.cabeceraserieConstantesFunciones.resaltarid_empresaCabeceraSerie,this,this.cabeceraserieConstantesFunciones.activarid_empresaCabeceraSerie));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.cabeceraserieConstantesFunciones.resaltarid_empresaCabeceraSerie,this,this.cabeceraserieConstantesFunciones.activarid_empresaCabeceraSerie,false,"id_empresaCabeceraSerie","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CabeceraSeriePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCabeceraSerie.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCabeceraSerie,CabeceraSerieConstantesFunciones.LABEL_NOMBRE));

		if(this.cabeceraserieConstantesFunciones.mostrarnombreCabeceraSerie && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CabeceraSerieConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cabeceraserieConstantesFunciones.resaltarnombreCabeceraSerie,this.cabeceraserieConstantesFunciones.activarnombreCabeceraSerie,this,true,"nombreCabeceraSerie","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cabeceraserieConstantesFunciones.resaltarnombreCabeceraSerie,this.cabeceraserieConstantesFunciones.activarnombreCabeceraSerie,this,true,"nombreCabeceraSerie","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CabeceraSeriePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCabeceraSerie.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCabeceraSerie,CabeceraSerieConstantesFunciones.LABEL_FORMULA));

		if(this.cabeceraserieConstantesFunciones.mostrarformulaCabeceraSerie && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CabeceraSerieConstantesFunciones.LABEL_FORMULA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cabeceraserieConstantesFunciones.resaltarformulaCabeceraSerie,this.cabeceraserieConstantesFunciones.activarformulaCabeceraSerie,this,true,"formulaCabeceraSerie","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cabeceraserieConstantesFunciones.resaltarformulaCabeceraSerie,this.cabeceraserieConstantesFunciones.activarformulaCabeceraSerie,this,true,"formulaCabeceraSerie","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CabeceraSeriePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCabeceraSerie.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCabeceraSerie,CabeceraSerieConstantesFunciones.LABEL_CONFORMULA));

		if(this.cabeceraserieConstantesFunciones.mostrarcon_formulaCabeceraSerie && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CabeceraSerieConstantesFunciones.LABEL_CONFORMULA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.cabeceraserieConstantesFunciones.resaltarcon_formulaCabeceraSerie,this.cabeceraserieConstantesFunciones.activarcon_formulaCabeceraSerie));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.cabeceraserieConstantesFunciones.resaltarcon_formulaCabeceraSerie,this.cabeceraserieConstantesFunciones.activarcon_formulaCabeceraSerie,this,true,"con_formulaCabeceraSerie","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CabeceraSeriePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCabeceraSerie.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCabeceraSerie,CabeceraSerieConstantesFunciones.LABEL_CONTOTALIZAR));

		if(this.cabeceraserieConstantesFunciones.mostrarcon_totalizarCabeceraSerie && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CabeceraSerieConstantesFunciones.LABEL_CONTOTALIZAR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.cabeceraserieConstantesFunciones.resaltarcon_totalizarCabeceraSerie,this.cabeceraserieConstantesFunciones.activarcon_totalizarCabeceraSerie));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.cabeceraserieConstantesFunciones.resaltarcon_totalizarCabeceraSerie,this.cabeceraserieConstantesFunciones.activarcon_totalizarCabeceraSerie,this,true,"con_totalizarCabeceraSerie","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CabeceraSeriePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cabeceraserieSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cabeceraserieSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCabeceraSerie.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cabeceraserieSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cabeceraserieSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCabeceraSerie.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCabeceraSerie && this.isPermisoGuardarCambiosCabeceraSerie) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cabeceraserieSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cabeceraserieSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCabeceraSerie.addColumn(tableColumn);
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
			
			this.jTableDatosCabeceraSerie.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCabeceraSerie && this.isPermisoGuardarCambiosCabeceraSerie) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCabeceraSerie && this.isPermisoGuardarCambiosCabeceraSerie) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCabeceraSerie.moveColumn(this.jTableDatosCabeceraSerie.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCabeceraSerie.moveColumn(this.jTableDatosCabeceraSerie.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCabeceraSerie.moveColumn(this.jTableDatosCabeceraSerie.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCabeceraSerie.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCabeceraSerie.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCabeceraSerie,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CabeceraSerieJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCabeceraSerie.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCabeceraSerie.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CabeceraSerieJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CabeceraSerieJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCabeceraSerie.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCabeceraSerie.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCabeceraSerie.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=cabeceraserieLogic.getCabeceraSeries().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cabeceraseries.size()-1;
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
		//this.jTableDatosCabeceraSerie.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCabeceraSerie.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCabeceraSerie();
			
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
				
				//this.isEsNuevoCabeceraSerie=false;
					
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
			
				if(this.cabeceraserieSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCabeceraSerie==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCabeceraSerie.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCabeceraSerie.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserie =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cabeceraserie =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cabeceraserie.getsType().equals("DUPLICADO")
				   || this.cabeceraserie.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCabeceraSerie=true;
				
				} else {
					this.isEsNuevoCabeceraSerie=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
					if(this.cabeceraserie.getId()>=0 && !this.cabeceraserie.getIsNew()) {						
						this.isEsNuevoCabeceraSerie=false;
						
					} else {
						this.isEsNuevoCabeceraSerie=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCabeceraSerie(esRelaciones);						
				
				this.seleccionarCabeceraSerie(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cabeceraserie.getId()<0) {
					this.isEsNuevoCabeceraSerie=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCabeceraSerie(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCabeceraSerie(evt,rowIndex);
				}	
				
				if(this.cabeceraserieSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CabeceraSerie: " + this.dDif); 
					}
				}								
				
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCabeceraSerie(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cabeceraserie)) {
					if(this.cabeceraserie.getId()>0) {
						this.cabeceraserie.setIsDeleted(true);
						
						this.cabeceraseriesEliminados.add(this.cabeceraserie);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cabeceraserieLogic.getCabeceraSeries().remove(this.cabeceraserie);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cabeceraseries.remove(this.cabeceraserie);				
					}
					
					
					((CabeceraSerieModel) this.jTableDatosCabeceraSerie.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCabeceraSerie(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCabeceraSerie(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCabeceraSerie) {
			
			if(this.jInternalFrameDetalleFormCabeceraSerie==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCabeceraSerie.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCabeceraSerie.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserie =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cabeceraserie =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CabeceraSerieJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCabeceraSerie(this.cabeceraserie);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.cabeceraserieConstantesFunciones.cargarid_empresaCabeceraSerie || this.cabeceraserieConstantesFunciones.event_dependid_empresaCabeceraSerie) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.cabeceraserie.getid_empresa());
									//this.inicializarActualizarBindingCabeceraSerie(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(cabeceraserie.getEmpresa()!=null) {
							this.empresasForeignKey.add(cabeceraserie.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.cabeceraserie.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCabeceraSerie("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCabeceraSerie(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCabeceraSerie() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCabeceraSerie(CabeceraSerie cabeceraserie) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCabeceraSerie(cabeceraserie,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCabeceraSerie(CabeceraSerie cabeceraserie,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCabeceraSerie(cabeceraserie);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCabeceraSerie(cabeceraserie,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCabeceraSerie(cabeceraserie);
	}
	
	public void setVariablesObjetoActualToFormularioCabeceraSerie(CabeceraSerie cabeceraserie) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCabeceraSerie==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCabeceraSerie.jLabelidCabeceraSerie.setText(cabeceraserie.getId().toString());
			this.jInternalFrameDetalleFormCabeceraSerie.jTextFieldnombreCabeceraSerie.setText(cabeceraserie.getnombre());
			this.jInternalFrameDetalleFormCabeceraSerie.jTextAreaformulaCabeceraSerie.setText(cabeceraserie.getformula());
			this.jInternalFrameDetalleFormCabeceraSerie.jCheckBoxcon_formulaCabeceraSerie.setSelected(cabeceraserie.getcon_formula());
			this.jInternalFrameDetalleFormCabeceraSerie.jCheckBoxcon_totalizarCabeceraSerie.setSelected(cabeceraserie.getcon_totalizar());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CabeceraSerie cabeceraserieLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cabeceraserieLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CabeceraSerie cabeceraserieLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cabeceraserieLocal=this.cabeceraserie;
			} else {
				cabeceraserieLocal=this.cabeceraserieAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cabeceraserieLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCabeceraSerie(cabeceraserieLocal,true);
					
					if(cabeceraserieSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cabeceraserieLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cabeceraserieLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCabeceraSerie(CabeceraSerie cabeceraserie,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCabeceraSerie(cabeceraserie,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCabeceraSerie(cabeceraserie);
	}
	
	public void setVariablesFormularioToObjetoActualCabeceraSerie(CabeceraSerie cabeceraserie,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCabeceraSerie(cabeceraserie,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCabeceraSerie(CabeceraSerie cabeceraserie,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCabeceraSerie==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCabeceraSerie.jLabelidCabeceraSerie.getText()==null || this.jInternalFrameDetalleFormCabeceraSerie.jLabelidCabeceraSerie.getText()=="" || this.jInternalFrameDetalleFormCabeceraSerie.jLabelidCabeceraSerie.getText()=="Id") {
				this.jInternalFrameDetalleFormCabeceraSerie.jLabelidCabeceraSerie.setText("0");
			}

			if(conColumnasBase) {cabeceraserie.setId(Long.parseLong(this.jInternalFrameDetalleFormCabeceraSerie.jLabelidCabeceraSerie.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CabeceraSerieConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCabeceraSerie.jLabelIdCabeceraSerie,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cabeceraserie.setnombre(this.jInternalFrameDetalleFormCabeceraSerie.jTextFieldnombreCabeceraSerie.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CabeceraSerieConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCabeceraSerie.jLabelnombreCabeceraSerie,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cabeceraserie.setformula(this.jInternalFrameDetalleFormCabeceraSerie.jTextAreaformulaCabeceraSerie.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CabeceraSerieConstantesFunciones.LABEL_FORMULA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCabeceraSerie.jLabelformulaCabeceraSerie,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cabeceraserie.setcon_formula(this.jInternalFrameDetalleFormCabeceraSerie.jCheckBoxcon_formulaCabeceraSerie.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CabeceraSerieConstantesFunciones.LABEL_CONFORMULA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCabeceraSerie.jLabelcon_formulaCabeceraSerie,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cabeceraserie.setcon_totalizar(this.jInternalFrameDetalleFormCabeceraSerie.jCheckBoxcon_totalizarCabeceraSerie.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CabeceraSerieConstantesFunciones.LABEL_CONTOTALIZAR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCabeceraSerie.jLabelcon_totalizarCabeceraSerie,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCabeceraSerie(CabeceraSerie cabeceraserieBean,CabeceraSerie cabeceraserie,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCabeceraSerie(CabeceraSerie cabeceraserieOrigen,CabeceraSerie cabeceraserie,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cabeceraserieOrigen.getId()!=null && !cabeceraserieOrigen.getId().equals(0L))) {cabeceraserie.setId(cabeceraserieOrigen.getId());}}
			if(conDefault || (!conDefault && cabeceraserieOrigen.getnombre()!=null && !cabeceraserieOrigen.getnombre().equals(""))) {cabeceraserie.setnombre(cabeceraserieOrigen.getnombre());}
			if(conDefault || (!conDefault && cabeceraserieOrigen.getformula()!=null && !cabeceraserieOrigen.getformula().equals(""))) {cabeceraserie.setformula(cabeceraserieOrigen.getformula());}
			if(conDefault || (!conDefault && cabeceraserieOrigen.getcon_formula()!=null && !cabeceraserieOrigen.getcon_formula().equals(false))) {cabeceraserie.setcon_formula(cabeceraserieOrigen.getcon_formula());}
			if(conDefault || (!conDefault && cabeceraserieOrigen.getcon_totalizar()!=null && !cabeceraserieOrigen.getcon_totalizar().equals(false))) {cabeceraserie.setcon_totalizar(cabeceraserieOrigen.getcon_totalizar());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCabeceraSerie(CabeceraSerie cabeceraserie) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCabeceraSerie.jLabelidCabeceraSerie.setText(cabeceraserie.getId().toString());
			this.jInternalFrameDetalleFormCabeceraSerie.jTextFieldnombreCabeceraSerie.setText(cabeceraserie.getnombre());
			this.jInternalFrameDetalleFormCabeceraSerie.jTextAreaformulaCabeceraSerie.setText(cabeceraserie.getformula());
			this.jInternalFrameDetalleFormCabeceraSerie.jCheckBoxcon_formulaCabeceraSerie.setSelected(cabeceraserie.getcon_formula());
			this.jInternalFrameDetalleFormCabeceraSerie.jCheckBoxcon_totalizarCabeceraSerie.setSelected(cabeceraserie.getcon_totalizar());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCabeceraSerie(CabeceraSerieBean cabeceraserieBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCabeceraSerie.jLabelidCabeceraSerie.setText(cabeceraserieBean.getId().toString());
			this.jInternalFrameDetalleFormCabeceraSerie.jTextFieldnombreCabeceraSerie.setText(cabeceraserieBean.getnombre());
			this.jInternalFrameDetalleFormCabeceraSerie.jTextAreaformulaCabeceraSerie.setText(cabeceraserieBean.getformula());
			this.jInternalFrameDetalleFormCabeceraSerie.jCheckBoxcon_formulaCabeceraSerie.setSelected(cabeceraserieBean.getcon_formula());
			this.jInternalFrameDetalleFormCabeceraSerie.jCheckBoxcon_totalizarCabeceraSerie.setSelected(cabeceraserieBean.getcon_totalizar());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCabeceraSerie(CabeceraSerieParameterReturnGeneral cabeceraserieReturnGeneral,CabeceraSerieBean cabeceraserieBean,Boolean conDefault) throws Exception { 
		try {
			CabeceraSerie cabeceraserieLocal=new CabeceraSerie();
			
			cabeceraserieLocal=cabeceraserieReturnGeneral.getCabeceraSerie();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cabeceraserieLocal.getId()!=null && !cabeceraserieLocal.getId().equals(0L))) {cabeceraserieBean.setId(cabeceraserieLocal.getId());}}
			if(conDefault || (!conDefault && cabeceraserieLocal.getnombre()!=null && !cabeceraserieLocal.getnombre().equals(""))) {cabeceraserieBean.setnombre(cabeceraserieLocal.getnombre());}
			if(conDefault || (!conDefault && cabeceraserieLocal.getformula()!=null && !cabeceraserieLocal.getformula().equals(""))) {cabeceraserieBean.setformula(cabeceraserieLocal.getformula());}
			if(conDefault || (!conDefault && cabeceraserieLocal.getcon_formula()!=null && !cabeceraserieLocal.getcon_formula().equals(false))) {cabeceraserieBean.setcon_formula(cabeceraserieLocal.getcon_formula());}
			if(conDefault || (!conDefault && cabeceraserieLocal.getcon_totalizar()!=null && !cabeceraserieLocal.getcon_totalizar().equals(false))) {cabeceraserieBean.setcon_totalizar(cabeceraserieLocal.getcon_totalizar());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCabeceraSerieGenerico(Long idCabeceraSerieSeleccionado,JComboBox jComboBoxCabeceraSerie,List<CabeceraSerie> cabeceraseriesLocal)throws Exception {
		try {
			CabeceraSerie  cabeceraserieTemp=null;

			for(CabeceraSerie cabeceraserieAux:cabeceraseriesLocal) {
				if(cabeceraserieAux.getId()!=null && cabeceraserieAux.getId().equals(idCabeceraSerieSeleccionado)) {
					cabeceraserieTemp=cabeceraserieAux;
					break;
				}
			}

			jComboBoxCabeceraSerie.setSelectedItem(cabeceraserieTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCabeceraSerieGenerico(JComboBox jComboBoxCabeceraSerie,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCabeceraSerie.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCabeceraSerie.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCabeceraSerie.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCabeceraSerie.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCabeceraSerie.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCabeceraSerie.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCabeceraSerie.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCabeceraSerie.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCabeceraSerie.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCabeceraSerie.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cabeceraserie=(CabeceraSerie) cabeceraserieLogic.getCabeceraSeries().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cabeceraserie =(CabeceraSerie) cabeceraseries.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cabeceraserie.getIsNew() && !cabeceraserie.getIsChanged() && !cabeceraserie.getIsDeleted()) {
				sDescripcion=cabeceraserie.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cabeceraserie.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CabeceraSerie cabeceraserieRow=new CabeceraSerie();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cabeceraserieRow=(CabeceraSerie) cabeceraserieLogic.getCabeceraSeries().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cabeceraserieRow=(CabeceraSerie) cabeceraseries.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCabeceraSerie(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCabeceraSerie.setVisible((this.isVisibilidadCeldaNuevoCabeceraSerie && this.isPermisoNuevoCabeceraSerie));			
			this.jButtonDuplicarCabeceraSerie.setVisible((this.isVisibilidadCeldaDuplicarCabeceraSerie && this.isPermisoDuplicarCabeceraSerie));			
			this.jButtonCopiarCabeceraSerie.setVisible((this.isVisibilidadCeldaCopiarCabeceraSerie && this.isPermisoCopiarCabeceraSerie));
			this.jButtonVerFormCabeceraSerie.setVisible((this.isVisibilidadCeldaVerFormCabeceraSerie && this.isPermisoVerFormCabeceraSerie));
			
			this.jButtonAbrirOrderByCabeceraSerie.setVisible((this.isVisibilidadCeldaOrdenCabeceraSerie && this.isPermisoOrdenCabeceraSerie));			
			
			this.jButtonNuevoRelacionesCabeceraSerie.setVisible((this.isVisibilidadCeldaNuevoRelacionesCabeceraSerie && this.isPermisoNuevoCabeceraSerie));			
			this.jButtonNuevoGuardarCambiosCabeceraSerie.setVisible((this.isVisibilidadCeldaNuevoCabeceraSerie && this.isPermisoNuevoCabeceraSerie && this.isPermisoGuardarCambiosCabeceraSerie));
			
			if(this.jInternalFrameDetalleFormCabeceraSerie!=null) {
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonModificarCabeceraSerie.setVisible((this.isVisibilidadCeldaModificarCabeceraSerie && this.isPermisoActualizarCabeceraSerie));	
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonActualizarCabeceraSerie.setVisible((this.isVisibilidadCeldaActualizarCabeceraSerie && this.isPermisoActualizarCabeceraSerie));	
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonEliminarCabeceraSerie.setVisible((this.isVisibilidadCeldaEliminarCabeceraSerie && this.isPermisoEliminarCabeceraSerie));
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonCancelarCabeceraSerie.setVisible(this.isVisibilidadCeldaCancelarCabeceraSerie);							
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonGuardarCambiosCabeceraSerie.setVisible((this.isVisibilidadCeldaGuardarCabeceraSerie && this.isPermisoGuardarCambiosCabeceraSerie));			
			
			}
						
			this.jButtonGuardarCambiosTablaCabeceraSerie.setVisible((this.isVisibilidadCeldaGuardarCambiosCabeceraSerie && this.isPermisoGuardarCambiosCabeceraSerie));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCabeceraSerie.setVisible((this.isVisibilidadCeldaNuevoCabeceraSerie && this.isPermisoNuevoCabeceraSerie));						
			this.jButtonDuplicarToolBarCabeceraSerie.setVisible((this.isVisibilidadCeldaDuplicarCabeceraSerie && this.isPermisoDuplicarCabeceraSerie));						
			this.jButtonCopiarToolBarCabeceraSerie.setVisible((this.isVisibilidadCeldaCopiarCabeceraSerie && this.isPermisoCopiarCabeceraSerie));			
			this.jButtonVerFormToolBarCabeceraSerie.setVisible((this.isVisibilidadCeldaVerFormCabeceraSerie && this.isPermisoVerFormCabeceraSerie));			
			this.jButtonAbrirOrderByToolBarCabeceraSerie.setVisible((this.isVisibilidadCeldaOrdenCabeceraSerie && this.isPermisoOrdenCabeceraSerie));
			this.jButtonNuevoRelacionesToolBarCabeceraSerie.setVisible((this.isVisibilidadCeldaNuevoRelacionesCabeceraSerie && this.isPermisoNuevoCabeceraSerie));			
			this.jButtonNuevoGuardarCambiosToolBarCabeceraSerie.setVisible((this.isVisibilidadCeldaNuevoCabeceraSerie && this.isPermisoNuevoCabeceraSerie && this.isPermisoGuardarCambiosCabeceraSerie));			
			
			if(this.jInternalFrameDetalleFormCabeceraSerie!=null) {
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonModificarToolBarCabeceraSerie.setVisible((this.isVisibilidadCeldaModificarCabeceraSerie && this.isPermisoActualizarCabeceraSerie));	
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonActualizarToolBarCabeceraSerie.setVisible((this.isVisibilidadCeldaActualizarCabeceraSerie  && this.isPermisoActualizarCabeceraSerie));	
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonEliminarToolBarCabeceraSerie.setVisible((this.isVisibilidadCeldaEliminarCabeceraSerie && this.isPermisoEliminarCabeceraSerie));
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonCancelarToolBarCabeceraSerie.setVisible(this.isVisibilidadCeldaCancelarCabeceraSerie);				
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonGuardarCambiosToolBarCabeceraSerie.setVisible((this.isVisibilidadCeldaGuardarCabeceraSerie && this.isPermisoGuardarCambiosCabeceraSerie));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCabeceraSerie.setVisible((this.isVisibilidadCeldaGuardarCambiosCabeceraSerie && this.isPermisoGuardarCambiosCabeceraSerie));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCabeceraSerie.setVisible((this.isVisibilidadCeldaNuevoCabeceraSerie && this.isPermisoNuevoCabeceraSerie));			
			this.jMenuItemDuplicarCabeceraSerie.setVisible((this.isVisibilidadCeldaDuplicarCabeceraSerie && this.isPermisoDuplicarCabeceraSerie));			
			this.jMenuItemCopiarCabeceraSerie.setVisible((this.isVisibilidadCeldaCopiarCabeceraSerie && this.isPermisoCopiarCabeceraSerie));			
			this.jMenuItemVerFormCabeceraSerie.setVisible((this.isVisibilidadCeldaVerFormCabeceraSerie && this.isPermisoVerFormCabeceraSerie));			
			this.jMenuItemAbrirOrderByCabeceraSerie.setVisible((this.isVisibilidadCeldaOrdenCabeceraSerie && this.isPermisoOrdenCabeceraSerie));			
			//this.jMenuItemMostrarOcultarCabeceraSerie.setVisible((this.isVisibilidadCeldaOrdenCabeceraSerie && this.isPermisoOrdenCabeceraSerie));
			this.jMenuItemDetalleAbrirOrderByCabeceraSerie.setVisible((this.isVisibilidadCeldaOrdenCabeceraSerie && this.isPermisoOrdenCabeceraSerie));			
			//this.jMenuItemDetalleMostrarOcultarCabeceraSerie.setVisible((this.isVisibilidadCeldaOrdenCabeceraSerie && this.isPermisoOrdenCabeceraSerie));			
			this.jMenuItemNuevoRelacionesCabeceraSerie.setVisible((this.isVisibilidadCeldaNuevoRelacionesCabeceraSerie && this.isPermisoNuevoCabeceraSerie));			
			this.jMenuItemNuevoGuardarCambiosCabeceraSerie.setVisible((this.isVisibilidadCeldaNuevoCabeceraSerie && this.isPermisoNuevoCabeceraSerie && this.isPermisoGuardarCambiosCabeceraSerie));									
			
			if(this.jInternalFrameDetalleFormCabeceraSerie!=null) {
			this.jInternalFrameDetalleFormCabeceraSerie.jMenuItemModificarCabeceraSerie.setVisible((this.isVisibilidadCeldaModificarCabeceraSerie && this.isPermisoActualizarCabeceraSerie));	
			this.jInternalFrameDetalleFormCabeceraSerie.jMenuItemActualizarCabeceraSerie.setVisible((this.isVisibilidadCeldaActualizarCabeceraSerie && this.isPermisoActualizarCabeceraSerie));	
			this.jInternalFrameDetalleFormCabeceraSerie.jMenuItemEliminarCabeceraSerie.setVisible((this.isVisibilidadCeldaEliminarCabeceraSerie && this.isPermisoEliminarCabeceraSerie));
			this.jInternalFrameDetalleFormCabeceraSerie.jMenuItemCancelarCabeceraSerie.setVisible(this.isVisibilidadCeldaCancelarCabeceraSerie);				
			}
			
			this.jMenuItemGuardarCambiosCabeceraSerie.setVisible((this.isVisibilidadCeldaGuardarCabeceraSerie && this.isPermisoGuardarCambiosCabeceraSerie));						
			this.jMenuItemGuardarCambiosTablaCabeceraSerie.setVisible((this.isVisibilidadCeldaGuardarCambiosCabeceraSerie && this.isPermisoGuardarCambiosCabeceraSerie));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCabeceraSerie=this.jButtonNuevoCabeceraSerie.isVisible();
			this.isVisibilidadCeldaDuplicarCabeceraSerie=this.jButtonDuplicarCabeceraSerie.isVisible();
			this.isVisibilidadCeldaCopiarCabeceraSerie=this.jButtonCopiarCabeceraSerie.isVisible();
			this.isVisibilidadCeldaVerFormCabeceraSerie=this.jButtonVerFormCabeceraSerie.isVisible();
			
			this.isVisibilidadCeldaOrdenCabeceraSerie=this.jButtonAbrirOrderByCabeceraSerie.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCabeceraSerie=this.jButtonNuevoRelacionesCabeceraSerie.isVisible();
			this.isVisibilidadCeldaModificarCabeceraSerie=this.jButtonModificarCabeceraSerie.isVisible();
			
			if(this.jInternalFrameDetalleFormCabeceraSerie!=null) {
			this.isVisibilidadCeldaActualizarCabeceraSerie=this.jInternalFrameDetalleFormCabeceraSerie.jButtonActualizarCabeceraSerie.isVisible();
			this.isVisibilidadCeldaEliminarCabeceraSerie=this.jInternalFrameDetalleFormCabeceraSerie.jButtonEliminarCabeceraSerie.isVisible();
			this.isVisibilidadCeldaCancelarCabeceraSerie=this.jInternalFrameDetalleFormCabeceraSerie.jButtonCancelarCabeceraSerie.isVisible();
			this.isVisibilidadCeldaGuardarCabeceraSerie=this.jInternalFrameDetalleFormCabeceraSerie.jButtonGuardarCambiosCabeceraSerie.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCabeceraSerie=this.jButtonGuardarCambiosTablaCabeceraSerie.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCabeceraSerie=this.jButtonNuevoToolBarCabeceraSerie.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCabeceraSerie=this.jButtonNuevoRelacionesToolBarCabeceraSerie.isVisible();
			
			if(this.jInternalFrameDetalleFormCabeceraSerie!=null) {
			this.isVisibilidadCeldaModificarCabeceraSerie=this.jInternalFrameDetalleFormCabeceraSerie.jButtonModificarToolBarCabeceraSerie.isVisible();
			this.isVisibilidadCeldaActualizarCabeceraSerie=this.jInternalFrameDetalleFormCabeceraSerie.jButtonActualizarToolBarCabeceraSerie.isVisible();
			this.isVisibilidadCeldaEliminarCabeceraSerie=this.jInternalFrameDetalleFormCabeceraSerie.jButtonEliminarToolBarCabeceraSerie.isVisible();
			this.isVisibilidadCeldaCancelarCabeceraSerie=this.jInternalFrameDetalleFormCabeceraSerie.jButtonCancelarToolBarCabeceraSerie.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCabeceraSerie=this.jButtonGuardarCambiosToolBarCabeceraSerie.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCabeceraSerie=this.jButtonGuardarCambiosTablaToolBarCabeceraSerie.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCabeceraSerie=this.jMenuItemNuevoCabeceraSerie.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCabeceraSerie=this.jMenuItemNuevoRelacionesCabeceraSerie.isVisible();
			
			if(this.jInternalFrameDetalleFormCabeceraSerie!=null) {
			this.isVisibilidadCeldaModificarCabeceraSerie=this.jInternalFrameDetalleFormCabeceraSerie.jMenuItemModificarCabeceraSerie.isVisible();
			this.isVisibilidadCeldaActualizarCabeceraSerie=this.jInternalFrameDetalleFormCabeceraSerie.jMenuItemActualizarCabeceraSerie.isVisible();
			this.isVisibilidadCeldaEliminarCabeceraSerie=this.jInternalFrameDetalleFormCabeceraSerie.jMenuItemEliminarCabeceraSerie.isVisible();
			this.isVisibilidadCeldaCancelarCabeceraSerie=this.jInternalFrameDetalleFormCabeceraSerie.jMenuItemCancelarCabeceraSerie.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCabeceraSerie=this.jMenuItemGuardarCambiosCabeceraSerie.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCabeceraSerie=this.jMenuItemGuardarCambiosTablaCabeceraSerie.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCabeceraSerie(Boolean esInicializar) {
		if(CabeceraSerieJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cabeceraserieSessionBean.getConGuardarRelaciones()) {
				//if(this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCabeceraSerie();
			}
			
			this.inicializarActualizarBindingBotonesManualCabeceraSerie(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCabeceraSerie() {
		this.jButtonNuevoCabeceraSerie.setVisible(this.isPermisoNuevoCabeceraSerie);			
		this.jButtonDuplicarCabeceraSerie.setVisible(this.isPermisoDuplicarCabeceraSerie);			
		this.jButtonCopiarCabeceraSerie.setVisible(this.isPermisoCopiarCabeceraSerie);			
		this.jButtonVerFormCabeceraSerie.setVisible(this.isPermisoVerFormCabeceraSerie);			
		
		this.jButtonAbrirOrderByCabeceraSerie.setVisible(this.isPermisoOrdenCabeceraSerie);					
		
		this.jButtonNuevoRelacionesCabeceraSerie.setVisible(this.isPermisoNuevoCabeceraSerie);			
		
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonModificarCabeceraSerie.setVisible(this.isPermisoActualizarCabeceraSerie);	
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonActualizarCabeceraSerie.setVisible(this.isPermisoActualizarCabeceraSerie);	
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonEliminarCabeceraSerie.setVisible(this.isPermisoEliminarCabeceraSerie);
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonCancelarCabeceraSerie.setVisible(this.isVisibilidadCeldaCancelarCabeceraSerie);						
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonGuardarCambiosCabeceraSerie.setVisible(this.isPermisoGuardarCambiosCabeceraSerie);							
		}
		
		this.jButtonGuardarCambiosTablaCabeceraSerie.setVisible(this.isPermisoActualizarCabeceraSerie);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCabeceraSerie() {
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonModificarCabeceraSerie.setVisible(this.isPermisoActualizarCabeceraSerie);	
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonActualizarCabeceraSerie.setVisible(this.isPermisoActualizarCabeceraSerie);	
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonEliminarCabeceraSerie.setVisible(this.isPermisoEliminarCabeceraSerie);
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonCancelarCabeceraSerie.setVisible(this.isVisibilidadCeldaCancelarCabeceraSerie);							
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonGuardarCambiosCabeceraSerie.setVisible((this.isVisibilidadCeldaGuardarCabeceraSerie && this.isPermisoGuardarCambiosCabeceraSerie));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCabeceraSerie() {
		if(CabeceraSerieJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCabeceraSerie();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCabeceraSerie() {
	}
	
	public void jTableDatosCabeceraSerieListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCabeceraSerie(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCabeceraSerieBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCabeceraSerie.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCabeceraSerie(this.getcabeceraserie(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCabeceraSerie(this.cabeceraserie);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cabeceraserie =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cabeceraserie =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cabeceraserie==null) {
						this.cabeceraserie = new CabeceraSerie();
					}

					this.setVariablesFormularioToObjetoActualCabeceraSerie(this.cabeceraserie,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCabeceraSerie(this.cabeceraserie);
				}

				if(this.cabeceraserie.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cabeceraserie.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCabeceraSerie(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCabeceraSerieUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCabeceraSerie(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCabeceraSerie.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCabeceraSerie.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCabeceraSerie.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserie =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cabeceraserie =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCabeceraSerie(this.getcabeceraserie(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCabeceraSerie(this.cabeceraserie);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cabeceraserieLogic.getConnexion());

				if(this.cabeceraserie.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cabeceraserie.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCabeceraSerie=(TitledBorder)this.jScrollPanelDatosCabeceraSerie.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCabeceraSerie.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCabeceraSerieBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCabeceraSerie.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCabeceraSerie(this.getcabeceraserie(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCabeceraSerie(this.cabeceraserie);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cabeceraserie =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cabeceraserie =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cabeceraserie==null) {
						this.cabeceraserie = new CabeceraSerie();
					}

					this.setVariablesFormularioToObjetoActualCabeceraSerie(this.cabeceraserie,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCabeceraSerie(this.cabeceraserie);
				}

				if(this.cabeceraserie.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cabeceraserie.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCabeceraSerie(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCabeceraSerieBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCabeceraSerie.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCabeceraSerie(this.getcabeceraserie(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCabeceraSerie(this.cabeceraserie);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cabeceraserie =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cabeceraserie =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cabeceraserie==null) {
						this.cabeceraserie = new CabeceraSerie();
					}

					this.setVariablesFormularioToObjetoActualCabeceraSerie(this.cabeceraserie,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCabeceraSerie(this.cabeceraserie);
				}

				if(this.cabeceraserie.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.cabeceraserie.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCabeceraSerie(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonformulaCabeceraSerieBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCabeceraSerie.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCabeceraSerie(this.getcabeceraserie(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCabeceraSerie(this.cabeceraserie);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cabeceraserie =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cabeceraserie =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cabeceraserie==null) {
						this.cabeceraserie = new CabeceraSerie();
					}

					this.setVariablesFormularioToObjetoActualCabeceraSerie(this.cabeceraserie,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCabeceraSerie(this.cabeceraserie);
				}

				if(this.cabeceraserie.getformula()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where formula like '%"+this.cabeceraserie.getformula()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCabeceraSerie(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_formulaCabeceraSerieBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCabeceraSerie.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCabeceraSerie(this.getcabeceraserie(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCabeceraSerie(this.cabeceraserie);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cabeceraserie =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cabeceraserie =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cabeceraserie==null) {
						this.cabeceraserie = new CabeceraSerie();
					}

					this.setVariablesFormularioToObjetoActualCabeceraSerie(this.cabeceraserie,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCabeceraSerie(this.cabeceraserie);
				}

				if(this.cabeceraserie.getcon_formula()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_formula = "+this.cabeceraserie.getcon_formula().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCabeceraSerie(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_totalizarCabeceraSerieBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCabeceraSerie.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCabeceraSerie(this.getcabeceraserie(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCabeceraSerie(this.cabeceraserie);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cabeceraserie =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cabeceraserie =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cabeceraserie==null) {
						this.cabeceraserie = new CabeceraSerie();
					}

					this.setVariablesFormularioToObjetoActualCabeceraSerie(this.cabeceraserie,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCabeceraSerie(this.cabeceraserie);
				}

				if(this.cabeceraserie.getcon_totalizar()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_totalizar = "+this.cabeceraserie.getcon_totalizar().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCabeceraSerie(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreCabeceraSerieActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCabeceraSerie(false,false);

			this.getCabeceraSeriesBusquedaPorNombre();

			this.inicializarActualizarBindingCabeceraSerie(false);

			//if(CabeceraSerieBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCabeceraSerie(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCabeceraSerieActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCabeceraSerie(false,false);

			this.getCabeceraSeriesFK_IdEmpresa();

			this.inicializarActualizarBindingCabeceraSerie(false);

			//if(CabeceraSerieBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCabeceraSerie(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cabeceraserieLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCabeceraSerie() {
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) {
			this.jInternalFrameDetalleFormCabeceraSerie.setVisible(false);	    			
			this.jInternalFrameDetalleFormCabeceraSerie.dispose();
			this.jInternalFrameDetalleFormCabeceraSerie=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCabeceraSerie!=null) {
			this.jInternalFrameReporteDinamicoCabeceraSerie.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCabeceraSerie.dispose();
			this.jInternalFrameReporteDinamicoCabeceraSerie=null;
		}
		
		if(this.jInternalFrameImportacionCabeceraSerie!=null) {
			this.jInternalFrameImportacionCabeceraSerie.setVisible(false);	    			
			this.jInternalFrameImportacionCabeceraSerie.dispose();
			this.jInternalFrameImportacionCabeceraSerie=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCabeceraSerie();
			
			CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
			
			
			if(sTipo.equals("NuevoCabeceraSerie")) {
				jButtonNuevoCabeceraSerieActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCabeceraSerie")) {
				jButtonDuplicarCabeceraSerieActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCabeceraSerie")) {
				jButtonCopiarCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("VerFormCabeceraSerie")) {
				jButtonVerFormCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCabeceraSerie")) {
				jButtonNuevoCabeceraSerieActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCabeceraSerie")) {
				jButtonDuplicarCabeceraSerieActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCabeceraSerie")) {
				jButtonNuevoCabeceraSerieActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCabeceraSerie")) {
				jButtonDuplicarCabeceraSerieActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCabeceraSerie")) {
				jButtonNuevoCabeceraSerieActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCabeceraSerie")) {
				jButtonNuevoCabeceraSerieActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCabeceraSerie")) {
				jButtonNuevoCabeceraSerieActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCabeceraSerie")) {
				jButtonModificarCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCabeceraSerie")) {
				jButtonModificarCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCabeceraSerie")) {
				jButtonModificarCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCabeceraSerie")) {
				jButtonActualizarCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCabeceraSerie")) {
				jButtonActualizarCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCabeceraSerie")) {
				jButtonActualizarCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("EliminarCabeceraSerie")) {
				jButtonEliminarCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCabeceraSerie")) {
				jButtonEliminarCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCabeceraSerie")) {
				jButtonEliminarCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("CancelarCabeceraSerie")) {
				jButtonCancelarCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCabeceraSerie")) {
				jButtonCancelarCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCabeceraSerie")) {
				jButtonCancelarCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("CerrarCabeceraSerie")) {
				jButtonCerrarCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCabeceraSerie")) {
				jButtonCerrarCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCabeceraSerie")) {
				jButtonCerrarCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCabeceraSerie")) {
				jButtonMostrarOcultarCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCabeceraSerie")) {
				jButtonCancelarCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCabeceraSerie")) {
				jButtonGuardarCambiosCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCabeceraSerie")) {
				jButtonGuardarCambiosCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCabeceraSerie")) {
				jButtonCopiarCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCabeceraSerie")) {
				jButtonVerFormCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCabeceraSerie")) {
				jButtonGuardarCambiosCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCabeceraSerie")) {
				jButtonCopiarCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCabeceraSerie")) {
				jButtonVerFormCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCabeceraSerie")) {
				jButtonGuardarCambiosCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCabeceraSerie")) {
				jButtonGuardarCambiosCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCabeceraSerie")) {
				jButtonGuardarCambiosCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCabeceraSerie")) {
				jButtonRecargarInformacionCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCabeceraSerie")) {
				jButtonRecargarInformacionCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCabeceraSerie")) {
				jButtonRecargarInformacionCabeceraSerieActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCabeceraSerie")) {
				jButtonAnterioresCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCabeceraSerie")) {
				jButtonAnterioresCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCabeceraSerie")) {
				jButtonAnterioresCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCabeceraSerie")) {
				jButtonSiguientesCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCabeceraSerie")) {
				jButtonSiguientesCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCabeceraSerie")) {
				jButtonSiguientesCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCabeceraSerie") || sTipo.equals("MenuItemDetalleAbrirOrderByCabeceraSerie")) {
				jButtonAbrirOrderByCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCabeceraSerie") || sTipo.equals("MenuItemDetalleMostrarOcultarCabeceraSerie")) {
				jButtonMostrarOcultarCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCabeceraSerie")) {
				jButtonNuevoGuardarCambiosCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCabeceraSerie")) {
				jButtonNuevoGuardarCambiosCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCabeceraSerie")) {
				jButtonNuevoGuardarCambiosCabeceraSerieActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCabeceraSerie")) {
				jButtonCerrarReporteDinamicoCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCabeceraSerie")) {
				jButtonGenerarReporteDinamicoCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCabeceraSerie")) {
				
				jButtonGenerarExcelReporteDinamicoCabeceraSerieActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCabeceraSerie")) {
				jButtonCerrarImportacionCabeceraSerieActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCabeceraSerie")) {
				
				jButtonGenerarImportacionCabeceraSerieActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCabeceraSerie")) {
				
				jButtonAbrirImportacionCabeceraSerieActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCabeceraSerie")) {
				jComboBoxTiposAccionesCabeceraSerieActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCabeceraSerie")) {
				jComboBoxTiposRelacionesCabeceraSerieActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCabeceraSerie")) {
				jComboBoxTiposAccionesCabeceraSerieActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCabeceraSerie")) {
				
				jComboBoxTiposSeleccionarCabeceraSerieActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCabeceraSerie")) {
				jTextFieldValorCampoGeneralCabeceraSerieActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCabeceraSerie")) {
				jButtonAbrirOrderByCabeceraSerieActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCabeceraSerie")) {
				jButtonAbrirOrderByCabeceraSerieActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCabeceraSerie")) {
				jButtonCerrarOrderByCabeceraSerieActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCabeceraSerieBusqueda")) {
				this.jButtonidCabeceraSerieBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCabeceraSerieUpdate")) {
				this.jButtonid_empresaCabeceraSerieUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCabeceraSerieBusqueda")) {
				this.jButtonid_empresaCabeceraSerieBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCabeceraSerieBusqueda")) {
				this.jButtonnombreCabeceraSerieBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("formulaCabeceraSerieBusqueda")) {
				this.jButtonformulaCabeceraSerieBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_formulaCabeceraSerieBusqueda")) {
				this.jButtoncon_formulaCabeceraSerieBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_totalizarCabeceraSerieBusqueda")) {
				this.jButtoncon_totalizarCabeceraSerieBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreCabeceraSerie")) {
				this.jButtonBusquedaPorNombreCabeceraSerieActionPerformed(evt);
			}
			
			;
			
			
			CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCabeceraSerie();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCabeceraSerieActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cabeceraserie);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cabeceraserie);
				
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
				
				


				
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CabeceraSerie.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CabeceraSerie.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CabeceraSerie cabeceraserieLocal=null;
			
			if(!this.getEsControlTabla()) {
				cabeceraserieLocal=this.cabeceraserie;
			} else {
				cabeceraserieLocal=this.cabeceraserieAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cabeceraserie);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cabeceraserie);
				
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
							
				
				


				
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CabeceraSerie.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CabeceraSerie.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCabeceraSerieActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCabeceraSerie.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieAnterior =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cabeceraserieAnterior =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
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
			
			CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
			
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
			
			


			
			CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCabeceraSerieActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cabeceraserie);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cabeceraserie);
				
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
								
						
				


				
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CabeceraSerie.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CabeceraSerie.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cabeceraserie);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cabeceraserie);
				
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
								
				
				


				
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CabeceraSerie.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CabeceraSerie.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCabeceraSerieActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCabeceraSerie.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieAnterior =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cabeceraserieAnterior =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cabeceraserie);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cabeceraserie);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCabeceraSerieActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCabeceraSerie.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieAnterior =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cabeceraserieAnterior =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCabeceraSerieActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cabeceraserie);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cabeceraserie);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cabeceraserie);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cabeceraserie);
				
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
							
				
				


				
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CabeceraSerie.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CabeceraSerie.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCabeceraSerieActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCabeceraSerie.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cabeceraserieAnterior =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cabeceraserieAnterior =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
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
			
			CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
			
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
			
			


			
			CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCabeceraSerieActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cabeceraserie);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cabeceraserie);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cabeceraserie);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cabeceraserie);
				
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
								
				
				


				
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CabeceraSerie.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CabeceraSerie.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCabeceraSerieActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCabeceraSerie.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieAnterior =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cabeceraserieAnterior =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCabeceraSerieActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cabeceraserie);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cabeceraserie);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCabeceraSerieActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cabeceraserie);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cabeceraserie);
				
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCabeceraSerie")) {
					jCheckBoxSeleccionarTodosCabeceraSerieItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCabeceraSerie")) {
					jCheckBoxSeleccionadosCabeceraSerieItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCabeceraSerie")) {
					
				}
				
				


				
				
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CabeceraSerie.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CabeceraSerie.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cabeceraserie);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cabeceraserie);
				
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
												
				
				


				
				
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CabeceraSerie.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CabeceraSerie.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCabeceraSerieActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCabeceraSerie.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cabeceraserieAnterior =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cabeceraserieAnterior =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCabeceraSerieActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cabeceraserie);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cabeceraserie);
				
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
				
				
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
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
			
			CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
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
			
			


			
			CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCabeceraSerieActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cabeceraserie);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cabeceraserie);
				
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CabeceraSerie.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CabeceraSerie.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cabeceraserie);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cabeceraserie);
				
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
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
				
				


				
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CabeceraSerie.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CabeceraSerie.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCabeceraSerieActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCabeceraSerie.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cabeceraserieAnterior =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cabeceraserieAnterior =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCabeceraSerie")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCabeceraSerieListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCabeceraSerie.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cabeceraserie =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cabeceraserie =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cabeceraserie);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCabeceraSerie")) {
				
				}
				
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCabeceraSerie")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCabeceraSerie.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCabeceraSerie")) {
			
			}
			
			CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCabeceraSerie();
			
			CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
			
			if(sTipo.equals("NuevoCabeceraSerie")) {
				jButtonNuevoCabeceraSerieActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCabeceraSerie")) {
				jButtonDuplicarCabeceraSerieActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCabeceraSerie")) {
				jButtonCopiarCabeceraSerieActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCabeceraSerie")) {
				jButtonVerFormCabeceraSerieActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCabeceraSerie")) {
				jButtonNuevoCabeceraSerieActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCabeceraSerie")) {
				jButtonModificarCabeceraSerieActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCabeceraSerie")) {
				jButtonActualizarCabeceraSerieActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCabeceraSerie")) {
				jButtonEliminarCabeceraSerieActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCabeceraSerie")) {
				jButtonGuardarCambiosCabeceraSerieActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCabeceraSerie")) {
				jButtonCancelarCabeceraSerieActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCabeceraSerie")) {
				jButtonCerrarCabeceraSerieActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCabeceraSerie")) {
				jButtonGuardarCambiosCabeceraSerieActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCabeceraSerie")) {
				jButtonNuevoGuardarCambiosCabeceraSerieActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCabeceraSerie")) {
				jButtonAbrirOrderByCabeceraSerieActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCabeceraSerie")) {
				jButtonRecargarInformacionCabeceraSerieActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCabeceraSerie")) {
				jButtonAnterioresCabeceraSerieActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCabeceraSerie")) {
				jButtonSiguientesCabeceraSerieActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCabeceraSerieBusqueda")) {
				this.jButtonidCabeceraSerieBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCabeceraSerieUpdate")) {
				this.jButtonid_empresaCabeceraSerieUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCabeceraSerieBusqueda")) {
				this.jButtonid_empresaCabeceraSerieBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCabeceraSerieBusqueda")) {
				this.jButtonnombreCabeceraSerieBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("formulaCabeceraSerieBusqueda")) {
				this.jButtonformulaCabeceraSerieBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_formulaCabeceraSerieBusqueda")) {
				this.jButtoncon_formulaCabeceraSerieBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_totalizarCabeceraSerieBusqueda")) {
				this.jButtoncon_totalizarCabeceraSerieBusquedaActionPerformed(evt);
			}
			
			CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCabeceraSerie();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCabeceraSerie")) {
				closingInternalFrameCabeceraSerie();
				
			} else if(sTipo.equals("jButtonCancelarCabeceraSerie")) {
				JInternalFrameBase jInternalFrameDetalleFormCabeceraSerie = (JInternalFrameBase)evt.getSource();
	            	
	            CabeceraSerieBeanSwingJInternalFrame jInternalFrameParent=(CabeceraSerieBeanSwingJInternalFrame)jInternalFrameDetalleFormCabeceraSerie.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCabeceraSerieActionPerformed(null);
			}
			
			CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cabeceraserie,new Object(),this.cabeceraserieParameterGeneral,this.cabeceraserieReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCabeceraSerie(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCabeceraSerie(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCabeceraSerie(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cabeceraserie)) {
			if(!esControlTabla) {
				if(CabeceraSerieJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCabeceraSerie(this.cabeceraserie,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCabeceraSerie(this.cabeceraserie);			
				}
				
				if(this.cabeceraserieSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCabeceraSerie(this.cabeceraserie,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cabeceraserieReturnGeneral=cabeceraserieLogic.procesarEventosCabeceraSeriesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cabeceraserieLogic.getCabeceraSeries(),this.cabeceraserie,this.cabeceraserieParameterGeneral,this.isEsNuevoCabeceraSerie,classes);//this.cabeceraserieLogic.getCabeceraSerie()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCabeceraSerie(this.cabeceraserieReturnGeneral,this.cabeceraserieBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cabeceraserieSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCabeceraSerie(classes,this.cabeceraserieReturnGeneral,this.cabeceraserieBean,false);
					}
						
					if(this.cabeceraserieReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCabeceraSerie(this.cabeceraserieReturnGeneral.getCabeceraSerie());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCabeceraSerie(this.cabeceraserieReturnGeneral.getCabeceraSerie());	
					}
						
					if(this.cabeceraserieReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCabeceraSerie(this.cabeceraserieReturnGeneral.getCabeceraSerie(),classes);//this.cabeceraserieBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCabeceraSerie(this.cabeceraserie,classes);//this.cabeceraserieBean);									
				}
			
				if(CabeceraSerieJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCabeceraSerie(this.cabeceraserie,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCabeceraSerie(this.cabeceraserie);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cabeceraserieAnterior!=null) {
						this.cabeceraserie=this.cabeceraserieAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cabeceraserieReturnGeneral=cabeceraserieLogic.procesarEventosCabeceraSeriesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cabeceraserieLogic.getCabeceraSeries(),this.cabeceraserie,this.cabeceraserieParameterGeneral,this.isEsNuevoCabeceraSerie,classes);//this.cabeceraserieLogic.getCabeceraSerie()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cabeceraserieSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cabeceraserieSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cabeceraserieReturnGeneral.getCabeceraSerie(),cabeceraserieLogic.getCabeceraSeries());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cabeceraserieReturnGeneral.getCabeceraSerie(),this.cabeceraseries);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCabeceraSerie.repaint();
				
				//((AbstractTableModel) this.jTableDatosCabeceraSerie.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCabeceraSerie();
			}
		}
	}
	
	public void actualizarVisualTableDatosCabeceraSerie() throws Exception {
		
		CabeceraSerieModel cabeceraserieModel=(CabeceraSerieModel)this.jTableDatosCabeceraSerie.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cabeceraserieModel.cabeceraseries=this.cabeceraserieLogic.getCabeceraSeries();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cabeceraserieModel.cabeceraseries=this.cabeceraseries;
		}
		
		
		((CabeceraSerieModel) this.jTableDatosCabeceraSerie.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCabeceraSerie() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcabeceraserieAnterior(),this.cabeceraserieLogic.getCabeceraSeries());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcabeceraserieAnterior(),this.cabeceraseries);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCabeceraSerie();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCabeceraSerie(CabeceraSerie cabeceraserie,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
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
										
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cabeceraserie,new Object(),generalEntityParameterGeneral,this.cabeceraserieReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cabeceraserieSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CabeceraSerieConstantesFunciones.getClassesRelationshipsOfCabeceraSerie(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CabeceraSerieConstantesFunciones.getClassesRelationshipsFromStringsOfCabeceraSerie(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCabeceraSerie(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CabeceraSerieBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cabeceraserie,new Object(),generalEntityParameterGeneral,this.cabeceraserieReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCabeceraSerie(CabeceraSerieBean cabeceraserieBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCabeceraSerie(ArrayList<Classe> classes,CabeceraSerieReturnGeneral cabeceraserieReturnGeneral,CabeceraSerieBean cabeceraserieBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCabeceraSerie(CabeceraSerie cabeceraserie,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cabeceraserie)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCabeceraSerie = new CabeceraSerieDetalleFormJInternalFrame(jDesktopPane,this.cabeceraserieSessionBean.getConGuardarRelaciones(),this.cabeceraserieSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCabeceraSerie);
		this.jInternalFrameDetalleFormCabeceraSerie.setVisible(false);
		this.jInternalFrameDetalleFormCabeceraSerie.setSelected(false);						
		
		this.jInternalFrameDetalleFormCabeceraSerie.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCabeceraSerie.cabeceraserieLogic=this.cabeceraserieLogic;
		
		this.cargarCombosFrameForeignKeyCabeceraSerie("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCabeceraSerie();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCabeceraSerie();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCabeceraSerie("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCabeceraSerie();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCabeceraSerie.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCabeceraSerie"));
		
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonModificarCabeceraSerie.addActionListener(new ButtonActionListener(this,"ModificarCabeceraSerie"));

		
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonModificarToolBarCabeceraSerie.addActionListener(new ButtonActionListener(this,"ModificarToolBarCabeceraSerie"));
					
		this.jInternalFrameDetalleFormCabeceraSerie.jMenuItemModificarCabeceraSerie.addActionListener(new ButtonActionListener(this,"MenuItemModificarCabeceraSerie"));		
		
		
		
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonActualizarCabeceraSerie.addActionListener (new ButtonActionListener(this,"ActualizarCabeceraSerie"));
		
		
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonActualizarToolBarCabeceraSerie.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCabeceraSerie"));
						
		this.jInternalFrameDetalleFormCabeceraSerie.jMenuItemActualizarCabeceraSerie.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCabeceraSerie"));		
		
		
		
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonEliminarCabeceraSerie.addActionListener (new ButtonActionListener(this,"EliminarCabeceraSerie"));
		
		
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonEliminarToolBarCabeceraSerie.addActionListener (new ButtonActionListener(this,"EliminarToolBarCabeceraSerie"));
								
		this.jInternalFrameDetalleFormCabeceraSerie.jMenuItemEliminarCabeceraSerie.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCabeceraSerie"));		
		
		
		
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonCancelarCabeceraSerie.addActionListener (new ButtonActionListener(this,"CancelarCabeceraSerie"));
		
		
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonCancelarToolBarCabeceraSerie.addActionListener (new ButtonActionListener(this,"CancelarToolBarCabeceraSerie"));
					
		this.jInternalFrameDetalleFormCabeceraSerie.jMenuItemCancelarCabeceraSerie.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCabeceraSerie"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCabeceraSerie.jMenuItemDetalleCerrarCabeceraSerie.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCabeceraSerie"));		
		
		
		
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonGuardarCambiosToolBarCabeceraSerie.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCabeceraSerie"));
		
		
		
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonGuardarCambiosToolBarCabeceraSerie.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCabeceraSerie"));
		
		
		
		this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxTiposAccionesFormularioCabeceraSerie.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCabeceraSerie"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonidCabeceraSerieBusqueda.addActionListener(new ButtonActionListener(this,"idCabeceraSerieBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonid_empresaCabeceraSerieUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCabeceraSerieUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonid_empresaCabeceraSerieBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCabeceraSerieBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonnombreCabeceraSerieBusqueda.addActionListener(new ButtonActionListener(this,"nombreCabeceraSerieBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonformulaCabeceraSerieBusqueda.addActionListener(new ButtonActionListener(this,"formulaCabeceraSerieBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCabeceraSerie.jButtoncon_formulaCabeceraSerieBusqueda.addActionListener(new ButtonActionListener(this,"con_formulaCabeceraSerieBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCabeceraSerie.jButtoncon_totalizarCabeceraSerieBusqueda.addActionListener(new ButtonActionListener(this,"con_totalizarCabeceraSerieBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCabeceraSerie.jTabbedPaneRelacionesCabeceraSerie.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCabeceraSerie"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCabeceraSerie"));
		
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCabeceraSerie.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCabeceraSerie"));
		}
		
		this.jTableDatosCabeceraSerie.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCabeceraSerie"));
		
		this.jTableDatosCabeceraSerie.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCabeceraSerie"));
		
		this.jButtonNuevoCabeceraSerie.addActionListener(new ButtonActionListener(this,"NuevoCabeceraSerie"));
		
		this.jButtonDuplicarCabeceraSerie.addActionListener(new ButtonActionListener(this,"DuplicarCabeceraSerie"));
		
		this.jButtonCopiarCabeceraSerie.addActionListener(new ButtonActionListener(this,"CopiarCabeceraSerie"));
		
		this.jButtonVerFormCabeceraSerie.addActionListener(new ButtonActionListener(this,"VerFormCabeceraSerie"));
		
		
		this.jButtonNuevoToolBarCabeceraSerie.addActionListener(new ButtonActionListener(this,"NuevoToolBarCabeceraSerie"));
			
		this.jButtonDuplicarToolBarCabeceraSerie.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCabeceraSerie"));
			
		this.jMenuItemNuevoCabeceraSerie.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCabeceraSerie"));
			
		this.jMenuItemDuplicarCabeceraSerie.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCabeceraSerie"));		
		
		
		this.jButtonNuevoRelacionesCabeceraSerie.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCabeceraSerie"));
		
		
		this.jButtonNuevoRelacionesToolBarCabeceraSerie.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCabeceraSerie"));
			
		this.jMenuItemNuevoRelacionesCabeceraSerie.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCabeceraSerie"));		
		
		
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonModificarCabeceraSerie.addActionListener(new ButtonActionListener(this,"ModificarCabeceraSerie"));
		}
		
		
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonModificarToolBarCabeceraSerie.addActionListener(new ButtonActionListener(this,"ModificarToolBarCabeceraSerie"));
			
			this.jInternalFrameDetalleFormCabeceraSerie.jMenuItemModificarCabeceraSerie.addActionListener(new ButtonActionListener(this,"MenuItemModificarCabeceraSerie"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonActualizarCabeceraSerie.addActionListener (new ButtonActionListener(this,"ActualizarCabeceraSerie"));
		}
		
		
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonActualizarToolBarCabeceraSerie.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCabeceraSerie"));
				
			this.jInternalFrameDetalleFormCabeceraSerie.jMenuItemActualizarCabeceraSerie.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCabeceraSerie"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonEliminarCabeceraSerie.addActionListener (new ButtonActionListener(this,"EliminarCabeceraSerie"));
		}
		
		
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonEliminarToolBarCabeceraSerie.addActionListener (new ButtonActionListener(this,"EliminarToolBarCabeceraSerie"));
						
			this.jInternalFrameDetalleFormCabeceraSerie.jMenuItemEliminarCabeceraSerie.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCabeceraSerie"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonCancelarCabeceraSerie.addActionListener (new ButtonActionListener(this,"CancelarCabeceraSerie"));
		}
		
		
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonCancelarToolBarCabeceraSerie.addActionListener (new ButtonActionListener(this,"CancelarToolBarCabeceraSerie"));
			
			this.jInternalFrameDetalleFormCabeceraSerie.jMenuItemCancelarCabeceraSerie.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCabeceraSerie"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCabeceraSerie.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCabeceraSerie"));		
		
		
		this.jButtonCerrarCabeceraSerie.addActionListener (new ButtonActionListener(this,"CerrarCabeceraSerie"));
		
		
		this.jButtonCerrarToolBarCabeceraSerie.addActionListener (new ButtonActionListener(this,"CerrarToolBarCabeceraSerie"));
			
		this.jMenuItemCerrarCabeceraSerie.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCabeceraSerie"));
			
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCabeceraSerie.jMenuItemDetalleCerrarCabeceraSerie.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCabeceraSerie"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonGuardarCambiosCabeceraSerie.addActionListener (new ButtonActionListener(this,"GuardarCambiosCabeceraSerie"));
		}
		
		
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCabeceraSerie.jButtonGuardarCambiosToolBarCabeceraSerie.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCabeceraSerie"));
		}
		
		this.jButtonCopiarToolBarCabeceraSerie.addActionListener (new ButtonActionListener(this,"CopiarToolBarCabeceraSerie"));
			
		this.jButtonVerFormToolBarCabeceraSerie.addActionListener (new ButtonActionListener(this,"VerFormToolBarCabeceraSerie"));
		
		this.jMenuItemGuardarCambiosCabeceraSerie.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCabeceraSerie"));
			
		this.jMenuItemCopiarCabeceraSerie.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCabeceraSerie"));		
		
		this.jMenuItemVerFormCabeceraSerie.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCabeceraSerie"));		
		
		
		this.jButtonGuardarCambiosTablaCabeceraSerie.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCabeceraSerie"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCabeceraSerie.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCabeceraSerie"));
			
		this.jMenuItemGuardarCambiosTablaCabeceraSerie.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCabeceraSerie"));		
		
		
		
		this.jButtonRecargarInformacionCabeceraSerie.addActionListener (new ButtonActionListener(this,"RecargarInformacionCabeceraSerie"));
					
		this.jButtonRecargarInformacionToolBarCabeceraSerie.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCabeceraSerie"));
		
		this.jMenuItemRecargarInformacionCabeceraSerie.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCabeceraSerie"));		
		
		
		
		this.jButtonAnterioresCabeceraSerie.addActionListener (new ButtonActionListener(this,"AnterioresCabeceraSerie"));
		
		
		this.jButtonAnterioresToolBarCabeceraSerie.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCabeceraSerie"));
		
		this.jMenuItemAnterioresCabeceraSerie.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCabeceraSerie"));		
		
		
		this.jButtonSiguientesCabeceraSerie.addActionListener (new ButtonActionListener(this,"SiguientesCabeceraSerie"));
		
		
		this.jButtonSiguientesToolBarCabeceraSerie.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCabeceraSerie"));
			
		this.jMenuItemSiguientesCabeceraSerie.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCabeceraSerie"));
			
		this.jMenuItemAbrirOrderByCabeceraSerie.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCabeceraSerie"));
			
		this.jMenuItemMostrarOcultarCabeceraSerie.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCabeceraSerie"));
			
		this.jMenuItemDetalleAbrirOrderByCabeceraSerie.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCabeceraSerie"));
			
		this.jMenuItemDetalleMostarOcultarCabeceraSerie.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCabeceraSerie"));		
		
		
		this.jButtonNuevoGuardarCambiosCabeceraSerie.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCabeceraSerie"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCabeceraSerie.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCabeceraSerie"));
			
		this.jMenuItemNuevoGuardarCambiosCabeceraSerie.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCabeceraSerie"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCabeceraSerie.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCabeceraSerie"));

		this.jCheckBoxSeleccionadosCabeceraSerie.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCabeceraSerie"));
		
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxTiposAccionesFormularioCabeceraSerie.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCabeceraSerie"));
		}
		
		
		this.jComboBoxTiposRelacionesCabeceraSerie.addActionListener (new ButtonActionListener(this,"TiposRelacionesCabeceraSerie"));
			
		this.jComboBoxTiposAccionesCabeceraSerie.addActionListener (new ButtonActionListener(this,"TiposAccionesCabeceraSerie"));
					
		this.jComboBoxTiposSeleccionarCabeceraSerie.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCabeceraSerie"));
			
		this.jTextFieldValorCampoGeneralCabeceraSerie.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCabeceraSerie"));		
		
		
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonidCabeceraSerieBusqueda.addActionListener(new ButtonActionListener(this,"idCabeceraSerieBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonid_empresaCabeceraSerieUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCabeceraSerieUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonid_empresaCabeceraSerieBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCabeceraSerieBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonnombreCabeceraSerieBusqueda.addActionListener(new ButtonActionListener(this,"nombreCabeceraSerieBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonformulaCabeceraSerieBusqueda.addActionListener(new ButtonActionListener(this,"formulaCabeceraSerieBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCabeceraSerie.jButtoncon_formulaCabeceraSerieBusqueda.addActionListener(new ButtonActionListener(this,"con_formulaCabeceraSerieBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCabeceraSerie.jButtoncon_totalizarCabeceraSerieBusqueda.addActionListener(new ButtonActionListener(this,"con_totalizarCabeceraSerieBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreCabeceraSerie.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreCabeceraSerie"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCabeceraSerie!=null) {
				this.jInternalFrameReporteDinamicoCabeceraSerie.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCabeceraSerie"));
				this.jInternalFrameReporteDinamicoCabeceraSerie.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCabeceraSerie"));
				this.jInternalFrameReporteDinamicoCabeceraSerie.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCabeceraSerie"));
			}
			
			//this.jButtonCerrarReporteDinamicoCabeceraSerie.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCabeceraSerie"));				
			//this.jButtonGenerarReporteDinamicoCabeceraSerie.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCabeceraSerie"));
			//this.jButtonGenerarExcelReporteDinamicoCabeceraSerie.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCabeceraSerie"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCabeceraSerie!=null) {
				this.jInternalFrameImportacionCabeceraSerie.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCabeceraSerie"));
				this.jInternalFrameImportacionCabeceraSerie.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCabeceraSerie"));
				this.jInternalFrameImportacionCabeceraSerie.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCabeceraSerie"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCabeceraSerie.addActionListener (new ButtonActionListener(this,"AbrirOrderByCabeceraSerie"));
			
			this.jButtonAbrirOrderByToolBarCabeceraSerie.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCabeceraSerie"));			
			
			if(this.jInternalFrameOrderByCabeceraSerie!=null) {
				this.jInternalFrameOrderByCabeceraSerie.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCabeceraSerie"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCabeceraSerie!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCabeceraSerie.jTabbedPaneRelacionesCabeceraSerie.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCabeceraSerie"));
		
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
            		closingInternalFrameCabeceraSerie();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCabeceraSerie.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCabeceraSerie = (JInternalFrameBase)event.getSource();
	            	
	            CabeceraSerieBeanSwingJInternalFrame jInternalFrameParent=(CabeceraSerieBeanSwingJInternalFrame)jInternalFrameDetalleFormCabeceraSerie.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCabeceraSerieActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCabeceraSerie.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCabeceraSerieListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCabeceraSerie.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCabeceraSerie.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCabeceraSerieActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCabeceraSerieActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCabeceraSerieActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCabeceraSerie";
		inputMap = this.jButtonNuevoCabeceraSerie.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCabeceraSerie.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCabeceraSerieActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCabeceraSerieActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCabeceraSerieActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCabeceraSerieActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCabeceraSerie";
		inputMap = this.jButtonNuevoRelacionesCabeceraSerie.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCabeceraSerie.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCabeceraSerieActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCabeceraSerie";
		inputMap = this.jButtonModificarCabeceraSerie.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCabeceraSerie.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCabeceraSerieActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCabeceraSerie";
		inputMap = this.jButtonActualizarCabeceraSerie.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCabeceraSerie.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCabeceraSerieActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCabeceraSerie";
		inputMap = this.jButtonEliminarCabeceraSerie.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCabeceraSerie.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCabeceraSerieActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCabeceraSerie";
		inputMap = this.jButtonCancelarCabeceraSerie.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCabeceraSerie.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCabeceraSerieActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCabeceraSerie";
		inputMap = this.jButtonCerrarCabeceraSerie.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCabeceraSerie.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCabeceraSerieActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonGuardarCambiosCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCabeceraSerie";
		inputMap = this.jInternalFrameDetalleFormCabeceraSerie.jButtonGuardarCambiosCabeceraSerie.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonGuardarCambiosCabeceraSerie.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCabeceraSerieActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCabeceraSerie.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCabeceraSerieItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCabeceraSerie.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCabeceraSerieActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCabeceraSerie.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCabeceraSerieActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCabeceraSerie.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCabeceraSerieActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonidCabeceraSerieBusqueda.addActionListener(new ButtonActionListener(this,"idCabeceraSerieBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonid_empresaCabeceraSerieUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCabeceraSerieUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonid_empresaCabeceraSerieBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCabeceraSerieBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonnombreCabeceraSerieBusqueda.addActionListener(new ButtonActionListener(this,"nombreCabeceraSerieBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCabeceraSerie.jButtonformulaCabeceraSerieBusqueda.addActionListener(new ButtonActionListener(this,"formulaCabeceraSerieBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCabeceraSerie.jButtoncon_formulaCabeceraSerieBusqueda.addActionListener(new ButtonActionListener(this,"con_formulaCabeceraSerieBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCabeceraSerie.jButtoncon_totalizarCabeceraSerieBusqueda.addActionListener(new ButtonActionListener(this,"con_totalizarCabeceraSerieBusqueda"));
		
		
		this.jButtonBusquedaPorNombreCabeceraSerie.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreCabeceraSerie"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCabeceraSerie.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCabeceraSerieActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCabeceraSerieActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCabeceraSerie.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCabeceraSerie(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CabeceraSerie cabeceraserieAux:this.cabeceraserieLogic.getCabeceraSeries()) {
					cabeceraserieAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CabeceraSerie cabeceraserieAux:cabeceraseries) {
					cabeceraserieAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCabeceraSerieItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCabeceraSerie(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CabeceraSerie cabeceraserieAux:this.cabeceraserieLogic.getCabeceraSeries()) {
						cabeceraserieAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CabeceraSerie cabeceraserieAux:cabeceraseries) {
						cabeceraserieAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CabeceraSerie cabeceraserieAux:this.cabeceraserieLogic.getCabeceraSeries()) {
					
						if(sTipoSeleccionar.equals(CabeceraSerieConstantesFunciones.LABEL_CONFORMULA)) {
							existe=true;
							cabeceraserieAux.setcon_formula(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CabeceraSerieConstantesFunciones.LABEL_CONTOTALIZAR)) {
							existe=true;
							cabeceraserieAux.setcon_totalizar(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CabeceraSerie cabeceraserieAux:cabeceraseries) {
						
						if(sTipoSeleccionar.equals(CabeceraSerieConstantesFunciones.LABEL_CONFORMULA)) {
							existe=true;
							cabeceraserieAux.setcon_formula(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CabeceraSerieConstantesFunciones.LABEL_CONTOTALIZAR)) {
							existe=true;
							cabeceraserieAux.setcon_totalizar(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCabeceraSerie(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCabeceraSerie.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCabeceraSerie.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCabeceraSerie,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCabeceraSerieItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCabeceraSerie(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCabeceraSerie.getSelectedRows();
			
			CabeceraSerie cabeceraserieLocal=new CabeceraSerie();
			
			//this.seleccionarTodosCabeceraSerie(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cabeceraserieLocal =(CabeceraSerie) this.cabeceraserieLogic.getCabeceraSeries().toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cabeceraserieLocal =(CabeceraSerie) this.cabeceraseries.toArray()[this.jTableDatosCabeceraSerie.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cabeceraserieLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CabeceraSerie cabeceraserieAux:this.cabeceraserieLogic.getCabeceraSeries()) {
						cabeceraserieAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CabeceraSerie cabeceraserieAux:cabeceraseries) {
						cabeceraserieAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCabeceraSerie(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCabeceraSerie.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCabeceraSerie.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCabeceraSerie,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCabeceraSerieItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCabeceraSerieParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCabeceraSerieActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCabeceraSerie(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCabeceraSerie.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CabeceraSerie cabeceraserieAux:this.cabeceraserieLogic.getCabeceraSeries()) {
				
						if(sTipoSeleccionar.equals(CabeceraSerieConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cabeceraserieAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CabeceraSerieConstantesFunciones.LABEL_FORMULA)) {
							existe=true;
							cabeceraserieAux.setformula(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CabeceraSerie cabeceraserieAux:cabeceraseries) {
					
						if(sTipoSeleccionar.equals(CabeceraSerieConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cabeceraserieAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CabeceraSerieConstantesFunciones.LABEL_FORMULA)) {
							existe=true;
							cabeceraserieAux.setformula(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCabeceraSerie(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCabeceraSerieActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCabeceraSerie(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCabeceraSerie=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCabeceraSerie.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxTiposAccionesFormularioCabeceraSerie.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCabeceraSerie) {				
					conSplash=true;//false;										
					
					//this.startProcessCabeceraSerie(conSplash);
				
					this.generarReporteCabeceraSeriesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCabeceraSerie.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxTiposAccionesFormularioCabeceraSerie.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCabeceraSeriesSeleccionados();
				//this.jComboBoxTiposAccionesCabeceraSerie.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCabeceraSeriesSeleccionados(false);
				//this.jComboBoxTiposAccionesCabeceraSerie.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCabeceraSeriesSeleccionados(true);
				//this.jComboBoxTiposAccionesCabeceraSerie.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCabeceraSerie();
				
				this.exportarCabeceraSeriesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCabeceraSerie.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxTiposAccionesFormularioCabeceraSerie.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCabeceraSeries();
				//this.importarCabeceraSeries();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCabeceraSerie.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxTiposAccionesFormularioCabeceraSerie.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCabeceraSerie();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCabeceraSeriesSeleccionados();
				//this.jComboBoxTiposAccionesCabeceraSerie.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cabecera Serie", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCabeceraSerie();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCabeceraSerie)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCabeceraSerie(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cabecera Serie",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCabeceraSerie.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxTiposAccionesFormularioCabeceraSerie.setSelectedIndex(0);					
				}	
			} 			
			else if(CabeceraSerieBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCabeceraSerie) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCabeceraSerie(conSplash);
					
						//this.actualizarParametrosGeneralCabeceraSerie();
						
						this.generarReporteProcesoAccionCabeceraSeriesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCabeceraSerie.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxTiposAccionesFormularioCabeceraSerie.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CabeceraSerieBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cabecera SerieES SELECCIONADOS?", "MANTENIMIENTO DE Cabecera Serie", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCabeceraSerie();
				
						this.actualizarParametrosGeneralCabeceraSerie();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cabeceraserieReturnGeneral=cabeceraserieLogic.procesarAccionCabeceraSeriesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cabeceraserieLogic.getCabeceraSeries(),this.cabeceraserieParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCabeceraSerieReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCabeceraSerie.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxTiposAccionesFormularioCabeceraSerie.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCabeceraSerie();
					
					CabeceraSerieBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCabeceraSerieReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCabeceraSerie.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxTiposAccionesFormularioCabeceraSerie.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCabeceraSerie(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCabeceraSerieActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCabeceraSerie();
			
			if(this.jInternalFrameDetalleFormCabeceraSerie==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CabeceraSerie> cabeceraseriesSeleccionados=new ArrayList<CabeceraSerie>();		
			CabeceraSerie cabeceraserie=new CabeceraSerie();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCabeceraSerie(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCabeceraSerie.getSelectedItem();
			
			
			
			
			cabeceraseriesSeleccionados=this.getCabeceraSeriesSeleccionados(true);
			//this.sTipoAccion;
			
			if(cabeceraseriesSeleccionados.size()==1) {
				for(CabeceraSerie cabeceraserieAux:cabeceraseriesSeleccionados) {
					cabeceraserie=cabeceraserieAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCabeceraSerie();
			
      		//this.finishProcessCabeceraSerie(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCabeceraSerieReturnGeneral() throws Exception {
		if(this.cabeceraserieReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cabeceraserieReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cabeceraserieReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cabeceraserieReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cabeceraserieReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cabeceraserieReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCabeceraSerie(false);
		}
		
		if(this.cabeceraserieReturnGeneral.getConRetornoLista() || this.cabeceraserieReturnGeneral.getConRetornoObjeto()) {
			if(this.cabeceraserieReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cabeceraserieLogic.setCabeceraSeries(this.cabeceraserieReturnGeneral.getCabeceraSeries());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cabeceraserieReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cabeceraserieLogic.setCabeceraSerie(this.cabeceraserieReturnGeneral.getCabeceraSerie());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCabeceraSerie(false);
		}
	}
	
	public void actualizarParametrosGeneralCabeceraSerie() throws Exception {
		
		
	}
	
	public ArrayList<CabeceraSerie> getCabeceraSeriesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CabeceraSerie> cabeceraseriesSeleccionados=new ArrayList<CabeceraSerie>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCabeceraSerie) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CabeceraSerie cabeceraserieAux:cabeceraserieLogic.getCabeceraSeries()) {
					if(cabeceraserieAux.getIsSelected()) {
						cabeceraseriesSeleccionados.add(cabeceraserieAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CabeceraSerie cabeceraserieAux:this.cabeceraseries) {
					if(cabeceraserieAux.getIsSelected()) {
						cabeceraseriesSeleccionados.add(cabeceraserieAux);				
					}
				}
			}
			
			if(cabeceraseriesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cabeceraseriesSeleccionados.addAll(this.cabeceraserieLogic.getCabeceraSeries());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cabeceraseriesSeleccionados.addAll(this.cabeceraseries);				
					}
				}
			}
		} else {
			cabeceraseriesSeleccionados.add(this.cabeceraserie);
		}
		
		return cabeceraseriesSeleccionados;
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
	
	public void generarReporteCabeceraSeriesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCabeceraSeriesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCabeceraSeriesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCabeceraSeriesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCabeceraSeriesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cabecera Serie",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCabeceraSeriesSeleccionados() throws Exception {
		ArrayList<CabeceraSerie> cabeceraseriesSeleccionados=new ArrayList<CabeceraSerie>();		
		
		cabeceraseriesSeleccionados=this.getCabeceraSeriesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCabeceraSeries("Todos",cabeceraseriesSeleccionados);
		
	}	
	
	public void generarReporteNormalCabeceraSeriesSeleccionados() throws Exception {
		ArrayList<CabeceraSerie> cabeceraseriesSeleccionados=new ArrayList<CabeceraSerie>();		
		
		cabeceraseriesSeleccionados=this.getCabeceraSeriesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCabeceraSeries("Todos",cabeceraseriesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCabeceraSeriesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CabeceraSerie> cabeceraseriesSeleccionados=new ArrayList<CabeceraSerie>();
		
		cabeceraseriesSeleccionados=this.getCabeceraSeriesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCabeceraSeries("Todos",cabeceraseriesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCabeceraSeriesSeleccionados() throws Exception {
		ArrayList<CabeceraSerie> cabeceraseriesSeleccionados=new ArrayList<CabeceraSerie>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCabeceraSerie();
		
		
		cabeceraseriesSeleccionados=this.getCabeceraSeriesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCabeceraSerie();
		
		
		//this.generarReporteCabeceraSeries("Todos",cabeceraseriesSeleccionados ,cabeceraserieImplementable,cabeceraserieImplementableHome);
	}
	
	public void mostrarImportacionCabeceraSeries() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCabeceraSerie();
		
		this.abrirFrameImportacionCabeceraSerie();		
		
			
		//this.generarReporteCabeceraSeries("Todos",cabeceraseriesSeleccionados ,cabeceraserieImplementable,cabeceraserieImplementableHome);
	}
	
	public void importarCabeceraSeries() throws Exception {		
	
	}
	
	public void exportarCabeceraSeriesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCabeceraSeriesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCabeceraSeriesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCabeceraSeriesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cabecera Serie",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCabeceraSeriesSeleccionados() throws Exception {
		ArrayList<CabeceraSerie> cabeceraseriesSeleccionados=new ArrayList<CabeceraSerie>();		
		
		cabeceraseriesSeleccionados=this.getCabeceraSeriesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cabeceraserie."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCabeceraSerie(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CabeceraSerie cabeceraserieAux:cabeceraseriesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCabeceraSerie(cabeceraserieAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cabeceraserieAux.setsDetalleGeneralEntityReporte(cabeceraserieAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cabecera Serie",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCabeceraSerie(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CabeceraSerieConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CabeceraSerieConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CabeceraSerieConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CabeceraSerieConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CabeceraSerieConstantesFunciones.LABEL_FORMULA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CabeceraSerieConstantesFunciones.LABEL_CONFORMULA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CabeceraSerieConstantesFunciones.LABEL_CONTOTALIZAR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCabeceraSerie(CabeceraSerie cabeceraserie,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cabeceraserie.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cabeceraserie.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cabeceraserie.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cabeceraserie.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cabeceraserie.getformula();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cabeceraserie.getcon_formula().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cabeceraserie.getcon_totalizar().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCabeceraSeriesSeleccionados() throws Exception {
		ArrayList<CabeceraSerie> cabeceraseriesSeleccionados=new ArrayList<CabeceraSerie>();		
		
		cabeceraseriesSeleccionados=this.getCabeceraSeriesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cabeceraserie.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CabeceraSeries");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCabeceraSerie(row);				
				iRow++;
			}				
			
			for(CabeceraSerie cabeceraserieAux:cabeceraseriesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCabeceraSerie(cabeceraserieAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cabecera Serie",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCabeceraSeriesSeleccionados() throws Exception {
		ArrayList<CabeceraSerie> cabeceraseriesSeleccionados=new ArrayList<CabeceraSerie>();		
		
		cabeceraseriesSeleccionados=this.getCabeceraSeriesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cabeceraserie.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cabeceraseries");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cabeceraserie");
			//elementRoot.appendChild(element);
		
			for(CabeceraSerie cabeceraserieAux:cabeceraseriesSeleccionados) {
				element = document.createElement("cabeceraserie");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCabeceraSerie(cabeceraserieAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cabecera Serie",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCabeceraSerie(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CabeceraSerieConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CabeceraSerieConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CabeceraSerieConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CabeceraSerieConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CabeceraSerieConstantesFunciones.LABEL_FORMULA);
		cell = row.createCell(iColumn++);cell.setCellValue(CabeceraSerieConstantesFunciones.LABEL_CONFORMULA);
		cell = row.createCell(iColumn++);cell.setCellValue(CabeceraSerieConstantesFunciones.LABEL_CONTOTALIZAR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCabeceraSerie(CabeceraSerie cabeceraserie,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cabeceraserie.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cabeceraserie.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cabeceraserie.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(cabeceraserie.getformula());
		cell = row.createCell(iColumn++);cell.setCellValue(cabeceraserie.getcon_formula());
		cell = row.createCell(iColumn++);cell.setCellValue(cabeceraserie.getcon_totalizar());				
	}
	
	public void setFilaDatosExportarXmlCabeceraSerie(CabeceraSerie cabeceraserie,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CabeceraSerieConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cabeceraserie.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CabeceraSerieConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cabeceraserie.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CabeceraSerieConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cabeceraserie.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(CabeceraSerieConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(cabeceraserie.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementformula = document.createElement(CabeceraSerieConstantesFunciones.FORMULA);
		elementformula.appendChild(document.createTextNode(cabeceraserie.getformula().trim()));
		element.appendChild(elementformula);

		Element elementcon_formula = document.createElement(CabeceraSerieConstantesFunciones.CONFORMULA);
		elementcon_formula.appendChild(document.createTextNode(cabeceraserie.getcon_formula().toString().trim()));
		element.appendChild(elementcon_formula);

		Element elementcon_totalizar = document.createElement(CabeceraSerieConstantesFunciones.CONTOTALIZAR);
		elementcon_totalizar.appendChild(document.createTextNode(cabeceraserie.getcon_totalizar().toString().trim()));
		element.appendChild(elementcon_totalizar);
	}
	
	public void generarReporteGroupGenericoCabeceraSeriesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CabeceraSerie> cabeceraseriesSeleccionados=new ArrayList<CabeceraSerie>();
		
		cabeceraseriesSeleccionados=this.getCabeceraSeriesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCabeceraSerie(cabeceraseriesSeleccionados);
		
		this.generarReporteCabeceraSeries("Todos",cabeceraseriesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCabeceraSerie(ArrayList<CabeceraSerie> cabeceraseriesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CabeceraSerie cabeceraserieAux:cabeceraseriesSeleccionados) {
				cabeceraserieAux.setsDetalleGeneralEntityReporte(cabeceraserieAux.toString());
			
				if(sTipoSeleccionar.equals(CabeceraSerieConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cabeceraserieAux.setsDescripcionGeneralEntityReporte1(cabeceraserieAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CabeceraSerieConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					cabeceraserieAux.setsDescripcionGeneralEntityReporte1(cabeceraserieAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(CabeceraSerieConstantesFunciones.LABEL_FORMULA)) {
					existe=true;
					cabeceraserieAux.setsDescripcionGeneralEntityReporte1(cabeceraserieAux.getformula());
				}
				 else if(sTipoSeleccionar.equals(CabeceraSerieConstantesFunciones.LABEL_CONFORMULA)) {
					existe=true;
					cabeceraserieAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(cabeceraserieAux.getcon_formula()));
				}
				 else if(sTipoSeleccionar.equals(CabeceraSerieConstantesFunciones.LABEL_CONTOTALIZAR)) {
					existe=true;
					cabeceraserieAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(cabeceraserieAux.getcon_totalizar()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CabeceraSerieConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCabeceraSerie(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCabeceraSerie=true;
				this.isVisibilidadCeldaNuevoRelacionesCabeceraSerie=true;
				this.isVisibilidadCeldaGuardarCambiosCabeceraSerie=true;
			}
			
			this.isVisibilidadCeldaModificarCabeceraSerie=false;
			this.isVisibilidadCeldaActualizarCabeceraSerie=false;
			this.isVisibilidadCeldaEliminarCabeceraSerie=false;
			this.isVisibilidadCeldaCancelarCabeceraSerie=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCabeceraSerie=true;
				} else {
					this.isVisibilidadCeldaGuardarCabeceraSerie=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCabeceraSerie=false;
			this.isVisibilidadCeldaNuevoRelacionesCabeceraSerie=false;
			this.isVisibilidadCeldaGuardarCambiosCabeceraSerie=false;
			this.isVisibilidadCeldaModificarCabeceraSerie=false;
			this.isVisibilidadCeldaActualizarCabeceraSerie=true;
			this.isVisibilidadCeldaEliminarCabeceraSerie=false;
			this.isVisibilidadCeldaCancelarCabeceraSerie=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCabeceraSerie=true;
				} else {
					this.isVisibilidadCeldaGuardarCabeceraSerie=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCabeceraSerie=false;
			this.isVisibilidadCeldaNuevoRelacionesCabeceraSerie=false;
			this.isVisibilidadCeldaGuardarCambiosCabeceraSerie=false;
			this.isVisibilidadCeldaModificarCabeceraSerie=false;
			this.isVisibilidadCeldaActualizarCabeceraSerie=true;
			this.isVisibilidadCeldaEliminarCabeceraSerie=true;
			this.isVisibilidadCeldaCancelarCabeceraSerie=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCabeceraSerie=true;
				} else {
					this.isVisibilidadCeldaGuardarCabeceraSerie=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCabeceraSerie=false;
			this.isVisibilidadCeldaNuevoRelacionesCabeceraSerie=false;
			this.isVisibilidadCeldaGuardarCambiosCabeceraSerie=false;
			this.isVisibilidadCeldaModificarCabeceraSerie=false;
			this.isVisibilidadCeldaActualizarCabeceraSerie=true;
			this.isVisibilidadCeldaEliminarCabeceraSerie=false;
			this.isVisibilidadCeldaCancelarCabeceraSerie=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCabeceraSerie=false;
				} else {
					this.isVisibilidadCeldaGuardarCabeceraSerie=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCabeceraSerie=true;
			this.isVisibilidadCeldaNuevoRelacionesCabeceraSerie=true;
			this.isVisibilidadCeldaGuardarCambiosCabeceraSerie=true;
			this.isVisibilidadCeldaModificarCabeceraSerie=false;
			this.isVisibilidadCeldaActualizarCabeceraSerie=false;
			this.isVisibilidadCeldaEliminarCabeceraSerie=false;
			this.isVisibilidadCeldaCancelarCabeceraSerie=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCabeceraSerie=true;
				} else {
					this.isVisibilidadCeldaGuardarCabeceraSerie=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCabeceraSerie=false;
			this.isVisibilidadCeldaNuevoRelacionesCabeceraSerie=false;
			this.isVisibilidadCeldaGuardarCambiosCabeceraSerie=false;
			this.isVisibilidadCeldaActualizarCabeceraSerie=false;
			this.isVisibilidadCeldaEliminarCabeceraSerie=false;
			this.isVisibilidadCeldaCancelarCabeceraSerie=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCabeceraSerie=false;
				} else {
					this.isVisibilidadCeldaGuardarCabeceraSerie=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCabeceraSerie=false;
			this.isVisibilidadCeldaNuevoRelacionesCabeceraSerie=false;
			this.isVisibilidadCeldaGuardarCambiosCabeceraSerie=false;
			this.isVisibilidadCeldaModificarCabeceraSerie=true;
			this.isVisibilidadCeldaActualizarCabeceraSerie=false;
			this.isVisibilidadCeldaEliminarCabeceraSerie=false;
			this.isVisibilidadCeldaCancelarCabeceraSerie=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCabeceraSerie=false;
				} else {
					this.isVisibilidadCeldaGuardarCabeceraSerie=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CabeceraSerieJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCabeceraSerie=true;
			this.isVisibilidadCeldaNuevoRelacionesCabeceraSerie=true;
			this.isVisibilidadCeldaGuardarCambiosCabeceraSerie=true;
		} else {
			this.actualizarEstadoPanelsCabeceraSerie(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCabeceraSerie=false;
			//this.isVisibilidadCeldaVerFormCabeceraSerie=false;
			this.isVisibilidadCeldaDuplicarCabeceraSerie=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cabeceraserieSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCabeceraSerie=false;
		} else {
			this.isVisibilidadCeldaNuevoCabeceraSerie=false;
			this.isVisibilidadCeldaGuardarCambiosCabeceraSerie=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cabeceraserieSessionBean.getEsGuardarRelacionado()) {
			if(!cabeceraserieSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCabeceraSerie=false;												
			}
			
			this.jButtonCerrarCabeceraSerie.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCabeceraSerie=false;
		}
		
		if(!this.permiteMantenimiento(this.cabeceraserie)) {
			this.isVisibilidadCeldaActualizarCabeceraSerie=false;
			this.isVisibilidadCeldaEliminarCabeceraSerie=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCabeceraSerie() {
	}
	
	public void actualizarEstadoPanelsCabeceraSerie(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCabeceraSerie!=null) {
				this.jScrollPanelDatosEdicionCabeceraSerie.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCabeceraSerie!=null) {
				this.jTabbedPaneBusquedasCabeceraSerie.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCabeceraSerie!=null) {
				this.jScrollPanelDatosCabeceraSerie.setVisible(true);
			}
			
			if(this.jPanelPaginacionCabeceraSerie!=null) {
				this.jPanelPaginacionCabeceraSerie.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCabeceraSerie!=null) {
				this.jPanelParametrosReportesCabeceraSerie.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCabeceraSerie!=null) {
				this.jScrollPanelDatosEdicionCabeceraSerie.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCabeceraSerie!=null) {
				this.jTabbedPaneBusquedasCabeceraSerie.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCabeceraSerie!=null) {
				this.jScrollPanelDatosCabeceraSerie.setVisible(false);
			}
			
			if(this.jPanelPaginacionCabeceraSerie!=null) {
				this.jPanelPaginacionCabeceraSerie.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCabeceraSerie!=null) {
				this.jPanelParametrosReportesCabeceraSerie.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCabeceraSerie!=null) {
				this.jScrollPanelDatosEdicionCabeceraSerie.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCabeceraSerie!=null) {
				this.jTabbedPaneBusquedasCabeceraSerie.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCabeceraSerie!=null) {
				this.jScrollPanelDatosCabeceraSerie.setVisible(false);
			}
			
			if(this.jPanelPaginacionCabeceraSerie!=null) {
				this.jPanelPaginacionCabeceraSerie.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCabeceraSerie!=null) {
				this.jPanelParametrosReportesCabeceraSerie.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCabeceraSerie!=null) {
				this.jScrollPanelDatosEdicionCabeceraSerie.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCabeceraSerie!=null) {
				this.jTabbedPaneBusquedasCabeceraSerie.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCabeceraSerie!=null) {
				this.jScrollPanelDatosCabeceraSerie.setVisible(false);
			}
			
			if(this.jPanelPaginacionCabeceraSerie!=null) {
				this.jPanelPaginacionCabeceraSerie.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCabeceraSerie!=null) {
				this.jPanelParametrosReportesCabeceraSerie.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCabeceraSerie!=null) {
				this.jScrollPanelDatosEdicionCabeceraSerie.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCabeceraSerie!=null) {
				this.jTabbedPaneBusquedasCabeceraSerie.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCabeceraSerie!=null) {
				this.jScrollPanelDatosCabeceraSerie.setVisible(true);
			}
			
			if(this.jPanelPaginacionCabeceraSerie!=null) {
				this.jPanelPaginacionCabeceraSerie.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCabeceraSerie!=null) {
				this.jPanelParametrosReportesCabeceraSerie.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCabeceraSerie!=null) {
				this.jScrollPanelDatosEdicionCabeceraSerie.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCabeceraSerie!=null) {
				this.jTabbedPaneBusquedasCabeceraSerie.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCabeceraSerie!=null) {
				this.jScrollPanelDatosCabeceraSerie.setVisible(true);
			}
			
			if(this.jPanelPaginacionCabeceraSerie!=null) {
				this.jPanelPaginacionCabeceraSerie.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCabeceraSerie!=null) {
				this.jPanelParametrosReportesCabeceraSerie.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCabeceraSerie!=null) {
				this.jScrollPanelDatosEdicionCabeceraSerie.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCabeceraSerie!=null) {
				this.jTabbedPaneBusquedasCabeceraSerie.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCabeceraSerie!=null) {
				this.jScrollPanelDatosCabeceraSerie.setVisible(true);
			}
			
			if(this.jPanelPaginacionCabeceraSerie!=null) {
				this.jPanelPaginacionCabeceraSerie.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCabeceraSerie!=null) {
				this.jPanelParametrosReportesCabeceraSerie.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCabeceraSerie!=null) {
					this.jTabbedPaneBusquedasCabeceraSerie.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCabeceraSerie!=null) {
				this.jPanelParametrosReportesCabeceraSerie.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCabeceraSerie!=null) {
				this.jTabbedPaneBusquedasCabeceraSerie.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCabeceraSerie!=null) {
				this.jPanelParametrosReportesCabeceraSerie.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasCabeceraSerie.remove(jPanelBusquedaPorNombreCabeceraSerie);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CabeceraSerieSessionBean cabeceraserieSessionBean=new CabeceraSerieSessionBean();
		
		if(this.cabeceraserieSessionBean==null) {
			this.cabeceraserieSessionBean=new CabeceraSerieSessionBean();
		}
		
		this.cabeceraserieSessionBean.setsUltimaBusquedaCabeceraSerie(this.getsAccionBusqueda());
		this.cabeceraserieSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cabeceraserieSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			cabeceraserieSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			cabeceraserieSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CabeceraSerieSessionBean cabeceraserieSessionBean=new CabeceraSerieSessionBean();
		
		if(this.cabeceraserieSessionBean==null) {
			this.cabeceraserieSessionBean=new CabeceraSerieSessionBean();
		}
		
		if(this.cabeceraserieSessionBean.getsUltimaBusquedaCabeceraSerie()!=null&&!this.cabeceraserieSessionBean.getsUltimaBusquedaCabeceraSerie().equals("")) {
			this.setsAccionBusqueda(cabeceraserieSessionBean.getsUltimaBusquedaCabeceraSerie());
			this.setiNumeroPaginacion(cabeceraserieSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cabeceraserieSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(cabeceraserieSessionBean.getnombre());
				cabeceraserieSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(cabeceraserieSessionBean.getid_empresa());
				cabeceraserieSessionBean.setid_empresa(-1L);
			}
		}
		
		this.cabeceraserieSessionBean.setsUltimaBusquedaCabeceraSerie("");
		this.cabeceraserieSessionBean.setiNumeroPaginacion(CabeceraSerieConstantesFunciones.INUMEROPAGINACION);
		this.cabeceraserieSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCabeceraSerie(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCabeceraSerie() {
		this.updateBorderResaltarBusquedasFormularioCabeceraSerie();
		this.updateVisibilidadBusquedasFormularioCabeceraSerie();
		this.updateHabilitarBusquedasFormularioCabeceraSerie();
	}
	
	public void updateBorderResaltarBusquedasFormularioCabeceraSerie() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCabeceraSerie.getComponents().length>0) {
	

		if(this.cabeceraserieConstantesFunciones.resaltarBusquedaPorNombreCabeceraSerie!=null) {
			index= this.jTabbedPaneBusquedasCabeceraSerie.indexOfComponent(this.jPanelBusquedaPorNombreCabeceraSerie);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCabeceraSerie.getComponent(index);
				jPanel.setBorder(this.cabeceraserieConstantesFunciones.resaltarBusquedaPorNombreCabeceraSerie);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCabeceraSerie() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCabeceraSerie.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCabeceraSerie.indexOfComponent(this.jPanelBusquedaPorNombreCabeceraSerie);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCabeceraSerie.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cabeceraserieConstantesFunciones.mostrarBusquedaPorNombreCabeceraSerie);
			if(!this.cabeceraserieConstantesFunciones.mostrarBusquedaPorNombreCabeceraSerie && index>-1) {
				this.jTabbedPaneBusquedasCabeceraSerie.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCabeceraSerie() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCabeceraSerie.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCabeceraSerie.indexOfComponent(this.jPanelBusquedaPorNombreCabeceraSerie);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCabeceraSerie.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cabeceraserieConstantesFunciones.activarBusquedaPorNombreCabeceraSerie);
				this.jTabbedPaneBusquedasCabeceraSerie.setEnabledAt(index,this.cabeceraserieConstantesFunciones.activarBusquedaPorNombreCabeceraSerie);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCabeceraSerie(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasCabeceraSerie.indexOfComponent(this.jPanelBusquedaPorNombreCabeceraSerie);

			this.jTabbedPaneBusquedasCabeceraSerie.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCabeceraSerie.getComponent(index);

			this.cabeceraserieConstantesFunciones.setResaltarBusquedaPorNombreCabeceraSerie(resaltar);

			jPanel.setBorder(this.cabeceraserieConstantesFunciones.resaltarBusquedaPorNombreCabeceraSerie);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCabeceraSerie.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCabeceraSerie() throws Exception {

		if(this.jInternalFrameDetalleFormCabeceraSerie==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCabeceraSerie();
		this.updateVisibilidadResaltarControlesFormularioCabeceraSerie();
		this.updateHabilitarResaltarControlesFormularioCabeceraSerie();
		
	}
	
	public void updateBorderResaltarControlesFormularioCabeceraSerie() throws Exception {
		if(this.jInternalFrameDetalleFormCabeceraSerie==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cabeceraserieConstantesFunciones.resaltaridCabeceraSerie!=null && this.jInternalFrameDetalleFormCabeceraSerie!=null) {this.jInternalFrameDetalleFormCabeceraSerie.jLabelidCabeceraSerie.setBorder(this.cabeceraserieConstantesFunciones.resaltaridCabeceraSerie);}
		if(this.cabeceraserieConstantesFunciones.resaltarid_empresaCabeceraSerie!=null && this.jInternalFrameDetalleFormCabeceraSerie!=null) {this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxid_empresaCabeceraSerie.setBorder(this.cabeceraserieConstantesFunciones.resaltarid_empresaCabeceraSerie);}
		if(this.cabeceraserieConstantesFunciones.resaltarnombreCabeceraSerie!=null && this.jInternalFrameDetalleFormCabeceraSerie!=null) {this.jInternalFrameDetalleFormCabeceraSerie.jTextFieldnombreCabeceraSerie.setBorder(this.cabeceraserieConstantesFunciones.resaltarnombreCabeceraSerie);}
		if(this.cabeceraserieConstantesFunciones.resaltarformulaCabeceraSerie!=null && this.jInternalFrameDetalleFormCabeceraSerie!=null) {this.jInternalFrameDetalleFormCabeceraSerie.jTextAreaformulaCabeceraSerie.setBorder(this.cabeceraserieConstantesFunciones.resaltarformulaCabeceraSerie);}
		if(this.cabeceraserieConstantesFunciones.resaltarcon_formulaCabeceraSerie!=null && this.jInternalFrameDetalleFormCabeceraSerie!=null) {this.jInternalFrameDetalleFormCabeceraSerie.jCheckBoxcon_formulaCabeceraSerie.setBorderPainted(true);this.jInternalFrameDetalleFormCabeceraSerie.jCheckBoxcon_formulaCabeceraSerie.setBorder(this.cabeceraserieConstantesFunciones.resaltarcon_formulaCabeceraSerie);}
		if(this.cabeceraserieConstantesFunciones.resaltarcon_totalizarCabeceraSerie!=null && this.jInternalFrameDetalleFormCabeceraSerie!=null) {this.jInternalFrameDetalleFormCabeceraSerie.jCheckBoxcon_totalizarCabeceraSerie.setBorderPainted(true);this.jInternalFrameDetalleFormCabeceraSerie.jCheckBoxcon_totalizarCabeceraSerie.setBorder(this.cabeceraserieConstantesFunciones.resaltarcon_totalizarCabeceraSerie);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCabeceraSerie() throws Exception {		
		if(this.jInternalFrameDetalleFormCabeceraSerie==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) {
	
		//this.jInternalFrameDetalleFormCabeceraSerie.jLabelidCabeceraSerie.setVisible(this.cabeceraserieConstantesFunciones.mostraridCabeceraSerie);
		this.jInternalFrameDetalleFormCabeceraSerie.jPanelidCabeceraSerie.setVisible(this.cabeceraserieConstantesFunciones.mostraridCabeceraSerie);
		//this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxid_empresaCabeceraSerie.setVisible(this.cabeceraserieConstantesFunciones.mostrarid_empresaCabeceraSerie);
		this.jInternalFrameDetalleFormCabeceraSerie.jPanelid_empresaCabeceraSerie.setVisible(this.cabeceraserieConstantesFunciones.mostrarid_empresaCabeceraSerie);
		//this.jInternalFrameDetalleFormCabeceraSerie.jTextFieldnombreCabeceraSerie.setVisible(this.cabeceraserieConstantesFunciones.mostrarnombreCabeceraSerie);
		this.jInternalFrameDetalleFormCabeceraSerie.jPanelnombreCabeceraSerie.setVisible(this.cabeceraserieConstantesFunciones.mostrarnombreCabeceraSerie);
		//this.jInternalFrameDetalleFormCabeceraSerie.jTextAreaformulaCabeceraSerie.setVisible(this.cabeceraserieConstantesFunciones.mostrarformulaCabeceraSerie);
		this.jInternalFrameDetalleFormCabeceraSerie.jPanelformulaCabeceraSerie.setVisible(this.cabeceraserieConstantesFunciones.mostrarformulaCabeceraSerie);
		//this.jInternalFrameDetalleFormCabeceraSerie.jCheckBoxcon_formulaCabeceraSerie.setVisible(this.cabeceraserieConstantesFunciones.mostrarcon_formulaCabeceraSerie);
		this.jInternalFrameDetalleFormCabeceraSerie.jPanelcon_formulaCabeceraSerie.setVisible(this.cabeceraserieConstantesFunciones.mostrarcon_formulaCabeceraSerie);
		//this.jInternalFrameDetalleFormCabeceraSerie.jCheckBoxcon_totalizarCabeceraSerie.setVisible(this.cabeceraserieConstantesFunciones.mostrarcon_totalizarCabeceraSerie);
		this.jInternalFrameDetalleFormCabeceraSerie.jPanelcon_totalizarCabeceraSerie.setVisible(this.cabeceraserieConstantesFunciones.mostrarcon_totalizarCabeceraSerie);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCabeceraSerie() throws Exception {
		if(this.jInternalFrameDetalleFormCabeceraSerie==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCabeceraSerie!=null) {
	
		this.jInternalFrameDetalleFormCabeceraSerie.jLabelidCabeceraSerie.setEnabled(this.cabeceraserieConstantesFunciones.activaridCabeceraSerie);
		this.jInternalFrameDetalleFormCabeceraSerie.jComboBoxid_empresaCabeceraSerie.setEnabled(this.cabeceraserieConstantesFunciones.activarid_empresaCabeceraSerie);
		this.jInternalFrameDetalleFormCabeceraSerie.jTextFieldnombreCabeceraSerie.setEnabled(this.cabeceraserieConstantesFunciones.activarnombreCabeceraSerie);
		this.jInternalFrameDetalleFormCabeceraSerie.jTextAreaformulaCabeceraSerie.setEnabled(this.cabeceraserieConstantesFunciones.activarformulaCabeceraSerie);
		this.jInternalFrameDetalleFormCabeceraSerie.jCheckBoxcon_formulaCabeceraSerie.setEnabled(this.cabeceraserieConstantesFunciones.activarcon_formulaCabeceraSerie);
		this.jInternalFrameDetalleFormCabeceraSerie.jCheckBoxcon_totalizarCabeceraSerie.setEnabled(this.cabeceraserieConstantesFunciones.activarcon_totalizarCabeceraSerie);
		}
	}
	
		
}