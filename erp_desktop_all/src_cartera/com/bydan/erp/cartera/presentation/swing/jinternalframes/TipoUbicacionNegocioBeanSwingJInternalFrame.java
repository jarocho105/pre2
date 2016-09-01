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

import com.bydan.erp.cartera.util.TipoUbicacionNegocioConstantesFunciones;
import com.bydan.erp.cartera.util.TipoUbicacionNegocioParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoUbicacionNegocioParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoUbicacionNegocioBean;
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
public class TipoUbicacionNegocioBeanSwingJInternalFrame extends TipoUbicacionNegocioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoUbicacionNegocioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoUbicacionNegocio> tipoubicacionnegocioValidator = new ClassValidator<TipoUbicacionNegocio>(TipoUbicacionNegocio.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoUbicacionNegocio tipoubicacionnegocio;	
	public TipoUbicacionNegocio tipoubicacionnegocioAux;
	public TipoUbicacionNegocio tipoubicacionnegocioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoUbicacionNegocio tipoubicacionnegocioTotales;
	public Long idTipoUbicacionNegocioActual;
	public Long iIdNuevoTipoUbicacionNegocio=0L;
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
	
	public Boolean isPermisoTodoTipoUbicacionNegocio;
	public Boolean isPermisoNuevoTipoUbicacionNegocio;
	public Boolean isPermisoActualizarTipoUbicacionNegocio;
	public Boolean isPermisoActualizarOriginalTipoUbicacionNegocio;
	public Boolean isPermisoEliminarTipoUbicacionNegocio;
	public Boolean isPermisoGuardarCambiosTipoUbicacionNegocio;
	public Boolean isPermisoConsultaTipoUbicacionNegocio;
	public Boolean isPermisoBusquedaTipoUbicacionNegocio;
	public Boolean isPermisoReporteTipoUbicacionNegocio;
	public Boolean isPermisoPaginacionMedioTipoUbicacionNegocio;
	public Boolean isPermisoPaginacionAltoTipoUbicacionNegocio;
	public Boolean isPermisoPaginacionTodoTipoUbicacionNegocio;
	public Boolean isPermisoCopiarTipoUbicacionNegocio;
	public Boolean isPermisoVerFormTipoUbicacionNegocio;
	public Boolean isPermisoDuplicarTipoUbicacionNegocio;
	public Boolean isPermisoOrdenTipoUbicacionNegocio;
	
	
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
	
	public TipoUbicacionNegocioParameterReturnGeneral tipoubicacionnegocioReturnGeneral;
	public TipoUbicacionNegocioParameterReturnGeneral tipoubicacionnegocioParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoUbicacionNegocio=false;
	public Boolean esParaAccionDesdeFormularioTipoUbicacionNegocio=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoUbicacionNegocioLogic tipoubicacionnegocioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoUbicacionNegocio tipoubicacionnegocioBean;
	public TipoUbicacionNegocioConstantesFunciones tipoubicacionnegocioConstantesFunciones;
	//public TipoUbicacionNegocioParameterReturnGeneral tipoubicacionnegocioReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoUbicacionNegocio> tipoubicacionnegocios;	
	//public List<TipoUbicacionNegocio> tipoubicacionnegociosEliminados;
	//public List<TipoUbicacionNegocio> tipoubicacionnegociosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoUbicacionNegocio=false;
	public Boolean isVisibilidadCeldaDuplicarTipoUbicacionNegocio=true;
	public Boolean isVisibilidadCeldaCopiarTipoUbicacionNegocio=true;
	public Boolean isVisibilidadCeldaVerFormTipoUbicacionNegocio=true;
	public Boolean isVisibilidadCeldaOrdenTipoUbicacionNegocio=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio=false;
	public Boolean isVisibilidadCeldaModificarTipoUbicacionNegocio=false;
	public Boolean isVisibilidadCeldaActualizarTipoUbicacionNegocio=false;
	public Boolean isVisibilidadCeldaEliminarTipoUbicacionNegocio=false;
	public Boolean isVisibilidadCeldaCancelarTipoUbicacionNegocio=false;
	public Boolean isVisibilidadCeldaGuardarTipoUbicacionNegocio=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoUbicacionNegocio=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoUbicacionNegocio() {
		return this.iIdNuevoTipoUbicacionNegocio;
	}

	public void setiIdNuevoTipoUbicacionNegocio(Long iIdNuevoTipoUbicacionNegocio) {
		this.iIdNuevoTipoUbicacionNegocio = iIdNuevoTipoUbicacionNegocio;
	}
	
	public Long getidTipoUbicacionNegocioActual() {
		return this.idTipoUbicacionNegocioActual;
	}

	public void setidTipoUbicacionNegocioActual(Long idTipoUbicacionNegocioActual) {
		this.idTipoUbicacionNegocioActual = idTipoUbicacionNegocioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoUbicacionNegocio gettipoubicacionnegocio() {
		return this.tipoubicacionnegocio;
	}

	public void settipoubicacionnegocio(TipoUbicacionNegocio tipoubicacionnegocio) {
		this.tipoubicacionnegocio = tipoubicacionnegocio;
	}
	
	public TipoUbicacionNegocio gettipoubicacionnegocioAux() {
		return this.tipoubicacionnegocioAux;
	}

	public void settipoubicacionnegocioAux(TipoUbicacionNegocio tipoubicacionnegocioAux) {
		this.tipoubicacionnegocioAux = tipoubicacionnegocioAux;
	}				
	
	public TipoUbicacionNegocio gettipoubicacionnegocioAnterior() {
		return this.tipoubicacionnegocioAnterior;
	}

	public void settipoubicacionnegocioAnterior(TipoUbicacionNegocio tipoubicacionnegocioAnterior) {
		this.tipoubicacionnegocioAnterior = tipoubicacionnegocioAnterior;
	}	
	
	public TipoUbicacionNegocio gettipoubicacionnegocioTotales() {
		return this.tipoubicacionnegocioTotales;
	}

	public void settipoubicacionnegocioTotales(TipoUbicacionNegocio tipoubicacionnegocioTotales) {
		this.tipoubicacionnegocioTotales = tipoubicacionnegocioTotales;
	}	
	
	public TipoUbicacionNegocio gettipoubicacionnegocioBean() {
		return this.tipoubicacionnegocioBean;
	}

	public void settipoubicacionnegocioBean(TipoUbicacionNegocio tipoubicacionnegocioBean) {
		this.tipoubicacionnegocioBean = tipoubicacionnegocioBean;
	}	
	
	public TipoUbicacionNegocioParameterReturnGeneral gettipoubicacionnegocioReturnGeneral() {
		return this.tipoubicacionnegocioReturnGeneral;
	}

	public void settipoubicacionnegocioReturnGeneral(TipoUbicacionNegocioParameterReturnGeneral tipoubicacionnegocioReturnGeneral) {
		this.tipoubicacionnegocioReturnGeneral = tipoubicacionnegocioReturnGeneral;
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
	
	
	public TipoUbicacionNegocioLogic getTipoUbicacionNegocioLogic()	{		
		return tipoubicacionnegocioLogic;
	}

	public void setTipoUbicacionNegocioLogic(TipoUbicacionNegocioLogic tipoubicacionnegocioLogic) {
		this.tipoubicacionnegocioLogic = tipoubicacionnegocioLogic;
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
	
	public Boolean getIsEsNuevoTipoUbicacionNegocio() {
		return isEsNuevoTipoUbicacionNegocio;
	}

	public void setIsEsNuevoTipoUbicacionNegocio(Boolean isEsNuevoTipoUbicacionNegocio) {
		this.isEsNuevoTipoUbicacionNegocio = isEsNuevoTipoUbicacionNegocio;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoUbicacionNegocio() {
		return esParaAccionDesdeFormularioTipoUbicacionNegocio;
	}
	
	public void setEsParaAccionDesdeFormularioTipoUbicacionNegocio(Boolean esParaAccionDesdeFormularioTipoUbicacionNegocio) {
		this.esParaAccionDesdeFormularioTipoUbicacionNegocio = esParaAccionDesdeFormularioTipoUbicacionNegocio;
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

			if(this.tipoubicacionnegocioSessionBean==null) {
				this.tipoubicacionnegocioSessionBean=new TipoUbicacionNegocioSessionBean();
			}

			if(!this.tipoubicacionnegocioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoubicacionnegocioSessionBean.getlidEmpresaActual());
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

					if(this.tipoubicacionnegocio!=null) {
						this.tipoubicacionnegocio.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {
						this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxid_empresaTipoUbicacionNegocio.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoUbicacionNegocio.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {
						if(this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxid_empresaTipoUbicacionNegocio.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxid_empresaTipoUbicacionNegocio.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoUbicacionNegocioGenerico)throws Exception
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
				jComboBoxid_empresaTipoUbicacionNegocioGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoUbicacionNegocioGenerico!=null && jComboBoxid_empresaTipoUbicacionNegocioGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoUbicacionNegocioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoUbicacionNegocio tipoubicacionnegocio,JComboBox jComboBoxid_empresaTipoUbicacionNegocioGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoUbicacionNegocioGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxid_empresaTipoUbicacionNegocio.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoUbicacionNegocioGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoubicacionnegocio.setid_empresa(empresaAux.getId());
				tipoubicacionnegocio.setempresa_descripcion(TipoUbicacionNegocioConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoubicacionnegocio.setEmpresa(empresaAux);			}
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

					if(!TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) { 
							this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxid_empresaTipoUbicacionNegocio.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxid_empresaTipoUbicacionNegocio.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) { 
					}

					if(!TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {
							this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxid_empresaTipoUbicacionNegocio.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {
							this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxid_empresaTipoUbicacionNegocio.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoUbicacionNegocio() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoUbicacionNegocioConstantesFunciones.refrescarForeignKeysDescripcionesTipoUbicacionNegocio(this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoUbicacionNegocioConstantesFunciones.refrescarForeignKeysDescripcionesTipoUbicacionNegocio(this.tipoubicacionnegocios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoubicacionnegocioLogic.setTipoUbicacionNegocios(this.tipoubicacionnegocios);
			tipoubicacionnegocioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoUbicacionNegocioParameterReturnGeneral getTipoUbicacionNegocioParameterGeneral() {
		return this.tipoubicacionnegocioParameterGeneral;
	}
	
	public void setTipoUbicacionNegocioParameterGeneral(TipoUbicacionNegocioParameterReturnGeneral tipoubicacionnegocioParameterGeneral) {
		this.tipoubicacionnegocioParameterGeneral = tipoubicacionnegocioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoUbicacionNegocio() {
		return isPermisoTodoTipoUbicacionNegocio;
	}

	public void setIsPermisoTodoTipoUbicacionNegocio(Boolean isPermisoTodoTipoUbicacionNegocio) {
		this.isPermisoTodoTipoUbicacionNegocio = isPermisoTodoTipoUbicacionNegocio;
	}

	public Boolean getIsPermisoNuevoTipoUbicacionNegocio() {
		return isPermisoNuevoTipoUbicacionNegocio;
	}

	public void setIsPermisoNuevoTipoUbicacionNegocio(Boolean isPermisoNuevoTipoUbicacionNegocio) {
		this.isPermisoNuevoTipoUbicacionNegocio = isPermisoNuevoTipoUbicacionNegocio;
	}

	public Boolean getIsPermisoActualizarTipoUbicacionNegocio() {
		return isPermisoActualizarTipoUbicacionNegocio;
	}

	public void setIsPermisoActualizarTipoUbicacionNegocio(Boolean isPermisoActualizarTipoUbicacionNegocio) {
		this.isPermisoActualizarTipoUbicacionNegocio = isPermisoActualizarTipoUbicacionNegocio;
	}

	public Boolean getIsPermisoEliminarTipoUbicacionNegocio() {
		return isPermisoEliminarTipoUbicacionNegocio;
	}

	public void setIsPermisoEliminarTipoUbicacionNegocio(Boolean isPermisoEliminarTipoUbicacionNegocio) {
		this.isPermisoEliminarTipoUbicacionNegocio = isPermisoEliminarTipoUbicacionNegocio;
	}

	public Boolean getIsPermisoGuardarCambiosTipoUbicacionNegocio() {
		return isPermisoGuardarCambiosTipoUbicacionNegocio;
	}

	public void setIsPermisoGuardarCambiosTipoUbicacionNegocio(Boolean isPermisoGuardarCambiosTipoUbicacionNegocio) {
		this.isPermisoGuardarCambiosTipoUbicacionNegocio = isPermisoGuardarCambiosTipoUbicacionNegocio;
	}
	
	public Boolean getIsPermisoConsultaTipoUbicacionNegocio() {
		return isPermisoConsultaTipoUbicacionNegocio;
	}

	public void setIsPermisoConsultaTipoUbicacionNegocio(Boolean isPermisoConsultaTipoUbicacionNegocio) {
		this.isPermisoConsultaTipoUbicacionNegocio = isPermisoConsultaTipoUbicacionNegocio;
	}

	public Boolean getIsPermisoBusquedaTipoUbicacionNegocio() {
		return isPermisoBusquedaTipoUbicacionNegocio;
	}

	public void setIsPermisoBusquedaTipoUbicacionNegocio(Boolean isPermisoBusquedaTipoUbicacionNegocio) {
		this.isPermisoBusquedaTipoUbicacionNegocio = isPermisoBusquedaTipoUbicacionNegocio;
	}

	public Boolean getIsPermisoReporteTipoUbicacionNegocio() {
		return isPermisoReporteTipoUbicacionNegocio;
	}

	public void setIsPermisoReporteTipoUbicacionNegocio(Boolean isPermisoReporteTipoUbicacionNegocio) {
		this.isPermisoReporteTipoUbicacionNegocio = isPermisoReporteTipoUbicacionNegocio;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoUbicacionNegocio() {
		return isPermisoPaginacionMedioTipoUbicacionNegocio;
	}

	public void setIsPermisoPaginacionMedioTipoUbicacionNegocio(Boolean isPermisoPaginacionMedioTipoUbicacionNegocio) {
		this.isPermisoPaginacionMedioTipoUbicacionNegocio = isPermisoPaginacionMedioTipoUbicacionNegocio;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoUbicacionNegocio() {
		return isPermisoPaginacionTodoTipoUbicacionNegocio;
	}

	public void setIsPermisoPaginacionTodoTipoUbicacionNegocio(Boolean isPermisoPaginacionTodoTipoUbicacionNegocio) {
		this.isPermisoPaginacionTodoTipoUbicacionNegocio = isPermisoPaginacionTodoTipoUbicacionNegocio;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoUbicacionNegocio() {
		return isPermisoPaginacionAltoTipoUbicacionNegocio;
	}

	public void setIsPermisoPaginacionAltoTipoUbicacionNegocio(Boolean isPermisoPaginacionAltoTipoUbicacionNegocio) {
		this.isPermisoPaginacionAltoTipoUbicacionNegocio = isPermisoPaginacionAltoTipoUbicacionNegocio;
	}
	
	public Boolean getIsPermisoCopiarTipoUbicacionNegocio() {
		return isPermisoCopiarTipoUbicacionNegocio;
	}

	public void setIsPermisoCopiarTipoUbicacionNegocio(Boolean isPermisoCopiarTipoUbicacionNegocio) {
		this.isPermisoCopiarTipoUbicacionNegocio = isPermisoCopiarTipoUbicacionNegocio;
	}
	
	public Boolean getIsPermisoVerFormTipoUbicacionNegocio() {
		return isPermisoVerFormTipoUbicacionNegocio;
	}

	public void setIsPermisoVerFormTipoUbicacionNegocio(Boolean isPermisoVerFormTipoUbicacionNegocio) {
		this.isPermisoVerFormTipoUbicacionNegocio = isPermisoVerFormTipoUbicacionNegocio;
	}
	
	public Boolean getIsPermisoDuplicarTipoUbicacionNegocio() {
		return isPermisoDuplicarTipoUbicacionNegocio;
	}

	public void setIsPermisoDuplicarTipoUbicacionNegocio(Boolean isPermisoDuplicarTipoUbicacionNegocio) {
		this.isPermisoDuplicarTipoUbicacionNegocio = isPermisoDuplicarTipoUbicacionNegocio;
	}
	
	public Boolean getIsPermisoOrdenTipoUbicacionNegocio() {
		return isPermisoOrdenTipoUbicacionNegocio;
	}

	public void setIsPermisoOrdenTipoUbicacionNegocio(Boolean isPermisoOrdenTipoUbicacionNegocio) {
		this.isPermisoOrdenTipoUbicacionNegocio = isPermisoOrdenTipoUbicacionNegocio;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoUbicacionNegocio() {
		return isVisibilidadCeldaNuevoTipoUbicacionNegocio;
	}

	public void setIsVisibilidadCeldaNuevoTipoUbicacionNegocio(Boolean isVisibilidadCeldaNuevoTipoUbicacionNegocio) {
		this.isVisibilidadCeldaNuevoTipoUbicacionNegocio = isVisibilidadCeldaNuevoTipoUbicacionNegocio;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoUbicacionNegocio() {
		return isVisibilidadCeldaDuplicarTipoUbicacionNegocio;
	}

	public void setIsVisibilidadCeldaDuplicarTipoUbicacionNegocio(Boolean isVisibilidadCeldaDuplicarTipoUbicacionNegocio) {
		this.isVisibilidadCeldaDuplicarTipoUbicacionNegocio = isVisibilidadCeldaDuplicarTipoUbicacionNegocio;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoUbicacionNegocio() {
		return isVisibilidadCeldaCopiarTipoUbicacionNegocio;
	}

	public void setIsVisibilidadCeldaCopiarTipoUbicacionNegocio(Boolean isVisibilidadCeldaCopiarTipoUbicacionNegocio) {
		this.isVisibilidadCeldaCopiarTipoUbicacionNegocio = isVisibilidadCeldaCopiarTipoUbicacionNegocio;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoUbicacionNegocio() {
		return isVisibilidadCeldaVerFormTipoUbicacionNegocio;
	}

	public void setIsVisibilidadCeldaVerFormTipoUbicacionNegocio(Boolean isVisibilidadCeldaVerFormTipoUbicacionNegocio) {
		this.isVisibilidadCeldaVerFormTipoUbicacionNegocio = isVisibilidadCeldaVerFormTipoUbicacionNegocio;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoUbicacionNegocio() {
		return isVisibilidadCeldaOrdenTipoUbicacionNegocio;
	}

	public void setIsVisibilidadCeldaOrdenTipoUbicacionNegocio(Boolean isVisibilidadCeldaOrdenTipoUbicacionNegocio) {
		this.isVisibilidadCeldaOrdenTipoUbicacionNegocio = isVisibilidadCeldaOrdenTipoUbicacionNegocio;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio() {
		return isVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio(Boolean isVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio) {
		this.isVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio = isVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoUbicacionNegocio() {
		return isVisibilidadCeldaModificarTipoUbicacionNegocio;
	}

	public void setIsVisibilidadCeldaModificarTipoUbicacionNegocio(Boolean isVisibilidadCeldaModificarTipoUbicacionNegocio) {
		this.isVisibilidadCeldaModificarTipoUbicacionNegocio = isVisibilidadCeldaModificarTipoUbicacionNegocio;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoUbicacionNegocio() {
		return isVisibilidadCeldaActualizarTipoUbicacionNegocio;
	}

	public void setIsVisibilidadCeldaActualizarTipoUbicacionNegocio(Boolean isVisibilidadCeldaActualizarTipoUbicacionNegocio) {
		this.isVisibilidadCeldaActualizarTipoUbicacionNegocio = isVisibilidadCeldaActualizarTipoUbicacionNegocio;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoUbicacionNegocio() {
		return isVisibilidadCeldaEliminarTipoUbicacionNegocio;
	}

	public void setIsVisibilidadCeldaEliminarTipoUbicacionNegocio(Boolean isVisibilidadCeldaEliminarTipoUbicacionNegocio) {
		this.isVisibilidadCeldaEliminarTipoUbicacionNegocio = isVisibilidadCeldaEliminarTipoUbicacionNegocio;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoUbicacionNegocio() {
		return isVisibilidadCeldaCancelarTipoUbicacionNegocio;
	}

	public void setIsVisibilidadCeldaCancelarTipoUbicacionNegocio(Boolean isVisibilidadCeldaCancelarTipoUbicacionNegocio) {
		this.isVisibilidadCeldaCancelarTipoUbicacionNegocio = isVisibilidadCeldaCancelarTipoUbicacionNegocio;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoUbicacionNegocio() {
		return isVisibilidadCeldaGuardarTipoUbicacionNegocio;
	}

	public void setIsVisibilidadCeldaGuardarTipoUbicacionNegocio(Boolean isVisibilidadCeldaGuardarTipoUbicacionNegocio) {
		this.isVisibilidadCeldaGuardarTipoUbicacionNegocio = isVisibilidadCeldaGuardarTipoUbicacionNegocio;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoUbicacionNegocio() {
		return isVisibilidadCeldaGuardarCambiosTipoUbicacionNegocio;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoUbicacionNegocio(Boolean isVisibilidadCeldaGuardarCambiosTipoUbicacionNegocio) {
		this.isVisibilidadCeldaGuardarCambiosTipoUbicacionNegocio = isVisibilidadCeldaGuardarCambiosTipoUbicacionNegocio;
	}
		
	public TipoUbicacionNegocioSessionBean gettipoubicacionnegocioSessionBean() {
		return this.tipoubicacionnegocioSessionBean;
	}
	
	public void settipoubicacionnegocioSessionBean(TipoUbicacionNegocioSessionBean tipoubicacionnegocioSessionBean) {
		this.tipoubicacionnegocioSessionBean=tipoubicacionnegocioSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoUbicacionNegocio(TipoUbicacionNegocio tipoubicacionnegocio)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoubicacionnegocio,null);
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
	
	public void bugActualizarReferenciaActual(TipoUbicacionNegocio tipoubicacionnegocio,TipoUbicacionNegocio tipoubicacionnegocioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoUbicacionNegocio(tipoubicacionnegocio);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoubicacionnegocioAux.setId(tipoubicacionnegocio.getId());
		tipoubicacionnegocioAux.setVersionRow(tipoubicacionnegocio.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoUbicacionNegocio();
		
			int intSelectedRow = this.jTableDatosTipoUbicacionNegocio.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoUbicacionNegocio(this.tipoubicacionnegocio,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoUbicacionNegocio(this.tipoubicacionnegocio);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoubicacionnegocioValidator.getInvalidValues(this.tipoubicacionnegocio);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoubicacionnegocioLogic.setDatosCliente(datosCliente);
			tipoubicacionnegocioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoubicacionnegocioAux=new  TipoUbicacionNegocio();
				
				tipoubicacionnegocioAux.setIsNew(true);
				tipoubicacionnegocioAux.setIsChanged(true);
				
				tipoubicacionnegocioAux.setTipoUbicacionNegocioOriginal(this.tipoubicacionnegocio);
				
				tipoubicacionnegocioAux.setId(this.tipoubicacionnegocio.getId());	
				tipoubicacionnegocioAux.setVersionRow(this.tipoubicacionnegocio.getVersionRow());	
				tipoubicacionnegocioAux.setid_empresa(this.tipoubicacionnegocio.getid_empresa());	
				tipoubicacionnegocioAux.setcodigo(this.tipoubicacionnegocio.getcodigo());	
				tipoubicacionnegocioAux.setnombre(this.tipoubicacionnegocio.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoubicacionnegocioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoubicacionnegocioAux,tipoubicacionnegocioLogic.getTipoUbicacionNegocios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoubicacionnegocioAux,tipoubicacionnegocios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoubicacionnegocioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoubicacionnegocioLogic.saveTipoUbicacionNegocios();//WithConnection
						//tipoubicacionnegocioLogic.getSetVersionRowTipoUbicacionNegocios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoubicacionnegocio,tipoubicacionnegocioAux);
					
					this.refrescarForeignKeysDescripcionesTipoUbicacionNegocio();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoubicacionnegocioAux=new  TipoUbicacionNegocio();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado() && this.tipoubicacionnegocio.getId()>=0)) {
						
					tipoubicacionnegocioAux.setIsNew(false);
				}
				
				tipoubicacionnegocioAux.setIsDeleted(false);
			
				tipoubicacionnegocioAux.setId(this.tipoubicacionnegocio.getId());	
				tipoubicacionnegocioAux.setVersionRow(this.tipoubicacionnegocio.getVersionRow());	
				tipoubicacionnegocioAux.setid_empresa(this.tipoubicacionnegocio.getid_empresa());	
				tipoubicacionnegocioAux.setcodigo(this.tipoubicacionnegocio.getcodigo());	
				tipoubicacionnegocioAux.setnombre(this.tipoubicacionnegocio.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoubicacionnegocioAux,tipoubicacionnegocioLogic.getTipoUbicacionNegocios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoubicacionnegocioAux,tipoubicacionnegocios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoubicacionnegocioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoubicacionnegocioLogic.saveTipoUbicacionNegocios();//WithConnection
						//tipoubicacionnegocioLogic.getSetVersionRowTipoUbicacionNegocios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoubicacionnegocio,tipoubicacionnegocioAux);
					
					this.refrescarForeignKeysDescripcionesTipoUbicacionNegocio();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoubicacionnegocioAux=new  TipoUbicacionNegocio();
				
				tipoubicacionnegocioAux.setIsNew(false);
				tipoubicacionnegocioAux.setIsChanged(false);
				
				tipoubicacionnegocioAux.setIsDeleted(true);
				
				tipoubicacionnegocioAux.setId(this.tipoubicacionnegocio.getId());	
				tipoubicacionnegocioAux.setVersionRow(this.tipoubicacionnegocio.getVersionRow());	
				tipoubicacionnegocioAux.setid_empresa(this.tipoubicacionnegocio.getid_empresa());	
				tipoubicacionnegocioAux.setcodigo(this.tipoubicacionnegocio.getcodigo());	
				tipoubicacionnegocioAux.setnombre(this.tipoubicacionnegocio.getnombre());	
				
				if(this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoubicacionnegocioAux.getId()>=0) {	
						this.tipoubicacionnegociosEliminados.add(tipoubicacionnegocioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoubicacionnegocioAux,tipoubicacionnegocioLogic.getTipoUbicacionNegocios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoubicacionnegocioAux,tipoubicacionnegocios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoubicacionnegocioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoubicacionnegocioLogic.saveTipoUbicacionNegocios();//WithConnection
						//tipoubicacionnegocioLogic.getSetVersionRowTipoUbicacionNegocios();//WithConnection
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
					this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().addAll(this.tipoubicacionnegociosEliminados);
					
					tipoubicacionnegocioLogic.saveTipoUbicacionNegocios();//WithConnection
					//tipoubicacionnegocioLogic.getSetVersionRowTipoUbicacionNegocios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoUbicacionNegocio();
				
				this.tipoubicacionnegociosEliminados= new ArrayList<TipoUbicacionNegocio>();		
			}
			
			if(this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Ubicacion Negocio GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Ubicacion Negocio",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoubicacionnegocio=tipoubicacionnegocioAux;
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
      		//this.finishProcessTipoUbicacionNegocio();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoUbicacionNegocio tipoubicacionnegocioLocal) throws Exception {
		
		if(this.tipoubicacionnegocioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoUbicacionNegocio tipoubicacionnegocioLocal) throws Exception {	
		if(this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoubicacionnegocioLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoUbicacionNegocioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoUbicacionNegocio.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoubicacionnegocioValidator.getInvalidValues(this.tipoubicacionnegocio);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoUbicacionNegocio tipoubicacionnegocio,List<TipoUbicacionNegocio> tipoubicacionnegocios) throws Exception {
		try	{		
			TipoUbicacionNegocioConstantesFunciones.actualizarLista(tipoubicacionnegocio,tipoubicacionnegocios,this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoUbicacionNegocio tipoubicacionnegocio,List<TipoUbicacionNegocio> tipoubicacionnegocios) throws Exception {
		try	{			
			TipoUbicacionNegocioConstantesFunciones.actualizarSelectedLista(tipoubicacionnegocio,tipoubicacionnegocios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoUbicacionNegocio> tipoubicacionnegociosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoubicacionnegociosLocal=this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoubicacionnegociosLocal=this.tipoubicacionnegocios;
			}
			//ARCHITECTURE
		
			for(TipoUbicacionNegocio tipoubicacionnegocioLocal:tipoubicacionnegociosLocal) {
				if(this.permiteMantenimiento(tipoubicacionnegocioLocal) && tipoubicacionnegocioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoUbicacionNegocioConstantesFunciones.getTipoUbicacionNegocioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoUbicacionNegocioConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoUbicacionNegocio.jLabelid_empresaTipoUbicacionNegocio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoUbicacionNegocioConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoUbicacionNegocio.jLabelcodigoTipoUbicacionNegocio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoUbicacionNegocioConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoUbicacionNegocio.jLabelnombreTipoUbicacionNegocio,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoUbicacionNegocio.jLabelid_empresaTipoUbicacionNegocio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoUbicacionNegocio.jLabelcodigoTipoUbicacionNegocio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoUbicacionNegocio.jLabelnombreTipoUbicacionNegocio,"");
		
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
		this.iIdNuevoTipoUbicacionNegocio--;	
		
		
		this.tipoubicacionnegocioAux=new TipoUbicacionNegocio();
		
		this.tipoubicacionnegocioAux.setId(this.iIdNuevoTipoUbicacionNegocio);
		this.tipoubicacionnegocioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().add(this.tipoubicacionnegocioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoubicacionnegocios.add(this.tipoubicacionnegocioAux);
		}
		//ARCHITECTURE
		
		this.tipoubicacionnegocio=this.tipoubicacionnegocioAux;
		
		if(TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoUbicacionNegocio(this.tipoubicacionnegocio);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoUbicacionNegocio(this.tipoubicacionnegocio);
		}
				
		//this.setDefaultControlesTipoUbicacionNegocio();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoUbicacionNegocio();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoUbicacionNegocio();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoUbicacionNegocio();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoUbicacionNegocio(this.tipoubicacionnegocioBean,this.tipoubicacionnegocio,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoUbicacionNegocio(this.tipoubicacionnegocio);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoubicacionnegocioSessionBean.getConGuardarRelaciones()) {
			classes=TipoUbicacionNegocioConstantesFunciones.getClassesRelationshipsOfTipoUbicacionNegocio(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoubicacionnegocioReturnGeneral=tipoubicacionnegocioLogic.procesarEventosTipoUbicacionNegociosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios(),this.tipoubicacionnegocio,this.tipoubicacionnegocioParameterGeneral,this.isEsNuevoTipoUbicacionNegocio,classes);//this.tipoubicacionnegocioLogic.getTipoUbicacionNegocio()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoUbicacionNegocio(this.tipoubicacionnegocioReturnGeneral,this.tipoubicacionnegocioBean,false);
		
		if(this.tipoubicacionnegocioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoUbicacionNegocio(this.tipoubicacionnegocioReturnGeneral.getTipoUbicacionNegocio());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoUbicacionNegocio(this.tipoubicacionnegocioReturnGeneral.getTipoUbicacionNegocio());
		}
		
		if(this.tipoubicacionnegocioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoUbicacionNegocio(this.tipoubicacionnegocioReturnGeneral.getTipoUbicacionNegocio(),classes);//this.tipoubicacionnegocioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoUbicacionNegocio(this.tipoubicacionnegocio,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoUbicacionNegocio();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoUbicacionNegocio();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoUbicacionNegocio(false);
						
			if(tipoubicacionnegocioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoUbicacionNegocio();
			}
			
			this.actualizarVisualTableDatosTipoUbicacionNegocio();
			
			this.jTableDatosTipoUbicacionNegocio.setRowSelectionInterval(this.getIndiceNuevoTipoUbicacionNegocio(), this.getIndiceNuevoTipoUbicacionNegocio());
			
			this.seleccionarFilaTablaTipoUbicacionNegocioActual();
						
			this.actualizarEstadoCeldasBotonesTipoUbicacionNegocio("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoUbicacionNegocio(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTextFieldcodigoTipoUbicacionNegocio.setEnabled(isHabilitar && this.tipoubicacionnegocioConstantesFunciones.activarcodigoTipoUbicacionNegocio);
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTextAreanombreTipoUbicacionNegocio.setEnabled(isHabilitar && this.tipoubicacionnegocioConstantesFunciones.activarnombreTipoUbicacionNegocio);	
		//
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxid_empresaTipoUbicacionNegocio.setEnabled(isHabilitar && this.tipoubicacionnegocioConstantesFunciones.activarid_empresaTipoUbicacionNegocio);
	};
	
	public void setDefaultControlesTipoUbicacionNegocio() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoUbicacionNegocio(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoubicacionnegocioSessionBean.setConGuardarRelaciones(true);			
			this.tipoubicacionnegocioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTabbedPaneRelacionesTipoUbicacionNegocio.setVisible(true);
			
					
		} else {
			//this.tipoubicacionnegocioSessionBean.setConGuardarRelaciones(false);			
			this.tipoubicacionnegocioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTabbedPaneRelacionesTipoUbicacionNegocio.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoUbicacionNegocio() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoUbicacionNegocio tipoubicacionnegocioAux:this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios()) {
				if(tipoubicacionnegocioAux.getId().equals(this.iIdNuevoTipoUbicacionNegocio)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoUbicacionNegocio tipoubicacionnegocioAux:this.tipoubicacionnegocios) {
				if(tipoubicacionnegocioAux.getId().equals(this.iIdNuevoTipoUbicacionNegocio)) {
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
	
	public int getIndiceActualTipoUbicacionNegocio(TipoUbicacionNegocio tipoubicacionnegocio,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoUbicacionNegocio tipoubicacionnegocioAux:this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios()) {
				if(tipoubicacionnegocioAux.getId().equals(tipoubicacionnegocio.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoUbicacionNegocio tipoubicacionnegocioAux:this.tipoubicacionnegocios) {
				if(tipoubicacionnegocioAux.getId().equals(tipoubicacionnegocio.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoUbicacionNegocio(TipoUbicacionNegocio tipoubicacionnegocioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoUbicacionNegocio tipoubicacionnegocioAux:this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios()) {
				if(tipoubicacionnegocioAux.getTipoUbicacionNegocioOriginal().getId().equals(tipoubicacionnegocioOriginal.getId())) {
					existe=true;
					tipoubicacionnegocioOriginal.setId(tipoubicacionnegocioAux.getId());
					tipoubicacionnegocioOriginal.setVersionRow(tipoubicacionnegocioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoUbicacionNegocio tipoubicacionnegocioAux:this.tipoubicacionnegocios) {
				if(tipoubicacionnegocioAux.getTipoUbicacionNegocioOriginal().getId().equals(tipoubicacionnegocioOriginal.getId())) {
					existe=true;
					tipoubicacionnegocioOriginal.setId(tipoubicacionnegocioAux.getId());
					tipoubicacionnegocioOriginal.setVersionRow(tipoubicacionnegocioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoUbicacionNegocio(Boolean esParaCancelar) throws Exception {
		tipoubicacionnegociosAux=new ArrayList<TipoUbicacionNegocio>();
		tipoubicacionnegocioAux=new TipoUbicacionNegocio();
		
		if(!this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoUbicacionNegocio tipoubicacionnegocioAux:this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios()) {
					if(tipoubicacionnegocioAux.getId()<0) {
						tipoubicacionnegociosAux.add(tipoubicacionnegocioAux);
					}		
				}
				this.iIdNuevoTipoUbicacionNegocio=0L;
				this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().removeAll(tipoubicacionnegociosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoUbicacionNegocio tipoubicacionnegocioAux:this.tipoubicacionnegocios) {
					if(tipoubicacionnegocioAux.getId()<0) {
						tipoubicacionnegociosAux.add(tipoubicacionnegocioAux);
					}		
				}
				this.iIdNuevoTipoUbicacionNegocio=0L;
				this.tipoubicacionnegocios.removeAll(tipoubicacionnegociosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoUbicacionNegocio 
					&& this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().size()>0
					) {
					tipoubicacionnegocioAux=this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().get(this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().size() - 1);
				
					if(tipoubicacionnegocioAux.getId()<0) {
						this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().remove(tipoubicacionnegocioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoUbicacionNegocio && this.tipoubicacionnegocios.size()>0) {
					tipoubicacionnegocioAux=this.tipoubicacionnegocios.get(this.tipoubicacionnegocios.size() - 1);
				
					if(tipoubicacionnegocioAux.getId()<0) {
						this.tipoubicacionnegocios.remove(tipoubicacionnegocioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoUbicacionNegocio(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoubicacionnegocio.getId()<0) {
				this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().remove(this.tipoubicacionnegocio);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoubicacionnegocio.getId()<0) {
				this.tipoubicacionnegocios.remove(this.tipoubicacionnegocio);
			}
		}			
	}
	
	public void setEstadosInicialesTipoUbicacionNegocio(List<TipoUbicacionNegocio> tipoubicacionnegociosAux) throws Exception {
		TipoUbicacionNegocioConstantesFunciones.setEstadosInicialesTipoUbicacionNegocio(tipoubicacionnegociosAux);
	}
	
	public void setEstadosInicialesTipoUbicacionNegocio(TipoUbicacionNegocio tipoubicacionnegocioAux) throws Exception {
		TipoUbicacionNegocioConstantesFunciones.setEstadosInicialesTipoUbicacionNegocio(tipoubicacionnegocioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoUbicacionNegocioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoUbicacionNegocio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoUbicacionNegocioActual()) {
				if(!this.isEsNuevoTipoUbicacionNegocio) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoUbicacionNegocio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoUbicacionNegocio=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoUbicacionNegocioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Ubicacion Negocio ?", "MANTENIMIENTO DE Tipo Ubicacion Negocio", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoUbicacionNegocio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoUbicacionNegocio tipoubicacionnegocio) throws Exception {
		TipoUbicacionNegocioConstantesFunciones.seleccionarAsignar(this.tipoubicacionnegocio,tipoubicacionnegocio);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoUbicacionNegocio=this.isPermisoActualizarOriginalTipoUbicacionNegocio;
			
			
			this.seleccionarAsignar(tipoubicacionnegocio);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoUbicacionNegocioConstantesFunciones.quitarEspaciosTipoUbicacionNegocio(this.tipoubicacionnegocio,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoUbicacionNegocio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoubicacionnegocioSessionBean.setsFuncionBusquedaRapida(this.tipoubicacionnegocioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoUbicacionNegocio) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoUbicacionNegocio(esParaCancelar);				
				this.cancelarNuevoTipoUbicacionNegocio(esParaCancelar);								
			}
			
			this.tipoubicacionnegocio=new TipoUbicacionNegocio();
			
			this.inicializarTipoUbicacionNegocio();
			
			this.actualizarEstadoCeldasBotonesTipoUbicacionNegocio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoUbicacionNegocio() throws Exception {
		try {
			TipoUbicacionNegocioConstantesFunciones.inicializarTipoUbicacionNegocio(this.tipoubicacionnegocio);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoUbicacionNegocios(String sAccionBusqueda,List<TipoUbicacionNegocio> tipoubicacionnegociosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoUbicacionNegocio"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoUbicacionNegocioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoUbicacionNegocioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoUbicacionNegocio"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Ubicacion Negocios");		
		parameters.put("busquedapor", TipoUbicacionNegocioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoUbicacionNegocio=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoUbicacionNegocioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoUbicacionNegocioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoUbicacionNegocio=new JRBeanArrayDataSource(TipoUbicacionNegocioJInternalFrame.TraerTipoUbicacionNegocioBeans(tipoubicacionnegociosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoUbicacionNegocio);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoUbicacionNegocioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoUbicacionNegocioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoUbicacionNegocioBean.TraerTipoUbicacionNegocioBeans(tipoubicacionnegociosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoUbicacionNegocios(sAccionBusqueda,sTipoArchivoReporte,tipoubicacionnegociosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoUbicacionNegocios(sAccionBusqueda,sTipoArchivoReporte,tipoubicacionnegociosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoUbicacionNegocioActionPerformed(null);
					//this.generarExcelReporteTipoUbicacionNegocios(sAccionBusqueda,sTipoArchivoReporte,tipoubicacionnegociosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoUbicacionNegocios(sAccionBusqueda,sTipoArchivoReporte,tipoubicacionnegociosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoUbicacionNegocios(sAccionBusqueda,sTipoArchivoReporte,tipoubicacionnegociosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoUbicacionNegocios(sAccionBusqueda,sTipoArchivoReporte,tipoubicacionnegociosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoUbicacionNegocios(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoUbicacionNegocio> tipoubicacionnegociosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoubicacionnegocio";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoUbicacionNegocios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoUbicacionNegocio("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoUbicacionNegocio tipoubicacionnegocio : tipoubicacionnegociosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoUbicacionNegocioConstantesFunciones.generarExcelReporteDataTipoUbicacionNegocio("NORMAL",row,workbook,tipoubicacionnegocio,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Ubicacion Negocio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoUbicacionNegocio(String sTipo,Row row,Workbook workbook) {
		
		TipoUbicacionNegocioConstantesFunciones.generarExcelReporteHeaderTipoUbicacionNegocio(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoUbicacionNegocios(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoUbicacionNegocio> tipoubicacionnegociosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoubicacionnegocio_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoUbicacionNegocios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoUbicacionNegocio tipoubicacionnegocio : tipoubicacionnegociosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoUbicacionNegocioConstantesFunciones.getTipoUbicacionNegocioDescripcion(tipoubicacionnegocio));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoUbicacionNegocioConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoUbicacionNegocioConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoubicacionnegocio.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoUbicacionNegocioConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoUbicacionNegocioConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoubicacionnegocio.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoUbicacionNegocioConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoUbicacionNegocioConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoubicacionnegocio.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Ubicacion Negocio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoUbicacionNegocios(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoUbicacionNegocio> tipoubicacionnegociosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoUbicacionNegocio> tipoubicacionnegociosRespaldo=null;
		
		classes=TipoUbicacionNegocioConstantesFunciones.getClassesRelationshipsOfTipoUbicacionNegocio(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoubicacionnegocioLogic.setDatosCliente(this.datosCliente);
		this.tipoubicacionnegocioLogic.setDatosDeep(this.datosDeep);
		this.tipoubicacionnegocioLogic.setIsConDeep(true);
		
		tipoubicacionnegociosRespaldo=this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios();
		
		this.tipoubicacionnegocioLogic.setTipoUbicacionNegocios(tipoubicacionnegociosParaReportes);	
		this.tipoubicacionnegocioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoubicacionnegociosParaReportes=this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios();
		this.tipoubicacionnegocioLogic.setTipoUbicacionNegocios(tipoubicacionnegociosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoubicacionnegocio_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoUbicacionNegocios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoUbicacionNegocio("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoUbicacionNegocio tipoubicacionnegocio : tipoubicacionnegociosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoUbicacionNegocio("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoUbicacionNegocioConstantesFunciones.generarExcelReporteDataTipoUbicacionNegocio("NORMAL",row,workbook,tipoubicacionnegocio,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoUbicacionNegocioConstantesFunciones.getTipoUbicacionNegocioDescripcion(tipoubicacionnegocio));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Ubicacion Negocio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoUbicacionNegocio() throws Exception {		
		this.startProcessTipoUbicacionNegocio(true);
	}
	
	public void startProcessTipoUbicacionNegocio(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoUbicacionNegocio ,this.jPanelParametrosReportesTipoUbicacionNegocio, this.jScrollPanelDatosTipoUbicacionNegocio,this.jPanelPaginacionTipoUbicacionNegocio, this.jScrollPanelDatosEdicionTipoUbicacionNegocio, this.jPanelAccionesTipoUbicacionNegocio,this.jPanelAccionesFormularioTipoUbicacionNegocio,this.jmenuBarTipoUbicacionNegocio,this.jmenuBarDetalleTipoUbicacionNegocio,this.jTtoolBarTipoUbicacionNegocio,this.jTtoolBarDetalleTipoUbicacionNegocio);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoUbicacionNegocio=this.jTabbedPaneBusquedasTipoUbicacionNegocio; 
		
		final JPanel jPanelParametrosReportesTipoUbicacionNegocio=this.jPanelParametrosReportesTipoUbicacionNegocio;
		//final JScrollPane jScrollPanelDatosTipoUbicacionNegocio=this.jScrollPanelDatosTipoUbicacionNegocio;
		final JTable jTableDatosTipoUbicacionNegocio=this.jTableDatosTipoUbicacionNegocio;		
		final JPanel jPanelPaginacionTipoUbicacionNegocio=this.jPanelPaginacionTipoUbicacionNegocio;
		//final JScrollPane jScrollPanelDatosEdicionTipoUbicacionNegocio=this.jScrollPanelDatosEdicionTipoUbicacionNegocio;
		final JPanel jPanelAccionesTipoUbicacionNegocio=this.jPanelAccionesTipoUbicacionNegocio;
		
		JPanel jPanelCamposAuxiliarTipoUbicacionNegocio=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoUbicacionNegocio=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {
			jPanelCamposAuxiliarTipoUbicacionNegocio=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jPanelCamposTipoUbicacionNegocio;
			jPanelAccionesFormularioAuxiliarTipoUbicacionNegocio=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jPanelAccionesFormularioTipoUbicacionNegocio;
		}
		
		final JPanel jPanelCamposTipoUbicacionNegocio=jPanelCamposAuxiliarTipoUbicacionNegocio;
		final JPanel jPanelAccionesFormularioTipoUbicacionNegocio=jPanelAccionesFormularioAuxiliarTipoUbicacionNegocio;
		
		
		final JMenuBar jmenuBarTipoUbicacionNegocio=this.jmenuBarTipoUbicacionNegocio;
		final JToolBar jTtoolBarTipoUbicacionNegocio=this.jTtoolBarTipoUbicacionNegocio;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoUbicacionNegocio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoUbicacionNegocio=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {
			jmenuBarDetalleAuxiliarTipoUbicacionNegocio=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jmenuBarDetalleTipoUbicacionNegocio;
			jTtoolBarDetalleAuxiliarTipoUbicacionNegocio=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTtoolBarDetalleTipoUbicacionNegocio;
		}
		
		final JMenuBar jmenuBarDetalleTipoUbicacionNegocio=jmenuBarDetalleAuxiliarTipoUbicacionNegocio;
		final JToolBar jTtoolBarDetalleTipoUbicacionNegocio=jTtoolBarDetalleAuxiliarTipoUbicacionNegocio;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoUbicacionNegocio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoUbicacionNegocio;
			processRunnable.jTableDatos=jTableDatosTipoUbicacionNegocio;
			processRunnable.jPanelCampos=jPanelCamposTipoUbicacionNegocio;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoUbicacionNegocio;
			processRunnable.jPanelAcciones=jPanelAccionesTipoUbicacionNegocio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoUbicacionNegocio;
			
			
			processRunnable.jmenuBar=jmenuBarTipoUbicacionNegocio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoUbicacionNegocio;
			processRunnable.jTtoolBar=jTtoolBarTipoUbicacionNegocio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoUbicacionNegocio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoUbicacionNegocio ,jPanelParametrosReportesTipoUbicacionNegocio,jTableDatosTipoUbicacionNegocio, /*jScrollPanelDatosTipoUbicacionNegocio,*/jPanelCamposTipoUbicacionNegocio,jPanelPaginacionTipoUbicacionNegocio, /*jScrollPanelDatosEdicionTipoUbicacionNegocio,*/ jPanelAccionesTipoUbicacionNegocio,jPanelAccionesFormularioTipoUbicacionNegocio,jmenuBarTipoUbicacionNegocio,jmenuBarDetalleTipoUbicacionNegocio,jTtoolBarTipoUbicacionNegocio,jTtoolBarDetalleTipoUbicacionNegocio);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoUbicacionNegocio ,jPanelParametrosReportesTipoUbicacionNegocio, jScrollPanelDatosTipoUbicacionNegocio,jPanelPaginacionTipoUbicacionNegocio, jScrollPanelDatosEdicionTipoUbicacionNegocio, jPanelAccionesTipoUbicacionNegocio,jPanelAccionesFormularioTipoUbicacionNegocio,jmenuBarTipoUbicacionNegocio,jmenuBarDetalleTipoUbicacionNegocio,jTtoolBarTipoUbicacionNegocio,jTtoolBarDetalleTipoUbicacionNegocio);
						
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
	
	public void finishProcessTipoUbicacionNegocio() {// throws Exception 
		this.finishProcessTipoUbicacionNegocio(true);
	}
	
	public void finishProcessTipoUbicacionNegocio(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoUbicacionNegocio ,this.jPanelParametrosReportesTipoUbicacionNegocio, this.jScrollPanelDatosTipoUbicacionNegocio,this.jPanelPaginacionTipoUbicacionNegocio, this.jScrollPanelDatosEdicionTipoUbicacionNegocio, this.jPanelAccionesTipoUbicacionNegocio,this.jPanelAccionesFormularioTipoUbicacionNegocio,this.jmenuBarTipoUbicacionNegocio,this.jmenuBarDetalleTipoUbicacionNegocio,this.jTtoolBarTipoUbicacionNegocio,this.jTtoolBarDetalleTipoUbicacionNegocio);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoUbicacionNegocio=this.jTabbedPaneBusquedasTipoUbicacionNegocio; 
		
		final JPanel jPanelParametrosReportesTipoUbicacionNegocio=this.jPanelParametrosReportesTipoUbicacionNegocio;
		//final JScrollPane jScrollPanelDatosTipoUbicacionNegocio=this.jScrollPanelDatosTipoUbicacionNegocio;
		final JTable jTableDatosTipoUbicacionNegocio=this.jTableDatosTipoUbicacionNegocio;		
		final JPanel jPanelPaginacionTipoUbicacionNegocio=this.jPanelPaginacionTipoUbicacionNegocio;
		//final JScrollPane jScrollPanelDatosEdicionTipoUbicacionNegocio=this.jScrollPanelDatosEdicionTipoUbicacionNegocio;
		final JPanel jPanelAccionesTipoUbicacionNegocio=this.jPanelAccionesTipoUbicacionNegocio;
		
		JPanel jPanelCamposAuxiliarTipoUbicacionNegocio=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoUbicacionNegocio=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {
			jPanelCamposAuxiliarTipoUbicacionNegocio=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jPanelCamposTipoUbicacionNegocio;
			jPanelAccionesFormularioAuxiliarTipoUbicacionNegocio=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jPanelAccionesFormularioTipoUbicacionNegocio;
		}
		
		final JPanel jPanelCamposTipoUbicacionNegocio=jPanelCamposAuxiliarTipoUbicacionNegocio;
		final JPanel jPanelAccionesFormularioTipoUbicacionNegocio=jPanelAccionesFormularioAuxiliarTipoUbicacionNegocio;
		
		
		final JMenuBar jmenuBarTipoUbicacionNegocio=this.jmenuBarTipoUbicacionNegocio;		
		final JToolBar jTtoolBarTipoUbicacionNegocio=this.jTtoolBarTipoUbicacionNegocio;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoUbicacionNegocio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoUbicacionNegocio=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {
			jmenuBarDetalleAuxiliarTipoUbicacionNegocio=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jmenuBarDetalleTipoUbicacionNegocio;
			jTtoolBarDetalleAuxiliarTipoUbicacionNegocio=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTtoolBarDetalleTipoUbicacionNegocio;		
		}
		
		final JMenuBar jmenuBarDetalleTipoUbicacionNegocio=jmenuBarDetalleAuxiliarTipoUbicacionNegocio;
		final JToolBar jTtoolBarDetalleTipoUbicacionNegocio=jTtoolBarDetalleAuxiliarTipoUbicacionNegocio;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoUbicacionNegocio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoUbicacionNegocio;
			processRunnable.jTableDatos=jTableDatosTipoUbicacionNegocio;
			processRunnable.jPanelCampos=jPanelCamposTipoUbicacionNegocio;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoUbicacionNegocio;
			processRunnable.jPanelAcciones=jPanelAccionesTipoUbicacionNegocio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoUbicacionNegocio;
			
			
			processRunnable.jmenuBar=jmenuBarTipoUbicacionNegocio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoUbicacionNegocio;
			processRunnable.jTtoolBar=jTtoolBarTipoUbicacionNegocio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoUbicacionNegocio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoUbicacionNegocio ,jPanelParametrosReportesTipoUbicacionNegocio, jTableDatosTipoUbicacionNegocio,/*jScrollPanelDatosTipoUbicacionNegocio,*/jPanelCamposTipoUbicacionNegocio,jPanelPaginacionTipoUbicacionNegocio, /*jScrollPanelDatosEdicionTipoUbicacionNegocio,*/ jPanelAccionesTipoUbicacionNegocio,jPanelAccionesFormularioTipoUbicacionNegocio,jmenuBarTipoUbicacionNegocio,jmenuBarDetalleTipoUbicacionNegocio,jTtoolBarTipoUbicacionNegocio,jTtoolBarDetalleTipoUbicacionNegocio));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoUbicacionNegocio(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoUbicacionNegocio(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoUbicacionNegocio(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoUbicacionNegocio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoUbicacionNegocio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoUbicacionNegocio,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoUbicacionNegocio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoUbicacionNegocio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoUbicacionNegocio,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoubicacionnegocioConstantesFunciones.getsFinalQueryTipoUbicacionNegocio();
		String  finalQueryPaginacionTodos=this.tipoubicacionnegocioConstantesFunciones.getsFinalQueryTipoUbicacionNegocio();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoUbicacionNegocioConstantesFunciones.getArrayColumnasGlobalesNoTipoUbicacionNegocio(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoUbicacionNegocioConstantesFunciones.getArrayColumnasGlobalesTipoUbicacionNegocio(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoUbicacionNegocioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoubicacionnegociosEliminados= new ArrayList<TipoUbicacionNegocio>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoUbicacionNegocio();
		
				///*TipoUbicacionNegocioSessionBean*/this.tipoubicacionnegocioSessionBean=new TipoUbicacionNegocioSessionBean();
			
			if(this.tipoubicacionnegocioSessionBean==null) {
				this.tipoubicacionnegocioSessionBean=new TipoUbicacionNegocioSessionBean();
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
					this.iNumeroPaginacion=TipoUbicacionNegocioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoUbicacionNegocioConstantesFunciones.getClassesForeignKeysOfTipoUbicacionNegocio(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoubicacionnegocio."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoubicacionnegociosAux= new ArrayList<TipoUbicacionNegocio>();
			
				
			tipoubicacionnegocioLogic.setDatosCliente(this.datosCliente);
			tipoubicacionnegocioLogic.setDatosDeep(this.datosDeep);
			tipoubicacionnegocioLogic.setIsConDeep(true);
			
			
			tipoubicacionnegocioLogic.getTipoUbicacionNegocioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoubicacionnegocioLogic.getTodosTipoUbicacionNegocios(finalQueryGlobal,pagination);
					
					//tipoubicacionnegocioLogic.getTodosTipoUbicacionNegociosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoubicacionnegocioLogic.getTipoUbicacionNegocios()==null|| tipoubicacionnegocioLogic.getTipoUbicacionNegocios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoubicacionnegociosAux= new ArrayList<TipoUbicacionNegocio>();
							tipoubicacionnegociosAux.addAll(tipoubicacionnegocioLogic.getTipoUbicacionNegocios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoubicacionnegociosAux= new ArrayList<TipoUbicacionNegocio>();
							tipoubicacionnegociosAux.addAll(tipoubicacionnegocios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoubicacionnegocioLogic.getTodosTipoUbicacionNegocios(finalQueryGlobal+"",this.pagination);												
							
							//tipoubicacionnegocioLogic.getTodosTipoUbicacionNegociosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoUbicacionNegocios("Todos",tipoubicacionnegocioLogic.getTipoUbicacionNegocios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoubicacionnegocioLogic.setTipoUbicacionNegocios(new ArrayList<TipoUbicacionNegocio>());					
							tipoubicacionnegocioLogic.getTipoUbicacionNegocios().addAll(tipoubicacionnegociosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoubicacionnegocios=new ArrayList<TipoUbicacionNegocio>();
							tipoubicacionnegocios.addAll(tipoubicacionnegociosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoUbicacionNegocio=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoUbicacionNegocio=this.idActual;
				
				} else if(this.idTipoUbicacionNegocioActual!=null && this.idTipoUbicacionNegocioActual!=0L) {
					idTipoUbicacionNegocio=idTipoUbicacionNegocioActual;
				}
				
					
				this.sDetalleReporte=TipoUbicacionNegocioConstantesFunciones.getDetalleIndicePorId(idTipoUbicacionNegocio);
				
				this.tipoubicacionnegocios=new ArrayList<TipoUbicacionNegocio>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoubicacionnegocioLogic.getEntity(idTipoUbicacionNegocio);
					
					//tipoubicacionnegocioLogic.getEntityWithConnection(idTipoUbicacionNegocio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoubicacionnegocioLogic.setTipoUbicacionNegocios(new ArrayList<TipoUbicacionNegocio>());
					tipoubicacionnegocioLogic.getTipoUbicacionNegocios().add(tipoubicacionnegocioLogic.getTipoUbicacionNegocio());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoubicacionnegocios=new ArrayList<TipoUbicacionNegocio>();
					this.tipoubicacionnegocios.add(tipoubicacionnegocio);
				}
				
				if(tipoubicacionnegocioLogic.getTipoUbicacionNegocio()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoUbicacionNegocioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoubicacionnegocioLogic.getTipoUbicacionNegociosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoUbicacionNegocioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoUbicacionNegocioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoubicacionnegocioLogic.getTipoUbicacionNegocios()==null||tipoubicacionnegocioLogic.getTipoUbicacionNegocios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoubicacionnegocios==null|| tipoubicacionnegocios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoubicacionnegociosAux=new ArrayList<TipoUbicacionNegocio>();
						tipoubicacionnegociosAux.addAll(tipoubicacionnegocioLogic.getTipoUbicacionNegocios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoubicacionnegociosAux=new ArrayList<TipoUbicacionNegocio>();
							tipoubicacionnegociosAux.addAll(tipoubicacionnegocios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoubicacionnegocioLogic.getTipoUbicacionNegociosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoUbicacionNegocioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoUbicacionNegocioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoUbicacionNegocios("FK_IdEmpresa",tipoubicacionnegocioLogic.getTipoUbicacionNegocios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoUbicacionNegocios("FK_IdEmpresa",tipoubicacionnegocios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoubicacionnegocioLogic.setTipoUbicacionNegocios(new ArrayList<TipoUbicacionNegocio>());
						tipoubicacionnegocioLogic.getTipoUbicacionNegocios().addAll(tipoubicacionnegociosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoubicacionnegocios=new ArrayList<TipoUbicacionNegocio>();
							tipoubicacionnegocios.addAll(tipoubicacionnegociosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoUbicacionNegocio();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoUbicacionNegocio();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoubicacionnegocioLogic.getTipoUbicacionNegocios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoubicacionnegocios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoubicacionnegocioLogic.getTipoUbicacionNegocios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoubicacionnegocios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoUbicacionNegocio tipoubicacionnegocio) {
		Boolean permite=true;
		
		if(this.tipoubicacionnegocio.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoUbicacionNegocioConstantesFunciones.getOrderByListaTipoUbicacionNegocio();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoUbicacionNegocioConstantesFunciones.getOrderByListaTipoUbicacionNegocio();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoUbicacionNegocio tipoubicacionnegocio:tipoubicacionnegocioLogic.getTipoUbicacionNegocios()) {
				if(tipoubicacionnegocio.getsType().equals(Constantes2.S_TOTALES)) {
					tipoubicacionnegocioTotales=tipoubicacionnegocio;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoUbicacionNegocio tipoubicacionnegocio:this.tipoubicacionnegocios) {
				if(tipoubicacionnegocio.getsType().equals(Constantes2.S_TOTALES)) {
					tipoubicacionnegocioTotales=tipoubicacionnegocio;
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
			this.tipoubicacionnegocioAux=new TipoUbicacionNegocio();
			this.tipoubicacionnegocioAux.setsType(Constantes2.S_TOTALES);
			this.tipoubicacionnegocioAux.setIsNew(false);
			this.tipoubicacionnegocioAux.setIsChanged(false);
			this.tipoubicacionnegocioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoUbicacionNegocioConstantesFunciones.TotalizarValoresFilaTipoUbicacionNegocio(this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios(),this.tipoubicacionnegocioAux);
				
				this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().add(this.tipoubicacionnegocioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoUbicacionNegocioConstantesFunciones.TotalizarValoresFilaTipoUbicacionNegocio(this.tipoubicacionnegocios,this.tipoubicacionnegocioAux);
				
				this.tipoubicacionnegocios.add(this.tipoubicacionnegocioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoubicacionnegocioTotales=new TipoUbicacionNegocio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().remove(tipoubicacionnegocioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoubicacionnegocios.remove(tipoubicacionnegocioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoubicacionnegocioTotales=new TipoUbicacionNegocio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoUbicacionNegocio tipoubicacionnegocio:tipoubicacionnegocioLogic.getTipoUbicacionNegocios()) {
				if(tipoubicacionnegocio.getsType().equals(Constantes2.S_TOTALES)) {
					tipoubicacionnegocioTotales=tipoubicacionnegocio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoUbicacionNegocioConstantesFunciones.TotalizarValoresFilaTipoUbicacionNegocio(this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios(),tipoubicacionnegocioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoUbicacionNegocio tipoubicacionnegocio:this.tipoubicacionnegocios) {
				if(tipoubicacionnegocio.getsType().equals(Constantes2.S_TOTALES)) {
					tipoubicacionnegocioTotales=tipoubicacionnegocio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoUbicacionNegocioConstantesFunciones.TotalizarValoresFilaTipoUbicacionNegocio(this.tipoubicacionnegocios,tipoubicacionnegocioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoUbicacionNegociosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoUbicacionNegociosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoubicacionnegocioLogic.getTipoUbicacionNegociosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoUbicacionNegocio() {
		this.isPermisoTodoTipoUbicacionNegocio=false;
		this.isPermisoNuevoTipoUbicacionNegocio=false;
		this.isPermisoActualizarTipoUbicacionNegocio=false;
		this.isPermisoActualizarOriginalTipoUbicacionNegocio=false;
		this.isPermisoEliminarTipoUbicacionNegocio=false;
		this.isPermisoGuardarCambiosTipoUbicacionNegocio=false;
		this.isPermisoConsultaTipoUbicacionNegocio=false;
		this.isPermisoBusquedaTipoUbicacionNegocio=false;
		this.isPermisoReporteTipoUbicacionNegocio=false;		
		this.isPermisoOrdenTipoUbicacionNegocio=false;		
		this.isPermisoPaginacionMedioTipoUbicacionNegocio=false;		
		this.isPermisoPaginacionAltoTipoUbicacionNegocio=false;
		this.isPermisoPaginacionTodoTipoUbicacionNegocio=false;
		this.isPermisoCopiarTipoUbicacionNegocio=false;		
		this.isPermisoVerFormTipoUbicacionNegocio=false;		
		this.isPermisoDuplicarTipoUbicacionNegocio=false;		
		this.isPermisoOrdenTipoUbicacionNegocio=false;		
	}
	
	public void setPermisosUsuarioTipoUbicacionNegocio(Boolean isPermiso) {
		this.isPermisoTodoTipoUbicacionNegocio=isPermiso;
		this.isPermisoNuevoTipoUbicacionNegocio=isPermiso;
		this.isPermisoActualizarTipoUbicacionNegocio=isPermiso;
		this.isPermisoActualizarOriginalTipoUbicacionNegocio=isPermiso;
		this.isPermisoEliminarTipoUbicacionNegocio=isPermiso;
		this.isPermisoGuardarCambiosTipoUbicacionNegocio=isPermiso;
		this.isPermisoConsultaTipoUbicacionNegocio=isPermiso;
		this.isPermisoBusquedaTipoUbicacionNegocio=isPermiso;
		this.isPermisoReporteTipoUbicacionNegocio=isPermiso;
		this.isPermisoOrdenTipoUbicacionNegocio=isPermiso;		
		this.isPermisoPaginacionMedioTipoUbicacionNegocio=isPermiso;		
		this.isPermisoPaginacionAltoTipoUbicacionNegocio=isPermiso;		
		this.isPermisoPaginacionTodoTipoUbicacionNegocio=isPermiso;		
		this.isPermisoCopiarTipoUbicacionNegocio=isPermiso;		
		this.isPermisoVerFormTipoUbicacionNegocio=isPermiso;		
		this.isPermisoDuplicarTipoUbicacionNegocio=isPermiso;
		this.isPermisoOrdenTipoUbicacionNegocio=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoUbicacionNegocio(Boolean isPermiso) {
		//this.isPermisoTodoTipoUbicacionNegocio=isPermiso;
		this.isPermisoNuevoTipoUbicacionNegocio=isPermiso;
		this.isPermisoActualizarTipoUbicacionNegocio=isPermiso;
		this.isPermisoActualizarOriginalTipoUbicacionNegocio=isPermiso;
		this.isPermisoEliminarTipoUbicacionNegocio=isPermiso;
		this.isPermisoGuardarCambiosTipoUbicacionNegocio=isPermiso;
		//this.isPermisoConsultaTipoUbicacionNegocio=isPermiso;
		//this.isPermisoBusquedaTipoUbicacionNegocio=isPermiso;
		//this.isPermisoReporteTipoUbicacionNegocio=isPermiso;
		//this.isPermisoOrdenTipoUbicacionNegocio=isPermiso;		
		//this.isPermisoPaginacionMedioTipoUbicacionNegocio=isPermiso;		
		//this.isPermisoPaginacionAltoTipoUbicacionNegocio=isPermiso;		
		//this.isPermisoPaginacionTodoTipoUbicacionNegocio=isPermiso;		
		//this.isPermisoCopiarTipoUbicacionNegocio=isPermiso;		
		//this.isPermisoDuplicarTipoUbicacionNegocio=isPermiso;
		//this.isPermisoOrdenTipoUbicacionNegocio=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoUbicacionNegocioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoUbicacionNegocioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoUbicacionNegocio(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoUbicacionNegocioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoUbicacionNegocioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoUbicacionNegocioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoUbicacionNegocioClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoUbicacionNegocio() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoUbicacionNegocioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoUbicacionNegocioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoUbicacionNegocio=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoUbicacionNegocio=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoUbicacionNegocio=this.isPermisoActualizarTipoUbicacionNegocio;
			this.isPermisoEliminarTipoUbicacionNegocio=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoUbicacionNegocio=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoUbicacionNegocio=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoUbicacionNegocio=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoUbicacionNegocio=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoUbicacionNegocio=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoUbicacionNegocio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoUbicacionNegocio=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoUbicacionNegocio=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoUbicacionNegocio=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoUbicacionNegocio=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoUbicacionNegocio=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoUbicacionNegocio=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoUbicacionNegocio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoUbicacionNegocio.setToolTipText(this.jTableDatosTipoUbicacionNegocio.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoUbicacionNegocio(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoUbicacionNegocio(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoUbicacionNegocioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoUbicacionNegocioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoUbicacionNegocio() throws Exception {
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
	public void inicializarCombosForeignKeyTipoUbicacionNegocioListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoUbicacionNegocioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoUbicacionNegocioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoUbicacionNegocioListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoUbicacionNegocioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoUbicacionNegocioParameterReturnGeneral tipoubicacionnegocioReturnGeneral=new TipoUbicacionNegocioParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoubicacionnegocioConstantesFunciones.cargarid_empresaTipoUbicacionNegocio)
					 || (this.esRecargarFks && this.tipoubicacionnegocioConstantesFunciones.cargarid_empresaTipoUbicacionNegocio)) {

					if(!this.tipoubicacionnegocioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoubicacionnegocioSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoubicacionnegocioReturnGeneral=tipoubicacionnegocioLogic.cargarCombosLoteForeignKeyTipoUbicacionNegocio(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoubicacionnegocioReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoUbicacionNegocio()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoubicacionnegocioSessionBean==null) {
				this.tipoubicacionnegocioSessionBean=new TipoUbicacionNegocioSessionBean();
			}

			if(!this.tipoubicacionnegocioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoUbicacionNegocio()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoUbicacionNegocio(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoUbicacionNegocio()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoUbicacionNegocio();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoUbicacionNegocio(TipoUbicacionNegocio tipoubicacionnegocio)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoUbicacionNegocio(TipoUbicacionNegocio tipoubicacionnegocio,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoUbicacionNegocio()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoUbicacionNegocio()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoUbicacionNegocio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoUbicacionNegocio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoUbicacionNegocio()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoUbicacionNegocio()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoUbicacionNegocio(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoUbicacionNegocio()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxid_empresaTipoUbicacionNegocio!=null && this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxid_empresaTipoUbicacionNegocio.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxid_empresaTipoUbicacionNegocio.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoUbicacionNegocioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoUbicacionNegocioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoUbicacionNegocioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoubicacionnegocioSessionBean=new TipoUbicacionNegocioSessionBean(); 
		this.tipoubicacionnegocioConstantesFunciones=new TipoUbicacionNegocioConstantesFunciones(); 
		this.tipoubicacionnegocioBean=new TipoUbicacionNegocio();//(this.tipoubicacionnegocioConstantesFunciones); 		
		this.tipoubicacionnegocioReturnGeneral=new TipoUbicacionNegocioParameterReturnGeneral(); 
		
		this.tipoubicacionnegocioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoubicacionnegocioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoUbicacionNegocioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoUbicacionNegocioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoUbicacionNegocioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoUbicacionNegocio(true);
			
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
			
			this.tipoubicacionnegocioConstantesFunciones=new TipoUbicacionNegocioConstantesFunciones(); 
			this.tipoubicacionnegocioBean=new TipoUbicacionNegocio();//this.tipoubicacionnegocioConstantesFunciones); 			
			this.tipoubicacionnegocioReturnGeneral=new TipoUbicacionNegocioParameterReturnGeneral(); 
		
			TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Ubicacion Negocio Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoubicacionnegocio=new TipoUbicacionNegocio();
			this.tipoubicacionnegocios = new ArrayList<TipoUbicacionNegocio>();
			this.tipoubicacionnegociosAux = new ArrayList<TipoUbicacionNegocio>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic=new TipoUbicacionNegocioLogic();
				this.tipoubicacionnegocioLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoubicacionnegocioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoubicacionnegocioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoUbicacionNegocio);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoUbicacionNegocio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoUbicacionNegocio);	
					}
					
					if(this.jInternalFrameImportacionTipoUbicacionNegocio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoUbicacionNegocio);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoUbicacionNegocio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoUbicacionNegocio);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoUbicacionNegocio);
				this.jInternalFrameDetalleFormTipoUbicacionNegocio.setVisible(false);
				this.jInternalFrameDetalleFormTipoUbicacionNegocio.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoUbicacionNegocio!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoUbicacionNegocio);
					this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoUbicacionNegocio!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoUbicacionNegocio);
					this.jInternalFrameImportacionTipoUbicacionNegocio.setVisible(false);
					this.jInternalFrameImportacionTipoUbicacionNegocio.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoUbicacionNegocio!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoUbicacionNegocio);
					this.jInternalFrameOrderByTipoUbicacionNegocio.setVisible(false);
					this.jInternalFrameOrderByTipoUbicacionNegocio.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoUbicacionNegocioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoUbicacionNegocioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoubicacionnegocioReturnGeneral=new TipoUbicacionNegocioParameterReturnGeneral();
			
			this.tipoubicacionnegocioParameterGeneral=new TipoUbicacionNegocioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoubicacionnegocioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoUbicacionNegocioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoUbicacionNegocioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado(),this.tipoubicacionnegocioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoUbicacionNegocioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado(),this.tipoubicacionnegocioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaDuplicarTipoUbicacionNegocio=true;
			this.isVisibilidadCeldaCopiarTipoUbicacionNegocio=true;
			this.isVisibilidadCeldaVerFormTipoUbicacionNegocio=true;
			this.isVisibilidadCeldaOrdenTipoUbicacionNegocio=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaModificarTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaActualizarTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaEliminarTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaCancelarTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaGuardarTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoUbicacionNegocio=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoUbicacionNegocio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoUbicacionNegocio();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoUbicacionNegocio(false);
			
			this.setPermisosUsuarioTipoUbicacionNegocio();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado() && this.tipoubicacionnegocioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoUbicacionNegocioClasesRelacionadas();
			}
			
			if(this.tipoubicacionnegocioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoUbicacionNegocioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoUbicacionNegocio();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoUbicacionNegocio();
			}
			
			if(!this.isPermisoBusquedaTipoUbicacionNegocio) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoUbicacionNegocio.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoUbicacionNegocio,this.isPermisoPaginacionMedioTipoUbicacionNegocio,this.isPermisoPaginacionTodoTipoUbicacionNegocio);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoUbicacionNegocioConstantesFunciones.getTiposSeleccionarTipoUbicacionNegocio());
				
				this.tiposColumnasSelect=TipoUbicacionNegocioConstantesFunciones.getTiposSeleccionarTipoUbicacionNegocio(true);
				
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
			//if(!this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoUbicacionNegocio();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoUbicacionNegocio(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoUbicacionNegocio(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoUbicacionNegocio() ;
			
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
				tipoubicacionnegocioImplementable= (TipoUbicacionNegocioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoUbicacionNegocioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoubicacionnegocioImplementableHome= (TipoUbicacionNegocioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoUbicacionNegocioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoubicacionnegocios= new ArrayList<TipoUbicacionNegocio>();
			this.tipoubicacionnegociosEliminados= new ArrayList<TipoUbicacionNegocio>();
						
			this.isEsNuevoTipoUbicacionNegocio=false;
			this.esParaAccionDesdeFormularioTipoUbicacionNegocio=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoUbicacionNegocio(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoUbicacionNegocio();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoUbicacionNegocioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoUbicacionNegocio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoUbicacionNegocio(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoUbicacionNegocio();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoUbicacionNegocio();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoUbicacionNegocio.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoUbicacionNegocio.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoUbicacionNegocio.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoUbicacionNegocio(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoUbicacionNegocio: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoUbicacionNegocio() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoUbicacionNegocio")) {
				iIndex=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTabbedPaneRelacionesTipoUbicacionNegocio.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTabbedPaneRelacionesTipoUbicacionNegocio.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoUbicacionNegocio.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoUbicacionNegocio();	
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
	
	public void cargarCombosForeignKeyTipoUbicacionNegocio(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoUbicacionNegocio(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoUbicacionNegocio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoUbicacionNegocioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoUbicacionNegocio();
		
		this.cargarCombosFrameForeignKeyTipoUbicacionNegocio();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoUbicacionNegocio();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoUbicacionNegocio();
		}
	}
	
	
	
	public void jButtonNuevoTipoUbicacionNegocioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoubicacionnegocioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoUbicacionNegocio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
			
			
			if(jTableDatosTipoUbicacionNegocio.getRowCount()>=1) {
				jTableDatosTipoUbicacionNegocio.removeRowSelectionInterval(0, jTableDatosTipoUbicacionNegocio.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoUbicacionNegocio=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoUbicacionNegocio(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoUbicacionNegocio(true);			
			//this.tipoubicacionnegocio=new TipoUbicacionNegocio();
			//this.tipoubicacionnegocio.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoUbicacionNegocio(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoUbicacionNegocio() ;
			
			if(TipoUbicacionNegocioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoUbicacionNegocio(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoubicacionnegocio);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoubicacionnegocio);				
			
			TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
			
			if(this.tipoubicacionnegocioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoUbicacionNegocio: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoUbicacionNegocioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoUbicacionNegocio> tipoubicacionnegociosSeleccionados=new ArrayList<TipoUbicacionNegocio>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoUbicacionNegocio.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoUbicacionNegocio.getSelectedRows().length;			
			}
			
			tipoubicacionnegociosSeleccionados=this.getTipoUbicacionNegociosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoUbicacionNegocio--;			
				//TipoUbicacionNegocio tipoubicacionnegocioAux= new TipoUbicacionNegocio();			
				//tipoubicacionnegocioAux.setId(this.iIdNuevoTipoUbicacionNegocio);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoUbicacionNegocio tipoubicacionnegocioOrigen=new TipoUbicacionNegocio();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoUbicacionNegocio tipoubicacionnegocioOrigen : tipoubicacionnegociosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoUbicacionNegocio.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoubicacionnegocioOrigen =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoubicacionnegocioOrigen =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoUbicacionNegocio();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoubicacionnegocio.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoUbicacionNegocio(tipoubicacionnegocioOrigen,this.tipoubicacionnegocio,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoUbicacionNegocio(this.tipoubicacionnegocio);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().add(this.tipoubicacionnegocioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoubicacionnegocios.add(this.tipoubicacionnegocioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoUbicacionNegocio(false);
				
				this.jTableDatosTipoUbicacionNegocio.setRowSelectionInterval(this.getIndiceNuevoTipoUbicacionNegocio(), this.getIndiceNuevoTipoUbicacionNegocio());
				
				int iLastRow =  this.jTableDatosTipoUbicacionNegocio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoUbicacionNegocio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoUbicacionNegocio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoUbicacionNegocio(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoUbicacionNegocioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoUbicacionNegocio> tipoubicacionnegociosSeleccionados=new ArrayList<TipoUbicacionNegocio>();									
		
			TipoUbicacionNegocio tipoubicacionnegocioOrigen=new TipoUbicacionNegocio();
			TipoUbicacionNegocio tipoubicacionnegocioDestino=new TipoUbicacionNegocio();
				
			tipoubicacionnegociosSeleccionados=this.getTipoUbicacionNegociosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoUbicacionNegocio.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoubicacionnegociosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoUbicacionNegocio.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoubicacionnegocioOrigen =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoubicacionnegocioOrigen =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoubicacionnegocioDestino =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoubicacionnegocioDestino =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoubicacionnegocioOrigen =tipoubicacionnegociosSeleccionados.get(0);
				tipoubicacionnegocioDestino =tipoubicacionnegociosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoUbicacionNegocio(tipoubicacionnegocioOrigen,tipoubicacionnegocioDestino,true,false);
				
				tipoubicacionnegocioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoubicacionnegocioDestino,tipoubicacionnegocioLogic.getTipoUbicacionNegocios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoubicacionnegocioDestino,tipoubicacionnegocios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoUbicacionNegocio(false);
				
				//this.jTableDatosTipoUbicacionNegocio.setRowSelectionInterval(this.getIndiceNuevoTipoUbicacionNegocio(), this.getIndiceNuevoTipoUbicacionNegocio());
				
				int iLastRow =  this.jTableDatosTipoUbicacionNegocio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoUbicacionNegocio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoUbicacionNegocio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoUbicacionNegocio(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoUbicacionNegocioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoUbicacionNegocio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoUbicacionNegocioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoUbicacionNegocio.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoUbicacionNegocio.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoUbicacionNegocio.setVisible(!isVisible);
			this.jPanelPaginacionTipoUbicacionNegocio.setVisible(!isVisible);
			this.jPanelAccionesTipoUbicacionNegocio.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoUbicacionNegocioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoUbicacionNegocio();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoUbicacionNegocioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoUbicacionNegocio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoUbicacionNegocioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoUbicacionNegocio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoUbicacionNegocioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoUbicacionNegocio();
			
			this.abrirFrameOrderByTipoUbicacionNegocio();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoUbicacionNegocioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoUbicacionNegocio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoUbicacionNegocio(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoUbicacionNegocio);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoUbicacionNegocio.isMaximum()) {
					this.jInternalFrameDetalleFormTipoUbicacionNegocio.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoUbicacionNegocio.setSize(this.jInternalFrameDetalleFormTipoUbicacionNegocio.iWidthFormulario,this.jInternalFrameDetalleFormTipoUbicacionNegocio.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoUbicacionNegocio.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoUbicacionNegocio.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoUbicacionNegocio.isMaximum()) {
						this.jInternalFrameDetalleFormTipoUbicacionNegocio.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoUbicacionNegocio.jContentPaneDetalleTipoUbicacionNegocio.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTabbedPaneRelacionesTipoUbicacionNegocio.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoUbicacionNegocio.jContentPaneDetalleTipoUbicacionNegocio.getWidth(),TipoUbicacionNegocioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTabbedPaneRelacionesTipoUbicacionNegocio.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoUbicacionNegocio.jContentPaneDetalleTipoUbicacionNegocio.getWidth(),TipoUbicacionNegocioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTabbedPaneRelacionesTipoUbicacionNegocio.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoUbicacionNegocio.jContentPaneDetalleTipoUbicacionNegocio.getWidth(),TipoUbicacionNegocioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoUbicacionNegocio.setVisible(true);
	        this.jInternalFrameDetalleFormTipoUbicacionNegocio.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoUbicacionNegocio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoUbicacionNegocio==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoUbicacionNegocio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoUbicacionNegocio,false,this);
				} else {
					this.jInternalFrameOrderByTipoUbicacionNegocio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoUbicacionNegocio,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoUbicacionNegocio);
				this.jInternalFrameOrderByTipoUbicacionNegocio.setVisible(false);
				this.jInternalFrameOrderByTipoUbicacionNegocio.setSelected(false);
				
				this.jInternalFrameOrderByTipoUbicacionNegocio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoUbicacionNegocio"));
				
				this.inicializarActualizarBindingTablaOrderByTipoUbicacionNegocio();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoUbicacionNegocio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoUbicacionNegocio==null) {
				
				this.jInternalFrameImportacionTipoUbicacionNegocio=new ImportacionJInternalFrame(TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoUbicacionNegocio);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoUbicacionNegocio);
				this.jInternalFrameImportacionTipoUbicacionNegocio.setVisible(false);
				this.jInternalFrameImportacionTipoUbicacionNegocio.setSelected(false);


				this.jInternalFrameImportacionTipoUbicacionNegocio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoUbicacionNegocio"));
				this.jInternalFrameImportacionTipoUbicacionNegocio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoUbicacionNegocio"));
				this.jInternalFrameImportacionTipoUbicacionNegocio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoUbicacionNegocio"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoUbicacionNegocio() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoUbicacionNegocio==null) {
				this.jInternalFrameReporteDinamicoTipoUbicacionNegocio=new ReporteDinamicoJInternalFrame(TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoUbicacionNegocio);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoUbicacionNegocio);
				this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoUbicacionNegocio"));
				this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoUbicacionNegocio"));
				this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoUbicacionNegocio"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoUbicacionNegocio();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoUbicacionNegocio() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoUbicacionNegocio);
			
	       	this.jInternalFrameDetalleFormTipoUbicacionNegocio.setVisible(false);
	        this.jInternalFrameDetalleFormTipoUbicacionNegocio.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoUbicacionNegocio.dispose();
			//this.jInternalFrameDetalleFormTipoUbicacionNegocio=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoUbicacionNegocio() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoUbicacionNegocio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoUbicacionNegocio.setVisible(true);
	        this.jInternalFrameImportacionTipoUbicacionNegocio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoUbicacionNegocio() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoUbicacionNegocio.setVisible(true);
	        this.jInternalFrameOrderByTipoUbicacionNegocio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoUbicacionNegocio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoUbicacionNegocio.setVisible(false);
	        this.jInternalFrameOrderByTipoUbicacionNegocio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoUbicacionNegocio() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoUbicacionNegocio() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoUbicacionNegocio.setVisible(false);
	        this.jInternalFrameImportacionTipoUbicacionNegocio.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoUbicacionNegocioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoUbicacionNegocio(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoUbicacionNegocio(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoUbicacionNegocio.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoUbicacionNegocio(true);
			//this.isEsNuevoTipoUbicacionNegocio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoUbicacionNegocio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoUbicacionNegocio(false) ;
			
			if(tipoubicacionnegocioSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoUbicacionNegocioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoUbicacionNegocio(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoUbicacionNegocio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoUbicacionNegocioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoUbicacionNegocio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoUbicacionNegocio(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoUbicacionNegocio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoUbicacionNegocio.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoUbicacionNegocio(true);
			//this.isEsNuevoTipoUbicacionNegocio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoubicacionnegocio.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoUbicacionNegocio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoUbicacionNegocio(false) ;
			
			if(TipoUbicacionNegocioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoUbicacionNegocio(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoUbicacionNegocio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoUbicacionNegocioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoUbicacionNegocio(false);
			
			//if(!this.isEsNuevoTipoUbicacionNegocio) {								
				int intSelectedRow = this.jTableDatosTipoUbicacionNegocio.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoUbicacionNegocio(this.tipoubicacionnegocio,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoUbicacionNegocio(this.tipoubicacionnegocio);
				
			}
			
			if(this.permiteMantenimiento(this.tipoubicacionnegocio)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoUbicacionNegocio=true;
					this.inicializarActualizarBindingTablaTipoUbicacionNegocio(false);
					this.isEsNuevoTipoUbicacionNegocio=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoUbicacionNegocio=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoUbicacionNegocio=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoUbicacionNegocio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoUbicacionNegocio(false);
				
				this.habilitarDeshabilitarControlesTipoUbicacionNegocio(false);
			
												
				
				if(TipoUbicacionNegocioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoUbicacionNegocio();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoUbicacionNegocioActionPerformed(evt,tipoubicacionnegocioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoUbicacionNegocio(this.tipoubicacionnegocio,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoUbicacionNegocio.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoubicacionnegocioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoubicacionnegocio.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoUbicacionNegocio.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoUbicacionNegocio.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoUbicacionNegocioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoUbicacionNegocio.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
				this.tipoubicacionnegocio.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
				this.tipoubicacionnegocio.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoubicacionnegocio)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoUbicacionNegocioModel) this.jTableDatosTipoUbicacionNegocio.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoUbicacionNegocio=true;
				this.inicializarActualizarBindingTablaTipoUbicacionNegocio(false);
				this.isEsNuevoTipoUbicacionNegocio=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoUbicacionNegocio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoUbicacionNegocio(false);
				
				this.habilitarDeshabilitarControlesTipoUbicacionNegocio(false);
				
				
				
				if(TipoUbicacionNegocioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoUbicacionNegocio();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoUbicacionNegocioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoUbicacionNegocio.getRowCount()>=1) {
				jTableDatosTipoUbicacionNegocio.removeRowSelectionInterval(0, jTableDatosTipoUbicacionNegocio.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoUbicacionNegocio(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoUbicacionNegocio(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoUbicacionNegocio(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoUbicacionNegocio(false) ;
			
			this.isEsNuevoTipoUbicacionNegocio=false;
			
			if(TipoUbicacionNegocioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoUbicacionNegocio();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoUbicacionNegocioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoUbicacionNegocio(false);
				
				//SI ES MANUAL
				if(TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoUbicacionNegocio();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoUbicacionNegocioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoUbicacionNegocio--;			
			//TipoUbicacionNegocio tipoubicacionnegocioAux= new TipoUbicacionNegocio();			
			//tipoubicacionnegocioAux.setId(this.iIdNuevoTipoUbicacionNegocio);
			
			if(this.jInternalFrameDetalleFormTipoUbicacionNegocio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoUbicacionNegocio();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoUbicacionNegocio(this.tipoubicacionnegocio);
			
			this.tipoubicacionnegocio.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().add(this.tipoubicacionnegocioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoubicacionnegocios.add(this.tipoubicacionnegocioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoUbicacionNegocio(false);
			
			this.jTableDatosTipoUbicacionNegocio.setRowSelectionInterval(this.getIndiceNuevoTipoUbicacionNegocio(), this.getIndiceNuevoTipoUbicacionNegocio());
			
			int iLastRow =  this.jTableDatosTipoUbicacionNegocio.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoUbicacionNegocio.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoUbicacionNegocio.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoUbicacionNegocio(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoUbicacionNegocioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoUbicacionNegocio(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoUbicacionNegocio(false);
			
			//SI ES MANUAL
			if(TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoUbicacionNegocio();
			}
			
			//this.abrirFrameTreeTipoUbicacionNegocio();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoUbicacionNegocioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Ubicacion NegocioS ?", "MANTENIMIENTO DE Tipo Ubicacion Negocio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoUbicacionNegocio.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoUbicacionNegocio();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoubicacionnegocioReturnGeneral=tipoubicacionnegocioLogic.procesarImportacionTipoUbicacionNegociosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoubicacionnegocioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoUbicacionNegocioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoUbicacionNegocioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoUbicacionNegocio.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoUbicacionNegocio.setFileImportacion(this.jInternalFrameImportacionTipoUbicacionNegocio.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoUbicacionNegocio.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoUbicacionNegocio.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoUbicacionNegocio.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoUbicacionNegocio.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoUbicacionNegocioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoUbicacionNegocio> tipoubicacionnegociosSeleccionados=new ArrayList<TipoUbicacionNegocio>();		

		tipoubicacionnegociosSeleccionados=this.getTipoUbicacionNegociosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoUbicacionNegocioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoUbicacionNegocioBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoUbicacionNegocios("Todos",tipoubicacionnegociosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Ubicacion Negocio",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoUbicacionNegocioConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoUbicacionNegocioConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoUbicacionNegocioConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoUbicacionNegocioConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoUbicacionNegocioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoUbicacionNegocioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoUbicacionNegocioConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoUbicacionNegocioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoUbicacionNegocioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoUbicacionNegocioConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoUbicacionNegocioConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoUbicacionNegocioConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoUbicacionNegocioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoUbicacionNegocio> tipoubicacionnegociosSeleccionados=new ArrayList<TipoUbicacionNegocio>();		
		
		tipoubicacionnegociosSeleccionados=this.getTipoUbicacionNegociosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoubicacionnegocio";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoUbicacionNegocios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoUbicacionNegocioConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoUbicacionNegocioConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoUbicacionNegocio tipoubicacionnegocio:tipoubicacionnegociosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoubicacionnegocio.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoUbicacionNegocioConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoUbicacionNegocioConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoUbicacionNegocio tipoubicacionnegocio:tipoubicacionnegociosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoubicacionnegocio.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoUbicacionNegocioConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoUbicacionNegocioConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoUbicacionNegocio tipoubicacionnegocio:tipoubicacionnegociosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoubicacionnegocio.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoUbicacionNegocio(row);				
			//	iRow++;
			//}				
			
			//for(TipoUbicacionNegocio tipoubicacionnegocioAux:tipoubicacionnegociosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoUbicacionNegocio(tipoubicacionnegocioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Ubicacion Negocio",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoubicacionnegocioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoUbicacionNegocio(false);
			
			//SI ES MANUAL
			if(TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoUbicacionNegocio();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoUbicacionNegocioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoUbicacionNegocio(false);
			
			//SI ES MANUAL
			if(TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoUbicacionNegocio();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoUbicacionNegocioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoUbicacionNegocio(false);
			
			//SI ES MANUAL
			if(TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoUbicacionNegocio();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoUbicacionNegocio() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoUbicacionNegocio.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoUbicacionNegocio.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoUbicacionNegocio.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoUbicacionNegocio.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoUbicacionNegocio.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoUbicacionNegocio.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoUbicacionNegocio.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoUbicacionNegocio(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoUbicacionNegocio(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoUbicacionNegocio(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoUbicacionNegocio(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoUbicacionNegocio(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoUbicacionNegocio(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoUbicacionNegocio(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoUbicacionNegocio(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoUbicacionNegocio() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoUbicacionNegocio();
		
		this.inicializarActualizarBindingBotonesManualTipoUbicacionNegocio(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoUbicacionNegocio();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoUbicacionNegocio() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoUbicacionNegocio(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoUbicacionNegocio(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoUbicacionNegocio.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoUbicacionNegocio.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoUbicacionNegocio.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jCheckBoxPostAccionNuevoTipoUbicacionNegocio.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jCheckBoxPostAccionSinCerrarTipoUbicacionNegocio.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jCheckBoxPostAccionSinMensajeTipoUbicacionNegocio.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoUbicacionNegocio.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoUbicacionNegocio.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoUbicacionNegocio.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {
				this.jInternalFrameDetalleFormTipoUbicacionNegocio.jCheckBoxPostAccionNuevoTipoUbicacionNegocio.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoUbicacionNegocio.jCheckBoxPostAccionSinCerrarTipoUbicacionNegocio.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoUbicacionNegocio.jCheckBoxPostAccionSinMensajeTipoUbicacionNegocio.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoUbicacionNegocio.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoUbicacionNegocio.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxTiposAccionesFormularioTipoUbicacionNegocio.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoUbicacionNegocio.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoUbicacionNegocio!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoUbicacionNegocio.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoUbicacionNegocio.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoUbicacionNegocio.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoUbicacionNegocio.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoUbicacionNegocio!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoUbicacionNegocio.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoUbicacionNegocio.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoUbicacionNegocio(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoUbicacionNegocio(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoUbicacionNegocio() throws Exception {
		try	{
			if(TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoUbicacionNegocio();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoUbicacionNegocio() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxTiposAccionesFormularioTipoUbicacionNegocio.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxTiposAccionesFormularioTipoUbicacionNegocio.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoUbicacionNegocio() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoUbicacionNegocio.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoUbicacionNegocio.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoUbicacionNegocio.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoUbicacionNegocio.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoUbicacionNegocio.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoUbicacionNegocio.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoUbicacionNegocio.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoUbicacionNegocio.addItem(reporte);
			}
			
			
			if(!this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoUbicacionNegocio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoUbicacionNegocio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoUbicacionNegocio.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoUbicacionNegocio.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoUbicacionNegocio.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoUbicacionNegocio.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxTiposAccionesFormularioTipoUbicacionNegocio.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxTiposAccionesFormularioTipoUbicacionNegocio.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoUbicacionNegocio.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoUbicacionNegocio.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoUbicacionNegocio.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoUbicacionNegocio();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoUbicacionNegocio() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoUbicacionNegocio!=null) {
				this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoUbicacionNegocio!=null) {
				this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoUbicacionNegocio!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoUbicacionNegocio()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoUbicacionNegocio(Boolean esInicializar) throws Exception {				
		if(TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoUbicacionNegocio();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoUbicacionNegocio() throws Exception {
		this.inicializarActualizarBindingTablaTipoUbicacionNegocio(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoUbicacionNegocio() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoUbicacionNegocio.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoUbicacionNegocio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoUbicacionNegocio.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoUbicacionNegocioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoUbicacionNegocio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoUbicacionNegocio.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoUbicacionNegocioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoUbicacionNegocioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoUbicacionNegocioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoUbicacionNegocioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoUbicacionNegocio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoUbicacionNegocio.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoUbicacionNegocioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoUbicacionNegocio.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoUbicacionNegocio(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoubicacionnegocioLogic.getTipoUbicacionNegocios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoubicacionnegocios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoUbicacionNegocio.setModel(new TipoUbicacionNegocioModel(this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoUbicacionNegocio.setModel(new TipoUbicacionNegocioModel(this.tipoubicacionnegocios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoUbicacionNegocio!=null && this.jInternalFrameOrderByTipoUbicacionNegocio.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoUbicacionNegocio();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoUbicacionNegocio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoUbicacionNegocio,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoUbicacionNegocioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO,tipoubicacionnegocioConstantesFunciones.resaltarSeleccionarTipoUbicacionNegocio,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO,tipoubicacionnegocioConstantesFunciones.resaltarSeleccionarTipoUbicacionNegocio,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoUbicacionNegocio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoUbicacionNegocio,TipoUbicacionNegocioConstantesFunciones.LABEL_ID));

		if(this.tipoubicacionnegocioConstantesFunciones.mostraridTipoUbicacionNegocio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoUbicacionNegocioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoubicacionnegocioConstantesFunciones.resaltaridTipoUbicacionNegocio,this.tipoubicacionnegocioConstantesFunciones.activaridTipoUbicacionNegocio,this,true,"idTipoUbicacionNegocio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoubicacionnegocioConstantesFunciones.resaltaridTipoUbicacionNegocio,this.tipoubicacionnegocioConstantesFunciones.activaridTipoUbicacionNegocio,this,true,"idTipoUbicacionNegocio","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoUbicacionNegocio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoUbicacionNegocio,TipoUbicacionNegocioConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoubicacionnegocioConstantesFunciones.mostrarid_empresaTipoUbicacionNegocio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoUbicacionNegocioConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoubicacionnegocioConstantesFunciones.resaltarid_empresaTipoUbicacionNegocio,this,this.tipoubicacionnegocioConstantesFunciones.activarid_empresaTipoUbicacionNegocio));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoubicacionnegocioConstantesFunciones.resaltarid_empresaTipoUbicacionNegocio,this,this.tipoubicacionnegocioConstantesFunciones.activarid_empresaTipoUbicacionNegocio,false,"id_empresaTipoUbicacionNegocio","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoUbicacionNegocioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoUbicacionNegocio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoUbicacionNegocio,TipoUbicacionNegocioConstantesFunciones.LABEL_CODIGO));

		if(this.tipoubicacionnegocioConstantesFunciones.mostrarcodigoTipoUbicacionNegocio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoUbicacionNegocioConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoubicacionnegocioConstantesFunciones.resaltarcodigoTipoUbicacionNegocio,this.tipoubicacionnegocioConstantesFunciones.activarcodigoTipoUbicacionNegocio,this,true,"codigoTipoUbicacionNegocio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoubicacionnegocioConstantesFunciones.resaltarcodigoTipoUbicacionNegocio,this.tipoubicacionnegocioConstantesFunciones.activarcodigoTipoUbicacionNegocio,this,true,"codigoTipoUbicacionNegocio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TipoUbicacionNegocioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoUbicacionNegocio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoUbicacionNegocio,TipoUbicacionNegocioConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoubicacionnegocioConstantesFunciones.mostrarnombreTipoUbicacionNegocio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoUbicacionNegocioConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoubicacionnegocioConstantesFunciones.resaltarnombreTipoUbicacionNegocio,this.tipoubicacionnegocioConstantesFunciones.activarnombreTipoUbicacionNegocio,this,true,"nombreTipoUbicacionNegocio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoubicacionnegocioConstantesFunciones.resaltarnombreTipoUbicacionNegocio,this.tipoubicacionnegocioConstantesFunciones.activarnombreTipoUbicacionNegocio,this,true,"nombreTipoUbicacionNegocio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TipoUbicacionNegocioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoUbicacionNegocio.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoUbicacionNegocio.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoUbicacionNegocio && this.isPermisoGuardarCambiosTipoUbicacionNegocio) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoUbicacionNegocio.addColumn(tableColumn);
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
			
			this.jTableDatosTipoUbicacionNegocio.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoUbicacionNegocio && this.isPermisoGuardarCambiosTipoUbicacionNegocio) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoUbicacionNegocio && this.isPermisoGuardarCambiosTipoUbicacionNegocio) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoUbicacionNegocio.moveColumn(this.jTableDatosTipoUbicacionNegocio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoUbicacionNegocio.moveColumn(this.jTableDatosTipoUbicacionNegocio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoUbicacionNegocio.moveColumn(this.jTableDatosTipoUbicacionNegocio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoUbicacionNegocio.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoUbicacionNegocio.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoUbicacionNegocio,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoUbicacionNegocio.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoUbicacionNegocio.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoUbicacionNegocio.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoUbicacionNegocio.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoUbicacionNegocio.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoubicacionnegocioLogic.getTipoUbicacionNegocios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoubicacionnegocios.size()-1;
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
		//this.jTableDatosTipoUbicacionNegocio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoUbicacionNegocio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoUbicacionNegocio();
			
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
				
				//this.isEsNuevoTipoUbicacionNegocio=false;
					
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
			
				if(this.tipoubicacionnegocioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoUbicacionNegocio==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoUbicacionNegocio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoUbicacionNegocio.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoubicacionnegocio.getsType().equals("DUPLICADO")
				   || this.tipoubicacionnegocio.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoUbicacionNegocio=true;
				
				} else {
					this.isEsNuevoTipoUbicacionNegocio=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoubicacionnegocio.getId()>=0 && !this.tipoubicacionnegocio.getIsNew()) {						
						this.isEsNuevoTipoUbicacionNegocio=false;
						
					} else {
						this.isEsNuevoTipoUbicacionNegocio=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoUbicacionNegocio(esRelaciones);						
				
				this.seleccionarTipoUbicacionNegocio(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoubicacionnegocio.getId()<0) {
					this.isEsNuevoTipoUbicacionNegocio=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoUbicacionNegocio(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoUbicacionNegocio(evt,rowIndex);
				}	
				
				if(this.tipoubicacionnegocioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoUbicacionNegocio: " + this.dDif); 
					}
				}								
				
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoUbicacionNegocio(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoubicacionnegocio)) {
					if(this.tipoubicacionnegocio.getId()>0) {
						this.tipoubicacionnegocio.setIsDeleted(true);
						
						this.tipoubicacionnegociosEliminados.add(this.tipoubicacionnegocio);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().remove(this.tipoubicacionnegocio);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoubicacionnegocios.remove(this.tipoubicacionnegocio);				
					}
					
					
					((TipoUbicacionNegocioModel) this.jTableDatosTipoUbicacionNegocio.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoUbicacionNegocio(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoUbicacionNegocio(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoUbicacionNegocio) {
			
			if(this.jInternalFrameDetalleFormTipoUbicacionNegocio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoUbicacionNegocio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoUbicacionNegocio.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoUbicacionNegocio(this.tipoubicacionnegocio);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoubicacionnegocioConstantesFunciones.cargarid_empresaTipoUbicacionNegocio || this.tipoubicacionnegocioConstantesFunciones.event_dependid_empresaTipoUbicacionNegocio) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoubicacionnegocio.getid_empresa());
									//this.inicializarActualizarBindingTipoUbicacionNegocio(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoubicacionnegocio.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoubicacionnegocio.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoubicacionnegocio.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoUbicacionNegocio("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoUbicacionNegocio(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoUbicacionNegocio() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoUbicacionNegocio(TipoUbicacionNegocio tipoubicacionnegocio) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoUbicacionNegocio(tipoubicacionnegocio,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoUbicacionNegocio(TipoUbicacionNegocio tipoubicacionnegocio,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoUbicacionNegocio(tipoubicacionnegocio);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoUbicacionNegocio(tipoubicacionnegocio,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoUbicacionNegocio(tipoubicacionnegocio);
	}
	
	public void setVariablesObjetoActualToFormularioTipoUbicacionNegocio(TipoUbicacionNegocio tipoubicacionnegocio) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoUbicacionNegocio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jLabelidTipoUbicacionNegocio.setText(tipoubicacionnegocio.getId().toString());
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTextFieldcodigoTipoUbicacionNegocio.setText(tipoubicacionnegocio.getcodigo());
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTextAreanombreTipoUbicacionNegocio.setText(tipoubicacionnegocio.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoUbicacionNegocio tipoubicacionnegocioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoubicacionnegocioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoUbicacionNegocio tipoubicacionnegocioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoubicacionnegocioLocal=this.tipoubicacionnegocio;
			} else {
				tipoubicacionnegocioLocal=this.tipoubicacionnegocioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoubicacionnegocioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoUbicacionNegocio(tipoubicacionnegocioLocal,true);
					
					if(tipoubicacionnegocioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoubicacionnegocioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoubicacionnegocioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoUbicacionNegocio(TipoUbicacionNegocio tipoubicacionnegocio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoUbicacionNegocio(tipoubicacionnegocio,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoUbicacionNegocio(tipoubicacionnegocio);
	}
	
	public void setVariablesFormularioToObjetoActualTipoUbicacionNegocio(TipoUbicacionNegocio tipoubicacionnegocio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoUbicacionNegocio(tipoubicacionnegocio,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoUbicacionNegocio(TipoUbicacionNegocio tipoubicacionnegocio,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoUbicacionNegocio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoUbicacionNegocio.jLabelidTipoUbicacionNegocio.getText()==null || this.jInternalFrameDetalleFormTipoUbicacionNegocio.jLabelidTipoUbicacionNegocio.getText()=="" || this.jInternalFrameDetalleFormTipoUbicacionNegocio.jLabelidTipoUbicacionNegocio.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoUbicacionNegocio.jLabelidTipoUbicacionNegocio.setText("0");
			}

			if(conColumnasBase) {tipoubicacionnegocio.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoUbicacionNegocio.jLabelidTipoUbicacionNegocio.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoUbicacionNegocioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoUbicacionNegocio.jLabelIdTipoUbicacionNegocio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoubicacionnegocio.setcodigo(this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTextFieldcodigoTipoUbicacionNegocio.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoUbicacionNegocioConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoUbicacionNegocio.jLabelcodigoTipoUbicacionNegocio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoubicacionnegocio.setnombre(this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTextAreanombreTipoUbicacionNegocio.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoUbicacionNegocioConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoUbicacionNegocio.jLabelnombreTipoUbicacionNegocio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoUbicacionNegocio(TipoUbicacionNegocio tipoubicacionnegocioBean,TipoUbicacionNegocio tipoubicacionnegocio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoUbicacionNegocio(TipoUbicacionNegocio tipoubicacionnegocioOrigen,TipoUbicacionNegocio tipoubicacionnegocio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoubicacionnegocioOrigen.getId()!=null && !tipoubicacionnegocioOrigen.getId().equals(0L))) {tipoubicacionnegocio.setId(tipoubicacionnegocioOrigen.getId());}}
			if(conDefault || (!conDefault && tipoubicacionnegocioOrigen.getcodigo()!=null && !tipoubicacionnegocioOrigen.getcodigo().equals(""))) {tipoubicacionnegocio.setcodigo(tipoubicacionnegocioOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoubicacionnegocioOrigen.getnombre()!=null && !tipoubicacionnegocioOrigen.getnombre().equals(""))) {tipoubicacionnegocio.setnombre(tipoubicacionnegocioOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoUbicacionNegocio(TipoUbicacionNegocio tipoubicacionnegocio) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jLabelidTipoUbicacionNegocio.setText(tipoubicacionnegocio.getId().toString());
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTextFieldcodigoTipoUbicacionNegocio.setText(tipoubicacionnegocio.getcodigo());
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTextAreanombreTipoUbicacionNegocio.setText(tipoubicacionnegocio.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoUbicacionNegocio(TipoUbicacionNegocioBean tipoubicacionnegocioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jLabelidTipoUbicacionNegocio.setText(tipoubicacionnegocioBean.getId().toString());
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTextFieldcodigoTipoUbicacionNegocio.setText(tipoubicacionnegocioBean.getcodigo());
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTextAreanombreTipoUbicacionNegocio.setText(tipoubicacionnegocioBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoUbicacionNegocio(TipoUbicacionNegocioParameterReturnGeneral tipoubicacionnegocioReturnGeneral,TipoUbicacionNegocioBean tipoubicacionnegocioBean,Boolean conDefault) throws Exception { 
		try {
			TipoUbicacionNegocio tipoubicacionnegocioLocal=new TipoUbicacionNegocio();
			
			tipoubicacionnegocioLocal=tipoubicacionnegocioReturnGeneral.getTipoUbicacionNegocio();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoubicacionnegocioLocal.getId()!=null && !tipoubicacionnegocioLocal.getId().equals(0L))) {tipoubicacionnegocioBean.setId(tipoubicacionnegocioLocal.getId());}}
			if(conDefault || (!conDefault && tipoubicacionnegocioLocal.getcodigo()!=null && !tipoubicacionnegocioLocal.getcodigo().equals(""))) {tipoubicacionnegocioBean.setcodigo(tipoubicacionnegocioLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoubicacionnegocioLocal.getnombre()!=null && !tipoubicacionnegocioLocal.getnombre().equals(""))) {tipoubicacionnegocioBean.setnombre(tipoubicacionnegocioLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoUbicacionNegocioGenerico(Long idTipoUbicacionNegocioSeleccionado,JComboBox jComboBoxTipoUbicacionNegocio,List<TipoUbicacionNegocio> tipoubicacionnegociosLocal)throws Exception {
		try {
			TipoUbicacionNegocio  tipoubicacionnegocioTemp=null;

			for(TipoUbicacionNegocio tipoubicacionnegocioAux:tipoubicacionnegociosLocal) {
				if(tipoubicacionnegocioAux.getId()!=null && tipoubicacionnegocioAux.getId().equals(idTipoUbicacionNegocioSeleccionado)) {
					tipoubicacionnegocioTemp=tipoubicacionnegocioAux;
					break;
				}
			}

			jComboBoxTipoUbicacionNegocio.setSelectedItem(tipoubicacionnegocioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoUbicacionNegocioGenerico(JComboBox jComboBoxTipoUbicacionNegocio,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoUbicacionNegocio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoUbicacionNegocio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoUbicacionNegocio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoUbicacionNegocio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoUbicacionNegocio.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoUbicacionNegocio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoUbicacionNegocio.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoUbicacionNegocio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoUbicacionNegocio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoUbicacionNegocio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoubicacionnegocio=(TipoUbicacionNegocio) tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoubicacionnegocio =(TipoUbicacionNegocio) tipoubicacionnegocios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoubicacionnegocio.getIsNew() && !tipoubicacionnegocio.getIsChanged() && !tipoubicacionnegocio.getIsDeleted()) {
				sDescripcion=tipoubicacionnegocio.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoubicacionnegocio.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoUbicacionNegocio tipoubicacionnegocioRow=new TipoUbicacionNegocio();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoubicacionnegocioRow=(TipoUbicacionNegocio) tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoubicacionnegocioRow=(TipoUbicacionNegocio) tipoubicacionnegocios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoUbicacionNegocio(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaNuevoTipoUbicacionNegocio && this.isPermisoNuevoTipoUbicacionNegocio));			
			this.jButtonDuplicarTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaDuplicarTipoUbicacionNegocio && this.isPermisoDuplicarTipoUbicacionNegocio));			
			this.jButtonCopiarTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaCopiarTipoUbicacionNegocio && this.isPermisoCopiarTipoUbicacionNegocio));
			this.jButtonVerFormTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaVerFormTipoUbicacionNegocio && this.isPermisoVerFormTipoUbicacionNegocio));
			
			this.jButtonAbrirOrderByTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaOrdenTipoUbicacionNegocio && this.isPermisoOrdenTipoUbicacionNegocio));			
			
			this.jButtonNuevoRelacionesTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio && this.isPermisoNuevoTipoUbicacionNegocio));			
			this.jButtonNuevoGuardarCambiosTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaNuevoTipoUbicacionNegocio && this.isPermisoNuevoTipoUbicacionNegocio && this.isPermisoGuardarCambiosTipoUbicacionNegocio));
			
			if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonModificarTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaModificarTipoUbicacionNegocio && this.isPermisoActualizarTipoUbicacionNegocio));	
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonActualizarTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaActualizarTipoUbicacionNegocio && this.isPermisoActualizarTipoUbicacionNegocio));	
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonEliminarTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaEliminarTipoUbicacionNegocio && this.isPermisoEliminarTipoUbicacionNegocio));
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonCancelarTipoUbicacionNegocio.setVisible(this.isVisibilidadCeldaCancelarTipoUbicacionNegocio);							
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonGuardarCambiosTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaGuardarTipoUbicacionNegocio && this.isPermisoGuardarCambiosTipoUbicacionNegocio));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoUbicacionNegocio && this.isPermisoGuardarCambiosTipoUbicacionNegocio));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaNuevoTipoUbicacionNegocio && this.isPermisoNuevoTipoUbicacionNegocio));						
			this.jButtonDuplicarToolBarTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaDuplicarTipoUbicacionNegocio && this.isPermisoDuplicarTipoUbicacionNegocio));						
			this.jButtonCopiarToolBarTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaCopiarTipoUbicacionNegocio && this.isPermisoCopiarTipoUbicacionNegocio));			
			this.jButtonVerFormToolBarTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaVerFormTipoUbicacionNegocio && this.isPermisoVerFormTipoUbicacionNegocio));			
			this.jButtonAbrirOrderByToolBarTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaOrdenTipoUbicacionNegocio && this.isPermisoOrdenTipoUbicacionNegocio));
			this.jButtonNuevoRelacionesToolBarTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio && this.isPermisoNuevoTipoUbicacionNegocio));			
			this.jButtonNuevoGuardarCambiosToolBarTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaNuevoTipoUbicacionNegocio && this.isPermisoNuevoTipoUbicacionNegocio && this.isPermisoGuardarCambiosTipoUbicacionNegocio));			
			
			if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonModificarToolBarTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaModificarTipoUbicacionNegocio && this.isPermisoActualizarTipoUbicacionNegocio));	
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonActualizarToolBarTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaActualizarTipoUbicacionNegocio  && this.isPermisoActualizarTipoUbicacionNegocio));	
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonEliminarToolBarTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaEliminarTipoUbicacionNegocio && this.isPermisoEliminarTipoUbicacionNegocio));
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonCancelarToolBarTipoUbicacionNegocio.setVisible(this.isVisibilidadCeldaCancelarTipoUbicacionNegocio);				
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonGuardarCambiosToolBarTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaGuardarTipoUbicacionNegocio && this.isPermisoGuardarCambiosTipoUbicacionNegocio));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoUbicacionNegocio && this.isPermisoGuardarCambiosTipoUbicacionNegocio));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaNuevoTipoUbicacionNegocio && this.isPermisoNuevoTipoUbicacionNegocio));			
			this.jMenuItemDuplicarTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaDuplicarTipoUbicacionNegocio && this.isPermisoDuplicarTipoUbicacionNegocio));			
			this.jMenuItemCopiarTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaCopiarTipoUbicacionNegocio && this.isPermisoCopiarTipoUbicacionNegocio));			
			this.jMenuItemVerFormTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaVerFormTipoUbicacionNegocio && this.isPermisoVerFormTipoUbicacionNegocio));			
			this.jMenuItemAbrirOrderByTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaOrdenTipoUbicacionNegocio && this.isPermisoOrdenTipoUbicacionNegocio));			
			//this.jMenuItemMostrarOcultarTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaOrdenTipoUbicacionNegocio && this.isPermisoOrdenTipoUbicacionNegocio));
			this.jMenuItemDetalleAbrirOrderByTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaOrdenTipoUbicacionNegocio && this.isPermisoOrdenTipoUbicacionNegocio));			
			//this.jMenuItemDetalleMostrarOcultarTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaOrdenTipoUbicacionNegocio && this.isPermisoOrdenTipoUbicacionNegocio));			
			this.jMenuItemNuevoRelacionesTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio && this.isPermisoNuevoTipoUbicacionNegocio));			
			this.jMenuItemNuevoGuardarCambiosTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaNuevoTipoUbicacionNegocio && this.isPermisoNuevoTipoUbicacionNegocio && this.isPermisoGuardarCambiosTipoUbicacionNegocio));									
			
			if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jMenuItemModificarTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaModificarTipoUbicacionNegocio && this.isPermisoActualizarTipoUbicacionNegocio));	
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jMenuItemActualizarTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaActualizarTipoUbicacionNegocio && this.isPermisoActualizarTipoUbicacionNegocio));	
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jMenuItemEliminarTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaEliminarTipoUbicacionNegocio && this.isPermisoEliminarTipoUbicacionNegocio));
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jMenuItemCancelarTipoUbicacionNegocio.setVisible(this.isVisibilidadCeldaCancelarTipoUbicacionNegocio);				
			}
			
			this.jMenuItemGuardarCambiosTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaGuardarTipoUbicacionNegocio && this.isPermisoGuardarCambiosTipoUbicacionNegocio));						
			this.jMenuItemGuardarCambiosTablaTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoUbicacionNegocio && this.isPermisoGuardarCambiosTipoUbicacionNegocio));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoUbicacionNegocio=this.jButtonNuevoTipoUbicacionNegocio.isVisible();
			this.isVisibilidadCeldaDuplicarTipoUbicacionNegocio=this.jButtonDuplicarTipoUbicacionNegocio.isVisible();
			this.isVisibilidadCeldaCopiarTipoUbicacionNegocio=this.jButtonCopiarTipoUbicacionNegocio.isVisible();
			this.isVisibilidadCeldaVerFormTipoUbicacionNegocio=this.jButtonVerFormTipoUbicacionNegocio.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoUbicacionNegocio=this.jButtonAbrirOrderByTipoUbicacionNegocio.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio=this.jButtonNuevoRelacionesTipoUbicacionNegocio.isVisible();
			this.isVisibilidadCeldaModificarTipoUbicacionNegocio=this.jButtonModificarTipoUbicacionNegocio.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {
			this.isVisibilidadCeldaActualizarTipoUbicacionNegocio=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonActualizarTipoUbicacionNegocio.isVisible();
			this.isVisibilidadCeldaEliminarTipoUbicacionNegocio=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonEliminarTipoUbicacionNegocio.isVisible();
			this.isVisibilidadCeldaCancelarTipoUbicacionNegocio=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonCancelarTipoUbicacionNegocio.isVisible();
			this.isVisibilidadCeldaGuardarTipoUbicacionNegocio=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonGuardarCambiosTipoUbicacionNegocio.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoUbicacionNegocio=this.jButtonGuardarCambiosTablaTipoUbicacionNegocio.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoUbicacionNegocio=this.jButtonNuevoToolBarTipoUbicacionNegocio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio=this.jButtonNuevoRelacionesToolBarTipoUbicacionNegocio.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {
			this.isVisibilidadCeldaModificarTipoUbicacionNegocio=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonModificarToolBarTipoUbicacionNegocio.isVisible();
			this.isVisibilidadCeldaActualizarTipoUbicacionNegocio=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonActualizarToolBarTipoUbicacionNegocio.isVisible();
			this.isVisibilidadCeldaEliminarTipoUbicacionNegocio=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonEliminarToolBarTipoUbicacionNegocio.isVisible();
			this.isVisibilidadCeldaCancelarTipoUbicacionNegocio=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonCancelarToolBarTipoUbicacionNegocio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoUbicacionNegocio=this.jButtonGuardarCambiosToolBarTipoUbicacionNegocio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoUbicacionNegocio=this.jButtonGuardarCambiosTablaToolBarTipoUbicacionNegocio.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoUbicacionNegocio=this.jMenuItemNuevoTipoUbicacionNegocio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio=this.jMenuItemNuevoRelacionesTipoUbicacionNegocio.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {
			this.isVisibilidadCeldaModificarTipoUbicacionNegocio=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jMenuItemModificarTipoUbicacionNegocio.isVisible();
			this.isVisibilidadCeldaActualizarTipoUbicacionNegocio=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jMenuItemActualizarTipoUbicacionNegocio.isVisible();
			this.isVisibilidadCeldaEliminarTipoUbicacionNegocio=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jMenuItemEliminarTipoUbicacionNegocio.isVisible();
			this.isVisibilidadCeldaCancelarTipoUbicacionNegocio=this.jInternalFrameDetalleFormTipoUbicacionNegocio.jMenuItemCancelarTipoUbicacionNegocio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoUbicacionNegocio=this.jMenuItemGuardarCambiosTipoUbicacionNegocio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoUbicacionNegocio=this.jMenuItemGuardarCambiosTablaTipoUbicacionNegocio.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoUbicacionNegocio(Boolean esInicializar) {
		if(TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoubicacionnegocioSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoUbicacionNegocio();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoUbicacionNegocio(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoUbicacionNegocio() {
		this.jButtonNuevoTipoUbicacionNegocio.setVisible(this.isPermisoNuevoTipoUbicacionNegocio);			
		this.jButtonDuplicarTipoUbicacionNegocio.setVisible(this.isPermisoDuplicarTipoUbicacionNegocio);			
		this.jButtonCopiarTipoUbicacionNegocio.setVisible(this.isPermisoCopiarTipoUbicacionNegocio);			
		this.jButtonVerFormTipoUbicacionNegocio.setVisible(this.isPermisoVerFormTipoUbicacionNegocio);			
		
		this.jButtonAbrirOrderByTipoUbicacionNegocio.setVisible(this.isPermisoOrdenTipoUbicacionNegocio);					
		
		this.jButtonNuevoRelacionesTipoUbicacionNegocio.setVisible(this.isPermisoNuevoTipoUbicacionNegocio);			
		
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonModificarTipoUbicacionNegocio.setVisible(this.isPermisoActualizarTipoUbicacionNegocio);	
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonActualizarTipoUbicacionNegocio.setVisible(this.isPermisoActualizarTipoUbicacionNegocio);	
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonEliminarTipoUbicacionNegocio.setVisible(this.isPermisoEliminarTipoUbicacionNegocio);
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonCancelarTipoUbicacionNegocio.setVisible(this.isVisibilidadCeldaCancelarTipoUbicacionNegocio);						
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonGuardarCambiosTipoUbicacionNegocio.setVisible(this.isPermisoGuardarCambiosTipoUbicacionNegocio);							
		}
		
		this.jButtonGuardarCambiosTablaTipoUbicacionNegocio.setVisible(this.isPermisoActualizarTipoUbicacionNegocio);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoUbicacionNegocio() {
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonModificarTipoUbicacionNegocio.setVisible(this.isPermisoActualizarTipoUbicacionNegocio);	
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonActualizarTipoUbicacionNegocio.setVisible(this.isPermisoActualizarTipoUbicacionNegocio);	
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonEliminarTipoUbicacionNegocio.setVisible(this.isPermisoEliminarTipoUbicacionNegocio);
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonCancelarTipoUbicacionNegocio.setVisible(this.isVisibilidadCeldaCancelarTipoUbicacionNegocio);							
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonGuardarCambiosTipoUbicacionNegocio.setVisible((this.isVisibilidadCeldaGuardarTipoUbicacionNegocio && this.isPermisoGuardarCambiosTipoUbicacionNegocio));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoUbicacionNegocio() {
		if(TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoUbicacionNegocio();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoUbicacionNegocio() {
	}
	
	public void jTableDatosTipoUbicacionNegocioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoUbicacionNegocio(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoUbicacionNegocioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoUbicacionNegocio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoUbicacionNegocio(this.gettipoubicacionnegocio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoUbicacionNegocio(this.tipoubicacionnegocio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoubicacionnegocio==null) {
						this.tipoubicacionnegocio = new TipoUbicacionNegocio();
					}

					this.setVariablesFormularioToObjetoActualTipoUbicacionNegocio(this.tipoubicacionnegocio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoUbicacionNegocio(this.tipoubicacionnegocio);
				}

				if(this.tipoubicacionnegocio.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoubicacionnegocio.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoUbicacionNegocio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoUbicacionNegocioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoUbicacionNegocio(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoUbicacionNegocio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoUbicacionNegocio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoUbicacionNegocio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoUbicacionNegocio(this.gettipoubicacionnegocio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoUbicacionNegocio(this.tipoubicacionnegocio);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoubicacionnegocioLogic.getConnexion());

				if(this.tipoubicacionnegocio.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoubicacionnegocio.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoUbicacionNegocio=(TitledBorder)this.jScrollPanelDatosTipoUbicacionNegocio.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoUbicacionNegocio.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoUbicacionNegocioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoUbicacionNegocio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoUbicacionNegocio(this.gettipoubicacionnegocio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoUbicacionNegocio(this.tipoubicacionnegocio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoubicacionnegocio==null) {
						this.tipoubicacionnegocio = new TipoUbicacionNegocio();
					}

					this.setVariablesFormularioToObjetoActualTipoUbicacionNegocio(this.tipoubicacionnegocio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoUbicacionNegocio(this.tipoubicacionnegocio);
				}

				if(this.tipoubicacionnegocio.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoubicacionnegocio.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoUbicacionNegocio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoUbicacionNegocioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoUbicacionNegocio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoUbicacionNegocio(this.gettipoubicacionnegocio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoUbicacionNegocio(this.tipoubicacionnegocio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoubicacionnegocio==null) {
						this.tipoubicacionnegocio = new TipoUbicacionNegocio();
					}

					this.setVariablesFormularioToObjetoActualTipoUbicacionNegocio(this.tipoubicacionnegocio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoUbicacionNegocio(this.tipoubicacionnegocio);
				}

				if(this.tipoubicacionnegocio.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoubicacionnegocio.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoUbicacionNegocio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoUbicacionNegocioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoUbicacionNegocio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoUbicacionNegocio(this.gettipoubicacionnegocio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoUbicacionNegocio(this.tipoubicacionnegocio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoubicacionnegocio==null) {
						this.tipoubicacionnegocio = new TipoUbicacionNegocio();
					}

					this.setVariablesFormularioToObjetoActualTipoUbicacionNegocio(this.tipoubicacionnegocio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoUbicacionNegocio(this.tipoubicacionnegocio);
				}

				if(this.tipoubicacionnegocio.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoubicacionnegocio.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoUbicacionNegocio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoUbicacionNegocioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoUbicacionNegocio(false,false);

			this.getTipoUbicacionNegociosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoUbicacionNegocio(false);

			//if(TipoUbicacionNegocioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoUbicacionNegocio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoubicacionnegocioLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoUbicacionNegocio() {
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.dispose();
			this.jInternalFrameDetalleFormTipoUbicacionNegocio=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoUbicacionNegocio!=null) {
			this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.dispose();
			this.jInternalFrameReporteDinamicoTipoUbicacionNegocio=null;
		}
		
		if(this.jInternalFrameImportacionTipoUbicacionNegocio!=null) {
			this.jInternalFrameImportacionTipoUbicacionNegocio.setVisible(false);	    			
			this.jInternalFrameImportacionTipoUbicacionNegocio.dispose();
			this.jInternalFrameImportacionTipoUbicacionNegocio=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoUbicacionNegocio();
			
			TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoUbicacionNegocio")) {
				jButtonNuevoTipoUbicacionNegocioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoUbicacionNegocio")) {
				jButtonDuplicarTipoUbicacionNegocioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoUbicacionNegocio")) {
				jButtonCopiarTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoUbicacionNegocio")) {
				jButtonVerFormTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoUbicacionNegocio")) {
				jButtonNuevoTipoUbicacionNegocioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoUbicacionNegocio")) {
				jButtonDuplicarTipoUbicacionNegocioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoUbicacionNegocio")) {
				jButtonNuevoTipoUbicacionNegocioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoUbicacionNegocio")) {
				jButtonDuplicarTipoUbicacionNegocioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoUbicacionNegocio")) {
				jButtonNuevoTipoUbicacionNegocioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoUbicacionNegocio")) {
				jButtonNuevoTipoUbicacionNegocioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoUbicacionNegocio")) {
				jButtonNuevoTipoUbicacionNegocioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoUbicacionNegocio")) {
				jButtonModificarTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoUbicacionNegocio")) {
				jButtonModificarTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoUbicacionNegocio")) {
				jButtonModificarTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoUbicacionNegocio")) {
				jButtonActualizarTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoUbicacionNegocio")) {
				jButtonActualizarTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoUbicacionNegocio")) {
				jButtonActualizarTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoUbicacionNegocio")) {
				jButtonEliminarTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoUbicacionNegocio")) {
				jButtonEliminarTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoUbicacionNegocio")) {
				jButtonEliminarTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoUbicacionNegocio")) {
				jButtonCancelarTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoUbicacionNegocio")) {
				jButtonCancelarTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoUbicacionNegocio")) {
				jButtonCancelarTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoUbicacionNegocio")) {
				jButtonCerrarTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoUbicacionNegocio")) {
				jButtonCerrarTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoUbicacionNegocio")) {
				jButtonCerrarTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoUbicacionNegocio")) {
				jButtonMostrarOcultarTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoUbicacionNegocio")) {
				jButtonCancelarTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoUbicacionNegocio")) {
				jButtonGuardarCambiosTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoUbicacionNegocio")) {
				jButtonGuardarCambiosTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoUbicacionNegocio")) {
				jButtonCopiarTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoUbicacionNegocio")) {
				jButtonVerFormTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoUbicacionNegocio")) {
				jButtonGuardarCambiosTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoUbicacionNegocio")) {
				jButtonCopiarTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoUbicacionNegocio")) {
				jButtonVerFormTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoUbicacionNegocio")) {
				jButtonGuardarCambiosTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoUbicacionNegocio")) {
				jButtonGuardarCambiosTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoUbicacionNegocio")) {
				jButtonGuardarCambiosTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoUbicacionNegocio")) {
				jButtonRecargarInformacionTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoUbicacionNegocio")) {
				jButtonRecargarInformacionTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoUbicacionNegocio")) {
				jButtonRecargarInformacionTipoUbicacionNegocioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoUbicacionNegocio")) {
				jButtonAnterioresTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoUbicacionNegocio")) {
				jButtonAnterioresTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoUbicacionNegocio")) {
				jButtonAnterioresTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoUbicacionNegocio")) {
				jButtonSiguientesTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoUbicacionNegocio")) {
				jButtonSiguientesTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoUbicacionNegocio")) {
				jButtonSiguientesTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoUbicacionNegocio") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoUbicacionNegocio")) {
				jButtonAbrirOrderByTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoUbicacionNegocio") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoUbicacionNegocio")) {
				jButtonMostrarOcultarTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoUbicacionNegocio")) {
				jButtonNuevoGuardarCambiosTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoUbicacionNegocio")) {
				jButtonNuevoGuardarCambiosTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoUbicacionNegocio")) {
				jButtonNuevoGuardarCambiosTipoUbicacionNegocioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoUbicacionNegocio")) {
				jButtonCerrarReporteDinamicoTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoUbicacionNegocio")) {
				jButtonGenerarReporteDinamicoTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoUbicacionNegocio")) {
				
				jButtonGenerarExcelReporteDinamicoTipoUbicacionNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoUbicacionNegocio")) {
				jButtonCerrarImportacionTipoUbicacionNegocioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoUbicacionNegocio")) {
				
				jButtonGenerarImportacionTipoUbicacionNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoUbicacionNegocio")) {
				
				jButtonAbrirImportacionTipoUbicacionNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoUbicacionNegocio")) {
				jComboBoxTiposAccionesTipoUbicacionNegocioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoUbicacionNegocio")) {
				jComboBoxTiposRelacionesTipoUbicacionNegocioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoUbicacionNegocio")) {
				jComboBoxTiposAccionesTipoUbicacionNegocioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoUbicacionNegocio")) {
				
				jComboBoxTiposSeleccionarTipoUbicacionNegocioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoUbicacionNegocio")) {
				jTextFieldValorCampoGeneralTipoUbicacionNegocioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoUbicacionNegocio")) {
				jButtonAbrirOrderByTipoUbicacionNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoUbicacionNegocio")) {
				jButtonAbrirOrderByTipoUbicacionNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoUbicacionNegocio")) {
				jButtonCerrarOrderByTipoUbicacionNegocioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoUbicacionNegocioBusqueda")) {
				this.jButtonidTipoUbicacionNegocioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoUbicacionNegocioUpdate")) {
				this.jButtonid_empresaTipoUbicacionNegocioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoUbicacionNegocioBusqueda")) {
				this.jButtonid_empresaTipoUbicacionNegocioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoUbicacionNegocioBusqueda")) {
				this.jButtoncodigoTipoUbicacionNegocioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoUbicacionNegocioBusqueda")) {
				this.jButtonnombreTipoUbicacionNegocioBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoUbicacionNegocio();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoUbicacionNegocioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoubicacionnegocio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoubicacionnegocio);
				
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
				
				


				
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoUbicacionNegocio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoUbicacionNegocio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoUbicacionNegocio tipoubicacionnegocioLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoubicacionnegocioLocal=this.tipoubicacionnegocio;
			} else {
				tipoubicacionnegocioLocal=this.tipoubicacionnegocioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoubicacionnegocio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoubicacionnegocio);
				
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
							
				
				


				
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoUbicacionNegocio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoUbicacionNegocio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoUbicacionNegocioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoUbicacionNegocio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocioAnterior =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoubicacionnegocioAnterior =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
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
			
			TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
			
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
			
			


			
			TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoUbicacionNegocioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoubicacionnegocio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoubicacionnegocio);
				
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
								
						
				


				
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoUbicacionNegocio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoUbicacionNegocio.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoubicacionnegocio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoubicacionnegocio);
				
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
								
				
				


				
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoUbicacionNegocio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoUbicacionNegocio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoUbicacionNegocioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoUbicacionNegocio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocioAnterior =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoubicacionnegocioAnterior =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoubicacionnegocio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoubicacionnegocio);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoUbicacionNegocioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoUbicacionNegocio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocioAnterior =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoubicacionnegocioAnterior =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoUbicacionNegocioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoubicacionnegocio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoubicacionnegocio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoubicacionnegocio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoubicacionnegocio);
				
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
							
				
				


				
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoUbicacionNegocio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoUbicacionNegocio.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoUbicacionNegocioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoUbicacionNegocio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoubicacionnegocioAnterior =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoubicacionnegocioAnterior =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
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
			
			TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
			
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
			
			


			
			TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoUbicacionNegocioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoubicacionnegocio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoubicacionnegocio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoubicacionnegocio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoubicacionnegocio);
				
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
								
				
				


				
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoUbicacionNegocio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoUbicacionNegocio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoUbicacionNegocioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoUbicacionNegocio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocioAnterior =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoubicacionnegocioAnterior =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoUbicacionNegocioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoubicacionnegocio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoubicacionnegocio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoUbicacionNegocioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoubicacionnegocio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoubicacionnegocio);
				
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoUbicacionNegocio")) {
					jCheckBoxSeleccionarTodosTipoUbicacionNegocioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoUbicacionNegocio")) {
					jCheckBoxSeleccionadosTipoUbicacionNegocioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoUbicacionNegocio")) {
					
				}
				
				


				
				
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoUbicacionNegocio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoUbicacionNegocio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoubicacionnegocio);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoubicacionnegocio);
				
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
												
				
				


				
				
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoUbicacionNegocio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoUbicacionNegocio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoUbicacionNegocioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoUbicacionNegocio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoubicacionnegocioAnterior =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoubicacionnegocioAnterior =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoUbicacionNegocioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoubicacionnegocio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoubicacionnegocio);
				
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
				
				
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
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
			
			TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
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
			
			


			
			TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoUbicacionNegocioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoubicacionnegocio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoubicacionnegocio);
				
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoUbicacionNegocio.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoUbicacionNegocio.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoubicacionnegocio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoubicacionnegocio);
				
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
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
				
				


				
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoUbicacionNegocio.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoUbicacionNegocio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoUbicacionNegocioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoUbicacionNegocio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoubicacionnegocioAnterior =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoubicacionnegocioAnterior =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoUbicacionNegocio")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoUbicacionNegocioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoUbicacionNegocio.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoubicacionnegocio =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoubicacionnegocio);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoUbicacionNegocio")) {
				
				}
				
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoUbicacionNegocio")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoUbicacionNegocio.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoUbicacionNegocio")) {
			
			}
			
			TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoUbicacionNegocio();
			
			TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
			
			if(sTipo.equals("NuevoTipoUbicacionNegocio")) {
				jButtonNuevoTipoUbicacionNegocioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoUbicacionNegocio")) {
				jButtonDuplicarTipoUbicacionNegocioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoUbicacionNegocio")) {
				jButtonCopiarTipoUbicacionNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoUbicacionNegocio")) {
				jButtonVerFormTipoUbicacionNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoUbicacionNegocio")) {
				jButtonNuevoTipoUbicacionNegocioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoUbicacionNegocio")) {
				jButtonModificarTipoUbicacionNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoUbicacionNegocio")) {
				jButtonActualizarTipoUbicacionNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoUbicacionNegocio")) {
				jButtonEliminarTipoUbicacionNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoUbicacionNegocio")) {
				jButtonGuardarCambiosTipoUbicacionNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoUbicacionNegocio")) {
				jButtonCancelarTipoUbicacionNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoUbicacionNegocio")) {
				jButtonCerrarTipoUbicacionNegocioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoUbicacionNegocio")) {
				jButtonGuardarCambiosTipoUbicacionNegocioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoUbicacionNegocio")) {
				jButtonNuevoGuardarCambiosTipoUbicacionNegocioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoUbicacionNegocio")) {
				jButtonAbrirOrderByTipoUbicacionNegocioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoUbicacionNegocio")) {
				jButtonRecargarInformacionTipoUbicacionNegocioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoUbicacionNegocio")) {
				jButtonAnterioresTipoUbicacionNegocioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoUbicacionNegocio")) {
				jButtonSiguientesTipoUbicacionNegocioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoUbicacionNegocioBusqueda")) {
				this.jButtonidTipoUbicacionNegocioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoUbicacionNegocioUpdate")) {
				this.jButtonid_empresaTipoUbicacionNegocioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoUbicacionNegocioBusqueda")) {
				this.jButtonid_empresaTipoUbicacionNegocioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoUbicacionNegocioBusqueda")) {
				this.jButtoncodigoTipoUbicacionNegocioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoUbicacionNegocioBusqueda")) {
				this.jButtonnombreTipoUbicacionNegocioBusquedaActionPerformed(evt);
			}
			
			TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoUbicacionNegocio();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoUbicacionNegocio")) {
				closingInternalFrameTipoUbicacionNegocio();
				
			} else if(sTipo.equals("jButtonCancelarTipoUbicacionNegocio")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoUbicacionNegocio = (JInternalFrameBase)evt.getSource();
	            	
	            TipoUbicacionNegocioBeanSwingJInternalFrame jInternalFrameParent=(TipoUbicacionNegocioBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoUbicacionNegocio.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoUbicacionNegocioActionPerformed(null);
			}
			
			TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoubicacionnegocio,new Object(),this.tipoubicacionnegocioParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoUbicacionNegocio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoUbicacionNegocio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoUbicacionNegocio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoubicacionnegocio)) {
			if(!esControlTabla) {
				if(TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoUbicacionNegocio(this.tipoubicacionnegocio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoUbicacionNegocio(this.tipoubicacionnegocio);			
				}
				
				if(this.tipoubicacionnegocioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoUbicacionNegocio(this.tipoubicacionnegocio,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoubicacionnegocioReturnGeneral=tipoubicacionnegocioLogic.procesarEventosTipoUbicacionNegociosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios(),this.tipoubicacionnegocio,this.tipoubicacionnegocioParameterGeneral,this.isEsNuevoTipoUbicacionNegocio,classes);//this.tipoubicacionnegocioLogic.getTipoUbicacionNegocio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoUbicacionNegocio(this.tipoubicacionnegocioReturnGeneral,this.tipoubicacionnegocioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoubicacionnegocioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoUbicacionNegocio(classes,this.tipoubicacionnegocioReturnGeneral,this.tipoubicacionnegocioBean,false);
					}
						
					if(this.tipoubicacionnegocioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoUbicacionNegocio(this.tipoubicacionnegocioReturnGeneral.getTipoUbicacionNegocio());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoUbicacionNegocio(this.tipoubicacionnegocioReturnGeneral.getTipoUbicacionNegocio());	
					}
						
					if(this.tipoubicacionnegocioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoUbicacionNegocio(this.tipoubicacionnegocioReturnGeneral.getTipoUbicacionNegocio(),classes);//this.tipoubicacionnegocioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoUbicacionNegocio(this.tipoubicacionnegocio,classes);//this.tipoubicacionnegocioBean);									
				}
			
				if(TipoUbicacionNegocioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoUbicacionNegocio(this.tipoubicacionnegocio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoUbicacionNegocio(this.tipoubicacionnegocio);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoubicacionnegocioAnterior!=null) {
						this.tipoubicacionnegocio=this.tipoubicacionnegocioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoubicacionnegocioReturnGeneral=tipoubicacionnegocioLogic.procesarEventosTipoUbicacionNegociosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios(),this.tipoubicacionnegocio,this.tipoubicacionnegocioParameterGeneral,this.isEsNuevoTipoUbicacionNegocio,classes);//this.tipoubicacionnegocioLogic.getTipoUbicacionNegocio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoubicacionnegocioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoubicacionnegocioReturnGeneral.getTipoUbicacionNegocio(),tipoubicacionnegocioLogic.getTipoUbicacionNegocios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoubicacionnegocioReturnGeneral.getTipoUbicacionNegocio(),this.tipoubicacionnegocios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoUbicacionNegocio.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoUbicacionNegocio.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoUbicacionNegocio();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoUbicacionNegocio() throws Exception {
		
		TipoUbicacionNegocioModel tipoubicacionnegocioModel=(TipoUbicacionNegocioModel)this.jTableDatosTipoUbicacionNegocio.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoubicacionnegocioModel.tipoubicacionnegocios=this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoubicacionnegocioModel.tipoubicacionnegocios=this.tipoubicacionnegocios;
		}
		
		
		((TipoUbicacionNegocioModel) this.jTableDatosTipoUbicacionNegocio.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoUbicacionNegocio() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoubicacionnegocioAnterior(),this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoubicacionnegocioAnterior(),this.tipoubicacionnegocios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoUbicacionNegocio();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoUbicacionNegocio(TipoUbicacionNegocio tipoubicacionnegocio,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
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
										
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoubicacionnegocio,new Object(),generalEntityParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoubicacionnegocioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoUbicacionNegocioConstantesFunciones.getClassesRelationshipsOfTipoUbicacionNegocio(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoUbicacionNegocioConstantesFunciones.getClassesRelationshipsFromStringsOfTipoUbicacionNegocio(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoUbicacionNegocio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoUbicacionNegocioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoubicacionnegocio,new Object(),generalEntityParameterGeneral,this.tipoubicacionnegocioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoUbicacionNegocio(TipoUbicacionNegocioBean tipoubicacionnegocioBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoUbicacionNegocio(ArrayList<Classe> classes,TipoUbicacionNegocioReturnGeneral tipoubicacionnegocioReturnGeneral,TipoUbicacionNegocioBean tipoubicacionnegocioBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoUbicacionNegocio(TipoUbicacionNegocio tipoubicacionnegocio,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoubicacionnegocio)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoUbicacionNegocio = new TipoUbicacionNegocioDetalleFormJInternalFrame(jDesktopPane,this.tipoubicacionnegocioSessionBean.getConGuardarRelaciones(),this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoUbicacionNegocio);
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.setVisible(false);
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.tipoubicacionnegocioLogic=this.tipoubicacionnegocioLogic;
		
		this.cargarCombosFrameForeignKeyTipoUbicacionNegocio("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoUbicacionNegocio();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoUbicacionNegocio();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoUbicacionNegocio("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoUbicacionNegocio();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoUbicacionNegocio"));
		
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonModificarTipoUbicacionNegocio.addActionListener(new ButtonActionListener(this,"ModificarTipoUbicacionNegocio"));

		
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonModificarToolBarTipoUbicacionNegocio.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoUbicacionNegocio"));
					
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jMenuItemModificarTipoUbicacionNegocio.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoUbicacionNegocio"));		
		
		
		
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonActualizarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"ActualizarTipoUbicacionNegocio"));
		
		
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonActualizarToolBarTipoUbicacionNegocio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoUbicacionNegocio"));
						
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jMenuItemActualizarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoUbicacionNegocio"));		
		
		
		
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonEliminarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"EliminarTipoUbicacionNegocio"));
		
		
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonEliminarToolBarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoUbicacionNegocio"));
								
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jMenuItemEliminarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoUbicacionNegocio"));		
		
		
		
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonCancelarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"CancelarTipoUbicacionNegocio"));
		
		
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonCancelarToolBarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoUbicacionNegocio"));
					
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jMenuItemCancelarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoUbicacionNegocio"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jMenuItemDetalleCerrarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoUbicacionNegocio"));		
		
		
		
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonGuardarCambiosToolBarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoUbicacionNegocio"));
		
		
		
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonGuardarCambiosToolBarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoUbicacionNegocio"));
		
		
		
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxTiposAccionesFormularioTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoUbicacionNegocio"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonidTipoUbicacionNegocioBusqueda.addActionListener(new ButtonActionListener(this,"idTipoUbicacionNegocioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonid_empresaTipoUbicacionNegocioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoUbicacionNegocioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonid_empresaTipoUbicacionNegocioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoUbicacionNegocioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtoncodigoTipoUbicacionNegocioBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoUbicacionNegocioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonnombreTipoUbicacionNegocioBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoUbicacionNegocioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTabbedPaneRelacionesTipoUbicacionNegocio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoUbicacionNegocio"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoUbicacionNegocio"));
		
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoUbicacionNegocio"));
		}
		
		this.jTableDatosTipoUbicacionNegocio.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoUbicacionNegocio"));
		
		this.jTableDatosTipoUbicacionNegocio.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoUbicacionNegocio"));
		
		this.jButtonNuevoTipoUbicacionNegocio.addActionListener(new ButtonActionListener(this,"NuevoTipoUbicacionNegocio"));
		
		this.jButtonDuplicarTipoUbicacionNegocio.addActionListener(new ButtonActionListener(this,"DuplicarTipoUbicacionNegocio"));
		
		this.jButtonCopiarTipoUbicacionNegocio.addActionListener(new ButtonActionListener(this,"CopiarTipoUbicacionNegocio"));
		
		this.jButtonVerFormTipoUbicacionNegocio.addActionListener(new ButtonActionListener(this,"VerFormTipoUbicacionNegocio"));
		
		
		this.jButtonNuevoToolBarTipoUbicacionNegocio.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoUbicacionNegocio"));
			
		this.jButtonDuplicarToolBarTipoUbicacionNegocio.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoUbicacionNegocio"));
			
		this.jMenuItemNuevoTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoUbicacionNegocio"));
			
		this.jMenuItemDuplicarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoUbicacionNegocio"));		
		
		
		this.jButtonNuevoRelacionesTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoUbicacionNegocio"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoUbicacionNegocio.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoUbicacionNegocio"));
			
		this.jMenuItemNuevoRelacionesTipoUbicacionNegocio.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoUbicacionNegocio"));		
		
		
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonModificarTipoUbicacionNegocio.addActionListener(new ButtonActionListener(this,"ModificarTipoUbicacionNegocio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonModificarToolBarTipoUbicacionNegocio.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoUbicacionNegocio"));
			
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jMenuItemModificarTipoUbicacionNegocio.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoUbicacionNegocio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonActualizarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"ActualizarTipoUbicacionNegocio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonActualizarToolBarTipoUbicacionNegocio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoUbicacionNegocio"));
				
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jMenuItemActualizarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoUbicacionNegocio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonEliminarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"EliminarTipoUbicacionNegocio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonEliminarToolBarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoUbicacionNegocio"));
						
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jMenuItemEliminarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoUbicacionNegocio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonCancelarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"CancelarTipoUbicacionNegocio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonCancelarToolBarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoUbicacionNegocio"));
			
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jMenuItemCancelarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoUbicacionNegocio"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoUbicacionNegocio"));		
		
		
		this.jButtonCerrarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"CerrarTipoUbicacionNegocio"));
		
		
		this.jButtonCerrarToolBarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoUbicacionNegocio"));
			
		this.jMenuItemCerrarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoUbicacionNegocio"));
			
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jMenuItemDetalleCerrarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoUbicacionNegocio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonGuardarCambiosTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoUbicacionNegocio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonGuardarCambiosToolBarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoUbicacionNegocio"));
		}
		
		this.jButtonCopiarToolBarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoUbicacionNegocio"));
			
		this.jButtonVerFormToolBarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoUbicacionNegocio"));
		
		this.jMenuItemGuardarCambiosTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoUbicacionNegocio"));
			
		this.jMenuItemCopiarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoUbicacionNegocio"));		
		
		this.jMenuItemVerFormTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoUbicacionNegocio"));		
		
		
		this.jButtonGuardarCambiosTablaTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoUbicacionNegocio"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoUbicacionNegocio"));
			
		this.jMenuItemGuardarCambiosTablaTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoUbicacionNegocio"));		
		
		
		
		this.jButtonRecargarInformacionTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoUbicacionNegocio"));
					
		this.jButtonRecargarInformacionToolBarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoUbicacionNegocio"));
		
		this.jMenuItemRecargarInformacionTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoUbicacionNegocio"));		
		
		
		
		this.jButtonAnterioresTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"AnterioresTipoUbicacionNegocio"));
		
		
		this.jButtonAnterioresToolBarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoUbicacionNegocio"));
		
		this.jMenuItemAnterioresTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoUbicacionNegocio"));		
		
		
		this.jButtonSiguientesTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"SiguientesTipoUbicacionNegocio"));
		
		
		this.jButtonSiguientesToolBarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoUbicacionNegocio"));
			
		this.jMenuItemSiguientesTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoUbicacionNegocio"));
			
		this.jMenuItemAbrirOrderByTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoUbicacionNegocio"));
			
		this.jMenuItemMostrarOcultarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoUbicacionNegocio"));
			
		this.jMenuItemDetalleAbrirOrderByTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoUbicacionNegocio"));
			
		this.jMenuItemDetalleMostarOcultarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoUbicacionNegocio"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoUbicacionNegocio"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoUbicacionNegocio"));
			
		this.jMenuItemNuevoGuardarCambiosTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoUbicacionNegocio"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoUbicacionNegocio.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoUbicacionNegocio"));

		this.jCheckBoxSeleccionadosTipoUbicacionNegocio.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoUbicacionNegocio"));
		
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxTiposAccionesFormularioTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoUbicacionNegocio"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoUbicacionNegocio"));
			
		this.jComboBoxTiposAccionesTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoUbicacionNegocio"));
					
		this.jComboBoxTiposSeleccionarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoUbicacionNegocio"));
			
		this.jTextFieldValorCampoGeneralTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoUbicacionNegocio"));		
		
		
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonidTipoUbicacionNegocioBusqueda.addActionListener(new ButtonActionListener(this,"idTipoUbicacionNegocioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonid_empresaTipoUbicacionNegocioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoUbicacionNegocioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonid_empresaTipoUbicacionNegocioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoUbicacionNegocioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtoncodigoTipoUbicacionNegocioBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoUbicacionNegocioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonnombreTipoUbicacionNegocioBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoUbicacionNegocioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoUbicacionNegocio!=null) {
				this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoUbicacionNegocio"));
				this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoUbicacionNegocio"));
				this.jInternalFrameReporteDinamicoTipoUbicacionNegocio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoUbicacionNegocio"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoUbicacionNegocio"));				
			//this.jButtonGenerarReporteDinamicoTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoUbicacionNegocio"));
			//this.jButtonGenerarExcelReporteDinamicoTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoUbicacionNegocio"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoUbicacionNegocio!=null) {
				this.jInternalFrameImportacionTipoUbicacionNegocio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoUbicacionNegocio"));
				this.jInternalFrameImportacionTipoUbicacionNegocio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoUbicacionNegocio"));
				this.jInternalFrameImportacionTipoUbicacionNegocio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoUbicacionNegocio"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoUbicacionNegocio"));
			
			this.jButtonAbrirOrderByToolBarTipoUbicacionNegocio.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoUbicacionNegocio"));			
			
			if(this.jInternalFrameOrderByTipoUbicacionNegocio!=null) {
				this.jInternalFrameOrderByTipoUbicacionNegocio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoUbicacionNegocio"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTabbedPaneRelacionesTipoUbicacionNegocio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoUbicacionNegocio"));
		
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
            		closingInternalFrameTipoUbicacionNegocio();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoUbicacionNegocio = (JInternalFrameBase)event.getSource();
	            	
	            TipoUbicacionNegocioBeanSwingJInternalFrame jInternalFrameParent=(TipoUbicacionNegocioBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoUbicacionNegocio.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoUbicacionNegocioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoUbicacionNegocio.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoUbicacionNegocioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoUbicacionNegocio.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoUbicacionNegocio.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoUbicacionNegocioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoUbicacionNegocioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoUbicacionNegocioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoUbicacionNegocio";
		inputMap = this.jButtonNuevoTipoUbicacionNegocio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoUbicacionNegocio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoUbicacionNegocioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoUbicacionNegocioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoUbicacionNegocioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoUbicacionNegocioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoUbicacionNegocio";
		inputMap = this.jButtonNuevoRelacionesTipoUbicacionNegocio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoUbicacionNegocio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoUbicacionNegocioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoUbicacionNegocio";
		inputMap = this.jButtonModificarTipoUbicacionNegocio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoUbicacionNegocio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoUbicacionNegocioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoUbicacionNegocio";
		inputMap = this.jButtonActualizarTipoUbicacionNegocio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoUbicacionNegocio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoUbicacionNegocioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoUbicacionNegocio";
		inputMap = this.jButtonEliminarTipoUbicacionNegocio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoUbicacionNegocio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoUbicacionNegocioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoUbicacionNegocio";
		inputMap = this.jButtonCancelarTipoUbicacionNegocio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoUbicacionNegocio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoUbicacionNegocioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoUbicacionNegocio";
		inputMap = this.jButtonCerrarTipoUbicacionNegocio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoUbicacionNegocio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoUbicacionNegocioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonGuardarCambiosTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoUbicacionNegocio";
		inputMap = this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonGuardarCambiosTipoUbicacionNegocio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonGuardarCambiosTipoUbicacionNegocio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoUbicacionNegocioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoUbicacionNegocio.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoUbicacionNegocioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoUbicacionNegocio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoUbicacionNegocioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoUbicacionNegocio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoUbicacionNegocioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoUbicacionNegocio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoUbicacionNegocioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonidTipoUbicacionNegocioBusqueda.addActionListener(new ButtonActionListener(this,"idTipoUbicacionNegocioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonid_empresaTipoUbicacionNegocioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoUbicacionNegocioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonid_empresaTipoUbicacionNegocioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoUbicacionNegocioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtoncodigoTipoUbicacionNegocioBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoUbicacionNegocioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jButtonnombreTipoUbicacionNegocioBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoUbicacionNegocioBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoUbicacionNegocio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoUbicacionNegocioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoUbicacionNegocioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoUbicacionNegocio.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoUbicacionNegocio(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoUbicacionNegocio tipoubicacionnegocioAux:this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios()) {
					tipoubicacionnegocioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoUbicacionNegocio tipoubicacionnegocioAux:tipoubicacionnegocios) {
					tipoubicacionnegocioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoUbicacionNegocioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoUbicacionNegocio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoUbicacionNegocio tipoubicacionnegocioAux:this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios()) {
						tipoubicacionnegocioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoUbicacionNegocio tipoubicacionnegocioAux:tipoubicacionnegocios) {
						tipoubicacionnegocioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoUbicacionNegocio tipoubicacionnegocioAux:this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoUbicacionNegocio tipoubicacionnegocioAux:tipoubicacionnegocios) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoUbicacionNegocio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoUbicacionNegocio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoUbicacionNegocio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoUbicacionNegocio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoUbicacionNegocioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoUbicacionNegocio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoUbicacionNegocio.getSelectedRows();
			
			TipoUbicacionNegocio tipoubicacionnegocioLocal=new TipoUbicacionNegocio();
			
			//this.seleccionarTodosTipoUbicacionNegocio(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoubicacionnegocioLocal =(TipoUbicacionNegocio) this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios().toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoubicacionnegocioLocal =(TipoUbicacionNegocio) this.tipoubicacionnegocios.toArray()[this.jTableDatosTipoUbicacionNegocio.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoubicacionnegocioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoUbicacionNegocio tipoubicacionnegocioAux:this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios()) {
						tipoubicacionnegocioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoUbicacionNegocio tipoubicacionnegocioAux:tipoubicacionnegocios) {
						tipoubicacionnegocioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoUbicacionNegocio(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoUbicacionNegocio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoUbicacionNegocio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoUbicacionNegocio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoUbicacionNegocioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoUbicacionNegocioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoUbicacionNegocioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoUbicacionNegocio(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoUbicacionNegocio.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoUbicacionNegocio tipoubicacionnegocioAux:this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios()) {
				
						if(sTipoSeleccionar.equals(TipoUbicacionNegocioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoubicacionnegocioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoUbicacionNegocioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoubicacionnegocioAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoUbicacionNegocio tipoubicacionnegocioAux:tipoubicacionnegocios) {
					
						if(sTipoSeleccionar.equals(TipoUbicacionNegocioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoubicacionnegocioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoUbicacionNegocioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoubicacionnegocioAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoUbicacionNegocio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoUbicacionNegocioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoUbicacionNegocio(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoUbicacionNegocio=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoUbicacionNegocio.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxTiposAccionesFormularioTipoUbicacionNegocio.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoUbicacionNegocio) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoUbicacionNegocio(conSplash);
				
					this.generarReporteTipoUbicacionNegociosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoUbicacionNegocio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxTiposAccionesFormularioTipoUbicacionNegocio.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoUbicacionNegociosSeleccionados();
				//this.jComboBoxTiposAccionesTipoUbicacionNegocio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoUbicacionNegociosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoUbicacionNegocio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoUbicacionNegociosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoUbicacionNegocio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoUbicacionNegocio();
				
				this.exportarTipoUbicacionNegociosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoUbicacionNegocio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxTiposAccionesFormularioTipoUbicacionNegocio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoUbicacionNegocios();
				//this.importarTipoUbicacionNegocios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoUbicacionNegocio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxTiposAccionesFormularioTipoUbicacionNegocio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoUbicacionNegocio();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoUbicacionNegociosSeleccionados();
				//this.jComboBoxTiposAccionesTipoUbicacionNegocio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Ubicacion Negocio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoUbicacionNegocio();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoUbicacionNegocio)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoUbicacionNegocio(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Ubicacion Negocio",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoUbicacionNegocio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxTiposAccionesFormularioTipoUbicacionNegocio.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoUbicacionNegocio();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoUbicacionNegocio(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoUbicacionNegocioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoUbicacionNegocio();
			
			if(this.jInternalFrameDetalleFormTipoUbicacionNegocio==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoUbicacionNegocio> tipoubicacionnegociosSeleccionados=new ArrayList<TipoUbicacionNegocio>();		
			TipoUbicacionNegocio tipoubicacionnegocio=new TipoUbicacionNegocio();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoUbicacionNegocio(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoUbicacionNegocio.getSelectedItem();
			
			
			
			
			tipoubicacionnegociosSeleccionados=this.getTipoUbicacionNegociosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoubicacionnegociosSeleccionados.size()==1) {
				for(TipoUbicacionNegocio tipoubicacionnegocioAux:tipoubicacionnegociosSeleccionados) {
					tipoubicacionnegocio=tipoubicacionnegocioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoUbicacionNegocio();
			
      		//this.finishProcessTipoUbicacionNegocio(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoUbicacionNegocioReturnGeneral() throws Exception {
		if(this.tipoubicacionnegocioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoubicacionnegocioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoubicacionnegocioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoubicacionnegocioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoubicacionnegocioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoubicacionnegocioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoUbicacionNegocio(false);
		}
		
		if(this.tipoubicacionnegocioReturnGeneral.getConRetornoLista() || this.tipoubicacionnegocioReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoubicacionnegocioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoubicacionnegocioLogic.setTipoUbicacionNegocios(this.tipoubicacionnegocioReturnGeneral.getTipoUbicacionNegocios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoubicacionnegocioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoubicacionnegocioLogic.setTipoUbicacionNegocio(this.tipoubicacionnegocioReturnGeneral.getTipoUbicacionNegocio());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoUbicacionNegocio(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoUbicacionNegocio() throws Exception {
		
		
	}
	
	public ArrayList<TipoUbicacionNegocio> getTipoUbicacionNegociosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoUbicacionNegocio> tipoubicacionnegociosSeleccionados=new ArrayList<TipoUbicacionNegocio>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoUbicacionNegocio) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoUbicacionNegocio tipoubicacionnegocioAux:tipoubicacionnegocioLogic.getTipoUbicacionNegocios()) {
					if(tipoubicacionnegocioAux.getIsSelected()) {
						tipoubicacionnegociosSeleccionados.add(tipoubicacionnegocioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoUbicacionNegocio tipoubicacionnegocioAux:this.tipoubicacionnegocios) {
					if(tipoubicacionnegocioAux.getIsSelected()) {
						tipoubicacionnegociosSeleccionados.add(tipoubicacionnegocioAux);				
					}
				}
			}
			
			if(tipoubicacionnegociosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoubicacionnegociosSeleccionados.addAll(this.tipoubicacionnegocioLogic.getTipoUbicacionNegocios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoubicacionnegociosSeleccionados.addAll(this.tipoubicacionnegocios);				
					}
				}
			}
		} else {
			tipoubicacionnegociosSeleccionados.add(this.tipoubicacionnegocio);
		}
		
		return tipoubicacionnegociosSeleccionados;
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
	
	public void generarReporteTipoUbicacionNegociosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoUbicacionNegociosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoUbicacionNegociosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoUbicacionNegociosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoUbicacionNegociosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Ubicacion Negocio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoUbicacionNegociosSeleccionados() throws Exception {
		ArrayList<TipoUbicacionNegocio> tipoubicacionnegociosSeleccionados=new ArrayList<TipoUbicacionNegocio>();		
		
		tipoubicacionnegociosSeleccionados=this.getTipoUbicacionNegociosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoUbicacionNegocios("Todos",tipoubicacionnegociosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoUbicacionNegociosSeleccionados() throws Exception {
		ArrayList<TipoUbicacionNegocio> tipoubicacionnegociosSeleccionados=new ArrayList<TipoUbicacionNegocio>();		
		
		tipoubicacionnegociosSeleccionados=this.getTipoUbicacionNegociosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoUbicacionNegocios("Todos",tipoubicacionnegociosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoUbicacionNegociosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoUbicacionNegocio> tipoubicacionnegociosSeleccionados=new ArrayList<TipoUbicacionNegocio>();
		
		tipoubicacionnegociosSeleccionados=this.getTipoUbicacionNegociosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoUbicacionNegocios("Todos",tipoubicacionnegociosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoUbicacionNegociosSeleccionados() throws Exception {
		ArrayList<TipoUbicacionNegocio> tipoubicacionnegociosSeleccionados=new ArrayList<TipoUbicacionNegocio>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoUbicacionNegocio();
		
		
		tipoubicacionnegociosSeleccionados=this.getTipoUbicacionNegociosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoUbicacionNegocio();
		
		
		//this.generarReporteTipoUbicacionNegocios("Todos",tipoubicacionnegociosSeleccionados ,tipoubicacionnegocioImplementable,tipoubicacionnegocioImplementableHome);
	}
	
	public void mostrarImportacionTipoUbicacionNegocios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoUbicacionNegocio();
		
		this.abrirFrameImportacionTipoUbicacionNegocio();		
		
			
		//this.generarReporteTipoUbicacionNegocios("Todos",tipoubicacionnegociosSeleccionados ,tipoubicacionnegocioImplementable,tipoubicacionnegocioImplementableHome);
	}
	
	public void importarTipoUbicacionNegocios() throws Exception {		
	
	}
	
	public void exportarTipoUbicacionNegociosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoUbicacionNegociosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoUbicacionNegociosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoUbicacionNegociosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Ubicacion Negocio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoUbicacionNegociosSeleccionados() throws Exception {
		ArrayList<TipoUbicacionNegocio> tipoubicacionnegociosSeleccionados=new ArrayList<TipoUbicacionNegocio>();		
		
		tipoubicacionnegociosSeleccionados=this.getTipoUbicacionNegociosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoubicacionnegocio."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoUbicacionNegocio(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoUbicacionNegocio tipoubicacionnegocioAux:tipoubicacionnegociosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoUbicacionNegocio(tipoubicacionnegocioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoubicacionnegocioAux.setsDetalleGeneralEntityReporte(tipoubicacionnegocioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Ubicacion Negocio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoUbicacionNegocio(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoUbicacionNegocioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoUbicacionNegocioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoUbicacionNegocioConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoUbicacionNegocioConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoUbicacionNegocioConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoUbicacionNegocio(TipoUbicacionNegocio tipoubicacionnegocio,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoubicacionnegocio.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoubicacionnegocio.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoubicacionnegocio.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoubicacionnegocio.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoubicacionnegocio.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoUbicacionNegociosSeleccionados() throws Exception {
		ArrayList<TipoUbicacionNegocio> tipoubicacionnegociosSeleccionados=new ArrayList<TipoUbicacionNegocio>();		
		
		tipoubicacionnegociosSeleccionados=this.getTipoUbicacionNegociosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoubicacionnegocio.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoUbicacionNegocios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoUbicacionNegocio(row);				
				iRow++;
			}				
			
			for(TipoUbicacionNegocio tipoubicacionnegocioAux:tipoubicacionnegociosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoUbicacionNegocio(tipoubicacionnegocioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Ubicacion Negocio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoUbicacionNegociosSeleccionados() throws Exception {
		ArrayList<TipoUbicacionNegocio> tipoubicacionnegociosSeleccionados=new ArrayList<TipoUbicacionNegocio>();		
		
		tipoubicacionnegociosSeleccionados=this.getTipoUbicacionNegociosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoubicacionnegocio.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoubicacionnegocios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoubicacionnegocio");
			//elementRoot.appendChild(element);
		
			for(TipoUbicacionNegocio tipoubicacionnegocioAux:tipoubicacionnegociosSeleccionados) {
				element = document.createElement("tipoubicacionnegocio");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoUbicacionNegocio(tipoubicacionnegocioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Ubicacion Negocio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoUbicacionNegocio(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoUbicacionNegocioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoUbicacionNegocioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoUbicacionNegocioConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoUbicacionNegocioConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoUbicacionNegocioConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoUbicacionNegocio(TipoUbicacionNegocio tipoubicacionnegocio,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoubicacionnegocio.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoubicacionnegocio.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoubicacionnegocio.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoubicacionnegocio.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoUbicacionNegocio(TipoUbicacionNegocio tipoubicacionnegocio,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoUbicacionNegocioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoubicacionnegocio.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoUbicacionNegocioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoubicacionnegocio.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoUbicacionNegocioConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoubicacionnegocio.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoUbicacionNegocioConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoubicacionnegocio.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoUbicacionNegocioConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoubicacionnegocio.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoUbicacionNegociosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoUbicacionNegocio> tipoubicacionnegociosSeleccionados=new ArrayList<TipoUbicacionNegocio>();
		
		tipoubicacionnegociosSeleccionados=this.getTipoUbicacionNegociosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoUbicacionNegocio(tipoubicacionnegociosSeleccionados);
		
		this.generarReporteTipoUbicacionNegocios("Todos",tipoubicacionnegociosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoUbicacionNegocio(ArrayList<TipoUbicacionNegocio> tipoubicacionnegociosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoUbicacionNegocio tipoubicacionnegocioAux:tipoubicacionnegociosSeleccionados) {
				tipoubicacionnegocioAux.setsDetalleGeneralEntityReporte(tipoubicacionnegocioAux.toString());
			
				if(sTipoSeleccionar.equals(TipoUbicacionNegocioConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoubicacionnegocioAux.setsDescripcionGeneralEntityReporte1(tipoubicacionnegocioAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoUbicacionNegocioConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoubicacionnegocioAux.setsDescripcionGeneralEntityReporte1(tipoubicacionnegocioAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoUbicacionNegocioConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoubicacionnegocioAux.setsDescripcionGeneralEntityReporte1(tipoubicacionnegocioAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoUbicacionNegocioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoUbicacionNegocio(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoUbicacionNegocio=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio=true;
				this.isVisibilidadCeldaGuardarCambiosTipoUbicacionNegocio=true;
			}
			
			this.isVisibilidadCeldaModificarTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaActualizarTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaEliminarTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaCancelarTipoUbicacionNegocio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoUbicacionNegocio=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoUbicacionNegocio=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaModificarTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaActualizarTipoUbicacionNegocio=true;
			this.isVisibilidadCeldaEliminarTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaCancelarTipoUbicacionNegocio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoUbicacionNegocio=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoUbicacionNegocio=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaModificarTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaActualizarTipoUbicacionNegocio=true;
			this.isVisibilidadCeldaEliminarTipoUbicacionNegocio=true;
			this.isVisibilidadCeldaCancelarTipoUbicacionNegocio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoUbicacionNegocio=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoUbicacionNegocio=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaModificarTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaActualizarTipoUbicacionNegocio=true;
			this.isVisibilidadCeldaEliminarTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaCancelarTipoUbicacionNegocio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoUbicacionNegocio=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoUbicacionNegocio=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoUbicacionNegocio=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio=true;
			this.isVisibilidadCeldaGuardarCambiosTipoUbicacionNegocio=true;
			this.isVisibilidadCeldaModificarTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaActualizarTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaEliminarTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaCancelarTipoUbicacionNegocio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoUbicacionNegocio=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoUbicacionNegocio=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaActualizarTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaEliminarTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaCancelarTipoUbicacionNegocio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoUbicacionNegocio=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoUbicacionNegocio=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaModificarTipoUbicacionNegocio=true;
			this.isVisibilidadCeldaActualizarTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaEliminarTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaCancelarTipoUbicacionNegocio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoUbicacionNegocio=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoUbicacionNegocio=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoUbicacionNegocioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoUbicacionNegocio=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio=true;
			this.isVisibilidadCeldaGuardarCambiosTipoUbicacionNegocio=true;
		} else {
			this.actualizarEstadoPanelsTipoUbicacionNegocio(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoUbicacionNegocio=false;
			//this.isVisibilidadCeldaVerFormTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaDuplicarTipoUbicacionNegocio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoubicacionnegocioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoUbicacionNegocio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
			if(!tipoubicacionnegocioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio=false;												
			}
			
			this.jButtonCerrarTipoUbicacionNegocio.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoUbicacionNegocio=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoubicacionnegocio)) {
			this.isVisibilidadCeldaActualizarTipoUbicacionNegocio=false;
			this.isVisibilidadCeldaEliminarTipoUbicacionNegocio=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoUbicacionNegocio() {
	}
	
	public void actualizarEstadoPanelsTipoUbicacionNegocio(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoUbicacionNegocio!=null) {
				this.jScrollPanelDatosEdicionTipoUbicacionNegocio.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoUbicacionNegocio!=null) {
				this.jTabbedPaneBusquedasTipoUbicacionNegocio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoUbicacionNegocio!=null) {
				this.jScrollPanelDatosTipoUbicacionNegocio.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoUbicacionNegocio!=null) {
				this.jPanelPaginacionTipoUbicacionNegocio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoUbicacionNegocio!=null) {
				this.jPanelParametrosReportesTipoUbicacionNegocio.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoUbicacionNegocio!=null) {
				this.jScrollPanelDatosEdicionTipoUbicacionNegocio.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoUbicacionNegocio!=null) {
				this.jTabbedPaneBusquedasTipoUbicacionNegocio.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoUbicacionNegocio!=null) {
				this.jScrollPanelDatosTipoUbicacionNegocio.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoUbicacionNegocio!=null) {
				this.jPanelPaginacionTipoUbicacionNegocio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoUbicacionNegocio!=null) {
				this.jPanelParametrosReportesTipoUbicacionNegocio.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoUbicacionNegocio!=null) {
				this.jScrollPanelDatosEdicionTipoUbicacionNegocio.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoUbicacionNegocio!=null) {
				this.jTabbedPaneBusquedasTipoUbicacionNegocio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoUbicacionNegocio!=null) {
				this.jScrollPanelDatosTipoUbicacionNegocio.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoUbicacionNegocio!=null) {
				this.jPanelPaginacionTipoUbicacionNegocio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoUbicacionNegocio!=null) {
				this.jPanelParametrosReportesTipoUbicacionNegocio.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoUbicacionNegocio!=null) {
				this.jScrollPanelDatosEdicionTipoUbicacionNegocio.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoUbicacionNegocio!=null) {
				this.jTabbedPaneBusquedasTipoUbicacionNegocio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoUbicacionNegocio!=null) {
				this.jScrollPanelDatosTipoUbicacionNegocio.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoUbicacionNegocio!=null) {
				this.jPanelPaginacionTipoUbicacionNegocio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoUbicacionNegocio!=null) {
				this.jPanelParametrosReportesTipoUbicacionNegocio.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoUbicacionNegocio!=null) {
				this.jScrollPanelDatosEdicionTipoUbicacionNegocio.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoUbicacionNegocio!=null) {
				this.jTabbedPaneBusquedasTipoUbicacionNegocio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoUbicacionNegocio!=null) {
				this.jScrollPanelDatosTipoUbicacionNegocio.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoUbicacionNegocio!=null) {
				this.jPanelPaginacionTipoUbicacionNegocio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoUbicacionNegocio!=null) {
				this.jPanelParametrosReportesTipoUbicacionNegocio.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoUbicacionNegocio!=null) {
				this.jScrollPanelDatosEdicionTipoUbicacionNegocio.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoUbicacionNegocio!=null) {
				this.jTabbedPaneBusquedasTipoUbicacionNegocio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoUbicacionNegocio!=null) {
				this.jScrollPanelDatosTipoUbicacionNegocio.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoUbicacionNegocio!=null) {
				this.jPanelPaginacionTipoUbicacionNegocio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoUbicacionNegocio!=null) {
				this.jPanelParametrosReportesTipoUbicacionNegocio.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoUbicacionNegocio!=null) {
				this.jScrollPanelDatosEdicionTipoUbicacionNegocio.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoUbicacionNegocio!=null) {
				this.jTabbedPaneBusquedasTipoUbicacionNegocio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoUbicacionNegocio!=null) {
				this.jScrollPanelDatosTipoUbicacionNegocio.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoUbicacionNegocio!=null) {
				this.jPanelPaginacionTipoUbicacionNegocio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoUbicacionNegocio!=null) {
				this.jPanelParametrosReportesTipoUbicacionNegocio.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoUbicacionNegocio!=null) {
					this.jTabbedPaneBusquedasTipoUbicacionNegocio.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoUbicacionNegocio!=null) {
				this.jPanelParametrosReportesTipoUbicacionNegocio.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoUbicacionNegocio!=null) {
				this.jTabbedPaneBusquedasTipoUbicacionNegocio.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoUbicacionNegocio!=null) {
				this.jPanelParametrosReportesTipoUbicacionNegocio.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoUbicacionNegocioSessionBean tipoubicacionnegocioSessionBean=new TipoUbicacionNegocioSessionBean();
		
		if(this.tipoubicacionnegocioSessionBean==null) {
			this.tipoubicacionnegocioSessionBean=new TipoUbicacionNegocioSessionBean();
		}
		
		this.tipoubicacionnegocioSessionBean.setsUltimaBusquedaTipoUbicacionNegocio(this.getsAccionBusqueda());
		this.tipoubicacionnegocioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoubicacionnegocioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoubicacionnegocioSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoUbicacionNegocioSessionBean tipoubicacionnegocioSessionBean=new TipoUbicacionNegocioSessionBean();
		
		if(this.tipoubicacionnegocioSessionBean==null) {
			this.tipoubicacionnegocioSessionBean=new TipoUbicacionNegocioSessionBean();
		}
		
		if(this.tipoubicacionnegocioSessionBean.getsUltimaBusquedaTipoUbicacionNegocio()!=null&&!this.tipoubicacionnegocioSessionBean.getsUltimaBusquedaTipoUbicacionNegocio().equals("")) {
			this.setsAccionBusqueda(tipoubicacionnegocioSessionBean.getsUltimaBusquedaTipoUbicacionNegocio());
			this.setiNumeroPaginacion(tipoubicacionnegocioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoubicacionnegocioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoubicacionnegocioSessionBean.getid_empresa());
				tipoubicacionnegocioSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoubicacionnegocioSessionBean.setsUltimaBusquedaTipoUbicacionNegocio("");
		this.tipoubicacionnegocioSessionBean.setiNumeroPaginacion(TipoUbicacionNegocioConstantesFunciones.INUMEROPAGINACION);
		this.tipoubicacionnegocioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoUbicacionNegocio(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoUbicacionNegocio() {
		this.updateBorderResaltarBusquedasFormularioTipoUbicacionNegocio();
		this.updateVisibilidadBusquedasFormularioTipoUbicacionNegocio();
		this.updateHabilitarBusquedasFormularioTipoUbicacionNegocio();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoUbicacionNegocio() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoUbicacionNegocio.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoUbicacionNegocio() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoUbicacionNegocio.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoUbicacionNegocio() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoUbicacionNegocio.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoUbicacionNegocio(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoUbicacionNegocio.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoUbicacionNegocio() throws Exception {

		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoUbicacionNegocio();
		this.updateVisibilidadResaltarControlesFormularioTipoUbicacionNegocio();
		this.updateHabilitarResaltarControlesFormularioTipoUbicacionNegocio();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoUbicacionNegocio() throws Exception {
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoubicacionnegocioConstantesFunciones.resaltaridTipoUbicacionNegocio!=null && this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {this.jInternalFrameDetalleFormTipoUbicacionNegocio.jLabelidTipoUbicacionNegocio.setBorder(this.tipoubicacionnegocioConstantesFunciones.resaltaridTipoUbicacionNegocio);}
		if(this.tipoubicacionnegocioConstantesFunciones.resaltarid_empresaTipoUbicacionNegocio!=null && this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxid_empresaTipoUbicacionNegocio.setBorder(this.tipoubicacionnegocioConstantesFunciones.resaltarid_empresaTipoUbicacionNegocio);}
		if(this.tipoubicacionnegocioConstantesFunciones.resaltarcodigoTipoUbicacionNegocio!=null && this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTextFieldcodigoTipoUbicacionNegocio.setBorder(this.tipoubicacionnegocioConstantesFunciones.resaltarcodigoTipoUbicacionNegocio);}
		if(this.tipoubicacionnegocioConstantesFunciones.resaltarnombreTipoUbicacionNegocio!=null && this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTextAreanombreTipoUbicacionNegocio.setBorder(this.tipoubicacionnegocioConstantesFunciones.resaltarnombreTipoUbicacionNegocio);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoUbicacionNegocio() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {
	
		//this.jInternalFrameDetalleFormTipoUbicacionNegocio.jLabelidTipoUbicacionNegocio.setVisible(this.tipoubicacionnegocioConstantesFunciones.mostraridTipoUbicacionNegocio);
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jPanelidTipoUbicacionNegocio.setVisible(this.tipoubicacionnegocioConstantesFunciones.mostraridTipoUbicacionNegocio);
		//this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxid_empresaTipoUbicacionNegocio.setVisible(this.tipoubicacionnegocioConstantesFunciones.mostrarid_empresaTipoUbicacionNegocio);
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jPanelid_empresaTipoUbicacionNegocio.setVisible(this.tipoubicacionnegocioConstantesFunciones.mostrarid_empresaTipoUbicacionNegocio);
		//this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTextFieldcodigoTipoUbicacionNegocio.setVisible(this.tipoubicacionnegocioConstantesFunciones.mostrarcodigoTipoUbicacionNegocio);
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jPanelcodigoTipoUbicacionNegocio.setVisible(this.tipoubicacionnegocioConstantesFunciones.mostrarcodigoTipoUbicacionNegocio);
		//this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTextAreanombreTipoUbicacionNegocio.setVisible(this.tipoubicacionnegocioConstantesFunciones.mostrarnombreTipoUbicacionNegocio);
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jPanelnombreTipoUbicacionNegocio.setVisible(this.tipoubicacionnegocioConstantesFunciones.mostrarnombreTipoUbicacionNegocio);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoUbicacionNegocio() throws Exception {
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoUbicacionNegocio!=null) {
	
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jLabelidTipoUbicacionNegocio.setEnabled(this.tipoubicacionnegocioConstantesFunciones.activaridTipoUbicacionNegocio);
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jComboBoxid_empresaTipoUbicacionNegocio.setEnabled(this.tipoubicacionnegocioConstantesFunciones.activarid_empresaTipoUbicacionNegocio);
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTextFieldcodigoTipoUbicacionNegocio.setEnabled(this.tipoubicacionnegocioConstantesFunciones.activarcodigoTipoUbicacionNegocio);
		this.jInternalFrameDetalleFormTipoUbicacionNegocio.jTextAreanombreTipoUbicacionNegocio.setEnabled(this.tipoubicacionnegocioConstantesFunciones.activarnombreTipoUbicacionNegocio);
		}
	}
	
		
}