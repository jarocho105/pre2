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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




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

import com.bydan.erp.nomina.util.TipoSeguroConstantesFunciones;
import com.bydan.erp.nomina.util.TipoSeguroParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoSeguroParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoSeguroBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
public class TipoSeguroBeanSwingJInternalFrame extends TipoSeguroJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoSeguroBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoSeguro> tiposeguroValidator = new ClassValidator<TipoSeguro>(TipoSeguro.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoSeguro tiposeguro;	
	public TipoSeguro tiposeguroAux;
	public TipoSeguro tiposeguroAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoSeguro tiposeguroTotales;
	public Long idTipoSeguroActual;
	public Long iIdNuevoTipoSeguro=0L;
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
	
	public Boolean isPermisoTodoTipoSeguro;
	public Boolean isPermisoNuevoTipoSeguro;
	public Boolean isPermisoActualizarTipoSeguro;
	public Boolean isPermisoActualizarOriginalTipoSeguro;
	public Boolean isPermisoEliminarTipoSeguro;
	public Boolean isPermisoGuardarCambiosTipoSeguro;
	public Boolean isPermisoConsultaTipoSeguro;
	public Boolean isPermisoBusquedaTipoSeguro;
	public Boolean isPermisoReporteTipoSeguro;
	public Boolean isPermisoPaginacionMedioTipoSeguro;
	public Boolean isPermisoPaginacionAltoTipoSeguro;
	public Boolean isPermisoPaginacionTodoTipoSeguro;
	public Boolean isPermisoCopiarTipoSeguro;
	public Boolean isPermisoVerFormTipoSeguro;
	public Boolean isPermisoDuplicarTipoSeguro;
	public Boolean isPermisoOrdenTipoSeguro;
	
	
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
	
	public TipoSeguroParameterReturnGeneral tiposeguroReturnGeneral;
	public TipoSeguroParameterReturnGeneral tiposeguroParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoSeguro=false;
	public Boolean esParaAccionDesdeFormularioTipoSeguro=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoSeguroSessionBeanAdditional tiposeguroSessionBeanAdditional=null;
	
	public TipoSeguroSessionBeanAdditional getTipoSeguroSessionBeanAdditional() {
		return this.tiposeguroSessionBeanAdditional;
	}
	
	public void setTipoSeguroSessionBeanAdditional(TipoSeguroSessionBeanAdditional tiposeguroSessionBeanAdditional) {
		try {
			this.tiposeguroSessionBeanAdditional=tiposeguroSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoSeguroBeanSwingJInternalFrameAdditional tiposeguroBeanSwingJInternalFrameAdditional=null;
	//public class TipoSeguroBeanSwingJInternalFrame
	
	public TipoSeguroBeanSwingJInternalFrameAdditional getTipoSeguroBeanSwingJInternalFrameAdditional() {
		return this.tiposeguroBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoSeguroBeanSwingJInternalFrameAdditional(TipoSeguroBeanSwingJInternalFrameAdditional tiposeguroBeanSwingJInternalFrameAdditional) {
		try {
			this.tiposeguroBeanSwingJInternalFrameAdditional=tiposeguroBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoSeguroLogic tiposeguroLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoSeguro tiposeguroBean;
	public TipoSeguroConstantesFunciones tiposeguroConstantesFunciones;
	//public TipoSeguroParameterReturnGeneral tiposeguroReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoSeguro> tiposeguros;	
	//public List<TipoSeguro> tiposegurosEliminados;
	//public List<TipoSeguro> tiposegurosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoSeguro=false;
	public Boolean isVisibilidadCeldaDuplicarTipoSeguro=true;
	public Boolean isVisibilidadCeldaCopiarTipoSeguro=true;
	public Boolean isVisibilidadCeldaVerFormTipoSeguro=true;
	public Boolean isVisibilidadCeldaOrdenTipoSeguro=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoSeguro=false;
	public Boolean isVisibilidadCeldaModificarTipoSeguro=false;
	public Boolean isVisibilidadCeldaActualizarTipoSeguro=false;
	public Boolean isVisibilidadCeldaEliminarTipoSeguro=false;
	public Boolean isVisibilidadCeldaCancelarTipoSeguro=false;
	public Boolean isVisibilidadCeldaGuardarTipoSeguro=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoSeguro=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoSeguro() {
		return this.iIdNuevoTipoSeguro;
	}

	public void setiIdNuevoTipoSeguro(Long iIdNuevoTipoSeguro) {
		this.iIdNuevoTipoSeguro = iIdNuevoTipoSeguro;
	}
	
	public Long getidTipoSeguroActual() {
		return this.idTipoSeguroActual;
	}

	public void setidTipoSeguroActual(Long idTipoSeguroActual) {
		this.idTipoSeguroActual = idTipoSeguroActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoSeguro gettiposeguro() {
		return this.tiposeguro;
	}

	public void settiposeguro(TipoSeguro tiposeguro) {
		this.tiposeguro = tiposeguro;
	}
	
	public TipoSeguro gettiposeguroAux() {
		return this.tiposeguroAux;
	}

	public void settiposeguroAux(TipoSeguro tiposeguroAux) {
		this.tiposeguroAux = tiposeguroAux;
	}				
	
	public TipoSeguro gettiposeguroAnterior() {
		return this.tiposeguroAnterior;
	}

	public void settiposeguroAnterior(TipoSeguro tiposeguroAnterior) {
		this.tiposeguroAnterior = tiposeguroAnterior;
	}	
	
	public TipoSeguro gettiposeguroTotales() {
		return this.tiposeguroTotales;
	}

	public void settiposeguroTotales(TipoSeguro tiposeguroTotales) {
		this.tiposeguroTotales = tiposeguroTotales;
	}	
	
	public TipoSeguro gettiposeguroBean() {
		return this.tiposeguroBean;
	}

	public void settiposeguroBean(TipoSeguro tiposeguroBean) {
		this.tiposeguroBean = tiposeguroBean;
	}	
	
	public TipoSeguroParameterReturnGeneral gettiposeguroReturnGeneral() {
		return this.tiposeguroReturnGeneral;
	}

	public void settiposeguroReturnGeneral(TipoSeguroParameterReturnGeneral tiposeguroReturnGeneral) {
		this.tiposeguroReturnGeneral = tiposeguroReturnGeneral;
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
	
	
	public TipoSeguroLogic getTipoSeguroLogic()	{		
		return tiposeguroLogic;
	}

	public void setTipoSeguroLogic(TipoSeguroLogic tiposeguroLogic) {
		this.tiposeguroLogic = tiposeguroLogic;
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
	
	public Boolean getIsEsNuevoTipoSeguro() {
		return isEsNuevoTipoSeguro;
	}

	public void setIsEsNuevoTipoSeguro(Boolean isEsNuevoTipoSeguro) {
		this.isEsNuevoTipoSeguro = isEsNuevoTipoSeguro;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoSeguro() {
		return esParaAccionDesdeFormularioTipoSeguro;
	}
	
	public void setEsParaAccionDesdeFormularioTipoSeguro(Boolean esParaAccionDesdeFormularioTipoSeguro) {
		this.esParaAccionDesdeFormularioTipoSeguro = esParaAccionDesdeFormularioTipoSeguro;
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

			if(this.tiposeguroSessionBean==null) {
				this.tiposeguroSessionBean=new TipoSeguroSessionBean();
			}

			if(!this.tiposeguroSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tiposeguroSessionBean.getlidEmpresaActual());
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

					if(this.tiposeguro!=null) {
						this.tiposeguro.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoSeguro!=null) {
						this.jInternalFrameDetalleFormTipoSeguro.jComboBoxid_empresaTipoSeguro.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoSeguro.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoSeguro!=null) {
						if(this.jInternalFrameDetalleFormTipoSeguro.jComboBoxid_empresaTipoSeguro.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoSeguro.jComboBoxid_empresaTipoSeguro.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoSeguroGenerico)throws Exception
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
				jComboBoxid_empresaTipoSeguroGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoSeguroGenerico!=null && jComboBoxid_empresaTipoSeguroGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoSeguroGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoSeguro tiposeguro,JComboBox jComboBoxid_empresaTipoSeguroGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoSeguroGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoSeguro.jComboBoxid_empresaTipoSeguro.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoSeguroGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tiposeguro.setid_empresa(empresaAux.getId());
				tiposeguro.setempresa_descripcion(TipoSeguroConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tiposeguro.setEmpresa(empresaAux);			}
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

					if(!TipoSeguroJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoSeguro!=null) { 
							this.jInternalFrameDetalleFormTipoSeguro.jComboBoxid_empresaTipoSeguro.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoSeguro.jComboBoxid_empresaTipoSeguro.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoSeguro!=null) { 
					}

					if(!TipoSeguroJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoSeguro!=null) {
							this.jInternalFrameDetalleFormTipoSeguro.jComboBoxid_empresaTipoSeguro.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoSeguro!=null) {
							this.jInternalFrameDetalleFormTipoSeguro.jComboBoxid_empresaTipoSeguro.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoSeguro() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoSeguroConstantesFunciones.refrescarForeignKeysDescripcionesTipoSeguro(this.tiposeguroLogic.getTipoSeguros());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoSeguroConstantesFunciones.refrescarForeignKeysDescripcionesTipoSeguro(this.tiposeguros);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tiposeguroLogic.setTipoSeguros(this.tiposeguros);
			tiposeguroLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoSeguroParameterReturnGeneral getTipoSeguroParameterGeneral() {
		return this.tiposeguroParameterGeneral;
	}
	
	public void setTipoSeguroParameterGeneral(TipoSeguroParameterReturnGeneral tiposeguroParameterGeneral) {
		this.tiposeguroParameterGeneral = tiposeguroParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoSeguro() {
		return isPermisoTodoTipoSeguro;
	}

	public void setIsPermisoTodoTipoSeguro(Boolean isPermisoTodoTipoSeguro) {
		this.isPermisoTodoTipoSeguro = isPermisoTodoTipoSeguro;
	}

	public Boolean getIsPermisoNuevoTipoSeguro() {
		return isPermisoNuevoTipoSeguro;
	}

	public void setIsPermisoNuevoTipoSeguro(Boolean isPermisoNuevoTipoSeguro) {
		this.isPermisoNuevoTipoSeguro = isPermisoNuevoTipoSeguro;
	}

	public Boolean getIsPermisoActualizarTipoSeguro() {
		return isPermisoActualizarTipoSeguro;
	}

	public void setIsPermisoActualizarTipoSeguro(Boolean isPermisoActualizarTipoSeguro) {
		this.isPermisoActualizarTipoSeguro = isPermisoActualizarTipoSeguro;
	}

	public Boolean getIsPermisoEliminarTipoSeguro() {
		return isPermisoEliminarTipoSeguro;
	}

	public void setIsPermisoEliminarTipoSeguro(Boolean isPermisoEliminarTipoSeguro) {
		this.isPermisoEliminarTipoSeguro = isPermisoEliminarTipoSeguro;
	}

	public Boolean getIsPermisoGuardarCambiosTipoSeguro() {
		return isPermisoGuardarCambiosTipoSeguro;
	}

	public void setIsPermisoGuardarCambiosTipoSeguro(Boolean isPermisoGuardarCambiosTipoSeguro) {
		this.isPermisoGuardarCambiosTipoSeguro = isPermisoGuardarCambiosTipoSeguro;
	}
	
	public Boolean getIsPermisoConsultaTipoSeguro() {
		return isPermisoConsultaTipoSeguro;
	}

	public void setIsPermisoConsultaTipoSeguro(Boolean isPermisoConsultaTipoSeguro) {
		this.isPermisoConsultaTipoSeguro = isPermisoConsultaTipoSeguro;
	}

	public Boolean getIsPermisoBusquedaTipoSeguro() {
		return isPermisoBusquedaTipoSeguro;
	}

	public void setIsPermisoBusquedaTipoSeguro(Boolean isPermisoBusquedaTipoSeguro) {
		this.isPermisoBusquedaTipoSeguro = isPermisoBusquedaTipoSeguro;
	}

	public Boolean getIsPermisoReporteTipoSeguro() {
		return isPermisoReporteTipoSeguro;
	}

	public void setIsPermisoReporteTipoSeguro(Boolean isPermisoReporteTipoSeguro) {
		this.isPermisoReporteTipoSeguro = isPermisoReporteTipoSeguro;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoSeguro() {
		return isPermisoPaginacionMedioTipoSeguro;
	}

	public void setIsPermisoPaginacionMedioTipoSeguro(Boolean isPermisoPaginacionMedioTipoSeguro) {
		this.isPermisoPaginacionMedioTipoSeguro = isPermisoPaginacionMedioTipoSeguro;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoSeguro() {
		return isPermisoPaginacionTodoTipoSeguro;
	}

	public void setIsPermisoPaginacionTodoTipoSeguro(Boolean isPermisoPaginacionTodoTipoSeguro) {
		this.isPermisoPaginacionTodoTipoSeguro = isPermisoPaginacionTodoTipoSeguro;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoSeguro() {
		return isPermisoPaginacionAltoTipoSeguro;
	}

	public void setIsPermisoPaginacionAltoTipoSeguro(Boolean isPermisoPaginacionAltoTipoSeguro) {
		this.isPermisoPaginacionAltoTipoSeguro = isPermisoPaginacionAltoTipoSeguro;
	}
	
	public Boolean getIsPermisoCopiarTipoSeguro() {
		return isPermisoCopiarTipoSeguro;
	}

	public void setIsPermisoCopiarTipoSeguro(Boolean isPermisoCopiarTipoSeguro) {
		this.isPermisoCopiarTipoSeguro = isPermisoCopiarTipoSeguro;
	}
	
	public Boolean getIsPermisoVerFormTipoSeguro() {
		return isPermisoVerFormTipoSeguro;
	}

	public void setIsPermisoVerFormTipoSeguro(Boolean isPermisoVerFormTipoSeguro) {
		this.isPermisoVerFormTipoSeguro = isPermisoVerFormTipoSeguro;
	}
	
	public Boolean getIsPermisoDuplicarTipoSeguro() {
		return isPermisoDuplicarTipoSeguro;
	}

	public void setIsPermisoDuplicarTipoSeguro(Boolean isPermisoDuplicarTipoSeguro) {
		this.isPermisoDuplicarTipoSeguro = isPermisoDuplicarTipoSeguro;
	}
	
	public Boolean getIsPermisoOrdenTipoSeguro() {
		return isPermisoOrdenTipoSeguro;
	}

	public void setIsPermisoOrdenTipoSeguro(Boolean isPermisoOrdenTipoSeguro) {
		this.isPermisoOrdenTipoSeguro = isPermisoOrdenTipoSeguro;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoSeguro() {
		return isVisibilidadCeldaNuevoTipoSeguro;
	}

	public void setIsVisibilidadCeldaNuevoTipoSeguro(Boolean isVisibilidadCeldaNuevoTipoSeguro) {
		this.isVisibilidadCeldaNuevoTipoSeguro = isVisibilidadCeldaNuevoTipoSeguro;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoSeguro() {
		return isVisibilidadCeldaDuplicarTipoSeguro;
	}

	public void setIsVisibilidadCeldaDuplicarTipoSeguro(Boolean isVisibilidadCeldaDuplicarTipoSeguro) {
		this.isVisibilidadCeldaDuplicarTipoSeguro = isVisibilidadCeldaDuplicarTipoSeguro;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoSeguro() {
		return isVisibilidadCeldaCopiarTipoSeguro;
	}

	public void setIsVisibilidadCeldaCopiarTipoSeguro(Boolean isVisibilidadCeldaCopiarTipoSeguro) {
		this.isVisibilidadCeldaCopiarTipoSeguro = isVisibilidadCeldaCopiarTipoSeguro;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoSeguro() {
		return isVisibilidadCeldaVerFormTipoSeguro;
	}

	public void setIsVisibilidadCeldaVerFormTipoSeguro(Boolean isVisibilidadCeldaVerFormTipoSeguro) {
		this.isVisibilidadCeldaVerFormTipoSeguro = isVisibilidadCeldaVerFormTipoSeguro;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoSeguro() {
		return isVisibilidadCeldaOrdenTipoSeguro;
	}

	public void setIsVisibilidadCeldaOrdenTipoSeguro(Boolean isVisibilidadCeldaOrdenTipoSeguro) {
		this.isVisibilidadCeldaOrdenTipoSeguro = isVisibilidadCeldaOrdenTipoSeguro;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoSeguro() {
		return isVisibilidadCeldaNuevoRelacionesTipoSeguro;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoSeguro(Boolean isVisibilidadCeldaNuevoRelacionesTipoSeguro) {
		this.isVisibilidadCeldaNuevoRelacionesTipoSeguro = isVisibilidadCeldaNuevoRelacionesTipoSeguro;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoSeguro() {
		return isVisibilidadCeldaModificarTipoSeguro;
	}

	public void setIsVisibilidadCeldaModificarTipoSeguro(Boolean isVisibilidadCeldaModificarTipoSeguro) {
		this.isVisibilidadCeldaModificarTipoSeguro = isVisibilidadCeldaModificarTipoSeguro;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoSeguro() {
		return isVisibilidadCeldaActualizarTipoSeguro;
	}

	public void setIsVisibilidadCeldaActualizarTipoSeguro(Boolean isVisibilidadCeldaActualizarTipoSeguro) {
		this.isVisibilidadCeldaActualizarTipoSeguro = isVisibilidadCeldaActualizarTipoSeguro;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoSeguro() {
		return isVisibilidadCeldaEliminarTipoSeguro;
	}

	public void setIsVisibilidadCeldaEliminarTipoSeguro(Boolean isVisibilidadCeldaEliminarTipoSeguro) {
		this.isVisibilidadCeldaEliminarTipoSeguro = isVisibilidadCeldaEliminarTipoSeguro;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoSeguro() {
		return isVisibilidadCeldaCancelarTipoSeguro;
	}

	public void setIsVisibilidadCeldaCancelarTipoSeguro(Boolean isVisibilidadCeldaCancelarTipoSeguro) {
		this.isVisibilidadCeldaCancelarTipoSeguro = isVisibilidadCeldaCancelarTipoSeguro;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoSeguro() {
		return isVisibilidadCeldaGuardarTipoSeguro;
	}

	public void setIsVisibilidadCeldaGuardarTipoSeguro(Boolean isVisibilidadCeldaGuardarTipoSeguro) {
		this.isVisibilidadCeldaGuardarTipoSeguro = isVisibilidadCeldaGuardarTipoSeguro;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoSeguro() {
		return isVisibilidadCeldaGuardarCambiosTipoSeguro;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoSeguro(Boolean isVisibilidadCeldaGuardarCambiosTipoSeguro) {
		this.isVisibilidadCeldaGuardarCambiosTipoSeguro = isVisibilidadCeldaGuardarCambiosTipoSeguro;
	}
		
	public TipoSeguroSessionBean gettiposeguroSessionBean() {
		return this.tiposeguroSessionBean;
	}
	
	public void settiposeguroSessionBean(TipoSeguroSessionBean tiposeguroSessionBean) {
		this.tiposeguroSessionBean=tiposeguroSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoSeguro(TipoSeguro tiposeguro)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tiposeguro,null);
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
	
	public void bugActualizarReferenciaActual(TipoSeguro tiposeguro,TipoSeguro tiposeguroAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoSeguro(tiposeguro);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tiposeguroAux.setId(tiposeguro.getId());
		tiposeguroAux.setVersionRow(tiposeguro.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoSeguro();
		
			int intSelectedRow = this.jTableDatosTipoSeguro.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguro =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tiposeguro =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoSeguroJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoSeguro(this.tiposeguro,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoSeguro(this.tiposeguro);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tiposeguroValidator.getInvalidValues(this.tiposeguro);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tiposeguroLogic.setDatosCliente(datosCliente);
			tiposeguroLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tiposeguroAux=new  TipoSeguro();
				
				tiposeguroAux.setIsNew(true);
				tiposeguroAux.setIsChanged(true);
				
				tiposeguroAux.setTipoSeguroOriginal(this.tiposeguro);
				
				tiposeguroAux.setId(this.tiposeguro.getId());	
				tiposeguroAux.setVersionRow(this.tiposeguro.getVersionRow());	
				tiposeguroAux.setid_empresa(this.tiposeguro.getid_empresa());	
				tiposeguroAux.setcodigo(this.tiposeguro.getcodigo());	
				tiposeguroAux.setnombre(this.tiposeguro.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiposeguroSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiposeguroSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tiposeguroAux,tiposeguroLogic.getTipoSeguros());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiposeguroAux,tiposeguros);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tiposeguroSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiposeguroSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposeguroLogic.saveTipoSeguros();//WithConnection
						//tiposeguroLogic.getSetVersionRowTipoSeguros();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiposeguro,tiposeguroAux);
					
					this.refrescarForeignKeysDescripcionesTipoSeguro();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiposeguroSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiposeguroLogic.saveTipoSeguroRelaciones(tiposeguroAux);//WithConnection
								//tiposeguroLogic.getSetVersionRowTipoSeguros();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiposeguro,tiposeguroAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiposeguroSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiposeguroSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiposeguroAux,tiposeguroLogic.getTipoSeguros());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiposeguroAux,tiposeguros);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiposeguro,tiposeguroAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tiposeguroAux=new  TipoSeguro();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tiposeguroSessionBean.getEsGuardarRelacionado() 
					|| (this.tiposeguroSessionBean.getEsGuardarRelacionado() && this.tiposeguro.getId()>=0)) {
						
					tiposeguroAux.setIsNew(false);
				}
				
				tiposeguroAux.setIsDeleted(false);
			
				tiposeguroAux.setId(this.tiposeguro.getId());	
				tiposeguroAux.setVersionRow(this.tiposeguro.getVersionRow());	
				tiposeguroAux.setid_empresa(this.tiposeguro.getid_empresa());	
				tiposeguroAux.setcodigo(this.tiposeguro.getcodigo());	
				tiposeguroAux.setnombre(this.tiposeguro.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiposeguroAux,tiposeguroLogic.getTipoSeguros());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiposeguroAux,tiposeguros);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tiposeguroSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiposeguroSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposeguroLogic.saveTipoSeguros();//WithConnection
						//tiposeguroLogic.getSetVersionRowTipoSeguros();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiposeguro,tiposeguroAux);
					
					this.refrescarForeignKeysDescripcionesTipoSeguro();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiposeguroSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiposeguroLogic.saveTipoSeguroRelaciones(tiposeguroAux);//WithConnection
								//tiposeguroLogic.getSetVersionRowTipoSeguros();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiposeguro,tiposeguroAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiposeguroSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiposeguroSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiposeguroAux,tiposeguroLogic.getTipoSeguros());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiposeguroAux,tiposeguros);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiposeguro,tiposeguroAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tiposeguroAux=new  TipoSeguro();
				
				tiposeguroAux.setIsNew(false);
				tiposeguroAux.setIsChanged(false);
				
				tiposeguroAux.setIsDeleted(true);
				
				tiposeguroAux.setId(this.tiposeguro.getId());	
				tiposeguroAux.setVersionRow(this.tiposeguro.getVersionRow());	
				tiposeguroAux.setid_empresa(this.tiposeguro.getid_empresa());	
				tiposeguroAux.setcodigo(this.tiposeguro.getcodigo());	
				tiposeguroAux.setnombre(this.tiposeguro.getnombre());	
				
				if(this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tiposeguroAux.getId()>=0) {	
						this.tiposegurosEliminados.add(tiposeguroAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tiposeguroAux,tiposeguroLogic.getTipoSeguros());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiposeguroAux,tiposeguros);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tiposeguroSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiposeguroSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposeguroLogic.saveTipoSeguros();//WithConnection
						//tiposeguroLogic.getSetVersionRowTipoSeguros();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiposeguroSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiposeguroLogic.saveTipoSeguroRelaciones(tiposeguroAux);//WithConnection
								//tiposeguroLogic.getSetVersionRowTipoSeguros();//WithConnection
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
							if(this.tiposeguroSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tiposeguroSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tiposeguroAux,tiposeguroLogic.getTipoSeguros());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tiposeguroAux,tiposeguros);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguroLogic.getTipoSeguros().addAll(this.tiposegurosEliminados);
					
					tiposeguroLogic.saveTipoSeguros();//WithConnection
					//tiposeguroLogic.getSetVersionRowTipoSeguros();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoSeguro();
				
				this.tiposegurosEliminados= new ArrayList<TipoSeguro>();		
			}
			
			if(this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposeguroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Seguro GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Seguro",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tiposeguro=tiposeguroAux;
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
      		//this.finishProcessTipoSeguro();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoSeguro tiposeguroLocal) throws Exception {
		
		if(this.tiposeguroSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoSeguro tiposeguroLocal) throws Exception {	
		if(this.tiposeguroSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tiposeguroLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoSeguroActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoSeguro.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiposeguro =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tiposeguro =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tiposeguroValidator.getInvalidValues(this.tiposeguro);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoSeguro tiposeguro,List<TipoSeguro> tiposeguros) throws Exception {
		try	{		
			TipoSeguroConstantesFunciones.actualizarLista(tiposeguro,tiposeguros,this.tiposeguroSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoSeguro tiposeguro,List<TipoSeguro> tiposeguros) throws Exception {
		try	{			
			TipoSeguroConstantesFunciones.actualizarSelectedLista(tiposeguro,tiposeguros);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoSeguro> tiposegurosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tiposegurosLocal=this.tiposeguroLogic.getTipoSeguros();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tiposegurosLocal=this.tiposeguros;
			}
			//ARCHITECTURE
		
			for(TipoSeguro tiposeguroLocal:tiposegurosLocal) {
				if(this.permiteMantenimiento(tiposeguroLocal) && tiposeguroLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoSeguroConstantesFunciones.getTipoSeguroLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoSeguroConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSeguro.jLabelid_empresaTipoSeguro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoSeguroConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSeguro.jLabelcodigoTipoSeguro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoSeguroConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSeguro.jLabelnombreTipoSeguro,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoSeguro.jLabelid_empresaTipoSeguro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoSeguro.jLabelcodigoTipoSeguro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoSeguro.jLabelnombreTipoSeguro,"");
		
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
		this.iIdNuevoTipoSeguro--;	
		
		
		this.tiposeguroAux=new TipoSeguro();
		
		this.tiposeguroAux.setId(this.iIdNuevoTipoSeguro);
		this.tiposeguroAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiposeguroLogic.getTipoSeguros().add(this.tiposeguroAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tiposeguros.add(this.tiposeguroAux);
		}
		//ARCHITECTURE
		
		this.tiposeguro=this.tiposeguroAux;
		
		if(TipoSeguroJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoSeguro(this.tiposeguro);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoSeguro(this.tiposeguro);
		}
				
		//this.setDefaultControlesTipoSeguro();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoSeguro();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoSeguro();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoSeguro();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoSeguro(this.tiposeguroBean,this.tiposeguro,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoSeguro(this.tiposeguro);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoSeguroConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tiposeguroSessionBean.getConGuardarRelaciones()) {
			classes=TipoSeguroConstantesFunciones.getClassesRelationshipsOfTipoSeguro(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tiposeguroReturnGeneral=tiposeguroLogic.procesarEventosTipoSegurosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiposeguroLogic.getTipoSeguros(),this.tiposeguro,this.tiposeguroParameterGeneral,this.isEsNuevoTipoSeguro,classes);//this.tiposeguroLogic.getTipoSeguro()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoSeguro(this.tiposeguroReturnGeneral,this.tiposeguroBean,false);
		
		if(this.tiposeguroReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoSeguro(this.tiposeguroReturnGeneral.getTipoSeguro());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoSeguro(this.tiposeguroReturnGeneral.getTipoSeguro());
		}
		
		if(this.tiposeguroReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoSeguro(this.tiposeguroReturnGeneral.getTipoSeguro(),classes);//this.tiposeguroBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoSeguro(this.tiposeguro,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoSeguro();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoSeguro();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoSeguroBeanSwingJInternalFrameAdditional.RecargarFormTipoSeguro(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoSeguro(false);
						
			if(tiposeguroSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoSeguroJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoSeguro();
			}
			
			this.actualizarVisualTableDatosTipoSeguro();
			
			this.jTableDatosTipoSeguro.setRowSelectionInterval(this.getIndiceNuevoTipoSeguro(), this.getIndiceNuevoTipoSeguro());
			
			this.seleccionarFilaTablaTipoSeguroActual();
						
			this.actualizarEstadoCeldasBotonesTipoSeguro("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoSeguro(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoSeguro.jTextFieldcodigoTipoSeguro.setEnabled(isHabilitar && this.tiposeguroConstantesFunciones.activarcodigoTipoSeguro);
		this.jInternalFrameDetalleFormTipoSeguro.jTextAreanombreTipoSeguro.setEnabled(isHabilitar && this.tiposeguroConstantesFunciones.activarnombreTipoSeguro);	
		//
		this.jInternalFrameDetalleFormTipoSeguro.jComboBoxid_empresaTipoSeguro.setEnabled(isHabilitar && this.tiposeguroConstantesFunciones.activarid_empresaTipoSeguro);
	};
	
	public void setDefaultControlesTipoSeguro() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoSeguro(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tiposeguroSessionBean.setConGuardarRelaciones(true);			
			this.tiposeguroSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoSeguro.jTabbedPaneRelacionesTipoSeguro.setVisible(true);
			
					
		} else {
			//this.tiposeguroSessionBean.setConGuardarRelaciones(false);			
			this.tiposeguroSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoSeguro.jTabbedPaneRelacionesTipoSeguro.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoSeguro() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSeguro tiposeguroAux:this.tiposeguroLogic.getTipoSeguros()) {
				if(tiposeguroAux.getId().equals(this.iIdNuevoTipoSeguro)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSeguro tiposeguroAux:this.tiposeguros) {
				if(tiposeguroAux.getId().equals(this.iIdNuevoTipoSeguro)) {
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
	
	public int getIndiceActualTipoSeguro(TipoSeguro tiposeguro,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSeguro tiposeguroAux:this.tiposeguroLogic.getTipoSeguros()) {
				if(tiposeguroAux.getId().equals(tiposeguro.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSeguro tiposeguroAux:this.tiposeguros) {
				if(tiposeguroAux.getId().equals(tiposeguro.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoSeguro(TipoSeguro tiposeguroOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSeguro tiposeguroAux:this.tiposeguroLogic.getTipoSeguros()) {
				if(tiposeguroAux.getTipoSeguroOriginal().getId().equals(tiposeguroOriginal.getId())) {
					existe=true;
					tiposeguroOriginal.setId(tiposeguroAux.getId());
					tiposeguroOriginal.setVersionRow(tiposeguroAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSeguro tiposeguroAux:this.tiposeguros) {
				if(tiposeguroAux.getTipoSeguroOriginal().getId().equals(tiposeguroOriginal.getId())) {
					existe=true;
					tiposeguroOriginal.setId(tiposeguroAux.getId());
					tiposeguroOriginal.setVersionRow(tiposeguroAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoSeguro(Boolean esParaCancelar) throws Exception {
		tiposegurosAux=new ArrayList<TipoSeguro>();
		tiposeguroAux=new TipoSeguro();
		
		if(!this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoSeguro tiposeguroAux:this.tiposeguroLogic.getTipoSeguros()) {
					if(tiposeguroAux.getId()<0) {
						tiposegurosAux.add(tiposeguroAux);
					}		
				}
				this.iIdNuevoTipoSeguro=0L;
				this.tiposeguroLogic.getTipoSeguros().removeAll(tiposegurosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoSeguro tiposeguroAux:this.tiposeguros) {
					if(tiposeguroAux.getId()<0) {
						tiposegurosAux.add(tiposeguroAux);
					}		
				}
				this.iIdNuevoTipoSeguro=0L;
				this.tiposeguros.removeAll(tiposegurosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoSeguro 
					&& this.tiposeguroLogic.getTipoSeguros().size()>0
					) {
					tiposeguroAux=this.tiposeguroLogic.getTipoSeguros().get(this.tiposeguroLogic.getTipoSeguros().size() - 1);
				
					if(tiposeguroAux.getId()<0) {
						this.tiposeguroLogic.getTipoSeguros().remove(tiposeguroAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoSeguro && this.tiposeguros.size()>0) {
					tiposeguroAux=this.tiposeguros.get(this.tiposeguros.size() - 1);
				
					if(tiposeguroAux.getId()<0) {
						this.tiposeguros.remove(tiposeguroAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoSeguro(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tiposeguro.getId()<0) {
				this.tiposeguroLogic.getTipoSeguros().remove(this.tiposeguro);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tiposeguro.getId()<0) {
				this.tiposeguros.remove(this.tiposeguro);
			}
		}			
	}
	
	public void setEstadosInicialesTipoSeguro(List<TipoSeguro> tiposegurosAux) throws Exception {
		TipoSeguroConstantesFunciones.setEstadosInicialesTipoSeguro(tiposegurosAux);
	}
	
	public void setEstadosInicialesTipoSeguro(TipoSeguro tiposeguroAux) throws Exception {
		TipoSeguroConstantesFunciones.setEstadosInicialesTipoSeguro(tiposeguroAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoSeguroActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoSeguro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoSeguroActual()) {
				if(!this.isEsNuevoTipoSeguro) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoSeguro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoSeguro=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoSeguroActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Seguro ?", "MANTENIMIENTO DE Tipo Seguro", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoSeguro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoSeguro tiposeguro) throws Exception {
		TipoSeguroConstantesFunciones.seleccionarAsignar(this.tiposeguro,tiposeguro);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoSeguro=this.isPermisoActualizarOriginalTipoSeguro;
			
			
			this.seleccionarAsignar(tiposeguro);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoSeguroConstantesFunciones.quitarEspaciosTipoSeguro(this.tiposeguro,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoSeguro("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tiposeguroSessionBean.setsFuncionBusquedaRapida(this.tiposeguroSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoSeguro) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoSeguro(esParaCancelar);				
				this.cancelarNuevoTipoSeguro(esParaCancelar);								
			}
			
			this.tiposeguro=new TipoSeguro();
			
			this.inicializarTipoSeguro();
			
			this.actualizarEstadoCeldasBotonesTipoSeguro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoSeguro() throws Exception {
		try {
			TipoSeguroConstantesFunciones.inicializarTipoSeguro(this.tiposeguro);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tiposeguroLogic.getTipoSeguros().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoSeguros(String sAccionBusqueda,List<TipoSeguro> tiposegurosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoSeguro"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoSeguroMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoSeguroMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoSeguro"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Seguros");		
		parameters.put("busquedapor", TipoSeguroConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoSeguro=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoSeguroConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoSeguroConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoSeguro=new JRBeanArrayDataSource(TipoSeguroJInternalFrame.TraerTipoSeguroBeans(tiposegurosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoSeguro);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoSeguroConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoSeguroConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoSeguroBean.TraerTipoSeguroBeans(tiposegurosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoSeguros(sAccionBusqueda,sTipoArchivoReporte,tiposegurosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoSeguros(sAccionBusqueda,sTipoArchivoReporte,tiposegurosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoSeguroActionPerformed(null);
					//this.generarExcelReporteTipoSeguros(sAccionBusqueda,sTipoArchivoReporte,tiposegurosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoSeguros(sAccionBusqueda,sTipoArchivoReporte,tiposegurosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoSeguros(sAccionBusqueda,sTipoArchivoReporte,tiposegurosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoSeguros(sAccionBusqueda,sTipoArchivoReporte,tiposegurosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoSeguros(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoSeguro> tiposegurosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposeguro";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoSeguros");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoSeguro("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoSeguro tiposeguro : tiposegurosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoSeguroConstantesFunciones.generarExcelReporteDataTipoSeguro("NORMAL",row,workbook,tiposeguro,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposeguroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Seguro",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoSeguro(String sTipo,Row row,Workbook workbook) {
		
		TipoSeguroConstantesFunciones.generarExcelReporteHeaderTipoSeguro(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoSeguros(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoSeguro> tiposegurosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposeguro_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoSeguros");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoSeguro tiposeguro : tiposegurosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoSeguroConstantesFunciones.getTipoSeguroDescripcion(tiposeguro));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoSeguroConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoSeguroConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiposeguro.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoSeguroConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoSeguroConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiposeguro.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoSeguroConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoSeguroConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiposeguro.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposeguroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Seguro",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoSeguros(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoSeguro> tiposegurosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoSeguro> tiposegurosRespaldo=null;
		
		classes=TipoSeguroConstantesFunciones.getClassesRelationshipsOfTipoSeguro(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tiposeguroLogic.setDatosCliente(this.datosCliente);
		this.tiposeguroLogic.setDatosDeep(this.datosDeep);
		this.tiposeguroLogic.setIsConDeep(true);
		
		tiposegurosRespaldo=this.tiposeguroLogic.getTipoSeguros();
		
		this.tiposeguroLogic.setTipoSeguros(tiposegurosParaReportes);	
		this.tiposeguroLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tiposegurosParaReportes=this.tiposeguroLogic.getTipoSeguros();
		this.tiposeguroLogic.setTipoSeguros(tiposegurosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposeguro_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoSeguros");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoSeguro("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoSeguro tiposeguro : tiposegurosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoSeguro("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoSeguroConstantesFunciones.generarExcelReporteDataTipoSeguro("NORMAL",row,workbook,tiposeguro,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoSeguroConstantesFunciones.getTipoSeguroDescripcion(tiposeguro));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposeguroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Seguro",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoSeguro.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSeguro.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoSeguro.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSeguro.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoSeguro() throws Exception {		
		this.startProcessTipoSeguro(true);
	}
	
	public void startProcessTipoSeguro(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoSeguro ,this.jPanelParametrosReportesTipoSeguro, this.jScrollPanelDatosTipoSeguro,this.jPanelPaginacionTipoSeguro, this.jScrollPanelDatosEdicionTipoSeguro, this.jPanelAccionesTipoSeguro,this.jPanelAccionesFormularioTipoSeguro,this.jmenuBarTipoSeguro,this.jmenuBarDetalleTipoSeguro,this.jTtoolBarTipoSeguro,this.jTtoolBarDetalleTipoSeguro);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoSeguro=this.jTabbedPaneBusquedasTipoSeguro; 
		
		final JPanel jPanelParametrosReportesTipoSeguro=this.jPanelParametrosReportesTipoSeguro;
		//final JScrollPane jScrollPanelDatosTipoSeguro=this.jScrollPanelDatosTipoSeguro;
		final JTable jTableDatosTipoSeguro=this.jTableDatosTipoSeguro;		
		final JPanel jPanelPaginacionTipoSeguro=this.jPanelPaginacionTipoSeguro;
		//final JScrollPane jScrollPanelDatosEdicionTipoSeguro=this.jScrollPanelDatosEdicionTipoSeguro;
		final JPanel jPanelAccionesTipoSeguro=this.jPanelAccionesTipoSeguro;
		
		JPanel jPanelCamposAuxiliarTipoSeguro=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoSeguro=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) {
			jPanelCamposAuxiliarTipoSeguro=this.jInternalFrameDetalleFormTipoSeguro.jPanelCamposTipoSeguro;
			jPanelAccionesFormularioAuxiliarTipoSeguro=this.jInternalFrameDetalleFormTipoSeguro.jPanelAccionesFormularioTipoSeguro;
		}
		
		final JPanel jPanelCamposTipoSeguro=jPanelCamposAuxiliarTipoSeguro;
		final JPanel jPanelAccionesFormularioTipoSeguro=jPanelAccionesFormularioAuxiliarTipoSeguro;
		
		
		final JMenuBar jmenuBarTipoSeguro=this.jmenuBarTipoSeguro;
		final JToolBar jTtoolBarTipoSeguro=this.jTtoolBarTipoSeguro;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoSeguro=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoSeguro=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) {
			jmenuBarDetalleAuxiliarTipoSeguro=this.jInternalFrameDetalleFormTipoSeguro.jmenuBarDetalleTipoSeguro;
			jTtoolBarDetalleAuxiliarTipoSeguro=this.jInternalFrameDetalleFormTipoSeguro.jTtoolBarDetalleTipoSeguro;
		}
		
		final JMenuBar jmenuBarDetalleTipoSeguro=jmenuBarDetalleAuxiliarTipoSeguro;
		final JToolBar jTtoolBarDetalleTipoSeguro=jTtoolBarDetalleAuxiliarTipoSeguro;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoSeguro;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoSeguro;
			processRunnable.jTableDatos=jTableDatosTipoSeguro;
			processRunnable.jPanelCampos=jPanelCamposTipoSeguro;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoSeguro;
			processRunnable.jPanelAcciones=jPanelAccionesTipoSeguro;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoSeguro;
			
			
			processRunnable.jmenuBar=jmenuBarTipoSeguro;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoSeguro;
			processRunnable.jTtoolBar=jTtoolBarTipoSeguro;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoSeguro;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoSeguro ,jPanelParametrosReportesTipoSeguro,jTableDatosTipoSeguro, /*jScrollPanelDatosTipoSeguro,*/jPanelCamposTipoSeguro,jPanelPaginacionTipoSeguro, /*jScrollPanelDatosEdicionTipoSeguro,*/ jPanelAccionesTipoSeguro,jPanelAccionesFormularioTipoSeguro,jmenuBarTipoSeguro,jmenuBarDetalleTipoSeguro,jTtoolBarTipoSeguro,jTtoolBarDetalleTipoSeguro);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoSeguro ,jPanelParametrosReportesTipoSeguro, jScrollPanelDatosTipoSeguro,jPanelPaginacionTipoSeguro, jScrollPanelDatosEdicionTipoSeguro, jPanelAccionesTipoSeguro,jPanelAccionesFormularioTipoSeguro,jmenuBarTipoSeguro,jmenuBarDetalleTipoSeguro,jTtoolBarTipoSeguro,jTtoolBarDetalleTipoSeguro);
						
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
	
	public void finishProcessTipoSeguro() {// throws Exception 
		this.finishProcessTipoSeguro(true);
	}
	
	public void finishProcessTipoSeguro(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoSeguro ,this.jPanelParametrosReportesTipoSeguro, this.jScrollPanelDatosTipoSeguro,this.jPanelPaginacionTipoSeguro, this.jScrollPanelDatosEdicionTipoSeguro, this.jPanelAccionesTipoSeguro,this.jPanelAccionesFormularioTipoSeguro,this.jmenuBarTipoSeguro,this.jmenuBarDetalleTipoSeguro,this.jTtoolBarTipoSeguro,this.jTtoolBarDetalleTipoSeguro);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoSeguro=this.jTabbedPaneBusquedasTipoSeguro; 
		
		final JPanel jPanelParametrosReportesTipoSeguro=this.jPanelParametrosReportesTipoSeguro;
		//final JScrollPane jScrollPanelDatosTipoSeguro=this.jScrollPanelDatosTipoSeguro;
		final JTable jTableDatosTipoSeguro=this.jTableDatosTipoSeguro;		
		final JPanel jPanelPaginacionTipoSeguro=this.jPanelPaginacionTipoSeguro;
		//final JScrollPane jScrollPanelDatosEdicionTipoSeguro=this.jScrollPanelDatosEdicionTipoSeguro;
		final JPanel jPanelAccionesTipoSeguro=this.jPanelAccionesTipoSeguro;
		
		JPanel jPanelCamposAuxiliarTipoSeguro=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoSeguro=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) {
			jPanelCamposAuxiliarTipoSeguro=this.jInternalFrameDetalleFormTipoSeguro.jPanelCamposTipoSeguro;
			jPanelAccionesFormularioAuxiliarTipoSeguro=this.jInternalFrameDetalleFormTipoSeguro.jPanelAccionesFormularioTipoSeguro;
		}
		
		final JPanel jPanelCamposTipoSeguro=jPanelCamposAuxiliarTipoSeguro;
		final JPanel jPanelAccionesFormularioTipoSeguro=jPanelAccionesFormularioAuxiliarTipoSeguro;
		
		
		final JMenuBar jmenuBarTipoSeguro=this.jmenuBarTipoSeguro;		
		final JToolBar jTtoolBarTipoSeguro=this.jTtoolBarTipoSeguro;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoSeguro=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoSeguro=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) {
			jmenuBarDetalleAuxiliarTipoSeguro=this.jInternalFrameDetalleFormTipoSeguro.jmenuBarDetalleTipoSeguro;
			jTtoolBarDetalleAuxiliarTipoSeguro=this.jInternalFrameDetalleFormTipoSeguro.jTtoolBarDetalleTipoSeguro;		
		}
		
		final JMenuBar jmenuBarDetalleTipoSeguro=jmenuBarDetalleAuxiliarTipoSeguro;
		final JToolBar jTtoolBarDetalleTipoSeguro=jTtoolBarDetalleAuxiliarTipoSeguro;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoSeguro;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoSeguro;
			processRunnable.jTableDatos=jTableDatosTipoSeguro;
			processRunnable.jPanelCampos=jPanelCamposTipoSeguro;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoSeguro;
			processRunnable.jPanelAcciones=jPanelAccionesTipoSeguro;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoSeguro;
			
			
			processRunnable.jmenuBar=jmenuBarTipoSeguro;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoSeguro;
			processRunnable.jTtoolBar=jTtoolBarTipoSeguro;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoSeguro;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoSeguro ,jPanelParametrosReportesTipoSeguro, jTableDatosTipoSeguro,/*jScrollPanelDatosTipoSeguro,*/jPanelCamposTipoSeguro,jPanelPaginacionTipoSeguro, /*jScrollPanelDatosEdicionTipoSeguro,*/ jPanelAccionesTipoSeguro,jPanelAccionesFormularioTipoSeguro,jmenuBarTipoSeguro,jmenuBarDetalleTipoSeguro,jTtoolBarTipoSeguro,jTtoolBarDetalleTipoSeguro));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoSeguro(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoSeguro(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoSeguro(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoSeguro(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoSeguro,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoSeguro,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoSeguro(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoSeguro,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoSeguro,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tiposeguroConstantesFunciones.getsFinalQueryTipoSeguro();
		String  finalQueryPaginacionTodos=this.tiposeguroConstantesFunciones.getsFinalQueryTipoSeguro();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoSeguroConstantesFunciones.getArrayColumnasGlobalesNoTipoSeguro(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoSeguroConstantesFunciones.getArrayColumnasGlobalesTipoSeguro(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoSeguroConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tiposegurosEliminados= new ArrayList<TipoSeguro>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoSeguro();
		
				///*TipoSeguroSessionBean*/this.tiposeguroSessionBean=new TipoSeguroSessionBean();
			
			if(this.tiposeguroSessionBean==null) {
				this.tiposeguroSessionBean=new TipoSeguroSessionBean();
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
					this.iNumeroPaginacion=TipoSeguroConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoSeguroConstantesFunciones.getClassesForeignKeysOfTipoSeguro(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tiposeguro."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tiposegurosAux= new ArrayList<TipoSeguro>();
			
				
			tiposeguroLogic.setDatosCliente(this.datosCliente);
			tiposeguroLogic.setDatosDeep(this.datosDeep);
			tiposeguroLogic.setIsConDeep(true);
			
			
			tiposeguroLogic.getTipoSeguroDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tiposeguroLogic.getTodosTipoSeguros(finalQueryGlobal,pagination);
					
					//tiposeguroLogic.getTodosTipoSegurosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tiposeguroLogic.getTipoSeguros()==null|| tiposeguroLogic.getTipoSeguros().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiposegurosAux= new ArrayList<TipoSeguro>();
							tiposegurosAux.addAll(tiposeguroLogic.getTipoSeguros());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposegurosAux= new ArrayList<TipoSeguro>();
							tiposegurosAux.addAll(tiposeguros);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiposeguroLogic.getTodosTipoSeguros(finalQueryGlobal+"",this.pagination);												
							
							//tiposeguroLogic.getTodosTipoSegurosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoSeguros("Todos",tiposeguroLogic.getTipoSeguros() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiposeguroLogic.setTipoSeguros(new ArrayList<TipoSeguro>());					
							tiposeguroLogic.getTipoSeguros().addAll(tiposegurosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposeguros=new ArrayList<TipoSeguro>();
							tiposeguros.addAll(tiposegurosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoSeguro=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoSeguro=this.idActual;
				
				} else if(this.idTipoSeguroActual!=null && this.idTipoSeguroActual!=0L) {
					idTipoSeguro=idTipoSeguroActual;
				}
				
					
				this.sDetalleReporte=TipoSeguroConstantesFunciones.getDetalleIndicePorId(idTipoSeguro);
				
				this.tiposeguros=new ArrayList<TipoSeguro>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tiposeguroLogic.getEntity(idTipoSeguro);
					
					//tiposeguroLogic.getEntityWithConnection(idTipoSeguro);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiposeguroLogic.setTipoSeguros(new ArrayList<TipoSeguro>());
					tiposeguroLogic.getTipoSeguros().add(tiposeguroLogic.getTipoSeguro());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiposeguros=new ArrayList<TipoSeguro>();
					this.tiposeguros.add(tiposeguro);
				}
				
				if(tiposeguroLogic.getTipoSeguro()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoSeguroConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiposeguroLogic.getTipoSegurosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoSeguroConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoSeguroConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiposeguroLogic.getTipoSeguros()==null||tiposeguroLogic.getTipoSeguros().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiposeguros==null|| tiposeguros.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposegurosAux=new ArrayList<TipoSeguro>();
						tiposegurosAux.addAll(tiposeguroLogic.getTipoSeguros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposegurosAux=new ArrayList<TipoSeguro>();
							tiposegurosAux.addAll(tiposeguros);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiposeguroLogic.getTipoSegurosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoSeguroConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoSeguroConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoSeguros("FK_IdEmpresa",tiposeguroLogic.getTipoSeguros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoSeguros("FK_IdEmpresa",tiposeguros);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposeguroLogic.setTipoSeguros(new ArrayList<TipoSeguro>());
						tiposeguroLogic.getTipoSeguros().addAll(tiposegurosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposeguros=new ArrayList<TipoSeguro>();
							tiposeguros.addAll(tiposegurosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoSeguro();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoSeguro();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiposeguroLogic.getTipoSeguros().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiposeguros.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiposeguroLogic.getTipoSeguros().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiposeguros.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoSeguro tiposeguro) {
		Boolean permite=true;
		
		if(this.tiposeguro.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoSeguroConstantesFunciones.getOrderByListaTipoSeguro();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoSeguroConstantesFunciones.getOrderByListaTipoSeguro();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSeguro tiposeguro:tiposeguroLogic.getTipoSeguros()) {
				if(tiposeguro.getsType().equals(Constantes2.S_TOTALES)) {
					tiposeguroTotales=tiposeguro;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSeguro tiposeguro:this.tiposeguros) {
				if(tiposeguro.getsType().equals(Constantes2.S_TOTALES)) {
					tiposeguroTotales=tiposeguro;
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
			this.tiposeguroAux=new TipoSeguro();
			this.tiposeguroAux.setsType(Constantes2.S_TOTALES);
			this.tiposeguroAux.setIsNew(false);
			this.tiposeguroAux.setIsChanged(false);
			this.tiposeguroAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoSeguroConstantesFunciones.TotalizarValoresFilaTipoSeguro(this.tiposeguroLogic.getTipoSeguros(),this.tiposeguroAux);
				
				this.tiposeguroLogic.getTipoSeguros().add(this.tiposeguroAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoSeguroConstantesFunciones.TotalizarValoresFilaTipoSeguro(this.tiposeguros,this.tiposeguroAux);
				
				this.tiposeguros.add(this.tiposeguroAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tiposeguroTotales=new TipoSeguro();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiposeguroLogic.getTipoSeguros().remove(tiposeguroTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiposeguros.remove(tiposeguroTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tiposeguroTotales=new TipoSeguro();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSeguro tiposeguro:tiposeguroLogic.getTipoSeguros()) {
				if(tiposeguro.getsType().equals(Constantes2.S_TOTALES)) {
					tiposeguroTotales=tiposeguro;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoSeguroConstantesFunciones.TotalizarValoresFilaTipoSeguro(this.tiposeguroLogic.getTipoSeguros(),tiposeguroTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSeguro tiposeguro:this.tiposeguros) {
				if(tiposeguro.getsType().equals(Constantes2.S_TOTALES)) {
					tiposeguroTotales=tiposeguro;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoSeguroConstantesFunciones.TotalizarValoresFilaTipoSeguro(this.tiposeguros,tiposeguroTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoSegurosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoSegurosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiposeguroLogic.getTipoSegurosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoSeguro() {
		this.isPermisoTodoTipoSeguro=false;
		this.isPermisoNuevoTipoSeguro=false;
		this.isPermisoActualizarTipoSeguro=false;
		this.isPermisoActualizarOriginalTipoSeguro=false;
		this.isPermisoEliminarTipoSeguro=false;
		this.isPermisoGuardarCambiosTipoSeguro=false;
		this.isPermisoConsultaTipoSeguro=false;
		this.isPermisoBusquedaTipoSeguro=false;
		this.isPermisoReporteTipoSeguro=false;		
		this.isPermisoOrdenTipoSeguro=false;		
		this.isPermisoPaginacionMedioTipoSeguro=false;		
		this.isPermisoPaginacionAltoTipoSeguro=false;
		this.isPermisoPaginacionTodoTipoSeguro=false;
		this.isPermisoCopiarTipoSeguro=false;		
		this.isPermisoVerFormTipoSeguro=false;		
		this.isPermisoDuplicarTipoSeguro=false;		
		this.isPermisoOrdenTipoSeguro=false;		
	}
	
	public void setPermisosUsuarioTipoSeguro(Boolean isPermiso) {
		this.isPermisoTodoTipoSeguro=isPermiso;
		this.isPermisoNuevoTipoSeguro=isPermiso;
		this.isPermisoActualizarTipoSeguro=isPermiso;
		this.isPermisoActualizarOriginalTipoSeguro=isPermiso;
		this.isPermisoEliminarTipoSeguro=isPermiso;
		this.isPermisoGuardarCambiosTipoSeguro=isPermiso;
		this.isPermisoConsultaTipoSeguro=isPermiso;
		this.isPermisoBusquedaTipoSeguro=isPermiso;
		this.isPermisoReporteTipoSeguro=isPermiso;
		this.isPermisoOrdenTipoSeguro=isPermiso;		
		this.isPermisoPaginacionMedioTipoSeguro=isPermiso;		
		this.isPermisoPaginacionAltoTipoSeguro=isPermiso;		
		this.isPermisoPaginacionTodoTipoSeguro=isPermiso;		
		this.isPermisoCopiarTipoSeguro=isPermiso;		
		this.isPermisoVerFormTipoSeguro=isPermiso;		
		this.isPermisoDuplicarTipoSeguro=isPermiso;
		this.isPermisoOrdenTipoSeguro=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoSeguro(Boolean isPermiso) {
		//this.isPermisoTodoTipoSeguro=isPermiso;
		this.isPermisoNuevoTipoSeguro=isPermiso;
		this.isPermisoActualizarTipoSeguro=isPermiso;
		this.isPermisoActualizarOriginalTipoSeguro=isPermiso;
		this.isPermisoEliminarTipoSeguro=isPermiso;
		this.isPermisoGuardarCambiosTipoSeguro=isPermiso;
		//this.isPermisoConsultaTipoSeguro=isPermiso;
		//this.isPermisoBusquedaTipoSeguro=isPermiso;
		//this.isPermisoReporteTipoSeguro=isPermiso;
		//this.isPermisoOrdenTipoSeguro=isPermiso;		
		//this.isPermisoPaginacionMedioTipoSeguro=isPermiso;		
		//this.isPermisoPaginacionAltoTipoSeguro=isPermiso;		
		//this.isPermisoPaginacionTodoTipoSeguro=isPermiso;		
		//this.isPermisoCopiarTipoSeguro=isPermiso;		
		//this.isPermisoDuplicarTipoSeguro=isPermiso;
		//this.isPermisoOrdenTipoSeguro=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoSeguroClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoSeguroJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoSeguro(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoSeguroClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoSeguroClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoSeguroClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoSeguroClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoSeguro() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoSeguroJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoSeguroConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoSeguro=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoSeguro=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoSeguro=this.isPermisoActualizarTipoSeguro;
			this.isPermisoEliminarTipoSeguro=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoSeguro=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoSeguro=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoSeguro=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoSeguro=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoSeguro=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoSeguro=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoSeguro=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoSeguro=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoSeguro=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoSeguro=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoSeguro=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoSeguro=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoSeguro=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoSeguro.setToolTipText(this.jTableDatosTipoSeguro.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoSeguro(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoSeguro(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoSeguroJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoSeguroJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoSeguro() throws Exception {
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
	public void inicializarCombosForeignKeyTipoSeguroListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoSeguroListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoSeguroJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoSeguroListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoSeguroListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoSeguroParameterReturnGeneral tiposeguroReturnGeneral=new TipoSeguroParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tiposeguroConstantesFunciones.cargarid_empresaTipoSeguro)
					 || (this.esRecargarFks && this.tiposeguroConstantesFunciones.cargarid_empresaTipoSeguro)) {

					if(!this.tiposeguroSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tiposeguroSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tiposeguroReturnGeneral=tiposeguroLogic.cargarCombosLoteForeignKeyTipoSeguro(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tiposeguroReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoSeguro()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tiposeguroSessionBean==null) {
				this.tiposeguroSessionBean=new TipoSeguroSessionBean();
			}

			if(!this.tiposeguroSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoSeguro()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoSeguro(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoSeguro()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoSeguro();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoSeguro(TipoSeguro tiposeguro)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoSeguro(TipoSeguro tiposeguro,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoSeguro()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoSeguro()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoSeguro()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoSeguro()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoSeguro()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoSeguro()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoSeguro(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoSeguro()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoSeguro.jComboBoxid_empresaTipoSeguro!=null && this.jInternalFrameDetalleFormTipoSeguro.jComboBoxid_empresaTipoSeguro.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoSeguro.jComboBoxid_empresaTipoSeguro.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoSeguroBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoSeguroBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoSeguroBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tiposeguroSessionBean=new TipoSeguroSessionBean(); 
		this.tiposeguroConstantesFunciones=new TipoSeguroConstantesFunciones(); 
		this.tiposeguroBean=new TipoSeguro();//(this.tiposeguroConstantesFunciones); 		
		this.tiposeguroReturnGeneral=new TipoSeguroParameterReturnGeneral(); 
		
		this.tiposeguroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiposeguroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoSeguroBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoSeguroBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoSeguroBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoSeguro(true);
			
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
			
			this.tiposeguroConstantesFunciones=new TipoSeguroConstantesFunciones(); 
			this.tiposeguroBean=new TipoSeguro();//this.tiposeguroConstantesFunciones); 			
			this.tiposeguroReturnGeneral=new TipoSeguroParameterReturnGeneral(); 
		
			TipoSeguroBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Seguro Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tiposeguro=new TipoSeguro();
			this.tiposeguros = new ArrayList<TipoSeguro>();
			this.tiposegurosAux = new ArrayList<TipoSeguro>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic=new TipoSeguroLogic();
				this.tiposeguroLogic.getNewConnexionToDeep("");
			}
			
			//this.tiposeguroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tiposeguroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoSeguro);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoSeguro!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoSeguro);	
					}
					
					if(this.jInternalFrameImportacionTipoSeguro!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoSeguro);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoSeguro!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoSeguro);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoSeguro!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoSeguro);
				this.jInternalFrameDetalleFormTipoSeguro.setVisible(false);
				this.jInternalFrameDetalleFormTipoSeguro.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoSeguro!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoSeguro);
					this.jInternalFrameReporteDinamicoTipoSeguro.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoSeguro.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoSeguro!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoSeguro);
					this.jInternalFrameImportacionTipoSeguro.setVisible(false);
					this.jInternalFrameImportacionTipoSeguro.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoSeguro!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoSeguro);
					this.jInternalFrameOrderByTipoSeguro.setVisible(false);
					this.jInternalFrameOrderByTipoSeguro.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoSeguroActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoSeguroConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tiposeguroReturnGeneral=new TipoSeguroParameterReturnGeneral();
			
			this.tiposeguroParameterGeneral=new TipoSeguroParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tiposeguroLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoSeguroJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoSeguroConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiposeguroSessionBean.getEsGuardarRelacionado(),this.tiposeguroSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoSeguroConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiposeguroSessionBean.getEsGuardarRelacionado(),this.tiposeguroSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoSeguro=false;
			this.isVisibilidadCeldaDuplicarTipoSeguro=true;
			this.isVisibilidadCeldaCopiarTipoSeguro=true;
			this.isVisibilidadCeldaVerFormTipoSeguro=true;
			this.isVisibilidadCeldaOrdenTipoSeguro=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoSeguro=false;
			this.isVisibilidadCeldaModificarTipoSeguro=false;
			this.isVisibilidadCeldaActualizarTipoSeguro=false;
			this.isVisibilidadCeldaEliminarTipoSeguro=false;
			this.isVisibilidadCeldaCancelarTipoSeguro=false;
			this.isVisibilidadCeldaGuardarTipoSeguro=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSeguro=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoSeguro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoSeguro();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoSeguro(false);
			
			this.setPermisosUsuarioTipoSeguro();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiposeguroSessionBean.getEsGuardarRelacionado() 
				|| (this.tiposeguroSessionBean.getEsGuardarRelacionado() && this.tiposeguroSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoSeguroClasesRelacionadas();
			}
			
			if(this.tiposeguroSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoSeguroClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoSeguroJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoSeguro();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoSeguro();
			}
			
			if(!this.isPermisoBusquedaTipoSeguro) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoSeguro.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiposeguroSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoSeguro,this.isPermisoPaginacionMedioTipoSeguro,this.isPermisoPaginacionTodoTipoSeguro);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoSeguroConstantesFunciones.getTiposSeleccionarTipoSeguro());
				
				this.tiposColumnasSelect=TipoSeguroConstantesFunciones.getTiposSeleccionarTipoSeguro(true);
				
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
			//if(!this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoSeguro();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoSeguro(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoSeguro(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoSeguro() ;
			
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
				tiposeguroImplementable= (TipoSeguroImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoSeguroConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tiposeguroImplementableHome= (TipoSeguroImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoSeguroConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tiposeguros= new ArrayList<TipoSeguro>();
			this.tiposegurosEliminados= new ArrayList<TipoSeguro>();
						
			this.isEsNuevoTipoSeguro=false;
			this.esParaAccionDesdeFormularioTipoSeguro=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoSeguro(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoSeguro();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoSeguroBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoSeguroConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoSeguro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoSeguro(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoSeguro!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoSeguro();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoSeguro();
			}
			
			TipoSeguroBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoSeguro.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoSeguro.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoSeguro.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoSeguro(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoSeguro: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoSeguro() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoSeguro")) {
				iIndex=this.jInternalFrameDetalleFormTipoSeguro.jTabbedPaneRelacionesTipoSeguro.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoSeguro.jTabbedPaneRelacionesTipoSeguro.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoSeguro.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoSeguro();	
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
	
	public void cargarCombosForeignKeyTipoSeguro(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoSeguro(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoSeguro(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoSeguroListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoSeguro();
		
		this.cargarCombosFrameForeignKeyTipoSeguro();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoSeguro();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoSeguro();
		}
	}
	
	
	
	public void jButtonNuevoTipoSeguroActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tiposeguroSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoSeguro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
			
			
			if(jTableDatosTipoSeguro.getRowCount()>=1) {
				jTableDatosTipoSeguro.removeRowSelectionInterval(0, jTableDatosTipoSeguro.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoSeguro=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoSeguro(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoSeguro(true);			
			//this.tiposeguro=new TipoSeguro();
			//this.tiposeguro.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoSeguro(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoSeguro() ;
			
			if(TipoSeguroJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoSeguro(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tiposeguro);	
			this.actualizarInformacion("INFO_PADRE",false,this.tiposeguro);				
			
			TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
			
			if(this.tiposeguroSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoSeguro: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoSeguroActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoSeguro> tiposegurosSeleccionados=new ArrayList<TipoSeguro>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoSeguro.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoSeguro.getSelectedRows().length;			
			}
			
			tiposegurosSeleccionados=this.getTipoSegurosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoSeguro--;			
				//TipoSeguro tiposeguroAux= new TipoSeguro();			
				//tiposeguroAux.setId(this.iIdNuevoTipoSeguro);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoSeguro tiposeguroOrigen=new TipoSeguro();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoSeguro tiposeguroOrigen : tiposegurosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoSeguro.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tiposeguroOrigen =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposeguroOrigen =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoSeguro();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tiposeguro.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoSeguro(tiposeguroOrigen,this.tiposeguro,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSeguro(this.tiposeguro);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiposeguroLogic.getTipoSeguros().add(this.tiposeguroAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiposeguros.add(this.tiposeguroAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoSeguro(false);
				
				this.jTableDatosTipoSeguro.setRowSelectionInterval(this.getIndiceNuevoTipoSeguro(), this.getIndiceNuevoTipoSeguro());
				
				int iLastRow =  this.jTableDatosTipoSeguro.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoSeguro.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoSeguro.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoSeguro(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoSeguroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoSeguro> tiposegurosSeleccionados=new ArrayList<TipoSeguro>();									
		
			TipoSeguro tiposeguroOrigen=new TipoSeguro();
			TipoSeguro tiposeguroDestino=new TipoSeguro();
				
			tiposegurosSeleccionados=this.getTipoSegurosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoSeguro.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tiposegurosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoSeguro.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposeguroOrigen =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiposeguroOrigen =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposeguroDestino =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiposeguroDestino =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tiposeguroOrigen =tiposegurosSeleccionados.get(0);
				tiposeguroDestino =tiposegurosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoSeguro(tiposeguroOrigen,tiposeguroDestino,true,false);
				
				tiposeguroDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiposeguroDestino,tiposeguroLogic.getTipoSeguros());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiposeguroDestino,tiposeguros);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoSeguro(false);
				
				//this.jTableDatosTipoSeguro.setRowSelectionInterval(this.getIndiceNuevoTipoSeguro(), this.getIndiceNuevoTipoSeguro());
				
				int iLastRow =  this.jTableDatosTipoSeguro.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoSeguro.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoSeguro.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoSeguro(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoSeguroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoSeguro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoSeguro.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoSeguroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoSeguro.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoSeguro.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoSeguro.setVisible(!isVisible);
			this.jPanelPaginacionTipoSeguro.setVisible(!isVisible);
			this.jPanelAccionesTipoSeguro.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoSeguroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoSeguro();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoSeguroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoSeguro();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoSeguroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoSeguro();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoSeguroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoSeguro();
			
			this.abrirFrameOrderByTipoSeguro();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoSeguroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoSeguro();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoSeguro(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoSeguro);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoSeguro.isMaximum()) {
					this.jInternalFrameDetalleFormTipoSeguro.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoSeguro.setSize(this.jInternalFrameDetalleFormTipoSeguro.iWidthFormulario,this.jInternalFrameDetalleFormTipoSeguro.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoSeguro.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoSeguro.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoSeguro.isMaximum()) {
						this.jInternalFrameDetalleFormTipoSeguro.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoSeguro.jContentPaneDetalleTipoSeguro.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoSeguro.jTabbedPaneRelacionesTipoSeguro.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoSeguro.jContentPaneDetalleTipoSeguro.getWidth(),TipoSeguroConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoSeguro.jTabbedPaneRelacionesTipoSeguro.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoSeguro.jContentPaneDetalleTipoSeguro.getWidth(),TipoSeguroConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoSeguro.jTabbedPaneRelacionesTipoSeguro.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoSeguro.jContentPaneDetalleTipoSeguro.getWidth(),TipoSeguroConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoSeguro.setVisible(true);
	        this.jInternalFrameDetalleFormTipoSeguro.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoSeguro() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoSeguro==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoSeguro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoSeguro,false,this);
				} else {
					this.jInternalFrameOrderByTipoSeguro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoSeguro,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoSeguro);
				this.jInternalFrameOrderByTipoSeguro.setVisible(false);
				this.jInternalFrameOrderByTipoSeguro.setSelected(false);
				
				this.jInternalFrameOrderByTipoSeguro.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoSeguro"));
				
				this.inicializarActualizarBindingTablaOrderByTipoSeguro();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoSeguro() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoSeguro==null) {
				
				this.jInternalFrameImportacionTipoSeguro=new ImportacionJInternalFrame(TipoSeguroConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoSeguro);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoSeguro);
				this.jInternalFrameImportacionTipoSeguro.setVisible(false);
				this.jInternalFrameImportacionTipoSeguro.setSelected(false);


				this.jInternalFrameImportacionTipoSeguro.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoSeguro"));
				this.jInternalFrameImportacionTipoSeguro.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoSeguro"));
				this.jInternalFrameImportacionTipoSeguro.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoSeguro"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoSeguro() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoSeguro==null) {
				this.jInternalFrameReporteDinamicoTipoSeguro=new ReporteDinamicoJInternalFrame(TipoSeguroConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoSeguro);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoSeguro);
				this.jInternalFrameReporteDinamicoTipoSeguro.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoSeguro.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoSeguro.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoSeguro"));
				this.jInternalFrameReporteDinamicoTipoSeguro.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoSeguro"));
				this.jInternalFrameReporteDinamicoTipoSeguro.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoSeguro"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoSeguro();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoSeguro() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoSeguro);
			
	       	this.jInternalFrameDetalleFormTipoSeguro.setVisible(false);
	        this.jInternalFrameDetalleFormTipoSeguro.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoSeguro.dispose();
			//this.jInternalFrameDetalleFormTipoSeguro=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoSeguro() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoSeguro.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoSeguro.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoSeguro() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoSeguro.setVisible(true);
	        this.jInternalFrameImportacionTipoSeguro.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoSeguro() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoSeguro.setVisible(true);
	        this.jInternalFrameOrderByTipoSeguro.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoSeguro() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoSeguro.setVisible(false);
	        this.jInternalFrameOrderByTipoSeguro.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoSeguro() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoSeguro.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoSeguro.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoSeguro() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoSeguro.setVisible(false);
	        this.jInternalFrameImportacionTipoSeguro.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoSeguroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoSeguro(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoSeguro(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoSeguro.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoSeguro(true);
			//this.isEsNuevoTipoSeguro=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguro =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiposeguro =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoSeguro("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoSeguro(false) ;
			
			if(tiposeguroSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoSeguroJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoSeguro(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoSeguro(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoSeguroActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoSeguro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguro =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposeguro =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoSeguro(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoSeguro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoSeguro.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoSeguro(true);
			//this.isEsNuevoTipoSeguro=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguro =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiposeguro =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tiposeguro.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoSeguro("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoSeguro(false) ;
			
			if(TipoSeguroJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoSeguro(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoSeguro(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoSeguroActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoSeguro(false);
			
			//if(!this.isEsNuevoTipoSeguro) {								
				int intSelectedRow = this.jTableDatosTipoSeguro.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguro =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiposeguro =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoSeguroJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoSeguro(this.tiposeguro,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoSeguro(this.tiposeguro);
				
			}
			
			if(this.permiteMantenimiento(this.tiposeguro)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoSeguro=true;
					this.inicializarActualizarBindingTablaTipoSeguro(false);
					this.isEsNuevoTipoSeguro=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoSeguro=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoSeguro=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoSeguro(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoSeguro(false);
				
				this.habilitarDeshabilitarControlesTipoSeguro(false);
			
												
				
				if(TipoSeguroJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoSeguro();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoSeguroActionPerformed(evt,tiposeguroSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoSeguro(this.tiposeguro,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoSeguro.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tiposeguroSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tiposeguro.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoSeguro.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSeguro.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoSeguroActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoSeguro.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguro =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
				this.tiposeguro.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiposeguro =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
				this.tiposeguro.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tiposeguro)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoSeguroModel) this.jTableDatosTipoSeguro.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoSeguro=true;
				this.inicializarActualizarBindingTablaTipoSeguro(false);
				this.isEsNuevoTipoSeguro=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoSeguro(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoSeguro(false);
				
				this.habilitarDeshabilitarControlesTipoSeguro(false);
				
				
				
				if(TipoSeguroJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoSeguro();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoSeguroActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoSeguro.getRowCount()>=1) {
				jTableDatosTipoSeguro.removeRowSelectionInterval(0, jTableDatosTipoSeguro.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoSeguro(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoSeguro(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoSeguro(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoSeguro(false) ;
			
			this.isEsNuevoTipoSeguro=false;
			
			if(TipoSeguroJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoSeguro();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoSeguroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoSeguro(false);
				
				//SI ES MANUAL
				if(TipoSeguroJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoSeguro();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoSeguroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoSeguro--;			
			//TipoSeguro tiposeguroAux= new TipoSeguro();			
			//tiposeguroAux.setId(this.iIdNuevoTipoSeguro);
			
			if(this.jInternalFrameDetalleFormTipoSeguro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoSeguro();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoSeguro(this.tiposeguro);
			
			this.tiposeguro.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tiposeguroLogic.getTipoSeguros().add(this.tiposeguroAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tiposeguros.add(this.tiposeguroAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoSeguro(false);
			
			this.jTableDatosTipoSeguro.setRowSelectionInterval(this.getIndiceNuevoTipoSeguro(), this.getIndiceNuevoTipoSeguro());
			
			int iLastRow =  this.jTableDatosTipoSeguro.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoSeguro.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoSeguro.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoSeguro(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoSeguroActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoSeguro(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoSeguro(false);
			
			//SI ES MANUAL
			if(TipoSeguroJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoSeguro();
			}
			
			//this.abrirFrameTreeTipoSeguro();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoSeguroActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo SeguroS ?", "MANTENIMIENTO DE Tipo Seguro", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoSeguro.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoSeguro();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tiposeguroReturnGeneral=tiposeguroLogic.procesarImportacionTipoSegurosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tiposeguroParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoSeguroReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoSeguroActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoSeguro.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoSeguro.setFileImportacion(this.jInternalFrameImportacionTipoSeguro.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoSeguro.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoSeguro.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoSeguro.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoSeguro.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoSeguroActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoSeguro> tiposegurosSeleccionados=new ArrayList<TipoSeguro>();		

		tiposegurosSeleccionados=this.getTipoSegurosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoSeguro.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoSeguro.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoSeguroBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoSeguroBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoSeguros("Todos",tiposegurosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposeguroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Seguro",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoSeguro.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSeguro.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoSeguroConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoSeguroConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoSeguroConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoSeguro.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoSeguro.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoSeguro.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoSeguroConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoSeguroConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoSeguroConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoSeguro.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoSeguroConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoSeguroConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoSeguroConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoSeguro.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSeguro.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoSeguroConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoSeguroConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoSeguroConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoSeguroActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoSeguro> tiposegurosSeleccionados=new ArrayList<TipoSeguro>();		
		
		tiposegurosSeleccionados=this.getTipoSegurosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposeguro";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoSeguros");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoSeguro.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSeguro.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoSeguroConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoSeguroConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoSeguro tiposeguro:tiposegurosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiposeguro.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoSeguroConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoSeguroConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoSeguro tiposeguro:tiposegurosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiposeguro.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoSeguroConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoSeguroConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoSeguro tiposeguro:tiposegurosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiposeguro.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoSeguro(row);				
			//	iRow++;
			//}				
			
			//for(TipoSeguro tiposeguroAux:tiposegurosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoSeguro(tiposeguroAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposeguroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Seguro",JOptionPane.INFORMATION_MESSAGE);
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
				this.tiposeguroLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoSeguro(false);
			
			//SI ES MANUAL
			if(TipoSeguroJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoSeguro();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoSeguroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoSeguro(false);
			
			//SI ES MANUAL
			if(TipoSeguroJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoSeguro();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoSeguroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoSeguro(false);
			
			//SI ES MANUAL
			if(TipoSeguroJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoSeguro();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoSeguro() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoSeguro.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoSeguro.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoSeguro.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoSeguro.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoSeguro.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoSeguro.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoSeguro.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoSeguro(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoSeguro(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoSeguro(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoSeguro(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoSeguro(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoSeguro(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoSeguro(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoSeguro(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoSeguroJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoSeguroJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoSeguro() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoSeguro();
		
		this.inicializarActualizarBindingBotonesManualTipoSeguro(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoSeguro();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoSeguro() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoSeguro(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoSeguro(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoSeguro.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoSeguro.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoSeguro.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoSeguro!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoSeguro.jCheckBoxPostAccionNuevoTipoSeguro.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoSeguro.jCheckBoxPostAccionSinCerrarTipoSeguro.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoSeguro.jCheckBoxPostAccionSinMensajeTipoSeguro.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoSeguro.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoSeguro.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoSeguro.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoSeguro!=null) {
				this.jInternalFrameDetalleFormTipoSeguro.jCheckBoxPostAccionNuevoTipoSeguro.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoSeguro.jCheckBoxPostAccionSinCerrarTipoSeguro.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoSeguro.jCheckBoxPostAccionSinMensajeTipoSeguro.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoSeguro.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoSeguro.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoSeguro!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoSeguro.jComboBoxTiposAccionesFormularioTipoSeguro.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoSeguro.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoSeguro!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoSeguro.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoSeguro.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoSeguro.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoSeguro.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoSeguro.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoSeguro!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoSeguro.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoSeguro.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoSeguro.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoSeguro(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoSeguroJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoSeguro(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoSeguro() throws Exception {
		try	{
			if(TipoSeguroJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoSeguro();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoSeguro() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoSeguro.jComboBoxTiposAccionesFormularioTipoSeguro.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoSeguro.jComboBoxTiposAccionesFormularioTipoSeguro.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoSeguro() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoSeguro.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoSeguro.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoSeguro.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoSeguro.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoSeguro.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoSeguro.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoSeguro.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoSeguro.addItem(reporte);
			}
			
			
			if(!this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoSeguro.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoSeguro.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoSeguro.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoSeguro.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoSeguro.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoSeguro.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoSeguro!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoSeguro.jComboBoxTiposAccionesFormularioTipoSeguro.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoSeguro.jComboBoxTiposAccionesFormularioTipoSeguro.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoSeguro.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoSeguro.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoSeguro.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoSeguro();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoSeguro() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoSeguro!=null) {
				this.jInternalFrameReporteDinamicoTipoSeguro.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoSeguro.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoSeguro!=null) {
				this.jInternalFrameReporteDinamicoTipoSeguro.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoSeguro.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoSeguro!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoSeguro.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoSeguro.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoSeguro.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoSeguro.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoSeguro.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoSeguro.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoSeguro()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoSeguro(Boolean esInicializar) throws Exception {				
		if(TipoSeguroJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoSeguro();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoSeguro() throws Exception {
		this.inicializarActualizarBindingTablaTipoSeguro(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoSeguro() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoSeguro.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoSeguro.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoSeguro.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoSeguroPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoSeguro.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoSeguro.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoSeguroPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoSeguroOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSeguroOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoSeguroPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoSeguro.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoSeguro.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoSeguroPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoSeguro.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoSeguro(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tiposeguroLogic.getTipoSeguros().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tiposeguros.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoSeguroJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoSeguro.setModel(new TipoSeguroModel(this.tiposeguroLogic.getTipoSeguros(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoSeguro.setModel(new TipoSeguroModel(this.tiposeguros,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoSeguro!=null && this.jInternalFrameOrderByTipoSeguro.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoSeguro();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoSeguro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSeguro,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoSeguroPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO,tiposeguroConstantesFunciones.resaltarSeleccionarTipoSeguro,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoSeguroConstantesFunciones.SCLASSWEBTITULO,tiposeguroConstantesFunciones.resaltarSeleccionarTipoSeguro,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoSeguro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSeguro,TipoSeguroConstantesFunciones.LABEL_ID));

		if(this.tiposeguroConstantesFunciones.mostraridTipoSeguro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoSeguroConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiposeguroConstantesFunciones.resaltaridTipoSeguro,this.tiposeguroConstantesFunciones.activaridTipoSeguro,this,true,"idTipoSeguro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiposeguroConstantesFunciones.resaltaridTipoSeguro,this.tiposeguroConstantesFunciones.activaridTipoSeguro,this,true,"idTipoSeguro","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoSeguro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSeguro,TipoSeguroConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tiposeguroConstantesFunciones.mostrarid_empresaTipoSeguro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoSeguroConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tiposeguroConstantesFunciones.resaltarid_empresaTipoSeguro,this,this.tiposeguroConstantesFunciones.activarid_empresaTipoSeguro));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tiposeguroConstantesFunciones.resaltarid_empresaTipoSeguro,this,this.tiposeguroConstantesFunciones.activarid_empresaTipoSeguro,false,"id_empresaTipoSeguro","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoSeguroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoSeguro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSeguro,TipoSeguroConstantesFunciones.LABEL_CODIGO));

		if(this.tiposeguroConstantesFunciones.mostrarcodigoTipoSeguro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoSeguroConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiposeguroConstantesFunciones.resaltarcodigoTipoSeguro,this.tiposeguroConstantesFunciones.activarcodigoTipoSeguro,this,true,"codigoTipoSeguro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiposeguroConstantesFunciones.resaltarcodigoTipoSeguro,this.tiposeguroConstantesFunciones.activarcodigoTipoSeguro,this,true,"codigoTipoSeguro","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoSeguroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoSeguro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSeguro,TipoSeguroConstantesFunciones.LABEL_NOMBRE));

		if(this.tiposeguroConstantesFunciones.mostrarnombreTipoSeguro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoSeguroConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiposeguroConstantesFunciones.resaltarnombreTipoSeguro,this.tiposeguroConstantesFunciones.activarnombreTipoSeguro,this,true,"nombreTipoSeguro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiposeguroConstantesFunciones.resaltarnombreTipoSeguro,this.tiposeguroConstantesFunciones.activarnombreTipoSeguro,this,true,"nombreTipoSeguro","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoSeguroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tiposeguroSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiposeguroSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiposeguroSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoSeguro.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiposeguroSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiposeguroSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoSeguro.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoSeguro && this.isPermisoGuardarCambiosTipoSeguro) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tiposeguroSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tiposeguroSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoSeguro.addColumn(tableColumn);
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
			
			this.jTableDatosTipoSeguro.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoSeguro && this.isPermisoGuardarCambiosTipoSeguro) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoSeguro && this.isPermisoGuardarCambiosTipoSeguro) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoSeguro.moveColumn(this.jTableDatosTipoSeguro.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoSeguro.moveColumn(this.jTableDatosTipoSeguro.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoSeguro.moveColumn(this.jTableDatosTipoSeguro.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoSeguro.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoSeguro.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoSeguro,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoSeguroJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoSeguro.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoSeguro.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoSeguroJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoSeguroJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoSeguro.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoSeguro.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoSeguro.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tiposeguroLogic.getTipoSeguros().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tiposeguros.size()-1;
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
		//this.jTableDatosTipoSeguro.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoSeguro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoSeguro();
			
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
				
				//this.isEsNuevoTipoSeguro=false;
					
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
			
				if(this.tiposeguroSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoSeguro==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoSeguro.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoSeguro.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguro =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposeguro =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tiposeguro.getsType().equals("DUPLICADO")
				   || this.tiposeguro.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoSeguro=true;
				
				} else {
					this.isEsNuevoTipoSeguro=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
					if(this.tiposeguro.getId()>=0 && !this.tiposeguro.getIsNew()) {						
						this.isEsNuevoTipoSeguro=false;
						
					} else {
						this.isEsNuevoTipoSeguro=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoSeguro(esRelaciones);						
				
				this.seleccionarTipoSeguro(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tiposeguro.getId()<0) {
					this.isEsNuevoTipoSeguro=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoSeguro(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoSeguro(evt,rowIndex);
				}	
				
				if(this.tiposeguroSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoSeguro: " + this.dDif); 
					}
				}								
				
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoSeguro(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tiposeguro)) {
					if(this.tiposeguro.getId()>0) {
						this.tiposeguro.setIsDeleted(true);
						
						this.tiposegurosEliminados.add(this.tiposeguro);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiposeguroLogic.getTipoSeguros().remove(this.tiposeguro);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiposeguros.remove(this.tiposeguro);				
					}
					
					
					((TipoSeguroModel) this.jTableDatosTipoSeguro.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoSeguro(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoSeguro(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoSeguro) {
			
			if(this.jInternalFrameDetalleFormTipoSeguro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoSeguro.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoSeguro.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguro =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposeguro =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoSeguroJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoSeguro(this.tiposeguro);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tiposeguroConstantesFunciones.cargarid_empresaTipoSeguro || this.tiposeguroConstantesFunciones.event_dependid_empresaTipoSeguro) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tiposeguro.getid_empresa());
									//this.inicializarActualizarBindingTipoSeguro(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tiposeguro.getEmpresa()!=null) {
							this.empresasForeignKey.add(tiposeguro.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tiposeguro.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoSeguro("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoSeguro(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoSeguro() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoSeguro(TipoSeguro tiposeguro) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoSeguro(tiposeguro,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoSeguro(TipoSeguro tiposeguro,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoSeguro(tiposeguro);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoSeguro(tiposeguro,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoSeguro(tiposeguro);
	}
	
	public void setVariablesObjetoActualToFormularioTipoSeguro(TipoSeguro tiposeguro) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoSeguro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoSeguro.jLabelidTipoSeguro.setText(tiposeguro.getId().toString());
			this.jInternalFrameDetalleFormTipoSeguro.jTextFieldcodigoTipoSeguro.setText(tiposeguro.getcodigo());
			this.jInternalFrameDetalleFormTipoSeguro.jTextAreanombreTipoSeguro.setText(tiposeguro.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoSeguro tiposeguroLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tiposeguroLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoSeguro tiposeguroLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tiposeguroLocal=this.tiposeguro;
			} else {
				tiposeguroLocal=this.tiposeguroAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tiposeguroLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoSeguro(tiposeguroLocal,true);
					
					if(tiposeguroSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tiposeguroLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tiposeguroLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoSeguro(TipoSeguro tiposeguro,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoSeguro(tiposeguro,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoSeguro(tiposeguro);
	}
	
	public void setVariablesFormularioToObjetoActualTipoSeguro(TipoSeguro tiposeguro,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoSeguro(tiposeguro,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoSeguro(TipoSeguro tiposeguro,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoSeguro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoSeguro.jLabelidTipoSeguro.getText()==null || this.jInternalFrameDetalleFormTipoSeguro.jLabelidTipoSeguro.getText()=="" || this.jInternalFrameDetalleFormTipoSeguro.jLabelidTipoSeguro.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoSeguro.jLabelidTipoSeguro.setText("0");
			}

			if(conColumnasBase) {tiposeguro.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoSeguro.jLabelidTipoSeguro.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoSeguroConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSeguro.jLabelIdTipoSeguro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiposeguro.setcodigo(this.jInternalFrameDetalleFormTipoSeguro.jTextFieldcodigoTipoSeguro.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoSeguroConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSeguro.jLabelcodigoTipoSeguro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiposeguro.setnombre(this.jInternalFrameDetalleFormTipoSeguro.jTextAreanombreTipoSeguro.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoSeguroConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSeguro.jLabelnombreTipoSeguro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoSeguro(TipoSeguro tiposeguroBean,TipoSeguro tiposeguro,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoSeguro(TipoSeguro tiposeguroOrigen,TipoSeguro tiposeguro,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiposeguroOrigen.getId()!=null && !tiposeguroOrigen.getId().equals(0L))) {tiposeguro.setId(tiposeguroOrigen.getId());}}
			if(conDefault || (!conDefault && tiposeguroOrigen.getcodigo()!=null && !tiposeguroOrigen.getcodigo().equals(""))) {tiposeguro.setcodigo(tiposeguroOrigen.getcodigo());}
			if(conDefault || (!conDefault && tiposeguroOrigen.getnombre()!=null && !tiposeguroOrigen.getnombre().equals(""))) {tiposeguro.setnombre(tiposeguroOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoSeguro(TipoSeguro tiposeguro) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoSeguro.jLabelidTipoSeguro.setText(tiposeguro.getId().toString());
			this.jInternalFrameDetalleFormTipoSeguro.jTextFieldcodigoTipoSeguro.setText(tiposeguro.getcodigo());
			this.jInternalFrameDetalleFormTipoSeguro.jTextAreanombreTipoSeguro.setText(tiposeguro.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoSeguro(TipoSeguroBean tiposeguroBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoSeguro.jLabelidTipoSeguro.setText(tiposeguroBean.getId().toString());
			this.jInternalFrameDetalleFormTipoSeguro.jTextFieldcodigoTipoSeguro.setText(tiposeguroBean.getcodigo());
			this.jInternalFrameDetalleFormTipoSeguro.jTextAreanombreTipoSeguro.setText(tiposeguroBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoSeguro(TipoSeguroParameterReturnGeneral tiposeguroReturnGeneral,TipoSeguroBean tiposeguroBean,Boolean conDefault) throws Exception { 
		try {
			TipoSeguro tiposeguroLocal=new TipoSeguro();
			
			tiposeguroLocal=tiposeguroReturnGeneral.getTipoSeguro();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiposeguroLocal.getId()!=null && !tiposeguroLocal.getId().equals(0L))) {tiposeguroBean.setId(tiposeguroLocal.getId());}}
			if(conDefault || (!conDefault && tiposeguroLocal.getcodigo()!=null && !tiposeguroLocal.getcodigo().equals(""))) {tiposeguroBean.setcodigo(tiposeguroLocal.getcodigo());}
			if(conDefault || (!conDefault && tiposeguroLocal.getnombre()!=null && !tiposeguroLocal.getnombre().equals(""))) {tiposeguroBean.setnombre(tiposeguroLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoSeguroGenerico(Long idTipoSeguroSeleccionado,JComboBox jComboBoxTipoSeguro,List<TipoSeguro> tiposegurosLocal)throws Exception {
		try {
			TipoSeguro  tiposeguroTemp=null;

			for(TipoSeguro tiposeguroAux:tiposegurosLocal) {
				if(tiposeguroAux.getId()!=null && tiposeguroAux.getId().equals(idTipoSeguroSeleccionado)) {
					tiposeguroTemp=tiposeguroAux;
					break;
				}
			}

			jComboBoxTipoSeguro.setSelectedItem(tiposeguroTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoSeguroGenerico(JComboBox jComboBoxTipoSeguro,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoSeguro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoSeguro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoSeguro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoSeguro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoSeguro.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoSeguro.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoSeguro.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoSeguro.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoSeguro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoSeguro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiposeguro=(TipoSeguro) tiposeguroLogic.getTipoSeguros().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiposeguro =(TipoSeguro) tiposeguros.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tiposeguro.getIsNew() && !tiposeguro.getIsChanged() && !tiposeguro.getIsDeleted()) {
				sDescripcion=tiposeguro.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tiposeguro.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoSeguro tiposeguroRow=new TipoSeguro();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiposeguroRow=(TipoSeguro) tiposeguroLogic.getTipoSeguros().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiposeguroRow=(TipoSeguro) tiposeguros.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoSeguro(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoSeguro.setVisible((this.isVisibilidadCeldaNuevoTipoSeguro && this.isPermisoNuevoTipoSeguro));			
			this.jButtonDuplicarTipoSeguro.setVisible((this.isVisibilidadCeldaDuplicarTipoSeguro && this.isPermisoDuplicarTipoSeguro));			
			this.jButtonCopiarTipoSeguro.setVisible((this.isVisibilidadCeldaCopiarTipoSeguro && this.isPermisoCopiarTipoSeguro));
			this.jButtonVerFormTipoSeguro.setVisible((this.isVisibilidadCeldaVerFormTipoSeguro && this.isPermisoVerFormTipoSeguro));
			
			this.jButtonAbrirOrderByTipoSeguro.setVisible((this.isVisibilidadCeldaOrdenTipoSeguro && this.isPermisoOrdenTipoSeguro));			
			
			this.jButtonNuevoRelacionesTipoSeguro.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoSeguro && this.isPermisoNuevoTipoSeguro));			
			this.jButtonNuevoGuardarCambiosTipoSeguro.setVisible((this.isVisibilidadCeldaNuevoTipoSeguro && this.isPermisoNuevoTipoSeguro && this.isPermisoGuardarCambiosTipoSeguro));
			
			if(this.jInternalFrameDetalleFormTipoSeguro!=null) {
			this.jInternalFrameDetalleFormTipoSeguro.jButtonModificarTipoSeguro.setVisible((this.isVisibilidadCeldaModificarTipoSeguro && this.isPermisoActualizarTipoSeguro));	
			this.jInternalFrameDetalleFormTipoSeguro.jButtonActualizarTipoSeguro.setVisible((this.isVisibilidadCeldaActualizarTipoSeguro && this.isPermisoActualizarTipoSeguro));	
			this.jInternalFrameDetalleFormTipoSeguro.jButtonEliminarTipoSeguro.setVisible((this.isVisibilidadCeldaEliminarTipoSeguro && this.isPermisoEliminarTipoSeguro));
			this.jInternalFrameDetalleFormTipoSeguro.jButtonCancelarTipoSeguro.setVisible(this.isVisibilidadCeldaCancelarTipoSeguro);							
			this.jInternalFrameDetalleFormTipoSeguro.jButtonGuardarCambiosTipoSeguro.setVisible((this.isVisibilidadCeldaGuardarTipoSeguro && this.isPermisoGuardarCambiosTipoSeguro));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoSeguro.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoSeguro && this.isPermisoGuardarCambiosTipoSeguro));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoSeguro.setVisible((this.isVisibilidadCeldaNuevoTipoSeguro && this.isPermisoNuevoTipoSeguro));						
			this.jButtonDuplicarToolBarTipoSeguro.setVisible((this.isVisibilidadCeldaDuplicarTipoSeguro && this.isPermisoDuplicarTipoSeguro));						
			this.jButtonCopiarToolBarTipoSeguro.setVisible((this.isVisibilidadCeldaCopiarTipoSeguro && this.isPermisoCopiarTipoSeguro));			
			this.jButtonVerFormToolBarTipoSeguro.setVisible((this.isVisibilidadCeldaVerFormTipoSeguro && this.isPermisoVerFormTipoSeguro));			
			this.jButtonAbrirOrderByToolBarTipoSeguro.setVisible((this.isVisibilidadCeldaOrdenTipoSeguro && this.isPermisoOrdenTipoSeguro));
			this.jButtonNuevoRelacionesToolBarTipoSeguro.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoSeguro && this.isPermisoNuevoTipoSeguro));			
			this.jButtonNuevoGuardarCambiosToolBarTipoSeguro.setVisible((this.isVisibilidadCeldaNuevoTipoSeguro && this.isPermisoNuevoTipoSeguro && this.isPermisoGuardarCambiosTipoSeguro));			
			
			if(this.jInternalFrameDetalleFormTipoSeguro!=null) {
			this.jInternalFrameDetalleFormTipoSeguro.jButtonModificarToolBarTipoSeguro.setVisible((this.isVisibilidadCeldaModificarTipoSeguro && this.isPermisoActualizarTipoSeguro));	
			this.jInternalFrameDetalleFormTipoSeguro.jButtonActualizarToolBarTipoSeguro.setVisible((this.isVisibilidadCeldaActualizarTipoSeguro  && this.isPermisoActualizarTipoSeguro));	
			this.jInternalFrameDetalleFormTipoSeguro.jButtonEliminarToolBarTipoSeguro.setVisible((this.isVisibilidadCeldaEliminarTipoSeguro && this.isPermisoEliminarTipoSeguro));
			this.jInternalFrameDetalleFormTipoSeguro.jButtonCancelarToolBarTipoSeguro.setVisible(this.isVisibilidadCeldaCancelarTipoSeguro);				
			this.jInternalFrameDetalleFormTipoSeguro.jButtonGuardarCambiosToolBarTipoSeguro.setVisible((this.isVisibilidadCeldaGuardarTipoSeguro && this.isPermisoGuardarCambiosTipoSeguro));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoSeguro.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoSeguro && this.isPermisoGuardarCambiosTipoSeguro));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoSeguro.setVisible((this.isVisibilidadCeldaNuevoTipoSeguro && this.isPermisoNuevoTipoSeguro));			
			this.jMenuItemDuplicarTipoSeguro.setVisible((this.isVisibilidadCeldaDuplicarTipoSeguro && this.isPermisoDuplicarTipoSeguro));			
			this.jMenuItemCopiarTipoSeguro.setVisible((this.isVisibilidadCeldaCopiarTipoSeguro && this.isPermisoCopiarTipoSeguro));			
			this.jMenuItemVerFormTipoSeguro.setVisible((this.isVisibilidadCeldaVerFormTipoSeguro && this.isPermisoVerFormTipoSeguro));			
			this.jMenuItemAbrirOrderByTipoSeguro.setVisible((this.isVisibilidadCeldaOrdenTipoSeguro && this.isPermisoOrdenTipoSeguro));			
			//this.jMenuItemMostrarOcultarTipoSeguro.setVisible((this.isVisibilidadCeldaOrdenTipoSeguro && this.isPermisoOrdenTipoSeguro));
			this.jMenuItemDetalleAbrirOrderByTipoSeguro.setVisible((this.isVisibilidadCeldaOrdenTipoSeguro && this.isPermisoOrdenTipoSeguro));			
			//this.jMenuItemDetalleMostrarOcultarTipoSeguro.setVisible((this.isVisibilidadCeldaOrdenTipoSeguro && this.isPermisoOrdenTipoSeguro));			
			this.jMenuItemNuevoRelacionesTipoSeguro.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoSeguro && this.isPermisoNuevoTipoSeguro));			
			this.jMenuItemNuevoGuardarCambiosTipoSeguro.setVisible((this.isVisibilidadCeldaNuevoTipoSeguro && this.isPermisoNuevoTipoSeguro && this.isPermisoGuardarCambiosTipoSeguro));									
			
			if(this.jInternalFrameDetalleFormTipoSeguro!=null) {
			this.jInternalFrameDetalleFormTipoSeguro.jMenuItemModificarTipoSeguro.setVisible((this.isVisibilidadCeldaModificarTipoSeguro && this.isPermisoActualizarTipoSeguro));	
			this.jInternalFrameDetalleFormTipoSeguro.jMenuItemActualizarTipoSeguro.setVisible((this.isVisibilidadCeldaActualizarTipoSeguro && this.isPermisoActualizarTipoSeguro));	
			this.jInternalFrameDetalleFormTipoSeguro.jMenuItemEliminarTipoSeguro.setVisible((this.isVisibilidadCeldaEliminarTipoSeguro && this.isPermisoEliminarTipoSeguro));
			this.jInternalFrameDetalleFormTipoSeguro.jMenuItemCancelarTipoSeguro.setVisible(this.isVisibilidadCeldaCancelarTipoSeguro);				
			}
			
			this.jMenuItemGuardarCambiosTipoSeguro.setVisible((this.isVisibilidadCeldaGuardarTipoSeguro && this.isPermisoGuardarCambiosTipoSeguro));						
			this.jMenuItemGuardarCambiosTablaTipoSeguro.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoSeguro && this.isPermisoGuardarCambiosTipoSeguro));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoSeguro=this.jButtonNuevoTipoSeguro.isVisible();
			this.isVisibilidadCeldaDuplicarTipoSeguro=this.jButtonDuplicarTipoSeguro.isVisible();
			this.isVisibilidadCeldaCopiarTipoSeguro=this.jButtonCopiarTipoSeguro.isVisible();
			this.isVisibilidadCeldaVerFormTipoSeguro=this.jButtonVerFormTipoSeguro.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoSeguro=this.jButtonAbrirOrderByTipoSeguro.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoSeguro=this.jButtonNuevoRelacionesTipoSeguro.isVisible();
			this.isVisibilidadCeldaModificarTipoSeguro=this.jButtonModificarTipoSeguro.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoSeguro!=null) {
			this.isVisibilidadCeldaActualizarTipoSeguro=this.jInternalFrameDetalleFormTipoSeguro.jButtonActualizarTipoSeguro.isVisible();
			this.isVisibilidadCeldaEliminarTipoSeguro=this.jInternalFrameDetalleFormTipoSeguro.jButtonEliminarTipoSeguro.isVisible();
			this.isVisibilidadCeldaCancelarTipoSeguro=this.jInternalFrameDetalleFormTipoSeguro.jButtonCancelarTipoSeguro.isVisible();
			this.isVisibilidadCeldaGuardarTipoSeguro=this.jInternalFrameDetalleFormTipoSeguro.jButtonGuardarCambiosTipoSeguro.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoSeguro=this.jButtonGuardarCambiosTablaTipoSeguro.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoSeguro=this.jButtonNuevoToolBarTipoSeguro.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoSeguro=this.jButtonNuevoRelacionesToolBarTipoSeguro.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoSeguro!=null) {
			this.isVisibilidadCeldaModificarTipoSeguro=this.jInternalFrameDetalleFormTipoSeguro.jButtonModificarToolBarTipoSeguro.isVisible();
			this.isVisibilidadCeldaActualizarTipoSeguro=this.jInternalFrameDetalleFormTipoSeguro.jButtonActualizarToolBarTipoSeguro.isVisible();
			this.isVisibilidadCeldaEliminarTipoSeguro=this.jInternalFrameDetalleFormTipoSeguro.jButtonEliminarToolBarTipoSeguro.isVisible();
			this.isVisibilidadCeldaCancelarTipoSeguro=this.jInternalFrameDetalleFormTipoSeguro.jButtonCancelarToolBarTipoSeguro.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoSeguro=this.jButtonGuardarCambiosToolBarTipoSeguro.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoSeguro=this.jButtonGuardarCambiosTablaToolBarTipoSeguro.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoSeguro=this.jMenuItemNuevoTipoSeguro.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoSeguro=this.jMenuItemNuevoRelacionesTipoSeguro.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoSeguro!=null) {
			this.isVisibilidadCeldaModificarTipoSeguro=this.jInternalFrameDetalleFormTipoSeguro.jMenuItemModificarTipoSeguro.isVisible();
			this.isVisibilidadCeldaActualizarTipoSeguro=this.jInternalFrameDetalleFormTipoSeguro.jMenuItemActualizarTipoSeguro.isVisible();
			this.isVisibilidadCeldaEliminarTipoSeguro=this.jInternalFrameDetalleFormTipoSeguro.jMenuItemEliminarTipoSeguro.isVisible();
			this.isVisibilidadCeldaCancelarTipoSeguro=this.jInternalFrameDetalleFormTipoSeguro.jMenuItemCancelarTipoSeguro.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoSeguro=this.jMenuItemGuardarCambiosTipoSeguro.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoSeguro=this.jMenuItemGuardarCambiosTablaTipoSeguro.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoSeguro(Boolean esInicializar) {
		if(TipoSeguroJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tiposeguroSessionBean.getConGuardarRelaciones()) {
				//if(this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoSeguro();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoSeguro(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoSeguro() {
		this.jButtonNuevoTipoSeguro.setVisible(this.isPermisoNuevoTipoSeguro);			
		this.jButtonDuplicarTipoSeguro.setVisible(this.isPermisoDuplicarTipoSeguro);			
		this.jButtonCopiarTipoSeguro.setVisible(this.isPermisoCopiarTipoSeguro);			
		this.jButtonVerFormTipoSeguro.setVisible(this.isPermisoVerFormTipoSeguro);			
		
		this.jButtonAbrirOrderByTipoSeguro.setVisible(this.isPermisoOrdenTipoSeguro);					
		
		this.jButtonNuevoRelacionesTipoSeguro.setVisible(this.isPermisoNuevoTipoSeguro);			
		
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSeguro.jButtonModificarTipoSeguro.setVisible(this.isPermisoActualizarTipoSeguro);	
			this.jInternalFrameDetalleFormTipoSeguro.jButtonActualizarTipoSeguro.setVisible(this.isPermisoActualizarTipoSeguro);	
			this.jInternalFrameDetalleFormTipoSeguro.jButtonEliminarTipoSeguro.setVisible(this.isPermisoEliminarTipoSeguro);
			this.jInternalFrameDetalleFormTipoSeguro.jButtonCancelarTipoSeguro.setVisible(this.isVisibilidadCeldaCancelarTipoSeguro);						
			this.jInternalFrameDetalleFormTipoSeguro.jButtonGuardarCambiosTipoSeguro.setVisible(this.isPermisoGuardarCambiosTipoSeguro);							
		}
		
		this.jButtonGuardarCambiosTablaTipoSeguro.setVisible(this.isPermisoActualizarTipoSeguro);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoSeguro() {
		this.jInternalFrameDetalleFormTipoSeguro.jButtonModificarTipoSeguro.setVisible(this.isPermisoActualizarTipoSeguro);	
		this.jInternalFrameDetalleFormTipoSeguro.jButtonActualizarTipoSeguro.setVisible(this.isPermisoActualizarTipoSeguro);	
		this.jInternalFrameDetalleFormTipoSeguro.jButtonEliminarTipoSeguro.setVisible(this.isPermisoEliminarTipoSeguro);
		this.jInternalFrameDetalleFormTipoSeguro.jButtonCancelarTipoSeguro.setVisible(this.isVisibilidadCeldaCancelarTipoSeguro);							
		this.jInternalFrameDetalleFormTipoSeguro.jButtonGuardarCambiosTipoSeguro.setVisible((this.isVisibilidadCeldaGuardarTipoSeguro && this.isPermisoGuardarCambiosTipoSeguro));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoSeguro() {
		if(TipoSeguroJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoSeguro();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoSeguro() {
	}
	
	public void jTableDatosTipoSeguroListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoSeguro(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoSeguroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoSeguro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoSeguro(this.gettiposeguro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSeguro(this.tiposeguro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposeguro =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiposeguro =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiposeguro==null) {
						this.tiposeguro = new TipoSeguro();
					}

					this.setVariablesFormularioToObjetoActualTipoSeguro(this.tiposeguro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSeguro(this.tiposeguro);
				}

				if(this.tiposeguro.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tiposeguro.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoSeguro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoSeguroUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoSeguro(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoSeguro.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoSeguro.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoSeguro.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguro =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiposeguro =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoSeguro(this.gettiposeguro(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoSeguro(this.tiposeguro);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tiposeguroLogic.getConnexion());

				if(this.tiposeguro.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tiposeguro.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoSeguro=(TitledBorder)this.jScrollPanelDatosTipoSeguro.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoSeguro.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoSeguroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoSeguro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoSeguro(this.gettiposeguro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSeguro(this.tiposeguro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposeguro =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiposeguro =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiposeguro==null) {
						this.tiposeguro = new TipoSeguro();
					}

					this.setVariablesFormularioToObjetoActualTipoSeguro(this.tiposeguro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSeguro(this.tiposeguro);
				}

				if(this.tiposeguro.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tiposeguro.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoSeguro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoSeguroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoSeguro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoSeguro(this.gettiposeguro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSeguro(this.tiposeguro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposeguro =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiposeguro =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiposeguro==null) {
						this.tiposeguro = new TipoSeguro();
					}

					this.setVariablesFormularioToObjetoActualTipoSeguro(this.tiposeguro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSeguro(this.tiposeguro);
				}

				if(this.tiposeguro.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tiposeguro.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoSeguro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoSeguroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoSeguro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoSeguro(this.gettiposeguro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSeguro(this.tiposeguro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposeguro =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiposeguro =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiposeguro==null) {
						this.tiposeguro = new TipoSeguro();
					}

					this.setVariablesFormularioToObjetoActualTipoSeguro(this.tiposeguro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSeguro(this.tiposeguro);
				}

				if(this.tiposeguro.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tiposeguro.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoSeguro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguroLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoSeguroActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoSeguro(false,false);

			this.getTipoSegurosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoSeguro(false);

			//if(TipoSeguroBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoSeguro(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposeguroLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoSeguro() {
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) {
			this.jInternalFrameDetalleFormTipoSeguro.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoSeguro.dispose();
			this.jInternalFrameDetalleFormTipoSeguro=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoSeguro!=null) {
			this.jInternalFrameReporteDinamicoTipoSeguro.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoSeguro.dispose();
			this.jInternalFrameReporteDinamicoTipoSeguro=null;
		}
		
		if(this.jInternalFrameImportacionTipoSeguro!=null) {
			this.jInternalFrameImportacionTipoSeguro.setVisible(false);	    			
			this.jInternalFrameImportacionTipoSeguro.dispose();
			this.jInternalFrameImportacionTipoSeguro=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoSeguro();
			
			TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoSeguro")) {
				jButtonNuevoTipoSeguroActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoSeguro")) {
				jButtonDuplicarTipoSeguroActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoSeguro")) {
				jButtonCopiarTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoSeguro")) {
				jButtonVerFormTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoSeguro")) {
				jButtonNuevoTipoSeguroActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoSeguro")) {
				jButtonDuplicarTipoSeguroActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoSeguro")) {
				jButtonNuevoTipoSeguroActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoSeguro")) {
				jButtonDuplicarTipoSeguroActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoSeguro")) {
				jButtonNuevoTipoSeguroActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoSeguro")) {
				jButtonNuevoTipoSeguroActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoSeguro")) {
				jButtonNuevoTipoSeguroActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoSeguro")) {
				jButtonModificarTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoSeguro")) {
				jButtonModificarTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoSeguro")) {
				jButtonModificarTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoSeguro")) {
				jButtonActualizarTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoSeguro")) {
				jButtonActualizarTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoSeguro")) {
				jButtonActualizarTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoSeguro")) {
				jButtonEliminarTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoSeguro")) {
				jButtonEliminarTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoSeguro")) {
				jButtonEliminarTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoSeguro")) {
				jButtonCancelarTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoSeguro")) {
				jButtonCancelarTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoSeguro")) {
				jButtonCancelarTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoSeguro")) {
				jButtonCerrarTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoSeguro")) {
				jButtonCerrarTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoSeguro")) {
				jButtonCerrarTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoSeguro")) {
				jButtonMostrarOcultarTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoSeguro")) {
				jButtonCancelarTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoSeguro")) {
				jButtonGuardarCambiosTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoSeguro")) {
				jButtonGuardarCambiosTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoSeguro")) {
				jButtonCopiarTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoSeguro")) {
				jButtonVerFormTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoSeguro")) {
				jButtonGuardarCambiosTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoSeguro")) {
				jButtonCopiarTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoSeguro")) {
				jButtonVerFormTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoSeguro")) {
				jButtonGuardarCambiosTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoSeguro")) {
				jButtonGuardarCambiosTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoSeguro")) {
				jButtonGuardarCambiosTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoSeguro")) {
				jButtonRecargarInformacionTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoSeguro")) {
				jButtonRecargarInformacionTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoSeguro")) {
				jButtonRecargarInformacionTipoSeguroActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoSeguro")) {
				jButtonAnterioresTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoSeguro")) {
				jButtonAnterioresTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoSeguro")) {
				jButtonAnterioresTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoSeguro")) {
				jButtonSiguientesTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoSeguro")) {
				jButtonSiguientesTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoSeguro")) {
				jButtonSiguientesTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoSeguro") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoSeguro")) {
				jButtonAbrirOrderByTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoSeguro") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoSeguro")) {
				jButtonMostrarOcultarTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoSeguro")) {
				jButtonNuevoGuardarCambiosTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoSeguro")) {
				jButtonNuevoGuardarCambiosTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoSeguro")) {
				jButtonNuevoGuardarCambiosTipoSeguroActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoSeguro")) {
				jButtonCerrarReporteDinamicoTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoSeguro")) {
				jButtonGenerarReporteDinamicoTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoSeguro")) {
				
				jButtonGenerarExcelReporteDinamicoTipoSeguroActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoSeguro")) {
				jButtonCerrarImportacionTipoSeguroActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoSeguro")) {
				
				jButtonGenerarImportacionTipoSeguroActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoSeguro")) {
				
				jButtonAbrirImportacionTipoSeguroActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoSeguro")) {
				jComboBoxTiposAccionesTipoSeguroActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoSeguro")) {
				jComboBoxTiposRelacionesTipoSeguroActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoSeguro")) {
				jComboBoxTiposAccionesTipoSeguroActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoSeguro")) {
				
				jComboBoxTiposSeleccionarTipoSeguroActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoSeguro")) {
				jTextFieldValorCampoGeneralTipoSeguroActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoSeguro")) {
				jButtonAbrirOrderByTipoSeguroActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoSeguro")) {
				jButtonAbrirOrderByTipoSeguroActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoSeguro")) {
				jButtonCerrarOrderByTipoSeguroActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoSeguroBusqueda")) {
				this.jButtonidTipoSeguroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoSeguroUpdate")) {
				this.jButtonid_empresaTipoSeguroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoSeguroBusqueda")) {
				this.jButtonid_empresaTipoSeguroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoSeguroBusqueda")) {
				this.jButtoncodigoTipoSeguroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoSeguroBusqueda")) {
				this.jButtonnombreTipoSeguroBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoSeguro();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSeguroActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposeguro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposeguro);
				
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
				
				


				
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSeguro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSeguro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoSeguro tiposeguroLocal=null;
			
			if(!this.getEsControlTabla()) {
				tiposeguroLocal=this.tiposeguro;
			} else {
				tiposeguroLocal=this.tiposeguroAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposeguro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposeguro);
				
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
							
				
				


				
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSeguro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSeguro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSeguroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSeguro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguroAnterior =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposeguroAnterior =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
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
			
			TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
			
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
			
			


			
			TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSeguroActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposeguro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposeguro);
				
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
								
						
				


				
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSeguro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSeguro.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposeguro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposeguro);
				
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
								
				
				


				
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSeguro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSeguro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSeguroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSeguro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguroAnterior =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposeguroAnterior =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposeguro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposeguro);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSeguroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSeguro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguroAnterior =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposeguroAnterior =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSeguroActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposeguro);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiposeguro);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposeguro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposeguro);
				
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
							
				
				


				
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSeguro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSeguro.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSeguroActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoSeguro.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposeguroAnterior =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiposeguroAnterior =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
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
			
			TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
			
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
			
			


			
			TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSeguroActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposeguro);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiposeguro);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposeguro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposeguro);
				
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
								
				
				


				
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSeguro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSeguro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSeguroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSeguro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguroAnterior =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposeguroAnterior =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSeguroActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposeguro);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiposeguro);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSeguroActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposeguro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposeguro);
				
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoSeguro")) {
					jCheckBoxSeleccionarTodosTipoSeguroItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoSeguro")) {
					jCheckBoxSeleccionadosTipoSeguroItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoSeguro")) {
					
				}
				
				


				
				
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSeguro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSeguro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposeguro);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tiposeguro);
				
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
												
				
				


				
				
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSeguro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSeguro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSeguroActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoSeguro.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposeguroAnterior =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiposeguroAnterior =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSeguroActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposeguro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposeguro);
				
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
				
				
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
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
			
			TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
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
			
			


			
			TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSeguroActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposeguro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposeguro);
				
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSeguro.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSeguro.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposeguro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposeguro);
				
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
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
				
				


				
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSeguro.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSeguro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSeguroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSeguro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposeguroAnterior =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposeguroAnterior =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoSeguro")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoSeguroListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoSeguro.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tiposeguro =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tiposeguro =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tiposeguro);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoSeguro")) {
				
				}
				
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoSeguro")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoSeguro.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoSeguro")) {
			
			}
			
			TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoSeguro();
			
			TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
			
			if(sTipo.equals("NuevoTipoSeguro")) {
				jButtonNuevoTipoSeguroActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoSeguro")) {
				jButtonDuplicarTipoSeguroActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoSeguro")) {
				jButtonCopiarTipoSeguroActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoSeguro")) {
				jButtonVerFormTipoSeguroActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoSeguro")) {
				jButtonNuevoTipoSeguroActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoSeguro")) {
				jButtonModificarTipoSeguroActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoSeguro")) {
				jButtonActualizarTipoSeguroActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoSeguro")) {
				jButtonEliminarTipoSeguroActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoSeguro")) {
				jButtonGuardarCambiosTipoSeguroActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoSeguro")) {
				jButtonCancelarTipoSeguroActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoSeguro")) {
				jButtonCerrarTipoSeguroActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoSeguro")) {
				jButtonGuardarCambiosTipoSeguroActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoSeguro")) {
				jButtonNuevoGuardarCambiosTipoSeguroActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoSeguro")) {
				jButtonAbrirOrderByTipoSeguroActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoSeguro")) {
				jButtonRecargarInformacionTipoSeguroActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoSeguro")) {
				jButtonAnterioresTipoSeguroActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoSeguro")) {
				jButtonSiguientesTipoSeguroActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoSeguroBusqueda")) {
				this.jButtonidTipoSeguroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoSeguroUpdate")) {
				this.jButtonid_empresaTipoSeguroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoSeguroBusqueda")) {
				this.jButtonid_empresaTipoSeguroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoSeguroBusqueda")) {
				this.jButtoncodigoTipoSeguroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoSeguroBusqueda")) {
				this.jButtonnombreTipoSeguroBusquedaActionPerformed(evt);
			}
			
			TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoSeguro();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoSeguro")) {
				closingInternalFrameTipoSeguro();
				
			} else if(sTipo.equals("jButtonCancelarTipoSeguro")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoSeguro = (JInternalFrameBase)evt.getSource();
	            	
	            TipoSeguroBeanSwingJInternalFrame jInternalFrameParent=(TipoSeguroBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoSeguro.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoSeguroActionPerformed(null);
			}
			
			TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiposeguro,new Object(),this.tiposeguroParameterGeneral,this.tiposeguroReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoSeguro(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoSeguro(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoSeguro(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tiposeguro)) {
			if(!esControlTabla) {
				if(TipoSeguroJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoSeguro(this.tiposeguro,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSeguro(this.tiposeguro);			
				}
				
				if(this.tiposeguroSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoSeguro(this.tiposeguro,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiposeguroReturnGeneral=tiposeguroLogic.procesarEventosTipoSegurosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiposeguroLogic.getTipoSeguros(),this.tiposeguro,this.tiposeguroParameterGeneral,this.isEsNuevoTipoSeguro,classes);//this.tiposeguroLogic.getTipoSeguro()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoSeguro(this.tiposeguroReturnGeneral,this.tiposeguroBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tiposeguroSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoSeguro(classes,this.tiposeguroReturnGeneral,this.tiposeguroBean,false);
					}
						
					if(this.tiposeguroReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoSeguro(this.tiposeguroReturnGeneral.getTipoSeguro());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoSeguro(this.tiposeguroReturnGeneral.getTipoSeguro());	
					}
						
					if(this.tiposeguroReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoSeguro(this.tiposeguroReturnGeneral.getTipoSeguro(),classes);//this.tiposeguroBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoSeguro(this.tiposeguro,classes);//this.tiposeguroBean);									
				}
			
				if(TipoSeguroJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoSeguro(this.tiposeguro,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSeguro(this.tiposeguro);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tiposeguroAnterior!=null) {
						this.tiposeguro=this.tiposeguroAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiposeguroReturnGeneral=tiposeguroLogic.procesarEventosTipoSegurosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiposeguroLogic.getTipoSeguros(),this.tiposeguro,this.tiposeguroParameterGeneral,this.isEsNuevoTipoSeguro,classes);//this.tiposeguroLogic.getTipoSeguro()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiposeguroSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiposeguroSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tiposeguroReturnGeneral.getTipoSeguro(),tiposeguroLogic.getTipoSeguros());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tiposeguroReturnGeneral.getTipoSeguro(),this.tiposeguros);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoSeguro.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoSeguro.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoSeguro();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoSeguro() throws Exception {
		
		TipoSeguroModel tiposeguroModel=(TipoSeguroModel)this.jTableDatosTipoSeguro.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiposeguroModel.tiposeguros=this.tiposeguroLogic.getTipoSeguros();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tiposeguroModel.tiposeguros=this.tiposeguros;
		}
		
		
		((TipoSeguroModel) this.jTableDatosTipoSeguro.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoSeguro() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettiposeguroAnterior(),this.tiposeguroLogic.getTipoSeguros());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettiposeguroAnterior(),this.tiposeguros);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoSeguro();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoSeguro(TipoSeguro tiposeguro,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
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
										
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiposeguro,new Object(),generalEntityParameterGeneral,this.tiposeguroReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tiposeguroSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoSeguroConstantesFunciones.getClassesRelationshipsOfTipoSeguro(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoSeguroConstantesFunciones.getClassesRelationshipsFromStringsOfTipoSeguro(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoSeguro(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoSeguroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiposeguro,new Object(),generalEntityParameterGeneral,this.tiposeguroReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoSeguro(TipoSeguroBean tiposeguroBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoSeguro(ArrayList<Classe> classes,TipoSeguroReturnGeneral tiposeguroReturnGeneral,TipoSeguroBean tiposeguroBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoSeguro(TipoSeguro tiposeguro,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tiposeguro)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoSeguro = new TipoSeguroDetalleFormJInternalFrame(jDesktopPane,this.tiposeguroSessionBean.getConGuardarRelaciones(),this.tiposeguroSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoSeguro);
		this.jInternalFrameDetalleFormTipoSeguro.setVisible(false);
		this.jInternalFrameDetalleFormTipoSeguro.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoSeguro.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoSeguro.tiposeguroLogic=this.tiposeguroLogic;
		
		this.cargarCombosFrameForeignKeyTipoSeguro("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoSeguro();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoSeguro();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoSeguro("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoSeguro();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoSeguro.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoSeguro"));
		
		this.jInternalFrameDetalleFormTipoSeguro.jButtonModificarTipoSeguro.addActionListener(new ButtonActionListener(this,"ModificarTipoSeguro"));

		
		this.jInternalFrameDetalleFormTipoSeguro.jButtonModificarToolBarTipoSeguro.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoSeguro"));
					
		this.jInternalFrameDetalleFormTipoSeguro.jMenuItemModificarTipoSeguro.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoSeguro"));		
		
		
		
		this.jInternalFrameDetalleFormTipoSeguro.jButtonActualizarTipoSeguro.addActionListener (new ButtonActionListener(this,"ActualizarTipoSeguro"));
		
		
		this.jInternalFrameDetalleFormTipoSeguro.jButtonActualizarToolBarTipoSeguro.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoSeguro"));
						
		this.jInternalFrameDetalleFormTipoSeguro.jMenuItemActualizarTipoSeguro.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoSeguro"));		
		
		
		
		this.jInternalFrameDetalleFormTipoSeguro.jButtonEliminarTipoSeguro.addActionListener (new ButtonActionListener(this,"EliminarTipoSeguro"));
		
		
		this.jInternalFrameDetalleFormTipoSeguro.jButtonEliminarToolBarTipoSeguro.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoSeguro"));
								
		this.jInternalFrameDetalleFormTipoSeguro.jMenuItemEliminarTipoSeguro.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoSeguro"));		
		
		
		
		this.jInternalFrameDetalleFormTipoSeguro.jButtonCancelarTipoSeguro.addActionListener (new ButtonActionListener(this,"CancelarTipoSeguro"));
		
		
		this.jInternalFrameDetalleFormTipoSeguro.jButtonCancelarToolBarTipoSeguro.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoSeguro"));
					
		this.jInternalFrameDetalleFormTipoSeguro.jMenuItemCancelarTipoSeguro.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoSeguro"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoSeguro.jMenuItemDetalleCerrarTipoSeguro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoSeguro"));		
		
		
		
		this.jInternalFrameDetalleFormTipoSeguro.jButtonGuardarCambiosToolBarTipoSeguro.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoSeguro"));
		
		
		
		this.jInternalFrameDetalleFormTipoSeguro.jButtonGuardarCambiosToolBarTipoSeguro.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoSeguro"));
		
		
		
		this.jInternalFrameDetalleFormTipoSeguro.jComboBoxTiposAccionesFormularioTipoSeguro.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoSeguro"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSeguro.jButtonidTipoSeguroBusqueda.addActionListener(new ButtonActionListener(this,"idTipoSeguroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoSeguro.jButtonid_empresaTipoSeguroUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoSeguroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSeguro.jButtonid_empresaTipoSeguroBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoSeguroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSeguro.jButtoncodigoTipoSeguroBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoSeguroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSeguro.jButtonnombreTipoSeguroBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoSeguroBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoSeguro.jTabbedPaneRelacionesTipoSeguro.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoSeguro"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoSeguro"));
		
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSeguro.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoSeguro"));
		}
		
		this.jTableDatosTipoSeguro.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoSeguro"));
		
		this.jTableDatosTipoSeguro.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoSeguro"));
		
		this.jButtonNuevoTipoSeguro.addActionListener(new ButtonActionListener(this,"NuevoTipoSeguro"));
		
		this.jButtonDuplicarTipoSeguro.addActionListener(new ButtonActionListener(this,"DuplicarTipoSeguro"));
		
		this.jButtonCopiarTipoSeguro.addActionListener(new ButtonActionListener(this,"CopiarTipoSeguro"));
		
		this.jButtonVerFormTipoSeguro.addActionListener(new ButtonActionListener(this,"VerFormTipoSeguro"));
		
		
		this.jButtonNuevoToolBarTipoSeguro.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoSeguro"));
			
		this.jButtonDuplicarToolBarTipoSeguro.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoSeguro"));
			
		this.jMenuItemNuevoTipoSeguro.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoSeguro"));
			
		this.jMenuItemDuplicarTipoSeguro.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoSeguro"));		
		
		
		this.jButtonNuevoRelacionesTipoSeguro.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoSeguro"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoSeguro.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoSeguro"));
			
		this.jMenuItemNuevoRelacionesTipoSeguro.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoSeguro"));		
		
		
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSeguro.jButtonModificarTipoSeguro.addActionListener(new ButtonActionListener(this,"ModificarTipoSeguro"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSeguro.jButtonModificarToolBarTipoSeguro.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoSeguro"));
			
			this.jInternalFrameDetalleFormTipoSeguro.jMenuItemModificarTipoSeguro.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoSeguro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoSeguro.jButtonActualizarTipoSeguro.addActionListener (new ButtonActionListener(this,"ActualizarTipoSeguro"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSeguro.jButtonActualizarToolBarTipoSeguro.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoSeguro"));
				
			this.jInternalFrameDetalleFormTipoSeguro.jMenuItemActualizarTipoSeguro.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoSeguro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSeguro.jButtonEliminarTipoSeguro.addActionListener (new ButtonActionListener(this,"EliminarTipoSeguro"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSeguro.jButtonEliminarToolBarTipoSeguro.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoSeguro"));
						
			this.jInternalFrameDetalleFormTipoSeguro.jMenuItemEliminarTipoSeguro.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoSeguro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSeguro.jButtonCancelarTipoSeguro.addActionListener (new ButtonActionListener(this,"CancelarTipoSeguro"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSeguro.jButtonCancelarToolBarTipoSeguro.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoSeguro"));
			
			this.jInternalFrameDetalleFormTipoSeguro.jMenuItemCancelarTipoSeguro.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoSeguro"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoSeguro.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoSeguro"));		
		
		
		this.jButtonCerrarTipoSeguro.addActionListener (new ButtonActionListener(this,"CerrarTipoSeguro"));
		
		
		this.jButtonCerrarToolBarTipoSeguro.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoSeguro"));
			
		this.jMenuItemCerrarTipoSeguro.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoSeguro"));
			
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSeguro.jMenuItemDetalleCerrarTipoSeguro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoSeguro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSeguro.jButtonGuardarCambiosTipoSeguro.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoSeguro"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSeguro.jButtonGuardarCambiosToolBarTipoSeguro.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoSeguro"));
		}
		
		this.jButtonCopiarToolBarTipoSeguro.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoSeguro"));
			
		this.jButtonVerFormToolBarTipoSeguro.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoSeguro"));
		
		this.jMenuItemGuardarCambiosTipoSeguro.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoSeguro"));
			
		this.jMenuItemCopiarTipoSeguro.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoSeguro"));		
		
		this.jMenuItemVerFormTipoSeguro.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoSeguro"));		
		
		
		this.jButtonGuardarCambiosTablaTipoSeguro.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoSeguro"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoSeguro.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoSeguro"));
			
		this.jMenuItemGuardarCambiosTablaTipoSeguro.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoSeguro"));		
		
		
		
		this.jButtonRecargarInformacionTipoSeguro.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoSeguro"));
					
		this.jButtonRecargarInformacionToolBarTipoSeguro.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoSeguro"));
		
		this.jMenuItemRecargarInformacionTipoSeguro.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoSeguro"));		
		
		
		
		this.jButtonAnterioresTipoSeguro.addActionListener (new ButtonActionListener(this,"AnterioresTipoSeguro"));
		
		
		this.jButtonAnterioresToolBarTipoSeguro.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoSeguro"));
		
		this.jMenuItemAnterioresTipoSeguro.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoSeguro"));		
		
		
		this.jButtonSiguientesTipoSeguro.addActionListener (new ButtonActionListener(this,"SiguientesTipoSeguro"));
		
		
		this.jButtonSiguientesToolBarTipoSeguro.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoSeguro"));
			
		this.jMenuItemSiguientesTipoSeguro.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoSeguro"));
			
		this.jMenuItemAbrirOrderByTipoSeguro.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoSeguro"));
			
		this.jMenuItemMostrarOcultarTipoSeguro.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoSeguro"));
			
		this.jMenuItemDetalleAbrirOrderByTipoSeguro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoSeguro"));
			
		this.jMenuItemDetalleMostarOcultarTipoSeguro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoSeguro"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoSeguro.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoSeguro"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoSeguro.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoSeguro"));
			
		this.jMenuItemNuevoGuardarCambiosTipoSeguro.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoSeguro"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoSeguro.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoSeguro"));

		this.jCheckBoxSeleccionadosTipoSeguro.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoSeguro"));
		
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSeguro.jComboBoxTiposAccionesFormularioTipoSeguro.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoSeguro"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoSeguro.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoSeguro"));
			
		this.jComboBoxTiposAccionesTipoSeguro.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoSeguro"));
					
		this.jComboBoxTiposSeleccionarTipoSeguro.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoSeguro"));
			
		this.jTextFieldValorCampoGeneralTipoSeguro.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoSeguro"));		
		
		
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSeguro.jButtonidTipoSeguroBusqueda.addActionListener(new ButtonActionListener(this,"idTipoSeguroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoSeguro.jButtonid_empresaTipoSeguroUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoSeguroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSeguro.jButtonid_empresaTipoSeguroBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoSeguroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSeguro.jButtoncodigoTipoSeguroBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoSeguroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSeguro.jButtonnombreTipoSeguroBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoSeguroBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoSeguro!=null) {
				this.jInternalFrameReporteDinamicoTipoSeguro.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoSeguro"));
				this.jInternalFrameReporteDinamicoTipoSeguro.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoSeguro"));
				this.jInternalFrameReporteDinamicoTipoSeguro.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoSeguro"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoSeguro.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoSeguro"));				
			//this.jButtonGenerarReporteDinamicoTipoSeguro.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoSeguro"));
			//this.jButtonGenerarExcelReporteDinamicoTipoSeguro.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoSeguro"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoSeguro!=null) {
				this.jInternalFrameImportacionTipoSeguro.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoSeguro"));
				this.jInternalFrameImportacionTipoSeguro.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoSeguro"));
				this.jInternalFrameImportacionTipoSeguro.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoSeguro"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoSeguro.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoSeguro"));
			
			this.jButtonAbrirOrderByToolBarTipoSeguro.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoSeguro"));			
			
			if(this.jInternalFrameOrderByTipoSeguro!=null) {
				this.jInternalFrameOrderByTipoSeguro.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoSeguro"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoSeguro!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSeguro.jTabbedPaneRelacionesTipoSeguro.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoSeguro"));
		
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
            		closingInternalFrameTipoSeguro();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoSeguro.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoSeguro = (JInternalFrameBase)event.getSource();
	            	
	            TipoSeguroBeanSwingJInternalFrame jInternalFrameParent=(TipoSeguroBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoSeguro.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoSeguroActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoSeguro.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoSeguroListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoSeguro.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoSeguro.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSeguroActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSeguroActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSeguroActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoSeguro";
		inputMap = this.jButtonNuevoTipoSeguro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoSeguro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoSeguroActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSeguroActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSeguroActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSeguroActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoSeguro";
		inputMap = this.jButtonNuevoRelacionesTipoSeguro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoSeguro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoSeguroActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoSeguro";
		inputMap = this.jButtonModificarTipoSeguro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoSeguro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoSeguroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoSeguro";
		inputMap = this.jButtonActualizarTipoSeguro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoSeguro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoSeguroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoSeguro";
		inputMap = this.jButtonEliminarTipoSeguro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoSeguro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoSeguroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoSeguro";
		inputMap = this.jButtonCancelarTipoSeguro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoSeguro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoSeguroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoSeguro";
		inputMap = this.jButtonCerrarTipoSeguro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoSeguro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoSeguroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoSeguro.jButtonGuardarCambiosTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoSeguro";
		inputMap = this.jInternalFrameDetalleFormTipoSeguro.jButtonGuardarCambiosTipoSeguro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoSeguro.jButtonGuardarCambiosTipoSeguro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoSeguroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoSeguro.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoSeguroItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoSeguro.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoSeguroActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoSeguro.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoSeguroActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoSeguro.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoSeguroActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSeguro.jButtonidTipoSeguroBusqueda.addActionListener(new ButtonActionListener(this,"idTipoSeguroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoSeguro.jButtonid_empresaTipoSeguroUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoSeguroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSeguro.jButtonid_empresaTipoSeguroBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoSeguroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSeguro.jButtoncodigoTipoSeguroBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoSeguroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSeguro.jButtonnombreTipoSeguroBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoSeguroBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoSeguro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoSeguroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoSeguroActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoSeguro.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoSeguro(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoSeguro tiposeguroAux:this.tiposeguroLogic.getTipoSeguros()) {
					tiposeguroAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoSeguro tiposeguroAux:tiposeguros) {
					tiposeguroAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoSeguroItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoSeguro(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoSeguro tiposeguroAux:this.tiposeguroLogic.getTipoSeguros()) {
						tiposeguroAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoSeguro tiposeguroAux:tiposeguros) {
						tiposeguroAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoSeguro tiposeguroAux:this.tiposeguroLogic.getTipoSeguros()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoSeguro tiposeguroAux:tiposeguros) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoSeguro(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoSeguro.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoSeguro.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoSeguro,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoSeguroItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoSeguro(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoSeguro.getSelectedRows();
			
			TipoSeguro tiposeguroLocal=new TipoSeguro();
			
			//this.seleccionarTodosTipoSeguro(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiposeguroLocal =(TipoSeguro) this.tiposeguroLogic.getTipoSeguros().toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tiposeguroLocal =(TipoSeguro) this.tiposeguros.toArray()[this.jTableDatosTipoSeguro.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tiposeguroLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoSeguro tiposeguroAux:this.tiposeguroLogic.getTipoSeguros()) {
						tiposeguroAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoSeguro tiposeguroAux:tiposeguros) {
						tiposeguroAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoSeguro(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoSeguro.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoSeguro.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoSeguro,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoSeguroItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoSeguroParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoSeguroActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoSeguro(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoSeguro.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoSeguro tiposeguroAux:this.tiposeguroLogic.getTipoSeguros()) {
				
						if(sTipoSeleccionar.equals(TipoSeguroConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiposeguroAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoSeguroConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiposeguroAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoSeguro tiposeguroAux:tiposeguros) {
					
						if(sTipoSeleccionar.equals(TipoSeguroConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiposeguroAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoSeguroConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiposeguroAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoSeguro(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoSeguroActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoSeguro(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoSeguro=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoSeguro.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoSeguro.jComboBoxTiposAccionesFormularioTipoSeguro.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoSeguro) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoSeguro(conSplash);
				
					this.generarReporteTipoSegurosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoSeguro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoSeguro.jComboBoxTiposAccionesFormularioTipoSeguro.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoSegurosSeleccionados();
				//this.jComboBoxTiposAccionesTipoSeguro.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoSegurosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoSeguro.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoSegurosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoSeguro.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoSeguro();
				
				this.exportarTipoSegurosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoSeguro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoSeguro.jComboBoxTiposAccionesFormularioTipoSeguro.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoSeguros();
				//this.importarTipoSeguros();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoSeguro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoSeguro.jComboBoxTiposAccionesFormularioTipoSeguro.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoSeguro();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoSegurosSeleccionados();
				//this.jComboBoxTiposAccionesTipoSeguro.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Seguro", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoSeguro();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoSeguro)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoSeguro(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Seguro",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoSeguro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoSeguro.jComboBoxTiposAccionesFormularioTipoSeguro.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoSeguroBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoSeguro) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoSeguro(conSplash);
					
						//this.actualizarParametrosGeneralTipoSeguro();
						
						this.generarReporteProcesoAccionTipoSegurosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoSeguro.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoSeguro.jComboBoxTiposAccionesFormularioTipoSeguro.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoSeguroBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo SeguroS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Seguro", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoSeguro();
				
						this.actualizarParametrosGeneralTipoSeguro();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tiposeguroReturnGeneral=tiposeguroLogic.procesarAccionTipoSegurosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tiposeguroLogic.getTipoSeguros(),this.tiposeguroParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoSeguroReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoSeguro.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoSeguro.jComboBoxTiposAccionesFormularioTipoSeguro.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoSeguro();
					
					TipoSeguroBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoSeguroReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoSeguro.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoSeguro.jComboBoxTiposAccionesFormularioTipoSeguro.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoSeguro(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoSeguroActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoSeguro();
			
			if(this.jInternalFrameDetalleFormTipoSeguro==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoSeguro> tiposegurosSeleccionados=new ArrayList<TipoSeguro>();		
			TipoSeguro tiposeguro=new TipoSeguro();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoSeguro(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoSeguro.getSelectedItem();
			
			
			
			
			tiposegurosSeleccionados=this.getTipoSegurosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tiposegurosSeleccionados.size()==1) {
				for(TipoSeguro tiposeguroAux:tiposegurosSeleccionados) {
					tiposeguro=tiposeguroAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoSeguro();
			
      		//this.finishProcessTipoSeguro(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoSeguroReturnGeneral() throws Exception {
		if(this.tiposeguroReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tiposeguroReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tiposeguroReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tiposeguroReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tiposeguroReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tiposeguroReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoSeguro(false);
		}
		
		if(this.tiposeguroReturnGeneral.getConRetornoLista() || this.tiposeguroReturnGeneral.getConRetornoObjeto()) {
			if(this.tiposeguroReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiposeguroLogic.setTipoSeguros(this.tiposeguroReturnGeneral.getTipoSeguros());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tiposeguroReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiposeguroLogic.setTipoSeguro(this.tiposeguroReturnGeneral.getTipoSeguro());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoSeguro(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoSeguro() throws Exception {
		
		
	}
	
	public ArrayList<TipoSeguro> getTipoSegurosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoSeguro> tiposegurosSeleccionados=new ArrayList<TipoSeguro>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoSeguro) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoSeguro tiposeguroAux:tiposeguroLogic.getTipoSeguros()) {
					if(tiposeguroAux.getIsSelected()) {
						tiposegurosSeleccionados.add(tiposeguroAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoSeguro tiposeguroAux:this.tiposeguros) {
					if(tiposeguroAux.getIsSelected()) {
						tiposegurosSeleccionados.add(tiposeguroAux);				
					}
				}
			}
			
			if(tiposegurosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tiposegurosSeleccionados.addAll(this.tiposeguroLogic.getTipoSeguros());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tiposegurosSeleccionados.addAll(this.tiposeguros);				
					}
				}
			}
		} else {
			tiposegurosSeleccionados.add(this.tiposeguro);
		}
		
		return tiposegurosSeleccionados;
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
	
	public void generarReporteTipoSegurosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoSegurosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoSegurosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoSegurosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoSegurosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Seguro",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoSegurosSeleccionados() throws Exception {
		ArrayList<TipoSeguro> tiposegurosSeleccionados=new ArrayList<TipoSeguro>();		
		
		tiposegurosSeleccionados=this.getTipoSegurosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoSeguros("Todos",tiposegurosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoSegurosSeleccionados() throws Exception {
		ArrayList<TipoSeguro> tiposegurosSeleccionados=new ArrayList<TipoSeguro>();		
		
		tiposegurosSeleccionados=this.getTipoSegurosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoSeguros("Todos",tiposegurosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoSegurosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoSeguro> tiposegurosSeleccionados=new ArrayList<TipoSeguro>();
		
		tiposegurosSeleccionados=this.getTipoSegurosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoSeguros("Todos",tiposegurosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoSegurosSeleccionados() throws Exception {
		ArrayList<TipoSeguro> tiposegurosSeleccionados=new ArrayList<TipoSeguro>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoSeguro();
		
		
		tiposegurosSeleccionados=this.getTipoSegurosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoSeguro();
		
		
		//this.generarReporteTipoSeguros("Todos",tiposegurosSeleccionados ,tiposeguroImplementable,tiposeguroImplementableHome);
	}
	
	public void mostrarImportacionTipoSeguros() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoSeguro();
		
		this.abrirFrameImportacionTipoSeguro();		
		
			
		//this.generarReporteTipoSeguros("Todos",tiposegurosSeleccionados ,tiposeguroImplementable,tiposeguroImplementableHome);
	}
	
	public void importarTipoSeguros() throws Exception {		
	
	}
	
	public void exportarTipoSegurosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoSegurosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoSegurosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoSegurosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Seguro",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoSegurosSeleccionados() throws Exception {
		ArrayList<TipoSeguro> tiposegurosSeleccionados=new ArrayList<TipoSeguro>();		
		
		tiposegurosSeleccionados=this.getTipoSegurosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposeguro."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoSeguro(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoSeguro tiposeguroAux:tiposegurosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoSeguro(tiposeguroAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tiposeguroAux.setsDetalleGeneralEntityReporte(tiposeguroAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposeguroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Seguro",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoSeguro(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoSeguroConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoSeguroConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoSeguroConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoSeguroConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoSeguroConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoSeguro(TipoSeguro tiposeguro,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tiposeguro.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tiposeguro.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiposeguro.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiposeguro.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiposeguro.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoSegurosSeleccionados() throws Exception {
		ArrayList<TipoSeguro> tiposegurosSeleccionados=new ArrayList<TipoSeguro>();		
		
		tiposegurosSeleccionados=this.getTipoSegurosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposeguro.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoSeguros");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoSeguro(row);				
				iRow++;
			}				
			
			for(TipoSeguro tiposeguroAux:tiposegurosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoSeguro(tiposeguroAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposeguroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Seguro",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoSegurosSeleccionados() throws Exception {
		ArrayList<TipoSeguro> tiposegurosSeleccionados=new ArrayList<TipoSeguro>();		
		
		tiposegurosSeleccionados=this.getTipoSegurosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposeguro.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tiposeguros");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tiposeguro");
			//elementRoot.appendChild(element);
		
			for(TipoSeguro tiposeguroAux:tiposegurosSeleccionados) {
				element = document.createElement("tiposeguro");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoSeguro(tiposeguroAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposeguroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Seguro",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoSeguro(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoSeguroConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoSeguroConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoSeguroConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoSeguroConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoSeguroConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoSeguro(TipoSeguro tiposeguro,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tiposeguro.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tiposeguro.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tiposeguro.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tiposeguro.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoSeguro(TipoSeguro tiposeguro,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoSeguroConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tiposeguro.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoSeguroConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tiposeguro.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoSeguroConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tiposeguro.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoSeguroConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tiposeguro.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoSeguroConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tiposeguro.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoSegurosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoSeguro> tiposegurosSeleccionados=new ArrayList<TipoSeguro>();
		
		tiposegurosSeleccionados=this.getTipoSegurosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoSeguro(tiposegurosSeleccionados);
		
		this.generarReporteTipoSeguros("Todos",tiposegurosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoSeguro(ArrayList<TipoSeguro> tiposegurosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoSeguro tiposeguroAux:tiposegurosSeleccionados) {
				tiposeguroAux.setsDetalleGeneralEntityReporte(tiposeguroAux.toString());
			
				if(sTipoSeleccionar.equals(TipoSeguroConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tiposeguroAux.setsDescripcionGeneralEntityReporte1(tiposeguroAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoSeguroConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tiposeguroAux.setsDescripcionGeneralEntityReporte1(tiposeguroAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoSeguroConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tiposeguroAux.setsDescripcionGeneralEntityReporte1(tiposeguroAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSeguroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoSeguro(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoSeguro=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoSeguro=true;
				this.isVisibilidadCeldaGuardarCambiosTipoSeguro=true;
			}
			
			this.isVisibilidadCeldaModificarTipoSeguro=false;
			this.isVisibilidadCeldaActualizarTipoSeguro=false;
			this.isVisibilidadCeldaEliminarTipoSeguro=false;
			this.isVisibilidadCeldaCancelarTipoSeguro=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSeguro=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoSeguro=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoSeguro=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSeguro=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSeguro=false;
			this.isVisibilidadCeldaModificarTipoSeguro=false;
			this.isVisibilidadCeldaActualizarTipoSeguro=true;
			this.isVisibilidadCeldaEliminarTipoSeguro=false;
			this.isVisibilidadCeldaCancelarTipoSeguro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSeguro=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoSeguro=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoSeguro=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSeguro=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSeguro=false;
			this.isVisibilidadCeldaModificarTipoSeguro=false;
			this.isVisibilidadCeldaActualizarTipoSeguro=true;
			this.isVisibilidadCeldaEliminarTipoSeguro=true;
			this.isVisibilidadCeldaCancelarTipoSeguro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSeguro=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoSeguro=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoSeguro=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSeguro=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSeguro=false;
			this.isVisibilidadCeldaModificarTipoSeguro=false;
			this.isVisibilidadCeldaActualizarTipoSeguro=true;
			this.isVisibilidadCeldaEliminarTipoSeguro=false;
			this.isVisibilidadCeldaCancelarTipoSeguro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSeguro=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoSeguro=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoSeguro=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoSeguro=true;
			this.isVisibilidadCeldaGuardarCambiosTipoSeguro=true;
			this.isVisibilidadCeldaModificarTipoSeguro=false;
			this.isVisibilidadCeldaActualizarTipoSeguro=false;
			this.isVisibilidadCeldaEliminarTipoSeguro=false;
			this.isVisibilidadCeldaCancelarTipoSeguro=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSeguro=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoSeguro=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoSeguro=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSeguro=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSeguro=false;
			this.isVisibilidadCeldaActualizarTipoSeguro=false;
			this.isVisibilidadCeldaEliminarTipoSeguro=false;
			this.isVisibilidadCeldaCancelarTipoSeguro=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSeguro=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoSeguro=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoSeguro=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSeguro=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSeguro=false;
			this.isVisibilidadCeldaModificarTipoSeguro=true;
			this.isVisibilidadCeldaActualizarTipoSeguro=false;
			this.isVisibilidadCeldaEliminarTipoSeguro=false;
			this.isVisibilidadCeldaCancelarTipoSeguro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSeguro=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoSeguro=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoSeguroJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoSeguro=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoSeguro=true;
			this.isVisibilidadCeldaGuardarCambiosTipoSeguro=true;
		} else {
			this.actualizarEstadoPanelsTipoSeguro(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoSeguro=false;
			//this.isVisibilidadCeldaVerFormTipoSeguro=false;
			this.isVisibilidadCeldaDuplicarTipoSeguro=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tiposeguroSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoSeguro=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoSeguro=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSeguro=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tiposeguroSessionBean.getEsGuardarRelacionado()) {
			if(!tiposeguroSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoSeguro=false;												
			}
			
			this.jButtonCerrarTipoSeguro.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoSeguro=false;
		}
		
		if(!this.permiteMantenimiento(this.tiposeguro)) {
			this.isVisibilidadCeldaActualizarTipoSeguro=false;
			this.isVisibilidadCeldaEliminarTipoSeguro=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoSeguro() {
	}
	
	public void actualizarEstadoPanelsTipoSeguro(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoSeguro!=null) {
				this.jScrollPanelDatosEdicionTipoSeguro.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSeguro!=null) {
				this.jTabbedPaneBusquedasTipoSeguro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoSeguro!=null) {
				this.jScrollPanelDatosTipoSeguro.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoSeguro!=null) {
				this.jPanelPaginacionTipoSeguro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoSeguro!=null) {
				this.jPanelParametrosReportesTipoSeguro.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoSeguro!=null) {
				this.jScrollPanelDatosEdicionTipoSeguro.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSeguro!=null) {
				this.jTabbedPaneBusquedasTipoSeguro.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoSeguro!=null) {
				this.jScrollPanelDatosTipoSeguro.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoSeguro!=null) {
				this.jPanelPaginacionTipoSeguro.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoSeguro!=null) {
				this.jPanelParametrosReportesTipoSeguro.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoSeguro!=null) {
				this.jScrollPanelDatosEdicionTipoSeguro.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSeguro!=null) {
				this.jTabbedPaneBusquedasTipoSeguro.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoSeguro!=null) {
				this.jScrollPanelDatosTipoSeguro.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoSeguro!=null) {
				this.jPanelPaginacionTipoSeguro.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoSeguro!=null) {
				this.jPanelParametrosReportesTipoSeguro.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoSeguro!=null) {
				this.jScrollPanelDatosEdicionTipoSeguro.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSeguro!=null) {
				this.jTabbedPaneBusquedasTipoSeguro.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoSeguro!=null) {
				this.jScrollPanelDatosTipoSeguro.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoSeguro!=null) {
				this.jPanelPaginacionTipoSeguro.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoSeguro!=null) {
				this.jPanelParametrosReportesTipoSeguro.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoSeguro!=null) {
				this.jScrollPanelDatosEdicionTipoSeguro.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSeguro!=null) {
				this.jTabbedPaneBusquedasTipoSeguro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoSeguro!=null) {
				this.jScrollPanelDatosTipoSeguro.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoSeguro!=null) {
				this.jPanelPaginacionTipoSeguro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoSeguro!=null) {
				this.jPanelParametrosReportesTipoSeguro.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoSeguro!=null) {
				this.jScrollPanelDatosEdicionTipoSeguro.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSeguro!=null) {
				this.jTabbedPaneBusquedasTipoSeguro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoSeguro!=null) {
				this.jScrollPanelDatosTipoSeguro.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoSeguro!=null) {
				this.jPanelPaginacionTipoSeguro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoSeguro!=null) {
				this.jPanelParametrosReportesTipoSeguro.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoSeguro!=null) {
				this.jScrollPanelDatosEdicionTipoSeguro.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSeguro!=null) {
				this.jTabbedPaneBusquedasTipoSeguro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoSeguro!=null) {
				this.jScrollPanelDatosTipoSeguro.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoSeguro!=null) {
				this.jPanelPaginacionTipoSeguro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoSeguro!=null) {
				this.jPanelParametrosReportesTipoSeguro.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoSeguro!=null) {
					this.jTabbedPaneBusquedasTipoSeguro.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoSeguro!=null) {
				this.jPanelParametrosReportesTipoSeguro.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tiposeguroSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSeguro!=null) {
				this.jTabbedPaneBusquedasTipoSeguro.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoSeguro!=null) {
				this.jPanelParametrosReportesTipoSeguro.setVisible(true);
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
		
		//TipoSeguroSessionBean tiposeguroSessionBean=new TipoSeguroSessionBean();
		
		if(this.tiposeguroSessionBean==null) {
			this.tiposeguroSessionBean=new TipoSeguroSessionBean();
		}
		
		this.tiposeguroSessionBean.setsUltimaBusquedaTipoSeguro(this.getsAccionBusqueda());
		this.tiposeguroSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tiposeguroSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tiposeguroSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoSeguroSessionBean tiposeguroSessionBean=new TipoSeguroSessionBean();
		
		if(this.tiposeguroSessionBean==null) {
			this.tiposeguroSessionBean=new TipoSeguroSessionBean();
		}
		
		if(this.tiposeguroSessionBean.getsUltimaBusquedaTipoSeguro()!=null&&!this.tiposeguroSessionBean.getsUltimaBusquedaTipoSeguro().equals("")) {
			this.setsAccionBusqueda(tiposeguroSessionBean.getsUltimaBusquedaTipoSeguro());
			this.setiNumeroPaginacion(tiposeguroSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tiposeguroSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tiposeguroSessionBean.getid_empresa());
				tiposeguroSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tiposeguroSessionBean.setsUltimaBusquedaTipoSeguro("");
		this.tiposeguroSessionBean.setiNumeroPaginacion(TipoSeguroConstantesFunciones.INUMEROPAGINACION);
		this.tiposeguroSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoSeguro(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoSeguro() {
		this.updateBorderResaltarBusquedasFormularioTipoSeguro();
		this.updateVisibilidadBusquedasFormularioTipoSeguro();
		this.updateHabilitarBusquedasFormularioTipoSeguro();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoSeguro() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoSeguro.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoSeguro() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoSeguro.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoSeguro() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoSeguro.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoSeguro(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoSeguro.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoSeguro() throws Exception {

		if(this.jInternalFrameDetalleFormTipoSeguro==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoSeguro();
		this.updateVisibilidadResaltarControlesFormularioTipoSeguro();
		this.updateHabilitarResaltarControlesFormularioTipoSeguro();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoSeguro() throws Exception {
		if(this.jInternalFrameDetalleFormTipoSeguro==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tiposeguroConstantesFunciones.resaltaridTipoSeguro!=null && this.jInternalFrameDetalleFormTipoSeguro!=null) {this.jInternalFrameDetalleFormTipoSeguro.jLabelidTipoSeguro.setBorder(this.tiposeguroConstantesFunciones.resaltaridTipoSeguro);}
		if(this.tiposeguroConstantesFunciones.resaltarid_empresaTipoSeguro!=null && this.jInternalFrameDetalleFormTipoSeguro!=null) {this.jInternalFrameDetalleFormTipoSeguro.jComboBoxid_empresaTipoSeguro.setBorder(this.tiposeguroConstantesFunciones.resaltarid_empresaTipoSeguro);}
		if(this.tiposeguroConstantesFunciones.resaltarcodigoTipoSeguro!=null && this.jInternalFrameDetalleFormTipoSeguro!=null) {this.jInternalFrameDetalleFormTipoSeguro.jTextFieldcodigoTipoSeguro.setBorder(this.tiposeguroConstantesFunciones.resaltarcodigoTipoSeguro);}
		if(this.tiposeguroConstantesFunciones.resaltarnombreTipoSeguro!=null && this.jInternalFrameDetalleFormTipoSeguro!=null) {this.jInternalFrameDetalleFormTipoSeguro.jTextAreanombreTipoSeguro.setBorder(this.tiposeguroConstantesFunciones.resaltarnombreTipoSeguro);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoSeguro() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoSeguro==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) {
	
		//this.jInternalFrameDetalleFormTipoSeguro.jLabelidTipoSeguro.setVisible(this.tiposeguroConstantesFunciones.mostraridTipoSeguro);
		this.jInternalFrameDetalleFormTipoSeguro.jPanelidTipoSeguro.setVisible(this.tiposeguroConstantesFunciones.mostraridTipoSeguro);
		//this.jInternalFrameDetalleFormTipoSeguro.jComboBoxid_empresaTipoSeguro.setVisible(this.tiposeguroConstantesFunciones.mostrarid_empresaTipoSeguro);
		this.jInternalFrameDetalleFormTipoSeguro.jPanelid_empresaTipoSeguro.setVisible(this.tiposeguroConstantesFunciones.mostrarid_empresaTipoSeguro);
		//this.jInternalFrameDetalleFormTipoSeguro.jTextFieldcodigoTipoSeguro.setVisible(this.tiposeguroConstantesFunciones.mostrarcodigoTipoSeguro);
		this.jInternalFrameDetalleFormTipoSeguro.jPanelcodigoTipoSeguro.setVisible(this.tiposeguroConstantesFunciones.mostrarcodigoTipoSeguro);
		//this.jInternalFrameDetalleFormTipoSeguro.jTextAreanombreTipoSeguro.setVisible(this.tiposeguroConstantesFunciones.mostrarnombreTipoSeguro);
		this.jInternalFrameDetalleFormTipoSeguro.jPanelnombreTipoSeguro.setVisible(this.tiposeguroConstantesFunciones.mostrarnombreTipoSeguro);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoSeguro() throws Exception {
		if(this.jInternalFrameDetalleFormTipoSeguro==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoSeguro!=null) {
	
		this.jInternalFrameDetalleFormTipoSeguro.jLabelidTipoSeguro.setEnabled(this.tiposeguroConstantesFunciones.activaridTipoSeguro);
		this.jInternalFrameDetalleFormTipoSeguro.jComboBoxid_empresaTipoSeguro.setEnabled(this.tiposeguroConstantesFunciones.activarid_empresaTipoSeguro);
		this.jInternalFrameDetalleFormTipoSeguro.jTextFieldcodigoTipoSeguro.setEnabled(this.tiposeguroConstantesFunciones.activarcodigoTipoSeguro);
		this.jInternalFrameDetalleFormTipoSeguro.jTextAreanombreTipoSeguro.setEnabled(this.tiposeguroConstantesFunciones.activarnombreTipoSeguro);
		}
	}
	
		
}