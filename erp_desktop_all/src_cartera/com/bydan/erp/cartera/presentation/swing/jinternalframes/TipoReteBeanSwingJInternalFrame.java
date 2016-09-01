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

import com.bydan.erp.cartera.util.TipoReteConstantesFunciones;
import com.bydan.erp.cartera.util.TipoReteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoReteParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoReteBean;
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
public class TipoReteBeanSwingJInternalFrame extends TipoReteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoReteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoRete> tiporeteValidator = new ClassValidator<TipoRete>(TipoRete.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoRete tiporete;	
	public TipoRete tiporeteAux;
	public TipoRete tiporeteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoRete tiporeteTotales;
	public Long idTipoReteActual;
	public Long iIdNuevoTipoRete=0L;
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
	
	public Boolean isPermisoTodoTipoRete;
	public Boolean isPermisoNuevoTipoRete;
	public Boolean isPermisoActualizarTipoRete;
	public Boolean isPermisoActualizarOriginalTipoRete;
	public Boolean isPermisoEliminarTipoRete;
	public Boolean isPermisoGuardarCambiosTipoRete;
	public Boolean isPermisoConsultaTipoRete;
	public Boolean isPermisoBusquedaTipoRete;
	public Boolean isPermisoReporteTipoRete;
	public Boolean isPermisoPaginacionMedioTipoRete;
	public Boolean isPermisoPaginacionAltoTipoRete;
	public Boolean isPermisoPaginacionTodoTipoRete;
	public Boolean isPermisoCopiarTipoRete;
	public Boolean isPermisoVerFormTipoRete;
	public Boolean isPermisoDuplicarTipoRete;
	public Boolean isPermisoOrdenTipoRete;
	
	
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
	
	public TipoReteParameterReturnGeneral tiporeteReturnGeneral;
	public TipoReteParameterReturnGeneral tiporeteParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoRete=false;
	public Boolean esParaAccionDesdeFormularioTipoRete=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoReteSessionBeanAdditional tiporeteSessionBeanAdditional=null;
	
	public TipoReteSessionBeanAdditional getTipoReteSessionBeanAdditional() {
		return this.tiporeteSessionBeanAdditional;
	}
	
	public void setTipoReteSessionBeanAdditional(TipoReteSessionBeanAdditional tiporeteSessionBeanAdditional) {
		try {
			this.tiporeteSessionBeanAdditional=tiporeteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoReteBeanSwingJInternalFrameAdditional tiporeteBeanSwingJInternalFrameAdditional=null;
	//public class TipoReteBeanSwingJInternalFrame
	
	public TipoReteBeanSwingJInternalFrameAdditional getTipoReteBeanSwingJInternalFrameAdditional() {
		return this.tiporeteBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoReteBeanSwingJInternalFrameAdditional(TipoReteBeanSwingJInternalFrameAdditional tiporeteBeanSwingJInternalFrameAdditional) {
		try {
			this.tiporeteBeanSwingJInternalFrameAdditional=tiporeteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoReteLogic tiporeteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoRete tiporeteBean;
	public TipoReteConstantesFunciones tiporeteConstantesFunciones;
	//public TipoReteParameterReturnGeneral tiporeteReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoRete> tiporetes;	
	//public List<TipoRete> tiporetesEliminados;
	//public List<TipoRete> tiporetesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoRete=false;
	public Boolean isVisibilidadCeldaDuplicarTipoRete=true;
	public Boolean isVisibilidadCeldaCopiarTipoRete=true;
	public Boolean isVisibilidadCeldaVerFormTipoRete=true;
	public Boolean isVisibilidadCeldaOrdenTipoRete=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoRete=false;
	public Boolean isVisibilidadCeldaModificarTipoRete=false;
	public Boolean isVisibilidadCeldaActualizarTipoRete=false;
	public Boolean isVisibilidadCeldaEliminarTipoRete=false;
	public Boolean isVisibilidadCeldaCancelarTipoRete=false;
	public Boolean isVisibilidadCeldaGuardarTipoRete=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoRete=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoRete() {
		return this.iIdNuevoTipoRete;
	}

	public void setiIdNuevoTipoRete(Long iIdNuevoTipoRete) {
		this.iIdNuevoTipoRete = iIdNuevoTipoRete;
	}
	
	public Long getidTipoReteActual() {
		return this.idTipoReteActual;
	}

	public void setidTipoReteActual(Long idTipoReteActual) {
		this.idTipoReteActual = idTipoReteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoRete gettiporete() {
		return this.tiporete;
	}

	public void settiporete(TipoRete tiporete) {
		this.tiporete = tiporete;
	}
	
	public TipoRete gettiporeteAux() {
		return this.tiporeteAux;
	}

	public void settiporeteAux(TipoRete tiporeteAux) {
		this.tiporeteAux = tiporeteAux;
	}				
	
	public TipoRete gettiporeteAnterior() {
		return this.tiporeteAnterior;
	}

	public void settiporeteAnterior(TipoRete tiporeteAnterior) {
		this.tiporeteAnterior = tiporeteAnterior;
	}	
	
	public TipoRete gettiporeteTotales() {
		return this.tiporeteTotales;
	}

	public void settiporeteTotales(TipoRete tiporeteTotales) {
		this.tiporeteTotales = tiporeteTotales;
	}	
	
	public TipoRete gettiporeteBean() {
		return this.tiporeteBean;
	}

	public void settiporeteBean(TipoRete tiporeteBean) {
		this.tiporeteBean = tiporeteBean;
	}	
	
	public TipoReteParameterReturnGeneral gettiporeteReturnGeneral() {
		return this.tiporeteReturnGeneral;
	}

	public void settiporeteReturnGeneral(TipoReteParameterReturnGeneral tiporeteReturnGeneral) {
		this.tiporeteReturnGeneral = tiporeteReturnGeneral;
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

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoReteLogic getTipoReteLogic()	{		
		return tiporeteLogic;
	}

	public void setTipoReteLogic(TipoReteLogic tiporeteLogic) {
		this.tiporeteLogic = tiporeteLogic;
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
	
	public Boolean getIsEsNuevoTipoRete() {
		return isEsNuevoTipoRete;
	}

	public void setIsEsNuevoTipoRete(Boolean isEsNuevoTipoRete) {
		this.isEsNuevoTipoRete = isEsNuevoTipoRete;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoRete() {
		return esParaAccionDesdeFormularioTipoRete;
	}
	
	public void setEsParaAccionDesdeFormularioTipoRete(Boolean esParaAccionDesdeFormularioTipoRete) {
		this.esParaAccionDesdeFormularioTipoRete = esParaAccionDesdeFormularioTipoRete;
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

			if(this.tiporeteSessionBean==null) {
				this.tiporeteSessionBean=new TipoReteSessionBean();
			}

			if(!this.tiporeteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tiporeteSessionBean.getlidEmpresaActual());
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

					if(this.tiporete!=null) {
						this.tiporete.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoRete!=null) {
						this.jInternalFrameDetalleFormTipoRete.jComboBoxid_empresaTipoRete.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoRete.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoRete!=null) {
						if(this.jInternalFrameDetalleFormTipoRete.jComboBoxid_empresaTipoRete.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoRete.jComboBoxid_empresaTipoRete.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoReteGenerico)throws Exception
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
				jComboBoxid_empresaTipoReteGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoReteGenerico!=null && jComboBoxid_empresaTipoReteGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoReteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoRete tiporete,JComboBox jComboBoxid_empresaTipoReteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoReteGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoRete.jComboBoxid_empresaTipoRete.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoReteGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tiporete.setid_empresa(empresaAux.getId());
				tiporete.setempresa_descripcion(TipoReteConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tiporete.setEmpresa(empresaAux);			}
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

					if(!TipoReteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoRete!=null) { 
							this.jInternalFrameDetalleFormTipoRete.jComboBoxid_empresaTipoRete.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoRete.jComboBoxid_empresaTipoRete.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoRete!=null) { 
					}

					if(!TipoReteJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoRete!=null) {
							this.jInternalFrameDetalleFormTipoRete.jComboBoxid_empresaTipoRete.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoRete!=null) {
							this.jInternalFrameDetalleFormTipoRete.jComboBoxid_empresaTipoRete.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoRete() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoReteConstantesFunciones.refrescarForeignKeysDescripcionesTipoRete(this.tiporeteLogic.getTipoRetes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoReteConstantesFunciones.refrescarForeignKeysDescripcionesTipoRete(this.tiporetes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tiporeteLogic.setTipoRetes(this.tiporetes);
			tiporeteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoReteParameterReturnGeneral getTipoReteParameterGeneral() {
		return this.tiporeteParameterGeneral;
	}
	
	public void setTipoReteParameterGeneral(TipoReteParameterReturnGeneral tiporeteParameterGeneral) {
		this.tiporeteParameterGeneral = tiporeteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoRete() {
		return isPermisoTodoTipoRete;
	}

	public void setIsPermisoTodoTipoRete(Boolean isPermisoTodoTipoRete) {
		this.isPermisoTodoTipoRete = isPermisoTodoTipoRete;
	}

	public Boolean getIsPermisoNuevoTipoRete() {
		return isPermisoNuevoTipoRete;
	}

	public void setIsPermisoNuevoTipoRete(Boolean isPermisoNuevoTipoRete) {
		this.isPermisoNuevoTipoRete = isPermisoNuevoTipoRete;
	}

	public Boolean getIsPermisoActualizarTipoRete() {
		return isPermisoActualizarTipoRete;
	}

	public void setIsPermisoActualizarTipoRete(Boolean isPermisoActualizarTipoRete) {
		this.isPermisoActualizarTipoRete = isPermisoActualizarTipoRete;
	}

	public Boolean getIsPermisoEliminarTipoRete() {
		return isPermisoEliminarTipoRete;
	}

	public void setIsPermisoEliminarTipoRete(Boolean isPermisoEliminarTipoRete) {
		this.isPermisoEliminarTipoRete = isPermisoEliminarTipoRete;
	}

	public Boolean getIsPermisoGuardarCambiosTipoRete() {
		return isPermisoGuardarCambiosTipoRete;
	}

	public void setIsPermisoGuardarCambiosTipoRete(Boolean isPermisoGuardarCambiosTipoRete) {
		this.isPermisoGuardarCambiosTipoRete = isPermisoGuardarCambiosTipoRete;
	}
	
	public Boolean getIsPermisoConsultaTipoRete() {
		return isPermisoConsultaTipoRete;
	}

	public void setIsPermisoConsultaTipoRete(Boolean isPermisoConsultaTipoRete) {
		this.isPermisoConsultaTipoRete = isPermisoConsultaTipoRete;
	}

	public Boolean getIsPermisoBusquedaTipoRete() {
		return isPermisoBusquedaTipoRete;
	}

	public void setIsPermisoBusquedaTipoRete(Boolean isPermisoBusquedaTipoRete) {
		this.isPermisoBusquedaTipoRete = isPermisoBusquedaTipoRete;
	}

	public Boolean getIsPermisoReporteTipoRete() {
		return isPermisoReporteTipoRete;
	}

	public void setIsPermisoReporteTipoRete(Boolean isPermisoReporteTipoRete) {
		this.isPermisoReporteTipoRete = isPermisoReporteTipoRete;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoRete() {
		return isPermisoPaginacionMedioTipoRete;
	}

	public void setIsPermisoPaginacionMedioTipoRete(Boolean isPermisoPaginacionMedioTipoRete) {
		this.isPermisoPaginacionMedioTipoRete = isPermisoPaginacionMedioTipoRete;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoRete() {
		return isPermisoPaginacionTodoTipoRete;
	}

	public void setIsPermisoPaginacionTodoTipoRete(Boolean isPermisoPaginacionTodoTipoRete) {
		this.isPermisoPaginacionTodoTipoRete = isPermisoPaginacionTodoTipoRete;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoRete() {
		return isPermisoPaginacionAltoTipoRete;
	}

	public void setIsPermisoPaginacionAltoTipoRete(Boolean isPermisoPaginacionAltoTipoRete) {
		this.isPermisoPaginacionAltoTipoRete = isPermisoPaginacionAltoTipoRete;
	}
	
	public Boolean getIsPermisoCopiarTipoRete() {
		return isPermisoCopiarTipoRete;
	}

	public void setIsPermisoCopiarTipoRete(Boolean isPermisoCopiarTipoRete) {
		this.isPermisoCopiarTipoRete = isPermisoCopiarTipoRete;
	}
	
	public Boolean getIsPermisoVerFormTipoRete() {
		return isPermisoVerFormTipoRete;
	}

	public void setIsPermisoVerFormTipoRete(Boolean isPermisoVerFormTipoRete) {
		this.isPermisoVerFormTipoRete = isPermisoVerFormTipoRete;
	}
	
	public Boolean getIsPermisoDuplicarTipoRete() {
		return isPermisoDuplicarTipoRete;
	}

	public void setIsPermisoDuplicarTipoRete(Boolean isPermisoDuplicarTipoRete) {
		this.isPermisoDuplicarTipoRete = isPermisoDuplicarTipoRete;
	}
	
	public Boolean getIsPermisoOrdenTipoRete() {
		return isPermisoOrdenTipoRete;
	}

	public void setIsPermisoOrdenTipoRete(Boolean isPermisoOrdenTipoRete) {
		this.isPermisoOrdenTipoRete = isPermisoOrdenTipoRete;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoRete() {
		return isVisibilidadCeldaNuevoTipoRete;
	}

	public void setIsVisibilidadCeldaNuevoTipoRete(Boolean isVisibilidadCeldaNuevoTipoRete) {
		this.isVisibilidadCeldaNuevoTipoRete = isVisibilidadCeldaNuevoTipoRete;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoRete() {
		return isVisibilidadCeldaDuplicarTipoRete;
	}

	public void setIsVisibilidadCeldaDuplicarTipoRete(Boolean isVisibilidadCeldaDuplicarTipoRete) {
		this.isVisibilidadCeldaDuplicarTipoRete = isVisibilidadCeldaDuplicarTipoRete;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoRete() {
		return isVisibilidadCeldaCopiarTipoRete;
	}

	public void setIsVisibilidadCeldaCopiarTipoRete(Boolean isVisibilidadCeldaCopiarTipoRete) {
		this.isVisibilidadCeldaCopiarTipoRete = isVisibilidadCeldaCopiarTipoRete;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoRete() {
		return isVisibilidadCeldaVerFormTipoRete;
	}

	public void setIsVisibilidadCeldaVerFormTipoRete(Boolean isVisibilidadCeldaVerFormTipoRete) {
		this.isVisibilidadCeldaVerFormTipoRete = isVisibilidadCeldaVerFormTipoRete;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoRete() {
		return isVisibilidadCeldaOrdenTipoRete;
	}

	public void setIsVisibilidadCeldaOrdenTipoRete(Boolean isVisibilidadCeldaOrdenTipoRete) {
		this.isVisibilidadCeldaOrdenTipoRete = isVisibilidadCeldaOrdenTipoRete;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoRete() {
		return isVisibilidadCeldaNuevoRelacionesTipoRete;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoRete(Boolean isVisibilidadCeldaNuevoRelacionesTipoRete) {
		this.isVisibilidadCeldaNuevoRelacionesTipoRete = isVisibilidadCeldaNuevoRelacionesTipoRete;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoRete() {
		return isVisibilidadCeldaModificarTipoRete;
	}

	public void setIsVisibilidadCeldaModificarTipoRete(Boolean isVisibilidadCeldaModificarTipoRete) {
		this.isVisibilidadCeldaModificarTipoRete = isVisibilidadCeldaModificarTipoRete;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoRete() {
		return isVisibilidadCeldaActualizarTipoRete;
	}

	public void setIsVisibilidadCeldaActualizarTipoRete(Boolean isVisibilidadCeldaActualizarTipoRete) {
		this.isVisibilidadCeldaActualizarTipoRete = isVisibilidadCeldaActualizarTipoRete;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoRete() {
		return isVisibilidadCeldaEliminarTipoRete;
	}

	public void setIsVisibilidadCeldaEliminarTipoRete(Boolean isVisibilidadCeldaEliminarTipoRete) {
		this.isVisibilidadCeldaEliminarTipoRete = isVisibilidadCeldaEliminarTipoRete;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoRete() {
		return isVisibilidadCeldaCancelarTipoRete;
	}

	public void setIsVisibilidadCeldaCancelarTipoRete(Boolean isVisibilidadCeldaCancelarTipoRete) {
		this.isVisibilidadCeldaCancelarTipoRete = isVisibilidadCeldaCancelarTipoRete;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoRete() {
		return isVisibilidadCeldaGuardarTipoRete;
	}

	public void setIsVisibilidadCeldaGuardarTipoRete(Boolean isVisibilidadCeldaGuardarTipoRete) {
		this.isVisibilidadCeldaGuardarTipoRete = isVisibilidadCeldaGuardarTipoRete;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoRete() {
		return isVisibilidadCeldaGuardarCambiosTipoRete;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoRete(Boolean isVisibilidadCeldaGuardarCambiosTipoRete) {
		this.isVisibilidadCeldaGuardarCambiosTipoRete = isVisibilidadCeldaGuardarCambiosTipoRete;
	}
		
	public TipoReteSessionBean gettiporeteSessionBean() {
		return this.tiporeteSessionBean;
	}
	
	public void settiporeteSessionBean(TipoReteSessionBean tiporeteSessionBean) {
		this.tiporeteSessionBean=tiporeteSessionBean;
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

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoRete(TipoRete tiporete)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tiporete,null);
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
	
	public void bugActualizarReferenciaActual(TipoRete tiporete,TipoRete tiporeteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoRete(tiporete);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tiporeteAux.setId(tiporete.getId());
		tiporeteAux.setVersionRow(tiporete.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoRete();
		
			int intSelectedRow = this.jTableDatosTipoRete.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporete =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tiporete =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoReteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoRete(this.tiporete,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRete(this.tiporete);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tiporeteValidator.getInvalidValues(this.tiporete);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tiporeteLogic.setDatosCliente(datosCliente);
			tiporeteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tiporeteAux=new  TipoRete();
				
				tiporeteAux.setIsNew(true);
				tiporeteAux.setIsChanged(true);
				
				tiporeteAux.setTipoReteOriginal(this.tiporete);
				
				tiporeteAux.setId(this.tiporete.getId());	
				tiporeteAux.setVersionRow(this.tiporete.getVersionRow());	
				tiporeteAux.setid_empresa(this.tiporete.getid_empresa());	
				tiporeteAux.setcodigo(this.tiporete.getcodigo());	
				tiporeteAux.setnombre(this.tiporete.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporeteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporeteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tiporeteAux,tiporeteLogic.getTipoRetes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporeteAux,tiporetes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tiporeteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporeteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporeteLogic.saveTipoRetes();//WithConnection
						//tiporeteLogic.getSetVersionRowTipoRetes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporete,tiporeteAux);
					
					this.refrescarForeignKeysDescripcionesTipoRete();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporeteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tiporeteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiporeteLogic.saveTipoReteRelaciones(tiporeteAux);//WithConnection
								//tiporeteLogic.getSetVersionRowTipoRetes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiporete,tiporeteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiporeteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiporeteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiporeteAux,tiporeteLogic.getTipoRetes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiporeteAux,tiporetes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiporete,tiporeteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tiporeteAux=new  TipoRete();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tiporeteSessionBean.getEsGuardarRelacionado() 
					|| (this.tiporeteSessionBean.getEsGuardarRelacionado() && this.tiporete.getId()>=0)) {
						
					tiporeteAux.setIsNew(false);
				}
				
				tiporeteAux.setIsDeleted(false);
			
				tiporeteAux.setId(this.tiporete.getId());	
				tiporeteAux.setVersionRow(this.tiporete.getVersionRow());	
				tiporeteAux.setid_empresa(this.tiporete.getid_empresa());	
				tiporeteAux.setcodigo(this.tiporete.getcodigo());	
				tiporeteAux.setnombre(this.tiporete.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporeteAux,tiporeteLogic.getTipoRetes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporeteAux,tiporetes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tiporeteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporeteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporeteLogic.saveTipoRetes();//WithConnection
						//tiporeteLogic.getSetVersionRowTipoRetes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporete,tiporeteAux);
					
					this.refrescarForeignKeysDescripcionesTipoRete();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporeteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tiporeteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiporeteLogic.saveTipoReteRelaciones(tiporeteAux);//WithConnection
								//tiporeteLogic.getSetVersionRowTipoRetes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiporete,tiporeteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiporeteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiporeteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiporeteAux,tiporeteLogic.getTipoRetes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiporeteAux,tiporetes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiporete,tiporeteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tiporeteAux=new  TipoRete();
				
				tiporeteAux.setIsNew(false);
				tiporeteAux.setIsChanged(false);
				
				tiporeteAux.setIsDeleted(true);
				
				tiporeteAux.setId(this.tiporete.getId());	
				tiporeteAux.setVersionRow(this.tiporete.getVersionRow());	
				tiporeteAux.setid_empresa(this.tiporete.getid_empresa());	
				tiporeteAux.setcodigo(this.tiporete.getcodigo());	
				tiporeteAux.setnombre(this.tiporete.getnombre());	
				
				if(this.tiporeteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tiporeteAux.getId()>=0) {	
						this.tiporetesEliminados.add(tiporeteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tiporeteAux,tiporeteLogic.getTipoRetes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporeteAux,tiporetes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tiporeteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporeteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporeteLogic.saveTipoRetes();//WithConnection
						//tiporeteLogic.getSetVersionRowTipoRetes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporeteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tiporeteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiporeteLogic.saveTipoReteRelaciones(tiporeteAux);//WithConnection
								//tiporeteLogic.getSetVersionRowTipoRetes();//WithConnection
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
							if(this.tiporeteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tiporeteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tiporeteAux,tiporeteLogic.getTipoRetes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tiporeteAux,tiporetes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporeteLogic.getTipoRetes().addAll(this.tiporetesEliminados);
					
					tiporeteLogic.saveTipoRetes();//WithConnection
					//tiporeteLogic.getSetVersionRowTipoRetes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoRete();
				
				this.tiporetesEliminados= new ArrayList<TipoRete>();		
			}
			
			if(this.tiporeteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporeteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Rete(temporal) GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Rete(temporal)",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tiporete=tiporeteAux;
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
      		//this.finishProcessTipoRete();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoRete tiporeteLocal) throws Exception {
		
		if(this.tiporeteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoRete tiporeteLocal) throws Exception {	
		if(this.tiporeteSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tiporeteLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoReteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoRete.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporete =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tiporete =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tiporeteValidator.getInvalidValues(this.tiporete);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoRete tiporete,List<TipoRete> tiporetes) throws Exception {
		try	{		
			TipoReteConstantesFunciones.actualizarLista(tiporete,tiporetes,this.tiporeteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoRete tiporete,List<TipoRete> tiporetes) throws Exception {
		try	{			
			TipoReteConstantesFunciones.actualizarSelectedLista(tiporete,tiporetes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoRete> tiporetesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tiporetesLocal=this.tiporeteLogic.getTipoRetes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tiporetesLocal=this.tiporetes;
			}
			//ARCHITECTURE
		
			for(TipoRete tiporeteLocal:tiporetesLocal) {
				if(this.permiteMantenimiento(tiporeteLocal) && tiporeteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoReteConstantesFunciones.getTipoReteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoReteConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRete.jLabelid_empresaTipoRete,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoReteConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRete.jLabelcodigoTipoRete,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoReteConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRete.jLabelnombreTipoRete,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoRete!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRete.jLabelid_empresaTipoRete,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRete.jLabelcodigoTipoRete,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRete.jLabelnombreTipoRete,"");
		
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
		this.iIdNuevoTipoRete--;	
		
		
		this.tiporeteAux=new TipoRete();
		
		this.tiporeteAux.setId(this.iIdNuevoTipoRete);
		this.tiporeteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporeteLogic.getTipoRetes().add(this.tiporeteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tiporetes.add(this.tiporeteAux);
		}
		//ARCHITECTURE
		
		this.tiporete=this.tiporeteAux;
		
		if(TipoReteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoRete(this.tiporete);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRete(this.tiporete);
		}
				
		//this.setDefaultControlesTipoRete();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoRete();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoRete();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRete();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRete(this.tiporeteBean,this.tiporete,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRete(this.tiporete);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoReteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tiporeteSessionBean.getConGuardarRelaciones()) {
			classes=TipoReteConstantesFunciones.getClassesRelationshipsOfTipoRete(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tiporeteReturnGeneral=tiporeteLogic.procesarEventosTipoRetesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporeteLogic.getTipoRetes(),this.tiporete,this.tiporeteParameterGeneral,this.isEsNuevoTipoRete,classes);//this.tiporeteLogic.getTipoRete()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoRete(this.tiporeteReturnGeneral,this.tiporeteBean,false);
		
		if(this.tiporeteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRete(this.tiporeteReturnGeneral.getTipoRete());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoRete(this.tiporeteReturnGeneral.getTipoRete());
		}
		
		if(this.tiporeteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoRete(this.tiporeteReturnGeneral.getTipoRete(),classes);//this.tiporeteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoRete(this.tiporete,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoRete();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoRete();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoReteBeanSwingJInternalFrameAdditional.RecargarFormTipoRete(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoRete(false);
						
			if(tiporeteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoReteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRete();
			}
			
			this.actualizarVisualTableDatosTipoRete();
			
			this.jTableDatosTipoRete.setRowSelectionInterval(this.getIndiceNuevoTipoRete(), this.getIndiceNuevoTipoRete());
			
			this.seleccionarFilaTablaTipoReteActual();
						
			this.actualizarEstadoCeldasBotonesTipoRete("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoRete(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoRete.jTextFieldcodigoTipoRete.setEnabled(isHabilitar && this.tiporeteConstantesFunciones.activarcodigoTipoRete);
		this.jInternalFrameDetalleFormTipoRete.jTextAreanombreTipoRete.setEnabled(isHabilitar && this.tiporeteConstantesFunciones.activarnombreTipoRete);	
		//
		this.jInternalFrameDetalleFormTipoRete.jComboBoxid_empresaTipoRete.setEnabled(isHabilitar && this.tiporeteConstantesFunciones.activarid_empresaTipoRete);
	};
	
	public void setDefaultControlesTipoRete() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoRete(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tiporeteSessionBean.setConGuardarRelaciones(true);			
			this.tiporeteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoRete.jTabbedPaneRelacionesTipoRete.setVisible(true);
			
					
		} else {
			//this.tiporeteSessionBean.setConGuardarRelaciones(false);			
			this.tiporeteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoRete.jTabbedPaneRelacionesTipoRete.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoRete() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRete tiporeteAux:this.tiporeteLogic.getTipoRetes()) {
				if(tiporeteAux.getId().equals(this.iIdNuevoTipoRete)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRete tiporeteAux:this.tiporetes) {
				if(tiporeteAux.getId().equals(this.iIdNuevoTipoRete)) {
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
	
	public int getIndiceActualTipoRete(TipoRete tiporete,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRete tiporeteAux:this.tiporeteLogic.getTipoRetes()) {
				if(tiporeteAux.getId().equals(tiporete.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRete tiporeteAux:this.tiporetes) {
				if(tiporeteAux.getId().equals(tiporete.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoRete(TipoRete tiporeteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRete tiporeteAux:this.tiporeteLogic.getTipoRetes()) {
				if(tiporeteAux.getTipoReteOriginal().getId().equals(tiporeteOriginal.getId())) {
					existe=true;
					tiporeteOriginal.setId(tiporeteAux.getId());
					tiporeteOriginal.setVersionRow(tiporeteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRete tiporeteAux:this.tiporetes) {
				if(tiporeteAux.getTipoReteOriginal().getId().equals(tiporeteOriginal.getId())) {
					existe=true;
					tiporeteOriginal.setId(tiporeteAux.getId());
					tiporeteOriginal.setVersionRow(tiporeteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoRete(Boolean esParaCancelar) throws Exception {
		tiporetesAux=new ArrayList<TipoRete>();
		tiporeteAux=new TipoRete();
		
		if(!this.tiporeteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRete tiporeteAux:this.tiporeteLogic.getTipoRetes()) {
					if(tiporeteAux.getId()<0) {
						tiporetesAux.add(tiporeteAux);
					}		
				}
				this.iIdNuevoTipoRete=0L;
				this.tiporeteLogic.getTipoRetes().removeAll(tiporetesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRete tiporeteAux:this.tiporetes) {
					if(tiporeteAux.getId()<0) {
						tiporetesAux.add(tiporeteAux);
					}		
				}
				this.iIdNuevoTipoRete=0L;
				this.tiporetes.removeAll(tiporetesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoRete 
					&& this.tiporeteLogic.getTipoRetes().size()>0
					) {
					tiporeteAux=this.tiporeteLogic.getTipoRetes().get(this.tiporeteLogic.getTipoRetes().size() - 1);
				
					if(tiporeteAux.getId()<0) {
						this.tiporeteLogic.getTipoRetes().remove(tiporeteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoRete && this.tiporetes.size()>0) {
					tiporeteAux=this.tiporetes.get(this.tiporetes.size() - 1);
				
					if(tiporeteAux.getId()<0) {
						this.tiporetes.remove(tiporeteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoRete(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tiporete.getId()<0) {
				this.tiporeteLogic.getTipoRetes().remove(this.tiporete);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tiporete.getId()<0) {
				this.tiporetes.remove(this.tiporete);
			}
		}			
	}
	
	public void setEstadosInicialesTipoRete(List<TipoRete> tiporetesAux) throws Exception {
		TipoReteConstantesFunciones.setEstadosInicialesTipoRete(tiporetesAux);
	}
	
	public void setEstadosInicialesTipoRete(TipoRete tiporeteAux) throws Exception {
		TipoReteConstantesFunciones.setEstadosInicialesTipoRete(tiporeteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoReteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoRete("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoReteActual()) {
				if(!this.isEsNuevoTipoRete) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoRete("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoRete=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoReteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Rete(temporal) ?", "MANTENIMIENTO DE Tipo Rete(temporal)", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoRete("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoRete tiporete) throws Exception {
		TipoReteConstantesFunciones.seleccionarAsignar(this.tiporete,tiporete);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoRete=this.isPermisoActualizarOriginalTipoRete;
			
			
			this.seleccionarAsignar(tiporete);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoReteConstantesFunciones.quitarEspaciosTipoRete(this.tiporete,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoRete("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tiporeteSessionBean.setsFuncionBusquedaRapida(this.tiporeteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoRete) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoRete(esParaCancelar);				
				this.cancelarNuevoTipoRete(esParaCancelar);								
			}
			
			this.tiporete=new TipoRete();
			
			this.inicializarTipoRete();
			
			this.actualizarEstadoCeldasBotonesTipoRete("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoRete() throws Exception {
		try {
			TipoReteConstantesFunciones.inicializarTipoRete(this.tiporete);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tiporeteLogic.getTipoRetes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoRetes(String sAccionBusqueda,List<TipoRete> tiporetesParaReportes) throws Exception {
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
					sPathReporteFinal="TipoRete"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoReteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoReteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoRete"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Rete(temporal)s");		
		parameters.put("busquedapor", TipoReteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoRete=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoReteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoReteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoRete=new JRBeanArrayDataSource(TipoReteJInternalFrame.TraerTipoReteBeans(tiporetesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoRete);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoReteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoReteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoReteBean.TraerTipoReteBeans(tiporetesParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoRetes(sAccionBusqueda,sTipoArchivoReporte,tiporetesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoRetes(sAccionBusqueda,sTipoArchivoReporte,tiporetesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoReteActionPerformed(null);
					//this.generarExcelReporteTipoRetes(sAccionBusqueda,sTipoArchivoReporte,tiporetesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoRetes(sAccionBusqueda,sTipoArchivoReporte,tiporetesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoRetes(sAccionBusqueda,sTipoArchivoReporte,tiporetesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoRetes(sAccionBusqueda,sTipoArchivoReporte,tiporetesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoRetes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRete> tiporetesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporete";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRetes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRete("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoRete tiporete : tiporetesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoReteConstantesFunciones.generarExcelReporteDataTipoRete("NORMAL",row,workbook,tiporete,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporeteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rete(temporal)",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoRete(String sTipo,Row row,Workbook workbook) {
		
		TipoReteConstantesFunciones.generarExcelReporteHeaderTipoRete(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoRetes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRete> tiporetesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporete_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRetes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoRete tiporete : tiporetesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoReteConstantesFunciones.getTipoReteDescripcion(tiporete));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoReteConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoReteConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporete.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoReteConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoReteConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporete.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoReteConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoReteConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporete.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporeteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rete(temporal)",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoRetes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRete> tiporetesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoRete> tiporetesRespaldo=null;
		
		classes=TipoReteConstantesFunciones.getClassesRelationshipsOfTipoRete(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tiporeteLogic.setDatosCliente(this.datosCliente);
		this.tiporeteLogic.setDatosDeep(this.datosDeep);
		this.tiporeteLogic.setIsConDeep(true);
		
		tiporetesRespaldo=this.tiporeteLogic.getTipoRetes();
		
		this.tiporeteLogic.setTipoRetes(tiporetesParaReportes);	
		this.tiporeteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tiporetesParaReportes=this.tiporeteLogic.getTipoRetes();
		this.tiporeteLogic.setTipoRetes(tiporetesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporete_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRetes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRete("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoRete tiporete : tiporetesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoRete("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoReteConstantesFunciones.generarExcelReporteDataTipoRete("NORMAL",row,workbook,tiporete,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoReteConstantesFunciones.getTipoReteDescripcion(tiporete));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporeteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rete(temporal)",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRete.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRete.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRete.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRete.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoRete() throws Exception {		
		this.startProcessTipoRete(true);
	}
	
	public void startProcessTipoRete(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoRete ,this.jPanelParametrosReportesTipoRete, this.jScrollPanelDatosTipoRete,this.jPanelPaginacionTipoRete, this.jScrollPanelDatosEdicionTipoRete, this.jPanelAccionesTipoRete,this.jPanelAccionesFormularioTipoRete,this.jmenuBarTipoRete,this.jmenuBarDetalleTipoRete,this.jTtoolBarTipoRete,this.jTtoolBarDetalleTipoRete);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRete=this.jTabbedPaneBusquedasTipoRete; 
		
		final JPanel jPanelParametrosReportesTipoRete=this.jPanelParametrosReportesTipoRete;
		//final JScrollPane jScrollPanelDatosTipoRete=this.jScrollPanelDatosTipoRete;
		final JTable jTableDatosTipoRete=this.jTableDatosTipoRete;		
		final JPanel jPanelPaginacionTipoRete=this.jPanelPaginacionTipoRete;
		//final JScrollPane jScrollPanelDatosEdicionTipoRete=this.jScrollPanelDatosEdicionTipoRete;
		final JPanel jPanelAccionesTipoRete=this.jPanelAccionesTipoRete;
		
		JPanel jPanelCamposAuxiliarTipoRete=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoRete=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoRete!=null) {
			jPanelCamposAuxiliarTipoRete=this.jInternalFrameDetalleFormTipoRete.jPanelCamposTipoRete;
			jPanelAccionesFormularioAuxiliarTipoRete=this.jInternalFrameDetalleFormTipoRete.jPanelAccionesFormularioTipoRete;
		}
		
		final JPanel jPanelCamposTipoRete=jPanelCamposAuxiliarTipoRete;
		final JPanel jPanelAccionesFormularioTipoRete=jPanelAccionesFormularioAuxiliarTipoRete;
		
		
		final JMenuBar jmenuBarTipoRete=this.jmenuBarTipoRete;
		final JToolBar jTtoolBarTipoRete=this.jTtoolBarTipoRete;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoRete=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRete=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoRete!=null) {
			jmenuBarDetalleAuxiliarTipoRete=this.jInternalFrameDetalleFormTipoRete.jmenuBarDetalleTipoRete;
			jTtoolBarDetalleAuxiliarTipoRete=this.jInternalFrameDetalleFormTipoRete.jTtoolBarDetalleTipoRete;
		}
		
		final JMenuBar jmenuBarDetalleTipoRete=jmenuBarDetalleAuxiliarTipoRete;
		final JToolBar jTtoolBarDetalleTipoRete=jTtoolBarDetalleAuxiliarTipoRete;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRete;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRete;
			processRunnable.jTableDatos=jTableDatosTipoRete;
			processRunnable.jPanelCampos=jPanelCamposTipoRete;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRete;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRete;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRete;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRete;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRete;
			processRunnable.jTtoolBar=jTtoolBarTipoRete;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRete;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoRete ,jPanelParametrosReportesTipoRete,jTableDatosTipoRete, /*jScrollPanelDatosTipoRete,*/jPanelCamposTipoRete,jPanelPaginacionTipoRete, /*jScrollPanelDatosEdicionTipoRete,*/ jPanelAccionesTipoRete,jPanelAccionesFormularioTipoRete,jmenuBarTipoRete,jmenuBarDetalleTipoRete,jTtoolBarTipoRete,jTtoolBarDetalleTipoRete);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoRete ,jPanelParametrosReportesTipoRete, jScrollPanelDatosTipoRete,jPanelPaginacionTipoRete, jScrollPanelDatosEdicionTipoRete, jPanelAccionesTipoRete,jPanelAccionesFormularioTipoRete,jmenuBarTipoRete,jmenuBarDetalleTipoRete,jTtoolBarTipoRete,jTtoolBarDetalleTipoRete);
						
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
	
	public void finishProcessTipoRete() {// throws Exception 
		this.finishProcessTipoRete(true);
	}
	
	public void finishProcessTipoRete(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoRete ,this.jPanelParametrosReportesTipoRete, this.jScrollPanelDatosTipoRete,this.jPanelPaginacionTipoRete, this.jScrollPanelDatosEdicionTipoRete, this.jPanelAccionesTipoRete,this.jPanelAccionesFormularioTipoRete,this.jmenuBarTipoRete,this.jmenuBarDetalleTipoRete,this.jTtoolBarTipoRete,this.jTtoolBarDetalleTipoRete);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRete=this.jTabbedPaneBusquedasTipoRete; 
		
		final JPanel jPanelParametrosReportesTipoRete=this.jPanelParametrosReportesTipoRete;
		//final JScrollPane jScrollPanelDatosTipoRete=this.jScrollPanelDatosTipoRete;
		final JTable jTableDatosTipoRete=this.jTableDatosTipoRete;		
		final JPanel jPanelPaginacionTipoRete=this.jPanelPaginacionTipoRete;
		//final JScrollPane jScrollPanelDatosEdicionTipoRete=this.jScrollPanelDatosEdicionTipoRete;
		final JPanel jPanelAccionesTipoRete=this.jPanelAccionesTipoRete;
		
		JPanel jPanelCamposAuxiliarTipoRete=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoRete=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoRete!=null) {
			jPanelCamposAuxiliarTipoRete=this.jInternalFrameDetalleFormTipoRete.jPanelCamposTipoRete;
			jPanelAccionesFormularioAuxiliarTipoRete=this.jInternalFrameDetalleFormTipoRete.jPanelAccionesFormularioTipoRete;
		}
		
		final JPanel jPanelCamposTipoRete=jPanelCamposAuxiliarTipoRete;
		final JPanel jPanelAccionesFormularioTipoRete=jPanelAccionesFormularioAuxiliarTipoRete;
		
		
		final JMenuBar jmenuBarTipoRete=this.jmenuBarTipoRete;		
		final JToolBar jTtoolBarTipoRete=this.jTtoolBarTipoRete;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoRete=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRete=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoRete!=null) {
			jmenuBarDetalleAuxiliarTipoRete=this.jInternalFrameDetalleFormTipoRete.jmenuBarDetalleTipoRete;
			jTtoolBarDetalleAuxiliarTipoRete=this.jInternalFrameDetalleFormTipoRete.jTtoolBarDetalleTipoRete;		
		}
		
		final JMenuBar jmenuBarDetalleTipoRete=jmenuBarDetalleAuxiliarTipoRete;
		final JToolBar jTtoolBarDetalleTipoRete=jTtoolBarDetalleAuxiliarTipoRete;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRete;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRete;
			processRunnable.jTableDatos=jTableDatosTipoRete;
			processRunnable.jPanelCampos=jPanelCamposTipoRete;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRete;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRete;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRete;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRete;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRete;
			processRunnable.jTtoolBar=jTtoolBarTipoRete;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRete;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoRete ,jPanelParametrosReportesTipoRete, jTableDatosTipoRete,/*jScrollPanelDatosTipoRete,*/jPanelCamposTipoRete,jPanelPaginacionTipoRete, /*jScrollPanelDatosEdicionTipoRete,*/ jPanelAccionesTipoRete,jPanelAccionesFormularioTipoRete,jmenuBarTipoRete,jmenuBarDetalleTipoRete,jTtoolBarTipoRete,jTtoolBarDetalleTipoRete));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoRete(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoRete(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoRete(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoRete(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoRete,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoRete,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoRete(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoRete,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoRete,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tiporeteConstantesFunciones.getsFinalQueryTipoRete();
		String  finalQueryPaginacionTodos=this.tiporeteConstantesFunciones.getsFinalQueryTipoRete();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoReteConstantesFunciones.getArrayColumnasGlobalesNoTipoRete(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoReteConstantesFunciones.getArrayColumnasGlobalesTipoRete(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoReteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tiporetesEliminados= new ArrayList<TipoRete>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoRete();
		
				///*TipoReteSessionBean*/this.tiporeteSessionBean=new TipoReteSessionBean();
			
			if(this.tiporeteSessionBean==null) {
				this.tiporeteSessionBean=new TipoReteSessionBean();
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
					this.iNumeroPaginacion=TipoReteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoReteConstantesFunciones.getClassesForeignKeysOfTipoRete(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tiporete."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tiporetesAux= new ArrayList<TipoRete>();
			
				
			tiporeteLogic.setDatosCliente(this.datosCliente);
			tiporeteLogic.setDatosDeep(this.datosDeep);
			tiporeteLogic.setIsConDeep(true);
			
			
			tiporeteLogic.getTipoReteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tiporeteLogic.getTodosTipoRetes(finalQueryGlobal,pagination);
					
					//tiporeteLogic.getTodosTipoRetesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tiporeteLogic.getTipoRetes()==null|| tiporeteLogic.getTipoRetes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporetesAux= new ArrayList<TipoRete>();
							tiporetesAux.addAll(tiporeteLogic.getTipoRetes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetesAux= new ArrayList<TipoRete>();
							tiporetesAux.addAll(tiporetes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporeteLogic.getTodosTipoRetes(finalQueryGlobal+"",this.pagination);												
							
							//tiporeteLogic.getTodosTipoRetesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoRetes("Todos",tiporeteLogic.getTipoRetes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporeteLogic.setTipoRetes(new ArrayList<TipoRete>());					
							tiporeteLogic.getTipoRetes().addAll(tiporetesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetes=new ArrayList<TipoRete>();
							tiporetes.addAll(tiporetesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoRete=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoRete=this.idActual;
				
				} else if(this.idTipoReteActual!=null && this.idTipoReteActual!=0L) {
					idTipoRete=idTipoReteActual;
				}
				
					
				this.sDetalleReporte=TipoReteConstantesFunciones.getDetalleIndicePorId(idTipoRete);
				
				this.tiporetes=new ArrayList<TipoRete>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tiporeteLogic.getEntity(idTipoRete);
					
					//tiporeteLogic.getEntityWithConnection(idTipoRete);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporeteLogic.setTipoRetes(new ArrayList<TipoRete>());
					tiporeteLogic.getTipoRetes().add(tiporeteLogic.getTipoRete());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporetes=new ArrayList<TipoRete>();
					this.tiporetes.add(tiporete);
				}
				
				if(tiporeteLogic.getTipoRete()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoReteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiporeteLogic.getTipoRetesBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoReteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoReteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiporeteLogic.getTipoRetes()==null||tiporeteLogic.getTipoRetes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiporetes==null|| tiporetes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetesAux=new ArrayList<TipoRete>();
						tiporetesAux.addAll(tiporeteLogic.getTipoRetes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetesAux=new ArrayList<TipoRete>();
							tiporetesAux.addAll(tiporetes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiporeteLogic.getTipoRetesBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoReteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoReteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoRetes("BusquedaPorCodigo",tiporeteLogic.getTipoRetes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoRetes("BusquedaPorCodigo",tiporetes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporeteLogic.setTipoRetes(new ArrayList<TipoRete>());
						tiporeteLogic.getTipoRetes().addAll(tiporetesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetes=new ArrayList<TipoRete>();
							tiporetes.addAll(tiporetesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoReteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiporeteLogic.getTipoRetesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoReteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoReteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiporeteLogic.getTipoRetes()==null||tiporeteLogic.getTipoRetes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiporetes==null|| tiporetes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetesAux=new ArrayList<TipoRete>();
						tiporetesAux.addAll(tiporeteLogic.getTipoRetes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetesAux=new ArrayList<TipoRete>();
							tiporetesAux.addAll(tiporetes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiporeteLogic.getTipoRetesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoReteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoReteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoRetes("BusquedaPorNombre",tiporeteLogic.getTipoRetes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoRetes("BusquedaPorNombre",tiporetes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporeteLogic.setTipoRetes(new ArrayList<TipoRete>());
						tiporeteLogic.getTipoRetes().addAll(tiporetesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetes=new ArrayList<TipoRete>();
							tiporetes.addAll(tiporetesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoReteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiporeteLogic.getTipoRetesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoReteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoReteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiporeteLogic.getTipoRetes()==null||tiporeteLogic.getTipoRetes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiporetes==null|| tiporetes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetesAux=new ArrayList<TipoRete>();
						tiporetesAux.addAll(tiporeteLogic.getTipoRetes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetesAux=new ArrayList<TipoRete>();
							tiporetesAux.addAll(tiporetes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiporeteLogic.getTipoRetesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoReteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoReteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoRetes("FK_IdEmpresa",tiporeteLogic.getTipoRetes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoRetes("FK_IdEmpresa",tiporetes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporeteLogic.setTipoRetes(new ArrayList<TipoRete>());
						tiporeteLogic.getTipoRetes().addAll(tiporetesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetes=new ArrayList<TipoRete>();
							tiporetes.addAll(tiporetesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoRete();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoRete();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporeteLogic.getTipoRetes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporetes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporeteLogic.getTipoRetes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporetes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoRete tiporete) {
		Boolean permite=true;
		
		if(this.tiporete.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoReteConstantesFunciones.getOrderByListaTipoRete();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoReteConstantesFunciones.getOrderByListaTipoRete();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRete tiporete:tiporeteLogic.getTipoRetes()) {
				if(tiporete.getsType().equals(Constantes2.S_TOTALES)) {
					tiporeteTotales=tiporete;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRete tiporete:this.tiporetes) {
				if(tiporete.getsType().equals(Constantes2.S_TOTALES)) {
					tiporeteTotales=tiporete;
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
			this.tiporeteAux=new TipoRete();
			this.tiporeteAux.setsType(Constantes2.S_TOTALES);
			this.tiporeteAux.setIsNew(false);
			this.tiporeteAux.setIsChanged(false);
			this.tiporeteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoReteConstantesFunciones.TotalizarValoresFilaTipoRete(this.tiporeteLogic.getTipoRetes(),this.tiporeteAux);
				
				this.tiporeteLogic.getTipoRetes().add(this.tiporeteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoReteConstantesFunciones.TotalizarValoresFilaTipoRete(this.tiporetes,this.tiporeteAux);
				
				this.tiporetes.add(this.tiporeteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tiporeteTotales=new TipoRete();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporeteLogic.getTipoRetes().remove(tiporeteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporetes.remove(tiporeteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tiporeteTotales=new TipoRete();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRete tiporete:tiporeteLogic.getTipoRetes()) {
				if(tiporete.getsType().equals(Constantes2.S_TOTALES)) {
					tiporeteTotales=tiporete;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoReteConstantesFunciones.TotalizarValoresFilaTipoRete(this.tiporeteLogic.getTipoRetes(),tiporeteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRete tiporete:this.tiporetes) {
				if(tiporete.getsType().equals(Constantes2.S_TOTALES)) {
					tiporeteTotales=tiporete;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoReteConstantesFunciones.TotalizarValoresFilaTipoRete(this.tiporetes,tiporeteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoRetesBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoRetesBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoRetesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoRetesBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporeteLogic.getTipoRetesBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoRetesBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporeteLogic.getTipoRetesBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoRetesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporeteLogic.getTipoRetesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoRete() {
		this.isPermisoTodoTipoRete=false;
		this.isPermisoNuevoTipoRete=false;
		this.isPermisoActualizarTipoRete=false;
		this.isPermisoActualizarOriginalTipoRete=false;
		this.isPermisoEliminarTipoRete=false;
		this.isPermisoGuardarCambiosTipoRete=false;
		this.isPermisoConsultaTipoRete=false;
		this.isPermisoBusquedaTipoRete=false;
		this.isPermisoReporteTipoRete=false;		
		this.isPermisoOrdenTipoRete=false;		
		this.isPermisoPaginacionMedioTipoRete=false;		
		this.isPermisoPaginacionAltoTipoRete=false;
		this.isPermisoPaginacionTodoTipoRete=false;
		this.isPermisoCopiarTipoRete=false;		
		this.isPermisoVerFormTipoRete=false;		
		this.isPermisoDuplicarTipoRete=false;		
		this.isPermisoOrdenTipoRete=false;		
	}
	
	public void setPermisosUsuarioTipoRete(Boolean isPermiso) {
		this.isPermisoTodoTipoRete=isPermiso;
		this.isPermisoNuevoTipoRete=isPermiso;
		this.isPermisoActualizarTipoRete=isPermiso;
		this.isPermisoActualizarOriginalTipoRete=isPermiso;
		this.isPermisoEliminarTipoRete=isPermiso;
		this.isPermisoGuardarCambiosTipoRete=isPermiso;
		this.isPermisoConsultaTipoRete=isPermiso;
		this.isPermisoBusquedaTipoRete=isPermiso;
		this.isPermisoReporteTipoRete=isPermiso;
		this.isPermisoOrdenTipoRete=isPermiso;		
		this.isPermisoPaginacionMedioTipoRete=isPermiso;		
		this.isPermisoPaginacionAltoTipoRete=isPermiso;		
		this.isPermisoPaginacionTodoTipoRete=isPermiso;		
		this.isPermisoCopiarTipoRete=isPermiso;		
		this.isPermisoVerFormTipoRete=isPermiso;		
		this.isPermisoDuplicarTipoRete=isPermiso;
		this.isPermisoOrdenTipoRete=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoRete(Boolean isPermiso) {
		//this.isPermisoTodoTipoRete=isPermiso;
		this.isPermisoNuevoTipoRete=isPermiso;
		this.isPermisoActualizarTipoRete=isPermiso;
		this.isPermisoActualizarOriginalTipoRete=isPermiso;
		this.isPermisoEliminarTipoRete=isPermiso;
		this.isPermisoGuardarCambiosTipoRete=isPermiso;
		//this.isPermisoConsultaTipoRete=isPermiso;
		//this.isPermisoBusquedaTipoRete=isPermiso;
		//this.isPermisoReporteTipoRete=isPermiso;
		//this.isPermisoOrdenTipoRete=isPermiso;		
		//this.isPermisoPaginacionMedioTipoRete=isPermiso;		
		//this.isPermisoPaginacionAltoTipoRete=isPermiso;		
		//this.isPermisoPaginacionTodoTipoRete=isPermiso;		
		//this.isPermisoCopiarTipoRete=isPermiso;		
		//this.isPermisoDuplicarTipoRete=isPermiso;
		//this.isPermisoOrdenTipoRete=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoReteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoReteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoRete(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoReteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoReteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoReteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoReteClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoRete() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoReteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tiporeteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoReteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoRete=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoRete=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoRete=this.isPermisoActualizarTipoRete;
			this.isPermisoEliminarTipoRete=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoRete=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoRete=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoRete=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoRete=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoRete=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRete=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoRete=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoRete=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoRete=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoRete=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoRete=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoRete=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRete=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tiporeteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoRete.setToolTipText(this.jTableDatosTipoRete.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoRete(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoRete(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoReteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoReteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoRete() throws Exception {
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
	public void inicializarCombosForeignKeyTipoReteListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoReteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoReteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoReteListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoReteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoReteParameterReturnGeneral tiporeteReturnGeneral=new TipoReteParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tiporeteConstantesFunciones.cargarid_empresaTipoRete)
					 || (this.esRecargarFks && this.tiporeteConstantesFunciones.cargarid_empresaTipoRete)) {

					if(!this.tiporeteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tiporeteSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tiporeteReturnGeneral=tiporeteLogic.cargarCombosLoteForeignKeyTipoRete(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tiporeteReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoRete()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tiporeteSessionBean==null) {
				this.tiporeteSessionBean=new TipoReteSessionBean();
			}

			if(!this.tiporeteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoRete()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoRete(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoRete()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRete();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoRete(TipoRete tiporete)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoRete(TipoRete tiporete,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoRete()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRete()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoRete()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoRete()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoRete()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoRete()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoRete(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoRete()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoRete.jComboBoxid_empresaTipoRete!=null && this.jInternalFrameDetalleFormTipoRete.jComboBoxid_empresaTipoRete.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoRete.jComboBoxid_empresaTipoRete.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoReteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoReteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoReteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tiporeteSessionBean=new TipoReteSessionBean(); 
		this.tiporeteConstantesFunciones=new TipoReteConstantesFunciones(); 
		this.tiporeteBean=new TipoRete();//(this.tiporeteConstantesFunciones); 		
		this.tiporeteReturnGeneral=new TipoReteParameterReturnGeneral(); 
		
		this.tiporeteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporeteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoReteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoReteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoReteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoRete(true);
			
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
			
			this.tiporeteConstantesFunciones=new TipoReteConstantesFunciones(); 
			this.tiporeteBean=new TipoRete();//this.tiporeteConstantesFunciones); 			
			this.tiporeteReturnGeneral=new TipoReteParameterReturnGeneral(); 
		
			TipoReteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Rete(temporal) Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tiporete=new TipoRete();
			this.tiporetes = new ArrayList<TipoRete>();
			this.tiporetesAux = new ArrayList<TipoRete>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic=new TipoReteLogic();
				this.tiporeteLogic.getNewConnexionToDeep("");
			}
			
			//this.tiporeteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tiporeteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoRete);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoRete!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRete);	
					}
					
					if(this.jInternalFrameImportacionTipoRete!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRete);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoRete!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoRete);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoRete!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRete);
				this.jInternalFrameDetalleFormTipoRete.setVisible(false);
				this.jInternalFrameDetalleFormTipoRete.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoRete!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRete);
					this.jInternalFrameReporteDinamicoTipoRete.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoRete.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoRete!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoRete);
					this.jInternalFrameImportacionTipoRete.setVisible(false);
					this.jInternalFrameImportacionTipoRete.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoRete!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoRete);
					this.jInternalFrameOrderByTipoRete.setVisible(false);
					this.jInternalFrameOrderByTipoRete.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoReteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoReteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tiporeteReturnGeneral=new TipoReteParameterReturnGeneral();
			
			this.tiporeteParameterGeneral=new TipoReteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tiporeteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tiporeteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoReteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tiporeteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoReteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporeteSessionBean.getEsGuardarRelacionado(),this.tiporeteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoReteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporeteSessionBean.getEsGuardarRelacionado(),this.tiporeteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoRete=false;
			this.isVisibilidadCeldaDuplicarTipoRete=true;
			this.isVisibilidadCeldaCopiarTipoRete=true;
			this.isVisibilidadCeldaVerFormTipoRete=true;
			this.isVisibilidadCeldaOrdenTipoRete=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRete=false;
			this.isVisibilidadCeldaModificarTipoRete=false;
			this.isVisibilidadCeldaActualizarTipoRete=false;
			this.isVisibilidadCeldaEliminarTipoRete=false;
			this.isVisibilidadCeldaCancelarTipoRete=false;
			this.isVisibilidadCeldaGuardarTipoRete=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRete=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoRete("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoRete();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoRete(false);
			
			this.setPermisosUsuarioTipoRete();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporeteSessionBean.getEsGuardarRelacionado() 
				|| (this.tiporeteSessionBean.getEsGuardarRelacionado() && this.tiporeteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoReteClasesRelacionadas();
			}
			
			if(this.tiporeteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoReteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoReteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoRete();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoRete();
			}
			
			if(!this.isPermisoBusquedaTipoRete) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoRete.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporeteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoRete,this.isPermisoPaginacionMedioTipoRete,this.isPermisoPaginacionTodoTipoRete);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoReteConstantesFunciones.getTiposSeleccionarTipoRete());
				
				this.tiposColumnasSelect=TipoReteConstantesFunciones.getTiposSeleccionarTipoRete(true);
				
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
			//if(!this.tiporeteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoRete();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoRete(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoRete(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRete() ;
			
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
				tiporeteImplementable= (TipoReteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoReteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tiporeteImplementableHome= (TipoReteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoReteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tiporetes= new ArrayList<TipoRete>();
			this.tiporetesEliminados= new ArrayList<TipoRete>();
						
			this.isEsNuevoTipoRete=false;
			this.esParaAccionDesdeFormularioTipoRete=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoRete(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoRete();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporeteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoReteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoReteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoRete("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoRete(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoRete!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoRete();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoRete();
			}
			
			TipoReteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoRete.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoRete.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoRete.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoRete(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoRete: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoRete() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoRete")) {
				iIndex=this.jInternalFrameDetalleFormTipoRete.jTabbedPaneRelacionesTipoRete.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoRete.jTabbedPaneRelacionesTipoRete.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoRete.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoRete();	
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
	
	public void cargarCombosForeignKeyTipoRete(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoRete(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoRete(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoReteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoRete();
		
		this.cargarCombosFrameForeignKeyTipoRete();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoRete();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoRete();
		}
	}
	
	
	
	public void jButtonNuevoTipoReteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tiporeteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoRete==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
			
			
			if(jTableDatosTipoRete.getRowCount()>=1) {
				jTableDatosTipoRete.removeRowSelectionInterval(0, jTableDatosTipoRete.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoRete=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoRete(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoRete(true);			
			//this.tiporete=new TipoRete();
			//this.tiporete.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRete(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRete() ;
			
			if(TipoReteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRete(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tiporete);	
			this.actualizarInformacion("INFO_PADRE",false,this.tiporete);				
			
			TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
			
			if(this.tiporeteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoRete: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoReteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoRete> tiporetesSeleccionados=new ArrayList<TipoRete>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoRete.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoRete.getSelectedRows().length;			
			}
			
			tiporetesSeleccionados=this.getTipoRetesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoRete--;			
				//TipoRete tiporeteAux= new TipoRete();			
				//tiporeteAux.setId(this.iIdNuevoTipoRete);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoRete tiporeteOrigen=new TipoRete();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoRete tiporeteOrigen : tiporetesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoRete.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tiporeteOrigen =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporeteOrigen =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoRete();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tiporete.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoRete(tiporeteOrigen,this.tiporete,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRete(this.tiporete);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporeteLogic.getTipoRetes().add(this.tiporeteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporetes.add(this.tiporeteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoRete(false);
				
				this.jTableDatosTipoRete.setRowSelectionInterval(this.getIndiceNuevoTipoRete(), this.getIndiceNuevoTipoRete());
				
				int iLastRow =  this.jTableDatosTipoRete.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRete.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRete.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRete(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoReteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoRete> tiporetesSeleccionados=new ArrayList<TipoRete>();									
		
			TipoRete tiporeteOrigen=new TipoRete();
			TipoRete tiporeteDestino=new TipoRete();
				
			tiporetesSeleccionados=this.getTipoRetesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoRete.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tiporetesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoRete.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporeteOrigen =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporeteOrigen =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporeteDestino =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporeteDestino =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tiporeteOrigen =tiporetesSeleccionados.get(0);
				tiporeteDestino =tiporetesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoRete(tiporeteOrigen,tiporeteDestino,true,false);
				
				tiporeteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporeteDestino,tiporeteLogic.getTipoRetes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporeteDestino,tiporetes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoRete(false);
				
				//this.jTableDatosTipoRete.setRowSelectionInterval(this.getIndiceNuevoTipoRete(), this.getIndiceNuevoTipoRete());
				
				int iLastRow =  this.jTableDatosTipoRete.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRete.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRete.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRete(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoReteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRete==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoRete.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoReteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoRete.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoRete.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoRete.setVisible(!isVisible);
			this.jPanelPaginacionTipoRete.setVisible(!isVisible);
			this.jPanelAccionesTipoRete.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoReteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoRete();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoReteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoRete();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoReteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoRete();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoReteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoRete();
			
			this.abrirFrameOrderByTipoRete();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoReteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoRete();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoRete(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRete);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoRete.isMaximum()) {
					this.jInternalFrameDetalleFormTipoRete.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoRete.setSize(this.jInternalFrameDetalleFormTipoRete.iWidthFormulario,this.jInternalFrameDetalleFormTipoRete.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoRete.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoRete.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoRete.isMaximum()) {
						this.jInternalFrameDetalleFormTipoRete.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoRete.jContentPaneDetalleTipoRete.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoRete.jTabbedPaneRelacionesTipoRete.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoRete.jContentPaneDetalleTipoRete.getWidth(),TipoReteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRete.jTabbedPaneRelacionesTipoRete.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoRete.jContentPaneDetalleTipoRete.getWidth(),TipoReteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRete.jTabbedPaneRelacionesTipoRete.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoRete.jContentPaneDetalleTipoRete.getWidth(),TipoReteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoRete.setVisible(true);
	        this.jInternalFrameDetalleFormTipoRete.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoRete() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoRete==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoRete=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRete,false,this);
				} else {
					this.jInternalFrameOrderByTipoRete=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRete,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoRete);
				this.jInternalFrameOrderByTipoRete.setVisible(false);
				this.jInternalFrameOrderByTipoRete.setSelected(false);
				
				this.jInternalFrameOrderByTipoRete.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRete"));
				
				this.inicializarActualizarBindingTablaOrderByTipoRete();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoRete() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoRete==null) {
				
				this.jInternalFrameImportacionTipoRete=new ImportacionJInternalFrame(TipoReteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRete);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoRete);
				this.jInternalFrameImportacionTipoRete.setVisible(false);
				this.jInternalFrameImportacionTipoRete.setSelected(false);


				this.jInternalFrameImportacionTipoRete.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRete"));
				this.jInternalFrameImportacionTipoRete.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRete"));
				this.jInternalFrameImportacionTipoRete.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRete"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoRete() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoRete==null) {
				this.jInternalFrameReporteDinamicoTipoRete=new ReporteDinamicoJInternalFrame(TipoReteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRete);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRete);
				this.jInternalFrameReporteDinamicoTipoRete.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoRete.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoRete.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRete"));
				this.jInternalFrameReporteDinamicoTipoRete.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRete"));
				this.jInternalFrameReporteDinamicoTipoRete.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRete"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRete();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoRete() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRete);
			
	       	this.jInternalFrameDetalleFormTipoRete.setVisible(false);
	        this.jInternalFrameDetalleFormTipoRete.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoRete.dispose();
			//this.jInternalFrameDetalleFormTipoRete=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoRete() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoRete.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoRete.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoRete() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoRete.setVisible(true);
	        this.jInternalFrameImportacionTipoRete.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoRete() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoRete.setVisible(true);
	        this.jInternalFrameOrderByTipoRete.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoRete() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoRete.setVisible(false);
	        this.jInternalFrameOrderByTipoRete.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoRete() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoRete.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoRete.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoRete() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoRete.setVisible(false);
	        this.jInternalFrameImportacionTipoRete.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoReteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoRete(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoRete(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRete.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoRete(true);
			//this.isEsNuevoTipoRete=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporete =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporete =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoRete("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRete(false) ;
			
			if(tiporeteSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoReteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRete(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRete(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoReteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoRete.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporete =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporete =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoRete(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRete==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRete.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoRete(true);
			//this.isEsNuevoTipoRete=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporete =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporete =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tiporete.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoRete("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoRete(false) ;
			
			if(TipoReteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRete(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRete(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoReteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoRete(false);
			
			//if(!this.isEsNuevoTipoRete) {								
				int intSelectedRow = this.jTableDatosTipoRete.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporete =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporete =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoReteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoRete(this.tiporete,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRete(this.tiporete);
				
			}
			
			if(this.permiteMantenimiento(this.tiporete)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporeteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoRete=true;
					this.inicializarActualizarBindingTablaTipoRete(false);
					this.isEsNuevoTipoRete=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoRete=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoRete=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRete(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRete(false);
				
				this.habilitarDeshabilitarControlesTipoRete(false);
			
												
				
				if(TipoReteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoRete();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoReteActionPerformed(evt,tiporeteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoRete(this.tiporete,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoRete.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tiporeteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tiporete.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoRete.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRete.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoReteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoRete.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporete =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
				this.tiporete.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporete =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
				this.tiporete.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tiporete)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporeteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoReteModel) this.jTableDatosTipoRete.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoRete=true;
				this.inicializarActualizarBindingTablaTipoRete(false);
				this.isEsNuevoTipoRete=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRete(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRete(false);
				
				this.habilitarDeshabilitarControlesTipoRete(false);
				
				
				
				if(TipoReteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoRete();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoReteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoRete.getRowCount()>=1) {
				jTableDatosTipoRete.removeRowSelectionInterval(0, jTableDatosTipoRete.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoRete(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoRete(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRete(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRete(false) ;
			
			this.isEsNuevoTipoRete=false;
			
			if(TipoReteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoRete();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoReteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoRete(false);
				
				//SI ES MANUAL
				if(TipoReteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoRete();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoReteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoRete--;			
			//TipoRete tiporeteAux= new TipoRete();			
			//tiporeteAux.setId(this.iIdNuevoTipoRete);
			
			if(this.jInternalFrameDetalleFormTipoRete==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoRete();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoRete(this.tiporete);
			
			this.tiporete.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tiporeteLogic.getTipoRetes().add(this.tiporeteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tiporetes.add(this.tiporeteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoRete(false);
			
			this.jTableDatosTipoRete.setRowSelectionInterval(this.getIndiceNuevoTipoRete(), this.getIndiceNuevoTipoRete());
			
			int iLastRow =  this.jTableDatosTipoRete.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoRete.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoRete.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoRete(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoReteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoRete(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRete(false);
			
			//SI ES MANUAL
			if(TipoReteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRete();
			}
			
			//this.abrirFrameTreeTipoRete();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoReteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Rete(temporal)S ?", "MANTENIMIENTO DE Tipo Rete(temporal)", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoRete.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoRete();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tiporeteReturnGeneral=tiporeteLogic.procesarImportacionTipoRetesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tiporeteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoReteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoReteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoRete.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoRete.setFileImportacion(this.jInternalFrameImportacionTipoRete.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoRete.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoRete.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoRete.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoRete.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoReteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoRete> tiporetesSeleccionados=new ArrayList<TipoRete>();		

		tiporetesSeleccionados=this.getTipoRetesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRete.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRete.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoReteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoReteBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoRetes("Todos",tiporetesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporeteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rete(temporal)",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRete.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRete.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoReteConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoReteConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoReteConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoRete.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRete.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRete.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoReteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoReteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoReteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoRete.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoReteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoReteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoReteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoRete.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRete.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoReteConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoReteConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoReteConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoReteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoRete> tiporetesSeleccionados=new ArrayList<TipoRete>();		
		
		tiporetesSeleccionados=this.getTipoRetesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporete";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoRetes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoRete.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRete.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoReteConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoReteConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoRete tiporete:tiporetesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporete.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoReteConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoReteConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoRete tiporete:tiporetesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporete.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoReteConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoReteConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoRete tiporete:tiporetesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporete.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoRete(row);				
			//	iRow++;
			//}				
			
			//for(TipoRete tiporeteAux:tiporetesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoRete(tiporeteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporeteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rete(temporal)",JOptionPane.INFORMATION_MESSAGE);
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
				this.tiporeteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRete(false);
			
			//SI ES MANUAL
			if(TipoReteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRete();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoReteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRete(false);
			
			//SI ES MANUAL
			if(TipoReteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRete();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoReteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRete(false);
			
			//SI ES MANUAL
			if(TipoReteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRete();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoRete() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoRete.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoRete.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoRete.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoRete.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoRete.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoRete.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoRete.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoRete(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoRete(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoRete(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoRete(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoRete(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporeteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoRete(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRete(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoRete(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoReteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoReteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoRete() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoRete();
		
		this.inicializarActualizarBindingBotonesManualTipoRete(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporeteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRete();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRete() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRete(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRete(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoRete.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoRete.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoRete.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoRete!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoRete.jCheckBoxPostAccionNuevoTipoRete.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoRete.jCheckBoxPostAccionSinCerrarTipoRete.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoRete.jCheckBoxPostAccionSinMensajeTipoRete.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoRete.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoRete.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoRete.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoRete!=null) {
				this.jInternalFrameDetalleFormTipoRete.jCheckBoxPostAccionNuevoTipoRete.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoRete.jCheckBoxPostAccionSinCerrarTipoRete.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoRete.jCheckBoxPostAccionSinMensajeTipoRete.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoRete.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoRete.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoRete!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoRete.jComboBoxTiposAccionesFormularioTipoRete.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoRete.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoRete!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRete.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoRete.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoRete.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoRete.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoRete.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoRete!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRete.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoRete.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoRete.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoRete(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoReteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRete(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoRete() throws Exception {
		try	{
			if(TipoReteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRete();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRete() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoRete.jComboBoxTiposAccionesFormularioTipoRete.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoRete.jComboBoxTiposAccionesFormularioTipoRete.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRete() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoRete.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoRete.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoRete.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoRete.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoRete.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoRete.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoRete.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoRete.addItem(reporte);
			}
			
			
			if(!this.tiporeteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoRete.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoRete.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoRete.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoRete.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoRete.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoRete.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoRete!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoRete.jComboBoxTiposAccionesFormularioTipoRete.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoRete.jComboBoxTiposAccionesFormularioTipoRete.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoRete.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoRete.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoRete.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRete();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRete() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRete!=null) {
				this.jInternalFrameReporteDinamicoTipoRete.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRete.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRete!=null) {
				this.jInternalFrameReporteDinamicoTipoRete.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRete.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoRete!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoRete.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRete.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRete.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoRete.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRete.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRete.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoRete()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoRete.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoRete.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoRete(Boolean esInicializar) throws Exception {				
		if(TipoReteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRete();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoRete() throws Exception {
		this.inicializarActualizarBindingTablaTipoRete(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoRete() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoRete.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoRete.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRete.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoRetePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoRete.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRete.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoRetePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoReteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoReteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoRetePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoRete.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRete.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoRetePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoRete.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoRete(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tiporeteLogic.getTipoRetes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tiporetes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoReteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoRete.setModel(new TipoReteModel(this.tiporeteLogic.getTipoRetes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoRete.setModel(new TipoReteModel(this.tiporetes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoRete!=null && this.jInternalFrameOrderByTipoRete.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoRete();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoRete.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRete,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoRetePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoReteConstantesFunciones.SCLASSWEBTITULO,tiporeteConstantesFunciones.resaltarSeleccionarTipoRete,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoReteConstantesFunciones.SCLASSWEBTITULO,tiporeteConstantesFunciones.resaltarSeleccionarTipoRete,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoRete.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRete,TipoReteConstantesFunciones.LABEL_ID));

		if(this.tiporeteConstantesFunciones.mostraridTipoRete && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoReteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiporeteConstantesFunciones.resaltaridTipoRete,this.tiporeteConstantesFunciones.activaridTipoRete,this,true,"idTipoRete","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporeteConstantesFunciones.resaltaridTipoRete,this.tiporeteConstantesFunciones.activaridTipoRete,this,true,"idTipoRete","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRete.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRete,TipoReteConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tiporeteConstantesFunciones.mostrarid_empresaTipoRete && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoReteConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tiporeteConstantesFunciones.resaltarid_empresaTipoRete,this,this.tiporeteConstantesFunciones.activarid_empresaTipoRete));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tiporeteConstantesFunciones.resaltarid_empresaTipoRete,this,this.tiporeteConstantesFunciones.activarid_empresaTipoRete,false,"id_empresaTipoRete","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRetePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRete.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRete,TipoReteConstantesFunciones.LABEL_CODIGO));

		if(this.tiporeteConstantesFunciones.mostrarcodigoTipoRete && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoReteConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiporeteConstantesFunciones.resaltarcodigoTipoRete,this.tiporeteConstantesFunciones.activarcodigoTipoRete,this,true,"codigoTipoRete","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporeteConstantesFunciones.resaltarcodigoTipoRete,this.tiporeteConstantesFunciones.activarcodigoTipoRete,this,true,"codigoTipoRete","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRetePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRete.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRete,TipoReteConstantesFunciones.LABEL_NOMBRE));

		if(this.tiporeteConstantesFunciones.mostrarnombreTipoRete && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoReteConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiporeteConstantesFunciones.resaltarnombreTipoRete,this.tiporeteConstantesFunciones.activarnombreTipoRete,this,true,"nombreTipoRete","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporeteConstantesFunciones.resaltarnombreTipoRete,this.tiporeteConstantesFunciones.activarnombreTipoRete,this,true,"nombreTipoRete","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRetePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tiporeteSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporeteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporeteSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRete.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporeteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporeteSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRete.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoRete && this.isPermisoGuardarCambiosTipoRete) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tiporeteSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tiporeteSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoRete.addColumn(tableColumn);
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
			
			this.jTableDatosTipoRete.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRete && this.isPermisoGuardarCambiosTipoRete) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRete && this.isPermisoGuardarCambiosTipoRete) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoRete.moveColumn(this.jTableDatosTipoRete.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoRete.moveColumn(this.jTableDatosTipoRete.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoRete.moveColumn(this.jTableDatosTipoRete.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoRete.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoRete.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoRete,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoReteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoRete.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoRete.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoReteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoReteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoRete.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoRete.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoRete.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tiporeteLogic.getTipoRetes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tiporetes.size()-1;
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
		//this.jTableDatosTipoRete.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoRete.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoRete();
			
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
				
				//this.isEsNuevoTipoRete=false;
					
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
			
				if(this.tiporeteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoRete==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRete.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRete.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporete =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporete =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tiporete.getsType().equals("DUPLICADO")
				   || this.tiporete.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoRete=true;
				
				} else {
					this.isEsNuevoTipoRete=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tiporeteSessionBean.getEsGuardarRelacionado()) {
					if(this.tiporete.getId()>=0 && !this.tiporete.getIsNew()) {						
						this.isEsNuevoTipoRete=false;
						
					} else {
						this.isEsNuevoTipoRete=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoRete(esRelaciones);						
				
				this.seleccionarTipoRete(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tiporete.getId()<0) {
					this.isEsNuevoTipoRete=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoRete(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoRete(evt,rowIndex);
				}	
				
				if(this.tiporeteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoRete: " + this.dDif); 
					}
				}								
				
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoRete(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tiporete)) {
					if(this.tiporete.getId()>0) {
						this.tiporete.setIsDeleted(true);
						
						this.tiporetesEliminados.add(this.tiporete);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporeteLogic.getTipoRetes().remove(this.tiporete);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporetes.remove(this.tiporete);				
					}
					
					
					((TipoReteModel) this.jTableDatosTipoRete.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRete(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoRete(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoRete) {
			
			if(this.jInternalFrameDetalleFormTipoRete==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRete.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRete.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporete =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporete =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoReteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoRete(this.tiporete);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tiporeteConstantesFunciones.cargarid_empresaTipoRete || this.tiporeteConstantesFunciones.event_dependid_empresaTipoRete) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tiporete.getid_empresa());
									//this.inicializarActualizarBindingTipoRete(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tiporete.getEmpresa()!=null) {
							this.empresasForeignKey.add(tiporete.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tiporete.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoRete("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoRete(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRete() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRete(TipoRete tiporete) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoRete(tiporete,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRete(TipoRete tiporete,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoRete(tiporete);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoRete(tiporete,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoRete(tiporete);
	}
	
	public void setVariablesObjetoActualToFormularioTipoRete(TipoRete tiporete) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoRete==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoRete.jLabelidTipoRete.setText(tiporete.getId().toString());
			this.jInternalFrameDetalleFormTipoRete.jTextFieldcodigoTipoRete.setText(tiporete.getcodigo());
			this.jInternalFrameDetalleFormTipoRete.jTextAreanombreTipoRete.setText(tiporete.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoRete tiporeteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tiporeteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoRete tiporeteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tiporeteLocal=this.tiporete;
			} else {
				tiporeteLocal=this.tiporeteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tiporeteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoRete(tiporeteLocal,true);
					
					if(tiporeteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tiporeteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tiporeteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tiporeteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoRete(TipoRete tiporete,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRete(tiporete,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRete(tiporete);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRete(TipoRete tiporete,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRete(tiporete,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRete(TipoRete tiporete,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoRete==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoRete.jLabelidTipoRete.getText()==null || this.jInternalFrameDetalleFormTipoRete.jLabelidTipoRete.getText()=="" || this.jInternalFrameDetalleFormTipoRete.jLabelidTipoRete.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoRete.jLabelidTipoRete.setText("0");
			}

			if(conColumnasBase) {tiporete.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoRete.jLabelidTipoRete.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoReteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRete.jLabelIdTipoRete,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporete.setcodigo(this.jInternalFrameDetalleFormTipoRete.jTextFieldcodigoTipoRete.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoReteConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRete.jLabelcodigoTipoRete,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporete.setnombre(this.jInternalFrameDetalleFormTipoRete.jTextAreanombreTipoRete.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoReteConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRete.jLabelnombreTipoRete,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRete(TipoRete tiporeteBean,TipoRete tiporete,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoRete(TipoRete tiporeteOrigen,TipoRete tiporete,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporeteOrigen.getId()!=null && !tiporeteOrigen.getId().equals(0L))) {tiporete.setId(tiporeteOrigen.getId());}}
			if(conDefault || (!conDefault && tiporeteOrigen.getcodigo()!=null && !tiporeteOrigen.getcodigo().equals(""))) {tiporete.setcodigo(tiporeteOrigen.getcodigo());}
			if(conDefault || (!conDefault && tiporeteOrigen.getnombre()!=null && !tiporeteOrigen.getnombre().equals(""))) {tiporete.setnombre(tiporeteOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRete(TipoRete tiporete) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRete.jLabelidTipoRete.setText(tiporete.getId().toString());
			this.jInternalFrameDetalleFormTipoRete.jTextFieldcodigoTipoRete.setText(tiporete.getcodigo());
			this.jInternalFrameDetalleFormTipoRete.jTextAreanombreTipoRete.setText(tiporete.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRete(TipoReteBean tiporeteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRete.jLabelidTipoRete.setText(tiporeteBean.getId().toString());
			this.jInternalFrameDetalleFormTipoRete.jTextFieldcodigoTipoRete.setText(tiporeteBean.getcodigo());
			this.jInternalFrameDetalleFormTipoRete.jTextAreanombreTipoRete.setText(tiporeteBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoRete(TipoReteParameterReturnGeneral tiporeteReturnGeneral,TipoReteBean tiporeteBean,Boolean conDefault) throws Exception { 
		try {
			TipoRete tiporeteLocal=new TipoRete();
			
			tiporeteLocal=tiporeteReturnGeneral.getTipoRete();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporeteLocal.getId()!=null && !tiporeteLocal.getId().equals(0L))) {tiporeteBean.setId(tiporeteLocal.getId());}}
			if(conDefault || (!conDefault && tiporeteLocal.getcodigo()!=null && !tiporeteLocal.getcodigo().equals(""))) {tiporeteBean.setcodigo(tiporeteLocal.getcodigo());}
			if(conDefault || (!conDefault && tiporeteLocal.getnombre()!=null && !tiporeteLocal.getnombre().equals(""))) {tiporeteBean.setnombre(tiporeteLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoReteGenerico(Long idTipoReteSeleccionado,JComboBox jComboBoxTipoRete,List<TipoRete> tiporetesLocal)throws Exception {
		try {
			TipoRete  tiporeteTemp=null;

			for(TipoRete tiporeteAux:tiporetesLocal) {
				if(tiporeteAux.getId()!=null && tiporeteAux.getId().equals(idTipoReteSeleccionado)) {
					tiporeteTemp=tiporeteAux;
					break;
				}
			}

			jComboBoxTipoRete.setSelectedItem(tiporeteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoReteGenerico(JComboBox jComboBoxTipoRete,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoRete.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRete.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoRete.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRete.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRete.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoRete.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRete.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoRete.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoRete.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoRete.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporete=(TipoRete) tiporeteLogic.getTipoRetes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporete =(TipoRete) tiporetes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tiporete.getIsNew() && !tiporete.getIsChanged() && !tiporete.getIsDeleted()) {
				sDescripcion=tiporete.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tiporete.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoRete tiporeteRow=new TipoRete();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporeteRow=(TipoRete) tiporeteLogic.getTipoRetes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporeteRow=(TipoRete) tiporetes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoRete(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoRete.setVisible((this.isVisibilidadCeldaNuevoTipoRete && this.isPermisoNuevoTipoRete));			
			this.jButtonDuplicarTipoRete.setVisible((this.isVisibilidadCeldaDuplicarTipoRete && this.isPermisoDuplicarTipoRete));			
			this.jButtonCopiarTipoRete.setVisible((this.isVisibilidadCeldaCopiarTipoRete && this.isPermisoCopiarTipoRete));
			this.jButtonVerFormTipoRete.setVisible((this.isVisibilidadCeldaVerFormTipoRete && this.isPermisoVerFormTipoRete));
			
			this.jButtonAbrirOrderByTipoRete.setVisible((this.isVisibilidadCeldaOrdenTipoRete && this.isPermisoOrdenTipoRete));			
			
			this.jButtonNuevoRelacionesTipoRete.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRete && this.isPermisoNuevoTipoRete));			
			this.jButtonNuevoGuardarCambiosTipoRete.setVisible((this.isVisibilidadCeldaNuevoTipoRete && this.isPermisoNuevoTipoRete && this.isPermisoGuardarCambiosTipoRete));
			
			if(this.jInternalFrameDetalleFormTipoRete!=null) {
			this.jInternalFrameDetalleFormTipoRete.jButtonModificarTipoRete.setVisible((this.isVisibilidadCeldaModificarTipoRete && this.isPermisoActualizarTipoRete));	
			this.jInternalFrameDetalleFormTipoRete.jButtonActualizarTipoRete.setVisible((this.isVisibilidadCeldaActualizarTipoRete && this.isPermisoActualizarTipoRete));	
			this.jInternalFrameDetalleFormTipoRete.jButtonEliminarTipoRete.setVisible((this.isVisibilidadCeldaEliminarTipoRete && this.isPermisoEliminarTipoRete));
			this.jInternalFrameDetalleFormTipoRete.jButtonCancelarTipoRete.setVisible(this.isVisibilidadCeldaCancelarTipoRete);							
			this.jInternalFrameDetalleFormTipoRete.jButtonGuardarCambiosTipoRete.setVisible((this.isVisibilidadCeldaGuardarTipoRete && this.isPermisoGuardarCambiosTipoRete));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoRete.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRete && this.isPermisoGuardarCambiosTipoRete));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoRete.setVisible((this.isVisibilidadCeldaNuevoTipoRete && this.isPermisoNuevoTipoRete));						
			this.jButtonDuplicarToolBarTipoRete.setVisible((this.isVisibilidadCeldaDuplicarTipoRete && this.isPermisoDuplicarTipoRete));						
			this.jButtonCopiarToolBarTipoRete.setVisible((this.isVisibilidadCeldaCopiarTipoRete && this.isPermisoCopiarTipoRete));			
			this.jButtonVerFormToolBarTipoRete.setVisible((this.isVisibilidadCeldaVerFormTipoRete && this.isPermisoVerFormTipoRete));			
			this.jButtonAbrirOrderByToolBarTipoRete.setVisible((this.isVisibilidadCeldaOrdenTipoRete && this.isPermisoOrdenTipoRete));
			this.jButtonNuevoRelacionesToolBarTipoRete.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRete && this.isPermisoNuevoTipoRete));			
			this.jButtonNuevoGuardarCambiosToolBarTipoRete.setVisible((this.isVisibilidadCeldaNuevoTipoRete && this.isPermisoNuevoTipoRete && this.isPermisoGuardarCambiosTipoRete));			
			
			if(this.jInternalFrameDetalleFormTipoRete!=null) {
			this.jInternalFrameDetalleFormTipoRete.jButtonModificarToolBarTipoRete.setVisible((this.isVisibilidadCeldaModificarTipoRete && this.isPermisoActualizarTipoRete));	
			this.jInternalFrameDetalleFormTipoRete.jButtonActualizarToolBarTipoRete.setVisible((this.isVisibilidadCeldaActualizarTipoRete  && this.isPermisoActualizarTipoRete));	
			this.jInternalFrameDetalleFormTipoRete.jButtonEliminarToolBarTipoRete.setVisible((this.isVisibilidadCeldaEliminarTipoRete && this.isPermisoEliminarTipoRete));
			this.jInternalFrameDetalleFormTipoRete.jButtonCancelarToolBarTipoRete.setVisible(this.isVisibilidadCeldaCancelarTipoRete);				
			this.jInternalFrameDetalleFormTipoRete.jButtonGuardarCambiosToolBarTipoRete.setVisible((this.isVisibilidadCeldaGuardarTipoRete && this.isPermisoGuardarCambiosTipoRete));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoRete.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRete && this.isPermisoGuardarCambiosTipoRete));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoRete.setVisible((this.isVisibilidadCeldaNuevoTipoRete && this.isPermisoNuevoTipoRete));			
			this.jMenuItemDuplicarTipoRete.setVisible((this.isVisibilidadCeldaDuplicarTipoRete && this.isPermisoDuplicarTipoRete));			
			this.jMenuItemCopiarTipoRete.setVisible((this.isVisibilidadCeldaCopiarTipoRete && this.isPermisoCopiarTipoRete));			
			this.jMenuItemVerFormTipoRete.setVisible((this.isVisibilidadCeldaVerFormTipoRete && this.isPermisoVerFormTipoRete));			
			this.jMenuItemAbrirOrderByTipoRete.setVisible((this.isVisibilidadCeldaOrdenTipoRete && this.isPermisoOrdenTipoRete));			
			//this.jMenuItemMostrarOcultarTipoRete.setVisible((this.isVisibilidadCeldaOrdenTipoRete && this.isPermisoOrdenTipoRete));
			this.jMenuItemDetalleAbrirOrderByTipoRete.setVisible((this.isVisibilidadCeldaOrdenTipoRete && this.isPermisoOrdenTipoRete));			
			//this.jMenuItemDetalleMostrarOcultarTipoRete.setVisible((this.isVisibilidadCeldaOrdenTipoRete && this.isPermisoOrdenTipoRete));			
			this.jMenuItemNuevoRelacionesTipoRete.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRete && this.isPermisoNuevoTipoRete));			
			this.jMenuItemNuevoGuardarCambiosTipoRete.setVisible((this.isVisibilidadCeldaNuevoTipoRete && this.isPermisoNuevoTipoRete && this.isPermisoGuardarCambiosTipoRete));									
			
			if(this.jInternalFrameDetalleFormTipoRete!=null) {
			this.jInternalFrameDetalleFormTipoRete.jMenuItemModificarTipoRete.setVisible((this.isVisibilidadCeldaModificarTipoRete && this.isPermisoActualizarTipoRete));	
			this.jInternalFrameDetalleFormTipoRete.jMenuItemActualizarTipoRete.setVisible((this.isVisibilidadCeldaActualizarTipoRete && this.isPermisoActualizarTipoRete));	
			this.jInternalFrameDetalleFormTipoRete.jMenuItemEliminarTipoRete.setVisible((this.isVisibilidadCeldaEliminarTipoRete && this.isPermisoEliminarTipoRete));
			this.jInternalFrameDetalleFormTipoRete.jMenuItemCancelarTipoRete.setVisible(this.isVisibilidadCeldaCancelarTipoRete);				
			}
			
			this.jMenuItemGuardarCambiosTipoRete.setVisible((this.isVisibilidadCeldaGuardarTipoRete && this.isPermisoGuardarCambiosTipoRete));						
			this.jMenuItemGuardarCambiosTablaTipoRete.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRete && this.isPermisoGuardarCambiosTipoRete));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoRete=this.jButtonNuevoTipoRete.isVisible();
			this.isVisibilidadCeldaDuplicarTipoRete=this.jButtonDuplicarTipoRete.isVisible();
			this.isVisibilidadCeldaCopiarTipoRete=this.jButtonCopiarTipoRete.isVisible();
			this.isVisibilidadCeldaVerFormTipoRete=this.jButtonVerFormTipoRete.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoRete=this.jButtonAbrirOrderByTipoRete.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoRete=this.jButtonNuevoRelacionesTipoRete.isVisible();
			this.isVisibilidadCeldaModificarTipoRete=this.jButtonModificarTipoRete.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRete!=null) {
			this.isVisibilidadCeldaActualizarTipoRete=this.jInternalFrameDetalleFormTipoRete.jButtonActualizarTipoRete.isVisible();
			this.isVisibilidadCeldaEliminarTipoRete=this.jInternalFrameDetalleFormTipoRete.jButtonEliminarTipoRete.isVisible();
			this.isVisibilidadCeldaCancelarTipoRete=this.jInternalFrameDetalleFormTipoRete.jButtonCancelarTipoRete.isVisible();
			this.isVisibilidadCeldaGuardarTipoRete=this.jInternalFrameDetalleFormTipoRete.jButtonGuardarCambiosTipoRete.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoRete=this.jButtonGuardarCambiosTablaTipoRete.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoRete=this.jButtonNuevoToolBarTipoRete.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRete=this.jButtonNuevoRelacionesToolBarTipoRete.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRete!=null) {
			this.isVisibilidadCeldaModificarTipoRete=this.jInternalFrameDetalleFormTipoRete.jButtonModificarToolBarTipoRete.isVisible();
			this.isVisibilidadCeldaActualizarTipoRete=this.jInternalFrameDetalleFormTipoRete.jButtonActualizarToolBarTipoRete.isVisible();
			this.isVisibilidadCeldaEliminarTipoRete=this.jInternalFrameDetalleFormTipoRete.jButtonEliminarToolBarTipoRete.isVisible();
			this.isVisibilidadCeldaCancelarTipoRete=this.jInternalFrameDetalleFormTipoRete.jButtonCancelarToolBarTipoRete.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRete=this.jButtonGuardarCambiosToolBarTipoRete.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRete=this.jButtonGuardarCambiosTablaToolBarTipoRete.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoRete=this.jMenuItemNuevoTipoRete.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRete=this.jMenuItemNuevoRelacionesTipoRete.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRete!=null) {
			this.isVisibilidadCeldaModificarTipoRete=this.jInternalFrameDetalleFormTipoRete.jMenuItemModificarTipoRete.isVisible();
			this.isVisibilidadCeldaActualizarTipoRete=this.jInternalFrameDetalleFormTipoRete.jMenuItemActualizarTipoRete.isVisible();
			this.isVisibilidadCeldaEliminarTipoRete=this.jInternalFrameDetalleFormTipoRete.jMenuItemEliminarTipoRete.isVisible();
			this.isVisibilidadCeldaCancelarTipoRete=this.jInternalFrameDetalleFormTipoRete.jMenuItemCancelarTipoRete.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRete=this.jMenuItemGuardarCambiosTipoRete.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRete=this.jMenuItemGuardarCambiosTablaTipoRete.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoRete(Boolean esInicializar) {
		if(TipoReteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tiporeteSessionBean.getConGuardarRelaciones()) {
				//if(this.tiporeteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRete();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoRete(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoRete() {
		this.jButtonNuevoTipoRete.setVisible(this.isPermisoNuevoTipoRete);			
		this.jButtonDuplicarTipoRete.setVisible(this.isPermisoDuplicarTipoRete);			
		this.jButtonCopiarTipoRete.setVisible(this.isPermisoCopiarTipoRete);			
		this.jButtonVerFormTipoRete.setVisible(this.isPermisoVerFormTipoRete);			
		
		this.jButtonAbrirOrderByTipoRete.setVisible(this.isPermisoOrdenTipoRete);					
		
		this.jButtonNuevoRelacionesTipoRete.setVisible(this.isPermisoNuevoTipoRete);			
		
		if(this.jInternalFrameDetalleFormTipoRete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRete.jButtonModificarTipoRete.setVisible(this.isPermisoActualizarTipoRete);	
			this.jInternalFrameDetalleFormTipoRete.jButtonActualizarTipoRete.setVisible(this.isPermisoActualizarTipoRete);	
			this.jInternalFrameDetalleFormTipoRete.jButtonEliminarTipoRete.setVisible(this.isPermisoEliminarTipoRete);
			this.jInternalFrameDetalleFormTipoRete.jButtonCancelarTipoRete.setVisible(this.isVisibilidadCeldaCancelarTipoRete);						
			this.jInternalFrameDetalleFormTipoRete.jButtonGuardarCambiosTipoRete.setVisible(this.isPermisoGuardarCambiosTipoRete);							
		}
		
		this.jButtonGuardarCambiosTablaTipoRete.setVisible(this.isPermisoActualizarTipoRete);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRete() {
		this.jInternalFrameDetalleFormTipoRete.jButtonModificarTipoRete.setVisible(this.isPermisoActualizarTipoRete);	
		this.jInternalFrameDetalleFormTipoRete.jButtonActualizarTipoRete.setVisible(this.isPermisoActualizarTipoRete);	
		this.jInternalFrameDetalleFormTipoRete.jButtonEliminarTipoRete.setVisible(this.isPermisoEliminarTipoRete);
		this.jInternalFrameDetalleFormTipoRete.jButtonCancelarTipoRete.setVisible(this.isVisibilidadCeldaCancelarTipoRete);							
		this.jInternalFrameDetalleFormTipoRete.jButtonGuardarCambiosTipoRete.setVisible((this.isVisibilidadCeldaGuardarTipoRete && this.isPermisoGuardarCambiosTipoRete));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoRete() {
		if(TipoReteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoRete();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoRete() {
	}
	
	public void jTableDatosTipoReteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoRete(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoReteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporeteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRete.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRete(this.gettiporete(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRete(this.tiporete);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporete =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporete =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporete==null) {
						this.tiporete = new TipoRete();
					}

					this.setVariablesFormularioToObjetoActualTipoRete(this.tiporete,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRete(this.tiporete);
				}

				if(this.tiporete.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tiporete.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRete(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporeteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporeteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporeteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoReteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoRete(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRete.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoRete.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoRete.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporete =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporete =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoRete(this.gettiporete(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRete(this.tiporete);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tiporeteLogic.getConnexion());

				if(this.tiporete.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tiporete.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoRete=(TitledBorder)this.jScrollPanelDatosTipoRete.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoRete.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoReteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporeteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRete.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRete(this.gettiporete(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRete(this.tiporete);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporete =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporete =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporete==null) {
						this.tiporete = new TipoRete();
					}

					this.setVariablesFormularioToObjetoActualTipoRete(this.tiporete,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRete(this.tiporete);
				}

				if(this.tiporete.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tiporete.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRete(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporeteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporeteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporeteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoReteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporeteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRete.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRete(this.gettiporete(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRete(this.tiporete);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporete =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporete =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporete==null) {
						this.tiporete = new TipoRete();
					}

					this.setVariablesFormularioToObjetoActualTipoRete(this.tiporete,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRete(this.tiporete);
				}

				if(this.tiporete.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tiporete.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRete(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporeteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporeteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporeteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoReteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporeteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRete.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRete(this.gettiporete(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRete(this.tiporete);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporete =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporete =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporete==null) {
						this.tiporete = new TipoRete();
					}

					this.setVariablesFormularioToObjetoActualTipoRete(this.tiporete,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRete(this.tiporete);
				}

				if(this.tiporete.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tiporete.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRete(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporeteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporeteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporeteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoReteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRete(false,false);

			this.getTipoRetesBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoRete(false);

			//if(TipoReteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRete(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoReteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRete(false,false);

			this.getTipoRetesBusquedaPorNombre();

			this.inicializarActualizarBindingTipoRete(false);

			//if(TipoReteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRete(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoReteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRete(false,false);

			this.getTipoRetesFK_IdEmpresa();

			this.inicializarActualizarBindingTipoRete(false);

			//if(TipoReteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRete(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporeteLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoRete() {
		if(this.jInternalFrameDetalleFormTipoRete!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoRete!=null) {
			this.jInternalFrameDetalleFormTipoRete.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoRete.dispose();
			this.jInternalFrameDetalleFormTipoRete=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoRete!=null) {
			this.jInternalFrameReporteDinamicoTipoRete.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoRete.dispose();
			this.jInternalFrameReporteDinamicoTipoRete=null;
		}
		
		if(this.jInternalFrameImportacionTipoRete!=null) {
			this.jInternalFrameImportacionTipoRete.setVisible(false);	    			
			this.jInternalFrameImportacionTipoRete.dispose();
			this.jInternalFrameImportacionTipoRete=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoRete();
			
			TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoRete")) {
				jButtonNuevoTipoReteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoRete")) {
				jButtonDuplicarTipoReteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoRete")) {
				jButtonCopiarTipoReteActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoRete")) {
				jButtonVerFormTipoReteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoRete")) {
				jButtonNuevoTipoReteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoRete")) {
				jButtonDuplicarTipoReteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoRete")) {
				jButtonNuevoTipoReteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoRete")) {
				jButtonDuplicarTipoReteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoRete")) {
				jButtonNuevoTipoReteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoRete")) {
				jButtonNuevoTipoReteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoRete")) {
				jButtonNuevoTipoReteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoRete")) {
				jButtonModificarTipoReteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoRete")) {
				jButtonModificarTipoReteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoRete")) {
				jButtonModificarTipoReteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoRete")) {
				jButtonActualizarTipoReteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoRete")) {
				jButtonActualizarTipoReteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoRete")) {
				jButtonActualizarTipoReteActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoRete")) {
				jButtonEliminarTipoReteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoRete")) {
				jButtonEliminarTipoReteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoRete")) {
				jButtonEliminarTipoReteActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoRete")) {
				jButtonCancelarTipoReteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoRete")) {
				jButtonCancelarTipoReteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoRete")) {
				jButtonCancelarTipoReteActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoRete")) {
				jButtonCerrarTipoReteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoRete")) {
				jButtonCerrarTipoReteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoRete")) {
				jButtonCerrarTipoReteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoRete")) {
				jButtonMostrarOcultarTipoReteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoRete")) {
				jButtonCancelarTipoReteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoRete")) {
				jButtonGuardarCambiosTipoReteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoRete")) {
				jButtonGuardarCambiosTipoReteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoRete")) {
				jButtonCopiarTipoReteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoRete")) {
				jButtonVerFormTipoReteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoRete")) {
				jButtonGuardarCambiosTipoReteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoRete")) {
				jButtonCopiarTipoReteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoRete")) {
				jButtonVerFormTipoReteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoRete")) {
				jButtonGuardarCambiosTipoReteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoRete")) {
				jButtonGuardarCambiosTipoReteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoRete")) {
				jButtonGuardarCambiosTipoReteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoRete")) {
				jButtonRecargarInformacionTipoReteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoRete")) {
				jButtonRecargarInformacionTipoReteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoRete")) {
				jButtonRecargarInformacionTipoReteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoRete")) {
				jButtonAnterioresTipoReteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoRete")) {
				jButtonAnterioresTipoReteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoRete")) {
				jButtonAnterioresTipoReteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoRete")) {
				jButtonSiguientesTipoReteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoRete")) {
				jButtonSiguientesTipoReteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoRete")) {
				jButtonSiguientesTipoReteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoRete") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoRete")) {
				jButtonAbrirOrderByTipoReteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoRete") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoRete")) {
				jButtonMostrarOcultarTipoReteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRete")) {
				jButtonNuevoGuardarCambiosTipoReteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoRete")) {
				jButtonNuevoGuardarCambiosTipoReteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoRete")) {
				jButtonNuevoGuardarCambiosTipoReteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoRete")) {
				jButtonCerrarReporteDinamicoTipoReteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoRete")) {
				jButtonGenerarReporteDinamicoTipoReteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoRete")) {
				
				jButtonGenerarExcelReporteDinamicoTipoReteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoRete")) {
				jButtonCerrarImportacionTipoReteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoRete")) {
				
				jButtonGenerarImportacionTipoReteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoRete")) {
				
				jButtonAbrirImportacionTipoReteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoRete")) {
				jComboBoxTiposAccionesTipoReteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoRete")) {
				jComboBoxTiposRelacionesTipoReteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoRete")) {
				jComboBoxTiposAccionesTipoReteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoRete")) {
				
				jComboBoxTiposSeleccionarTipoReteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoRete")) {
				jTextFieldValorCampoGeneralTipoReteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoRete")) {
				jButtonAbrirOrderByTipoReteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoRete")) {
				jButtonAbrirOrderByTipoReteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoRete")) {
				jButtonCerrarOrderByTipoReteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoReteBusqueda")) {
				this.jButtonidTipoReteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoReteUpdate")) {
				this.jButtonid_empresaTipoReteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoReteBusqueda")) {
				this.jButtonid_empresaTipoReteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoReteBusqueda")) {
				this.jButtoncodigoTipoReteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoReteBusqueda")) {
				this.jButtonnombreTipoReteBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoRete")) {
				this.jButtonBusquedaPorCodigoTipoReteActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoRete")) {
				this.jButtonBusquedaPorNombreTipoReteActionPerformed(evt);
			}
			
			;
			
			
			TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoRete();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoReteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporete);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporete);
				
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
				
				


				
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRete.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRete.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoRete tiporeteLocal=null;
			
			if(!this.getEsControlTabla()) {
				tiporeteLocal=this.tiporete;
			} else {
				tiporeteLocal=this.tiporeteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporete);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporete);
				
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
							
				
				


				
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRete.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRete.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoReteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRete.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporeteAnterior =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporeteAnterior =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
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
			
			TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
			
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
			
			


			
			TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoReteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporete);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporete);
				
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
								
						
				


				
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRete.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRete.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporete);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporete);
				
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
								
				
				


				
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRete.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRete.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoReteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRete.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporeteAnterior =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporeteAnterior =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporete);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporete);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoReteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRete.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporeteAnterior =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporeteAnterior =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoReteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporete);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporete);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporete);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporete);
				
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
							
				
				


				
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRete.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRete.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoReteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRete.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporeteAnterior =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporeteAnterior =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
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
			
			TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
			
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
			
			


			
			TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoReteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporete);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporete);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporete);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporete);
				
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
								
				
				


				
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRete.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRete.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoReteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRete.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporeteAnterior =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporeteAnterior =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoReteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporete);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporete);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoReteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporete);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporete);
				
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoRete")) {
					jCheckBoxSeleccionarTodosTipoReteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoRete")) {
					jCheckBoxSeleccionadosTipoReteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoRete")) {
					
				}
				
				


				
				
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRete.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRete.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporete);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tiporete);
				
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
												
				
				


				
				
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRete.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRete.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoReteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRete.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporeteAnterior =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporeteAnterior =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoReteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporete);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporete);
				
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
				
				
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
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
			
			TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
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
			
			


			
			TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoReteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporete);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporete);
				
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRete.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRete.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporete);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporete);
				
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
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
				
				


				
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRete.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRete.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoReteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRete.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporeteAnterior =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporeteAnterior =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoRete")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoReteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoRete.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tiporete =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tiporete =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tiporete);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoRete")) {
				
				}
				
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoRete")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoRete.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoRete")) {
			
			}
			
			TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoRete();
			
			TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
			
			if(sTipo.equals("NuevoTipoRete")) {
				jButtonNuevoTipoReteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoRete")) {
				jButtonDuplicarTipoReteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoRete")) {
				jButtonCopiarTipoReteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoRete")) {
				jButtonVerFormTipoReteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoRete")) {
				jButtonNuevoTipoReteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoRete")) {
				jButtonModificarTipoReteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoRete")) {
				jButtonActualizarTipoReteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoRete")) {
				jButtonEliminarTipoReteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoRete")) {
				jButtonGuardarCambiosTipoReteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoRete")) {
				jButtonCancelarTipoReteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoRete")) {
				jButtonCerrarTipoReteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoRete")) {
				jButtonGuardarCambiosTipoReteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRete")) {
				jButtonNuevoGuardarCambiosTipoReteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoRete")) {
				jButtonAbrirOrderByTipoReteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoRete")) {
				jButtonRecargarInformacionTipoReteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoRete")) {
				jButtonAnterioresTipoReteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoRete")) {
				jButtonSiguientesTipoReteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoReteBusqueda")) {
				this.jButtonidTipoReteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoReteUpdate")) {
				this.jButtonid_empresaTipoReteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoReteBusqueda")) {
				this.jButtonid_empresaTipoReteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoReteBusqueda")) {
				this.jButtoncodigoTipoReteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoReteBusqueda")) {
				this.jButtonnombreTipoReteBusquedaActionPerformed(evt);
			}
			
			TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoRete();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoRete")) {
				closingInternalFrameTipoRete();
				
			} else if(sTipo.equals("jButtonCancelarTipoRete")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoRete = (JInternalFrameBase)evt.getSource();
	            	
	            TipoReteBeanSwingJInternalFrame jInternalFrameParent=(TipoReteBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRete.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoReteActionPerformed(null);
			}
			
			TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporete,new Object(),this.tiporeteParameterGeneral,this.tiporeteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoRete(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoRete(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoRete(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tiporete)) {
			if(!esControlTabla) {
				if(TipoReteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoRete(this.tiporete,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRete(this.tiporete);			
				}
				
				if(this.tiporeteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoRete(this.tiporete,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporeteReturnGeneral=tiporeteLogic.procesarEventosTipoRetesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporeteLogic.getTipoRetes(),this.tiporete,this.tiporeteParameterGeneral,this.isEsNuevoTipoRete,classes);//this.tiporeteLogic.getTipoRete()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoRete(this.tiporeteReturnGeneral,this.tiporeteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tiporeteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoRete(classes,this.tiporeteReturnGeneral,this.tiporeteBean,false);
					}
						
					if(this.tiporeteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoRete(this.tiporeteReturnGeneral.getTipoRete());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoRete(this.tiporeteReturnGeneral.getTipoRete());	
					}
						
					if(this.tiporeteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoRete(this.tiporeteReturnGeneral.getTipoRete(),classes);//this.tiporeteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoRete(this.tiporete,classes);//this.tiporeteBean);									
				}
			
				if(TipoReteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoRete(this.tiporete,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRete(this.tiporete);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tiporeteAnterior!=null) {
						this.tiporete=this.tiporeteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporeteReturnGeneral=tiporeteLogic.procesarEventosTipoRetesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporeteLogic.getTipoRetes(),this.tiporete,this.tiporeteParameterGeneral,this.isEsNuevoTipoRete,classes);//this.tiporeteLogic.getTipoRete()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporeteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporeteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tiporeteReturnGeneral.getTipoRete(),tiporeteLogic.getTipoRetes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tiporeteReturnGeneral.getTipoRete(),this.tiporetes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoRete.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoRete.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoRete();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoRete() throws Exception {
		
		TipoReteModel tiporeteModel=(TipoReteModel)this.jTableDatosTipoRete.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporeteModel.tiporetes=this.tiporeteLogic.getTipoRetes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tiporeteModel.tiporetes=this.tiporetes;
		}
		
		
		((TipoReteModel) this.jTableDatosTipoRete.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoRete() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettiporeteAnterior(),this.tiporeteLogic.getTipoRetes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettiporeteAnterior(),this.tiporetes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoRete();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoRete(TipoRete tiporete,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
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
										
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporete,new Object(),generalEntityParameterGeneral,this.tiporeteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tiporeteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoReteConstantesFunciones.getClassesRelationshipsOfTipoRete(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoReteConstantesFunciones.getClassesRelationshipsFromStringsOfTipoRete(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoRete(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoReteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporete,new Object(),generalEntityParameterGeneral,this.tiporeteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoRete(TipoReteBean tiporeteBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoRete(ArrayList<Classe> classes,TipoReteReturnGeneral tiporeteReturnGeneral,TipoReteBean tiporeteBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoRete(TipoRete tiporete,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tiporete)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoRete = new TipoReteDetalleFormJInternalFrame(jDesktopPane,this.tiporeteSessionBean.getConGuardarRelaciones(),this.tiporeteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRete);
		this.jInternalFrameDetalleFormTipoRete.setVisible(false);
		this.jInternalFrameDetalleFormTipoRete.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoRete.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoRete.tiporeteLogic=this.tiporeteLogic;
		
		this.cargarCombosFrameForeignKeyTipoRete("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRete();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRete();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoRete("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoRete();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoRete.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRete"));
		
		this.jInternalFrameDetalleFormTipoRete.jButtonModificarTipoRete.addActionListener(new ButtonActionListener(this,"ModificarTipoRete"));

		
		this.jInternalFrameDetalleFormTipoRete.jButtonModificarToolBarTipoRete.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRete"));
					
		this.jInternalFrameDetalleFormTipoRete.jMenuItemModificarTipoRete.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRete"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRete.jButtonActualizarTipoRete.addActionListener (new ButtonActionListener(this,"ActualizarTipoRete"));
		
		
		this.jInternalFrameDetalleFormTipoRete.jButtonActualizarToolBarTipoRete.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRete"));
						
		this.jInternalFrameDetalleFormTipoRete.jMenuItemActualizarTipoRete.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRete"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRete.jButtonEliminarTipoRete.addActionListener (new ButtonActionListener(this,"EliminarTipoRete"));
		
		
		this.jInternalFrameDetalleFormTipoRete.jButtonEliminarToolBarTipoRete.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRete"));
								
		this.jInternalFrameDetalleFormTipoRete.jMenuItemEliminarTipoRete.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRete"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRete.jButtonCancelarTipoRete.addActionListener (new ButtonActionListener(this,"CancelarTipoRete"));
		
		
		this.jInternalFrameDetalleFormTipoRete.jButtonCancelarToolBarTipoRete.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRete"));
					
		this.jInternalFrameDetalleFormTipoRete.jMenuItemCancelarTipoRete.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRete"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoRete.jMenuItemDetalleCerrarTipoRete.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRete"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRete.jButtonGuardarCambiosToolBarTipoRete.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRete"));
		
		
		
		this.jInternalFrameDetalleFormTipoRete.jButtonGuardarCambiosToolBarTipoRete.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRete"));
		
		
		
		this.jInternalFrameDetalleFormTipoRete.jComboBoxTiposAccionesFormularioTipoRete.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRete"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRete.jButtonidTipoReteBusqueda.addActionListener(new ButtonActionListener(this,"idTipoReteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRete.jButtonid_empresaTipoReteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoReteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRete.jButtonid_empresaTipoReteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoReteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRete.jButtoncodigoTipoReteBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoReteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRete.jButtonnombreTipoReteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoReteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoRete.jTabbedPaneRelacionesTipoRete.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRete"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoRete"));
		
		if(this.jInternalFrameDetalleFormTipoRete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRete.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRete"));
		}
		
		this.jTableDatosTipoRete.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoRete"));
		
		this.jTableDatosTipoRete.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoRete"));
		
		this.jButtonNuevoTipoRete.addActionListener(new ButtonActionListener(this,"NuevoTipoRete"));
		
		this.jButtonDuplicarTipoRete.addActionListener(new ButtonActionListener(this,"DuplicarTipoRete"));
		
		this.jButtonCopiarTipoRete.addActionListener(new ButtonActionListener(this,"CopiarTipoRete"));
		
		this.jButtonVerFormTipoRete.addActionListener(new ButtonActionListener(this,"VerFormTipoRete"));
		
		
		this.jButtonNuevoToolBarTipoRete.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoRete"));
			
		this.jButtonDuplicarToolBarTipoRete.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoRete"));
			
		this.jMenuItemNuevoTipoRete.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoRete"));
			
		this.jMenuItemDuplicarTipoRete.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoRete"));		
		
		
		this.jButtonNuevoRelacionesTipoRete.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoRete"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoRete.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoRete"));
			
		this.jMenuItemNuevoRelacionesTipoRete.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoRete"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRete.jButtonModificarTipoRete.addActionListener(new ButtonActionListener(this,"ModificarTipoRete"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRete.jButtonModificarToolBarTipoRete.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRete"));
			
			this.jInternalFrameDetalleFormTipoRete.jMenuItemModificarTipoRete.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRete"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRete!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoRete.jButtonActualizarTipoRete.addActionListener (new ButtonActionListener(this,"ActualizarTipoRete"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRete.jButtonActualizarToolBarTipoRete.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRete"));
				
			this.jInternalFrameDetalleFormTipoRete.jMenuItemActualizarTipoRete.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRete"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRete.jButtonEliminarTipoRete.addActionListener (new ButtonActionListener(this,"EliminarTipoRete"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRete.jButtonEliminarToolBarTipoRete.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRete"));
						
			this.jInternalFrameDetalleFormTipoRete.jMenuItemEliminarTipoRete.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRete"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRete.jButtonCancelarTipoRete.addActionListener (new ButtonActionListener(this,"CancelarTipoRete"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRete.jButtonCancelarToolBarTipoRete.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRete"));
			
			this.jInternalFrameDetalleFormTipoRete.jMenuItemCancelarTipoRete.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRete"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoRete.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoRete"));		
		
		
		this.jButtonCerrarTipoRete.addActionListener (new ButtonActionListener(this,"CerrarTipoRete"));
		
		
		this.jButtonCerrarToolBarTipoRete.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoRete"));
			
		this.jMenuItemCerrarTipoRete.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoRete"));
			
		if(this.jInternalFrameDetalleFormTipoRete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRete.jMenuItemDetalleCerrarTipoRete.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRete"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRete.jButtonGuardarCambiosTipoRete.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoRete"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRete.jButtonGuardarCambiosToolBarTipoRete.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRete"));
		}
		
		this.jButtonCopiarToolBarTipoRete.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoRete"));
			
		this.jButtonVerFormToolBarTipoRete.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoRete"));
		
		this.jMenuItemGuardarCambiosTipoRete.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoRete"));
			
		this.jMenuItemCopiarTipoRete.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoRete"));		
		
		this.jMenuItemVerFormTipoRete.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoRete"));		
		
		
		this.jButtonGuardarCambiosTablaTipoRete.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRete"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRete.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoRete"));
			
		this.jMenuItemGuardarCambiosTablaTipoRete.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRete"));		
		
		
		
		this.jButtonRecargarInformacionTipoRete.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoRete"));
					
		this.jButtonRecargarInformacionToolBarTipoRete.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoRete"));
		
		this.jMenuItemRecargarInformacionTipoRete.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoRete"));		
		
		
		
		this.jButtonAnterioresTipoRete.addActionListener (new ButtonActionListener(this,"AnterioresTipoRete"));
		
		
		this.jButtonAnterioresToolBarTipoRete.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoRete"));
		
		this.jMenuItemAnterioresTipoRete.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoRete"));		
		
		
		this.jButtonSiguientesTipoRete.addActionListener (new ButtonActionListener(this,"SiguientesTipoRete"));
		
		
		this.jButtonSiguientesToolBarTipoRete.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoRete"));
			
		this.jMenuItemSiguientesTipoRete.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoRete"));
			
		this.jMenuItemAbrirOrderByTipoRete.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoRete"));
			
		this.jMenuItemMostrarOcultarTipoRete.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoRete"));
			
		this.jMenuItemDetalleAbrirOrderByTipoRete.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoRete"));
			
		this.jMenuItemDetalleMostarOcultarTipoRete.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoRete"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoRete.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoRete"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRete.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoRete"));
			
		this.jMenuItemNuevoGuardarCambiosTipoRete.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoRete"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoRete.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoRete"));

		this.jCheckBoxSeleccionadosTipoRete.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoRete"));
		
		if(this.jInternalFrameDetalleFormTipoRete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRete.jComboBoxTiposAccionesFormularioTipoRete.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRete"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoRete.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoRete"));
			
		this.jComboBoxTiposAccionesTipoRete.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoRete"));
					
		this.jComboBoxTiposSeleccionarTipoRete.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoRete"));
			
		this.jTextFieldValorCampoGeneralTipoRete.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoRete"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRete!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRete.jButtonidTipoReteBusqueda.addActionListener(new ButtonActionListener(this,"idTipoReteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRete.jButtonid_empresaTipoReteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoReteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRete.jButtonid_empresaTipoReteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoReteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRete.jButtoncodigoTipoReteBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoReteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRete.jButtonnombreTipoReteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoReteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoRete.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoRete"));

			this.jButtonBusquedaPorNombreTipoRete.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoRete"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoRete!=null) {
				this.jInternalFrameReporteDinamicoTipoRete.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRete"));
				this.jInternalFrameReporteDinamicoTipoRete.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRete"));
				this.jInternalFrameReporteDinamicoTipoRete.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRete"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoRete.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRete"));				
			//this.jButtonGenerarReporteDinamicoTipoRete.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRete"));
			//this.jButtonGenerarExcelReporteDinamicoTipoRete.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRete"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoRete!=null) {
				this.jInternalFrameImportacionTipoRete.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRete"));
				this.jInternalFrameImportacionTipoRete.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRete"));
				this.jInternalFrameImportacionTipoRete.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRete"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoRete.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoRete"));
			
			this.jButtonAbrirOrderByToolBarTipoRete.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoRete"));			
			
			if(this.jInternalFrameOrderByTipoRete!=null) {
				this.jInternalFrameOrderByTipoRete.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRete"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoRete!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoRete!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRete.jTabbedPaneRelacionesTipoRete.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRete"));
		
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
            		closingInternalFrameTipoRete();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoRete.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoRete = (JInternalFrameBase)event.getSource();
	            	
	            TipoReteBeanSwingJInternalFrame jInternalFrameParent=(TipoReteBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRete.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoReteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoRete.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoReteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoRete.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoRete.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoReteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoReteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoReteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoRete";
		inputMap = this.jButtonNuevoTipoRete.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoRete.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoReteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoReteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoReteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoReteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoRete";
		inputMap = this.jButtonNuevoRelacionesTipoRete.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoRete.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoReteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoRete";
		inputMap = this.jButtonModificarTipoRete.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoRete.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoReteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoRete";
		inputMap = this.jButtonActualizarTipoRete.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoRete.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoReteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoRete";
		inputMap = this.jButtonEliminarTipoRete.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoRete.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoReteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoRete";
		inputMap = this.jButtonCancelarTipoRete.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoRete.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoReteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoRete";
		inputMap = this.jButtonCerrarTipoRete.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoRete.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoReteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoRete.jButtonGuardarCambiosTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoRete";
		inputMap = this.jInternalFrameDetalleFormTipoRete.jButtonGuardarCambiosTipoRete.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoRete.jButtonGuardarCambiosTipoRete.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoReteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoRete.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoReteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoRete.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoReteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoRete.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoReteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoRete.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoReteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRete.jButtonidTipoReteBusqueda.addActionListener(new ButtonActionListener(this,"idTipoReteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRete.jButtonid_empresaTipoReteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoReteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRete.jButtonid_empresaTipoReteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoReteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRete.jButtoncodigoTipoReteBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoReteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRete.jButtonnombreTipoReteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoReteBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoRete.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoRete"));

		this.jButtonBusquedaPorNombreTipoRete.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoRete"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoRete.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoReteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoReteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoRete.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoRete(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoRete tiporeteAux:this.tiporeteLogic.getTipoRetes()) {
					tiporeteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRete tiporeteAux:tiporetes) {
					tiporeteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoReteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRete(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRete tiporeteAux:this.tiporeteLogic.getTipoRetes()) {
						tiporeteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRete tiporeteAux:tiporetes) {
						tiporeteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoRete tiporeteAux:this.tiporeteLogic.getTipoRetes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRete tiporeteAux:tiporetes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRete(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRete.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRete.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRete,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoReteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRete(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoRete.getSelectedRows();
			
			TipoRete tiporeteLocal=new TipoRete();
			
			//this.seleccionarTodosTipoRete(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporeteLocal =(TipoRete) this.tiporeteLogic.getTipoRetes().toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tiporeteLocal =(TipoRete) this.tiporetes.toArray()[this.jTableDatosTipoRete.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tiporeteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRete tiporeteAux:this.tiporeteLogic.getTipoRetes()) {
						tiporeteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRete tiporeteAux:tiporetes) {
						tiporeteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoRete(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRete.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRete.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRete,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoReteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoReteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoReteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoRete(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoRete.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRete tiporeteAux:this.tiporeteLogic.getTipoRetes()) {
				
						if(sTipoSeleccionar.equals(TipoReteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiporeteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoReteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporeteAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRete tiporeteAux:tiporetes) {
					
						if(sTipoSeleccionar.equals(TipoReteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiporeteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoReteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporeteAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRete(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoReteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoRete(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoRete=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoRete.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoRete.jComboBoxTiposAccionesFormularioTipoRete.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoRete) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoRete(conSplash);
				
					this.generarReporteTipoRetesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRete.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRete.jComboBoxTiposAccionesFormularioTipoRete.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoRetesSeleccionados();
				//this.jComboBoxTiposAccionesTipoRete.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRetesSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoRete.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRetesSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoRete.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRete();
				
				this.exportarTipoRetesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRete.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRete.jComboBoxTiposAccionesFormularioTipoRete.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoRetes();
				//this.importarTipoRetes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRete.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRete.jComboBoxTiposAccionesFormularioTipoRete.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRete();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoRetesSeleccionados();
				//this.jComboBoxTiposAccionesTipoRete.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Rete(temporal)", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoRete();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoRete)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoRete(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Rete(temporal)",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRete.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRete.jComboBoxTiposAccionesFormularioTipoRete.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoReteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoRete) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoRete(conSplash);
					
						//this.actualizarParametrosGeneralTipoRete();
						
						this.generarReporteProcesoAccionTipoRetesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoRete.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoRete.jComboBoxTiposAccionesFormularioTipoRete.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoReteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Rete(temporal)S SELECCIONADOS?", "MANTENIMIENTO DE Tipo Rete(temporal)", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoRete();
				
						this.actualizarParametrosGeneralTipoRete();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tiporeteReturnGeneral=tiporeteLogic.procesarAccionTipoRetesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tiporeteLogic.getTipoRetes(),this.tiporeteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoReteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoRete.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoRete.jComboBoxTiposAccionesFormularioTipoRete.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoRete();
					
					TipoReteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoReteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoRete.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoRete.jComboBoxTiposAccionesFormularioTipoRete.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoRete(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoReteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoRete();
			
			if(this.jInternalFrameDetalleFormTipoRete==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoRete> tiporetesSeleccionados=new ArrayList<TipoRete>();		
			TipoRete tiporete=new TipoRete();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoRete(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoRete.getSelectedItem();
			
			
			
			
			tiporetesSeleccionados=this.getTipoRetesSeleccionados(true);
			//this.sTipoAccion;
			
			if(tiporetesSeleccionados.size()==1) {
				for(TipoRete tiporeteAux:tiporetesSeleccionados) {
					tiporete=tiporeteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoRete();
			
      		//this.finishProcessTipoRete(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoReteReturnGeneral() throws Exception {
		if(this.tiporeteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tiporeteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tiporeteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tiporeteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tiporeteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tiporeteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoRete(false);
		}
		
		if(this.tiporeteReturnGeneral.getConRetornoLista() || this.tiporeteReturnGeneral.getConRetornoObjeto()) {
			if(this.tiporeteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporeteLogic.setTipoRetes(this.tiporeteReturnGeneral.getTipoRetes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tiporeteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporeteLogic.setTipoRete(this.tiporeteReturnGeneral.getTipoRete());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoRete(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoRete() throws Exception {
		
		
	}
	
	public ArrayList<TipoRete> getTipoRetesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoRete> tiporetesSeleccionados=new ArrayList<TipoRete>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoRete) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoRete tiporeteAux:tiporeteLogic.getTipoRetes()) {
					if(tiporeteAux.getIsSelected()) {
						tiporetesSeleccionados.add(tiporeteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRete tiporeteAux:this.tiporetes) {
					if(tiporeteAux.getIsSelected()) {
						tiporetesSeleccionados.add(tiporeteAux);				
					}
				}
			}
			
			if(tiporetesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tiporetesSeleccionados.addAll(this.tiporeteLogic.getTipoRetes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tiporetesSeleccionados.addAll(this.tiporetes);				
					}
				}
			}
		} else {
			tiporetesSeleccionados.add(this.tiporete);
		}
		
		return tiporetesSeleccionados;
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
	
	public void generarReporteTipoRetesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoRetesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoRetesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRetesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRetesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Rete(temporal)",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoRetesSeleccionados() throws Exception {
		ArrayList<TipoRete> tiporetesSeleccionados=new ArrayList<TipoRete>();		
		
		tiporetesSeleccionados=this.getTipoRetesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoRetes("Todos",tiporetesSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoRetesSeleccionados() throws Exception {
		ArrayList<TipoRete> tiporetesSeleccionados=new ArrayList<TipoRete>();		
		
		tiporetesSeleccionados=this.getTipoRetesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoRetes("Todos",tiporetesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoRetesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoRete> tiporetesSeleccionados=new ArrayList<TipoRete>();
		
		tiporetesSeleccionados=this.getTipoRetesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoRetes("Todos",tiporetesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoRetesSeleccionados() throws Exception {
		ArrayList<TipoRete> tiporetesSeleccionados=new ArrayList<TipoRete>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoRete();
		
		
		tiporetesSeleccionados=this.getTipoRetesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoRete();
		
		
		//this.generarReporteTipoRetes("Todos",tiporetesSeleccionados ,tiporeteImplementable,tiporeteImplementableHome);
	}
	
	public void mostrarImportacionTipoRetes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoRete();
		
		this.abrirFrameImportacionTipoRete();		
		
			
		//this.generarReporteTipoRetes("Todos",tiporetesSeleccionados ,tiporeteImplementable,tiporeteImplementableHome);
	}
	
	public void importarTipoRetes() throws Exception {		
	
	}
	
	public void exportarTipoRetesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoRetesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoRetesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoRetesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Rete(temporal)",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoRetesSeleccionados() throws Exception {
		ArrayList<TipoRete> tiporetesSeleccionados=new ArrayList<TipoRete>();		
		
		tiporetesSeleccionados=this.getTipoRetesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporete."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoRete(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoRete tiporeteAux:tiporetesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoRete(tiporeteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tiporeteAux.setsDetalleGeneralEntityReporte(tiporeteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporeteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rete(temporal)",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoRete(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoReteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoReteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoReteConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoReteConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoReteConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoRete(TipoRete tiporete,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tiporete.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporete.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporete.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporete.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporete.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoRetesSeleccionados() throws Exception {
		ArrayList<TipoRete> tiporetesSeleccionados=new ArrayList<TipoRete>();		
		
		tiporetesSeleccionados=this.getTipoRetesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporete.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoRetes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoRete(row);				
				iRow++;
			}				
			
			for(TipoRete tiporeteAux:tiporetesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoRete(tiporeteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporeteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rete(temporal)",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoRetesSeleccionados() throws Exception {
		ArrayList<TipoRete> tiporetesSeleccionados=new ArrayList<TipoRete>();		
		
		tiporetesSeleccionados=this.getTipoRetesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporete.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tiporetes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tiporete");
			//elementRoot.appendChild(element);
		
			for(TipoRete tiporeteAux:tiporetesSeleccionados) {
				element = document.createElement("tiporete");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoRete(tiporeteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporeteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rete(temporal)",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoRete(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoReteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoReteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoReteConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoReteConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoReteConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoRete(TipoRete tiporete,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tiporete.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporete.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporete.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporete.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoRete(TipoRete tiporete,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoReteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tiporete.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoReteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tiporete.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoReteConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tiporete.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoReteConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tiporete.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoReteConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tiporete.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoRetesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoRete> tiporetesSeleccionados=new ArrayList<TipoRete>();
		
		tiporetesSeleccionados=this.getTipoRetesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoRete(tiporetesSeleccionados);
		
		this.generarReporteTipoRetes("Todos",tiporetesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoRete(ArrayList<TipoRete> tiporetesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoRete tiporeteAux:tiporetesSeleccionados) {
				tiporeteAux.setsDetalleGeneralEntityReporte(tiporeteAux.toString());
			
				if(sTipoSeleccionar.equals(TipoReteConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tiporeteAux.setsDescripcionGeneralEntityReporte1(tiporeteAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoReteConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tiporeteAux.setsDescripcionGeneralEntityReporte1(tiporeteAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoReteConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tiporeteAux.setsDescripcionGeneralEntityReporte1(tiporeteAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoReteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoRete(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoRete=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoRete=true;
				this.isVisibilidadCeldaGuardarCambiosTipoRete=true;
			}
			
			this.isVisibilidadCeldaModificarTipoRete=false;
			this.isVisibilidadCeldaActualizarTipoRete=false;
			this.isVisibilidadCeldaEliminarTipoRete=false;
			this.isVisibilidadCeldaCancelarTipoRete=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRete=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRete=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoRete=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRete=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRete=false;
			this.isVisibilidadCeldaModificarTipoRete=false;
			this.isVisibilidadCeldaActualizarTipoRete=true;
			this.isVisibilidadCeldaEliminarTipoRete=false;
			this.isVisibilidadCeldaCancelarTipoRete=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRete=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRete=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoRete=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRete=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRete=false;
			this.isVisibilidadCeldaModificarTipoRete=false;
			this.isVisibilidadCeldaActualizarTipoRete=true;
			this.isVisibilidadCeldaEliminarTipoRete=true;
			this.isVisibilidadCeldaCancelarTipoRete=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRete=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRete=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoRete=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRete=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRete=false;
			this.isVisibilidadCeldaModificarTipoRete=false;
			this.isVisibilidadCeldaActualizarTipoRete=true;
			this.isVisibilidadCeldaEliminarTipoRete=false;
			this.isVisibilidadCeldaCancelarTipoRete=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRete=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRete=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoRete=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRete=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRete=true;
			this.isVisibilidadCeldaModificarTipoRete=false;
			this.isVisibilidadCeldaActualizarTipoRete=false;
			this.isVisibilidadCeldaEliminarTipoRete=false;
			this.isVisibilidadCeldaCancelarTipoRete=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRete=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRete=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoRete=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRete=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRete=false;
			this.isVisibilidadCeldaActualizarTipoRete=false;
			this.isVisibilidadCeldaEliminarTipoRete=false;
			this.isVisibilidadCeldaCancelarTipoRete=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRete=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRete=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoRete=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRete=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRete=false;
			this.isVisibilidadCeldaModificarTipoRete=true;
			this.isVisibilidadCeldaActualizarTipoRete=false;
			this.isVisibilidadCeldaEliminarTipoRete=false;
			this.isVisibilidadCeldaCancelarTipoRete=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRete=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRete=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoReteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoRete=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRete=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRete=true;
		} else {
			this.actualizarEstadoPanelsTipoRete(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoRete=false;
			//this.isVisibilidadCeldaVerFormTipoRete=false;
			this.isVisibilidadCeldaDuplicarTipoRete=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tiporeteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRete=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoRete=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRete=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tiporeteSessionBean.getEsGuardarRelacionado()) {
			if(!tiporeteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoRete=false;												
			}
			
			this.jButtonCerrarTipoRete.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRete=false;
		}
		
		if(!this.permiteMantenimiento(this.tiporete)) {
			this.isVisibilidadCeldaActualizarTipoRete=false;
			this.isVisibilidadCeldaEliminarTipoRete=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRete() {
	}
	
	public void actualizarEstadoPanelsTipoRete(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoRete!=null) {
				this.jScrollPanelDatosEdicionTipoRete.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRete!=null) {
				this.jTabbedPaneBusquedasTipoRete.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRete!=null) {
				this.jScrollPanelDatosTipoRete.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRete!=null) {
				this.jPanelPaginacionTipoRete.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRete!=null) {
				this.jPanelParametrosReportesTipoRete.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoRete!=null) {
				this.jScrollPanelDatosEdicionTipoRete.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRete!=null) {
				this.jTabbedPaneBusquedasTipoRete.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoRete!=null) {
				this.jScrollPanelDatosTipoRete.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRete!=null) {
				this.jPanelPaginacionTipoRete.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRete!=null) {
				this.jPanelParametrosReportesTipoRete.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoRete!=null) {
				this.jScrollPanelDatosEdicionTipoRete.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRete!=null) {
				this.jTabbedPaneBusquedasTipoRete.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRete!=null) {
				this.jScrollPanelDatosTipoRete.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRete!=null) {
				this.jPanelPaginacionTipoRete.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRete!=null) {
				this.jPanelParametrosReportesTipoRete.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoRete!=null) {
				this.jScrollPanelDatosEdicionTipoRete.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRete!=null) {
				this.jTabbedPaneBusquedasTipoRete.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRete!=null) {
				this.jScrollPanelDatosTipoRete.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRete!=null) {
				this.jPanelPaginacionTipoRete.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRete!=null) {
				this.jPanelParametrosReportesTipoRete.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoRete!=null) {
				this.jScrollPanelDatosEdicionTipoRete.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRete!=null) {
				this.jTabbedPaneBusquedasTipoRete.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRete!=null) {
				this.jScrollPanelDatosTipoRete.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRete!=null) {
				this.jPanelPaginacionTipoRete.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRete!=null) {
				this.jPanelParametrosReportesTipoRete.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoRete!=null) {
				this.jScrollPanelDatosEdicionTipoRete.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRete!=null) {
				this.jTabbedPaneBusquedasTipoRete.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRete!=null) {
				this.jScrollPanelDatosTipoRete.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRete!=null) {
				this.jPanelPaginacionTipoRete.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRete!=null) {
				this.jPanelParametrosReportesTipoRete.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoRete!=null) {
				this.jScrollPanelDatosEdicionTipoRete.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRete!=null) {
				this.jTabbedPaneBusquedasTipoRete.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRete!=null) {
				this.jScrollPanelDatosTipoRete.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRete!=null) {
				this.jPanelPaginacionTipoRete.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRete!=null) {
				this.jPanelParametrosReportesTipoRete.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tiporeteSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoRete!=null) {
					this.jTabbedPaneBusquedasTipoRete.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoRete!=null) {
				this.jPanelParametrosReportesTipoRete.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tiporeteSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRete!=null) {
				this.jTabbedPaneBusquedasTipoRete.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoRete!=null) {
				this.jPanelParametrosReportesTipoRete.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoRete.remove(jPanelBusquedaPorCodigoTipoRete);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoRete.remove(jPanelBusquedaPorNombreTipoRete);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoReteSessionBean tiporeteSessionBean=new TipoReteSessionBean();
		
		if(this.tiporeteSessionBean==null) {
			this.tiporeteSessionBean=new TipoReteSessionBean();
		}
		
		this.tiporeteSessionBean.setsUltimaBusquedaTipoRete(this.getsAccionBusqueda());
		this.tiporeteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tiporeteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tiporeteSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tiporeteSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tiporeteSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoReteSessionBean tiporeteSessionBean=new TipoReteSessionBean();
		
		if(this.tiporeteSessionBean==null) {
			this.tiporeteSessionBean=new TipoReteSessionBean();
		}
		
		if(this.tiporeteSessionBean.getsUltimaBusquedaTipoRete()!=null&&!this.tiporeteSessionBean.getsUltimaBusquedaTipoRete().equals("")) {
			this.setsAccionBusqueda(tiporeteSessionBean.getsUltimaBusquedaTipoRete());
			this.setiNumeroPaginacion(tiporeteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tiporeteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tiporeteSessionBean.getcodigo());
				tiporeteSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tiporeteSessionBean.getnombre());
				tiporeteSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tiporeteSessionBean.getid_empresa());
				tiporeteSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tiporeteSessionBean.setsUltimaBusquedaTipoRete("");
		this.tiporeteSessionBean.setiNumeroPaginacion(TipoReteConstantesFunciones.INUMEROPAGINACION);
		this.tiporeteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoRete(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoRete() {
		this.updateBorderResaltarBusquedasFormularioTipoRete();
		this.updateVisibilidadBusquedasFormularioTipoRete();
		this.updateHabilitarBusquedasFormularioTipoRete();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoRete() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoRete.getComponents().length>0) {
	

		if(this.tiporeteConstantesFunciones.resaltarBusquedaPorCodigoTipoRete!=null) {
			index= this.jTabbedPaneBusquedasTipoRete.indexOfComponent(this.jPanelBusquedaPorCodigoTipoRete);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRete.getComponent(index);
				jPanel.setBorder(this.tiporeteConstantesFunciones.resaltarBusquedaPorCodigoTipoRete);
			}
		}

		if(this.tiporeteConstantesFunciones.resaltarBusquedaPorNombreTipoRete!=null) {
			index= this.jTabbedPaneBusquedasTipoRete.indexOfComponent(this.jPanelBusquedaPorNombreTipoRete);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRete.getComponent(index);
				jPanel.setBorder(this.tiporeteConstantesFunciones.resaltarBusquedaPorNombreTipoRete);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoRete() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoRete.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoRete.indexOfComponent(this.jPanelBusquedaPorCodigoTipoRete);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRete.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tiporeteConstantesFunciones.mostrarBusquedaPorCodigoTipoRete);
			if(!this.tiporeteConstantesFunciones.mostrarBusquedaPorCodigoTipoRete && index>-1) {
				this.jTabbedPaneBusquedasTipoRete.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoRete.indexOfComponent(this.jPanelBusquedaPorNombreTipoRete);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRete.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tiporeteConstantesFunciones.mostrarBusquedaPorNombreTipoRete);
			if(!this.tiporeteConstantesFunciones.mostrarBusquedaPorNombreTipoRete && index>-1) {
				this.jTabbedPaneBusquedasTipoRete.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoRete() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoRete.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoRete.indexOfComponent(this.jPanelBusquedaPorCodigoTipoRete);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRete.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tiporeteConstantesFunciones.activarBusquedaPorCodigoTipoRete);
				this.jTabbedPaneBusquedasTipoRete.setEnabledAt(index,this.tiporeteConstantesFunciones.activarBusquedaPorCodigoTipoRete);
			}

			index= this.jTabbedPaneBusquedasTipoRete.indexOfComponent(this.jPanelBusquedaPorNombreTipoRete);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRete.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tiporeteConstantesFunciones.activarBusquedaPorNombreTipoRete);
				this.jTabbedPaneBusquedasTipoRete.setEnabledAt(index,this.tiporeteConstantesFunciones.activarBusquedaPorNombreTipoRete);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoRete(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoRete.indexOfComponent(this.jPanelBusquedaPorCodigoTipoRete);

			this.jTabbedPaneBusquedasTipoRete.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRete.getComponent(index);

			this.tiporeteConstantesFunciones.setResaltarBusquedaPorCodigoTipoRete(resaltar);

			jPanel.setBorder(this.tiporeteConstantesFunciones.resaltarBusquedaPorCodigoTipoRete);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoRete.indexOfComponent(this.jPanelBusquedaPorNombreTipoRete);

			this.jTabbedPaneBusquedasTipoRete.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRete.getComponent(index);

			this.tiporeteConstantesFunciones.setResaltarBusquedaPorNombreTipoRete(resaltar);

			jPanel.setBorder(this.tiporeteConstantesFunciones.resaltarBusquedaPorNombreTipoRete);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoRete.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoRete() throws Exception {

		if(this.jInternalFrameDetalleFormTipoRete==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoRete();
		this.updateVisibilidadResaltarControlesFormularioTipoRete();
		this.updateHabilitarResaltarControlesFormularioTipoRete();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoRete() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRete==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tiporeteConstantesFunciones.resaltaridTipoRete!=null && this.jInternalFrameDetalleFormTipoRete!=null) {this.jInternalFrameDetalleFormTipoRete.jLabelidTipoRete.setBorder(this.tiporeteConstantesFunciones.resaltaridTipoRete);}
		if(this.tiporeteConstantesFunciones.resaltarid_empresaTipoRete!=null && this.jInternalFrameDetalleFormTipoRete!=null) {this.jInternalFrameDetalleFormTipoRete.jComboBoxid_empresaTipoRete.setBorder(this.tiporeteConstantesFunciones.resaltarid_empresaTipoRete);}
		if(this.tiporeteConstantesFunciones.resaltarcodigoTipoRete!=null && this.jInternalFrameDetalleFormTipoRete!=null) {this.jInternalFrameDetalleFormTipoRete.jTextFieldcodigoTipoRete.setBorder(this.tiporeteConstantesFunciones.resaltarcodigoTipoRete);}
		if(this.tiporeteConstantesFunciones.resaltarnombreTipoRete!=null && this.jInternalFrameDetalleFormTipoRete!=null) {this.jInternalFrameDetalleFormTipoRete.jTextAreanombreTipoRete.setBorder(this.tiporeteConstantesFunciones.resaltarnombreTipoRete);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoRete() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoRete==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRete!=null) {
	
		//this.jInternalFrameDetalleFormTipoRete.jLabelidTipoRete.setVisible(this.tiporeteConstantesFunciones.mostraridTipoRete);
		this.jInternalFrameDetalleFormTipoRete.jPanelidTipoRete.setVisible(this.tiporeteConstantesFunciones.mostraridTipoRete);
		//this.jInternalFrameDetalleFormTipoRete.jComboBoxid_empresaTipoRete.setVisible(this.tiporeteConstantesFunciones.mostrarid_empresaTipoRete);
		this.jInternalFrameDetalleFormTipoRete.jPanelid_empresaTipoRete.setVisible(this.tiporeteConstantesFunciones.mostrarid_empresaTipoRete);
		//this.jInternalFrameDetalleFormTipoRete.jTextFieldcodigoTipoRete.setVisible(this.tiporeteConstantesFunciones.mostrarcodigoTipoRete);
		this.jInternalFrameDetalleFormTipoRete.jPanelcodigoTipoRete.setVisible(this.tiporeteConstantesFunciones.mostrarcodigoTipoRete);
		//this.jInternalFrameDetalleFormTipoRete.jTextAreanombreTipoRete.setVisible(this.tiporeteConstantesFunciones.mostrarnombreTipoRete);
		this.jInternalFrameDetalleFormTipoRete.jPanelnombreTipoRete.setVisible(this.tiporeteConstantesFunciones.mostrarnombreTipoRete);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoRete() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRete==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRete!=null) {
	
		this.jInternalFrameDetalleFormTipoRete.jLabelidTipoRete.setEnabled(this.tiporeteConstantesFunciones.activaridTipoRete);
		this.jInternalFrameDetalleFormTipoRete.jComboBoxid_empresaTipoRete.setEnabled(this.tiporeteConstantesFunciones.activarid_empresaTipoRete);
		this.jInternalFrameDetalleFormTipoRete.jTextFieldcodigoTipoRete.setEnabled(this.tiporeteConstantesFunciones.activarcodigoTipoRete);
		this.jInternalFrameDetalleFormTipoRete.jTextAreanombreTipoRete.setEnabled(this.tiporeteConstantesFunciones.activarnombreTipoRete);
		}
	}
	
		
}